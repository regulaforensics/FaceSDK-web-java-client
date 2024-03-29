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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * DetectionAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DetectionAttributes {
  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<Map<String, Object>> details = null;

  public static final String SERIALIZED_NAME_ELAPSED_TIME = "elapsedTime";
  @SerializedName(SERIALIZED_NAME_ELAPSED_TIME)
  private BigDecimal elapsedTime;

  public DetectionAttributes() { 
  }

  public DetectionAttributes details(List<Map<String, Object>> details) {
    
    this.details = details;
    return this;
  }

  public DetectionAttributes addDetailsItem(Map<String, Object> detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<Map<String, Object>>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Map<String, Object>> getDetails() {
    return details;
  }


  public void setDetails(List<Map<String, Object>> details) {
    this.details = details;
  }


  public DetectionAttributes elapsedTime(BigDecimal elapsedTime) {
    
    this.elapsedTime = elapsedTime;
    return this;
  }

   /**
   * The elapsed time for attribute detection.
   * @return elapsedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The elapsed time for attribute detection.")

  public BigDecimal getElapsedTime() {
    return elapsedTime;
  }


  public void setElapsedTime(BigDecimal elapsedTime) {
    this.elapsedTime = elapsedTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectionAttributes detectionAttributes = (DetectionAttributes) o;
    return Objects.equals(this.details, detectionAttributes.details) &&
        Objects.equals(this.elapsedTime, detectionAttributes.elapsedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, elapsedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectionAttributes {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
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

