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
import java.time.OffsetDateTime;

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
 * DiscussionCategory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class DiscussionCategory {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EMOJI = "emoji";
  @SerializedName(SERIALIZED_NAME_EMOJI)
  private String emoji;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IS_ANSWERABLE = "is_answerable";
  @SerializedName(SERIALIZED_NAME_IS_ANSWERABLE)
  private Boolean isAnswerable;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_REPOSITORY_ID = "repository_id";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_ID)
  private Integer repositoryId;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public DiscussionCategory() {
  }

  public DiscussionCategory createdAt(OffsetDateTime createdAt) {
    
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


  public DiscussionCategory description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DiscussionCategory emoji(String emoji) {
    
    this.emoji = emoji;
    return this;
  }

   /**
   * Get emoji
   * @return emoji
  **/
  @javax.annotation.Nonnull

  public String getEmoji() {
    return emoji;
  }


  public void setEmoji(String emoji) {
    this.emoji = emoji;
  }


  public DiscussionCategory id(Integer id) {
    
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


  public DiscussionCategory isAnswerable(Boolean isAnswerable) {
    
    this.isAnswerable = isAnswerable;
    return this;
  }

   /**
   * Get isAnswerable
   * @return isAnswerable
  **/
  @javax.annotation.Nonnull

  public Boolean getIsAnswerable() {
    return isAnswerable;
  }


  public void setIsAnswerable(Boolean isAnswerable) {
    this.isAnswerable = isAnswerable;
  }


  public DiscussionCategory name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DiscussionCategory nodeId(String nodeId) {
    
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


  public DiscussionCategory repositoryId(Integer repositoryId) {
    
    this.repositoryId = repositoryId;
    return this;
  }

   /**
   * Get repositoryId
   * @return repositoryId
  **/
  @javax.annotation.Nonnull

  public Integer getRepositoryId() {
    return repositoryId;
  }


  public void setRepositoryId(Integer repositoryId) {
    this.repositoryId = repositoryId;
  }


  public DiscussionCategory slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nonnull

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public DiscussionCategory updatedAt(String updatedAt) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscussionCategory discussionCategory = (DiscussionCategory) o;
    return Objects.equals(this.createdAt, discussionCategory.createdAt) &&
        Objects.equals(this.description, discussionCategory.description) &&
        Objects.equals(this.emoji, discussionCategory.emoji) &&
        Objects.equals(this.id, discussionCategory.id) &&
        Objects.equals(this.isAnswerable, discussionCategory.isAnswerable) &&
        Objects.equals(this.name, discussionCategory.name) &&
        Objects.equals(this.nodeId, discussionCategory.nodeId) &&
        Objects.equals(this.repositoryId, discussionCategory.repositoryId) &&
        Objects.equals(this.slug, discussionCategory.slug) &&
        Objects.equals(this.updatedAt, discussionCategory.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, emoji, id, isAnswerable, name, nodeId, repositoryId, slug, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscussionCategory {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    emoji: ").append(toIndentedString(emoji)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAnswerable: ").append(toIndentedString(isAnswerable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("description");
    openapiFields.add("emoji");
    openapiFields.add("id");
    openapiFields.add("is_answerable");
    openapiFields.add("name");
    openapiFields.add("node_id");
    openapiFields.add("repository_id");
    openapiFields.add("slug");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("emoji");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("is_answerable");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("repository_id");
    openapiRequiredFields.add("slug");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DiscussionCategory
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DiscussionCategory.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DiscussionCategory is not found in the empty JSON string", DiscussionCategory.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DiscussionCategory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DiscussionCategory` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DiscussionCategory.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("emoji").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emoji` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emoji").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("node_id") != null && !jsonObj.get("node_id").isJsonNull()) && !jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if (!jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if (!jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiscussionCategory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiscussionCategory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiscussionCategory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiscussionCategory.class));

       return (TypeAdapter<T>) new TypeAdapter<DiscussionCategory>() {
           @Override
           public void write(JsonWriter out, DiscussionCategory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiscussionCategory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DiscussionCategory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiscussionCategory
  * @throws IOException if the JSON string is invalid with respect to DiscussionCategory
  */
  public static DiscussionCategory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiscussionCategory.class);
  }

 /**
  * Convert an instance of DiscussionCategory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

