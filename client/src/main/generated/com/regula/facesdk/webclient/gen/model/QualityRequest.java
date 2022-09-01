/*
 * Regula FaceSDK Web API
 * Regula FaceSDK Web API
 *
 * The version of the OpenAPI document: 3.2.0
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
import com.regula.facesdk.webclient.gen.model.QualityConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Whether to perform the portrait quality check.
 */
@ApiModel(description = "Whether to perform the portrait quality check.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QualityRequest {
  public static final String SERIALIZED_NAME_BACKGROUND_MATCH_COLOR = "backgroundMatchColor";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_MATCH_COLOR)
  private List<Integer> backgroundMatchColor = null;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private List<QualityConfig> config = null;

  public QualityRequest() { 
  }

  public QualityRequest backgroundMatchColor(List<Integer> backgroundMatchColor) {
    
    this.backgroundMatchColor = backgroundMatchColor;
    return this;
  }

  public QualityRequest addBackgroundMatchColorItem(Integer backgroundMatchColorItem) {
    if (this.backgroundMatchColor == null) {
      this.backgroundMatchColor = new ArrayList<Integer>();
    }
    this.backgroundMatchColor.add(backgroundMatchColorItem);
    return this;
  }

   /**
   * Get backgroundMatchColor
   * @return backgroundMatchColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[128,128,128]", value = "")

  public List<Integer> getBackgroundMatchColor() {
    return backgroundMatchColor;
  }


  public void setBackgroundMatchColor(List<Integer> backgroundMatchColor) {
    this.backgroundMatchColor = backgroundMatchColor;
  }


  public QualityRequest config(List<QualityConfig> config) {
    
    this.config = config;
    return this;
  }

  public QualityRequest addConfigItem(QualityConfig configItem) {
    if (this.config == null) {
      this.config = new ArrayList<QualityConfig>();
    }
    this.config.add(configItem);
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<QualityConfig> getConfig() {
    return config;
  }


  public void setConfig(List<QualityConfig> config) {
    this.config = config;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualityRequest qualityRequest = (QualityRequest) o;
    return Objects.equals(this.backgroundMatchColor, qualityRequest.backgroundMatchColor) &&
        Objects.equals(this.config, qualityRequest.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundMatchColor, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityRequest {\n");
    sb.append("    backgroundMatchColor: ").append(toIndentedString(backgroundMatchColor)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

