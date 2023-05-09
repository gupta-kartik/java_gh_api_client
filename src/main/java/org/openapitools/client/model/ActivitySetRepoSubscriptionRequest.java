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
 * ActivitySetRepoSubscriptionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ActivitySetRepoSubscriptionRequest {
  public static final String SERIALIZED_NAME_SUBSCRIBED = "subscribed";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED)
  private Boolean subscribed;

  public static final String SERIALIZED_NAME_IGNORED = "ignored";
  @SerializedName(SERIALIZED_NAME_IGNORED)
  private Boolean ignored;

  public ActivitySetRepoSubscriptionRequest() {
  }

  public ActivitySetRepoSubscriptionRequest subscribed(Boolean subscribed) {
    
    this.subscribed = subscribed;
    return this;
  }

   /**
   * Determines if notifications should be received from this repository.
   * @return subscribed
  **/
  @javax.annotation.Nullable

  public Boolean getSubscribed() {
    return subscribed;
  }


  public void setSubscribed(Boolean subscribed) {
    this.subscribed = subscribed;
  }


  public ActivitySetRepoSubscriptionRequest ignored(Boolean ignored) {
    
    this.ignored = ignored;
    return this;
  }

   /**
   * Determines if all notifications should be blocked from this repository.
   * @return ignored
  **/
  @javax.annotation.Nullable

  public Boolean getIgnored() {
    return ignored;
  }


  public void setIgnored(Boolean ignored) {
    this.ignored = ignored;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivitySetRepoSubscriptionRequest activitySetRepoSubscriptionRequest = (ActivitySetRepoSubscriptionRequest) o;
    return Objects.equals(this.subscribed, activitySetRepoSubscriptionRequest.subscribed) &&
        Objects.equals(this.ignored, activitySetRepoSubscriptionRequest.ignored);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscribed, ignored);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivitySetRepoSubscriptionRequest {\n");
    sb.append("    subscribed: ").append(toIndentedString(subscribed)).append("\n");
    sb.append("    ignored: ").append(toIndentedString(ignored)).append("\n");
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
    openapiFields.add("subscribed");
    openapiFields.add("ignored");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActivitySetRepoSubscriptionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ActivitySetRepoSubscriptionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActivitySetRepoSubscriptionRequest is not found in the empty JSON string", ActivitySetRepoSubscriptionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ActivitySetRepoSubscriptionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActivitySetRepoSubscriptionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActivitySetRepoSubscriptionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActivitySetRepoSubscriptionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActivitySetRepoSubscriptionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActivitySetRepoSubscriptionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ActivitySetRepoSubscriptionRequest>() {
           @Override
           public void write(JsonWriter out, ActivitySetRepoSubscriptionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActivitySetRepoSubscriptionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActivitySetRepoSubscriptionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActivitySetRepoSubscriptionRequest
  * @throws IOException if the JSON string is invalid with respect to ActivitySetRepoSubscriptionRequest
  */
  public static ActivitySetRepoSubscriptionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActivitySetRepoSubscriptionRequest.class);
  }

 /**
  * Convert an instance of ActivitySetRepoSubscriptionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

