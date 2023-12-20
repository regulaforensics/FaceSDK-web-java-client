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
import com.regula.facesdk.webclient.gen.model.GroupAllOf;
import com.regula.facesdk.webclient.gen.model.GroupToCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Group
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Group {
  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public Group() { 
  }

  public Group tag(String tag) {
    
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


  public Group name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Group to create name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group to create name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Group metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public Group putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, Object>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * A free-form object containing group&#39;s extended attributes.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A free-form object containing group's extended attributes.")

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public Group id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Group ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group ID.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Group createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Group creation date.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group creation date.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.tag, group.tag) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.metadata, group.metadata) &&
        Objects.equals(this.id, group.id) &&
        Objects.equals(this.createdAt, group.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, name, metadata, id, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

