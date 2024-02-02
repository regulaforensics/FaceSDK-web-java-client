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
import com.regula.facesdk.webclient.gen.model.SearchPerson;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PersonCreatedResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PersonCreatedResponse {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_PERSONS = "persons";
  @SerializedName(SERIALIZED_NAME_PERSONS)
  private List<SearchPerson> persons = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = null;

  public PersonCreatedResponse() { 
  }

  public PersonCreatedResponse code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * Result code.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Result code.")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public PersonCreatedResponse persons(List<SearchPerson> persons) {
    
    this.persons = persons;
    return this;
  }

  public PersonCreatedResponse addPersonsItem(SearchPerson personsItem) {
    if (this.persons == null) {
      this.persons = new ArrayList<SearchPerson>();
    }
    this.persons.add(personsItem);
    return this;
  }

   /**
   * Array of Person images.
   * @return persons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of Person images.")

  public List<SearchPerson> getPersons() {
    return persons;
  }


  public void setPersons(List<SearchPerson> persons) {
    this.persons = persons;
  }


  public PersonCreatedResponse metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public PersonCreatedResponse putMetadataItem(String key, Object metadataItem) {
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
    PersonCreatedResponse personCreatedResponse = (PersonCreatedResponse) o;
    return Objects.equals(this.code, personCreatedResponse.code) &&
        Objects.equals(this.persons, personCreatedResponse.persons) &&
        Objects.equals(this.metadata, personCreatedResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, persons, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonCreatedResponse {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    persons: ").append(toIndentedString(persons)).append("\n");
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

