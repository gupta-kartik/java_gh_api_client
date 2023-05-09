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
import org.openapitools.client.model.OrganizationSimple;
import org.openapitools.client.model.ProjectsV2Item;
import org.openapitools.client.model.SimpleInstallation;
import org.openapitools.client.model.SimpleUser;
import org.openapitools.client.model.WebhookProjectsV2ItemArchivedChanges;

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
 * WebhookProjectsV2ItemRestored
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookProjectsV2ItemRestored {
  /**
   * Gets or Sets action
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    RESTORED("restored");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public static final String SERIALIZED_NAME_CHANGES = "changes";
  @SerializedName(SERIALIZED_NAME_CHANGES)
  private WebhookProjectsV2ItemArchivedChanges changes;

  public static final String SERIALIZED_NAME_INSTALLATION = "installation";
  @SerializedName(SERIALIZED_NAME_INSTALLATION)
  private SimpleInstallation installation;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private OrganizationSimple organization;

  public static final String SERIALIZED_NAME_PROJECTS_V2_ITEM = "projects_v2_item";
  @SerializedName(SERIALIZED_NAME_PROJECTS_V2_ITEM)
  private ProjectsV2Item projectsV2Item;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private SimpleUser sender;

  public WebhookProjectsV2ItemRestored() {
  }

  public WebhookProjectsV2ItemRestored action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nonnull

  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public WebhookProjectsV2ItemRestored changes(WebhookProjectsV2ItemArchivedChanges changes) {
    
    this.changes = changes;
    return this;
  }

   /**
   * Get changes
   * @return changes
  **/
  @javax.annotation.Nonnull

  public WebhookProjectsV2ItemArchivedChanges getChanges() {
    return changes;
  }


  public void setChanges(WebhookProjectsV2ItemArchivedChanges changes) {
    this.changes = changes;
  }


  public WebhookProjectsV2ItemRestored installation(SimpleInstallation installation) {
    
    this.installation = installation;
    return this;
  }

   /**
   * Get installation
   * @return installation
  **/
  @javax.annotation.Nullable

  public SimpleInstallation getInstallation() {
    return installation;
  }


  public void setInstallation(SimpleInstallation installation) {
    this.installation = installation;
  }


  public WebhookProjectsV2ItemRestored organization(OrganizationSimple organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nonnull

  public OrganizationSimple getOrganization() {
    return organization;
  }


  public void setOrganization(OrganizationSimple organization) {
    this.organization = organization;
  }


  public WebhookProjectsV2ItemRestored projectsV2Item(ProjectsV2Item projectsV2Item) {
    
    this.projectsV2Item = projectsV2Item;
    return this;
  }

   /**
   * Get projectsV2Item
   * @return projectsV2Item
  **/
  @javax.annotation.Nonnull

  public ProjectsV2Item getProjectsV2Item() {
    return projectsV2Item;
  }


  public void setProjectsV2Item(ProjectsV2Item projectsV2Item) {
    this.projectsV2Item = projectsV2Item;
  }


  public WebhookProjectsV2ItemRestored sender(SimpleUser sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @javax.annotation.Nonnull

  public SimpleUser getSender() {
    return sender;
  }


  public void setSender(SimpleUser sender) {
    this.sender = sender;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookProjectsV2ItemRestored webhookProjectsV2ItemRestored = (WebhookProjectsV2ItemRestored) o;
    return Objects.equals(this.action, webhookProjectsV2ItemRestored.action) &&
        Objects.equals(this.changes, webhookProjectsV2ItemRestored.changes) &&
        Objects.equals(this.installation, webhookProjectsV2ItemRestored.installation) &&
        Objects.equals(this.organization, webhookProjectsV2ItemRestored.organization) &&
        Objects.equals(this.projectsV2Item, webhookProjectsV2ItemRestored.projectsV2Item) &&
        Objects.equals(this.sender, webhookProjectsV2ItemRestored.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, changes, installation, organization, projectsV2Item, sender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookProjectsV2ItemRestored {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    projectsV2Item: ").append(toIndentedString(projectsV2Item)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("changes");
    openapiFields.add("installation");
    openapiFields.add("organization");
    openapiFields.add("projects_v2_item");
    openapiFields.add("sender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action");
    openapiRequiredFields.add("changes");
    openapiRequiredFields.add("organization");
    openapiRequiredFields.add("projects_v2_item");
    openapiRequiredFields.add("sender");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookProjectsV2ItemRestored
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookProjectsV2ItemRestored.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookProjectsV2ItemRestored is not found in the empty JSON string", WebhookProjectsV2ItemRestored.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookProjectsV2ItemRestored.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookProjectsV2ItemRestored` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookProjectsV2ItemRestored.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      // validate the required field `changes`
      WebhookProjectsV2ItemArchivedChanges.validateJsonObject(jsonObj.getAsJsonObject("changes"));
      // validate the optional field `installation`
      if (jsonObj.get("installation") != null && !jsonObj.get("installation").isJsonNull()) {
        SimpleInstallation.validateJsonObject(jsonObj.getAsJsonObject("installation"));
      }
      // validate the required field `organization`
      OrganizationSimple.validateJsonObject(jsonObj.getAsJsonObject("organization"));
      // validate the required field `projects_v2_item`
      ProjectsV2Item.validateJsonObject(jsonObj.getAsJsonObject("projects_v2_item"));
      // validate the required field `sender`
      SimpleUser.validateJsonObject(jsonObj.getAsJsonObject("sender"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookProjectsV2ItemRestored.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookProjectsV2ItemRestored' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookProjectsV2ItemRestored> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookProjectsV2ItemRestored.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookProjectsV2ItemRestored>() {
           @Override
           public void write(JsonWriter out, WebhookProjectsV2ItemRestored value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookProjectsV2ItemRestored read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookProjectsV2ItemRestored given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookProjectsV2ItemRestored
  * @throws IOException if the JSON string is invalid with respect to WebhookProjectsV2ItemRestored
  */
  public static WebhookProjectsV2ItemRestored fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookProjectsV2ItemRestored.class);
  }

 /**
  * Convert an instance of WebhookProjectsV2ItemRestored to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

