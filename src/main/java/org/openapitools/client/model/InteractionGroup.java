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
 * The type of GitHub user that can comment, open issues, or create pull requests while the interaction limit is in effect.
 */
@JsonAdapter(InteractionGroup.Adapter.class)
public enum InteractionGroup {
  
  EXISTING_USERS("existing_users"),
  
  CONTRIBUTORS_ONLY("contributors_only"),
  
  COLLABORATORS_ONLY("collaborators_only");

  private String value;

  InteractionGroup(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InteractionGroup fromValue(String value) {
    for (InteractionGroup b : InteractionGroup.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<InteractionGroup> {
    @Override
    public void write(final JsonWriter jsonWriter, final InteractionGroup enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InteractionGroup read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InteractionGroup.fromValue(value);
    }
  }
}

