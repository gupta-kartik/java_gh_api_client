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
 * ReposCreateCommitCommentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ReposCreateCommitCommentRequest {
  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_LINE = "line";
  @SerializedName(SERIALIZED_NAME_LINE)
  private Integer line;

  public ReposCreateCommitCommentRequest() {
  }

  public ReposCreateCommitCommentRequest body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * The contents of the comment.
   * @return body
  **/
  @javax.annotation.Nonnull

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public ReposCreateCommitCommentRequest path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Relative path of the file to comment on.
   * @return path
  **/
  @javax.annotation.Nullable

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ReposCreateCommitCommentRequest position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Line index in the diff to comment on.
   * @return position
  **/
  @javax.annotation.Nullable

  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public ReposCreateCommitCommentRequest line(Integer line) {
    
    this.line = line;
    return this;
  }

   /**
   * **Deprecated**. Use **position** parameter instead. Line number in the file to comment on.
   * @return line
  **/
  @javax.annotation.Nullable

  public Integer getLine() {
    return line;
  }


  public void setLine(Integer line) {
    this.line = line;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReposCreateCommitCommentRequest reposCreateCommitCommentRequest = (ReposCreateCommitCommentRequest) o;
    return Objects.equals(this.body, reposCreateCommitCommentRequest.body) &&
        Objects.equals(this.path, reposCreateCommitCommentRequest.path) &&
        Objects.equals(this.position, reposCreateCommitCommentRequest.position) &&
        Objects.equals(this.line, reposCreateCommitCommentRequest.line);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, path, position, line);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReposCreateCommitCommentRequest {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
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
    openapiFields.add("body");
    openapiFields.add("path");
    openapiFields.add("position");
    openapiFields.add("line");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("body");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReposCreateCommitCommentRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReposCreateCommitCommentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReposCreateCommitCommentRequest is not found in the empty JSON string", ReposCreateCommitCommentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReposCreateCommitCommentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReposCreateCommitCommentRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReposCreateCommitCommentRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReposCreateCommitCommentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReposCreateCommitCommentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReposCreateCommitCommentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReposCreateCommitCommentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReposCreateCommitCommentRequest>() {
           @Override
           public void write(JsonWriter out, ReposCreateCommitCommentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReposCreateCommitCommentRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReposCreateCommitCommentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReposCreateCommitCommentRequest
  * @throws IOException if the JSON string is invalid with respect to ReposCreateCommitCommentRequest
  */
  public static ReposCreateCommitCommentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReposCreateCommitCommentRequest.class);
  }

 /**
  * Convert an instance of ReposCreateCommitCommentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
