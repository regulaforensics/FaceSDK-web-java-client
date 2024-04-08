/*
 * Regula Face SDK Web API
 * <a href=\"https://regulaforensics.com/products/face-recognition-sdk/  \" target=\"_blank\">Regula Face SDK</a> is a cross-platform biometric verification solution for a digital identity verification process. The SDK enables convenient and reliable face capture on the client side (mobile, web, and desktop) and further processing on the client or server side.  The Face SDK includes the following features:  * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-detection\" target=\"_blank\">Face Detection</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-comparison-11\" target=\"_blank\">Face Match (1:1)</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-identification-1n\" target=\"_blank\">Face Search (1:N)</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#liveness-assessment\" target=\"_blank\">Liveness Assessment</a>  Here is the <a href=\"https://github.com/regulaforensics/FaceSDK-web-openapi  \" target=\"_blank\">OpenAPI specification on GitHub</a>.   ### Clients * [JavaScript](https://github.com/regulaforensics/FaceSDK-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/FaceSDK-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/FaceSDK-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/FaceSDK-web-csharp-client) client for .NET & .NET Core 
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TransactionInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionInfo {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_VIDEO = "video";
  @SerializedName(SERIALIZED_NAME_VIDEO)
  private String video;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<Map<String, Object>> age = null;

  public static final String SERIALIZED_NAME_PORTRAIT = "portrait";
  @SerializedName(SERIALIZED_NAME_PORTRAIT)
  private String portrait;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = null;

  public TransactionInfo() { 
  }

  public TransactionInfo code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * Result code, one of the FaceSDKResultCode enum values. See the enum: https://docs.regulaforensics.com/develop/face-sdk/web-service/development/enums/face-sdk-result-code/
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Result code, one of the FaceSDKResultCode enum values. See the enum: https://docs.regulaforensics.com/develop/face-sdk/web-service/development/enums/face-sdk-result-code/")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public TransactionInfo status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Whether the liveness detection is confirmed (0) or not (1).
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the liveness detection is confirmed (0) or not (1).")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public TransactionInfo tag(String tag) {
    
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


  public TransactionInfo transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Transaction ID, there can be several transactions within one session.
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction ID, there can be several transactions within one session.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public TransactionInfo video(String video) {
    
    this.video = video;
    return this;
  }

   /**
   * Link to the session video, depends on the selected storage type. [Learn more](https://docs.regulaforensics.com/develop/face-sdk/web-service/administration/storage/)
   * @return video
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link to the session video, depends on the selected storage type. [Learn more](https://docs.regulaforensics.com/develop/face-sdk/web-service/administration/storage/)")

  public String getVideo() {
    return video;
  }


  public void setVideo(String video) {
    this.video = video;
  }


  public TransactionInfo age(List<Map<String, Object>> age) {
    
    this.age = age;
    return this;
  }

  public TransactionInfo addAgeItem(Map<String, Object> ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<Map<String, Object>>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * Approximate age with an accuracy of +/-3 years.
   * @return age
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Approximate age with an accuracy of +/-3 years.")

  public List<Map<String, Object>> getAge() {
    return age;
  }


  public void setAge(List<Map<String, Object>> age) {
    this.age = age;
  }


  public TransactionInfo portrait(String portrait) {
    
    this.portrait = portrait;
    return this;
  }

   /**
   * Link to the portrait, depends on the selected storage type. [Learn more](https://docs.regulaforensics.com/develop/face-sdk/web-service/administration/storage/)
   * @return portrait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link to the portrait, depends on the selected storage type. [Learn more](https://docs.regulaforensics.com/develop/face-sdk/web-service/administration/storage/)")

  public String getPortrait() {
    return portrait;
  }


  public void setPortrait(String portrait) {
    this.portrait = portrait;
  }


  public TransactionInfo metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public TransactionInfo putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, Object>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * A free-form object containing person&#39;s extended attributes.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A free-form object containing person's extended attributes.")

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInfo transactionInfo = (TransactionInfo) o;
    return Objects.equals(this.code, transactionInfo.code) &&
        Objects.equals(this.status, transactionInfo.status) &&
        Objects.equals(this.tag, transactionInfo.tag) &&
        Objects.equals(this.transactionId, transactionInfo.transactionId) &&
        Objects.equals(this.video, transactionInfo.video) &&
        Objects.equals(this.age, transactionInfo.age) &&
        Objects.equals(this.portrait, transactionInfo.portrait) &&
        Objects.equals(this.metadata, transactionInfo.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, status, tag, transactionId, video, age, portrait, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInfo {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    portrait: ").append(toIndentedString(portrait)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

