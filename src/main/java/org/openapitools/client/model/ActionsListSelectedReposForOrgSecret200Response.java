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
import org.openapitools.client.model.MinimalRepository;

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
 * ActionsListSelectedReposForOrgSecret200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ActionsListSelectedReposForOrgSecret200Response {
  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_REPOSITORIES = "repositories";
  @SerializedName(SERIALIZED_NAME_REPOSITORIES)
  private List<MinimalRepository> repositories = new ArrayList<>();

  public ActionsListSelectedReposForOrgSecret200Response() {
  }

  public ActionsListSelectedReposForOrgSecret200Response totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nonnull

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public ActionsListSelectedReposForOrgSecret200Response repositories(List<MinimalRepository> repositories) {
    
    this.repositories = repositories;
    return this;
  }

  public ActionsListSelectedReposForOrgSecret200Response addRepositoriesItem(MinimalRepository repositoriesItem) {
    if (this.repositories == null) {
      this.repositories = new ArrayList<>();
    }
    this.repositories.add(repositoriesItem);
    return this;
  }

   /**
   * Get repositories
   * @return repositories
  **/
  @javax.annotation.Nonnull

  public List<MinimalRepository> getRepositories() {
    return repositories;
  }


  public void setRepositories(List<MinimalRepository> repositories) {
    this.repositories = repositories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionsListSelectedReposForOrgSecret200Response actionsListSelectedReposForOrgSecret200Response = (ActionsListSelectedReposForOrgSecret200Response) o;
    return Objects.equals(this.totalCount, actionsListSelectedReposForOrgSecret200Response.totalCount) &&
        Objects.equals(this.repositories, actionsListSelectedReposForOrgSecret200Response.repositories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, repositories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionsListSelectedReposForOrgSecret200Response {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
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
    openapiFields.add("total_count");
    openapiFields.add("repositories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("total_count");
    openapiRequiredFields.add("repositories");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActionsListSelectedReposForOrgSecret200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ActionsListSelectedReposForOrgSecret200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActionsListSelectedReposForOrgSecret200Response is not found in the empty JSON string", ActionsListSelectedReposForOrgSecret200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ActionsListSelectedReposForOrgSecret200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActionsListSelectedReposForOrgSecret200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ActionsListSelectedReposForOrgSecret200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("repositories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `repositories` to be an array in the JSON string but got `%s`", jsonObj.get("repositories").toString()));
      }

      JsonArray jsonArrayrepositories = jsonObj.getAsJsonArray("repositories");
      // validate the required field `repositories` (array)
      for (int i = 0; i < jsonArrayrepositories.size(); i++) {
        MinimalRepository.validateJsonObject(jsonArrayrepositories.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActionsListSelectedReposForOrgSecret200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActionsListSelectedReposForOrgSecret200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActionsListSelectedReposForOrgSecret200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActionsListSelectedReposForOrgSecret200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ActionsListSelectedReposForOrgSecret200Response>() {
           @Override
           public void write(JsonWriter out, ActionsListSelectedReposForOrgSecret200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActionsListSelectedReposForOrgSecret200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActionsListSelectedReposForOrgSecret200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActionsListSelectedReposForOrgSecret200Response
  * @throws IOException if the JSON string is invalid with respect to ActionsListSelectedReposForOrgSecret200Response
  */
  public static ActionsListSelectedReposForOrgSecret200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActionsListSelectedReposForOrgSecret200Response.class);
  }

 /**
  * Convert an instance of ActionsListSelectedReposForOrgSecret200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
