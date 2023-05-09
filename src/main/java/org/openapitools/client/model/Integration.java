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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.IntegrationPermissions;
import org.openapitools.client.model.NullableSimpleUser;
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
 * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class Integration {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private NullableSimpleUser owner;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private URI externalUrl;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private IntegrationPermissions permissions;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_INSTALLATIONS_COUNT = "installations_count";
  @SerializedName(SERIALIZED_NAME_INSTALLATIONS_COUNT)
  private Integer installationsCount;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_WEBHOOK_SECRET = "webhook_secret";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_SECRET)
  private String webhookSecret;

  public static final String SERIALIZED_NAME_PEM = "pem";
  @SerializedName(SERIALIZED_NAME_PEM)
  private String pem;

  public Integration() {
  }

  public Integration id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the GitHub app
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Integration slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * The slug name of the GitHub app
   * @return slug
  **/
  @javax.annotation.Nullable

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public Integration nodeId(String nodeId) {
    
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @javax.annotation.Nonnull

  public String getNodeId() {
    return nodeId;
  }


  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }


  public Integration owner(NullableSimpleUser owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable

  public NullableSimpleUser getOwner() {
    return owner;
  }


  public void setOwner(NullableSimpleUser owner) {
    this.owner = owner;
  }


  public Integration name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the GitHub app
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Integration description(String description) {
    
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


  public Integration externalUrl(URI externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * Get externalUrl
   * @return externalUrl
  **/
  @javax.annotation.Nonnull

  public URI getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(URI externalUrl) {
    this.externalUrl = externalUrl;
  }


  public Integration htmlUrl(URI htmlUrl) {
    
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


  public Integration createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Integration updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Integration permissions(IntegrationPermissions permissions) {
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nonnull

  public IntegrationPermissions getPermissions() {
    return permissions;
  }


  public void setPermissions(IntegrationPermissions permissions) {
    this.permissions = permissions;
  }


  public Integration events(List<String> events) {
    
    this.events = events;
    return this;
  }

  public Integration addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * The list of events for the GitHub app
   * @return events
  **/
  @javax.annotation.Nonnull

  public List<String> getEvents() {
    return events;
  }


  public void setEvents(List<String> events) {
    this.events = events;
  }


  public Integration installationsCount(Integer installationsCount) {
    
    this.installationsCount = installationsCount;
    return this;
  }

   /**
   * The number of installations associated with the GitHub app
   * @return installationsCount
  **/
  @javax.annotation.Nullable

  public Integer getInstallationsCount() {
    return installationsCount;
  }


  public void setInstallationsCount(Integer installationsCount) {
    this.installationsCount = installationsCount;
  }


  public Integration clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public Integration clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  @javax.annotation.Nullable

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public Integration webhookSecret(String webhookSecret) {
    
    this.webhookSecret = webhookSecret;
    return this;
  }

   /**
   * Get webhookSecret
   * @return webhookSecret
  **/
  @javax.annotation.Nullable

  public String getWebhookSecret() {
    return webhookSecret;
  }


  public void setWebhookSecret(String webhookSecret) {
    this.webhookSecret = webhookSecret;
  }


  public Integration pem(String pem) {
    
    this.pem = pem;
    return this;
  }

   /**
   * Get pem
   * @return pem
  **/
  @javax.annotation.Nullable

  public String getPem() {
    return pem;
  }


  public void setPem(String pem) {
    this.pem = pem;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Integration integration = (Integration) o;
    return Objects.equals(this.id, integration.id) &&
        Objects.equals(this.slug, integration.slug) &&
        Objects.equals(this.nodeId, integration.nodeId) &&
        Objects.equals(this.owner, integration.owner) &&
        Objects.equals(this.name, integration.name) &&
        Objects.equals(this.description, integration.description) &&
        Objects.equals(this.externalUrl, integration.externalUrl) &&
        Objects.equals(this.htmlUrl, integration.htmlUrl) &&
        Objects.equals(this.createdAt, integration.createdAt) &&
        Objects.equals(this.updatedAt, integration.updatedAt) &&
        Objects.equals(this.permissions, integration.permissions) &&
        Objects.equals(this.events, integration.events) &&
        Objects.equals(this.installationsCount, integration.installationsCount) &&
        Objects.equals(this.clientId, integration.clientId) &&
        Objects.equals(this.clientSecret, integration.clientSecret) &&
        Objects.equals(this.webhookSecret, integration.webhookSecret) &&
        Objects.equals(this.pem, integration.pem);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, nodeId, owner, name, description, externalUrl, htmlUrl, createdAt, updatedAt, permissions, events, installationsCount, clientId, clientSecret, webhookSecret, pem);
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
    sb.append("class Integration {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    installationsCount: ").append(toIndentedString(installationsCount)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
    sb.append("    pem: ").append(toIndentedString(pem)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("slug");
    openapiFields.add("node_id");
    openapiFields.add("owner");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("external_url");
    openapiFields.add("html_url");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("permissions");
    openapiFields.add("events");
    openapiFields.add("installations_count");
    openapiFields.add("client_id");
    openapiFields.add("client_secret");
    openapiFields.add("webhook_secret");
    openapiFields.add("pem");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("node_id");
    openapiRequiredFields.add("owner");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("external_url");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("permissions");
    openapiRequiredFields.add("events");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Integration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Integration.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Integration is not found in the empty JSON string", Integration.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Integration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Integration` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Integration.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      // validate the required field `owner`
      NullableSimpleUser.validateJsonObject(jsonObj.getAsJsonObject("owner"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("external_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_url").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("events") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
      }
      if ((jsonObj.get("client_id") != null && !jsonObj.get("client_id").isJsonNull()) && !jsonObj.get("client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_id").toString()));
      }
      if ((jsonObj.get("client_secret") != null && !jsonObj.get("client_secret").isJsonNull()) && !jsonObj.get("client_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_secret").toString()));
      }
      if ((jsonObj.get("webhook_secret") != null && !jsonObj.get("webhook_secret").isJsonNull()) && !jsonObj.get("webhook_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhook_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhook_secret").toString()));
      }
      if ((jsonObj.get("pem") != null && !jsonObj.get("pem").isJsonNull()) && !jsonObj.get("pem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pem").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Integration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Integration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Integration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Integration.class));

       return (TypeAdapter<T>) new TypeAdapter<Integration>() {
           @Override
           public void write(JsonWriter out, Integration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Integration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Integration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Integration
  * @throws IOException if the JSON string is invalid with respect to Integration
  */
  public static Integration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Integration.class);
  }

 /**
  * Convert an instance of Integration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

