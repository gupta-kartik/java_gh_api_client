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
import org.openapitools.client.model.TimelineReviewedEventLinks;

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
 * Pull Request Reviews are reviews on pull requests.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class PullRequestReview {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private NullableSimpleUser user;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_PULL_REQUEST_URL = "pull_request_url";
  @SerializedName(SERIALIZED_NAME_PULL_REQUEST_URL)
  private URI pullRequestUrl;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private TimelineReviewedEventLinks links;

  public static final String SERIALIZED_NAME_SUBMITTED_AT = "submitted_at";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_AT)
  private OffsetDateTime submittedAt;

  public static final String SERIALIZED_NAME_COMMIT_ID = "commit_id";
  @SerializedName(SERIALIZED_NAME_COMMIT_ID)
  private String commitId;

  public static final String SERIALIZED_NAME_BODY_HTML = "body_html";
  @SerializedName(SERIALIZED_NAME_BODY_HTML)
  private String bodyHtml;

  public static final String SERIALIZED_NAME_BODY_TEXT = "body_text";
  @SerializedName(SERIALIZED_NAME_BODY_TEXT)
  private String bodyText;

  public static final String SERIALIZED_NAME_AUTHOR_ASSOCIATION = "author_association";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ASSOCIATION)
  private AuthorAssociation authorAssociation;

  public PullRequestReview() {
  }

  public PullRequestReview id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the review
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public PullRequestReview nodeId(String nodeId) {
    
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


  public PullRequestReview user(NullableSimpleUser user) {
    
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


  public PullRequestReview body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * The text of the review.
   * @return body
  **/
  @javax.annotation.Nonnull

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public PullRequestReview state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public PullRequestReview htmlUrl(URI htmlUrl) {
    
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


  public PullRequestReview pullRequestUrl(URI pullRequestUrl) {
    
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


  public PullRequestReview links(TimelineReviewedEventLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nonnull

  public TimelineReviewedEventLinks getLinks() {
    return links;
  }


  public void setLinks(TimelineReviewedEventLinks links) {
    this.links = links;
  }


  public PullRequestReview submittedAt(OffsetDateTime submittedAt) {
    
    this.submittedAt = submittedAt;
    return this;
  }

   /**
   * Get submittedAt
   * @return submittedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getSubmittedAt() {
    return submittedAt;
  }


  public void setSubmittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
  }


  public PullRequestReview commitId(String commitId) {
    
    this.commitId = commitId;
    return this;
  }

   /**
   * A commit SHA for the review. If the commit object was garbage collected or forcibly deleted, then it no longer exists in Git and this value will be &#x60;null&#x60;.
   * @return commitId
  **/
  @javax.annotation.Nullable

  public String getCommitId() {
    return commitId;
  }


  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }


  public PullRequestReview bodyHtml(String bodyHtml) {
    
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


  public PullRequestReview bodyText(String bodyText) {
    
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


  public PullRequestReview authorAssociation(AuthorAssociation authorAssociation) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PullRequestReview pullRequestReview = (PullRequestReview) o;
    return Objects.equals(this.id, pullRequestReview.id) &&
        Objects.equals(this.nodeId, pullRequestReview.nodeId) &&
        Objects.equals(this.user, pullRequestReview.user) &&
        Objects.equals(this.body, pullRequestReview.body) &&
        Objects.equals(this.state, pullRequestReview.state) &&
        Objects.equals(this.htmlUrl, pullRequestReview.htmlUrl) &&
        Objects.equals(this.pullRequestUrl, pullRequestReview.pullRequestUrl) &&
        Objects.equals(this.links, pullRequestReview.links) &&
        Objects.equals(this.submittedAt, pullRequestReview.submittedAt) &&
        Objects.equals(this.commitId, pullRequestReview.commitId) &&
        Objects.equals(this.bodyHtml, pullRequestReview.bodyHtml) &&
        Objects.equals(this.bodyText, pullRequestReview.bodyText) &&
        Objects.equals(this.authorAssociation, pullRequestReview.authorAssociation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nodeId, user, body, state, htmlUrl, pullRequestUrl, links, submittedAt, commitId, bodyHtml, bodyText, authorAssociation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullRequestReview {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    pullRequestUrl: ").append(toIndentedString(pullRequestUrl)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
    sb.append("    bodyHtml: ").append(toIndentedString(bodyHtml)).append("\n");
    sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
    sb.append("    authorAssociation: ").append(toIndentedString(authorAssociation)).append("\n");
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
    openapiFields.add("user");
    openapiFields.add("body");
    openapiFields.add("state");
    openapiFields.add("html_url");
    openapiFields.add("pull_request_url");
    openapiFields.add("_links");
    openapiFields.add("submitted_at");
    openapiFields.add("commit_id");
    openapiFields.add("body_html");
    openapiFields.add("body_text");
    openapiFields.add("author_association");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("body");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("pull_request_url");
    openapiRequiredFields.add("_links");
    openapiRequiredFields.add("commit_id");
    openapiRequiredFields.add("author_association");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PullRequestReview
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PullRequestReview.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PullRequestReview is not found in the empty JSON string", PullRequestReview.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PullRequestReview.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PullRequestReview` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PullRequestReview.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      // validate the required field `user`
      NullableSimpleUser.validateJsonObject(jsonObj.getAsJsonObject("user"));
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (!jsonObj.get("pull_request_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pull_request_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pull_request_url").toString()));
      }
      // validate the required field `_links`
      TimelineReviewedEventLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
      if (!jsonObj.get("commit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_id").toString()));
      }
      if ((jsonObj.get("body_html") != null && !jsonObj.get("body_html").isJsonNull()) && !jsonObj.get("body_html").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body_html` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body_html").toString()));
      }
      if ((jsonObj.get("body_text") != null && !jsonObj.get("body_text").isJsonNull()) && !jsonObj.get("body_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body_text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PullRequestReview.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PullRequestReview' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PullRequestReview> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PullRequestReview.class));

       return (TypeAdapter<T>) new TypeAdapter<PullRequestReview>() {
           @Override
           public void write(JsonWriter out, PullRequestReview value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PullRequestReview read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PullRequestReview given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PullRequestReview
  * @throws IOException if the JSON string is invalid with respect to PullRequestReview
  */
  public static PullRequestReview fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PullRequestReview.class);
  }

 /**
  * Convert an instance of PullRequestReview to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
