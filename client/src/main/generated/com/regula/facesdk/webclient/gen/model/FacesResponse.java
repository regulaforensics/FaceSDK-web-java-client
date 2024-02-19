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
import com.regula.facesdk.webclient.gen.model.DetectionFace;
import com.regula.facesdk.webclient.gen.model.FacesResponseAllOf;
import com.regula.facesdk.webclient.gen.model.PersonWithImages;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * FacesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FacesResponse {
  public static final String SERIALIZED_NAME_FACE_INDEX = "faceIndex";
  @SerializedName(SERIALIZED_NAME_FACE_INDEX)
  private BigDecimal faceIndex;

  public static final String SERIALIZED_NAME_LANDMARKS = "landmarks";
  @SerializedName(SERIALIZED_NAME_LANDMARKS)
  private List<List<BigDecimal>> landmarks = null;

  public static final String SERIALIZED_NAME_ROTATION_ANGLE = "rotationAngle";
  @SerializedName(SERIALIZED_NAME_ROTATION_ANGLE)
  private Float rotationAngle;

  public static final String SERIALIZED_NAME_ROI = "roi";
  @SerializedName(SERIALIZED_NAME_ROI)
  private List<BigDecimal> roi = null;

  public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL)
  private byte[] thumbnail;

  public static final String SERIALIZED_NAME_CROP = "crop";
  @SerializedName(SERIALIZED_NAME_CROP)
  private byte[] crop;

  public static final String SERIALIZED_NAME_PERSONS = "persons";
  @SerializedName(SERIALIZED_NAME_PERSONS)
  private List<PersonWithImages> persons = null;

  public FacesResponse() { 
  }

  public FacesResponse faceIndex(BigDecimal faceIndex) {
    
    this.faceIndex = faceIndex;
    return this;
  }

   /**
   * The detected face index number.
   * @return faceIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The detected face index number.")

  public BigDecimal getFaceIndex() {
    return faceIndex;
  }


  public void setFaceIndex(BigDecimal faceIndex) {
    this.faceIndex = faceIndex;
  }


  public FacesResponse landmarks(List<List<BigDecimal>> landmarks) {
    
    this.landmarks = landmarks;
    return this;
  }

  public FacesResponse addLandmarksItem(List<BigDecimal> landmarksItem) {
    if (this.landmarks == null) {
      this.landmarks = new ArrayList<List<BigDecimal>>();
    }
    this.landmarks.add(landmarksItem);
    return this;
  }

   /**
   * Absolute coordinates (x,y) of five points of each detected face: left eye, right eye, nose, left point of lips, right point of lips.
   * @return landmarks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[[\"x\",\"y\"]]", value = "Absolute coordinates (x,y) of five points of each detected face: left eye, right eye, nose, left point of lips, right point of lips.")

  public List<List<BigDecimal>> getLandmarks() {
    return landmarks;
  }


  public void setLandmarks(List<List<BigDecimal>> landmarks) {
    this.landmarks = landmarks;
  }


  public FacesResponse rotationAngle(Float rotationAngle) {
    
    this.rotationAngle = rotationAngle;
    return this;
  }

   /**
   * Get rotationAngle
   * @return rotationAngle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.1272900104522705", value = "")

  public Float getRotationAngle() {
    return rotationAngle;
  }


  public void setRotationAngle(Float rotationAngle) {
    this.rotationAngle = rotationAngle;
  }


  public FacesResponse roi(List<BigDecimal> roi) {
    
    this.roi = roi;
    return this;
  }

  public FacesResponse addRoiItem(BigDecimal roiItem) {
    if (this.roi == null) {
      this.roi = new ArrayList<BigDecimal>();
    }
    this.roi.add(roiItem);
    return this;
  }

   /**
   * The rectangular area of a detected face that is represented by a set of four elements: the X and Y coordinates of the top-left point, and the width and height dimensions of the rectangle.
   * @return roi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"x\",\"y\",\"width\",\"height\"]", value = "The rectangular area of a detected face that is represented by a set of four elements: the X and Y coordinates of the top-left point, and the width and height dimensions of the rectangle.")

  public List<BigDecimal> getRoi() {
    return roi;
  }


  public void setRoi(List<BigDecimal> roi) {
    this.roi = roi;
  }


  public FacesResponse thumbnail(byte[] thumbnail) {
    
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Base64 of the cropped portrait.
   * @return thumbnail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 of the cropped portrait.")

  public byte[] getThumbnail() {
    return thumbnail;
  }


  public void setThumbnail(byte[] thumbnail) {
    this.thumbnail = thumbnail;
  }


  public FacesResponse crop(byte[] crop) {
    
    this.crop = crop;
    return this;
  }

   /**
   * Base64 of the cropped portrait.
   * @return crop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 of the cropped portrait.")

  public byte[] getCrop() {
    return crop;
  }


  public void setCrop(byte[] crop) {
    this.crop = crop;
  }


  public FacesResponse persons(List<PersonWithImages> persons) {
    
    this.persons = persons;
    return this;
  }

  public FacesResponse addPersonsItem(PersonWithImages personsItem) {
    if (this.persons == null) {
      this.persons = new ArrayList<PersonWithImages>();
    }
    this.persons.add(personsItem);
    return this;
  }

   /**
   * Get persons
   * @return persons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PersonWithImages> getPersons() {
    return persons;
  }


  public void setPersons(List<PersonWithImages> persons) {
    this.persons = persons;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacesResponse facesResponse = (FacesResponse) o;
    return Objects.equals(this.faceIndex, facesResponse.faceIndex) &&
        Objects.equals(this.landmarks, facesResponse.landmarks) &&
        Objects.equals(this.rotationAngle, facesResponse.rotationAngle) &&
        Objects.equals(this.roi, facesResponse.roi) &&
        Arrays.equals(this.thumbnail, facesResponse.thumbnail) &&
        Arrays.equals(this.crop, facesResponse.crop) &&
        Objects.equals(this.persons, facesResponse.persons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faceIndex, landmarks, rotationAngle, roi, Arrays.hashCode(thumbnail), Arrays.hashCode(crop), persons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacesResponse {\n");
    sb.append("    faceIndex: ").append(toIndentedString(faceIndex)).append("\n");
    sb.append("    landmarks: ").append(toIndentedString(landmarks)).append("\n");
    sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
    sb.append("    roi: ").append(toIndentedString(roi)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    crop: ").append(toIndentedString(crop)).append("\n");
    sb.append("    persons: ").append(toIndentedString(persons)).append("\n");
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

