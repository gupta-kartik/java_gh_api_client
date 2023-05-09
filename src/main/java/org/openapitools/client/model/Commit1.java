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
import org.openapitools.client.model.Committer;

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
 * Commit1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class Commit1 {
  public static final String SERIALIZED_NAME_ADDED = "added";
  @SerializedName(SERIALIZED_NAME_ADDED)
  private List<String> added;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private Committer author;

  public static final String SERIALIZED_NAME_COMMITTER = "committer";
  @SerializedName(SERIALIZED_NAME_COMMITTER)
  private Committer committer;

  public static final String SERIALIZED_NAME_DISTINCT = "distinct";
  @SerializedName(SERIALIZED_NAME_DISTINCT)
  private Boolean distinct;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private List<String> modified;

  public static final String SERIALIZED_NAME_REMOVED = "removed";
  @SerializedName(SERIALIZED_NAME_REMOVED)
  private List<String> removed;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_TREE_ID = "tree_id";
  @SerializedName(SERIALIZED_NAME_TREE_ID)
  private String treeId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public Commit1() {
  }

  public Commit1 added(List<String> added) {
    
    this.added = added;
    return this;
  }

  public Commit1 addAddedItem(String addedItem) {
    if (this.added == null) {
      this.added = new ArrayList<>();
    }
    this.added.add(addedItem);
    return this;
  }

   /**
   * An array of files added in the commit.
   * @return added
  **/
  @javax.annotation.Nullable

  public List<String> getAdded() {
    return added;
  }


  public void setAdded(List<String> added) {
    this.added = added;
  }


  public Commit1 author(Committer author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nonnull

  public Committer getAuthor() {
    return author;
  }


  public void setAuthor(Committer author) {
    this.author = author;
  }


  public Commit1 committer(Committer committer) {
    
    this.committer = committer;
    return this;
  }

   /**
   * Get committer
   * @return committer
  **/
  @javax.annotation.Nonnull

  public Committer getCommitter() {
    return committer;
  }


  public void setCommitter(Committer committer) {
    this.committer = committer;
  }


  public Commit1 distinct(Boolean distinct) {
    
    this.distinct = distinct;
    return this;
  }

   /**
   * Whether this commit is distinct from any that have been pushed before.
   * @return distinct
  **/
  @javax.annotation.Nonnull

  public Boolean getDistinct() {
    return distinct;
  }


  public void setDistinct(Boolean distinct) {
    this.distinct = distinct;
  }


  public Commit1 id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Commit1 message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * The commit message.
   * @return message
  **/
  @javax.annotation.Nonnull

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public Commit1 modified(List<String> modified) {
    
    this.modified = modified;
    return this;
  }

  public Commit1 addModifiedItem(String modifiedItem) {
    if (this.modified == null) {
      this.modified = new ArrayList<>();
    }
    this.modified.add(modifiedItem);
    return this;
  }

   /**
   * An array of files modified by the commit.
   * @return modified
  **/
  @javax.annotation.Nullable

  public List<String> getModified() {
    return modified;
  }


  public void setModified(List<String> modified) {
    this.modified = modified;
  }


  public Commit1 removed(List<String> removed) {
    
    this.removed = removed;
    return this;
  }

  public Commit1 addRemovedItem(String removedItem) {
    if (this.removed == null) {
      this.removed = new ArrayList<>();
    }
    this.removed.add(removedItem);
    return this;
  }

   /**
   * An array of files removed in the commit.
   * @return removed
  **/
  @javax.annotation.Nullable

  public List<String> getRemoved() {
    return removed;
  }


  public void setRemoved(List<String> removed) {
    this.removed = removed;
  }


  public Commit1 timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The ISO 8601 timestamp of the commit.
   * @return timestamp
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public Commit1 treeId(String treeId) {
    
    this.treeId = treeId;
    return this;
  }

   /**
   * Get treeId
   * @return treeId
  **/
  @javax.annotation.Nonnull

  public String getTreeId() {
    return treeId;
  }


  public void setTreeId(String treeId) {
    this.treeId = treeId;
  }


  public Commit1 url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL that points to the commit API resource.
   * @return url
  **/
  @javax.annotation.Nonnull

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Commit1 commit1 = (Commit1) o;
    return Objects.equals(this.added, commit1.added) &&
        Objects.equals(this.author, commit1.author) &&
        Objects.equals(this.committer, commit1.committer) &&
        Objects.equals(this.distinct, commit1.distinct) &&
        Objects.equals(this.id, commit1.id) &&
        Objects.equals(this.message, commit1.message) &&
        Objects.equals(this.modified, commit1.modified) &&
        Objects.equals(this.removed, commit1.removed) &&
        Objects.equals(this.timestamp, commit1.timestamp) &&
        Objects.equals(this.treeId, commit1.treeId) &&
        Objects.equals(this.url, commit1.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(added, author, committer, distinct, id, message, modified, removed, timestamp, treeId, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Commit1 {\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    distinct: ").append(toIndentedString(distinct)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    treeId: ").append(toIndentedString(treeId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("added");
    openapiFields.add("author");
    openapiFields.add("committer");
    openapiFields.add("distinct");
    openapiFields.add("id");
    openapiFields.add("message");
    openapiFields.add("modified");
    openapiFields.add("removed");
    openapiFields.add("timestamp");
    openapiFields.add("tree_id");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("author");
    openapiRequiredFields.add("committer");
    openapiRequiredFields.add("distinct");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("timestamp");
    openapiRequiredFields.add("tree_id");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Commit1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Commit1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Commit1 is not found in the empty JSON string", Commit1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Commit1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Commit1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Commit1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("added") != null && !jsonObj.get("added").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `added` to be an array in the JSON string but got `%s`", jsonObj.get("added").toString()));
      }
      // validate the required field `author`
      Committer.validateJsonObject(jsonObj.getAsJsonObject("author"));
      // validate the required field `committer`
      Committer.validateJsonObject(jsonObj.getAsJsonObject("committer"));
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("modified") != null && !jsonObj.get("modified").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified` to be an array in the JSON string but got `%s`", jsonObj.get("modified").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("removed") != null && !jsonObj.get("removed").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `removed` to be an array in the JSON string but got `%s`", jsonObj.get("removed").toString()));
      }
      if (!jsonObj.get("tree_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tree_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tree_id").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Commit1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Commit1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Commit1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Commit1.class));

       return (TypeAdapter<T>) new TypeAdapter<Commit1>() {
           @Override
           public void write(JsonWriter out, Commit1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Commit1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Commit1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Commit1
  * @throws IOException if the JSON string is invalid with respect to Commit1
  */
  public static Commit1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Commit1.class);
  }

 /**
  * Convert an instance of Commit1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

