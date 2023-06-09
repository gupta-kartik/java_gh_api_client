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
import org.openapitools.client.model.TeamParent;
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
 * Groups of organization members that gives permissions on specified repositories.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class Team {
  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MEMBERS_URL = "members_url";
  @SerializedName(SERIALIZED_NAME_MEMBERS_URL)
  private String membersUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private TeamParent parent;

  public static final String SERIALIZED_NAME_PERMISSION = "permission";
  @SerializedName(SERIALIZED_NAME_PERMISSION)
  private String permission;

  /**
   * Gets or Sets privacy
   */
  @JsonAdapter(PrivacyEnum.Adapter.class)
  public enum PrivacyEnum {
    OPEN("open"),
    
    CLOSED("closed"),
    
    SECRET("secret");

    private String value;

    PrivacyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrivacyEnum fromValue(String value) {
      for (PrivacyEnum b : PrivacyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PrivacyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrivacyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrivacyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PrivacyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRIVACY = "privacy";
  @SerializedName(SERIALIZED_NAME_PRIVACY)
  private PrivacyEnum privacy;

  /**
   * Gets or Sets notificationSetting
   */
  @JsonAdapter(NotificationSettingEnum.Adapter.class)
  public enum NotificationSettingEnum {
    ENABLED("notifications_enabled"),
    
    DISABLED("notifications_disabled");

    private String value;

    NotificationSettingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotificationSettingEnum fromValue(String value) {
      for (NotificationSettingEnum b : NotificationSettingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NotificationSettingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotificationSettingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotificationSettingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NotificationSettingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NOTIFICATION_SETTING = "notification_setting";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_SETTING)
  private NotificationSettingEnum notificationSetting;

  public static final String SERIALIZED_NAME_REPOSITORIES_URL = "repositories_url";
  @SerializedName(SERIALIZED_NAME_REPOSITORIES_URL)
  private URI repositoriesUrl;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public Team() {
  }

  public Team deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public Team description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the team
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Team htmlUrl(URI htmlUrl) {
    
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @javax.annotation.Nullable

  public URI getHtmlUrl() {
    return htmlUrl;
  }


  public void setHtmlUrl(URI htmlUrl) {
    this.htmlUrl = htmlUrl;
  }


  public Team id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the team
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Team membersUrl(String membersUrl) {
    
    this.membersUrl = membersUrl;
    return this;
  }

   /**
   * Get membersUrl
   * @return membersUrl
  **/
  @javax.annotation.Nullable

  public String getMembersUrl() {
    return membersUrl;
  }


  public void setMembersUrl(String membersUrl) {
    this.membersUrl = membersUrl;
  }


  public Team name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the team
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Team nodeId(String nodeId) {
    
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


  public Team parent(TeamParent parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable

  public TeamParent getParent() {
    return parent;
  }


  public void setParent(TeamParent parent) {
    this.parent = parent;
  }


  public Team permission(String permission) {
    
    this.permission = permission;
    return this;
  }

   /**
   * Permission that the team will have for its repositories
   * @return permission
  **/
  @javax.annotation.Nullable

  public String getPermission() {
    return permission;
  }


  public void setPermission(String permission) {
    this.permission = permission;
  }


  public Team privacy(PrivacyEnum privacy) {
    
    this.privacy = privacy;
    return this;
  }

   /**
   * Get privacy
   * @return privacy
  **/
  @javax.annotation.Nullable

  public PrivacyEnum getPrivacy() {
    return privacy;
  }


  public void setPrivacy(PrivacyEnum privacy) {
    this.privacy = privacy;
  }


  public Team notificationSetting(NotificationSettingEnum notificationSetting) {
    
    this.notificationSetting = notificationSetting;
    return this;
  }

   /**
   * Get notificationSetting
   * @return notificationSetting
  **/
  @javax.annotation.Nullable

  public NotificationSettingEnum getNotificationSetting() {
    return notificationSetting;
  }


  public void setNotificationSetting(NotificationSettingEnum notificationSetting) {
    this.notificationSetting = notificationSetting;
  }


  public Team repositoriesUrl(URI repositoriesUrl) {
    
    this.repositoriesUrl = repositoriesUrl;
    return this;
  }

   /**
   * Get repositoriesUrl
   * @return repositoriesUrl
  **/
  @javax.annotation.Nullable

  public URI getRepositoriesUrl() {
    return repositoriesUrl;
  }


  public void setRepositoriesUrl(URI repositoriesUrl) {
    this.repositoriesUrl = repositoriesUrl;
  }


  public Team slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nullable

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public Team url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL for the team
   * @return url
  **/
  @javax.annotation.Nullable

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
    Team team = (Team) o;
    return Objects.equals(this.deleted, team.deleted) &&
        Objects.equals(this.description, team.description) &&
        Objects.equals(this.htmlUrl, team.htmlUrl) &&
        Objects.equals(this.id, team.id) &&
        Objects.equals(this.membersUrl, team.membersUrl) &&
        Objects.equals(this.name, team.name) &&
        Objects.equals(this.nodeId, team.nodeId) &&
        Objects.equals(this.parent, team.parent) &&
        Objects.equals(this.permission, team.permission) &&
        Objects.equals(this.privacy, team.privacy) &&
        Objects.equals(this.notificationSetting, team.notificationSetting) &&
        Objects.equals(this.repositoriesUrl, team.repositoriesUrl) &&
        Objects.equals(this.slug, team.slug) &&
        Objects.equals(this.url, team.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleted, description, htmlUrl, id, membersUrl, name, nodeId, parent, permission, privacy, notificationSetting, repositoriesUrl, slug, url);
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
    sb.append("class Team {\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    membersUrl: ").append(toIndentedString(membersUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    notificationSetting: ").append(toIndentedString(notificationSetting)).append("\n");
    sb.append("    repositoriesUrl: ").append(toIndentedString(repositoriesUrl)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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
    openapiFields.add("deleted");
    openapiFields.add("description");
    openapiFields.add("html_url");
    openapiFields.add("id");
    openapiFields.add("members_url");
    openapiFields.add("name");
    openapiFields.add("node_id");
    openapiFields.add("parent");
    openapiFields.add("permission");
    openapiFields.add("privacy");
    openapiFields.add("notification_setting");
    openapiFields.add("repositories_url");
    openapiFields.add("slug");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Team
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Team.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Team is not found in the empty JSON string", Team.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Team.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Team` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Team.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("html_url") != null && !jsonObj.get("html_url").isJsonNull()) && !jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if ((jsonObj.get("members_url") != null && !jsonObj.get("members_url").isJsonNull()) && !jsonObj.get("members_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `members_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("members_url").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("node_id") != null && !jsonObj.get("node_id").isJsonNull()) && !jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      // validate the optional field `parent`
      if (jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonNull()) {
        TeamParent.validateJsonObject(jsonObj.getAsJsonObject("parent"));
      }
      if ((jsonObj.get("permission") != null && !jsonObj.get("permission").isJsonNull()) && !jsonObj.get("permission").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permission` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permission").toString()));
      }
      if ((jsonObj.get("privacy") != null && !jsonObj.get("privacy").isJsonNull()) && !jsonObj.get("privacy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privacy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privacy").toString()));
      }
      if ((jsonObj.get("notification_setting") != null && !jsonObj.get("notification_setting").isJsonNull()) && !jsonObj.get("notification_setting").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notification_setting` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notification_setting").toString()));
      }
      if ((jsonObj.get("repositories_url") != null && !jsonObj.get("repositories_url").isJsonNull()) && !jsonObj.get("repositories_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repositories_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repositories_url").toString()));
      }
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Team.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Team' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Team> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Team.class));

       return (TypeAdapter<T>) new TypeAdapter<Team>() {
           @Override
           public void write(JsonWriter out, Team value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Team read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Team given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Team
  * @throws IOException if the JSON string is invalid with respect to Team
  */
  public static Team fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Team.class);
  }

 /**
  * Convert an instance of Team to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

