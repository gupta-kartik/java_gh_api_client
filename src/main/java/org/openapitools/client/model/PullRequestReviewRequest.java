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
import org.openapitools.client.model.SimpleUser;
import org.openapitools.client.model.Team;

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
 * Pull Request Review Request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class PullRequestReviewRequest {
  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<SimpleUser> users = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  private List<Team> teams = new ArrayList<>();

  public PullRequestReviewRequest() {
  }

  public PullRequestReviewRequest users(List<SimpleUser> users) {
    
    this.users = users;
    return this;
  }

  public PullRequestReviewRequest addUsersItem(SimpleUser usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nonnull

  public List<SimpleUser> getUsers() {
    return users;
  }


  public void setUsers(List<SimpleUser> users) {
    this.users = users;
  }


  public PullRequestReviewRequest teams(List<Team> teams) {
    
    this.teams = teams;
    return this;
  }

  public PullRequestReviewRequest addTeamsItem(Team teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/
  @javax.annotation.Nonnull

  public List<Team> getTeams() {
    return teams;
  }


  public void setTeams(List<Team> teams) {
    this.teams = teams;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PullRequestReviewRequest pullRequestReviewRequest = (PullRequestReviewRequest) o;
    return Objects.equals(this.users, pullRequestReviewRequest.users) &&
        Objects.equals(this.teams, pullRequestReviewRequest.teams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, teams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullRequestReviewRequest {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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
    openapiFields.add("users");
    openapiFields.add("teams");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("users");
    openapiRequiredFields.add("teams");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PullRequestReviewRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PullRequestReviewRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PullRequestReviewRequest is not found in the empty JSON string", PullRequestReviewRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PullRequestReviewRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PullRequestReviewRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PullRequestReviewRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("users").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
      }

      JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
      // validate the required field `users` (array)
      for (int i = 0; i < jsonArrayusers.size(); i++) {
        SimpleUser.validateJsonObject(jsonArrayusers.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("teams").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `teams` to be an array in the JSON string but got `%s`", jsonObj.get("teams").toString()));
      }

      JsonArray jsonArrayteams = jsonObj.getAsJsonArray("teams");
      // validate the required field `teams` (array)
      for (int i = 0; i < jsonArrayteams.size(); i++) {
        Team.validateJsonObject(jsonArrayteams.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PullRequestReviewRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PullRequestReviewRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PullRequestReviewRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PullRequestReviewRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PullRequestReviewRequest>() {
           @Override
           public void write(JsonWriter out, PullRequestReviewRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PullRequestReviewRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PullRequestReviewRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PullRequestReviewRequest
  * @throws IOException if the JSON string is invalid with respect to PullRequestReviewRequest
  */
  public static PullRequestReviewRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PullRequestReviewRequest.class);
  }

 /**
  * Convert an instance of PullRequestReviewRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
