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
 * WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata {
  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Object labels;

  public static final String SERIALIZED_NAME_MANIFEST = "manifest";
  @SerializedName(SERIALIZED_NAME_MANIFEST)
  private Object manifest;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private WebhookPackagePublishedPackagePackageVersionContainerMetadataTag tag;

  public WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata() {
  }

  public WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata labels(Object labels) {
    
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


  public WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata manifest(Object manifest) {
    
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


  public WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata tag(WebhookPackagePublishedPackagePackageVersionContainerMetadataTag tag) {
    
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
    WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata webhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata = (WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata) o;
    return Objects.equals(this.labels, webhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata.labels) &&
        Objects.equals(this.manifest, webhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata.manifest) &&
        Objects.equals(this.tag, webhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata.tag);
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
    sb.append("class WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata is not found in the empty JSON string", WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata>() {
           @Override
           public void write(JsonWriter out, WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata
  * @throws IOException if the JSON string is invalid with respect to WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata
  */
  public static WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata.class);
  }

 /**
  * Convert an instance of WebhookRegistryPackagePublishedRegistryPackagePackageVersionContainerMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
