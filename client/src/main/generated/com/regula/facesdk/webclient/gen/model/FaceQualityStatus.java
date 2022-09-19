/*
 * Regula FaceSDK Web API
 * Regula FaceSDK Web API # Clients * [JavaScript](https://github.com/regulaforensics/FaceSDK-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/FaceSDK-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/FaceSDK-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/FaceSDK-web-csharp-client) client for .NET & .NET Core 
 *
 * The version of the OpenAPI document: 4.1.0
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
 * The processing status returned for each assessed quality characteristic.
 */
@JsonAdapter(FaceQualityStatus.Adapter.class)
public enum FaceQualityStatus {
  
  QUALITY_STATUS_FALSE(0),
  
  QUALITY_STATUS_TRUE(1),
  
  QUALITY_STATUS_UNDETERMINED(2);

  private Integer value;

  FaceQualityStatus(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FaceQualityStatus fromValue(Integer value) {
    for (FaceQualityStatus b : FaceQualityStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FaceQualityStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final FaceQualityStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FaceQualityStatus read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return FaceQualityStatus.fromValue(value);
    }
  }
}

