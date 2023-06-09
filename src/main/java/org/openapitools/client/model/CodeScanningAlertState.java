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
 * State of a code scanning alert.
 */
@JsonAdapter(CodeScanningAlertState.Adapter.class)
public enum CodeScanningAlertState {
  
  OPEN("open"),
  
  CLOSED("closed"),
  
  DISMISSED("dismissed"),
  
  FIXED("fixed");

  private String value;

  CodeScanningAlertState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CodeScanningAlertState fromValue(String value) {
    for (CodeScanningAlertState b : CodeScanningAlertState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CodeScanningAlertState> {
    @Override
    public void write(final JsonWriter jsonWriter, final CodeScanningAlertState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CodeScanningAlertState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CodeScanningAlertState.fromValue(value);
    }
  }
}

