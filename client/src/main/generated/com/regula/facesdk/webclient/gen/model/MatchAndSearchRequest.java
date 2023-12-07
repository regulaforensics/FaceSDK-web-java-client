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
import com.regula.facesdk.webclient.gen.model.MatchAndSearchRequestAllOf;
import com.regula.facesdk.webclient.gen.model.MatchAndSearchRequestAllOfImages;
import com.regula.facesdk.webclient.gen.model.SearchParameters;
import com.regula.facesdk.webclient.gen.model.SearchParametersCreatePerson;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * MatchAndSearchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MatchAndSearchRequest {
  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<MatchAndSearchRequestAllOfImages> images = null;

  public static final String SERIALIZED_NAME_CREATE_PERSON = "createPerson";
  @SerializedName(SERIALIZED_NAME_CREATE_PERSON)
  private SearchParametersCreatePerson createPerson;

  public static final String SERIALIZED_NAME_GROUP_IDS = "groupIds";
  @SerializedName(SERIALIZED_NAME_GROUP_IDS)
  private List<UUID> groupIds = null;

  public MatchAndSearchRequest() { 
  }

  public MatchAndSearchRequest tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Session identificator.
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Session identificator.")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public MatchAndSearchRequest images(List<MatchAndSearchRequestAllOfImages> images) {
    
    this.images = images;
    return this;
  }

  public MatchAndSearchRequest addImagesItem(MatchAndSearchRequestAllOfImages imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<MatchAndSearchRequestAllOfImages>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Array of Person images.
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of Person images.")

  public List<MatchAndSearchRequestAllOfImages> getImages() {
    return images;
  }


  public void setImages(List<MatchAndSearchRequestAllOfImages> images) {
    this.images = images;
  }


  public MatchAndSearchRequest createPerson(SearchParametersCreatePerson createPerson) {
    
    this.createPerson = createPerson;
    return this;
  }

   /**
   * Get createPerson
   * @return createPerson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SearchParametersCreatePerson getCreatePerson() {
    return createPerson;
  }


  public void setCreatePerson(SearchParametersCreatePerson createPerson) {
    this.createPerson = createPerson;
  }


  public MatchAndSearchRequest groupIds(List<UUID> groupIds) {
    
    this.groupIds = groupIds;
    return this;
  }

  public MatchAndSearchRequest addGroupIdsItem(UUID groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new ArrayList<UUID>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

   /**
   * IDs of the groups in which the search is performed.
   * @return groupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IDs of the groups in which the search is performed.")

  public List<UUID> getGroupIds() {
    return groupIds;
  }


  public void setGroupIds(List<UUID> groupIds) {
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
    MatchAndSearchRequest matchAndSearchRequest = (MatchAndSearchRequest) o;
    return Objects.equals(this.tag, matchAndSearchRequest.tag) &&
        Objects.equals(this.images, matchAndSearchRequest.images) &&
        Objects.equals(this.createPerson, matchAndSearchRequest.createPerson) &&
        Objects.equals(this.groupIds, matchAndSearchRequest.groupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, images, createPerson, groupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchAndSearchRequest {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    createPerson: ").append(toIndentedString(createPerson)).append("\n");
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

