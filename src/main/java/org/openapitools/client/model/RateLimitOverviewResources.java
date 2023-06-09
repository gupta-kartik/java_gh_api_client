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
import org.openapitools.client.model.RateLimit;

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
 * RateLimitOverviewResources
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class RateLimitOverviewResources {
  public static final String SERIALIZED_NAME_CORE = "core";
  @SerializedName(SERIALIZED_NAME_CORE)
  private RateLimit core;

  public static final String SERIALIZED_NAME_GRAPHQL = "graphql";
  @SerializedName(SERIALIZED_NAME_GRAPHQL)
  private RateLimit graphql;

  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private RateLimit search;

  public static final String SERIALIZED_NAME_SOURCE_IMPORT = "source_import";
  @SerializedName(SERIALIZED_NAME_SOURCE_IMPORT)
  private RateLimit sourceImport;

  public static final String SERIALIZED_NAME_INTEGRATION_MANIFEST = "integration_manifest";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_MANIFEST)
  private RateLimit integrationManifest;

  public static final String SERIALIZED_NAME_CODE_SCANNING_UPLOAD = "code_scanning_upload";
  @SerializedName(SERIALIZED_NAME_CODE_SCANNING_UPLOAD)
  private RateLimit codeScanningUpload;

  public static final String SERIALIZED_NAME_ACTIONS_RUNNER_REGISTRATION = "actions_runner_registration";
  @SerializedName(SERIALIZED_NAME_ACTIONS_RUNNER_REGISTRATION)
  private RateLimit actionsRunnerRegistration;

  public static final String SERIALIZED_NAME_SCIM = "scim";
  @SerializedName(SERIALIZED_NAME_SCIM)
  private RateLimit scim;

  public static final String SERIALIZED_NAME_DEPENDENCY_SNAPSHOTS = "dependency_snapshots";
  @SerializedName(SERIALIZED_NAME_DEPENDENCY_SNAPSHOTS)
  private RateLimit dependencySnapshots;

  public RateLimitOverviewResources() {
  }

  public RateLimitOverviewResources core(RateLimit core) {
    
    this.core = core;
    return this;
  }

   /**
   * Get core
   * @return core
  **/
  @javax.annotation.Nonnull

  public RateLimit getCore() {
    return core;
  }


  public void setCore(RateLimit core) {
    this.core = core;
  }


  public RateLimitOverviewResources graphql(RateLimit graphql) {
    
    this.graphql = graphql;
    return this;
  }

   /**
   * Get graphql
   * @return graphql
  **/
  @javax.annotation.Nullable

  public RateLimit getGraphql() {
    return graphql;
  }


  public void setGraphql(RateLimit graphql) {
    this.graphql = graphql;
  }


  public RateLimitOverviewResources search(RateLimit search) {
    
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/
  @javax.annotation.Nonnull

  public RateLimit getSearch() {
    return search;
  }


  public void setSearch(RateLimit search) {
    this.search = search;
  }


  public RateLimitOverviewResources sourceImport(RateLimit sourceImport) {
    
    this.sourceImport = sourceImport;
    return this;
  }

   /**
   * Get sourceImport
   * @return sourceImport
  **/
  @javax.annotation.Nullable

  public RateLimit getSourceImport() {
    return sourceImport;
  }


  public void setSourceImport(RateLimit sourceImport) {
    this.sourceImport = sourceImport;
  }


  public RateLimitOverviewResources integrationManifest(RateLimit integrationManifest) {
    
    this.integrationManifest = integrationManifest;
    return this;
  }

   /**
   * Get integrationManifest
   * @return integrationManifest
  **/
  @javax.annotation.Nullable

  public RateLimit getIntegrationManifest() {
    return integrationManifest;
  }


  public void setIntegrationManifest(RateLimit integrationManifest) {
    this.integrationManifest = integrationManifest;
  }


  public RateLimitOverviewResources codeScanningUpload(RateLimit codeScanningUpload) {
    
    this.codeScanningUpload = codeScanningUpload;
    return this;
  }

   /**
   * Get codeScanningUpload
   * @return codeScanningUpload
  **/
  @javax.annotation.Nullable

  public RateLimit getCodeScanningUpload() {
    return codeScanningUpload;
  }


  public void setCodeScanningUpload(RateLimit codeScanningUpload) {
    this.codeScanningUpload = codeScanningUpload;
  }


  public RateLimitOverviewResources actionsRunnerRegistration(RateLimit actionsRunnerRegistration) {
    
    this.actionsRunnerRegistration = actionsRunnerRegistration;
    return this;
  }

   /**
   * Get actionsRunnerRegistration
   * @return actionsRunnerRegistration
  **/
  @javax.annotation.Nullable

  public RateLimit getActionsRunnerRegistration() {
    return actionsRunnerRegistration;
  }


  public void setActionsRunnerRegistration(RateLimit actionsRunnerRegistration) {
    this.actionsRunnerRegistration = actionsRunnerRegistration;
  }


  public RateLimitOverviewResources scim(RateLimit scim) {
    
    this.scim = scim;
    return this;
  }

   /**
   * Get scim
   * @return scim
  **/
  @javax.annotation.Nullable

  public RateLimit getScim() {
    return scim;
  }


  public void setScim(RateLimit scim) {
    this.scim = scim;
  }


  public RateLimitOverviewResources dependencySnapshots(RateLimit dependencySnapshots) {
    
    this.dependencySnapshots = dependencySnapshots;
    return this;
  }

   /**
   * Get dependencySnapshots
   * @return dependencySnapshots
  **/
  @javax.annotation.Nullable

  public RateLimit getDependencySnapshots() {
    return dependencySnapshots;
  }


  public void setDependencySnapshots(RateLimit dependencySnapshots) {
    this.dependencySnapshots = dependencySnapshots;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLimitOverviewResources rateLimitOverviewResources = (RateLimitOverviewResources) o;
    return Objects.equals(this.core, rateLimitOverviewResources.core) &&
        Objects.equals(this.graphql, rateLimitOverviewResources.graphql) &&
        Objects.equals(this.search, rateLimitOverviewResources.search) &&
        Objects.equals(this.sourceImport, rateLimitOverviewResources.sourceImport) &&
        Objects.equals(this.integrationManifest, rateLimitOverviewResources.integrationManifest) &&
        Objects.equals(this.codeScanningUpload, rateLimitOverviewResources.codeScanningUpload) &&
        Objects.equals(this.actionsRunnerRegistration, rateLimitOverviewResources.actionsRunnerRegistration) &&
        Objects.equals(this.scim, rateLimitOverviewResources.scim) &&
        Objects.equals(this.dependencySnapshots, rateLimitOverviewResources.dependencySnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(core, graphql, search, sourceImport, integrationManifest, codeScanningUpload, actionsRunnerRegistration, scim, dependencySnapshots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLimitOverviewResources {\n");
    sb.append("    core: ").append(toIndentedString(core)).append("\n");
    sb.append("    graphql: ").append(toIndentedString(graphql)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    sourceImport: ").append(toIndentedString(sourceImport)).append("\n");
    sb.append("    integrationManifest: ").append(toIndentedString(integrationManifest)).append("\n");
    sb.append("    codeScanningUpload: ").append(toIndentedString(codeScanningUpload)).append("\n");
    sb.append("    actionsRunnerRegistration: ").append(toIndentedString(actionsRunnerRegistration)).append("\n");
    sb.append("    scim: ").append(toIndentedString(scim)).append("\n");
    sb.append("    dependencySnapshots: ").append(toIndentedString(dependencySnapshots)).append("\n");
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
    openapiFields.add("core");
    openapiFields.add("graphql");
    openapiFields.add("search");
    openapiFields.add("source_import");
    openapiFields.add("integration_manifest");
    openapiFields.add("code_scanning_upload");
    openapiFields.add("actions_runner_registration");
    openapiFields.add("scim");
    openapiFields.add("dependency_snapshots");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("core");
    openapiRequiredFields.add("search");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RateLimitOverviewResources
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RateLimitOverviewResources.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RateLimitOverviewResources is not found in the empty JSON string", RateLimitOverviewResources.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RateLimitOverviewResources.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RateLimitOverviewResources` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RateLimitOverviewResources.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `core`
      RateLimit.validateJsonObject(jsonObj.getAsJsonObject("core"));
      // validate the optional field `graphql`
      if (jsonObj.get("graphql") != null && !jsonObj.get("graphql").isJsonNull()) {
        RateLimit.validateJsonObject(jsonObj.getAsJsonObject("graphql"));
      }
      // validate the required field `search`
      RateLimit.validateJsonObject(jsonObj.getAsJsonObject("search"));
      // validate the optional field `source_import`
      if (jsonObj.get("source_import") != null && !jsonObj.get("source_import").isJsonNull()) {
        RateLimit.validateJsonObject(jsonObj.getAsJsonObject("source_import"));
      }
      // validate the optional field `integration_manifest`
      if (jsonObj.get("integration_manifest") != null && !jsonObj.get("integration_manifest").isJsonNull()) {
        RateLimit.validateJsonObject(jsonObj.getAsJsonObject("integration_manifest"));
      }
      // validate the optional field `code_scanning_upload`
      if (jsonObj.get("code_scanning_upload") != null && !jsonObj.get("code_scanning_upload").isJsonNull()) {
        RateLimit.validateJsonObject(jsonObj.getAsJsonObject("code_scanning_upload"));
      }
      // validate the optional field `actions_runner_registration`
      if (jsonObj.get("actions_runner_registration") != null && !jsonObj.get("actions_runner_registration").isJsonNull()) {
        RateLimit.validateJsonObject(jsonObj.getAsJsonObject("actions_runner_registration"));
      }
      // validate the optional field `scim`
      if (jsonObj.get("scim") != null && !jsonObj.get("scim").isJsonNull()) {
        RateLimit.validateJsonObject(jsonObj.getAsJsonObject("scim"));
      }
      // validate the optional field `dependency_snapshots`
      if (jsonObj.get("dependency_snapshots") != null && !jsonObj.get("dependency_snapshots").isJsonNull()) {
        RateLimit.validateJsonObject(jsonObj.getAsJsonObject("dependency_snapshots"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RateLimitOverviewResources.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RateLimitOverviewResources' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RateLimitOverviewResources> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RateLimitOverviewResources.class));

       return (TypeAdapter<T>) new TypeAdapter<RateLimitOverviewResources>() {
           @Override
           public void write(JsonWriter out, RateLimitOverviewResources value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RateLimitOverviewResources read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RateLimitOverviewResources given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RateLimitOverviewResources
  * @throws IOException if the JSON string is invalid with respect to RateLimitOverviewResources
  */
  public static RateLimitOverviewResources fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RateLimitOverviewResources.class);
  }

 /**
  * Convert an instance of RateLimitOverviewResources to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

