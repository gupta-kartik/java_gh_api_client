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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.CheckSuite;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ChecksListSuitesForRef200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ChecksListSuitesForRef200Response {
  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_CHECK_SUITES = "check_suites";
  @SerializedName(SERIALIZED_NAME_CHECK_SUITES)
  private List<CheckSuite> checkSuites = new ArrayList<>();

  public ChecksListSuitesForRef200Response() {
  }

  public ChecksListSuitesForRef200Response totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nonnull

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public ChecksListSuitesForRef200Response checkSuites(List<CheckSuite> checkSuites) {
    
    this.checkSuites = checkSuites;
    return this;
  }

  public ChecksListSuitesForRef200Response addCheckSuitesItem(CheckSuite checkSuitesItem) {
    if (this.checkSuites == null) {
      this.checkSuites = new ArrayList<>();
    }
    this.checkSuites.add(checkSuitesItem);
    return this;
  }

   /**
   * Get checkSuites
   * @return checkSuites
  **/
  @javax.annotation.Nonnull

  public List<CheckSuite> getCheckSuites() {
    return checkSuites;
  }


  public void setCheckSuites(List<CheckSuite> checkSuites) {
    this.checkSuites = checkSuites;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChecksListSuitesForRef200Response checksListSuitesForRef200Response = (ChecksListSuitesForRef200Response) o;
    return Objects.equals(this.totalCount, checksListSuitesForRef200Response.totalCount) &&
        Objects.equals(this.checkSuites, checksListSuitesForRef200Response.checkSuites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, checkSuites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChecksListSuitesForRef200Response {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    checkSuites: ").append(toIndentedString(checkSuites)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("total_count");
    openapiFields.add("check_suites");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("total_count");
    openapiRequiredFields.add("check_suites");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChecksListSuitesForRef200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChecksListSuitesForRef200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChecksListSuitesForRef200Response is not found in the empty JSON string", ChecksListSuitesForRef200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChecksListSuitesForRef200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChecksListSuitesForRef200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChecksListSuitesForRef200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("check_suites").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `check_suites` to be an array in the JSON string but got `%s`", jsonObj.get("check_suites").toString()));
      }

      JsonArray jsonArraycheckSuites = jsonObj.getAsJsonArray("check_suites");
      // validate the required field `check_suites` (array)
      for (int i = 0; i < jsonArraycheckSuites.size(); i++) {
        CheckSuite.validateJsonObject(jsonArraycheckSuites.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChecksListSuitesForRef200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChecksListSuitesForRef200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChecksListSuitesForRef200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChecksListSuitesForRef200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ChecksListSuitesForRef200Response>() {
           @Override
           public void write(JsonWriter out, ChecksListSuitesForRef200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChecksListSuitesForRef200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChecksListSuitesForRef200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChecksListSuitesForRef200Response
  * @throws IOException if the JSON string is invalid with respect to ChecksListSuitesForRef200Response
  */
  public static ChecksListSuitesForRef200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChecksListSuitesForRef200Response.class);
  }

 /**
  * Convert an instance of ChecksListSuitesForRef200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

