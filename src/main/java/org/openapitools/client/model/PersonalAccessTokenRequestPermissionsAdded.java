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
 * New requested permissions, categorized by type of permission.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class PersonalAccessTokenRequestPermissionsAdded {
  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private Map<String, String> organization = new HashMap<>();

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private Map<String, String> repository = new HashMap<>();

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private Map<String, String> other = new HashMap<>();

  public PersonalAccessTokenRequestPermissionsAdded() {
  }

  public PersonalAccessTokenRequestPermissionsAdded organization(Map<String, String> organization) {
    
    this.organization = organization;
    return this;
  }

  public PersonalAccessTokenRequestPermissionsAdded putOrganizationItem(String key, String organizationItem) {
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


  public PersonalAccessTokenRequestPermissionsAdded repository(Map<String, String> repository) {
    
    this.repository = repository;
    return this;
  }

  public PersonalAccessTokenRequestPermissionsAdded putRepositoryItem(String key, String repositoryItem) {
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


  public PersonalAccessTokenRequestPermissionsAdded other(Map<String, String> other) {
    
    this.other = other;
    return this;
  }

  public PersonalAccessTokenRequestPermissionsAdded putOtherItem(String key, String otherItem) {
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
    PersonalAccessTokenRequestPermissionsAdded personalAccessTokenRequestPermissionsAdded = (PersonalAccessTokenRequestPermissionsAdded) o;
    return Objects.equals(this.organization, personalAccessTokenRequestPermissionsAdded.organization) &&
        Objects.equals(this.repository, personalAccessTokenRequestPermissionsAdded.repository) &&
        Objects.equals(this.other, personalAccessTokenRequestPermissionsAdded.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organization, repository, other);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalAccessTokenRequestPermissionsAdded {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to PersonalAccessTokenRequestPermissionsAdded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonalAccessTokenRequestPermissionsAdded.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonalAccessTokenRequestPermissionsAdded is not found in the empty JSON string", PersonalAccessTokenRequestPermissionsAdded.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PersonalAccessTokenRequestPermissionsAdded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PersonalAccessTokenRequestPermissionsAdded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonalAccessTokenRequestPermissionsAdded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonalAccessTokenRequestPermissionsAdded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonalAccessTokenRequestPermissionsAdded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonalAccessTokenRequestPermissionsAdded.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonalAccessTokenRequestPermissionsAdded>() {
           @Override
           public void write(JsonWriter out, PersonalAccessTokenRequestPermissionsAdded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PersonalAccessTokenRequestPermissionsAdded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PersonalAccessTokenRequestPermissionsAdded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonalAccessTokenRequestPermissionsAdded
  * @throws IOException if the JSON string is invalid with respect to PersonalAccessTokenRequestPermissionsAdded
  */
  public static PersonalAccessTokenRequestPermissionsAdded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonalAccessTokenRequestPermissionsAdded.class);
  }

 /**
  * Convert an instance of PersonalAccessTokenRequestPermissionsAdded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

