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
import org.openapitools.client.model.PullsCreateReviewRequestCommentsInner;

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
 * PullsCreateReviewRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class PullsCreateReviewRequest {
  public static final String SERIALIZED_NAME_COMMIT_ID = "commit_id";
  @SerializedName(SERIALIZED_NAME_COMMIT_ID)
  private String commitId;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  /**
   * The review action you want to perform. The review actions include: &#x60;APPROVE&#x60;, &#x60;REQUEST_CHANGES&#x60;, or &#x60;COMMENT&#x60;. By leaving this blank, you set the review action state to &#x60;PENDING&#x60;, which means you will need to [submit the pull request review](https://docs.github.com/rest/pulls#submit-a-review-for-a-pull-request) when you are ready.
   */
  @JsonAdapter(EventEnum.Adapter.class)
  public enum EventEnum {
    APPROVE("APPROVE"),
    
    REQUEST_CHANGES("REQUEST_CHANGES"),
    
    COMMENT("COMMENT");

    private String value;

    EventEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventEnum fromValue(String value) {
      for (EventEnum b : EventEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private EventEnum event;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private List<PullsCreateReviewRequestCommentsInner> comments;

  public PullsCreateReviewRequest() {
  }

  public PullsCreateReviewRequest commitId(String commitId) {
    
    this.commitId = commitId;
    return this;
  }

   /**
   * The SHA of the commit that needs a review. Not using the latest commit SHA may render your review comment outdated if a subsequent commit modifies the line you specify as the &#x60;position&#x60;. Defaults to the most recent commit in the pull request when you do not specify a value.
   * @return commitId
  **/
  @javax.annotation.Nullable

  public String getCommitId() {
    return commitId;
  }


  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }


  public PullsCreateReviewRequest body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * **Required** when using &#x60;REQUEST_CHANGES&#x60; or &#x60;COMMENT&#x60; for the &#x60;event&#x60; parameter. The body text of the pull request review.
   * @return body
  **/
  @javax.annotation.Nullable

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public PullsCreateReviewRequest event(EventEnum event) {
    
    this.event = event;
    return this;
  }

   /**
   * The review action you want to perform. The review actions include: &#x60;APPROVE&#x60;, &#x60;REQUEST_CHANGES&#x60;, or &#x60;COMMENT&#x60;. By leaving this blank, you set the review action state to &#x60;PENDING&#x60;, which means you will need to [submit the pull request review](https://docs.github.com/rest/pulls#submit-a-review-for-a-pull-request) when you are ready.
   * @return event
  **/
  @javax.annotation.Nullable

  public EventEnum getEvent() {
    return event;
  }


  public void setEvent(EventEnum event) {
    this.event = event;
  }


  public PullsCreateReviewRequest comments(List<PullsCreateReviewRequestCommentsInner> comments) {
    
    this.comments = comments;
    return this;
  }

  public PullsCreateReviewRequest addCommentsItem(PullsCreateReviewRequestCommentsInner commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Use the following table to specify the location, destination, and contents of the draft review comment.
   * @return comments
  **/
  @javax.annotation.Nullable

  public List<PullsCreateReviewRequestCommentsInner> getComments() {
    return comments;
  }


  public void setComments(List<PullsCreateReviewRequestCommentsInner> comments) {
    this.comments = comments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PullsCreateReviewRequest pullsCreateReviewRequest = (PullsCreateReviewRequest) o;
    return Objects.equals(this.commitId, pullsCreateReviewRequest.commitId) &&
        Objects.equals(this.body, pullsCreateReviewRequest.body) &&
        Objects.equals(this.event, pullsCreateReviewRequest.event) &&
        Objects.equals(this.comments, pullsCreateReviewRequest.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitId, body, event, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullsCreateReviewRequest {\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
    openapiFields.add("commit_id");
    openapiFields.add("body");
    openapiFields.add("event");
    openapiFields.add("comments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PullsCreateReviewRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PullsCreateReviewRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PullsCreateReviewRequest is not found in the empty JSON string", PullsCreateReviewRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PullsCreateReviewRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PullsCreateReviewRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("commit_id") != null && !jsonObj.get("commit_id").isJsonNull()) && !jsonObj.get("commit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_id").toString()));
      }
      if ((jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if ((jsonObj.get("event") != null && !jsonObj.get("event").isJsonNull()) && !jsonObj.get("event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event").toString()));
      }
      if (jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonNull()) {
        JsonArray jsonArraycomments = jsonObj.getAsJsonArray("comments");
        if (jsonArraycomments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("comments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `comments` to be an array in the JSON string but got `%s`", jsonObj.get("comments").toString()));
          }

          // validate the optional field `comments` (array)
          for (int i = 0; i < jsonArraycomments.size(); i++) {
            PullsCreateReviewRequestCommentsInner.validateJsonObject(jsonArraycomments.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PullsCreateReviewRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PullsCreateReviewRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PullsCreateReviewRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PullsCreateReviewRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PullsCreateReviewRequest>() {
           @Override
           public void write(JsonWriter out, PullsCreateReviewRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PullsCreateReviewRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PullsCreateReviewRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PullsCreateReviewRequest
  * @throws IOException if the JSON string is invalid with respect to PullsCreateReviewRequest
  */
  public static PullsCreateReviewRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PullsCreateReviewRequest.class);
  }

 /**
  * Convert an instance of PullsCreateReviewRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

