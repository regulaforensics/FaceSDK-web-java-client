/*
 * Regula FaceSDK Web API
 * [Download OpenAPI specification](https://github.com/regulaforensics/FaceSDK-web-openapi) ### Clients * [JavaScript](https://github.com/regulaforensics/FaceSDK-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/FaceSDK-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/FaceSDK-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/FaceSDK-web-csharp-client) client for .NET & .NET Core 
 *
 * The version of the OpenAPI document: 6.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.regula.facesdk.webclient.gen.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The type of the image, defines the way the comparison is performed. See the enum: https://docs.regulaforensics.com/develop/face-sdk/web-service/development/enums/image-source/
 */
@JsonAdapter(ImageSource.Adapter.class)
public enum ImageSource {
  
  DOCUMENT_PRINTED(1),
  
  DOCUMENT_RFID(2),
  
  LIVE(3),
  
  DOCUMENT_WITH_LIVE(4),
  
  EXTERNAL(5),
  
  GHOST(6);

  private Integer value;

  ImageSource(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ImageSource fromValue(Integer value) {
    for (ImageSource b : ImageSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ImageSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final ImageSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ImageSource read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return ImageSource.fromValue(value);
    }
  }
}

