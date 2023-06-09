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
 * ActionsUpdateRequiredWorkflowRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ActionsUpdateRequiredWorkflowRequest {
  public static final String SERIALIZED_NAME_WORKFLOW_FILE_PATH = "workflow_file_path";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_FILE_PATH)
  private String workflowFilePath;

  public static final String SERIALIZED_NAME_REPOSITORY_ID = "repository_id";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_ID)
  private String repositoryId;

  /**
   * Enable the required workflow for all repositories or selected repositories in the organization.
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    SELECTED("selected"),
    
    ALL("all");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScopeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private ScopeEnum scope = ScopeEnum.ALL;

  public static final String SERIALIZED_NAME_SELECTED_REPOSITORY_IDS = "selected_repository_ids";
  @SerializedName(SERIALIZED_NAME_SELECTED_REPOSITORY_IDS)
  private List<Integer> selectedRepositoryIds;

  public ActionsUpdateRequiredWorkflowRequest() {
  }

  public ActionsUpdateRequiredWorkflowRequest workflowFilePath(String workflowFilePath) {
    
    this.workflowFilePath = workflowFilePath;
    return this;
  }

   /**
   * Path of the workflow file to be configured as a required workflow.
   * @return workflowFilePath
  **/
  @javax.annotation.Nullable

  public String getWorkflowFilePath() {
    return workflowFilePath;
  }


  public void setWorkflowFilePath(String workflowFilePath) {
    this.workflowFilePath = workflowFilePath;
  }


  public ActionsUpdateRequiredWorkflowRequest repositoryId(String repositoryId) {
    
    this.repositoryId = repositoryId;
    return this;
  }

   /**
   * The ID of the repository that contains the workflow file.
   * @return repositoryId
  **/
  @javax.annotation.Nullable

  public String getRepositoryId() {
    return repositoryId;
  }


  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
  }


  public ActionsUpdateRequiredWorkflowRequest scope(ScopeEnum scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Enable the required workflow for all repositories or selected repositories in the organization.
   * @return scope
  **/
  @javax.annotation.Nullable

  public ScopeEnum getScope() {
    return scope;
  }


  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  public ActionsUpdateRequiredWorkflowRequest selectedRepositoryIds(List<Integer> selectedRepositoryIds) {
    
    this.selectedRepositoryIds = selectedRepositoryIds;
    return this;
  }

  public ActionsUpdateRequiredWorkflowRequest addSelectedRepositoryIdsItem(Integer selectedRepositoryIdsItem) {
    if (this.selectedRepositoryIds == null) {
      this.selectedRepositoryIds = new ArrayList<>();
    }
    this.selectedRepositoryIds.add(selectedRepositoryIdsItem);
    return this;
  }

   /**
   * A list of repository IDs where you want to enable the required workflow. A list of repository IDs where you want to enable the required workflow. You can only provide a list of repository ids when the &#x60;scope&#x60; is set to &#x60;selected&#x60;.
   * @return selectedRepositoryIds
  **/
  @javax.annotation.Nullable

  public List<Integer> getSelectedRepositoryIds() {
    return selectedRepositoryIds;
  }


  public void setSelectedRepositoryIds(List<Integer> selectedRepositoryIds) {
    this.selectedRepositoryIds = selectedRepositoryIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionsUpdateRequiredWorkflowRequest actionsUpdateRequiredWorkflowRequest = (ActionsUpdateRequiredWorkflowRequest) o;
    return Objects.equals(this.workflowFilePath, actionsUpdateRequiredWorkflowRequest.workflowFilePath) &&
        Objects.equals(this.repositoryId, actionsUpdateRequiredWorkflowRequest.repositoryId) &&
        Objects.equals(this.scope, actionsUpdateRequiredWorkflowRequest.scope) &&
        Objects.equals(this.selectedRepositoryIds, actionsUpdateRequiredWorkflowRequest.selectedRepositoryIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowFilePath, repositoryId, scope, selectedRepositoryIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionsUpdateRequiredWorkflowRequest {\n");
    sb.append("    workflowFilePath: ").append(toIndentedString(workflowFilePath)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    selectedRepositoryIds: ").append(toIndentedString(selectedRepositoryIds)).append("\n");
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
    openapiFields.add("workflow_file_path");
    openapiFields.add("repository_id");
    openapiFields.add("scope");
    openapiFields.add("selected_repository_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActionsUpdateRequiredWorkflowRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ActionsUpdateRequiredWorkflowRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActionsUpdateRequiredWorkflowRequest is not found in the empty JSON string", ActionsUpdateRequiredWorkflowRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ActionsUpdateRequiredWorkflowRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActionsUpdateRequiredWorkflowRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("workflow_file_path") != null && !jsonObj.get("workflow_file_path").isJsonNull()) && !jsonObj.get("workflow_file_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflow_file_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflow_file_path").toString()));
      }
      if ((jsonObj.get("repository_id") != null && !jsonObj.get("repository_id").isJsonNull()) && !jsonObj.get("repository_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repository_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repository_id").toString()));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("selected_repository_ids") != null && !jsonObj.get("selected_repository_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `selected_repository_ids` to be an array in the JSON string but got `%s`", jsonObj.get("selected_repository_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActionsUpdateRequiredWorkflowRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActionsUpdateRequiredWorkflowRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActionsUpdateRequiredWorkflowRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActionsUpdateRequiredWorkflowRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ActionsUpdateRequiredWorkflowRequest>() {
           @Override
           public void write(JsonWriter out, ActionsUpdateRequiredWorkflowRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActionsUpdateRequiredWorkflowRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActionsUpdateRequiredWorkflowRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActionsUpdateRequiredWorkflowRequest
  * @throws IOException if the JSON string is invalid with respect to ActionsUpdateRequiredWorkflowRequest
  */
  public static ActionsUpdateRequiredWorkflowRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActionsUpdateRequiredWorkflowRequest.class);
  }

 /**
  * Convert an instance of ActionsUpdateRequiredWorkflowRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

