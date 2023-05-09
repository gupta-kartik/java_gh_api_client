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
 * GistHistoryChangeStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class GistHistoryChangeStatus {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_ADDITIONS = "additions";
  @SerializedName(SERIALIZED_NAME_ADDITIONS)
  private Integer additions;

  public static final String SERIALIZED_NAME_DELETIONS = "deletions";
  @SerializedName(SERIALIZED_NAME_DELETIONS)
  private Integer deletions;

  public GistHistoryChangeStatus() {
  }

  public GistHistoryChangeStatus total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public GistHistoryChangeStatus additions(Integer additions) {
    
    this.additions = additions;
    return this;
  }

   /**
   * Get additions
   * @return additions
  **/
  @javax.annotation.Nullable

  public Integer getAdditions() {
    return additions;
  }


  public void setAdditions(Integer additions) {
    this.additions = additions;
  }


  public GistHistoryChangeStatus deletions(Integer deletions) {
    
    this.deletions = deletions;
    return this;
  }

   /**
   * Get deletions
   * @return deletions
  **/
  @javax.annotation.Nullable

  public Integer getDeletions() {
    return deletions;
  }


  public void setDeletions(Integer deletions) {
    this.deletions = deletions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GistHistoryChangeStatus gistHistoryChangeStatus = (GistHistoryChangeStatus) o;
    return Objects.equals(this.total, gistHistoryChangeStatus.total) &&
        Objects.equals(this.additions, gistHistoryChangeStatus.additions) &&
        Objects.equals(this.deletions, gistHistoryChangeStatus.deletions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, additions, deletions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GistHistoryChangeStatus {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
    sb.append("    deletions: ").append(toIndentedString(deletions)).append("\n");
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
    openapiFields.add("total");
    openapiFields.add("additions");
    openapiFields.add("deletions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GistHistoryChangeStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GistHistoryChangeStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GistHistoryChangeStatus is not found in the empty JSON string", GistHistoryChangeStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GistHistoryChangeStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GistHistoryChangeStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GistHistoryChangeStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GistHistoryChangeStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GistHistoryChangeStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GistHistoryChangeStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<GistHistoryChangeStatus>() {
           @Override
           public void write(JsonWriter out, GistHistoryChangeStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GistHistoryChangeStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GistHistoryChangeStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GistHistoryChangeStatus
  * @throws IOException if the JSON string is invalid with respect to GistHistoryChangeStatus
  */
  public static GistHistoryChangeStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GistHistoryChangeStatus.class);
  }

 /**
  * Convert an instance of GistHistoryChangeStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
