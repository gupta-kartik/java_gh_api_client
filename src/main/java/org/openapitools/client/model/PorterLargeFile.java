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
 * Porter Large File
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class PorterLargeFile {
  public static final String SERIALIZED_NAME_REF_NAME = "ref_name";
  @SerializedName(SERIALIZED_NAME_REF_NAME)
  private String refName;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_OID = "oid";
  @SerializedName(SERIALIZED_NAME_OID)
  private String oid;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public PorterLargeFile() {
  }

  public PorterLargeFile refName(String refName) {
    
    this.refName = refName;
    return this;
  }

   /**
   * Get refName
   * @return refName
  **/
  @javax.annotation.Nonnull

  public String getRefName() {
    return refName;
  }


  public void setRefName(String refName) {
    this.refName = refName;
  }


  public PorterLargeFile path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nonnull

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public PorterLargeFile oid(String oid) {
    
    this.oid = oid;
    return this;
  }

   /**
   * Get oid
   * @return oid
  **/
  @javax.annotation.Nonnull

  public String getOid() {
    return oid;
  }


  public void setOid(String oid) {
    this.oid = oid;
  }


  public PorterLargeFile size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nonnull

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PorterLargeFile porterLargeFile = (PorterLargeFile) o;
    return Objects.equals(this.refName, porterLargeFile.refName) &&
        Objects.equals(this.path, porterLargeFile.path) &&
        Objects.equals(this.oid, porterLargeFile.oid) &&
        Objects.equals(this.size, porterLargeFile.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refName, path, oid, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PorterLargeFile {\n");
    sb.append("    refName: ").append(toIndentedString(refName)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
    openapiFields.add("ref_name");
    openapiFields.add("path");
    openapiFields.add("oid");
    openapiFields.add("size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ref_name");
    openapiRequiredFields.add("path");
    openapiRequiredFields.add("oid");
    openapiRequiredFields.add("size");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PorterLargeFile
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PorterLargeFile.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PorterLargeFile is not found in the empty JSON string", PorterLargeFile.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PorterLargeFile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PorterLargeFile` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PorterLargeFile.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("ref_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref_name").toString()));
      }
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if (!jsonObj.get("oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PorterLargeFile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PorterLargeFile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PorterLargeFile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PorterLargeFile.class));

       return (TypeAdapter<T>) new TypeAdapter<PorterLargeFile>() {
           @Override
           public void write(JsonWriter out, PorterLargeFile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PorterLargeFile read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PorterLargeFile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PorterLargeFile
  * @throws IOException if the JSON string is invalid with respect to PorterLargeFile
  */
  public static PorterLargeFile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PorterLargeFile.class);
  }

 /**
  * Convert an instance of PorterLargeFile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

