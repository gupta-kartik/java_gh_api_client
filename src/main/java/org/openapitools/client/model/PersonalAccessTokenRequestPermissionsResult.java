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
import java.util.HashMap;
import java.util.Map;

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
 * Permissions requested, categorized by type of permission. This field incorporates &#x60;permissions_added&#x60; and &#x60;permissions_upgraded&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class PersonalAccessTokenRequestPermissionsResult {
  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private Map<String, String> organization = new HashMap<>();

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private Map<String, String> repository = new HashMap<>();

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private Map<String, String> other = new HashMap<>();

  public PersonalAccessTokenRequestPermissionsResult() {
  }

  public PersonalAccessTokenRequestPermissionsResult organization(Map<String, String> organization) {
    
    this.organization = organization;
    return this;
  }

  public PersonalAccessTokenRequestPermissionsResult putOrganizationItem(String key, String organizationItem) {
    if (this.organization == null) {
      this.organization = new HashMap<>();
    }
    this.organization.put(key, organizationItem);
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nullable

  public Map<String, String> getOrganization() {
    return organization;
  }


  public void setOrganization(Map<String, String> organization) {
    this.organization = organization;
  }


  public PersonalAccessTokenRequestPermissionsResult repository(Map<String, String> repository) {
    
    this.repository = repository;
    return this;
  }

  public PersonalAccessTokenRequestPermissionsResult putRepositoryItem(String key, String repositoryItem) {
    if (this.repository == null) {
      this.repository = new HashMap<>();
    }
    this.repository.put(key, repositoryItem);
    return this;
  }

   /**
   * Get repository
   * @return repository
  **/
  @javax.annotation.Nullable

  public Map<String, String> getRepository() {
    return repository;
  }


  public void setRepository(Map<String, String> repository) {
    this.repository = repository;
  }


  public PersonalAccessTokenRequestPermissionsResult other(Map<String, String> other) {
    
    this.other = other;
    return this;
  }

  public PersonalAccessTokenRequestPermissionsResult putOtherItem(String key, String otherItem) {
    if (this.other == null) {
      this.other = new HashMap<>();
    }
    this.other.put(key, otherItem);
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @javax.annotation.Nullable

  public Map<String, String> getOther() {
    return other;
  }


  public void setOther(Map<String, String> other) {
    this.other = other;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalAccessTokenRequestPermissionsResult personalAccessTokenRequestPermissionsResult = (PersonalAccessTokenRequestPermissionsResult) o;
    return Objects.equals(this.organization, personalAccessTokenRequestPermissionsResult.organization) &&
        Objects.equals(this.repository, personalAccessTokenRequestPermissionsResult.repository) &&
        Objects.equals(this.other, personalAccessTokenRequestPermissionsResult.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organization, repository, other);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalAccessTokenRequestPermissionsResult {\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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
    openapiFields.add("organization");
    openapiFields.add("repository");
    openapiFields.add("other");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonalAccessTokenRequestPermissionsResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonalAccessTokenRequestPermissionsResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonalAccessTokenRequestPermissionsResult is not found in the empty JSON string", PersonalAccessTokenRequestPermissionsResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PersonalAccessTokenRequestPermissionsResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PersonalAccessTokenRequestPermissionsResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonalAccessTokenRequestPermissionsResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonalAccessTokenRequestPermissionsResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonalAccessTokenRequestPermissionsResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonalAccessTokenRequestPermissionsResult.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonalAccessTokenRequestPermissionsResult>() {
           @Override
           public void write(JsonWriter out, PersonalAccessTokenRequestPermissionsResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PersonalAccessTokenRequestPermissionsResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PersonalAccessTokenRequestPermissionsResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonalAccessTokenRequestPermissionsResult
  * @throws IOException if the JSON string is invalid with respect to PersonalAccessTokenRequestPermissionsResult
  */
  public static PersonalAccessTokenRequestPermissionsResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonalAccessTokenRequestPermissionsResult.class);
  }

 /**
  * Convert an instance of PersonalAccessTokenRequestPermissionsResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

