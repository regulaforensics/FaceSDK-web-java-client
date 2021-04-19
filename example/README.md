# Regula Face SDK java client compatible with jvm and android

Requirements:
- installed java 11+

Verify Java version:
```bash
java --version  
>  openjdk 14.0.1 2020-04-14
```

Cloning example:
```bash
git clone https://github.com/regulaforensics/FaceSDK-web-java-client
cd FaceSDK-web-java-client
```

### Running with local Face SDK web API installation

:warning: NOTE: for some systems `gradlew.bat` command should be used, instead of `./gradlew`.

Assuming you have successfully launched instance, use next line command to run example:
```bash
./gradlew :example:run

# If Regula Document Reader web API is running not on localhost, specify host via env variable:
API_BASE_PATH="http://192.168.0.101:8080" ./gradlew :example:run
```

### Output 

This sample generates next text output:

```text
-----------------------------------------------------------------
                         Compare Results                         
-----------------------------------------------------------------
pair(0, 1) similarity: 0.999585
pair(0, 3) similarity: 0.008510
pair(1, 3) similarity: 0.008510
-----------------------------------------------------------------
                         Detect Results                          
-----------------------------------------------------------------
detectorType: 3
landmarkType: 2
landmarks: [[180, 146], [303, 124], [258, 205], [197, 255], [330, 232]]
roi: [95, 61, 310, 309]
-----------------------------------------------------------------

BUILD SUCCESSFUL in 13s
5 actionable tasks: 4 executed, 1 up-to-date
6:00:26 PM: Task execution finished 'Main.main()'.
```

Edit [example](../example/src/main/java/com/regula/facerecognition/webclient/Main.java) on your own , and re-run to see your results.
