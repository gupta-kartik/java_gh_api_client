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
import org.openapitools.client.model.NullableSimpleUser;
import org.openapitools.client.model.Repository;

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
 * A migration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class Migration {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private NullableSimpleUser owner;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_LOCK_REPOSITORIES = "lock_repositories";
  @SerializedName(SERIALIZED_NAME_LOCK_REPOSITORIES)
  private Boolean lockRepositories;

  public static final String SERIALIZED_NAME_EXCLUDE_METADATA = "exclude_metadata";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_METADATA)
  private Boolean excludeMetadata;

  public static final String SERIALIZED_NAME_EXCLUDE_GIT_DATA = "exclude_git_data";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_GIT_DATA)
  private Boolean excludeGitData;

  public static final String SERIALIZED_NAME_EXCLUDE_ATTACHMENTS = "exclude_attachments";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_ATTACHMENTS)
  private Boolean excludeAttachments;

  public static final String SERIALIZED_NAME_EXCLUDE_RELEASES = "exclude_releases";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_RELEASES)
  private Boolean excludeReleases;

  public static final String SERIALIZED_NAME_EXCLUDE_OWNER_PROJECTS = "exclude_owner_projects";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_OWNER_PROJECTS)
  private Boolean excludeOwnerProjects;

  public static final String SERIALIZED_NAME_ORG_METADATA_ONLY = "org_metadata_only";
  @SerializedName(SERIALIZED_NAME_ORG_METADATA_ONLY)
  private Boolean orgMetadataOnly;

  public static final String SERIALIZED_NAME_REPOSITORIES = "repositories";
  @SerializedName(SERIALIZED_NAME_REPOSITORIES)
  private List<Repository> repositories = new ArrayList<>();

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_ARCHIVE_URL = "archive_url";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_URL)
  private URI archiveUrl;

  public static final String SERIALIZED_NAME_EXCLUDE = "exclude";
  @SerializedName(SERIALIZED_NAME_EXCLUDE)
  private List<String> exclude;

  public Migration() {
  }

  public Migration id(Integer id) {
    
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


  public Migration owner(NullableSimpleUser owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable

  public NullableSimpleUser getOwner() {
    return owner;
  }


  public void setOwner(NullableSimpleUser owner) {
    this.owner = owner;
  }


  public Migration guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @javax.annotation.Nonnull

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    this.guid = guid;
  }


  public Migration state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Migration lockRepositories(Boolean lockRepositories) {
    
    this.lockRepositories = lockRepositories;
    return this;
  }

   /**
   * Get lockRepositories
   * @return lockRepositories
  **/
  @javax.annotation.Nonnull

  public Boolean getLockRepositories() {
    return lockRepositories;
  }


  public void setLockRepositories(Boolean lockRepositories) {
    this.lockRepositories = lockRepositories;
  }


  public Migration excludeMetadata(Boolean excludeMetadata) {
    
    this.excludeMetadata = excludeMetadata;
    return this;
  }

   /**
   * Get excludeMetadata
   * @return excludeMetadata
  **/
  @javax.annotation.Nonnull

  public Boolean getExcludeMetadata() {
    return excludeMetadata;
  }


  public void setExcludeMetadata(Boolean excludeMetadata) {
    this.excludeMetadata = excludeMetadata;
  }


  public Migration excludeGitData(Boolean excludeGitData) {
    
    this.excludeGitData = excludeGitData;
    return this;
  }

   /**
   * Get excludeGitData
   * @return excludeGitData
  **/
  @javax.annotation.Nonnull

  public Boolean getExcludeGitData() {
    return excludeGitData;
  }


  public void setExcludeGitData(Boolean excludeGitData) {
    this.excludeGitData = excludeGitData;
  }


  public Migration excludeAttachments(Boolean excludeAttachments) {
    
    this.excludeAttachments = excludeAttachments;
    return this;
  }

   /**
   * Get excludeAttachments
   * @return excludeAttachments
  **/
  @javax.annotation.Nonnull

  public Boolean getExcludeAttachments() {
    return excludeAttachments;
  }


  public void setExcludeAttachments(Boolean excludeAttachments) {
    this.excludeAttachments = excludeAttachments;
  }


  public Migration excludeReleases(Boolean excludeReleases) {
    
    this.excludeReleases = excludeReleases;
    return this;
  }

   /**
   * Get excludeReleases
   * @return excludeReleases
  **/
  @javax.annotation.Nonnull

  public Boolean getExcludeReleases() {
    return excludeReleases;
  }


  public void setExcludeReleases(Boolean excludeReleases) {
    this.excludeReleases = excludeReleases;
  }


  public Migration excludeOwnerProjects(Boolean excludeOwnerProjects) {
    
    this.excludeOwnerProjects = excludeOwnerProjects;
    return this;
  }

   /**
   * Get excludeOwnerProjects
   * @return excludeOwnerProjects
  **/
  @javax.annotation.Nonnull

  public Boolean getExcludeOwnerProjects() {
    return excludeOwnerProjects;
  }


  public void setExcludeOwnerProjects(Boolean excludeOwnerProjects) {
    this.excludeOwnerProjects = excludeOwnerProjects;
  }


  public Migration orgMetadataOnly(Boolean orgMetadataOnly) {
    
    this.orgMetadataOnly = orgMetadataOnly;
    return this;
  }

   /**
   * Get orgMetadataOnly
   * @return orgMetadataOnly
  **/
  @javax.annotation.Nonnull

  public Boolean getOrgMetadataOnly() {
    return orgMetadataOnly;
  }


  public void setOrgMetadataOnly(Boolean orgMetadataOnly) {
    this.orgMetadataOnly = orgMetadataOnly;
  }


  public Migration repositories(List<Repository> repositories) {
    
    this.repositories = repositories;
    return this;
  }

  public Migration addRepositoriesItem(Repository repositoriesItem) {
    if (this.repositories == null) {
      this.repositories = new ArrayList<>();
    }
    this.repositories.add(repositoriesItem);
    return this;
  }

   /**
   * The repositories included in the migration. Only returned for export migrations.
   * @return repositories
  **/
  @javax.annotation.Nonnull

  public List<Repository> getRepositories() {
    return repositories;
  }


  public void setRepositories(List<Repository> repositories) {
    this.repositories = repositories;
  }


  public Migration url(URI url) {
    
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


  public Migration createdAt(OffsetDateTime createdAt) {
    
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


  public Migration updatedAt(OffsetDateTime updatedAt) {
    
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


  public Migration nodeId(String nodeId) {
    
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


  public Migration archiveUrl(URI archiveUrl) {
    
    this.archiveUrl = archiveUrl;
    return this;
  }

   /**
   * Get archiveUrl
   * @return archiveUrl
  **/
  @javax.annotation.Nullable

  public URI getArchiveUrl() {
    return archiveUrl;
  }


  public void setArchiveUrl(URI archiveUrl) {
    this.archiveUrl = archiveUrl;
  }


  public Migration exclude(List<String> exclude) {
    
    this.exclude = exclude;
    return this;
  }

  public Migration addExcludeItem(String excludeItem) {
    if (this.exclude == null) {
      this.exclude = new ArrayList<>();
    }
    this.exclude.add(excludeItem);
    return this;
  }

   /**
   * Exclude related items from being returned in the response in order to improve performance of the request. The array can include any of: &#x60;\&quot;repositories\&quot;&#x60;.
   * @return exclude
  **/
  @javax.annotation.Nullable

  public List<String> getExclude() {
    return exclude;
  }


  public void setExclude(List<String> exclude) {
    this.exclude = exclude;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Migration migration = (Migration) o;
    return Objects.equals(this.id, migration.id) &&
        Objects.equals(this.owner, migration.owner) &&
        Objects.equals(this.guid, migration.guid) &&
        Objects.equals(this.state, migration.state) &&
        Objects.equals(this.lockRepositories, migration.lockRepositories) &&
        Objects.equals(this.excludeMetadata, migration.excludeMetadata) &&
        Objects.equals(this.excludeGitData, migration.excludeGitData) &&
        Objects.equals(this.excludeAttachments, migration.excludeAttachments) &&
        Objects.equals(this.excludeReleases, migration.excludeReleases) &&
        Objects.equals(this.excludeOwnerProjects, migration.excludeOwnerProjects) &&
        Objects.equals(this.orgMetadataOnly, migration.orgMetadataOnly) &&
        Objects.equals(this.repositories, migration.repositories) &&
        Objects.equals(this.url, migration.url) &&
        Objects.equals(this.createdAt, migration.createdAt) &&
        Objects.equals(this.updatedAt, migration.updatedAt) &&
        Objects.equals(this.nodeId, migration.nodeId) &&
        Objects.equals(this.archiveUrl, migration.archiveUrl) &&
        Objects.equals(this.exclude, migration.exclude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, guid, state, lockRepositories, excludeMetadata, excludeGitData, excludeAttachments, excludeReleases, excludeOwnerProjects, orgMetadataOnly, repositories, url, createdAt, updatedAt, nodeId, archiveUrl, exclude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Migration {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    lockRepositories: ").append(toIndentedString(lockRepositories)).append("\n");
    sb.append("    excludeMetadata: ").append(toIndentedString(excludeMetadata)).append("\n");
    sb.append("    excludeGitData: ").append(toIndentedString(excludeGitData)).append("\n");
    sb.append("    excludeAttachments: ").append(toIndentedString(excludeAttachments)).append("\n");
    sb.append("    excludeReleases: ").append(toIndentedString(excludeReleases)).append("\n");
    sb.append("    excludeOwnerProjects: ").append(toIndentedString(excludeOwnerProjects)).append("\n");
    sb.append("    orgMetadataOnly: ").append(toIndentedString(orgMetadataOnly)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    archiveUrl: ").append(toIndentedString(archiveUrl)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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
    openapiFields.add("owner");
    openapiFields.add("guid");
    openapiFields.add("state");
    openapiFields.add("lock_repositories");
    openapiFields.add("exclude_metadata");
    openapiFields.add("exclude_git_data");
    openapiFields.add("exclude_attachments");
    openapiFields.add("exclude_releases");
    openapiFields.add("exclude_owner_projects");
    openapiFields.add("org_metadata_only");
    openapiFields.add("repositories");
    openapiFields.add("url");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("node_id");
    openapiFields.add("archive_url");
    openapiFields.add("exclude");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("owner");
    openapiRequiredFields.add("guid");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("lock_repositories");
    openapiRequiredFields.add("exclude_metadata");
    openapiRequiredFields.add("exclude_git_data");
    openapiRequiredFields.add("exclude_attachments");
    openapiRequiredFields.add("exclude_releases");
    openapiRequiredFields.add("exclude_owner_projects");
    openapiRequiredFields.add("org_metadata_only");
    openapiRequiredFields.add("repositories");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("node_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Migration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Migration.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Migration is not found in the empty JSON string", Migration.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Migration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Migration` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Migration.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `owner`
      NullableSimpleUser.validateJsonObject(jsonObj.getAsJsonObject("owner"));
      if (!jsonObj.get("guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guid").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("repositories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `repositories` to be an array in the JSON string but got `%s`", jsonObj.get("repositories").toString()));
      }

      JsonArray jsonArrayrepositories = jsonObj.getAsJsonArray("repositories");
      // validate the required field `repositories` (array)
      for (int i = 0; i < jsonArrayrepositories.size(); i++) {
        Repository.validateJsonObject(jsonArrayrepositories.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if ((jsonObj.get("archive_url") != null && !jsonObj.get("archive_url").isJsonNull()) && !jsonObj.get("archive_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `archive_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("archive_url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("exclude") != null && !jsonObj.get("exclude").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `exclude` to be an array in the JSON string but got `%s`", jsonObj.get("exclude").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Migration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Migration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Migration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Migration.class));

       return (TypeAdapter<T>) new TypeAdapter<Migration>() {
           @Override
           public void write(JsonWriter out, Migration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Migration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Migration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Migration
  * @throws IOException if the JSON string is invalid with respect to Migration
  */
  public static Migration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Migration.class);
  }

 /**
  * Convert an instance of Migration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

