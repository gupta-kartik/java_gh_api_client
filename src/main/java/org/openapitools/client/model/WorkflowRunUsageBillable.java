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
import org.openapitools.client.model.WorkflowRunUsageBillableUBUNTU;

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
 * WorkflowRunUsageBillable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WorkflowRunUsageBillable {
  public static final String SERIALIZED_NAME_U_B_U_N_T_U = "UBUNTU";
  @SerializedName(SERIALIZED_NAME_U_B_U_N_T_U)
  private WorkflowRunUsageBillableUBUNTU UBUNTU;

  public static final String SERIALIZED_NAME_M_A_C_O_S = "MACOS";
  @SerializedName(SERIALIZED_NAME_M_A_C_O_S)
  private WorkflowRunUsageBillableUBUNTU MACOS;

  public static final String SERIALIZED_NAME_W_I_N_D_O_W_S = "WINDOWS";
  @SerializedName(SERIALIZED_NAME_W_I_N_D_O_W_S)
  private WorkflowRunUsageBillableUBUNTU WINDOWS;

  public WorkflowRunUsageBillable() {
  }

  public WorkflowRunUsageBillable UBUNTU(WorkflowRunUsageBillableUBUNTU UBUNTU) {
    
    this.UBUNTU = UBUNTU;
    return this;
  }

   /**
   * Get UBUNTU
   * @return UBUNTU
  **/
  @javax.annotation.Nullable

  public WorkflowRunUsageBillableUBUNTU getUBUNTU() {
    return UBUNTU;
  }


  public void setUBUNTU(WorkflowRunUsageBillableUBUNTU UBUNTU) {
    this.UBUNTU = UBUNTU;
  }


  public WorkflowRunUsageBillable MACOS(WorkflowRunUsageBillableUBUNTU MACOS) {
    
    this.MACOS = MACOS;
    return this;
  }

   /**
   * Get MACOS
   * @return MACOS
  **/
  @javax.annotation.Nullable

  public WorkflowRunUsageBillableUBUNTU getMACOS() {
    return MACOS;
  }


  public void setMACOS(WorkflowRunUsageBillableUBUNTU MACOS) {
    this.MACOS = MACOS;
  }


  public WorkflowRunUsageBillable WINDOWS(WorkflowRunUsageBillableUBUNTU WINDOWS) {
    
    this.WINDOWS = WINDOWS;
    return this;
  }

   /**
   * Get WINDOWS
   * @return WINDOWS
  **/
  @javax.annotation.Nullable

  public WorkflowRunUsageBillableUBUNTU getWINDOWS() {
    return WINDOWS;
  }


  public void setWINDOWS(WorkflowRunUsageBillableUBUNTU WINDOWS) {
    this.WINDOWS = WINDOWS;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowRunUsageBillable workflowRunUsageBillable = (WorkflowRunUsageBillable) o;
    return Objects.equals(this.UBUNTU, workflowRunUsageBillable.UBUNTU) &&
        Objects.equals(this.MACOS, workflowRunUsageBillable.MACOS) &&
        Objects.equals(this.WINDOWS, workflowRunUsageBillable.WINDOWS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(UBUNTU, MACOS, WINDOWS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRunUsageBillable {\n");
    sb.append("    UBUNTU: ").append(toIndentedString(UBUNTU)).append("\n");
    sb.append("    MACOS: ").append(toIndentedString(MACOS)).append("\n");
    sb.append("    WINDOWS: ").append(toIndentedString(WINDOWS)).append("\n");
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
    openapiFields.add("UBUNTU");
    openapiFields.add("MACOS");
    openapiFields.add("WINDOWS");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowRunUsageBillable
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkflowRunUsageBillable.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowRunUsageBillable is not found in the empty JSON string", WorkflowRunUsageBillable.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkflowRunUsageBillable.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkflowRunUsageBillable` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `UBUNTU`
      if (jsonObj.get("UBUNTU") != null && !jsonObj.get("UBUNTU").isJsonNull()) {
        WorkflowRunUsageBillableUBUNTU.validateJsonObject(jsonObj.getAsJsonObject("UBUNTU"));
      }
      // validate the optional field `MACOS`
      if (jsonObj.get("MACOS") != null && !jsonObj.get("MACOS").isJsonNull()) {
        WorkflowRunUsageBillableUBUNTU.validateJsonObject(jsonObj.getAsJsonObject("MACOS"));
      }
      // validate the optional field `WINDOWS`
      if (jsonObj.get("WINDOWS") != null && !jsonObj.get("WINDOWS").isJsonNull()) {
        WorkflowRunUsageBillableUBUNTU.validateJsonObject(jsonObj.getAsJsonObject("WINDOWS"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowRunUsageBillable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowRunUsageBillable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowRunUsageBillable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowRunUsageBillable.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowRunUsageBillable>() {
           @Override
           public void write(JsonWriter out, WorkflowRunUsageBillable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkflowRunUsageBillable read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkflowRunUsageBillable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowRunUsageBillable
  * @throws IOException if the JSON string is invalid with respect to WorkflowRunUsageBillable
  */
  public static WorkflowRunUsageBillable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowRunUsageBillable.class);
  }

 /**
  * Convert an instance of WorkflowRunUsageBillable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

