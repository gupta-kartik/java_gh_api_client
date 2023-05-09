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
import java.time.OffsetDateTime;
import org.openapitools.client.model.ProjectsV2ItemContentType;
import org.openapitools.client.model.SimpleUser;

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
 * An item belonging to a project
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ProjectsV2Item {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private BigDecimal id;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_PROJECT_NODE_ID = "project_node_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_NODE_ID)
  private String projectNodeId;

  public static final String SERIALIZED_NAME_CONTENT_NODE_ID = "content_node_id";
  @SerializedName(SERIALIZED_NAME_CONTENT_NODE_ID)
  private String contentNodeId;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private ProjectsV2ItemContentType contentType;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private SimpleUser creator;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_ARCHIVED_AT = "archived_at";
  @SerializedName(SERIALIZED_NAME_ARCHIVED_AT)
  private OffsetDateTime archivedAt;

  public ProjectsV2Item() {
  }

  public ProjectsV2Item id(BigDecimal id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull

  public BigDecimal getId() {
    return id;
  }


  public void setId(BigDecimal id) {
    this.id = id;
  }


  public ProjectsV2Item nodeId(String nodeId) {
    
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


  public ProjectsV2Item projectNodeId(String projectNodeId) {
    
    this.projectNodeId = projectNodeId;
    return this;
  }

   /**
   * Get projectNodeId
   * @return projectNodeId
  **/
  @javax.annotation.Nullable

  public String getProjectNodeId() {
    return projectNodeId;
  }


  public void setProjectNodeId(String projectNodeId) {
    this.projectNodeId = projectNodeId;
  }


  public ProjectsV2Item contentNodeId(String contentNodeId) {
    
    this.contentNodeId = contentNodeId;
    return this;
  }

   /**
   * Get contentNodeId
   * @return contentNodeId
  **/
  @javax.annotation.Nonnull

  public String getContentNodeId() {
    return contentNodeId;
  }


  public void setContentNodeId(String contentNodeId) {
    this.contentNodeId = contentNodeId;
  }


  public ProjectsV2Item contentType(ProjectsV2ItemContentType contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @javax.annotation.Nonnull

  public ProjectsV2ItemContentType getContentType() {
    return contentType;
  }


  public void setContentType(ProjectsV2ItemContentType contentType) {
    this.contentType = contentType;
  }


  public ProjectsV2Item creator(SimpleUser creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable

  public SimpleUser getCreator() {
    return creator;
  }


  public void setCreator(SimpleUser creator) {
    this.creator = creator;
  }


  public ProjectsV2Item createdAt(OffsetDateTime createdAt) {
    
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


  public ProjectsV2Item updatedAt(OffsetDateTime updatedAt) {
    
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


  public ProjectsV2Item archivedAt(OffsetDateTime archivedAt) {
    
    this.archivedAt = archivedAt;
    return this;
  }

   /**
   * Get archivedAt
   * @return archivedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getArchivedAt() {
    return archivedAt;
  }


  public void setArchivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = archivedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectsV2Item projectsV2Item = (ProjectsV2Item) o;
    return Objects.equals(this.id, projectsV2Item.id) &&
        Objects.equals(this.nodeId, projectsV2Item.nodeId) &&
        Objects.equals(this.projectNodeId, projectsV2Item.projectNodeId) &&
        Objects.equals(this.contentNodeId, projectsV2Item.contentNodeId) &&
        Objects.equals(this.contentType, projectsV2Item.contentType) &&
        Objects.equals(this.creator, projectsV2Item.creator) &&
        Objects.equals(this.createdAt, projectsV2Item.createdAt) &&
        Objects.equals(this.updatedAt, projectsV2Item.updatedAt) &&
        Objects.equals(this.archivedAt, projectsV2Item.archivedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nodeId, projectNodeId, contentNodeId, contentType, creator, createdAt, updatedAt, archivedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectsV2Item {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    projectNodeId: ").append(toIndentedString(projectNodeId)).append("\n");
    sb.append("    contentNodeId: ").append(toIndentedString(contentNodeId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
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
    openapiFields.add("project_node_id");
    openapiFields.add("content_node_id");
    openapiFields.add("content_type");
    openapiFields.add("creator");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("archived_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("content_node_id");
    openapiRequiredFields.add("content_type");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("archived_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectsV2Item
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectsV2Item.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectsV2Item is not found in the empty JSON string", ProjectsV2Item.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectsV2Item.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectsV2Item` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectsV2Item.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("node_id") != null && !jsonObj.get("node_id").isJsonNull()) && !jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if ((jsonObj.get("project_node_id") != null && !jsonObj.get("project_node_id").isJsonNull()) && !jsonObj.get("project_node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_node_id").toString()));
      }
      if (!jsonObj.get("content_node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_node_id").toString()));
      }
      // validate the optional field `creator`
      if (jsonObj.get("creator") != null && !jsonObj.get("creator").isJsonNull()) {
        SimpleUser.validateJsonObject(jsonObj.getAsJsonObject("creator"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectsV2Item.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectsV2Item' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectsV2Item> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectsV2Item.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectsV2Item>() {
           @Override
           public void write(JsonWriter out, ProjectsV2Item value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectsV2Item read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectsV2Item given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectsV2Item
  * @throws IOException if the JSON string is invalid with respect to ProjectsV2Item
  */
  public static ProjectsV2Item fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectsV2Item.class);
  }

 /**
  * Convert an instance of ProjectsV2Item to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
