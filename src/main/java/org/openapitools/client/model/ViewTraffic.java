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
import org.openapitools.client.model.Traffic;

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
 * View Traffic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class ViewTraffic {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_UNIQUES = "uniques";
  @SerializedName(SERIALIZED_NAME_UNIQUES)
  private Integer uniques;

  public static final String SERIALIZED_NAME_VIEWS = "views";
  @SerializedName(SERIALIZED_NAME_VIEWS)
  private List<Traffic> views = new ArrayList<>();

  public ViewTraffic() {
  }

  public ViewTraffic count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nonnull

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public ViewTraffic uniques(Integer uniques) {
    
    this.uniques = uniques;
    return this;
  }

   /**
   * Get uniques
   * @return uniques
  **/
  @javax.annotation.Nonnull

  public Integer getUniques() {
    return uniques;
  }


  public void setUniques(Integer uniques) {
    this.uniques = uniques;
  }


  public ViewTraffic views(List<Traffic> views) {
    
    this.views = views;
    return this;
  }

  public ViewTraffic addViewsItem(Traffic viewsItem) {
    if (this.views == null) {
      this.views = new ArrayList<>();
    }
    this.views.add(viewsItem);
    return this;
  }

   /**
   * Get views
   * @return views
  **/
  @javax.annotation.Nonnull

  public List<Traffic> getViews() {
    return views;
  }


  public void setViews(List<Traffic> views) {
    this.views = views;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewTraffic viewTraffic = (ViewTraffic) o;
    return Objects.equals(this.count, viewTraffic.count) &&
        Objects.equals(this.uniques, viewTraffic.uniques) &&
        Objects.equals(this.views, viewTraffic.views);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, uniques, views);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewTraffic {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    uniques: ").append(toIndentedString(uniques)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("uniques");
    openapiFields.add("views");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("count");
    openapiRequiredFields.add("uniques");
    openapiRequiredFields.add("views");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ViewTraffic
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ViewTraffic.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ViewTraffic is not found in the empty JSON string", ViewTraffic.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ViewTraffic.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ViewTraffic` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ViewTraffic.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("views").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `views` to be an array in the JSON string but got `%s`", jsonObj.get("views").toString()));
      }

      JsonArray jsonArrayviews = jsonObj.getAsJsonArray("views");
      // validate the required field `views` (array)
      for (int i = 0; i < jsonArrayviews.size(); i++) {
        Traffic.validateJsonObject(jsonArrayviews.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ViewTraffic.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ViewTraffic' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ViewTraffic> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ViewTraffic.class));

       return (TypeAdapter<T>) new TypeAdapter<ViewTraffic>() {
           @Override
           public void write(JsonWriter out, ViewTraffic value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ViewTraffic read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ViewTraffic given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ViewTraffic
  * @throws IOException if the JSON string is invalid with respect to ViewTraffic
  */
  public static ViewTraffic fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ViewTraffic.class);
  }

 /**
  * Convert an instance of ViewTraffic to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
