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
import org.openapitools.client.model.AuthorAssociation;
import org.openapitools.client.model.NullableSimpleUser;
import org.openapitools.client.model.ReactionRollup;
import org.openapitools.client.model.ReviewCommentLinks;
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
 * Legacy Review Comment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ReviewComment {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_PULL_REQUEST_REVIEW_ID = "pull_request_review_id";
  @SerializedName(SERIALIZED_NAME_PULL_REQUEST_REVIEW_ID)
  private Integer pullRequestReviewId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_DIFF_HUNK = "diff_hunk";
  @SerializedName(SERIALIZED_NAME_DIFF_HUNK)
  private String diffHunk;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_ORIGINAL_POSITION = "original_position";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_POSITION)
  private Integer originalPosition;

  public static final String SERIALIZED_NAME_COMMIT_ID = "commit_id";
  @SerializedName(SERIALIZED_NAME_COMMIT_ID)
  private String commitId;

  public static final String SERIALIZED_NAME_ORIGINAL_COMMIT_ID = "original_commit_id";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_COMMIT_ID)
  private String originalCommitId;

  public static final String SERIALIZED_NAME_IN_REPLY_TO_ID = "in_reply_to_id";
  @SerializedName(SERIALIZED_NAME_IN_REPLY_TO_ID)
  private Integer inReplyToId;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private NullableSimpleUser user;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_PULL_REQUEST_URL = "pull_request_url";
  @SerializedName(SERIALIZED_NAME_PULL_REQUEST_URL)
  private URI pullRequestUrl;

  public static final String SERIALIZED_NAME_AUTHOR_ASSOCIATION = "author_association";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ASSOCIATION)
  private AuthorAssociation authorAssociation;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ReviewCommentLinks links;

  public static final String SERIALIZED_NAME_BODY_TEXT = "body_text";
  @SerializedName(SERIALIZED_NAME_BODY_TEXT)
  private String bodyText;

  public static final String SERIALIZED_NAME_BODY_HTML = "body_html";
  @SerializedName(SERIALIZED_NAME_BODY_HTML)
  private String bodyHtml;

  public static final String SERIALIZED_NAME_REACTIONS = "reactions";
  @SerializedName(SERIALIZED_NAME_REACTIONS)
  private ReactionRollup reactions;

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
  private SideEnum side = SideEnum.RIGHT;

  /**
   * The side of the first line of the range for a multi-line comment.
   */
  @JsonAdapter(StartSideEnum.Adapter.class)
  public enum StartSideEnum {
    LEFT("LEFT"),
    
    RIGHT("RIGHT");

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

  public static final String SERIALIZED_NAME_LINE = "line";
  @SerializedName(SERIALIZED_NAME_LINE)
  private Integer line;

  public static final String SERIALIZED_NAME_ORIGINAL_LINE = "original_line";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_LINE)
  private Integer originalLine;

  public static final String SERIALIZED_NAME_START_LINE = "start_line";
  @SerializedName(SERIALIZED_NAME_START_LINE)
  private Integer startLine;

  public static final String SERIALIZED_NAME_ORIGINAL_START_LINE = "original_start_line";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_START_LINE)
  private Integer originalStartLine;

  public ReviewComment() {
  }

  public ReviewComment url(URI url) {
    
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


  public ReviewComment pullRequestReviewId(Integer pullRequestReviewId) {
    
    this.pullRequestReviewId = pullRequestReviewId;
    return this;
  }

   /**
   * Get pullRequestReviewId
   * @return pullRequestReviewId
  **/
  @javax.annotation.Nullable

  public Integer getPullRequestReviewId() {
    return pullRequestReviewId;
  }


  public void setPullRequestReviewId(Integer pullRequestReviewId) {
    this.pullRequestReviewId = pullRequestReviewId;
  }


  public ReviewComment id(Integer id) {
    
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


  public ReviewComment nodeId(String nodeId) {
    
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


  public ReviewComment diffHunk(String diffHunk) {
    
    this.diffHunk = diffHunk;
    return this;
  }

   /**
   * Get diffHunk
   * @return diffHunk
  **/
  @javax.annotation.Nonnull

  public String getDiffHunk() {
    return diffHunk;
  }


  public void setDiffHunk(String diffHunk) {
    this.diffHunk = diffHunk;
  }


  public ReviewComment path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nonnull

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ReviewComment position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable

  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public ReviewComment originalPosition(Integer originalPosition) {
    
    this.originalPosition = originalPosition;
    return this;
  }

   /**
   * Get originalPosition
   * @return originalPosition
  **/
  @javax.annotation.Nonnull

  public Integer getOriginalPosition() {
    return originalPosition;
  }


  public void setOriginalPosition(Integer originalPosition) {
    this.originalPosition = originalPosition;
  }


  public ReviewComment commitId(String commitId) {
    
    this.commitId = commitId;
    return this;
  }

   /**
   * Get commitId
   * @return commitId
  **/
  @javax.annotation.Nonnull

  public String getCommitId() {
    return commitId;
  }


  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }


  public ReviewComment originalCommitId(String originalCommitId) {
    
    this.originalCommitId = originalCommitId;
    return this;
  }

   /**
   * Get originalCommitId
   * @return originalCommitId
  **/
  @javax.annotation.Nonnull

  public String getOriginalCommitId() {
    return originalCommitId;
  }


  public void setOriginalCommitId(String originalCommitId) {
    this.originalCommitId = originalCommitId;
  }


  public ReviewComment inReplyToId(Integer inReplyToId) {
    
    this.inReplyToId = inReplyToId;
    return this;
  }

   /**
   * Get inReplyToId
   * @return inReplyToId
  **/
  @javax.annotation.Nullable

  public Integer getInReplyToId() {
    return inReplyToId;
  }


  public void setInReplyToId(Integer inReplyToId) {
    this.inReplyToId = inReplyToId;
  }


  public ReviewComment user(NullableSimpleUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable

  public NullableSimpleUser getUser() {
    return user;
  }


  public void setUser(NullableSimpleUser user) {
    this.user = user;
  }


  public ReviewComment body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nonnull

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public ReviewComment createdAt(OffsetDateTime createdAt) {
    
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


  public ReviewComment updatedAt(OffsetDateTime updatedAt) {
    
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


  public ReviewComment htmlUrl(URI htmlUrl) {
    
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


  public ReviewComment pullRequestUrl(URI pullRequestUrl) {
    
    this.pullRequestUrl = pullRequestUrl;
    return this;
  }

   /**
   * Get pullRequestUrl
   * @return pullRequestUrl
  **/
  @javax.annotation.Nonnull

  public URI getPullRequestUrl() {
    return pullRequestUrl;
  }


  public void setPullRequestUrl(URI pullRequestUrl) {
    this.pullRequestUrl = pullRequestUrl;
  }


  public ReviewComment authorAssociation(AuthorAssociation authorAssociation) {
    
    this.authorAssociation = authorAssociation;
    return this;
  }

   /**
   * Get authorAssociation
   * @return authorAssociation
  **/
  @javax.annotation.Nonnull

  public AuthorAssociation getAuthorAssociation() {
    return authorAssociation;
  }


  public void setAuthorAssociation(AuthorAssociation authorAssociation) {
    this.authorAssociation = authorAssociation;
  }


  public ReviewComment links(ReviewCommentLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nonnull

  public ReviewCommentLinks getLinks() {
    return links;
  }


  public void setLinks(ReviewCommentLinks links) {
    this.links = links;
  }


  public ReviewComment bodyText(String bodyText) {
    
    this.bodyText = bodyText;
    return this;
  }

   /**
   * Get bodyText
   * @return bodyText
  **/
  @javax.annotation.Nullable

  public String getBodyText() {
    return bodyText;
  }


  public void setBodyText(String bodyText) {
    this.bodyText = bodyText;
  }


  public ReviewComment bodyHtml(String bodyHtml) {
    
    this.bodyHtml = bodyHtml;
    return this;
  }

   /**
   * Get bodyHtml
   * @return bodyHtml
  **/
  @javax.annotation.Nullable

  public String getBodyHtml() {
    return bodyHtml;
  }


  public void setBodyHtml(String bodyHtml) {
    this.bodyHtml = bodyHtml;
  }


  public ReviewComment reactions(ReactionRollup reactions) {
    
    this.reactions = reactions;
    return this;
  }

   /**
   * Get reactions
   * @return reactions
  **/
  @javax.annotation.Nullable

  public ReactionRollup getReactions() {
    return reactions;
  }


  public void setReactions(ReactionRollup reactions) {
    this.reactions = reactions;
  }


  public ReviewComment side(SideEnum side) {
    
    this.side = side;
    return this;
  }

   /**
   * The side of the first line of the range for a multi-line comment.
   * @return side
  **/
  @javax.annotation.Nullable

  public SideEnum getSide() {
    return side;
  }


  public void setSide(SideEnum side) {
    this.side = side;
  }


  public ReviewComment startSide(StartSideEnum startSide) {
    
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


  public ReviewComment line(Integer line) {
    
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


  public ReviewComment originalLine(Integer originalLine) {
    
    this.originalLine = originalLine;
    return this;
  }

   /**
   * The original line of the blob to which the comment applies. The last line of the range for a multi-line comment
   * @return originalLine
  **/
  @javax.annotation.Nullable

  public Integer getOriginalLine() {
    return originalLine;
  }


  public void setOriginalLine(Integer originalLine) {
    this.originalLine = originalLine;
  }


  public ReviewComment startLine(Integer startLine) {
    
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


  public ReviewComment originalStartLine(Integer originalStartLine) {
    
    this.originalStartLine = originalStartLine;
    return this;
  }

   /**
   * The original first line of the range for a multi-line comment.
   * @return originalStartLine
  **/
  @javax.annotation.Nullable

  public Integer getOriginalStartLine() {
    return originalStartLine;
  }


  public void setOriginalStartLine(Integer originalStartLine) {
    this.originalStartLine = originalStartLine;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewComment reviewComment = (ReviewComment) o;
    return Objects.equals(this.url, reviewComment.url) &&
        Objects.equals(this.pullRequestReviewId, reviewComment.pullRequestReviewId) &&
        Objects.equals(this.id, reviewComment.id) &&
        Objects.equals(this.nodeId, reviewComment.nodeId) &&
        Objects.equals(this.diffHunk, reviewComment.diffHunk) &&
        Objects.equals(this.path, reviewComment.path) &&
        Objects.equals(this.position, reviewComment.position) &&
        Objects.equals(this.originalPosition, reviewComment.originalPosition) &&
        Objects.equals(this.commitId, reviewComment.commitId) &&
        Objects.equals(this.originalCommitId, reviewComment.originalCommitId) &&
        Objects.equals(this.inReplyToId, reviewComment.inReplyToId) &&
        Objects.equals(this.user, reviewComment.user) &&
        Objects.equals(this.body, reviewComment.body) &&
        Objects.equals(this.createdAt, reviewComment.createdAt) &&
        Objects.equals(this.updatedAt, reviewComment.updatedAt) &&
        Objects.equals(this.htmlUrl, reviewComment.htmlUrl) &&
        Objects.equals(this.pullRequestUrl, reviewComment.pullRequestUrl) &&
        Objects.equals(this.authorAssociation, reviewComment.authorAssociation) &&
        Objects.equals(this.links, reviewComment.links) &&
        Objects.equals(this.bodyText, reviewComment.bodyText) &&
        Objects.equals(this.bodyHtml, reviewComment.bodyHtml) &&
        Objects.equals(this.reactions, reviewComment.reactions) &&
        Objects.equals(this.side, reviewComment.side) &&
        Objects.equals(this.startSide, reviewComment.startSide) &&
        Objects.equals(this.line, reviewComment.line) &&
        Objects.equals(this.originalLine, reviewComment.originalLine) &&
        Objects.equals(this.startLine, reviewComment.startLine) &&
        Objects.equals(this.originalStartLine, reviewComment.originalStartLine);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, pullRequestReviewId, id, nodeId, diffHunk, path, position, originalPosition, commitId, originalCommitId, inReplyToId, user, body, createdAt, updatedAt, htmlUrl, pullRequestUrl, authorAssociation, links, bodyText, bodyHtml, reactions, side, startSide, line, originalLine, startLine, originalStartLine);
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
    sb.append("class ReviewComment {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    pullRequestReviewId: ").append(toIndentedString(pullRequestReviewId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    diffHunk: ").append(toIndentedString(diffHunk)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    originalPosition: ").append(toIndentedString(originalPosition)).append("\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
    sb.append("    originalCommitId: ").append(toIndentedString(originalCommitId)).append("\n");
    sb.append("    inReplyToId: ").append(toIndentedString(inReplyToId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    pullRequestUrl: ").append(toIndentedString(pullRequestUrl)).append("\n");
    sb.append("    authorAssociation: ").append(toIndentedString(authorAssociation)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
    sb.append("    bodyHtml: ").append(toIndentedString(bodyHtml)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    startSide: ").append(toIndentedString(startSide)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    originalLine: ").append(toIndentedString(originalLine)).append("\n");
    sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
    sb.append("    originalStartLine: ").append(toIndentedString(originalStartLine)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("pull_request_review_id");
    openapiFields.add("id");
    openapiFields.add("node_id");
    openapiFields.add("diff_hunk");
    openapiFields.add("path");
    openapiFields.add("position");
    openapiFields.add("original_position");
    openapiFields.add("commit_id");
    openapiFields.add("original_commit_id");
    openapiFields.add("in_reply_to_id");
    openapiFields.add("user");
    openapiFields.add("body");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("html_url");
    openapiFields.add("pull_request_url");
    openapiFields.add("author_association");
    openapiFields.add("_links");
    openapiFields.add("body_text");
    openapiFields.add("body_html");
    openapiFields.add("reactions");
    openapiFields.add("side");
    openapiFields.add("start_side");
    openapiFields.add("line");
    openapiFields.add("original_line");
    openapiFields.add("start_line");
    openapiFields.add("original_start_line");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("pull_request_review_id");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("diff_hunk");
    openapiRequiredFields.add("path");
    openapiRequiredFields.add("position");
    openapiRequiredFields.add("original_position");
    openapiRequiredFields.add("commit_id");
    openapiRequiredFields.add("original_commit_id");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("body");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("pull_request_url");
    openapiRequiredFields.add("author_association");
    openapiRequiredFields.add("_links");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReviewComment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReviewComment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReviewComment is not found in the empty JSON string", ReviewComment.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReviewComment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReviewComment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReviewComment.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if (!jsonObj.get("diff_hunk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `diff_hunk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("diff_hunk").toString()));
      }
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if (!jsonObj.get("commit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_id").toString()));
      }
      if (!jsonObj.get("original_commit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_commit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_commit_id").toString()));
      }
      // validate the required field `user`
      NullableSimpleUser.validateJsonObject(jsonObj.getAsJsonObject("user"));
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (!jsonObj.get("pull_request_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pull_request_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pull_request_url").toString()));
      }
      // validate the required field `_links`
      ReviewCommentLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
      if ((jsonObj.get("body_text") != null && !jsonObj.get("body_text").isJsonNull()) && !jsonObj.get("body_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body_text").toString()));
      }
      if ((jsonObj.get("body_html") != null && !jsonObj.get("body_html").isJsonNull()) && !jsonObj.get("body_html").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body_html` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body_html").toString()));
      }
      // validate the optional field `reactions`
      if (jsonObj.get("reactions") != null && !jsonObj.get("reactions").isJsonNull()) {
        ReactionRollup.validateJsonObject(jsonObj.getAsJsonObject("reactions"));
      }
      if ((jsonObj.get("side") != null && !jsonObj.get("side").isJsonNull()) && !jsonObj.get("side").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `side` to be a primitive type in the JSON string but got `%s`", jsonObj.get("side").toString()));
      }
      if ((jsonObj.get("start_side") != null && !jsonObj.get("start_side").isJsonNull()) && !jsonObj.get("start_side").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_side` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_side").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReviewComment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReviewComment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReviewComment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReviewComment.class));

       return (TypeAdapter<T>) new TypeAdapter<ReviewComment>() {
           @Override
           public void write(JsonWriter out, ReviewComment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReviewComment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReviewComment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReviewComment
  * @throws IOException if the JSON string is invalid with respect to ReviewComment
  */
  public static ReviewComment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReviewComment.class);
  }

 /**
  * Convert an instance of ReviewComment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

