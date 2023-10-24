/*
 * Regula FaceSDK Web api
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RecognizeImageAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecognizeImageAllOf {
  public static final String SERIALIZED_NAME_SIMILARITY = "similarity";
  @SerializedName(SERIALIZED_NAME_SIMILARITY)
  private Float similarity;

  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private Float distance;

  public RecognizeImageAllOf() { 
  }

  public RecognizeImageAllOf similarity(Float similarity) {
    
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


  public RecognizeImageAllOf distance(Float distance) {
    
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
    RecognizeImageAllOf recognizeImageAllOf = (RecognizeImageAllOf) o;
    return Objects.equals(this.similarity, recognizeImageAllOf.similarity) &&
        Objects.equals(this.distance, recognizeImageAllOf.distance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(similarity, distance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecognizeImageAllOf {\n");
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

