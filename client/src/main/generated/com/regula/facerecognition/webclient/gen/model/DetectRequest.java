/*
 * Regula Face Recognition Web API
 * Regula Face Recognition Web API
 *
 * The version of the OpenAPI document: 0.1.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.facerecognition.webclient.gen.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;

/** DetectRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DetectRequest {
  public static final String SERIALIZED_NAME_IMAGE = "image";

  @SerializedName(SERIALIZED_NAME_IMAGE)
  private byte[] image;

  public static final String SERIALIZED_NAME_THUMBNAILS = "thumbnails";

  @SerializedName(SERIALIZED_NAME_THUMBNAILS)
  private Boolean thumbnails = false;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";

  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Boolean attributes = false;

  public static final String SERIALIZED_NAME_ONLY_CENTRAL_FACE = "onlyCentralFace";

  @SerializedName(SERIALIZED_NAME_ONLY_CENTRAL_FACE)
  private Boolean onlyCentralFace = false;

  public DetectRequest image(byte[] image) {

    this.image = image;
    return this;
  }

  /**
   * Base64 encoded image
   *
   * @return image
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 encoded image")
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public DetectRequest thumbnails(Boolean thumbnails) {

    this.thumbnails = thumbnails;
    return this;
  }

  /**
   * Enable formatted detections&#39; thumbnails in the response
   *
   * @return thumbnails
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable formatted detections' thumbnails in the response")
  public Boolean getThumbnails() {
    return thumbnails;
  }

  public void setThumbnails(Boolean thumbnails) {
    this.thumbnails = thumbnails;
  }

  public DetectRequest attributes(Boolean attributes) {

    this.attributes = attributes;
    return this;
  }

  /**
   * Enable face attributions detection, such as age or emotion and etc.
   *
   * @return attributes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable face attributions detection, such as age or emotion and etc.")
  public Boolean getAttributes() {
    return attributes;
  }

  public void setAttributes(Boolean attributes) {
    this.attributes = attributes;
  }

  public DetectRequest onlyCentralFace(Boolean onlyCentralFace) {

    this.onlyCentralFace = onlyCentralFace;
    return this;
  }

  /**
   * True - main face; false - all faces.
   *
   * @return onlyCentralFace
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True - main face; false - all faces.")
  public Boolean getOnlyCentralFace() {
    return onlyCentralFace;
  }

  public void setOnlyCentralFace(Boolean onlyCentralFace) {
    this.onlyCentralFace = onlyCentralFace;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectRequest detectRequest = (DetectRequest) o;
    return Arrays.equals(this.image, detectRequest.image)
        && Objects.equals(this.thumbnails, detectRequest.thumbnails)
        && Objects.equals(this.attributes, detectRequest.attributes)
        && Objects.equals(this.onlyCentralFace, detectRequest.onlyCentralFace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(image), thumbnails, attributes, onlyCentralFace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectRequest {\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    onlyCentralFace: ").append(toIndentedString(onlyCentralFace)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
