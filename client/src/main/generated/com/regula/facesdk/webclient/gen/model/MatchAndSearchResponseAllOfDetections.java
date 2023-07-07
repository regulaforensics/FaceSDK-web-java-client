/*
 * Regula FaceSDK Web API
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.regula.facesdk.webclient.gen.model.FaceSDKResultCode;
import com.regula.facesdk.webclient.gen.model.FacesResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MatchAndSearchResponseAllOfDetections
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MatchAndSearchResponseAllOfDetections {
  public static final String SERIALIZED_NAME_FACES = "faces";
  @SerializedName(SERIALIZED_NAME_FACES)
  private List<FacesResponse> faces = null;

  public static final String SERIALIZED_NAME_IMAGE_INDEX = "imageIndex";
  @SerializedName(SERIALIZED_NAME_IMAGE_INDEX)
  private Integer imageIndex;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private FaceSDKResultCode status;

  public MatchAndSearchResponseAllOfDetections() { 
  }

  public MatchAndSearchResponseAllOfDetections faces(List<FacesResponse> faces) {
    
    this.faces = faces;
    return this;
  }

  public MatchAndSearchResponseAllOfDetections addFacesItem(FacesResponse facesItem) {
    if (this.faces == null) {
      this.faces = new ArrayList<FacesResponse>();
    }
    this.faces.add(facesItem);
    return this;
  }

   /**
   * Get faces
   * @return faces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FacesResponse> getFaces() {
    return faces;
  }


  public void setFaces(List<FacesResponse> faces) {
    this.faces = faces;
  }


  public MatchAndSearchResponseAllOfDetections imageIndex(Integer imageIndex) {
    
    this.imageIndex = imageIndex;
    return this;
  }

   /**
   * The image index number. Can be given; if not given, the index numbers are set automatically starting from 0. All index numbers must be whole and unique—not repeated.
   * @return imageIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The image index number. Can be given; if not given, the index numbers are set automatically starting from 0. All index numbers must be whole and unique—not repeated.")

  public Integer getImageIndex() {
    return imageIndex;
  }


  public void setImageIndex(Integer imageIndex) {
    this.imageIndex = imageIndex;
  }


  public MatchAndSearchResponseAllOfDetections status(FaceSDKResultCode status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    MatchAndSearchResponseAllOfDetections matchAndSearchResponseAllOfDetections = (MatchAndSearchResponseAllOfDetections) o;
    return Objects.equals(this.faces, matchAndSearchResponseAllOfDetections.faces) &&
        Objects.equals(this.imageIndex, matchAndSearchResponseAllOfDetections.imageIndex) &&
        Objects.equals(this.status, matchAndSearchResponseAllOfDetections.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faces, imageIndex, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchAndSearchResponseAllOfDetections {\n");
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

