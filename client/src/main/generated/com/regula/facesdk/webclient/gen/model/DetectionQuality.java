/*
 * Regula FaceSDK Web API
 * Regula FaceSDK Web API
 *
 * The version of the OpenAPI document: 3.2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.facesdk.webclient.gen.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Field for checking the portrait quality. If it is not mentioned, no quality check is performed.
 */
@ApiModel(
    description =
        "Field for checking the portrait quality. If it is not mentioned, no quality check is performed.")
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
  private Float score = null;

  public static final String SERIALIZED_NAME_TIMER = "timer";

  @SerializedName(SERIALIZED_NAME_TIMER)
  private Float timer = null;

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
   *
   * @return nonCompliant
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "[\"ImageWidthToHeight\",\"Yaw\"]",
      value = "The array of all the non-compliant assessment characteristics.")
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
   * The array of the assessment results for each group of characteristics. Includes groupId, name,
   * total, compliantCount.
   *
   * @return detailsGroups
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The array of the assessment results for each group of characteristics. Includes groupId, name, total, compliantCount.")
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
   * The array of the assessment characteristics that were set in the request. Includes name, range,
   * status, unit, value.
   *
   * @return details
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The array of the assessment characteristics that were set in the request. Includes name, range, status, unit, value.")
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
   * Returns the estimated portrait quality assessment result, a number from 0 to 1, where 1 is for
   * absolute compliance.
   *
   * @return score
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "-1.0",
      value =
          "Returns the estimated portrait quality assessment result, a number from 0 to 1, where 1 is for absolute compliance.")
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
   * Get timer
   *
   * @return timer
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.420364111661911", value = "")
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
    return Objects.equals(this.nonCompliant, detectionQuality.nonCompliant)
        && Objects.equals(this.detailsGroups, detectionQuality.detailsGroups)
        && Objects.equals(this.details, detectionQuality.details)
        && Objects.equals(this.score, detectionQuality.score)
        && Objects.equals(this.timer, detectionQuality.timer);
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
