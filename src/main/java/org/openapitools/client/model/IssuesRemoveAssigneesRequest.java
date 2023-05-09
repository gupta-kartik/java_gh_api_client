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
 * IssuesRemoveAssigneesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class IssuesRemoveAssigneesRequest {
  public static final String SERIALIZED_NAME_ASSIGNEES = "assignees";
  @SerializedName(SERIALIZED_NAME_ASSIGNEES)
  private List<String> assignees;

  public IssuesRemoveAssigneesRequest() {
  }

  public IssuesRemoveAssigneesRequest assignees(List<String> assignees) {
    
    this.assignees = assignees;
    return this;
  }

  public IssuesRemoveAssigneesRequest addAssigneesItem(String assigneesItem) {
    if (this.assignees == null) {
      this.assignees = new ArrayList<>();
    }
    this.assignees.add(assigneesItem);
    return this;
  }

   /**
   * Usernames of assignees to remove from an issue. _NOTE: Only users with push access can remove assignees from an issue. Assignees are silently ignored otherwise._
   * @return assignees
  **/
  @javax.annotation.Nullable

  public List<String> getAssignees() {
    return assignees;
  }


  public void setAssignees(List<String> assignees) {
    this.assignees = assignees;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuesRemoveAssigneesRequest issuesRemoveAssigneesRequest = (IssuesRemoveAssigneesRequest) o;
    return Objects.equals(this.assignees, issuesRemoveAssigneesRequest.assignees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuesRemoveAssigneesRequest {\n");
    sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
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
    openapiFields.add("assignees");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssuesRemoveAssigneesRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IssuesRemoveAssigneesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssuesRemoveAssigneesRequest is not found in the empty JSON string", IssuesRemoveAssigneesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssuesRemoveAssigneesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssuesRemoveAssigneesRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("assignees") != null && !jsonObj.get("assignees").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignees` to be an array in the JSON string but got `%s`", jsonObj.get("assignees").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssuesRemoveAssigneesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssuesRemoveAssigneesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssuesRemoveAssigneesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssuesRemoveAssigneesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IssuesRemoveAssigneesRequest>() {
           @Override
           public void write(JsonWriter out, IssuesRemoveAssigneesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssuesRemoveAssigneesRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssuesRemoveAssigneesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssuesRemoveAssigneesRequest
  * @throws IOException if the JSON string is invalid with respect to IssuesRemoveAssigneesRequest
  */
  public static IssuesRemoveAssigneesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssuesRemoveAssigneesRequest.class);
  }

 /**
  * Convert an instance of IssuesRemoveAssigneesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
