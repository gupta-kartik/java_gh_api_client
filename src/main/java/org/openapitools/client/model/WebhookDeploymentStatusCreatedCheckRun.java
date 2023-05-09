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
 * WebhookDeploymentStatusCreatedCheckRun
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookDeploymentStatusCreatedCheckRun {
  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private OffsetDateTime completedAt;

  /**
   * The result of the completed check run. Can be one of &#x60;success&#x60;, &#x60;failure&#x60;, &#x60;neutral&#x60;, &#x60;cancelled&#x60;, &#x60;timed_out&#x60;, &#x60;action_required&#x60; or &#x60;stale&#x60;. This value will be &#x60;null&#x60; until the check run has completed.
   */
  @JsonAdapter(ConclusionEnum.Adapter.class)
  public enum ConclusionEnum {
    SUCCESS("success"),
    
    FAILURE("failure"),
    
    NEUTRAL("neutral"),
    
    CANCELLED("cancelled"),
    
    TIMED_OUT("timed_out"),
    
    ACTION_REQUIRED("action_required"),
    
    STALE("stale"),
    
    SKIPPED("skipped"),
    
    NULL("null");

    private String value;

    ConclusionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConclusionEnum fromValue(String value) {
      for (ConclusionEnum b : ConclusionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConclusionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConclusionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConclusionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConclusionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONCLUSION = "conclusion";
  @SerializedName(SERIALIZED_NAME_CONCLUSION)
  private ConclusionEnum conclusion;

  public static final String SERIALIZED_NAME_DETAILS_URL = "details_url";
  @SerializedName(SERIALIZED_NAME_DETAILS_URL)
  private URI detailsUrl;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_HEAD_SHA = "head_sha";
  @SerializedName(SERIALIZED_NAME_HEAD_SHA)
  private String headSha;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private OffsetDateTime startedAt;

  /**
   * The current status of the check run. Can be &#x60;queued&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    QUEUED("queued"),
    
    IN_PROGRESS("in_progress"),
    
    COMPLETED("completed"),
    
    WAITING("waiting"),
    
    PENDING("pending");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public WebhookDeploymentStatusCreatedCheckRun() {
  }

  public WebhookDeploymentStatusCreatedCheckRun completedAt(OffsetDateTime completedAt) {
    
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Get completedAt
   * @return completedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }


  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }


  public WebhookDeploymentStatusCreatedCheckRun conclusion(ConclusionEnum conclusion) {
    
    this.conclusion = conclusion;
    return this;
  }

   /**
   * The result of the completed check run. Can be one of &#x60;success&#x60;, &#x60;failure&#x60;, &#x60;neutral&#x60;, &#x60;cancelled&#x60;, &#x60;timed_out&#x60;, &#x60;action_required&#x60; or &#x60;stale&#x60;. This value will be &#x60;null&#x60; until the check run has completed.
   * @return conclusion
  **/
  @javax.annotation.Nullable

  public ConclusionEnum getConclusion() {
    return conclusion;
  }


  public void setConclusion(ConclusionEnum conclusion) {
    this.conclusion = conclusion;
  }


  public WebhookDeploymentStatusCreatedCheckRun detailsUrl(URI detailsUrl) {
    
    this.detailsUrl = detailsUrl;
    return this;
  }

   /**
   * Get detailsUrl
   * @return detailsUrl
  **/
  @javax.annotation.Nonnull

  public URI getDetailsUrl() {
    return detailsUrl;
  }


  public void setDetailsUrl(URI detailsUrl) {
    this.detailsUrl = detailsUrl;
  }


  public WebhookDeploymentStatusCreatedCheckRun externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nonnull

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public WebhookDeploymentStatusCreatedCheckRun headSha(String headSha) {
    
    this.headSha = headSha;
    return this;
  }

   /**
   * The SHA of the commit that is being checked.
   * @return headSha
  **/
  @javax.annotation.Nonnull

  public String getHeadSha() {
    return headSha;
  }


  public void setHeadSha(String headSha) {
    this.headSha = headSha;
  }


  public WebhookDeploymentStatusCreatedCheckRun htmlUrl(URI htmlUrl) {
    
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @javax.annotation.Nonnull

  public URI getHtmlUrl() {
    return htmlUrl;
  }


  public void setHtmlUrl(URI htmlUrl) {
    this.htmlUrl = htmlUrl;
  }


  public WebhookDeploymentStatusCreatedCheckRun id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the check.
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public WebhookDeploymentStatusCreatedCheckRun name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the check run.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WebhookDeploymentStatusCreatedCheckRun nodeId(String nodeId) {
    
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


  public WebhookDeploymentStatusCreatedCheckRun startedAt(OffsetDateTime startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }


  public WebhookDeploymentStatusCreatedCheckRun status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The current status of the check run. Can be &#x60;queued&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;.
   * @return status
  **/
  @javax.annotation.Nonnull

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public WebhookDeploymentStatusCreatedCheckRun url(URI url) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookDeploymentStatusCreatedCheckRun webhookDeploymentStatusCreatedCheckRun = (WebhookDeploymentStatusCreatedCheckRun) o;
    return Objects.equals(this.completedAt, webhookDeploymentStatusCreatedCheckRun.completedAt) &&
        Objects.equals(this.conclusion, webhookDeploymentStatusCreatedCheckRun.conclusion) &&
        Objects.equals(this.detailsUrl, webhookDeploymentStatusCreatedCheckRun.detailsUrl) &&
        Objects.equals(this.externalId, webhookDeploymentStatusCreatedCheckRun.externalId) &&
        Objects.equals(this.headSha, webhookDeploymentStatusCreatedCheckRun.headSha) &&
        Objects.equals(this.htmlUrl, webhookDeploymentStatusCreatedCheckRun.htmlUrl) &&
        Objects.equals(this.id, webhookDeploymentStatusCreatedCheckRun.id) &&
        Objects.equals(this.name, webhookDeploymentStatusCreatedCheckRun.name) &&
        Objects.equals(this.nodeId, webhookDeploymentStatusCreatedCheckRun.nodeId) &&
        Objects.equals(this.startedAt, webhookDeploymentStatusCreatedCheckRun.startedAt) &&
        Objects.equals(this.status, webhookDeploymentStatusCreatedCheckRun.status) &&
        Objects.equals(this.url, webhookDeploymentStatusCreatedCheckRun.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedAt, conclusion, detailsUrl, externalId, headSha, htmlUrl, id, name, nodeId, startedAt, status, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookDeploymentStatusCreatedCheckRun {\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
    sb.append("    detailsUrl: ").append(toIndentedString(detailsUrl)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("completed_at");
    openapiFields.add("conclusion");
    openapiFields.add("details_url");
    openapiFields.add("external_id");
    openapiFields.add("head_sha");
    openapiFields.add("html_url");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("node_id");
    openapiFields.add("started_at");
    openapiFields.add("status");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("completed_at");
    openapiRequiredFields.add("conclusion");
    openapiRequiredFields.add("details_url");
    openapiRequiredFields.add("external_id");
    openapiRequiredFields.add("head_sha");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("started_at");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookDeploymentStatusCreatedCheckRun
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookDeploymentStatusCreatedCheckRun.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookDeploymentStatusCreatedCheckRun is not found in the empty JSON string", WebhookDeploymentStatusCreatedCheckRun.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookDeploymentStatusCreatedCheckRun.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookDeploymentStatusCreatedCheckRun` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookDeploymentStatusCreatedCheckRun.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("conclusion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conclusion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conclusion").toString()));
      }
      if (!jsonObj.get("details_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details_url").toString()));
      }
      if (!jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if (!jsonObj.get("head_sha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `head_sha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("head_sha").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookDeploymentStatusCreatedCheckRun.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookDeploymentStatusCreatedCheckRun' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookDeploymentStatusCreatedCheckRun> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookDeploymentStatusCreatedCheckRun.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookDeploymentStatusCreatedCheckRun>() {
           @Override
           public void write(JsonWriter out, WebhookDeploymentStatusCreatedCheckRun value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookDeploymentStatusCreatedCheckRun read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookDeploymentStatusCreatedCheckRun given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookDeploymentStatusCreatedCheckRun
  * @throws IOException if the JSON string is invalid with respect to WebhookDeploymentStatusCreatedCheckRun
  */
  public static WebhookDeploymentStatusCreatedCheckRun fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookDeploymentStatusCreatedCheckRun.class);
  }

 /**
  * Convert an instance of WebhookDeploymentStatusCreatedCheckRun to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
