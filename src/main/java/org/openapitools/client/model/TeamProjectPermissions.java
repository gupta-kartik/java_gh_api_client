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
 * TeamProjectPermissions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class TeamProjectPermissions {
  public static final String SERIALIZED_NAME_READ = "read";
  @SerializedName(SERIALIZED_NAME_READ)
  private Boolean read;

  public static final String SERIALIZED_NAME_WRITE = "write";
  @SerializedName(SERIALIZED_NAME_WRITE)
  private Boolean write;

  public static final String SERIALIZED_NAME_ADMIN = "admin";
  @SerializedName(SERIALIZED_NAME_ADMIN)
  private Boolean admin;

  public TeamProjectPermissions() {
  }

  public TeamProjectPermissions read(Boolean read) {
    
    this.read = read;
    return this;
  }

   /**
   * Get read
   * @return read
  **/
  @javax.annotation.Nonnull

  public Boolean getRead() {
    return read;
  }


  public void setRead(Boolean read) {
    this.read = read;
  }


  public TeamProjectPermissions write(Boolean write) {
    
    this.write = write;
    return this;
  }

   /**
   * Get write
   * @return write
  **/
  @javax.annotation.Nonnull

  public Boolean getWrite() {
    return write;
  }


  public void setWrite(Boolean write) {
    this.write = write;
  }


  public TeamProjectPermissions admin(Boolean admin) {
    
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
    TeamProjectPermissions teamProjectPermissions = (TeamProjectPermissions) o;
    return Objects.equals(this.read, teamProjectPermissions.read) &&
        Objects.equals(this.write, teamProjectPermissions.write) &&
        Objects.equals(this.admin, teamProjectPermissions.admin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(read, write, admin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamProjectPermissions {\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    write: ").append(toIndentedString(write)).append("\n");
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
    openapiFields.add("read");
    openapiFields.add("write");
    openapiFields.add("admin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("read");
    openapiRequiredFields.add("write");
    openapiRequiredFields.add("admin");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TeamProjectPermissions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TeamProjectPermissions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TeamProjectPermissions is not found in the empty JSON string", TeamProjectPermissions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TeamProjectPermissions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TeamProjectPermissions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TeamProjectPermissions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TeamProjectPermissions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TeamProjectPermissions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TeamProjectPermissions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TeamProjectPermissions.class));

       return (TypeAdapter<T>) new TypeAdapter<TeamProjectPermissions>() {
           @Override
           public void write(JsonWriter out, TeamProjectPermissions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TeamProjectPermissions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TeamProjectPermissions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TeamProjectPermissions
  * @throws IOException if the JSON string is invalid with respect to TeamProjectPermissions
  */
  public static TeamProjectPermissions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TeamProjectPermissions.class);
  }

 /**
  * Convert an instance of TeamProjectPermissions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

