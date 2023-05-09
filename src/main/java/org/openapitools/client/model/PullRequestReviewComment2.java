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
import org.openapitools.client.model.PullRequestReviewCommentLinks;
import org.openapitools.client.model.Reactions;
import org.openapitools.client.model.User1;

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
 * The [comment](https://docs.github.com/rest/reference/pulls#comments) itself.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class PullRequestReviewComment2 {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private PullRequestReviewCommentLinks links;

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

  public static final String SERIALIZED_NAME_COMMIT_ID = "commit_id";
  @SerializedName(SERIALIZED_NAME_COMMIT_ID)
  private String commitId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DIFF_HUNK = "diff_hunk";
  @SerializedName(SERIALIZED_NAME_DIFF_HUNK)
  private String diffHunk;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IN_REPLY_TO_ID = "in_reply_to_id";
  @SerializedName(SERIALIZED_NAME_IN_REPLY_TO_ID)
  private Integer inReplyToId;

  public static final String SERIALIZED_NAME_LINE = "line";
  @SerializedName(SERIALIZED_NAME_LINE)
  private Integer line;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_ORIGINAL_COMMIT_ID = "original_commit_id";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_COMMIT_ID)
  private String originalCommitId;

  public static final String SERIALIZED_NAME_ORIGINAL_LINE = "original_line";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_LINE)
  private Integer originalLine;

  public static final String SERIALIZED_NAME_ORIGINAL_POSITION = "original_position";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_POSITION)
  private Integer originalPosition;

  public static final String SERIALIZED_NAME_ORIGINAL_START_LINE = "original_start_line";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_START_LINE)
  private Integer originalStartLine;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_PULL_REQUEST_REVIEW_ID = "pull_request_review_id";
  @SerializedName(SERIALIZED_NAME_PULL_REQUEST_REVIEW_ID)
  private Integer pullRequestReviewId;

  public static final String SERIALIZED_NAME_PULL_REQUEST_URL = "pull_request_url";
  @SerializedName(SERIALIZED_NAME_PULL_REQUEST_URL)
  private URI pullRequestUrl;

  public static final String SERIALIZED_NAME_REACTIONS = "reactions";
  @SerializedName(SERIALIZED_NAME_REACTIONS)
  private Reactions reactions;

  /**
   * The side of the first line of the range for a multi-line comment.
   */
  @JsonAdapter(SideEnum.Adapter.class)
  public enum SideEnum {
    LEFT("LEFT"),
    
    RIGHT("RIGHT");

    private String value;

    SideEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SideEnum fromValue(String value) {
      for (SideEnum b : SideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SideEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SideEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SIDE = "side";
  @SerializedName(SERIALIZED_NAME_SIDE)
  private SideEnum side;

  public static final String SERIALIZED_NAME_START_LINE = "start_line";
  @SerializedName(SERIALIZED_NAME_START_LINE)
  private Integer startLine;

  /**
   * The side of the first line of the range for a multi-line comment.
   */
  @JsonAdapter(StartSideEnum.Adapter.class)
  public enum StartSideEnum {
    LEFT("LEFT"),
    
    RIGHT("RIGHT"),
    
    NULL("null");

    private String value;

    StartSideEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StartSideEnum fromValue(String value) {
      for (StartSideEnum b : StartSideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StartSideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StartSideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StartSideEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StartSideEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_START_SIDE = "start_side";
  @SerializedName(SERIALIZED_NAME_START_SIDE)
  private StartSideEnum startSide = StartSideEnum.RIGHT;

  /**
   * The level at which the comment is targeted, can be a diff line or a file.
   */
  @JsonAdapter(SubjectTypeEnum.Adapter.class)
  public enum SubjectTypeEnum {
    LINE("line"),
    
    FILE("file");

    private String value;

    SubjectTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubjectTypeEnum fromValue(String value) {
      for (SubjectTypeEnum b : SubjectTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubjectTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubjectTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubjectTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubjectTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBJECT_TYPE = "subject_type";
  @SerializedName(SERIALIZED_NAME_SUBJECT_TYPE)
  private SubjectTypeEnum subjectType;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User1 user;

  public PullRequestReviewComment2() {
  }

  public PullRequestReviewComment2 links(PullRequestReviewCommentLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nonnull

  public PullRequestReviewCommentLinks getLinks() {
    return links;
  }


  public void setLinks(PullRequestReviewCommentLinks links) {
    this.links = links;
  }


  public PullRequestReviewComment2 authorAssociation(AuthorAssociationEnum authorAssociation) {
    
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


  public PullRequestReviewComment2 body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * The text of the comment.
   * @return body
  **/
  @javax.annotation.Nonnull

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public PullRequestReviewComment2 commitId(String commitId) {
    
    this.commitId = commitId;
    return this;
  }

   /**
   * The SHA of the commit to which the comment applies.
   * @return commitId
  **/
  @javax.annotation.Nonnull

  public String getCommitId() {
    return commitId;
  }


  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }


  public PullRequestReviewComment2 createdAt(OffsetDateTime createdAt) {
    
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


  public PullRequestReviewComment2 diffHunk(String diffHunk) {
    
    this.diffHunk = diffHunk;
    return this;
  }

   /**
   * The diff of the line that the comment refers to.
   * @return diffHunk
  **/
  @javax.annotation.Nonnull

  public String getDiffHunk() {
    return diffHunk;
  }


  public void setDiffHunk(String diffHunk) {
    this.diffHunk = diffHunk;
  }


  public PullRequestReviewComment2 htmlUrl(URI htmlUrl) {
    
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * HTML URL for the pull request review comment.
   * @return htmlUrl
  **/
  @javax.annotation.Nonnull

  public URI getHtmlUrl() {
    return htmlUrl;
  }


  public void setHtmlUrl(URI htmlUrl) {
    this.htmlUrl = htmlUrl;
  }


  public PullRequestReviewComment2 id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the pull request review comment.
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public PullRequestReviewComment2 inReplyToId(Integer inReplyToId) {
    
    this.inReplyToId = inReplyToId;
    return this;
  }

   /**
   * The comment ID to reply to.
   * @return inReplyToId
  **/
  @javax.annotation.Nullable

  public Integer getInReplyToId() {
    return inReplyToId;
  }


  public void setInReplyToId(Integer inReplyToId) {
    this.inReplyToId = inReplyToId;
  }


  public PullRequestReviewComment2 line(Integer line) {
    
    this.line = line;
    return this;
  }

   /**
   * The line of the blob to which the comment applies. The last line of the range for a multi-line comment
   * @return line
  **/
  @javax.annotation.Nullable

  public Integer getLine() {
    return line;
  }


  public void setLine(Integer line) {
    this.line = line;
  }


  public PullRequestReviewComment2 nodeId(String nodeId) {
    
    this.nodeId = nodeId;
    return this;
  }

   /**
   * The node ID of the pull request review comment.
   * @return nodeId
  **/
  @javax.annotation.Nonnull

  public String getNodeId() {
    return nodeId;
  }


  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }


  public PullRequestReviewComment2 originalCommitId(String originalCommitId) {
    
    this.originalCommitId = originalCommitId;
    return this;
  }

   /**
   * The SHA of the original commit to which the comment applies.
   * @return originalCommitId
  **/
  @javax.annotation.Nonnull

  public String getOriginalCommitId() {
    return originalCommitId;
  }


  public void setOriginalCommitId(String originalCommitId) {
    this.originalCommitId = originalCommitId;
  }


  public PullRequestReviewComment2 originalLine(Integer originalLine) {
    
    this.originalLine = originalLine;
    return this;
  }

   /**
   * The line of the blob to which the comment applies. The last line of the range for a multi-line comment
   * @return originalLine
  **/
  @javax.annotation.Nullable

  public Integer getOriginalLine() {
    return originalLine;
  }


  public void setOriginalLine(Integer originalLine) {
    this.originalLine = originalLine;
  }


  public PullRequestReviewComment2 originalPosition(Integer originalPosition) {
    
    this.originalPosition = originalPosition;
    return this;
  }

   /**
   * The index of the original line in the diff to which the comment applies.
   * @return originalPosition
  **/
  @javax.annotation.Nonnull

  public Integer getOriginalPosition() {
    return originalPosition;
  }


  public void setOriginalPosition(Integer originalPosition) {
    this.originalPosition = originalPosition;
  }


  public PullRequestReviewComment2 originalStartLine(Integer originalStartLine) {
    
    this.originalStartLine = originalStartLine;
    return this;
  }

   /**
   * The first line of the range for a multi-line comment.
   * @return originalStartLine
  **/
  @javax.annotation.Nullable

  public Integer getOriginalStartLine() {
    return originalStartLine;
  }


  public void setOriginalStartLine(Integer originalStartLine) {
    this.originalStartLine = originalStartLine;
  }


  public PullRequestReviewComment2 path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The relative path of the file to which the comment applies.
   * @return path
  **/
  @javax.annotation.Nonnull

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public PullRequestReviewComment2 position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * The line index in the diff to which the comment applies.
   * @return position
  **/
  @javax.annotation.Nullable

  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public PullRequestReviewComment2 pullRequestReviewId(Integer pullRequestReviewId) {
    
    this.pullRequestReviewId = pullRequestReviewId;
    return this;
  }

   /**
   * The ID of the pull request review to which the comment belongs.
   * @return pullRequestReviewId
  **/
  @javax.annotation.Nullable

  public Integer getPullRequestReviewId() {
    return pullRequestReviewId;
  }


  public void setPullRequestReviewId(Integer pullRequestReviewId) {
    this.pullRequestReviewId = pullRequestReviewId;
  }


  public PullRequestReviewComment2 pullRequestUrl(URI pullRequestUrl) {
    
    this.pullRequestUrl = pullRequestUrl;
    return this;
  }

   /**
   * URL for the pull request that the review comment belongs to.
   * @return pullRequestUrl
  **/
  @javax.annotation.Nonnull

  public URI getPullRequestUrl() {
    return pullRequestUrl;
  }


  public void setPullRequestUrl(URI pullRequestUrl) {
    this.pullRequestUrl = pullRequestUrl;
  }


  public PullRequestReviewComment2 reactions(Reactions reactions) {
    
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


  public PullRequestReviewComment2 side(SideEnum side) {
    
    this.side = side;
    return this;
  }

   /**
   * The side of the first line of the range for a multi-line comment.
   * @return side
  **/
  @javax.annotation.Nonnull

  public SideEnum getSide() {
    return side;
  }


  public void setSide(SideEnum side) {
    this.side = side;
  }


  public PullRequestReviewComment2 startLine(Integer startLine) {
    
    this.startLine = startLine;
    return this;
  }

   /**
   * The first line of the range for a multi-line comment.
   * @return startLine
  **/
  @javax.annotation.Nullable

  public Integer getStartLine() {
    return startLine;
  }


  public void setStartLine(Integer startLine) {
    this.startLine = startLine;
  }


  public PullRequestReviewComment2 startSide(StartSideEnum startSide) {
    
    this.startSide = startSide;
    return this;
  }

   /**
   * The side of the first line of the range for a multi-line comment.
   * @return startSide
  **/
  @javax.annotation.Nullable

  public StartSideEnum getStartSide() {
    return startSide;
  }


  public void setStartSide(StartSideEnum startSide) {
    this.startSide = startSide;
  }


  public PullRequestReviewComment2 subjectType(SubjectTypeEnum subjectType) {
    
    this.subjectType = subjectType;
    return this;
  }

   /**
   * The level at which the comment is targeted, can be a diff line or a file.
   * @return subjectType
  **/
  @javax.annotation.Nullable

  public SubjectTypeEnum getSubjectType() {
    return subjectType;
  }


  public void setSubjectType(SubjectTypeEnum subjectType) {
    this.subjectType = subjectType;
  }


  public PullRequestReviewComment2 updatedAt(OffsetDateTime updatedAt) {
    
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


  public PullRequestReviewComment2 url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL for the pull request review comment
   * @return url
  **/
  @javax.annotation.Nonnull

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public PullRequestReviewComment2 user(User1 user) {
    
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
    PullRequestReviewComment2 pullRequestReviewComment2 = (PullRequestReviewComment2) o;
    return Objects.equals(this.links, pullRequestReviewComment2.links) &&
        Objects.equals(this.authorAssociation, pullRequestReviewComment2.authorAssociation) &&
        Objects.equals(this.body, pullRequestReviewComment2.body) &&
        Objects.equals(this.commitId, pullRequestReviewComment2.commitId) &&
        Objects.equals(this.createdAt, pullRequestReviewComment2.createdAt) &&
        Objects.equals(this.diffHunk, pullRequestReviewComment2.diffHunk) &&
        Objects.equals(this.htmlUrl, pullRequestReviewComment2.htmlUrl) &&
        Objects.equals(this.id, pullRequestReviewComment2.id) &&
        Objects.equals(this.inReplyToId, pullRequestReviewComment2.inReplyToId) &&
        Objects.equals(this.line, pullRequestReviewComment2.line) &&
        Objects.equals(this.nodeId, pullRequestReviewComment2.nodeId) &&
        Objects.equals(this.originalCommitId, pullRequestReviewComment2.originalCommitId) &&
        Objects.equals(this.originalLine, pullRequestReviewComment2.originalLine) &&
        Objects.equals(this.originalPosition, pullRequestReviewComment2.originalPosition) &&
        Objects.equals(this.originalStartLine, pullRequestReviewComment2.originalStartLine) &&
        Objects.equals(this.path, pullRequestReviewComment2.path) &&
        Objects.equals(this.position, pullRequestReviewComment2.position) &&
        Objects.equals(this.pullRequestReviewId, pullRequestReviewComment2.pullRequestReviewId) &&
        Objects.equals(this.pullRequestUrl, pullRequestReviewComment2.pullRequestUrl) &&
        Objects.equals(this.reactions, pullRequestReviewComment2.reactions) &&
        Objects.equals(this.side, pullRequestReviewComment2.side) &&
        Objects.equals(this.startLine, pullRequestReviewComment2.startLine) &&
        Objects.equals(this.startSide, pullRequestReviewComment2.startSide) &&
        Objects.equals(this.subjectType, pullRequestReviewComment2.subjectType) &&
        Objects.equals(this.updatedAt, pullRequestReviewComment2.updatedAt) &&
        Objects.equals(this.url, pullRequestReviewComment2.url) &&
        Objects.equals(this.user, pullRequestReviewComment2.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, authorAssociation, body, commitId, createdAt, diffHunk, htmlUrl, id, inReplyToId, line, nodeId, originalCommitId, originalLine, originalPosition, originalStartLine, path, position, pullRequestReviewId, pullRequestUrl, reactions, side, startLine, startSide, subjectType, updatedAt, url, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullRequestReviewComment2 {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    authorAssociation: ").append(toIndentedString(authorAssociation)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    diffHunk: ").append(toIndentedString(diffHunk)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inReplyToId: ").append(toIndentedString(inReplyToId)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    originalCommitId: ").append(toIndentedString(originalCommitId)).append("\n");
    sb.append("    originalLine: ").append(toIndentedString(originalLine)).append("\n");
    sb.append("    originalPosition: ").append(toIndentedString(originalPosition)).append("\n");
    sb.append("    originalStartLine: ").append(toIndentedString(originalStartLine)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    pullRequestReviewId: ").append(toIndentedString(pullRequestReviewId)).append("\n");
    sb.append("    pullRequestUrl: ").append(toIndentedString(pullRequestUrl)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
    sb.append("    startSide: ").append(toIndentedString(startSide)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
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
    openapiFields.add("_links");
    openapiFields.add("author_association");
    openapiFields.add("body");
    openapiFields.add("commit_id");
    openapiFields.add("created_at");
    openapiFields.add("diff_hunk");
    openapiFields.add("html_url");
    openapiFields.add("id");
    openapiFields.add("in_reply_to_id");
    openapiFields.add("line");
    openapiFields.add("node_id");
    openapiFields.add("original_commit_id");
    openapiFields.add("original_line");
    openapiFields.add("original_position");
    openapiFields.add("original_start_line");
    openapiFields.add("path");
    openapiFields.add("position");
    openapiFields.add("pull_request_review_id");
    openapiFields.add("pull_request_url");
    openapiFields.add("reactions");
    openapiFields.add("side");
    openapiFields.add("start_line");
    openapiFields.add("start_side");
    openapiFields.add("subject_type");
    openapiFields.add("updated_at");
    openapiFields.add("url");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("_links");
    openapiRequiredFields.add("author_association");
    openapiRequiredFields.add("body");
    openapiRequiredFields.add("commit_id");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("diff_hunk");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("line");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("original_commit_id");
    openapiRequiredFields.add("original_line");
    openapiRequiredFields.add("original_position");
    openapiRequiredFields.add("original_start_line");
    openapiRequiredFields.add("path");
    openapiRequiredFields.add("position");
    openapiRequiredFields.add("pull_request_review_id");
    openapiRequiredFields.add("pull_request_url");
    openapiRequiredFields.add("reactions");
    openapiRequiredFields.add("side");
    openapiRequiredFields.add("start_line");
    openapiRequiredFields.add("start_side");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PullRequestReviewComment2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PullRequestReviewComment2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PullRequestReviewComment2 is not found in the empty JSON string", PullRequestReviewComment2.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PullRequestReviewComment2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PullRequestReviewComment2` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PullRequestReviewComment2.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `_links`
      PullRequestReviewCommentLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
      if (!jsonObj.get("author_association").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_association` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_association").toString()));
      }
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if (!jsonObj.get("commit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_id").toString()));
      }
      if (!jsonObj.get("diff_hunk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `diff_hunk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("diff_hunk").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if (!jsonObj.get("original_commit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_commit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_commit_id").toString()));
      }
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if (!jsonObj.get("pull_request_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pull_request_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pull_request_url").toString()));
      }
      // validate the required field `reactions`
      Reactions.validateJsonObject(jsonObj.getAsJsonObject("reactions"));
      if (!jsonObj.get("side").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `side` to be a primitive type in the JSON string but got `%s`", jsonObj.get("side").toString()));
      }
      if (!jsonObj.get("start_side").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_side` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_side").toString()));
      }
      if ((jsonObj.get("subject_type") != null && !jsonObj.get("subject_type").isJsonNull()) && !jsonObj.get("subject_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject_type").toString()));
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
       if (!PullRequestReviewComment2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PullRequestReviewComment2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PullRequestReviewComment2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PullRequestReviewComment2.class));

       return (TypeAdapter<T>) new TypeAdapter<PullRequestReviewComment2>() {
           @Override
           public void write(JsonWriter out, PullRequestReviewComment2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PullRequestReviewComment2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PullRequestReviewComment2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PullRequestReviewComment2
  * @throws IOException if the JSON string is invalid with respect to PullRequestReviewComment2
  */
  public static PullRequestReviewComment2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PullRequestReviewComment2.class);
  }

 /**
  * Convert an instance of PullRequestReviewComment2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

