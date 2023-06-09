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
 * PackagesBillingUsage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class PackagesBillingUsage {
  public static final String SERIALIZED_NAME_TOTAL_GIGABYTES_BANDWIDTH_USED = "total_gigabytes_bandwidth_used";
  @SerializedName(SERIALIZED_NAME_TOTAL_GIGABYTES_BANDWIDTH_USED)
  private Integer totalGigabytesBandwidthUsed;

  public static final String SERIALIZED_NAME_TOTAL_PAID_GIGABYTES_BANDWIDTH_USED = "total_paid_gigabytes_bandwidth_used";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAID_GIGABYTES_BANDWIDTH_USED)
  private Integer totalPaidGigabytesBandwidthUsed;

  public static final String SERIALIZED_NAME_INCLUDED_GIGABYTES_BANDWIDTH = "included_gigabytes_bandwidth";
  @SerializedName(SERIALIZED_NAME_INCLUDED_GIGABYTES_BANDWIDTH)
  private Integer includedGigabytesBandwidth;

  public PackagesBillingUsage() {
  }

  public PackagesBillingUsage totalGigabytesBandwidthUsed(Integer totalGigabytesBandwidthUsed) {
    
    this.totalGigabytesBandwidthUsed = totalGigabytesBandwidthUsed;
    return this;
  }

   /**
   * Sum of the free and paid storage space (GB) for GitHuub Packages.
   * @return totalGigabytesBandwidthUsed
  **/
  @javax.annotation.Nonnull

  public Integer getTotalGigabytesBandwidthUsed() {
    return totalGigabytesBandwidthUsed;
  }


  public void setTotalGigabytesBandwidthUsed(Integer totalGigabytesBandwidthUsed) {
    this.totalGigabytesBandwidthUsed = totalGigabytesBandwidthUsed;
  }


  public PackagesBillingUsage totalPaidGigabytesBandwidthUsed(Integer totalPaidGigabytesBandwidthUsed) {
    
    this.totalPaidGigabytesBandwidthUsed = totalPaidGigabytesBandwidthUsed;
    return this;
  }

   /**
   * Total paid storage space (GB) for GitHuub Packages.
   * @return totalPaidGigabytesBandwidthUsed
  **/
  @javax.annotation.Nonnull

  public Integer getTotalPaidGigabytesBandwidthUsed() {
    return totalPaidGigabytesBandwidthUsed;
  }


  public void setTotalPaidGigabytesBandwidthUsed(Integer totalPaidGigabytesBandwidthUsed) {
    this.totalPaidGigabytesBandwidthUsed = totalPaidGigabytesBandwidthUsed;
  }


  public PackagesBillingUsage includedGigabytesBandwidth(Integer includedGigabytesBandwidth) {
    
    this.includedGigabytesBandwidth = includedGigabytesBandwidth;
    return this;
  }

   /**
   * Free storage space (GB) for GitHub Packages.
   * @return includedGigabytesBandwidth
  **/
  @javax.annotation.Nonnull

  public Integer getIncludedGigabytesBandwidth() {
    return includedGigabytesBandwidth;
  }


  public void setIncludedGigabytesBandwidth(Integer includedGigabytesBandwidth) {
    this.includedGigabytesBandwidth = includedGigabytesBandwidth;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackagesBillingUsage packagesBillingUsage = (PackagesBillingUsage) o;
    return Objects.equals(this.totalGigabytesBandwidthUsed, packagesBillingUsage.totalGigabytesBandwidthUsed) &&
        Objects.equals(this.totalPaidGigabytesBandwidthUsed, packagesBillingUsage.totalPaidGigabytesBandwidthUsed) &&
        Objects.equals(this.includedGigabytesBandwidth, packagesBillingUsage.includedGigabytesBandwidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalGigabytesBandwidthUsed, totalPaidGigabytesBandwidthUsed, includedGigabytesBandwidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackagesBillingUsage {\n");
    sb.append("    totalGigabytesBandwidthUsed: ").append(toIndentedString(totalGigabytesBandwidthUsed)).append("\n");
    sb.append("    totalPaidGigabytesBandwidthUsed: ").append(toIndentedString(totalPaidGigabytesBandwidthUsed)).append("\n");
    sb.append("    includedGigabytesBandwidth: ").append(toIndentedString(includedGigabytesBandwidth)).append("\n");
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
    openapiFields.add("total_gigabytes_bandwidth_used");
    openapiFields.add("total_paid_gigabytes_bandwidth_used");
    openapiFields.add("included_gigabytes_bandwidth");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("total_gigabytes_bandwidth_used");
    openapiRequiredFields.add("total_paid_gigabytes_bandwidth_used");
    openapiRequiredFields.add("included_gigabytes_bandwidth");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PackagesBillingUsage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PackagesBillingUsage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PackagesBillingUsage is not found in the empty JSON string", PackagesBillingUsage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PackagesBillingUsage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PackagesBillingUsage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PackagesBillingUsage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PackagesBillingUsage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PackagesBillingUsage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PackagesBillingUsage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PackagesBillingUsage.class));

       return (TypeAdapter<T>) new TypeAdapter<PackagesBillingUsage>() {
           @Override
           public void write(JsonWriter out, PackagesBillingUsage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PackagesBillingUsage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PackagesBillingUsage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PackagesBillingUsage
  * @throws IOException if the JSON string is invalid with respect to PackagesBillingUsage
  */
  public static PackagesBillingUsage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PackagesBillingUsage.class);
  }

 /**
  * Convert an instance of PackagesBillingUsage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

