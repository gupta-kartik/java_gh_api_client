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
import java.time.OffsetDateTime;

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
 * ActivityMarkNotificationsAsReadRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ActivityMarkNotificationsAsReadRequest {
  public static final String SERIALIZED_NAME_LAST_READ_AT = "last_read_at";
  @SerializedName(SERIALIZED_NAME_LAST_READ_AT)
  private OffsetDateTime lastReadAt;

  public static final String SERIALIZED_NAME_READ = "read";
  @SerializedName(SERIALIZED_NAME_READ)
  private Boolean read;

  public ActivityMarkNotificationsAsReadRequest() {
  }

  public ActivityMarkNotificationsAsReadRequest lastReadAt(OffsetDateTime lastReadAt) {
    
    this.lastReadAt = lastReadAt;
    return this;
  }

   /**
   * Describes the last point that notifications were checked. Anything updated since this time will not be marked as read. If you omit this parameter, all notifications are marked as read. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. Default: The current timestamp.
   * @return lastReadAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getLastReadAt() {
    return lastReadAt;
  }


  public void setLastReadAt(OffsetDateTime lastReadAt) {
    this.lastReadAt = lastReadAt;
  }


  public ActivityMarkNotificationsAsReadRequest read(Boolean read) {
    
    this.read = read;
    return this;
  }

   /**
   * Whether the notification has been read.
   * @return read
  **/
  @javax.annotation.Nullable

  public Boolean getRead() {
    return read;
  }


  public void setRead(Boolean read) {
    this.read = read;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityMarkNotificationsAsReadRequest activityMarkNotificationsAsReadRequest = (ActivityMarkNotificationsAsReadRequest) o;
    return Objects.equals(this.lastReadAt, activityMarkNotificationsAsReadRequest.lastReadAt) &&
        Objects.equals(this.read, activityMarkNotificationsAsReadRequest.read);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastReadAt, read);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityMarkNotificationsAsReadRequest {\n");
    sb.append("    lastReadAt: ").append(toIndentedString(lastReadAt)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
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
    openapiFields.add("last_read_at");
    openapiFields.add("read");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActivityMarkNotificationsAsReadRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ActivityMarkNotificationsAsReadRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActivityMarkNotificationsAsReadRequest is not found in the empty JSON string", ActivityMarkNotificationsAsReadRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ActivityMarkNotificationsAsReadRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActivityMarkNotificationsAsReadRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActivityMarkNotificationsAsReadRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActivityMarkNotificationsAsReadRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActivityMarkNotificationsAsReadRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActivityMarkNotificationsAsReadRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ActivityMarkNotificationsAsReadRequest>() {
           @Override
           public void write(JsonWriter out, ActivityMarkNotificationsAsReadRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActivityMarkNotificationsAsReadRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActivityMarkNotificationsAsReadRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActivityMarkNotificationsAsReadRequest
  * @throws IOException if the JSON string is invalid with respect to ActivityMarkNotificationsAsReadRequest
  */
  public static ActivityMarkNotificationsAsReadRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActivityMarkNotificationsAsReadRequest.class);
  }

 /**
  * Convert an instance of ActivityMarkNotificationsAsReadRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
