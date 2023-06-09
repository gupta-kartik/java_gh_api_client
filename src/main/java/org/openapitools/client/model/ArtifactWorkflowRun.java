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
 * ArtifactWorkflowRun
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ArtifactWorkflowRun {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_REPOSITORY_ID = "repository_id";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_ID)
  private Integer repositoryId;

  public static final String SERIALIZED_NAME_HEAD_REPOSITORY_ID = "head_repository_id";
  @SerializedName(SERIALIZED_NAME_HEAD_REPOSITORY_ID)
  private Integer headRepositoryId;

  public static final String SERIALIZED_NAME_HEAD_BRANCH = "head_branch";
  @SerializedName(SERIALIZED_NAME_HEAD_BRANCH)
  private String headBranch;

  public static final String SERIALIZED_NAME_HEAD_SHA = "head_sha";
  @SerializedName(SERIALIZED_NAME_HEAD_SHA)
  private String headSha;

  public ArtifactWorkflowRun() {
  }

  public ArtifactWorkflowRun id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ArtifactWorkflowRun repositoryId(Integer repositoryId) {
    
    this.repositoryId = repositoryId;
    return this;
  }

   /**
   * Get repositoryId
   * @return repositoryId
  **/
  @javax.annotation.Nullable

  public Integer getRepositoryId() {
    return repositoryId;
  }


  public void setRepositoryId(Integer repositoryId) {
    this.repositoryId = repositoryId;
  }


  public ArtifactWorkflowRun headRepositoryId(Integer headRepositoryId) {
    
    this.headRepositoryId = headRepositoryId;
    return this;
  }

   /**
   * Get headRepositoryId
   * @return headRepositoryId
  **/
  @javax.annotation.Nullable

  public Integer getHeadRepositoryId() {
    return headRepositoryId;
  }


  public void setHeadRepositoryId(Integer headRepositoryId) {
    this.headRepositoryId = headRepositoryId;
  }


  public ArtifactWorkflowRun headBranch(String headBranch) {
    
    this.headBranch = headBranch;
    return this;
  }

   /**
   * Get headBranch
   * @return headBranch
  **/
  @javax.annotation.Nullable

  public String getHeadBranch() {
    return headBranch;
  }


  public void setHeadBranch(String headBranch) {
    this.headBranch = headBranch;
  }


  public ArtifactWorkflowRun headSha(String headSha) {
    
    this.headSha = headSha;
    return this;
  }

   /**
   * Get headSha
   * @return headSha
  **/
  @javax.annotation.Nullable

  public String getHeadSha() {
    return headSha;
  }


  public void setHeadSha(String headSha) {
    this.headSha = headSha;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactWorkflowRun artifactWorkflowRun = (ArtifactWorkflowRun) o;
    return Objects.equals(this.id, artifactWorkflowRun.id) &&
        Objects.equals(this.repositoryId, artifactWorkflowRun.repositoryId) &&
        Objects.equals(this.headRepositoryId, artifactWorkflowRun.headRepositoryId) &&
        Objects.equals(this.headBranch, artifactWorkflowRun.headBranch) &&
        Objects.equals(this.headSha, artifactWorkflowRun.headSha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, repositoryId, headRepositoryId, headBranch, headSha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactWorkflowRun {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    headRepositoryId: ").append(toIndentedString(headRepositoryId)).append("\n");
    sb.append("    headBranch: ").append(toIndentedString(headBranch)).append("\n");
    sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("repository_id");
    openapiFields.add("head_repository_id");
    openapiFields.add("head_branch");
    openapiFields.add("head_sha");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ArtifactWorkflowRun
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ArtifactWorkflowRun.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArtifactWorkflowRun is not found in the empty JSON string", ArtifactWorkflowRun.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ArtifactWorkflowRun.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ArtifactWorkflowRun` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("head_branch") != null && !jsonObj.get("head_branch").isJsonNull()) && !jsonObj.get("head_branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `head_branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("head_branch").toString()));
      }
      if ((jsonObj.get("head_sha") != null && !jsonObj.get("head_sha").isJsonNull()) && !jsonObj.get("head_sha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `head_sha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("head_sha").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArtifactWorkflowRun.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArtifactWorkflowRun' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArtifactWorkflowRun> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArtifactWorkflowRun.class));

       return (TypeAdapter<T>) new TypeAdapter<ArtifactWorkflowRun>() {
           @Override
           public void write(JsonWriter out, ArtifactWorkflowRun value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ArtifactWorkflowRun read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ArtifactWorkflowRun given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArtifactWorkflowRun
  * @throws IOException if the JSON string is invalid with respect to ArtifactWorkflowRun
  */
  public static ArtifactWorkflowRun fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArtifactWorkflowRun.class);
  }

 /**
  * Convert an instance of ArtifactWorkflowRun to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

