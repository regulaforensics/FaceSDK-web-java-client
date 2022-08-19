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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.regula.facesdk.webclient.gen.model.ImageFields;
import com.regula.facesdk.webclient.gen.model.ImageFieldsImage;
import com.regula.facesdk.webclient.gen.model.SearchRequestAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SearchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchRequest {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit = 100;

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private Float threshold;

  public static final String SERIALIZED_NAME_GROUP_IDS = "group_ids";
  @SerializedName(SERIALIZED_NAME_GROUP_IDS)
  private List<Integer> groupIds = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private ImageFieldsImage image;

  public SearchRequest() { 
  }

  public SearchRequest limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public SearchRequest threshold(Float threshold) {
    
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getThreshold() {
    return threshold;
  }


  public void setThreshold(Float threshold) {
    this.threshold = threshold;
  }


  public SearchRequest groupIds(List<Integer> groupIds) {
    
    this.groupIds = groupIds;
    return this;
  }

  public SearchRequest addGroupIdsItem(Integer groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new ArrayList<Integer>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

   /**
   * Get groupIds
   * @return groupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getGroupIds() {
    return groupIds;
  }


  public void setGroupIds(List<Integer> groupIds) {
    this.groupIds = groupIds;
  }


  public SearchRequest image(ImageFieldsImage image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ImageFieldsImage getImage() {
    return image;
  }


  public void setImage(ImageFieldsImage image) {
    this.image = image;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRequest searchRequest = (SearchRequest) o;
    return Objects.equals(this.limit, searchRequest.limit) &&
        Objects.equals(this.threshold, searchRequest.threshold) &&
        Objects.equals(this.groupIds, searchRequest.groupIds) &&
        Objects.equals(this.image, searchRequest.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, threshold, groupIds, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRequest {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

