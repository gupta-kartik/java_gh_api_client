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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.WorkflowStep2;
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
 * WebhookWorkflowJobInProgressWorkflowJobAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookWorkflowJobInProgressWorkflowJobAllOf {
  public static final String SERIALIZED_NAME_CHECK_RUN_URL = "check_run_url";
  @SerializedName(SERIALIZED_NAME_CHECK_RUN_URL)
  private String checkRunUrl;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private String completedAt;

  public static final String SERIALIZED_NAME_CONCLUSION = "conclusion";
  @SerializedName(SERIALIZED_NAME_CONCLUSION)
  private String conclusion;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_HEAD_SHA = "head_sha";
  @SerializedName(SERIALIZED_NAME_HEAD_SHA)
  private String headSha;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private String htmlUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_RUN_ATTEMPT = "run_attempt";
  @SerializedName(SERIALIZED_NAME_RUN_ATTEMPT)
  private Integer runAttempt;

  public static final String SERIALIZED_NAME_RUN_ID = "run_id";
  @SerializedName(SERIALIZED_NAME_RUN_ID)
  private Integer runId;

  public static final String SERIALIZED_NAME_RUN_URL = "run_url";
  @SerializedName(SERIALIZED_NAME_RUN_URL)
  private String runUrl;

  public static final String SERIALIZED_NAME_RUNNER_GROUP_ID = "runner_group_id";
  @SerializedName(SERIALIZED_NAME_RUNNER_GROUP_ID)
  private BigDecimal runnerGroupId;

  public static final String SERIALIZED_NAME_RUNNER_GROUP_NAME = "runner_group_name";
  @SerializedName(SERIALIZED_NAME_RUNNER_GROUP_NAME)
  private String runnerGroupName;

  public static final String SERIALIZED_NAME_RUNNER_ID = "runner_id";
  @SerializedName(SERIALIZED_NAME_RUNNER_ID)
  private BigDecimal runnerId;

  public static final String SERIALIZED_NAME_RUNNER_NAME = "runner_name";
  @SerializedName(SERIALIZED_NAME_RUNNER_NAME)
  private String runnerName;

  public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private String startedAt;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    IN_PROGRESS("in_progress"),
    
    COMPLETED("completed"),
    
    QUEUED("queued");

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

  public static final String SERIALIZED_NAME_HEAD_BRANCH = "head_branch";
  @SerializedName(SERIALIZED_NAME_HEAD_BRANCH)
  private String headBranch;

  public static final String SERIALIZED_NAME_WORKFLOW_NAME = "workflow_name";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_NAME)
  private String workflowName;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<WorkflowStep2> steps = new ArrayList<>();

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public WebhookWorkflowJobInProgressWorkflowJobAllOf() {
  }

  public WebhookWorkflowJobInProgressWorkflowJobAllOf checkRunUrl(String checkRunUrl) {
    
    this.checkRunUrl = checkRunUrl;
    return this;
  }

   /**
   * Get checkRunUrl
   * @return checkRunUrl
  **/
  @javax.annotation.Nullable

  public String getCheckRunUrl() {
    return checkRunUrl;
  }


  public void setCheckRunUrl(String checkRunUrl) {
    this.checkRunUrl = checkRunUrl;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf completedAt(String completedAt) {
    
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Get completedAt
   * @return completedAt
  **/
  @javax.annotation.Nullable

  public String getCompletedAt() {
    return completedAt;
  }


  public void setCompletedAt(String completedAt) {
    this.completedAt = completedAt;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf conclusion(String conclusion) {
    
    this.conclusion = conclusion;
    return this;
  }

   /**
   * Get conclusion
   * @return conclusion
  **/
  @javax.annotation.Nullable

  public String getConclusion() {
    return conclusion;
  }


  public void setConclusion(String conclusion) {
    this.conclusion = conclusion;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time that the job created.
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf headSha(String headSha) {
    
    this.headSha = headSha;
    return this;
  }

   /**
   * Get headSha
   * @return headSha
  **/
  @javax.annotation.Nullable

  public String getHeadSha() {
    return headSha;
  }


  public void setHeadSha(String headSha) {
    this.headSha = headSha;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf htmlUrl(String htmlUrl) {
    
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


  public WebhookWorkflowJobInProgressWorkflowJobAllOf id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public WebhookWorkflowJobInProgressWorkflowJobAllOf addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable

  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf nodeId(String nodeId) {
    
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @javax.annotation.Nullable

  public String getNodeId() {
    return nodeId;
  }


  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf runAttempt(Integer runAttempt) {
    
    this.runAttempt = runAttempt;
    return this;
  }

   /**
   * Get runAttempt
   * @return runAttempt
  **/
  @javax.annotation.Nullable

  public Integer getRunAttempt() {
    return runAttempt;
  }


  public void setRunAttempt(Integer runAttempt) {
    this.runAttempt = runAttempt;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf runId(Integer runId) {
    
    this.runId = runId;
    return this;
  }

   /**
   * Get runId
   * @return runId
  **/
  @javax.annotation.Nullable

  public Integer getRunId() {
    return runId;
  }


  public void setRunId(Integer runId) {
    this.runId = runId;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf runUrl(String runUrl) {
    
    this.runUrl = runUrl;
    return this;
  }

   /**
   * Get runUrl
   * @return runUrl
  **/
  @javax.annotation.Nullable

  public String getRunUrl() {
    return runUrl;
  }


  public void setRunUrl(String runUrl) {
    this.runUrl = runUrl;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf runnerGroupId(BigDecimal runnerGroupId) {
    
    this.runnerGroupId = runnerGroupId;
    return this;
  }

   /**
   * Get runnerGroupId
   * @return runnerGroupId
  **/
  @javax.annotation.Nullable

  public BigDecimal getRunnerGroupId() {
    return runnerGroupId;
  }


  public void setRunnerGroupId(BigDecimal runnerGroupId) {
    this.runnerGroupId = runnerGroupId;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf runnerGroupName(String runnerGroupName) {
    
    this.runnerGroupName = runnerGroupName;
    return this;
  }

   /**
   * Get runnerGroupName
   * @return runnerGroupName
  **/
  @javax.annotation.Nullable

  public String getRunnerGroupName() {
    return runnerGroupName;
  }


  public void setRunnerGroupName(String runnerGroupName) {
    this.runnerGroupName = runnerGroupName;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf runnerId(BigDecimal runnerId) {
    
    this.runnerId = runnerId;
    return this;
  }

   /**
   * Get runnerId
   * @return runnerId
  **/
  @javax.annotation.Nullable

  public BigDecimal getRunnerId() {
    return runnerId;
  }


  public void setRunnerId(BigDecimal runnerId) {
    this.runnerId = runnerId;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf runnerName(String runnerName) {
    
    this.runnerName = runnerName;
    return this;
  }

   /**
   * Get runnerName
   * @return runnerName
  **/
  @javax.annotation.Nullable

  public String getRunnerName() {
    return runnerName;
  }


  public void setRunnerName(String runnerName) {
    this.runnerName = runnerName;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf startedAt(String startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nullable

  public String getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf headBranch(String headBranch) {
    
    this.headBranch = headBranch;
    return this;
  }

   /**
   * The name of the current branch.
   * @return headBranch
  **/
  @javax.annotation.Nullable

  public String getHeadBranch() {
    return headBranch;
  }


  public void setHeadBranch(String headBranch) {
    this.headBranch = headBranch;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf workflowName(String workflowName) {
    
    this.workflowName = workflowName;
    return this;
  }

   /**
   * The name of the workflow.
   * @return workflowName
  **/
  @javax.annotation.Nullable

  public String getWorkflowName() {
    return workflowName;
  }


  public void setWorkflowName(String workflowName) {
    this.workflowName = workflowName;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf steps(List<WorkflowStep2> steps) {
    
    this.steps = steps;
    return this;
  }

  public WebhookWorkflowJobInProgressWorkflowJobAllOf addStepsItem(WorkflowStep2 stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nonnull

  public List<WorkflowStep2> getSteps() {
    return steps;
  }


  public void setSteps(List<WorkflowStep2> steps) {
    this.steps = steps;
  }


  public WebhookWorkflowJobInProgressWorkflowJobAllOf url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
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
    WebhookWorkflowJobInProgressWorkflowJobAllOf webhookWorkflowJobInProgressWorkflowJobAllOf = (WebhookWorkflowJobInProgressWorkflowJobAllOf) o;
    return Objects.equals(this.checkRunUrl, webhookWorkflowJobInProgressWorkflowJobAllOf.checkRunUrl) &&
        Objects.equals(this.completedAt, webhookWorkflowJobInProgressWorkflowJobAllOf.completedAt) &&
        Objects.equals(this.conclusion, webhookWorkflowJobInProgressWorkflowJobAllOf.conclusion) &&
        Objects.equals(this.createdAt, webhookWorkflowJobInProgressWorkflowJobAllOf.createdAt) &&
        Objects.equals(this.headSha, webhookWorkflowJobInProgressWorkflowJobAllOf.headSha) &&
        Objects.equals(this.htmlUrl, webhookWorkflowJobInProgressWorkflowJobAllOf.htmlUrl) &&
        Objects.equals(this.id, webhookWorkflowJobInProgressWorkflowJobAllOf.id) &&
        Objects.equals(this.labels, webhookWorkflowJobInProgressWorkflowJobAllOf.labels) &&
        Objects.equals(this.name, webhookWorkflowJobInProgressWorkflowJobAllOf.name) &&
        Objects.equals(this.nodeId, webhookWorkflowJobInProgressWorkflowJobAllOf.nodeId) &&
        Objects.equals(this.runAttempt, webhookWorkflowJobInProgressWorkflowJobAllOf.runAttempt) &&
        Objects.equals(this.runId, webhookWorkflowJobInProgressWorkflowJobAllOf.runId) &&
        Objects.equals(this.runUrl, webhookWorkflowJobInProgressWorkflowJobAllOf.runUrl) &&
        Objects.equals(this.runnerGroupId, webhookWorkflowJobInProgressWorkflowJobAllOf.runnerGroupId) &&
        Objects.equals(this.runnerGroupName, webhookWorkflowJobInProgressWorkflowJobAllOf.runnerGroupName) &&
        Objects.equals(this.runnerId, webhookWorkflowJobInProgressWorkflowJobAllOf.runnerId) &&
        Objects.equals(this.runnerName, webhookWorkflowJobInProgressWorkflowJobAllOf.runnerName) &&
        Objects.equals(this.startedAt, webhookWorkflowJobInProgressWorkflowJobAllOf.startedAt) &&
        Objects.equals(this.status, webhookWorkflowJobInProgressWorkflowJobAllOf.status) &&
        Objects.equals(this.headBranch, webhookWorkflowJobInProgressWorkflowJobAllOf.headBranch) &&
        Objects.equals(this.workflowName, webhookWorkflowJobInProgressWorkflowJobAllOf.workflowName) &&
        Objects.equals(this.steps, webhookWorkflowJobInProgressWorkflowJobAllOf.steps) &&
        Objects.equals(this.url, webhookWorkflowJobInProgressWorkflowJobAllOf.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkRunUrl, completedAt, conclusion, createdAt, headSha, htmlUrl, id, labels, name, nodeId, runAttempt, runId, runUrl, runnerGroupId, runnerGroupName, runnerId, runnerName, startedAt, status, headBranch, workflowName, steps, url);
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
    sb.append("class WebhookWorkflowJobInProgressWorkflowJobAllOf {\n");
    sb.append("    checkRunUrl: ").append(toIndentedString(checkRunUrl)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    runAttempt: ").append(toIndentedString(runAttempt)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    runUrl: ").append(toIndentedString(runUrl)).append("\n");
    sb.append("    runnerGroupId: ").append(toIndentedString(runnerGroupId)).append("\n");
    sb.append("    runnerGroupName: ").append(toIndentedString(runnerGroupName)).append("\n");
    sb.append("    runnerId: ").append(toIndentedString(runnerId)).append("\n");
    sb.append("    runnerName: ").append(toIndentedString(runnerName)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    headBranch: ").append(toIndentedString(headBranch)).append("\n");
    sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
    openapiFields.add("check_run_url");
    openapiFields.add("completed_at");
    openapiFields.add("conclusion");
    openapiFields.add("created_at");
    openapiFields.add("head_sha");
    openapiFields.add("html_url");
    openapiFields.add("id");
    openapiFields.add("labels");
    openapiFields.add("name");
    openapiFields.add("node_id");
    openapiFields.add("run_attempt");
    openapiFields.add("run_id");
    openapiFields.add("run_url");
    openapiFields.add("runner_group_id");
    openapiFields.add("runner_group_name");
    openapiFields.add("runner_id");
    openapiFields.add("runner_name");
    openapiFields.add("started_at");
    openapiFields.add("status");
    openapiFields.add("head_branch");
    openapiFields.add("workflow_name");
    openapiFields.add("steps");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("steps");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookWorkflowJobInProgressWorkflowJobAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookWorkflowJobInProgressWorkflowJobAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookWorkflowJobInProgressWorkflowJobAllOf is not found in the empty JSON string", WebhookWorkflowJobInProgressWorkflowJobAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookWorkflowJobInProgressWorkflowJobAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookWorkflowJobInProgressWorkflowJobAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookWorkflowJobInProgressWorkflowJobAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("check_run_url") != null && !jsonObj.get("check_run_url").isJsonNull()) && !jsonObj.get("check_run_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `check_run_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("check_run_url").toString()));
      }
      if ((jsonObj.get("completed_at") != null && !jsonObj.get("completed_at").isJsonNull()) && !jsonObj.get("completed_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `completed_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("completed_at").toString()));
      }
      if ((jsonObj.get("conclusion") != null && !jsonObj.get("conclusion").isJsonNull()) && !jsonObj.get("conclusion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conclusion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conclusion").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("head_sha") != null && !jsonObj.get("head_sha").isJsonNull()) && !jsonObj.get("head_sha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `head_sha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("head_sha").toString()));
      }
      if ((jsonObj.get("html_url") != null && !jsonObj.get("html_url").isJsonNull()) && !jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("node_id") != null && !jsonObj.get("node_id").isJsonNull()) && !jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if ((jsonObj.get("run_url") != null && !jsonObj.get("run_url").isJsonNull()) && !jsonObj.get("run_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `run_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("run_url").toString()));
      }
      if ((jsonObj.get("runner_group_name") != null && !jsonObj.get("runner_group_name").isJsonNull()) && !jsonObj.get("runner_group_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runner_group_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runner_group_name").toString()));
      }
      if ((jsonObj.get("runner_name") != null && !jsonObj.get("runner_name").isJsonNull()) && !jsonObj.get("runner_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runner_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runner_name").toString()));
      }
      if ((jsonObj.get("started_at") != null && !jsonObj.get("started_at").isJsonNull()) && !jsonObj.get("started_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `started_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("started_at").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("head_branch") != null && !jsonObj.get("head_branch").isJsonNull()) && !jsonObj.get("head_branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `head_branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("head_branch").toString()));
      }
      if ((jsonObj.get("workflow_name") != null && !jsonObj.get("workflow_name").isJsonNull()) && !jsonObj.get("workflow_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflow_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflow_name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("steps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `steps` to be an array in the JSON string but got `%s`", jsonObj.get("steps").toString()));
      }

      JsonArray jsonArraysteps = jsonObj.getAsJsonArray("steps");
      // validate the required field `steps` (array)
      for (int i = 0; i < jsonArraysteps.size(); i++) {
        WorkflowStep2.validateJsonObject(jsonArraysteps.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookWorkflowJobInProgressWorkflowJobAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookWorkflowJobInProgressWorkflowJobAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookWorkflowJobInProgressWorkflowJobAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookWorkflowJobInProgressWorkflowJobAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookWorkflowJobInProgressWorkflowJobAllOf>() {
           @Override
           public void write(JsonWriter out, WebhookWorkflowJobInProgressWorkflowJobAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookWorkflowJobInProgressWorkflowJobAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookWorkflowJobInProgressWorkflowJobAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookWorkflowJobInProgressWorkflowJobAllOf
  * @throws IOException if the JSON string is invalid with respect to WebhookWorkflowJobInProgressWorkflowJobAllOf
  */
  public static WebhookWorkflowJobInProgressWorkflowJobAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookWorkflowJobInProgressWorkflowJobAllOf.class);
  }

 /**
  * Convert an instance of WebhookWorkflowJobInProgressWorkflowJobAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

