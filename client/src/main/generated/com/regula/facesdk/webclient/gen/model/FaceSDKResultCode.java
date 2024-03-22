/*
 * Regula Face SDK Web API
 * <a href=\"https://regulaforensics.com/products/face-recognition-sdk/  \" target=\"_blank\">Regula Face SDK</a> is a cross-platform biometric verification solution for a digital identity verification process. The SDK enables convenient and reliable face capture on the client side (mobile, web, and desktop) and further processing on the client or server side.  The Face SDK includes the following features:  * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-detection\" target=\"_blank\">Face Detection</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-comparison-11\" target=\"_blank\">Face Match (1:1)</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-identification-1n\" target=\"_blank\">Face Search (1:N)</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#liveness-assessment\" target=\"_blank\">Liveness Assessment</a>  Here is the <a href=\"https://github.com/regulaforensics/FaceSDK-web-openapi  \" target=\"_blank\">OpenAPI specification on GitHub</a>.   ### Clients * [JavaScript](https://github.com/regulaforensics/FaceSDK-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/FaceSDK-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/FaceSDK-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/FaceSDK-web-csharp-client) client for .NET & .NET Core 
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
 * The result code, see the [FaceSDKResultCode enum](https://docs.regulaforensics.com/develop/face-sdk/web-service/development/enums/face-sdk-result-code/). Some of the values: - &#x60;0&#x60;—everything is OK - &#x60;1&#x60;—image is empty, try again with another image - &#x60;2&#x60;—face is not detected - &#x60;6&#x60;—data cannot be decoded as an image
 */
@JsonAdapter(FaceSDKResultCode.Adapter.class)
public enum FaceSDKResultCode {
  
  FACER_OK(0),
  
  FR_IMAGE_EMPTY(1),
  
  FR_FACE_NOT_DETECTED(2),
  
  FR_LANDMARKS_NOT_DETECTED(3),
  
  FR_FACE_ALIGHNER_FAILED(4),
  
  FR_DESCRIPTOR_EXTRACTOR_ERROR(5),
  
  FR_IMAGE_DECODE_ERROR(6),
  
  FR_INTERNAL_ERROR(7),
  
  FACER_CONFIG_ERROR(199),
  
  FACER_NO_LICENSE(200),
  
  FACER_IS_NOT_INITIALIZED(201),
  
  FACER_COMMAND_IS_NOT_SUPPORTED(202),
  
  FACER_COMMAND_PARAMS_READ_ERROR(203),
  
  FACER_LESS_THAN_TWO_IMAGES_IN_REQUEST(224),
  
  FACER_VIDEO_DECODE_ERROR(227),
  
  FACER_NOT_ENOUGH_FRAMES(228),
  
  FACER_OUTPUT_IS_NOT_DEFINED(229),
  
  FACER_CLOSED_EYES_DETECTED(230),
  
  FACER_LOW_QUALITY(231),
  
  FACER_HIGH_ASYMMETRY(232),
  
  FACER_FACE_OVER_EMOTIONAL(233),
  
  FACER_SUNGLASSES_DETECTED(234),
  
  FACER_SMALL_AGE(235),
  
  FACER_HEADDRESS_DETECTED(236),
  
  FACER_FACES_NOT_MATCHED(237),
  
  FACER_IMAGES_COUNT_LIMIT_EXCEEDED(238),
  
  FACER_MEDICINE_MASK_DETECTED(239),
  
  FACER_OCCLUSION_DETECTED(240),
  
  FACER_FOREHEAD_GLASSES_DETECTED(242),
  
  FACER_MOUTH_OPENED(243),
  
  FACER_ART_MASK_DETECTED(244),
  
  FACER_ELECTRONIC_DEVICE_DETECTED(245),
  
  FACER_TRACK_BREAK(246),
  
  FACER_WRONG_GEO(247),
  
  FACER_WRONG_OF(248),
  
  FACER_WRONG_VIEW(249),
  
  FACER_TIMEOUT_LIVENESS_TRANSACTION(250),
  
  FACER_FAILED_LIVENESS_TRANSACTION(251),
  
  FACER_ABORTED_LIVENESS_TRANSACTION(252),
  
  FACER_GENERAL_ERROR(253),
  
  FACER_PASSIVE_LIVENESS_FAIL(254);

  private Integer value;

  FaceSDKResultCode(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FaceSDKResultCode fromValue(Integer value) {
    for (FaceSDKResultCode b : FaceSDKResultCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FaceSDKResultCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final FaceSDKResultCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FaceSDKResultCode read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return FaceSDKResultCode.fromValue(value);
    }
  }
}

