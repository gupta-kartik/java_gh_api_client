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
 * OrganizationFullPlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class OrganizationFullPlan {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SPACE = "space";
  @SerializedName(SERIALIZED_NAME_SPACE)
  private Integer space;

  public static final String SERIALIZED_NAME_PRIVATE_REPOS = "private_repos";
  @SerializedName(SERIALIZED_NAME_PRIVATE_REPOS)
  private Integer privateRepos;

  public static final String SERIALIZED_NAME_FILLED_SEATS = "filled_seats";
  @SerializedName(SERIALIZED_NAME_FILLED_SEATS)
  private Integer filledSeats;

  public static final String SERIALIZED_NAME_SEATS = "seats";
  @SerializedName(SERIALIZED_NAME_SEATS)
  private Integer seats;

  public OrganizationFullPlan() {
  }

  public OrganizationFullPlan name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OrganizationFullPlan space(Integer space) {
    
    this.space = space;
    return this;
  }

   /**
   * Get space
   * @return space
  **/
  @javax.annotation.Nonnull

  public Integer getSpace() {
    return space;
  }


  public void setSpace(Integer space) {
    this.space = space;
  }


  public OrganizationFullPlan privateRepos(Integer privateRepos) {
    
    this.privateRepos = privateRepos;
    return this;
  }

   /**
   * Get privateRepos
   * @return privateRepos
  **/
  @javax.annotation.Nonnull

  public Integer getPrivateRepos() {
    return privateRepos;
  }


  public void setPrivateRepos(Integer privateRepos) {
    this.privateRepos = privateRepos;
  }


  public OrganizationFullPlan filledSeats(Integer filledSeats) {
    
    this.filledSeats = filledSeats;
    return this;
  }

   /**
   * Get filledSeats
   * @return filledSeats
  **/
  @javax.annotation.Nullable

  public Integer getFilledSeats() {
    return filledSeats;
  }


  public void setFilledSeats(Integer filledSeats) {
    this.filledSeats = filledSeats;
  }


  public OrganizationFullPlan seats(Integer seats) {
    
    this.seats = seats;
    return this;
  }

   /**
   * Get seats
   * @return seats
  **/
  @javax.annotation.Nullable

  public Integer getSeats() {
    return seats;
  }


  public void setSeats(Integer seats) {
    this.seats = seats;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationFullPlan organizationFullPlan = (OrganizationFullPlan) o;
    return Objects.equals(this.name, organizationFullPlan.name) &&
        Objects.equals(this.space, organizationFullPlan.space) &&
        Objects.equals(this.privateRepos, organizationFullPlan.privateRepos) &&
        Objects.equals(this.filledSeats, organizationFullPlan.filledSeats) &&
        Objects.equals(this.seats, organizationFullPlan.seats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, space, privateRepos, filledSeats, seats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationFullPlan {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
    sb.append("    privateRepos: ").append(toIndentedString(privateRepos)).append("\n");
    sb.append("    filledSeats: ").append(toIndentedString(filledSeats)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("space");
    openapiFields.add("private_repos");
    openapiFields.add("filled_seats");
    openapiFields.add("seats");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("space");
    openapiRequiredFields.add("private_repos");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrganizationFullPlan
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrganizationFullPlan.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganizationFullPlan is not found in the empty JSON string", OrganizationFullPlan.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrganizationFullPlan.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrganizationFullPlan` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrganizationFullPlan.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganizationFullPlan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganizationFullPlan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganizationFullPlan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganizationFullPlan.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganizationFullPlan>() {
           @Override
           public void write(JsonWriter out, OrganizationFullPlan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrganizationFullPlan read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrganizationFullPlan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrganizationFullPlan
  * @throws IOException if the JSON string is invalid with respect to OrganizationFullPlan
  */
  public static OrganizationFullPlan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganizationFullPlan.class);
  }

 /**
  * Convert an instance of OrganizationFullPlan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

