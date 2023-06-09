/*
 * GitHub v3 REST API
 * GitHub's v3 REST API.
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The duration of the interaction restriction. Default: &#x60;one_day&#x60;.
 */
@JsonAdapter(InteractionExpiry.Adapter.class)
public enum InteractionExpiry {
  
  ONE_DAY("one_day"),
  
  THREE_DAYS("three_days"),
  
  ONE_WEEK("one_week"),
  
  ONE_MONTH("one_month"),
  
  SIX_MONTHS("six_months");

  private String value;

  InteractionExpiry(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InteractionExpiry fromValue(String value) {
    for (InteractionExpiry b : InteractionExpiry.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<InteractionExpiry> {
    @Override
    public void write(final JsonWriter jsonWriter, final InteractionExpiry enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InteractionExpiry read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InteractionExpiry.fromValue(value);
    }
  }
}

