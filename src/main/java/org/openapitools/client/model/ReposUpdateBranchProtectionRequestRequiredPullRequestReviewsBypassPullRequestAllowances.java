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
 * Allow specific users, teams, or apps to bypass pull request requirements.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances {
  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<String> users;

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  private List<String> teams;

  public static final String SERIALIZED_NAME_APPS = "apps";
  @SerializedName(SERIALIZED_NAME_APPS)
  private List<String> apps;

  public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances() {
  }

  public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances users(List<String> users) {
    
    this.users = users;
    return this;
  }

  public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * The list of user &#x60;login&#x60;s allowed to bypass pull request requirements.
   * @return users
  **/
  @javax.annotation.Nullable

  public List<String> getUsers() {
    return users;
  }


  public void setUsers(List<String> users) {
    this.users = users;
  }


  public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances teams(List<String> teams) {
    
    this.teams = teams;
    return this;
  }

  public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances addTeamsItem(String teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * The list of team &#x60;slug&#x60;s allowed to bypass pull request requirements.
   * @return teams
  **/
  @javax.annotation.Nullable

  public List<String> getTeams() {
    return teams;
  }


  public void setTeams(List<String> teams) {
    this.teams = teams;
  }


  public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances apps(List<String> apps) {
    
    this.apps = apps;
    return this;
  }

  public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances addAppsItem(String appsItem) {
    if (this.apps == null) {
      this.apps = new ArrayList<>();
    }
    this.apps.add(appsItem);
    return this;
  }

   /**
   * The list of app &#x60;slug&#x60;s allowed to bypass pull request requirements.
   * @return apps
  **/
  @javax.annotation.Nullable

  public List<String> getApps() {
    return apps;
  }


  public void setApps(List<String> apps) {
    this.apps = apps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances reposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances = (ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances) o;
    return Objects.equals(this.users, reposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances.users) &&
        Objects.equals(this.teams, reposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances.teams) &&
        Objects.equals(this.apps, reposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances.apps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, teams, apps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
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
    openapiFields.add("apps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances is not found in the empty JSON string", ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("teams") != null && !jsonObj.get("teams").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `teams` to be an array in the JSON string but got `%s`", jsonObj.get("teams").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("apps") != null && !jsonObj.get("apps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `apps` to be an array in the JSON string but got `%s`", jsonObj.get("apps").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances.class));

       return (TypeAdapter<T>) new TypeAdapter<ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances>() {
           @Override
           public void write(JsonWriter out, ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances
  * @throws IOException if the JSON string is invalid with respect to ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances
  */
  public static ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances.class);
  }

 /**
  * Convert an instance of ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

