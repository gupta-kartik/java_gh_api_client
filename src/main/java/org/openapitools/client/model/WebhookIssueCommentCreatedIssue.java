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
import org.openapitools.client.model.DeploymentWorkflowRunHeadRepositoryOwner;
import org.openapitools.client.model.IssuePullRequest;
import org.openapitools.client.model.Label;
import org.openapitools.client.model.User1;
import org.openapitools.client.model.WebhookDiscussionCreatedDiscussionAllOfReactions;
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
 * The [issue](https://docs.github.com/rest/reference/issues) the comment belongs to.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookIssueCommentCreatedIssue {
  public static final String SERIALIZED_NAME_ACTIVE_LOCK_REASON = "active_lock_reason";
  @SerializedName(SERIALIZED_NAME_ACTIVE_LOCK_REASON)
  private String activeLockReason;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private User1 assignee;

  public static final String SERIALIZED_NAME_ASSIGNEES = "assignees";
  @SerializedName(SERIALIZED_NAME_ASSIGNEES)
  private List<Object> assignees = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTHOR_ASSOCIATION = "author_association";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ASSOCIATION)
  private String authorAssociation;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CLOSED_AT = "closed_at";
  @SerializedName(SERIALIZED_NAME_CLOSED_AT)
  private String closedAt;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private Integer comments;

  public static final String SERIALIZED_NAME_COMMENTS_URL = "comments_url";
  @SerializedName(SERIALIZED_NAME_COMMENTS_URL)
  private String commentsUrl;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DRAFT = "draft";
  @SerializedName(SERIALIZED_NAME_DRAFT)
  private Boolean draft;

  public static final String SERIALIZED_NAME_EVENTS_URL = "events_url";
  @SerializedName(SERIALIZED_NAME_EVENTS_URL)
  private String eventsUrl;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private String htmlUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<Label> labels = new ArrayList<>();

  public static final String SERIALIZED_NAME_LABELS_URL = "labels_url";
  @SerializedName(SERIALIZED_NAME_LABELS_URL)
  private String labelsUrl;

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked;

  public static final String SERIALIZED_NAME_MILESTONE = "milestone";
  @SerializedName(SERIALIZED_NAME_MILESTONE)
  private Object milestone;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_PERFORMED_VIA_GITHUB_APP = "performed_via_github_app";
  @SerializedName(SERIALIZED_NAME_PERFORMED_VIA_GITHUB_APP)
  private Object performedViaGithubApp;

  public static final String SERIALIZED_NAME_PULL_REQUEST = "pull_request";
  @SerializedName(SERIALIZED_NAME_PULL_REQUEST)
  private IssuePullRequest pullRequest;

  public static final String SERIALIZED_NAME_REACTIONS = "reactions";
  @SerializedName(SERIALIZED_NAME_REACTIONS)
  private WebhookDiscussionCreatedDiscussionAllOfReactions reactions;

  public static final String SERIALIZED_NAME_REPOSITORY_URL = "repository_url";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_URL)
  private String repositoryUrl;

  /**
   * State of the issue; either &#39;open&#39; or &#39;closed&#39;
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    OPEN("open"),
    
    CLOSED("closed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_STATE_REASON = "state_reason";
  @SerializedName(SERIALIZED_NAME_STATE_REASON)
  private String stateReason;

  public static final String SERIALIZED_NAME_TIMELINE_URL = "timeline_url";
  @SerializedName(SERIALIZED_NAME_TIMELINE_URL)
  private String timelineUrl;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private DeploymentWorkflowRunHeadRepositoryOwner user;

  public WebhookIssueCommentCreatedIssue() {
  }

  public WebhookIssueCommentCreatedIssue activeLockReason(String activeLockReason) {
    
    this.activeLockReason = activeLockReason;
    return this;
  }

   /**
   * Get activeLockReason
   * @return activeLockReason
  **/
  @javax.annotation.Nullable

  public String getActiveLockReason() {
    return activeLockReason;
  }


  public void setActiveLockReason(String activeLockReason) {
    this.activeLockReason = activeLockReason;
  }


  public WebhookIssueCommentCreatedIssue assignee(User1 assignee) {
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @javax.annotation.Nullable

  public User1 getAssignee() {
    return assignee;
  }


  public void setAssignee(User1 assignee) {
    this.assignee = assignee;
  }


  public WebhookIssueCommentCreatedIssue assignees(List<Object> assignees) {
    
    this.assignees = assignees;
    return this;
  }

  public WebhookIssueCommentCreatedIssue addAssigneesItem(Object assigneesItem) {
    if (this.assignees == null) {
      this.assignees = new ArrayList<>();
    }
    this.assignees.add(assigneesItem);
    return this;
  }

   /**
   * Get assignees
   * @return assignees
  **/
  @javax.annotation.Nonnull

  public List<Object> getAssignees() {
    return assignees;
  }


  public void setAssignees(List<Object> assignees) {
    this.assignees = assignees;
  }


  public WebhookIssueCommentCreatedIssue authorAssociation(String authorAssociation) {
    
    this.authorAssociation = authorAssociation;
    return this;
  }

   /**
   * Get authorAssociation
   * @return authorAssociation
  **/
  @javax.annotation.Nonnull

  public String getAuthorAssociation() {
    return authorAssociation;
  }


  public void setAuthorAssociation(String authorAssociation) {
    this.authorAssociation = authorAssociation;
  }


  public WebhookIssueCommentCreatedIssue body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public WebhookIssueCommentCreatedIssue closedAt(String closedAt) {
    
    this.closedAt = closedAt;
    return this;
  }

   /**
   * Get closedAt
   * @return closedAt
  **/
  @javax.annotation.Nullable

  public String getClosedAt() {
    return closedAt;
  }


  public void setClosedAt(String closedAt) {
    this.closedAt = closedAt;
  }


  public WebhookIssueCommentCreatedIssue comments(Integer comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nonnull

  public Integer getComments() {
    return comments;
  }


  public void setComments(Integer comments) {
    this.comments = comments;
  }


  public WebhookIssueCommentCreatedIssue commentsUrl(String commentsUrl) {
    
    this.commentsUrl = commentsUrl;
    return this;
  }

   /**
   * Get commentsUrl
   * @return commentsUrl
  **/
  @javax.annotation.Nonnull

  public String getCommentsUrl() {
    return commentsUrl;
  }


  public void setCommentsUrl(String commentsUrl) {
    this.commentsUrl = commentsUrl;
  }


  public WebhookIssueCommentCreatedIssue createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookIssueCommentCreatedIssue draft(Boolean draft) {
    
    this.draft = draft;
    return this;
  }

   /**
   * Get draft
   * @return draft
  **/
  @javax.annotation.Nullable

  public Boolean getDraft() {
    return draft;
  }


  public void setDraft(Boolean draft) {
    this.draft = draft;
  }


  public WebhookIssueCommentCreatedIssue eventsUrl(String eventsUrl) {
    
    this.eventsUrl = eventsUrl;
    return this;
  }

   /**
   * Get eventsUrl
   * @return eventsUrl
  **/
  @javax.annotation.Nonnull

  public String getEventsUrl() {
    return eventsUrl;
  }


  public void setEventsUrl(String eventsUrl) {
    this.eventsUrl = eventsUrl;
  }


  public WebhookIssueCommentCreatedIssue htmlUrl(String htmlUrl) {
    
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @javax.annotation.Nonnull

  public String getHtmlUrl() {
    return htmlUrl;
  }


  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }


  public WebhookIssueCommentCreatedIssue id(Integer id) {
    
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


  public WebhookIssueCommentCreatedIssue labels(List<Label> labels) {
    
    this.labels = labels;
    return this;
  }

  public WebhookIssueCommentCreatedIssue addLabelsItem(Label labelsItem) {
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
  @javax.annotation.Nonnull

  public List<Label> getLabels() {
    return labels;
  }


  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }


  public WebhookIssueCommentCreatedIssue labelsUrl(String labelsUrl) {
    
    this.labelsUrl = labelsUrl;
    return this;
  }

   /**
   * Get labelsUrl
   * @return labelsUrl
  **/
  @javax.annotation.Nonnull

  public String getLabelsUrl() {
    return labelsUrl;
  }


  public void setLabelsUrl(String labelsUrl) {
    this.labelsUrl = labelsUrl;
  }


  public WebhookIssueCommentCreatedIssue locked(Boolean locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @javax.annotation.Nonnull

  public Boolean getLocked() {
    return locked;
  }


  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  public WebhookIssueCommentCreatedIssue milestone(Object milestone) {
    
    this.milestone = milestone;
    return this;
  }

   /**
   * Get milestone
   * @return milestone
  **/
  @javax.annotation.Nullable

  public Object getMilestone() {
    return milestone;
  }


  public void setMilestone(Object milestone) {
    this.milestone = milestone;
  }


  public WebhookIssueCommentCreatedIssue nodeId(String nodeId) {
    
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


  public WebhookIssueCommentCreatedIssue number(Integer number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nonnull

  public Integer getNumber() {
    return number;
  }


  public void setNumber(Integer number) {
    this.number = number;
  }


  public WebhookIssueCommentCreatedIssue performedViaGithubApp(Object performedViaGithubApp) {
    
    this.performedViaGithubApp = performedViaGithubApp;
    return this;
  }

   /**
   * Get performedViaGithubApp
   * @return performedViaGithubApp
  **/
  @javax.annotation.Nullable

  public Object getPerformedViaGithubApp() {
    return performedViaGithubApp;
  }


  public void setPerformedViaGithubApp(Object performedViaGithubApp) {
    this.performedViaGithubApp = performedViaGithubApp;
  }


  public WebhookIssueCommentCreatedIssue pullRequest(IssuePullRequest pullRequest) {
    
    this.pullRequest = pullRequest;
    return this;
  }

   /**
   * Get pullRequest
   * @return pullRequest
  **/
  @javax.annotation.Nullable

  public IssuePullRequest getPullRequest() {
    return pullRequest;
  }


  public void setPullRequest(IssuePullRequest pullRequest) {
    this.pullRequest = pullRequest;
  }


  public WebhookIssueCommentCreatedIssue reactions(WebhookDiscussionCreatedDiscussionAllOfReactions reactions) {
    
    this.reactions = reactions;
    return this;
  }

   /**
   * Get reactions
   * @return reactions
  **/
  @javax.annotation.Nonnull

  public WebhookDiscussionCreatedDiscussionAllOfReactions getReactions() {
    return reactions;
  }


  public void setReactions(WebhookDiscussionCreatedDiscussionAllOfReactions reactions) {
    this.reactions = reactions;
  }


  public WebhookIssueCommentCreatedIssue repositoryUrl(String repositoryUrl) {
    
    this.repositoryUrl = repositoryUrl;
    return this;
  }

   /**
   * Get repositoryUrl
   * @return repositoryUrl
  **/
  @javax.annotation.Nonnull

  public String getRepositoryUrl() {
    return repositoryUrl;
  }


  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }


  public WebhookIssueCommentCreatedIssue state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * State of the issue; either &#39;open&#39; or &#39;closed&#39;
   * @return state
  **/
  @javax.annotation.Nonnull

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public WebhookIssueCommentCreatedIssue stateReason(String stateReason) {
    
    this.stateReason = stateReason;
    return this;
  }

   /**
   * Get stateReason
   * @return stateReason
  **/
  @javax.annotation.Nullable

  public String getStateReason() {
    return stateReason;
  }


  public void setStateReason(String stateReason) {
    this.stateReason = stateReason;
  }


  public WebhookIssueCommentCreatedIssue timelineUrl(String timelineUrl) {
    
    this.timelineUrl = timelineUrl;
    return this;
  }

   /**
   * Get timelineUrl
   * @return timelineUrl
  **/
  @javax.annotation.Nullable

  public String getTimelineUrl() {
    return timelineUrl;
  }


  public void setTimelineUrl(String timelineUrl) {
    this.timelineUrl = timelineUrl;
  }


  public WebhookIssueCommentCreatedIssue title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public WebhookIssueCommentCreatedIssue updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public WebhookIssueCommentCreatedIssue url(String url) {
    
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


  public WebhookIssueCommentCreatedIssue user(DeploymentWorkflowRunHeadRepositoryOwner user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull

  public DeploymentWorkflowRunHeadRepositoryOwner getUser() {
    return user;
  }


  public void setUser(DeploymentWorkflowRunHeadRepositoryOwner user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookIssueCommentCreatedIssue webhookIssueCommentCreatedIssue = (WebhookIssueCommentCreatedIssue) o;
    return Objects.equals(this.activeLockReason, webhookIssueCommentCreatedIssue.activeLockReason) &&
        Objects.equals(this.assignee, webhookIssueCommentCreatedIssue.assignee) &&
        Objects.equals(this.assignees, webhookIssueCommentCreatedIssue.assignees) &&
        Objects.equals(this.authorAssociation, webhookIssueCommentCreatedIssue.authorAssociation) &&
        Objects.equals(this.body, webhookIssueCommentCreatedIssue.body) &&
        Objects.equals(this.closedAt, webhookIssueCommentCreatedIssue.closedAt) &&
        Objects.equals(this.comments, webhookIssueCommentCreatedIssue.comments) &&
        Objects.equals(this.commentsUrl, webhookIssueCommentCreatedIssue.commentsUrl) &&
        Objects.equals(this.createdAt, webhookIssueCommentCreatedIssue.createdAt) &&
        Objects.equals(this.draft, webhookIssueCommentCreatedIssue.draft) &&
        Objects.equals(this.eventsUrl, webhookIssueCommentCreatedIssue.eventsUrl) &&
        Objects.equals(this.htmlUrl, webhookIssueCommentCreatedIssue.htmlUrl) &&
        Objects.equals(this.id, webhookIssueCommentCreatedIssue.id) &&
        Objects.equals(this.labels, webhookIssueCommentCreatedIssue.labels) &&
        Objects.equals(this.labelsUrl, webhookIssueCommentCreatedIssue.labelsUrl) &&
        Objects.equals(this.locked, webhookIssueCommentCreatedIssue.locked) &&
        Objects.equals(this.milestone, webhookIssueCommentCreatedIssue.milestone) &&
        Objects.equals(this.nodeId, webhookIssueCommentCreatedIssue.nodeId) &&
        Objects.equals(this.number, webhookIssueCommentCreatedIssue.number) &&
        Objects.equals(this.performedViaGithubApp, webhookIssueCommentCreatedIssue.performedViaGithubApp) &&
        Objects.equals(this.pullRequest, webhookIssueCommentCreatedIssue.pullRequest) &&
        Objects.equals(this.reactions, webhookIssueCommentCreatedIssue.reactions) &&
        Objects.equals(this.repositoryUrl, webhookIssueCommentCreatedIssue.repositoryUrl) &&
        Objects.equals(this.state, webhookIssueCommentCreatedIssue.state) &&
        Objects.equals(this.stateReason, webhookIssueCommentCreatedIssue.stateReason) &&
        Objects.equals(this.timelineUrl, webhookIssueCommentCreatedIssue.timelineUrl) &&
        Objects.equals(this.title, webhookIssueCommentCreatedIssue.title) &&
        Objects.equals(this.updatedAt, webhookIssueCommentCreatedIssue.updatedAt) &&
        Objects.equals(this.url, webhookIssueCommentCreatedIssue.url) &&
        Objects.equals(this.user, webhookIssueCommentCreatedIssue.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeLockReason, assignee, assignees, authorAssociation, body, closedAt, comments, commentsUrl, createdAt, draft, eventsUrl, htmlUrl, id, labels, labelsUrl, locked, milestone, nodeId, number, performedViaGithubApp, pullRequest, reactions, repositoryUrl, state, stateReason, timelineUrl, title, updatedAt, url, user);
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
    sb.append("class WebhookIssueCommentCreatedIssue {\n");
    sb.append("    activeLockReason: ").append(toIndentedString(activeLockReason)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
    sb.append("    authorAssociation: ").append(toIndentedString(authorAssociation)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    labelsUrl: ").append(toIndentedString(labelsUrl)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    performedViaGithubApp: ").append(toIndentedString(performedViaGithubApp)).append("\n");
    sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateReason: ").append(toIndentedString(stateReason)).append("\n");
    sb.append("    timelineUrl: ").append(toIndentedString(timelineUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("active_lock_reason");
    openapiFields.add("assignee");
    openapiFields.add("assignees");
    openapiFields.add("author_association");
    openapiFields.add("body");
    openapiFields.add("closed_at");
    openapiFields.add("comments");
    openapiFields.add("comments_url");
    openapiFields.add("created_at");
    openapiFields.add("draft");
    openapiFields.add("events_url");
    openapiFields.add("html_url");
    openapiFields.add("id");
    openapiFields.add("labels");
    openapiFields.add("labels_url");
    openapiFields.add("locked");
    openapiFields.add("milestone");
    openapiFields.add("node_id");
    openapiFields.add("number");
    openapiFields.add("performed_via_github_app");
    openapiFields.add("pull_request");
    openapiFields.add("reactions");
    openapiFields.add("repository_url");
    openapiFields.add("state");
    openapiFields.add("state_reason");
    openapiFields.add("timeline_url");
    openapiFields.add("title");
    openapiFields.add("updated_at");
    openapiFields.add("url");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("active_lock_reason");
    openapiRequiredFields.add("assignee");
    openapiRequiredFields.add("assignees");
    openapiRequiredFields.add("author_association");
    openapiRequiredFields.add("body");
    openapiRequiredFields.add("closed_at");
    openapiRequiredFields.add("comments");
    openapiRequiredFields.add("comments_url");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("events_url");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("labels");
    openapiRequiredFields.add("labels_url");
    openapiRequiredFields.add("locked");
    openapiRequiredFields.add("milestone");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("reactions");
    openapiRequiredFields.add("repository_url");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookIssueCommentCreatedIssue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookIssueCommentCreatedIssue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookIssueCommentCreatedIssue is not found in the empty JSON string", WebhookIssueCommentCreatedIssue.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookIssueCommentCreatedIssue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookIssueCommentCreatedIssue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookIssueCommentCreatedIssue.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("active_lock_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `active_lock_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("active_lock_reason").toString()));
      }
      // validate the required field `assignee`
      User1.validateJsonObject(jsonObj.getAsJsonObject("assignee"));
      // ensure the required json array is present
      if (jsonObj.get("assignees") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("assignees").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignees` to be an array in the JSON string but got `%s`", jsonObj.get("assignees").toString()));
      }
      if (!jsonObj.get("author_association").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_association` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_association").toString()));
      }
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if (!jsonObj.get("closed_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `closed_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("closed_at").toString()));
      }
      if (!jsonObj.get("comments_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments_url").toString()));
      }
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (!jsonObj.get("events_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `events_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("events_url").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("labels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
      }

      JsonArray jsonArraylabels = jsonObj.getAsJsonArray("labels");
      // validate the required field `labels` (array)
      for (int i = 0; i < jsonArraylabels.size(); i++) {
        Label.validateJsonObject(jsonArraylabels.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("labels_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("labels_url").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      // validate the optional field `pull_request`
      if (jsonObj.get("pull_request") != null && !jsonObj.get("pull_request").isJsonNull()) {
        IssuePullRequest.validateJsonObject(jsonObj.getAsJsonObject("pull_request"));
      }
      // validate the required field `reactions`
      WebhookDiscussionCreatedDiscussionAllOfReactions.validateJsonObject(jsonObj.getAsJsonObject("reactions"));
      if (!jsonObj.get("repository_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repository_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repository_url").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("state_reason") != null && !jsonObj.get("state_reason").isJsonNull()) && !jsonObj.get("state_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_reason").toString()));
      }
      if ((jsonObj.get("timeline_url") != null && !jsonObj.get("timeline_url").isJsonNull()) && !jsonObj.get("timeline_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeline_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeline_url").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the required field `user`
      DeploymentWorkflowRunHeadRepositoryOwner.validateJsonObject(jsonObj.getAsJsonObject("user"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookIssueCommentCreatedIssue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookIssueCommentCreatedIssue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookIssueCommentCreatedIssue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookIssueCommentCreatedIssue.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookIssueCommentCreatedIssue>() {
           @Override
           public void write(JsonWriter out, WebhookIssueCommentCreatedIssue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookIssueCommentCreatedIssue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookIssueCommentCreatedIssue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookIssueCommentCreatedIssue
  * @throws IOException if the JSON string is invalid with respect to WebhookIssueCommentCreatedIssue
  */
  public static WebhookIssueCommentCreatedIssue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookIssueCommentCreatedIssue.class);
  }

 /**
  * Convert an instance of WebhookIssueCommentCreatedIssue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

