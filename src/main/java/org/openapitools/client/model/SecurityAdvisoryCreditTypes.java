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
 * The type of credit the user is receiving.
 */
@JsonAdapter(SecurityAdvisoryCreditTypes.Adapter.class)
public enum SecurityAdvisoryCreditTypes {
  
  ANALYST("analyst"),
  
  FINDER("finder"),
  
  REPORTER("reporter"),
  
  COORDINATOR("coordinator"),
  
  REMEDIATION_DEVELOPER("remediation_developer"),
  
  REMEDIATION_REVIEWER("remediation_reviewer"),
  
  REMEDIATION_VERIFIER("remediation_verifier"),
  
  TOOL("tool"),
  
  SPONSOR("sponsor"),
  
  OTHER("other");

  private String value;

  SecurityAdvisoryCreditTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SecurityAdvisoryCreditTypes fromValue(String value) {
    for (SecurityAdvisoryCreditTypes b : SecurityAdvisoryCreditTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SecurityAdvisoryCreditTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final SecurityAdvisoryCreditTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SecurityAdvisoryCreditTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SecurityAdvisoryCreditTypes.fromValue(value);
    }
  }
}

