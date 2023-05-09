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
 * RepositoryRulePullRequestParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class RepositoryRulePullRequestParameters {
  public static final String SERIALIZED_NAME_DISMISS_STALE_REVIEWS_ON_PUSH = "dismiss_stale_reviews_on_push";
  @SerializedName(SERIALIZED_NAME_DISMISS_STALE_REVIEWS_ON_PUSH)
  private Boolean dismissStaleReviewsOnPush;

  public static final String SERIALIZED_NAME_REQUIRE_CODE_OWNER_REVIEW = "require_code_owner_review";
  @SerializedName(SERIALIZED_NAME_REQUIRE_CODE_OWNER_REVIEW)
  private Boolean requireCodeOwnerReview;

  public static final String SERIALIZED_NAME_REQUIRE_LAST_PUSH_APPROVAL = "require_last_push_approval";
  @SerializedName(SERIALIZED_NAME_REQUIRE_LAST_PUSH_APPROVAL)
  private Boolean requireLastPushApproval;

  public static final String SERIALIZED_NAME_REQUIRED_APPROVING_REVIEW_COUNT = "required_approving_review_count";
  @SerializedName(SERIALIZED_NAME_REQUIRED_APPROVING_REVIEW_COUNT)
  private Integer requiredApprovingReviewCount;

  public static final String SERIALIZED_NAME_REQUIRED_REVIEW_THREAD_RESOLUTION = "required_review_thread_resolution";
  @SerializedName(SERIALIZED_NAME_REQUIRED_REVIEW_THREAD_RESOLUTION)
  private Boolean requiredReviewThreadResolution;

  public RepositoryRulePullRequestParameters() {
  }

  public RepositoryRulePullRequestParameters dismissStaleReviewsOnPush(Boolean dismissStaleReviewsOnPush) {
    
    this.dismissStaleReviewsOnPush = dismissStaleReviewsOnPush;
    return this;
  }

   /**
   * New, reviewable commits pushed will dismiss previous pull request review approvals.
   * @return dismissStaleReviewsOnPush
  **/
  @javax.annotation.Nonnull

  public Boolean getDismissStaleReviewsOnPush() {
    return dismissStaleReviewsOnPush;
  }


  public void setDismissStaleReviewsOnPush(Boolean dismissStaleReviewsOnPush) {
    this.dismissStaleReviewsOnPush = dismissStaleReviewsOnPush;
  }


  public RepositoryRulePullRequestParameters requireCodeOwnerReview(Boolean requireCodeOwnerReview) {
    
    this.requireCodeOwnerReview = requireCodeOwnerReview;
    return this;
  }

   /**
   * Require an approving review in pull requests that modify files that have a designated code owner.
   * @return requireCodeOwnerReview
  **/
  @javax.annotation.Nonnull

  public Boolean getRequireCodeOwnerReview() {
    return requireCodeOwnerReview;
  }


  public void setRequireCodeOwnerReview(Boolean requireCodeOwnerReview) {
    this.requireCodeOwnerReview = requireCodeOwnerReview;
  }


  public RepositoryRulePullRequestParameters requireLastPushApproval(Boolean requireLastPushApproval) {
    
    this.requireLastPushApproval = requireLastPushApproval;
    return this;
  }

   /**
   * Whether the most recent reviewable push must be approved by someone other than the person who pushed it.
   * @return requireLastPushApproval
  **/
  @javax.annotation.Nonnull

  public Boolean getRequireLastPushApproval() {
    return requireLastPushApproval;
  }


  public void setRequireLastPushApproval(Boolean requireLastPushApproval) {
    this.requireLastPushApproval = requireLastPushApproval;
  }


  public RepositoryRulePullRequestParameters requiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
    
    this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    return this;
  }

   /**
   * The number of approving reviews that are required before a pull request can be merged.
   * minimum: 0
   * maximum: 10
   * @return requiredApprovingReviewCount
  **/
  @javax.annotation.Nonnull

  public Integer getRequiredApprovingReviewCount() {
    return requiredApprovingReviewCount;
  }


  public void setRequiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
    this.requiredApprovingReviewCount = requiredApprovingReviewCount;
  }


  public RepositoryRulePullRequestParameters requiredReviewThreadResolution(Boolean requiredReviewThreadResolution) {
    
    this.requiredReviewThreadResolution = requiredReviewThreadResolution;
    return this;
  }

   /**
   * All conversations on code must be resolved before a pull request can be merged.
   * @return requiredReviewThreadResolution
  **/
  @javax.annotation.Nonnull

  public Boolean getRequiredReviewThreadResolution() {
    return requiredReviewThreadResolution;
  }


  public void setRequiredReviewThreadResolution(Boolean requiredReviewThreadResolution) {
    this.requiredReviewThreadResolution = requiredReviewThreadResolution;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryRulePullRequestParameters repositoryRulePullRequestParameters = (RepositoryRulePullRequestParameters) o;
    return Objects.equals(this.dismissStaleReviewsOnPush, repositoryRulePullRequestParameters.dismissStaleReviewsOnPush) &&
        Objects.equals(this.requireCodeOwnerReview, repositoryRulePullRequestParameters.requireCodeOwnerReview) &&
        Objects.equals(this.requireLastPushApproval, repositoryRulePullRequestParameters.requireLastPushApproval) &&
        Objects.equals(this.requiredApprovingReviewCount, repositoryRulePullRequestParameters.requiredApprovingReviewCount) &&
        Objects.equals(this.requiredReviewThreadResolution, repositoryRulePullRequestParameters.requiredReviewThreadResolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dismissStaleReviewsOnPush, requireCodeOwnerReview, requireLastPushApproval, requiredApprovingReviewCount, requiredReviewThreadResolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryRulePullRequestParameters {\n");
    sb.append("    dismissStaleReviewsOnPush: ").append(toIndentedString(dismissStaleReviewsOnPush)).append("\n");
    sb.append("    requireCodeOwnerReview: ").append(toIndentedString(requireCodeOwnerReview)).append("\n");
    sb.append("    requireLastPushApproval: ").append(toIndentedString(requireLastPushApproval)).append("\n");
    sb.append("    requiredApprovingReviewCount: ").append(toIndentedString(requiredApprovingReviewCount)).append("\n");
    sb.append("    requiredReviewThreadResolution: ").append(toIndentedString(requiredReviewThreadResolution)).append("\n");
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
    openapiFields.add("dismiss_stale_reviews_on_push");
    openapiFields.add("require_code_owner_review");
    openapiFields.add("require_last_push_approval");
    openapiFields.add("required_approving_review_count");
    openapiFields.add("required_review_thread_resolution");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dismiss_stale_reviews_on_push");
    openapiRequiredFields.add("require_code_owner_review");
    openapiRequiredFields.add("require_last_push_approval");
    openapiRequiredFields.add("required_approving_review_count");
    openapiRequiredFields.add("required_review_thread_resolution");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RepositoryRulePullRequestParameters
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RepositoryRulePullRequestParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RepositoryRulePullRequestParameters is not found in the empty JSON string", RepositoryRulePullRequestParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RepositoryRulePullRequestParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RepositoryRulePullRequestParameters` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RepositoryRulePullRequestParameters.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RepositoryRulePullRequestParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RepositoryRulePullRequestParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RepositoryRulePullRequestParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RepositoryRulePullRequestParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<RepositoryRulePullRequestParameters>() {
           @Override
           public void write(JsonWriter out, RepositoryRulePullRequestParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RepositoryRulePullRequestParameters read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RepositoryRulePullRequestParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RepositoryRulePullRequestParameters
  * @throws IOException if the JSON string is invalid with respect to RepositoryRulePullRequestParameters
  */
  public static RepositoryRulePullRequestParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RepositoryRulePullRequestParameters.class);
  }

 /**
  * Convert an instance of RepositoryRulePullRequestParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

