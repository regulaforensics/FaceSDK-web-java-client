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
import com.regula.facesdk.webclient.gen.model.FaceQualityConfigName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The configuration that defines the list of returned quality check characteristics.
 */
@ApiModel(description = "The configuration that defines the list of returned quality check characteristics.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QualityConfig {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private FaceQualityConfigName name;

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private List<Float> range = null;

  public QualityConfig() { 
  }

  public QualityConfig name(FaceQualityConfigName name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FaceQualityConfigName getName() {
    return name;
  }


  public void setName(FaceQualityConfigName name) {
    this.name = name;
  }


  public QualityConfig range(List<Float> range) {
    
    this.range = range;
    return this;
  }

  public QualityConfig addRangeItem(Float rangeItem) {
    if (this.range == null) {
      this.range = new ArrayList<Float>();
    }
    this.range.add(rangeItem);
    return this;
  }

   /**
   * The range of applicable values for this characteristic. If the returned in the Response value fits this range, the value is identified as compliant with the requirements.
   * @return range
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"x\",\"y\"]", value = "The range of applicable values for this characteristic. If the returned in the Response value fits this range, the value is identified as compliant with the requirements.")

  public List<Float> getRange() {
    return range;
  }


  public void setRange(List<Float> range) {
    this.range = range;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualityConfig qualityConfig = (QualityConfig) o;
    return Objects.equals(this.name, qualityConfig.name) &&
        Objects.equals(this.range, qualityConfig.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityConfig {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

