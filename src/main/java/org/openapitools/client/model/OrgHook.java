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
import org.openapitools.client.model.OrgHookConfig;

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
 * Org Hook
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class OrgHook {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_PING_URL = "ping_url";
  @SerializedName(SERIALIZED_NAME_PING_URL)
  private URI pingUrl;

  public static final String SERIALIZED_NAME_DELIVERIES_URL = "deliveries_url";
  @SerializedName(SERIALIZED_NAME_DELIVERIES_URL)
  private URI deliveriesUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private OrgHookConfig config;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public OrgHook() {
  }

  public OrgHook id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public OrgHook url(URI url) {
    
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


  public OrgHook pingUrl(URI pingUrl) {
    
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


  public OrgHook deliveriesUrl(URI deliveriesUrl) {
    
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


  public OrgHook name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OrgHook events(List<String> events) {
    
    this.events = events;
    return this;
  }

  public OrgHook addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nonnull

  public List<String> getEvents() {
    return events;
  }


  public void setEvents(List<String> events) {
    this.events = events;
  }


  public OrgHook active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nonnull

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public OrgHook config(OrgHookConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nonnull

  public OrgHookConfig getConfig() {
    return config;
  }


  public void setConfig(OrgHookConfig config) {
    this.config = config;
  }


  public OrgHook updatedAt(OffsetDateTime updatedAt) {
    
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


  public OrgHook createdAt(OffsetDateTime createdAt) {
    
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


  public OrgHook type(String type) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgHook orgHook = (OrgHook) o;
    return Objects.equals(this.id, orgHook.id) &&
        Objects.equals(this.url, orgHook.url) &&
        Objects.equals(this.pingUrl, orgHook.pingUrl) &&
        Objects.equals(this.deliveriesUrl, orgHook.deliveriesUrl) &&
        Objects.equals(this.name, orgHook.name) &&
        Objects.equals(this.events, orgHook.events) &&
        Objects.equals(this.active, orgHook.active) &&
        Objects.equals(this.config, orgHook.config) &&
        Objects.equals(this.updatedAt, orgHook.updatedAt) &&
        Objects.equals(this.createdAt, orgHook.createdAt) &&
        Objects.equals(this.type, orgHook.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, pingUrl, deliveriesUrl, name, events, active, config, updatedAt, createdAt, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgHook {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    pingUrl: ").append(toIndentedString(pingUrl)).append("\n");
    sb.append("    deliveriesUrl: ").append(toIndentedString(deliveriesUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("url");
    openapiFields.add("ping_url");
    openapiFields.add("deliveries_url");
    openapiFields.add("name");
    openapiFields.add("events");
    openapiFields.add("active");
    openapiFields.add("config");
    openapiFields.add("updated_at");
    openapiFields.add("created_at");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("ping_url");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("events");
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("config");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrgHook
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrgHook.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrgHook is not found in the empty JSON string", OrgHook.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrgHook.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrgHook` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrgHook.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("ping_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ping_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ping_url").toString()));
      }
      if ((jsonObj.get("deliveries_url") != null && !jsonObj.get("deliveries_url").isJsonNull()) && !jsonObj.get("deliveries_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveries_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveries_url").toString()));
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
      OrgHookConfig.validateJsonObject(jsonObj.getAsJsonObject("config"));
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrgHook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrgHook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrgHook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrgHook.class));

       return (TypeAdapter<T>) new TypeAdapter<OrgHook>() {
           @Override
           public void write(JsonWriter out, OrgHook value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrgHook read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrgHook given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrgHook
  * @throws IOException if the JSON string is invalid with respect to OrgHook
  */
  public static OrgHook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrgHook.class);
  }

 /**
  * Convert an instance of OrgHook to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

