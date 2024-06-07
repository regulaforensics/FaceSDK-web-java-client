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
import com.regula.facesdk.webclient.gen.model.ImageSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * MatchImageResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MatchImageResult {
  public static final String SERIALIZED_NAME_FIRST_INDEX = "firstIndex";
  @SerializedName(SERIALIZED_NAME_FIRST_INDEX)
  private Integer firstIndex;

  public static final String SERIALIZED_NAME_FIRST_FACE_INDEX = "firstFaceIndex";
  @SerializedName(SERIALIZED_NAME_FIRST_FACE_INDEX)
  private BigDecimal firstFaceIndex;

  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private ImageSource first;

  public static final String SERIALIZED_NAME_SECOND_INDEX = "secondIndex";
  @SerializedName(SERIALIZED_NAME_SECOND_INDEX)
  private Integer secondIndex;

  public static final String SERIALIZED_NAME_SECOND_FACE_INDEX = "secondFaceIndex";
  @SerializedName(SERIALIZED_NAME_SECOND_FACE_INDEX)
  private BigDecimal secondFaceIndex;

  public static final String SERIALIZED_NAME_SECOND = "second";
  @SerializedName(SERIALIZED_NAME_SECOND)
  private ImageSource second;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private BigDecimal score;

  public static final String SERIALIZED_NAME_SIMILARITY = "similarity";
  @SerializedName(SERIALIZED_NAME_SIMILARITY)
  private BigDecimal similarity;

  public MatchImageResult() { 
  }

  public MatchImageResult firstIndex(Integer firstIndex) {
    
    this.firstIndex = firstIndex;
    return this;
  }

   /**
   * The image index number. Can be given; if not given, the index numbers are set automatically starting from &#x60;0&#x60;. All index numbers must be whole and unique—not repeated.
   * @return firstIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The image index number. Can be given; if not given, the index numbers are set automatically starting from `0`. All index numbers must be whole and unique—not repeated.")

  public Integer getFirstIndex() {
    return firstIndex;
  }


  public void setFirstIndex(Integer firstIndex) {
    this.firstIndex = firstIndex;
  }


  public MatchImageResult firstFaceIndex(BigDecimal firstFaceIndex) {
    
    this.firstFaceIndex = firstFaceIndex;
    return this;
  }

   /**
   * The detected face index number.
   * @return firstFaceIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The detected face index number.")

  public BigDecimal getFirstFaceIndex() {
    return firstFaceIndex;
  }


  public void setFirstFaceIndex(BigDecimal firstFaceIndex) {
    this.firstFaceIndex = firstFaceIndex;
  }


  public MatchImageResult first(ImageSource first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ImageSource getFirst() {
    return first;
  }


  public void setFirst(ImageSource first) {
    this.first = first;
  }


  public MatchImageResult secondIndex(Integer secondIndex) {
    
    this.secondIndex = secondIndex;
    return this;
  }

   /**
   * The image index number. Can be given; if not given, the index numbers are set automatically starting from &#x60;0&#x60;. All index numbers must be whole and unique—not repeated.
   * @return secondIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The image index number. Can be given; if not given, the index numbers are set automatically starting from `0`. All index numbers must be whole and unique—not repeated.")

  public Integer getSecondIndex() {
    return secondIndex;
  }


  public void setSecondIndex(Integer secondIndex) {
    this.secondIndex = secondIndex;
  }


  public MatchImageResult secondFaceIndex(BigDecimal secondFaceIndex) {
    
    this.secondFaceIndex = secondFaceIndex;
    return this;
  }

   /**
   * The detected face index number.
   * @return secondFaceIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The detected face index number.")

  public BigDecimal getSecondFaceIndex() {
    return secondFaceIndex;
  }


  public void setSecondFaceIndex(BigDecimal secondFaceIndex) {
    this.secondFaceIndex = secondFaceIndex;
  }


  public MatchImageResult second(ImageSource second) {
    
    this.second = second;
    return this;
  }

   /**
   * Get second
   * @return second
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ImageSource getSecond() {
    return second;
  }


  public void setSecond(ImageSource second) {
    this.second = second;
  }


  public MatchImageResult score(BigDecimal score) {
    
    this.score = score;
    return this;
  }

   /**
   * A dimensionless number that shows how similar the compared faces are. 0—absolutely identical faces.
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A dimensionless number that shows how similar the compared faces are. 0—absolutely identical faces.")

  public BigDecimal getScore() {
    return score;
  }


  public void setScore(BigDecimal score) {
    this.score = score;
  }


  public MatchImageResult similarity(BigDecimal similarity) {
    
    this.similarity = similarity;
    return this;
  }

   /**
   * The detected faces similarity, %. 100%—absolutely identical faces, 0%—absolutely not identical.
   * @return similarity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The detected faces similarity, %. 100%—absolutely identical faces, 0%—absolutely not identical.")

  public BigDecimal getSimilarity() {
    return similarity;
  }


  public void setSimilarity(BigDecimal similarity) {
    this.similarity = similarity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchImageResult matchImageResult = (MatchImageResult) o;
    return Objects.equals(this.firstIndex, matchImageResult.firstIndex) &&
        Objects.equals(this.firstFaceIndex, matchImageResult.firstFaceIndex) &&
        Objects.equals(this.first, matchImageResult.first) &&
        Objects.equals(this.secondIndex, matchImageResult.secondIndex) &&
        Objects.equals(this.secondFaceIndex, matchImageResult.secondFaceIndex) &&
        Objects.equals(this.second, matchImageResult.second) &&
        Objects.equals(this.score, matchImageResult.score) &&
        Objects.equals(this.similarity, matchImageResult.similarity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstIndex, firstFaceIndex, first, secondIndex, secondFaceIndex, second, score, similarity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchImageResult {\n");
    sb.append("    firstIndex: ").append(toIndentedString(firstIndex)).append("\n");
    sb.append("    firstFaceIndex: ").append(toIndentedString(firstFaceIndex)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    secondIndex: ").append(toIndentedString(secondIndex)).append("\n");
    sb.append("    secondFaceIndex: ").append(toIndentedString(secondFaceIndex)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
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

