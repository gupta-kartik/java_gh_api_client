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
import org.openapitools.client.model.DependabotAlertSecurityAdvisory;
import org.openapitools.client.model.DependabotAlertSecurityVulnerability;
import org.openapitools.client.model.DependabotAlertWithRepositoryDependency;
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
 * A Dependabot alert.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class DependabotAlert {
  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  /**
   * The state of the Dependabot alert.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    AUTO_DISMISSED("auto_dismissed"),
    
    DISMISSED("dismissed"),
    
    FIXED("fixed"),
    
    OPEN("open");

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

  public static final String SERIALIZED_NAME_DEPENDENCY = "dependency";
  @SerializedName(SERIALIZED_NAME_DEPENDENCY)
  private DependabotAlertWithRepositoryDependency dependency;

  public static final String SERIALIZED_NAME_SECURITY_ADVISORY = "security_advisory";
  @SerializedName(SERIALIZED_NAME_SECURITY_ADVISORY)
  private DependabotAlertSecurityAdvisory securityAdvisory;

  public static final String SERIALIZED_NAME_SECURITY_VULNERABILITY = "security_vulnerability";
  @SerializedName(SERIALIZED_NAME_SECURITY_VULNERABILITY)
  private DependabotAlertSecurityVulnerability securityVulnerability;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_DISMISSED_AT = "dismissed_at";
  @SerializedName(SERIALIZED_NAME_DISMISSED_AT)
  private OffsetDateTime dismissedAt;

  public static final String SERIALIZED_NAME_DISMISSED_BY = "dismissed_by";
  @SerializedName(SERIALIZED_NAME_DISMISSED_BY)
  private NullableSimpleUser dismissedBy;

  /**
   * The reason that the alert was dismissed.
   */
  @JsonAdapter(DismissedReasonEnum.Adapter.class)
  public enum DismissedReasonEnum {
    FIX_STARTED("fix_started"),
    
    INACCURATE("inaccurate"),
    
    NO_BANDWIDTH("no_bandwidth"),
    
    NOT_USED("not_used"),
    
    TOLERABLE_RISK("tolerable_risk");

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

  public static final String SERIALIZED_NAME_DISMISSED_COMMENT = "dismissed_comment";
  @SerializedName(SERIALIZED_NAME_DISMISSED_COMMENT)
  private String dismissedComment;

  public static final String SERIALIZED_NAME_FIXED_AT = "fixed_at";
  @SerializedName(SERIALIZED_NAME_FIXED_AT)
  private OffsetDateTime fixedAt;

  public static final String SERIALIZED_NAME_AUTO_DISMISSED_AT = "auto_dismissed_at";
  @SerializedName(SERIALIZED_NAME_AUTO_DISMISSED_AT)
  private OffsetDateTime autoDismissedAt;

  public DependabotAlert() {
  }

  
  public DependabotAlert(
     Integer number, 
     StateEnum state, 
     URI url, 
     URI htmlUrl, 
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt, 
     OffsetDateTime dismissedAt, 
     OffsetDateTime fixedAt, 
     OffsetDateTime autoDismissedAt
  ) {
    this();
    this.number = number;
    this.state = state;
    this.url = url;
    this.htmlUrl = htmlUrl;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.dismissedAt = dismissedAt;
    this.fixedAt = fixedAt;
    this.autoDismissedAt = autoDismissedAt;
  }

   /**
   * The security alert number.
   * @return number
  **/
  @javax.annotation.Nonnull

  public Integer getNumber() {
    return number;
  }




   /**
   * The state of the Dependabot alert.
   * @return state
  **/
  @javax.annotation.Nonnull

  public StateEnum getState() {
    return state;
  }




  public DependabotAlert dependency(DependabotAlertWithRepositoryDependency dependency) {
    
    this.dependency = dependency;
    return this;
  }

   /**
   * Get dependency
   * @return dependency
  **/
  @javax.annotation.Nonnull

  public DependabotAlertWithRepositoryDependency getDependency() {
    return dependency;
  }


  public void setDependency(DependabotAlertWithRepositoryDependency dependency) {
    this.dependency = dependency;
  }


  public DependabotAlert securityAdvisory(DependabotAlertSecurityAdvisory securityAdvisory) {
    
    this.securityAdvisory = securityAdvisory;
    return this;
  }

   /**
   * Get securityAdvisory
   * @return securityAdvisory
  **/
  @javax.annotation.Nonnull

  public DependabotAlertSecurityAdvisory getSecurityAdvisory() {
    return securityAdvisory;
  }


  public void setSecurityAdvisory(DependabotAlertSecurityAdvisory securityAdvisory) {
    this.securityAdvisory = securityAdvisory;
  }


  public DependabotAlert securityVulnerability(DependabotAlertSecurityVulnerability securityVulnerability) {
    
    this.securityVulnerability = securityVulnerability;
    return this;
  }

   /**
   * Get securityVulnerability
   * @return securityVulnerability
  **/
  @javax.annotation.Nonnull

  public DependabotAlertSecurityVulnerability getSecurityVulnerability() {
    return securityVulnerability;
  }


  public void setSecurityVulnerability(DependabotAlertSecurityVulnerability securityVulnerability) {
    this.securityVulnerability = securityVulnerability;
  }


   /**
   * The REST API URL of the alert resource.
   * @return url
  **/
  @javax.annotation.Nonnull

  public URI getUrl() {
    return url;
  }




   /**
   * The GitHub URL of the alert resource.
   * @return htmlUrl
  **/
  @javax.annotation.Nonnull

  public URI getHtmlUrl() {
    return htmlUrl;
  }




   /**
   * The time that the alert was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;.
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The time that the alert was last updated in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;.
   * @return updatedAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




   /**
   * The time that the alert was dismissed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;.
   * @return dismissedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getDismissedAt() {
    return dismissedAt;
  }




  public DependabotAlert dismissedBy(NullableSimpleUser dismissedBy) {
    
    this.dismissedBy = dismissedBy;
    return this;
  }

   /**
   * Get dismissedBy
   * @return dismissedBy
  **/
  @javax.annotation.Nullable

  public NullableSimpleUser getDismissedBy() {
    return dismissedBy;
  }


  public void setDismissedBy(NullableSimpleUser dismissedBy) {
    this.dismissedBy = dismissedBy;
  }


  public DependabotAlert dismissedReason(DismissedReasonEnum dismissedReason) {
    
    this.dismissedReason = dismissedReason;
    return this;
  }

   /**
   * The reason that the alert was dismissed.
   * @return dismissedReason
  **/
  @javax.annotation.Nullable

  public DismissedReasonEnum getDismissedReason() {
    return dismissedReason;
  }


  public void setDismissedReason(DismissedReasonEnum dismissedReason) {
    this.dismissedReason = dismissedReason;
  }


  public DependabotAlert dismissedComment(String dismissedComment) {
    
    this.dismissedComment = dismissedComment;
    return this;
  }

   /**
   * An optional comment associated with the alert&#39;s dismissal.
   * @return dismissedComment
  **/
  @javax.annotation.Nullable

  public String getDismissedComment() {
    return dismissedComment;
  }


  public void setDismissedComment(String dismissedComment) {
    this.dismissedComment = dismissedComment;
  }


   /**
   * The time that the alert was no longer detected and was considered fixed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;.
   * @return fixedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getFixedAt() {
    return fixedAt;
  }




   /**
   * The time that the alert was auto-dismissed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;.
   * @return autoDismissedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getAutoDismissedAt() {
    return autoDismissedAt;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependabotAlert dependabotAlert = (DependabotAlert) o;
    return Objects.equals(this.number, dependabotAlert.number) &&
        Objects.equals(this.state, dependabotAlert.state) &&
        Objects.equals(this.dependency, dependabotAlert.dependency) &&
        Objects.equals(this.securityAdvisory, dependabotAlert.securityAdvisory) &&
        Objects.equals(this.securityVulnerability, dependabotAlert.securityVulnerability) &&
        Objects.equals(this.url, dependabotAlert.url) &&
        Objects.equals(this.htmlUrl, dependabotAlert.htmlUrl) &&
        Objects.equals(this.createdAt, dependabotAlert.createdAt) &&
        Objects.equals(this.updatedAt, dependabotAlert.updatedAt) &&
        Objects.equals(this.dismissedAt, dependabotAlert.dismissedAt) &&
        Objects.equals(this.dismissedBy, dependabotAlert.dismissedBy) &&
        Objects.equals(this.dismissedReason, dependabotAlert.dismissedReason) &&
        Objects.equals(this.dismissedComment, dependabotAlert.dismissedComment) &&
        Objects.equals(this.fixedAt, dependabotAlert.fixedAt) &&
        Objects.equals(this.autoDismissedAt, dependabotAlert.autoDismissedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, state, dependency, securityAdvisory, securityVulnerability, url, htmlUrl, createdAt, updatedAt, dismissedAt, dismissedBy, dismissedReason, dismissedComment, fixedAt, autoDismissedAt);
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
    sb.append("class DependabotAlert {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dependency: ").append(toIndentedString(dependency)).append("\n");
    sb.append("    securityAdvisory: ").append(toIndentedString(securityAdvisory)).append("\n");
    sb.append("    securityVulnerability: ").append(toIndentedString(securityVulnerability)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    dismissedAt: ").append(toIndentedString(dismissedAt)).append("\n");
    sb.append("    dismissedBy: ").append(toIndentedString(dismissedBy)).append("\n");
    sb.append("    dismissedReason: ").append(toIndentedString(dismissedReason)).append("\n");
    sb.append("    dismissedComment: ").append(toIndentedString(dismissedComment)).append("\n");
    sb.append("    fixedAt: ").append(toIndentedString(fixedAt)).append("\n");
    sb.append("    autoDismissedAt: ").append(toIndentedString(autoDismissedAt)).append("\n");
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
    openapiFields.add("number");
    openapiFields.add("state");
    openapiFields.add("dependency");
    openapiFields.add("security_advisory");
    openapiFields.add("security_vulnerability");
    openapiFields.add("url");
    openapiFields.add("html_url");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("dismissed_at");
    openapiFields.add("dismissed_by");
    openapiFields.add("dismissed_reason");
    openapiFields.add("dismissed_comment");
    openapiFields.add("fixed_at");
    openapiFields.add("auto_dismissed_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("dependency");
    openapiRequiredFields.add("security_advisory");
    openapiRequiredFields.add("security_vulnerability");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("dismissed_at");
    openapiRequiredFields.add("dismissed_by");
    openapiRequiredFields.add("dismissed_reason");
    openapiRequiredFields.add("dismissed_comment");
    openapiRequiredFields.add("fixed_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DependabotAlert
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DependabotAlert.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DependabotAlert is not found in the empty JSON string", DependabotAlert.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DependabotAlert.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DependabotAlert` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DependabotAlert.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the required field `dependency`
      DependabotAlertWithRepositoryDependency.validateJsonObject(jsonObj.getAsJsonObject("dependency"));
      // validate the required field `security_advisory`
      DependabotAlertSecurityAdvisory.validateJsonObject(jsonObj.getAsJsonObject("security_advisory"));
      // validate the required field `security_vulnerability`
      DependabotAlertSecurityVulnerability.validateJsonObject(jsonObj.getAsJsonObject("security_vulnerability"));
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      // validate the required field `dismissed_by`
      NullableSimpleUser.validateJsonObject(jsonObj.getAsJsonObject("dismissed_by"));
      if (!jsonObj.get("dismissed_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dismissed_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dismissed_reason").toString()));
      }
      if (!jsonObj.get("dismissed_comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dismissed_comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dismissed_comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DependabotAlert.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DependabotAlert' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DependabotAlert> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DependabotAlert.class));

       return (TypeAdapter<T>) new TypeAdapter<DependabotAlert>() {
           @Override
           public void write(JsonWriter out, DependabotAlert value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DependabotAlert read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DependabotAlert given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DependabotAlert
  * @throws IOException if the JSON string is invalid with respect to DependabotAlert
  */
  public static DependabotAlert fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DependabotAlert.class);
  }

 /**
  * Convert an instance of DependabotAlert to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

