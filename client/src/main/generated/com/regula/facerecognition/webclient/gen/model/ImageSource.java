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

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Face photo image source
 */
@JsonAdapter(ImageSource.Adapter.class)
public enum ImageSource {
  
  DOCUMENT_PRINTED(1),
  
  DOCUMENT_RFID(2),
  
  LIVE(3),
  
  DOCUMENT_WITH_LIVE(4),
  
  EXTERNAL(5);

  private Integer value;

  ImageSource(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ImageSource fromValue(Integer value) {
    for (ImageSource b : ImageSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ImageSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final ImageSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ImageSource read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return ImageSource.fromValue(value);
    }
  }
}

