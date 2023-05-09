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
 * WebhookPackageUpdatedPackagePackageVersionPackageFilesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookPackageUpdatedPackagePackageVersionPackageFilesInner {
  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private URI downloadUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MD5 = "md5";
  @SerializedName(SERIALIZED_NAME_MD5)
  private String md5;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHA1 = "sha1";
  @SerializedName(SERIALIZED_NAME_SHA1)
  private String sha1;

  public static final String SERIALIZED_NAME_SHA256 = "sha256";
  @SerializedName(SERIALIZED_NAME_SHA256)
  private String sha256;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public WebhookPackageUpdatedPackagePackageVersionPackageFilesInner() {
  }

  public WebhookPackageUpdatedPackagePackageVersionPackageFilesInner contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @javax.annotation.Nonnull

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public WebhookPackageUpdatedPackagePackageVersionPackageFilesInner createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookPackageUpdatedPackagePackageVersionPackageFilesInner downloadUrl(URI downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  @javax.annotation.Nonnull

  public URI getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(URI downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public WebhookPackageUpdatedPackagePackageVersionPackageFilesInner id(Integer id) {
    
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


  public WebhookPackageUpdatedPackagePackageVersionPackageFilesInner md5(String md5) {
    
    this.md5 = md5;
    return this;
  }

   /**
   * Get md5
   * @return md5
  **/
  @javax.annotation.Nullable

  public String getMd5() {
    return md5;
  }


  public void setMd5(String md5) {
    this.md5 = md5;
  }


  public WebhookPackageUpdatedPackagePackageVersionPackageFilesInner name(String name) {
    
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


  public WebhookPackageUpdatedPackagePackageVersionPackageFilesInner sha1(String sha1) {
    
    this.sha1 = sha1;
    return this;
  }

   /**
   * Get sha1
   * @return sha1
  **/
  @javax.annotation.Nullable

  public String getSha1() {
    return sha1;
  }


  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }


  public WebhookPackageUpdatedPackagePackageVersionPackageFilesInner sha256(String sha256) {
    
    this.sha256 = sha256;
    return this;
  }

   /**
   * Get sha256
   * @return sha256
  **/
  @javax.annotation.Nonnull

  public String getSha256() {
    return sha256;
  }


  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }


  public WebhookPackageUpdatedPackagePackageVersionPackageFilesInner size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nonnull

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public WebhookPackageUpdatedPackagePackageVersionPackageFilesInner state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public WebhookPackageUpdatedPackagePackageVersionPackageFilesInner updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookPackageUpdatedPackagePackageVersionPackageFilesInner webhookPackageUpdatedPackagePackageVersionPackageFilesInner = (WebhookPackageUpdatedPackagePackageVersionPackageFilesInner) o;
    return Objects.equals(this.contentType, webhookPackageUpdatedPackagePackageVersionPackageFilesInner.contentType) &&
        Objects.equals(this.createdAt, webhookPackageUpdatedPackagePackageVersionPackageFilesInner.createdAt) &&
        Objects.equals(this.downloadUrl, webhookPackageUpdatedPackagePackageVersionPackageFilesInner.downloadUrl) &&
        Objects.equals(this.id, webhookPackageUpdatedPackagePackageVersionPackageFilesInner.id) &&
        Objects.equals(this.md5, webhookPackageUpdatedPackagePackageVersionPackageFilesInner.md5) &&
        Objects.equals(this.name, webhookPackageUpdatedPackagePackageVersionPackageFilesInner.name) &&
        Objects.equals(this.sha1, webhookPackageUpdatedPackagePackageVersionPackageFilesInner.sha1) &&
        Objects.equals(this.sha256, webhookPackageUpdatedPackagePackageVersionPackageFilesInner.sha256) &&
        Objects.equals(this.size, webhookPackageUpdatedPackagePackageVersionPackageFilesInner.size) &&
        Objects.equals(this.state, webhookPackageUpdatedPackagePackageVersionPackageFilesInner.state) &&
        Objects.equals(this.updatedAt, webhookPackageUpdatedPackagePackageVersionPackageFilesInner.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, createdAt, downloadUrl, id, md5, name, sha1, sha256, size, state, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPackageUpdatedPackagePackageVersionPackageFilesInner {\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("content_type");
    openapiFields.add("created_at");
    openapiFields.add("download_url");
    openapiFields.add("id");
    openapiFields.add("md5");
    openapiFields.add("name");
    openapiFields.add("sha1");
    openapiFields.add("sha256");
    openapiFields.add("size");
    openapiFields.add("state");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content_type");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("download_url");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("md5");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("sha1");
    openapiRequiredFields.add("sha256");
    openapiRequiredFields.add("size");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookPackageUpdatedPackagePackageVersionPackageFilesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookPackageUpdatedPackagePackageVersionPackageFilesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookPackageUpdatedPackagePackageVersionPackageFilesInner is not found in the empty JSON string", WebhookPackageUpdatedPackagePackageVersionPackageFilesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookPackageUpdatedPackagePackageVersionPackageFilesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookPackageUpdatedPackagePackageVersionPackageFilesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookPackageUpdatedPackagePackageVersionPackageFilesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("content_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_type").toString()));
      }
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (!jsonObj.get("download_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `download_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("download_url").toString()));
      }
      if (!jsonObj.get("md5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `md5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("md5").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("sha1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha1").toString()));
      }
      if (!jsonObj.get("sha256").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha256` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha256").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookPackageUpdatedPackagePackageVersionPackageFilesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookPackageUpdatedPackagePackageVersionPackageFilesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookPackageUpdatedPackagePackageVersionPackageFilesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookPackageUpdatedPackagePackageVersionPackageFilesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookPackageUpdatedPackagePackageVersionPackageFilesInner>() {
           @Override
           public void write(JsonWriter out, WebhookPackageUpdatedPackagePackageVersionPackageFilesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookPackageUpdatedPackagePackageVersionPackageFilesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookPackageUpdatedPackagePackageVersionPackageFilesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookPackageUpdatedPackagePackageVersionPackageFilesInner
  * @throws IOException if the JSON string is invalid with respect to WebhookPackageUpdatedPackagePackageVersionPackageFilesInner
  */
  public static WebhookPackageUpdatedPackagePackageVersionPackageFilesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookPackageUpdatedPackagePackageVersionPackageFilesInner.class);
  }

 /**
  * Convert an instance of WebhookPackageUpdatedPackagePackageVersionPackageFilesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

