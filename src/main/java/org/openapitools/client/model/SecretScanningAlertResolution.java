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
 * **Required when the &#x60;state&#x60; is &#x60;resolved&#x60;.** The reason for resolving the alert.
 */
@JsonAdapter(SecretScanningAlertResolution.Adapter.class)
public enum SecretScanningAlertResolution {
  
  FALSE_POSITIVE("false_positive"),
  
  WONT_FIX("wont_fix"),
  
  REVOKED("revoked"),
  
  USED_IN_TESTS("used_in_tests");

  private String value;

  SecretScanningAlertResolution(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SecretScanningAlertResolution fromValue(String value) {
    for (SecretScanningAlertResolution b : SecretScanningAlertResolution.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SecretScanningAlertResolution> {
    @Override
    public void write(final JsonWriter jsonWriter, final SecretScanningAlertResolution enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SecretScanningAlertResolution read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SecretScanningAlertResolution.fromValue(value);
    }
  }
}
