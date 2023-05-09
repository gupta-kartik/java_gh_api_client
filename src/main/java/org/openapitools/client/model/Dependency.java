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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.Metadata1;

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
 * Dependency
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class Dependency {
  public static final String SERIALIZED_NAME_PACKAGE_URL = "package_url";
  @SerializedName(SERIALIZED_NAME_PACKAGE_URL)
  private String packageUrl;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Metadata1> metadata = new HashMap<>();

  /**
   * A notation of whether a dependency is requested directly by this manifest or is a dependency of another dependency.
   */
  @JsonAdapter(RelationshipEnum.Adapter.class)
  public enum RelationshipEnum {
    DIRECT("direct"),
    
    INDIRECT("indirect");

    private String value;

    RelationshipEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RelationshipEnum fromValue(String value) {
      for (RelationshipEnum b : RelationshipEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RelationshipEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RelationshipEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RelationshipEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RelationshipEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RELATIONSHIP = "relationship";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP)
  private RelationshipEnum relationship;

  /**
   * A notation of whether the dependency is required for the primary build artifact (runtime) or is only used for development. Future versions of this specification may allow for more granular scopes.
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    RUNTIME("runtime"),
    
    DEVELOPMENT("development");

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  public static final String SERIALIZED_NAME_DEPENDENCIES = "dependencies";
  @SerializedName(SERIALIZED_NAME_DEPENDENCIES)
  private List<String> dependencies;

  public Dependency() {
  }

  public Dependency packageUrl(String packageUrl) {
    
    this.packageUrl = packageUrl;
    return this;
  }

   /**
   * Package-url (PURL) of dependency. See https://github.com/package-url/purl-spec for more details.
   * @return packageUrl
  **/
  @javax.annotation.Nullable

  public String getPackageUrl() {
    return packageUrl;
  }


  public void setPackageUrl(String packageUrl) {
    this.packageUrl = packageUrl;
  }


  public Dependency metadata(Map<String, Metadata1> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public Dependency putMetadataItem(String key, Metadata1 metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * User-defined metadata to store domain-specific information limited to 8 keys with scalar values.
   * @return metadata
  **/
  @javax.annotation.Nullable

  public Map<String, Metadata1> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, Metadata1> metadata) {
    this.metadata = metadata;
  }


  public Dependency relationship(RelationshipEnum relationship) {
    
    this.relationship = relationship;
    return this;
  }

   /**
   * A notation of whether a dependency is requested directly by this manifest or is a dependency of another dependency.
   * @return relationship
  **/
  @javax.annotation.Nullable

  public RelationshipEnum getRelationship() {
    return relationship;
  }


  public void setRelationship(RelationshipEnum relationship) {
    this.relationship = relationship;
  }


  public Dependency scope(ScopeEnum scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * A notation of whether the dependency is required for the primary build artifact (runtime) or is only used for development. Future versions of this specification may allow for more granular scopes.
   * @return scope
  **/
  @javax.annotation.Nullable

  public ScopeEnum getScope() {
    return scope;
  }


  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  public Dependency dependencies(List<String> dependencies) {
    
    this.dependencies = dependencies;
    return this;
  }

  public Dependency addDependenciesItem(String dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * Array of package-url (PURLs) of direct child dependencies.
   * @return dependencies
  **/
  @javax.annotation.Nullable

  public List<String> getDependencies() {
    return dependencies;
  }


  public void setDependencies(List<String> dependencies) {
    this.dependencies = dependencies;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dependency dependency = (Dependency) o;
    return Objects.equals(this.packageUrl, dependency.packageUrl) &&
        Objects.equals(this.metadata, dependency.metadata) &&
        Objects.equals(this.relationship, dependency.relationship) &&
        Objects.equals(this.scope, dependency.scope) &&
        Objects.equals(this.dependencies, dependency.dependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageUrl, metadata, relationship, scope, dependencies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dependency {\n");
    sb.append("    packageUrl: ").append(toIndentedString(packageUrl)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
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
    openapiFields.add("package_url");
    openapiFields.add("metadata");
    openapiFields.add("relationship");
    openapiFields.add("scope");
    openapiFields.add("dependencies");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Dependency
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Dependency.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dependency is not found in the empty JSON string", Dependency.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Dependency.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dependency` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("package_url") != null && !jsonObj.get("package_url").isJsonNull()) && !jsonObj.get("package_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_url").toString()));
      }
      if ((jsonObj.get("relationship") != null && !jsonObj.get("relationship").isJsonNull()) && !jsonObj.get("relationship").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relationship` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relationship").toString()));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dependencies") != null && !jsonObj.get("dependencies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dependencies` to be an array in the JSON string but got `%s`", jsonObj.get("dependencies").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dependency.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dependency' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dependency> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dependency.class));

       return (TypeAdapter<T>) new TypeAdapter<Dependency>() {
           @Override
           public void write(JsonWriter out, Dependency value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dependency read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dependency given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dependency
  * @throws IOException if the JSON string is invalid with respect to Dependency
  */
  public static Dependency fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dependency.class);
  }

 /**
  * Convert an instance of Dependency to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
