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
 * A label for a self hosted runner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class RunnerLabel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The type of label. Read-only labels are applied automatically when the runner is configured.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    READ_ONLY("read-only"),
    
    CUSTOM("custom");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public RunnerLabel() {
  }

  public RunnerLabel id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the label.
   * @return id
  **/
  @javax.annotation.Nullable

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public RunnerLabel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the label.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RunnerLabel type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of label. Read-only labels are applied automatically when the runner is configured.
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunnerLabel runnerLabel = (RunnerLabel) o;
    return Objects.equals(this.id, runnerLabel.id) &&
        Objects.equals(this.name, runnerLabel.name) &&
        Objects.equals(this.type, runnerLabel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunnerLabel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RunnerLabel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RunnerLabel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunnerLabel is not found in the empty JSON string", RunnerLabel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RunnerLabel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunnerLabel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RunnerLabel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunnerLabel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunnerLabel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunnerLabel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunnerLabel.class));

       return (TypeAdapter<T>) new TypeAdapter<RunnerLabel>() {
           @Override
           public void write(JsonWriter out, RunnerLabel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunnerLabel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunnerLabel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunnerLabel
  * @throws IOException if the JSON string is invalid with respect to RunnerLabel
  */
  public static RunnerLabel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunnerLabel.class);
  }

 /**
  * Convert an instance of RunnerLabel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
