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
import org.openapitools.client.model.ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances;
import org.openapitools.client.model.ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions;

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
 * ProtectedBranchRequiredPullRequestReviews
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ProtectedBranchRequiredPullRequestReviews {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

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

  public static final String SERIALIZED_NAME_DISMISSAL_RESTRICTIONS = "dismissal_restrictions";
  @SerializedName(SERIALIZED_NAME_DISMISSAL_RESTRICTIONS)
  private ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions dismissalRestrictions;

  public static final String SERIALIZED_NAME_BYPASS_PULL_REQUEST_ALLOWANCES = "bypass_pull_request_allowances";
  @SerializedName(SERIALIZED_NAME_BYPASS_PULL_REQUEST_ALLOWANCES)
  private ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances bypassPullRequestAllowances;

  public ProtectedBranchRequiredPullRequestReviews() {
  }

  public ProtectedBranchRequiredPullRequestReviews url(URI url) {
    
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


  public ProtectedBranchRequiredPullRequestReviews dismissStaleReviews(Boolean dismissStaleReviews) {
    
    this.dismissStaleReviews = dismissStaleReviews;
    return this;
  }

   /**
   * Get dismissStaleReviews
   * @return dismissStaleReviews
  **/
  @javax.annotation.Nullable

  public Boolean getDismissStaleReviews() {
    return dismissStaleReviews;
  }


  public void setDismissStaleReviews(Boolean dismissStaleReviews) {
    this.dismissStaleReviews = dismissStaleReviews;
  }


  public ProtectedBranchRequiredPullRequestReviews requireCodeOwnerReviews(Boolean requireCodeOwnerReviews) {
    
    this.requireCodeOwnerReviews = requireCodeOwnerReviews;
    return this;
  }

   /**
   * Get requireCodeOwnerReviews
   * @return requireCodeOwnerReviews
  **/
  @javax.annotation.Nullable

  public Boolean getRequireCodeOwnerReviews() {
    return requireCodeOwnerReviews;
  }


  public void setRequireCodeOwnerReviews(Boolean requireCodeOwnerReviews) {
    this.requireCodeOwnerReviews = requireCodeOwnerReviews;
  }


  public ProtectedBranchRequiredPullRequestReviews requiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
    
    this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    return this;
  }

   /**
   * Get requiredApprovingReviewCount
   * @return requiredApprovingReviewCount
  **/
  @javax.annotation.Nullable

  public Integer getRequiredApprovingReviewCount() {
    return requiredApprovingReviewCount;
  }


  public void setRequiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
    this.requiredApprovingReviewCount = requiredApprovingReviewCount;
  }


  public ProtectedBranchRequiredPullRequestReviews requireLastPushApproval(Boolean requireLastPushApproval) {
    
    this.requireLastPushApproval = requireLastPushApproval;
    return this;
  }

   /**
   * Whether the most recent push must be approved by someone other than the person who pushed it.
   * @return requireLastPushApproval
  **/
  @javax.annotation.Nullable

  public Boolean getRequireLastPushApproval() {
    return requireLastPushApproval;
  }


  public void setRequireLastPushApproval(Boolean requireLastPushApproval) {
    this.requireLastPushApproval = requireLastPushApproval;
  }


  public ProtectedBranchRequiredPullRequestReviews dismissalRestrictions(ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions dismissalRestrictions) {
    
    this.dismissalRestrictions = dismissalRestrictions;
    return this;
  }

   /**
   * Get dismissalRestrictions
   * @return dismissalRestrictions
  **/
  @javax.annotation.Nullable

  public ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions getDismissalRestrictions() {
    return dismissalRestrictions;
  }


  public void setDismissalRestrictions(ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions dismissalRestrictions) {
    this.dismissalRestrictions = dismissalRestrictions;
  }


  public ProtectedBranchRequiredPullRequestReviews bypassPullRequestAllowances(ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances bypassPullRequestAllowances) {
    
    this.bypassPullRequestAllowances = bypassPullRequestAllowances;
    return this;
  }

   /**
   * Get bypassPullRequestAllowances
   * @return bypassPullRequestAllowances
  **/
  @javax.annotation.Nullable

  public ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances getBypassPullRequestAllowances() {
    return bypassPullRequestAllowances;
  }


  public void setBypassPullRequestAllowances(ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances bypassPullRequestAllowances) {
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
    ProtectedBranchRequiredPullRequestReviews protectedBranchRequiredPullRequestReviews = (ProtectedBranchRequiredPullRequestReviews) o;
    return Objects.equals(this.url, protectedBranchRequiredPullRequestReviews.url) &&
        Objects.equals(this.dismissStaleReviews, protectedBranchRequiredPullRequestReviews.dismissStaleReviews) &&
        Objects.equals(this.requireCodeOwnerReviews, protectedBranchRequiredPullRequestReviews.requireCodeOwnerReviews) &&
        Objects.equals(this.requiredApprovingReviewCount, protectedBranchRequiredPullRequestReviews.requiredApprovingReviewCount) &&
        Objects.equals(this.requireLastPushApproval, protectedBranchRequiredPullRequestReviews.requireLastPushApproval) &&
        Objects.equals(this.dismissalRestrictions, protectedBranchRequiredPullRequestReviews.dismissalRestrictions) &&
        Objects.equals(this.bypassPullRequestAllowances, protectedBranchRequiredPullRequestReviews.bypassPullRequestAllowances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, dismissStaleReviews, requireCodeOwnerReviews, requiredApprovingReviewCount, requireLastPushApproval, dismissalRestrictions, bypassPullRequestAllowances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtectedBranchRequiredPullRequestReviews {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    dismissStaleReviews: ").append(toIndentedString(dismissStaleReviews)).append("\n");
    sb.append("    requireCodeOwnerReviews: ").append(toIndentedString(requireCodeOwnerReviews)).append("\n");
    sb.append("    requiredApprovingReviewCount: ").append(toIndentedString(requiredApprovingReviewCount)).append("\n");
    sb.append("    requireLastPushApproval: ").append(toIndentedString(requireLastPushApproval)).append("\n");
    sb.append("    dismissalRestrictions: ").append(toIndentedString(dismissalRestrictions)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("dismiss_stale_reviews");
    openapiFields.add("require_code_owner_reviews");
    openapiFields.add("required_approving_review_count");
    openapiFields.add("require_last_push_approval");
    openapiFields.add("dismissal_restrictions");
    openapiFields.add("bypass_pull_request_allowances");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProtectedBranchRequiredPullRequestReviews
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProtectedBranchRequiredPullRequestReviews.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProtectedBranchRequiredPullRequestReviews is not found in the empty JSON string", ProtectedBranchRequiredPullRequestReviews.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProtectedBranchRequiredPullRequestReviews.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProtectedBranchRequiredPullRequestReviews` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProtectedBranchRequiredPullRequestReviews.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the optional field `dismissal_restrictions`
      if (jsonObj.get("dismissal_restrictions") != null && !jsonObj.get("dismissal_restrictions").isJsonNull()) {
        ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions.validateJsonObject(jsonObj.getAsJsonObject("dismissal_restrictions"));
      }
      // validate the optional field `bypass_pull_request_allowances`
      if (jsonObj.get("bypass_pull_request_allowances") != null && !jsonObj.get("bypass_pull_request_allowances").isJsonNull()) {
        ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances.validateJsonObject(jsonObj.getAsJsonObject("bypass_pull_request_allowances"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProtectedBranchRequiredPullRequestReviews.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProtectedBranchRequiredPullRequestReviews' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProtectedBranchRequiredPullRequestReviews> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProtectedBranchRequiredPullRequestReviews.class));

       return (TypeAdapter<T>) new TypeAdapter<ProtectedBranchRequiredPullRequestReviews>() {
           @Override
           public void write(JsonWriter out, ProtectedBranchRequiredPullRequestReviews value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProtectedBranchRequiredPullRequestReviews read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProtectedBranchRequiredPullRequestReviews given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProtectedBranchRequiredPullRequestReviews
  * @throws IOException if the JSON string is invalid with respect to ProtectedBranchRequiredPullRequestReviews
  */
  public static ProtectedBranchRequiredPullRequestReviews fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProtectedBranchRequiredPullRequestReviews.class);
  }

 /**
  * Convert an instance of ProtectedBranchRequiredPullRequestReviews to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

