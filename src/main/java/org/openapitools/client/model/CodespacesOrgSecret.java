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
import java.time.OffsetDateTime;

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
 * Secrets for a GitHub Codespace.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class CodespacesOrgSecret {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  /**
   * The type of repositories in the organization that the secret is visible to
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    ALL("all"),
    
    PRIVATE("private"),
    
    SELECTED("selected");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VisibilityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private VisibilityEnum visibility;

  public static final String SERIALIZED_NAME_SELECTED_REPOSITORIES_URL = "selected_repositories_url";
  @SerializedName(SERIALIZED_NAME_SELECTED_REPOSITORIES_URL)
  private URI selectedRepositoriesUrl;

  public CodespacesOrgSecret() {
  }

  public CodespacesOrgSecret name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the secret
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CodespacesOrgSecret createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time at which the secret was created, in ISO 8601 format&#39;:&#39; YYYY-MM-DDTHH:MM:SSZ.
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CodespacesOrgSecret updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time at which the secret was created, in ISO 8601 format&#39;:&#39; YYYY-MM-DDTHH:MM:SSZ.
   * @return updatedAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CodespacesOrgSecret visibility(VisibilityEnum visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * The type of repositories in the organization that the secret is visible to
   * @return visibility
  **/
  @javax.annotation.Nonnull

  public VisibilityEnum getVisibility() {
    return visibility;
  }


  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }


  public CodespacesOrgSecret selectedRepositoriesUrl(URI selectedRepositoriesUrl) {
    
    this.selectedRepositoriesUrl = selectedRepositoriesUrl;
    return this;
  }

   /**
   * The API URL at which the list of repositories this secret is visible to can be retrieved
   * @return selectedRepositoriesUrl
  **/
  @javax.annotation.Nullable

  public URI getSelectedRepositoriesUrl() {
    return selectedRepositoriesUrl;
  }


  public void setSelectedRepositoriesUrl(URI selectedRepositoriesUrl) {
    this.selectedRepositoriesUrl = selectedRepositoriesUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodespacesOrgSecret codespacesOrgSecret = (CodespacesOrgSecret) o;
    return Objects.equals(this.name, codespacesOrgSecret.name) &&
        Objects.equals(this.createdAt, codespacesOrgSecret.createdAt) &&
        Objects.equals(this.updatedAt, codespacesOrgSecret.updatedAt) &&
        Objects.equals(this.visibility, codespacesOrgSecret.visibility) &&
        Objects.equals(this.selectedRepositoriesUrl, codespacesOrgSecret.selectedRepositoriesUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, createdAt, updatedAt, visibility, selectedRepositoriesUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodespacesOrgSecret {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    selectedRepositoriesUrl: ").append(toIndentedString(selectedRepositoriesUrl)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("visibility");
    openapiFields.add("selected_repositories_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("visibility");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CodespacesOrgSecret
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CodespacesOrgSecret.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CodespacesOrgSecret is not found in the empty JSON string", CodespacesOrgSecret.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CodespacesOrgSecret.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CodespacesOrgSecret` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CodespacesOrgSecret.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      if ((jsonObj.get("selected_repositories_url") != null && !jsonObj.get("selected_repositories_url").isJsonNull()) && !jsonObj.get("selected_repositories_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selected_repositories_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selected_repositories_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CodespacesOrgSecret.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CodespacesOrgSecret' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CodespacesOrgSecret> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CodespacesOrgSecret.class));

       return (TypeAdapter<T>) new TypeAdapter<CodespacesOrgSecret>() {
           @Override
           public void write(JsonWriter out, CodespacesOrgSecret value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CodespacesOrgSecret read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CodespacesOrgSecret given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CodespacesOrgSecret
  * @throws IOException if the JSON string is invalid with respect to CodespacesOrgSecret
  */
  public static CodespacesOrgSecret fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CodespacesOrgSecret.class);
  }

 /**
  * Convert an instance of CodespacesOrgSecret to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

