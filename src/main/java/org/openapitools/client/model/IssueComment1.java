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
import org.openapitools.client.model.NullableIntegration;
import org.openapitools.client.model.Reactions;
import org.openapitools.client.model.User1;

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
 * The [comment](https://docs.github.com/rest/reference/issues#comments) itself.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class IssueComment1 {
  /**
   * How the author is associated with the repository.
   */
  @JsonAdapter(AuthorAssociationEnum.Adapter.class)
  public enum AuthorAssociationEnum {
    COLLABORATOR("COLLABORATOR"),
    
    CONTRIBUTOR("CONTRIBUTOR"),
    
    FIRST_TIMER("FIRST_TIMER"),
    
    FIRST_TIME_CONTRIBUTOR("FIRST_TIME_CONTRIBUTOR"),
    
    MANNEQUIN("MANNEQUIN"),
    
    MEMBER("MEMBER"),
    
    NONE("NONE"),
    
    OWNER("OWNER");

    private String value;

    AuthorAssociationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthorAssociationEnum fromValue(String value) {
      for (AuthorAssociationEnum b : AuthorAssociationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthorAssociationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthorAssociationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthorAssociationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthorAssociationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTHOR_ASSOCIATION = "author_association";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ASSOCIATION)
  private AuthorAssociationEnum authorAssociation;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_ISSUE_URL = "issue_url";
  @SerializedName(SERIALIZED_NAME_ISSUE_URL)
  private URI issueUrl;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_PERFORMED_VIA_GITHUB_APP = "performed_via_github_app";
  @SerializedName(SERIALIZED_NAME_PERFORMED_VIA_GITHUB_APP)
  private NullableIntegration performedViaGithubApp;

  public static final String SERIALIZED_NAME_REACTIONS = "reactions";
  @SerializedName(SERIALIZED_NAME_REACTIONS)
  private Reactions reactions;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User1 user;

  public IssueComment1() {
  }

  public IssueComment1 authorAssociation(AuthorAssociationEnum authorAssociation) {
    
    this.authorAssociation = authorAssociation;
    return this;
  }

   /**
   * How the author is associated with the repository.
   * @return authorAssociation
  **/
  @javax.annotation.Nonnull

  public AuthorAssociationEnum getAuthorAssociation() {
    return authorAssociation;
  }


  public void setAuthorAssociation(AuthorAssociationEnum authorAssociation) {
    this.authorAssociation = authorAssociation;
  }


  public IssueComment1 body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Contents of the issue comment
   * @return body
  **/
  @javax.annotation.Nonnull

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public IssueComment1 createdAt(OffsetDateTime createdAt) {
    
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


  public IssueComment1 htmlUrl(URI htmlUrl) {
    
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


  public IssueComment1 id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the issue comment
   * @return id
  **/
  @javax.annotation.Nonnull

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public IssueComment1 issueUrl(URI issueUrl) {
    
    this.issueUrl = issueUrl;
    return this;
  }

   /**
   * Get issueUrl
   * @return issueUrl
  **/
  @javax.annotation.Nonnull

  public URI getIssueUrl() {
    return issueUrl;
  }


  public void setIssueUrl(URI issueUrl) {
    this.issueUrl = issueUrl;
  }


  public IssueComment1 nodeId(String nodeId) {
    
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


  public IssueComment1 performedViaGithubApp(NullableIntegration performedViaGithubApp) {
    
    this.performedViaGithubApp = performedViaGithubApp;
    return this;
  }

   /**
   * Get performedViaGithubApp
   * @return performedViaGithubApp
  **/
  @javax.annotation.Nullable

  public NullableIntegration getPerformedViaGithubApp() {
    return performedViaGithubApp;
  }


  public void setPerformedViaGithubApp(NullableIntegration performedViaGithubApp) {
    this.performedViaGithubApp = performedViaGithubApp;
  }


  public IssueComment1 reactions(Reactions reactions) {
    
    this.reactions = reactions;
    return this;
  }

   /**
   * Get reactions
   * @return reactions
  **/
  @javax.annotation.Nonnull

  public Reactions getReactions() {
    return reactions;
  }


  public void setReactions(Reactions reactions) {
    this.reactions = reactions;
  }


  public IssueComment1 updatedAt(OffsetDateTime updatedAt) {
    
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


  public IssueComment1 url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL for the issue comment
   * @return url
  **/
  @javax.annotation.Nonnull

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public IssueComment1 user(User1 user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable

  public User1 getUser() {
    return user;
  }


  public void setUser(User1 user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueComment1 issueComment1 = (IssueComment1) o;
    return Objects.equals(this.authorAssociation, issueComment1.authorAssociation) &&
        Objects.equals(this.body, issueComment1.body) &&
        Objects.equals(this.createdAt, issueComment1.createdAt) &&
        Objects.equals(this.htmlUrl, issueComment1.htmlUrl) &&
        Objects.equals(this.id, issueComment1.id) &&
        Objects.equals(this.issueUrl, issueComment1.issueUrl) &&
        Objects.equals(this.nodeId, issueComment1.nodeId) &&
        Objects.equals(this.performedViaGithubApp, issueComment1.performedViaGithubApp) &&
        Objects.equals(this.reactions, issueComment1.reactions) &&
        Objects.equals(this.updatedAt, issueComment1.updatedAt) &&
        Objects.equals(this.url, issueComment1.url) &&
        Objects.equals(this.user, issueComment1.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorAssociation, body, createdAt, htmlUrl, id, issueUrl, nodeId, performedViaGithubApp, reactions, updatedAt, url, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueComment1 {\n");
    sb.append("    authorAssociation: ").append(toIndentedString(authorAssociation)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueUrl: ").append(toIndentedString(issueUrl)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    performedViaGithubApp: ").append(toIndentedString(performedViaGithubApp)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("author_association");
    openapiFields.add("body");
    openapiFields.add("created_at");
    openapiFields.add("html_url");
    openapiFields.add("id");
    openapiFields.add("issue_url");
    openapiFields.add("node_id");
    openapiFields.add("performed_via_github_app");
    openapiFields.add("reactions");
    openapiFields.add("updated_at");
    openapiFields.add("url");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("author_association");
    openapiRequiredFields.add("body");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("issue_url");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("performed_via_github_app");
    openapiRequiredFields.add("reactions");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueComment1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IssueComment1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueComment1 is not found in the empty JSON string", IssueComment1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueComment1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueComment1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssueComment1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("author_association").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_association` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_association").toString()));
      }
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (!jsonObj.get("issue_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_url").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      // validate the required field `performed_via_github_app`
      NullableIntegration.validateJsonObject(jsonObj.getAsJsonObject("performed_via_github_app"));
      // validate the required field `reactions`
      Reactions.validateJsonObject(jsonObj.getAsJsonObject("reactions"));
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the required field `user`
      User1.validateJsonObject(jsonObj.getAsJsonObject("user"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueComment1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueComment1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueComment1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueComment1.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueComment1>() {
           @Override
           public void write(JsonWriter out, IssueComment1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueComment1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueComment1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueComment1
  * @throws IOException if the JSON string is invalid with respect to IssueComment1
  */
  public static IssueComment1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueComment1.class);
  }

 /**
  * Convert an instance of IssueComment1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

