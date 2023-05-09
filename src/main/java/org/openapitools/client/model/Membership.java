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
import org.openapitools.client.model.User;

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
 * The membership between the user and the organization. Not present when the action is &#x60;member_invited&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class Membership {
  public static final String SERIALIZED_NAME_ORGANIZATION_URL = "organization_url";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_URL)
  private URI organizationUrl;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;

  public Membership() {
  }

  public Membership organizationUrl(URI organizationUrl) {
    
    this.organizationUrl = organizationUrl;
    return this;
  }

   /**
   * Get organizationUrl
   * @return organizationUrl
  **/
  @javax.annotation.Nonnull

  public URI getOrganizationUrl() {
    return organizationUrl;
  }


  public void setOrganizationUrl(URI organizationUrl) {
    this.organizationUrl = organizationUrl;
  }


  public Membership role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nonnull

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public Membership state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Membership url(URI url) {
    
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


  public Membership user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Membership membership = (Membership) o;
    return Objects.equals(this.organizationUrl, membership.organizationUrl) &&
        Objects.equals(this.role, membership.role) &&
        Objects.equals(this.state, membership.state) &&
        Objects.equals(this.url, membership.url) &&
        Objects.equals(this.user, membership.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationUrl, role, state, url, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Membership {\n");
    sb.append("    organizationUrl: ").append(toIndentedString(organizationUrl)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("organization_url");
    openapiFields.add("role");
    openapiFields.add("state");
    openapiFields.add("url");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organization_url");
    openapiRequiredFields.add("role");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Membership
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Membership.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Membership is not found in the empty JSON string", Membership.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Membership.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Membership` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Membership.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("organization_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization_url").toString()));
      }
      if (!jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the required field `user`
      User.validateJsonObject(jsonObj.getAsJsonObject("user"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Membership.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Membership' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Membership> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Membership.class));

       return (TypeAdapter<T>) new TypeAdapter<Membership>() {
           @Override
           public void write(JsonWriter out, Membership value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Membership read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Membership given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Membership
  * @throws IOException if the JSON string is invalid with respect to Membership
  */
  public static Membership fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Membership.class);
  }

 /**
  * Convert an instance of Membership to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
