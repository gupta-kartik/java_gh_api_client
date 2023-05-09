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
import org.openapitools.client.model.EnvironmentApprovalsEnvironmentsInner;
import org.openapitools.client.model.SimpleUser;

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
 * An entry in the reviews log for environment deployments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class EnvironmentApprovals {
  public static final String SERIALIZED_NAME_ENVIRONMENTS = "environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private List<EnvironmentApprovalsEnvironmentsInner> environments = new ArrayList<>();

  /**
   * Whether deployment to the environment(s) was approved or rejected or pending (with comments)
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    APPROVED("approved"),
    
    REJECTED("rejected"),
    
    PENDING("pending");

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
  private StateEnum state;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private SimpleUser user;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public EnvironmentApprovals() {
  }

  public EnvironmentApprovals environments(List<EnvironmentApprovalsEnvironmentsInner> environments) {
    
    this.environments = environments;
    return this;
  }

  public EnvironmentApprovals addEnvironmentsItem(EnvironmentApprovalsEnvironmentsInner environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

   /**
   * The list of environments that were approved or rejected
   * @return environments
  **/
  @javax.annotation.Nonnull

  public List<EnvironmentApprovalsEnvironmentsInner> getEnvironments() {
    return environments;
  }


  public void setEnvironments(List<EnvironmentApprovalsEnvironmentsInner> environments) {
    this.environments = environments;
  }


  public EnvironmentApprovals state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Whether deployment to the environment(s) was approved or rejected or pending (with comments)
   * @return state
  **/
  @javax.annotation.Nonnull

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public EnvironmentApprovals user(SimpleUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull

  public SimpleUser getUser() {
    return user;
  }


  public void setUser(SimpleUser user) {
    this.user = user;
  }


  public EnvironmentApprovals comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * The comment submitted with the deployment review
   * @return comment
  **/
  @javax.annotation.Nonnull

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentApprovals environmentApprovals = (EnvironmentApprovals) o;
    return Objects.equals(this.environments, environmentApprovals.environments) &&
        Objects.equals(this.state, environmentApprovals.state) &&
        Objects.equals(this.user, environmentApprovals.user) &&
        Objects.equals(this.comment, environmentApprovals.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environments, state, user, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentApprovals {\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
    openapiFields.add("environments");
    openapiFields.add("state");
    openapiFields.add("user");
    openapiFields.add("comment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("environments");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("comment");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EnvironmentApprovals
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EnvironmentApprovals.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnvironmentApprovals is not found in the empty JSON string", EnvironmentApprovals.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EnvironmentApprovals.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnvironmentApprovals` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EnvironmentApprovals.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("environments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `environments` to be an array in the JSON string but got `%s`", jsonObj.get("environments").toString()));
      }

      JsonArray jsonArrayenvironments = jsonObj.getAsJsonArray("environments");
      // validate the required field `environments` (array)
      for (int i = 0; i < jsonArrayenvironments.size(); i++) {
        EnvironmentApprovalsEnvironmentsInner.validateJsonObject(jsonArrayenvironments.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the required field `user`
      SimpleUser.validateJsonObject(jsonObj.getAsJsonObject("user"));
      if (!jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnvironmentApprovals.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnvironmentApprovals' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnvironmentApprovals> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnvironmentApprovals.class));

       return (TypeAdapter<T>) new TypeAdapter<EnvironmentApprovals>() {
           @Override
           public void write(JsonWriter out, EnvironmentApprovals value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnvironmentApprovals read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnvironmentApprovals given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnvironmentApprovals
  * @throws IOException if the JSON string is invalid with respect to EnvironmentApprovals
  */
  public static EnvironmentApprovals fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvironmentApprovals.class);
  }

 /**
  * Convert an instance of EnvironmentApprovals to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

