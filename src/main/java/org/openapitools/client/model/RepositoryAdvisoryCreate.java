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
import org.openapitools.client.model.RepositoryAdvisoryCreateCreditsInner;
import org.openapitools.client.model.RepositoryAdvisoryCreateVulnerabilitiesInner;
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
 * RepositoryAdvisoryCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class RepositoryAdvisoryCreate {
  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CVE_ID = "cve_id";
  @SerializedName(SERIALIZED_NAME_CVE_ID)
  private String cveId;

  public static final String SERIALIZED_NAME_VULNERABILITIES = "vulnerabilities";
  @SerializedName(SERIALIZED_NAME_VULNERABILITIES)
  private List<RepositoryAdvisoryCreateVulnerabilitiesInner> vulnerabilities = new ArrayList<>();

  public static final String SERIALIZED_NAME_CWE_IDS = "cwe_ids";
  @SerializedName(SERIALIZED_NAME_CWE_IDS)
  private List<String> cweIds;

  public static final String SERIALIZED_NAME_CREDITS = "credits";
  @SerializedName(SERIALIZED_NAME_CREDITS)
  private List<RepositoryAdvisoryCreateCreditsInner> credits;

  /**
   * The severity of the advisory. You must choose between setting this field or &#x60;cvss_vector_string&#x60;.
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
  public enum SeverityEnum {
    CRITICAL("critical"),
    
    HIGH("high"),
    
    MEDIUM("medium"),
    
    LOW("low");

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

  public static final String SERIALIZED_NAME_CVSS_VECTOR_STRING = "cvss_vector_string";
  @SerializedName(SERIALIZED_NAME_CVSS_VECTOR_STRING)
  private String cvssVectorString;

  public RepositoryAdvisoryCreate() {
  }

  public RepositoryAdvisoryCreate summary(String summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * A short summary of the advisory.
   * @return summary
  **/
  @javax.annotation.Nonnull

  public String getSummary() {
    return summary;
  }


  public void setSummary(String summary) {
    this.summary = summary;
  }


  public RepositoryAdvisoryCreate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A detailed description of what the advisory impacts.
   * @return description
  **/
  @javax.annotation.Nonnull

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RepositoryAdvisoryCreate cveId(String cveId) {
    
    this.cveId = cveId;
    return this;
  }

   /**
   * The Common Vulnerabilities and Exposures (CVE) ID.
   * @return cveId
  **/
  @javax.annotation.Nullable

  public String getCveId() {
    return cveId;
  }


  public void setCveId(String cveId) {
    this.cveId = cveId;
  }


  public RepositoryAdvisoryCreate vulnerabilities(List<RepositoryAdvisoryCreateVulnerabilitiesInner> vulnerabilities) {
    
    this.vulnerabilities = vulnerabilities;
    return this;
  }

  public RepositoryAdvisoryCreate addVulnerabilitiesItem(RepositoryAdvisoryCreateVulnerabilitiesInner vulnerabilitiesItem) {
    if (this.vulnerabilities == null) {
      this.vulnerabilities = new ArrayList<>();
    }
    this.vulnerabilities.add(vulnerabilitiesItem);
    return this;
  }

   /**
   * A product affected by the vulnerability detailed in a repository security advisory.
   * @return vulnerabilities
  **/
  @javax.annotation.Nonnull

  public List<RepositoryAdvisoryCreateVulnerabilitiesInner> getVulnerabilities() {
    return vulnerabilities;
  }


  public void setVulnerabilities(List<RepositoryAdvisoryCreateVulnerabilitiesInner> vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
  }


  public RepositoryAdvisoryCreate cweIds(List<String> cweIds) {
    
    this.cweIds = cweIds;
    return this;
  }

  public RepositoryAdvisoryCreate addCweIdsItem(String cweIdsItem) {
    if (this.cweIds == null) {
      this.cweIds = new ArrayList<>();
    }
    this.cweIds.add(cweIdsItem);
    return this;
  }

   /**
   * A list of Common Weakness Enumeration (CWE) IDs.
   * @return cweIds
  **/
  @javax.annotation.Nullable

  public List<String> getCweIds() {
    return cweIds;
  }


  public void setCweIds(List<String> cweIds) {
    this.cweIds = cweIds;
  }


  public RepositoryAdvisoryCreate credits(List<RepositoryAdvisoryCreateCreditsInner> credits) {
    
    this.credits = credits;
    return this;
  }

  public RepositoryAdvisoryCreate addCreditsItem(RepositoryAdvisoryCreateCreditsInner creditsItem) {
    if (this.credits == null) {
      this.credits = new ArrayList<>();
    }
    this.credits.add(creditsItem);
    return this;
  }

   /**
   * A list of users receiving credit for their participation in the security advisory.
   * @return credits
  **/
  @javax.annotation.Nullable

  public List<RepositoryAdvisoryCreateCreditsInner> getCredits() {
    return credits;
  }


  public void setCredits(List<RepositoryAdvisoryCreateCreditsInner> credits) {
    this.credits = credits;
  }


  public RepositoryAdvisoryCreate severity(SeverityEnum severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * The severity of the advisory. You must choose between setting this field or &#x60;cvss_vector_string&#x60;.
   * @return severity
  **/
  @javax.annotation.Nullable

  public SeverityEnum getSeverity() {
    return severity;
  }


  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }


  public RepositoryAdvisoryCreate cvssVectorString(String cvssVectorString) {
    
    this.cvssVectorString = cvssVectorString;
    return this;
  }

   /**
   * The CVSS vector that calculates the severity of the advisory. You must choose between setting this field or &#x60;severity&#x60;.
   * @return cvssVectorString
  **/
  @javax.annotation.Nullable

  public String getCvssVectorString() {
    return cvssVectorString;
  }


  public void setCvssVectorString(String cvssVectorString) {
    this.cvssVectorString = cvssVectorString;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryAdvisoryCreate repositoryAdvisoryCreate = (RepositoryAdvisoryCreate) o;
    return Objects.equals(this.summary, repositoryAdvisoryCreate.summary) &&
        Objects.equals(this.description, repositoryAdvisoryCreate.description) &&
        Objects.equals(this.cveId, repositoryAdvisoryCreate.cveId) &&
        Objects.equals(this.vulnerabilities, repositoryAdvisoryCreate.vulnerabilities) &&
        Objects.equals(this.cweIds, repositoryAdvisoryCreate.cweIds) &&
        Objects.equals(this.credits, repositoryAdvisoryCreate.credits) &&
        Objects.equals(this.severity, repositoryAdvisoryCreate.severity) &&
        Objects.equals(this.cvssVectorString, repositoryAdvisoryCreate.cvssVectorString);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, description, cveId, vulnerabilities, cweIds, credits, severity, cvssVectorString);
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
    sb.append("class RepositoryAdvisoryCreate {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cveId: ").append(toIndentedString(cveId)).append("\n");
    sb.append("    vulnerabilities: ").append(toIndentedString(vulnerabilities)).append("\n");
    sb.append("    cweIds: ").append(toIndentedString(cweIds)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    cvssVectorString: ").append(toIndentedString(cvssVectorString)).append("\n");
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
    openapiFields.add("summary");
    openapiFields.add("description");
    openapiFields.add("cve_id");
    openapiFields.add("vulnerabilities");
    openapiFields.add("cwe_ids");
    openapiFields.add("credits");
    openapiFields.add("severity");
    openapiFields.add("cvss_vector_string");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("summary");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("vulnerabilities");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RepositoryAdvisoryCreate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RepositoryAdvisoryCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RepositoryAdvisoryCreate is not found in the empty JSON string", RepositoryAdvisoryCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RepositoryAdvisoryCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RepositoryAdvisoryCreate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RepositoryAdvisoryCreate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("cve_id") != null && !jsonObj.get("cve_id").isJsonNull()) && !jsonObj.get("cve_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cve_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cve_id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("vulnerabilities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vulnerabilities` to be an array in the JSON string but got `%s`", jsonObj.get("vulnerabilities").toString()));
      }

      JsonArray jsonArrayvulnerabilities = jsonObj.getAsJsonArray("vulnerabilities");
      // validate the required field `vulnerabilities` (array)
      for (int i = 0; i < jsonArrayvulnerabilities.size(); i++) {
        RepositoryAdvisoryCreateVulnerabilitiesInner.validateJsonObject(jsonArrayvulnerabilities.get(i).getAsJsonObject());
      };
      // ensure the optional json data is an array if present
      if (jsonObj.get("cwe_ids") != null && !jsonObj.get("cwe_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cwe_ids` to be an array in the JSON string but got `%s`", jsonObj.get("cwe_ids").toString()));
      }
      if (jsonObj.get("credits") != null && !jsonObj.get("credits").isJsonNull()) {
        JsonArray jsonArraycredits = jsonObj.getAsJsonArray("credits");
        if (jsonArraycredits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("credits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `credits` to be an array in the JSON string but got `%s`", jsonObj.get("credits").toString()));
          }

          // validate the optional field `credits` (array)
          for (int i = 0; i < jsonArraycredits.size(); i++) {
            RepositoryAdvisoryCreateCreditsInner.validateJsonObject(jsonArraycredits.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonNull()) && !jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
      if ((jsonObj.get("cvss_vector_string") != null && !jsonObj.get("cvss_vector_string").isJsonNull()) && !jsonObj.get("cvss_vector_string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cvss_vector_string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cvss_vector_string").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RepositoryAdvisoryCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RepositoryAdvisoryCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RepositoryAdvisoryCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RepositoryAdvisoryCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<RepositoryAdvisoryCreate>() {
           @Override
           public void write(JsonWriter out, RepositoryAdvisoryCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RepositoryAdvisoryCreate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RepositoryAdvisoryCreate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RepositoryAdvisoryCreate
  * @throws IOException if the JSON string is invalid with respect to RepositoryAdvisoryCreate
  */
  public static RepositoryAdvisoryCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RepositoryAdvisoryCreate.class);
  }

 /**
  * Convert an instance of RepositoryAdvisoryCreate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

