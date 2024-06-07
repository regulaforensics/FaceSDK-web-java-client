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
import com.regula.facesdk.webclient.gen.model.FaceImageQualityGroups;
import com.regula.facesdk.webclient.gen.model.FaceImageQualityGroupsStrings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QualityDetailsGroups
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QualityDetailsGroups {
  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private FaceImageQualityGroups groupId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private FaceImageQualityGroupsStrings name;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_COMPLIANT_COUNT = "compliantCount";
  @SerializedName(SERIALIZED_NAME_COMPLIANT_COUNT)
  private Integer compliantCount;

  public QualityDetailsGroups() { 
  }

  public QualityDetailsGroups groupId(FaceImageQualityGroups groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FaceImageQualityGroups getGroupId() {
    return groupId;
  }


  public void setGroupId(FaceImageQualityGroups groupId) {
    this.groupId = groupId;
  }


  public QualityDetailsGroups name(FaceImageQualityGroupsStrings name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FaceImageQualityGroupsStrings getName() {
    return name;
  }


  public void setName(FaceImageQualityGroupsStrings name) {
    this.name = name;
  }


  public QualityDetailsGroups totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of characteristics in the group.
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "The total number of characteristics in the group.")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public QualityDetailsGroups compliantCount(Integer compliantCount) {
    
    this.compliantCount = compliantCount;
    return this;
  }

   /**
   * The number of compliant characteristics in the group.
   * @return compliantCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "The number of compliant characteristics in the group.")

  public Integer getCompliantCount() {
    return compliantCount;
  }


  public void setCompliantCount(Integer compliantCount) {
    this.compliantCount = compliantCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualityDetailsGroups qualityDetailsGroups = (QualityDetailsGroups) o;
    return Objects.equals(this.groupId, qualityDetailsGroups.groupId) &&
        Objects.equals(this.name, qualityDetailsGroups.name) &&
        Objects.equals(this.totalCount, qualityDetailsGroups.totalCount) &&
        Objects.equals(this.compliantCount, qualityDetailsGroups.compliantCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, name, totalCount, compliantCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityDetailsGroups {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    compliantCount: ").append(toIndentedString(compliantCount)).append("\n");
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

