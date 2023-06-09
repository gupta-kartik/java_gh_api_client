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
 * IssuesUpdateMilestoneRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class IssuesUpdateMilestoneRequest {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  /**
   * The state of the milestone. Either &#x60;open&#x60; or &#x60;closed&#x60;.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    OPEN("open"),
    
    CLOSED("closed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state = StateEnum.OPEN;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DUE_ON = "due_on";
  @SerializedName(SERIALIZED_NAME_DUE_ON)
  private OffsetDateTime dueOn;

  public IssuesUpdateMilestoneRequest() {
  }

  public IssuesUpdateMilestoneRequest title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the milestone.
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public IssuesUpdateMilestoneRequest state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the milestone. Either &#x60;open&#x60; or &#x60;closed&#x60;.
   * @return state
  **/
  @javax.annotation.Nullable

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public IssuesUpdateMilestoneRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the milestone.
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public IssuesUpdateMilestoneRequest dueOn(OffsetDateTime dueOn) {
    
    this.dueOn = dueOn;
    return this;
  }

   /**
   * The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;.
   * @return dueOn
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getDueOn() {
    return dueOn;
  }


  public void setDueOn(OffsetDateTime dueOn) {
    this.dueOn = dueOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuesUpdateMilestoneRequest issuesUpdateMilestoneRequest = (IssuesUpdateMilestoneRequest) o;
    return Objects.equals(this.title, issuesUpdateMilestoneRequest.title) &&
        Objects.equals(this.state, issuesUpdateMilestoneRequest.state) &&
        Objects.equals(this.description, issuesUpdateMilestoneRequest.description) &&
        Objects.equals(this.dueOn, issuesUpdateMilestoneRequest.dueOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, state, description, dueOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuesUpdateMilestoneRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("state");
    openapiFields.add("description");
    openapiFields.add("due_on");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssuesUpdateMilestoneRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IssuesUpdateMilestoneRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssuesUpdateMilestoneRequest is not found in the empty JSON string", IssuesUpdateMilestoneRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssuesUpdateMilestoneRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssuesUpdateMilestoneRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssuesUpdateMilestoneRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssuesUpdateMilestoneRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssuesUpdateMilestoneRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssuesUpdateMilestoneRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IssuesUpdateMilestoneRequest>() {
           @Override
           public void write(JsonWriter out, IssuesUpdateMilestoneRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssuesUpdateMilestoneRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssuesUpdateMilestoneRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssuesUpdateMilestoneRequest
  * @throws IOException if the JSON string is invalid with respect to IssuesUpdateMilestoneRequest
  */
  public static IssuesUpdateMilestoneRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssuesUpdateMilestoneRequest.class);
  }

 /**
  * Convert an instance of IssuesUpdateMilestoneRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

