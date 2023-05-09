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
 * ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private Integer appId;

  public static final String SERIALIZED_NAME_SETTING = "setting";
  @SerializedName(SERIALIZED_NAME_SETTING)
  private Boolean setting = true;

  public ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner() {
  }

  public ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner appId(Integer appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * The &#x60;id&#x60; of the GitHub App.
   * @return appId
  **/
  @javax.annotation.Nonnull

  public Integer getAppId() {
    return appId;
  }


  public void setAppId(Integer appId) {
    this.appId = appId;
  }


  public ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner setting(Boolean setting) {
    
    this.setting = setting;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to enable automatic creation of CheckSuite events upon pushes to the repository, or &#x60;false&#x60; to disable them.
   * @return setting
  **/
  @javax.annotation.Nonnull

  public Boolean getSetting() {
    return setting;
  }


  public void setSetting(Boolean setting) {
    this.setting = setting;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner checksSetSuitesPreferencesRequestAutoTriggerChecksInner = (ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner) o;
    return Objects.equals(this.appId, checksSetSuitesPreferencesRequestAutoTriggerChecksInner.appId) &&
        Objects.equals(this.setting, checksSetSuitesPreferencesRequestAutoTriggerChecksInner.setting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, setting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("setting");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("app_id");
    openapiRequiredFields.add("setting");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner is not found in the empty JSON string", ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner>() {
           @Override
           public void write(JsonWriter out, ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner
  * @throws IOException if the JSON string is invalid with respect to ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner
  */
  public static ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner.class);
  }

 /**
  * Convert an instance of ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

