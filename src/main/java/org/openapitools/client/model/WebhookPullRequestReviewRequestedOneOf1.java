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
import org.openapitools.client.model.PullRequest10;
import org.openapitools.client.model.Repository;
import org.openapitools.client.model.SimpleInstallation;
import org.openapitools.client.model.SimpleUser;
import org.openapitools.client.model.Team2;

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
 * WebhookPullRequestReviewRequestedOneOf1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookPullRequestReviewRequestedOneOf1 {
  /**
   * Gets or Sets action
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    REVIEW_REQUESTED("review_requested");

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

  public static final String SERIALIZED_NAME_ENTERPRISE = "enterprise";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE)
  private Enterprise enterprise;

  public static final String SERIALIZED_NAME_INSTALLATION = "installation";
  @SerializedName(SERIALIZED_NAME_INSTALLATION)
  private SimpleInstallation installation;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private OrganizationSimple organization;

  public static final String SERIALIZED_NAME_PULL_REQUEST = "pull_request";
  @SerializedName(SERIALIZED_NAME_PULL_REQUEST)
  private PullRequest10 pullRequest;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private Repository repository;

  public static final String SERIALIZED_NAME_REQUESTED_TEAM = "requested_team";
  @SerializedName(SERIALIZED_NAME_REQUESTED_TEAM)
  private Team2 requestedTeam;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private SimpleUser sender;

  public WebhookPullRequestReviewRequestedOneOf1() {
  }

  public WebhookPullRequestReviewRequestedOneOf1 action(ActionEnum action) {
    
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


  public WebhookPullRequestReviewRequestedOneOf1 enterprise(Enterprise enterprise) {
    
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


  public WebhookPullRequestReviewRequestedOneOf1 installation(SimpleInstallation installation) {
    
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


  public WebhookPullRequestReviewRequestedOneOf1 number(Integer number) {
    
    this.number = number;
    return this;
  }

   /**
   * The pull request number.
   * @return number
  **/
  @javax.annotation.Nonnull

  public Integer getNumber() {
    return number;
  }


  public void setNumber(Integer number) {
    this.number = number;
  }


  public WebhookPullRequestReviewRequestedOneOf1 organization(OrganizationSimple organization) {
    
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


  public WebhookPullRequestReviewRequestedOneOf1 pullRequest(PullRequest10 pullRequest) {
    
    this.pullRequest = pullRequest;
    return this;
  }

   /**
   * Get pullRequest
   * @return pullRequest
  **/
  @javax.annotation.Nonnull

  public PullRequest10 getPullRequest() {
    return pullRequest;
  }


  public void setPullRequest(PullRequest10 pullRequest) {
    this.pullRequest = pullRequest;
  }


  public WebhookPullRequestReviewRequestedOneOf1 repository(Repository repository) {
    
    this.repository = repository;
    return this;
  }

   /**
   * Get repository
   * @return repository
  **/
  @javax.annotation.Nonnull

  public Repository getRepository() {
    return repository;
  }


  public void setRepository(Repository repository) {
    this.repository = repository;
  }


  public WebhookPullRequestReviewRequestedOneOf1 requestedTeam(Team2 requestedTeam) {
    
    this.requestedTeam = requestedTeam;
    return this;
  }

   /**
   * Get requestedTeam
   * @return requestedTeam
  **/
  @javax.annotation.Nonnull

  public Team2 getRequestedTeam() {
    return requestedTeam;
  }


  public void setRequestedTeam(Team2 requestedTeam) {
    this.requestedTeam = requestedTeam;
  }


  public WebhookPullRequestReviewRequestedOneOf1 sender(SimpleUser sender) {
    
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
    WebhookPullRequestReviewRequestedOneOf1 webhookPullRequestReviewRequestedOneOf1 = (WebhookPullRequestReviewRequestedOneOf1) o;
    return Objects.equals(this.action, webhookPullRequestReviewRequestedOneOf1.action) &&
        Objects.equals(this.enterprise, webhookPullRequestReviewRequestedOneOf1.enterprise) &&
        Objects.equals(this.installation, webhookPullRequestReviewRequestedOneOf1.installation) &&
        Objects.equals(this.number, webhookPullRequestReviewRequestedOneOf1.number) &&
        Objects.equals(this.organization, webhookPullRequestReviewRequestedOneOf1.organization) &&
        Objects.equals(this.pullRequest, webhookPullRequestReviewRequestedOneOf1.pullRequest) &&
        Objects.equals(this.repository, webhookPullRequestReviewRequestedOneOf1.repository) &&
        Objects.equals(this.requestedTeam, webhookPullRequestReviewRequestedOneOf1.requestedTeam) &&
        Objects.equals(this.sender, webhookPullRequestReviewRequestedOneOf1.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, enterprise, installation, number, organization, pullRequest, repository, requestedTeam, sender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPullRequestReviewRequestedOneOf1 {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
    sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    requestedTeam: ").append(toIndentedString(requestedTeam)).append("\n");
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
    openapiFields.add("enterprise");
    openapiFields.add("installation");
    openapiFields.add("number");
    openapiFields.add("organization");
    openapiFields.add("pull_request");
    openapiFields.add("repository");
    openapiFields.add("requested_team");
    openapiFields.add("sender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("pull_request");
    openapiRequiredFields.add("repository");
    openapiRequiredFields.add("requested_team");
    openapiRequiredFields.add("sender");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookPullRequestReviewRequestedOneOf1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookPullRequestReviewRequestedOneOf1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookPullRequestReviewRequestedOneOf1 is not found in the empty JSON string", WebhookPullRequestReviewRequestedOneOf1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookPullRequestReviewRequestedOneOf1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookPullRequestReviewRequestedOneOf1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookPullRequestReviewRequestedOneOf1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
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
      // validate the required field `pull_request`
      PullRequest10.validateJsonObject(jsonObj.getAsJsonObject("pull_request"));
      // validate the required field `repository`
      Repository.validateJsonObject(jsonObj.getAsJsonObject("repository"));
      // validate the required field `requested_team`
      Team2.validateJsonObject(jsonObj.getAsJsonObject("requested_team"));
      // validate the required field `sender`
      SimpleUser.validateJsonObject(jsonObj.getAsJsonObject("sender"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookPullRequestReviewRequestedOneOf1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookPullRequestReviewRequestedOneOf1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookPullRequestReviewRequestedOneOf1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookPullRequestReviewRequestedOneOf1.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookPullRequestReviewRequestedOneOf1>() {
           @Override
           public void write(JsonWriter out, WebhookPullRequestReviewRequestedOneOf1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookPullRequestReviewRequestedOneOf1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookPullRequestReviewRequestedOneOf1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookPullRequestReviewRequestedOneOf1
  * @throws IOException if the JSON string is invalid with respect to WebhookPullRequestReviewRequestedOneOf1
  */
  public static WebhookPullRequestReviewRequestedOneOf1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookPullRequestReviewRequestedOneOf1.class);
  }

 /**
  * Convert an instance of WebhookPullRequestReviewRequestedOneOf1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

