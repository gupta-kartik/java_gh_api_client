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
 * Sets the state of the code scanning alert. You must provide &#x60;dismissed_reason&#x60; when you set the state to &#x60;dismissed&#x60;.
 */
@JsonAdapter(CodeScanningAlertSetState.Adapter.class)
public enum CodeScanningAlertSetState {
  
  OPEN("open"),
  
  DISMISSED("dismissed");

  private String value;

  CodeScanningAlertSetState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CodeScanningAlertSetState fromValue(String value) {
    for (CodeScanningAlertSetState b : CodeScanningAlertSetState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CodeScanningAlertSetState> {
    @Override
    public void write(final JsonWriter jsonWriter, final CodeScanningAlertSetState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CodeScanningAlertSetState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CodeScanningAlertSetState.fromValue(value);
    }
  }
}
