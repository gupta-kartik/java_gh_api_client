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
 * The default workflow permissions granted to the GITHUB_TOKEN when running workflows.
 */
@JsonAdapter(ActionsDefaultWorkflowPermissions.Adapter.class)
public enum ActionsDefaultWorkflowPermissions {
  
  READ("read"),
  
  WRITE("write");

  private String value;

  ActionsDefaultWorkflowPermissions(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActionsDefaultWorkflowPermissions fromValue(String value) {
    for (ActionsDefaultWorkflowPermissions b : ActionsDefaultWorkflowPermissions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ActionsDefaultWorkflowPermissions> {
    @Override
    public void write(final JsonWriter jsonWriter, final ActionsDefaultWorkflowPermissions enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActionsDefaultWorkflowPermissions read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ActionsDefaultWorkflowPermissions.fromValue(value);
    }
  }
}
