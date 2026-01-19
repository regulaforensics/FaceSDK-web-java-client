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
        url = uri("https://maven.regulaforensics.com/FaceSDKWebClient")
    }
}

dependencies {
    implementation("com.regula.facesdk:webclient:7.2.145")
}
```

## Example
Performing match request:
```java
var sdk = new FaceSdk(apiBasePath);

byte[] face1 = readFile("face_1.jpg");
byte[] face2 = readFile("face_2.jpg");

var matchImage1 = new MatchImage().index(0).data(face1).type(ImageSource.LIVE);
var matchImage2 = new MatchImage().index(1).data(face1).type(ImageSource.DOCUMENT_RFID);
var matchImage3 = new MatchImage().index(3).data(face2).type(ImageSource.LIVE);

var matchImages = List.of(matchImage1, matchImage2, matchImage3);

var matchRequest = new MatchRequest().images(matchImages);

var matchResponse = sdk.matchApi.match(matchRequest);
```

Performing match and search request:
```java
var sdk = new FaceSdk(apiBasePath);

byte[] face1 = readFile("face_1.jpg");
byte[] face2 = readFile("face_2.jpg");

var matchAndSearchImage1 = new MatchAndSearchRequestImagesItem().content(face1).type(ImageSource.LIVE);
var matchAndSearchImage2 = new MatchAndSearchRequestImagesItem().content(face2).type(ImageSource.DOCUMENT_RFID);

var matchAndSearchImages = List.of(matchAndSearchImage1, matchAndSearchImage2);

var matchAndSearchRequest = new MatchAndSearchRequest().images(matchAndSearchImages);

var matchAndSearchResponse = sdk.matchApi.matchAndSearch(matchAndSearchRequest);
```

You can find a more detailed example in  [example](./example) folder.
