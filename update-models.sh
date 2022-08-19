#!/bin/sh

docker run --user "$(id -u):$(id -g)" --rm -v "${PWD}:/client" -v "${PWD}/../FaceSDK-web-openapi:/definitions" \
openapitools/openapi-generator-cli:v5.4.0 generate \
-i /definitions/index.yml -g java -o /client/client \
-c /client/java-generator-config.json -t /client/client/generator-templates/ || exit 1
