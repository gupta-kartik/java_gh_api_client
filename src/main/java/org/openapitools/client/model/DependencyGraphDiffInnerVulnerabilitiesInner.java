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
 * DependencyGraphDiffInnerVulnerabilitiesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class DependencyGraphDiffInnerVulnerabilitiesInner {
  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public static final String SERIALIZED_NAME_ADVISORY_GHSA_ID = "advisory_ghsa_id";
  @SerializedName(SERIALIZED_NAME_ADVISORY_GHSA_ID)
  private String advisoryGhsaId;

  public static final String SERIALIZED_NAME_ADVISORY_SUMMARY = "advisory_summary";
  @SerializedName(SERIALIZED_NAME_ADVISORY_SUMMARY)
  private String advisorySummary;

  public static final String SERIALIZED_NAME_ADVISORY_URL = "advisory_url";
  @SerializedName(SERIALIZED_NAME_ADVISORY_URL)
  private String advisoryUrl;

  public DependencyGraphDiffInnerVulnerabilitiesInner() {
  }

  public DependencyGraphDiffInnerVulnerabilitiesInner severity(String severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nonnull

  public String getSeverity() {
    return severity;
  }


  public void setSeverity(String severity) {
    this.severity = severity;
  }


  public DependencyGraphDiffInnerVulnerabilitiesInner advisoryGhsaId(String advisoryGhsaId) {
    
    this.advisoryGhsaId = advisoryGhsaId;
    return this;
  }

   /**
   * Get advisoryGhsaId
   * @return advisoryGhsaId
  **/
  @javax.annotation.Nonnull

  public String getAdvisoryGhsaId() {
    return advisoryGhsaId;
  }


  public void setAdvisoryGhsaId(String advisoryGhsaId) {
    this.advisoryGhsaId = advisoryGhsaId;
  }


  public DependencyGraphDiffInnerVulnerabilitiesInner advisorySummary(String advisorySummary) {
    
    this.advisorySummary = advisorySummary;
    return this;
  }

   /**
   * Get advisorySummary
   * @return advisorySummary
  **/
  @javax.annotation.Nonnull

  public String getAdvisorySummary() {
    return advisorySummary;
  }


  public void setAdvisorySummary(String advisorySummary) {
    this.advisorySummary = advisorySummary;
  }


  public DependencyGraphDiffInnerVulnerabilitiesInner advisoryUrl(String advisoryUrl) {
    
    this.advisoryUrl = advisoryUrl;
    return this;
  }

   /**
   * Get advisoryUrl
   * @return advisoryUrl
  **/
  @javax.annotation.Nonnull

  public String getAdvisoryUrl() {
    return advisoryUrl;
  }


  public void setAdvisoryUrl(String advisoryUrl) {
    this.advisoryUrl = advisoryUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependencyGraphDiffInnerVulnerabilitiesInner dependencyGraphDiffInnerVulnerabilitiesInner = (DependencyGraphDiffInnerVulnerabilitiesInner) o;
    return Objects.equals(this.severity, dependencyGraphDiffInnerVulnerabilitiesInner.severity) &&
        Objects.equals(this.advisoryGhsaId, dependencyGraphDiffInnerVulnerabilitiesInner.advisoryGhsaId) &&
        Objects.equals(this.advisorySummary, dependencyGraphDiffInnerVulnerabilitiesInner.advisorySummary) &&
        Objects.equals(this.advisoryUrl, dependencyGraphDiffInnerVulnerabilitiesInner.advisoryUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, advisoryGhsaId, advisorySummary, advisoryUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyGraphDiffInnerVulnerabilitiesInner {\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    advisoryGhsaId: ").append(toIndentedString(advisoryGhsaId)).append("\n");
    sb.append("    advisorySummary: ").append(toIndentedString(advisorySummary)).append("\n");
    sb.append("    advisoryUrl: ").append(toIndentedString(advisoryUrl)).append("\n");
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
    openapiFields.add("severity");
    openapiFields.add("advisory_ghsa_id");
    openapiFields.add("advisory_summary");
    openapiFields.add("advisory_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("severity");
    openapiRequiredFields.add("advisory_ghsa_id");
    openapiRequiredFields.add("advisory_summary");
    openapiRequiredFields.add("advisory_url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DependencyGraphDiffInnerVulnerabilitiesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DependencyGraphDiffInnerVulnerabilitiesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DependencyGraphDiffInnerVulnerabilitiesInner is not found in the empty JSON string", DependencyGraphDiffInnerVulnerabilitiesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DependencyGraphDiffInnerVulnerabilitiesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DependencyGraphDiffInnerVulnerabilitiesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DependencyGraphDiffInnerVulnerabilitiesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
      if (!jsonObj.get("advisory_ghsa_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advisory_ghsa_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advisory_ghsa_id").toString()));
      }
      if (!jsonObj.get("advisory_summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advisory_summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advisory_summary").toString()));
      }
      if (!jsonObj.get("advisory_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advisory_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advisory_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DependencyGraphDiffInnerVulnerabilitiesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DependencyGraphDiffInnerVulnerabilitiesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DependencyGraphDiffInnerVulnerabilitiesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DependencyGraphDiffInnerVulnerabilitiesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DependencyGraphDiffInnerVulnerabilitiesInner>() {
           @Override
           public void write(JsonWriter out, DependencyGraphDiffInnerVulnerabilitiesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DependencyGraphDiffInnerVulnerabilitiesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DependencyGraphDiffInnerVulnerabilitiesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DependencyGraphDiffInnerVulnerabilitiesInner
  * @throws IOException if the JSON string is invalid with respect to DependencyGraphDiffInnerVulnerabilitiesInner
  */
  public static DependencyGraphDiffInnerVulnerabilitiesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DependencyGraphDiffInnerVulnerabilitiesInner.class);
  }

 /**
  * Convert an instance of DependencyGraphDiffInnerVulnerabilitiesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
