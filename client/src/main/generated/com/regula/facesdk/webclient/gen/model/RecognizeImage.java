/*
 * Regula FaceSDK Web API
 * [Download OpenAPI specification](https://github.com/regulaforensics/FaceSDK-web-openapi) ### Clients * [JavaScript](https://github.com/regulaforensics/FaceSDK-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/FaceSDK-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/FaceSDK-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/FaceSDK-web-csharp-client) client for .NET & .NET Core 
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
import com.regula.facesdk.webclient.gen.model.Image;
import com.regula.facesdk.webclient.gen.model.RecognizeImageAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RecognizeImage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecognizeImage {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
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

  public static final String SERIALIZED_NAME_SIMILARITY = "similarity";
  @SerializedName(SERIALIZED_NAME_SIMILARITY)
  private Float similarity;

  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private Float distance;

  public RecognizeImage() { 
  }

  public RecognizeImage id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Response image ID. The list is sorted by decreasing ID value.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Response image ID. The list is sorted by decreasing ID value.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RecognizeImage contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Original media type of the returned image.
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Original media type of the returned image.")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public RecognizeImage createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Returned image creation date.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returned image creation date.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public RecognizeImage updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Returned image update date.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returned image update date.")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public RecognizeImage path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Returned image path.
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returned image path.")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public RecognizeImage url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Returned image URL.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returned image URL.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public RecognizeImage metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public RecognizeImage putMetadataItem(String key, Object metadataItem) {
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


  public RecognizeImage similarity(Float similarity) {
    
    this.similarity = similarity;
    return this;
  }

   /**
   * Similarity score.
   * @return similarity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Similarity score.")

  public Float getSimilarity() {
    return similarity;
  }


  public void setSimilarity(Float similarity) {
    this.similarity = similarity;
  }


  public RecognizeImage distance(Float distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * Similarity distance score: the lower the distance, the higher the face&#39;s similarity.
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Similarity distance score: the lower the distance, the higher the face's similarity.")

  public Float getDistance() {
    return distance;
  }


  public void setDistance(Float distance) {
    this.distance = distance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecognizeImage recognizeImage = (RecognizeImage) o;
    return Objects.equals(this.id, recognizeImage.id) &&
        Objects.equals(this.contentType, recognizeImage.contentType) &&
        Objects.equals(this.createdAt, recognizeImage.createdAt) &&
        Objects.equals(this.updatedAt, recognizeImage.updatedAt) &&
        Objects.equals(this.path, recognizeImage.path) &&
        Objects.equals(this.url, recognizeImage.url) &&
        Objects.equals(this.metadata, recognizeImage.metadata) &&
        Objects.equals(this.similarity, recognizeImage.similarity) &&
        Objects.equals(this.distance, recognizeImage.distance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contentType, createdAt, updatedAt, path, url, metadata, similarity, distance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecognizeImage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
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

