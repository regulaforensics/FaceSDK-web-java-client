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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SearchResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchResult {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_PERSONS = "persons";
  @SerializedName(SERIALIZED_NAME_PERSONS)
  private List<SearchPerson> persons = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<UUID> groups = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = null;

  public SearchResult() { 
  }

  public SearchResult code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * Result code. It is returned only with response 200.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Result code. It is returned only with response 200.")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public SearchResult persons(List<SearchPerson> persons) {
    
    this.persons = persons;
    return this;
  }

  public SearchResult addPersonsItem(SearchPerson personsItem) {
    if (this.persons == null) {
      this.persons = new ArrayList<SearchPerson>();
    }
    this.persons.add(personsItem);
    return this;
  }

   /**
   * Array of Person images. It is returned only with response 200.
   * @return persons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of Person images. It is returned only with response 200.")

  public List<SearchPerson> getPersons() {
    return persons;
  }


  public void setPersons(List<SearchPerson> persons) {
    this.persons = persons;
  }


  public SearchResult id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Person ID. The list of persons is sorted by decreasing ID value.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Person ID. The list of persons is sorted by decreasing ID value.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public SearchResult createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Person creation date.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Person creation date.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public SearchResult updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Person update date.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Person update date.")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public SearchResult groups(List<UUID> groups) {
    
    this.groups = groups;
    return this;
  }

  public SearchResult addGroupsItem(UUID groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<UUID>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * List of groups this person belongs to.
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of groups this person belongs to.")

  public List<UUID> getGroups() {
    return groups;
  }


  public void setGroups(List<UUID> groups) {
    this.groups = groups;
  }


  public SearchResult name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Person name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Person name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SearchResult metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public SearchResult putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, Object>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * A free-form object containing person&#39;s extended attributes. Available when a person is being created
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A free-form object containing person's extended attributes. Available when a person is being created")

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
    SearchResult searchResult = (SearchResult) o;
    return Objects.equals(this.code, searchResult.code) &&
        Objects.equals(this.persons, searchResult.persons) &&
        Objects.equals(this.id, searchResult.id) &&
        Objects.equals(this.createdAt, searchResult.createdAt) &&
        Objects.equals(this.updatedAt, searchResult.updatedAt) &&
        Objects.equals(this.groups, searchResult.groups) &&
        Objects.equals(this.name, searchResult.name) &&
        Objects.equals(this.metadata, searchResult.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, persons, id, createdAt, updatedAt, groups, name, metadata);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResult {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    persons: ").append(toIndentedString(persons)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

