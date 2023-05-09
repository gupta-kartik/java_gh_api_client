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
import org.openapitools.client.model.WebhookRegistryPackagePublishedRegistryPackageOwner;
import org.openapitools.client.model.WebhookRegistryPackagePublishedRegistryPackagePackageVersion;
import org.openapitools.client.model.WebhookRegistryPackagePublishedRegistryPackageRegistry;

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
 * WebhookRegistryPackagePublishedRegistryPackage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookRegistryPackagePublishedRegistryPackage {
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
  private String htmlUrl;

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
  private WebhookRegistryPackagePublishedRegistryPackageOwner owner;

  public static final String SERIALIZED_NAME_PACKAGE_TYPE = "package_type";
  @SerializedName(SERIALIZED_NAME_PACKAGE_TYPE)
  private String packageType;

  public static final String SERIALIZED_NAME_PACKAGE_VERSION = "package_version";
  @SerializedName(SERIALIZED_NAME_PACKAGE_VERSION)
  private WebhookRegistryPackagePublishedRegistryPackagePackageVersion packageVersion;

  public static final String SERIALIZED_NAME_REGISTRY = "registry";
  @SerializedName(SERIALIZED_NAME_REGISTRY)
  private WebhookRegistryPackagePublishedRegistryPackageRegistry registry;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public WebhookRegistryPackagePublishedRegistryPackage() {
  }

  public WebhookRegistryPackagePublishedRegistryPackage createdAt(String createdAt) {
    
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


  public WebhookRegistryPackagePublishedRegistryPackage description(String description) {
    
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


  public WebhookRegistryPackagePublishedRegistryPackage ecosystem(String ecosystem) {
    
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


  public WebhookRegistryPackagePublishedRegistryPackage htmlUrl(String htmlUrl) {
    
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @javax.annotation.Nonnull

  public String getHtmlUrl() {
    return htmlUrl;
  }


  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }


  public WebhookRegistryPackagePublishedRegistryPackage id(Integer id) {
    
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


  public WebhookRegistryPackagePublishedRegistryPackage name(String name) {
    
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


  public WebhookRegistryPackagePublishedRegistryPackage namespace(String namespace) {
    
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


  public WebhookRegistryPackagePublishedRegistryPackage owner(WebhookRegistryPackagePublishedRegistryPackageOwner owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nonnull

  public WebhookRegistryPackagePublishedRegistryPackageOwner getOwner() {
    return owner;
  }


  public void setOwner(WebhookRegistryPackagePublishedRegistryPackageOwner owner) {
    this.owner = owner;
  }


  public WebhookRegistryPackagePublishedRegistryPackage packageType(String packageType) {
    
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


  public WebhookRegistryPackagePublishedRegistryPackage packageVersion(WebhookRegistryPackagePublishedRegistryPackagePackageVersion packageVersion) {
    
    this.packageVersion = packageVersion;
    return this;
  }

   /**
   * Get packageVersion
   * @return packageVersion
  **/
  @javax.annotation.Nullable

  public WebhookRegistryPackagePublishedRegistryPackagePackageVersion getPackageVersion() {
    return packageVersion;
  }


  public void setPackageVersion(WebhookRegistryPackagePublishedRegistryPackagePackageVersion packageVersion) {
    this.packageVersion = packageVersion;
  }


  public WebhookRegistryPackagePublishedRegistryPackage registry(WebhookRegistryPackagePublishedRegistryPackageRegistry registry) {
    
    this.registry = registry;
    return this;
  }

   /**
   * Get registry
   * @return registry
  **/
  @javax.annotation.Nullable

  public WebhookRegistryPackagePublishedRegistryPackageRegistry getRegistry() {
    return registry;
  }


  public void setRegistry(WebhookRegistryPackagePublishedRegistryPackageRegistry registry) {
    this.registry = registry;
  }


  public WebhookRegistryPackagePublishedRegistryPackage updatedAt(String updatedAt) {
    
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
    WebhookRegistryPackagePublishedRegistryPackage webhookRegistryPackagePublishedRegistryPackage = (WebhookRegistryPackagePublishedRegistryPackage) o;
    return Objects.equals(this.createdAt, webhookRegistryPackagePublishedRegistryPackage.createdAt) &&
        Objects.equals(this.description, webhookRegistryPackagePublishedRegistryPackage.description) &&
        Objects.equals(this.ecosystem, webhookRegistryPackagePublishedRegistryPackage.ecosystem) &&
        Objects.equals(this.htmlUrl, webhookRegistryPackagePublishedRegistryPackage.htmlUrl) &&
        Objects.equals(this.id, webhookRegistryPackagePublishedRegistryPackage.id) &&
        Objects.equals(this.name, webhookRegistryPackagePublishedRegistryPackage.name) &&
        Objects.equals(this.namespace, webhookRegistryPackagePublishedRegistryPackage.namespace) &&
        Objects.equals(this.owner, webhookRegistryPackagePublishedRegistryPackage.owner) &&
        Objects.equals(this.packageType, webhookRegistryPackagePublishedRegistryPackage.packageType) &&
        Objects.equals(this.packageVersion, webhookRegistryPackagePublishedRegistryPackage.packageVersion) &&
        Objects.equals(this.registry, webhookRegistryPackagePublishedRegistryPackage.registry) &&
        Objects.equals(this.updatedAt, webhookRegistryPackagePublishedRegistryPackage.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, ecosystem, htmlUrl, id, name, namespace, owner, packageType, packageVersion, registry, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookRegistryPackagePublishedRegistryPackage {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to WebhookRegistryPackagePublishedRegistryPackage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookRegistryPackagePublishedRegistryPackage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookRegistryPackagePublishedRegistryPackage is not found in the empty JSON string", WebhookRegistryPackagePublishedRegistryPackage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookRegistryPackagePublishedRegistryPackage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookRegistryPackagePublishedRegistryPackage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookRegistryPackagePublishedRegistryPackage.openapiRequiredFields) {
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
      WebhookRegistryPackagePublishedRegistryPackageOwner.validateJsonObject(jsonObj.getAsJsonObject("owner"));
      if (!jsonObj.get("package_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_type").toString()));
      }
      // validate the required field `package_version`
      WebhookRegistryPackagePublishedRegistryPackagePackageVersion.validateJsonObject(jsonObj.getAsJsonObject("package_version"));
      // validate the required field `registry`
      WebhookRegistryPackagePublishedRegistryPackageRegistry.validateJsonObject(jsonObj.getAsJsonObject("registry"));
      if (!jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookRegistryPackagePublishedRegistryPackage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookRegistryPackagePublishedRegistryPackage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookRegistryPackagePublishedRegistryPackage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookRegistryPackagePublishedRegistryPackage.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookRegistryPackagePublishedRegistryPackage>() {
           @Override
           public void write(JsonWriter out, WebhookRegistryPackagePublishedRegistryPackage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookRegistryPackagePublishedRegistryPackage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookRegistryPackagePublishedRegistryPackage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookRegistryPackagePublishedRegistryPackage
  * @throws IOException if the JSON string is invalid with respect to WebhookRegistryPackagePublishedRegistryPackage
  */
  public static WebhookRegistryPackagePublishedRegistryPackage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookRegistryPackagePublishedRegistryPackage.class);
  }

 /**
  * Convert an instance of WebhookRegistryPackagePublishedRegistryPackage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

