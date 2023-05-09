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
import org.openapitools.client.model.ReposUpdateWebhookRequestConfig;

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
 * ReposUpdateWebhookRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ReposUpdateWebhookRequest {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private ReposUpdateWebhookRequestConfig config;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events = new ArrayList<>(Arrays.asList("push"));

  public static final String SERIALIZED_NAME_ADD_EVENTS = "add_events";
  @SerializedName(SERIALIZED_NAME_ADD_EVENTS)
  private List<String> addEvents;

  public static final String SERIALIZED_NAME_REMOVE_EVENTS = "remove_events";
  @SerializedName(SERIALIZED_NAME_REMOVE_EVENTS)
  private List<String> removeEvents;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active = true;

  public ReposUpdateWebhookRequest() {
  }

  public ReposUpdateWebhookRequest config(ReposUpdateWebhookRequestConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable

  public ReposUpdateWebhookRequestConfig getConfig() {
    return config;
  }


  public void setConfig(ReposUpdateWebhookRequestConfig config) {
    this.config = config;
  }


  public ReposUpdateWebhookRequest events(List<String> events) {
    
    this.events = events;
    return this;
  }

  public ReposUpdateWebhookRequest addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>(Arrays.asList("push"));
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for. This replaces the entire array of events.
   * @return events
  **/
  @javax.annotation.Nullable

  public List<String> getEvents() {
    return events;
  }


  public void setEvents(List<String> events) {
    this.events = events;
  }


  public ReposUpdateWebhookRequest addEvents(List<String> addEvents) {
    
    this.addEvents = addEvents;
    return this;
  }

  public ReposUpdateWebhookRequest addAddEventsItem(String addEventsItem) {
    if (this.addEvents == null) {
      this.addEvents = new ArrayList<>();
    }
    this.addEvents.add(addEventsItem);
    return this;
  }

   /**
   * Determines a list of events to be added to the list of events that the Hook triggers for.
   * @return addEvents
  **/
  @javax.annotation.Nullable

  public List<String> getAddEvents() {
    return addEvents;
  }


  public void setAddEvents(List<String> addEvents) {
    this.addEvents = addEvents;
  }


  public ReposUpdateWebhookRequest removeEvents(List<String> removeEvents) {
    
    this.removeEvents = removeEvents;
    return this;
  }

  public ReposUpdateWebhookRequest addRemoveEventsItem(String removeEventsItem) {
    if (this.removeEvents == null) {
      this.removeEvents = new ArrayList<>();
    }
    this.removeEvents.add(removeEventsItem);
    return this;
  }

   /**
   * Determines a list of events to be removed from the list of events that the Hook triggers for.
   * @return removeEvents
  **/
  @javax.annotation.Nullable

  public List<String> getRemoveEvents() {
    return removeEvents;
  }


  public void setRemoveEvents(List<String> removeEvents) {
    this.removeEvents = removeEvents;
  }


  public ReposUpdateWebhookRequest active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Determines if notifications are sent when the webhook is triggered. Set to &#x60;true&#x60; to send notifications.
   * @return active
  **/
  @javax.annotation.Nullable

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReposUpdateWebhookRequest reposUpdateWebhookRequest = (ReposUpdateWebhookRequest) o;
    return Objects.equals(this.config, reposUpdateWebhookRequest.config) &&
        Objects.equals(this.events, reposUpdateWebhookRequest.events) &&
        Objects.equals(this.addEvents, reposUpdateWebhookRequest.addEvents) &&
        Objects.equals(this.removeEvents, reposUpdateWebhookRequest.removeEvents) &&
        Objects.equals(this.active, reposUpdateWebhookRequest.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, events, addEvents, removeEvents, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReposUpdateWebhookRequest {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    addEvents: ").append(toIndentedString(addEvents)).append("\n");
    sb.append("    removeEvents: ").append(toIndentedString(removeEvents)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
    openapiFields.add("config");
    openapiFields.add("events");
    openapiFields.add("add_events");
    openapiFields.add("remove_events");
    openapiFields.add("active");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReposUpdateWebhookRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReposUpdateWebhookRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReposUpdateWebhookRequest is not found in the empty JSON string", ReposUpdateWebhookRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReposUpdateWebhookRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReposUpdateWebhookRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `config`
      if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonNull()) {
        ReposUpdateWebhookRequestConfig.validateJsonObject(jsonObj.getAsJsonObject("config"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("events") != null && !jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("add_events") != null && !jsonObj.get("add_events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `add_events` to be an array in the JSON string but got `%s`", jsonObj.get("add_events").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("remove_events") != null && !jsonObj.get("remove_events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `remove_events` to be an array in the JSON string but got `%s`", jsonObj.get("remove_events").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReposUpdateWebhookRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReposUpdateWebhookRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReposUpdateWebhookRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReposUpdateWebhookRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReposUpdateWebhookRequest>() {
           @Override
           public void write(JsonWriter out, ReposUpdateWebhookRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReposUpdateWebhookRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReposUpdateWebhookRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReposUpdateWebhookRequest
  * @throws IOException if the JSON string is invalid with respect to ReposUpdateWebhookRequest
  */
  public static ReposUpdateWebhookRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReposUpdateWebhookRequest.class);
  }

 /**
  * Convert an instance of ReposUpdateWebhookRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
