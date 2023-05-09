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
 * AppsCreateFromManifest201ResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class AppsCreateFromManifest201ResponseAllOf {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_WEBHOOK_SECRET = "webhook_secret";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_SECRET)
  private String webhookSecret;

  public static final String SERIALIZED_NAME_PEM = "pem";
  @SerializedName(SERIALIZED_NAME_PEM)
  private String pem;

  public AppsCreateFromManifest201ResponseAllOf() {
  }

  public AppsCreateFromManifest201ResponseAllOf clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nonnull

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public AppsCreateFromManifest201ResponseAllOf clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  @javax.annotation.Nonnull

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public AppsCreateFromManifest201ResponseAllOf webhookSecret(String webhookSecret) {
    
    this.webhookSecret = webhookSecret;
    return this;
  }

   /**
   * Get webhookSecret
   * @return webhookSecret
  **/
  @javax.annotation.Nullable

  public String getWebhookSecret() {
    return webhookSecret;
  }


  public void setWebhookSecret(String webhookSecret) {
    this.webhookSecret = webhookSecret;
  }


  public AppsCreateFromManifest201ResponseAllOf pem(String pem) {
    
    this.pem = pem;
    return this;
  }

   /**
   * Get pem
   * @return pem
  **/
  @javax.annotation.Nonnull

  public String getPem() {
    return pem;
  }


  public void setPem(String pem) {
    this.pem = pem;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AppsCreateFromManifest201ResponseAllOf instance itself
   */
  public AppsCreateFromManifest201ResponseAllOf putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppsCreateFromManifest201ResponseAllOf appsCreateFromManifest201ResponseAllOf = (AppsCreateFromManifest201ResponseAllOf) o;
    return Objects.equals(this.clientId, appsCreateFromManifest201ResponseAllOf.clientId) &&
        Objects.equals(this.clientSecret, appsCreateFromManifest201ResponseAllOf.clientSecret) &&
        Objects.equals(this.webhookSecret, appsCreateFromManifest201ResponseAllOf.webhookSecret) &&
        Objects.equals(this.pem, appsCreateFromManifest201ResponseAllOf.pem)&&
        Objects.equals(this.additionalProperties, appsCreateFromManifest201ResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, webhookSecret, pem, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppsCreateFromManifest201ResponseAllOf {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
    sb.append("    pem: ").append(toIndentedString(pem)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("client_id");
    openapiFields.add("client_secret");
    openapiFields.add("webhook_secret");
    openapiFields.add("pem");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("client_id");
    openapiRequiredFields.add("client_secret");
    openapiRequiredFields.add("webhook_secret");
    openapiRequiredFields.add("pem");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AppsCreateFromManifest201ResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AppsCreateFromManifest201ResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppsCreateFromManifest201ResponseAllOf is not found in the empty JSON string", AppsCreateFromManifest201ResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AppsCreateFromManifest201ResponseAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_id").toString()));
      }
      if (!jsonObj.get("client_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_secret").toString()));
      }
      if (!jsonObj.get("webhook_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhook_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhook_secret").toString()));
      }
      if (!jsonObj.get("pem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pem").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppsCreateFromManifest201ResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppsCreateFromManifest201ResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppsCreateFromManifest201ResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppsCreateFromManifest201ResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<AppsCreateFromManifest201ResponseAllOf>() {
           @Override
           public void write(JsonWriter out, AppsCreateFromManifest201ResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AppsCreateFromManifest201ResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AppsCreateFromManifest201ResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppsCreateFromManifest201ResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppsCreateFromManifest201ResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to AppsCreateFromManifest201ResponseAllOf
  */
  public static AppsCreateFromManifest201ResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppsCreateFromManifest201ResponseAllOf.class);
  }

 /**
  * Convert an instance of AppsCreateFromManifest201ResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
