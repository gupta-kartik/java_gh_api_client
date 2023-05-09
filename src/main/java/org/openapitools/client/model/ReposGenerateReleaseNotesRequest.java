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
 * ReposGenerateReleaseNotesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ReposGenerateReleaseNotesRequest {
  public static final String SERIALIZED_NAME_TAG_NAME = "tag_name";
  @SerializedName(SERIALIZED_NAME_TAG_NAME)
  private String tagName;

  public static final String SERIALIZED_NAME_TARGET_COMMITISH = "target_commitish";
  @SerializedName(SERIALIZED_NAME_TARGET_COMMITISH)
  private String targetCommitish;

  public static final String SERIALIZED_NAME_PREVIOUS_TAG_NAME = "previous_tag_name";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_TAG_NAME)
  private String previousTagName;

  public static final String SERIALIZED_NAME_CONFIGURATION_FILE_PATH = "configuration_file_path";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_FILE_PATH)
  private String configurationFilePath;

  public ReposGenerateReleaseNotesRequest() {
  }

  public ReposGenerateReleaseNotesRequest tagName(String tagName) {
    
    this.tagName = tagName;
    return this;
  }

   /**
   * The tag name for the release. This can be an existing tag or a new one.
   * @return tagName
  **/
  @javax.annotation.Nonnull

  public String getTagName() {
    return tagName;
  }


  public void setTagName(String tagName) {
    this.tagName = tagName;
  }


  public ReposGenerateReleaseNotesRequest targetCommitish(String targetCommitish) {
    
    this.targetCommitish = targetCommitish;
    return this;
  }

   /**
   * Specifies the commitish value that will be the target for the release&#39;s tag. Required if the supplied tag_name does not reference an existing tag. Ignored if the tag_name already exists.
   * @return targetCommitish
  **/
  @javax.annotation.Nullable

  public String getTargetCommitish() {
    return targetCommitish;
  }


  public void setTargetCommitish(String targetCommitish) {
    this.targetCommitish = targetCommitish;
  }


  public ReposGenerateReleaseNotesRequest previousTagName(String previousTagName) {
    
    this.previousTagName = previousTagName;
    return this;
  }

   /**
   * The name of the previous tag to use as the starting point for the release notes. Use to manually specify the range for the set of changes considered as part this release.
   * @return previousTagName
  **/
  @javax.annotation.Nullable

  public String getPreviousTagName() {
    return previousTagName;
  }


  public void setPreviousTagName(String previousTagName) {
    this.previousTagName = previousTagName;
  }


  public ReposGenerateReleaseNotesRequest configurationFilePath(String configurationFilePath) {
    
    this.configurationFilePath = configurationFilePath;
    return this;
  }

   /**
   * Specifies a path to a file in the repository containing configuration settings used for generating the release notes. If unspecified, the configuration file located in the repository at &#39;.github/release.yml&#39; or &#39;.github/release.yaml&#39; will be used. If that is not present, the default configuration will be used.
   * @return configurationFilePath
  **/
  @javax.annotation.Nullable

  public String getConfigurationFilePath() {
    return configurationFilePath;
  }


  public void setConfigurationFilePath(String configurationFilePath) {
    this.configurationFilePath = configurationFilePath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReposGenerateReleaseNotesRequest reposGenerateReleaseNotesRequest = (ReposGenerateReleaseNotesRequest) o;
    return Objects.equals(this.tagName, reposGenerateReleaseNotesRequest.tagName) &&
        Objects.equals(this.targetCommitish, reposGenerateReleaseNotesRequest.targetCommitish) &&
        Objects.equals(this.previousTagName, reposGenerateReleaseNotesRequest.previousTagName) &&
        Objects.equals(this.configurationFilePath, reposGenerateReleaseNotesRequest.configurationFilePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagName, targetCommitish, previousTagName, configurationFilePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReposGenerateReleaseNotesRequest {\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    targetCommitish: ").append(toIndentedString(targetCommitish)).append("\n");
    sb.append("    previousTagName: ").append(toIndentedString(previousTagName)).append("\n");
    sb.append("    configurationFilePath: ").append(toIndentedString(configurationFilePath)).append("\n");
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
    openapiFields.add("tag_name");
    openapiFields.add("target_commitish");
    openapiFields.add("previous_tag_name");
    openapiFields.add("configuration_file_path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tag_name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReposGenerateReleaseNotesRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReposGenerateReleaseNotesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReposGenerateReleaseNotesRequest is not found in the empty JSON string", ReposGenerateReleaseNotesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReposGenerateReleaseNotesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReposGenerateReleaseNotesRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReposGenerateReleaseNotesRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("tag_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_name").toString()));
      }
      if ((jsonObj.get("target_commitish") != null && !jsonObj.get("target_commitish").isJsonNull()) && !jsonObj.get("target_commitish").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_commitish` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_commitish").toString()));
      }
      if ((jsonObj.get("previous_tag_name") != null && !jsonObj.get("previous_tag_name").isJsonNull()) && !jsonObj.get("previous_tag_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previous_tag_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previous_tag_name").toString()));
      }
      if ((jsonObj.get("configuration_file_path") != null && !jsonObj.get("configuration_file_path").isJsonNull()) && !jsonObj.get("configuration_file_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configuration_file_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configuration_file_path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReposGenerateReleaseNotesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReposGenerateReleaseNotesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReposGenerateReleaseNotesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReposGenerateReleaseNotesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReposGenerateReleaseNotesRequest>() {
           @Override
           public void write(JsonWriter out, ReposGenerateReleaseNotesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReposGenerateReleaseNotesRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReposGenerateReleaseNotesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReposGenerateReleaseNotesRequest
  * @throws IOException if the JSON string is invalid with respect to ReposGenerateReleaseNotesRequest
  */
  public static ReposGenerateReleaseNotesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReposGenerateReleaseNotesRequest.class);
  }

 /**
  * Convert an instance of ReposGenerateReleaseNotesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
