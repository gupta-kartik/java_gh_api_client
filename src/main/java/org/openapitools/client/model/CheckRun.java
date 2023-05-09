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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.CheckRunCheckSuite;
import org.openapitools.client.model.CheckRunOutput;
import org.openapitools.client.model.DeploymentSimple;
import org.openapitools.client.model.NullableIntegration;
import org.openapitools.client.model.PullRequestMinimal;

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
 * A check performed on the code of a given code change
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class CheckRun {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_HEAD_SHA = "head_sha";
  @SerializedName(SERIALIZED_NAME_HEAD_SHA)
  private String headSha;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private String htmlUrl;

  public static final String SERIALIZED_NAME_DETAILS_URL = "details_url";
  @SerializedName(SERIALIZED_NAME_DETAILS_URL)
  private String detailsUrl;

  /**
   * The phase of the lifecycle that the check is currently in.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    QUEUED("queued"),
    
    IN_PROGRESS("in_progress"),
    
    COMPLETED("completed");

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

  /**
   * Gets or Sets conclusion
   */
  @JsonAdapter(ConclusionEnum.Adapter.class)
  public enum ConclusionEnum {
    SUCCESS("success"),
    
    FAILURE("failure"),
    
    NEUTRAL("neutral"),
    
    CANCELLED("cancelled"),
    
    SKIPPED("skipped"),
    
    TIMED_OUT("timed_out"),
    
    ACTION_REQUIRED("action_required");

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

  public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private OffsetDateTime startedAt;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private OffsetDateTime completedAt;

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private CheckRunOutput output;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CHECK_SUITE = "check_suite";
  @SerializedName(SERIALIZED_NAME_CHECK_SUITE)
  private CheckRunCheckSuite checkSuite;

  public static final String SERIALIZED_NAME_APP = "app";
  @SerializedName(SERIALIZED_NAME_APP)
  private NullableIntegration app;

  public static final String SERIALIZED_NAME_PULL_REQUESTS = "pull_requests";
  @SerializedName(SERIALIZED_NAME_PULL_REQUESTS)
  private List<PullRequestMinimal> pullRequests = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEPLOYMENT = "deployment";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT)
  private DeploymentSimple deployment;

  public CheckRun() {
  }

  public CheckRun id(Integer id) {
    
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


  public CheckRun headSha(String headSha) {
    
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


  public CheckRun nodeId(String nodeId) {
    
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


  public CheckRun externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public CheckRun url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CheckRun htmlUrl(String htmlUrl) {
    
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


  public CheckRun detailsUrl(String detailsUrl) {
    
    this.detailsUrl = detailsUrl;
    return this;
  }

   /**
   * Get detailsUrl
   * @return detailsUrl
  **/
  @javax.annotation.Nullable

  public String getDetailsUrl() {
    return detailsUrl;
  }


  public void setDetailsUrl(String detailsUrl) {
    this.detailsUrl = detailsUrl;
  }


  public CheckRun status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The phase of the lifecycle that the check is currently in.
   * @return status
  **/
  @javax.annotation.Nonnull

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public CheckRun conclusion(ConclusionEnum conclusion) {
    
    this.conclusion = conclusion;
    return this;
  }

   /**
   * Get conclusion
   * @return conclusion
  **/
  @javax.annotation.Nullable

  public ConclusionEnum getConclusion() {
    return conclusion;
  }


  public void setConclusion(ConclusionEnum conclusion) {
    this.conclusion = conclusion;
  }


  public CheckRun startedAt(OffsetDateTime startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }


  public CheckRun completedAt(OffsetDateTime completedAt) {
    
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


  public CheckRun output(CheckRunOutput output) {
    
    this.output = output;
    return this;
  }

   /**
   * Get output
   * @return output
  **/
  @javax.annotation.Nonnull

  public CheckRunOutput getOutput() {
    return output;
  }


  public void setOutput(CheckRunOutput output) {
    this.output = output;
  }


  public CheckRun name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the check.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CheckRun checkSuite(CheckRunCheckSuite checkSuite) {
    
    this.checkSuite = checkSuite;
    return this;
  }

   /**
   * Get checkSuite
   * @return checkSuite
  **/
  @javax.annotation.Nullable

  public CheckRunCheckSuite getCheckSuite() {
    return checkSuite;
  }


  public void setCheckSuite(CheckRunCheckSuite checkSuite) {
    this.checkSuite = checkSuite;
  }


  public CheckRun app(NullableIntegration app) {
    
    this.app = app;
    return this;
  }

   /**
   * Get app
   * @return app
  **/
  @javax.annotation.Nullable

  public NullableIntegration getApp() {
    return app;
  }


  public void setApp(NullableIntegration app) {
    this.app = app;
  }


  public CheckRun pullRequests(List<PullRequestMinimal> pullRequests) {
    
    this.pullRequests = pullRequests;
    return this;
  }

  public CheckRun addPullRequestsItem(PullRequestMinimal pullRequestsItem) {
    if (this.pullRequests == null) {
      this.pullRequests = new ArrayList<>();
    }
    this.pullRequests.add(pullRequestsItem);
    return this;
  }

   /**
   * Get pullRequests
   * @return pullRequests
  **/
  @javax.annotation.Nonnull

  public List<PullRequestMinimal> getPullRequests() {
    return pullRequests;
  }


  public void setPullRequests(List<PullRequestMinimal> pullRequests) {
    this.pullRequests = pullRequests;
  }


  public CheckRun deployment(DeploymentSimple deployment) {
    
    this.deployment = deployment;
    return this;
  }

   /**
   * Get deployment
   * @return deployment
  **/
  @javax.annotation.Nullable

  public DeploymentSimple getDeployment() {
    return deployment;
  }


  public void setDeployment(DeploymentSimple deployment) {
    this.deployment = deployment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckRun checkRun = (CheckRun) o;
    return Objects.equals(this.id, checkRun.id) &&
        Objects.equals(this.headSha, checkRun.headSha) &&
        Objects.equals(this.nodeId, checkRun.nodeId) &&
        Objects.equals(this.externalId, checkRun.externalId) &&
        Objects.equals(this.url, checkRun.url) &&
        Objects.equals(this.htmlUrl, checkRun.htmlUrl) &&
        Objects.equals(this.detailsUrl, checkRun.detailsUrl) &&
        Objects.equals(this.status, checkRun.status) &&
        Objects.equals(this.conclusion, checkRun.conclusion) &&
        Objects.equals(this.startedAt, checkRun.startedAt) &&
        Objects.equals(this.completedAt, checkRun.completedAt) &&
        Objects.equals(this.output, checkRun.output) &&
        Objects.equals(this.name, checkRun.name) &&
        Objects.equals(this.checkSuite, checkRun.checkSuite) &&
        Objects.equals(this.app, checkRun.app) &&
        Objects.equals(this.pullRequests, checkRun.pullRequests) &&
        Objects.equals(this.deployment, checkRun.deployment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, headSha, nodeId, externalId, url, htmlUrl, detailsUrl, status, conclusion, startedAt, completedAt, output, name, checkSuite, app, pullRequests, deployment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckRun {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    detailsUrl: ").append(toIndentedString(detailsUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    checkSuite: ").append(toIndentedString(checkSuite)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    pullRequests: ").append(toIndentedString(pullRequests)).append("\n");
    sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("head_sha");
    openapiFields.add("node_id");
    openapiFields.add("external_id");
    openapiFields.add("url");
    openapiFields.add("html_url");
    openapiFields.add("details_url");
    openapiFields.add("status");
    openapiFields.add("conclusion");
    openapiFields.add("started_at");
    openapiFields.add("completed_at");
    openapiFields.add("output");
    openapiFields.add("name");
    openapiFields.add("check_suite");
    openapiFields.add("app");
    openapiFields.add("pull_requests");
    openapiFields.add("deployment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("head_sha");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("external_id");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("details_url");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("conclusion");
    openapiRequiredFields.add("started_at");
    openapiRequiredFields.add("completed_at");
    openapiRequiredFields.add("output");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("check_suite");
    openapiRequiredFields.add("app");
    openapiRequiredFields.add("pull_requests");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckRun
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CheckRun.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckRun is not found in the empty JSON string", CheckRun.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CheckRun.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CheckRun` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckRun.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("head_sha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `head_sha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("head_sha").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if (!jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (!jsonObj.get("details_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details_url").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("conclusion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conclusion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conclusion").toString()));
      }
      // validate the required field `output`
      CheckRunOutput.validateJsonObject(jsonObj.getAsJsonObject("output"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `check_suite`
      CheckRunCheckSuite.validateJsonObject(jsonObj.getAsJsonObject("check_suite"));
      // validate the required field `app`
      NullableIntegration.validateJsonObject(jsonObj.getAsJsonObject("app"));
      // ensure the json data is an array
      if (!jsonObj.get("pull_requests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pull_requests` to be an array in the JSON string but got `%s`", jsonObj.get("pull_requests").toString()));
      }

      JsonArray jsonArraypullRequests = jsonObj.getAsJsonArray("pull_requests");
      // validate the required field `pull_requests` (array)
      for (int i = 0; i < jsonArraypullRequests.size(); i++) {
        PullRequestMinimal.validateJsonObject(jsonArraypullRequests.get(i).getAsJsonObject());
      };
      // validate the optional field `deployment`
      if (jsonObj.get("deployment") != null && !jsonObj.get("deployment").isJsonNull()) {
        DeploymentSimple.validateJsonObject(jsonObj.getAsJsonObject("deployment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckRun.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckRun' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckRun> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckRun.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckRun>() {
           @Override
           public void write(JsonWriter out, CheckRun value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CheckRun read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CheckRun given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckRun
  * @throws IOException if the JSON string is invalid with respect to CheckRun
  */
  public static CheckRun fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckRun.class);
  }

 /**
  * Convert an instance of CheckRun to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

