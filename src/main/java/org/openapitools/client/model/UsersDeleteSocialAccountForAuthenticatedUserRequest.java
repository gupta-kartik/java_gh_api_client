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
import java.util.ArrayList;
import java.util.List;

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
 * UsersDeleteSocialAccountForAuthenticatedUserRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class UsersDeleteSocialAccountForAuthenticatedUserRequest {
  public static final String SERIALIZED_NAME_ACCOUNT_URLS = "account_urls";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_URLS)
  private List<String> accountUrls = new ArrayList<>();

  public UsersDeleteSocialAccountForAuthenticatedUserRequest() {
  }

  public UsersDeleteSocialAccountForAuthenticatedUserRequest accountUrls(List<String> accountUrls) {
    
    this.accountUrls = accountUrls;
    return this;
  }

  public UsersDeleteSocialAccountForAuthenticatedUserRequest addAccountUrlsItem(String accountUrlsItem) {
    if (this.accountUrls == null) {
      this.accountUrls = new ArrayList<>();
    }
    this.accountUrls.add(accountUrlsItem);
    return this;
  }

   /**
   * Full URLs for the social media profiles to delete.
   * @return accountUrls
  **/
  @javax.annotation.Nonnull

  public List<String> getAccountUrls() {
    return accountUrls;
  }


  public void setAccountUrls(List<String> accountUrls) {
    this.accountUrls = accountUrls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersDeleteSocialAccountForAuthenticatedUserRequest usersDeleteSocialAccountForAuthenticatedUserRequest = (UsersDeleteSocialAccountForAuthenticatedUserRequest) o;
    return Objects.equals(this.accountUrls, usersDeleteSocialAccountForAuthenticatedUserRequest.accountUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersDeleteSocialAccountForAuthenticatedUserRequest {\n");
    sb.append("    accountUrls: ").append(toIndentedString(accountUrls)).append("\n");
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
    openapiFields.add("account_urls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_urls");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersDeleteSocialAccountForAuthenticatedUserRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UsersDeleteSocialAccountForAuthenticatedUserRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsersDeleteSocialAccountForAuthenticatedUserRequest is not found in the empty JSON string", UsersDeleteSocialAccountForAuthenticatedUserRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UsersDeleteSocialAccountForAuthenticatedUserRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UsersDeleteSocialAccountForAuthenticatedUserRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UsersDeleteSocialAccountForAuthenticatedUserRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("account_urls") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("account_urls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_urls` to be an array in the JSON string but got `%s`", jsonObj.get("account_urls").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersDeleteSocialAccountForAuthenticatedUserRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersDeleteSocialAccountForAuthenticatedUserRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersDeleteSocialAccountForAuthenticatedUserRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersDeleteSocialAccountForAuthenticatedUserRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersDeleteSocialAccountForAuthenticatedUserRequest>() {
           @Override
           public void write(JsonWriter out, UsersDeleteSocialAccountForAuthenticatedUserRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UsersDeleteSocialAccountForAuthenticatedUserRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UsersDeleteSocialAccountForAuthenticatedUserRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersDeleteSocialAccountForAuthenticatedUserRequest
  * @throws IOException if the JSON string is invalid with respect to UsersDeleteSocialAccountForAuthenticatedUserRequest
  */
  public static UsersDeleteSocialAccountForAuthenticatedUserRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersDeleteSocialAccountForAuthenticatedUserRequest.class);
  }

 /**
  * Convert an instance of UsersDeleteSocialAccountForAuthenticatedUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

