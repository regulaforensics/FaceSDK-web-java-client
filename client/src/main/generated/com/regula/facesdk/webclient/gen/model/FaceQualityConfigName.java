/*
 * Regula FaceSDK Web api
 * Regula FaceSDK Web API # Clients * [JavaScript](https://github.com/regulaforensics/FaceSDK-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/FaceSDK-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/FaceSDK-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/FaceSDK-web-csharp-client) client for .NET & .NET Core 
 *
 * The version of the OpenAPI document: 5.2.0
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
 * All image characteristics that can be assessed during face image quality assessment.
 */
@JsonAdapter(FaceQualityConfigName.Adapter.class)
public enum FaceQualityConfigName {
  
  IMAGE_WIDTH("ImageWidth"),
  
  IMAGE_HEIGHT("ImageHeight"),
  
  IMAGE_WIDTH_TO_HEIGHT("ImageWidthToHeight"),
  
  IMAGE_CHANNELS_NUMBER("ImageChannelsNumber"),
  
  PADDING_RATIO("PaddingRatio"),
  
  FACE_MID_POINT_HORIZONTAL_POSITION("FaceMidPointHorizontalPosition"),
  
  FACE_MID_POINT_VERTICAL_POSITION("FaceMidPointVerticalPosition"),
  
  HEAD_WIDTH_RATIO("HeadWidthRatio"),
  
  HEAD_HEIGHT_RATIO("HeadHeightRatio"),
  
  EYES_DISTANCE("EyesDistance"),
  
  YAW("Yaw"),
  
  PITCH("Pitch"),
  
  ROLL("Roll"),
  
  BLUR_LEVEL("BlurLevel"),
  
  NOISE_LEVEL("NoiseLevel"),
  
  EYE_RIGHT_CLOSED("EyeRightClosed"),
  
  EYE_LEFT_CLOSED("EyeLeftClosed"),
  
  EYE_RIGHT_OCCLUDED("EyeRightOccluded"),
  
  EYE_LEFT_OCCLUDED("EyeLeftOccluded"),
  
  EYES_RED("EyesRed"),
  
  EYE_RIGHT_COVERED_WITH_HAIR("EyeRightCoveredWithHair"),
  
  EYE_LEFT_COVERED_WITH_HAIR("EyeLeftCoveredWithHair"),
  
  OFF_GAZE("OffGaze"),
  
  FACE_DYNAMIC_RANGE("FaceDynamicRange"),
  
  UNNATURAL_SKIN_TONE("UnnaturalSkinTone"),
  
  TOO_DARK("TooDark"),
  
  TOO_LIGHT("TooLight"),
  
  FACE_GLARE("FaceGlare"),
  
  SHADOWS_ON_FACE("ShadowsOnFace"),
  
  DARK_GLASSES("DarkGlasses"),
  
  REFLECTION_ON_GLASSES("ReflectionOnGlasses"),
  
  FRAMES_TOO_HEAVY("FramesTooHeavy"),
  
  FACE_OCCLUDED("FaceOccluded"),
  
  HEAD_COVERING("HeadCovering"),
  
  BACKGROUND_UNIFORMITY("BackgroundUniformity"),
  
  SHADOWS_ON_BACKGROUND("ShadowsOnBackground"),
  
  OTHER_FACES("OtherFaces"),
  
  SHOULDERS_POSE("ShouldersPose"),
  
  EXPRESSION_LEVEL("ExpressionLevel"),
  
  MOUTH_OPEN("MouthOpen"),
  
  FOREHEAD_COVERING("ForeheadCovering"),
  
  SMILE("Smile"),
  
  STRONG_MAKEUP("StrongMakeup"),
  
  HEADPHONES("Headphones"),
  
  MEDICAL_MASK("MedicalMask"),
  
  BACKGROUND_COLOR_MATCH("BackgroundColorMatch"),
  
  ART_FACE("ArtFace"),
  
  CONTACT_LENSES("ContactLenses");

  private String value;

  FaceQualityConfigName(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FaceQualityConfigName fromValue(String value) {
    for (FaceQualityConfigName b : FaceQualityConfigName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FaceQualityConfigName> {
    @Override
    public void write(final JsonWriter jsonWriter, final FaceQualityConfigName enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FaceQualityConfigName read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FaceQualityConfigName.fromValue(value);
    }
  }
}

