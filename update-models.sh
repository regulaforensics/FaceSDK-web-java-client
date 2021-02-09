#!/bin/sh

ENUM_MAPPINGS="ImageSource=Integer,FaceRecognitionResultCode=Integer,LivenessStatus=Integer" \
\
&& docker run --rm -v "${PWD}:/client" -v "${PWD}/../FaceRecognition-web-openapi:/definitions" \
openapitools/openapi-generator-cli:v5.0.0-beta2 generate \
-i /definitions/index.yml -g java -o /client/client \
-c /client/java-generator-config.json -t /client/client/generator-templates/ \
\
&& docker run --rm -v "${PWD}:/client" -v "${PWD}/../FaceRecognition-web-openapi:/definitions" \
openapitools/openapi-generator-cli:v5.0.0-beta2 generate \
-i /definitions/index.yml -g java -o /client/client \
-c /client/java-generator-config.json -t /client/client/generator-templates/ \
--import-mappings $ENUM_MAPPINGS || exit 1

./gradlew -p ./ goJF || exit 0
