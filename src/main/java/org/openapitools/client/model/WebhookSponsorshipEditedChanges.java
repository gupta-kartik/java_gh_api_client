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
import org.openapitools.client.model.WebhookSponsorshipEditedChangesPrivacyLevel;

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
 * WebhookSponsorshipEditedChanges
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookSponsorshipEditedChanges {
  public static final String SERIALIZED_NAME_PRIVACY_LEVEL = "privacy_level";
  @SerializedName(SERIALIZED_NAME_PRIVACY_LEVEL)
  private WebhookSponsorshipEditedChangesPrivacyLevel privacyLevel;

  public WebhookSponsorshipEditedChanges() {
  }

  public WebhookSponsorshipEditedChanges privacyLevel(WebhookSponsorshipEditedChangesPrivacyLevel privacyLevel) {
    
    this.privacyLevel = privacyLevel;
    return this;
  }

   /**
   * Get privacyLevel
   * @return privacyLevel
  **/
  @javax.annotation.Nullable

  public WebhookSponsorshipEditedChangesPrivacyLevel getPrivacyLevel() {
    return privacyLevel;
  }


  public void setPrivacyLevel(WebhookSponsorshipEditedChangesPrivacyLevel privacyLevel) {
    this.privacyLevel = privacyLevel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookSponsorshipEditedChanges webhookSponsorshipEditedChanges = (WebhookSponsorshipEditedChanges) o;
    return Objects.equals(this.privacyLevel, webhookSponsorshipEditedChanges.privacyLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privacyLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSponsorshipEditedChanges {\n");
    sb.append("    privacyLevel: ").append(toIndentedString(privacyLevel)).append("\n");
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
    openapiFields.add("privacy_level");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookSponsorshipEditedChanges
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookSponsorshipEditedChanges.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookSponsorshipEditedChanges is not found in the empty JSON string", WebhookSponsorshipEditedChanges.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookSponsorshipEditedChanges.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookSponsorshipEditedChanges` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `privacy_level`
      if (jsonObj.get("privacy_level") != null && !jsonObj.get("privacy_level").isJsonNull()) {
        WebhookSponsorshipEditedChangesPrivacyLevel.validateJsonObject(jsonObj.getAsJsonObject("privacy_level"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookSponsorshipEditedChanges.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookSponsorshipEditedChanges' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookSponsorshipEditedChanges> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookSponsorshipEditedChanges.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookSponsorshipEditedChanges>() {
           @Override
           public void write(JsonWriter out, WebhookSponsorshipEditedChanges value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookSponsorshipEditedChanges read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookSponsorshipEditedChanges given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookSponsorshipEditedChanges
  * @throws IOException if the JSON string is invalid with respect to WebhookSponsorshipEditedChanges
  */
  public static WebhookSponsorshipEditedChanges fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookSponsorshipEditedChanges.class);
  }

 /**
  * Convert an instance of WebhookSponsorshipEditedChanges to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

