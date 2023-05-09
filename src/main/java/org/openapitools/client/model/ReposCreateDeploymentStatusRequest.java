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
 * ReposCreateDeploymentStatusRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ReposCreateDeploymentStatusRequest {
  /**
   * The state of the status. When you set a transient deployment to &#x60;inactive&#x60;, the deployment will be shown as &#x60;destroyed&#x60; in GitHub.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ERROR("error"),
    
    FAILURE("failure"),
    
    INACTIVE("inactive"),
    
    IN_PROGRESS("in_progress"),
    
    QUEUED("queued"),
    
    PENDING("pending"),
    
    SUCCESS("success");

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

  public static final String SERIALIZED_NAME_TARGET_URL = "target_url";
  @SerializedName(SERIALIZED_NAME_TARGET_URL)
  private String targetUrl = "";

  public static final String SERIALIZED_NAME_LOG_URL = "log_url";
  @SerializedName(SERIALIZED_NAME_LOG_URL)
  private String logUrl = "";

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "";

  /**
   * Name for the target deployment environment, which can be changed when setting a deploy status. For example, &#x60;production&#x60;, &#x60;staging&#x60;, or &#x60;qa&#x60;.
   */
  @JsonAdapter(EnvironmentEnum.Adapter.class)
  public enum EnvironmentEnum {
    PRODUCTION("production"),
    
    STAGING("staging"),
    
    QA("qa");

    private String value;

    EnvironmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnvironmentEnum fromValue(String value) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnvironmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvironmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvironmentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnvironmentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private EnvironmentEnum environment;

  public static final String SERIALIZED_NAME_ENVIRONMENT_URL = "environment_url";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_URL)
  private String environmentUrl = "";

  public static final String SERIALIZED_NAME_AUTO_INACTIVE = "auto_inactive";
  @SerializedName(SERIALIZED_NAME_AUTO_INACTIVE)
  private Boolean autoInactive;

  public ReposCreateDeploymentStatusRequest() {
  }

  public ReposCreateDeploymentStatusRequest state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the status. When you set a transient deployment to &#x60;inactive&#x60;, the deployment will be shown as &#x60;destroyed&#x60; in GitHub.
   * @return state
  **/
  @javax.annotation.Nonnull

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public ReposCreateDeploymentStatusRequest targetUrl(String targetUrl) {
    
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * The target URL to associate with this status. This URL should contain output to keep the user updated while the task is running or serve as historical information for what happened in the deployment. **Note:** It&#39;s recommended to use the &#x60;log_url&#x60; parameter, which replaces &#x60;target_url&#x60;.
   * @return targetUrl
  **/
  @javax.annotation.Nullable

  public String getTargetUrl() {
    return targetUrl;
  }


  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }


  public ReposCreateDeploymentStatusRequest logUrl(String logUrl) {
    
    this.logUrl = logUrl;
    return this;
  }

   /**
   * The full URL of the deployment&#39;s output. This parameter replaces &#x60;target_url&#x60;. We will continue to accept &#x60;target_url&#x60; to support legacy uses, but we recommend replacing &#x60;target_url&#x60; with &#x60;log_url&#x60;. Setting &#x60;log_url&#x60; will automatically set &#x60;target_url&#x60; to the same value. Default: &#x60;\&quot;\&quot;&#x60;
   * @return logUrl
  **/
  @javax.annotation.Nullable

  public String getLogUrl() {
    return logUrl;
  }


  public void setLogUrl(String logUrl) {
    this.logUrl = logUrl;
  }


  public ReposCreateDeploymentStatusRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A short description of the status. The maximum description length is 140 characters.
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ReposCreateDeploymentStatusRequest environment(EnvironmentEnum environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Name for the target deployment environment, which can be changed when setting a deploy status. For example, &#x60;production&#x60;, &#x60;staging&#x60;, or &#x60;qa&#x60;.
   * @return environment
  **/
  @javax.annotation.Nullable

  public EnvironmentEnum getEnvironment() {
    return environment;
  }


  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }


  public ReposCreateDeploymentStatusRequest environmentUrl(String environmentUrl) {
    
    this.environmentUrl = environmentUrl;
    return this;
  }

   /**
   * Sets the URL for accessing your environment. Default: &#x60;\&quot;\&quot;&#x60;
   * @return environmentUrl
  **/
  @javax.annotation.Nullable

  public String getEnvironmentUrl() {
    return environmentUrl;
  }


  public void setEnvironmentUrl(String environmentUrl) {
    this.environmentUrl = environmentUrl;
  }


  public ReposCreateDeploymentStatusRequest autoInactive(Boolean autoInactive) {
    
    this.autoInactive = autoInactive;
    return this;
  }

   /**
   * Adds a new &#x60;inactive&#x60; status to all prior non-transient, non-production environment deployments with the same repository and &#x60;environment&#x60; name as the created status&#39;s deployment. An &#x60;inactive&#x60; status is only added to deployments that had a &#x60;success&#x60; state. Default: &#x60;true&#x60;
   * @return autoInactive
  **/
  @javax.annotation.Nullable

  public Boolean getAutoInactive() {
    return autoInactive;
  }


  public void setAutoInactive(Boolean autoInactive) {
    this.autoInactive = autoInactive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReposCreateDeploymentStatusRequest reposCreateDeploymentStatusRequest = (ReposCreateDeploymentStatusRequest) o;
    return Objects.equals(this.state, reposCreateDeploymentStatusRequest.state) &&
        Objects.equals(this.targetUrl, reposCreateDeploymentStatusRequest.targetUrl) &&
        Objects.equals(this.logUrl, reposCreateDeploymentStatusRequest.logUrl) &&
        Objects.equals(this.description, reposCreateDeploymentStatusRequest.description) &&
        Objects.equals(this.environment, reposCreateDeploymentStatusRequest.environment) &&
        Objects.equals(this.environmentUrl, reposCreateDeploymentStatusRequest.environmentUrl) &&
        Objects.equals(this.autoInactive, reposCreateDeploymentStatusRequest.autoInactive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, targetUrl, logUrl, description, environment, environmentUrl, autoInactive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReposCreateDeploymentStatusRequest {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    logUrl: ").append(toIndentedString(logUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    environmentUrl: ").append(toIndentedString(environmentUrl)).append("\n");
    sb.append("    autoInactive: ").append(toIndentedString(autoInactive)).append("\n");
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
    openapiFields.add("state");
    openapiFields.add("target_url");
    openapiFields.add("log_url");
    openapiFields.add("description");
    openapiFields.add("environment");
    openapiFields.add("environment_url");
    openapiFields.add("auto_inactive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("state");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReposCreateDeploymentStatusRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReposCreateDeploymentStatusRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReposCreateDeploymentStatusRequest is not found in the empty JSON string", ReposCreateDeploymentStatusRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReposCreateDeploymentStatusRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReposCreateDeploymentStatusRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReposCreateDeploymentStatusRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("target_url") != null && !jsonObj.get("target_url").isJsonNull()) && !jsonObj.get("target_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_url").toString()));
      }
      if ((jsonObj.get("log_url") != null && !jsonObj.get("log_url").isJsonNull()) && !jsonObj.get("log_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `log_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("log_url").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) && !jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      if ((jsonObj.get("environment_url") != null && !jsonObj.get("environment_url").isJsonNull()) && !jsonObj.get("environment_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReposCreateDeploymentStatusRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReposCreateDeploymentStatusRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReposCreateDeploymentStatusRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReposCreateDeploymentStatusRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReposCreateDeploymentStatusRequest>() {
           @Override
           public void write(JsonWriter out, ReposCreateDeploymentStatusRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReposCreateDeploymentStatusRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReposCreateDeploymentStatusRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReposCreateDeploymentStatusRequest
  * @throws IOException if the JSON string is invalid with respect to ReposCreateDeploymentStatusRequest
  */
  public static ReposCreateDeploymentStatusRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReposCreateDeploymentStatusRequest.class);
  }

 /**
  * Convert an instance of ReposCreateDeploymentStatusRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
