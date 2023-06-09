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
 * TeamPermissions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class TeamPermissions {
  public static final String SERIALIZED_NAME_PULL = "pull";
  @SerializedName(SERIALIZED_NAME_PULL)
  private Boolean pull;

  public static final String SERIALIZED_NAME_TRIAGE = "triage";
  @SerializedName(SERIALIZED_NAME_TRIAGE)
  private Boolean triage;

  public static final String SERIALIZED_NAME_PUSH = "push";
  @SerializedName(SERIALIZED_NAME_PUSH)
  private Boolean push;

  public static final String SERIALIZED_NAME_MAINTAIN = "maintain";
  @SerializedName(SERIALIZED_NAME_MAINTAIN)
  private Boolean maintain;

  public static final String SERIALIZED_NAME_ADMIN = "admin";
  @SerializedName(SERIALIZED_NAME_ADMIN)
  private Boolean admin;

  public TeamPermissions() {
  }

  public TeamPermissions pull(Boolean pull) {
    
    this.pull = pull;
    return this;
  }

   /**
   * Get pull
   * @return pull
  **/
  @javax.annotation.Nonnull

  public Boolean getPull() {
    return pull;
  }


  public void setPull(Boolean pull) {
    this.pull = pull;
  }


  public TeamPermissions triage(Boolean triage) {
    
    this.triage = triage;
    return this;
  }

   /**
   * Get triage
   * @return triage
  **/
  @javax.annotation.Nonnull

  public Boolean getTriage() {
    return triage;
  }


  public void setTriage(Boolean triage) {
    this.triage = triage;
  }


  public TeamPermissions push(Boolean push) {
    
    this.push = push;
    return this;
  }

   /**
   * Get push
   * @return push
  **/
  @javax.annotation.Nonnull

  public Boolean getPush() {
    return push;
  }


  public void setPush(Boolean push) {
    this.push = push;
  }


  public TeamPermissions maintain(Boolean maintain) {
    
    this.maintain = maintain;
    return this;
  }

   /**
   * Get maintain
   * @return maintain
  **/
  @javax.annotation.Nonnull

  public Boolean getMaintain() {
    return maintain;
  }


  public void setMaintain(Boolean maintain) {
    this.maintain = maintain;
  }


  public TeamPermissions admin(Boolean admin) {
    
    this.admin = admin;
    return this;
  }

   /**
   * Get admin
   * @return admin
  **/
  @javax.annotation.Nonnull

  public Boolean getAdmin() {
    return admin;
  }


  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamPermissions teamPermissions = (TeamPermissions) o;
    return Objects.equals(this.pull, teamPermissions.pull) &&
        Objects.equals(this.triage, teamPermissions.triage) &&
        Objects.equals(this.push, teamPermissions.push) &&
        Objects.equals(this.maintain, teamPermissions.maintain) &&
        Objects.equals(this.admin, teamPermissions.admin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pull, triage, push, maintain, admin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamPermissions {\n");
    sb.append("    pull: ").append(toIndentedString(pull)).append("\n");
    sb.append("    triage: ").append(toIndentedString(triage)).append("\n");
    sb.append("    push: ").append(toIndentedString(push)).append("\n");
    sb.append("    maintain: ").append(toIndentedString(maintain)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
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
    openapiFields.add("pull");
    openapiFields.add("triage");
    openapiFields.add("push");
    openapiFields.add("maintain");
    openapiFields.add("admin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pull");
    openapiRequiredFields.add("triage");
    openapiRequiredFields.add("push");
    openapiRequiredFields.add("maintain");
    openapiRequiredFields.add("admin");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TeamPermissions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TeamPermissions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TeamPermissions is not found in the empty JSON string", TeamPermissions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TeamPermissions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TeamPermissions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TeamPermissions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TeamPermissions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TeamPermissions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TeamPermissions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TeamPermissions.class));

       return (TypeAdapter<T>) new TypeAdapter<TeamPermissions>() {
           @Override
           public void write(JsonWriter out, TeamPermissions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TeamPermissions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TeamPermissions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TeamPermissions
  * @throws IOException if the JSON string is invalid with respect to TeamPermissions
  */
  public static TeamPermissions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TeamPermissions.class);
  }

 /**
  * Convert an instance of TeamPermissions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

