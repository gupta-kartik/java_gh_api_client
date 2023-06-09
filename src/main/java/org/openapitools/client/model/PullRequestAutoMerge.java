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
import org.openapitools.client.model.User;

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
 * The status of auto merging a pull request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class PullRequestAutoMerge {
  public static final String SERIALIZED_NAME_COMMIT_MESSAGE = "commit_message";
  @SerializedName(SERIALIZED_NAME_COMMIT_MESSAGE)
  private String commitMessage;

  public static final String SERIALIZED_NAME_COMMIT_TITLE = "commit_title";
  @SerializedName(SERIALIZED_NAME_COMMIT_TITLE)
  private String commitTitle;

  public static final String SERIALIZED_NAME_ENABLED_BY = "enabled_by";
  @SerializedName(SERIALIZED_NAME_ENABLED_BY)
  private User enabledBy;

  /**
   * The merge method to use.
   */
  @JsonAdapter(MergeMethodEnum.Adapter.class)
  public enum MergeMethodEnum {
    MERGE("merge"),
    
    SQUASH("squash"),
    
    REBASE("rebase");

    private String value;

    MergeMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MergeMethodEnum fromValue(String value) {
      for (MergeMethodEnum b : MergeMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MergeMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MergeMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MergeMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MergeMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MERGE_METHOD = "merge_method";
  @SerializedName(SERIALIZED_NAME_MERGE_METHOD)
  private MergeMethodEnum mergeMethod;

  public PullRequestAutoMerge() {
  }

  public PullRequestAutoMerge commitMessage(String commitMessage) {
    
    this.commitMessage = commitMessage;
    return this;
  }

   /**
   * Commit message for the merge commit.
   * @return commitMessage
  **/
  @javax.annotation.Nullable

  public String getCommitMessage() {
    return commitMessage;
  }


  public void setCommitMessage(String commitMessage) {
    this.commitMessage = commitMessage;
  }


  public PullRequestAutoMerge commitTitle(String commitTitle) {
    
    this.commitTitle = commitTitle;
    return this;
  }

   /**
   * Title for the merge commit message.
   * @return commitTitle
  **/
  @javax.annotation.Nullable

  public String getCommitTitle() {
    return commitTitle;
  }


  public void setCommitTitle(String commitTitle) {
    this.commitTitle = commitTitle;
  }


  public PullRequestAutoMerge enabledBy(User enabledBy) {
    
    this.enabledBy = enabledBy;
    return this;
  }

   /**
   * Get enabledBy
   * @return enabledBy
  **/
  @javax.annotation.Nullable

  public User getEnabledBy() {
    return enabledBy;
  }


  public void setEnabledBy(User enabledBy) {
    this.enabledBy = enabledBy;
  }


  public PullRequestAutoMerge mergeMethod(MergeMethodEnum mergeMethod) {
    
    this.mergeMethod = mergeMethod;
    return this;
  }

   /**
   * The merge method to use.
   * @return mergeMethod
  **/
  @javax.annotation.Nonnull

  public MergeMethodEnum getMergeMethod() {
    return mergeMethod;
  }


  public void setMergeMethod(MergeMethodEnum mergeMethod) {
    this.mergeMethod = mergeMethod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PullRequestAutoMerge pullRequestAutoMerge = (PullRequestAutoMerge) o;
    return Objects.equals(this.commitMessage, pullRequestAutoMerge.commitMessage) &&
        Objects.equals(this.commitTitle, pullRequestAutoMerge.commitTitle) &&
        Objects.equals(this.enabledBy, pullRequestAutoMerge.enabledBy) &&
        Objects.equals(this.mergeMethod, pullRequestAutoMerge.mergeMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitMessage, commitTitle, enabledBy, mergeMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullRequestAutoMerge {\n");
    sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
    sb.append("    commitTitle: ").append(toIndentedString(commitTitle)).append("\n");
    sb.append("    enabledBy: ").append(toIndentedString(enabledBy)).append("\n");
    sb.append("    mergeMethod: ").append(toIndentedString(mergeMethod)).append("\n");
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
    openapiFields.add("commit_message");
    openapiFields.add("commit_title");
    openapiFields.add("enabled_by");
    openapiFields.add("merge_method");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("commit_message");
    openapiRequiredFields.add("commit_title");
    openapiRequiredFields.add("enabled_by");
    openapiRequiredFields.add("merge_method");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PullRequestAutoMerge
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PullRequestAutoMerge.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PullRequestAutoMerge is not found in the empty JSON string", PullRequestAutoMerge.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PullRequestAutoMerge.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PullRequestAutoMerge` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PullRequestAutoMerge.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("commit_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_message").toString()));
      }
      if (!jsonObj.get("commit_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_title").toString()));
      }
      // validate the required field `enabled_by`
      User.validateJsonObject(jsonObj.getAsJsonObject("enabled_by"));
      if (!jsonObj.get("merge_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merge_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merge_method").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PullRequestAutoMerge.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PullRequestAutoMerge' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PullRequestAutoMerge> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PullRequestAutoMerge.class));

       return (TypeAdapter<T>) new TypeAdapter<PullRequestAutoMerge>() {
           @Override
           public void write(JsonWriter out, PullRequestAutoMerge value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PullRequestAutoMerge read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PullRequestAutoMerge given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PullRequestAutoMerge
  * @throws IOException if the JSON string is invalid with respect to PullRequestAutoMerge
  */
  public static PullRequestAutoMerge fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PullRequestAutoMerge.class);
  }

 /**
  * Convert an instance of PullRequestAutoMerge to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

