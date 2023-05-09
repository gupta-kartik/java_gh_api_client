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
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.BranchRestrictionPolicyAppsInner;
import org.openapitools.client.model.BranchRestrictionPolicyTeamsInner;
import org.openapitools.client.model.RepositoryTemplateRepositoryOwner;

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
 * Branch Restriction Policy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class BranchRestrictionPolicy {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_USERS_URL = "users_url";
  @SerializedName(SERIALIZED_NAME_USERS_URL)
  private URI usersUrl;

  public static final String SERIALIZED_NAME_TEAMS_URL = "teams_url";
  @SerializedName(SERIALIZED_NAME_TEAMS_URL)
  private URI teamsUrl;

  public static final String SERIALIZED_NAME_APPS_URL = "apps_url";
  @SerializedName(SERIALIZED_NAME_APPS_URL)
  private URI appsUrl;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<RepositoryTemplateRepositoryOwner> users = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  private List<BranchRestrictionPolicyTeamsInner> teams = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPS = "apps";
  @SerializedName(SERIALIZED_NAME_APPS)
  private List<BranchRestrictionPolicyAppsInner> apps = new ArrayList<>();

  public BranchRestrictionPolicy() {
  }

  public BranchRestrictionPolicy url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public BranchRestrictionPolicy usersUrl(URI usersUrl) {
    
    this.usersUrl = usersUrl;
    return this;
  }

   /**
   * Get usersUrl
   * @return usersUrl
  **/
  @javax.annotation.Nonnull

  public URI getUsersUrl() {
    return usersUrl;
  }


  public void setUsersUrl(URI usersUrl) {
    this.usersUrl = usersUrl;
  }


  public BranchRestrictionPolicy teamsUrl(URI teamsUrl) {
    
    this.teamsUrl = teamsUrl;
    return this;
  }

   /**
   * Get teamsUrl
   * @return teamsUrl
  **/
  @javax.annotation.Nonnull

  public URI getTeamsUrl() {
    return teamsUrl;
  }


  public void setTeamsUrl(URI teamsUrl) {
    this.teamsUrl = teamsUrl;
  }


  public BranchRestrictionPolicy appsUrl(URI appsUrl) {
    
    this.appsUrl = appsUrl;
    return this;
  }

   /**
   * Get appsUrl
   * @return appsUrl
  **/
  @javax.annotation.Nonnull

  public URI getAppsUrl() {
    return appsUrl;
  }


  public void setAppsUrl(URI appsUrl) {
    this.appsUrl = appsUrl;
  }


  public BranchRestrictionPolicy users(List<RepositoryTemplateRepositoryOwner> users) {
    
    this.users = users;
    return this;
  }

  public BranchRestrictionPolicy addUsersItem(RepositoryTemplateRepositoryOwner usersItem) {
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

  public List<RepositoryTemplateRepositoryOwner> getUsers() {
    return users;
  }


  public void setUsers(List<RepositoryTemplateRepositoryOwner> users) {
    this.users = users;
  }


  public BranchRestrictionPolicy teams(List<BranchRestrictionPolicyTeamsInner> teams) {
    
    this.teams = teams;
    return this;
  }

  public BranchRestrictionPolicy addTeamsItem(BranchRestrictionPolicyTeamsInner teamsItem) {
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

  public List<BranchRestrictionPolicyTeamsInner> getTeams() {
    return teams;
  }


  public void setTeams(List<BranchRestrictionPolicyTeamsInner> teams) {
    this.teams = teams;
  }


  public BranchRestrictionPolicy apps(List<BranchRestrictionPolicyAppsInner> apps) {
    
    this.apps = apps;
    return this;
  }

  public BranchRestrictionPolicy addAppsItem(BranchRestrictionPolicyAppsInner appsItem) {
    if (this.apps == null) {
      this.apps = new ArrayList<>();
    }
    this.apps.add(appsItem);
    return this;
  }

   /**
   * Get apps
   * @return apps
  **/
  @javax.annotation.Nonnull

  public List<BranchRestrictionPolicyAppsInner> getApps() {
    return apps;
  }


  public void setApps(List<BranchRestrictionPolicyAppsInner> apps) {
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
    BranchRestrictionPolicy branchRestrictionPolicy = (BranchRestrictionPolicy) o;
    return Objects.equals(this.url, branchRestrictionPolicy.url) &&
        Objects.equals(this.usersUrl, branchRestrictionPolicy.usersUrl) &&
        Objects.equals(this.teamsUrl, branchRestrictionPolicy.teamsUrl) &&
        Objects.equals(this.appsUrl, branchRestrictionPolicy.appsUrl) &&
        Objects.equals(this.users, branchRestrictionPolicy.users) &&
        Objects.equals(this.teams, branchRestrictionPolicy.teams) &&
        Objects.equals(this.apps, branchRestrictionPolicy.apps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, usersUrl, teamsUrl, appsUrl, users, teams, apps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchRestrictionPolicy {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    usersUrl: ").append(toIndentedString(usersUrl)).append("\n");
    sb.append("    teamsUrl: ").append(toIndentedString(teamsUrl)).append("\n");
    sb.append("    appsUrl: ").append(toIndentedString(appsUrl)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("users_url");
    openapiFields.add("teams_url");
    openapiFields.add("apps_url");
    openapiFields.add("users");
    openapiFields.add("teams");
    openapiFields.add("apps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("users_url");
    openapiRequiredFields.add("teams_url");
    openapiRequiredFields.add("apps_url");
    openapiRequiredFields.add("users");
    openapiRequiredFields.add("teams");
    openapiRequiredFields.add("apps");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BranchRestrictionPolicy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BranchRestrictionPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BranchRestrictionPolicy is not found in the empty JSON string", BranchRestrictionPolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BranchRestrictionPolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BranchRestrictionPolicy` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BranchRestrictionPolicy.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("users_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `users_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("users_url").toString()));
      }
      if (!jsonObj.get("teams_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `teams_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("teams_url").toString()));
      }
      if (!jsonObj.get("apps_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apps_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apps_url").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("users").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
      }

      JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
      // validate the required field `users` (array)
      for (int i = 0; i < jsonArrayusers.size(); i++) {
        RepositoryTemplateRepositoryOwner.validateJsonObject(jsonArrayusers.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("teams").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `teams` to be an array in the JSON string but got `%s`", jsonObj.get("teams").toString()));
      }

      JsonArray jsonArrayteams = jsonObj.getAsJsonArray("teams");
      // validate the required field `teams` (array)
      for (int i = 0; i < jsonArrayteams.size(); i++) {
        BranchRestrictionPolicyTeamsInner.validateJsonObject(jsonArrayteams.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("apps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `apps` to be an array in the JSON string but got `%s`", jsonObj.get("apps").toString()));
      }

      JsonArray jsonArrayapps = jsonObj.getAsJsonArray("apps");
      // validate the required field `apps` (array)
      for (int i = 0; i < jsonArrayapps.size(); i++) {
        BranchRestrictionPolicyAppsInner.validateJsonObject(jsonArrayapps.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BranchRestrictionPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BranchRestrictionPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BranchRestrictionPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BranchRestrictionPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<BranchRestrictionPolicy>() {
           @Override
           public void write(JsonWriter out, BranchRestrictionPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BranchRestrictionPolicy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BranchRestrictionPolicy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BranchRestrictionPolicy
  * @throws IOException if the JSON string is invalid with respect to BranchRestrictionPolicy
  */
  public static BranchRestrictionPolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BranchRestrictionPolicy.class);
  }

 /**
  * Convert an instance of BranchRestrictionPolicy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

