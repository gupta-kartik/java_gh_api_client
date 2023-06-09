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
import org.openapitools.client.model.Repository3;
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
 * PullRequestBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class PullRequestBase {
  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_REPO = "repo";
  @SerializedName(SERIALIZED_NAME_REPO)
  private Repository3 repo;

  public static final String SERIALIZED_NAME_SHA = "sha";
  @SerializedName(SERIALIZED_NAME_SHA)
  private String sha;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;

  public PullRequestBase() {
  }

  public PullRequestBase label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nonnull

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public PullRequestBase ref(String ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @javax.annotation.Nonnull

  public String getRef() {
    return ref;
  }


  public void setRef(String ref) {
    this.ref = ref;
  }


  public PullRequestBase repo(Repository3 repo) {
    
    this.repo = repo;
    return this;
  }

   /**
   * Get repo
   * @return repo
  **/
  @javax.annotation.Nonnull

  public Repository3 getRepo() {
    return repo;
  }


  public void setRepo(Repository3 repo) {
    this.repo = repo;
  }


  public PullRequestBase sha(String sha) {
    
    this.sha = sha;
    return this;
  }

   /**
   * Get sha
   * @return sha
  **/
  @javax.annotation.Nonnull

  public String getSha() {
    return sha;
  }


  public void setSha(String sha) {
    this.sha = sha;
  }


  public PullRequestBase user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PullRequestBase pullRequestBase = (PullRequestBase) o;
    return Objects.equals(this.label, pullRequestBase.label) &&
        Objects.equals(this.ref, pullRequestBase.ref) &&
        Objects.equals(this.repo, pullRequestBase.repo) &&
        Objects.equals(this.sha, pullRequestBase.sha) &&
        Objects.equals(this.user, pullRequestBase.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, ref, repo, sha, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullRequestBase {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("label");
    openapiFields.add("ref");
    openapiFields.add("repo");
    openapiFields.add("sha");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("label");
    openapiRequiredFields.add("ref");
    openapiRequiredFields.add("repo");
    openapiRequiredFields.add("sha");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PullRequestBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PullRequestBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PullRequestBase is not found in the empty JSON string", PullRequestBase.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PullRequestBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PullRequestBase` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PullRequestBase.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if (!jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      // validate the required field `repo`
      Repository3.validateJsonObject(jsonObj.getAsJsonObject("repo"));
      if (!jsonObj.get("sha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha").toString()));
      }
      // validate the required field `user`
      User.validateJsonObject(jsonObj.getAsJsonObject("user"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PullRequestBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PullRequestBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PullRequestBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PullRequestBase.class));

       return (TypeAdapter<T>) new TypeAdapter<PullRequestBase>() {
           @Override
           public void write(JsonWriter out, PullRequestBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PullRequestBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PullRequestBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PullRequestBase
  * @throws IOException if the JSON string is invalid with respect to PullRequestBase
  */
  public static PullRequestBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PullRequestBase.class);
  }

 /**
  * Convert an instance of PullRequestBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

