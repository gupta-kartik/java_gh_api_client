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
 * CodespacesCreateWithRepoForAuthenticatedUserRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class CodespacesCreateWithRepoForAuthenticatedUserRequest {
  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  /**
   * The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces &#x60;location&#x60;, which is being deprecated.
   */
  @JsonAdapter(GeoEnum.Adapter.class)
  public enum GeoEnum {
    EUROPEWEST("EuropeWest"),
    
    SOUTHEASTASIA("SoutheastAsia"),
    
    USEAST("UsEast"),
    
    USWEST("UsWest");

    private String value;

    GeoEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GeoEnum fromValue(String value) {
      for (GeoEnum b : GeoEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GeoEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GeoEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GeoEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GeoEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GEO = "geo";
  @SerializedName(SERIALIZED_NAME_GEO)
  private GeoEnum geo;

  public static final String SERIALIZED_NAME_CLIENT_IP = "client_ip";
  @SerializedName(SERIALIZED_NAME_CLIENT_IP)
  private String clientIp;

  public static final String SERIALIZED_NAME_MACHINE = "machine";
  @SerializedName(SERIALIZED_NAME_MACHINE)
  private String machine;

  public static final String SERIALIZED_NAME_DEVCONTAINER_PATH = "devcontainer_path";
  @SerializedName(SERIALIZED_NAME_DEVCONTAINER_PATH)
  private String devcontainerPath;

  public static final String SERIALIZED_NAME_MULTI_REPO_PERMISSIONS_OPT_OUT = "multi_repo_permissions_opt_out";
  @SerializedName(SERIALIZED_NAME_MULTI_REPO_PERMISSIONS_OPT_OUT)
  private Boolean multiRepoPermissionsOptOut;

  public static final String SERIALIZED_NAME_WORKING_DIRECTORY = "working_directory";
  @SerializedName(SERIALIZED_NAME_WORKING_DIRECTORY)
  private String workingDirectory;

  public static final String SERIALIZED_NAME_IDLE_TIMEOUT_MINUTES = "idle_timeout_minutes";
  @SerializedName(SERIALIZED_NAME_IDLE_TIMEOUT_MINUTES)
  private Integer idleTimeoutMinutes;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_RETENTION_PERIOD_MINUTES = "retention_period_minutes";
  @SerializedName(SERIALIZED_NAME_RETENTION_PERIOD_MINUTES)
  private Integer retentionPeriodMinutes;

  public CodespacesCreateWithRepoForAuthenticatedUserRequest() {
  }

  public CodespacesCreateWithRepoForAuthenticatedUserRequest ref(String ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * Git ref (typically a branch name) for this codespace
   * @return ref
  **/
  @javax.annotation.Nullable

  public String getRef() {
    return ref;
  }


  public void setRef(String ref) {
    this.ref = ref;
  }


  public CodespacesCreateWithRepoForAuthenticatedUserRequest location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * The requested location for a new codespace. Best efforts are made to respect this upon creation. Assigned by IP if not provided.
   * @return location
  **/
  @javax.annotation.Nullable

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public CodespacesCreateWithRepoForAuthenticatedUserRequest geo(GeoEnum geo) {
    
    this.geo = geo;
    return this;
  }

   /**
   * The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces &#x60;location&#x60;, which is being deprecated.
   * @return geo
  **/
  @javax.annotation.Nullable

  public GeoEnum getGeo() {
    return geo;
  }


  public void setGeo(GeoEnum geo) {
    this.geo = geo;
  }


  public CodespacesCreateWithRepoForAuthenticatedUserRequest clientIp(String clientIp) {
    
    this.clientIp = clientIp;
    return this;
  }

   /**
   * IP for location auto-detection when proxying a request
   * @return clientIp
  **/
  @javax.annotation.Nullable

  public String getClientIp() {
    return clientIp;
  }


  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }


  public CodespacesCreateWithRepoForAuthenticatedUserRequest machine(String machine) {
    
    this.machine = machine;
    return this;
  }

   /**
   * Machine type to use for this codespace
   * @return machine
  **/
  @javax.annotation.Nullable

  public String getMachine() {
    return machine;
  }


  public void setMachine(String machine) {
    this.machine = machine;
  }


  public CodespacesCreateWithRepoForAuthenticatedUserRequest devcontainerPath(String devcontainerPath) {
    
    this.devcontainerPath = devcontainerPath;
    return this;
  }

   /**
   * Path to devcontainer.json config to use for this codespace
   * @return devcontainerPath
  **/
  @javax.annotation.Nullable

  public String getDevcontainerPath() {
    return devcontainerPath;
  }


  public void setDevcontainerPath(String devcontainerPath) {
    this.devcontainerPath = devcontainerPath;
  }


  public CodespacesCreateWithRepoForAuthenticatedUserRequest multiRepoPermissionsOptOut(Boolean multiRepoPermissionsOptOut) {
    
    this.multiRepoPermissionsOptOut = multiRepoPermissionsOptOut;
    return this;
  }

   /**
   * Whether to authorize requested permissions from devcontainer.json
   * @return multiRepoPermissionsOptOut
  **/
  @javax.annotation.Nullable

  public Boolean getMultiRepoPermissionsOptOut() {
    return multiRepoPermissionsOptOut;
  }


  public void setMultiRepoPermissionsOptOut(Boolean multiRepoPermissionsOptOut) {
    this.multiRepoPermissionsOptOut = multiRepoPermissionsOptOut;
  }


  public CodespacesCreateWithRepoForAuthenticatedUserRequest workingDirectory(String workingDirectory) {
    
    this.workingDirectory = workingDirectory;
    return this;
  }

   /**
   * Working directory for this codespace
   * @return workingDirectory
  **/
  @javax.annotation.Nullable

  public String getWorkingDirectory() {
    return workingDirectory;
  }


  public void setWorkingDirectory(String workingDirectory) {
    this.workingDirectory = workingDirectory;
  }


  public CodespacesCreateWithRepoForAuthenticatedUserRequest idleTimeoutMinutes(Integer idleTimeoutMinutes) {
    
    this.idleTimeoutMinutes = idleTimeoutMinutes;
    return this;
  }

   /**
   * Time in minutes before codespace stops from inactivity
   * @return idleTimeoutMinutes
  **/
  @javax.annotation.Nullable

  public Integer getIdleTimeoutMinutes() {
    return idleTimeoutMinutes;
  }


  public void setIdleTimeoutMinutes(Integer idleTimeoutMinutes) {
    this.idleTimeoutMinutes = idleTimeoutMinutes;
  }


  public CodespacesCreateWithRepoForAuthenticatedUserRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name for this codespace
   * @return displayName
  **/
  @javax.annotation.Nullable

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CodespacesCreateWithRepoForAuthenticatedUserRequest retentionPeriodMinutes(Integer retentionPeriodMinutes) {
    
    this.retentionPeriodMinutes = retentionPeriodMinutes;
    return this;
  }

   /**
   * Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0 and 43200 (30 days).
   * @return retentionPeriodMinutes
  **/
  @javax.annotation.Nullable

  public Integer getRetentionPeriodMinutes() {
    return retentionPeriodMinutes;
  }


  public void setRetentionPeriodMinutes(Integer retentionPeriodMinutes) {
    this.retentionPeriodMinutes = retentionPeriodMinutes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodespacesCreateWithRepoForAuthenticatedUserRequest codespacesCreateWithRepoForAuthenticatedUserRequest = (CodespacesCreateWithRepoForAuthenticatedUserRequest) o;
    return Objects.equals(this.ref, codespacesCreateWithRepoForAuthenticatedUserRequest.ref) &&
        Objects.equals(this.location, codespacesCreateWithRepoForAuthenticatedUserRequest.location) &&
        Objects.equals(this.geo, codespacesCreateWithRepoForAuthenticatedUserRequest.geo) &&
        Objects.equals(this.clientIp, codespacesCreateWithRepoForAuthenticatedUserRequest.clientIp) &&
        Objects.equals(this.machine, codespacesCreateWithRepoForAuthenticatedUserRequest.machine) &&
        Objects.equals(this.devcontainerPath, codespacesCreateWithRepoForAuthenticatedUserRequest.devcontainerPath) &&
        Objects.equals(this.multiRepoPermissionsOptOut, codespacesCreateWithRepoForAuthenticatedUserRequest.multiRepoPermissionsOptOut) &&
        Objects.equals(this.workingDirectory, codespacesCreateWithRepoForAuthenticatedUserRequest.workingDirectory) &&
        Objects.equals(this.idleTimeoutMinutes, codespacesCreateWithRepoForAuthenticatedUserRequest.idleTimeoutMinutes) &&
        Objects.equals(this.displayName, codespacesCreateWithRepoForAuthenticatedUserRequest.displayName) &&
        Objects.equals(this.retentionPeriodMinutes, codespacesCreateWithRepoForAuthenticatedUserRequest.retentionPeriodMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, location, geo, clientIp, machine, devcontainerPath, multiRepoPermissionsOptOut, workingDirectory, idleTimeoutMinutes, displayName, retentionPeriodMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodespacesCreateWithRepoForAuthenticatedUserRequest {\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    machine: ").append(toIndentedString(machine)).append("\n");
    sb.append("    devcontainerPath: ").append(toIndentedString(devcontainerPath)).append("\n");
    sb.append("    multiRepoPermissionsOptOut: ").append(toIndentedString(multiRepoPermissionsOptOut)).append("\n");
    sb.append("    workingDirectory: ").append(toIndentedString(workingDirectory)).append("\n");
    sb.append("    idleTimeoutMinutes: ").append(toIndentedString(idleTimeoutMinutes)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    retentionPeriodMinutes: ").append(toIndentedString(retentionPeriodMinutes)).append("\n");
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
    openapiFields.add("ref");
    openapiFields.add("location");
    openapiFields.add("geo");
    openapiFields.add("client_ip");
    openapiFields.add("machine");
    openapiFields.add("devcontainer_path");
    openapiFields.add("multi_repo_permissions_opt_out");
    openapiFields.add("working_directory");
    openapiFields.add("idle_timeout_minutes");
    openapiFields.add("display_name");
    openapiFields.add("retention_period_minutes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CodespacesCreateWithRepoForAuthenticatedUserRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CodespacesCreateWithRepoForAuthenticatedUserRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CodespacesCreateWithRepoForAuthenticatedUserRequest is not found in the empty JSON string", CodespacesCreateWithRepoForAuthenticatedUserRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CodespacesCreateWithRepoForAuthenticatedUserRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CodespacesCreateWithRepoForAuthenticatedUserRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("ref") != null && !jsonObj.get("ref").isJsonNull()) && !jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("geo") != null && !jsonObj.get("geo").isJsonNull()) && !jsonObj.get("geo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `geo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("geo").toString()));
      }
      if ((jsonObj.get("client_ip") != null && !jsonObj.get("client_ip").isJsonNull()) && !jsonObj.get("client_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_ip").toString()));
      }
      if ((jsonObj.get("machine") != null && !jsonObj.get("machine").isJsonNull()) && !jsonObj.get("machine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `machine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("machine").toString()));
      }
      if ((jsonObj.get("devcontainer_path") != null && !jsonObj.get("devcontainer_path").isJsonNull()) && !jsonObj.get("devcontainer_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `devcontainer_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("devcontainer_path").toString()));
      }
      if ((jsonObj.get("working_directory") != null && !jsonObj.get("working_directory").isJsonNull()) && !jsonObj.get("working_directory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `working_directory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("working_directory").toString()));
      }
      if ((jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()) && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CodespacesCreateWithRepoForAuthenticatedUserRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CodespacesCreateWithRepoForAuthenticatedUserRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CodespacesCreateWithRepoForAuthenticatedUserRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CodespacesCreateWithRepoForAuthenticatedUserRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CodespacesCreateWithRepoForAuthenticatedUserRequest>() {
           @Override
           public void write(JsonWriter out, CodespacesCreateWithRepoForAuthenticatedUserRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CodespacesCreateWithRepoForAuthenticatedUserRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CodespacesCreateWithRepoForAuthenticatedUserRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CodespacesCreateWithRepoForAuthenticatedUserRequest
  * @throws IOException if the JSON string is invalid with respect to CodespacesCreateWithRepoForAuthenticatedUserRequest
  */
  public static CodespacesCreateWithRepoForAuthenticatedUserRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CodespacesCreateWithRepoForAuthenticatedUserRequest.class);
  }

 /**
  * Convert an instance of CodespacesCreateWithRepoForAuthenticatedUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

