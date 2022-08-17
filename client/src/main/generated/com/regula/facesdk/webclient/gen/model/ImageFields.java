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

import java.io.File;
import java.util.Objects;

/**
 * ImageFields
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ImageFields {
    public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
    public static final String SERIALIZED_NAME_CONTENT = "content";
    @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
    private String contentType;
    @SerializedName(SERIALIZED_NAME_CONTENT)
    private File content;

    public ImageFields() {
    }

    public ImageFields contentType(String contentType) {

        this.contentType = contentType;
        return this;
    }

    /**
     * Get contentType
     *
     * @return contentType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getContentType() {
        return contentType;
    }


    public void setContentType(String contentType) {
        this.contentType = contentType;
    }


    public ImageFields content(File content) {

        this.content = content;
        return this;
    }

    /**
     * Get content
     *
     * @return content
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public File getContent() {
        return content;
    }


    public void setContent(File content) {
        this.content = content;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageFields imageFields = (ImageFields) o;
        return Objects.equals(this.contentType, imageFields.contentType) &&
                Objects.equals(this.content, imageFields.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageFields {\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

