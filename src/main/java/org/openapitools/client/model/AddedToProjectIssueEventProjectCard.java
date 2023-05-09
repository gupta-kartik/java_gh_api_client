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
 * AddedToProjectIssueEventProjectCard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class AddedToProjectIssueEventProjectCard {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Integer projectId;

  public static final String SERIALIZED_NAME_PROJECT_URL = "project_url";
  @SerializedName(SERIALIZED_NAME_PROJECT_URL)
  private URI projectUrl;

  public static final String SERIALIZED_NAME_COLUMN_NAME = "column_name";
  @SerializedName(SERIALIZED_NAME_COLUMN_NAME)
  private String columnName;

  public static final String SERIALIZED_NAME_PREVIOUS_COLUMN_NAME = "previous_column_name";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_COLUMN_NAME)
  private String previousColumnName;

  public AddedToProjectIssueEventProjectCard() {
  }

  public AddedToProjectIssueEventProjectCard id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public AddedToProjectIssueEventProjectCard url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public AddedToProjectIssueEventProjectCard projectId(Integer projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nonnull

  public Integer getProjectId() {
    return projectId;
  }


  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }


  public AddedToProjectIssueEventProjectCard projectUrl(URI projectUrl) {
    
    this.projectUrl = projectUrl;
    return this;
  }

   /**
   * Get projectUrl
   * @return projectUrl
  **/
  @javax.annotation.Nonnull

  public URI getProjectUrl() {
    return projectUrl;
  }


  public void setProjectUrl(URI projectUrl) {
    this.projectUrl = projectUrl;
  }


  public AddedToProjectIssueEventProjectCard columnName(String columnName) {
    
    this.columnName = columnName;
    return this;
  }

   /**
   * Get columnName
   * @return columnName
  **/
  @javax.annotation.Nonnull

  public String getColumnName() {
    return columnName;
  }


  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  public AddedToProjectIssueEventProjectCard previousColumnName(String previousColumnName) {
    
    this.previousColumnName = previousColumnName;
    return this;
  }

   /**
   * Get previousColumnName
   * @return previousColumnName
  **/
  @javax.annotation.Nullable

  public String getPreviousColumnName() {
    return previousColumnName;
  }


  public void setPreviousColumnName(String previousColumnName) {
    this.previousColumnName = previousColumnName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddedToProjectIssueEventProjectCard addedToProjectIssueEventProjectCard = (AddedToProjectIssueEventProjectCard) o;
    return Objects.equals(this.id, addedToProjectIssueEventProjectCard.id) &&
        Objects.equals(this.url, addedToProjectIssueEventProjectCard.url) &&
        Objects.equals(this.projectId, addedToProjectIssueEventProjectCard.projectId) &&
        Objects.equals(this.projectUrl, addedToProjectIssueEventProjectCard.projectUrl) &&
        Objects.equals(this.columnName, addedToProjectIssueEventProjectCard.columnName) &&
        Objects.equals(this.previousColumnName, addedToProjectIssueEventProjectCard.previousColumnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, projectId, projectUrl, columnName, previousColumnName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddedToProjectIssueEventProjectCard {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectUrl: ").append(toIndentedString(projectUrl)).append("\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    previousColumnName: ").append(toIndentedString(previousColumnName)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("project_id");
    openapiFields.add("project_url");
    openapiFields.add("column_name");
    openapiFields.add("previous_column_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("project_id");
    openapiRequiredFields.add("project_url");
    openapiRequiredFields.add("column_name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddedToProjectIssueEventProjectCard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddedToProjectIssueEventProjectCard.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddedToProjectIssueEventProjectCard is not found in the empty JSON string", AddedToProjectIssueEventProjectCard.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddedToProjectIssueEventProjectCard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddedToProjectIssueEventProjectCard` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddedToProjectIssueEventProjectCard.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("project_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_url").toString()));
      }
      if (!jsonObj.get("column_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `column_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("column_name").toString()));
      }
      if ((jsonObj.get("previous_column_name") != null && !jsonObj.get("previous_column_name").isJsonNull()) && !jsonObj.get("previous_column_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previous_column_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previous_column_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddedToProjectIssueEventProjectCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddedToProjectIssueEventProjectCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddedToProjectIssueEventProjectCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddedToProjectIssueEventProjectCard.class));

       return (TypeAdapter<T>) new TypeAdapter<AddedToProjectIssueEventProjectCard>() {
           @Override
           public void write(JsonWriter out, AddedToProjectIssueEventProjectCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddedToProjectIssueEventProjectCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddedToProjectIssueEventProjectCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddedToProjectIssueEventProjectCard
  * @throws IOException if the JSON string is invalid with respect to AddedToProjectIssueEventProjectCard
  */
  public static AddedToProjectIssueEventProjectCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddedToProjectIssueEventProjectCard.class);
  }

 /**
  * Convert an instance of AddedToProjectIssueEventProjectCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

