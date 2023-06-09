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
import org.openapitools.client.model.DependabotAlertPackage;
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
 * Details for the vulnerable dependency.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class DependabotAlertWithRepositoryDependency {
  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private DependabotAlertPackage _package;

  public static final String SERIALIZED_NAME_MANIFEST_PATH = "manifest_path";
  @SerializedName(SERIALIZED_NAME_MANIFEST_PATH)
  private String manifestPath;

  /**
   * The execution scope of the vulnerable dependency.
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    DEVELOPMENT("development"),
    
    RUNTIME("runtime");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScopeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private ScopeEnum scope;

  public DependabotAlertWithRepositoryDependency() {
  }

  
  public DependabotAlertWithRepositoryDependency(
     String manifestPath, 
     ScopeEnum scope
  ) {
    this();
    this.manifestPath = manifestPath;
    this.scope = scope;
  }

  public DependabotAlertWithRepositoryDependency _package(DependabotAlertPackage _package) {
    
    this._package = _package;
    return this;
  }

   /**
   * Get _package
   * @return _package
  **/
  @javax.annotation.Nullable

  public DependabotAlertPackage getPackage() {
    return _package;
  }


  public void setPackage(DependabotAlertPackage _package) {
    this._package = _package;
  }


   /**
   * The full path to the dependency manifest file, relative to the root of the repository.
   * @return manifestPath
  **/
  @javax.annotation.Nullable

  public String getManifestPath() {
    return manifestPath;
  }




   /**
   * The execution scope of the vulnerable dependency.
   * @return scope
  **/
  @javax.annotation.Nullable

  public ScopeEnum getScope() {
    return scope;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependabotAlertWithRepositoryDependency dependabotAlertWithRepositoryDependency = (DependabotAlertWithRepositoryDependency) o;
    return Objects.equals(this._package, dependabotAlertWithRepositoryDependency._package) &&
        Objects.equals(this.manifestPath, dependabotAlertWithRepositoryDependency.manifestPath) &&
        Objects.equals(this.scope, dependabotAlertWithRepositoryDependency.scope);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_package, manifestPath, scope);
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
    sb.append("class DependabotAlertWithRepositoryDependency {\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    manifestPath: ").append(toIndentedString(manifestPath)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
    openapiFields.add("package");
    openapiFields.add("manifest_path");
    openapiFields.add("scope");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DependabotAlertWithRepositoryDependency
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DependabotAlertWithRepositoryDependency.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DependabotAlertWithRepositoryDependency is not found in the empty JSON string", DependabotAlertWithRepositoryDependency.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DependabotAlertWithRepositoryDependency.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DependabotAlertWithRepositoryDependency` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `package`
      if (jsonObj.get("package") != null && !jsonObj.get("package").isJsonNull()) {
        DependabotAlertPackage.validateJsonObject(jsonObj.getAsJsonObject("package"));
      }
      if ((jsonObj.get("manifest_path") != null && !jsonObj.get("manifest_path").isJsonNull()) && !jsonObj.get("manifest_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manifest_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manifest_path").toString()));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DependabotAlertWithRepositoryDependency.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DependabotAlertWithRepositoryDependency' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DependabotAlertWithRepositoryDependency> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DependabotAlertWithRepositoryDependency.class));

       return (TypeAdapter<T>) new TypeAdapter<DependabotAlertWithRepositoryDependency>() {
           @Override
           public void write(JsonWriter out, DependabotAlertWithRepositoryDependency value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DependabotAlertWithRepositoryDependency read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DependabotAlertWithRepositoryDependency given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DependabotAlertWithRepositoryDependency
  * @throws IOException if the JSON string is invalid with respect to DependabotAlertWithRepositoryDependency
  */
  public static DependabotAlertWithRepositoryDependency fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DependabotAlertWithRepositoryDependency.class);
  }

 /**
  * Convert an instance of DependabotAlertWithRepositoryDependency to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

