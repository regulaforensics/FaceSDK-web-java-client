/*
 * Regula Face SDK Web API
 * <a href=\"https://regulaforensics.com/products/face-recognition-sdk/  \" target=\"_blank\">Regula Face SDK</a> is a cross-platform biometric verification solution for a digital identity verification process and image quality assurance. The SDK enables convenient and reliable face capture on the client side (mobile, web, and desktop) and further processing on the client or server side.   The Face SDK includes the following features:  * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-detection\" target=\"_blank\">Face detection and image quality assessment</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-comparison-11\" target=\"_blank\">Face match (1:1)</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-identification-1n\" target=\"_blank\">Face search (1:N)</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#liveness-assessment\" target=\"_blank\">Liveness detection</a>  Here is the <a href=\"https://github.com/regulaforensics/FaceSDK-web-openapi  \" target=\"_blank\">OpenAPI specification on GitHub</a>.   ### Clients * [JavaScript](https://github.com/regulaforensics/FaceSDK-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/FaceSDK-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/FaceSDK-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/FaceSDK-web-csharp-client) client for .NET & .NET Core 
 *
 * The version of the OpenAPI document: 6.2.0
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
import com.regula.facesdk.webclient.gen.model.AddImageToPersonRequestImage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Image in the request data, includes image and contentType.
 */
@ApiModel(description = "Image in the request data, includes image and contentType.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddImageToPersonRequest {
  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private AddImageToPersonRequestImage image;

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private Float threshold;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public AddImageToPersonRequest() { 
  }

  public AddImageToPersonRequest tag(String tag) {
    
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


  public AddImageToPersonRequest image(AddImageToPersonRequestImage image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AddImageToPersonRequestImage getImage() {
    return image;
  }


  public void setImage(AddImageToPersonRequestImage image) {
    this.image = image;
  }


  public AddImageToPersonRequest threshold(Float threshold) {
    
    this.threshold = threshold;
    return this;
  }

   /**
   * The similarity threshold.
   * @return threshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The similarity threshold.")

  public Float getThreshold() {
    return threshold;
  }


  public void setThreshold(Float threshold) {
    this.threshold = threshold;
  }


  public AddImageToPersonRequest limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The maximum number of results to be returned.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of results to be returned.")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddImageToPersonRequest addImageToPersonRequest = (AddImageToPersonRequest) o;
    return Objects.equals(this.tag, addImageToPersonRequest.tag) &&
        Objects.equals(this.image, addImageToPersonRequest.image) &&
        Objects.equals(this.threshold, addImageToPersonRequest.threshold) &&
        Objects.equals(this.limit, addImageToPersonRequest.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, image, threshold, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddImageToPersonRequest {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

