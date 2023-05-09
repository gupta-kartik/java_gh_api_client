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
 * TopicSearchResultItemRelatedInnerTopicRelation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class TopicSearchResultItemRelatedInnerTopicRelation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TOPIC_ID = "topic_id";
  @SerializedName(SERIALIZED_NAME_TOPIC_ID)
  private Integer topicId;

  public static final String SERIALIZED_NAME_RELATION_TYPE = "relation_type";
  @SerializedName(SERIALIZED_NAME_RELATION_TYPE)
  private String relationType;

  public TopicSearchResultItemRelatedInnerTopicRelation() {
  }

  public TopicSearchResultItemRelatedInnerTopicRelation id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public TopicSearchResultItemRelatedInnerTopicRelation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TopicSearchResultItemRelatedInnerTopicRelation topicId(Integer topicId) {
    
    this.topicId = topicId;
    return this;
  }

   /**
   * Get topicId
   * @return topicId
  **/
  @javax.annotation.Nullable

  public Integer getTopicId() {
    return topicId;
  }


  public void setTopicId(Integer topicId) {
    this.topicId = topicId;
  }


  public TopicSearchResultItemRelatedInnerTopicRelation relationType(String relationType) {
    
    this.relationType = relationType;
    return this;
  }

   /**
   * Get relationType
   * @return relationType
  **/
  @javax.annotation.Nullable

  public String getRelationType() {
    return relationType;
  }


  public void setRelationType(String relationType) {
    this.relationType = relationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicSearchResultItemRelatedInnerTopicRelation topicSearchResultItemRelatedInnerTopicRelation = (TopicSearchResultItemRelatedInnerTopicRelation) o;
    return Objects.equals(this.id, topicSearchResultItemRelatedInnerTopicRelation.id) &&
        Objects.equals(this.name, topicSearchResultItemRelatedInnerTopicRelation.name) &&
        Objects.equals(this.topicId, topicSearchResultItemRelatedInnerTopicRelation.topicId) &&
        Objects.equals(this.relationType, topicSearchResultItemRelatedInnerTopicRelation.relationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, topicId, relationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicSearchResultItemRelatedInnerTopicRelation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("topic_id");
    openapiFields.add("relation_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TopicSearchResultItemRelatedInnerTopicRelation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TopicSearchResultItemRelatedInnerTopicRelation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TopicSearchResultItemRelatedInnerTopicRelation is not found in the empty JSON string", TopicSearchResultItemRelatedInnerTopicRelation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TopicSearchResultItemRelatedInnerTopicRelation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TopicSearchResultItemRelatedInnerTopicRelation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("relation_type") != null && !jsonObj.get("relation_type").isJsonNull()) && !jsonObj.get("relation_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relation_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relation_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TopicSearchResultItemRelatedInnerTopicRelation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TopicSearchResultItemRelatedInnerTopicRelation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TopicSearchResultItemRelatedInnerTopicRelation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TopicSearchResultItemRelatedInnerTopicRelation.class));

       return (TypeAdapter<T>) new TypeAdapter<TopicSearchResultItemRelatedInnerTopicRelation>() {
           @Override
           public void write(JsonWriter out, TopicSearchResultItemRelatedInnerTopicRelation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TopicSearchResultItemRelatedInnerTopicRelation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TopicSearchResultItemRelatedInnerTopicRelation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TopicSearchResultItemRelatedInnerTopicRelation
  * @throws IOException if the JSON string is invalid with respect to TopicSearchResultItemRelatedInnerTopicRelation
  */
  public static TopicSearchResultItemRelatedInnerTopicRelation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TopicSearchResultItemRelatedInnerTopicRelation.class);
  }

 /**
  * Convert an instance of TopicSearchResultItemRelatedInnerTopicRelation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

