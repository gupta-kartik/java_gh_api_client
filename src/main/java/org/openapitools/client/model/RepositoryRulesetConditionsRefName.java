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
 * RepositoryRulesetConditionsRefName
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class RepositoryRulesetConditionsRefName {
  public static final String SERIALIZED_NAME_INCLUDE = "include";
  @SerializedName(SERIALIZED_NAME_INCLUDE)
  private List<String> include;

  public static final String SERIALIZED_NAME_EXCLUDE = "exclude";
  @SerializedName(SERIALIZED_NAME_EXCLUDE)
  private List<String> exclude;

  public RepositoryRulesetConditionsRefName() {
  }

  public RepositoryRulesetConditionsRefName include(List<String> include) {
    
    this.include = include;
    return this;
  }

  public RepositoryRulesetConditionsRefName addIncludeItem(String includeItem) {
    if (this.include == null) {
      this.include = new ArrayList<>();
    }
    this.include.add(includeItem);
    return this;
  }

   /**
   * Array of ref names or patterns to include. One of these patterns must match for the condition to pass. Also accepts &#x60;~DEFAULT_BRANCH&#x60; to include the default branch or &#x60;~ALL&#x60; to include all branches.
   * @return include
  **/
  @javax.annotation.Nullable

  public List<String> getInclude() {
    return include;
  }


  public void setInclude(List<String> include) {
    this.include = include;
  }


  public RepositoryRulesetConditionsRefName exclude(List<String> exclude) {
    
    this.exclude = exclude;
    return this;
  }

  public RepositoryRulesetConditionsRefName addExcludeItem(String excludeItem) {
    if (this.exclude == null) {
      this.exclude = new ArrayList<>();
    }
    this.exclude.add(excludeItem);
    return this;
  }

   /**
   * Array of ref names or patterns to exclude. The condition will not pass if any of these patterns match.
   * @return exclude
  **/
  @javax.annotation.Nullable

  public List<String> getExclude() {
    return exclude;
  }


  public void setExclude(List<String> exclude) {
    this.exclude = exclude;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryRulesetConditionsRefName repositoryRulesetConditionsRefName = (RepositoryRulesetConditionsRefName) o;
    return Objects.equals(this.include, repositoryRulesetConditionsRefName.include) &&
        Objects.equals(this.exclude, repositoryRulesetConditionsRefName.exclude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(include, exclude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryRulesetConditionsRefName {\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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
    openapiFields.add("include");
    openapiFields.add("exclude");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RepositoryRulesetConditionsRefName
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RepositoryRulesetConditionsRefName.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RepositoryRulesetConditionsRefName is not found in the empty JSON string", RepositoryRulesetConditionsRefName.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RepositoryRulesetConditionsRefName.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RepositoryRulesetConditionsRefName` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("include") != null && !jsonObj.get("include").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `include` to be an array in the JSON string but got `%s`", jsonObj.get("include").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("exclude") != null && !jsonObj.get("exclude").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `exclude` to be an array in the JSON string but got `%s`", jsonObj.get("exclude").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RepositoryRulesetConditionsRefName.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RepositoryRulesetConditionsRefName' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RepositoryRulesetConditionsRefName> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RepositoryRulesetConditionsRefName.class));

       return (TypeAdapter<T>) new TypeAdapter<RepositoryRulesetConditionsRefName>() {
           @Override
           public void write(JsonWriter out, RepositoryRulesetConditionsRefName value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RepositoryRulesetConditionsRefName read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RepositoryRulesetConditionsRefName given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RepositoryRulesetConditionsRefName
  * @throws IOException if the JSON string is invalid with respect to RepositoryRulesetConditionsRefName
  */
  public static RepositoryRulesetConditionsRefName fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RepositoryRulesetConditionsRefName.class);
  }

 /**
  * Convert an instance of RepositoryRulesetConditionsRefName to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
