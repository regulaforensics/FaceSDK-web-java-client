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
import com.regula.facesdk.webclient.gen.model.DetectionAttributes;
import com.regula.facesdk.webclient.gen.model.DetectionQuality;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Detection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Detection {
  public static final String SERIALIZED_NAME_CROP = "crop";
  @SerializedName(SERIALIZED_NAME_CROP)
  private byte[] crop;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private DetectionAttributes attributes;

  public static final String SERIALIZED_NAME_LANDMARKS = "landmarks";
  @SerializedName(SERIALIZED_NAME_LANDMARKS)
  private List<List<Integer>> landmarks = new ArrayList<List<Integer>>();

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private DetectionQuality quality;

  public static final String SERIALIZED_NAME_ROI = "roi";
  @SerializedName(SERIALIZED_NAME_ROI)
  private List<BigDecimal> roi = new ArrayList<BigDecimal>();

  public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL)
  private byte[] thumbnail;

  public Detection() { 
  }

  public Detection crop(byte[] crop) {
    
    this.crop = crop;
    return this;
  }

   /**
   * Base64 encoded image.
   * @return crop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 encoded image.")

  public byte[] getCrop() {
    return crop;
  }


  public void setCrop(byte[] crop) {
    this.crop = crop;
  }


  public Detection attributes(DetectionAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DetectionAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(DetectionAttributes attributes) {
    this.attributes = attributes;
  }


  public Detection landmarks(List<List<Integer>> landmarks) {
    
    this.landmarks = landmarks;
    return this;
  }

  public Detection addLandmarksItem(List<Integer> landmarksItem) {
    this.landmarks.add(landmarksItem);
    return this;
  }

   /**
   * Absolute coordinates (x,y) of five points of each detected face: left eye, right eye, nose, left point of lips, right point of lips.
   * @return landmarks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[[\"x\",\"y\"]]", required = true, value = "Absolute coordinates (x,y) of five points of each detected face: left eye, right eye, nose, left point of lips, right point of lips.")

  public List<List<Integer>> getLandmarks() {
    return landmarks;
  }


  public void setLandmarks(List<List<Integer>> landmarks) {
    this.landmarks = landmarks;
  }


  public Detection quality(DetectionQuality quality) {
    
    this.quality = quality;
    return this;
  }

   /**
   * Get quality
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DetectionQuality getQuality() {
    return quality;
  }


  public void setQuality(DetectionQuality quality) {
    this.quality = quality;
  }


  public Detection roi(List<BigDecimal> roi) {
    
    this.roi = roi;
    return this;
  }

  public Detection addRoiItem(BigDecimal roiItem) {
    this.roi.add(roiItem);
    return this;
  }

   /**
   * The rectangular area of a detected face that is represented by a set of four elements: the X and Y coordinates of the top-left point, and the width and height dimensions of the rectangle.
   * @return roi
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"x\",\"y\",\"width\",\"height\"]", required = true, value = "The rectangular area of a detected face that is represented by a set of four elements: the X and Y coordinates of the top-left point, and the width and height dimensions of the rectangle.")

  public List<BigDecimal> getRoi() {
    return roi;
  }


  public void setRoi(List<BigDecimal> roi) {
    this.roi = roi;
  }


  public Detection thumbnail(byte[] thumbnail) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Detection detection = (Detection) o;
    return Arrays.equals(this.crop, detection.crop) &&
        Objects.equals(this.attributes, detection.attributes) &&
        Objects.equals(this.landmarks, detection.landmarks) &&
        Objects.equals(this.quality, detection.quality) &&
        Objects.equals(this.roi, detection.roi) &&
        Arrays.equals(this.thumbnail, detection.thumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(crop), attributes, landmarks, quality, roi, Arrays.hashCode(thumbnail));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Detection {\n");
    sb.append("    crop: ").append(toIndentedString(crop)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    landmarks: ").append(toIndentedString(landmarks)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    roi: ").append(toIndentedString(roi)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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

