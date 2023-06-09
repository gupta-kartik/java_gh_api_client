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
 * The public key used for setting user Codespaces&#39; Secrets.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class CodespacesUserPublicKey {
  public static final String SERIALIZED_NAME_KEY_ID = "key_id";
  @SerializedName(SERIALIZED_NAME_KEY_ID)
  private String keyId;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public CodespacesUserPublicKey() {
  }

  public CodespacesUserPublicKey keyId(String keyId) {
    
    this.keyId = keyId;
    return this;
  }

   /**
   * The identifier for the key.
   * @return keyId
  **/
  @javax.annotation.Nonnull

  public String getKeyId() {
    return keyId;
  }


  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }


  public CodespacesUserPublicKey key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The Base64 encoded public key.
   * @return key
  **/
  @javax.annotation.Nonnull

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodespacesUserPublicKey codespacesUserPublicKey = (CodespacesUserPublicKey) o;
    return Objects.equals(this.keyId, codespacesUserPublicKey.keyId) &&
        Objects.equals(this.key, codespacesUserPublicKey.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyId, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodespacesUserPublicKey {\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("key_id");
    openapiFields.add("key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key_id");
    openapiRequiredFields.add("key");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CodespacesUserPublicKey
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CodespacesUserPublicKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CodespacesUserPublicKey is not found in the empty JSON string", CodespacesUserPublicKey.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CodespacesUserPublicKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CodespacesUserPublicKey` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CodespacesUserPublicKey.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("key_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_id").toString()));
      }
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CodespacesUserPublicKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CodespacesUserPublicKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CodespacesUserPublicKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CodespacesUserPublicKey.class));

       return (TypeAdapter<T>) new TypeAdapter<CodespacesUserPublicKey>() {
           @Override
           public void write(JsonWriter out, CodespacesUserPublicKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CodespacesUserPublicKey read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CodespacesUserPublicKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CodespacesUserPublicKey
  * @throws IOException if the JSON string is invalid with respect to CodespacesUserPublicKey
  */
  public static CodespacesUserPublicKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CodespacesUserPublicKey.class);
  }

 /**
  * Convert an instance of CodespacesUserPublicKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

