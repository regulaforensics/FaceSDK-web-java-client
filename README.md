# Regula FaceSDK java client compatible with jvm and android

[![OpenAPI](https://img.shields.io/badge/OpenAPI-defs-0a8c42?style=flat-square)](https://github.com/regulaforensics/FaceSDK-web-openapi)

Face recognition as easy as reading two bytes.

If you have any problems with or questions about this client, please contact us
through a [GitHub issue](https://github.com/regulaforensics/FaceSDK-web-java-client/issues).
You are invited to contribute [new features, fixes, or updates](https://github.com/regulaforensics/FaceSDK-web-java-client/issues?q=is%3Aissue+is%3Aopen+label%3A%22help+wanted%22), large or small; We are always thrilled to receive pull requests, and do our best to process them as fast as we can.


## Install package
Add __Regula Forensics, Inc.__ maven repository to repositories section in your `build.gradle`,
and declare client as regular dependency.

```gradle
repositories {
    maven {
        url = uri("https://maven.regulaforensics.com/RegulaFaceSDKWebClient")
    }
}

dependencies {
    implementation("com.regula.facesdk:webclient:5.2.3")
}
```

## Example
Performing request:
```java
var sdk = new FaceSdk(apiBasePath);

byte[] face1 = readFile("face_1.jpg");
byte[] face2 = readFile("face_2.jpg");

var compareImage1 = new CompareImage().index(0).data(face1).type(ImageSource.LIVE);
var compareImage2 = new CompareImage().index(1).data(face1).type(ImageSource.DOCUMENT_RFID);
var compareImage3 = new CompareImage().index(3).data(face2).type(ImageSource.LIVE);

var compareRequest = new CompareRequest().images(List.of(compareImage1, compareImage2, compareImage3));
var compareResponse = sdk.matchingApi.compare(compareRequest);
```

You can find a more detailed example in  [example](./example) folder.
