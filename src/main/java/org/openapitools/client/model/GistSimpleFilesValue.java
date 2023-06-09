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
 * GistSimpleFilesValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class GistSimpleFilesValue {
  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_RAW_URL = "raw_url";
  @SerializedName(SERIALIZED_NAME_RAW_URL)
  private String rawUrl;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_TRUNCATED = "truncated";
  @SerializedName(SERIALIZED_NAME_TRUNCATED)
  private Boolean truncated;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public GistSimpleFilesValue() {
  }

  public GistSimpleFilesValue filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @javax.annotation.Nullable

  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public GistSimpleFilesValue type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public GistSimpleFilesValue language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public GistSimpleFilesValue rawUrl(String rawUrl) {
    
    this.rawUrl = rawUrl;
    return this;
  }

   /**
   * Get rawUrl
   * @return rawUrl
  **/
  @javax.annotation.Nullable

  public String getRawUrl() {
    return rawUrl;
  }


  public void setRawUrl(String rawUrl) {
    this.rawUrl = rawUrl;
  }


  public GistSimpleFilesValue size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public GistSimpleFilesValue truncated(Boolean truncated) {
    
    this.truncated = truncated;
    return this;
  }

   /**
   * Get truncated
   * @return truncated
  **/
  @javax.annotation.Nullable

  public Boolean getTruncated() {
    return truncated;
  }


  public void setTruncated(Boolean truncated) {
    this.truncated = truncated;
  }


  public GistSimpleFilesValue content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GistSimpleFilesValue gistSimpleFilesValue = (GistSimpleFilesValue) o;
    return Objects.equals(this.filename, gistSimpleFilesValue.filename) &&
        Objects.equals(this.type, gistSimpleFilesValue.type) &&
        Objects.equals(this.language, gistSimpleFilesValue.language) &&
        Objects.equals(this.rawUrl, gistSimpleFilesValue.rawUrl) &&
        Objects.equals(this.size, gistSimpleFilesValue.size) &&
        Objects.equals(this.truncated, gistSimpleFilesValue.truncated) &&
        Objects.equals(this.content, gistSimpleFilesValue.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, type, language, rawUrl, size, truncated, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GistSimpleFilesValue {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    rawUrl: ").append(toIndentedString(rawUrl)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
    openapiFields.add("filename");
    openapiFields.add("type");
    openapiFields.add("language");
    openapiFields.add("raw_url");
    openapiFields.add("size");
    openapiFields.add("truncated");
    openapiFields.add("content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GistSimpleFilesValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GistSimpleFilesValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GistSimpleFilesValue is not found in the empty JSON string", GistSimpleFilesValue.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GistSimpleFilesValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GistSimpleFilesValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("filename") != null && !jsonObj.get("filename").isJsonNull()) && !jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("raw_url") != null && !jsonObj.get("raw_url").isJsonNull()) && !jsonObj.get("raw_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `raw_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("raw_url").toString()));
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GistSimpleFilesValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GistSimpleFilesValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GistSimpleFilesValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GistSimpleFilesValue.class));

       return (TypeAdapter<T>) new TypeAdapter<GistSimpleFilesValue>() {
           @Override
           public void write(JsonWriter out, GistSimpleFilesValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GistSimpleFilesValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GistSimpleFilesValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GistSimpleFilesValue
  * @throws IOException if the JSON string is invalid with respect to GistSimpleFilesValue
  */
  public static GistSimpleFilesValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GistSimpleFilesValue.class);
  }

 /**
  * Convert an instance of GistSimpleFilesValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

