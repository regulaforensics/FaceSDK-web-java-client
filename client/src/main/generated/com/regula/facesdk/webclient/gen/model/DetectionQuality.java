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
import com.regula.facesdk.webclient.gen.model.FaceQualityConfigName;
import com.regula.facesdk.webclient.gen.model.QualityDetail;
import com.regula.facesdk.webclient.gen.model.QualityDetailsGroups;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Field for checking the portrait quality. If it is not mentioned, no quality check is performed.
 */
@ApiModel(description = "Field for checking the portrait quality. If it is not mentioned, no quality check is performed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DetectionQuality {
  public static final String SERIALIZED_NAME_NON_COMPLIANT = "nonCompliant";
  @SerializedName(SERIALIZED_NAME_NON_COMPLIANT)
  private List<FaceQualityConfigName> nonCompliant = null;

  public static final String SERIALIZED_NAME_DETAILS_GROUPS = "detailsGroups";
  @SerializedName(SERIALIZED_NAME_DETAILS_GROUPS)
  private List<QualityDetailsGroups> detailsGroups = null;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<QualityDetail> details = null;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Float score;

  public static final String SERIALIZED_NAME_TIMER = "timer";
  @SerializedName(SERIALIZED_NAME_TIMER)
  private Float timer;

  public DetectionQuality() { 
  }

  public DetectionQuality nonCompliant(List<FaceQualityConfigName> nonCompliant) {
    
    this.nonCompliant = nonCompliant;
    return this;
  }

  public DetectionQuality addNonCompliantItem(FaceQualityConfigName nonCompliantItem) {
    if (this.nonCompliant == null) {
      this.nonCompliant = new ArrayList<FaceQualityConfigName>();
    }
    this.nonCompliant.add(nonCompliantItem);
    return this;
  }

   /**
   * The array of all the non-compliant assessment characteristics.
   * @return nonCompliant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"ImageWidthToHeight\",\"Yaw\"]", value = "The array of all the non-compliant assessment characteristics.")

  public List<FaceQualityConfigName> getNonCompliant() {
    return nonCompliant;
  }


  public void setNonCompliant(List<FaceQualityConfigName> nonCompliant) {
    this.nonCompliant = nonCompliant;
  }


  public DetectionQuality detailsGroups(List<QualityDetailsGroups> detailsGroups) {
    
    this.detailsGroups = detailsGroups;
    return this;
  }

  public DetectionQuality addDetailsGroupsItem(QualityDetailsGroups detailsGroupsItem) {
    if (this.detailsGroups == null) {
      this.detailsGroups = new ArrayList<QualityDetailsGroups>();
    }
    this.detailsGroups.add(detailsGroupsItem);
    return this;
  }

   /**
   * The array of the assessment results for each group of characteristics.
   * @return detailsGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The array of the assessment results for each group of characteristics.")

  public List<QualityDetailsGroups> getDetailsGroups() {
    return detailsGroups;
  }


  public void setDetailsGroups(List<QualityDetailsGroups> detailsGroups) {
    this.detailsGroups = detailsGroups;
  }


  public DetectionQuality details(List<QualityDetail> details) {
    
    this.details = details;
    return this;
  }

  public DetectionQuality addDetailsItem(QualityDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<QualityDetail>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * The array of the assessment characteristics that were set in the request.
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The array of the assessment characteristics that were set in the request.")

  public List<QualityDetail> getDetails() {
    return details;
  }


  public void setDetails(List<QualityDetail> details) {
    this.details = details;
  }


  public DetectionQuality score(Float score) {
    
    this.score = score;
    return this;
  }

   /**
   * Returns the estimated portrait quality assessment result, a number from 0 to 1, where 1 is for absolute compliance.
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-1.0", value = "Returns the estimated portrait quality assessment result, a number from 0 to 1, where 1 is for absolute compliance.")

  public Float getScore() {
    return score;
  }


  public void setScore(Float score) {
    this.score = score;
  }


  public DetectionQuality timer(Float timer) {
    
    this.timer = timer;
    return this;
  }

   /**
   * The total time the quality assessment has taken.
   * @return timer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.420364111661911", value = "The total time the quality assessment has taken.")

  public Float getTimer() {
    return timer;
  }


  public void setTimer(Float timer) {
    this.timer = timer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectionQuality detectionQuality = (DetectionQuality) o;
    return Objects.equals(this.nonCompliant, detectionQuality.nonCompliant) &&
        Objects.equals(this.detailsGroups, detectionQuality.detailsGroups) &&
        Objects.equals(this.details, detectionQuality.details) &&
        Objects.equals(this.score, detectionQuality.score) &&
        Objects.equals(this.timer, detectionQuality.timer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonCompliant, detailsGroups, details, score, timer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectionQuality {\n");
    sb.append("    nonCompliant: ").append(toIndentedString(nonCompliant)).append("\n");
    sb.append("    detailsGroups: ").append(toIndentedString(detailsGroups)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    timer: ").append(toIndentedString(timer)).append("\n");
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

