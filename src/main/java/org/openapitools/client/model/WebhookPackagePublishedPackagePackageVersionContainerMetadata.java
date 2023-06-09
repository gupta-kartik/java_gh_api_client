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
import org.openapitools.client.model.WebhookPackagePublishedPackagePackageVersionContainerMetadataTag;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * WebhookPackagePublishedPackagePackageVersionContainerMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookPackagePublishedPackagePackageVersionContainerMetadata {
  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Object labels;

  public static final String SERIALIZED_NAME_MANIFEST = "manifest";
  @SerializedName(SERIALIZED_NAME_MANIFEST)
  private Object manifest;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private WebhookPackagePublishedPackagePackageVersionContainerMetadataTag tag;

  public WebhookPackagePublishedPackagePackageVersionContainerMetadata() {
  }

  public WebhookPackagePublishedPackagePackageVersionContainerMetadata labels(Object labels) {
    
    this.labels = labels;
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable

  public Object getLabels() {
    return labels;
  }


  public void setLabels(Object labels) {
    this.labels = labels;
  }


  public WebhookPackagePublishedPackagePackageVersionContainerMetadata manifest(Object manifest) {
    
    this.manifest = manifest;
    return this;
  }

   /**
   * Get manifest
   * @return manifest
  **/
  @javax.annotation.Nullable

  public Object getManifest() {
    return manifest;
  }


  public void setManifest(Object manifest) {
    this.manifest = manifest;
  }


  public WebhookPackagePublishedPackagePackageVersionContainerMetadata tag(WebhookPackagePublishedPackagePackageVersionContainerMetadataTag tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @javax.annotation.Nullable

  public WebhookPackagePublishedPackagePackageVersionContainerMetadataTag getTag() {
    return tag;
  }


  public void setTag(WebhookPackagePublishedPackagePackageVersionContainerMetadataTag tag) {
    this.tag = tag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookPackagePublishedPackagePackageVersionContainerMetadata webhookPackagePublishedPackagePackageVersionContainerMetadata = (WebhookPackagePublishedPackagePackageVersionContainerMetadata) o;
    return Objects.equals(this.labels, webhookPackagePublishedPackagePackageVersionContainerMetadata.labels) &&
        Objects.equals(this.manifest, webhookPackagePublishedPackagePackageVersionContainerMetadata.manifest) &&
        Objects.equals(this.tag, webhookPackagePublishedPackagePackageVersionContainerMetadata.tag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, manifest, tag);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPackagePublishedPackagePackageVersionContainerMetadata {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("labels");
    openapiFields.add("manifest");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookPackagePublishedPackagePackageVersionContainerMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookPackagePublishedPackagePackageVersionContainerMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookPackagePublishedPackagePackageVersionContainerMetadata is not found in the empty JSON string", WebhookPackagePublishedPackagePackageVersionContainerMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookPackagePublishedPackagePackageVersionContainerMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookPackagePublishedPackagePackageVersionContainerMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `tag`
      if (jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) {
        WebhookPackagePublishedPackagePackageVersionContainerMetadataTag.validateJsonObject(jsonObj.getAsJsonObject("tag"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookPackagePublishedPackagePackageVersionContainerMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookPackagePublishedPackagePackageVersionContainerMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookPackagePublishedPackagePackageVersionContainerMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookPackagePublishedPackagePackageVersionContainerMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookPackagePublishedPackagePackageVersionContainerMetadata>() {
           @Override
           public void write(JsonWriter out, WebhookPackagePublishedPackagePackageVersionContainerMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookPackagePublishedPackagePackageVersionContainerMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookPackagePublishedPackagePackageVersionContainerMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookPackagePublishedPackagePackageVersionContainerMetadata
  * @throws IOException if the JSON string is invalid with respect to WebhookPackagePublishedPackagePackageVersionContainerMetadata
  */
  public static WebhookPackagePublishedPackagePackageVersionContainerMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookPackagePublishedPackagePackageVersionContainerMetadata.class);
  }

 /**
  * Convert an instance of WebhookPackagePublishedPackagePackageVersionContainerMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

