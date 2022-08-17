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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ImagePage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ImagePage {
    public static final String SERIALIZED_NAME_PAGE = "page";
    public static final String SERIALIZED_NAME_TOTAL_PAGES = "total_pages";
    public static final String SERIALIZED_NAME_ITEMS = "items";
    @SerializedName(SERIALIZED_NAME_PAGE)
    private BigDecimal page;
    @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
    private BigDecimal totalPages;
    @SerializedName(SERIALIZED_NAME_ITEMS)
    private List<Image> items = null;

    public ImagePage() {
    }

    public ImagePage page(BigDecimal page) {

        this.page = page;
        return this;
    }

    /**
     * Get page
     *
     * @return page
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "1", value = "")

    public BigDecimal getPage() {
        return page;
    }


    public void setPage(BigDecimal page) {
        this.page = page;
    }


    public ImagePage totalPages(BigDecimal totalPages) {

        this.totalPages = totalPages;
        return this;
    }

    /**
     * Get totalPages
     *
     * @return totalPages
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2", value = "")

    public BigDecimal getTotalPages() {
        return totalPages;
    }


    public void setTotalPages(BigDecimal totalPages) {
        this.totalPages = totalPages;
    }


    public ImagePage items(List<Image> items) {

        this.items = items;
        return this;
    }

    public ImagePage addItemsItem(Image itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<Image>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Get items
     *
     * @return items
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<Image> getItems() {
        return items;
    }


    public void setItems(List<Image> items) {
        this.items = items;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImagePage imagePage = (ImagePage) o;
        return Objects.equals(this.page, imagePage.page) &&
                Objects.equals(this.totalPages, imagePage.totalPages) &&
                Objects.equals(this.items, imagePage.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, totalPages, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImagePage {\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
