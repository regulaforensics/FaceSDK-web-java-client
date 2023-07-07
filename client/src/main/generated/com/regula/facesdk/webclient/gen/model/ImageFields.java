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
import com.regula.facesdk.webclient.gen.model.ImageFieldsImage;
import com.regula.facesdk.webclient.gen.model.OutputImageParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Image in the request data, includes image and contentType.
 */
@ApiModel(description = "Image in the request data, includes image and contentType.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ImageFields {
  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private ImageFieldsImage image;

  public static final String SERIALIZED_NAME_OUTPUT_IMAGE_PARAMS = "outputImageParams";
  @SerializedName(SERIALIZED_NAME_OUTPUT_IMAGE_PARAMS)
  private OutputImageParams outputImageParams;

  public static final String SERIALIZED_NAME_DETECT_ALL = "detectAll";
  @SerializedName(SERIALIZED_NAME_DETECT_ALL)
  private Boolean detectAll = false;

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private Float threshold = null;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public ImageFields() { 
  }

  public ImageFields tag(String tag) {
    
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


  public ImageFields image(ImageFieldsImage image) {
    
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


  public ImageFields outputImageParams(OutputImageParams outputImageParams) {
    
    this.outputImageParams = outputImageParams;
    return this;
  }

   /**
   * Get outputImageParams
   * @return outputImageParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OutputImageParams getOutputImageParams() {
    return outputImageParams;
  }


  public void setOutputImageParams(OutputImageParams outputImageParams) {
    this.outputImageParams = outputImageParams;
  }


  public ImageFields detectAll(Boolean detectAll) {
    
    this.detectAll = detectAll;
    return this;
  }

   /**
   * Whether to detect all faces in the image. If set to false, only the most central face is detected.
   * @return detectAll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to detect all faces in the image. If set to false, only the most central face is detected.")

  public Boolean getDetectAll() {
    return detectAll;
  }


  public void setDetectAll(Boolean detectAll) {
    this.detectAll = detectAll;
  }


  public ImageFields threshold(Float threshold) {
    
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


  public ImageFields limit(Integer limit) {
    
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
    ImageFields imageFields = (ImageFields) o;
    return Objects.equals(this.tag, imageFields.tag) &&
        Objects.equals(this.image, imageFields.image) &&
        Objects.equals(this.outputImageParams, imageFields.outputImageParams) &&
        Objects.equals(this.detectAll, imageFields.detectAll) &&
        Objects.equals(this.threshold, imageFields.threshold) &&
        Objects.equals(this.limit, imageFields.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, image, outputImageParams, detectAll, threshold, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageFields {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    outputImageParams: ").append(toIndentedString(outputImageParams)).append("\n");
    sb.append("    detectAll: ").append(toIndentedString(detectAll)).append("\n");
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

