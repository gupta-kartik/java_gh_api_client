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
 * WebhookDiscussionCreatedDiscussionAllOfReactions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookDiscussionCreatedDiscussionAllOfReactions {
  public static final String SERIALIZED_NAME_PLUS1 = "+1";
  @SerializedName(SERIALIZED_NAME_PLUS1)
  private Integer plus1;

  public static final String SERIALIZED_NAME_1 = "-1";
  @SerializedName(SERIALIZED_NAME_1)
  private Integer _1;

  public static final String SERIALIZED_NAME_CONFUSED = "confused";
  @SerializedName(SERIALIZED_NAME_CONFUSED)
  private Integer confused;

  public static final String SERIALIZED_NAME_EYES = "eyes";
  @SerializedName(SERIALIZED_NAME_EYES)
  private Integer eyes;

  public static final String SERIALIZED_NAME_HEART = "heart";
  @SerializedName(SERIALIZED_NAME_HEART)
  private Integer heart;

  public static final String SERIALIZED_NAME_HOORAY = "hooray";
  @SerializedName(SERIALIZED_NAME_HOORAY)
  private Integer hooray;

  public static final String SERIALIZED_NAME_LAUGH = "laugh";
  @SerializedName(SERIALIZED_NAME_LAUGH)
  private Integer laugh;

  public static final String SERIALIZED_NAME_ROCKET = "rocket";
  @SerializedName(SERIALIZED_NAME_ROCKET)
  private Integer rocket;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public WebhookDiscussionCreatedDiscussionAllOfReactions() {
  }

  public WebhookDiscussionCreatedDiscussionAllOfReactions plus1(Integer plus1) {
    
    this.plus1 = plus1;
    return this;
  }

   /**
   * Get plus1
   * @return plus1
  **/
  @javax.annotation.Nullable

  public Integer getPlus1() {
    return plus1;
  }


  public void setPlus1(Integer plus1) {
    this.plus1 = plus1;
  }


  public WebhookDiscussionCreatedDiscussionAllOfReactions _1(Integer _1) {
    
    this._1 = _1;
    return this;
  }

   /**
   * Get _1
   * @return _1
  **/
  @javax.annotation.Nullable

  public Integer get1() {
    return _1;
  }


  public void set1(Integer _1) {
    this._1 = _1;
  }


  public WebhookDiscussionCreatedDiscussionAllOfReactions confused(Integer confused) {
    
    this.confused = confused;
    return this;
  }

   /**
   * Get confused
   * @return confused
  **/
  @javax.annotation.Nullable

  public Integer getConfused() {
    return confused;
  }


  public void setConfused(Integer confused) {
    this.confused = confused;
  }


  public WebhookDiscussionCreatedDiscussionAllOfReactions eyes(Integer eyes) {
    
    this.eyes = eyes;
    return this;
  }

   /**
   * Get eyes
   * @return eyes
  **/
  @javax.annotation.Nullable

  public Integer getEyes() {
    return eyes;
  }


  public void setEyes(Integer eyes) {
    this.eyes = eyes;
  }


  public WebhookDiscussionCreatedDiscussionAllOfReactions heart(Integer heart) {
    
    this.heart = heart;
    return this;
  }

   /**
   * Get heart
   * @return heart
  **/
  @javax.annotation.Nullable

  public Integer getHeart() {
    return heart;
  }


  public void setHeart(Integer heart) {
    this.heart = heart;
  }


  public WebhookDiscussionCreatedDiscussionAllOfReactions hooray(Integer hooray) {
    
    this.hooray = hooray;
    return this;
  }

   /**
   * Get hooray
   * @return hooray
  **/
  @javax.annotation.Nullable

  public Integer getHooray() {
    return hooray;
  }


  public void setHooray(Integer hooray) {
    this.hooray = hooray;
  }


  public WebhookDiscussionCreatedDiscussionAllOfReactions laugh(Integer laugh) {
    
    this.laugh = laugh;
    return this;
  }

   /**
   * Get laugh
   * @return laugh
  **/
  @javax.annotation.Nullable

  public Integer getLaugh() {
    return laugh;
  }


  public void setLaugh(Integer laugh) {
    this.laugh = laugh;
  }


  public WebhookDiscussionCreatedDiscussionAllOfReactions rocket(Integer rocket) {
    
    this.rocket = rocket;
    return this;
  }

   /**
   * Get rocket
   * @return rocket
  **/
  @javax.annotation.Nullable

  public Integer getRocket() {
    return rocket;
  }


  public void setRocket(Integer rocket) {
    this.rocket = rocket;
  }


  public WebhookDiscussionCreatedDiscussionAllOfReactions totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public WebhookDiscussionCreatedDiscussionAllOfReactions url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookDiscussionCreatedDiscussionAllOfReactions webhookDiscussionCreatedDiscussionAllOfReactions = (WebhookDiscussionCreatedDiscussionAllOfReactions) o;
    return Objects.equals(this.plus1, webhookDiscussionCreatedDiscussionAllOfReactions.plus1) &&
        Objects.equals(this._1, webhookDiscussionCreatedDiscussionAllOfReactions._1) &&
        Objects.equals(this.confused, webhookDiscussionCreatedDiscussionAllOfReactions.confused) &&
        Objects.equals(this.eyes, webhookDiscussionCreatedDiscussionAllOfReactions.eyes) &&
        Objects.equals(this.heart, webhookDiscussionCreatedDiscussionAllOfReactions.heart) &&
        Objects.equals(this.hooray, webhookDiscussionCreatedDiscussionAllOfReactions.hooray) &&
        Objects.equals(this.laugh, webhookDiscussionCreatedDiscussionAllOfReactions.laugh) &&
        Objects.equals(this.rocket, webhookDiscussionCreatedDiscussionAllOfReactions.rocket) &&
        Objects.equals(this.totalCount, webhookDiscussionCreatedDiscussionAllOfReactions.totalCount) &&
        Objects.equals(this.url, webhookDiscussionCreatedDiscussionAllOfReactions.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plus1, _1, confused, eyes, heart, hooray, laugh, rocket, totalCount, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookDiscussionCreatedDiscussionAllOfReactions {\n");
    sb.append("    plus1: ").append(toIndentedString(plus1)).append("\n");
    sb.append("    _1: ").append(toIndentedString(_1)).append("\n");
    sb.append("    confused: ").append(toIndentedString(confused)).append("\n");
    sb.append("    eyes: ").append(toIndentedString(eyes)).append("\n");
    sb.append("    heart: ").append(toIndentedString(heart)).append("\n");
    sb.append("    hooray: ").append(toIndentedString(hooray)).append("\n");
    sb.append("    laugh: ").append(toIndentedString(laugh)).append("\n");
    sb.append("    rocket: ").append(toIndentedString(rocket)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("+1");
    openapiFields.add("-1");
    openapiFields.add("confused");
    openapiFields.add("eyes");
    openapiFields.add("heart");
    openapiFields.add("hooray");
    openapiFields.add("laugh");
    openapiFields.add("rocket");
    openapiFields.add("total_count");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookDiscussionCreatedDiscussionAllOfReactions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookDiscussionCreatedDiscussionAllOfReactions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookDiscussionCreatedDiscussionAllOfReactions is not found in the empty JSON string", WebhookDiscussionCreatedDiscussionAllOfReactions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookDiscussionCreatedDiscussionAllOfReactions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookDiscussionCreatedDiscussionAllOfReactions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookDiscussionCreatedDiscussionAllOfReactions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookDiscussionCreatedDiscussionAllOfReactions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookDiscussionCreatedDiscussionAllOfReactions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookDiscussionCreatedDiscussionAllOfReactions.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookDiscussionCreatedDiscussionAllOfReactions>() {
           @Override
           public void write(JsonWriter out, WebhookDiscussionCreatedDiscussionAllOfReactions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookDiscussionCreatedDiscussionAllOfReactions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookDiscussionCreatedDiscussionAllOfReactions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookDiscussionCreatedDiscussionAllOfReactions
  * @throws IOException if the JSON string is invalid with respect to WebhookDiscussionCreatedDiscussionAllOfReactions
  */
  public static WebhookDiscussionCreatedDiscussionAllOfReactions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookDiscussionCreatedDiscussionAllOfReactions.class);
  }

 /**
  * Convert an instance of WebhookDiscussionCreatedDiscussionAllOfReactions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

