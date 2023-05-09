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
import org.openapitools.client.model.WebhookMilestoneEditedChangesTitle;
import org.openapitools.client.model.WebhookProjectEditedChangesBody;
import org.openapitools.client.model.WebhookPullRequestEditedChangesBase;

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
 * The changes to the comment if the action was &#x60;edited&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookPullRequestEditedChanges {
  public static final String SERIALIZED_NAME_BASE = "base";
  @SerializedName(SERIALIZED_NAME_BASE)
  private WebhookPullRequestEditedChangesBase base;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private WebhookProjectEditedChangesBody body;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private WebhookMilestoneEditedChangesTitle title;

  public WebhookPullRequestEditedChanges() {
  }

  public WebhookPullRequestEditedChanges base(WebhookPullRequestEditedChangesBase base) {
    
    this.base = base;
    return this;
  }

   /**
   * Get base
   * @return base
  **/
  @javax.annotation.Nullable

  public WebhookPullRequestEditedChangesBase getBase() {
    return base;
  }


  public void setBase(WebhookPullRequestEditedChangesBase base) {
    this.base = base;
  }


  public WebhookPullRequestEditedChanges body(WebhookProjectEditedChangesBody body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable

  public WebhookProjectEditedChangesBody getBody() {
    return body;
  }


  public void setBody(WebhookProjectEditedChangesBody body) {
    this.body = body;
  }


  public WebhookPullRequestEditedChanges title(WebhookMilestoneEditedChangesTitle title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable

  public WebhookMilestoneEditedChangesTitle getTitle() {
    return title;
  }


  public void setTitle(WebhookMilestoneEditedChangesTitle title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookPullRequestEditedChanges webhookPullRequestEditedChanges = (WebhookPullRequestEditedChanges) o;
    return Objects.equals(this.base, webhookPullRequestEditedChanges.base) &&
        Objects.equals(this.body, webhookPullRequestEditedChanges.body) &&
        Objects.equals(this.title, webhookPullRequestEditedChanges.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, body, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPullRequestEditedChanges {\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("base");
    openapiFields.add("body");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookPullRequestEditedChanges
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookPullRequestEditedChanges.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookPullRequestEditedChanges is not found in the empty JSON string", WebhookPullRequestEditedChanges.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookPullRequestEditedChanges.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookPullRequestEditedChanges` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `base`
      if (jsonObj.get("base") != null && !jsonObj.get("base").isJsonNull()) {
        WebhookPullRequestEditedChangesBase.validateJsonObject(jsonObj.getAsJsonObject("base"));
      }
      // validate the optional field `body`
      if (jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) {
        WebhookProjectEditedChangesBody.validateJsonObject(jsonObj.getAsJsonObject("body"));
      }
      // validate the optional field `title`
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) {
        WebhookMilestoneEditedChangesTitle.validateJsonObject(jsonObj.getAsJsonObject("title"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookPullRequestEditedChanges.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookPullRequestEditedChanges' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookPullRequestEditedChanges> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookPullRequestEditedChanges.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookPullRequestEditedChanges>() {
           @Override
           public void write(JsonWriter out, WebhookPullRequestEditedChanges value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookPullRequestEditedChanges read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookPullRequestEditedChanges given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookPullRequestEditedChanges
  * @throws IOException if the JSON string is invalid with respect to WebhookPullRequestEditedChanges
  */
  public static WebhookPullRequestEditedChanges fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookPullRequestEditedChanges.class);
  }

 /**
  * Convert an instance of WebhookPullRequestEditedChanges to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
