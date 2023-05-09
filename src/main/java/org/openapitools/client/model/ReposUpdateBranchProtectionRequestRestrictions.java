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
 * Restrict who can push to the protected branch. User, app, and team &#x60;restrictions&#x60; are only available for organization-owned repositories. Set to &#x60;null&#x60; to disable.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ReposUpdateBranchProtectionRequestRestrictions {
  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<String> users = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  private List<String> teams = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPS = "apps";
  @SerializedName(SERIALIZED_NAME_APPS)
  private List<String> apps;

  public ReposUpdateBranchProtectionRequestRestrictions() {
  }

  public ReposUpdateBranchProtectionRequestRestrictions users(List<String> users) {
    
    this.users = users;
    return this;
  }

  public ReposUpdateBranchProtectionRequestRestrictions addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * The list of user &#x60;login&#x60;s with push access
   * @return users
  **/
  @javax.annotation.Nonnull

  public List<String> getUsers() {
    return users;
  }


  public void setUsers(List<String> users) {
    this.users = users;
  }


  public ReposUpdateBranchProtectionRequestRestrictions teams(List<String> teams) {
    
    this.teams = teams;
    return this;
  }

  public ReposUpdateBranchProtectionRequestRestrictions addTeamsItem(String teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * The list of team &#x60;slug&#x60;s with push access
   * @return teams
  **/
  @javax.annotation.Nonnull

  public List<String> getTeams() {
    return teams;
  }


  public void setTeams(List<String> teams) {
    this.teams = teams;
  }


  public ReposUpdateBranchProtectionRequestRestrictions apps(List<String> apps) {
    
    this.apps = apps;
    return this;
  }

  public ReposUpdateBranchProtectionRequestRestrictions addAppsItem(String appsItem) {
    if (this.apps == null) {
      this.apps = new ArrayList<>();
    }
    this.apps.add(appsItem);
    return this;
  }

   /**
   * The list of app &#x60;slug&#x60;s with push access
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
    ReposUpdateBranchProtectionRequestRestrictions reposUpdateBranchProtectionRequestRestrictions = (ReposUpdateBranchProtectionRequestRestrictions) o;
    return Objects.equals(this.users, reposUpdateBranchProtectionRequestRestrictions.users) &&
        Objects.equals(this.teams, reposUpdateBranchProtectionRequestRestrictions.teams) &&
        Objects.equals(this.apps, reposUpdateBranchProtectionRequestRestrictions.apps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, teams, apps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReposUpdateBranchProtectionRequestRestrictions {\n");
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
    openapiRequiredFields.add("users");
    openapiRequiredFields.add("teams");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReposUpdateBranchProtectionRequestRestrictions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReposUpdateBranchProtectionRequestRestrictions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReposUpdateBranchProtectionRequestRestrictions is not found in the empty JSON string", ReposUpdateBranchProtectionRequestRestrictions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReposUpdateBranchProtectionRequestRestrictions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReposUpdateBranchProtectionRequestRestrictions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReposUpdateBranchProtectionRequestRestrictions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("users") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("users").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("teams") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("teams").isJsonArray()) {
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
       if (!ReposUpdateBranchProtectionRequestRestrictions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReposUpdateBranchProtectionRequestRestrictions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReposUpdateBranchProtectionRequestRestrictions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReposUpdateBranchProtectionRequestRestrictions.class));

       return (TypeAdapter<T>) new TypeAdapter<ReposUpdateBranchProtectionRequestRestrictions>() {
           @Override
           public void write(JsonWriter out, ReposUpdateBranchProtectionRequestRestrictions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReposUpdateBranchProtectionRequestRestrictions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReposUpdateBranchProtectionRequestRestrictions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReposUpdateBranchProtectionRequestRestrictions
  * @throws IOException if the JSON string is invalid with respect to ReposUpdateBranchProtectionRequestRestrictions
  */
  public static ReposUpdateBranchProtectionRequestRestrictions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReposUpdateBranchProtectionRequestRestrictions.class);
  }

 /**
  * Convert an instance of ReposUpdateBranchProtectionRequestRestrictions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

