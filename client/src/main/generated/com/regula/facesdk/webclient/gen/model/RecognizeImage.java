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
import org.threeten.bp.OffsetDateTime;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * RecognizeImage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecognizeImage {
    public static final String SERIALIZED_NAME_ID = "id";
    public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
    public static final String SERIALIZED_NAME_PATH = "path";
    public static final String SERIALIZED_NAME_URL = "url";
    public static final String SERIALIZED_NAME_SIMILARITY = "similarity";
    @SerializedName(SERIALIZED_NAME_ID)
    private BigDecimal id;
    @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
    private String contentType;
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private OffsetDateTime createdAt;
    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;
    @SerializedName(SERIALIZED_NAME_URL)
    private String url;
    @SerializedName(SERIALIZED_NAME_SIMILARITY)
    private Float similarity;

    public RecognizeImage() {
    }

    public RecognizeImage id(BigDecimal id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public BigDecimal getId() {
        return id;
    }


    public void setId(BigDecimal id) {
        this.id = id;
    }


    public RecognizeImage contentType(String contentType) {

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


    public RecognizeImage createdAt(OffsetDateTime createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }


    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }


    public RecognizeImage path(String path) {

        this.path = path;
        return this;
    }

    /**
     * Get path
     *
     * @return path
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getPath() {
        return path;
    }


    public void setPath(String path) {
        this.path = path;
    }


    public RecognizeImage url(String url) {

        this.url = url;
        return this;
    }

    /**
     * Get url
     *
     * @return url
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public RecognizeImage similarity(Float similarity) {

        this.similarity = similarity;
        return this;
    }

    /**
     * Get similarity
     *
     * @return similarity
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Float getSimilarity() {
        return similarity;
    }


    public void setSimilarity(Float similarity) {
        this.similarity = similarity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecognizeImage recognizeImage = (RecognizeImage) o;
        return Objects.equals(this.id, recognizeImage.id) &&
                Objects.equals(this.contentType, recognizeImage.contentType) &&
                Objects.equals(this.createdAt, recognizeImage.createdAt) &&
                Objects.equals(this.path, recognizeImage.path) &&
                Objects.equals(this.url, recognizeImage.url) &&
                Objects.equals(this.similarity, recognizeImage.similarity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contentType, createdAt, path, url, similarity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeImage {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
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

