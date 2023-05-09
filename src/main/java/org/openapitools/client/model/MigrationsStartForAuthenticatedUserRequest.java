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
 * MigrationsStartForAuthenticatedUserRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class MigrationsStartForAuthenticatedUserRequest {
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
  private Boolean orgMetadataOnly = false;

  /**
   * Allowed values that can be passed to the exclude param.
   */
  @JsonAdapter(ExcludeEnum.Adapter.class)
  public enum ExcludeEnum {
    REPOSITORIES("repositories");

    private String value;

    ExcludeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExcludeEnum fromValue(String value) {
      for (ExcludeEnum b : ExcludeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExcludeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExcludeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExcludeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExcludeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXCLUDE = "exclude";
  @SerializedName(SERIALIZED_NAME_EXCLUDE)
  private List<ExcludeEnum> exclude;

  public static final String SERIALIZED_NAME_REPOSITORIES = "repositories";
  @SerializedName(SERIALIZED_NAME_REPOSITORIES)
  private List<String> repositories = new ArrayList<>();

  public MigrationsStartForAuthenticatedUserRequest() {
  }

  public MigrationsStartForAuthenticatedUserRequest lockRepositories(Boolean lockRepositories) {
    
    this.lockRepositories = lockRepositories;
    return this;
  }

   /**
   * Lock the repositories being migrated at the start of the migration
   * @return lockRepositories
  **/
  @javax.annotation.Nullable

  public Boolean getLockRepositories() {
    return lockRepositories;
  }


  public void setLockRepositories(Boolean lockRepositories) {
    this.lockRepositories = lockRepositories;
  }


  public MigrationsStartForAuthenticatedUserRequest excludeMetadata(Boolean excludeMetadata) {
    
    this.excludeMetadata = excludeMetadata;
    return this;
  }

   /**
   * Indicates whether metadata should be excluded and only git source should be included for the migration.
   * @return excludeMetadata
  **/
  @javax.annotation.Nullable

  public Boolean getExcludeMetadata() {
    return excludeMetadata;
  }


  public void setExcludeMetadata(Boolean excludeMetadata) {
    this.excludeMetadata = excludeMetadata;
  }


  public MigrationsStartForAuthenticatedUserRequest excludeGitData(Boolean excludeGitData) {
    
    this.excludeGitData = excludeGitData;
    return this;
  }

   /**
   * Indicates whether the repository git data should be excluded from the migration.
   * @return excludeGitData
  **/
  @javax.annotation.Nullable

  public Boolean getExcludeGitData() {
    return excludeGitData;
  }


  public void setExcludeGitData(Boolean excludeGitData) {
    this.excludeGitData = excludeGitData;
  }


  public MigrationsStartForAuthenticatedUserRequest excludeAttachments(Boolean excludeAttachments) {
    
    this.excludeAttachments = excludeAttachments;
    return this;
  }

   /**
   * Do not include attachments in the migration
   * @return excludeAttachments
  **/
  @javax.annotation.Nullable

  public Boolean getExcludeAttachments() {
    return excludeAttachments;
  }


  public void setExcludeAttachments(Boolean excludeAttachments) {
    this.excludeAttachments = excludeAttachments;
  }


  public MigrationsStartForAuthenticatedUserRequest excludeReleases(Boolean excludeReleases) {
    
    this.excludeReleases = excludeReleases;
    return this;
  }

   /**
   * Do not include releases in the migration
   * @return excludeReleases
  **/
  @javax.annotation.Nullable

  public Boolean getExcludeReleases() {
    return excludeReleases;
  }


  public void setExcludeReleases(Boolean excludeReleases) {
    this.excludeReleases = excludeReleases;
  }


  public MigrationsStartForAuthenticatedUserRequest excludeOwnerProjects(Boolean excludeOwnerProjects) {
    
    this.excludeOwnerProjects = excludeOwnerProjects;
    return this;
  }

   /**
   * Indicates whether projects owned by the organization or users should be excluded.
   * @return excludeOwnerProjects
  **/
  @javax.annotation.Nullable

  public Boolean getExcludeOwnerProjects() {
    return excludeOwnerProjects;
  }


  public void setExcludeOwnerProjects(Boolean excludeOwnerProjects) {
    this.excludeOwnerProjects = excludeOwnerProjects;
  }


  public MigrationsStartForAuthenticatedUserRequest orgMetadataOnly(Boolean orgMetadataOnly) {
    
    this.orgMetadataOnly = orgMetadataOnly;
    return this;
  }

   /**
   * Indicates whether this should only include organization metadata (repositories array should be empty and will ignore other flags).
   * @return orgMetadataOnly
  **/
  @javax.annotation.Nullable

  public Boolean getOrgMetadataOnly() {
    return orgMetadataOnly;
  }


  public void setOrgMetadataOnly(Boolean orgMetadataOnly) {
    this.orgMetadataOnly = orgMetadataOnly;
  }


  public MigrationsStartForAuthenticatedUserRequest exclude(List<ExcludeEnum> exclude) {
    
    this.exclude = exclude;
    return this;
  }

  public MigrationsStartForAuthenticatedUserRequest addExcludeItem(ExcludeEnum excludeItem) {
    if (this.exclude == null) {
      this.exclude = new ArrayList<>();
    }
    this.exclude.add(excludeItem);
    return this;
  }

   /**
   * Exclude attributes from the API response to improve performance
   * @return exclude
  **/
  @javax.annotation.Nullable

  public List<ExcludeEnum> getExclude() {
    return exclude;
  }


  public void setExclude(List<ExcludeEnum> exclude) {
    this.exclude = exclude;
  }


  public MigrationsStartForAuthenticatedUserRequest repositories(List<String> repositories) {
    
    this.repositories = repositories;
    return this;
  }

  public MigrationsStartForAuthenticatedUserRequest addRepositoriesItem(String repositoriesItem) {
    if (this.repositories == null) {
      this.repositories = new ArrayList<>();
    }
    this.repositories.add(repositoriesItem);
    return this;
  }

   /**
   * Get repositories
   * @return repositories
  **/
  @javax.annotation.Nonnull

  public List<String> getRepositories() {
    return repositories;
  }


  public void setRepositories(List<String> repositories) {
    this.repositories = repositories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationsStartForAuthenticatedUserRequest migrationsStartForAuthenticatedUserRequest = (MigrationsStartForAuthenticatedUserRequest) o;
    return Objects.equals(this.lockRepositories, migrationsStartForAuthenticatedUserRequest.lockRepositories) &&
        Objects.equals(this.excludeMetadata, migrationsStartForAuthenticatedUserRequest.excludeMetadata) &&
        Objects.equals(this.excludeGitData, migrationsStartForAuthenticatedUserRequest.excludeGitData) &&
        Objects.equals(this.excludeAttachments, migrationsStartForAuthenticatedUserRequest.excludeAttachments) &&
        Objects.equals(this.excludeReleases, migrationsStartForAuthenticatedUserRequest.excludeReleases) &&
        Objects.equals(this.excludeOwnerProjects, migrationsStartForAuthenticatedUserRequest.excludeOwnerProjects) &&
        Objects.equals(this.orgMetadataOnly, migrationsStartForAuthenticatedUserRequest.orgMetadataOnly) &&
        Objects.equals(this.exclude, migrationsStartForAuthenticatedUserRequest.exclude) &&
        Objects.equals(this.repositories, migrationsStartForAuthenticatedUserRequest.repositories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockRepositories, excludeMetadata, excludeGitData, excludeAttachments, excludeReleases, excludeOwnerProjects, orgMetadataOnly, exclude, repositories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationsStartForAuthenticatedUserRequest {\n");
    sb.append("    lockRepositories: ").append(toIndentedString(lockRepositories)).append("\n");
    sb.append("    excludeMetadata: ").append(toIndentedString(excludeMetadata)).append("\n");
    sb.append("    excludeGitData: ").append(toIndentedString(excludeGitData)).append("\n");
    sb.append("    excludeAttachments: ").append(toIndentedString(excludeAttachments)).append("\n");
    sb.append("    excludeReleases: ").append(toIndentedString(excludeReleases)).append("\n");
    sb.append("    excludeOwnerProjects: ").append(toIndentedString(excludeOwnerProjects)).append("\n");
    sb.append("    orgMetadataOnly: ").append(toIndentedString(orgMetadataOnly)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
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
    openapiFields.add("lock_repositories");
    openapiFields.add("exclude_metadata");
    openapiFields.add("exclude_git_data");
    openapiFields.add("exclude_attachments");
    openapiFields.add("exclude_releases");
    openapiFields.add("exclude_owner_projects");
    openapiFields.add("org_metadata_only");
    openapiFields.add("exclude");
    openapiFields.add("repositories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("repositories");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MigrationsStartForAuthenticatedUserRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MigrationsStartForAuthenticatedUserRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MigrationsStartForAuthenticatedUserRequest is not found in the empty JSON string", MigrationsStartForAuthenticatedUserRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MigrationsStartForAuthenticatedUserRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MigrationsStartForAuthenticatedUserRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MigrationsStartForAuthenticatedUserRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("exclude") != null && !jsonObj.get("exclude").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `exclude` to be an array in the JSON string but got `%s`", jsonObj.get("exclude").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("repositories") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("repositories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `repositories` to be an array in the JSON string but got `%s`", jsonObj.get("repositories").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MigrationsStartForAuthenticatedUserRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MigrationsStartForAuthenticatedUserRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MigrationsStartForAuthenticatedUserRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MigrationsStartForAuthenticatedUserRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<MigrationsStartForAuthenticatedUserRequest>() {
           @Override
           public void write(JsonWriter out, MigrationsStartForAuthenticatedUserRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MigrationsStartForAuthenticatedUserRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MigrationsStartForAuthenticatedUserRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MigrationsStartForAuthenticatedUserRequest
  * @throws IOException if the JSON string is invalid with respect to MigrationsStartForAuthenticatedUserRequest
  */
  public static MigrationsStartForAuthenticatedUserRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MigrationsStartForAuthenticatedUserRequest.class);
  }

 /**
  * Convert an instance of MigrationsStartForAuthenticatedUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

