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
import org.openapitools.client.model.WebhookMemberEditedChangesPermission;
import org.openapitools.client.model.WebhookProjectsV2ProjectEditedChangesPublic;
import org.openapitools.client.model.WebhookProjectsV2ProjectEditedChangesTitle;

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
 * WebhookProjectsV2ProjectEditedChanges
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookProjectsV2ProjectEditedChanges {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private WebhookMemberEditedChangesPermission description;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private WebhookProjectsV2ProjectEditedChangesPublic _public;

  public static final String SERIALIZED_NAME_SHORT_DESCRIPTION = "short_description";
  @SerializedName(SERIALIZED_NAME_SHORT_DESCRIPTION)
  private WebhookMemberEditedChangesPermission shortDescription;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private WebhookProjectsV2ProjectEditedChangesTitle title;

  public WebhookProjectsV2ProjectEditedChanges() {
  }

  public WebhookProjectsV2ProjectEditedChanges description(WebhookMemberEditedChangesPermission description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable

  public WebhookMemberEditedChangesPermission getDescription() {
    return description;
  }


  public void setDescription(WebhookMemberEditedChangesPermission description) {
    this.description = description;
  }


  public WebhookProjectsV2ProjectEditedChanges _public(WebhookProjectsV2ProjectEditedChangesPublic _public) {
    
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  @javax.annotation.Nullable

  public WebhookProjectsV2ProjectEditedChangesPublic getPublic() {
    return _public;
  }


  public void setPublic(WebhookProjectsV2ProjectEditedChangesPublic _public) {
    this._public = _public;
  }


  public WebhookProjectsV2ProjectEditedChanges shortDescription(WebhookMemberEditedChangesPermission shortDescription) {
    
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * Get shortDescription
   * @return shortDescription
  **/
  @javax.annotation.Nullable

  public WebhookMemberEditedChangesPermission getShortDescription() {
    return shortDescription;
  }


  public void setShortDescription(WebhookMemberEditedChangesPermission shortDescription) {
    this.shortDescription = shortDescription;
  }


  public WebhookProjectsV2ProjectEditedChanges title(WebhookProjectsV2ProjectEditedChangesTitle title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable

  public WebhookProjectsV2ProjectEditedChangesTitle getTitle() {
    return title;
  }


  public void setTitle(WebhookProjectsV2ProjectEditedChangesTitle title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookProjectsV2ProjectEditedChanges webhookProjectsV2ProjectEditedChanges = (WebhookProjectsV2ProjectEditedChanges) o;
    return Objects.equals(this.description, webhookProjectsV2ProjectEditedChanges.description) &&
        Objects.equals(this._public, webhookProjectsV2ProjectEditedChanges._public) &&
        Objects.equals(this.shortDescription, webhookProjectsV2ProjectEditedChanges.shortDescription) &&
        Objects.equals(this.title, webhookProjectsV2ProjectEditedChanges.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, _public, shortDescription, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookProjectsV2ProjectEditedChanges {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("public");
    openapiFields.add("short_description");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookProjectsV2ProjectEditedChanges
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookProjectsV2ProjectEditedChanges.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookProjectsV2ProjectEditedChanges is not found in the empty JSON string", WebhookProjectsV2ProjectEditedChanges.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookProjectsV2ProjectEditedChanges.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookProjectsV2ProjectEditedChanges` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `description`
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) {
        WebhookMemberEditedChangesPermission.validateJsonObject(jsonObj.getAsJsonObject("description"));
      }
      // validate the optional field `public`
      if (jsonObj.get("public") != null && !jsonObj.get("public").isJsonNull()) {
        WebhookProjectsV2ProjectEditedChangesPublic.validateJsonObject(jsonObj.getAsJsonObject("public"));
      }
      // validate the optional field `short_description`
      if (jsonObj.get("short_description") != null && !jsonObj.get("short_description").isJsonNull()) {
        WebhookMemberEditedChangesPermission.validateJsonObject(jsonObj.getAsJsonObject("short_description"));
      }
      // validate the optional field `title`
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) {
        WebhookProjectsV2ProjectEditedChangesTitle.validateJsonObject(jsonObj.getAsJsonObject("title"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookProjectsV2ProjectEditedChanges.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookProjectsV2ProjectEditedChanges' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookProjectsV2ProjectEditedChanges> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookProjectsV2ProjectEditedChanges.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookProjectsV2ProjectEditedChanges>() {
           @Override
           public void write(JsonWriter out, WebhookProjectsV2ProjectEditedChanges value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookProjectsV2ProjectEditedChanges read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookProjectsV2ProjectEditedChanges given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookProjectsV2ProjectEditedChanges
  * @throws IOException if the JSON string is invalid with respect to WebhookProjectsV2ProjectEditedChanges
  */
  public static WebhookProjectsV2ProjectEditedChanges fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookProjectsV2ProjectEditedChanges.class);
  }

 /**
  * Convert an instance of WebhookProjectsV2ProjectEditedChanges to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

