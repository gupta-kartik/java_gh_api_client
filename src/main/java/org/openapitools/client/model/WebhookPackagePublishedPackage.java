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
import org.openapitools.client.model.WebhookPackagePublishedPackagePackageVersion;
import org.openapitools.client.model.WebhookPackagePublishedPackageRegistry;

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
 * Information about the package.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookPackagePublishedPackage {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ECOSYSTEM = "ecosystem";
  @SerializedName(SERIALIZED_NAME_ECOSYSTEM)
  private String ecosystem;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private User owner;

  public static final String SERIALIZED_NAME_PACKAGE_TYPE = "package_type";
  @SerializedName(SERIALIZED_NAME_PACKAGE_TYPE)
  private String packageType;

  public static final String SERIALIZED_NAME_PACKAGE_VERSION = "package_version";
  @SerializedName(SERIALIZED_NAME_PACKAGE_VERSION)
  private WebhookPackagePublishedPackagePackageVersion packageVersion;

  public static final String SERIALIZED_NAME_REGISTRY = "registry";
  @SerializedName(SERIALIZED_NAME_REGISTRY)
  private WebhookPackagePublishedPackageRegistry registry;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public WebhookPackagePublishedPackage() {
  }

  public WebhookPackagePublishedPackage createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookPackagePublishedPackage description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public WebhookPackagePublishedPackage ecosystem(String ecosystem) {
    
    this.ecosystem = ecosystem;
    return this;
  }

   /**
   * Get ecosystem
   * @return ecosystem
  **/
  @javax.annotation.Nonnull

  public String getEcosystem() {
    return ecosystem;
  }


  public void setEcosystem(String ecosystem) {
    this.ecosystem = ecosystem;
  }


  public WebhookPackagePublishedPackage htmlUrl(URI htmlUrl) {
    
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @javax.annotation.Nonnull

  public URI getHtmlUrl() {
    return htmlUrl;
  }


  public void setHtmlUrl(URI htmlUrl) {
    this.htmlUrl = htmlUrl;
  }


  public WebhookPackagePublishedPackage id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public WebhookPackagePublishedPackage name(String name) {
    
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


  public WebhookPackagePublishedPackage namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nonnull

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public WebhookPackagePublishedPackage owner(User owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable

  public User getOwner() {
    return owner;
  }


  public void setOwner(User owner) {
    this.owner = owner;
  }


  public WebhookPackagePublishedPackage packageType(String packageType) {
    
    this.packageType = packageType;
    return this;
  }

   /**
   * Get packageType
   * @return packageType
  **/
  @javax.annotation.Nonnull

  public String getPackageType() {
    return packageType;
  }


  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }


  public WebhookPackagePublishedPackage packageVersion(WebhookPackagePublishedPackagePackageVersion packageVersion) {
    
    this.packageVersion = packageVersion;
    return this;
  }

   /**
   * Get packageVersion
   * @return packageVersion
  **/
  @javax.annotation.Nullable

  public WebhookPackagePublishedPackagePackageVersion getPackageVersion() {
    return packageVersion;
  }


  public void setPackageVersion(WebhookPackagePublishedPackagePackageVersion packageVersion) {
    this.packageVersion = packageVersion;
  }


  public WebhookPackagePublishedPackage registry(WebhookPackagePublishedPackageRegistry registry) {
    
    this.registry = registry;
    return this;
  }

   /**
   * Get registry
   * @return registry
  **/
  @javax.annotation.Nullable

  public WebhookPackagePublishedPackageRegistry getRegistry() {
    return registry;
  }


  public void setRegistry(WebhookPackagePublishedPackageRegistry registry) {
    this.registry = registry;
  }


  public WebhookPackagePublishedPackage updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookPackagePublishedPackage webhookPackagePublishedPackage = (WebhookPackagePublishedPackage) o;
    return Objects.equals(this.createdAt, webhookPackagePublishedPackage.createdAt) &&
        Objects.equals(this.description, webhookPackagePublishedPackage.description) &&
        Objects.equals(this.ecosystem, webhookPackagePublishedPackage.ecosystem) &&
        Objects.equals(this.htmlUrl, webhookPackagePublishedPackage.htmlUrl) &&
        Objects.equals(this.id, webhookPackagePublishedPackage.id) &&
        Objects.equals(this.name, webhookPackagePublishedPackage.name) &&
        Objects.equals(this.namespace, webhookPackagePublishedPackage.namespace) &&
        Objects.equals(this.owner, webhookPackagePublishedPackage.owner) &&
        Objects.equals(this.packageType, webhookPackagePublishedPackage.packageType) &&
        Objects.equals(this.packageVersion, webhookPackagePublishedPackage.packageVersion) &&
        Objects.equals(this.registry, webhookPackagePublishedPackage.registry) &&
        Objects.equals(this.updatedAt, webhookPackagePublishedPackage.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, ecosystem, htmlUrl, id, name, namespace, owner, packageType, packageVersion, registry, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPackagePublishedPackage {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ecosystem: ").append(toIndentedString(ecosystem)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    packageVersion: ").append(toIndentedString(packageVersion)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("description");
    openapiFields.add("ecosystem");
    openapiFields.add("html_url");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("owner");
    openapiFields.add("package_type");
    openapiFields.add("package_version");
    openapiFields.add("registry");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("ecosystem");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("namespace");
    openapiRequiredFields.add("owner");
    openapiRequiredFields.add("package_type");
    openapiRequiredFields.add("package_version");
    openapiRequiredFields.add("registry");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookPackagePublishedPackage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookPackagePublishedPackage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookPackagePublishedPackage is not found in the empty JSON string", WebhookPackagePublishedPackage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookPackagePublishedPackage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookPackagePublishedPackage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookPackagePublishedPackage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("ecosystem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ecosystem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ecosystem").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      // validate the required field `owner`
      User.validateJsonObject(jsonObj.getAsJsonObject("owner"));
      if (!jsonObj.get("package_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_type").toString()));
      }
      // validate the required field `package_version`
      WebhookPackagePublishedPackagePackageVersion.validateJsonObject(jsonObj.getAsJsonObject("package_version"));
      // validate the required field `registry`
      WebhookPackagePublishedPackageRegistry.validateJsonObject(jsonObj.getAsJsonObject("registry"));
      if (!jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookPackagePublishedPackage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookPackagePublishedPackage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookPackagePublishedPackage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookPackagePublishedPackage.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookPackagePublishedPackage>() {
           @Override
           public void write(JsonWriter out, WebhookPackagePublishedPackage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookPackagePublishedPackage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookPackagePublishedPackage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookPackagePublishedPackage
  * @throws IOException if the JSON string is invalid with respect to WebhookPackagePublishedPackage
  */
  public static WebhookPackagePublishedPackage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookPackagePublishedPackage.class);
  }

 /**
  * Convert an instance of WebhookPackagePublishedPackage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

