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
import org.openapitools.client.model.RequiredWorkflow;

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
 * ActionsListRequiredWorkflows200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ActionsListRequiredWorkflows200Response {
  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_REQUIRED_WORKFLOWS = "required_workflows";
  @SerializedName(SERIALIZED_NAME_REQUIRED_WORKFLOWS)
  private List<RequiredWorkflow> requiredWorkflows = new ArrayList<>();

  public ActionsListRequiredWorkflows200Response() {
  }

  public ActionsListRequiredWorkflows200Response totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nonnull

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public ActionsListRequiredWorkflows200Response requiredWorkflows(List<RequiredWorkflow> requiredWorkflows) {
    
    this.requiredWorkflows = requiredWorkflows;
    return this;
  }

  public ActionsListRequiredWorkflows200Response addRequiredWorkflowsItem(RequiredWorkflow requiredWorkflowsItem) {
    if (this.requiredWorkflows == null) {
      this.requiredWorkflows = new ArrayList<>();
    }
    this.requiredWorkflows.add(requiredWorkflowsItem);
    return this;
  }

   /**
   * Get requiredWorkflows
   * @return requiredWorkflows
  **/
  @javax.annotation.Nonnull

  public List<RequiredWorkflow> getRequiredWorkflows() {
    return requiredWorkflows;
  }


  public void setRequiredWorkflows(List<RequiredWorkflow> requiredWorkflows) {
    this.requiredWorkflows = requiredWorkflows;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionsListRequiredWorkflows200Response actionsListRequiredWorkflows200Response = (ActionsListRequiredWorkflows200Response) o;
    return Objects.equals(this.totalCount, actionsListRequiredWorkflows200Response.totalCount) &&
        Objects.equals(this.requiredWorkflows, actionsListRequiredWorkflows200Response.requiredWorkflows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, requiredWorkflows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionsListRequiredWorkflows200Response {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    requiredWorkflows: ").append(toIndentedString(requiredWorkflows)).append("\n");
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
    openapiFields.add("total_count");
    openapiFields.add("required_workflows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("total_count");
    openapiRequiredFields.add("required_workflows");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActionsListRequiredWorkflows200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ActionsListRequiredWorkflows200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActionsListRequiredWorkflows200Response is not found in the empty JSON string", ActionsListRequiredWorkflows200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ActionsListRequiredWorkflows200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActionsListRequiredWorkflows200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ActionsListRequiredWorkflows200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("required_workflows").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `required_workflows` to be an array in the JSON string but got `%s`", jsonObj.get("required_workflows").toString()));
      }

      JsonArray jsonArrayrequiredWorkflows = jsonObj.getAsJsonArray("required_workflows");
      // validate the required field `required_workflows` (array)
      for (int i = 0; i < jsonArrayrequiredWorkflows.size(); i++) {
        RequiredWorkflow.validateJsonObject(jsonArrayrequiredWorkflows.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActionsListRequiredWorkflows200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActionsListRequiredWorkflows200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActionsListRequiredWorkflows200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActionsListRequiredWorkflows200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ActionsListRequiredWorkflows200Response>() {
           @Override
           public void write(JsonWriter out, ActionsListRequiredWorkflows200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActionsListRequiredWorkflows200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActionsListRequiredWorkflows200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActionsListRequiredWorkflows200Response
  * @throws IOException if the JSON string is invalid with respect to ActionsListRequiredWorkflows200Response
  */
  public static ActionsListRequiredWorkflows200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActionsListRequiredWorkflows200Response.class);
  }

 /**
  * Convert an instance of ActionsListRequiredWorkflows200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

