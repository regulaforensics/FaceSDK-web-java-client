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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * If a person is not found, a new person entry is created using the descriptor calculated while searching.
 */
@ApiModel(description = "If a person is not found, a new person entry is created using the descriptor calculated while searching.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchParametersCreatePerson {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = null;

  public SearchParametersCreatePerson() { 
  }

  public SearchParametersCreatePerson name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Person&#39;s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Person's name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SearchParametersCreatePerson metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public SearchParametersCreatePerson putMetadataItem(String key, Object metadataItem) {
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
    SearchParametersCreatePerson searchParametersCreatePerson = (SearchParametersCreatePerson) o;
    return Objects.equals(this.name, searchParametersCreatePerson.name) &&
        Objects.equals(this.metadata, searchParametersCreatePerson.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchParametersCreatePerson {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

