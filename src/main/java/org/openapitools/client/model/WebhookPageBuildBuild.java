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
import org.openapitools.client.model.PageBuildError;
import org.openapitools.client.model.User;

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
 * The [List GitHub Pages builds](https://docs.github.com/rest/reference/repos#list-github-pages-builds) itself.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookPageBuildBuild {
  public static final String SERIALIZED_NAME_COMMIT = "commit";
  @SerializedName(SERIALIZED_NAME_COMMIT)
  private String commit;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PageBuildError error;

  public static final String SERIALIZED_NAME_PUSHER = "pusher";
  @SerializedName(SERIALIZED_NAME_PUSHER)
  private User pusher;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public WebhookPageBuildBuild() {
  }

  public WebhookPageBuildBuild commit(String commit) {
    
    this.commit = commit;
    return this;
  }

   /**
   * Get commit
   * @return commit
  **/
  @javax.annotation.Nullable

  public String getCommit() {
    return commit;
  }


  public void setCommit(String commit) {
    this.commit = commit;
  }


  public WebhookPageBuildBuild createdAt(String createdAt) {
    
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


  public WebhookPageBuildBuild duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nonnull

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public WebhookPageBuildBuild error(PageBuildError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nonnull

  public PageBuildError getError() {
    return error;
  }


  public void setError(PageBuildError error) {
    this.error = error;
  }


  public WebhookPageBuildBuild pusher(User pusher) {
    
    this.pusher = pusher;
    return this;
  }

   /**
   * Get pusher
   * @return pusher
  **/
  @javax.annotation.Nullable

  public User getPusher() {
    return pusher;
  }


  public void setPusher(User pusher) {
    this.pusher = pusher;
  }


  public WebhookPageBuildBuild status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public WebhookPageBuildBuild updatedAt(String updatedAt) {
    
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


  public WebhookPageBuildBuild url(URI url) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookPageBuildBuild webhookPageBuildBuild = (WebhookPageBuildBuild) o;
    return Objects.equals(this.commit, webhookPageBuildBuild.commit) &&
        Objects.equals(this.createdAt, webhookPageBuildBuild.createdAt) &&
        Objects.equals(this.duration, webhookPageBuildBuild.duration) &&
        Objects.equals(this.error, webhookPageBuildBuild.error) &&
        Objects.equals(this.pusher, webhookPageBuildBuild.pusher) &&
        Objects.equals(this.status, webhookPageBuildBuild.status) &&
        Objects.equals(this.updatedAt, webhookPageBuildBuild.updatedAt) &&
        Objects.equals(this.url, webhookPageBuildBuild.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commit, createdAt, duration, error, pusher, status, updatedAt, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPageBuildBuild {\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    pusher: ").append(toIndentedString(pusher)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("commit");
    openapiFields.add("created_at");
    openapiFields.add("duration");
    openapiFields.add("error");
    openapiFields.add("pusher");
    openapiFields.add("status");
    openapiFields.add("updated_at");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("commit");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("duration");
    openapiRequiredFields.add("error");
    openapiRequiredFields.add("pusher");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookPageBuildBuild
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookPageBuildBuild.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookPageBuildBuild is not found in the empty JSON string", WebhookPageBuildBuild.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookPageBuildBuild.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookPageBuildBuild` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookPageBuildBuild.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("commit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit").toString()));
      }
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      // validate the required field `error`
      PageBuildError.validateJsonObject(jsonObj.getAsJsonObject("error"));
      // validate the required field `pusher`
      User.validateJsonObject(jsonObj.getAsJsonObject("pusher"));
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookPageBuildBuild.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookPageBuildBuild' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookPageBuildBuild> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookPageBuildBuild.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookPageBuildBuild>() {
           @Override
           public void write(JsonWriter out, WebhookPageBuildBuild value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookPageBuildBuild read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookPageBuildBuild given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookPageBuildBuild
  * @throws IOException if the JSON string is invalid with respect to WebhookPageBuildBuild
  */
  public static WebhookPageBuildBuild fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookPageBuildBuild.class);
  }

 /**
  * Convert an instance of WebhookPageBuildBuild to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

