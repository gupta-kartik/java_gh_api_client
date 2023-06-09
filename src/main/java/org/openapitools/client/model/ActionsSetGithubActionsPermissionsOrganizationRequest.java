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
import org.openapitools.client.model.AllowedActions;
import org.openapitools.client.model.EnabledRepositories;

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
 * ActionsSetGithubActionsPermissionsOrganizationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ActionsSetGithubActionsPermissionsOrganizationRequest {
  public static final String SERIALIZED_NAME_ENABLED_REPOSITORIES = "enabled_repositories";
  @SerializedName(SERIALIZED_NAME_ENABLED_REPOSITORIES)
  private EnabledRepositories enabledRepositories;

  public static final String SERIALIZED_NAME_ALLOWED_ACTIONS = "allowed_actions";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ACTIONS)
  private AllowedActions allowedActions;

  public ActionsSetGithubActionsPermissionsOrganizationRequest() {
  }

  public ActionsSetGithubActionsPermissionsOrganizationRequest enabledRepositories(EnabledRepositories enabledRepositories) {
    
    this.enabledRepositories = enabledRepositories;
    return this;
  }

   /**
   * Get enabledRepositories
   * @return enabledRepositories
  **/
  @javax.annotation.Nonnull

  public EnabledRepositories getEnabledRepositories() {
    return enabledRepositories;
  }


  public void setEnabledRepositories(EnabledRepositories enabledRepositories) {
    this.enabledRepositories = enabledRepositories;
  }


  public ActionsSetGithubActionsPermissionsOrganizationRequest allowedActions(AllowedActions allowedActions) {
    
    this.allowedActions = allowedActions;
    return this;
  }

   /**
   * Get allowedActions
   * @return allowedActions
  **/
  @javax.annotation.Nullable

  public AllowedActions getAllowedActions() {
    return allowedActions;
  }


  public void setAllowedActions(AllowedActions allowedActions) {
    this.allowedActions = allowedActions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionsSetGithubActionsPermissionsOrganizationRequest actionsSetGithubActionsPermissionsOrganizationRequest = (ActionsSetGithubActionsPermissionsOrganizationRequest) o;
    return Objects.equals(this.enabledRepositories, actionsSetGithubActionsPermissionsOrganizationRequest.enabledRepositories) &&
        Objects.equals(this.allowedActions, actionsSetGithubActionsPermissionsOrganizationRequest.allowedActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledRepositories, allowedActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionsSetGithubActionsPermissionsOrganizationRequest {\n");
    sb.append("    enabledRepositories: ").append(toIndentedString(enabledRepositories)).append("\n");
    sb.append("    allowedActions: ").append(toIndentedString(allowedActions)).append("\n");
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
    openapiFields.add("enabled_repositories");
    openapiFields.add("allowed_actions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("enabled_repositories");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActionsSetGithubActionsPermissionsOrganizationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ActionsSetGithubActionsPermissionsOrganizationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActionsSetGithubActionsPermissionsOrganizationRequest is not found in the empty JSON string", ActionsSetGithubActionsPermissionsOrganizationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ActionsSetGithubActionsPermissionsOrganizationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActionsSetGithubActionsPermissionsOrganizationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ActionsSetGithubActionsPermissionsOrganizationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActionsSetGithubActionsPermissionsOrganizationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActionsSetGithubActionsPermissionsOrganizationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActionsSetGithubActionsPermissionsOrganizationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActionsSetGithubActionsPermissionsOrganizationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ActionsSetGithubActionsPermissionsOrganizationRequest>() {
           @Override
           public void write(JsonWriter out, ActionsSetGithubActionsPermissionsOrganizationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActionsSetGithubActionsPermissionsOrganizationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActionsSetGithubActionsPermissionsOrganizationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActionsSetGithubActionsPermissionsOrganizationRequest
  * @throws IOException if the JSON string is invalid with respect to ActionsSetGithubActionsPermissionsOrganizationRequest
  */
  public static ActionsSetGithubActionsPermissionsOrganizationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActionsSetGithubActionsPermissionsOrganizationRequest.class);
  }

 /**
  * Convert an instance of ActionsSetGithubActionsPermissionsOrganizationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

