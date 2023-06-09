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
 * A GitHub user.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class SimpleUser {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_AVATAR_URL = "avatar_url";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private URI avatarUrl;

  public static final String SERIALIZED_NAME_GRAVATAR_ID = "gravatar_id";
  @SerializedName(SERIALIZED_NAME_GRAVATAR_ID)
  private String gravatarId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_FOLLOWERS_URL = "followers_url";
  @SerializedName(SERIALIZED_NAME_FOLLOWERS_URL)
  private URI followersUrl;

  public static final String SERIALIZED_NAME_FOLLOWING_URL = "following_url";
  @SerializedName(SERIALIZED_NAME_FOLLOWING_URL)
  private String followingUrl;

  public static final String SERIALIZED_NAME_GISTS_URL = "gists_url";
  @SerializedName(SERIALIZED_NAME_GISTS_URL)
  private String gistsUrl;

  public static final String SERIALIZED_NAME_STARRED_URL = "starred_url";
  @SerializedName(SERIALIZED_NAME_STARRED_URL)
  private String starredUrl;

  public static final String SERIALIZED_NAME_SUBSCRIPTIONS_URL = "subscriptions_url";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONS_URL)
  private URI subscriptionsUrl;

  public static final String SERIALIZED_NAME_ORGANIZATIONS_URL = "organizations_url";
  @SerializedName(SERIALIZED_NAME_ORGANIZATIONS_URL)
  private URI organizationsUrl;

  public static final String SERIALIZED_NAME_REPOS_URL = "repos_url";
  @SerializedName(SERIALIZED_NAME_REPOS_URL)
  private URI reposUrl;

  public static final String SERIALIZED_NAME_EVENTS_URL = "events_url";
  @SerializedName(SERIALIZED_NAME_EVENTS_URL)
  private String eventsUrl;

  public static final String SERIALIZED_NAME_RECEIVED_EVENTS_URL = "received_events_url";
  @SerializedName(SERIALIZED_NAME_RECEIVED_EVENTS_URL)
  private URI receivedEventsUrl;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SITE_ADMIN = "site_admin";
  @SerializedName(SERIALIZED_NAME_SITE_ADMIN)
  private Boolean siteAdmin;

  public static final String SERIALIZED_NAME_STARRED_AT = "starred_at";
  @SerializedName(SERIALIZED_NAME_STARRED_AT)
  private String starredAt;

  public SimpleUser() {
  }

  public SimpleUser name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SimpleUser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public SimpleUser login(String login) {
    
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @javax.annotation.Nonnull

  public String getLogin() {
    return login;
  }


  public void setLogin(String login) {
    this.login = login;
  }


  public SimpleUser id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public SimpleUser nodeId(String nodeId) {
    
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


  public SimpleUser avatarUrl(URI avatarUrl) {
    
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @javax.annotation.Nonnull

  public URI getAvatarUrl() {
    return avatarUrl;
  }


  public void setAvatarUrl(URI avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public SimpleUser gravatarId(String gravatarId) {
    
    this.gravatarId = gravatarId;
    return this;
  }

   /**
   * Get gravatarId
   * @return gravatarId
  **/
  @javax.annotation.Nullable

  public String getGravatarId() {
    return gravatarId;
  }


  public void setGravatarId(String gravatarId) {
    this.gravatarId = gravatarId;
  }


  public SimpleUser url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public SimpleUser htmlUrl(URI htmlUrl) {
    
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


  public SimpleUser followersUrl(URI followersUrl) {
    
    this.followersUrl = followersUrl;
    return this;
  }

   /**
   * Get followersUrl
   * @return followersUrl
  **/
  @javax.annotation.Nonnull

  public URI getFollowersUrl() {
    return followersUrl;
  }


  public void setFollowersUrl(URI followersUrl) {
    this.followersUrl = followersUrl;
  }


  public SimpleUser followingUrl(String followingUrl) {
    
    this.followingUrl = followingUrl;
    return this;
  }

   /**
   * Get followingUrl
   * @return followingUrl
  **/
  @javax.annotation.Nonnull

  public String getFollowingUrl() {
    return followingUrl;
  }


  public void setFollowingUrl(String followingUrl) {
    this.followingUrl = followingUrl;
  }


  public SimpleUser gistsUrl(String gistsUrl) {
    
    this.gistsUrl = gistsUrl;
    return this;
  }

   /**
   * Get gistsUrl
   * @return gistsUrl
  **/
  @javax.annotation.Nonnull

  public String getGistsUrl() {
    return gistsUrl;
  }


  public void setGistsUrl(String gistsUrl) {
    this.gistsUrl = gistsUrl;
  }


  public SimpleUser starredUrl(String starredUrl) {
    
    this.starredUrl = starredUrl;
    return this;
  }

   /**
   * Get starredUrl
   * @return starredUrl
  **/
  @javax.annotation.Nonnull

  public String getStarredUrl() {
    return starredUrl;
  }


  public void setStarredUrl(String starredUrl) {
    this.starredUrl = starredUrl;
  }


  public SimpleUser subscriptionsUrl(URI subscriptionsUrl) {
    
    this.subscriptionsUrl = subscriptionsUrl;
    return this;
  }

   /**
   * Get subscriptionsUrl
   * @return subscriptionsUrl
  **/
  @javax.annotation.Nonnull

  public URI getSubscriptionsUrl() {
    return subscriptionsUrl;
  }


  public void setSubscriptionsUrl(URI subscriptionsUrl) {
    this.subscriptionsUrl = subscriptionsUrl;
  }


  public SimpleUser organizationsUrl(URI organizationsUrl) {
    
    this.organizationsUrl = organizationsUrl;
    return this;
  }

   /**
   * Get organizationsUrl
   * @return organizationsUrl
  **/
  @javax.annotation.Nonnull

  public URI getOrganizationsUrl() {
    return organizationsUrl;
  }


  public void setOrganizationsUrl(URI organizationsUrl) {
    this.organizationsUrl = organizationsUrl;
  }


  public SimpleUser reposUrl(URI reposUrl) {
    
    this.reposUrl = reposUrl;
    return this;
  }

   /**
   * Get reposUrl
   * @return reposUrl
  **/
  @javax.annotation.Nonnull

  public URI getReposUrl() {
    return reposUrl;
  }


  public void setReposUrl(URI reposUrl) {
    this.reposUrl = reposUrl;
  }


  public SimpleUser eventsUrl(String eventsUrl) {
    
    this.eventsUrl = eventsUrl;
    return this;
  }

   /**
   * Get eventsUrl
   * @return eventsUrl
  **/
  @javax.annotation.Nonnull

  public String getEventsUrl() {
    return eventsUrl;
  }


  public void setEventsUrl(String eventsUrl) {
    this.eventsUrl = eventsUrl;
  }


  public SimpleUser receivedEventsUrl(URI receivedEventsUrl) {
    
    this.receivedEventsUrl = receivedEventsUrl;
    return this;
  }

   /**
   * Get receivedEventsUrl
   * @return receivedEventsUrl
  **/
  @javax.annotation.Nonnull

  public URI getReceivedEventsUrl() {
    return receivedEventsUrl;
  }


  public void setReceivedEventsUrl(URI receivedEventsUrl) {
    this.receivedEventsUrl = receivedEventsUrl;
  }


  public SimpleUser type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public SimpleUser siteAdmin(Boolean siteAdmin) {
    
    this.siteAdmin = siteAdmin;
    return this;
  }

   /**
   * Get siteAdmin
   * @return siteAdmin
  **/
  @javax.annotation.Nonnull

  public Boolean getSiteAdmin() {
    return siteAdmin;
  }


  public void setSiteAdmin(Boolean siteAdmin) {
    this.siteAdmin = siteAdmin;
  }


  public SimpleUser starredAt(String starredAt) {
    
    this.starredAt = starredAt;
    return this;
  }

   /**
   * Get starredAt
   * @return starredAt
  **/
  @javax.annotation.Nullable

  public String getStarredAt() {
    return starredAt;
  }


  public void setStarredAt(String starredAt) {
    this.starredAt = starredAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleUser simpleUser = (SimpleUser) o;
    return Objects.equals(this.name, simpleUser.name) &&
        Objects.equals(this.email, simpleUser.email) &&
        Objects.equals(this.login, simpleUser.login) &&
        Objects.equals(this.id, simpleUser.id) &&
        Objects.equals(this.nodeId, simpleUser.nodeId) &&
        Objects.equals(this.avatarUrl, simpleUser.avatarUrl) &&
        Objects.equals(this.gravatarId, simpleUser.gravatarId) &&
        Objects.equals(this.url, simpleUser.url) &&
        Objects.equals(this.htmlUrl, simpleUser.htmlUrl) &&
        Objects.equals(this.followersUrl, simpleUser.followersUrl) &&
        Objects.equals(this.followingUrl, simpleUser.followingUrl) &&
        Objects.equals(this.gistsUrl, simpleUser.gistsUrl) &&
        Objects.equals(this.starredUrl, simpleUser.starredUrl) &&
        Objects.equals(this.subscriptionsUrl, simpleUser.subscriptionsUrl) &&
        Objects.equals(this.organizationsUrl, simpleUser.organizationsUrl) &&
        Objects.equals(this.reposUrl, simpleUser.reposUrl) &&
        Objects.equals(this.eventsUrl, simpleUser.eventsUrl) &&
        Objects.equals(this.receivedEventsUrl, simpleUser.receivedEventsUrl) &&
        Objects.equals(this.type, simpleUser.type) &&
        Objects.equals(this.siteAdmin, simpleUser.siteAdmin) &&
        Objects.equals(this.starredAt, simpleUser.starredAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, login, id, nodeId, avatarUrl, gravatarId, url, htmlUrl, followersUrl, followingUrl, gistsUrl, starredUrl, subscriptionsUrl, organizationsUrl, reposUrl, eventsUrl, receivedEventsUrl, type, siteAdmin, starredAt);
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
    sb.append("class SimpleUser {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    gravatarId: ").append(toIndentedString(gravatarId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    followersUrl: ").append(toIndentedString(followersUrl)).append("\n");
    sb.append("    followingUrl: ").append(toIndentedString(followingUrl)).append("\n");
    sb.append("    gistsUrl: ").append(toIndentedString(gistsUrl)).append("\n");
    sb.append("    starredUrl: ").append(toIndentedString(starredUrl)).append("\n");
    sb.append("    subscriptionsUrl: ").append(toIndentedString(subscriptionsUrl)).append("\n");
    sb.append("    organizationsUrl: ").append(toIndentedString(organizationsUrl)).append("\n");
    sb.append("    reposUrl: ").append(toIndentedString(reposUrl)).append("\n");
    sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
    sb.append("    receivedEventsUrl: ").append(toIndentedString(receivedEventsUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    siteAdmin: ").append(toIndentedString(siteAdmin)).append("\n");
    sb.append("    starredAt: ").append(toIndentedString(starredAt)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("login");
    openapiFields.add("id");
    openapiFields.add("node_id");
    openapiFields.add("avatar_url");
    openapiFields.add("gravatar_id");
    openapiFields.add("url");
    openapiFields.add("html_url");
    openapiFields.add("followers_url");
    openapiFields.add("following_url");
    openapiFields.add("gists_url");
    openapiFields.add("starred_url");
    openapiFields.add("subscriptions_url");
    openapiFields.add("organizations_url");
    openapiFields.add("repos_url");
    openapiFields.add("events_url");
    openapiFields.add("received_events_url");
    openapiFields.add("type");
    openapiFields.add("site_admin");
    openapiFields.add("starred_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("login");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("avatar_url");
    openapiRequiredFields.add("gravatar_id");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("followers_url");
    openapiRequiredFields.add("following_url");
    openapiRequiredFields.add("gists_url");
    openapiRequiredFields.add("starred_url");
    openapiRequiredFields.add("subscriptions_url");
    openapiRequiredFields.add("organizations_url");
    openapiRequiredFields.add("repos_url");
    openapiRequiredFields.add("events_url");
    openapiRequiredFields.add("received_events_url");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("site_admin");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SimpleUser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SimpleUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimpleUser is not found in the empty JSON string", SimpleUser.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SimpleUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimpleUser` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SimpleUser.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("login").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if (!jsonObj.get("avatar_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar_url").toString()));
      }
      if (!jsonObj.get("gravatar_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gravatar_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gravatar_id").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (!jsonObj.get("followers_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `followers_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("followers_url").toString()));
      }
      if (!jsonObj.get("following_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `following_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("following_url").toString()));
      }
      if (!jsonObj.get("gists_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gists_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gists_url").toString()));
      }
      if (!jsonObj.get("starred_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `starred_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("starred_url").toString()));
      }
      if (!jsonObj.get("subscriptions_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptions_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptions_url").toString()));
      }
      if (!jsonObj.get("organizations_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizations_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organizations_url").toString()));
      }
      if (!jsonObj.get("repos_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repos_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repos_url").toString()));
      }
      if (!jsonObj.get("events_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `events_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("events_url").toString()));
      }
      if (!jsonObj.get("received_events_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `received_events_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("received_events_url").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("starred_at") != null && !jsonObj.get("starred_at").isJsonNull()) && !jsonObj.get("starred_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `starred_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("starred_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimpleUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimpleUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimpleUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimpleUser.class));

       return (TypeAdapter<T>) new TypeAdapter<SimpleUser>() {
           @Override
           public void write(JsonWriter out, SimpleUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimpleUser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SimpleUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimpleUser
  * @throws IOException if the JSON string is invalid with respect to SimpleUser
  */
  public static SimpleUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimpleUser.class);
  }

 /**
  * Convert an instance of SimpleUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

