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
import org.openapitools.client.model.CodeScanningAnalysisTool;

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
 * CodeScanningAnalysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class CodeScanningAnalysis {
  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_COMMIT_SHA = "commit_sha";
  @SerializedName(SERIALIZED_NAME_COMMIT_SHA)
  private String commitSha;

  public static final String SERIALIZED_NAME_ANALYSIS_KEY = "analysis_key";
  @SerializedName(SERIALIZED_NAME_ANALYSIS_KEY)
  private String analysisKey;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private String environment;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_RESULTS_COUNT = "results_count";
  @SerializedName(SERIALIZED_NAME_RESULTS_COUNT)
  private Integer resultsCount;

  public static final String SERIALIZED_NAME_RULES_COUNT = "rules_count";
  @SerializedName(SERIALIZED_NAME_RULES_COUNT)
  private Integer rulesCount;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_SARIF_ID = "sarif_id";
  @SerializedName(SERIALIZED_NAME_SARIF_ID)
  private String sarifId;

  public static final String SERIALIZED_NAME_TOOL = "tool";
  @SerializedName(SERIALIZED_NAME_TOOL)
  private CodeScanningAnalysisTool tool;

  public static final String SERIALIZED_NAME_DELETABLE = "deletable";
  @SerializedName(SERIALIZED_NAME_DELETABLE)
  private Boolean deletable;

  public static final String SERIALIZED_NAME_WARNING = "warning";
  @SerializedName(SERIALIZED_NAME_WARNING)
  private String warning;

  public CodeScanningAnalysis() {
  }

  
  public CodeScanningAnalysis(
     OffsetDateTime createdAt, 
     URI url
  ) {
    this();
    this.createdAt = createdAt;
    this.url = url;
  }

  public CodeScanningAnalysis ref(String ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * The full Git reference, formatted as &#x60;refs/heads/&lt;branch name&gt;&#x60;, &#x60;refs/pull/&lt;number&gt;/merge&#x60;, or &#x60;refs/pull/&lt;number&gt;/head&#x60;.
   * @return ref
  **/
  @javax.annotation.Nonnull

  public String getRef() {
    return ref;
  }


  public void setRef(String ref) {
    this.ref = ref;
  }


  public CodeScanningAnalysis commitSha(String commitSha) {
    
    this.commitSha = commitSha;
    return this;
  }

   /**
   * The SHA of the commit to which the analysis you are uploading relates.
   * @return commitSha
  **/
  @javax.annotation.Nonnull

  public String getCommitSha() {
    return commitSha;
  }


  public void setCommitSha(String commitSha) {
    this.commitSha = commitSha;
  }


  public CodeScanningAnalysis analysisKey(String analysisKey) {
    
    this.analysisKey = analysisKey;
    return this;
  }

   /**
   * Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name.
   * @return analysisKey
  **/
  @javax.annotation.Nonnull

  public String getAnalysisKey() {
    return analysisKey;
  }


  public void setAnalysisKey(String analysisKey) {
    this.analysisKey = analysisKey;
  }


  public CodeScanningAnalysis environment(String environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Identifies the variable values associated with the environment in which this analysis was performed.
   * @return environment
  **/
  @javax.annotation.Nonnull

  public String getEnvironment() {
    return environment;
  }


  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public CodeScanningAnalysis category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Identifies the configuration under which the analysis was executed. Used to distinguish between multiple analyses for the same tool and commit, but performed on different languages or different parts of the code.
   * @return category
  **/
  @javax.annotation.Nullable

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public CodeScanningAnalysis error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nonnull

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


   /**
   * The time that the analysis was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;.
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  public CodeScanningAnalysis resultsCount(Integer resultsCount) {
    
    this.resultsCount = resultsCount;
    return this;
  }

   /**
   * The total number of results in the analysis.
   * @return resultsCount
  **/
  @javax.annotation.Nonnull

  public Integer getResultsCount() {
    return resultsCount;
  }


  public void setResultsCount(Integer resultsCount) {
    this.resultsCount = resultsCount;
  }


  public CodeScanningAnalysis rulesCount(Integer rulesCount) {
    
    this.rulesCount = rulesCount;
    return this;
  }

   /**
   * The total number of rules used in the analysis.
   * @return rulesCount
  **/
  @javax.annotation.Nonnull

  public Integer getRulesCount() {
    return rulesCount;
  }


  public void setRulesCount(Integer rulesCount) {
    this.rulesCount = rulesCount;
  }


  public CodeScanningAnalysis id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for this analysis.
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


   /**
   * The REST API URL of the analysis resource.
   * @return url
  **/
  @javax.annotation.Nonnull

  public URI getUrl() {
    return url;
  }




  public CodeScanningAnalysis sarifId(String sarifId) {
    
    this.sarifId = sarifId;
    return this;
  }

   /**
   * An identifier for the upload.
   * @return sarifId
  **/
  @javax.annotation.Nonnull

  public String getSarifId() {
    return sarifId;
  }


  public void setSarifId(String sarifId) {
    this.sarifId = sarifId;
  }


  public CodeScanningAnalysis tool(CodeScanningAnalysisTool tool) {
    
    this.tool = tool;
    return this;
  }

   /**
   * Get tool
   * @return tool
  **/
  @javax.annotation.Nonnull

  public CodeScanningAnalysisTool getTool() {
    return tool;
  }


  public void setTool(CodeScanningAnalysisTool tool) {
    this.tool = tool;
  }


  public CodeScanningAnalysis deletable(Boolean deletable) {
    
    this.deletable = deletable;
    return this;
  }

   /**
   * Get deletable
   * @return deletable
  **/
  @javax.annotation.Nonnull

  public Boolean getDeletable() {
    return deletable;
  }


  public void setDeletable(Boolean deletable) {
    this.deletable = deletable;
  }


  public CodeScanningAnalysis warning(String warning) {
    
    this.warning = warning;
    return this;
  }

   /**
   * Warning generated when processing the analysis
   * @return warning
  **/
  @javax.annotation.Nonnull

  public String getWarning() {
    return warning;
  }


  public void setWarning(String warning) {
    this.warning = warning;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeScanningAnalysis codeScanningAnalysis = (CodeScanningAnalysis) o;
    return Objects.equals(this.ref, codeScanningAnalysis.ref) &&
        Objects.equals(this.commitSha, codeScanningAnalysis.commitSha) &&
        Objects.equals(this.analysisKey, codeScanningAnalysis.analysisKey) &&
        Objects.equals(this.environment, codeScanningAnalysis.environment) &&
        Objects.equals(this.category, codeScanningAnalysis.category) &&
        Objects.equals(this.error, codeScanningAnalysis.error) &&
        Objects.equals(this.createdAt, codeScanningAnalysis.createdAt) &&
        Objects.equals(this.resultsCount, codeScanningAnalysis.resultsCount) &&
        Objects.equals(this.rulesCount, codeScanningAnalysis.rulesCount) &&
        Objects.equals(this.id, codeScanningAnalysis.id) &&
        Objects.equals(this.url, codeScanningAnalysis.url) &&
        Objects.equals(this.sarifId, codeScanningAnalysis.sarifId) &&
        Objects.equals(this.tool, codeScanningAnalysis.tool) &&
        Objects.equals(this.deletable, codeScanningAnalysis.deletable) &&
        Objects.equals(this.warning, codeScanningAnalysis.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, commitSha, analysisKey, environment, category, error, createdAt, resultsCount, rulesCount, id, url, sarifId, tool, deletable, warning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeScanningAnalysis {\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    commitSha: ").append(toIndentedString(commitSha)).append("\n");
    sb.append("    analysisKey: ").append(toIndentedString(analysisKey)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    resultsCount: ").append(toIndentedString(resultsCount)).append("\n");
    sb.append("    rulesCount: ").append(toIndentedString(rulesCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    sarifId: ").append(toIndentedString(sarifId)).append("\n");
    sb.append("    tool: ").append(toIndentedString(tool)).append("\n");
    sb.append("    deletable: ").append(toIndentedString(deletable)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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
    openapiFields.add("commit_sha");
    openapiFields.add("analysis_key");
    openapiFields.add("environment");
    openapiFields.add("category");
    openapiFields.add("error");
    openapiFields.add("created_at");
    openapiFields.add("results_count");
    openapiFields.add("rules_count");
    openapiFields.add("id");
    openapiFields.add("url");
    openapiFields.add("sarif_id");
    openapiFields.add("tool");
    openapiFields.add("deletable");
    openapiFields.add("warning");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ref");
    openapiRequiredFields.add("commit_sha");
    openapiRequiredFields.add("analysis_key");
    openapiRequiredFields.add("environment");
    openapiRequiredFields.add("error");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("results_count");
    openapiRequiredFields.add("rules_count");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("sarif_id");
    openapiRequiredFields.add("tool");
    openapiRequiredFields.add("deletable");
    openapiRequiredFields.add("warning");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CodeScanningAnalysis
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CodeScanningAnalysis.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CodeScanningAnalysis is not found in the empty JSON string", CodeScanningAnalysis.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CodeScanningAnalysis.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CodeScanningAnalysis` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CodeScanningAnalysis.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      if (!jsonObj.get("commit_sha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_sha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_sha").toString()));
      }
      if (!jsonObj.get("analysis_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `analysis_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("analysis_key").toString()));
      }
      if (!jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (!jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("sarif_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sarif_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sarif_id").toString()));
      }
      // validate the required field `tool`
      CodeScanningAnalysisTool.validateJsonObject(jsonObj.getAsJsonObject("tool"));
      if (!jsonObj.get("warning").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warning` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warning").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CodeScanningAnalysis.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CodeScanningAnalysis' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CodeScanningAnalysis> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CodeScanningAnalysis.class));

       return (TypeAdapter<T>) new TypeAdapter<CodeScanningAnalysis>() {
           @Override
           public void write(JsonWriter out, CodeScanningAnalysis value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CodeScanningAnalysis read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CodeScanningAnalysis given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CodeScanningAnalysis
  * @throws IOException if the JSON string is invalid with respect to CodeScanningAnalysis
  */
  public static CodeScanningAnalysis fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CodeScanningAnalysis.class);
  }

 /**
  * Convert an instance of CodeScanningAnalysis to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

