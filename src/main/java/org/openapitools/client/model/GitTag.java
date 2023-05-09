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
import org.openapitools.client.model.GitTagObject;
import org.openapitools.client.model.GitTagTagger;
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
 * Metadata for a Git tag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class GitTag {
  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_SHA = "sha";
  @SerializedName(SERIALIZED_NAME_SHA)
  private String sha;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_TAGGER = "tagger";
  @SerializedName(SERIALIZED_NAME_TAGGER)
  private GitTagTagger tagger;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private GitTagObject _object;

  public static final String SERIALIZED_NAME_VERIFICATION = "verification";
  @SerializedName(SERIALIZED_NAME_VERIFICATION)
  private Verification verification;

  public GitTag() {
  }

  public GitTag nodeId(String nodeId) {
    
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


  public GitTag tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Name of the tag
   * @return tag
  **/
  @javax.annotation.Nonnull

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public GitTag sha(String sha) {
    
    this.sha = sha;
    return this;
  }

   /**
   * Get sha
   * @return sha
  **/
  @javax.annotation.Nonnull

  public String getSha() {
    return sha;
  }


  public void setSha(String sha) {
    this.sha = sha;
  }


  public GitTag url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL for the tag
   * @return url
  **/
  @javax.annotation.Nonnull

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public GitTag message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message describing the purpose of the tag
   * @return message
  **/
  @javax.annotation.Nonnull

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public GitTag tagger(GitTagTagger tagger) {
    
    this.tagger = tagger;
    return this;
  }

   /**
   * Get tagger
   * @return tagger
  **/
  @javax.annotation.Nonnull

  public GitTagTagger getTagger() {
    return tagger;
  }


  public void setTagger(GitTagTagger tagger) {
    this.tagger = tagger;
  }


  public GitTag _object(GitTagObject _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nonnull

  public GitTagObject getObject() {
    return _object;
  }


  public void setObject(GitTagObject _object) {
    this._object = _object;
  }


  public GitTag verification(Verification verification) {
    
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
    GitTag gitTag = (GitTag) o;
    return Objects.equals(this.nodeId, gitTag.nodeId) &&
        Objects.equals(this.tag, gitTag.tag) &&
        Objects.equals(this.sha, gitTag.sha) &&
        Objects.equals(this.url, gitTag.url) &&
        Objects.equals(this.message, gitTag.message) &&
        Objects.equals(this.tagger, gitTag.tagger) &&
        Objects.equals(this._object, gitTag._object) &&
        Objects.equals(this.verification, gitTag.verification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, tag, sha, url, message, tagger, _object, verification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitTag {\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    tagger: ").append(toIndentedString(tagger)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
    openapiFields.add("node_id");
    openapiFields.add("tag");
    openapiFields.add("sha");
    openapiFields.add("url");
    openapiFields.add("message");
    openapiFields.add("tagger");
    openapiFields.add("object");
    openapiFields.add("verification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("tag");
    openapiRequiredFields.add("sha");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("tagger");
    openapiRequiredFields.add("object");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GitTag
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GitTag.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GitTag is not found in the empty JSON string", GitTag.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GitTag.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GitTag` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GitTag.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if (!jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if (!jsonObj.get("sha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the required field `tagger`
      GitTagTagger.validateJsonObject(jsonObj.getAsJsonObject("tagger"));
      // validate the required field `object`
      GitTagObject.validateJsonObject(jsonObj.getAsJsonObject("object"));
      // validate the optional field `verification`
      if (jsonObj.get("verification") != null && !jsonObj.get("verification").isJsonNull()) {
        Verification.validateJsonObject(jsonObj.getAsJsonObject("verification"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GitTag.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GitTag' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GitTag> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GitTag.class));

       return (TypeAdapter<T>) new TypeAdapter<GitTag>() {
           @Override
           public void write(JsonWriter out, GitTag value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GitTag read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GitTag given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GitTag
  * @throws IOException if the JSON string is invalid with respect to GitTag
  */
  public static GitTag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GitTag.class);
  }

 /**
  * Convert an instance of GitTag to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
