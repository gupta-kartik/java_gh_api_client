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
import org.openapitools.client.model.AlertInstance;
import org.openapitools.client.model.User;
import org.openapitools.client.model.WebhookCodeScanningAlertClosedByUserAlertRule;
import org.openapitools.client.model.WebhookCodeScanningAlertClosedByUserAlertTool;
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
 * The code scanning alert involved in the event.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookCodeScanningAlertClosedByUserAlert {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DISMISSED_AT = "dismissed_at";
  @SerializedName(SERIALIZED_NAME_DISMISSED_AT)
  private OffsetDateTime dismissedAt;

  public static final String SERIALIZED_NAME_DISMISSED_BY = "dismissed_by";
  @SerializedName(SERIALIZED_NAME_DISMISSED_BY)
  private User dismissedBy;

  /**
   * The reason for dismissing or closing the alert. Can be one of: &#x60;false positive&#x60;, &#x60;won&#39;t fix&#x60;, and &#x60;used in tests&#x60;.
   */
  @JsonAdapter(DismissedReasonEnum.Adapter.class)
  public enum DismissedReasonEnum {
    FALSE_POSITIVE("false positive"),
    
    WON_T_FIX("won't fix"),
    
    USED_IN_TESTS("used in tests"),
    
    NULL("null");

    private String value;

    DismissedReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DismissedReasonEnum fromValue(String value) {
      for (DismissedReasonEnum b : DismissedReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DismissedReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DismissedReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DismissedReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DismissedReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISMISSED_REASON = "dismissed_reason";
  @SerializedName(SERIALIZED_NAME_DISMISSED_REASON)
  private DismissedReasonEnum dismissedReason;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_MOST_RECENT_INSTANCE = "most_recent_instance";
  @SerializedName(SERIALIZED_NAME_MOST_RECENT_INSTANCE)
  private AlertInstance mostRecentInstance;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private WebhookCodeScanningAlertClosedByUserAlertRule rule;

  /**
   * State of a code scanning alert.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    DISMISSED("dismissed"),
    
    FIXED("fixed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_TOOL = "tool";
  @SerializedName(SERIALIZED_NAME_TOOL)
  private WebhookCodeScanningAlertClosedByUserAlertTool tool;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public WebhookCodeScanningAlertClosedByUserAlert() {
  }

  public WebhookCodeScanningAlertClosedByUserAlert createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time that the alert was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ.&#x60;
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookCodeScanningAlertClosedByUserAlert dismissedAt(OffsetDateTime dismissedAt) {
    
    this.dismissedAt = dismissedAt;
    return this;
  }

   /**
   * The time that the alert was dismissed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;.
   * @return dismissedAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getDismissedAt() {
    return dismissedAt;
  }


  public void setDismissedAt(OffsetDateTime dismissedAt) {
    this.dismissedAt = dismissedAt;
  }


  public WebhookCodeScanningAlertClosedByUserAlert dismissedBy(User dismissedBy) {
    
    this.dismissedBy = dismissedBy;
    return this;
  }

   /**
   * Get dismissedBy
   * @return dismissedBy
  **/
  @javax.annotation.Nullable

  public User getDismissedBy() {
    return dismissedBy;
  }


  public void setDismissedBy(User dismissedBy) {
    this.dismissedBy = dismissedBy;
  }


  public WebhookCodeScanningAlertClosedByUserAlert dismissedReason(DismissedReasonEnum dismissedReason) {
    
    this.dismissedReason = dismissedReason;
    return this;
  }

   /**
   * The reason for dismissing or closing the alert. Can be one of: &#x60;false positive&#x60;, &#x60;won&#39;t fix&#x60;, and &#x60;used in tests&#x60;.
   * @return dismissedReason
  **/
  @javax.annotation.Nullable

  public DismissedReasonEnum getDismissedReason() {
    return dismissedReason;
  }


  public void setDismissedReason(DismissedReasonEnum dismissedReason) {
    this.dismissedReason = dismissedReason;
  }


  public WebhookCodeScanningAlertClosedByUserAlert htmlUrl(URI htmlUrl) {
    
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * The GitHub URL of the alert resource.
   * @return htmlUrl
  **/
  @javax.annotation.Nonnull

  public URI getHtmlUrl() {
    return htmlUrl;
  }


  public void setHtmlUrl(URI htmlUrl) {
    this.htmlUrl = htmlUrl;
  }


  public WebhookCodeScanningAlertClosedByUserAlert mostRecentInstance(AlertInstance mostRecentInstance) {
    
    this.mostRecentInstance = mostRecentInstance;
    return this;
  }

   /**
   * Get mostRecentInstance
   * @return mostRecentInstance
  **/
  @javax.annotation.Nullable

  public AlertInstance getMostRecentInstance() {
    return mostRecentInstance;
  }


  public void setMostRecentInstance(AlertInstance mostRecentInstance) {
    this.mostRecentInstance = mostRecentInstance;
  }


  public WebhookCodeScanningAlertClosedByUserAlert number(Integer number) {
    
    this.number = number;
    return this;
  }

   /**
   * The code scanning alert number.
   * @return number
  **/
  @javax.annotation.Nonnull

  public Integer getNumber() {
    return number;
  }


  public void setNumber(Integer number) {
    this.number = number;
  }


  public WebhookCodeScanningAlertClosedByUserAlert rule(WebhookCodeScanningAlertClosedByUserAlertRule rule) {
    
    this.rule = rule;
    return this;
  }

   /**
   * Get rule
   * @return rule
  **/
  @javax.annotation.Nonnull

  public WebhookCodeScanningAlertClosedByUserAlertRule getRule() {
    return rule;
  }


  public void setRule(WebhookCodeScanningAlertClosedByUserAlertRule rule) {
    this.rule = rule;
  }


  public WebhookCodeScanningAlertClosedByUserAlert state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * State of a code scanning alert.
   * @return state
  **/
  @javax.annotation.Nonnull

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public WebhookCodeScanningAlertClosedByUserAlert tool(WebhookCodeScanningAlertClosedByUserAlertTool tool) {
    
    this.tool = tool;
    return this;
  }

   /**
   * Get tool
   * @return tool
  **/
  @javax.annotation.Nonnull

  public WebhookCodeScanningAlertClosedByUserAlertTool getTool() {
    return tool;
  }


  public void setTool(WebhookCodeScanningAlertClosedByUserAlertTool tool) {
    this.tool = tool;
  }


  public WebhookCodeScanningAlertClosedByUserAlert url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
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
    WebhookCodeScanningAlertClosedByUserAlert webhookCodeScanningAlertClosedByUserAlert = (WebhookCodeScanningAlertClosedByUserAlert) o;
    return Objects.equals(this.createdAt, webhookCodeScanningAlertClosedByUserAlert.createdAt) &&
        Objects.equals(this.dismissedAt, webhookCodeScanningAlertClosedByUserAlert.dismissedAt) &&
        Objects.equals(this.dismissedBy, webhookCodeScanningAlertClosedByUserAlert.dismissedBy) &&
        Objects.equals(this.dismissedReason, webhookCodeScanningAlertClosedByUserAlert.dismissedReason) &&
        Objects.equals(this.htmlUrl, webhookCodeScanningAlertClosedByUserAlert.htmlUrl) &&
        Objects.equals(this.mostRecentInstance, webhookCodeScanningAlertClosedByUserAlert.mostRecentInstance) &&
        Objects.equals(this.number, webhookCodeScanningAlertClosedByUserAlert.number) &&
        Objects.equals(this.rule, webhookCodeScanningAlertClosedByUserAlert.rule) &&
        Objects.equals(this.state, webhookCodeScanningAlertClosedByUserAlert.state) &&
        Objects.equals(this.tool, webhookCodeScanningAlertClosedByUserAlert.tool) &&
        Objects.equals(this.url, webhookCodeScanningAlertClosedByUserAlert.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, dismissedAt, dismissedBy, dismissedReason, htmlUrl, mostRecentInstance, number, rule, state, tool, url);
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
    sb.append("class WebhookCodeScanningAlertClosedByUserAlert {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dismissedAt: ").append(toIndentedString(dismissedAt)).append("\n");
    sb.append("    dismissedBy: ").append(toIndentedString(dismissedBy)).append("\n");
    sb.append("    dismissedReason: ").append(toIndentedString(dismissedReason)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    mostRecentInstance: ").append(toIndentedString(mostRecentInstance)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tool: ").append(toIndentedString(tool)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("dismissed_at");
    openapiFields.add("dismissed_by");
    openapiFields.add("dismissed_reason");
    openapiFields.add("html_url");
    openapiFields.add("most_recent_instance");
    openapiFields.add("number");
    openapiFields.add("rule");
    openapiFields.add("state");
    openapiFields.add("tool");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("dismissed_at");
    openapiRequiredFields.add("dismissed_by");
    openapiRequiredFields.add("dismissed_reason");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("rule");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("tool");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookCodeScanningAlertClosedByUserAlert
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookCodeScanningAlertClosedByUserAlert.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookCodeScanningAlertClosedByUserAlert is not found in the empty JSON string", WebhookCodeScanningAlertClosedByUserAlert.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookCodeScanningAlertClosedByUserAlert.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookCodeScanningAlertClosedByUserAlert` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookCodeScanningAlertClosedByUserAlert.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `dismissed_by`
      User.validateJsonObject(jsonObj.getAsJsonObject("dismissed_by"));
      if (!jsonObj.get("dismissed_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dismissed_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dismissed_reason").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      // validate the optional field `most_recent_instance`
      if (jsonObj.get("most_recent_instance") != null && !jsonObj.get("most_recent_instance").isJsonNull()) {
        AlertInstance.validateJsonObject(jsonObj.getAsJsonObject("most_recent_instance"));
      }
      // validate the required field `rule`
      WebhookCodeScanningAlertClosedByUserAlertRule.validateJsonObject(jsonObj.getAsJsonObject("rule"));
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the required field `tool`
      WebhookCodeScanningAlertClosedByUserAlertTool.validateJsonObject(jsonObj.getAsJsonObject("tool"));
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookCodeScanningAlertClosedByUserAlert.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookCodeScanningAlertClosedByUserAlert' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookCodeScanningAlertClosedByUserAlert> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookCodeScanningAlertClosedByUserAlert.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookCodeScanningAlertClosedByUserAlert>() {
           @Override
           public void write(JsonWriter out, WebhookCodeScanningAlertClosedByUserAlert value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookCodeScanningAlertClosedByUserAlert read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookCodeScanningAlertClosedByUserAlert given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookCodeScanningAlertClosedByUserAlert
  * @throws IOException if the JSON string is invalid with respect to WebhookCodeScanningAlertClosedByUserAlert
  */
  public static WebhookCodeScanningAlertClosedByUserAlert fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookCodeScanningAlertClosedByUserAlert.class);
  }

 /**
  * Convert an instance of WebhookCodeScanningAlertClosedByUserAlert to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

