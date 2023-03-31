/*
 * Regula FaceSDK Web API
 * Regula FaceSDK Web API # Clients * [JavaScript](https://github.com/regulaforensics/FaceSDK-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/FaceSDK-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/FaceSDK-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/FaceSDK-web-csharp-client) client for .NET & .NET Core 
 *
 * The version of the OpenAPI document: 5.1.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Request search data.
 */
@ApiModel(description = "Request search data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchParameters {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit = 100;

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private Float threshold = null;

  public static final String SERIALIZED_NAME_GROUP_IDS = "group_ids";
  @SerializedName(SERIALIZED_NAME_GROUP_IDS)
  private List<Integer> groupIds = null;

  public SearchParameters() { 
  }

  public SearchParameters limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The number of returned Persons limit.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of returned Persons limit.")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public SearchParameters threshold(Float threshold) {
    
    this.threshold = threshold;
    return this;
  }

   /**
   * The similarity distance threshold, should be between 0.0 and 2.0, where 0.0 is for returning results for only the most similar persons and 2.0 is for all the persons, even the dissimilar ones. If not set, the default 1.0 value is used.
   * @return threshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The similarity distance threshold, should be between 0.0 and 2.0, where 0.0 is for returning results for only the most similar persons and 2.0 is for all the persons, even the dissimilar ones. If not set, the default 1.0 value is used.")

  public Float getThreshold() {
    return threshold;
  }


  public void setThreshold(Float threshold) {
    this.threshold = threshold;
  }


  public SearchParameters groupIds(List<Integer> groupIds) {
    
    this.groupIds = groupIds;
    return this;
  }

  public SearchParameters addGroupIdsItem(Integer groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new ArrayList<Integer>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

   /**
   * The IDs of the groups in which the search is performed.
   * @return groupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the groups in which the search is performed.")

  public List<Integer> getGroupIds() {
    return groupIds;
  }


  public void setGroupIds(List<Integer> groupIds) {
    this.groupIds = groupIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchParameters searchParameters = (SearchParameters) o;
    return Objects.equals(this.limit, searchParameters.limit) &&
        Objects.equals(this.threshold, searchParameters.threshold) &&
        Objects.equals(this.groupIds, searchParameters.groupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, threshold, groupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchParameters {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
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

