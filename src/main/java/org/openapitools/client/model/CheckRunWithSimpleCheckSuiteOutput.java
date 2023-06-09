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
 * CheckRunWithSimpleCheckSuiteOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class CheckRunWithSimpleCheckSuiteOutput {
  public static final String SERIALIZED_NAME_ANNOTATIONS_COUNT = "annotations_count";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS_COUNT)
  private Integer annotationsCount;

  public static final String SERIALIZED_NAME_ANNOTATIONS_URL = "annotations_url";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS_URL)
  private URI annotationsUrl;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public CheckRunWithSimpleCheckSuiteOutput() {
  }

  public CheckRunWithSimpleCheckSuiteOutput annotationsCount(Integer annotationsCount) {
    
    this.annotationsCount = annotationsCount;
    return this;
  }

   /**
   * Get annotationsCount
   * @return annotationsCount
  **/
  @javax.annotation.Nonnull

  public Integer getAnnotationsCount() {
    return annotationsCount;
  }


  public void setAnnotationsCount(Integer annotationsCount) {
    this.annotationsCount = annotationsCount;
  }


  public CheckRunWithSimpleCheckSuiteOutput annotationsUrl(URI annotationsUrl) {
    
    this.annotationsUrl = annotationsUrl;
    return this;
  }

   /**
   * Get annotationsUrl
   * @return annotationsUrl
  **/
  @javax.annotation.Nonnull

  public URI getAnnotationsUrl() {
    return annotationsUrl;
  }


  public void setAnnotationsUrl(URI annotationsUrl) {
    this.annotationsUrl = annotationsUrl;
  }


  public CheckRunWithSimpleCheckSuiteOutput summary(String summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable

  public String getSummary() {
    return summary;
  }


  public void setSummary(String summary) {
    this.summary = summary;
  }


  public CheckRunWithSimpleCheckSuiteOutput text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public CheckRunWithSimpleCheckSuiteOutput title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckRunWithSimpleCheckSuiteOutput checkRunWithSimpleCheckSuiteOutput = (CheckRunWithSimpleCheckSuiteOutput) o;
    return Objects.equals(this.annotationsCount, checkRunWithSimpleCheckSuiteOutput.annotationsCount) &&
        Objects.equals(this.annotationsUrl, checkRunWithSimpleCheckSuiteOutput.annotationsUrl) &&
        Objects.equals(this.summary, checkRunWithSimpleCheckSuiteOutput.summary) &&
        Objects.equals(this.text, checkRunWithSimpleCheckSuiteOutput.text) &&
        Objects.equals(this.title, checkRunWithSimpleCheckSuiteOutput.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotationsCount, annotationsUrl, summary, text, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckRunWithSimpleCheckSuiteOutput {\n");
    sb.append("    annotationsCount: ").append(toIndentedString(annotationsCount)).append("\n");
    sb.append("    annotationsUrl: ").append(toIndentedString(annotationsUrl)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("annotations_count");
    openapiFields.add("annotations_url");
    openapiFields.add("summary");
    openapiFields.add("text");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("annotations_count");
    openapiRequiredFields.add("annotations_url");
    openapiRequiredFields.add("summary");
    openapiRequiredFields.add("text");
    openapiRequiredFields.add("title");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckRunWithSimpleCheckSuiteOutput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CheckRunWithSimpleCheckSuiteOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckRunWithSimpleCheckSuiteOutput is not found in the empty JSON string", CheckRunWithSimpleCheckSuiteOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CheckRunWithSimpleCheckSuiteOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CheckRunWithSimpleCheckSuiteOutput` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckRunWithSimpleCheckSuiteOutput.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("annotations_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `annotations_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("annotations_url").toString()));
      }
      if (!jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckRunWithSimpleCheckSuiteOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckRunWithSimpleCheckSuiteOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckRunWithSimpleCheckSuiteOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckRunWithSimpleCheckSuiteOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckRunWithSimpleCheckSuiteOutput>() {
           @Override
           public void write(JsonWriter out, CheckRunWithSimpleCheckSuiteOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CheckRunWithSimpleCheckSuiteOutput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CheckRunWithSimpleCheckSuiteOutput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckRunWithSimpleCheckSuiteOutput
  * @throws IOException if the JSON string is invalid with respect to CheckRunWithSimpleCheckSuiteOutput
  */
  public static CheckRunWithSimpleCheckSuiteOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckRunWithSimpleCheckSuiteOutput.class);
  }

 /**
  * Convert an instance of CheckRunWithSimpleCheckSuiteOutput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

