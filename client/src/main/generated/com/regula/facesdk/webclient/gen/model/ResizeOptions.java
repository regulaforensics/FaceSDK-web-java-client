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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Set to resize the original image.
 */
@ApiModel(description = "Set to resize the original image.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ResizeOptions {
  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private Integer quality = 100;

  public ResizeOptions() { 
  }

  public ResizeOptions width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Resized image width, px.
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resized image width, px.")

  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    this.width = width;
  }


  public ResizeOptions height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Resized image height, px.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resized image height, px.")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public ResizeOptions quality(Integer quality) {
    
    this.quality = quality;
    return this;
  }

   /**
   * Resized image quality, percent.
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resized image quality, percent.")

  public Integer getQuality() {
    return quality;
  }


  public void setQuality(Integer quality) {
    this.quality = quality;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResizeOptions resizeOptions = (ResizeOptions) o;
    return Objects.equals(this.width, resizeOptions.width) &&
        Objects.equals(this.height, resizeOptions.height) &&
        Objects.equals(this.quality, resizeOptions.quality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, quality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResizeOptions {\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
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

