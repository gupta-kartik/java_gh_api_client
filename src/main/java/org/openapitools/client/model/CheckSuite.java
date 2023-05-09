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
import org.openapitools.client.model.MinimalRepository;
import org.openapitools.client.model.NullableIntegration;
import org.openapitools.client.model.PullRequestMinimal;
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
 * A suite of checks performed on the code of a given code change
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class CheckSuite {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_HEAD_BRANCH = "head_branch";
  @SerializedName(SERIALIZED_NAME_HEAD_BRANCH)
  private String headBranch;

  public static final String SERIALIZED_NAME_HEAD_SHA = "head_sha";
  @SerializedName(SERIALIZED_NAME_HEAD_SHA)
  private String headSha;

  /**
   * Gets or Sets status
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
    
    ACTION_REQUIRED("action_required"),
    
    STARTUP_FAILURE("startup_failure"),
    
    STALE("stale"),
    
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

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_BEFORE = "before";
  @SerializedName(SERIALIZED_NAME_BEFORE)
  private String before;

  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private String after;

  public static final String SERIALIZED_NAME_PULL_REQUESTS = "pull_requests";
  @SerializedName(SERIALIZED_NAME_PULL_REQUESTS)
  private List<PullRequestMinimal> pullRequests;

  public static final String SERIALIZED_NAME_APP = "app";
  @SerializedName(SERIALIZED_NAME_APP)
  private NullableIntegration app;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private MinimalRepository repository;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_HEAD_COMMIT = "head_commit";
  @SerializedName(SERIALIZED_NAME_HEAD_COMMIT)
  private SimpleCommit headCommit;

  public static final String SERIALIZED_NAME_LATEST_CHECK_RUNS_COUNT = "latest_check_runs_count";
  @SerializedName(SERIALIZED_NAME_LATEST_CHECK_RUNS_COUNT)
  private Integer latestCheckRunsCount;

  public static final String SERIALIZED_NAME_CHECK_RUNS_URL = "check_runs_url";
  @SerializedName(SERIALIZED_NAME_CHECK_RUNS_URL)
  private String checkRunsUrl;

  public static final String SERIALIZED_NAME_REREQUESTABLE = "rerequestable";
  @SerializedName(SERIALIZED_NAME_REREQUESTABLE)
  private Boolean rerequestable;

  public static final String SERIALIZED_NAME_RUNS_REREQUESTABLE = "runs_rerequestable";
  @SerializedName(SERIALIZED_NAME_RUNS_REREQUESTABLE)
  private Boolean runsRerequestable;

  public CheckSuite() {
  }

  public CheckSuite id(Integer id) {
    
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


  public CheckSuite nodeId(String nodeId) {
    
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


  public CheckSuite headBranch(String headBranch) {
    
    this.headBranch = headBranch;
    return this;
  }

   /**
   * Get headBranch
   * @return headBranch
  **/
  @javax.annotation.Nullable

  public String getHeadBranch() {
    return headBranch;
  }


  public void setHeadBranch(String headBranch) {
    this.headBranch = headBranch;
  }


  public CheckSuite headSha(String headSha) {
    
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


  public CheckSuite status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public CheckSuite conclusion(ConclusionEnum conclusion) {
    
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


  public CheckSuite url(String url) {
    
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


  public CheckSuite before(String before) {
    
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


  public CheckSuite after(String after) {
    
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


  public CheckSuite pullRequests(List<PullRequestMinimal> pullRequests) {
    
    this.pullRequests = pullRequests;
    return this;
  }

  public CheckSuite addPullRequestsItem(PullRequestMinimal pullRequestsItem) {
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
  @javax.annotation.Nullable

  public List<PullRequestMinimal> getPullRequests() {
    return pullRequests;
  }


  public void setPullRequests(List<PullRequestMinimal> pullRequests) {
    this.pullRequests = pullRequests;
  }


  public CheckSuite app(NullableIntegration app) {
    
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


  public CheckSuite repository(MinimalRepository repository) {
    
    this.repository = repository;
    return this;
  }

   /**
   * Get repository
   * @return repository
  **/
  @javax.annotation.Nonnull

  public MinimalRepository getRepository() {
    return repository;
  }


  public void setRepository(MinimalRepository repository) {
    this.repository = repository;
  }


  public CheckSuite createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CheckSuite updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CheckSuite headCommit(SimpleCommit headCommit) {
    
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


  public CheckSuite latestCheckRunsCount(Integer latestCheckRunsCount) {
    
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


  public CheckSuite checkRunsUrl(String checkRunsUrl) {
    
    this.checkRunsUrl = checkRunsUrl;
    return this;
  }

   /**
   * Get checkRunsUrl
   * @return checkRunsUrl
  **/
  @javax.annotation.Nonnull

  public String getCheckRunsUrl() {
    return checkRunsUrl;
  }


  public void setCheckRunsUrl(String checkRunsUrl) {
    this.checkRunsUrl = checkRunsUrl;
  }


  public CheckSuite rerequestable(Boolean rerequestable) {
    
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


  public CheckSuite runsRerequestable(Boolean runsRerequestable) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckSuite checkSuite = (CheckSuite) o;
    return Objects.equals(this.id, checkSuite.id) &&
        Objects.equals(this.nodeId, checkSuite.nodeId) &&
        Objects.equals(this.headBranch, checkSuite.headBranch) &&
        Objects.equals(this.headSha, checkSuite.headSha) &&
        Objects.equals(this.status, checkSuite.status) &&
        Objects.equals(this.conclusion, checkSuite.conclusion) &&
        Objects.equals(this.url, checkSuite.url) &&
        Objects.equals(this.before, checkSuite.before) &&
        Objects.equals(this.after, checkSuite.after) &&
        Objects.equals(this.pullRequests, checkSuite.pullRequests) &&
        Objects.equals(this.app, checkSuite.app) &&
        Objects.equals(this.repository, checkSuite.repository) &&
        Objects.equals(this.createdAt, checkSuite.createdAt) &&
        Objects.equals(this.updatedAt, checkSuite.updatedAt) &&
        Objects.equals(this.headCommit, checkSuite.headCommit) &&
        Objects.equals(this.latestCheckRunsCount, checkSuite.latestCheckRunsCount) &&
        Objects.equals(this.checkRunsUrl, checkSuite.checkRunsUrl) &&
        Objects.equals(this.rerequestable, checkSuite.rerequestable) &&
        Objects.equals(this.runsRerequestable, checkSuite.runsRerequestable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nodeId, headBranch, headSha, status, conclusion, url, before, after, pullRequests, app, repository, createdAt, updatedAt, headCommit, latestCheckRunsCount, checkRunsUrl, rerequestable, runsRerequestable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckSuite {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    headBranch: ").append(toIndentedString(headBranch)).append("\n");
    sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    pullRequests: ").append(toIndentedString(pullRequests)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    headCommit: ").append(toIndentedString(headCommit)).append("\n");
    sb.append("    latestCheckRunsCount: ").append(toIndentedString(latestCheckRunsCount)).append("\n");
    sb.append("    checkRunsUrl: ").append(toIndentedString(checkRunsUrl)).append("\n");
    sb.append("    rerequestable: ").append(toIndentedString(rerequestable)).append("\n");
    sb.append("    runsRerequestable: ").append(toIndentedString(runsRerequestable)).append("\n");
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
    openapiFields.add("node_id");
    openapiFields.add("head_branch");
    openapiFields.add("head_sha");
    openapiFields.add("status");
    openapiFields.add("conclusion");
    openapiFields.add("url");
    openapiFields.add("before");
    openapiFields.add("after");
    openapiFields.add("pull_requests");
    openapiFields.add("app");
    openapiFields.add("repository");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("head_commit");
    openapiFields.add("latest_check_runs_count");
    openapiFields.add("check_runs_url");
    openapiFields.add("rerequestable");
    openapiFields.add("runs_rerequestable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("head_branch");
    openapiRequiredFields.add("head_sha");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("conclusion");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("before");
    openapiRequiredFields.add("after");
    openapiRequiredFields.add("pull_requests");
    openapiRequiredFields.add("app");
    openapiRequiredFields.add("repository");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("head_commit");
    openapiRequiredFields.add("latest_check_runs_count");
    openapiRequiredFields.add("check_runs_url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckSuite
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CheckSuite.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckSuite is not found in the empty JSON string", CheckSuite.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CheckSuite.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CheckSuite` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckSuite.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if (!jsonObj.get("head_branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `head_branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("head_branch").toString()));
      }
      if (!jsonObj.get("head_sha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `head_sha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("head_sha").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("conclusion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conclusion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conclusion").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("before").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `before` to be a primitive type in the JSON string but got `%s`", jsonObj.get("before").toString()));
      }
      if (!jsonObj.get("after").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `after` to be a primitive type in the JSON string but got `%s`", jsonObj.get("after").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("pull_requests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pull_requests` to be an array in the JSON string but got `%s`", jsonObj.get("pull_requests").toString()));
      }

      JsonArray jsonArraypullRequests = jsonObj.getAsJsonArray("pull_requests");
      // validate the required field `pull_requests` (array)
      for (int i = 0; i < jsonArraypullRequests.size(); i++) {
        PullRequestMinimal.validateJsonObject(jsonArraypullRequests.get(i).getAsJsonObject());
      };
      // validate the required field `app`
      NullableIntegration.validateJsonObject(jsonObj.getAsJsonObject("app"));
      // validate the required field `repository`
      MinimalRepository.validateJsonObject(jsonObj.getAsJsonObject("repository"));
      // validate the required field `head_commit`
      SimpleCommit.validateJsonObject(jsonObj.getAsJsonObject("head_commit"));
      if (!jsonObj.get("check_runs_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `check_runs_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("check_runs_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckSuite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckSuite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckSuite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckSuite.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckSuite>() {
           @Override
           public void write(JsonWriter out, CheckSuite value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CheckSuite read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CheckSuite given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckSuite
  * @throws IOException if the JSON string is invalid with respect to CheckSuite
  */
  public static CheckSuite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckSuite.class);
  }

 /**
  * Convert an instance of CheckSuite to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
