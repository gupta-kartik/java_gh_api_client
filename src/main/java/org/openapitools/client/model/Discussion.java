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
import org.openapitools.client.model.DiscussionCategory;
import org.openapitools.client.model.Reactions;
import org.openapitools.client.model.User;

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
 * Discussion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class Discussion {
  public static final String SERIALIZED_NAME_ACTIVE_LOCK_REASON = "active_lock_reason";
  @SerializedName(SERIALIZED_NAME_ACTIVE_LOCK_REASON)
  private String activeLockReason;

  public static final String SERIALIZED_NAME_ANSWER_CHOSEN_AT = "answer_chosen_at";
  @SerializedName(SERIALIZED_NAME_ANSWER_CHOSEN_AT)
  private String answerChosenAt;

  public static final String SERIALIZED_NAME_ANSWER_CHOSEN_BY = "answer_chosen_by";
  @SerializedName(SERIALIZED_NAME_ANSWER_CHOSEN_BY)
  private User answerChosenBy;

  public static final String SERIALIZED_NAME_ANSWER_HTML_URL = "answer_html_url";
  @SerializedName(SERIALIZED_NAME_ANSWER_HTML_URL)
  private String answerHtmlUrl;

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

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private DiscussionCategory category;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private Integer comments;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private String htmlUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_REACTIONS = "reactions";
  @SerializedName(SERIALIZED_NAME_REACTIONS)
  private Reactions reactions;

  public static final String SERIALIZED_NAME_REPOSITORY_URL = "repository_url";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_URL)
  private String repositoryUrl;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    OPEN("open"),
    
    LOCKED("locked"),
    
    CONVERTING("converting"),
    
    TRANSFERRING("transferring");

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

  public static final String SERIALIZED_NAME_TIMELINE_URL = "timeline_url";
  @SerializedName(SERIALIZED_NAME_TIMELINE_URL)
  private String timelineUrl;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;

  public Discussion() {
  }

  public Discussion activeLockReason(String activeLockReason) {
    
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


  public Discussion answerChosenAt(String answerChosenAt) {
    
    this.answerChosenAt = answerChosenAt;
    return this;
  }

   /**
   * Get answerChosenAt
   * @return answerChosenAt
  **/
  @javax.annotation.Nullable

  public String getAnswerChosenAt() {
    return answerChosenAt;
  }


  public void setAnswerChosenAt(String answerChosenAt) {
    this.answerChosenAt = answerChosenAt;
  }


  public Discussion answerChosenBy(User answerChosenBy) {
    
    this.answerChosenBy = answerChosenBy;
    return this;
  }

   /**
   * Get answerChosenBy
   * @return answerChosenBy
  **/
  @javax.annotation.Nullable

  public User getAnswerChosenBy() {
    return answerChosenBy;
  }


  public void setAnswerChosenBy(User answerChosenBy) {
    this.answerChosenBy = answerChosenBy;
  }


  public Discussion answerHtmlUrl(String answerHtmlUrl) {
    
    this.answerHtmlUrl = answerHtmlUrl;
    return this;
  }

   /**
   * Get answerHtmlUrl
   * @return answerHtmlUrl
  **/
  @javax.annotation.Nullable

  public String getAnswerHtmlUrl() {
    return answerHtmlUrl;
  }


  public void setAnswerHtmlUrl(String answerHtmlUrl) {
    this.answerHtmlUrl = answerHtmlUrl;
  }


  public Discussion authorAssociation(AuthorAssociationEnum authorAssociation) {
    
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


  public Discussion body(String body) {
    
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


  public Discussion category(DiscussionCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nonnull

  public DiscussionCategory getCategory() {
    return category;
  }


  public void setCategory(DiscussionCategory category) {
    this.category = category;
  }


  public Discussion comments(Integer comments) {
    
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


  public Discussion createdAt(OffsetDateTime createdAt) {
    
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


  public Discussion htmlUrl(String htmlUrl) {
    
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


  public Discussion id(Integer id) {
    
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


  public Discussion locked(Boolean locked) {
    
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


  public Discussion nodeId(String nodeId) {
    
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


  public Discussion number(Integer number) {
    
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


  public Discussion reactions(Reactions reactions) {
    
    this.reactions = reactions;
    return this;
  }

   /**
   * Get reactions
   * @return reactions
  **/
  @javax.annotation.Nullable

  public Reactions getReactions() {
    return reactions;
  }


  public void setReactions(Reactions reactions) {
    this.reactions = reactions;
  }


  public Discussion repositoryUrl(String repositoryUrl) {
    
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


  public Discussion state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public Discussion timelineUrl(String timelineUrl) {
    
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


  public Discussion title(String title) {
    
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


  public Discussion updatedAt(OffsetDateTime updatedAt) {
    
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


  public Discussion user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
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
    Discussion discussion = (Discussion) o;
    return Objects.equals(this.activeLockReason, discussion.activeLockReason) &&
        Objects.equals(this.answerChosenAt, discussion.answerChosenAt) &&
        Objects.equals(this.answerChosenBy, discussion.answerChosenBy) &&
        Objects.equals(this.answerHtmlUrl, discussion.answerHtmlUrl) &&
        Objects.equals(this.authorAssociation, discussion.authorAssociation) &&
        Objects.equals(this.body, discussion.body) &&
        Objects.equals(this.category, discussion.category) &&
        Objects.equals(this.comments, discussion.comments) &&
        Objects.equals(this.createdAt, discussion.createdAt) &&
        Objects.equals(this.htmlUrl, discussion.htmlUrl) &&
        Objects.equals(this.id, discussion.id) &&
        Objects.equals(this.locked, discussion.locked) &&
        Objects.equals(this.nodeId, discussion.nodeId) &&
        Objects.equals(this.number, discussion.number) &&
        Objects.equals(this.reactions, discussion.reactions) &&
        Objects.equals(this.repositoryUrl, discussion.repositoryUrl) &&
        Objects.equals(this.state, discussion.state) &&
        Objects.equals(this.timelineUrl, discussion.timelineUrl) &&
        Objects.equals(this.title, discussion.title) &&
        Objects.equals(this.updatedAt, discussion.updatedAt) &&
        Objects.equals(this.user, discussion.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeLockReason, answerChosenAt, answerChosenBy, answerHtmlUrl, authorAssociation, body, category, comments, createdAt, htmlUrl, id, locked, nodeId, number, reactions, repositoryUrl, state, timelineUrl, title, updatedAt, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Discussion {\n");
    sb.append("    activeLockReason: ").append(toIndentedString(activeLockReason)).append("\n");
    sb.append("    answerChosenAt: ").append(toIndentedString(answerChosenAt)).append("\n");
    sb.append("    answerChosenBy: ").append(toIndentedString(answerChosenBy)).append("\n");
    sb.append("    answerHtmlUrl: ").append(toIndentedString(answerHtmlUrl)).append("\n");
    sb.append("    authorAssociation: ").append(toIndentedString(authorAssociation)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timelineUrl: ").append(toIndentedString(timelineUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("answer_chosen_at");
    openapiFields.add("answer_chosen_by");
    openapiFields.add("answer_html_url");
    openapiFields.add("author_association");
    openapiFields.add("body");
    openapiFields.add("category");
    openapiFields.add("comments");
    openapiFields.add("created_at");
    openapiFields.add("html_url");
    openapiFields.add("id");
    openapiFields.add("locked");
    openapiFields.add("node_id");
    openapiFields.add("number");
    openapiFields.add("reactions");
    openapiFields.add("repository_url");
    openapiFields.add("state");
    openapiFields.add("timeline_url");
    openapiFields.add("title");
    openapiFields.add("updated_at");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("active_lock_reason");
    openapiRequiredFields.add("answer_chosen_at");
    openapiRequiredFields.add("answer_chosen_by");
    openapiRequiredFields.add("answer_html_url");
    openapiRequiredFields.add("author_association");
    openapiRequiredFields.add("body");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("comments");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("locked");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("repository_url");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Discussion
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Discussion.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Discussion is not found in the empty JSON string", Discussion.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Discussion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Discussion` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Discussion.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("active_lock_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `active_lock_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("active_lock_reason").toString()));
      }
      if (!jsonObj.get("answer_chosen_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `answer_chosen_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("answer_chosen_at").toString()));
      }
      // validate the required field `answer_chosen_by`
      User.validateJsonObject(jsonObj.getAsJsonObject("answer_chosen_by"));
      if (!jsonObj.get("answer_html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `answer_html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("answer_html_url").toString()));
      }
      if (!jsonObj.get("author_association").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_association` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_association").toString()));
      }
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      // validate the required field `category`
      DiscussionCategory.validateJsonObject(jsonObj.getAsJsonObject("category"));
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      // validate the optional field `reactions`
      if (jsonObj.get("reactions") != null && !jsonObj.get("reactions").isJsonNull()) {
        Reactions.validateJsonObject(jsonObj.getAsJsonObject("reactions"));
      }
      if (!jsonObj.get("repository_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repository_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repository_url").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("timeline_url") != null && !jsonObj.get("timeline_url").isJsonNull()) && !jsonObj.get("timeline_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeline_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeline_url").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the required field `user`
      User.validateJsonObject(jsonObj.getAsJsonObject("user"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Discussion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Discussion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Discussion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Discussion.class));

       return (TypeAdapter<T>) new TypeAdapter<Discussion>() {
           @Override
           public void write(JsonWriter out, Discussion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Discussion read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Discussion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Discussion
  * @throws IOException if the JSON string is invalid with respect to Discussion
  */
  public static Discussion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Discussion.class);
  }

 /**
  * Convert an instance of Discussion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

