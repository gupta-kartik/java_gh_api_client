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
import org.openapitools.client.model.WebhookConfigInsecureSsl;

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
 * ReposUpdateWebhookConfigForRepoRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ReposUpdateWebhookConfigForRepoRequest {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_INSECURE_SSL = "insecure_ssl";
  @SerializedName(SERIALIZED_NAME_INSECURE_SSL)
  private WebhookConfigInsecureSsl insecureSsl;

  public ReposUpdateWebhookConfigForRepoRequest() {
  }

  public ReposUpdateWebhookConfigForRepoRequest url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL to which the payloads will be delivered.
   * @return url
  **/
  @javax.annotation.Nullable

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public ReposUpdateWebhookConfigForRepoRequest contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * The media type used to serialize the payloads. Supported values include &#x60;json&#x60; and &#x60;form&#x60;. The default is &#x60;form&#x60;.
   * @return contentType
  **/
  @javax.annotation.Nullable

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public ReposUpdateWebhookConfigForRepoRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * If provided, the &#x60;secret&#x60; will be used as the &#x60;key&#x60; to generate the HMAC hex digest value for [delivery signature headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers).
   * @return secret
  **/
  @javax.annotation.Nullable

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public ReposUpdateWebhookConfigForRepoRequest insecureSsl(WebhookConfigInsecureSsl insecureSsl) {
    
    this.insecureSsl = insecureSsl;
    return this;
  }

   /**
   * Get insecureSsl
   * @return insecureSsl
  **/
  @javax.annotation.Nullable

  public WebhookConfigInsecureSsl getInsecureSsl() {
    return insecureSsl;
  }


  public void setInsecureSsl(WebhookConfigInsecureSsl insecureSsl) {
    this.insecureSsl = insecureSsl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReposUpdateWebhookConfigForRepoRequest reposUpdateWebhookConfigForRepoRequest = (ReposUpdateWebhookConfigForRepoRequest) o;
    return Objects.equals(this.url, reposUpdateWebhookConfigForRepoRequest.url) &&
        Objects.equals(this.contentType, reposUpdateWebhookConfigForRepoRequest.contentType) &&
        Objects.equals(this.secret, reposUpdateWebhookConfigForRepoRequest.secret) &&
        Objects.equals(this.insecureSsl, reposUpdateWebhookConfigForRepoRequest.insecureSsl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, contentType, secret, insecureSsl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReposUpdateWebhookConfigForRepoRequest {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    insecureSsl: ").append(toIndentedString(insecureSsl)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("content_type");
    openapiFields.add("secret");
    openapiFields.add("insecure_ssl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReposUpdateWebhookConfigForRepoRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReposUpdateWebhookConfigForRepoRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReposUpdateWebhookConfigForRepoRequest is not found in the empty JSON string", ReposUpdateWebhookConfigForRepoRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReposUpdateWebhookConfigForRepoRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReposUpdateWebhookConfigForRepoRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("content_type") != null && !jsonObj.get("content_type").isJsonNull()) && !jsonObj.get("content_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_type").toString()));
      }
      if ((jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonNull()) && !jsonObj.get("secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret").toString()));
      }
      // validate the optional field `insecure_ssl`
      if (jsonObj.get("insecure_ssl") != null && !jsonObj.get("insecure_ssl").isJsonNull()) {
        WebhookConfigInsecureSsl.validateJsonObject(jsonObj.getAsJsonObject("insecure_ssl"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReposUpdateWebhookConfigForRepoRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReposUpdateWebhookConfigForRepoRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReposUpdateWebhookConfigForRepoRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReposUpdateWebhookConfigForRepoRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReposUpdateWebhookConfigForRepoRequest>() {
           @Override
           public void write(JsonWriter out, ReposUpdateWebhookConfigForRepoRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReposUpdateWebhookConfigForRepoRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReposUpdateWebhookConfigForRepoRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReposUpdateWebhookConfigForRepoRequest
  * @throws IOException if the JSON string is invalid with respect to ReposUpdateWebhookConfigForRepoRequest
  */
  public static ReposUpdateWebhookConfigForRepoRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReposUpdateWebhookConfigForRepoRequest.class);
  }

 /**
  * Convert an instance of ReposUpdateWebhookConfigForRepoRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

