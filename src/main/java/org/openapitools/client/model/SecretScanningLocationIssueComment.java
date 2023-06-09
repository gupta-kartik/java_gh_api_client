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
 * Represents an &#39;issue_comment&#39; secret scanning location type. This location type shows that a secret was detected in a comment on an issue.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class SecretScanningLocationIssueComment {
  public static final String SERIALIZED_NAME_ISSUE_COMMENT_URL = "issue_comment_url";
  @SerializedName(SERIALIZED_NAME_ISSUE_COMMENT_URL)
  private URI issueCommentUrl;

  public SecretScanningLocationIssueComment() {
  }

  public SecretScanningLocationIssueComment issueCommentUrl(URI issueCommentUrl) {
    
    this.issueCommentUrl = issueCommentUrl;
    return this;
  }

   /**
   * The API URL to get the issue comment where the secret was detected.
   * @return issueCommentUrl
  **/
  @javax.annotation.Nonnull

  public URI getIssueCommentUrl() {
    return issueCommentUrl;
  }


  public void setIssueCommentUrl(URI issueCommentUrl) {
    this.issueCommentUrl = issueCommentUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretScanningLocationIssueComment secretScanningLocationIssueComment = (SecretScanningLocationIssueComment) o;
    return Objects.equals(this.issueCommentUrl, secretScanningLocationIssueComment.issueCommentUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueCommentUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretScanningLocationIssueComment {\n");
    sb.append("    issueCommentUrl: ").append(toIndentedString(issueCommentUrl)).append("\n");
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
    openapiFields.add("issue_comment_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issue_comment_url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SecretScanningLocationIssueComment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SecretScanningLocationIssueComment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SecretScanningLocationIssueComment is not found in the empty JSON string", SecretScanningLocationIssueComment.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SecretScanningLocationIssueComment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SecretScanningLocationIssueComment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SecretScanningLocationIssueComment.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("issue_comment_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_comment_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_comment_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecretScanningLocationIssueComment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecretScanningLocationIssueComment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecretScanningLocationIssueComment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecretScanningLocationIssueComment.class));

       return (TypeAdapter<T>) new TypeAdapter<SecretScanningLocationIssueComment>() {
           @Override
           public void write(JsonWriter out, SecretScanningLocationIssueComment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecretScanningLocationIssueComment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecretScanningLocationIssueComment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecretScanningLocationIssueComment
  * @throws IOException if the JSON string is invalid with respect to SecretScanningLocationIssueComment
  */
  public static SecretScanningLocationIssueComment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecretScanningLocationIssueComment.class);
  }

 /**
  * Convert an instance of SecretScanningLocationIssueComment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

