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
import org.openapitools.client.model.CommitCommitTree;
import org.openapitools.client.model.NullableGitUser;
import org.openapitools.client.model.Verification;

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
 * CommitCommit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class CommitCommit {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private NullableGitUser author;

  public static final String SERIALIZED_NAME_COMMITTER = "committer";
  @SerializedName(SERIALIZED_NAME_COMMITTER)
  private NullableGitUser committer;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_COMMENT_COUNT = "comment_count";
  @SerializedName(SERIALIZED_NAME_COMMENT_COUNT)
  private Integer commentCount;

  public static final String SERIALIZED_NAME_TREE = "tree";
  @SerializedName(SERIALIZED_NAME_TREE)
  private CommitCommitTree tree;

  public static final String SERIALIZED_NAME_VERIFICATION = "verification";
  @SerializedName(SERIALIZED_NAME_VERIFICATION)
  private Verification verification;

  public CommitCommit() {
  }

  public CommitCommit url(URI url) {
    
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


  public CommitCommit author(NullableGitUser author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable

  public NullableGitUser getAuthor() {
    return author;
  }


  public void setAuthor(NullableGitUser author) {
    this.author = author;
  }


  public CommitCommit committer(NullableGitUser committer) {
    
    this.committer = committer;
    return this;
  }

   /**
   * Get committer
   * @return committer
  **/
  @javax.annotation.Nullable

  public NullableGitUser getCommitter() {
    return committer;
  }


  public void setCommitter(NullableGitUser committer) {
    this.committer = committer;
  }


  public CommitCommit message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public CommitCommit commentCount(Integer commentCount) {
    
    this.commentCount = commentCount;
    return this;
  }

   /**
   * Get commentCount
   * @return commentCount
  **/
  @javax.annotation.Nonnull

  public Integer getCommentCount() {
    return commentCount;
  }


  public void setCommentCount(Integer commentCount) {
    this.commentCount = commentCount;
  }


  public CommitCommit tree(CommitCommitTree tree) {
    
    this.tree = tree;
    return this;
  }

   /**
   * Get tree
   * @return tree
  **/
  @javax.annotation.Nonnull

  public CommitCommitTree getTree() {
    return tree;
  }


  public void setTree(CommitCommitTree tree) {
    this.tree = tree;
  }


  public CommitCommit verification(Verification verification) {
    
    this.verification = verification;
    return this;
  }

   /**
   * Get verification
   * @return verification
  **/
  @javax.annotation.Nullable

  public Verification getVerification() {
    return verification;
  }


  public void setVerification(Verification verification) {
    this.verification = verification;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitCommit commitCommit = (CommitCommit) o;
    return Objects.equals(this.url, commitCommit.url) &&
        Objects.equals(this.author, commitCommit.author) &&
        Objects.equals(this.committer, commitCommit.committer) &&
        Objects.equals(this.message, commitCommit.message) &&
        Objects.equals(this.commentCount, commitCommit.commentCount) &&
        Objects.equals(this.tree, commitCommit.tree) &&
        Objects.equals(this.verification, commitCommit.verification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, author, committer, message, commentCount, tree, verification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitCommit {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
    sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
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
    openapiFields.add("author");
    openapiFields.add("committer");
    openapiFields.add("message");
    openapiFields.add("comment_count");
    openapiFields.add("tree");
    openapiFields.add("verification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("author");
    openapiRequiredFields.add("committer");
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("comment_count");
    openapiRequiredFields.add("tree");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommitCommit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CommitCommit.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommitCommit is not found in the empty JSON string", CommitCommit.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CommitCommit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommitCommit` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CommitCommit.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the required field `author`
      NullableGitUser.validateJsonObject(jsonObj.getAsJsonObject("author"));
      // validate the required field `committer`
      NullableGitUser.validateJsonObject(jsonObj.getAsJsonObject("committer"));
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the required field `tree`
      CommitCommitTree.validateJsonObject(jsonObj.getAsJsonObject("tree"));
      // validate the optional field `verification`
      if (jsonObj.get("verification") != null && !jsonObj.get("verification").isJsonNull()) {
        Verification.validateJsonObject(jsonObj.getAsJsonObject("verification"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommitCommit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommitCommit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommitCommit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommitCommit.class));

       return (TypeAdapter<T>) new TypeAdapter<CommitCommit>() {
           @Override
           public void write(JsonWriter out, CommitCommit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommitCommit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CommitCommit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommitCommit
  * @throws IOException if the JSON string is invalid with respect to CommitCommit
  */
  public static CommitCommit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommitCommit.class);
  }

 /**
  * Convert an instance of CommitCommit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
