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
import java.time.OffsetDateTime;
import org.openapitools.client.model.Repository;

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
 * Starred Repository
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class StarredRepository {
  public static final String SERIALIZED_NAME_STARRED_AT = "starred_at";
  @SerializedName(SERIALIZED_NAME_STARRED_AT)
  private OffsetDateTime starredAt;

  public static final String SERIALIZED_NAME_REPO = "repo";
  @SerializedName(SERIALIZED_NAME_REPO)
  private Repository repo;

  public StarredRepository() {
  }

  public StarredRepository starredAt(OffsetDateTime starredAt) {
    
    this.starredAt = starredAt;
    return this;
  }

   /**
   * Get starredAt
   * @return starredAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getStarredAt() {
    return starredAt;
  }


  public void setStarredAt(OffsetDateTime starredAt) {
    this.starredAt = starredAt;
  }


  public StarredRepository repo(Repository repo) {
    
    this.repo = repo;
    return this;
  }

   /**
   * Get repo
   * @return repo
  **/
  @javax.annotation.Nonnull

  public Repository getRepo() {
    return repo;
  }


  public void setRepo(Repository repo) {
    this.repo = repo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarredRepository starredRepository = (StarredRepository) o;
    return Objects.equals(this.starredAt, starredRepository.starredAt) &&
        Objects.equals(this.repo, starredRepository.repo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(starredAt, repo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarredRepository {\n");
    sb.append("    starredAt: ").append(toIndentedString(starredAt)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
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
    openapiFields.add("starred_at");
    openapiFields.add("repo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("starred_at");
    openapiRequiredFields.add("repo");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StarredRepository
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StarredRepository.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StarredRepository is not found in the empty JSON string", StarredRepository.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StarredRepository.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StarredRepository` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StarredRepository.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `repo`
      Repository.validateJsonObject(jsonObj.getAsJsonObject("repo"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarredRepository.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarredRepository' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarredRepository> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarredRepository.class));

       return (TypeAdapter<T>) new TypeAdapter<StarredRepository>() {
           @Override
           public void write(JsonWriter out, StarredRepository value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarredRepository read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarredRepository given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarredRepository
  * @throws IOException if the JSON string is invalid with respect to StarredRepository
  */
  public static StarredRepository fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarredRepository.class);
  }

 /**
  * Convert an instance of StarredRepository to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

