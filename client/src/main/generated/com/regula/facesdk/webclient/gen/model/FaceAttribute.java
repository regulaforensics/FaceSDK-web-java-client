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
 * Face attributes.
 */
@JsonAdapter(FaceAttribute.Adapter.class)
public enum FaceAttribute {
  
  AGE("Age"),
  
  EMOTION("Emotion"),
  
  EYE_LEFT("EyeLeft"),
  
  EYE_RIGHT("EyeRight"),
  
  SMILE("Smile"),
  
  GLASSES("Glasses"),
  
  HEAD_COVERING("HeadCovering"),
  
  FOREHEAD_COVERING("ForeheadCovering"),
  
  MOUTH("Mouth"),
  
  MEDICAL_MASK("MedicalMask"),
  
  OCCLUSION("Occlusion"),
  
  STRONG_MAKEUP("StrongMakeup"),
  
  HEADPHONES("Headphones");

  private String value;

  FaceAttribute(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FaceAttribute fromValue(String value) {
    for (FaceAttribute b : FaceAttribute.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FaceAttribute> {
    @Override
    public void write(final JsonWriter jsonWriter, final FaceAttribute enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FaceAttribute read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FaceAttribute.fromValue(value);
    }
  }
}

