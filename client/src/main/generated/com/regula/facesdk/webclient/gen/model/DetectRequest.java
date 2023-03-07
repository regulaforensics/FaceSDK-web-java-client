/*
 * Regula FaceSDK Web API
 * Regula FaceSDK Web API # Clients * [JavaScript](https://github.com/regulaforensics/FaceSDK-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/FaceSDK-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/FaceSDK-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/FaceSDK-web-csharp-client) client for .NET & .NET Core 
 *
 * The version of the OpenAPI document: 5.1.0
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
import com.regula.facesdk.webclient.gen.model.ProcessParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DetectRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DetectRequest {
  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_PROCESS_PARAM = "processParam";
  @SerializedName(SERIALIZED_NAME_PROCESS_PARAM)
  private ProcessParam processParam;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private byte[] image;

  public static final String SERIALIZED_NAME_THUMBNAILS = "thumbnails";
  @SerializedName(SERIALIZED_NAME_THUMBNAILS)
  private Boolean thumbnails = false;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Boolean attributes = false;

  public DetectRequest() { 
  }

  public DetectRequest tag(String tag) {
    
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


  public DetectRequest processParam(ProcessParam processParam) {
    
    this.processParam = processParam;
    return this;
  }

   /**
   * Get processParam
   * @return processParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessParam getProcessParam() {
    return processParam;
  }


  public void setProcessParam(ProcessParam processParam) {
    this.processParam = processParam;
  }


  public DetectRequest image(byte[] image) {
    
    this.image = image;
    return this;
  }

   /**
   * Base64 encoded image.
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 encoded image.")

  public byte[] getImage() {
    return image;
  }


  public void setImage(byte[] image) {
    this.image = image;
  }


  public DetectRequest thumbnails(Boolean thumbnails) {
    
    this.thumbnails = thumbnails;
    return this;
  }

   /**
   * Whether to return the cropped portrains with the detected faces.
   * @return thumbnails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to return the cropped portrains with the detected faces.")

  public Boolean getThumbnails() {
    return thumbnails;
  }


  public void setThumbnails(Boolean thumbnails) {
    this.thumbnails = thumbnails;
  }


  public DetectRequest attributes(Boolean attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Whether to evaluate attributes, such as age and emotions.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to evaluate attributes, such as age and emotions.")

  public Boolean getAttributes() {
    return attributes;
  }


  public void setAttributes(Boolean attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectRequest detectRequest = (DetectRequest) o;
    return Objects.equals(this.tag, detectRequest.tag) &&
        Objects.equals(this.processParam, detectRequest.processParam) &&
        Arrays.equals(this.image, detectRequest.image) &&
        Objects.equals(this.thumbnails, detectRequest.thumbnails) &&
        Objects.equals(this.attributes, detectRequest.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, processParam, Arrays.hashCode(image), thumbnails, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectRequest {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    processParam: ").append(toIndentedString(processParam)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

