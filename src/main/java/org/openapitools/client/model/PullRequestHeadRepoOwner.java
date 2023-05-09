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
 * PullRequestHeadRepoOwner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class PullRequestHeadRepoOwner {
  public static final String SERIALIZED_NAME_AVATAR_URL = "avatar_url";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private URI avatarUrl;

  public static final String SERIALIZED_NAME_EVENTS_URL = "events_url";
  @SerializedName(SERIALIZED_NAME_EVENTS_URL)
  private String eventsUrl;

  public static final String SERIALIZED_NAME_FOLLOWERS_URL = "followers_url";
  @SerializedName(SERIALIZED_NAME_FOLLOWERS_URL)
  private URI followersUrl;

  public static final String SERIALIZED_NAME_FOLLOWING_URL = "following_url";
  @SerializedName(SERIALIZED_NAME_FOLLOWING_URL)
  private String followingUrl;

  public static final String SERIALIZED_NAME_GISTS_URL = "gists_url";
  @SerializedName(SERIALIZED_NAME_GISTS_URL)
  private String gistsUrl;

  public static final String SERIALIZED_NAME_GRAVATAR_ID = "gravatar_id";
  @SerializedName(SERIALIZED_NAME_GRAVATAR_ID)
  private String gravatarId;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login;

  public static final String SERIALIZED_NAME_ORGANIZATIONS_URL = "organizations_url";
  @SerializedName(SERIALIZED_NAME_ORGANIZATIONS_URL)
  private URI organizationsUrl;

  public static final String SERIALIZED_NAME_RECEIVED_EVENTS_URL = "received_events_url";
  @SerializedName(SERIALIZED_NAME_RECEIVED_EVENTS_URL)
  private URI receivedEventsUrl;

  public static final String SERIALIZED_NAME_REPOS_URL = "repos_url";
  @SerializedName(SERIALIZED_NAME_REPOS_URL)
  private URI reposUrl;

  public static final String SERIALIZED_NAME_SITE_ADMIN = "site_admin";
  @SerializedName(SERIALIZED_NAME_SITE_ADMIN)
  private Boolean siteAdmin;

  public static final String SERIALIZED_NAME_STARRED_URL = "starred_url";
  @SerializedName(SERIALIZED_NAME_STARRED_URL)
  private String starredUrl;

  public static final String SERIALIZED_NAME_SUBSCRIPTIONS_URL = "subscriptions_url";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONS_URL)
  private URI subscriptionsUrl;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public PullRequestHeadRepoOwner() {
  }

  public PullRequestHeadRepoOwner avatarUrl(URI avatarUrl) {
    
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


  public PullRequestHeadRepoOwner eventsUrl(String eventsUrl) {
    
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


  public PullRequestHeadRepoOwner followersUrl(URI followersUrl) {
    
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


  public PullRequestHeadRepoOwner followingUrl(String followingUrl) {
    
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


  public PullRequestHeadRepoOwner gistsUrl(String gistsUrl) {
    
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


  public PullRequestHeadRepoOwner gravatarId(String gravatarId) {
    
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


  public PullRequestHeadRepoOwner htmlUrl(URI htmlUrl) {
    
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


  public PullRequestHeadRepoOwner id(Integer id) {
    
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


  public PullRequestHeadRepoOwner nodeId(String nodeId) {
    
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


  public PullRequestHeadRepoOwner login(String login) {
    
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


  public PullRequestHeadRepoOwner organizationsUrl(URI organizationsUrl) {
    
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


  public PullRequestHeadRepoOwner receivedEventsUrl(URI receivedEventsUrl) {
    
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


  public PullRequestHeadRepoOwner reposUrl(URI reposUrl) {
    
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


  public PullRequestHeadRepoOwner siteAdmin(Boolean siteAdmin) {
    
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


  public PullRequestHeadRepoOwner starredUrl(String starredUrl) {
    
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


  public PullRequestHeadRepoOwner subscriptionsUrl(URI subscriptionsUrl) {
    
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


  public PullRequestHeadRepoOwner type(String type) {
    
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


  public PullRequestHeadRepoOwner url(URI url) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PullRequestHeadRepoOwner pullRequestHeadRepoOwner = (PullRequestHeadRepoOwner) o;
    return Objects.equals(this.avatarUrl, pullRequestHeadRepoOwner.avatarUrl) &&
        Objects.equals(this.eventsUrl, pullRequestHeadRepoOwner.eventsUrl) &&
        Objects.equals(this.followersUrl, pullRequestHeadRepoOwner.followersUrl) &&
        Objects.equals(this.followingUrl, pullRequestHeadRepoOwner.followingUrl) &&
        Objects.equals(this.gistsUrl, pullRequestHeadRepoOwner.gistsUrl) &&
        Objects.equals(this.gravatarId, pullRequestHeadRepoOwner.gravatarId) &&
        Objects.equals(this.htmlUrl, pullRequestHeadRepoOwner.htmlUrl) &&
        Objects.equals(this.id, pullRequestHeadRepoOwner.id) &&
        Objects.equals(this.nodeId, pullRequestHeadRepoOwner.nodeId) &&
        Objects.equals(this.login, pullRequestHeadRepoOwner.login) &&
        Objects.equals(this.organizationsUrl, pullRequestHeadRepoOwner.organizationsUrl) &&
        Objects.equals(this.receivedEventsUrl, pullRequestHeadRepoOwner.receivedEventsUrl) &&
        Objects.equals(this.reposUrl, pullRequestHeadRepoOwner.reposUrl) &&
        Objects.equals(this.siteAdmin, pullRequestHeadRepoOwner.siteAdmin) &&
        Objects.equals(this.starredUrl, pullRequestHeadRepoOwner.starredUrl) &&
        Objects.equals(this.subscriptionsUrl, pullRequestHeadRepoOwner.subscriptionsUrl) &&
        Objects.equals(this.type, pullRequestHeadRepoOwner.type) &&
        Objects.equals(this.url, pullRequestHeadRepoOwner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, eventsUrl, followersUrl, followingUrl, gistsUrl, gravatarId, htmlUrl, id, nodeId, login, organizationsUrl, receivedEventsUrl, reposUrl, siteAdmin, starredUrl, subscriptionsUrl, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullRequestHeadRepoOwner {\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
    sb.append("    followersUrl: ").append(toIndentedString(followersUrl)).append("\n");
    sb.append("    followingUrl: ").append(toIndentedString(followingUrl)).append("\n");
    sb.append("    gistsUrl: ").append(toIndentedString(gistsUrl)).append("\n");
    sb.append("    gravatarId: ").append(toIndentedString(gravatarId)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    organizationsUrl: ").append(toIndentedString(organizationsUrl)).append("\n");
    sb.append("    receivedEventsUrl: ").append(toIndentedString(receivedEventsUrl)).append("\n");
    sb.append("    reposUrl: ").append(toIndentedString(reposUrl)).append("\n");
    sb.append("    siteAdmin: ").append(toIndentedString(siteAdmin)).append("\n");
    sb.append("    starredUrl: ").append(toIndentedString(starredUrl)).append("\n");
    sb.append("    subscriptionsUrl: ").append(toIndentedString(subscriptionsUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("avatar_url");
    openapiFields.add("events_url");
    openapiFields.add("followers_url");
    openapiFields.add("following_url");
    openapiFields.add("gists_url");
    openapiFields.add("gravatar_id");
    openapiFields.add("html_url");
    openapiFields.add("id");
    openapiFields.add("node_id");
    openapiFields.add("login");
    openapiFields.add("organizations_url");
    openapiFields.add("received_events_url");
    openapiFields.add("repos_url");
    openapiFields.add("site_admin");
    openapiFields.add("starred_url");
    openapiFields.add("subscriptions_url");
    openapiFields.add("type");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("avatar_url");
    openapiRequiredFields.add("events_url");
    openapiRequiredFields.add("followers_url");
    openapiRequiredFields.add("following_url");
    openapiRequiredFields.add("gists_url");
    openapiRequiredFields.add("gravatar_id");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("login");
    openapiRequiredFields.add("organizations_url");
    openapiRequiredFields.add("received_events_url");
    openapiRequiredFields.add("repos_url");
    openapiRequiredFields.add("site_admin");
    openapiRequiredFields.add("starred_url");
    openapiRequiredFields.add("subscriptions_url");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PullRequestHeadRepoOwner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PullRequestHeadRepoOwner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PullRequestHeadRepoOwner is not found in the empty JSON string", PullRequestHeadRepoOwner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PullRequestHeadRepoOwner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PullRequestHeadRepoOwner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PullRequestHeadRepoOwner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("avatar_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar_url").toString()));
      }
      if (!jsonObj.get("events_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `events_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("events_url").toString()));
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
      if (!jsonObj.get("gravatar_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gravatar_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gravatar_id").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if (!jsonObj.get("login").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login").toString()));
      }
      if (!jsonObj.get("organizations_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizations_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organizations_url").toString()));
      }
      if (!jsonObj.get("received_events_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `received_events_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("received_events_url").toString()));
      }
      if (!jsonObj.get("repos_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repos_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repos_url").toString()));
      }
      if (!jsonObj.get("starred_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `starred_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("starred_url").toString()));
      }
      if (!jsonObj.get("subscriptions_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptions_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptions_url").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PullRequestHeadRepoOwner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PullRequestHeadRepoOwner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PullRequestHeadRepoOwner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PullRequestHeadRepoOwner.class));

       return (TypeAdapter<T>) new TypeAdapter<PullRequestHeadRepoOwner>() {
           @Override
           public void write(JsonWriter out, PullRequestHeadRepoOwner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PullRequestHeadRepoOwner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PullRequestHeadRepoOwner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PullRequestHeadRepoOwner
  * @throws IOException if the JSON string is invalid with respect to PullRequestHeadRepoOwner
  */
  public static PullRequestHeadRepoOwner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PullRequestHeadRepoOwner.class);
  }

 /**
  * Convert an instance of PullRequestHeadRepoOwner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
