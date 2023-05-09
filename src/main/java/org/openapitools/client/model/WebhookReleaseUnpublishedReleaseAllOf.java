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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.DeploymentWorkflowRunHeadRepositoryOwner;
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
 * WebhookReleaseUnpublishedReleaseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookReleaseUnpublishedReleaseAllOf {
  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private List<Object> assets;

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
  private String publishedAt;

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

  public WebhookReleaseUnpublishedReleaseAllOf() {
  }

  public WebhookReleaseUnpublishedReleaseAllOf assets(List<Object> assets) {
    
    this.assets = assets;
    return this;
  }

  public WebhookReleaseUnpublishedReleaseAllOf addAssetsItem(Object assetsItem) {
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
  @javax.annotation.Nullable

  public List<Object> getAssets() {
    return assets;
  }


  public void setAssets(List<Object> assets) {
    this.assets = assets;
  }


  public WebhookReleaseUnpublishedReleaseAllOf assetsUrl(String assetsUrl) {
    
    this.assetsUrl = assetsUrl;
    return this;
  }

   /**
   * Get assetsUrl
   * @return assetsUrl
  **/
  @javax.annotation.Nullable

  public String getAssetsUrl() {
    return assetsUrl;
  }


  public void setAssetsUrl(String assetsUrl) {
    this.assetsUrl = assetsUrl;
  }


  public WebhookReleaseUnpublishedReleaseAllOf author(DeploymentWorkflowRunHeadRepositoryOwner author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable

  public DeploymentWorkflowRunHeadRepositoryOwner getAuthor() {
    return author;
  }


  public void setAuthor(DeploymentWorkflowRunHeadRepositoryOwner author) {
    this.author = author;
  }


  public WebhookReleaseUnpublishedReleaseAllOf body(String body) {
    
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


  public WebhookReleaseUnpublishedReleaseAllOf createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookReleaseUnpublishedReleaseAllOf draft(Boolean draft) {
    
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


  public WebhookReleaseUnpublishedReleaseAllOf htmlUrl(String htmlUrl) {
    
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @javax.annotation.Nullable

  public String getHtmlUrl() {
    return htmlUrl;
  }


  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }


  public WebhookReleaseUnpublishedReleaseAllOf id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public WebhookReleaseUnpublishedReleaseAllOf name(String name) {
    
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


  public WebhookReleaseUnpublishedReleaseAllOf nodeId(String nodeId) {
    
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @javax.annotation.Nullable

  public String getNodeId() {
    return nodeId;
  }


  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }


  public WebhookReleaseUnpublishedReleaseAllOf prerelease(Boolean prerelease) {
    
    this.prerelease = prerelease;
    return this;
  }

   /**
   * Get prerelease
   * @return prerelease
  **/
  @javax.annotation.Nullable

  public Boolean getPrerelease() {
    return prerelease;
  }


  public void setPrerelease(Boolean prerelease) {
    this.prerelease = prerelease;
  }


  public WebhookReleaseUnpublishedReleaseAllOf publishedAt(String publishedAt) {
    
    this.publishedAt = publishedAt;
    return this;
  }

   /**
   * Get publishedAt
   * @return publishedAt
  **/
  @javax.annotation.Nullable

  public String getPublishedAt() {
    return publishedAt;
  }


  public void setPublishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
  }


  public WebhookReleaseUnpublishedReleaseAllOf tagName(String tagName) {
    
    this.tagName = tagName;
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @javax.annotation.Nullable

  public String getTagName() {
    return tagName;
  }


  public void setTagName(String tagName) {
    this.tagName = tagName;
  }


  public WebhookReleaseUnpublishedReleaseAllOf tarballUrl(String tarballUrl) {
    
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


  public WebhookReleaseUnpublishedReleaseAllOf targetCommitish(String targetCommitish) {
    
    this.targetCommitish = targetCommitish;
    return this;
  }

   /**
   * Get targetCommitish
   * @return targetCommitish
  **/
  @javax.annotation.Nullable

  public String getTargetCommitish() {
    return targetCommitish;
  }


  public void setTargetCommitish(String targetCommitish) {
    this.targetCommitish = targetCommitish;
  }


  public WebhookReleaseUnpublishedReleaseAllOf uploadUrl(String uploadUrl) {
    
    this.uploadUrl = uploadUrl;
    return this;
  }

   /**
   * Get uploadUrl
   * @return uploadUrl
  **/
  @javax.annotation.Nullable

  public String getUploadUrl() {
    return uploadUrl;
  }


  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }


  public WebhookReleaseUnpublishedReleaseAllOf url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public WebhookReleaseUnpublishedReleaseAllOf zipballUrl(String zipballUrl) {
    
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
    WebhookReleaseUnpublishedReleaseAllOf webhookReleaseUnpublishedReleaseAllOf = (WebhookReleaseUnpublishedReleaseAllOf) o;
    return Objects.equals(this.assets, webhookReleaseUnpublishedReleaseAllOf.assets) &&
        Objects.equals(this.assetsUrl, webhookReleaseUnpublishedReleaseAllOf.assetsUrl) &&
        Objects.equals(this.author, webhookReleaseUnpublishedReleaseAllOf.author) &&
        Objects.equals(this.body, webhookReleaseUnpublishedReleaseAllOf.body) &&
        Objects.equals(this.createdAt, webhookReleaseUnpublishedReleaseAllOf.createdAt) &&
        Objects.equals(this.draft, webhookReleaseUnpublishedReleaseAllOf.draft) &&
        Objects.equals(this.htmlUrl, webhookReleaseUnpublishedReleaseAllOf.htmlUrl) &&
        Objects.equals(this.id, webhookReleaseUnpublishedReleaseAllOf.id) &&
        Objects.equals(this.name, webhookReleaseUnpublishedReleaseAllOf.name) &&
        Objects.equals(this.nodeId, webhookReleaseUnpublishedReleaseAllOf.nodeId) &&
        Objects.equals(this.prerelease, webhookReleaseUnpublishedReleaseAllOf.prerelease) &&
        Objects.equals(this.publishedAt, webhookReleaseUnpublishedReleaseAllOf.publishedAt) &&
        Objects.equals(this.tagName, webhookReleaseUnpublishedReleaseAllOf.tagName) &&
        Objects.equals(this.tarballUrl, webhookReleaseUnpublishedReleaseAllOf.tarballUrl) &&
        Objects.equals(this.targetCommitish, webhookReleaseUnpublishedReleaseAllOf.targetCommitish) &&
        Objects.equals(this.uploadUrl, webhookReleaseUnpublishedReleaseAllOf.uploadUrl) &&
        Objects.equals(this.url, webhookReleaseUnpublishedReleaseAllOf.url) &&
        Objects.equals(this.zipballUrl, webhookReleaseUnpublishedReleaseAllOf.zipballUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, assetsUrl, author, body, createdAt, draft, htmlUrl, id, name, nodeId, prerelease, publishedAt, tagName, tarballUrl, targetCommitish, uploadUrl, url, zipballUrl);
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
    sb.append("class WebhookReleaseUnpublishedReleaseAllOf {\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    assetsUrl: ").append(toIndentedString(assetsUrl)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    prerelease: ").append(toIndentedString(prerelease)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
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
    openapiFields.add("draft");
    openapiFields.add("html_url");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("node_id");
    openapiFields.add("prerelease");
    openapiFields.add("published_at");
    openapiFields.add("tag_name");
    openapiFields.add("tarball_url");
    openapiFields.add("target_commitish");
    openapiFields.add("upload_url");
    openapiFields.add("url");
    openapiFields.add("zipball_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("published_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookReleaseUnpublishedReleaseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookReleaseUnpublishedReleaseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookReleaseUnpublishedReleaseAllOf is not found in the empty JSON string", WebhookReleaseUnpublishedReleaseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookReleaseUnpublishedReleaseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookReleaseUnpublishedReleaseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookReleaseUnpublishedReleaseAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("assets") != null && !jsonObj.get("assets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `assets` to be an array in the JSON string but got `%s`", jsonObj.get("assets").toString()));
      }
      if ((jsonObj.get("assets_url") != null && !jsonObj.get("assets_url").isJsonNull()) && !jsonObj.get("assets_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assets_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assets_url").toString()));
      }
      // validate the optional field `author`
      if (jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull()) {
        DeploymentWorkflowRunHeadRepositoryOwner.validateJsonObject(jsonObj.getAsJsonObject("author"));
      }
      if ((jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("html_url") != null && !jsonObj.get("html_url").isJsonNull()) && !jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("node_id") != null && !jsonObj.get("node_id").isJsonNull()) && !jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if (!jsonObj.get("published_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `published_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("published_at").toString()));
      }
      if ((jsonObj.get("tag_name") != null && !jsonObj.get("tag_name").isJsonNull()) && !jsonObj.get("tag_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_name").toString()));
      }
      if ((jsonObj.get("tarball_url") != null && !jsonObj.get("tarball_url").isJsonNull()) && !jsonObj.get("tarball_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tarball_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tarball_url").toString()));
      }
      if ((jsonObj.get("target_commitish") != null && !jsonObj.get("target_commitish").isJsonNull()) && !jsonObj.get("target_commitish").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_commitish` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_commitish").toString()));
      }
      if ((jsonObj.get("upload_url") != null && !jsonObj.get("upload_url").isJsonNull()) && !jsonObj.get("upload_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upload_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upload_url").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("zipball_url") != null && !jsonObj.get("zipball_url").isJsonNull()) && !jsonObj.get("zipball_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipball_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipball_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookReleaseUnpublishedReleaseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookReleaseUnpublishedReleaseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookReleaseUnpublishedReleaseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookReleaseUnpublishedReleaseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookReleaseUnpublishedReleaseAllOf>() {
           @Override
           public void write(JsonWriter out, WebhookReleaseUnpublishedReleaseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookReleaseUnpublishedReleaseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookReleaseUnpublishedReleaseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookReleaseUnpublishedReleaseAllOf
  * @throws IOException if the JSON string is invalid with respect to WebhookReleaseUnpublishedReleaseAllOf
  */
  public static WebhookReleaseUnpublishedReleaseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookReleaseUnpublishedReleaseAllOf.class);
  }

 /**
  * Convert an instance of WebhookReleaseUnpublishedReleaseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

