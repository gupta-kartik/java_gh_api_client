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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.GitCommitAuthor;
import org.openapitools.client.model.GitCommitParentsInner;
import org.openapitools.client.model.GitCommitTree;
import org.openapitools.client.model.GitCommitVerification;

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
 * Timeline Committed Event
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class TimelineCommittedEvent {
  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private String event;

  public static final String SERIALIZED_NAME_SHA = "sha";
  @SerializedName(SERIALIZED_NAME_SHA)
  private String sha;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private GitCommitAuthor author;

  public static final String SERIALIZED_NAME_COMMITTER = "committer";
  @SerializedName(SERIALIZED_NAME_COMMITTER)
  private GitCommitAuthor committer;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_TREE = "tree";
  @SerializedName(SERIALIZED_NAME_TREE)
  private GitCommitTree tree;

  public static final String SERIALIZED_NAME_PARENTS = "parents";
  @SerializedName(SERIALIZED_NAME_PARENTS)
  private List<GitCommitParentsInner> parents = new ArrayList<>();

  public static final String SERIALIZED_NAME_VERIFICATION = "verification";
  @SerializedName(SERIALIZED_NAME_VERIFICATION)
  private GitCommitVerification verification;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public TimelineCommittedEvent() {
  }

  public TimelineCommittedEvent event(String event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nullable

  public String getEvent() {
    return event;
  }


  public void setEvent(String event) {
    this.event = event;
  }


  public TimelineCommittedEvent sha(String sha) {
    
    this.sha = sha;
    return this;
  }

   /**
   * SHA for the commit
   * @return sha
  **/
  @javax.annotation.Nonnull

  public String getSha() {
    return sha;
  }


  public void setSha(String sha) {
    this.sha = sha;
  }


  public TimelineCommittedEvent nodeId(String nodeId) {
    
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


  public TimelineCommittedEvent url(URI url) {
    
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


  public TimelineCommittedEvent author(GitCommitAuthor author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nonnull

  public GitCommitAuthor getAuthor() {
    return author;
  }


  public void setAuthor(GitCommitAuthor author) {
    this.author = author;
  }


  public TimelineCommittedEvent committer(GitCommitAuthor committer) {
    
    this.committer = committer;
    return this;
  }

   /**
   * Get committer
   * @return committer
  **/
  @javax.annotation.Nonnull

  public GitCommitAuthor getCommitter() {
    return committer;
  }


  public void setCommitter(GitCommitAuthor committer) {
    this.committer = committer;
  }


  public TimelineCommittedEvent message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message describing the purpose of the commit
   * @return message
  **/
  @javax.annotation.Nonnull

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public TimelineCommittedEvent tree(GitCommitTree tree) {
    
    this.tree = tree;
    return this;
  }

   /**
   * Get tree
   * @return tree
  **/
  @javax.annotation.Nonnull

  public GitCommitTree getTree() {
    return tree;
  }


  public void setTree(GitCommitTree tree) {
    this.tree = tree;
  }


  public TimelineCommittedEvent parents(List<GitCommitParentsInner> parents) {
    
    this.parents = parents;
    return this;
  }

  public TimelineCommittedEvent addParentsItem(GitCommitParentsInner parentsItem) {
    if (this.parents == null) {
      this.parents = new ArrayList<>();
    }
    this.parents.add(parentsItem);
    return this;
  }

   /**
   * Get parents
   * @return parents
  **/
  @javax.annotation.Nonnull

  public List<GitCommitParentsInner> getParents() {
    return parents;
  }


  public void setParents(List<GitCommitParentsInner> parents) {
    this.parents = parents;
  }


  public TimelineCommittedEvent verification(GitCommitVerification verification) {
    
    this.verification = verification;
    return this;
  }

   /**
   * Get verification
   * @return verification
  **/
  @javax.annotation.Nonnull

  public GitCommitVerification getVerification() {
    return verification;
  }


  public void setVerification(GitCommitVerification verification) {
    this.verification = verification;
  }


  public TimelineCommittedEvent htmlUrl(URI htmlUrl) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineCommittedEvent timelineCommittedEvent = (TimelineCommittedEvent) o;
    return Objects.equals(this.event, timelineCommittedEvent.event) &&
        Objects.equals(this.sha, timelineCommittedEvent.sha) &&
        Objects.equals(this.nodeId, timelineCommittedEvent.nodeId) &&
        Objects.equals(this.url, timelineCommittedEvent.url) &&
        Objects.equals(this.author, timelineCommittedEvent.author) &&
        Objects.equals(this.committer, timelineCommittedEvent.committer) &&
        Objects.equals(this.message, timelineCommittedEvent.message) &&
        Objects.equals(this.tree, timelineCommittedEvent.tree) &&
        Objects.equals(this.parents, timelineCommittedEvent.parents) &&
        Objects.equals(this.verification, timelineCommittedEvent.verification) &&
        Objects.equals(this.htmlUrl, timelineCommittedEvent.htmlUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, sha, nodeId, url, author, committer, message, tree, parents, verification, htmlUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimelineCommittedEvent {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
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
    openapiFields.add("event");
    openapiFields.add("sha");
    openapiFields.add("node_id");
    openapiFields.add("url");
    openapiFields.add("author");
    openapiFields.add("committer");
    openapiFields.add("message");
    openapiFields.add("tree");
    openapiFields.add("parents");
    openapiFields.add("verification");
    openapiFields.add("html_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sha");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("author");
    openapiRequiredFields.add("committer");
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("tree");
    openapiRequiredFields.add("parents");
    openapiRequiredFields.add("verification");
    openapiRequiredFields.add("html_url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimelineCommittedEvent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TimelineCommittedEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimelineCommittedEvent is not found in the empty JSON string", TimelineCommittedEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TimelineCommittedEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimelineCommittedEvent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TimelineCommittedEvent.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("event") != null && !jsonObj.get("event").isJsonNull()) && !jsonObj.get("event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event").toString()));
      }
      if (!jsonObj.get("sha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the required field `author`
      GitCommitAuthor.validateJsonObject(jsonObj.getAsJsonObject("author"));
      // validate the required field `committer`
      GitCommitAuthor.validateJsonObject(jsonObj.getAsJsonObject("committer"));
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the required field `tree`
      GitCommitTree.validateJsonObject(jsonObj.getAsJsonObject("tree"));
      // ensure the json data is an array
      if (!jsonObj.get("parents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `parents` to be an array in the JSON string but got `%s`", jsonObj.get("parents").toString()));
      }

      JsonArray jsonArrayparents = jsonObj.getAsJsonArray("parents");
      // validate the required field `parents` (array)
      for (int i = 0; i < jsonArrayparents.size(); i++) {
        GitCommitParentsInner.validateJsonObject(jsonArrayparents.get(i).getAsJsonObject());
      };
      // validate the required field `verification`
      GitCommitVerification.validateJsonObject(jsonObj.getAsJsonObject("verification"));
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimelineCommittedEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimelineCommittedEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimelineCommittedEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimelineCommittedEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<TimelineCommittedEvent>() {
           @Override
           public void write(JsonWriter out, TimelineCommittedEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimelineCommittedEvent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TimelineCommittedEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimelineCommittedEvent
  * @throws IOException if the JSON string is invalid with respect to TimelineCommittedEvent
  */
  public static TimelineCommittedEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimelineCommittedEvent.class);
  }

 /**
  * Convert an instance of TimelineCommittedEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

