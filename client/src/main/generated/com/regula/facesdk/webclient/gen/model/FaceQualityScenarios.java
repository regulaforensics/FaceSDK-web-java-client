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
 * Face detection scenario.
 */
@JsonAdapter(FaceQualityScenarios.Adapter.class)
public enum FaceQualityScenarios {
  
  OLD_MODE("OldMode"),
  
  QUALITY_FULL("QualityFull"),
  
  QUALITY_ICAO("QualityICAO"),
  
  QUALITY_VISA_SCHENGEN("QualityVisaSchengen"),
  
  QUALITY_VISA_USA("QualityVisaUSA"),
  
  CROP_CENTRAL_FACE("CropCentralFace"),
  
  CROP_ALL_FACES("CropAllFaces"),
  
  THUMBNAIL("Thumbnail"),
  
  EMPTY("");

  private String value;

  FaceQualityScenarios(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FaceQualityScenarios fromValue(String value) {
    for (FaceQualityScenarios b : FaceQualityScenarios.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FaceQualityScenarios> {
    @Override
    public void write(final JsonWriter jsonWriter, final FaceQualityScenarios enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FaceQualityScenarios read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FaceQualityScenarios.fromValue(value);
    }
  }
}

