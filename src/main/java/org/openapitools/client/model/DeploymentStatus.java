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
import java.time.OffsetDateTime;
import org.openapitools.client.model.NullableIntegration;
import org.openapitools.client.model.NullableSimpleUser;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * The status of a deployment.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class DeploymentStatus {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  /**
   * The state of the status.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ERROR("error"),
    
    FAILURE("failure"),
    
    INACTIVE("inactive"),
    
    PENDING("pending"),
    
    SUCCESS("success"),
    
    QUEUED("queued"),
    
    IN_PROGRESS("in_progress");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private NullableSimpleUser creator;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "";

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private String environment = "";

  public static final String SERIALIZED_NAME_TARGET_URL = "target_url";
  @SerializedName(SERIALIZED_NAME_TARGET_URL)
  private URI targetUrl = URI.create("");

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_DEPLOYMENT_URL = "deployment_url";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_URL)
  private URI deploymentUrl;

  public static final String SERIALIZED_NAME_REPOSITORY_URL = "repository_url";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_URL)
  private URI repositoryUrl;

  public static final String SERIALIZED_NAME_ENVIRONMENT_URL = "environment_url";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_URL)
  private URI environmentUrl = URI.create("");

  public static final String SERIALIZED_NAME_LOG_URL = "log_url";
  @SerializedName(SERIALIZED_NAME_LOG_URL)
  private URI logUrl = URI.create("");

  public static final String SERIALIZED_NAME_PERFORMED_VIA_GITHUB_APP = "performed_via_github_app";
  @SerializedName(SERIALIZED_NAME_PERFORMED_VIA_GITHUB_APP)
  private NullableIntegration performedViaGithubApp;

  public DeploymentStatus() {
  }

  public DeploymentStatus url(URI url) {
    
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


  public DeploymentStatus id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public DeploymentStatus nodeId(String nodeId) {
    
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @javax.annotation.Nonnull

  public String getNodeId() {
    return nodeId;
  }


  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }


  public DeploymentStatus state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the status.
   * @return state
  **/
  @javax.annotation.Nonnull

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public DeploymentStatus creator(NullableSimpleUser creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable

  public NullableSimpleUser getCreator() {
    return creator;
  }


  public void setCreator(NullableSimpleUser creator) {
    this.creator = creator;
  }


  public DeploymentStatus description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A short description of the status.
   * @return description
  **/
  @javax.annotation.Nonnull

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DeploymentStatus environment(String environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * The environment of the deployment that the status is for.
   * @return environment
  **/
  @javax.annotation.Nullable

  public String getEnvironment() {
    return environment;
  }


  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public DeploymentStatus targetUrl(URI targetUrl) {
    
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * Deprecated: the URL to associate with this status.
   * @return targetUrl
  **/
  @javax.annotation.Nonnull

  public URI getTargetUrl() {
    return targetUrl;
  }


  public void setTargetUrl(URI targetUrl) {
    this.targetUrl = targetUrl;
  }


  public DeploymentStatus createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public DeploymentStatus updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public DeploymentStatus deploymentUrl(URI deploymentUrl) {
    
    this.deploymentUrl = deploymentUrl;
    return this;
  }

   /**
   * Get deploymentUrl
   * @return deploymentUrl
  **/
  @javax.annotation.Nonnull

  public URI getDeploymentUrl() {
    return deploymentUrl;
  }


  public void setDeploymentUrl(URI deploymentUrl) {
    this.deploymentUrl = deploymentUrl;
  }


  public DeploymentStatus repositoryUrl(URI repositoryUrl) {
    
    this.repositoryUrl = repositoryUrl;
    return this;
  }

   /**
   * Get repositoryUrl
   * @return repositoryUrl
  **/
  @javax.annotation.Nonnull

  public URI getRepositoryUrl() {
    return repositoryUrl;
  }


  public void setRepositoryUrl(URI repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }


  public DeploymentStatus environmentUrl(URI environmentUrl) {
    
    this.environmentUrl = environmentUrl;
    return this;
  }

   /**
   * The URL for accessing your environment.
   * @return environmentUrl
  **/
  @javax.annotation.Nullable

  public URI getEnvironmentUrl() {
    return environmentUrl;
  }


  public void setEnvironmentUrl(URI environmentUrl) {
    this.environmentUrl = environmentUrl;
  }


  public DeploymentStatus logUrl(URI logUrl) {
    
    this.logUrl = logUrl;
    return this;
  }

   /**
   * The URL to associate with this status.
   * @return logUrl
  **/
  @javax.annotation.Nullable

  public URI getLogUrl() {
    return logUrl;
  }


  public void setLogUrl(URI logUrl) {
    this.logUrl = logUrl;
  }


  public DeploymentStatus performedViaGithubApp(NullableIntegration performedViaGithubApp) {
    
    this.performedViaGithubApp = performedViaGithubApp;
    return this;
  }

   /**
   * Get performedViaGithubApp
   * @return performedViaGithubApp
  **/
  @javax.annotation.Nullable

  public NullableIntegration getPerformedViaGithubApp() {
    return performedViaGithubApp;
  }


  public void setPerformedViaGithubApp(NullableIntegration performedViaGithubApp) {
    this.performedViaGithubApp = performedViaGithubApp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentStatus deploymentStatus = (DeploymentStatus) o;
    return Objects.equals(this.url, deploymentStatus.url) &&
        Objects.equals(this.id, deploymentStatus.id) &&
        Objects.equals(this.nodeId, deploymentStatus.nodeId) &&
        Objects.equals(this.state, deploymentStatus.state) &&
        Objects.equals(this.creator, deploymentStatus.creator) &&
        Objects.equals(this.description, deploymentStatus.description) &&
        Objects.equals(this.environment, deploymentStatus.environment) &&
        Objects.equals(this.targetUrl, deploymentStatus.targetUrl) &&
        Objects.equals(this.createdAt, deploymentStatus.createdAt) &&
        Objects.equals(this.updatedAt, deploymentStatus.updatedAt) &&
        Objects.equals(this.deploymentUrl, deploymentStatus.deploymentUrl) &&
        Objects.equals(this.repositoryUrl, deploymentStatus.repositoryUrl) &&
        Objects.equals(this.environmentUrl, deploymentStatus.environmentUrl) &&
        Objects.equals(this.logUrl, deploymentStatus.logUrl) &&
        Objects.equals(this.performedViaGithubApp, deploymentStatus.performedViaGithubApp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, id, nodeId, state, creator, description, environment, targetUrl, createdAt, updatedAt, deploymentUrl, repositoryUrl, environmentUrl, logUrl, performedViaGithubApp);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentStatus {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deploymentUrl: ").append(toIndentedString(deploymentUrl)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    environmentUrl: ").append(toIndentedString(environmentUrl)).append("\n");
    sb.append("    logUrl: ").append(toIndentedString(logUrl)).append("\n");
    sb.append("    performedViaGithubApp: ").append(toIndentedString(performedViaGithubApp)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("node_id");
    openapiFields.add("state");
    openapiFields.add("creator");
    openapiFields.add("description");
    openapiFields.add("environment");
    openapiFields.add("target_url");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("deployment_url");
    openapiFields.add("repository_url");
    openapiFields.add("environment_url");
    openapiFields.add("log_url");
    openapiFields.add("performed_via_github_app");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("creator");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("target_url");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("deployment_url");
    openapiRequiredFields.add("repository_url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeploymentStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeploymentStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeploymentStatus is not found in the empty JSON string", DeploymentStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeploymentStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeploymentStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeploymentStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the required field `creator`
      NullableSimpleUser.validateJsonObject(jsonObj.getAsJsonObject("creator"));
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) && !jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      if (!jsonObj.get("target_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_url").toString()));
      }
      if (!jsonObj.get("deployment_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deployment_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deployment_url").toString()));
      }
      if (!jsonObj.get("repository_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repository_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repository_url").toString()));
      }
      if ((jsonObj.get("environment_url") != null && !jsonObj.get("environment_url").isJsonNull()) && !jsonObj.get("environment_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment_url").toString()));
      }
      if ((jsonObj.get("log_url") != null && !jsonObj.get("log_url").isJsonNull()) && !jsonObj.get("log_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `log_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("log_url").toString()));
      }
      // validate the optional field `performed_via_github_app`
      if (jsonObj.get("performed_via_github_app") != null && !jsonObj.get("performed_via_github_app").isJsonNull()) {
        NullableIntegration.validateJsonObject(jsonObj.getAsJsonObject("performed_via_github_app"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeploymentStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeploymentStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeploymentStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeploymentStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<DeploymentStatus>() {
           @Override
           public void write(JsonWriter out, DeploymentStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeploymentStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeploymentStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeploymentStatus
  * @throws IOException if the JSON string is invalid with respect to DeploymentStatus
  */
  public static DeploymentStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeploymentStatus.class);
  }

 /**
  * Convert an instance of DeploymentStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

