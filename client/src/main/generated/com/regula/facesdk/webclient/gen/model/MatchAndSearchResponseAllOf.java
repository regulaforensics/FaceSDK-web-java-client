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
import com.regula.facesdk.webclient.gen.model.MatchAndSearchResponseAllOfDetections;
import com.regula.facesdk.webclient.gen.model.MatchImageResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MatchAndSearchResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MatchAndSearchResponseAllOf {
  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<MatchImageResult> results = null;

  public static final String SERIALIZED_NAME_ELAPSED_TIME = "elapsedTime";
  @SerializedName(SERIALIZED_NAME_ELAPSED_TIME)
  private Float elapsedTime;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = null;

  public static final String SERIALIZED_NAME_DETECTIONS = "detections";
  @SerializedName(SERIALIZED_NAME_DETECTIONS)
  private List<MatchAndSearchResponseAllOfDetections> detections = null;

  public MatchAndSearchResponseAllOf() { 
  }

  public MatchAndSearchResponseAllOf results(List<MatchImageResult> results) {
    
    this.results = results;
    return this;
  }

  public MatchAndSearchResponseAllOf addResultsItem(MatchImageResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<MatchImageResult>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * The match and search results.
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The match and search results.")

  public List<MatchImageResult> getResults() {
    return results;
  }


  public void setResults(List<MatchImageResult> results) {
    this.results = results;
  }


  public MatchAndSearchResponseAllOf elapsedTime(Float elapsedTime) {
    
    this.elapsedTime = elapsedTime;
    return this;
  }

   /**
   * Time the processing has taken, ms.
   * @return elapsedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.317137987", value = "Time the processing has taken, ms.")

  public Float getElapsedTime() {
    return elapsedTime;
  }


  public void setElapsedTime(Float elapsedTime) {
    this.elapsedTime = elapsedTime;
  }


  public MatchAndSearchResponseAllOf metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public MatchAndSearchResponseAllOf putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, Object>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * A free-form object containing person&#39;s extended attributes.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A free-form object containing person's extended attributes.")

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public MatchAndSearchResponseAllOf detections(List<MatchAndSearchResponseAllOfDetections> detections) {
    
    this.detections = detections;
    return this;
  }

  public MatchAndSearchResponseAllOf addDetectionsItem(MatchAndSearchResponseAllOfDetections detectionsItem) {
    if (this.detections == null) {
      this.detections = new ArrayList<MatchAndSearchResponseAllOfDetections>();
    }
    this.detections.add(detectionsItem);
    return this;
  }

   /**
   * The detection results.
   * @return detections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The detection results.")

  public List<MatchAndSearchResponseAllOfDetections> getDetections() {
    return detections;
  }


  public void setDetections(List<MatchAndSearchResponseAllOfDetections> detections) {
    this.detections = detections;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchAndSearchResponseAllOf matchAndSearchResponseAllOf = (MatchAndSearchResponseAllOf) o;
    return Objects.equals(this.results, matchAndSearchResponseAllOf.results) &&
        Objects.equals(this.elapsedTime, matchAndSearchResponseAllOf.elapsedTime) &&
        Objects.equals(this.metadata, matchAndSearchResponseAllOf.metadata) &&
        Objects.equals(this.detections, matchAndSearchResponseAllOf.detections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, elapsedTime, metadata, detections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchAndSearchResponseAllOf {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    detections: ").append(toIndentedString(detections)).append("\n");
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

