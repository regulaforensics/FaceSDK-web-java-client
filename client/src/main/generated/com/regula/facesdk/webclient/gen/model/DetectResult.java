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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** DetectResult */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DetectResult {
  public static final String SERIALIZED_NAME_DETECTIONS = "detections";

  @SerializedName(SERIALIZED_NAME_DETECTIONS)
  private List<Detection> detections = new ArrayList<Detection>();

  public static final String SERIALIZED_NAME_DETECTOR_TYPE = "detectorType";

  @SerializedName(SERIALIZED_NAME_DETECTOR_TYPE)
  private Integer detectorType;

  public static final String SERIALIZED_NAME_LANDMARKS_TYPE = "landmarksType";

  @SerializedName(SERIALIZED_NAME_LANDMARKS_TYPE)
  private Integer landmarksType;

  public static final String SERIALIZED_NAME_SCENARIO = "scenario";

  @SerializedName(SERIALIZED_NAME_SCENARIO)
  private FaceQualityScenarios scenario;

  public static final String SERIALIZED_NAME_TIMER = "timer";

  @SerializedName(SERIALIZED_NAME_TIMER)
  private Float timer = null;

  public DetectResult detections(List<Detection> detections) {

    this.detections = detections;
    return this;
  }

  public DetectResult addDetectionsItem(Detection detectionsItem) {
    this.detections.add(detectionsItem);
    return this;
  }

  /**
   * Get detections
   *
   * @return detections
   */
  @ApiModelProperty(required = true, value = "")
  public List<Detection> getDetections() {
    return detections;
  }

  public void setDetections(List<Detection> detections) {
    this.detections = detections;
  }

  public DetectResult detectorType(Integer detectorType) {

    this.detectorType = detectorType;
    return this;
  }

  /**
   * Internal.
   *
   * @return detectorType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Internal.")
  public Integer getDetectorType() {
    return detectorType;
  }

  public void setDetectorType(Integer detectorType) {
    this.detectorType = detectorType;
  }

  public DetectResult landmarksType(Integer landmarksType) {

    this.landmarksType = landmarksType;
    return this;
  }

  /**
   * Internal.
   *
   * @return landmarksType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Internal.")
  public Integer getLandmarksType() {
    return landmarksType;
  }

  public void setLandmarksType(Integer landmarksType) {
    this.landmarksType = landmarksType;
  }

  public DetectResult scenario(FaceQualityScenarios scenario) {

    this.scenario = scenario;
    return this;
  }

  /**
   * Get scenario
   *
   * @return scenario
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public FaceQualityScenarios getScenario() {
    return scenario;
  }

  public void setScenario(FaceQualityScenarios scenario) {
    this.scenario = scenario;
  }

  public DetectResult timer(Float timer) {

    this.timer = timer;
    return this;
  }

  /**
   * Get timer
   *
   * @return timer
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.8479356", value = "")
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
    DetectResult detectResult = (DetectResult) o;
    return Objects.equals(this.detections, detectResult.detections)
        && Objects.equals(this.detectorType, detectResult.detectorType)
        && Objects.equals(this.landmarksType, detectResult.landmarksType)
        && Objects.equals(this.scenario, detectResult.scenario)
        && Objects.equals(this.timer, detectResult.timer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detections, detectorType, landmarksType, scenario, timer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectResult {\n");
    sb.append("    detections: ").append(toIndentedString(detections)).append("\n");
    sb.append("    detectorType: ").append(toIndentedString(detectorType)).append("\n");
    sb.append("    landmarksType: ").append(toIndentedString(landmarksType)).append("\n");
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
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
