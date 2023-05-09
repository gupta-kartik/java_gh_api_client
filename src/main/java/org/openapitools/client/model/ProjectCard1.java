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
import org.openapitools.client.model.User1;
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
 * ProjectCard1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ProjectCard1 {
  public static final String SERIALIZED_NAME_AFTER_ID = "after_id";
  @SerializedName(SERIALIZED_NAME_AFTER_ID)
  private Integer afterId;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Boolean archived;

  public static final String SERIALIZED_NAME_COLUMN_ID = "column_id";
  @SerializedName(SERIALIZED_NAME_COLUMN_ID)
  private Integer columnId;

  public static final String SERIALIZED_NAME_COLUMN_URL = "column_url";
  @SerializedName(SERIALIZED_NAME_COLUMN_URL)
  private URI columnUrl;

  public static final String SERIALIZED_NAME_CONTENT_URL = "content_url";
  @SerializedName(SERIALIZED_NAME_CONTENT_URL)
  private URI contentUrl;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private User1 creator;

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
  private URI projectUrl;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public ProjectCard1() {
  }

  public ProjectCard1 afterId(Integer afterId) {
    
    this.afterId = afterId;
    return this;
  }

   /**
   * Get afterId
   * @return afterId
  **/
  @javax.annotation.Nullable

  public Integer getAfterId() {
    return afterId;
  }


  public void setAfterId(Integer afterId) {
    this.afterId = afterId;
  }


  public ProjectCard1 archived(Boolean archived) {
    
    this.archived = archived;
    return this;
  }

   /**
   * Whether or not the card is archived
   * @return archived
  **/
  @javax.annotation.Nonnull

  public Boolean getArchived() {
    return archived;
  }


  public void setArchived(Boolean archived) {
    this.archived = archived;
  }


  public ProjectCard1 columnId(Integer columnId) {
    
    this.columnId = columnId;
    return this;
  }

   /**
   * Get columnId
   * @return columnId
  **/
  @javax.annotation.Nullable

  public Integer getColumnId() {
    return columnId;
  }


  public void setColumnId(Integer columnId) {
    this.columnId = columnId;
  }


  public ProjectCard1 columnUrl(URI columnUrl) {
    
    this.columnUrl = columnUrl;
    return this;
  }

   /**
   * Get columnUrl
   * @return columnUrl
  **/
  @javax.annotation.Nonnull

  public URI getColumnUrl() {
    return columnUrl;
  }


  public void setColumnUrl(URI columnUrl) {
    this.columnUrl = columnUrl;
  }


  public ProjectCard1 contentUrl(URI contentUrl) {
    
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


  public ProjectCard1 createdAt(OffsetDateTime createdAt) {
    
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


  public ProjectCard1 creator(User1 creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable

  public User1 getCreator() {
    return creator;
  }


  public void setCreator(User1 creator) {
    this.creator = creator;
  }


  public ProjectCard1 id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The project card&#39;s ID
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ProjectCard1 nodeId(String nodeId) {
    
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


  public ProjectCard1 note(String note) {
    
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


  public ProjectCard1 projectUrl(URI projectUrl) {
    
    this.projectUrl = projectUrl;
    return this;
  }

   /**
   * Get projectUrl
   * @return projectUrl
  **/
  @javax.annotation.Nonnull

  public URI getProjectUrl() {
    return projectUrl;
  }


  public void setProjectUrl(URI projectUrl) {
    this.projectUrl = projectUrl;
  }


  public ProjectCard1 updatedAt(OffsetDateTime updatedAt) {
    
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


  public ProjectCard1 url(URI url) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectCard1 projectCard1 = (ProjectCard1) o;
    return Objects.equals(this.afterId, projectCard1.afterId) &&
        Objects.equals(this.archived, projectCard1.archived) &&
        Objects.equals(this.columnId, projectCard1.columnId) &&
        Objects.equals(this.columnUrl, projectCard1.columnUrl) &&
        Objects.equals(this.contentUrl, projectCard1.contentUrl) &&
        Objects.equals(this.createdAt, projectCard1.createdAt) &&
        Objects.equals(this.creator, projectCard1.creator) &&
        Objects.equals(this.id, projectCard1.id) &&
        Objects.equals(this.nodeId, projectCard1.nodeId) &&
        Objects.equals(this.note, projectCard1.note) &&
        Objects.equals(this.projectUrl, projectCard1.projectUrl) &&
        Objects.equals(this.updatedAt, projectCard1.updatedAt) &&
        Objects.equals(this.url, projectCard1.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterId, archived, columnId, columnUrl, contentUrl, createdAt, creator, id, nodeId, note, projectUrl, updatedAt, url);
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
    sb.append("class ProjectCard1 {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to ProjectCard1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectCard1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectCard1 is not found in the empty JSON string", ProjectCard1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectCard1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectCard1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectCard1.openapiRequiredFields) {
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
      // validate the required field `creator`
      User1.validateJsonObject(jsonObj.getAsJsonObject("creator"));
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if (!jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
      if (!jsonObj.get("project_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_url").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectCard1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectCard1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectCard1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectCard1.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectCard1>() {
           @Override
           public void write(JsonWriter out, ProjectCard1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectCard1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectCard1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectCard1
  * @throws IOException if the JSON string is invalid with respect to ProjectCard1
  */
  public static ProjectCard1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectCard1.class);
  }

 /**
  * Convert an instance of ProjectCard1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

