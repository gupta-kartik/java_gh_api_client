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
import org.openapitools.client.model.SearchResultTextMatchesInnerMatchesInner;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * SearchResultTextMatchesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class SearchResultTextMatchesInner {
  public static final String SERIALIZED_NAME_OBJECT_URL = "object_url";
  @SerializedName(SERIALIZED_NAME_OBJECT_URL)
  private String objectUrl;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "object_type";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_PROPERTY = "property";
  @SerializedName(SERIALIZED_NAME_PROPERTY)
  private String property;

  public static final String SERIALIZED_NAME_FRAGMENT = "fragment";
  @SerializedName(SERIALIZED_NAME_FRAGMENT)
  private String fragment;

  public static final String SERIALIZED_NAME_MATCHES = "matches";
  @SerializedName(SERIALIZED_NAME_MATCHES)
  private List<SearchResultTextMatchesInnerMatchesInner> matches;

  public SearchResultTextMatchesInner() {
  }

  public SearchResultTextMatchesInner objectUrl(String objectUrl) {
    
    this.objectUrl = objectUrl;
    return this;
  }

   /**
   * Get objectUrl
   * @return objectUrl
  **/
  @javax.annotation.Nullable

  public String getObjectUrl() {
    return objectUrl;
  }


  public void setObjectUrl(String objectUrl) {
    this.objectUrl = objectUrl;
  }


  public SearchResultTextMatchesInner objectType(String objectType) {
    
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @javax.annotation.Nullable

  public String getObjectType() {
    return objectType;
  }


  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }


  public SearchResultTextMatchesInner property(String property) {
    
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @javax.annotation.Nullable

  public String getProperty() {
    return property;
  }


  public void setProperty(String property) {
    this.property = property;
  }


  public SearchResultTextMatchesInner fragment(String fragment) {
    
    this.fragment = fragment;
    return this;
  }

   /**
   * Get fragment
   * @return fragment
  **/
  @javax.annotation.Nullable

  public String getFragment() {
    return fragment;
  }


  public void setFragment(String fragment) {
    this.fragment = fragment;
  }


  public SearchResultTextMatchesInner matches(List<SearchResultTextMatchesInnerMatchesInner> matches) {
    
    this.matches = matches;
    return this;
  }

  public SearchResultTextMatchesInner addMatchesItem(SearchResultTextMatchesInnerMatchesInner matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<>();
    }
    this.matches.add(matchesItem);
    return this;
  }

   /**
   * Get matches
   * @return matches
  **/
  @javax.annotation.Nullable

  public List<SearchResultTextMatchesInnerMatchesInner> getMatches() {
    return matches;
  }


  public void setMatches(List<SearchResultTextMatchesInnerMatchesInner> matches) {
    this.matches = matches;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultTextMatchesInner searchResultTextMatchesInner = (SearchResultTextMatchesInner) o;
    return Objects.equals(this.objectUrl, searchResultTextMatchesInner.objectUrl) &&
        Objects.equals(this.objectType, searchResultTextMatchesInner.objectType) &&
        Objects.equals(this.property, searchResultTextMatchesInner.property) &&
        Objects.equals(this.fragment, searchResultTextMatchesInner.fragment) &&
        Objects.equals(this.matches, searchResultTextMatchesInner.matches);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectUrl, objectType, property, fragment, matches);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultTextMatchesInner {\n");
    sb.append("    objectUrl: ").append(toIndentedString(objectUrl)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    fragment: ").append(toIndentedString(fragment)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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
    openapiFields.add("object_url");
    openapiFields.add("object_type");
    openapiFields.add("property");
    openapiFields.add("fragment");
    openapiFields.add("matches");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchResultTextMatchesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchResultTextMatchesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchResultTextMatchesInner is not found in the empty JSON string", SearchResultTextMatchesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchResultTextMatchesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchResultTextMatchesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("object_url") != null && !jsonObj.get("object_url").isJsonNull()) && !jsonObj.get("object_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object_url").toString()));
      }
      if ((jsonObj.get("object_type") != null && !jsonObj.get("object_type").isJsonNull()) && !jsonObj.get("object_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object_type").toString()));
      }
      if ((jsonObj.get("property") != null && !jsonObj.get("property").isJsonNull()) && !jsonObj.get("property").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `property` to be a primitive type in the JSON string but got `%s`", jsonObj.get("property").toString()));
      }
      if ((jsonObj.get("fragment") != null && !jsonObj.get("fragment").isJsonNull()) && !jsonObj.get("fragment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fragment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fragment").toString()));
      }
      if (jsonObj.get("matches") != null && !jsonObj.get("matches").isJsonNull()) {
        JsonArray jsonArraymatches = jsonObj.getAsJsonArray("matches");
        if (jsonArraymatches != null) {
          // ensure the json data is an array
          if (!jsonObj.get("matches").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `matches` to be an array in the JSON string but got `%s`", jsonObj.get("matches").toString()));
          }

          // validate the optional field `matches` (array)
          for (int i = 0; i < jsonArraymatches.size(); i++) {
            SearchResultTextMatchesInnerMatchesInner.validateJsonObject(jsonArraymatches.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchResultTextMatchesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchResultTextMatchesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchResultTextMatchesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchResultTextMatchesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchResultTextMatchesInner>() {
           @Override
           public void write(JsonWriter out, SearchResultTextMatchesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchResultTextMatchesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchResultTextMatchesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchResultTextMatchesInner
  * @throws IOException if the JSON string is invalid with respect to SearchResultTextMatchesInner
  */
  public static SearchResultTextMatchesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchResultTextMatchesInner.class);
  }

 /**
  * Convert an instance of SearchResultTextMatchesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

