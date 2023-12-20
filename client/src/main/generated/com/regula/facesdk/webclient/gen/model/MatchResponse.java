/*
 * Regula FaceSDK Web API
 * Regula FaceSDK Web API # Clients * [JavaScript](https://github.com/regulaforensics/FaceSDK-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/FaceSDK-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/FaceSDK-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/FaceSDK-web-csharp-client) client for .NET & .NET Core 
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
import com.regula.facesdk.webclient.gen.model.FaceSDKResult;
import com.regula.facesdk.webclient.gen.model.FaceSDKResultCode;
import com.regula.facesdk.webclient.gen.model.MatchImageDetection;
import com.regula.facesdk.webclient.gen.model.MatchImageResult;
import com.regula.facesdk.webclient.gen.model.MatchResponseAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MatchResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MatchResponse {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private FaceSDKResultCode code;

  public static final String SERIALIZED_NAME_DETECTIONS = "detections";
  @SerializedName(SERIALIZED_NAME_DETECTIONS)
  private List<MatchImageDetection> detections = null;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<MatchImageResult> results = null;

  public MatchResponse() { 
  }

  public MatchResponse code(FaceSDKResultCode code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FaceSDKResultCode getCode() {
    return code;
  }


  public void setCode(FaceSDKResultCode code) {
    this.code = code;
  }


  public MatchResponse detections(List<MatchImageDetection> detections) {
    
    this.detections = detections;
    return this;
  }

  public MatchResponse addDetectionsItem(MatchImageDetection detectionsItem) {
    if (this.detections == null) {
      this.detections = new ArrayList<MatchImageDetection>();
    }
    this.detections.add(detectionsItem);
    return this;
  }

   /**
   * The array of detected faces.
   * @return detections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The array of detected faces.")

  public List<MatchImageDetection> getDetections() {
    return detections;
  }


  public void setDetections(List<MatchImageDetection> detections) {
    this.detections = detections;
  }


  public MatchResponse results(List<MatchImageResult> results) {
    
    this.results = results;
    return this;
  }

  public MatchResponse addResultsItem(MatchImageResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<MatchImageResult>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * The array of matching results.
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The array of matching results.")

  public List<MatchImageResult> getResults() {
    return results;
  }


  public void setResults(List<MatchImageResult> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchResponse matchResponse = (MatchResponse) o;
    return Objects.equals(this.code, matchResponse.code) &&
        Objects.equals(this.detections, matchResponse.detections) &&
        Objects.equals(this.results, matchResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, detections, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchResponse {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    detections: ").append(toIndentedString(detections)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

