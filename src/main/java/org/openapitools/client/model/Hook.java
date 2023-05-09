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
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.HookConfig;
import org.openapitools.client.model.HookResponse;

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
 * Webhooks for repositories.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class Hook {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private HookConfig config;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_TEST_URL = "test_url";
  @SerializedName(SERIALIZED_NAME_TEST_URL)
  private URI testUrl;

  public static final String SERIALIZED_NAME_PING_URL = "ping_url";
  @SerializedName(SERIALIZED_NAME_PING_URL)
  private URI pingUrl;

  public static final String SERIALIZED_NAME_DELIVERIES_URL = "deliveries_url";
  @SerializedName(SERIALIZED_NAME_DELIVERIES_URL)
  private URI deliveriesUrl;

  public static final String SERIALIZED_NAME_LAST_RESPONSE = "last_response";
  @SerializedName(SERIALIZED_NAME_LAST_RESPONSE)
  private HookResponse lastResponse;

  public Hook() {
  }

  public Hook type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Hook id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the webhook.
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Hook name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of a valid service, use &#39;web&#39; for a webhook.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Hook active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Determines whether the hook is actually triggered on pushes.
   * @return active
  **/
  @javax.annotation.Nonnull

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Hook events(List<String> events) {
    
    this.events = events;
    return this;
  }

  public Hook addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Determines what events the hook is triggered for. Default: [&#39;push&#39;].
   * @return events
  **/
  @javax.annotation.Nonnull

  public List<String> getEvents() {
    return events;
  }


  public void setEvents(List<String> events) {
    this.events = events;
  }


  public Hook config(HookConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nonnull

  public HookConfig getConfig() {
    return config;
  }


  public void setConfig(HookConfig config) {
    this.config = config;
  }


  public Hook updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Hook createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Hook url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public Hook testUrl(URI testUrl) {
    
    this.testUrl = testUrl;
    return this;
  }

   /**
   * Get testUrl
   * @return testUrl
  **/
  @javax.annotation.Nonnull

  public URI getTestUrl() {
    return testUrl;
  }


  public void setTestUrl(URI testUrl) {
    this.testUrl = testUrl;
  }


  public Hook pingUrl(URI pingUrl) {
    
    this.pingUrl = pingUrl;
    return this;
  }

   /**
   * Get pingUrl
   * @return pingUrl
  **/
  @javax.annotation.Nonnull

  public URI getPingUrl() {
    return pingUrl;
  }


  public void setPingUrl(URI pingUrl) {
    this.pingUrl = pingUrl;
  }


  public Hook deliveriesUrl(URI deliveriesUrl) {
    
    this.deliveriesUrl = deliveriesUrl;
    return this;
  }

   /**
   * Get deliveriesUrl
   * @return deliveriesUrl
  **/
  @javax.annotation.Nullable

  public URI getDeliveriesUrl() {
    return deliveriesUrl;
  }


  public void setDeliveriesUrl(URI deliveriesUrl) {
    this.deliveriesUrl = deliveriesUrl;
  }


  public Hook lastResponse(HookResponse lastResponse) {
    
    this.lastResponse = lastResponse;
    return this;
  }

   /**
   * Get lastResponse
   * @return lastResponse
  **/
  @javax.annotation.Nonnull

  public HookResponse getLastResponse() {
    return lastResponse;
  }


  public void setLastResponse(HookResponse lastResponse) {
    this.lastResponse = lastResponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hook hook = (Hook) o;
    return Objects.equals(this.type, hook.type) &&
        Objects.equals(this.id, hook.id) &&
        Objects.equals(this.name, hook.name) &&
        Objects.equals(this.active, hook.active) &&
        Objects.equals(this.events, hook.events) &&
        Objects.equals(this.config, hook.config) &&
        Objects.equals(this.updatedAt, hook.updatedAt) &&
        Objects.equals(this.createdAt, hook.createdAt) &&
        Objects.equals(this.url, hook.url) &&
        Objects.equals(this.testUrl, hook.testUrl) &&
        Objects.equals(this.pingUrl, hook.pingUrl) &&
        Objects.equals(this.deliveriesUrl, hook.deliveriesUrl) &&
        Objects.equals(this.lastResponse, hook.lastResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, name, active, events, config, updatedAt, createdAt, url, testUrl, pingUrl, deliveriesUrl, lastResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hook {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    testUrl: ").append(toIndentedString(testUrl)).append("\n");
    sb.append("    pingUrl: ").append(toIndentedString(pingUrl)).append("\n");
    sb.append("    deliveriesUrl: ").append(toIndentedString(deliveriesUrl)).append("\n");
    sb.append("    lastResponse: ").append(toIndentedString(lastResponse)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("active");
    openapiFields.add("events");
    openapiFields.add("config");
    openapiFields.add("updated_at");
    openapiFields.add("created_at");
    openapiFields.add("url");
    openapiFields.add("test_url");
    openapiFields.add("ping_url");
    openapiFields.add("deliveries_url");
    openapiFields.add("last_response");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("events");
    openapiRequiredFields.add("config");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("test_url");
    openapiRequiredFields.add("ping_url");
    openapiRequiredFields.add("last_response");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Hook
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Hook.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Hook is not found in the empty JSON string", Hook.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Hook.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Hook` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Hook.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("events") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
      }
      // validate the required field `config`
      HookConfig.validateJsonObject(jsonObj.getAsJsonObject("config"));
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("test_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `test_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("test_url").toString()));
      }
      if (!jsonObj.get("ping_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ping_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ping_url").toString()));
      }
      if ((jsonObj.get("deliveries_url") != null && !jsonObj.get("deliveries_url").isJsonNull()) && !jsonObj.get("deliveries_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveries_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveries_url").toString()));
      }
      // validate the required field `last_response`
      HookResponse.validateJsonObject(jsonObj.getAsJsonObject("last_response"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Hook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Hook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Hook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Hook.class));

       return (TypeAdapter<T>) new TypeAdapter<Hook>() {
           @Override
           public void write(JsonWriter out, Hook value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Hook read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Hook given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Hook
  * @throws IOException if the JSON string is invalid with respect to Hook
  */
  public static Hook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Hook.class);
  }

 /**
  * Convert an instance of Hook to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
