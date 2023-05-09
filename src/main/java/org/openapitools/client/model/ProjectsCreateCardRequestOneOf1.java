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
 * ProjectsCreateCardRequestOneOf1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ProjectsCreateCardRequestOneOf1 {
  public static final String SERIALIZED_NAME_CONTENT_ID = "content_id";
  @SerializedName(SERIALIZED_NAME_CONTENT_ID)
  private Integer contentId;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public ProjectsCreateCardRequestOneOf1() {
  }

  public ProjectsCreateCardRequestOneOf1 contentId(Integer contentId) {
    
    this.contentId = contentId;
    return this;
  }

   /**
   * The unique identifier of the content associated with the card
   * @return contentId
  **/
  @javax.annotation.Nonnull

  public Integer getContentId() {
    return contentId;
  }


  public void setContentId(Integer contentId) {
    this.contentId = contentId;
  }


  public ProjectsCreateCardRequestOneOf1 contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * The piece of content associated with the card
   * @return contentType
  **/
  @javax.annotation.Nonnull

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectsCreateCardRequestOneOf1 projectsCreateCardRequestOneOf1 = (ProjectsCreateCardRequestOneOf1) o;
    return Objects.equals(this.contentId, projectsCreateCardRequestOneOf1.contentId) &&
        Objects.equals(this.contentType, projectsCreateCardRequestOneOf1.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentId, contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectsCreateCardRequestOneOf1 {\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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
    openapiFields.add("content_id");
    openapiFields.add("content_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content_id");
    openapiRequiredFields.add("content_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectsCreateCardRequestOneOf1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectsCreateCardRequestOneOf1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectsCreateCardRequestOneOf1 is not found in the empty JSON string", ProjectsCreateCardRequestOneOf1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectsCreateCardRequestOneOf1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectsCreateCardRequestOneOf1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectsCreateCardRequestOneOf1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("content_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectsCreateCardRequestOneOf1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectsCreateCardRequestOneOf1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectsCreateCardRequestOneOf1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectsCreateCardRequestOneOf1.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectsCreateCardRequestOneOf1>() {
           @Override
           public void write(JsonWriter out, ProjectsCreateCardRequestOneOf1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectsCreateCardRequestOneOf1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectsCreateCardRequestOneOf1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectsCreateCardRequestOneOf1
  * @throws IOException if the JSON string is invalid with respect to ProjectsCreateCardRequestOneOf1
  */
  public static ProjectsCreateCardRequestOneOf1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectsCreateCardRequestOneOf1.class);
  }

 /**
  * Convert an instance of ProjectsCreateCardRequestOneOf1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
