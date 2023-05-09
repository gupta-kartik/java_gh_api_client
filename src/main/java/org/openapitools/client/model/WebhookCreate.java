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
 * WebhookCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookCreate {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENTERPRISE = "enterprise";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE)
  private Enterprise enterprise;

  public static final String SERIALIZED_NAME_INSTALLATION = "installation";
  @SerializedName(SERIALIZED_NAME_INSTALLATION)
  private SimpleInstallation installation;

  public static final String SERIALIZED_NAME_MASTER_BRANCH = "master_branch";
  @SerializedName(SERIALIZED_NAME_MASTER_BRANCH)
  private String masterBranch;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private OrganizationSimple organization;

  public static final String SERIALIZED_NAME_PUSHER_TYPE = "pusher_type";
  @SerializedName(SERIALIZED_NAME_PUSHER_TYPE)
  private String pusherType;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  /**
   * The type of Git ref object created in the repository.
   */
  @JsonAdapter(RefTypeEnum.Adapter.class)
  public enum RefTypeEnum {
    TAG("tag"),
    
    BRANCH("branch");

    private String value;

    RefTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RefTypeEnum fromValue(String value) {
      for (RefTypeEnum b : RefTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RefTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RefTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RefTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RefTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REF_TYPE = "ref_type";
  @SerializedName(SERIALIZED_NAME_REF_TYPE)
  private RefTypeEnum refType;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private Repository repository;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private SimpleUser sender;

  public WebhookCreate() {
  }

  public WebhookCreate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The repository&#39;s current description.
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public WebhookCreate enterprise(Enterprise enterprise) {
    
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


  public WebhookCreate installation(SimpleInstallation installation) {
    
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


  public WebhookCreate masterBranch(String masterBranch) {
    
    this.masterBranch = masterBranch;
    return this;
  }

   /**
   * The name of the repository&#39;s default branch (usually &#x60;main&#x60;).
   * @return masterBranch
  **/
  @javax.annotation.Nonnull

  public String getMasterBranch() {
    return masterBranch;
  }


  public void setMasterBranch(String masterBranch) {
    this.masterBranch = masterBranch;
  }


  public WebhookCreate organization(OrganizationSimple organization) {
    
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


  public WebhookCreate pusherType(String pusherType) {
    
    this.pusherType = pusherType;
    return this;
  }

   /**
   * The pusher type for the event. Can be either &#x60;user&#x60; or a deploy key.
   * @return pusherType
  **/
  @javax.annotation.Nonnull

  public String getPusherType() {
    return pusherType;
  }


  public void setPusherType(String pusherType) {
    this.pusherType = pusherType;
  }


  public WebhookCreate ref(String ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * The [&#x60;git ref&#x60;](https://docs.github.com/rest/reference/git#get-a-reference) resource.
   * @return ref
  **/
  @javax.annotation.Nonnull

  public String getRef() {
    return ref;
  }


  public void setRef(String ref) {
    this.ref = ref;
  }


  public WebhookCreate refType(RefTypeEnum refType) {
    
    this.refType = refType;
    return this;
  }

   /**
   * The type of Git ref object created in the repository.
   * @return refType
  **/
  @javax.annotation.Nonnull

  public RefTypeEnum getRefType() {
    return refType;
  }


  public void setRefType(RefTypeEnum refType) {
    this.refType = refType;
  }


  public WebhookCreate repository(Repository repository) {
    
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


  public WebhookCreate sender(SimpleUser sender) {
    
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
    WebhookCreate webhookCreate = (WebhookCreate) o;
    return Objects.equals(this.description, webhookCreate.description) &&
        Objects.equals(this.enterprise, webhookCreate.enterprise) &&
        Objects.equals(this.installation, webhookCreate.installation) &&
        Objects.equals(this.masterBranch, webhookCreate.masterBranch) &&
        Objects.equals(this.organization, webhookCreate.organization) &&
        Objects.equals(this.pusherType, webhookCreate.pusherType) &&
        Objects.equals(this.ref, webhookCreate.ref) &&
        Objects.equals(this.refType, webhookCreate.refType) &&
        Objects.equals(this.repository, webhookCreate.repository) &&
        Objects.equals(this.sender, webhookCreate.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enterprise, installation, masterBranch, organization, pusherType, ref, refType, repository, sender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookCreate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
    sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
    sb.append("    masterBranch: ").append(toIndentedString(masterBranch)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    pusherType: ").append(toIndentedString(pusherType)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    refType: ").append(toIndentedString(refType)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("enterprise");
    openapiFields.add("installation");
    openapiFields.add("master_branch");
    openapiFields.add("organization");
    openapiFields.add("pusher_type");
    openapiFields.add("ref");
    openapiFields.add("ref_type");
    openapiFields.add("repository");
    openapiFields.add("sender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("master_branch");
    openapiRequiredFields.add("pusher_type");
    openapiRequiredFields.add("ref");
    openapiRequiredFields.add("ref_type");
    openapiRequiredFields.add("repository");
    openapiRequiredFields.add("sender");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookCreate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookCreate is not found in the empty JSON string", WebhookCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookCreate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookCreate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `enterprise`
      if (jsonObj.get("enterprise") != null && !jsonObj.get("enterprise").isJsonNull()) {
        Enterprise.validateJsonObject(jsonObj.getAsJsonObject("enterprise"));
      }
      // validate the optional field `installation`
      if (jsonObj.get("installation") != null && !jsonObj.get("installation").isJsonNull()) {
        SimpleInstallation.validateJsonObject(jsonObj.getAsJsonObject("installation"));
      }
      if (!jsonObj.get("master_branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `master_branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("master_branch").toString()));
      }
      // validate the optional field `organization`
      if (jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonNull()) {
        OrganizationSimple.validateJsonObject(jsonObj.getAsJsonObject("organization"));
      }
      if (!jsonObj.get("pusher_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pusher_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pusher_type").toString()));
      }
      if (!jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      if (!jsonObj.get("ref_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref_type").toString()));
      }
      // validate the required field `repository`
      Repository.validateJsonObject(jsonObj.getAsJsonObject("repository"));
      // validate the required field `sender`
      SimpleUser.validateJsonObject(jsonObj.getAsJsonObject("sender"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookCreate>() {
           @Override
           public void write(JsonWriter out, WebhookCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookCreate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookCreate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookCreate
  * @throws IOException if the JSON string is invalid with respect to WebhookCreate
  */
  public static WebhookCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookCreate.class);
  }

 /**
  * Convert an instance of WebhookCreate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

