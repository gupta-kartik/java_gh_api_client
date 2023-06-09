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
 * WebhookInstallationRepositoriesAddedRepositoriesRemovedInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookInstallationRepositoriesAddedRepositoriesRemovedInner {
  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_PRIVATE = "private";
  @SerializedName(SERIALIZED_NAME_PRIVATE)
  private Boolean _private;

  public WebhookInstallationRepositoriesAddedRepositoriesRemovedInner() {
  }

  public WebhookInstallationRepositoriesAddedRepositoriesRemovedInner fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public WebhookInstallationRepositoriesAddedRepositoriesRemovedInner id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the repository
   * @return id
  **/
  @javax.annotation.Nullable

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public WebhookInstallationRepositoriesAddedRepositoriesRemovedInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the repository.
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WebhookInstallationRepositoriesAddedRepositoriesRemovedInner nodeId(String nodeId) {
    
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @javax.annotation.Nullable

  public String getNodeId() {
    return nodeId;
  }


  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }


  public WebhookInstallationRepositoriesAddedRepositoriesRemovedInner _private(Boolean _private) {
    
    this._private = _private;
    return this;
  }

   /**
   * Whether the repository is private or public.
   * @return _private
  **/
  @javax.annotation.Nullable

  public Boolean getPrivate() {
    return _private;
  }


  public void setPrivate(Boolean _private) {
    this._private = _private;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookInstallationRepositoriesAddedRepositoriesRemovedInner webhookInstallationRepositoriesAddedRepositoriesRemovedInner = (WebhookInstallationRepositoriesAddedRepositoriesRemovedInner) o;
    return Objects.equals(this.fullName, webhookInstallationRepositoriesAddedRepositoriesRemovedInner.fullName) &&
        Objects.equals(this.id, webhookInstallationRepositoriesAddedRepositoriesRemovedInner.id) &&
        Objects.equals(this.name, webhookInstallationRepositoriesAddedRepositoriesRemovedInner.name) &&
        Objects.equals(this.nodeId, webhookInstallationRepositoriesAddedRepositoriesRemovedInner.nodeId) &&
        Objects.equals(this._private, webhookInstallationRepositoriesAddedRepositoriesRemovedInner._private);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, id, name, nodeId, _private);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookInstallationRepositoriesAddedRepositoriesRemovedInner {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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
    openapiFields.add("full_name");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("node_id");
    openapiFields.add("private");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookInstallationRepositoriesAddedRepositoriesRemovedInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookInstallationRepositoriesAddedRepositoriesRemovedInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookInstallationRepositoriesAddedRepositoriesRemovedInner is not found in the empty JSON string", WebhookInstallationRepositoriesAddedRepositoriesRemovedInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookInstallationRepositoriesAddedRepositoriesRemovedInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookInstallationRepositoriesAddedRepositoriesRemovedInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("full_name") != null && !jsonObj.get("full_name").isJsonNull()) && !jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("node_id") != null && !jsonObj.get("node_id").isJsonNull()) && !jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookInstallationRepositoriesAddedRepositoriesRemovedInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookInstallationRepositoriesAddedRepositoriesRemovedInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookInstallationRepositoriesAddedRepositoriesRemovedInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookInstallationRepositoriesAddedRepositoriesRemovedInner.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookInstallationRepositoriesAddedRepositoriesRemovedInner>() {
           @Override
           public void write(JsonWriter out, WebhookInstallationRepositoriesAddedRepositoriesRemovedInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookInstallationRepositoriesAddedRepositoriesRemovedInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookInstallationRepositoriesAddedRepositoriesRemovedInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookInstallationRepositoriesAddedRepositoriesRemovedInner
  * @throws IOException if the JSON string is invalid with respect to WebhookInstallationRepositoriesAddedRepositoriesRemovedInner
  */
  public static WebhookInstallationRepositoriesAddedRepositoriesRemovedInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookInstallationRepositoriesAddedRepositoriesRemovedInner.class);
  }

 /**
  * Convert an instance of WebhookInstallationRepositoriesAddedRepositoriesRemovedInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

