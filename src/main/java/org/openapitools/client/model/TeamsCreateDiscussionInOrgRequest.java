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
 * TeamsCreateDiscussionInOrgRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class TeamsCreateDiscussionInOrgRequest {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_PRIVATE = "private";
  @SerializedName(SERIALIZED_NAME_PRIVATE)
  private Boolean _private = false;

  public TeamsCreateDiscussionInOrgRequest() {
  }

  public TeamsCreateDiscussionInOrgRequest title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The discussion post&#39;s title.
   * @return title
  **/
  @javax.annotation.Nonnull

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public TeamsCreateDiscussionInOrgRequest body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * The discussion post&#39;s body text.
   * @return body
  **/
  @javax.annotation.Nonnull

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public TeamsCreateDiscussionInOrgRequest _private(Boolean _private) {
    
    this._private = _private;
    return this;
  }

   /**
   * Private posts are only visible to team members, organization owners, and team maintainers. Public posts are visible to all members of the organization. Set to &#x60;true&#x60; to create a private post.
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
    TeamsCreateDiscussionInOrgRequest teamsCreateDiscussionInOrgRequest = (TeamsCreateDiscussionInOrgRequest) o;
    return Objects.equals(this.title, teamsCreateDiscussionInOrgRequest.title) &&
        Objects.equals(this.body, teamsCreateDiscussionInOrgRequest.body) &&
        Objects.equals(this._private, teamsCreateDiscussionInOrgRequest._private);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, body, _private);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsCreateDiscussionInOrgRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("body");
    openapiFields.add("private");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("body");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TeamsCreateDiscussionInOrgRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TeamsCreateDiscussionInOrgRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TeamsCreateDiscussionInOrgRequest is not found in the empty JSON string", TeamsCreateDiscussionInOrgRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TeamsCreateDiscussionInOrgRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TeamsCreateDiscussionInOrgRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TeamsCreateDiscussionInOrgRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TeamsCreateDiscussionInOrgRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TeamsCreateDiscussionInOrgRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TeamsCreateDiscussionInOrgRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TeamsCreateDiscussionInOrgRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TeamsCreateDiscussionInOrgRequest>() {
           @Override
           public void write(JsonWriter out, TeamsCreateDiscussionInOrgRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TeamsCreateDiscussionInOrgRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TeamsCreateDiscussionInOrgRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TeamsCreateDiscussionInOrgRequest
  * @throws IOException if the JSON string is invalid with respect to TeamsCreateDiscussionInOrgRequest
  */
  public static TeamsCreateDiscussionInOrgRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TeamsCreateDiscussionInOrgRequest.class);
  }

 /**
  * Convert an instance of TeamsCreateDiscussionInOrgRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
