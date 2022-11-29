/*
 * Regula FaceSDK Web API
 * Regula FaceSDK Web API # Clients * [JavaScript](https://github.com/regulaforensics/FaceSDK-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/FaceSDK-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/FaceSDK-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/FaceSDK-web-csharp-client) client for .NET & .NET Core 
 *
 * The version of the OpenAPI document: 4.1.3
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Image in the response.
 */
@ApiModel(description = "Image in the response.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Image {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = null;

  public Image() { 
  }

  public Image id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Response image ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Response image ID.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Image contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * The original media type of the returned image.
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The original media type of the returned image.")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public Image createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The returned image creation date.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The returned image creation date.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Image updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The returned image update date.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The returned image update date.")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Image path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The returned image S3 path.
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The returned image S3 path.")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public Image url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The returned image URL.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The returned image URL.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public Image metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public Image putMetadataItem(String key, Object metadataItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.id, image.id) &&
        Objects.equals(this.contentType, image.contentType) &&
        Objects.equals(this.createdAt, image.createdAt) &&
        Objects.equals(this.updatedAt, image.updatedAt) &&
        Objects.equals(this.path, image.path) &&
        Objects.equals(this.url, image.url) &&
        Objects.equals(this.metadata, image.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contentType, createdAt, updatedAt, path, url, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

