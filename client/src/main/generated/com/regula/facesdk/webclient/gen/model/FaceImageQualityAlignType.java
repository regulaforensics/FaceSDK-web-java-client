/*
 * Regula Face SDK Web API
 * <a href=\"https://regulaforensics.com/products/face-recognition-sdk/  \" target=\"_blank\">Regula Face SDK</a> is a cross-platform biometric verification solution for a digital identity verification process and image quality assurance. The SDK enables convenient and reliable face capture on the client side (mobile, web, and desktop) and further processing on the client or server side.   The Face SDK includes the following features:  * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-detection\" target=\"_blank\">Face detection and image quality assessment</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-comparison-11\" target=\"_blank\">Face match (1:1)</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-identification-1n\" target=\"_blank\">Face search (1:N)</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#liveness-assessment\" target=\"_blank\">Liveness detection</a>  Here is the <a href=\"https://github.com/regulaforensics/FaceSDK-web-openapi  \" target=\"_blank\">OpenAPI specification on GitHub</a>.   ### Clients * [JavaScript](https://github.com/regulaforensics/FaceSDK-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/FaceSDK-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/FaceSDK-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/FaceSDK-web-csharp-client) client for .NET & .NET Core 
 *
 * The version of the OpenAPI document: 6.2.0
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
 * The aspect ratio according to which face alignment is performed. See the [FaceImageQualityAlignType enum](https://docs.regulaforensics.com/develop/face-sdk/web-service/development/enums/face-image-quality-align-type/). To get a thumbnail with aspect ratio 3:4, set &#x60;0&#x60;.
 */
@JsonAdapter(FaceImageQualityAlignType.Adapter.class)
public enum FaceImageQualityAlignType {
  
  ALIGN_3x4(0),
  
  ALIGN_4x5(1),
  
  ALIGN_2x3(2),
  
  ALIGN_1x1(3),
  
  ALIGN_7x9(4);

  private Integer value;

  FaceImageQualityAlignType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FaceImageQualityAlignType fromValue(Integer value) {
    for (FaceImageQualityAlignType b : FaceImageQualityAlignType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FaceImageQualityAlignType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FaceImageQualityAlignType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FaceImageQualityAlignType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return FaceImageQualityAlignType.fromValue(value);
    }
  }
}

