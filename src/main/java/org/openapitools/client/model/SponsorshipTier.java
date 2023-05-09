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
 * The &#x60;tier_changed&#x60; and &#x60;pending_tier_change&#x60; will include the original tier before the change or pending change. For more information, see the pending tier change payload.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class SponsorshipTier {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_CUSTOM_AMMOUNT = "is_custom_ammount";
  @SerializedName(SERIALIZED_NAME_IS_CUSTOM_AMMOUNT)
  private Boolean isCustomAmmount;

  public static final String SERIALIZED_NAME_IS_CUSTOM_AMOUNT = "is_custom_amount";
  @SerializedName(SERIALIZED_NAME_IS_CUSTOM_AMOUNT)
  private Boolean isCustomAmount;

  public static final String SERIALIZED_NAME_IS_ONE_TIME = "is_one_time";
  @SerializedName(SERIALIZED_NAME_IS_ONE_TIME)
  private Boolean isOneTime;

  public static final String SERIALIZED_NAME_MONTHLY_PRICE_IN_CENTS = "monthly_price_in_cents";
  @SerializedName(SERIALIZED_NAME_MONTHLY_PRICE_IN_CENTS)
  private Integer monthlyPriceInCents;

  public static final String SERIALIZED_NAME_MONTHLY_PRICE_IN_DOLLARS = "monthly_price_in_dollars";
  @SerializedName(SERIALIZED_NAME_MONTHLY_PRICE_IN_DOLLARS)
  private Integer monthlyPriceInDollars;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public SponsorshipTier() {
  }

  public SponsorshipTier createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public SponsorshipTier description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SponsorshipTier isCustomAmmount(Boolean isCustomAmmount) {
    
    this.isCustomAmmount = isCustomAmmount;
    return this;
  }

   /**
   * Get isCustomAmmount
   * @return isCustomAmmount
  **/
  @javax.annotation.Nullable

  public Boolean getIsCustomAmmount() {
    return isCustomAmmount;
  }


  public void setIsCustomAmmount(Boolean isCustomAmmount) {
    this.isCustomAmmount = isCustomAmmount;
  }


  public SponsorshipTier isCustomAmount(Boolean isCustomAmount) {
    
    this.isCustomAmount = isCustomAmount;
    return this;
  }

   /**
   * Get isCustomAmount
   * @return isCustomAmount
  **/
  @javax.annotation.Nullable

  public Boolean getIsCustomAmount() {
    return isCustomAmount;
  }


  public void setIsCustomAmount(Boolean isCustomAmount) {
    this.isCustomAmount = isCustomAmount;
  }


  public SponsorshipTier isOneTime(Boolean isOneTime) {
    
    this.isOneTime = isOneTime;
    return this;
  }

   /**
   * Get isOneTime
   * @return isOneTime
  **/
  @javax.annotation.Nonnull

  public Boolean getIsOneTime() {
    return isOneTime;
  }


  public void setIsOneTime(Boolean isOneTime) {
    this.isOneTime = isOneTime;
  }


  public SponsorshipTier monthlyPriceInCents(Integer monthlyPriceInCents) {
    
    this.monthlyPriceInCents = monthlyPriceInCents;
    return this;
  }

   /**
   * Get monthlyPriceInCents
   * @return monthlyPriceInCents
  **/
  @javax.annotation.Nonnull

  public Integer getMonthlyPriceInCents() {
    return monthlyPriceInCents;
  }


  public void setMonthlyPriceInCents(Integer monthlyPriceInCents) {
    this.monthlyPriceInCents = monthlyPriceInCents;
  }


  public SponsorshipTier monthlyPriceInDollars(Integer monthlyPriceInDollars) {
    
    this.monthlyPriceInDollars = monthlyPriceInDollars;
    return this;
  }

   /**
   * Get monthlyPriceInDollars
   * @return monthlyPriceInDollars
  **/
  @javax.annotation.Nonnull

  public Integer getMonthlyPriceInDollars() {
    return monthlyPriceInDollars;
  }


  public void setMonthlyPriceInDollars(Integer monthlyPriceInDollars) {
    this.monthlyPriceInDollars = monthlyPriceInDollars;
  }


  public SponsorshipTier name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SponsorshipTier nodeId(String nodeId) {
    
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @javax.annotation.Nonnull

  public String getNodeId() {
    return nodeId;
  }


  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SponsorshipTier sponsorshipTier = (SponsorshipTier) o;
    return Objects.equals(this.createdAt, sponsorshipTier.createdAt) &&
        Objects.equals(this.description, sponsorshipTier.description) &&
        Objects.equals(this.isCustomAmmount, sponsorshipTier.isCustomAmmount) &&
        Objects.equals(this.isCustomAmount, sponsorshipTier.isCustomAmount) &&
        Objects.equals(this.isOneTime, sponsorshipTier.isOneTime) &&
        Objects.equals(this.monthlyPriceInCents, sponsorshipTier.monthlyPriceInCents) &&
        Objects.equals(this.monthlyPriceInDollars, sponsorshipTier.monthlyPriceInDollars) &&
        Objects.equals(this.name, sponsorshipTier.name) &&
        Objects.equals(this.nodeId, sponsorshipTier.nodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, isCustomAmmount, isCustomAmount, isOneTime, monthlyPriceInCents, monthlyPriceInDollars, name, nodeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SponsorshipTier {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isCustomAmmount: ").append(toIndentedString(isCustomAmmount)).append("\n");
    sb.append("    isCustomAmount: ").append(toIndentedString(isCustomAmount)).append("\n");
    sb.append("    isOneTime: ").append(toIndentedString(isOneTime)).append("\n");
    sb.append("    monthlyPriceInCents: ").append(toIndentedString(monthlyPriceInCents)).append("\n");
    sb.append("    monthlyPriceInDollars: ").append(toIndentedString(monthlyPriceInDollars)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("is_custom_ammount");
    openapiFields.add("is_custom_amount");
    openapiFields.add("is_one_time");
    openapiFields.add("monthly_price_in_cents");
    openapiFields.add("monthly_price_in_dollars");
    openapiFields.add("name");
    openapiFields.add("node_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("is_one_time");
    openapiRequiredFields.add("monthly_price_in_cents");
    openapiRequiredFields.add("monthly_price_in_dollars");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("node_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SponsorshipTier
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SponsorshipTier.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SponsorshipTier is not found in the empty JSON string", SponsorshipTier.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SponsorshipTier.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SponsorshipTier` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SponsorshipTier.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SponsorshipTier.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SponsorshipTier' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SponsorshipTier> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SponsorshipTier.class));

       return (TypeAdapter<T>) new TypeAdapter<SponsorshipTier>() {
           @Override
           public void write(JsonWriter out, SponsorshipTier value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SponsorshipTier read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SponsorshipTier given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SponsorshipTier
  * @throws IOException if the JSON string is invalid with respect to SponsorshipTier
  */
  public static SponsorshipTier fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SponsorshipTier.class);
  }

 /**
  * Convert an instance of SponsorshipTier to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

