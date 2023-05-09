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
import org.openapitools.client.model.Enterprise;
import org.openapitools.client.model.OrganizationSimple;
import org.openapitools.client.model.Repository;
import org.openapitools.client.model.SimpleInstallation;
import org.openapitools.client.model.SimpleUser;
import org.openapitools.client.model.WebhookProjectCardMovedChanges;
import org.openapitools.client.model.WebhookProjectCardMovedProjectCard;

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
 * WebhookProjectCardMoved
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookProjectCardMoved {
  /**
   * Gets or Sets action
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    MOVED("moved");

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
  private WebhookProjectCardMovedChanges changes;

  public static final String SERIALIZED_NAME_ENTERPRISE = "enterprise";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE)
  private Enterprise enterprise;

  public static final String SERIALIZED_NAME_INSTALLATION = "installation";
  @SerializedName(SERIALIZED_NAME_INSTALLATION)
  private SimpleInstallation installation;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private OrganizationSimple organization;

  public static final String SERIALIZED_NAME_PROJECT_CARD = "project_card";
  @SerializedName(SERIALIZED_NAME_PROJECT_CARD)
  private WebhookProjectCardMovedProjectCard projectCard;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private Repository repository;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private SimpleUser sender;

  public WebhookProjectCardMoved() {
  }

  public WebhookProjectCardMoved action(ActionEnum action) {
    
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


  public WebhookProjectCardMoved changes(WebhookProjectCardMovedChanges changes) {
    
    this.changes = changes;
    return this;
  }

   /**
   * Get changes
   * @return changes
  **/
  @javax.annotation.Nullable

  public WebhookProjectCardMovedChanges getChanges() {
    return changes;
  }


  public void setChanges(WebhookProjectCardMovedChanges changes) {
    this.changes = changes;
  }


  public WebhookProjectCardMoved enterprise(Enterprise enterprise) {
    
    this.enterprise = enterprise;
    return this;
  }

   /**
   * Get enterprise
   * @return enterprise
  **/
  @javax.annotation.Nullable

  public Enterprise getEnterprise() {
    return enterprise;
  }


  public void setEnterprise(Enterprise enterprise) {
    this.enterprise = enterprise;
  }


  public WebhookProjectCardMoved installation(SimpleInstallation installation) {
    
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


  public WebhookProjectCardMoved organization(OrganizationSimple organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nullable

  public OrganizationSimple getOrganization() {
    return organization;
  }


  public void setOrganization(OrganizationSimple organization) {
    this.organization = organization;
  }


  public WebhookProjectCardMoved projectCard(WebhookProjectCardMovedProjectCard projectCard) {
    
    this.projectCard = projectCard;
    return this;
  }

   /**
   * Get projectCard
   * @return projectCard
  **/
  @javax.annotation.Nonnull

  public WebhookProjectCardMovedProjectCard getProjectCard() {
    return projectCard;
  }


  public void setProjectCard(WebhookProjectCardMovedProjectCard projectCard) {
    this.projectCard = projectCard;
  }


  public WebhookProjectCardMoved repository(Repository repository) {
    
    this.repository = repository;
    return this;
  }

   /**
   * Get repository
   * @return repository
  **/
  @javax.annotation.Nullable

  public Repository getRepository() {
    return repository;
  }


  public void setRepository(Repository repository) {
    this.repository = repository;
  }


  public WebhookProjectCardMoved sender(SimpleUser sender) {
    
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
    WebhookProjectCardMoved webhookProjectCardMoved = (WebhookProjectCardMoved) o;
    return Objects.equals(this.action, webhookProjectCardMoved.action) &&
        Objects.equals(this.changes, webhookProjectCardMoved.changes) &&
        Objects.equals(this.enterprise, webhookProjectCardMoved.enterprise) &&
        Objects.equals(this.installation, webhookProjectCardMoved.installation) &&
        Objects.equals(this.organization, webhookProjectCardMoved.organization) &&
        Objects.equals(this.projectCard, webhookProjectCardMoved.projectCard) &&
        Objects.equals(this.repository, webhookProjectCardMoved.repository) &&
        Objects.equals(this.sender, webhookProjectCardMoved.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, changes, enterprise, installation, organization, projectCard, repository, sender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookProjectCardMoved {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
    sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    projectCard: ").append(toIndentedString(projectCard)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
    openapiFields.add("enterprise");
    openapiFields.add("installation");
    openapiFields.add("organization");
    openapiFields.add("project_card");
    openapiFields.add("repository");
    openapiFields.add("sender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action");
    openapiRequiredFields.add("project_card");
    openapiRequiredFields.add("sender");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookProjectCardMoved
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookProjectCardMoved.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookProjectCardMoved is not found in the empty JSON string", WebhookProjectCardMoved.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookProjectCardMoved.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookProjectCardMoved` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookProjectCardMoved.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      // validate the optional field `changes`
      if (jsonObj.get("changes") != null && !jsonObj.get("changes").isJsonNull()) {
        WebhookProjectCardMovedChanges.validateJsonObject(jsonObj.getAsJsonObject("changes"));
      }
      // validate the optional field `enterprise`
      if (jsonObj.get("enterprise") != null && !jsonObj.get("enterprise").isJsonNull()) {
        Enterprise.validateJsonObject(jsonObj.getAsJsonObject("enterprise"));
      }
      // validate the optional field `installation`
      if (jsonObj.get("installation") != null && !jsonObj.get("installation").isJsonNull()) {
        SimpleInstallation.validateJsonObject(jsonObj.getAsJsonObject("installation"));
      }
      // validate the optional field `organization`
      if (jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonNull()) {
        OrganizationSimple.validateJsonObject(jsonObj.getAsJsonObject("organization"));
      }
      // validate the required field `project_card`
      WebhookProjectCardMovedProjectCard.validateJsonObject(jsonObj.getAsJsonObject("project_card"));
      // validate the optional field `repository`
      if (jsonObj.get("repository") != null && !jsonObj.get("repository").isJsonNull()) {
        Repository.validateJsonObject(jsonObj.getAsJsonObject("repository"));
      }
      // validate the required field `sender`
      SimpleUser.validateJsonObject(jsonObj.getAsJsonObject("sender"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookProjectCardMoved.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookProjectCardMoved' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookProjectCardMoved> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookProjectCardMoved.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookProjectCardMoved>() {
           @Override
           public void write(JsonWriter out, WebhookProjectCardMoved value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookProjectCardMoved read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookProjectCardMoved given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookProjectCardMoved
  * @throws IOException if the JSON string is invalid with respect to WebhookProjectCardMoved
  */
  public static WebhookProjectCardMoved fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookProjectCardMoved.class);
  }

 /**
  * Convert an instance of WebhookProjectCardMoved to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

