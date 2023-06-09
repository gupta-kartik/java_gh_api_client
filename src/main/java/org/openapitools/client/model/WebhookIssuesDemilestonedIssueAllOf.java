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
import org.openapitools.client.model.Milestone;
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
 * WebhookIssuesDemilestonedIssueAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookIssuesDemilestonedIssueAllOf {
  public static final String SERIALIZED_NAME_ACTIVE_LOCK_REASON = "active_lock_reason";
  @SerializedName(SERIALIZED_NAME_ACTIVE_LOCK_REASON)
  private String activeLockReason;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private Object assignee;

  public static final String SERIALIZED_NAME_ASSIGNEES = "assignees";
  @SerializedName(SERIALIZED_NAME_ASSIGNEES)
  private List<Object> assignees;

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
  private List<Object> labels;

  public static final String SERIALIZED_NAME_LABELS_URL = "labels_url";
  @SerializedName(SERIALIZED_NAME_LABELS_URL)
  private String labelsUrl;

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked;

  public static final String SERIALIZED_NAME_MILESTONE = "milestone";
  @SerializedName(SERIALIZED_NAME_MILESTONE)
  private Milestone milestone;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_PERFORMED_VIA_GITHUB_APP = "performed_via_github_app";
  @SerializedName(SERIALIZED_NAME_PERFORMED_VIA_GITHUB_APP)
  private Object performedViaGithubApp;

  public static final String SERIALIZED_NAME_REACTIONS = "reactions";
  @SerializedName(SERIALIZED_NAME_REACTIONS)
  private WebhookDiscussionCreatedDiscussionAllOfReactions reactions;

  public static final String SERIALIZED_NAME_REPOSITORY_URL = "repository_url";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_URL)
  private String repositoryUrl;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

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

  public WebhookIssuesDemilestonedIssueAllOf() {
  }

  public WebhookIssuesDemilestonedIssueAllOf activeLockReason(String activeLockReason) {
    
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


  public WebhookIssuesDemilestonedIssueAllOf assignee(Object assignee) {
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @javax.annotation.Nullable

  public Object getAssignee() {
    return assignee;
  }


  public void setAssignee(Object assignee) {
    this.assignee = assignee;
  }


  public WebhookIssuesDemilestonedIssueAllOf assignees(List<Object> assignees) {
    
    this.assignees = assignees;
    return this;
  }

  public WebhookIssuesDemilestonedIssueAllOf addAssigneesItem(Object assigneesItem) {
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
  @javax.annotation.Nullable

  public List<Object> getAssignees() {
    return assignees;
  }


  public void setAssignees(List<Object> assignees) {
    this.assignees = assignees;
  }


  public WebhookIssuesDemilestonedIssueAllOf authorAssociation(String authorAssociation) {
    
    this.authorAssociation = authorAssociation;
    return this;
  }

   /**
   * Get authorAssociation
   * @return authorAssociation
  **/
  @javax.annotation.Nullable

  public String getAuthorAssociation() {
    return authorAssociation;
  }


  public void setAuthorAssociation(String authorAssociation) {
    this.authorAssociation = authorAssociation;
  }


  public WebhookIssuesDemilestonedIssueAllOf body(String body) {
    
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


  public WebhookIssuesDemilestonedIssueAllOf closedAt(String closedAt) {
    
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


  public WebhookIssuesDemilestonedIssueAllOf comments(Integer comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nullable

  public Integer getComments() {
    return comments;
  }


  public void setComments(Integer comments) {
    this.comments = comments;
  }


  public WebhookIssuesDemilestonedIssueAllOf commentsUrl(String commentsUrl) {
    
    this.commentsUrl = commentsUrl;
    return this;
  }

   /**
   * Get commentsUrl
   * @return commentsUrl
  **/
  @javax.annotation.Nullable

  public String getCommentsUrl() {
    return commentsUrl;
  }


  public void setCommentsUrl(String commentsUrl) {
    this.commentsUrl = commentsUrl;
  }


  public WebhookIssuesDemilestonedIssueAllOf createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookIssuesDemilestonedIssueAllOf eventsUrl(String eventsUrl) {
    
    this.eventsUrl = eventsUrl;
    return this;
  }

   /**
   * Get eventsUrl
   * @return eventsUrl
  **/
  @javax.annotation.Nullable

  public String getEventsUrl() {
    return eventsUrl;
  }


  public void setEventsUrl(String eventsUrl) {
    this.eventsUrl = eventsUrl;
  }


  public WebhookIssuesDemilestonedIssueAllOf htmlUrl(String htmlUrl) {
    
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


  public WebhookIssuesDemilestonedIssueAllOf id(Integer id) {
    
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


  public WebhookIssuesDemilestonedIssueAllOf labels(List<Object> labels) {
    
    this.labels = labels;
    return this;
  }

  public WebhookIssuesDemilestonedIssueAllOf addLabelsItem(Object labelsItem) {
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

  public List<Object> getLabels() {
    return labels;
  }


  public void setLabels(List<Object> labels) {
    this.labels = labels;
  }


  public WebhookIssuesDemilestonedIssueAllOf labelsUrl(String labelsUrl) {
    
    this.labelsUrl = labelsUrl;
    return this;
  }

   /**
   * Get labelsUrl
   * @return labelsUrl
  **/
  @javax.annotation.Nullable

  public String getLabelsUrl() {
    return labelsUrl;
  }


  public void setLabelsUrl(String labelsUrl) {
    this.labelsUrl = labelsUrl;
  }


  public WebhookIssuesDemilestonedIssueAllOf locked(Boolean locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @javax.annotation.Nullable

  public Boolean getLocked() {
    return locked;
  }


  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  public WebhookIssuesDemilestonedIssueAllOf milestone(Milestone milestone) {
    
    this.milestone = milestone;
    return this;
  }

   /**
   * Get milestone
   * @return milestone
  **/
  @javax.annotation.Nullable

  public Milestone getMilestone() {
    return milestone;
  }


  public void setMilestone(Milestone milestone) {
    this.milestone = milestone;
  }


  public WebhookIssuesDemilestonedIssueAllOf nodeId(String nodeId) {
    
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


  public WebhookIssuesDemilestonedIssueAllOf number(Integer number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable

  public Integer getNumber() {
    return number;
  }


  public void setNumber(Integer number) {
    this.number = number;
  }


  public WebhookIssuesDemilestonedIssueAllOf performedViaGithubApp(Object performedViaGithubApp) {
    
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


  public WebhookIssuesDemilestonedIssueAllOf reactions(WebhookDiscussionCreatedDiscussionAllOfReactions reactions) {
    
    this.reactions = reactions;
    return this;
  }

   /**
   * Get reactions
   * @return reactions
  **/
  @javax.annotation.Nullable

  public WebhookDiscussionCreatedDiscussionAllOfReactions getReactions() {
    return reactions;
  }


  public void setReactions(WebhookDiscussionCreatedDiscussionAllOfReactions reactions) {
    this.reactions = reactions;
  }


  public WebhookIssuesDemilestonedIssueAllOf repositoryUrl(String repositoryUrl) {
    
    this.repositoryUrl = repositoryUrl;
    return this;
  }

   /**
   * Get repositoryUrl
   * @return repositoryUrl
  **/
  @javax.annotation.Nullable

  public String getRepositoryUrl() {
    return repositoryUrl;
  }


  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }


  public WebhookIssuesDemilestonedIssueAllOf state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public WebhookIssuesDemilestonedIssueAllOf timelineUrl(String timelineUrl) {
    
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


  public WebhookIssuesDemilestonedIssueAllOf title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public WebhookIssuesDemilestonedIssueAllOf updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public WebhookIssuesDemilestonedIssueAllOf url(String url) {
    
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


  public WebhookIssuesDemilestonedIssueAllOf user(DeploymentWorkflowRunHeadRepositoryOwner user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable

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
    WebhookIssuesDemilestonedIssueAllOf webhookIssuesDemilestonedIssueAllOf = (WebhookIssuesDemilestonedIssueAllOf) o;
    return Objects.equals(this.activeLockReason, webhookIssuesDemilestonedIssueAllOf.activeLockReason) &&
        Objects.equals(this.assignee, webhookIssuesDemilestonedIssueAllOf.assignee) &&
        Objects.equals(this.assignees, webhookIssuesDemilestonedIssueAllOf.assignees) &&
        Objects.equals(this.authorAssociation, webhookIssuesDemilestonedIssueAllOf.authorAssociation) &&
        Objects.equals(this.body, webhookIssuesDemilestonedIssueAllOf.body) &&
        Objects.equals(this.closedAt, webhookIssuesDemilestonedIssueAllOf.closedAt) &&
        Objects.equals(this.comments, webhookIssuesDemilestonedIssueAllOf.comments) &&
        Objects.equals(this.commentsUrl, webhookIssuesDemilestonedIssueAllOf.commentsUrl) &&
        Objects.equals(this.createdAt, webhookIssuesDemilestonedIssueAllOf.createdAt) &&
        Objects.equals(this.eventsUrl, webhookIssuesDemilestonedIssueAllOf.eventsUrl) &&
        Objects.equals(this.htmlUrl, webhookIssuesDemilestonedIssueAllOf.htmlUrl) &&
        Objects.equals(this.id, webhookIssuesDemilestonedIssueAllOf.id) &&
        Objects.equals(this.labels, webhookIssuesDemilestonedIssueAllOf.labels) &&
        Objects.equals(this.labelsUrl, webhookIssuesDemilestonedIssueAllOf.labelsUrl) &&
        Objects.equals(this.locked, webhookIssuesDemilestonedIssueAllOf.locked) &&
        Objects.equals(this.milestone, webhookIssuesDemilestonedIssueAllOf.milestone) &&
        Objects.equals(this.nodeId, webhookIssuesDemilestonedIssueAllOf.nodeId) &&
        Objects.equals(this.number, webhookIssuesDemilestonedIssueAllOf.number) &&
        Objects.equals(this.performedViaGithubApp, webhookIssuesDemilestonedIssueAllOf.performedViaGithubApp) &&
        Objects.equals(this.reactions, webhookIssuesDemilestonedIssueAllOf.reactions) &&
        Objects.equals(this.repositoryUrl, webhookIssuesDemilestonedIssueAllOf.repositoryUrl) &&
        Objects.equals(this.state, webhookIssuesDemilestonedIssueAllOf.state) &&
        Objects.equals(this.timelineUrl, webhookIssuesDemilestonedIssueAllOf.timelineUrl) &&
        Objects.equals(this.title, webhookIssuesDemilestonedIssueAllOf.title) &&
        Objects.equals(this.updatedAt, webhookIssuesDemilestonedIssueAllOf.updatedAt) &&
        Objects.equals(this.url, webhookIssuesDemilestonedIssueAllOf.url) &&
        Objects.equals(this.user, webhookIssuesDemilestonedIssueAllOf.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeLockReason, assignee, assignees, authorAssociation, body, closedAt, comments, commentsUrl, createdAt, eventsUrl, htmlUrl, id, labels, labelsUrl, locked, milestone, nodeId, number, performedViaGithubApp, reactions, repositoryUrl, state, timelineUrl, title, updatedAt, url, user);
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
    sb.append("class WebhookIssuesDemilestonedIssueAllOf {\n");
    sb.append("    activeLockReason: ").append(toIndentedString(activeLockReason)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
    sb.append("    authorAssociation: ").append(toIndentedString(authorAssociation)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("reactions");
    openapiFields.add("repository_url");
    openapiFields.add("state");
    openapiFields.add("timeline_url");
    openapiFields.add("title");
    openapiFields.add("updated_at");
    openapiFields.add("url");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("milestone");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookIssuesDemilestonedIssueAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookIssuesDemilestonedIssueAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookIssuesDemilestonedIssueAllOf is not found in the empty JSON string", WebhookIssuesDemilestonedIssueAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookIssuesDemilestonedIssueAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookIssuesDemilestonedIssueAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookIssuesDemilestonedIssueAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("active_lock_reason") != null && !jsonObj.get("active_lock_reason").isJsonNull()) && !jsonObj.get("active_lock_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `active_lock_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("active_lock_reason").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("assignees") != null && !jsonObj.get("assignees").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignees` to be an array in the JSON string but got `%s`", jsonObj.get("assignees").toString()));
      }
      if ((jsonObj.get("author_association") != null && !jsonObj.get("author_association").isJsonNull()) && !jsonObj.get("author_association").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_association` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_association").toString()));
      }
      if ((jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if ((jsonObj.get("closed_at") != null && !jsonObj.get("closed_at").isJsonNull()) && !jsonObj.get("closed_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `closed_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("closed_at").toString()));
      }
      if ((jsonObj.get("comments_url") != null && !jsonObj.get("comments_url").isJsonNull()) && !jsonObj.get("comments_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments_url").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("events_url") != null && !jsonObj.get("events_url").isJsonNull()) && !jsonObj.get("events_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `events_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("events_url").toString()));
      }
      if ((jsonObj.get("html_url") != null && !jsonObj.get("html_url").isJsonNull()) && !jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
      }
      if ((jsonObj.get("labels_url") != null && !jsonObj.get("labels_url").isJsonNull()) && !jsonObj.get("labels_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("labels_url").toString()));
      }
      // validate the required field `milestone`
      Milestone.validateJsonObject(jsonObj.getAsJsonObject("milestone"));
      if ((jsonObj.get("node_id") != null && !jsonObj.get("node_id").isJsonNull()) && !jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      // validate the optional field `reactions`
      if (jsonObj.get("reactions") != null && !jsonObj.get("reactions").isJsonNull()) {
        WebhookDiscussionCreatedDiscussionAllOfReactions.validateJsonObject(jsonObj.getAsJsonObject("reactions"));
      }
      if ((jsonObj.get("repository_url") != null && !jsonObj.get("repository_url").isJsonNull()) && !jsonObj.get("repository_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repository_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repository_url").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("timeline_url") != null && !jsonObj.get("timeline_url").isJsonNull()) && !jsonObj.get("timeline_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeline_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeline_url").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        DeploymentWorkflowRunHeadRepositoryOwner.validateJsonObject(jsonObj.getAsJsonObject("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookIssuesDemilestonedIssueAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookIssuesDemilestonedIssueAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookIssuesDemilestonedIssueAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookIssuesDemilestonedIssueAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookIssuesDemilestonedIssueAllOf>() {
           @Override
           public void write(JsonWriter out, WebhookIssuesDemilestonedIssueAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookIssuesDemilestonedIssueAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookIssuesDemilestonedIssueAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookIssuesDemilestonedIssueAllOf
  * @throws IOException if the JSON string is invalid with respect to WebhookIssuesDemilestonedIssueAllOf
  */
  public static WebhookIssuesDemilestonedIssueAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookIssuesDemilestonedIssueAllOf.class);
  }

 /**
  * Convert an instance of WebhookIssuesDemilestonedIssueAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

