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
import java.util.ArrayList;
import java.util.List;

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
 * IssuesAddLabelsRequestOneOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class IssuesAddLabelsRequestOneOf {
  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels;

  public IssuesAddLabelsRequestOneOf() {
  }

  public IssuesAddLabelsRequestOneOf labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public IssuesAddLabelsRequestOneOf addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * The names of the labels to add to the issue&#39;s existing labels. You can pass an empty array to remove all labels. Alternatively, you can pass a single label as a &#x60;string&#x60; or an &#x60;array&#x60; of labels directly, but GitHub recommends passing an object with the &#x60;labels&#x60; key. You can also replace all of the labels for an issue. For more information, see \&quot;[Set labels for an issue](https://docs.github.com/rest/reference/issues#set-labels-for-an-issue).\&quot;
   * @return labels
  **/
  @javax.annotation.Nullable

  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuesAddLabelsRequestOneOf issuesAddLabelsRequestOneOf = (IssuesAddLabelsRequestOneOf) o;
    return Objects.equals(this.labels, issuesAddLabelsRequestOneOf.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuesAddLabelsRequestOneOf {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
    openapiFields.add("labels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssuesAddLabelsRequestOneOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IssuesAddLabelsRequestOneOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssuesAddLabelsRequestOneOf is not found in the empty JSON string", IssuesAddLabelsRequestOneOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssuesAddLabelsRequestOneOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssuesAddLabelsRequestOneOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssuesAddLabelsRequestOneOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssuesAddLabelsRequestOneOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssuesAddLabelsRequestOneOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssuesAddLabelsRequestOneOf.class));

       return (TypeAdapter<T>) new TypeAdapter<IssuesAddLabelsRequestOneOf>() {
           @Override
           public void write(JsonWriter out, IssuesAddLabelsRequestOneOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssuesAddLabelsRequestOneOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssuesAddLabelsRequestOneOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssuesAddLabelsRequestOneOf
  * @throws IOException if the JSON string is invalid with respect to IssuesAddLabelsRequestOneOf
  */
  public static IssuesAddLabelsRequestOneOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssuesAddLabelsRequestOneOf.class);
  }

 /**
  * Convert an instance of IssuesAddLabelsRequestOneOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
