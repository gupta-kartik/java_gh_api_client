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
import org.openapitools.client.model.AppPermissions;
import org.openapitools.client.model.InstallationAccount;
import org.openapitools.client.model.NullableSimpleUser;
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
 * Installation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class Installation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private InstallationAccount account;

  /**
   * Describe whether all repositories have been selected or there&#39;s a selection involved
   */
  @JsonAdapter(RepositorySelectionEnum.Adapter.class)
  public enum RepositorySelectionEnum {
    ALL("all"),
    
    SELECTED("selected");

    private String value;

    RepositorySelectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RepositorySelectionEnum fromValue(String value) {
      for (RepositorySelectionEnum b : RepositorySelectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RepositorySelectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RepositorySelectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RepositorySelectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RepositorySelectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REPOSITORY_SELECTION = "repository_selection";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_SELECTION)
  private RepositorySelectionEnum repositorySelection;

  public static final String SERIALIZED_NAME_ACCESS_TOKENS_URL = "access_tokens_url";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKENS_URL)
  private URI accessTokensUrl;

  public static final String SERIALIZED_NAME_REPOSITORIES_URL = "repositories_url";
  @SerializedName(SERIALIZED_NAME_REPOSITORIES_URL)
  private URI repositoriesUrl;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private Integer appId;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private Integer targetId;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private String targetType;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private AppPermissions permissions;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_SINGLE_FILE_NAME = "single_file_name";
  @SerializedName(SERIALIZED_NAME_SINGLE_FILE_NAME)
  private String singleFileName;

  public static final String SERIALIZED_NAME_HAS_MULTIPLE_SINGLE_FILES = "has_multiple_single_files";
  @SerializedName(SERIALIZED_NAME_HAS_MULTIPLE_SINGLE_FILES)
  private Boolean hasMultipleSingleFiles;

  public static final String SERIALIZED_NAME_SINGLE_FILE_PATHS = "single_file_paths";
  @SerializedName(SERIALIZED_NAME_SINGLE_FILE_PATHS)
  private List<String> singleFilePaths;

  public static final String SERIALIZED_NAME_APP_SLUG = "app_slug";
  @SerializedName(SERIALIZED_NAME_APP_SLUG)
  private String appSlug;

  public static final String SERIALIZED_NAME_SUSPENDED_BY = "suspended_by";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_BY)
  private NullableSimpleUser suspendedBy;

  public static final String SERIALIZED_NAME_SUSPENDED_AT = "suspended_at";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_AT)
  private OffsetDateTime suspendedAt;

  public static final String SERIALIZED_NAME_CONTACT_EMAIL = "contact_email";
  @SerializedName(SERIALIZED_NAME_CONTACT_EMAIL)
  private String contactEmail;

  public Installation() {
  }

  public Installation id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the installation.
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Installation account(InstallationAccount account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable

  public InstallationAccount getAccount() {
    return account;
  }


  public void setAccount(InstallationAccount account) {
    this.account = account;
  }


  public Installation repositorySelection(RepositorySelectionEnum repositorySelection) {
    
    this.repositorySelection = repositorySelection;
    return this;
  }

   /**
   * Describe whether all repositories have been selected or there&#39;s a selection involved
   * @return repositorySelection
  **/
  @javax.annotation.Nonnull

  public RepositorySelectionEnum getRepositorySelection() {
    return repositorySelection;
  }


  public void setRepositorySelection(RepositorySelectionEnum repositorySelection) {
    this.repositorySelection = repositorySelection;
  }


  public Installation accessTokensUrl(URI accessTokensUrl) {
    
    this.accessTokensUrl = accessTokensUrl;
    return this;
  }

   /**
   * Get accessTokensUrl
   * @return accessTokensUrl
  **/
  @javax.annotation.Nonnull

  public URI getAccessTokensUrl() {
    return accessTokensUrl;
  }


  public void setAccessTokensUrl(URI accessTokensUrl) {
    this.accessTokensUrl = accessTokensUrl;
  }


  public Installation repositoriesUrl(URI repositoriesUrl) {
    
    this.repositoriesUrl = repositoriesUrl;
    return this;
  }

   /**
   * Get repositoriesUrl
   * @return repositoriesUrl
  **/
  @javax.annotation.Nonnull

  public URI getRepositoriesUrl() {
    return repositoriesUrl;
  }


  public void setRepositoriesUrl(URI repositoriesUrl) {
    this.repositoriesUrl = repositoriesUrl;
  }


  public Installation htmlUrl(URI htmlUrl) {
    
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @javax.annotation.Nonnull

  public URI getHtmlUrl() {
    return htmlUrl;
  }


  public void setHtmlUrl(URI htmlUrl) {
    this.htmlUrl = htmlUrl;
  }


  public Installation appId(Integer appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nonnull

  public Integer getAppId() {
    return appId;
  }


  public void setAppId(Integer appId) {
    this.appId = appId;
  }


  public Installation targetId(Integer targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * The ID of the user or organization this token is being scoped to.
   * @return targetId
  **/
  @javax.annotation.Nonnull

  public Integer getTargetId() {
    return targetId;
  }


  public void setTargetId(Integer targetId) {
    this.targetId = targetId;
  }


  public Installation targetType(String targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * Get targetType
   * @return targetType
  **/
  @javax.annotation.Nonnull

  public String getTargetType() {
    return targetType;
  }


  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }


  public Installation permissions(AppPermissions permissions) {
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nonnull

  public AppPermissions getPermissions() {
    return permissions;
  }


  public void setPermissions(AppPermissions permissions) {
    this.permissions = permissions;
  }


  public Installation events(List<String> events) {
    
    this.events = events;
    return this;
  }

  public Installation addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nonnull

  public List<String> getEvents() {
    return events;
  }


  public void setEvents(List<String> events) {
    this.events = events;
  }


  public Installation createdAt(OffsetDateTime createdAt) {
    
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


  public Installation updatedAt(OffsetDateTime updatedAt) {
    
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


  public Installation singleFileName(String singleFileName) {
    
    this.singleFileName = singleFileName;
    return this;
  }

   /**
   * Get singleFileName
   * @return singleFileName
  **/
  @javax.annotation.Nullable

  public String getSingleFileName() {
    return singleFileName;
  }


  public void setSingleFileName(String singleFileName) {
    this.singleFileName = singleFileName;
  }


  public Installation hasMultipleSingleFiles(Boolean hasMultipleSingleFiles) {
    
    this.hasMultipleSingleFiles = hasMultipleSingleFiles;
    return this;
  }

   /**
   * Get hasMultipleSingleFiles
   * @return hasMultipleSingleFiles
  **/
  @javax.annotation.Nullable

  public Boolean getHasMultipleSingleFiles() {
    return hasMultipleSingleFiles;
  }


  public void setHasMultipleSingleFiles(Boolean hasMultipleSingleFiles) {
    this.hasMultipleSingleFiles = hasMultipleSingleFiles;
  }


  public Installation singleFilePaths(List<String> singleFilePaths) {
    
    this.singleFilePaths = singleFilePaths;
    return this;
  }

  public Installation addSingleFilePathsItem(String singleFilePathsItem) {
    if (this.singleFilePaths == null) {
      this.singleFilePaths = new ArrayList<>();
    }
    this.singleFilePaths.add(singleFilePathsItem);
    return this;
  }

   /**
   * Get singleFilePaths
   * @return singleFilePaths
  **/
  @javax.annotation.Nullable

  public List<String> getSingleFilePaths() {
    return singleFilePaths;
  }


  public void setSingleFilePaths(List<String> singleFilePaths) {
    this.singleFilePaths = singleFilePaths;
  }


  public Installation appSlug(String appSlug) {
    
    this.appSlug = appSlug;
    return this;
  }

   /**
   * Get appSlug
   * @return appSlug
  **/
  @javax.annotation.Nonnull

  public String getAppSlug() {
    return appSlug;
  }


  public void setAppSlug(String appSlug) {
    this.appSlug = appSlug;
  }


  public Installation suspendedBy(NullableSimpleUser suspendedBy) {
    
    this.suspendedBy = suspendedBy;
    return this;
  }

   /**
   * Get suspendedBy
   * @return suspendedBy
  **/
  @javax.annotation.Nullable

  public NullableSimpleUser getSuspendedBy() {
    return suspendedBy;
  }


  public void setSuspendedBy(NullableSimpleUser suspendedBy) {
    this.suspendedBy = suspendedBy;
  }


  public Installation suspendedAt(OffsetDateTime suspendedAt) {
    
    this.suspendedAt = suspendedAt;
    return this;
  }

   /**
   * Get suspendedAt
   * @return suspendedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getSuspendedAt() {
    return suspendedAt;
  }


  public void setSuspendedAt(OffsetDateTime suspendedAt) {
    this.suspendedAt = suspendedAt;
  }


  public Installation contactEmail(String contactEmail) {
    
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * Get contactEmail
   * @return contactEmail
  **/
  @javax.annotation.Nullable

  public String getContactEmail() {
    return contactEmail;
  }


  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Installation installation = (Installation) o;
    return Objects.equals(this.id, installation.id) &&
        Objects.equals(this.account, installation.account) &&
        Objects.equals(this.repositorySelection, installation.repositorySelection) &&
        Objects.equals(this.accessTokensUrl, installation.accessTokensUrl) &&
        Objects.equals(this.repositoriesUrl, installation.repositoriesUrl) &&
        Objects.equals(this.htmlUrl, installation.htmlUrl) &&
        Objects.equals(this.appId, installation.appId) &&
        Objects.equals(this.targetId, installation.targetId) &&
        Objects.equals(this.targetType, installation.targetType) &&
        Objects.equals(this.permissions, installation.permissions) &&
        Objects.equals(this.events, installation.events) &&
        Objects.equals(this.createdAt, installation.createdAt) &&
        Objects.equals(this.updatedAt, installation.updatedAt) &&
        Objects.equals(this.singleFileName, installation.singleFileName) &&
        Objects.equals(this.hasMultipleSingleFiles, installation.hasMultipleSingleFiles) &&
        Objects.equals(this.singleFilePaths, installation.singleFilePaths) &&
        Objects.equals(this.appSlug, installation.appSlug) &&
        Objects.equals(this.suspendedBy, installation.suspendedBy) &&
        Objects.equals(this.suspendedAt, installation.suspendedAt) &&
        Objects.equals(this.contactEmail, installation.contactEmail);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, account, repositorySelection, accessTokensUrl, repositoriesUrl, htmlUrl, appId, targetId, targetType, permissions, events, createdAt, updatedAt, singleFileName, hasMultipleSingleFiles, singleFilePaths, appSlug, suspendedBy, suspendedAt, contactEmail);
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
    sb.append("class Installation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    repositorySelection: ").append(toIndentedString(repositorySelection)).append("\n");
    sb.append("    accessTokensUrl: ").append(toIndentedString(accessTokensUrl)).append("\n");
    sb.append("    repositoriesUrl: ").append(toIndentedString(repositoriesUrl)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    singleFileName: ").append(toIndentedString(singleFileName)).append("\n");
    sb.append("    hasMultipleSingleFiles: ").append(toIndentedString(hasMultipleSingleFiles)).append("\n");
    sb.append("    singleFilePaths: ").append(toIndentedString(singleFilePaths)).append("\n");
    sb.append("    appSlug: ").append(toIndentedString(appSlug)).append("\n");
    sb.append("    suspendedBy: ").append(toIndentedString(suspendedBy)).append("\n");
    sb.append("    suspendedAt: ").append(toIndentedString(suspendedAt)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("repository_selection");
    openapiFields.add("access_tokens_url");
    openapiFields.add("repositories_url");
    openapiFields.add("html_url");
    openapiFields.add("app_id");
    openapiFields.add("target_id");
    openapiFields.add("target_type");
    openapiFields.add("permissions");
    openapiFields.add("events");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("single_file_name");
    openapiFields.add("has_multiple_single_files");
    openapiFields.add("single_file_paths");
    openapiFields.add("app_slug");
    openapiFields.add("suspended_by");
    openapiFields.add("suspended_at");
    openapiFields.add("contact_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("account");
    openapiRequiredFields.add("repository_selection");
    openapiRequiredFields.add("access_tokens_url");
    openapiRequiredFields.add("repositories_url");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("app_id");
    openapiRequiredFields.add("target_id");
    openapiRequiredFields.add("target_type");
    openapiRequiredFields.add("permissions");
    openapiRequiredFields.add("events");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("single_file_name");
    openapiRequiredFields.add("app_slug");
    openapiRequiredFields.add("suspended_by");
    openapiRequiredFields.add("suspended_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Installation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Installation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Installation is not found in the empty JSON string", Installation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Installation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Installation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Installation.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `account`
      InstallationAccount.validateJsonObject(jsonObj.getAsJsonObject("account"));
      if (!jsonObj.get("repository_selection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repository_selection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repository_selection").toString()));
      }
      if (!jsonObj.get("access_tokens_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_tokens_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_tokens_url").toString()));
      }
      if (!jsonObj.get("repositories_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repositories_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repositories_url").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (!jsonObj.get("target_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_type").toString()));
      }
      // validate the required field `permissions`
      AppPermissions.validateJsonObject(jsonObj.getAsJsonObject("permissions"));
      // ensure the required json array is present
      if (jsonObj.get("events") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
      }
      if (!jsonObj.get("single_file_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `single_file_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("single_file_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("single_file_paths") != null && !jsonObj.get("single_file_paths").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `single_file_paths` to be an array in the JSON string but got `%s`", jsonObj.get("single_file_paths").toString()));
      }
      if (!jsonObj.get("app_slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_slug").toString()));
      }
      // validate the required field `suspended_by`
      NullableSimpleUser.validateJsonObject(jsonObj.getAsJsonObject("suspended_by"));
      if ((jsonObj.get("contact_email") != null && !jsonObj.get("contact_email").isJsonNull()) && !jsonObj.get("contact_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Installation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Installation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Installation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Installation.class));

       return (TypeAdapter<T>) new TypeAdapter<Installation>() {
           @Override
           public void write(JsonWriter out, Installation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Installation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Installation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Installation
  * @throws IOException if the JSON string is invalid with respect to Installation
  */
  public static Installation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Installation.class);
  }

 /**
  * Convert an instance of Installation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

