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
import java.util.List;
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
 * WebhookCodeScanningAlertClosedByUserAlertRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookCodeScanningAlertClosedByUserAlertRule {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FULL_DESCRIPTION = "full_description";
  @SerializedName(SERIALIZED_NAME_FULL_DESCRIPTION)
  private String fullDescription;

  public static final String SERIALIZED_NAME_HELP = "help";
  @SerializedName(SERIALIZED_NAME_HELP)
  private String help;

  public static final String SERIALIZED_NAME_HELP_URI = "help_uri";
  @SerializedName(SERIALIZED_NAME_HELP_URI)
  private String helpUri;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The severity of the alert.
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
  public enum SeverityEnum {
    NONE("none"),
    
    NOTE("note"),
    
    WARNING("warning"),
    
    ERROR("error"),
    
    NULL("null");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeverityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SeverityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private SeverityEnum severity;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public WebhookCodeScanningAlertClosedByUserAlertRule() {
  }

  public WebhookCodeScanningAlertClosedByUserAlertRule description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A short description of the rule used to detect the alert.
   * @return description
  **/
  @javax.annotation.Nonnull

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public WebhookCodeScanningAlertClosedByUserAlertRule fullDescription(String fullDescription) {
    
    this.fullDescription = fullDescription;
    return this;
  }

   /**
   * Get fullDescription
   * @return fullDescription
  **/
  @javax.annotation.Nullable

  public String getFullDescription() {
    return fullDescription;
  }


  public void setFullDescription(String fullDescription) {
    this.fullDescription = fullDescription;
  }


  public WebhookCodeScanningAlertClosedByUserAlertRule help(String help) {
    
    this.help = help;
    return this;
  }

   /**
   * Get help
   * @return help
  **/
  @javax.annotation.Nullable

  public String getHelp() {
    return help;
  }


  public void setHelp(String help) {
    this.help = help;
  }


  public WebhookCodeScanningAlertClosedByUserAlertRule helpUri(String helpUri) {
    
    this.helpUri = helpUri;
    return this;
  }

   /**
   * A link to the documentation for the rule used to detect the alert.
   * @return helpUri
  **/
  @javax.annotation.Nullable

  public String getHelpUri() {
    return helpUri;
  }


  public void setHelpUri(String helpUri) {
    this.helpUri = helpUri;
  }


  public WebhookCodeScanningAlertClosedByUserAlertRule id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the rule used to detect the alert.
   * @return id
  **/
  @javax.annotation.Nonnull

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public WebhookCodeScanningAlertClosedByUserAlertRule name(String name) {
    
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


  public WebhookCodeScanningAlertClosedByUserAlertRule severity(SeverityEnum severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * The severity of the alert.
   * @return severity
  **/
  @javax.annotation.Nullable

  public SeverityEnum getSeverity() {
    return severity;
  }


  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }


  public WebhookCodeScanningAlertClosedByUserAlertRule tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public WebhookCodeScanningAlertClosedByUserAlertRule addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookCodeScanningAlertClosedByUserAlertRule webhookCodeScanningAlertClosedByUserAlertRule = (WebhookCodeScanningAlertClosedByUserAlertRule) o;
    return Objects.equals(this.description, webhookCodeScanningAlertClosedByUserAlertRule.description) &&
        Objects.equals(this.fullDescription, webhookCodeScanningAlertClosedByUserAlertRule.fullDescription) &&
        Objects.equals(this.help, webhookCodeScanningAlertClosedByUserAlertRule.help) &&
        Objects.equals(this.helpUri, webhookCodeScanningAlertClosedByUserAlertRule.helpUri) &&
        Objects.equals(this.id, webhookCodeScanningAlertClosedByUserAlertRule.id) &&
        Objects.equals(this.name, webhookCodeScanningAlertClosedByUserAlertRule.name) &&
        Objects.equals(this.severity, webhookCodeScanningAlertClosedByUserAlertRule.severity) &&
        Objects.equals(this.tags, webhookCodeScanningAlertClosedByUserAlertRule.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, fullDescription, help, helpUri, id, name, severity, tags);
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
    sb.append("class WebhookCodeScanningAlertClosedByUserAlertRule {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fullDescription: ").append(toIndentedString(fullDescription)).append("\n");
    sb.append("    help: ").append(toIndentedString(help)).append("\n");
    sb.append("    helpUri: ").append(toIndentedString(helpUri)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("full_description");
    openapiFields.add("help");
    openapiFields.add("help_uri");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("severity");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("severity");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookCodeScanningAlertClosedByUserAlertRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookCodeScanningAlertClosedByUserAlertRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookCodeScanningAlertClosedByUserAlertRule is not found in the empty JSON string", WebhookCodeScanningAlertClosedByUserAlertRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookCodeScanningAlertClosedByUserAlertRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookCodeScanningAlertClosedByUserAlertRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookCodeScanningAlertClosedByUserAlertRule.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("full_description") != null && !jsonObj.get("full_description").isJsonNull()) && !jsonObj.get("full_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_description").toString()));
      }
      if ((jsonObj.get("help") != null && !jsonObj.get("help").isJsonNull()) && !jsonObj.get("help").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `help` to be a primitive type in the JSON string but got `%s`", jsonObj.get("help").toString()));
      }
      if ((jsonObj.get("help_uri") != null && !jsonObj.get("help_uri").isJsonNull()) && !jsonObj.get("help_uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `help_uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("help_uri").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookCodeScanningAlertClosedByUserAlertRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookCodeScanningAlertClosedByUserAlertRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookCodeScanningAlertClosedByUserAlertRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookCodeScanningAlertClosedByUserAlertRule.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookCodeScanningAlertClosedByUserAlertRule>() {
           @Override
           public void write(JsonWriter out, WebhookCodeScanningAlertClosedByUserAlertRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookCodeScanningAlertClosedByUserAlertRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookCodeScanningAlertClosedByUserAlertRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookCodeScanningAlertClosedByUserAlertRule
  * @throws IOException if the JSON string is invalid with respect to WebhookCodeScanningAlertClosedByUserAlertRule
  */
  public static WebhookCodeScanningAlertClosedByUserAlertRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookCodeScanningAlertClosedByUserAlertRule.class);
  }

 /**
  * Convert an instance of WebhookCodeScanningAlertClosedByUserAlertRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

