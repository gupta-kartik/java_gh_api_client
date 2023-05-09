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
import org.openapitools.client.model.ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances;
import org.openapitools.client.model.ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions;

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
 * ReposUpdatePullRequestReviewProtectionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ReposUpdatePullRequestReviewProtectionRequest {
  public static final String SERIALIZED_NAME_DISMISSAL_RESTRICTIONS = "dismissal_restrictions";
  @SerializedName(SERIALIZED_NAME_DISMISSAL_RESTRICTIONS)
  private ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions dismissalRestrictions;

  public static final String SERIALIZED_NAME_DISMISS_STALE_REVIEWS = "dismiss_stale_reviews";
  @SerializedName(SERIALIZED_NAME_DISMISS_STALE_REVIEWS)
  private Boolean dismissStaleReviews;

  public static final String SERIALIZED_NAME_REQUIRE_CODE_OWNER_REVIEWS = "require_code_owner_reviews";
  @SerializedName(SERIALIZED_NAME_REQUIRE_CODE_OWNER_REVIEWS)
  private Boolean requireCodeOwnerReviews;

  public static final String SERIALIZED_NAME_REQUIRED_APPROVING_REVIEW_COUNT = "required_approving_review_count";
  @SerializedName(SERIALIZED_NAME_REQUIRED_APPROVING_REVIEW_COUNT)
  private Integer requiredApprovingReviewCount;

  public static final String SERIALIZED_NAME_REQUIRE_LAST_PUSH_APPROVAL = "require_last_push_approval";
  @SerializedName(SERIALIZED_NAME_REQUIRE_LAST_PUSH_APPROVAL)
  private Boolean requireLastPushApproval = false;

  public static final String SERIALIZED_NAME_BYPASS_PULL_REQUEST_ALLOWANCES = "bypass_pull_request_allowances";
  @SerializedName(SERIALIZED_NAME_BYPASS_PULL_REQUEST_ALLOWANCES)
  private ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances bypassPullRequestAllowances;

  public ReposUpdatePullRequestReviewProtectionRequest() {
  }

  public ReposUpdatePullRequestReviewProtectionRequest dismissalRestrictions(ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions dismissalRestrictions) {
    
    this.dismissalRestrictions = dismissalRestrictions;
    return this;
  }

   /**
   * Get dismissalRestrictions
   * @return dismissalRestrictions
  **/
  @javax.annotation.Nullable

  public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions getDismissalRestrictions() {
    return dismissalRestrictions;
  }


  public void setDismissalRestrictions(ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions dismissalRestrictions) {
    this.dismissalRestrictions = dismissalRestrictions;
  }


  public ReposUpdatePullRequestReviewProtectionRequest dismissStaleReviews(Boolean dismissStaleReviews) {
    
    this.dismissStaleReviews = dismissStaleReviews;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; if you want to automatically dismiss approving reviews when someone pushes a new commit.
   * @return dismissStaleReviews
  **/
  @javax.annotation.Nullable

  public Boolean getDismissStaleReviews() {
    return dismissStaleReviews;
  }


  public void setDismissStaleReviews(Boolean dismissStaleReviews) {
    this.dismissStaleReviews = dismissStaleReviews;
  }


  public ReposUpdatePullRequestReviewProtectionRequest requireCodeOwnerReviews(Boolean requireCodeOwnerReviews) {
    
    this.requireCodeOwnerReviews = requireCodeOwnerReviews;
    return this;
  }

   /**
   * Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) have reviewed.
   * @return requireCodeOwnerReviews
  **/
  @javax.annotation.Nullable

  public Boolean getRequireCodeOwnerReviews() {
    return requireCodeOwnerReviews;
  }


  public void setRequireCodeOwnerReviews(Boolean requireCodeOwnerReviews) {
    this.requireCodeOwnerReviews = requireCodeOwnerReviews;
  }


  public ReposUpdatePullRequestReviewProtectionRequest requiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
    
    this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    return this;
  }

   /**
   * Specifies the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not require reviewers.
   * @return requiredApprovingReviewCount
  **/
  @javax.annotation.Nullable

  public Integer getRequiredApprovingReviewCount() {
    return requiredApprovingReviewCount;
  }


  public void setRequiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
    this.requiredApprovingReviewCount = requiredApprovingReviewCount;
  }


  public ReposUpdatePullRequestReviewProtectionRequest requireLastPushApproval(Boolean requireLastPushApproval) {
    
    this.requireLastPushApproval = requireLastPushApproval;
    return this;
  }

   /**
   * Whether the most recent push must be approved by someone other than the person who pushed it. Default: &#x60;false&#x60;
   * @return requireLastPushApproval
  **/
  @javax.annotation.Nullable

  public Boolean getRequireLastPushApproval() {
    return requireLastPushApproval;
  }


  public void setRequireLastPushApproval(Boolean requireLastPushApproval) {
    this.requireLastPushApproval = requireLastPushApproval;
  }


  public ReposUpdatePullRequestReviewProtectionRequest bypassPullRequestAllowances(ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances bypassPullRequestAllowances) {
    
    this.bypassPullRequestAllowances = bypassPullRequestAllowances;
    return this;
  }

   /**
   * Get bypassPullRequestAllowances
   * @return bypassPullRequestAllowances
  **/
  @javax.annotation.Nullable

  public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances getBypassPullRequestAllowances() {
    return bypassPullRequestAllowances;
  }


  public void setBypassPullRequestAllowances(ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances bypassPullRequestAllowances) {
    this.bypassPullRequestAllowances = bypassPullRequestAllowances;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReposUpdatePullRequestReviewProtectionRequest reposUpdatePullRequestReviewProtectionRequest = (ReposUpdatePullRequestReviewProtectionRequest) o;
    return Objects.equals(this.dismissalRestrictions, reposUpdatePullRequestReviewProtectionRequest.dismissalRestrictions) &&
        Objects.equals(this.dismissStaleReviews, reposUpdatePullRequestReviewProtectionRequest.dismissStaleReviews) &&
        Objects.equals(this.requireCodeOwnerReviews, reposUpdatePullRequestReviewProtectionRequest.requireCodeOwnerReviews) &&
        Objects.equals(this.requiredApprovingReviewCount, reposUpdatePullRequestReviewProtectionRequest.requiredApprovingReviewCount) &&
        Objects.equals(this.requireLastPushApproval, reposUpdatePullRequestReviewProtectionRequest.requireLastPushApproval) &&
        Objects.equals(this.bypassPullRequestAllowances, reposUpdatePullRequestReviewProtectionRequest.bypassPullRequestAllowances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dismissalRestrictions, dismissStaleReviews, requireCodeOwnerReviews, requiredApprovingReviewCount, requireLastPushApproval, bypassPullRequestAllowances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReposUpdatePullRequestReviewProtectionRequest {\n");
    sb.append("    dismissalRestrictions: ").append(toIndentedString(dismissalRestrictions)).append("\n");
    sb.append("    dismissStaleReviews: ").append(toIndentedString(dismissStaleReviews)).append("\n");
    sb.append("    requireCodeOwnerReviews: ").append(toIndentedString(requireCodeOwnerReviews)).append("\n");
    sb.append("    requiredApprovingReviewCount: ").append(toIndentedString(requiredApprovingReviewCount)).append("\n");
    sb.append("    requireLastPushApproval: ").append(toIndentedString(requireLastPushApproval)).append("\n");
    sb.append("    bypassPullRequestAllowances: ").append(toIndentedString(bypassPullRequestAllowances)).append("\n");
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
    openapiFields.add("dismissal_restrictions");
    openapiFields.add("dismiss_stale_reviews");
    openapiFields.add("require_code_owner_reviews");
    openapiFields.add("required_approving_review_count");
    openapiFields.add("require_last_push_approval");
    openapiFields.add("bypass_pull_request_allowances");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReposUpdatePullRequestReviewProtectionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReposUpdatePullRequestReviewProtectionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReposUpdatePullRequestReviewProtectionRequest is not found in the empty JSON string", ReposUpdatePullRequestReviewProtectionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReposUpdatePullRequestReviewProtectionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReposUpdatePullRequestReviewProtectionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `dismissal_restrictions`
      if (jsonObj.get("dismissal_restrictions") != null && !jsonObj.get("dismissal_restrictions").isJsonNull()) {
        ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions.validateJsonObject(jsonObj.getAsJsonObject("dismissal_restrictions"));
      }
      // validate the optional field `bypass_pull_request_allowances`
      if (jsonObj.get("bypass_pull_request_allowances") != null && !jsonObj.get("bypass_pull_request_allowances").isJsonNull()) {
        ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances.validateJsonObject(jsonObj.getAsJsonObject("bypass_pull_request_allowances"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReposUpdatePullRequestReviewProtectionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReposUpdatePullRequestReviewProtectionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReposUpdatePullRequestReviewProtectionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReposUpdatePullRequestReviewProtectionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReposUpdatePullRequestReviewProtectionRequest>() {
           @Override
           public void write(JsonWriter out, ReposUpdatePullRequestReviewProtectionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReposUpdatePullRequestReviewProtectionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReposUpdatePullRequestReviewProtectionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReposUpdatePullRequestReviewProtectionRequest
  * @throws IOException if the JSON string is invalid with respect to ReposUpdatePullRequestReviewProtectionRequest
  */
  public static ReposUpdatePullRequestReviewProtectionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReposUpdatePullRequestReviewProtectionRequest.class);
  }

 /**
  * Convert an instance of ReposUpdatePullRequestReviewProtectionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
