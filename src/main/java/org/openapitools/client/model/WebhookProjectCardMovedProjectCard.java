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
import java.math.BigDecimal;
import java.net.URI;
import org.openapitools.client.model.WebhookProjectCardMovedProjectCardAllOfCreator;

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
 * WebhookProjectCardMovedProjectCard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookProjectCardMovedProjectCard {
  public static final String SERIALIZED_NAME_AFTER_ID = "after_id";
  @SerializedName(SERIALIZED_NAME_AFTER_ID)
  private BigDecimal afterId;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Boolean archived;

  public static final String SERIALIZED_NAME_COLUMN_ID = "column_id";
  @SerializedName(SERIALIZED_NAME_COLUMN_ID)
  private Integer columnId;

  public static final String SERIALIZED_NAME_COLUMN_URL = "column_url";
  @SerializedName(SERIALIZED_NAME_COLUMN_URL)
  private String columnUrl;

  public static final String SERIALIZED_NAME_CONTENT_URL = "content_url";
  @SerializedName(SERIALIZED_NAME_CONTENT_URL)
  private URI contentUrl;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private WebhookProjectCardMovedProjectCardAllOfCreator creator;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_PROJECT_URL = "project_url";
  @SerializedName(SERIALIZED_NAME_PROJECT_URL)
  private String projectUrl;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public WebhookProjectCardMovedProjectCard() {
  }

  public WebhookProjectCardMovedProjectCard afterId(BigDecimal afterId) {
    
    this.afterId = afterId;
    return this;
  }

   /**
   * Get afterId
   * @return afterId
  **/
  @javax.annotation.Nullable

  public BigDecimal getAfterId() {
    return afterId;
  }


  public void setAfterId(BigDecimal afterId) {
    this.afterId = afterId;
  }


  public WebhookProjectCardMovedProjectCard archived(Boolean archived) {
    
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @javax.annotation.Nonnull

  public Boolean getArchived() {
    return archived;
  }


  public void setArchived(Boolean archived) {
    this.archived = archived;
  }


  public WebhookProjectCardMovedProjectCard columnId(Integer columnId) {
    
    this.columnId = columnId;
    return this;
  }

   /**
   * Get columnId
   * @return columnId
  **/
  @javax.annotation.Nonnull

  public Integer getColumnId() {
    return columnId;
  }


  public void setColumnId(Integer columnId) {
    this.columnId = columnId;
  }


  public WebhookProjectCardMovedProjectCard columnUrl(String columnUrl) {
    
    this.columnUrl = columnUrl;
    return this;
  }

   /**
   * Get columnUrl
   * @return columnUrl
  **/
  @javax.annotation.Nonnull

  public String getColumnUrl() {
    return columnUrl;
  }


  public void setColumnUrl(String columnUrl) {
    this.columnUrl = columnUrl;
  }


  public WebhookProjectCardMovedProjectCard contentUrl(URI contentUrl) {
    
    this.contentUrl = contentUrl;
    return this;
  }

   /**
   * Get contentUrl
   * @return contentUrl
  **/
  @javax.annotation.Nullable

  public URI getContentUrl() {
    return contentUrl;
  }


  public void setContentUrl(URI contentUrl) {
    this.contentUrl = contentUrl;
  }


  public WebhookProjectCardMovedProjectCard createdAt(String createdAt) {
    
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


  public WebhookProjectCardMovedProjectCard creator(WebhookProjectCardMovedProjectCardAllOfCreator creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable

  public WebhookProjectCardMovedProjectCardAllOfCreator getCreator() {
    return creator;
  }


  public void setCreator(WebhookProjectCardMovedProjectCardAllOfCreator creator) {
    this.creator = creator;
  }


  public WebhookProjectCardMovedProjectCard id(Integer id) {
    
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


  public WebhookProjectCardMovedProjectCard nodeId(String nodeId) {
    
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


  public WebhookProjectCardMovedProjectCard note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @javax.annotation.Nullable

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public WebhookProjectCardMovedProjectCard projectUrl(String projectUrl) {
    
    this.projectUrl = projectUrl;
    return this;
  }

   /**
   * Get projectUrl
   * @return projectUrl
  **/
  @javax.annotation.Nonnull

  public String getProjectUrl() {
    return projectUrl;
  }


  public void setProjectUrl(String projectUrl) {
    this.projectUrl = projectUrl;
  }


  public WebhookProjectCardMovedProjectCard updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public WebhookProjectCardMovedProjectCard url(String url) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookProjectCardMovedProjectCard webhookProjectCardMovedProjectCard = (WebhookProjectCardMovedProjectCard) o;
    return Objects.equals(this.afterId, webhookProjectCardMovedProjectCard.afterId) &&
        Objects.equals(this.archived, webhookProjectCardMovedProjectCard.archived) &&
        Objects.equals(this.columnId, webhookProjectCardMovedProjectCard.columnId) &&
        Objects.equals(this.columnUrl, webhookProjectCardMovedProjectCard.columnUrl) &&
        Objects.equals(this.contentUrl, webhookProjectCardMovedProjectCard.contentUrl) &&
        Objects.equals(this.createdAt, webhookProjectCardMovedProjectCard.createdAt) &&
        Objects.equals(this.creator, webhookProjectCardMovedProjectCard.creator) &&
        Objects.equals(this.id, webhookProjectCardMovedProjectCard.id) &&
        Objects.equals(this.nodeId, webhookProjectCardMovedProjectCard.nodeId) &&
        Objects.equals(this.note, webhookProjectCardMovedProjectCard.note) &&
        Objects.equals(this.projectUrl, webhookProjectCardMovedProjectCard.projectUrl) &&
        Objects.equals(this.updatedAt, webhookProjectCardMovedProjectCard.updatedAt) &&
        Objects.equals(this.url, webhookProjectCardMovedProjectCard.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterId, archived, columnId, columnUrl, contentUrl, createdAt, creator, id, nodeId, note, projectUrl, updatedAt, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookProjectCardMovedProjectCard {\n");
    sb.append("    afterId: ").append(toIndentedString(afterId)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    columnId: ").append(toIndentedString(columnId)).append("\n");
    sb.append("    columnUrl: ").append(toIndentedString(columnUrl)).append("\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    projectUrl: ").append(toIndentedString(projectUrl)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("after_id");
    openapiFields.add("archived");
    openapiFields.add("column_id");
    openapiFields.add("column_url");
    openapiFields.add("content_url");
    openapiFields.add("created_at");
    openapiFields.add("creator");
    openapiFields.add("id");
    openapiFields.add("node_id");
    openapiFields.add("note");
    openapiFields.add("project_url");
    openapiFields.add("updated_at");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("after_id");
    openapiRequiredFields.add("archived");
    openapiRequiredFields.add("column_id");
    openapiRequiredFields.add("column_url");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("creator");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("note");
    openapiRequiredFields.add("project_url");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookProjectCardMovedProjectCard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookProjectCardMovedProjectCard.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookProjectCardMovedProjectCard is not found in the empty JSON string", WebhookProjectCardMovedProjectCard.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookProjectCardMovedProjectCard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookProjectCardMovedProjectCard` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookProjectCardMovedProjectCard.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("column_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `column_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("column_url").toString()));
      }
      if ((jsonObj.get("content_url") != null && !jsonObj.get("content_url").isJsonNull()) && !jsonObj.get("content_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_url").toString()));
      }
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      // validate the required field `creator`
      WebhookProjectCardMovedProjectCardAllOfCreator.validateJsonObject(jsonObj.getAsJsonObject("creator"));
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if (!jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
      if (!jsonObj.get("project_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_url").toString()));
      }
      if (!jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookProjectCardMovedProjectCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookProjectCardMovedProjectCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookProjectCardMovedProjectCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookProjectCardMovedProjectCard.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookProjectCardMovedProjectCard>() {
           @Override
           public void write(JsonWriter out, WebhookProjectCardMovedProjectCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookProjectCardMovedProjectCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookProjectCardMovedProjectCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookProjectCardMovedProjectCard
  * @throws IOException if the JSON string is invalid with respect to WebhookProjectCardMovedProjectCard
  */
  public static WebhookProjectCardMovedProjectCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookProjectCardMovedProjectCard.class);
  }

 /**
  * Convert an instance of WebhookProjectCardMovedProjectCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

