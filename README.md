# Regula Face Recognition java client compatible with jvm and android

[![OpenAPI](https://img.shields.io/badge/OpenAPI-defs-0a8c42?style=flat-square)](https://github.com/regulaforensics/FaceRecognition-web-openapi)

Face recognition as easy as reading two bytes.

If you have any problems with or questions about this client, please contact us
through a [GitHub issue](https://github.com/regulaforensics/FaceRecognition-web-java-client/issues).
You are invited to contribute [new features, fixes, or updates](https://github.com/regulaforensics/FaceRecognition-web-java-client/issues?q=is%3Aissue+is%3Aopen+label%3A%22help+wanted%22), large or small; We are always thrilled to receive pull requests, and do our best to process them as fast as we can.


## Install package
Add __Regula Forensics, Inc.__ maven repository to repositories section in your `build.gradle`,
and declare client as regular dependency.

```gradle
repositories {
    maven {
        url = uri("https://maven.regulaforensics.com/RegulaFaceRecognitionWebClient")
    }
}

dependencies {
    implementation("com.regula.facerecognition:webclient:1.0.0")
}
```

## Example
Performing request:
```java
var sdk = new Sdk(apiBasePath);

byte[] face1 = readFile("face_1.jpg");
byte[] face2 = readFile("face_2.jpg");

var compareImage1 = new CompareImage().index(0).data(face1).type(ImageSource.LIVE);
var compareImage2 = new CompareImage().index(1).data(face1).type(ImageSource.DOCUMENT_RFID);
var compareImage3 = new CompareImage().index(3).data(face2).type(ImageSource.LIVE);

var compareRequest = new CompareRequest().images(List.of(compareImage1, compareImage2, compareImage3));
var compareResponse = sdk.getMatchingApi().compare(compareRequest);
```

You can find a more detailed example in  `./example` folder.

## Development

Java client is written using java7. Development environment requires java11+.
Models generation based on [openapi spec](https://github.com/regulaforensics/FaceRecognition-web-openapi). 

### Enums
Instead of using enums, generator produces static constants. 

### 2-cycle generation
1. Generate enums as constants
2. Generate normal models with substituted by primitive values enums

To regenerate models from openapi definition, 
clone [latest open api definitions](https://github.com/regulaforensics/FaceRecognition-web-openapi)
and set `FACER_DEFINITION_FOLDER` as path to cloned directory.
```bash
FACER_DEFINITION_FOLDER="/home/user/projects/FaceRecognition-web-openapi"
```
Then use next command from the project root.
```bash
\
ENUM_MAPPINGS="ImageSource=Integer,FaceRecognitionResultCode=Integer,LivenessStatus=Integer" \
\
&& docker run --rm -v "${PWD}:/client" -v "${FACER_DEFINITION_FOLDER}:/definitions" \
openapitools/openapi-generator-cli generate \
-i /definitions/index.yml -g java -o /client/client \
-c /client/java-generator-config.json -t /client/client/generator-templates/ \
\
&& docker run --rm -v "${PWD}:/client" -v "${FACER_DEFINITION_FOLDER}:/definitions" \
openapitools/openapi-generator-cli generate \
-i /definitions/index.yml -g java -o /client/client \
-c /client/java-generator-config.json -t /client/client/generator-templates/ \
--import-mappings $ENUM_MAPPINGS \
\
&& ./gradlew -p ./ goJF
```
