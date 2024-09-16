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
import com.regula.facesdk.webclient.gen.model.FaceQualityScenarios;
import com.regula.facesdk.webclient.gen.model.OutputImageParams;
import com.regula.facesdk.webclient.gen.model.ProcessParamAttributes;
import com.regula.facesdk.webclient.gen.model.QualityRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The processing parameters.
 */
@ApiModel(description = "The processing parameters.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProcessParam {
  public static final String SERIALIZED_NAME_SCENARIO = "scenario";
  @SerializedName(SERIALIZED_NAME_SCENARIO)
  private FaceQualityScenarios scenario;

  public static final String SERIALIZED_NAME_ONLY_CENTRAL_FACE = "onlyCentralFace";
  @SerializedName(SERIALIZED_NAME_ONLY_CENTRAL_FACE)
  private Boolean onlyCentralFace;

  public static final String SERIALIZED_NAME_OUTPUT_IMAGE_PARAMS = "outputImageParams";
  @SerializedName(SERIALIZED_NAME_OUTPUT_IMAGE_PARAMS)
  private OutputImageParams outputImageParams;

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private QualityRequest quality;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private ProcessParamAttributes attributes;

  public ProcessParam() { 
  }

  public ProcessParam scenario(FaceQualityScenarios scenario) {
    
    this.scenario = scenario;
    return this;
  }

   /**
   * Get scenario
   * @return scenario
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FaceQualityScenarios getScenario() {
    return scenario;
  }


  public void setScenario(FaceQualityScenarios scenario) {
    this.scenario = scenario;
  }


  public ProcessParam onlyCentralFace(Boolean onlyCentralFace) {
    
    this.onlyCentralFace = onlyCentralFace;
    return this;
  }

   /**
   * Whether to process only the central face in the image. If set to &#x60;false&#x60;, all the faces are processed.
   * @return onlyCentralFace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether to process only the central face in the image. If set to `false`, all the faces are processed.")

  public Boolean getOnlyCentralFace() {
    return onlyCentralFace;
  }


  public void setOnlyCentralFace(Boolean onlyCentralFace) {
    this.onlyCentralFace = onlyCentralFace;
  }


  public ProcessParam outputImageParams(OutputImageParams outputImageParams) {
    
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


  public ProcessParam quality(QualityRequest quality) {
    
    this.quality = quality;
    return this;
  }

   /**
   * Get quality
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QualityRequest getQuality() {
    return quality;
  }


  public void setQuality(QualityRequest quality) {
    this.quality = quality;
  }


  public ProcessParam attributes(ProcessParamAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessParamAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(ProcessParamAttributes attributes) {
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
    ProcessParam processParam = (ProcessParam) o;
    return Objects.equals(this.scenario, processParam.scenario) &&
        Objects.equals(this.onlyCentralFace, processParam.onlyCentralFace) &&
        Objects.equals(this.outputImageParams, processParam.outputImageParams) &&
        Objects.equals(this.quality, processParam.quality) &&
        Objects.equals(this.attributes, processParam.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenario, onlyCentralFace, outputImageParams, quality, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessParam {\n");
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
    sb.append("    onlyCentralFace: ").append(toIndentedString(onlyCentralFace)).append("\n");
    sb.append("    outputImageParams: ").append(toIndentedString(outputImageParams)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
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

