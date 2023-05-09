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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.App1;
import org.openapitools.client.model.CheckRunPullRequest;
import org.openapitools.client.model.SimpleCommit;

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
 * The [check_suite](https://docs.github.com/rest/reference/checks#suites).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookCheckSuiteRequestedCheckSuite {
  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private String after;

  public static final String SERIALIZED_NAME_APP = "app";
  @SerializedName(SERIALIZED_NAME_APP)
  private App1 app;

  public static final String SERIALIZED_NAME_BEFORE = "before";
  @SerializedName(SERIALIZED_NAME_BEFORE)
  private String before;

  public static final String SERIALIZED_NAME_CHECK_RUNS_URL = "check_runs_url";
  @SerializedName(SERIALIZED_NAME_CHECK_RUNS_URL)
  private URI checkRunsUrl;

  /**
   * The summary conclusion for all check runs that are part of the check suite. Can be one of &#x60;success&#x60;, &#x60;failure&#x60;,&#x60; neutral&#x60;, &#x60;cancelled&#x60;, &#x60;timed_out&#x60;, &#x60;action_required&#x60; or &#x60;stale&#x60;. This value will be &#x60;null&#x60; until the check run has completed.
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
    
    NULL("null"),
    
    SKIPPED("skipped");

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

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_HEAD_BRANCH = "head_branch";
  @SerializedName(SERIALIZED_NAME_HEAD_BRANCH)
  private String headBranch;

  public static final String SERIALIZED_NAME_HEAD_COMMIT = "head_commit";
  @SerializedName(SERIALIZED_NAME_HEAD_COMMIT)
  private SimpleCommit headCommit;

  public static final String SERIALIZED_NAME_HEAD_SHA = "head_sha";
  @SerializedName(SERIALIZED_NAME_HEAD_SHA)
  private String headSha;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LATEST_CHECK_RUNS_COUNT = "latest_check_runs_count";
  @SerializedName(SERIALIZED_NAME_LATEST_CHECK_RUNS_COUNT)
  private Integer latestCheckRunsCount;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_PULL_REQUESTS = "pull_requests";
  @SerializedName(SERIALIZED_NAME_PULL_REQUESTS)
  private List<CheckRunPullRequest> pullRequests = new ArrayList<>();

  public static final String SERIALIZED_NAME_REREQUESTABLE = "rerequestable";
  @SerializedName(SERIALIZED_NAME_REREQUESTABLE)
  private Boolean rerequestable;

  public static final String SERIALIZED_NAME_RUNS_REREQUESTABLE = "runs_rerequestable";
  @SerializedName(SERIALIZED_NAME_RUNS_REREQUESTABLE)
  private Boolean runsRerequestable;

  /**
   * The summary status for all check runs that are part of the check suite. Can be &#x60;requested&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    REQUESTED("requested"),
    
    IN_PROGRESS("in_progress"),
    
    COMPLETED("completed"),
    
    QUEUED("queued"),
    
    NULL("null");

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
      return null;
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

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public WebhookCheckSuiteRequestedCheckSuite() {
  }

  public WebhookCheckSuiteRequestedCheckSuite after(String after) {
    
    this.after = after;
    return this;
  }

   /**
   * Get after
   * @return after
  **/
  @javax.annotation.Nullable

  public String getAfter() {
    return after;
  }


  public void setAfter(String after) {
    this.after = after;
  }


  public WebhookCheckSuiteRequestedCheckSuite app(App1 app) {
    
    this.app = app;
    return this;
  }

   /**
   * Get app
   * @return app
  **/
  @javax.annotation.Nonnull

  public App1 getApp() {
    return app;
  }


  public void setApp(App1 app) {
    this.app = app;
  }


  public WebhookCheckSuiteRequestedCheckSuite before(String before) {
    
    this.before = before;
    return this;
  }

   /**
   * Get before
   * @return before
  **/
  @javax.annotation.Nullable

  public String getBefore() {
    return before;
  }


  public void setBefore(String before) {
    this.before = before;
  }


  public WebhookCheckSuiteRequestedCheckSuite checkRunsUrl(URI checkRunsUrl) {
    
    this.checkRunsUrl = checkRunsUrl;
    return this;
  }

   /**
   * Get checkRunsUrl
   * @return checkRunsUrl
  **/
  @javax.annotation.Nonnull

  public URI getCheckRunsUrl() {
    return checkRunsUrl;
  }


  public void setCheckRunsUrl(URI checkRunsUrl) {
    this.checkRunsUrl = checkRunsUrl;
  }


  public WebhookCheckSuiteRequestedCheckSuite conclusion(ConclusionEnum conclusion) {
    
    this.conclusion = conclusion;
    return this;
  }

   /**
   * The summary conclusion for all check runs that are part of the check suite. Can be one of &#x60;success&#x60;, &#x60;failure&#x60;,&#x60; neutral&#x60;, &#x60;cancelled&#x60;, &#x60;timed_out&#x60;, &#x60;action_required&#x60; or &#x60;stale&#x60;. This value will be &#x60;null&#x60; until the check run has completed.
   * @return conclusion
  **/
  @javax.annotation.Nullable

  public ConclusionEnum getConclusion() {
    return conclusion;
  }


  public void setConclusion(ConclusionEnum conclusion) {
    this.conclusion = conclusion;
  }


  public WebhookCheckSuiteRequestedCheckSuite createdAt(OffsetDateTime createdAt) {
    
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


  public WebhookCheckSuiteRequestedCheckSuite headBranch(String headBranch) {
    
    this.headBranch = headBranch;
    return this;
  }

   /**
   * The head branch name the changes are on.
   * @return headBranch
  **/
  @javax.annotation.Nullable

  public String getHeadBranch() {
    return headBranch;
  }


  public void setHeadBranch(String headBranch) {
    this.headBranch = headBranch;
  }


  public WebhookCheckSuiteRequestedCheckSuite headCommit(SimpleCommit headCommit) {
    
    this.headCommit = headCommit;
    return this;
  }

   /**
   * Get headCommit
   * @return headCommit
  **/
  @javax.annotation.Nonnull

  public SimpleCommit getHeadCommit() {
    return headCommit;
  }


  public void setHeadCommit(SimpleCommit headCommit) {
    this.headCommit = headCommit;
  }


  public WebhookCheckSuiteRequestedCheckSuite headSha(String headSha) {
    
    this.headSha = headSha;
    return this;
  }

   /**
   * The SHA of the head commit that is being checked.
   * @return headSha
  **/
  @javax.annotation.Nonnull

  public String getHeadSha() {
    return headSha;
  }


  public void setHeadSha(String headSha) {
    this.headSha = headSha;
  }


  public WebhookCheckSuiteRequestedCheckSuite id(Integer id) {
    
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


  public WebhookCheckSuiteRequestedCheckSuite latestCheckRunsCount(Integer latestCheckRunsCount) {
    
    this.latestCheckRunsCount = latestCheckRunsCount;
    return this;
  }

   /**
   * Get latestCheckRunsCount
   * @return latestCheckRunsCount
  **/
  @javax.annotation.Nonnull

  public Integer getLatestCheckRunsCount() {
    return latestCheckRunsCount;
  }


  public void setLatestCheckRunsCount(Integer latestCheckRunsCount) {
    this.latestCheckRunsCount = latestCheckRunsCount;
  }


  public WebhookCheckSuiteRequestedCheckSuite nodeId(String nodeId) {
    
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


  public WebhookCheckSuiteRequestedCheckSuite pullRequests(List<CheckRunPullRequest> pullRequests) {
    
    this.pullRequests = pullRequests;
    return this;
  }

  public WebhookCheckSuiteRequestedCheckSuite addPullRequestsItem(CheckRunPullRequest pullRequestsItem) {
    if (this.pullRequests == null) {
      this.pullRequests = new ArrayList<>();
    }
    this.pullRequests.add(pullRequestsItem);
    return this;
  }

   /**
   * An array of pull requests that match this check suite. A pull request matches a check suite if they have the same &#x60;head_sha&#x60; and &#x60;head_branch&#x60;. When the check suite&#39;s &#x60;head_branch&#x60; is in a forked repository it will be &#x60;null&#x60; and the &#x60;pull_requests&#x60; array will be empty.
   * @return pullRequests
  **/
  @javax.annotation.Nonnull

  public List<CheckRunPullRequest> getPullRequests() {
    return pullRequests;
  }


  public void setPullRequests(List<CheckRunPullRequest> pullRequests) {
    this.pullRequests = pullRequests;
  }


  public WebhookCheckSuiteRequestedCheckSuite rerequestable(Boolean rerequestable) {
    
    this.rerequestable = rerequestable;
    return this;
  }

   /**
   * Get rerequestable
   * @return rerequestable
  **/
  @javax.annotation.Nullable

  public Boolean getRerequestable() {
    return rerequestable;
  }


  public void setRerequestable(Boolean rerequestable) {
    this.rerequestable = rerequestable;
  }


  public WebhookCheckSuiteRequestedCheckSuite runsRerequestable(Boolean runsRerequestable) {
    
    this.runsRerequestable = runsRerequestable;
    return this;
  }

   /**
   * Get runsRerequestable
   * @return runsRerequestable
  **/
  @javax.annotation.Nullable

  public Boolean getRunsRerequestable() {
    return runsRerequestable;
  }


  public void setRunsRerequestable(Boolean runsRerequestable) {
    this.runsRerequestable = runsRerequestable;
  }


  public WebhookCheckSuiteRequestedCheckSuite status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The summary status for all check runs that are part of the check suite. Can be &#x60;requested&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;.
   * @return status
  **/
  @javax.annotation.Nullable

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public WebhookCheckSuiteRequestedCheckSuite updatedAt(OffsetDateTime updatedAt) {
    
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


  public WebhookCheckSuiteRequestedCheckSuite url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL that points to the check suite API resource.
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
    WebhookCheckSuiteRequestedCheckSuite webhookCheckSuiteRequestedCheckSuite = (WebhookCheckSuiteRequestedCheckSuite) o;
    return Objects.equals(this.after, webhookCheckSuiteRequestedCheckSuite.after) &&
        Objects.equals(this.app, webhookCheckSuiteRequestedCheckSuite.app) &&
        Objects.equals(this.before, webhookCheckSuiteRequestedCheckSuite.before) &&
        Objects.equals(this.checkRunsUrl, webhookCheckSuiteRequestedCheckSuite.checkRunsUrl) &&
        Objects.equals(this.conclusion, webhookCheckSuiteRequestedCheckSuite.conclusion) &&
        Objects.equals(this.createdAt, webhookCheckSuiteRequestedCheckSuite.createdAt) &&
        Objects.equals(this.headBranch, webhookCheckSuiteRequestedCheckSuite.headBranch) &&
        Objects.equals(this.headCommit, webhookCheckSuiteRequestedCheckSuite.headCommit) &&
        Objects.equals(this.headSha, webhookCheckSuiteRequestedCheckSuite.headSha) &&
        Objects.equals(this.id, webhookCheckSuiteRequestedCheckSuite.id) &&
        Objects.equals(this.latestCheckRunsCount, webhookCheckSuiteRequestedCheckSuite.latestCheckRunsCount) &&
        Objects.equals(this.nodeId, webhookCheckSuiteRequestedCheckSuite.nodeId) &&
        Objects.equals(this.pullRequests, webhookCheckSuiteRequestedCheckSuite.pullRequests) &&
        Objects.equals(this.rerequestable, webhookCheckSuiteRequestedCheckSuite.rerequestable) &&
        Objects.equals(this.runsRerequestable, webhookCheckSuiteRequestedCheckSuite.runsRerequestable) &&
        Objects.equals(this.status, webhookCheckSuiteRequestedCheckSuite.status) &&
        Objects.equals(this.updatedAt, webhookCheckSuiteRequestedCheckSuite.updatedAt) &&
        Objects.equals(this.url, webhookCheckSuiteRequestedCheckSuite.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, app, before, checkRunsUrl, conclusion, createdAt, headBranch, headCommit, headSha, id, latestCheckRunsCount, nodeId, pullRequests, rerequestable, runsRerequestable, status, updatedAt, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookCheckSuiteRequestedCheckSuite {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    checkRunsUrl: ").append(toIndentedString(checkRunsUrl)).append("\n");
    sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    headBranch: ").append(toIndentedString(headBranch)).append("\n");
    sb.append("    headCommit: ").append(toIndentedString(headCommit)).append("\n");
    sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latestCheckRunsCount: ").append(toIndentedString(latestCheckRunsCount)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    pullRequests: ").append(toIndentedString(pullRequests)).append("\n");
    sb.append("    rerequestable: ").append(toIndentedString(rerequestable)).append("\n");
    sb.append("    runsRerequestable: ").append(toIndentedString(runsRerequestable)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("after");
    openapiFields.add("app");
    openapiFields.add("before");
    openapiFields.add("check_runs_url");
    openapiFields.add("conclusion");
    openapiFields.add("created_at");
    openapiFields.add("head_branch");
    openapiFields.add("head_commit");
    openapiFields.add("head_sha");
    openapiFields.add("id");
    openapiFields.add("latest_check_runs_count");
    openapiFields.add("node_id");
    openapiFields.add("pull_requests");
    openapiFields.add("rerequestable");
    openapiFields.add("runs_rerequestable");
    openapiFields.add("status");
    openapiFields.add("updated_at");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("after");
    openapiRequiredFields.add("app");
    openapiRequiredFields.add("before");
    openapiRequiredFields.add("check_runs_url");
    openapiRequiredFields.add("conclusion");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("head_branch");
    openapiRequiredFields.add("head_commit");
    openapiRequiredFields.add("head_sha");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("latest_check_runs_count");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("pull_requests");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookCheckSuiteRequestedCheckSuite
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookCheckSuiteRequestedCheckSuite.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookCheckSuiteRequestedCheckSuite is not found in the empty JSON string", WebhookCheckSuiteRequestedCheckSuite.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookCheckSuiteRequestedCheckSuite.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookCheckSuiteRequestedCheckSuite` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookCheckSuiteRequestedCheckSuite.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("after").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `after` to be a primitive type in the JSON string but got `%s`", jsonObj.get("after").toString()));
      }
      // validate the required field `app`
      App1.validateJsonObject(jsonObj.getAsJsonObject("app"));
      if (!jsonObj.get("before").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `before` to be a primitive type in the JSON string but got `%s`", jsonObj.get("before").toString()));
      }
      if (!jsonObj.get("check_runs_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `check_runs_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("check_runs_url").toString()));
      }
      if (!jsonObj.get("conclusion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conclusion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conclusion").toString()));
      }
      if (!jsonObj.get("head_branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `head_branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("head_branch").toString()));
      }
      // validate the required field `head_commit`
      SimpleCommit.validateJsonObject(jsonObj.getAsJsonObject("head_commit"));
      if (!jsonObj.get("head_sha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `head_sha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("head_sha").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("pull_requests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pull_requests` to be an array in the JSON string but got `%s`", jsonObj.get("pull_requests").toString()));
      }

      JsonArray jsonArraypullRequests = jsonObj.getAsJsonArray("pull_requests");
      // validate the required field `pull_requests` (array)
      for (int i = 0; i < jsonArraypullRequests.size(); i++) {
        CheckRunPullRequest.validateJsonObject(jsonArraypullRequests.get(i).getAsJsonObject());
      };
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
       if (!WebhookCheckSuiteRequestedCheckSuite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookCheckSuiteRequestedCheckSuite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookCheckSuiteRequestedCheckSuite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookCheckSuiteRequestedCheckSuite.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookCheckSuiteRequestedCheckSuite>() {
           @Override
           public void write(JsonWriter out, WebhookCheckSuiteRequestedCheckSuite value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookCheckSuiteRequestedCheckSuite read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookCheckSuiteRequestedCheckSuite given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookCheckSuiteRequestedCheckSuite
  * @throws IOException if the JSON string is invalid with respect to WebhookCheckSuiteRequestedCheckSuite
  */
  public static WebhookCheckSuiteRequestedCheckSuite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookCheckSuiteRequestedCheckSuite.class);
  }

 /**
  * Convert an instance of WebhookCheckSuiteRequestedCheckSuite to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

