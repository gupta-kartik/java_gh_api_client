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
 * ReposCreateReleaseRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ReposCreateReleaseRequest {
  public static final String SERIALIZED_NAME_TAG_NAME = "tag_name";
  @SerializedName(SERIALIZED_NAME_TAG_NAME)
  private String tagName;

  public static final String SERIALIZED_NAME_TARGET_COMMITISH = "target_commitish";
  @SerializedName(SERIALIZED_NAME_TARGET_COMMITISH)
  private String targetCommitish;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_DRAFT = "draft";
  @SerializedName(SERIALIZED_NAME_DRAFT)
  private Boolean draft = false;

  public static final String SERIALIZED_NAME_PRERELEASE = "prerelease";
  @SerializedName(SERIALIZED_NAME_PRERELEASE)
  private Boolean prerelease = false;

  public static final String SERIALIZED_NAME_DISCUSSION_CATEGORY_NAME = "discussion_category_name";
  @SerializedName(SERIALIZED_NAME_DISCUSSION_CATEGORY_NAME)
  private String discussionCategoryName;

  public static final String SERIALIZED_NAME_GENERATE_RELEASE_NOTES = "generate_release_notes";
  @SerializedName(SERIALIZED_NAME_GENERATE_RELEASE_NOTES)
  private Boolean generateReleaseNotes = false;

  /**
   * Specifies whether this release should be set as the latest release for the repository. Drafts and prereleases cannot be set as latest. Defaults to &#x60;true&#x60; for newly published releases. &#x60;legacy&#x60; specifies that the latest release should be determined based on the release creation date and higher semantic version.
   */
  @JsonAdapter(MakeLatestEnum.Adapter.class)
  public enum MakeLatestEnum {
    TRUE("true"),
    
    FALSE("false"),
    
    LEGACY("legacy");

    private String value;

    MakeLatestEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MakeLatestEnum fromValue(String value) {
      for (MakeLatestEnum b : MakeLatestEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MakeLatestEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MakeLatestEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MakeLatestEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MakeLatestEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MAKE_LATEST = "make_latest";
  @SerializedName(SERIALIZED_NAME_MAKE_LATEST)
  private MakeLatestEnum makeLatest = MakeLatestEnum.TRUE;

  public ReposCreateReleaseRequest() {
  }

  public ReposCreateReleaseRequest tagName(String tagName) {
    
    this.tagName = tagName;
    return this;
  }

   /**
   * The name of the tag.
   * @return tagName
  **/
  @javax.annotation.Nonnull

  public String getTagName() {
    return tagName;
  }


  public void setTagName(String tagName) {
    this.tagName = tagName;
  }


  public ReposCreateReleaseRequest targetCommitish(String targetCommitish) {
    
    this.targetCommitish = targetCommitish;
    return this;
  }

   /**
   * Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository&#39;s default branch.
   * @return targetCommitish
  **/
  @javax.annotation.Nullable

  public String getTargetCommitish() {
    return targetCommitish;
  }


  public void setTargetCommitish(String targetCommitish) {
    this.targetCommitish = targetCommitish;
  }


  public ReposCreateReleaseRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the release.
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ReposCreateReleaseRequest body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Text describing the contents of the tag.
   * @return body
  **/
  @javax.annotation.Nullable

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public ReposCreateReleaseRequest draft(Boolean draft) {
    
    this.draft = draft;
    return this;
  }

   /**
   * &#x60;true&#x60; to create a draft (unpublished) release, &#x60;false&#x60; to create a published one.
   * @return draft
  **/
  @javax.annotation.Nullable

  public Boolean getDraft() {
    return draft;
  }


  public void setDraft(Boolean draft) {
    this.draft = draft;
  }


  public ReposCreateReleaseRequest prerelease(Boolean prerelease) {
    
    this.prerelease = prerelease;
    return this;
  }

   /**
   * &#x60;true&#x60; to identify the release as a prerelease. &#x60;false&#x60; to identify the release as a full release.
   * @return prerelease
  **/
  @javax.annotation.Nullable

  public Boolean getPrerelease() {
    return prerelease;
  }


  public void setPrerelease(Boolean prerelease) {
    this.prerelease = prerelease;
  }


  public ReposCreateReleaseRequest discussionCategoryName(String discussionCategoryName) {
    
    this.discussionCategoryName = discussionCategoryName;
    return this;
  }

   /**
   * If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. For more information, see \&quot;[Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository).\&quot;
   * @return discussionCategoryName
  **/
  @javax.annotation.Nullable

  public String getDiscussionCategoryName() {
    return discussionCategoryName;
  }


  public void setDiscussionCategoryName(String discussionCategoryName) {
    this.discussionCategoryName = discussionCategoryName;
  }


  public ReposCreateReleaseRequest generateReleaseNotes(Boolean generateReleaseNotes) {
    
    this.generateReleaseNotes = generateReleaseNotes;
    return this;
  }

   /**
   * Whether to automatically generate the name and body for this release. If &#x60;name&#x60; is specified, the specified name will be used; otherwise, a name will be automatically generated. If &#x60;body&#x60; is specified, the body will be pre-pended to the automatically generated notes.
   * @return generateReleaseNotes
  **/
  @javax.annotation.Nullable

  public Boolean getGenerateReleaseNotes() {
    return generateReleaseNotes;
  }


  public void setGenerateReleaseNotes(Boolean generateReleaseNotes) {
    this.generateReleaseNotes = generateReleaseNotes;
  }


  public ReposCreateReleaseRequest makeLatest(MakeLatestEnum makeLatest) {
    
    this.makeLatest = makeLatest;
    return this;
  }

   /**
   * Specifies whether this release should be set as the latest release for the repository. Drafts and prereleases cannot be set as latest. Defaults to &#x60;true&#x60; for newly published releases. &#x60;legacy&#x60; specifies that the latest release should be determined based on the release creation date and higher semantic version.
   * @return makeLatest
  **/
  @javax.annotation.Nullable

  public MakeLatestEnum getMakeLatest() {
    return makeLatest;
  }


  public void setMakeLatest(MakeLatestEnum makeLatest) {
    this.makeLatest = makeLatest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReposCreateReleaseRequest reposCreateReleaseRequest = (ReposCreateReleaseRequest) o;
    return Objects.equals(this.tagName, reposCreateReleaseRequest.tagName) &&
        Objects.equals(this.targetCommitish, reposCreateReleaseRequest.targetCommitish) &&
        Objects.equals(this.name, reposCreateReleaseRequest.name) &&
        Objects.equals(this.body, reposCreateReleaseRequest.body) &&
        Objects.equals(this.draft, reposCreateReleaseRequest.draft) &&
        Objects.equals(this.prerelease, reposCreateReleaseRequest.prerelease) &&
        Objects.equals(this.discussionCategoryName, reposCreateReleaseRequest.discussionCategoryName) &&
        Objects.equals(this.generateReleaseNotes, reposCreateReleaseRequest.generateReleaseNotes) &&
        Objects.equals(this.makeLatest, reposCreateReleaseRequest.makeLatest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagName, targetCommitish, name, body, draft, prerelease, discussionCategoryName, generateReleaseNotes, makeLatest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReposCreateReleaseRequest {\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    targetCommitish: ").append(toIndentedString(targetCommitish)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    prerelease: ").append(toIndentedString(prerelease)).append("\n");
    sb.append("    discussionCategoryName: ").append(toIndentedString(discussionCategoryName)).append("\n");
    sb.append("    generateReleaseNotes: ").append(toIndentedString(generateReleaseNotes)).append("\n");
    sb.append("    makeLatest: ").append(toIndentedString(makeLatest)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("body");
    openapiFields.add("draft");
    openapiFields.add("prerelease");
    openapiFields.add("discussion_category_name");
    openapiFields.add("generate_release_notes");
    openapiFields.add("make_latest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tag_name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReposCreateReleaseRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReposCreateReleaseRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReposCreateReleaseRequest is not found in the empty JSON string", ReposCreateReleaseRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReposCreateReleaseRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReposCreateReleaseRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReposCreateReleaseRequest.openapiRequiredFields) {
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
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if ((jsonObj.get("discussion_category_name") != null && !jsonObj.get("discussion_category_name").isJsonNull()) && !jsonObj.get("discussion_category_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discussion_category_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discussion_category_name").toString()));
      }
      if ((jsonObj.get("make_latest") != null && !jsonObj.get("make_latest").isJsonNull()) && !jsonObj.get("make_latest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `make_latest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("make_latest").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReposCreateReleaseRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReposCreateReleaseRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReposCreateReleaseRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReposCreateReleaseRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReposCreateReleaseRequest>() {
           @Override
           public void write(JsonWriter out, ReposCreateReleaseRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReposCreateReleaseRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReposCreateReleaseRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReposCreateReleaseRequest
  * @throws IOException if the JSON string is invalid with respect to ReposCreateReleaseRequest
  */
  public static ReposCreateReleaseRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReposCreateReleaseRequest.class);
  }

 /**
  * Convert an instance of ReposCreateReleaseRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
