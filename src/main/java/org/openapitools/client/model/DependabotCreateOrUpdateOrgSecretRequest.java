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
 * DependabotCreateOrUpdateOrgSecretRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class DependabotCreateOrUpdateOrgSecretRequest {
  public static final String SERIALIZED_NAME_ENCRYPTED_VALUE = "encrypted_value";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_VALUE)
  private String encryptedValue;

  public static final String SERIALIZED_NAME_KEY_ID = "key_id";
  @SerializedName(SERIALIZED_NAME_KEY_ID)
  private String keyId;

  /**
   * Which type of organization repositories have access to the organization secret. &#x60;selected&#x60; means only the repositories specified by &#x60;selected_repository_ids&#x60; can access the secret.
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    ALL("all"),
    
    PRIVATE("private"),
    
    SELECTED("selected");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VisibilityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private VisibilityEnum visibility;

  public static final String SERIALIZED_NAME_SELECTED_REPOSITORY_IDS = "selected_repository_ids";
  @SerializedName(SERIALIZED_NAME_SELECTED_REPOSITORY_IDS)
  private List<String> selectedRepositoryIds;

  public DependabotCreateOrUpdateOrgSecretRequest() {
  }

  public DependabotCreateOrUpdateOrgSecretRequest encryptedValue(String encryptedValue) {
    
    this.encryptedValue = encryptedValue;
    return this;
  }

   /**
   * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get an organization public key](https://docs.github.com/rest/reference/dependabot#get-an-organization-public-key) endpoint.
   * @return encryptedValue
  **/
  @javax.annotation.Nullable

  public String getEncryptedValue() {
    return encryptedValue;
  }


  public void setEncryptedValue(String encryptedValue) {
    this.encryptedValue = encryptedValue;
  }


  public DependabotCreateOrUpdateOrgSecretRequest keyId(String keyId) {
    
    this.keyId = keyId;
    return this;
  }

   /**
   * ID of the key you used to encrypt the secret.
   * @return keyId
  **/
  @javax.annotation.Nullable

  public String getKeyId() {
    return keyId;
  }


  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }


  public DependabotCreateOrUpdateOrgSecretRequest visibility(VisibilityEnum visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Which type of organization repositories have access to the organization secret. &#x60;selected&#x60; means only the repositories specified by &#x60;selected_repository_ids&#x60; can access the secret.
   * @return visibility
  **/
  @javax.annotation.Nonnull

  public VisibilityEnum getVisibility() {
    return visibility;
  }


  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }


  public DependabotCreateOrUpdateOrgSecretRequest selectedRepositoryIds(List<String> selectedRepositoryIds) {
    
    this.selectedRepositoryIds = selectedRepositoryIds;
    return this;
  }

  public DependabotCreateOrUpdateOrgSecretRequest addSelectedRepositoryIdsItem(String selectedRepositoryIdsItem) {
    if (this.selectedRepositoryIds == null) {
      this.selectedRepositoryIds = new ArrayList<>();
    }
    this.selectedRepositoryIds.add(selectedRepositoryIdsItem);
    return this;
  }

   /**
   * An array of repository ids that can access the organization secret. You can only provide a list of repository ids when the &#x60;visibility&#x60; is set to &#x60;selected&#x60;. You can manage the list of selected repositories using the [List selected repositories for an organization secret](https://docs.github.com/rest/reference/dependabot#list-selected-repositories-for-an-organization-secret), [Set selected repositories for an organization secret](https://docs.github.com/rest/reference/dependabot#set-selected-repositories-for-an-organization-secret), and [Remove selected repository from an organization secret](https://docs.github.com/rest/reference/dependabot#remove-selected-repository-from-an-organization-secret) endpoints.
   * @return selectedRepositoryIds
  **/
  @javax.annotation.Nullable

  public List<String> getSelectedRepositoryIds() {
    return selectedRepositoryIds;
  }


  public void setSelectedRepositoryIds(List<String> selectedRepositoryIds) {
    this.selectedRepositoryIds = selectedRepositoryIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependabotCreateOrUpdateOrgSecretRequest dependabotCreateOrUpdateOrgSecretRequest = (DependabotCreateOrUpdateOrgSecretRequest) o;
    return Objects.equals(this.encryptedValue, dependabotCreateOrUpdateOrgSecretRequest.encryptedValue) &&
        Objects.equals(this.keyId, dependabotCreateOrUpdateOrgSecretRequest.keyId) &&
        Objects.equals(this.visibility, dependabotCreateOrUpdateOrgSecretRequest.visibility) &&
        Objects.equals(this.selectedRepositoryIds, dependabotCreateOrUpdateOrgSecretRequest.selectedRepositoryIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedValue, keyId, visibility, selectedRepositoryIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependabotCreateOrUpdateOrgSecretRequest {\n");
    sb.append("    encryptedValue: ").append(toIndentedString(encryptedValue)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    selectedRepositoryIds: ").append(toIndentedString(selectedRepositoryIds)).append("\n");
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
    openapiFields.add("encrypted_value");
    openapiFields.add("key_id");
    openapiFields.add("visibility");
    openapiFields.add("selected_repository_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("visibility");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DependabotCreateOrUpdateOrgSecretRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DependabotCreateOrUpdateOrgSecretRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DependabotCreateOrUpdateOrgSecretRequest is not found in the empty JSON string", DependabotCreateOrUpdateOrgSecretRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DependabotCreateOrUpdateOrgSecretRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DependabotCreateOrUpdateOrgSecretRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DependabotCreateOrUpdateOrgSecretRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("encrypted_value") != null && !jsonObj.get("encrypted_value").isJsonNull()) && !jsonObj.get("encrypted_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encrypted_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encrypted_value").toString()));
      }
      if ((jsonObj.get("key_id") != null && !jsonObj.get("key_id").isJsonNull()) && !jsonObj.get("key_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_id").toString()));
      }
      if (!jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("selected_repository_ids") != null && !jsonObj.get("selected_repository_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `selected_repository_ids` to be an array in the JSON string but got `%s`", jsonObj.get("selected_repository_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DependabotCreateOrUpdateOrgSecretRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DependabotCreateOrUpdateOrgSecretRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DependabotCreateOrUpdateOrgSecretRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DependabotCreateOrUpdateOrgSecretRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DependabotCreateOrUpdateOrgSecretRequest>() {
           @Override
           public void write(JsonWriter out, DependabotCreateOrUpdateOrgSecretRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DependabotCreateOrUpdateOrgSecretRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DependabotCreateOrUpdateOrgSecretRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DependabotCreateOrUpdateOrgSecretRequest
  * @throws IOException if the JSON string is invalid with respect to DependabotCreateOrUpdateOrgSecretRequest
  */
  public static DependabotCreateOrUpdateOrgSecretRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DependabotCreateOrUpdateOrgSecretRequest.class);
  }

 /**
  * Convert an instance of DependabotCreateOrUpdateOrgSecretRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

