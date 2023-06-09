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
import org.openapitools.client.model.CodeScanningAlertDismissedReason;
import org.openapitools.client.model.CodeScanningAlertInstance;
import org.openapitools.client.model.CodeScanningAlertRuleSummary;
import org.openapitools.client.model.CodeScanningAlertState;
import org.openapitools.client.model.CodeScanningAnalysisTool;
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
 * CodeScanningAlertItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class CodeScanningAlertItems {
  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_INSTANCES_URL = "instances_url";
  @SerializedName(SERIALIZED_NAME_INSTANCES_URL)
  private URI instancesUrl;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private CodeScanningAlertState state;

  public static final String SERIALIZED_NAME_FIXED_AT = "fixed_at";
  @SerializedName(SERIALIZED_NAME_FIXED_AT)
  private OffsetDateTime fixedAt;

  public static final String SERIALIZED_NAME_DISMISSED_BY = "dismissed_by";
  @SerializedName(SERIALIZED_NAME_DISMISSED_BY)
  private NullableSimpleUser dismissedBy;

  public static final String SERIALIZED_NAME_DISMISSED_AT = "dismissed_at";
  @SerializedName(SERIALIZED_NAME_DISMISSED_AT)
  private OffsetDateTime dismissedAt;

  public static final String SERIALIZED_NAME_DISMISSED_REASON = "dismissed_reason";
  @SerializedName(SERIALIZED_NAME_DISMISSED_REASON)
  private CodeScanningAlertDismissedReason dismissedReason;

  public static final String SERIALIZED_NAME_DISMISSED_COMMENT = "dismissed_comment";
  @SerializedName(SERIALIZED_NAME_DISMISSED_COMMENT)
  private String dismissedComment;

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private CodeScanningAlertRuleSummary rule;

  public static final String SERIALIZED_NAME_TOOL = "tool";
  @SerializedName(SERIALIZED_NAME_TOOL)
  private CodeScanningAnalysisTool tool;

  public static final String SERIALIZED_NAME_MOST_RECENT_INSTANCE = "most_recent_instance";
  @SerializedName(SERIALIZED_NAME_MOST_RECENT_INSTANCE)
  private CodeScanningAlertInstance mostRecentInstance;

  public CodeScanningAlertItems() {
  }

  
  public CodeScanningAlertItems(
     Integer number, 
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt, 
     URI url, 
     URI htmlUrl, 
     URI instancesUrl, 
     OffsetDateTime fixedAt, 
     OffsetDateTime dismissedAt
  ) {
    this();
    this.number = number;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.url = url;
    this.htmlUrl = htmlUrl;
    this.instancesUrl = instancesUrl;
    this.fixedAt = fixedAt;
    this.dismissedAt = dismissedAt;
  }

   /**
   * The security alert number.
   * @return number
  **/
  @javax.annotation.Nonnull

  public Integer getNumber() {
    return number;
  }




   /**
   * The time that the alert was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;.
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The time that the alert was last updated in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;.
   * @return updatedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




   /**
   * The REST API URL of the alert resource.
   * @return url
  **/
  @javax.annotation.Nonnull

  public URI getUrl() {
    return url;
  }




   /**
   * The GitHub URL of the alert resource.
   * @return htmlUrl
  **/
  @javax.annotation.Nonnull

  public URI getHtmlUrl() {
    return htmlUrl;
  }




   /**
   * The REST API URL for fetching the list of instances for an alert.
   * @return instancesUrl
  **/
  @javax.annotation.Nonnull

  public URI getInstancesUrl() {
    return instancesUrl;
  }




  public CodeScanningAlertItems state(CodeScanningAlertState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull

  public CodeScanningAlertState getState() {
    return state;
  }


  public void setState(CodeScanningAlertState state) {
    this.state = state;
  }


   /**
   * The time that the alert was no longer detected and was considered fixed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;.
   * @return fixedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getFixedAt() {
    return fixedAt;
  }




  public CodeScanningAlertItems dismissedBy(NullableSimpleUser dismissedBy) {
    
    this.dismissedBy = dismissedBy;
    return this;
  }

   /**
   * Get dismissedBy
   * @return dismissedBy
  **/
  @javax.annotation.Nullable

  public NullableSimpleUser getDismissedBy() {
    return dismissedBy;
  }


  public void setDismissedBy(NullableSimpleUser dismissedBy) {
    this.dismissedBy = dismissedBy;
  }


   /**
   * The time that the alert was dismissed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;.
   * @return dismissedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getDismissedAt() {
    return dismissedAt;
  }




  public CodeScanningAlertItems dismissedReason(CodeScanningAlertDismissedReason dismissedReason) {
    
    this.dismissedReason = dismissedReason;
    return this;
  }

   /**
   * Get dismissedReason
   * @return dismissedReason
  **/
  @javax.annotation.Nullable

  public CodeScanningAlertDismissedReason getDismissedReason() {
    return dismissedReason;
  }


  public void setDismissedReason(CodeScanningAlertDismissedReason dismissedReason) {
    this.dismissedReason = dismissedReason;
  }


  public CodeScanningAlertItems dismissedComment(String dismissedComment) {
    
    this.dismissedComment = dismissedComment;
    return this;
  }

   /**
   * The dismissal comment associated with the dismissal of the alert.
   * @return dismissedComment
  **/
  @javax.annotation.Nullable

  public String getDismissedComment() {
    return dismissedComment;
  }


  public void setDismissedComment(String dismissedComment) {
    this.dismissedComment = dismissedComment;
  }


  public CodeScanningAlertItems rule(CodeScanningAlertRuleSummary rule) {
    
    this.rule = rule;
    return this;
  }

   /**
   * Get rule
   * @return rule
  **/
  @javax.annotation.Nonnull

  public CodeScanningAlertRuleSummary getRule() {
    return rule;
  }


  public void setRule(CodeScanningAlertRuleSummary rule) {
    this.rule = rule;
  }


  public CodeScanningAlertItems tool(CodeScanningAnalysisTool tool) {
    
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


  public CodeScanningAlertItems mostRecentInstance(CodeScanningAlertInstance mostRecentInstance) {
    
    this.mostRecentInstance = mostRecentInstance;
    return this;
  }

   /**
   * Get mostRecentInstance
   * @return mostRecentInstance
  **/
  @javax.annotation.Nonnull

  public CodeScanningAlertInstance getMostRecentInstance() {
    return mostRecentInstance;
  }


  public void setMostRecentInstance(CodeScanningAlertInstance mostRecentInstance) {
    this.mostRecentInstance = mostRecentInstance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeScanningAlertItems codeScanningAlertItems = (CodeScanningAlertItems) o;
    return Objects.equals(this.number, codeScanningAlertItems.number) &&
        Objects.equals(this.createdAt, codeScanningAlertItems.createdAt) &&
        Objects.equals(this.updatedAt, codeScanningAlertItems.updatedAt) &&
        Objects.equals(this.url, codeScanningAlertItems.url) &&
        Objects.equals(this.htmlUrl, codeScanningAlertItems.htmlUrl) &&
        Objects.equals(this.instancesUrl, codeScanningAlertItems.instancesUrl) &&
        Objects.equals(this.state, codeScanningAlertItems.state) &&
        Objects.equals(this.fixedAt, codeScanningAlertItems.fixedAt) &&
        Objects.equals(this.dismissedBy, codeScanningAlertItems.dismissedBy) &&
        Objects.equals(this.dismissedAt, codeScanningAlertItems.dismissedAt) &&
        Objects.equals(this.dismissedReason, codeScanningAlertItems.dismissedReason) &&
        Objects.equals(this.dismissedComment, codeScanningAlertItems.dismissedComment) &&
        Objects.equals(this.rule, codeScanningAlertItems.rule) &&
        Objects.equals(this.tool, codeScanningAlertItems.tool) &&
        Objects.equals(this.mostRecentInstance, codeScanningAlertItems.mostRecentInstance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, createdAt, updatedAt, url, htmlUrl, instancesUrl, state, fixedAt, dismissedBy, dismissedAt, dismissedReason, dismissedComment, rule, tool, mostRecentInstance);
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
    sb.append("class CodeScanningAlertItems {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    instancesUrl: ").append(toIndentedString(instancesUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    fixedAt: ").append(toIndentedString(fixedAt)).append("\n");
    sb.append("    dismissedBy: ").append(toIndentedString(dismissedBy)).append("\n");
    sb.append("    dismissedAt: ").append(toIndentedString(dismissedAt)).append("\n");
    sb.append("    dismissedReason: ").append(toIndentedString(dismissedReason)).append("\n");
    sb.append("    dismissedComment: ").append(toIndentedString(dismissedComment)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    tool: ").append(toIndentedString(tool)).append("\n");
    sb.append("    mostRecentInstance: ").append(toIndentedString(mostRecentInstance)).append("\n");
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
    openapiFields.add("number");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("url");
    openapiFields.add("html_url");
    openapiFields.add("instances_url");
    openapiFields.add("state");
    openapiFields.add("fixed_at");
    openapiFields.add("dismissed_by");
    openapiFields.add("dismissed_at");
    openapiFields.add("dismissed_reason");
    openapiFields.add("dismissed_comment");
    openapiFields.add("rule");
    openapiFields.add("tool");
    openapiFields.add("most_recent_instance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("instances_url");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("dismissed_by");
    openapiRequiredFields.add("dismissed_at");
    openapiRequiredFields.add("dismissed_reason");
    openapiRequiredFields.add("rule");
    openapiRequiredFields.add("tool");
    openapiRequiredFields.add("most_recent_instance");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CodeScanningAlertItems
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CodeScanningAlertItems.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CodeScanningAlertItems is not found in the empty JSON string", CodeScanningAlertItems.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CodeScanningAlertItems.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CodeScanningAlertItems` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CodeScanningAlertItems.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (!jsonObj.get("instances_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instances_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instances_url").toString()));
      }
      // validate the required field `dismissed_by`
      NullableSimpleUser.validateJsonObject(jsonObj.getAsJsonObject("dismissed_by"));
      if ((jsonObj.get("dismissed_comment") != null && !jsonObj.get("dismissed_comment").isJsonNull()) && !jsonObj.get("dismissed_comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dismissed_comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dismissed_comment").toString()));
      }
      // validate the required field `rule`
      CodeScanningAlertRuleSummary.validateJsonObject(jsonObj.getAsJsonObject("rule"));
      // validate the required field `tool`
      CodeScanningAnalysisTool.validateJsonObject(jsonObj.getAsJsonObject("tool"));
      // validate the required field `most_recent_instance`
      CodeScanningAlertInstance.validateJsonObject(jsonObj.getAsJsonObject("most_recent_instance"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CodeScanningAlertItems.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CodeScanningAlertItems' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CodeScanningAlertItems> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CodeScanningAlertItems.class));

       return (TypeAdapter<T>) new TypeAdapter<CodeScanningAlertItems>() {
           @Override
           public void write(JsonWriter out, CodeScanningAlertItems value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CodeScanningAlertItems read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CodeScanningAlertItems given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CodeScanningAlertItems
  * @throws IOException if the JSON string is invalid with respect to CodeScanningAlertItems
  */
  public static CodeScanningAlertItems fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CodeScanningAlertItems.class);
  }

 /**
  * Convert an instance of CodeScanningAlertItems to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

