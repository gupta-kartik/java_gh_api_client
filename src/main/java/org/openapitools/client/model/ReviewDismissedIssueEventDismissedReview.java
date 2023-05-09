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
 * ReviewDismissedIssueEventDismissedReview
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ReviewDismissedIssueEventDismissedReview {
  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_REVIEW_ID = "review_id";
  @SerializedName(SERIALIZED_NAME_REVIEW_ID)
  private Integer reviewId;

  public static final String SERIALIZED_NAME_DISMISSAL_MESSAGE = "dismissal_message";
  @SerializedName(SERIALIZED_NAME_DISMISSAL_MESSAGE)
  private String dismissalMessage;

  public static final String SERIALIZED_NAME_DISMISSAL_COMMIT_ID = "dismissal_commit_id";
  @SerializedName(SERIALIZED_NAME_DISMISSAL_COMMIT_ID)
  private String dismissalCommitId;

  public ReviewDismissedIssueEventDismissedReview() {
  }

  public ReviewDismissedIssueEventDismissedReview state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public ReviewDismissedIssueEventDismissedReview reviewId(Integer reviewId) {
    
    this.reviewId = reviewId;
    return this;
  }

   /**
   * Get reviewId
   * @return reviewId
  **/
  @javax.annotation.Nonnull

  public Integer getReviewId() {
    return reviewId;
  }


  public void setReviewId(Integer reviewId) {
    this.reviewId = reviewId;
  }


  public ReviewDismissedIssueEventDismissedReview dismissalMessage(String dismissalMessage) {
    
    this.dismissalMessage = dismissalMessage;
    return this;
  }

   /**
   * Get dismissalMessage
   * @return dismissalMessage
  **/
  @javax.annotation.Nullable

  public String getDismissalMessage() {
    return dismissalMessage;
  }


  public void setDismissalMessage(String dismissalMessage) {
    this.dismissalMessage = dismissalMessage;
  }


  public ReviewDismissedIssueEventDismissedReview dismissalCommitId(String dismissalCommitId) {
    
    this.dismissalCommitId = dismissalCommitId;
    return this;
  }

   /**
   * Get dismissalCommitId
   * @return dismissalCommitId
  **/
  @javax.annotation.Nullable

  public String getDismissalCommitId() {
    return dismissalCommitId;
  }


  public void setDismissalCommitId(String dismissalCommitId) {
    this.dismissalCommitId = dismissalCommitId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewDismissedIssueEventDismissedReview reviewDismissedIssueEventDismissedReview = (ReviewDismissedIssueEventDismissedReview) o;
    return Objects.equals(this.state, reviewDismissedIssueEventDismissedReview.state) &&
        Objects.equals(this.reviewId, reviewDismissedIssueEventDismissedReview.reviewId) &&
        Objects.equals(this.dismissalMessage, reviewDismissedIssueEventDismissedReview.dismissalMessage) &&
        Objects.equals(this.dismissalCommitId, reviewDismissedIssueEventDismissedReview.dismissalCommitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, reviewId, dismissalMessage, dismissalCommitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewDismissedIssueEventDismissedReview {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    dismissalMessage: ").append(toIndentedString(dismissalMessage)).append("\n");
    sb.append("    dismissalCommitId: ").append(toIndentedString(dismissalCommitId)).append("\n");
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
    openapiFields.add("state");
    openapiFields.add("review_id");
    openapiFields.add("dismissal_message");
    openapiFields.add("dismissal_commit_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("review_id");
    openapiRequiredFields.add("dismissal_message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReviewDismissedIssueEventDismissedReview
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReviewDismissedIssueEventDismissedReview.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReviewDismissedIssueEventDismissedReview is not found in the empty JSON string", ReviewDismissedIssueEventDismissedReview.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReviewDismissedIssueEventDismissedReview.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReviewDismissedIssueEventDismissedReview` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReviewDismissedIssueEventDismissedReview.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("dismissal_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dismissal_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dismissal_message").toString()));
      }
      if ((jsonObj.get("dismissal_commit_id") != null && !jsonObj.get("dismissal_commit_id").isJsonNull()) && !jsonObj.get("dismissal_commit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dismissal_commit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dismissal_commit_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReviewDismissedIssueEventDismissedReview.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReviewDismissedIssueEventDismissedReview' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReviewDismissedIssueEventDismissedReview> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReviewDismissedIssueEventDismissedReview.class));

       return (TypeAdapter<T>) new TypeAdapter<ReviewDismissedIssueEventDismissedReview>() {
           @Override
           public void write(JsonWriter out, ReviewDismissedIssueEventDismissedReview value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReviewDismissedIssueEventDismissedReview read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReviewDismissedIssueEventDismissedReview given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReviewDismissedIssueEventDismissedReview
  * @throws IOException if the JSON string is invalid with respect to ReviewDismissedIssueEventDismissedReview
  */
  public static ReviewDismissedIssueEventDismissedReview fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReviewDismissedIssueEventDismissedReview.class);
  }

 /**
  * Convert an instance of ReviewDismissedIssueEventDismissedReview to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
