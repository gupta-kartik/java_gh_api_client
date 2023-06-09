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
 * ApiOverviewSshKeyFingerprints
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ApiOverviewSshKeyFingerprints {
  public static final String SERIALIZED_NAME_S_H_A256_R_S_A = "SHA256_RSA";
  @SerializedName(SERIALIZED_NAME_S_H_A256_R_S_A)
  private String SHA256_RSA;

  public static final String SERIALIZED_NAME_S_H_A256_D_S_A = "SHA256_DSA";
  @SerializedName(SERIALIZED_NAME_S_H_A256_D_S_A)
  private String SHA256_DSA;

  public static final String SERIALIZED_NAME_S_H_A256_E_C_D_S_A = "SHA256_ECDSA";
  @SerializedName(SERIALIZED_NAME_S_H_A256_E_C_D_S_A)
  private String SHA256_ECDSA;

  public static final String SERIALIZED_NAME_S_H_A256_E_D25519 = "SHA256_ED25519";
  @SerializedName(SERIALIZED_NAME_S_H_A256_E_D25519)
  private String SHA256_ED25519;

  public ApiOverviewSshKeyFingerprints() {
  }

  public ApiOverviewSshKeyFingerprints SHA256_RSA(String SHA256_RSA) {
    
    this.SHA256_RSA = SHA256_RSA;
    return this;
  }

   /**
   * Get SHA256_RSA
   * @return SHA256_RSA
  **/
  @javax.annotation.Nullable

  public String getSHA256RSA() {
    return SHA256_RSA;
  }


  public void setSHA256RSA(String SHA256_RSA) {
    this.SHA256_RSA = SHA256_RSA;
  }


  public ApiOverviewSshKeyFingerprints SHA256_DSA(String SHA256_DSA) {
    
    this.SHA256_DSA = SHA256_DSA;
    return this;
  }

   /**
   * Get SHA256_DSA
   * @return SHA256_DSA
  **/
  @javax.annotation.Nullable

  public String getSHA256DSA() {
    return SHA256_DSA;
  }


  public void setSHA256DSA(String SHA256_DSA) {
    this.SHA256_DSA = SHA256_DSA;
  }


  public ApiOverviewSshKeyFingerprints SHA256_ECDSA(String SHA256_ECDSA) {
    
    this.SHA256_ECDSA = SHA256_ECDSA;
    return this;
  }

   /**
   * Get SHA256_ECDSA
   * @return SHA256_ECDSA
  **/
  @javax.annotation.Nullable

  public String getSHA256ECDSA() {
    return SHA256_ECDSA;
  }


  public void setSHA256ECDSA(String SHA256_ECDSA) {
    this.SHA256_ECDSA = SHA256_ECDSA;
  }


  public ApiOverviewSshKeyFingerprints SHA256_ED25519(String SHA256_ED25519) {
    
    this.SHA256_ED25519 = SHA256_ED25519;
    return this;
  }

   /**
   * Get SHA256_ED25519
   * @return SHA256_ED25519
  **/
  @javax.annotation.Nullable

  public String getSHA256ED25519() {
    return SHA256_ED25519;
  }


  public void setSHA256ED25519(String SHA256_ED25519) {
    this.SHA256_ED25519 = SHA256_ED25519;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiOverviewSshKeyFingerprints apiOverviewSshKeyFingerprints = (ApiOverviewSshKeyFingerprints) o;
    return Objects.equals(this.SHA256_RSA, apiOverviewSshKeyFingerprints.SHA256_RSA) &&
        Objects.equals(this.SHA256_DSA, apiOverviewSshKeyFingerprints.SHA256_DSA) &&
        Objects.equals(this.SHA256_ECDSA, apiOverviewSshKeyFingerprints.SHA256_ECDSA) &&
        Objects.equals(this.SHA256_ED25519, apiOverviewSshKeyFingerprints.SHA256_ED25519);
  }

  @Override
  public int hashCode() {
    return Objects.hash(SHA256_RSA, SHA256_DSA, SHA256_ECDSA, SHA256_ED25519);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiOverviewSshKeyFingerprints {\n");
    sb.append("    SHA256_RSA: ").append(toIndentedString(SHA256_RSA)).append("\n");
    sb.append("    SHA256_DSA: ").append(toIndentedString(SHA256_DSA)).append("\n");
    sb.append("    SHA256_ECDSA: ").append(toIndentedString(SHA256_ECDSA)).append("\n");
    sb.append("    SHA256_ED25519: ").append(toIndentedString(SHA256_ED25519)).append("\n");
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
    openapiFields.add("SHA256_RSA");
    openapiFields.add("SHA256_DSA");
    openapiFields.add("SHA256_ECDSA");
    openapiFields.add("SHA256_ED25519");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiOverviewSshKeyFingerprints
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiOverviewSshKeyFingerprints.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiOverviewSshKeyFingerprints is not found in the empty JSON string", ApiOverviewSshKeyFingerprints.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiOverviewSshKeyFingerprints.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiOverviewSshKeyFingerprints` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("SHA256_RSA") != null && !jsonObj.get("SHA256_RSA").isJsonNull()) && !jsonObj.get("SHA256_RSA").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SHA256_RSA` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SHA256_RSA").toString()));
      }
      if ((jsonObj.get("SHA256_DSA") != null && !jsonObj.get("SHA256_DSA").isJsonNull()) && !jsonObj.get("SHA256_DSA").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SHA256_DSA` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SHA256_DSA").toString()));
      }
      if ((jsonObj.get("SHA256_ECDSA") != null && !jsonObj.get("SHA256_ECDSA").isJsonNull()) && !jsonObj.get("SHA256_ECDSA").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SHA256_ECDSA` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SHA256_ECDSA").toString()));
      }
      if ((jsonObj.get("SHA256_ED25519") != null && !jsonObj.get("SHA256_ED25519").isJsonNull()) && !jsonObj.get("SHA256_ED25519").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SHA256_ED25519` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SHA256_ED25519").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiOverviewSshKeyFingerprints.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiOverviewSshKeyFingerprints' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiOverviewSshKeyFingerprints> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiOverviewSshKeyFingerprints.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiOverviewSshKeyFingerprints>() {
           @Override
           public void write(JsonWriter out, ApiOverviewSshKeyFingerprints value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiOverviewSshKeyFingerprints read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiOverviewSshKeyFingerprints given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiOverviewSshKeyFingerprints
  * @throws IOException if the JSON string is invalid with respect to ApiOverviewSshKeyFingerprints
  */
  public static ApiOverviewSshKeyFingerprints fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiOverviewSshKeyFingerprints.class);
  }

 /**
  * Convert an instance of ApiOverviewSshKeyFingerprints to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

