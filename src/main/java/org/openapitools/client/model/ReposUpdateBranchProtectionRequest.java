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
import org.openapitools.client.model.ReposUpdateBranchProtectionRequestRequiredPullRequestReviews;
import org.openapitools.client.model.ReposUpdateBranchProtectionRequestRequiredStatusChecks;
import org.openapitools.client.model.ReposUpdateBranchProtectionRequestRestrictions;
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
 * ReposUpdateBranchProtectionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ReposUpdateBranchProtectionRequest {
  public static final String SERIALIZED_NAME_REQUIRED_STATUS_CHECKS = "required_status_checks";
  @SerializedName(SERIALIZED_NAME_REQUIRED_STATUS_CHECKS)
  private ReposUpdateBranchProtectionRequestRequiredStatusChecks requiredStatusChecks;

  public static final String SERIALIZED_NAME_ENFORCE_ADMINS = "enforce_admins";
  @SerializedName(SERIALIZED_NAME_ENFORCE_ADMINS)
  private Boolean enforceAdmins;

  public static final String SERIALIZED_NAME_REQUIRED_PULL_REQUEST_REVIEWS = "required_pull_request_reviews";
  @SerializedName(SERIALIZED_NAME_REQUIRED_PULL_REQUEST_REVIEWS)
  private ReposUpdateBranchProtectionRequestRequiredPullRequestReviews requiredPullRequestReviews;

  public static final String SERIALIZED_NAME_RESTRICTIONS = "restrictions";
  @SerializedName(SERIALIZED_NAME_RESTRICTIONS)
  private ReposUpdateBranchProtectionRequestRestrictions restrictions;

  public static final String SERIALIZED_NAME_REQUIRED_LINEAR_HISTORY = "required_linear_history";
  @SerializedName(SERIALIZED_NAME_REQUIRED_LINEAR_HISTORY)
  private Boolean requiredLinearHistory;

  public static final String SERIALIZED_NAME_ALLOW_FORCE_PUSHES = "allow_force_pushes";
  @SerializedName(SERIALIZED_NAME_ALLOW_FORCE_PUSHES)
  private Boolean allowForcePushes;

  public static final String SERIALIZED_NAME_ALLOW_DELETIONS = "allow_deletions";
  @SerializedName(SERIALIZED_NAME_ALLOW_DELETIONS)
  private Boolean allowDeletions;

  public static final String SERIALIZED_NAME_BLOCK_CREATIONS = "block_creations";
  @SerializedName(SERIALIZED_NAME_BLOCK_CREATIONS)
  private Boolean blockCreations;

  public static final String SERIALIZED_NAME_REQUIRED_CONVERSATION_RESOLUTION = "required_conversation_resolution";
  @SerializedName(SERIALIZED_NAME_REQUIRED_CONVERSATION_RESOLUTION)
  private Boolean requiredConversationResolution;

  public static final String SERIALIZED_NAME_LOCK_BRANCH = "lock_branch";
  @SerializedName(SERIALIZED_NAME_LOCK_BRANCH)
  private Boolean lockBranch = false;

  public static final String SERIALIZED_NAME_ALLOW_FORK_SYNCING = "allow_fork_syncing";
  @SerializedName(SERIALIZED_NAME_ALLOW_FORK_SYNCING)
  private Boolean allowForkSyncing = false;

  public ReposUpdateBranchProtectionRequest() {
  }

  public ReposUpdateBranchProtectionRequest requiredStatusChecks(ReposUpdateBranchProtectionRequestRequiredStatusChecks requiredStatusChecks) {
    
    this.requiredStatusChecks = requiredStatusChecks;
    return this;
  }

   /**
   * Get requiredStatusChecks
   * @return requiredStatusChecks
  **/
  @javax.annotation.Nullable

  public ReposUpdateBranchProtectionRequestRequiredStatusChecks getRequiredStatusChecks() {
    return requiredStatusChecks;
  }


  public void setRequiredStatusChecks(ReposUpdateBranchProtectionRequestRequiredStatusChecks requiredStatusChecks) {
    this.requiredStatusChecks = requiredStatusChecks;
  }


  public ReposUpdateBranchProtectionRequest enforceAdmins(Boolean enforceAdmins) {
    
    this.enforceAdmins = enforceAdmins;
    return this;
  }

   /**
   * Enforce all configured restrictions for administrators. Set to &#x60;true&#x60; to enforce required status checks for repository administrators. Set to &#x60;null&#x60; to disable.
   * @return enforceAdmins
  **/
  @javax.annotation.Nullable

  public Boolean getEnforceAdmins() {
    return enforceAdmins;
  }


  public void setEnforceAdmins(Boolean enforceAdmins) {
    this.enforceAdmins = enforceAdmins;
  }


  public ReposUpdateBranchProtectionRequest requiredPullRequestReviews(ReposUpdateBranchProtectionRequestRequiredPullRequestReviews requiredPullRequestReviews) {
    
    this.requiredPullRequestReviews = requiredPullRequestReviews;
    return this;
  }

   /**
   * Get requiredPullRequestReviews
   * @return requiredPullRequestReviews
  **/
  @javax.annotation.Nullable

  public ReposUpdateBranchProtectionRequestRequiredPullRequestReviews getRequiredPullRequestReviews() {
    return requiredPullRequestReviews;
  }


  public void setRequiredPullRequestReviews(ReposUpdateBranchProtectionRequestRequiredPullRequestReviews requiredPullRequestReviews) {
    this.requiredPullRequestReviews = requiredPullRequestReviews;
  }


  public ReposUpdateBranchProtectionRequest restrictions(ReposUpdateBranchProtectionRequestRestrictions restrictions) {
    
    this.restrictions = restrictions;
    return this;
  }

   /**
   * Get restrictions
   * @return restrictions
  **/
  @javax.annotation.Nullable

  public ReposUpdateBranchProtectionRequestRestrictions getRestrictions() {
    return restrictions;
  }


  public void setRestrictions(ReposUpdateBranchProtectionRequestRestrictions restrictions) {
    this.restrictions = restrictions;
  }


  public ReposUpdateBranchProtectionRequest requiredLinearHistory(Boolean requiredLinearHistory) {
    
    this.requiredLinearHistory = requiredLinearHistory;
    return this;
  }

   /**
   * Enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch. Set to &#x60;true&#x60; to enforce a linear commit history. Set to &#x60;false&#x60; to disable a linear commit Git history. Your repository must allow squash merging or rebase merging before you can enable a linear commit history. Default: &#x60;false&#x60;. For more information, see \&quot;[Requiring a linear commit history](https://docs.github.com/github/administering-a-repository/requiring-a-linear-commit-history)\&quot; in the GitHub Help documentation.
   * @return requiredLinearHistory
  **/
  @javax.annotation.Nullable

  public Boolean getRequiredLinearHistory() {
    return requiredLinearHistory;
  }


  public void setRequiredLinearHistory(Boolean requiredLinearHistory) {
    this.requiredLinearHistory = requiredLinearHistory;
  }


  public ReposUpdateBranchProtectionRequest allowForcePushes(Boolean allowForcePushes) {
    
    this.allowForcePushes = allowForcePushes;
    return this;
  }

   /**
   * Permits force pushes to the protected branch by anyone with write access to the repository. Set to &#x60;true&#x60; to allow force pushes. Set to &#x60;false&#x60; or &#x60;null&#x60; to block force pushes. Default: &#x60;false&#x60;. For more information, see \&quot;[Enabling force pushes to a protected branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)\&quot; in the GitHub Help documentation.\&quot;
   * @return allowForcePushes
  **/
  @javax.annotation.Nullable

  public Boolean getAllowForcePushes() {
    return allowForcePushes;
  }


  public void setAllowForcePushes(Boolean allowForcePushes) {
    this.allowForcePushes = allowForcePushes;
  }


  public ReposUpdateBranchProtectionRequest allowDeletions(Boolean allowDeletions) {
    
    this.allowDeletions = allowDeletions;
    return this;
  }

   /**
   * Allows deletion of the protected branch by anyone with write access to the repository. Set to &#x60;false&#x60; to prevent deletion of the protected branch. Default: &#x60;false&#x60;. For more information, see \&quot;[Enabling force pushes to a protected branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)\&quot; in the GitHub Help documentation.
   * @return allowDeletions
  **/
  @javax.annotation.Nullable

  public Boolean getAllowDeletions() {
    return allowDeletions;
  }


  public void setAllowDeletions(Boolean allowDeletions) {
    this.allowDeletions = allowDeletions;
  }


  public ReposUpdateBranchProtectionRequest blockCreations(Boolean blockCreations) {
    
    this.blockCreations = blockCreations;
    return this;
  }

   /**
   * If set to &#x60;true&#x60;, the &#x60;restrictions&#x60; branch protection settings which limits who can push will also block pushes which create new branches, unless the push is initiated by a user, team, or app which has the ability to push. Set to &#x60;true&#x60; to restrict new branch creation. Default: &#x60;false&#x60;.
   * @return blockCreations
  **/
  @javax.annotation.Nullable

  public Boolean getBlockCreations() {
    return blockCreations;
  }


  public void setBlockCreations(Boolean blockCreations) {
    this.blockCreations = blockCreations;
  }


  public ReposUpdateBranchProtectionRequest requiredConversationResolution(Boolean requiredConversationResolution) {
    
    this.requiredConversationResolution = requiredConversationResolution;
    return this;
  }

   /**
   * Requires all conversations on code to be resolved before a pull request can be merged into a branch that matches this rule. Set to &#x60;false&#x60; to disable. Default: &#x60;false&#x60;.
   * @return requiredConversationResolution
  **/
  @javax.annotation.Nullable

  public Boolean getRequiredConversationResolution() {
    return requiredConversationResolution;
  }


  public void setRequiredConversationResolution(Boolean requiredConversationResolution) {
    this.requiredConversationResolution = requiredConversationResolution;
  }


  public ReposUpdateBranchProtectionRequest lockBranch(Boolean lockBranch) {
    
    this.lockBranch = lockBranch;
    return this;
  }

   /**
   * Whether to set the branch as read-only. If this is true, users will not be able to push to the branch. Default: &#x60;false&#x60;.
   * @return lockBranch
  **/
  @javax.annotation.Nullable

  public Boolean getLockBranch() {
    return lockBranch;
  }


  public void setLockBranch(Boolean lockBranch) {
    this.lockBranch = lockBranch;
  }


  public ReposUpdateBranchProtectionRequest allowForkSyncing(Boolean allowForkSyncing) {
    
    this.allowForkSyncing = allowForkSyncing;
    return this;
  }

   /**
   * Whether users can pull changes from upstream when the branch is locked. Set to &#x60;true&#x60; to allow fork syncing. Set to &#x60;false&#x60; to prevent fork syncing. Default: &#x60;false&#x60;.
   * @return allowForkSyncing
  **/
  @javax.annotation.Nullable

  public Boolean getAllowForkSyncing() {
    return allowForkSyncing;
  }


  public void setAllowForkSyncing(Boolean allowForkSyncing) {
    this.allowForkSyncing = allowForkSyncing;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReposUpdateBranchProtectionRequest reposUpdateBranchProtectionRequest = (ReposUpdateBranchProtectionRequest) o;
    return Objects.equals(this.requiredStatusChecks, reposUpdateBranchProtectionRequest.requiredStatusChecks) &&
        Objects.equals(this.enforceAdmins, reposUpdateBranchProtectionRequest.enforceAdmins) &&
        Objects.equals(this.requiredPullRequestReviews, reposUpdateBranchProtectionRequest.requiredPullRequestReviews) &&
        Objects.equals(this.restrictions, reposUpdateBranchProtectionRequest.restrictions) &&
        Objects.equals(this.requiredLinearHistory, reposUpdateBranchProtectionRequest.requiredLinearHistory) &&
        Objects.equals(this.allowForcePushes, reposUpdateBranchProtectionRequest.allowForcePushes) &&
        Objects.equals(this.allowDeletions, reposUpdateBranchProtectionRequest.allowDeletions) &&
        Objects.equals(this.blockCreations, reposUpdateBranchProtectionRequest.blockCreations) &&
        Objects.equals(this.requiredConversationResolution, reposUpdateBranchProtectionRequest.requiredConversationResolution) &&
        Objects.equals(this.lockBranch, reposUpdateBranchProtectionRequest.lockBranch) &&
        Objects.equals(this.allowForkSyncing, reposUpdateBranchProtectionRequest.allowForkSyncing);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredStatusChecks, enforceAdmins, requiredPullRequestReviews, restrictions, requiredLinearHistory, allowForcePushes, allowDeletions, blockCreations, requiredConversationResolution, lockBranch, allowForkSyncing);
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
    sb.append("class ReposUpdateBranchProtectionRequest {\n");
    sb.append("    requiredStatusChecks: ").append(toIndentedString(requiredStatusChecks)).append("\n");
    sb.append("    enforceAdmins: ").append(toIndentedString(enforceAdmins)).append("\n");
    sb.append("    requiredPullRequestReviews: ").append(toIndentedString(requiredPullRequestReviews)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
    sb.append("    requiredLinearHistory: ").append(toIndentedString(requiredLinearHistory)).append("\n");
    sb.append("    allowForcePushes: ").append(toIndentedString(allowForcePushes)).append("\n");
    sb.append("    allowDeletions: ").append(toIndentedString(allowDeletions)).append("\n");
    sb.append("    blockCreations: ").append(toIndentedString(blockCreations)).append("\n");
    sb.append("    requiredConversationResolution: ").append(toIndentedString(requiredConversationResolution)).append("\n");
    sb.append("    lockBranch: ").append(toIndentedString(lockBranch)).append("\n");
    sb.append("    allowForkSyncing: ").append(toIndentedString(allowForkSyncing)).append("\n");
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
    openapiFields.add("required_status_checks");
    openapiFields.add("enforce_admins");
    openapiFields.add("required_pull_request_reviews");
    openapiFields.add("restrictions");
    openapiFields.add("required_linear_history");
    openapiFields.add("allow_force_pushes");
    openapiFields.add("allow_deletions");
    openapiFields.add("block_creations");
    openapiFields.add("required_conversation_resolution");
    openapiFields.add("lock_branch");
    openapiFields.add("allow_fork_syncing");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("required_status_checks");
    openapiRequiredFields.add("enforce_admins");
    openapiRequiredFields.add("required_pull_request_reviews");
    openapiRequiredFields.add("restrictions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReposUpdateBranchProtectionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReposUpdateBranchProtectionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReposUpdateBranchProtectionRequest is not found in the empty JSON string", ReposUpdateBranchProtectionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReposUpdateBranchProtectionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReposUpdateBranchProtectionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReposUpdateBranchProtectionRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `required_status_checks`
      ReposUpdateBranchProtectionRequestRequiredStatusChecks.validateJsonObject(jsonObj.getAsJsonObject("required_status_checks"));
      // validate the required field `required_pull_request_reviews`
      ReposUpdateBranchProtectionRequestRequiredPullRequestReviews.validateJsonObject(jsonObj.getAsJsonObject("required_pull_request_reviews"));
      // validate the required field `restrictions`
      ReposUpdateBranchProtectionRequestRestrictions.validateJsonObject(jsonObj.getAsJsonObject("restrictions"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReposUpdateBranchProtectionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReposUpdateBranchProtectionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReposUpdateBranchProtectionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReposUpdateBranchProtectionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReposUpdateBranchProtectionRequest>() {
           @Override
           public void write(JsonWriter out, ReposUpdateBranchProtectionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReposUpdateBranchProtectionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReposUpdateBranchProtectionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReposUpdateBranchProtectionRequest
  * @throws IOException if the JSON string is invalid with respect to ReposUpdateBranchProtectionRequest
  */
  public static ReposUpdateBranchProtectionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReposUpdateBranchProtectionRequest.class);
  }

 /**
  * Convert an instance of ReposUpdateBranchProtectionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

