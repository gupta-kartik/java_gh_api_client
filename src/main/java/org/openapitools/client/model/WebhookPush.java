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
import org.openapitools.client.model.Commit;
import org.openapitools.client.model.Commit1;
import org.openapitools.client.model.Committer1;
import org.openapitools.client.model.Enterprise;
import org.openapitools.client.model.OrganizationSimple;
import org.openapitools.client.model.Repository2;
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
 * WebhookPush
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookPush {
  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private String after;

  public static final String SERIALIZED_NAME_BASE_REF = "base_ref";
  @SerializedName(SERIALIZED_NAME_BASE_REF)
  private String baseRef;

  public static final String SERIALIZED_NAME_BEFORE = "before";
  @SerializedName(SERIALIZED_NAME_BEFORE)
  private String before;

  public static final String SERIALIZED_NAME_COMMITS = "commits";
  @SerializedName(SERIALIZED_NAME_COMMITS)
  private List<Commit> commits = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMPARE = "compare";
  @SerializedName(SERIALIZED_NAME_COMPARE)
  private String compare;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Boolean created;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_ENTERPRISE = "enterprise";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE)
  private Enterprise enterprise;

  public static final String SERIALIZED_NAME_FORCED = "forced";
  @SerializedName(SERIALIZED_NAME_FORCED)
  private Boolean forced;

  public static final String SERIALIZED_NAME_HEAD_COMMIT = "head_commit";
  @SerializedName(SERIALIZED_NAME_HEAD_COMMIT)
  private Commit1 headCommit;

  public static final String SERIALIZED_NAME_INSTALLATION = "installation";
  @SerializedName(SERIALIZED_NAME_INSTALLATION)
  private SimpleInstallation installation;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private OrganizationSimple organization;

  public static final String SERIALIZED_NAME_PUSHER = "pusher";
  @SerializedName(SERIALIZED_NAME_PUSHER)
  private Committer1 pusher;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private Repository2 repository;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private SimpleUser sender;

  public WebhookPush() {
  }

  public WebhookPush after(String after) {
    
    this.after = after;
    return this;
  }

   /**
   * The SHA of the most recent commit on &#x60;ref&#x60; after the push.
   * @return after
  **/
  @javax.annotation.Nonnull

  public String getAfter() {
    return after;
  }


  public void setAfter(String after) {
    this.after = after;
  }


  public WebhookPush baseRef(String baseRef) {
    
    this.baseRef = baseRef;
    return this;
  }

   /**
   * Get baseRef
   * @return baseRef
  **/
  @javax.annotation.Nullable

  public String getBaseRef() {
    return baseRef;
  }


  public void setBaseRef(String baseRef) {
    this.baseRef = baseRef;
  }


  public WebhookPush before(String before) {
    
    this.before = before;
    return this;
  }

   /**
   * The SHA of the most recent commit on &#x60;ref&#x60; before the push.
   * @return before
  **/
  @javax.annotation.Nonnull

  public String getBefore() {
    return before;
  }


  public void setBefore(String before) {
    this.before = before;
  }


  public WebhookPush commits(List<Commit> commits) {
    
    this.commits = commits;
    return this;
  }

  public WebhookPush addCommitsItem(Commit commitsItem) {
    if (this.commits == null) {
      this.commits = new ArrayList<>();
    }
    this.commits.add(commitsItem);
    return this;
  }

   /**
   * An array of commit objects describing the pushed commits. (Pushed commits are all commits that are included in the &#x60;compare&#x60; between the &#x60;before&#x60; commit and the &#x60;after&#x60; commit.) The array includes a maximum of 20 commits. If necessary, you can use the [Commits API](https://docs.github.com/rest/reference/repos#commits) to fetch additional commits. This limit is applied to timeline events only and isn&#39;t applied to webhook deliveries.
   * @return commits
  **/
  @javax.annotation.Nonnull

  public List<Commit> getCommits() {
    return commits;
  }


  public void setCommits(List<Commit> commits) {
    this.commits = commits;
  }


  public WebhookPush compare(String compare) {
    
    this.compare = compare;
    return this;
  }

   /**
   * URL that shows the changes in this &#x60;ref&#x60; update, from the &#x60;before&#x60; commit to the &#x60;after&#x60; commit. For a newly created &#x60;ref&#x60; that is directly based on the default branch, this is the comparison between the head of the default branch and the &#x60;after&#x60; commit. Otherwise, this shows all commits until the &#x60;after&#x60; commit.
   * @return compare
  **/
  @javax.annotation.Nonnull

  public String getCompare() {
    return compare;
  }


  public void setCompare(String compare) {
    this.compare = compare;
  }


  public WebhookPush created(Boolean created) {
    
    this.created = created;
    return this;
  }

   /**
   * Whether this push created the &#x60;ref&#x60;.
   * @return created
  **/
  @javax.annotation.Nonnull

  public Boolean getCreated() {
    return created;
  }


  public void setCreated(Boolean created) {
    this.created = created;
  }


  public WebhookPush deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Whether this push deleted the &#x60;ref&#x60;.
   * @return deleted
  **/
  @javax.annotation.Nonnull

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public WebhookPush enterprise(Enterprise enterprise) {
    
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


  public WebhookPush forced(Boolean forced) {
    
    this.forced = forced;
    return this;
  }

   /**
   * Whether this push was a force push of the &#x60;ref&#x60;.
   * @return forced
  **/
  @javax.annotation.Nonnull

  public Boolean getForced() {
    return forced;
  }


  public void setForced(Boolean forced) {
    this.forced = forced;
  }


  public WebhookPush headCommit(Commit1 headCommit) {
    
    this.headCommit = headCommit;
    return this;
  }

   /**
   * Get headCommit
   * @return headCommit
  **/
  @javax.annotation.Nullable

  public Commit1 getHeadCommit() {
    return headCommit;
  }


  public void setHeadCommit(Commit1 headCommit) {
    this.headCommit = headCommit;
  }


  public WebhookPush installation(SimpleInstallation installation) {
    
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


  public WebhookPush organization(OrganizationSimple organization) {
    
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


  public WebhookPush pusher(Committer1 pusher) {
    
    this.pusher = pusher;
    return this;
  }

   /**
   * Get pusher
   * @return pusher
  **/
  @javax.annotation.Nonnull

  public Committer1 getPusher() {
    return pusher;
  }


  public void setPusher(Committer1 pusher) {
    this.pusher = pusher;
  }


  public WebhookPush ref(String ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * The full git ref that was pushed. Example: &#x60;refs/heads/main&#x60; or &#x60;refs/tags/v3.14.1&#x60;.
   * @return ref
  **/
  @javax.annotation.Nonnull

  public String getRef() {
    return ref;
  }


  public void setRef(String ref) {
    this.ref = ref;
  }


  public WebhookPush repository(Repository2 repository) {
    
    this.repository = repository;
    return this;
  }

   /**
   * Get repository
   * @return repository
  **/
  @javax.annotation.Nonnull

  public Repository2 getRepository() {
    return repository;
  }


  public void setRepository(Repository2 repository) {
    this.repository = repository;
  }


  public WebhookPush sender(SimpleUser sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @javax.annotation.Nullable

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
    WebhookPush webhookPush = (WebhookPush) o;
    return Objects.equals(this.after, webhookPush.after) &&
        Objects.equals(this.baseRef, webhookPush.baseRef) &&
        Objects.equals(this.before, webhookPush.before) &&
        Objects.equals(this.commits, webhookPush.commits) &&
        Objects.equals(this.compare, webhookPush.compare) &&
        Objects.equals(this.created, webhookPush.created) &&
        Objects.equals(this.deleted, webhookPush.deleted) &&
        Objects.equals(this.enterprise, webhookPush.enterprise) &&
        Objects.equals(this.forced, webhookPush.forced) &&
        Objects.equals(this.headCommit, webhookPush.headCommit) &&
        Objects.equals(this.installation, webhookPush.installation) &&
        Objects.equals(this.organization, webhookPush.organization) &&
        Objects.equals(this.pusher, webhookPush.pusher) &&
        Objects.equals(this.ref, webhookPush.ref) &&
        Objects.equals(this.repository, webhookPush.repository) &&
        Objects.equals(this.sender, webhookPush.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, baseRef, before, commits, compare, created, deleted, enterprise, forced, headCommit, installation, organization, pusher, ref, repository, sender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPush {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    baseRef: ").append(toIndentedString(baseRef)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
    sb.append("    compare: ").append(toIndentedString(compare)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
    sb.append("    forced: ").append(toIndentedString(forced)).append("\n");
    sb.append("    headCommit: ").append(toIndentedString(headCommit)).append("\n");
    sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    pusher: ").append(toIndentedString(pusher)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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
    openapiFields.add("after");
    openapiFields.add("base_ref");
    openapiFields.add("before");
    openapiFields.add("commits");
    openapiFields.add("compare");
    openapiFields.add("created");
    openapiFields.add("deleted");
    openapiFields.add("enterprise");
    openapiFields.add("forced");
    openapiFields.add("head_commit");
    openapiFields.add("installation");
    openapiFields.add("organization");
    openapiFields.add("pusher");
    openapiFields.add("ref");
    openapiFields.add("repository");
    openapiFields.add("sender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("after");
    openapiRequiredFields.add("base_ref");
    openapiRequiredFields.add("before");
    openapiRequiredFields.add("commits");
    openapiRequiredFields.add("compare");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("deleted");
    openapiRequiredFields.add("forced");
    openapiRequiredFields.add("head_commit");
    openapiRequiredFields.add("pusher");
    openapiRequiredFields.add("ref");
    openapiRequiredFields.add("repository");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookPush
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookPush.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookPush is not found in the empty JSON string", WebhookPush.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookPush.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookPush` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookPush.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("after").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `after` to be a primitive type in the JSON string but got `%s`", jsonObj.get("after").toString()));
      }
      if (!jsonObj.get("base_ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `base_ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("base_ref").toString()));
      }
      if (!jsonObj.get("before").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `before` to be a primitive type in the JSON string but got `%s`", jsonObj.get("before").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("commits").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `commits` to be an array in the JSON string but got `%s`", jsonObj.get("commits").toString()));
      }

      JsonArray jsonArraycommits = jsonObj.getAsJsonArray("commits");
      // validate the required field `commits` (array)
      for (int i = 0; i < jsonArraycommits.size(); i++) {
        Commit.validateJsonObject(jsonArraycommits.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("compare").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `compare` to be a primitive type in the JSON string but got `%s`", jsonObj.get("compare").toString()));
      }
      // validate the optional field `enterprise`
      if (jsonObj.get("enterprise") != null && !jsonObj.get("enterprise").isJsonNull()) {
        Enterprise.validateJsonObject(jsonObj.getAsJsonObject("enterprise"));
      }
      // validate the required field `head_commit`
      Commit1.validateJsonObject(jsonObj.getAsJsonObject("head_commit"));
      // validate the optional field `installation`
      if (jsonObj.get("installation") != null && !jsonObj.get("installation").isJsonNull()) {
        SimpleInstallation.validateJsonObject(jsonObj.getAsJsonObject("installation"));
      }
      // validate the optional field `organization`
      if (jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonNull()) {
        OrganizationSimple.validateJsonObject(jsonObj.getAsJsonObject("organization"));
      }
      // validate the required field `pusher`
      Committer1.validateJsonObject(jsonObj.getAsJsonObject("pusher"));
      if (!jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      // validate the required field `repository`
      Repository2.validateJsonObject(jsonObj.getAsJsonObject("repository"));
      // validate the optional field `sender`
      if (jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonNull()) {
        SimpleUser.validateJsonObject(jsonObj.getAsJsonObject("sender"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookPush.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookPush' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookPush> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookPush.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookPush>() {
           @Override
           public void write(JsonWriter out, WebhookPush value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookPush read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookPush given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookPush
  * @throws IOException if the JSON string is invalid with respect to WebhookPush
  */
  public static WebhookPush fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookPush.class);
  }

 /**
  * Convert an instance of WebhookPush to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

