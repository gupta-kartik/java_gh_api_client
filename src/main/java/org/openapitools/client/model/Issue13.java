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
import org.openapitools.client.model.App16;
import org.openapitools.client.model.IssuePullRequest;
import org.openapitools.client.model.Label;
import org.openapitools.client.model.Milestone;
import org.openapitools.client.model.Reactions;
import org.openapitools.client.model.User;
import org.openapitools.client.model.User1;
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
 * The [issue](https://docs.github.com/rest/reference/issues) itself.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class Issue13 {
  /**
   * Gets or Sets activeLockReason
   */
  @JsonAdapter(ActiveLockReasonEnum.Adapter.class)
  public enum ActiveLockReasonEnum {
    RESOLVED("resolved"),
    
    OFF_TOPIC("off-topic"),
    
    TOO_HEATED("too heated"),
    
    SPAM("spam"),
    
    NULL("null");

    private String value;

    ActiveLockReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActiveLockReasonEnum fromValue(String value) {
      for (ActiveLockReasonEnum b : ActiveLockReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActiveLockReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActiveLockReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActiveLockReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActiveLockReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTIVE_LOCK_REASON = "active_lock_reason";
  @SerializedName(SERIALIZED_NAME_ACTIVE_LOCK_REASON)
  private ActiveLockReasonEnum activeLockReason;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private User assignee;

  public static final String SERIALIZED_NAME_ASSIGNEES = "assignees";
  @SerializedName(SERIALIZED_NAME_ASSIGNEES)
  private List<User1> assignees = new ArrayList<>();

  /**
   * How the author is associated with the repository.
   */
  @JsonAdapter(AuthorAssociationEnum.Adapter.class)
  public enum AuthorAssociationEnum {
    COLLABORATOR("COLLABORATOR"),
    
    CONTRIBUTOR("CONTRIBUTOR"),
    
    FIRST_TIMER("FIRST_TIMER"),
    
    FIRST_TIME_CONTRIBUTOR("FIRST_TIME_CONTRIBUTOR"),
    
    MANNEQUIN("MANNEQUIN"),
    
    MEMBER("MEMBER"),
    
    NONE("NONE"),
    
    OWNER("OWNER");

    private String value;

    AuthorAssociationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthorAssociationEnum fromValue(String value) {
      for (AuthorAssociationEnum b : AuthorAssociationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthorAssociationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthorAssociationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthorAssociationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthorAssociationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTHOR_ASSOCIATION = "author_association";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ASSOCIATION)
  private AuthorAssociationEnum authorAssociation;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CLOSED_AT = "closed_at";
  @SerializedName(SERIALIZED_NAME_CLOSED_AT)
  private OffsetDateTime closedAt;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private Integer comments;

  public static final String SERIALIZED_NAME_COMMENTS_URL = "comments_url";
  @SerializedName(SERIALIZED_NAME_COMMENTS_URL)
  private URI commentsUrl;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DRAFT = "draft";
  @SerializedName(SERIALIZED_NAME_DRAFT)
  private Boolean draft;

  public static final String SERIALIZED_NAME_EVENTS_URL = "events_url";
  @SerializedName(SERIALIZED_NAME_EVENTS_URL)
  private URI eventsUrl;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<Label> labels;

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
  private App16 performedViaGithubApp;

  public static final String SERIALIZED_NAME_PULL_REQUEST = "pull_request";
  @SerializedName(SERIALIZED_NAME_PULL_REQUEST)
  private IssuePullRequest pullRequest;

  public static final String SERIALIZED_NAME_REACTIONS = "reactions";
  @SerializedName(SERIALIZED_NAME_REACTIONS)
  private Reactions reactions;

  public static final String SERIALIZED_NAME_REPOSITORY_URL = "repository_url";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_URL)
  private URI repositoryUrl;

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
  private URI timelineUrl;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User1 user;

  public Issue13() {
  }

  public Issue13 activeLockReason(ActiveLockReasonEnum activeLockReason) {
    
    this.activeLockReason = activeLockReason;
    return this;
  }

   /**
   * Get activeLockReason
   * @return activeLockReason
  **/
  @javax.annotation.Nullable

  public ActiveLockReasonEnum getActiveLockReason() {
    return activeLockReason;
  }


  public void setActiveLockReason(ActiveLockReasonEnum activeLockReason) {
    this.activeLockReason = activeLockReason;
  }


  public Issue13 assignee(User assignee) {
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @javax.annotation.Nullable

  public User getAssignee() {
    return assignee;
  }


  public void setAssignee(User assignee) {
    this.assignee = assignee;
  }


  public Issue13 assignees(List<User1> assignees) {
    
    this.assignees = assignees;
    return this;
  }

  public Issue13 addAssigneesItem(User1 assigneesItem) {
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

  public List<User1> getAssignees() {
    return assignees;
  }


  public void setAssignees(List<User1> assignees) {
    this.assignees = assignees;
  }


  public Issue13 authorAssociation(AuthorAssociationEnum authorAssociation) {
    
    this.authorAssociation = authorAssociation;
    return this;
  }

   /**
   * How the author is associated with the repository.
   * @return authorAssociation
  **/
  @javax.annotation.Nonnull

  public AuthorAssociationEnum getAuthorAssociation() {
    return authorAssociation;
  }


  public void setAuthorAssociation(AuthorAssociationEnum authorAssociation) {
    this.authorAssociation = authorAssociation;
  }


  public Issue13 body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Contents of the issue
   * @return body
  **/
  @javax.annotation.Nullable

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public Issue13 closedAt(OffsetDateTime closedAt) {
    
    this.closedAt = closedAt;
    return this;
  }

   /**
   * Get closedAt
   * @return closedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getClosedAt() {
    return closedAt;
  }


  public void setClosedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
  }


  public Issue13 comments(Integer comments) {
    
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


  public Issue13 commentsUrl(URI commentsUrl) {
    
    this.commentsUrl = commentsUrl;
    return this;
  }

   /**
   * Get commentsUrl
   * @return commentsUrl
  **/
  @javax.annotation.Nonnull

  public URI getCommentsUrl() {
    return commentsUrl;
  }


  public void setCommentsUrl(URI commentsUrl) {
    this.commentsUrl = commentsUrl;
  }


  public Issue13 createdAt(OffsetDateTime createdAt) {
    
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


  public Issue13 draft(Boolean draft) {
    
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


  public Issue13 eventsUrl(URI eventsUrl) {
    
    this.eventsUrl = eventsUrl;
    return this;
  }

   /**
   * Get eventsUrl
   * @return eventsUrl
  **/
  @javax.annotation.Nonnull

  public URI getEventsUrl() {
    return eventsUrl;
  }


  public void setEventsUrl(URI eventsUrl) {
    this.eventsUrl = eventsUrl;
  }


  public Issue13 htmlUrl(URI htmlUrl) {
    
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


  public Issue13 id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Issue13 labels(List<Label> labels) {
    
    this.labels = labels;
    return this;
  }

  public Issue13 addLabelsItem(Label labelsItem) {
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

  public List<Label> getLabels() {
    return labels;
  }


  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }


  public Issue13 labelsUrl(String labelsUrl) {
    
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


  public Issue13 locked(Boolean locked) {
    
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


  public Issue13 milestone(Milestone milestone) {
    
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


  public Issue13 nodeId(String nodeId) {
    
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


  public Issue13 number(Integer number) {
    
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


  public Issue13 performedViaGithubApp(App16 performedViaGithubApp) {
    
    this.performedViaGithubApp = performedViaGithubApp;
    return this;
  }

   /**
   * Get performedViaGithubApp
   * @return performedViaGithubApp
  **/
  @javax.annotation.Nullable

  public App16 getPerformedViaGithubApp() {
    return performedViaGithubApp;
  }


  public void setPerformedViaGithubApp(App16 performedViaGithubApp) {
    this.performedViaGithubApp = performedViaGithubApp;
  }


  public Issue13 pullRequest(IssuePullRequest pullRequest) {
    
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


  public Issue13 reactions(Reactions reactions) {
    
    this.reactions = reactions;
    return this;
  }

   /**
   * Get reactions
   * @return reactions
  **/
  @javax.annotation.Nonnull

  public Reactions getReactions() {
    return reactions;
  }


  public void setReactions(Reactions reactions) {
    this.reactions = reactions;
  }


  public Issue13 repositoryUrl(URI repositoryUrl) {
    
    this.repositoryUrl = repositoryUrl;
    return this;
  }

   /**
   * Get repositoryUrl
   * @return repositoryUrl
  **/
  @javax.annotation.Nonnull

  public URI getRepositoryUrl() {
    return repositoryUrl;
  }


  public void setRepositoryUrl(URI repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }


  public Issue13 state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * State of the issue; either &#39;open&#39; or &#39;closed&#39;
   * @return state
  **/
  @javax.annotation.Nullable

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public Issue13 stateReason(String stateReason) {
    
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


  public Issue13 timelineUrl(URI timelineUrl) {
    
    this.timelineUrl = timelineUrl;
    return this;
  }

   /**
   * Get timelineUrl
   * @return timelineUrl
  **/
  @javax.annotation.Nullable

  public URI getTimelineUrl() {
    return timelineUrl;
  }


  public void setTimelineUrl(URI timelineUrl) {
    this.timelineUrl = timelineUrl;
  }


  public Issue13 title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of the issue
   * @return title
  **/
  @javax.annotation.Nonnull

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Issue13 updatedAt(OffsetDateTime updatedAt) {
    
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


  public Issue13 url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL for the issue
   * @return url
  **/
  @javax.annotation.Nonnull

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public Issue13 user(User1 user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable

  public User1 getUser() {
    return user;
  }


  public void setUser(User1 user) {
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
    Issue13 issue13 = (Issue13) o;
    return Objects.equals(this.activeLockReason, issue13.activeLockReason) &&
        Objects.equals(this.assignee, issue13.assignee) &&
        Objects.equals(this.assignees, issue13.assignees) &&
        Objects.equals(this.authorAssociation, issue13.authorAssociation) &&
        Objects.equals(this.body, issue13.body) &&
        Objects.equals(this.closedAt, issue13.closedAt) &&
        Objects.equals(this.comments, issue13.comments) &&
        Objects.equals(this.commentsUrl, issue13.commentsUrl) &&
        Objects.equals(this.createdAt, issue13.createdAt) &&
        Objects.equals(this.draft, issue13.draft) &&
        Objects.equals(this.eventsUrl, issue13.eventsUrl) &&
        Objects.equals(this.htmlUrl, issue13.htmlUrl) &&
        Objects.equals(this.id, issue13.id) &&
        Objects.equals(this.labels, issue13.labels) &&
        Objects.equals(this.labelsUrl, issue13.labelsUrl) &&
        Objects.equals(this.locked, issue13.locked) &&
        Objects.equals(this.milestone, issue13.milestone) &&
        Objects.equals(this.nodeId, issue13.nodeId) &&
        Objects.equals(this.number, issue13.number) &&
        Objects.equals(this.performedViaGithubApp, issue13.performedViaGithubApp) &&
        Objects.equals(this.pullRequest, issue13.pullRequest) &&
        Objects.equals(this.reactions, issue13.reactions) &&
        Objects.equals(this.repositoryUrl, issue13.repositoryUrl) &&
        Objects.equals(this.state, issue13.state) &&
        Objects.equals(this.stateReason, issue13.stateReason) &&
        Objects.equals(this.timelineUrl, issue13.timelineUrl) &&
        Objects.equals(this.title, issue13.title) &&
        Objects.equals(this.updatedAt, issue13.updatedAt) &&
        Objects.equals(this.url, issue13.url) &&
        Objects.equals(this.user, issue13.user);
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
    sb.append("class Issue13 {\n");
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
    openapiRequiredFields.add("labels_url");
    openapiRequiredFields.add("milestone");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("reactions");
    openapiRequiredFields.add("repository_url");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Issue13
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Issue13.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Issue13 is not found in the empty JSON string", Issue13.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Issue13.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Issue13` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Issue13.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("active_lock_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `active_lock_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("active_lock_reason").toString()));
      }
      // validate the optional field `assignee`
      if (jsonObj.get("assignee") != null && !jsonObj.get("assignee").isJsonNull()) {
        User.validateJsonObject(jsonObj.getAsJsonObject("assignee"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("assignees").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignees` to be an array in the JSON string but got `%s`", jsonObj.get("assignees").toString()));
      }

      JsonArray jsonArrayassignees = jsonObj.getAsJsonArray("assignees");
      // validate the required field `assignees` (array)
      for (int i = 0; i < jsonArrayassignees.size(); i++) {
        User1.validateJsonObject(jsonArrayassignees.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("author_association").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_association` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_association").toString()));
      }
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if (!jsonObj.get("comments_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments_url").toString()));
      }
      if (!jsonObj.get("events_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `events_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("events_url").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull()) {
        JsonArray jsonArraylabels = jsonObj.getAsJsonArray("labels");
        if (jsonArraylabels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("labels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
          }

          // validate the optional field `labels` (array)
          for (int i = 0; i < jsonArraylabels.size(); i++) {
            Label.validateJsonObject(jsonArraylabels.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("labels_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("labels_url").toString()));
      }
      // validate the required field `milestone`
      Milestone.validateJsonObject(jsonObj.getAsJsonObject("milestone"));
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      // validate the optional field `performed_via_github_app`
      if (jsonObj.get("performed_via_github_app") != null && !jsonObj.get("performed_via_github_app").isJsonNull()) {
        App16.validateJsonObject(jsonObj.getAsJsonObject("performed_via_github_app"));
      }
      // validate the optional field `pull_request`
      if (jsonObj.get("pull_request") != null && !jsonObj.get("pull_request").isJsonNull()) {
        IssuePullRequest.validateJsonObject(jsonObj.getAsJsonObject("pull_request"));
      }
      // validate the required field `reactions`
      Reactions.validateJsonObject(jsonObj.getAsJsonObject("reactions"));
      if (!jsonObj.get("repository_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repository_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repository_url").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
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
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the required field `user`
      User1.validateJsonObject(jsonObj.getAsJsonObject("user"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Issue13.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Issue13' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Issue13> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Issue13.class));

       return (TypeAdapter<T>) new TypeAdapter<Issue13>() {
           @Override
           public void write(JsonWriter out, Issue13 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Issue13 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Issue13 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Issue13
  * @throws IOException if the JSON string is invalid with respect to Issue13
  */
  public static Issue13 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Issue13.class);
  }

 /**
  * Convert an instance of Issue13 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

