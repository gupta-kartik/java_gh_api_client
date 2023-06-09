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
 * TeamsCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class TeamsCreateRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MAINTAINERS = "maintainers";
  @SerializedName(SERIALIZED_NAME_MAINTAINERS)
  private List<String> maintainers;

  public static final String SERIALIZED_NAME_REPO_NAMES = "repo_names";
  @SerializedName(SERIALIZED_NAME_REPO_NAMES)
  private List<String> repoNames;

  /**
   * The level of privacy this team should have. The options are:   **For a non-nested team:**    * &#x60;secret&#x60; - only visible to organization owners and members of this team.    * &#x60;closed&#x60; - visible to all members of this organization.   Default: &#x60;secret&#x60;   **For a parent or child team:**    * &#x60;closed&#x60; - visible to all members of this organization.   Default for child team: &#x60;closed&#x60;
   */
  @JsonAdapter(PrivacyEnum.Adapter.class)
  public enum PrivacyEnum {
    SECRET("secret"),
    
    CLOSED("closed");

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
   * The notification setting the team has chosen. The options are:    * &#x60;notifications_enabled&#x60; - team members receive notifications when the team is @mentioned.    * &#x60;notifications_disabled&#x60; - no one receives notifications.   Default: &#x60;notifications_enabled&#x60;
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

  /**
   * **Deprecated**. The permission that new repositories will be added to the team with when none is specified.
   */
  @JsonAdapter(PermissionEnum.Adapter.class)
  public enum PermissionEnum {
    PULL("pull"),
    
    PUSH("push");

    private String value;

    PermissionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionEnum fromValue(String value) {
      for (PermissionEnum b : PermissionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PermissionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PermissionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERMISSION = "permission";
  @SerializedName(SERIALIZED_NAME_PERMISSION)
  private PermissionEnum permission = PermissionEnum.PULL;

  public static final String SERIALIZED_NAME_PARENT_TEAM_ID = "parent_team_id";
  @SerializedName(SERIALIZED_NAME_PARENT_TEAM_ID)
  private Integer parentTeamId;

  public TeamsCreateRequest() {
  }

  public TeamsCreateRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the team.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TeamsCreateRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the team.
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TeamsCreateRequest maintainers(List<String> maintainers) {
    
    this.maintainers = maintainers;
    return this;
  }

  public TeamsCreateRequest addMaintainersItem(String maintainersItem) {
    if (this.maintainers == null) {
      this.maintainers = new ArrayList<>();
    }
    this.maintainers.add(maintainersItem);
    return this;
  }

   /**
   * List GitHub IDs for organization members who will become team maintainers.
   * @return maintainers
  **/
  @javax.annotation.Nullable

  public List<String> getMaintainers() {
    return maintainers;
  }


  public void setMaintainers(List<String> maintainers) {
    this.maintainers = maintainers;
  }


  public TeamsCreateRequest repoNames(List<String> repoNames) {
    
    this.repoNames = repoNames;
    return this;
  }

  public TeamsCreateRequest addRepoNamesItem(String repoNamesItem) {
    if (this.repoNames == null) {
      this.repoNames = new ArrayList<>();
    }
    this.repoNames.add(repoNamesItem);
    return this;
  }

   /**
   * The full name (e.g., \&quot;organization-name/repository-name\&quot;) of repositories to add the team to.
   * @return repoNames
  **/
  @javax.annotation.Nullable

  public List<String> getRepoNames() {
    return repoNames;
  }


  public void setRepoNames(List<String> repoNames) {
    this.repoNames = repoNames;
  }


  public TeamsCreateRequest privacy(PrivacyEnum privacy) {
    
    this.privacy = privacy;
    return this;
  }

   /**
   * The level of privacy this team should have. The options are:   **For a non-nested team:**    * &#x60;secret&#x60; - only visible to organization owners and members of this team.    * &#x60;closed&#x60; - visible to all members of this organization.   Default: &#x60;secret&#x60;   **For a parent or child team:**    * &#x60;closed&#x60; - visible to all members of this organization.   Default for child team: &#x60;closed&#x60;
   * @return privacy
  **/
  @javax.annotation.Nullable

  public PrivacyEnum getPrivacy() {
    return privacy;
  }


  public void setPrivacy(PrivacyEnum privacy) {
    this.privacy = privacy;
  }


  public TeamsCreateRequest notificationSetting(NotificationSettingEnum notificationSetting) {
    
    this.notificationSetting = notificationSetting;
    return this;
  }

   /**
   * The notification setting the team has chosen. The options are:    * &#x60;notifications_enabled&#x60; - team members receive notifications when the team is @mentioned.    * &#x60;notifications_disabled&#x60; - no one receives notifications.   Default: &#x60;notifications_enabled&#x60;
   * @return notificationSetting
  **/
  @javax.annotation.Nullable

  public NotificationSettingEnum getNotificationSetting() {
    return notificationSetting;
  }


  public void setNotificationSetting(NotificationSettingEnum notificationSetting) {
    this.notificationSetting = notificationSetting;
  }


  public TeamsCreateRequest permission(PermissionEnum permission) {
    
    this.permission = permission;
    return this;
  }

   /**
   * **Deprecated**. The permission that new repositories will be added to the team with when none is specified.
   * @return permission
  **/
  @javax.annotation.Nullable

  public PermissionEnum getPermission() {
    return permission;
  }


  public void setPermission(PermissionEnum permission) {
    this.permission = permission;
  }


  public TeamsCreateRequest parentTeamId(Integer parentTeamId) {
    
    this.parentTeamId = parentTeamId;
    return this;
  }

   /**
   * The ID of a team to set as the parent team.
   * @return parentTeamId
  **/
  @javax.annotation.Nullable

  public Integer getParentTeamId() {
    return parentTeamId;
  }


  public void setParentTeamId(Integer parentTeamId) {
    this.parentTeamId = parentTeamId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamsCreateRequest teamsCreateRequest = (TeamsCreateRequest) o;
    return Objects.equals(this.name, teamsCreateRequest.name) &&
        Objects.equals(this.description, teamsCreateRequest.description) &&
        Objects.equals(this.maintainers, teamsCreateRequest.maintainers) &&
        Objects.equals(this.repoNames, teamsCreateRequest.repoNames) &&
        Objects.equals(this.privacy, teamsCreateRequest.privacy) &&
        Objects.equals(this.notificationSetting, teamsCreateRequest.notificationSetting) &&
        Objects.equals(this.permission, teamsCreateRequest.permission) &&
        Objects.equals(this.parentTeamId, teamsCreateRequest.parentTeamId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, maintainers, repoNames, privacy, notificationSetting, permission, parentTeamId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsCreateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    maintainers: ").append(toIndentedString(maintainers)).append("\n");
    sb.append("    repoNames: ").append(toIndentedString(repoNames)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    notificationSetting: ").append(toIndentedString(notificationSetting)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    parentTeamId: ").append(toIndentedString(parentTeamId)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("maintainers");
    openapiFields.add("repo_names");
    openapiFields.add("privacy");
    openapiFields.add("notification_setting");
    openapiFields.add("permission");
    openapiFields.add("parent_team_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TeamsCreateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TeamsCreateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TeamsCreateRequest is not found in the empty JSON string", TeamsCreateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TeamsCreateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TeamsCreateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TeamsCreateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("maintainers") != null && !jsonObj.get("maintainers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `maintainers` to be an array in the JSON string but got `%s`", jsonObj.get("maintainers").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("repo_names") != null && !jsonObj.get("repo_names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `repo_names` to be an array in the JSON string but got `%s`", jsonObj.get("repo_names").toString()));
      }
      if ((jsonObj.get("privacy") != null && !jsonObj.get("privacy").isJsonNull()) && !jsonObj.get("privacy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privacy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privacy").toString()));
      }
      if ((jsonObj.get("notification_setting") != null && !jsonObj.get("notification_setting").isJsonNull()) && !jsonObj.get("notification_setting").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notification_setting` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notification_setting").toString()));
      }
      if ((jsonObj.get("permission") != null && !jsonObj.get("permission").isJsonNull()) && !jsonObj.get("permission").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permission` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permission").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TeamsCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TeamsCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TeamsCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TeamsCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TeamsCreateRequest>() {
           @Override
           public void write(JsonWriter out, TeamsCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TeamsCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TeamsCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TeamsCreateRequest
  * @throws IOException if the JSON string is invalid with respect to TeamsCreateRequest
  */
  public static TeamsCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TeamsCreateRequest.class);
  }

 /**
  * Convert an instance of TeamsCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

