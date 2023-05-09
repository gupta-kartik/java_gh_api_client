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
import org.openapitools.client.model.User;

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
 * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class App1 {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Gets or Sets events
   */
  @JsonAdapter(EventsEnum.Adapter.class)
  public enum EventsEnum {
    BRANCH_PROTECTION_RULE("branch_protection_rule"),
    
    CHECK_RUN("check_run"),
    
    CHECK_SUITE("check_suite"),
    
    CODE_SCANNING_ALERT("code_scanning_alert"),
    
    COMMIT_COMMENT("commit_comment"),
    
    CONTENT_REFERENCE("content_reference"),
    
    CREATE("create"),
    
    DELETE("delete"),
    
    DEPLOYMENT("deployment"),
    
    DEPLOYMENT_REVIEW("deployment_review"),
    
    DEPLOYMENT_STATUS("deployment_status"),
    
    DEPLOY_KEY("deploy_key"),
    
    DISCUSSION("discussion"),
    
    DISCUSSION_COMMENT("discussion_comment"),
    
    FORK("fork"),
    
    GOLLUM("gollum"),
    
    ISSUES("issues"),
    
    ISSUE_COMMENT("issue_comment"),
    
    LABEL("label"),
    
    MEMBER("member"),
    
    MEMBERSHIP("membership"),
    
    MILESTONE("milestone"),
    
    ORGANIZATION("organization"),
    
    ORG_BLOCK("org_block"),
    
    PAGE_BUILD("page_build"),
    
    PROJECT("project"),
    
    PROJECT_CARD("project_card"),
    
    PROJECT_COLUMN("project_column"),
    
    PUBLIC("public"),
    
    PULL_REQUEST("pull_request"),
    
    PULL_REQUEST_REVIEW("pull_request_review"),
    
    PULL_REQUEST_REVIEW_COMMENT("pull_request_review_comment"),
    
    PUSH("push"),
    
    REGISTRY_PACKAGE("registry_package"),
    
    RELEASE("release"),
    
    REPOSITORY("repository"),
    
    REPOSITORY_DISPATCH("repository_dispatch"),
    
    SECRET_SCANNING_ALERT("secret_scanning_alert"),
    
    STAR("star"),
    
    STATUS("status"),
    
    TEAM("team"),
    
    TEAM_ADD("team_add"),
    
    WATCH("watch"),
    
    WORKFLOW_DISPATCH("workflow_dispatch"),
    
    WORKFLOW_RUN("workflow_run"),
    
    PULL_REQUEST_REVIEW_THREAD("pull_request_review_thread"),
    
    WORKFLOW_JOB("workflow_job"),
    
    MERGE_QUEUE_ENTRY("merge_queue_entry"),
    
    SECURITY_AND_ANALYSIS("security_and_analysis"),
    
    SECRET_SCANNING_ALERT_LOCATION("secret_scanning_alert_location"),
    
    PROJECTS_V2_ITEM("projects_v2_item"),
    
    MERGE_GROUP("merge_group"),
    
    REPOSITORY_IMPORT("repository_import");

    private String value;

    EventsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventsEnum fromValue(String value) {
      for (EventsEnum b : EventsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<EventsEnum> events;

  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private URI externalUrl;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private User owner;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private AppPermissions permissions;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public App1() {
  }

  public App1 createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public App1 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public App1 events(List<EventsEnum> events) {
    
    this.events = events;
    return this;
  }

  public App1 addEventsItem(EventsEnum eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * The list of events for the GitHub app
   * @return events
  **/
  @javax.annotation.Nullable

  public List<EventsEnum> getEvents() {
    return events;
  }


  public void setEvents(List<EventsEnum> events) {
    this.events = events;
  }


  public App1 externalUrl(URI externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * Get externalUrl
   * @return externalUrl
  **/
  @javax.annotation.Nullable

  public URI getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(URI externalUrl) {
    this.externalUrl = externalUrl;
  }


  public App1 htmlUrl(URI htmlUrl) {
    
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


  public App1 id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the GitHub app
   * @return id
  **/
  @javax.annotation.Nullable

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public App1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the GitHub app
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public App1 nodeId(String nodeId) {
    
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


  public App1 owner(User owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable

  public User getOwner() {
    return owner;
  }


  public void setOwner(User owner) {
    this.owner = owner;
  }


  public App1 permissions(AppPermissions permissions) {
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable

  public AppPermissions getPermissions() {
    return permissions;
  }


  public void setPermissions(AppPermissions permissions) {
    this.permissions = permissions;
  }


  public App1 slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * The slug name of the GitHub app
   * @return slug
  **/
  @javax.annotation.Nullable

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public App1 updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
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
    App1 app1 = (App1) o;
    return Objects.equals(this.createdAt, app1.createdAt) &&
        Objects.equals(this.description, app1.description) &&
        Objects.equals(this.events, app1.events) &&
        Objects.equals(this.externalUrl, app1.externalUrl) &&
        Objects.equals(this.htmlUrl, app1.htmlUrl) &&
        Objects.equals(this.id, app1.id) &&
        Objects.equals(this.name, app1.name) &&
        Objects.equals(this.nodeId, app1.nodeId) &&
        Objects.equals(this.owner, app1.owner) &&
        Objects.equals(this.permissions, app1.permissions) &&
        Objects.equals(this.slug, app1.slug) &&
        Objects.equals(this.updatedAt, app1.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, events, externalUrl, htmlUrl, id, name, nodeId, owner, permissions, slug, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class App1 {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
    openapiFields.add("events");
    openapiFields.add("external_url");
    openapiFields.add("html_url");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("node_id");
    openapiFields.add("owner");
    openapiFields.add("permissions");
    openapiFields.add("slug");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("external_url");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("owner");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to App1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!App1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in App1 is not found in the empty JSON string", App1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!App1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `App1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : App1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("events") != null && !jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
      }
      if (!jsonObj.get("external_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_url").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      // validate the required field `owner`
      User.validateJsonObject(jsonObj.getAsJsonObject("owner"));
      // validate the optional field `permissions`
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull()) {
        AppPermissions.validateJsonObject(jsonObj.getAsJsonObject("permissions"));
      }
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!App1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'App1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<App1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(App1.class));

       return (TypeAdapter<T>) new TypeAdapter<App1>() {
           @Override
           public void write(JsonWriter out, App1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public App1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of App1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of App1
  * @throws IOException if the JSON string is invalid with respect to App1
  */
  public static App1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, App1.class);
  }

 /**
  * Convert an instance of App1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

