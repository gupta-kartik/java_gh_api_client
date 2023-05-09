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
import org.openapitools.client.model.DeploymentWorkflowRunHeadRepositoryOwner;
import org.openapitools.client.model.Reactions;

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
 * WebhookReleasePublishedRelease
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookReleasePublishedRelease {
  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private List<Object> assets = new ArrayList<>();

  public static final String SERIALIZED_NAME_ASSETS_URL = "assets_url";
  @SerializedName(SERIALIZED_NAME_ASSETS_URL)
  private String assetsUrl;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private DeploymentWorkflowRunHeadRepositoryOwner author;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DISCUSSION_URL = "discussion_url";
  @SerializedName(SERIALIZED_NAME_DISCUSSION_URL)
  private URI discussionUrl;

  public static final String SERIALIZED_NAME_DRAFT = "draft";
  @SerializedName(SERIALIZED_NAME_DRAFT)
  private Boolean draft;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private String htmlUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_PRERELEASE = "prerelease";
  @SerializedName(SERIALIZED_NAME_PRERELEASE)
  private Boolean prerelease;

  public static final String SERIALIZED_NAME_PUBLISHED_AT = "published_at";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_AT)
  private OffsetDateTime publishedAt;

  public static final String SERIALIZED_NAME_REACTIONS = "reactions";
  @SerializedName(SERIALIZED_NAME_REACTIONS)
  private Reactions reactions;

  public static final String SERIALIZED_NAME_TAG_NAME = "tag_name";
  @SerializedName(SERIALIZED_NAME_TAG_NAME)
  private String tagName;

  public static final String SERIALIZED_NAME_TARBALL_URL = "tarball_url";
  @SerializedName(SERIALIZED_NAME_TARBALL_URL)
  private String tarballUrl;

  public static final String SERIALIZED_NAME_TARGET_COMMITISH = "target_commitish";
  @SerializedName(SERIALIZED_NAME_TARGET_COMMITISH)
  private String targetCommitish;

  public static final String SERIALIZED_NAME_UPLOAD_URL = "upload_url";
  @SerializedName(SERIALIZED_NAME_UPLOAD_URL)
  private String uploadUrl;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_ZIPBALL_URL = "zipball_url";
  @SerializedName(SERIALIZED_NAME_ZIPBALL_URL)
  private String zipballUrl;

  public WebhookReleasePublishedRelease() {
  }

  public WebhookReleasePublishedRelease assets(List<Object> assets) {
    
    this.assets = assets;
    return this;
  }

  public WebhookReleasePublishedRelease addAssetsItem(Object assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<>();
    }
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @javax.annotation.Nonnull

  public List<Object> getAssets() {
    return assets;
  }


  public void setAssets(List<Object> assets) {
    this.assets = assets;
  }


  public WebhookReleasePublishedRelease assetsUrl(String assetsUrl) {
    
    this.assetsUrl = assetsUrl;
    return this;
  }

   /**
   * Get assetsUrl
   * @return assetsUrl
  **/
  @javax.annotation.Nonnull

  public String getAssetsUrl() {
    return assetsUrl;
  }


  public void setAssetsUrl(String assetsUrl) {
    this.assetsUrl = assetsUrl;
  }


  public WebhookReleasePublishedRelease author(DeploymentWorkflowRunHeadRepositoryOwner author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nonnull

  public DeploymentWorkflowRunHeadRepositoryOwner getAuthor() {
    return author;
  }


  public void setAuthor(DeploymentWorkflowRunHeadRepositoryOwner author) {
    this.author = author;
  }


  public WebhookReleasePublishedRelease body(String body) {
    
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


  public WebhookReleasePublishedRelease createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookReleasePublishedRelease discussionUrl(URI discussionUrl) {
    
    this.discussionUrl = discussionUrl;
    return this;
  }

   /**
   * Get discussionUrl
   * @return discussionUrl
  **/
  @javax.annotation.Nullable

  public URI getDiscussionUrl() {
    return discussionUrl;
  }


  public void setDiscussionUrl(URI discussionUrl) {
    this.discussionUrl = discussionUrl;
  }


  public WebhookReleasePublishedRelease draft(Boolean draft) {
    
    this.draft = draft;
    return this;
  }

   /**
   * Get draft
   * @return draft
  **/
  @javax.annotation.Nonnull

  public Boolean getDraft() {
    return draft;
  }


  public void setDraft(Boolean draft) {
    this.draft = draft;
  }


  public WebhookReleasePublishedRelease htmlUrl(String htmlUrl) {
    
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


  public WebhookReleasePublishedRelease id(Integer id) {
    
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


  public WebhookReleasePublishedRelease name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WebhookReleasePublishedRelease nodeId(String nodeId) {
    
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


  public WebhookReleasePublishedRelease prerelease(Boolean prerelease) {
    
    this.prerelease = prerelease;
    return this;
  }

   /**
   * Get prerelease
   * @return prerelease
  **/
  @javax.annotation.Nonnull

  public Boolean getPrerelease() {
    return prerelease;
  }


  public void setPrerelease(Boolean prerelease) {
    this.prerelease = prerelease;
  }


  public WebhookReleasePublishedRelease publishedAt(OffsetDateTime publishedAt) {
    
    this.publishedAt = publishedAt;
    return this;
  }

   /**
   * Get publishedAt
   * @return publishedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }


  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }


  public WebhookReleasePublishedRelease reactions(Reactions reactions) {
    
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


  public WebhookReleasePublishedRelease tagName(String tagName) {
    
    this.tagName = tagName;
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @javax.annotation.Nonnull

  public String getTagName() {
    return tagName;
  }


  public void setTagName(String tagName) {
    this.tagName = tagName;
  }


  public WebhookReleasePublishedRelease tarballUrl(String tarballUrl) {
    
    this.tarballUrl = tarballUrl;
    return this;
  }

   /**
   * Get tarballUrl
   * @return tarballUrl
  **/
  @javax.annotation.Nullable

  public String getTarballUrl() {
    return tarballUrl;
  }


  public void setTarballUrl(String tarballUrl) {
    this.tarballUrl = tarballUrl;
  }


  public WebhookReleasePublishedRelease targetCommitish(String targetCommitish) {
    
    this.targetCommitish = targetCommitish;
    return this;
  }

   /**
   * Get targetCommitish
   * @return targetCommitish
  **/
  @javax.annotation.Nonnull

  public String getTargetCommitish() {
    return targetCommitish;
  }


  public void setTargetCommitish(String targetCommitish) {
    this.targetCommitish = targetCommitish;
  }


  public WebhookReleasePublishedRelease uploadUrl(String uploadUrl) {
    
    this.uploadUrl = uploadUrl;
    return this;
  }

   /**
   * Get uploadUrl
   * @return uploadUrl
  **/
  @javax.annotation.Nonnull

  public String getUploadUrl() {
    return uploadUrl;
  }


  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }


  public WebhookReleasePublishedRelease url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public WebhookReleasePublishedRelease zipballUrl(String zipballUrl) {
    
    this.zipballUrl = zipballUrl;
    return this;
  }

   /**
   * Get zipballUrl
   * @return zipballUrl
  **/
  @javax.annotation.Nullable

  public String getZipballUrl() {
    return zipballUrl;
  }


  public void setZipballUrl(String zipballUrl) {
    this.zipballUrl = zipballUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookReleasePublishedRelease webhookReleasePublishedRelease = (WebhookReleasePublishedRelease) o;
    return Objects.equals(this.assets, webhookReleasePublishedRelease.assets) &&
        Objects.equals(this.assetsUrl, webhookReleasePublishedRelease.assetsUrl) &&
        Objects.equals(this.author, webhookReleasePublishedRelease.author) &&
        Objects.equals(this.body, webhookReleasePublishedRelease.body) &&
        Objects.equals(this.createdAt, webhookReleasePublishedRelease.createdAt) &&
        Objects.equals(this.discussionUrl, webhookReleasePublishedRelease.discussionUrl) &&
        Objects.equals(this.draft, webhookReleasePublishedRelease.draft) &&
        Objects.equals(this.htmlUrl, webhookReleasePublishedRelease.htmlUrl) &&
        Objects.equals(this.id, webhookReleasePublishedRelease.id) &&
        Objects.equals(this.name, webhookReleasePublishedRelease.name) &&
        Objects.equals(this.nodeId, webhookReleasePublishedRelease.nodeId) &&
        Objects.equals(this.prerelease, webhookReleasePublishedRelease.prerelease) &&
        Objects.equals(this.publishedAt, webhookReleasePublishedRelease.publishedAt) &&
        Objects.equals(this.reactions, webhookReleasePublishedRelease.reactions) &&
        Objects.equals(this.tagName, webhookReleasePublishedRelease.tagName) &&
        Objects.equals(this.tarballUrl, webhookReleasePublishedRelease.tarballUrl) &&
        Objects.equals(this.targetCommitish, webhookReleasePublishedRelease.targetCommitish) &&
        Objects.equals(this.uploadUrl, webhookReleasePublishedRelease.uploadUrl) &&
        Objects.equals(this.url, webhookReleasePublishedRelease.url) &&
        Objects.equals(this.zipballUrl, webhookReleasePublishedRelease.zipballUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, assetsUrl, author, body, createdAt, discussionUrl, draft, htmlUrl, id, name, nodeId, prerelease, publishedAt, reactions, tagName, tarballUrl, targetCommitish, uploadUrl, url, zipballUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookReleasePublishedRelease {\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    assetsUrl: ").append(toIndentedString(assetsUrl)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    discussionUrl: ").append(toIndentedString(discussionUrl)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    prerelease: ").append(toIndentedString(prerelease)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    tarballUrl: ").append(toIndentedString(tarballUrl)).append("\n");
    sb.append("    targetCommitish: ").append(toIndentedString(targetCommitish)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    zipballUrl: ").append(toIndentedString(zipballUrl)).append("\n");
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
    openapiFields.add("assets");
    openapiFields.add("assets_url");
    openapiFields.add("author");
    openapiFields.add("body");
    openapiFields.add("created_at");
    openapiFields.add("discussion_url");
    openapiFields.add("draft");
    openapiFields.add("html_url");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("node_id");
    openapiFields.add("prerelease");
    openapiFields.add("published_at");
    openapiFields.add("reactions");
    openapiFields.add("tag_name");
    openapiFields.add("tarball_url");
    openapiFields.add("target_commitish");
    openapiFields.add("upload_url");
    openapiFields.add("url");
    openapiFields.add("zipball_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("assets");
    openapiRequiredFields.add("assets_url");
    openapiRequiredFields.add("author");
    openapiRequiredFields.add("body");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("draft");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("prerelease");
    openapiRequiredFields.add("published_at");
    openapiRequiredFields.add("tag_name");
    openapiRequiredFields.add("tarball_url");
    openapiRequiredFields.add("target_commitish");
    openapiRequiredFields.add("upload_url");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("zipball_url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookReleasePublishedRelease
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookReleasePublishedRelease.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookReleasePublishedRelease is not found in the empty JSON string", WebhookReleasePublishedRelease.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookReleasePublishedRelease.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookReleasePublishedRelease` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookReleasePublishedRelease.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("assets") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("assets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `assets` to be an array in the JSON string but got `%s`", jsonObj.get("assets").toString()));
      }
      if (!jsonObj.get("assets_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assets_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assets_url").toString()));
      }
      // validate the required field `author`
      DeploymentWorkflowRunHeadRepositoryOwner.validateJsonObject(jsonObj.getAsJsonObject("author"));
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("discussion_url") != null && !jsonObj.get("discussion_url").isJsonNull()) && !jsonObj.get("discussion_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discussion_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discussion_url").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      // validate the optional field `reactions`
      if (jsonObj.get("reactions") != null && !jsonObj.get("reactions").isJsonNull()) {
        Reactions.validateJsonObject(jsonObj.getAsJsonObject("reactions"));
      }
      if (!jsonObj.get("tag_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_name").toString()));
      }
      if (!jsonObj.get("tarball_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tarball_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tarball_url").toString()));
      }
      if (!jsonObj.get("target_commitish").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_commitish` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_commitish").toString()));
      }
      if (!jsonObj.get("upload_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upload_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upload_url").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("zipball_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipball_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipball_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookReleasePublishedRelease.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookReleasePublishedRelease' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookReleasePublishedRelease> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookReleasePublishedRelease.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookReleasePublishedRelease>() {
           @Override
           public void write(JsonWriter out, WebhookReleasePublishedRelease value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookReleasePublishedRelease read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookReleasePublishedRelease given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookReleasePublishedRelease
  * @throws IOException if the JSON string is invalid with respect to WebhookReleasePublishedRelease
  */
  public static WebhookReleasePublishedRelease fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookReleasePublishedRelease.class);
  }

 /**
  * Convert an instance of WebhookReleasePublishedRelease to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

