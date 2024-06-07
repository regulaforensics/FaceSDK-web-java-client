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
import com.regula.facesdk.webclient.gen.model.MatchImage;
import com.regula.facesdk.webclient.gen.model.MatchRequestOutputImageParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * MatchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MatchRequest {
  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_THUMBNAILS = "thumbnails";
  @SerializedName(SERIALIZED_NAME_THUMBNAILS)
  private Object thumbnails = null;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<MatchImage> images = new ArrayList<MatchImage>();

  public static final String SERIALIZED_NAME_OUTPUT_IMAGE_PARAMS = "outputImageParams";
  @SerializedName(SERIALIZED_NAME_OUTPUT_IMAGE_PARAMS)
  private MatchRequestOutputImageParams outputImageParams;

  public MatchRequest() { 
  }

  public MatchRequest tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Session identificator, should be unique for each session.
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Session identificator, should be unique for each session.")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public MatchRequest thumbnails(Object thumbnails) {
    
    this.thumbnails = thumbnails;
    return this;
  }

   /**
   * Use &#x60;outputImageParams.crop&#x60; instead.
   * @return thumbnails
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use `outputImageParams.crop` instead.")

  public Object getThumbnails() {
    return thumbnails;
  }


  public void setThumbnails(Object thumbnails) {
    this.thumbnails = thumbnails;
  }


  public MatchRequest images(List<MatchImage> images) {
    
    this.images = images;
    return this;
  }

  public MatchRequest addImagesItem(MatchImage imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

   /**
   * All images included in the comparison.
   * @return images
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "All images included in the comparison.")

  public List<MatchImage> getImages() {
    return images;
  }


  public void setImages(List<MatchImage> images) {
    this.images = images;
  }


  public MatchRequest outputImageParams(MatchRequestOutputImageParams outputImageParams) {
    
    this.outputImageParams = outputImageParams;
    return this;
  }

   /**
   * Get outputImageParams
   * @return outputImageParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MatchRequestOutputImageParams getOutputImageParams() {
    return outputImageParams;
  }


  public void setOutputImageParams(MatchRequestOutputImageParams outputImageParams) {
    this.outputImageParams = outputImageParams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchRequest matchRequest = (MatchRequest) o;
    return Objects.equals(this.tag, matchRequest.tag) &&
        Objects.equals(this.thumbnails, matchRequest.thumbnails) &&
        Objects.equals(this.images, matchRequest.images) &&
        Objects.equals(this.outputImageParams, matchRequest.outputImageParams);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, thumbnails, images, outputImageParams);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchRequest {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    outputImageParams: ").append(toIndentedString(outputImageParams)).append("\n");
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

