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
import org.openapitools.client.model.RepositoryRuleParamsStatusCheckConfiguration;

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
 * RepositoryRuleRequiredStatusChecksParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class RepositoryRuleRequiredStatusChecksParameters {
  public static final String SERIALIZED_NAME_REQUIRED_STATUS_CHECKS = "required_status_checks";
  @SerializedName(SERIALIZED_NAME_REQUIRED_STATUS_CHECKS)
  private List<RepositoryRuleParamsStatusCheckConfiguration> requiredStatusChecks = new ArrayList<>();

  public static final String SERIALIZED_NAME_STRICT_REQUIRED_STATUS_CHECKS_POLICY = "strict_required_status_checks_policy";
  @SerializedName(SERIALIZED_NAME_STRICT_REQUIRED_STATUS_CHECKS_POLICY)
  private Boolean strictRequiredStatusChecksPolicy;

  public RepositoryRuleRequiredStatusChecksParameters() {
  }

  public RepositoryRuleRequiredStatusChecksParameters requiredStatusChecks(List<RepositoryRuleParamsStatusCheckConfiguration> requiredStatusChecks) {
    
    this.requiredStatusChecks = requiredStatusChecks;
    return this;
  }

  public RepositoryRuleRequiredStatusChecksParameters addRequiredStatusChecksItem(RepositoryRuleParamsStatusCheckConfiguration requiredStatusChecksItem) {
    if (this.requiredStatusChecks == null) {
      this.requiredStatusChecks = new ArrayList<>();
    }
    this.requiredStatusChecks.add(requiredStatusChecksItem);
    return this;
  }

   /**
   * Status checks that are required.
   * @return requiredStatusChecks
  **/
  @javax.annotation.Nonnull

  public List<RepositoryRuleParamsStatusCheckConfiguration> getRequiredStatusChecks() {
    return requiredStatusChecks;
  }


  public void setRequiredStatusChecks(List<RepositoryRuleParamsStatusCheckConfiguration> requiredStatusChecks) {
    this.requiredStatusChecks = requiredStatusChecks;
  }


  public RepositoryRuleRequiredStatusChecksParameters strictRequiredStatusChecksPolicy(Boolean strictRequiredStatusChecksPolicy) {
    
    this.strictRequiredStatusChecksPolicy = strictRequiredStatusChecksPolicy;
    return this;
  }

   /**
   * Whether pull requests targeting a matching branch must be tested with the latest code. This setting will not take effect unless at least one status check is enabled.
   * @return strictRequiredStatusChecksPolicy
  **/
  @javax.annotation.Nonnull

  public Boolean getStrictRequiredStatusChecksPolicy() {
    return strictRequiredStatusChecksPolicy;
  }


  public void setStrictRequiredStatusChecksPolicy(Boolean strictRequiredStatusChecksPolicy) {
    this.strictRequiredStatusChecksPolicy = strictRequiredStatusChecksPolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryRuleRequiredStatusChecksParameters repositoryRuleRequiredStatusChecksParameters = (RepositoryRuleRequiredStatusChecksParameters) o;
    return Objects.equals(this.requiredStatusChecks, repositoryRuleRequiredStatusChecksParameters.requiredStatusChecks) &&
        Objects.equals(this.strictRequiredStatusChecksPolicy, repositoryRuleRequiredStatusChecksParameters.strictRequiredStatusChecksPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredStatusChecks, strictRequiredStatusChecksPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryRuleRequiredStatusChecksParameters {\n");
    sb.append("    requiredStatusChecks: ").append(toIndentedString(requiredStatusChecks)).append("\n");
    sb.append("    strictRequiredStatusChecksPolicy: ").append(toIndentedString(strictRequiredStatusChecksPolicy)).append("\n");
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
    openapiFields.add("required_status_checks");
    openapiFields.add("strict_required_status_checks_policy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("required_status_checks");
    openapiRequiredFields.add("strict_required_status_checks_policy");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RepositoryRuleRequiredStatusChecksParameters
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RepositoryRuleRequiredStatusChecksParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RepositoryRuleRequiredStatusChecksParameters is not found in the empty JSON string", RepositoryRuleRequiredStatusChecksParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RepositoryRuleRequiredStatusChecksParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RepositoryRuleRequiredStatusChecksParameters` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RepositoryRuleRequiredStatusChecksParameters.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("required_status_checks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `required_status_checks` to be an array in the JSON string but got `%s`", jsonObj.get("required_status_checks").toString()));
      }

      JsonArray jsonArrayrequiredStatusChecks = jsonObj.getAsJsonArray("required_status_checks");
      // validate the required field `required_status_checks` (array)
      for (int i = 0; i < jsonArrayrequiredStatusChecks.size(); i++) {
        RepositoryRuleParamsStatusCheckConfiguration.validateJsonObject(jsonArrayrequiredStatusChecks.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RepositoryRuleRequiredStatusChecksParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RepositoryRuleRequiredStatusChecksParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RepositoryRuleRequiredStatusChecksParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RepositoryRuleRequiredStatusChecksParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<RepositoryRuleRequiredStatusChecksParameters>() {
           @Override
           public void write(JsonWriter out, RepositoryRuleRequiredStatusChecksParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RepositoryRuleRequiredStatusChecksParameters read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RepositoryRuleRequiredStatusChecksParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RepositoryRuleRequiredStatusChecksParameters
  * @throws IOException if the JSON string is invalid with respect to RepositoryRuleRequiredStatusChecksParameters
  */
  public static RepositoryRuleRequiredStatusChecksParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RepositoryRuleRequiredStatusChecksParameters.class);
  }

 /**
  * Convert an instance of RepositoryRuleRequiredStatusChecksParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
