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
import org.openapitools.client.model.ActionsCacheListActionsCachesInner;

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
 * Repository actions caches
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ActionsCacheList {
  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_ACTIONS_CACHES = "actions_caches";
  @SerializedName(SERIALIZED_NAME_ACTIONS_CACHES)
  private List<ActionsCacheListActionsCachesInner> actionsCaches = new ArrayList<>();

  public ActionsCacheList() {
  }

  public ActionsCacheList totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total number of caches
   * @return totalCount
  **/
  @javax.annotation.Nonnull

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public ActionsCacheList actionsCaches(List<ActionsCacheListActionsCachesInner> actionsCaches) {
    
    this.actionsCaches = actionsCaches;
    return this;
  }

  public ActionsCacheList addActionsCachesItem(ActionsCacheListActionsCachesInner actionsCachesItem) {
    if (this.actionsCaches == null) {
      this.actionsCaches = new ArrayList<>();
    }
    this.actionsCaches.add(actionsCachesItem);
    return this;
  }

   /**
   * Array of caches
   * @return actionsCaches
  **/
  @javax.annotation.Nonnull

  public List<ActionsCacheListActionsCachesInner> getActionsCaches() {
    return actionsCaches;
  }


  public void setActionsCaches(List<ActionsCacheListActionsCachesInner> actionsCaches) {
    this.actionsCaches = actionsCaches;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionsCacheList actionsCacheList = (ActionsCacheList) o;
    return Objects.equals(this.totalCount, actionsCacheList.totalCount) &&
        Objects.equals(this.actionsCaches, actionsCacheList.actionsCaches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, actionsCaches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionsCacheList {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    actionsCaches: ").append(toIndentedString(actionsCaches)).append("\n");
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
    openapiFields.add("actions_caches");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("total_count");
    openapiRequiredFields.add("actions_caches");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActionsCacheList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ActionsCacheList.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActionsCacheList is not found in the empty JSON string", ActionsCacheList.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ActionsCacheList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActionsCacheList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ActionsCacheList.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("actions_caches").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `actions_caches` to be an array in the JSON string but got `%s`", jsonObj.get("actions_caches").toString()));
      }

      JsonArray jsonArrayactionsCaches = jsonObj.getAsJsonArray("actions_caches");
      // validate the required field `actions_caches` (array)
      for (int i = 0; i < jsonArrayactionsCaches.size(); i++) {
        ActionsCacheListActionsCachesInner.validateJsonObject(jsonArrayactionsCaches.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActionsCacheList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActionsCacheList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActionsCacheList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActionsCacheList.class));

       return (TypeAdapter<T>) new TypeAdapter<ActionsCacheList>() {
           @Override
           public void write(JsonWriter out, ActionsCacheList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActionsCacheList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActionsCacheList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActionsCacheList
  * @throws IOException if the JSON string is invalid with respect to ActionsCacheList
  */
  public static ActionsCacheList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActionsCacheList.class);
  }

 /**
  * Convert an instance of ActionsCacheList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

