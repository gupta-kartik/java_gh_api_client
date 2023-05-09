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
 * WebhookCheckSuiteRerequestedActionsMetaRerunInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookCheckSuiteRerequestedActionsMetaRerunInfo {
  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_JOB_IDS = "job_ids";
  @SerializedName(SERIALIZED_NAME_JOB_IDS)
  private List<String> jobIds;

  public WebhookCheckSuiteRerequestedActionsMetaRerunInfo() {
  }

  public WebhookCheckSuiteRerequestedActionsMetaRerunInfo planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @javax.annotation.Nullable

  public String getPlanId() {
    return planId;
  }


  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public WebhookCheckSuiteRerequestedActionsMetaRerunInfo jobIds(List<String> jobIds) {
    
    this.jobIds = jobIds;
    return this;
  }

  public WebhookCheckSuiteRerequestedActionsMetaRerunInfo addJobIdsItem(String jobIdsItem) {
    if (this.jobIds == null) {
      this.jobIds = new ArrayList<>();
    }
    this.jobIds.add(jobIdsItem);
    return this;
  }

   /**
   * Get jobIds
   * @return jobIds
  **/
  @javax.annotation.Nullable

  public List<String> getJobIds() {
    return jobIds;
  }


  public void setJobIds(List<String> jobIds) {
    this.jobIds = jobIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookCheckSuiteRerequestedActionsMetaRerunInfo webhookCheckSuiteRerequestedActionsMetaRerunInfo = (WebhookCheckSuiteRerequestedActionsMetaRerunInfo) o;
    return Objects.equals(this.planId, webhookCheckSuiteRerequestedActionsMetaRerunInfo.planId) &&
        Objects.equals(this.jobIds, webhookCheckSuiteRerequestedActionsMetaRerunInfo.jobIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planId, jobIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookCheckSuiteRerequestedActionsMetaRerunInfo {\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
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
    openapiFields.add("plan_id");
    openapiFields.add("job_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookCheckSuiteRerequestedActionsMetaRerunInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookCheckSuiteRerequestedActionsMetaRerunInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookCheckSuiteRerequestedActionsMetaRerunInfo is not found in the empty JSON string", WebhookCheckSuiteRerequestedActionsMetaRerunInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookCheckSuiteRerequestedActionsMetaRerunInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookCheckSuiteRerequestedActionsMetaRerunInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonNull()) && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("job_ids") != null && !jsonObj.get("job_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_ids` to be an array in the JSON string but got `%s`", jsonObj.get("job_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookCheckSuiteRerequestedActionsMetaRerunInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookCheckSuiteRerequestedActionsMetaRerunInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookCheckSuiteRerequestedActionsMetaRerunInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookCheckSuiteRerequestedActionsMetaRerunInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookCheckSuiteRerequestedActionsMetaRerunInfo>() {
           @Override
           public void write(JsonWriter out, WebhookCheckSuiteRerequestedActionsMetaRerunInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookCheckSuiteRerequestedActionsMetaRerunInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookCheckSuiteRerequestedActionsMetaRerunInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookCheckSuiteRerequestedActionsMetaRerunInfo
  * @throws IOException if the JSON string is invalid with respect to WebhookCheckSuiteRerequestedActionsMetaRerunInfo
  */
  public static WebhookCheckSuiteRerequestedActionsMetaRerunInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookCheckSuiteRerequestedActionsMetaRerunInfo.class);
  }

 /**
  * Convert an instance of WebhookCheckSuiteRerequestedActionsMetaRerunInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
