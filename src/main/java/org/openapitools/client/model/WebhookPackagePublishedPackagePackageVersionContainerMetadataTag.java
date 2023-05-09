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
 * WebhookPackagePublishedPackagePackageVersionContainerMetadataTag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookPackagePublishedPackagePackageVersionContainerMetadataTag {
  public static final String SERIALIZED_NAME_DIGEST = "digest";
  @SerializedName(SERIALIZED_NAME_DIGEST)
  private String digest;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public WebhookPackagePublishedPackagePackageVersionContainerMetadataTag() {
  }

  public WebhookPackagePublishedPackagePackageVersionContainerMetadataTag digest(String digest) {
    
    this.digest = digest;
    return this;
  }

   /**
   * Get digest
   * @return digest
  **/
  @javax.annotation.Nullable

  public String getDigest() {
    return digest;
  }


  public void setDigest(String digest) {
    this.digest = digest;
  }


  public WebhookPackagePublishedPackagePackageVersionContainerMetadataTag name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookPackagePublishedPackagePackageVersionContainerMetadataTag webhookPackagePublishedPackagePackageVersionContainerMetadataTag = (WebhookPackagePublishedPackagePackageVersionContainerMetadataTag) o;
    return Objects.equals(this.digest, webhookPackagePublishedPackagePackageVersionContainerMetadataTag.digest) &&
        Objects.equals(this.name, webhookPackagePublishedPackagePackageVersionContainerMetadataTag.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digest, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPackagePublishedPackagePackageVersionContainerMetadataTag {\n");
    sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("digest");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookPackagePublishedPackagePackageVersionContainerMetadataTag
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookPackagePublishedPackagePackageVersionContainerMetadataTag.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookPackagePublishedPackagePackageVersionContainerMetadataTag is not found in the empty JSON string", WebhookPackagePublishedPackagePackageVersionContainerMetadataTag.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookPackagePublishedPackagePackageVersionContainerMetadataTag.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookPackagePublishedPackagePackageVersionContainerMetadataTag` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("digest") != null && !jsonObj.get("digest").isJsonNull()) && !jsonObj.get("digest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `digest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("digest").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookPackagePublishedPackagePackageVersionContainerMetadataTag.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookPackagePublishedPackagePackageVersionContainerMetadataTag' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookPackagePublishedPackagePackageVersionContainerMetadataTag> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookPackagePublishedPackagePackageVersionContainerMetadataTag.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookPackagePublishedPackagePackageVersionContainerMetadataTag>() {
           @Override
           public void write(JsonWriter out, WebhookPackagePublishedPackagePackageVersionContainerMetadataTag value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookPackagePublishedPackagePackageVersionContainerMetadataTag read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookPackagePublishedPackagePackageVersionContainerMetadataTag given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookPackagePublishedPackagePackageVersionContainerMetadataTag
  * @throws IOException if the JSON string is invalid with respect to WebhookPackagePublishedPackagePackageVersionContainerMetadataTag
  */
  public static WebhookPackagePublishedPackagePackageVersionContainerMetadataTag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookPackagePublishedPackagePackageVersionContainerMetadataTag.class);
  }

 /**
  * Convert an instance of WebhookPackagePublishedPackagePackageVersionContainerMetadataTag to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

