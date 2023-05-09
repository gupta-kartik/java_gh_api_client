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
import java.time.OffsetDateTime;
import org.openapitools.client.model.MinimalRepository;
import org.openapitools.client.model.NullableSimpleUser;

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
 * Repository invitations let you manage who you collaborate with.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class RepositoryInvitation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private MinimalRepository repository;

  public static final String SERIALIZED_NAME_INVITEE = "invitee";
  @SerializedName(SERIALIZED_NAME_INVITEE)
  private NullableSimpleUser invitee;

  public static final String SERIALIZED_NAME_INVITER = "inviter";
  @SerializedName(SERIALIZED_NAME_INVITER)
  private NullableSimpleUser inviter;

  /**
   * The permission associated with the invitation.
   */
  @JsonAdapter(PermissionsEnum.Adapter.class)
  public enum PermissionsEnum {
    READ("read"),
    
    WRITE("write"),
    
    ADMIN("admin"),
    
    TRIAGE("triage"),
    
    MAINTAIN("maintain");

    private String value;

    PermissionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionsEnum fromValue(String value) {
      for (PermissionsEnum b : PermissionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PermissionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PermissionsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private PermissionsEnum permissions;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EXPIRED = "expired";
  @SerializedName(SERIALIZED_NAME_EXPIRED)
  private Boolean expired;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private String htmlUrl;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public RepositoryInvitation() {
  }

  public RepositoryInvitation id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the repository invitation.
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public RepositoryInvitation repository(MinimalRepository repository) {
    
    this.repository = repository;
    return this;
  }

   /**
   * Get repository
   * @return repository
  **/
  @javax.annotation.Nonnull

  public MinimalRepository getRepository() {
    return repository;
  }


  public void setRepository(MinimalRepository repository) {
    this.repository = repository;
  }


  public RepositoryInvitation invitee(NullableSimpleUser invitee) {
    
    this.invitee = invitee;
    return this;
  }

   /**
   * Get invitee
   * @return invitee
  **/
  @javax.annotation.Nullable

  public NullableSimpleUser getInvitee() {
    return invitee;
  }


  public void setInvitee(NullableSimpleUser invitee) {
    this.invitee = invitee;
  }


  public RepositoryInvitation inviter(NullableSimpleUser inviter) {
    
    this.inviter = inviter;
    return this;
  }

   /**
   * Get inviter
   * @return inviter
  **/
  @javax.annotation.Nullable

  public NullableSimpleUser getInviter() {
    return inviter;
  }


  public void setInviter(NullableSimpleUser inviter) {
    this.inviter = inviter;
  }


  public RepositoryInvitation permissions(PermissionsEnum permissions) {
    
    this.permissions = permissions;
    return this;
  }

   /**
   * The permission associated with the invitation.
   * @return permissions
  **/
  @javax.annotation.Nonnull

  public PermissionsEnum getPermissions() {
    return permissions;
  }


  public void setPermissions(PermissionsEnum permissions) {
    this.permissions = permissions;
  }


  public RepositoryInvitation createdAt(OffsetDateTime createdAt) {
    
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


  public RepositoryInvitation expired(Boolean expired) {
    
    this.expired = expired;
    return this;
  }

   /**
   * Whether or not the invitation has expired
   * @return expired
  **/
  @javax.annotation.Nullable

  public Boolean getExpired() {
    return expired;
  }


  public void setExpired(Boolean expired) {
    this.expired = expired;
  }


  public RepositoryInvitation url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL for the repository invitation
   * @return url
  **/
  @javax.annotation.Nonnull

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public RepositoryInvitation htmlUrl(String htmlUrl) {
    
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @javax.annotation.Nonnull

  public String getHtmlUrl() {
    return htmlUrl;
  }


  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }


  public RepositoryInvitation nodeId(String nodeId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryInvitation repositoryInvitation = (RepositoryInvitation) o;
    return Objects.equals(this.id, repositoryInvitation.id) &&
        Objects.equals(this.repository, repositoryInvitation.repository) &&
        Objects.equals(this.invitee, repositoryInvitation.invitee) &&
        Objects.equals(this.inviter, repositoryInvitation.inviter) &&
        Objects.equals(this.permissions, repositoryInvitation.permissions) &&
        Objects.equals(this.createdAt, repositoryInvitation.createdAt) &&
        Objects.equals(this.expired, repositoryInvitation.expired) &&
        Objects.equals(this.url, repositoryInvitation.url) &&
        Objects.equals(this.htmlUrl, repositoryInvitation.htmlUrl) &&
        Objects.equals(this.nodeId, repositoryInvitation.nodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, repository, invitee, inviter, permissions, createdAt, expired, url, htmlUrl, nodeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryInvitation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    invitee: ").append(toIndentedString(invitee)).append("\n");
    sb.append("    inviter: ").append(toIndentedString(inviter)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
    openapiFields.add("repository");
    openapiFields.add("invitee");
    openapiFields.add("inviter");
    openapiFields.add("permissions");
    openapiFields.add("created_at");
    openapiFields.add("expired");
    openapiFields.add("url");
    openapiFields.add("html_url");
    openapiFields.add("node_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("repository");
    openapiRequiredFields.add("invitee");
    openapiRequiredFields.add("inviter");
    openapiRequiredFields.add("permissions");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("node_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RepositoryInvitation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RepositoryInvitation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RepositoryInvitation is not found in the empty JSON string", RepositoryInvitation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RepositoryInvitation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RepositoryInvitation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RepositoryInvitation.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `repository`
      MinimalRepository.validateJsonObject(jsonObj.getAsJsonObject("repository"));
      // validate the required field `invitee`
      NullableSimpleUser.validateJsonObject(jsonObj.getAsJsonObject("invitee"));
      // validate the required field `inviter`
      NullableSimpleUser.validateJsonObject(jsonObj.getAsJsonObject("inviter"));
      if (!jsonObj.get("permissions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RepositoryInvitation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RepositoryInvitation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RepositoryInvitation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RepositoryInvitation.class));

       return (TypeAdapter<T>) new TypeAdapter<RepositoryInvitation>() {
           @Override
           public void write(JsonWriter out, RepositoryInvitation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RepositoryInvitation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RepositoryInvitation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RepositoryInvitation
  * @throws IOException if the JSON string is invalid with respect to RepositoryInvitation
  */
  public static RepositoryInvitation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RepositoryInvitation.class);
  }

 /**
  * Convert an instance of RepositoryInvitation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
