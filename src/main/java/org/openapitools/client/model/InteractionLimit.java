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
import org.openapitools.client.model.InteractionExpiry;
import org.openapitools.client.model.InteractionGroup;

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
 * Limit interactions to a specific type of user for a specified duration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class InteractionLimit {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private InteractionGroup limit;

  public static final String SERIALIZED_NAME_EXPIRY = "expiry";
  @SerializedName(SERIALIZED_NAME_EXPIRY)
  private InteractionExpiry expiry;

  public InteractionLimit() {
  }

  public InteractionLimit limit(InteractionGroup limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nonnull

  public InteractionGroup getLimit() {
    return limit;
  }


  public void setLimit(InteractionGroup limit) {
    this.limit = limit;
  }


  public InteractionLimit expiry(InteractionExpiry expiry) {
    
    this.expiry = expiry;
    return this;
  }

   /**
   * Get expiry
   * @return expiry
  **/
  @javax.annotation.Nullable

  public InteractionExpiry getExpiry() {
    return expiry;
  }


  public void setExpiry(InteractionExpiry expiry) {
    this.expiry = expiry;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractionLimit interactionLimit = (InteractionLimit) o;
    return Objects.equals(this.limit, interactionLimit.limit) &&
        Objects.equals(this.expiry, interactionLimit.expiry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, expiry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractionLimit {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
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
    openapiFields.add("limit");
    openapiFields.add("expiry");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("limit");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InteractionLimit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InteractionLimit.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InteractionLimit is not found in the empty JSON string", InteractionLimit.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InteractionLimit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InteractionLimit` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InteractionLimit.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InteractionLimit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InteractionLimit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InteractionLimit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InteractionLimit.class));

       return (TypeAdapter<T>) new TypeAdapter<InteractionLimit>() {
           @Override
           public void write(JsonWriter out, InteractionLimit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InteractionLimit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InteractionLimit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InteractionLimit
  * @throws IOException if the JSON string is invalid with respect to InteractionLimit
  */
  public static InteractionLimit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InteractionLimit.class);
  }

 /**
  * Convert an instance of InteractionLimit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

