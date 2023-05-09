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
 * Details for the vulnerable package.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class DependabotAlertPackage {
  public static final String SERIALIZED_NAME_ECOSYSTEM = "ecosystem";
  @SerializedName(SERIALIZED_NAME_ECOSYSTEM)
  private String ecosystem;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public DependabotAlertPackage() {
  }

  
  public DependabotAlertPackage(
     String ecosystem, 
     String name
  ) {
    this();
    this.ecosystem = ecosystem;
    this.name = name;
  }

   /**
   * The package&#39;s language or package management ecosystem.
   * @return ecosystem
  **/
  @javax.annotation.Nonnull

  public String getEcosystem() {
    return ecosystem;
  }




   /**
   * The unique package name within its ecosystem.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependabotAlertPackage dependabotAlertPackage = (DependabotAlertPackage) o;
    return Objects.equals(this.ecosystem, dependabotAlertPackage.ecosystem) &&
        Objects.equals(this.name, dependabotAlertPackage.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ecosystem, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependabotAlertPackage {\n");
    sb.append("    ecosystem: ").append(toIndentedString(ecosystem)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("ecosystem");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ecosystem");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DependabotAlertPackage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DependabotAlertPackage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DependabotAlertPackage is not found in the empty JSON string", DependabotAlertPackage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DependabotAlertPackage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DependabotAlertPackage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DependabotAlertPackage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("ecosystem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ecosystem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ecosystem").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DependabotAlertPackage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DependabotAlertPackage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DependabotAlertPackage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DependabotAlertPackage.class));

       return (TypeAdapter<T>) new TypeAdapter<DependabotAlertPackage>() {
           @Override
           public void write(JsonWriter out, DependabotAlertPackage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DependabotAlertPackage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DependabotAlertPackage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DependabotAlertPackage
  * @throws IOException if the JSON string is invalid with respect to DependabotAlertPackage
  */
  public static DependabotAlertPackage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DependabotAlertPackage.class);
  }

 /**
  * Convert an instance of DependabotAlertPackage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

