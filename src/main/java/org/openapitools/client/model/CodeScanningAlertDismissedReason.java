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
 * **Required when the state is dismissed.** The reason for dismissing or closing the alert.
 */
@JsonAdapter(CodeScanningAlertDismissedReason.Adapter.class)
public enum CodeScanningAlertDismissedReason {
  
  NULL("null"),
  
  FALSE_POSITIVE("false positive"),
  
  WON_T_FIX("won't fix"),
  
  USED_IN_TESTS("used in tests");

  private String value;

  CodeScanningAlertDismissedReason(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CodeScanningAlertDismissedReason fromValue(String value) {
    for (CodeScanningAlertDismissedReason b : CodeScanningAlertDismissedReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CodeScanningAlertDismissedReason> {
    @Override
    public void write(final JsonWriter jsonWriter, final CodeScanningAlertDismissedReason enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CodeScanningAlertDismissedReason read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CodeScanningAlertDismissedReason.fromValue(value);
    }
  }
}

