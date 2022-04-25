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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Align */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Align {
  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private FaceAlignTypeQuality type;

  public static final String SERIALIZED_NAME_PAD = "pad";

  @SerializedName(SERIALIZED_NAME_PAD)
  private List<Integer> pad = null;

  public static final String SERIALIZED_NAME_CROP_SIZE = "cropSize";

  @SerializedName(SERIALIZED_NAME_CROP_SIZE)
  private List<Integer> cropSize = null;

  public Align type(FaceAlignTypeQuality type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public FaceAlignTypeQuality getType() {
    return type;
  }

  public void setType(FaceAlignTypeQuality type) {
    this.type = type;
  }

  public Align pad(List<Integer> pad) {

    this.pad = pad;
    return this;
  }

  public Align addPadItem(Integer padItem) {
    if (this.pad == null) {
      this.pad = new ArrayList<Integer>();
    }
    this.pad.add(padItem);
    return this;
  }

  /**
   * Array of RGB color
   *
   * @return pad
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[128,128,128]", value = "Array of RGB color")
  public List<Integer> getPad() {
    return pad;
  }

  public void setPad(List<Integer> pad) {
    this.pad = pad;
  }

  public Align cropSize(List<Integer> cropSize) {

    this.cropSize = cropSize;
    return this;
  }

  public Align addCropSizeItem(Integer cropSizeItem) {
    if (this.cropSize == null) {
      this.cropSize = new ArrayList<Integer>();
    }
    this.cropSize.add(cropSizeItem);
    return this;
  }

  /**
   * Get cropSize
   *
   * @return cropSize
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[420,525]", value = "")
  public List<Integer> getCropSize() {
    return cropSize;
  }

  public void setCropSize(List<Integer> cropSize) {
    this.cropSize = cropSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Align align = (Align) o;
    return Objects.equals(this.type, align.type)
        && Objects.equals(this.pad, align.pad)
        && Objects.equals(this.cropSize, align.cropSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, pad, cropSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Align {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pad: ").append(toIndentedString(pad)).append("\n");
    sb.append("    cropSize: ").append(toIndentedString(cropSize)).append("\n");
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