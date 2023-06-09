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
 * CodespacesCreateOrUpdateRepoSecretRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class CodespacesCreateOrUpdateRepoSecretRequest {
  public static final String SERIALIZED_NAME_ENCRYPTED_VALUE = "encrypted_value";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_VALUE)
  private String encryptedValue;

  public static final String SERIALIZED_NAME_KEY_ID = "key_id";
  @SerializedName(SERIALIZED_NAME_KEY_ID)
  private String keyId;

  public CodespacesCreateOrUpdateRepoSecretRequest() {
  }

  public CodespacesCreateOrUpdateRepoSecretRequest encryptedValue(String encryptedValue) {
    
    this.encryptedValue = encryptedValue;
    return this;
  }

   /**
   * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get a repository public key](https://docs.github.com/rest/reference/codespaces#get-a-repository-public-key) endpoint.
   * @return encryptedValue
  **/
  @javax.annotation.Nullable

  public String getEncryptedValue() {
    return encryptedValue;
  }


  public void setEncryptedValue(String encryptedValue) {
    this.encryptedValue = encryptedValue;
  }


  public CodespacesCreateOrUpdateRepoSecretRequest keyId(String keyId) {
    
    this.keyId = keyId;
    return this;
  }

   /**
   * ID of the key you used to encrypt the secret.
   * @return keyId
  **/
  @javax.annotation.Nullable

  public String getKeyId() {
    return keyId;
  }


  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodespacesCreateOrUpdateRepoSecretRequest codespacesCreateOrUpdateRepoSecretRequest = (CodespacesCreateOrUpdateRepoSecretRequest) o;
    return Objects.equals(this.encryptedValue, codespacesCreateOrUpdateRepoSecretRequest.encryptedValue) &&
        Objects.equals(this.keyId, codespacesCreateOrUpdateRepoSecretRequest.keyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedValue, keyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodespacesCreateOrUpdateRepoSecretRequest {\n");
    sb.append("    encryptedValue: ").append(toIndentedString(encryptedValue)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
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
    openapiFields.add("encrypted_value");
    openapiFields.add("key_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CodespacesCreateOrUpdateRepoSecretRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CodespacesCreateOrUpdateRepoSecretRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CodespacesCreateOrUpdateRepoSecretRequest is not found in the empty JSON string", CodespacesCreateOrUpdateRepoSecretRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CodespacesCreateOrUpdateRepoSecretRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CodespacesCreateOrUpdateRepoSecretRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("encrypted_value") != null && !jsonObj.get("encrypted_value").isJsonNull()) && !jsonObj.get("encrypted_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encrypted_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encrypted_value").toString()));
      }
      if ((jsonObj.get("key_id") != null && !jsonObj.get("key_id").isJsonNull()) && !jsonObj.get("key_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CodespacesCreateOrUpdateRepoSecretRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CodespacesCreateOrUpdateRepoSecretRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CodespacesCreateOrUpdateRepoSecretRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CodespacesCreateOrUpdateRepoSecretRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CodespacesCreateOrUpdateRepoSecretRequest>() {
           @Override
           public void write(JsonWriter out, CodespacesCreateOrUpdateRepoSecretRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CodespacesCreateOrUpdateRepoSecretRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CodespacesCreateOrUpdateRepoSecretRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CodespacesCreateOrUpdateRepoSecretRequest
  * @throws IOException if the JSON string is invalid with respect to CodespacesCreateOrUpdateRepoSecretRequest
  */
  public static CodespacesCreateOrUpdateRepoSecretRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CodespacesCreateOrUpdateRepoSecretRequest.class);
  }

 /**
  * Convert an instance of CodespacesCreateOrUpdateRepoSecretRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

