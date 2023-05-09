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
import org.openapitools.client.model.CodeScanningAlertClassification;
import org.openapitools.client.model.CodeScanningAlertInstanceMessage;
import org.openapitools.client.model.CodeScanningAlertLocation;
import org.openapitools.client.model.CodeScanningAlertState;

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
 * CodeScanningAlertInstance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class CodeScanningAlertInstance {
  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_ANALYSIS_KEY = "analysis_key";
  @SerializedName(SERIALIZED_NAME_ANALYSIS_KEY)
  private String analysisKey;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private String environment;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private CodeScanningAlertState state;

  public static final String SERIALIZED_NAME_COMMIT_SHA = "commit_sha";
  @SerializedName(SERIALIZED_NAME_COMMIT_SHA)
  private String commitSha;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private CodeScanningAlertInstanceMessage message;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private CodeScanningAlertLocation location;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private String htmlUrl;

  public static final String SERIALIZED_NAME_CLASSIFICATIONS = "classifications";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATIONS)
  private List<CodeScanningAlertClassification> classifications;

  public CodeScanningAlertInstance() {
  }

  public CodeScanningAlertInstance ref(String ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * The full Git reference, formatted as &#x60;refs/heads/&lt;branch name&gt;&#x60;, &#x60;refs/pull/&lt;number&gt;/merge&#x60;, or &#x60;refs/pull/&lt;number&gt;/head&#x60;.
   * @return ref
  **/
  @javax.annotation.Nullable

  public String getRef() {
    return ref;
  }


  public void setRef(String ref) {
    this.ref = ref;
  }


  public CodeScanningAlertInstance analysisKey(String analysisKey) {
    
    this.analysisKey = analysisKey;
    return this;
  }

   /**
   * Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name.
   * @return analysisKey
  **/
  @javax.annotation.Nullable

  public String getAnalysisKey() {
    return analysisKey;
  }


  public void setAnalysisKey(String analysisKey) {
    this.analysisKey = analysisKey;
  }


  public CodeScanningAlertInstance environment(String environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Identifies the variable values associated with the environment in which the analysis that generated this alert instance was performed, such as the language that was analyzed.
   * @return environment
  **/
  @javax.annotation.Nullable

  public String getEnvironment() {
    return environment;
  }


  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public CodeScanningAlertInstance category(String category) {
    
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


  public CodeScanningAlertInstance state(CodeScanningAlertState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable

  public CodeScanningAlertState getState() {
    return state;
  }


  public void setState(CodeScanningAlertState state) {
    this.state = state;
  }


  public CodeScanningAlertInstance commitSha(String commitSha) {
    
    this.commitSha = commitSha;
    return this;
  }

   /**
   * Get commitSha
   * @return commitSha
  **/
  @javax.annotation.Nullable

  public String getCommitSha() {
    return commitSha;
  }


  public void setCommitSha(String commitSha) {
    this.commitSha = commitSha;
  }


  public CodeScanningAlertInstance message(CodeScanningAlertInstanceMessage message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable

  public CodeScanningAlertInstanceMessage getMessage() {
    return message;
  }


  public void setMessage(CodeScanningAlertInstanceMessage message) {
    this.message = message;
  }


  public CodeScanningAlertInstance location(CodeScanningAlertLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable

  public CodeScanningAlertLocation getLocation() {
    return location;
  }


  public void setLocation(CodeScanningAlertLocation location) {
    this.location = location;
  }


  public CodeScanningAlertInstance htmlUrl(String htmlUrl) {
    
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @javax.annotation.Nullable

  public String getHtmlUrl() {
    return htmlUrl;
  }


  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }


  public CodeScanningAlertInstance classifications(List<CodeScanningAlertClassification> classifications) {
    
    this.classifications = classifications;
    return this;
  }

  public CodeScanningAlertInstance addClassificationsItem(CodeScanningAlertClassification classificationsItem) {
    if (this.classifications == null) {
      this.classifications = new ArrayList<>();
    }
    this.classifications.add(classificationsItem);
    return this;
  }

   /**
   * Classifications that have been applied to the file that triggered the alert. For example identifying it as documentation, or a generated file.
   * @return classifications
  **/
  @javax.annotation.Nullable

  public List<CodeScanningAlertClassification> getClassifications() {
    return classifications;
  }


  public void setClassifications(List<CodeScanningAlertClassification> classifications) {
    this.classifications = classifications;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeScanningAlertInstance codeScanningAlertInstance = (CodeScanningAlertInstance) o;
    return Objects.equals(this.ref, codeScanningAlertInstance.ref) &&
        Objects.equals(this.analysisKey, codeScanningAlertInstance.analysisKey) &&
        Objects.equals(this.environment, codeScanningAlertInstance.environment) &&
        Objects.equals(this.category, codeScanningAlertInstance.category) &&
        Objects.equals(this.state, codeScanningAlertInstance.state) &&
        Objects.equals(this.commitSha, codeScanningAlertInstance.commitSha) &&
        Objects.equals(this.message, codeScanningAlertInstance.message) &&
        Objects.equals(this.location, codeScanningAlertInstance.location) &&
        Objects.equals(this.htmlUrl, codeScanningAlertInstance.htmlUrl) &&
        Objects.equals(this.classifications, codeScanningAlertInstance.classifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, analysisKey, environment, category, state, commitSha, message, location, htmlUrl, classifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeScanningAlertInstance {\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    analysisKey: ").append(toIndentedString(analysisKey)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    commitSha: ").append(toIndentedString(commitSha)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
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
    openapiFields.add("analysis_key");
    openapiFields.add("environment");
    openapiFields.add("category");
    openapiFields.add("state");
    openapiFields.add("commit_sha");
    openapiFields.add("message");
    openapiFields.add("location");
    openapiFields.add("html_url");
    openapiFields.add("classifications");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CodeScanningAlertInstance
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CodeScanningAlertInstance.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CodeScanningAlertInstance is not found in the empty JSON string", CodeScanningAlertInstance.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CodeScanningAlertInstance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CodeScanningAlertInstance` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("ref") != null && !jsonObj.get("ref").isJsonNull()) && !jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      if ((jsonObj.get("analysis_key") != null && !jsonObj.get("analysis_key").isJsonNull()) && !jsonObj.get("analysis_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `analysis_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("analysis_key").toString()));
      }
      if ((jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) && !jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("commit_sha") != null && !jsonObj.get("commit_sha").isJsonNull()) && !jsonObj.get("commit_sha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_sha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_sha").toString()));
      }
      // validate the optional field `message`
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) {
        CodeScanningAlertInstanceMessage.validateJsonObject(jsonObj.getAsJsonObject("message"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        CodeScanningAlertLocation.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      if ((jsonObj.get("html_url") != null && !jsonObj.get("html_url").isJsonNull()) && !jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("classifications") != null && !jsonObj.get("classifications").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `classifications` to be an array in the JSON string but got `%s`", jsonObj.get("classifications").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CodeScanningAlertInstance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CodeScanningAlertInstance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CodeScanningAlertInstance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CodeScanningAlertInstance.class));

       return (TypeAdapter<T>) new TypeAdapter<CodeScanningAlertInstance>() {
           @Override
           public void write(JsonWriter out, CodeScanningAlertInstance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CodeScanningAlertInstance read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CodeScanningAlertInstance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CodeScanningAlertInstance
  * @throws IOException if the JSON string is invalid with respect to CodeScanningAlertInstance
  */
  public static CodeScanningAlertInstance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CodeScanningAlertInstance.class);
  }

 /**
  * Convert an instance of CodeScanningAlertInstance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

