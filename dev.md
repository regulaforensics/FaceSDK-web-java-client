# Development

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
