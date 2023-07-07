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
import com.regula.facesdk.webclient.gen.model.ImageSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MatchAndSearchRequestAllOfImages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MatchAndSearchRequestAllOfImages {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private byte[] content;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ImageSource type;

  public MatchAndSearchRequestAllOfImages() { 
  }

  public MatchAndSearchRequestAllOfImages content(byte[] content) {
    
    this.content = content;
    return this;
  }

   /**
   * Base64 encoded image.
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 encoded image.")

  public byte[] getContent() {
    return content;
  }


  public void setContent(byte[] content) {
    this.content = content;
  }


  public MatchAndSearchRequestAllOfImages type(ImageSource type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ImageSource getType() {
    return type;
  }


  public void setType(ImageSource type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchAndSearchRequestAllOfImages matchAndSearchRequestAllOfImages = (MatchAndSearchRequestAllOfImages) o;
    return Arrays.equals(this.content, matchAndSearchRequestAllOfImages.content) &&
        Objects.equals(this.type, matchAndSearchRequestAllOfImages.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(content), type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchAndSearchRequestAllOfImages {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

