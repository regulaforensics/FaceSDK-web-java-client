/*
 * Regula Face SDK Web API
 * <a href=\"https://regulaforensics.com/products/face-recognition-sdk/  \" target=\"_blank\">Regula Face SDK</a> is a cross-platform biometric verification solution for a digital identity verification process and image quality assurance. The SDK enables convenient and reliable face capture on the client side (mobile, web, and desktop) and further processing on the client or server side.   The Face SDK includes the following features:  * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-detection\" target=\"_blank\">Face detection and image quality assessment</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-comparison-11\" target=\"_blank\">Face match (1:1)</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-identification-1n\" target=\"_blank\">Face search (1:N)</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#liveness-assessment\" target=\"_blank\">Liveness detection</a>  Here is the <a href=\"https://github.com/regulaforensics/FaceSDK-web-openapi  \" target=\"_blank\">OpenAPI specification on GitHub</a>.   ### Clients * [JavaScript](https://github.com/regulaforensics/FaceSDK-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/FaceSDK-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/FaceSDK-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/FaceSDK-web-csharp-client) client for .NET & .NET Core 
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.regula.facesdk.webclient.gen.model.DetectionFace;
import com.regula.facesdk.webclient.gen.model.FaceSDKResultCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MatchImageDetection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MatchImageDetection {
  public static final String SERIALIZED_NAME_FACES = "faces";
  @SerializedName(SERIALIZED_NAME_FACES)
  private List<DetectionFace> faces = null;

  public static final String SERIALIZED_NAME_IMAGE_INDEX = "imageIndex";
  @SerializedName(SERIALIZED_NAME_IMAGE_INDEX)
  private Integer imageIndex;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private FaceSDKResultCode status;

  public MatchImageDetection() { 
  }

  public MatchImageDetection faces(List<DetectionFace> faces) {
    
    this.faces = faces;
    return this;
  }

  public MatchImageDetection addFacesItem(DetectionFace facesItem) {
    if (this.faces == null) {
      this.faces = new ArrayList<DetectionFace>();
    }
    this.faces.add(facesItem);
    return this;
  }

   /**
   * Detected faces.
   * @return faces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Detected faces.")

  public List<DetectionFace> getFaces() {
    return faces;
  }


  public void setFaces(List<DetectionFace> faces) {
    this.faces = faces;
  }


  public MatchImageDetection imageIndex(Integer imageIndex) {
    
    this.imageIndex = imageIndex;
    return this;
  }

   /**
   * The image index number. Can be given; if not given, the index numbers are set automatically starting from &#x60;0&#x60;. All index numbers must be whole and unique—not repeated.
   * @return imageIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The image index number. Can be given; if not given, the index numbers are set automatically starting from `0`. All index numbers must be whole and unique—not repeated.")

  public Integer getImageIndex() {
    return imageIndex;
  }


  public void setImageIndex(Integer imageIndex) {
    this.imageIndex = imageIndex;
  }


  public MatchImageDetection status(FaceSDKResultCode status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FaceSDKResultCode getStatus() {
    return status;
  }


  public void setStatus(FaceSDKResultCode status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchImageDetection matchImageDetection = (MatchImageDetection) o;
    return Objects.equals(this.faces, matchImageDetection.faces) &&
        Objects.equals(this.imageIndex, matchImageDetection.imageIndex) &&
        Objects.equals(this.status, matchImageDetection.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faces, imageIndex, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchImageDetection {\n");
    sb.append("    faces: ").append(toIndentedString(faces)).append("\n");
    sb.append("    imageIndex: ").append(toIndentedString(imageIndex)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

