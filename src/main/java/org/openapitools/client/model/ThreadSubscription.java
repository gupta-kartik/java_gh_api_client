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
 * Thread Subscription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ThreadSubscription {
  public static final String SERIALIZED_NAME_SUBSCRIBED = "subscribed";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED)
  private Boolean subscribed;

  public static final String SERIALIZED_NAME_IGNORED = "ignored";
  @SerializedName(SERIALIZED_NAME_IGNORED)
  private Boolean ignored;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_THREAD_URL = "thread_url";
  @SerializedName(SERIALIZED_NAME_THREAD_URL)
  private URI threadUrl;

  public static final String SERIALIZED_NAME_REPOSITORY_URL = "repository_url";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_URL)
  private URI repositoryUrl;

  public ThreadSubscription() {
  }

  public ThreadSubscription subscribed(Boolean subscribed) {
    
    this.subscribed = subscribed;
    return this;
  }

   /**
   * Get subscribed
   * @return subscribed
  **/
  @javax.annotation.Nonnull

  public Boolean getSubscribed() {
    return subscribed;
  }


  public void setSubscribed(Boolean subscribed) {
    this.subscribed = subscribed;
  }


  public ThreadSubscription ignored(Boolean ignored) {
    
    this.ignored = ignored;
    return this;
  }

   /**
   * Get ignored
   * @return ignored
  **/
  @javax.annotation.Nonnull

  public Boolean getIgnored() {
    return ignored;
  }


  public void setIgnored(Boolean ignored) {
    this.ignored = ignored;
  }


  public ThreadSubscription reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public ThreadSubscription createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ThreadSubscription url(URI url) {
    
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


  public ThreadSubscription threadUrl(URI threadUrl) {
    
    this.threadUrl = threadUrl;
    return this;
  }

   /**
   * Get threadUrl
   * @return threadUrl
  **/
  @javax.annotation.Nullable

  public URI getThreadUrl() {
    return threadUrl;
  }


  public void setThreadUrl(URI threadUrl) {
    this.threadUrl = threadUrl;
  }


  public ThreadSubscription repositoryUrl(URI repositoryUrl) {
    
    this.repositoryUrl = repositoryUrl;
    return this;
  }

   /**
   * Get repositoryUrl
   * @return repositoryUrl
  **/
  @javax.annotation.Nullable

  public URI getRepositoryUrl() {
    return repositoryUrl;
  }


  public void setRepositoryUrl(URI repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreadSubscription threadSubscription = (ThreadSubscription) o;
    return Objects.equals(this.subscribed, threadSubscription.subscribed) &&
        Objects.equals(this.ignored, threadSubscription.ignored) &&
        Objects.equals(this.reason, threadSubscription.reason) &&
        Objects.equals(this.createdAt, threadSubscription.createdAt) &&
        Objects.equals(this.url, threadSubscription.url) &&
        Objects.equals(this.threadUrl, threadSubscription.threadUrl) &&
        Objects.equals(this.repositoryUrl, threadSubscription.repositoryUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscribed, ignored, reason, createdAt, url, threadUrl, repositoryUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreadSubscription {\n");
    sb.append("    subscribed: ").append(toIndentedString(subscribed)).append("\n");
    sb.append("    ignored: ").append(toIndentedString(ignored)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    threadUrl: ").append(toIndentedString(threadUrl)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
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
    openapiFields.add("subscribed");
    openapiFields.add("ignored");
    openapiFields.add("reason");
    openapiFields.add("created_at");
    openapiFields.add("url");
    openapiFields.add("thread_url");
    openapiFields.add("repository_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subscribed");
    openapiRequiredFields.add("ignored");
    openapiRequiredFields.add("reason");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThreadSubscription
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ThreadSubscription.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThreadSubscription is not found in the empty JSON string", ThreadSubscription.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ThreadSubscription.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ThreadSubscription` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ThreadSubscription.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("thread_url") != null && !jsonObj.get("thread_url").isJsonNull()) && !jsonObj.get("thread_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thread_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thread_url").toString()));
      }
      if ((jsonObj.get("repository_url") != null && !jsonObj.get("repository_url").isJsonNull()) && !jsonObj.get("repository_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repository_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repository_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThreadSubscription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThreadSubscription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThreadSubscription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThreadSubscription.class));

       return (TypeAdapter<T>) new TypeAdapter<ThreadSubscription>() {
           @Override
           public void write(JsonWriter out, ThreadSubscription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThreadSubscription read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ThreadSubscription given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThreadSubscription
  * @throws IOException if the JSON string is invalid with respect to ThreadSubscription
  */
  public static ThreadSubscription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThreadSubscription.class);
  }

 /**
  * Convert an instance of ThreadSubscription to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
