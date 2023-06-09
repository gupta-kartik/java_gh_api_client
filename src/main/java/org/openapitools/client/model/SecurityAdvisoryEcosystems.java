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
 * The package&#39;s language or package management ecosystem.
 */
@JsonAdapter(SecurityAdvisoryEcosystems.Adapter.class)
public enum SecurityAdvisoryEcosystems {
  
  RUBYGEMS("rubygems"),
  
  NPM("npm"),
  
  PIP("pip"),
  
  MAVEN("maven"),
  
  NUGET("nuget"),
  
  COMPOSER("composer"),
  
  GO("go"),
  
  RUST("rust"),
  
  ERLANG("erlang"),
  
  ACTIONS("actions"),
  
  PUB("pub"),
  
  OTHER("other");

  private String value;

  SecurityAdvisoryEcosystems(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SecurityAdvisoryEcosystems fromValue(String value) {
    for (SecurityAdvisoryEcosystems b : SecurityAdvisoryEcosystems.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SecurityAdvisoryEcosystems> {
    @Override
    public void write(final JsonWriter jsonWriter, final SecurityAdvisoryEcosystems enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SecurityAdvisoryEcosystems read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SecurityAdvisoryEcosystems.fromValue(value);
    }
  }
}

