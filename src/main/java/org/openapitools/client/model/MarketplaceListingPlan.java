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
 * Marketplace Listing Plan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class MarketplaceListingPlan {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_ACCOUNTS_URL = "accounts_url";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS_URL)
  private URI accountsUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MONTHLY_PRICE_IN_CENTS = "monthly_price_in_cents";
  @SerializedName(SERIALIZED_NAME_MONTHLY_PRICE_IN_CENTS)
  private Integer monthlyPriceInCents;

  public static final String SERIALIZED_NAME_YEARLY_PRICE_IN_CENTS = "yearly_price_in_cents";
  @SerializedName(SERIALIZED_NAME_YEARLY_PRICE_IN_CENTS)
  private Integer yearlyPriceInCents;

  /**
   * Gets or Sets priceModel
   */
  @JsonAdapter(PriceModelEnum.Adapter.class)
  public enum PriceModelEnum {
    FREE("FREE"),
    
    FLAT_RATE("FLAT_RATE"),
    
    PER_UNIT("PER_UNIT");

    private String value;

    PriceModelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PriceModelEnum fromValue(String value) {
      for (PriceModelEnum b : PriceModelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PriceModelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PriceModelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PriceModelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PriceModelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRICE_MODEL = "price_model";
  @SerializedName(SERIALIZED_NAME_PRICE_MODEL)
  private PriceModelEnum priceModel;

  public static final String SERIALIZED_NAME_HAS_FREE_TRIAL = "has_free_trial";
  @SerializedName(SERIALIZED_NAME_HAS_FREE_TRIAL)
  private Boolean hasFreeTrial;

  public static final String SERIALIZED_NAME_UNIT_NAME = "unit_name";
  @SerializedName(SERIALIZED_NAME_UNIT_NAME)
  private String unitName;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_BULLETS = "bullets";
  @SerializedName(SERIALIZED_NAME_BULLETS)
  private List<String> bullets = new ArrayList<>();

  public MarketplaceListingPlan() {
  }

  public MarketplaceListingPlan url(URI url) {
    
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


  public MarketplaceListingPlan accountsUrl(URI accountsUrl) {
    
    this.accountsUrl = accountsUrl;
    return this;
  }

   /**
   * Get accountsUrl
   * @return accountsUrl
  **/
  @javax.annotation.Nonnull

  public URI getAccountsUrl() {
    return accountsUrl;
  }


  public void setAccountsUrl(URI accountsUrl) {
    this.accountsUrl = accountsUrl;
  }


  public MarketplaceListingPlan id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public MarketplaceListingPlan number(Integer number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nonnull

  public Integer getNumber() {
    return number;
  }


  public void setNumber(Integer number) {
    this.number = number;
  }


  public MarketplaceListingPlan name(String name) {
    
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


  public MarketplaceListingPlan description(String description) {
    
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


  public MarketplaceListingPlan monthlyPriceInCents(Integer monthlyPriceInCents) {
    
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


  public MarketplaceListingPlan yearlyPriceInCents(Integer yearlyPriceInCents) {
    
    this.yearlyPriceInCents = yearlyPriceInCents;
    return this;
  }

   /**
   * Get yearlyPriceInCents
   * @return yearlyPriceInCents
  **/
  @javax.annotation.Nonnull

  public Integer getYearlyPriceInCents() {
    return yearlyPriceInCents;
  }


  public void setYearlyPriceInCents(Integer yearlyPriceInCents) {
    this.yearlyPriceInCents = yearlyPriceInCents;
  }


  public MarketplaceListingPlan priceModel(PriceModelEnum priceModel) {
    
    this.priceModel = priceModel;
    return this;
  }

   /**
   * Get priceModel
   * @return priceModel
  **/
  @javax.annotation.Nonnull

  public PriceModelEnum getPriceModel() {
    return priceModel;
  }


  public void setPriceModel(PriceModelEnum priceModel) {
    this.priceModel = priceModel;
  }


  public MarketplaceListingPlan hasFreeTrial(Boolean hasFreeTrial) {
    
    this.hasFreeTrial = hasFreeTrial;
    return this;
  }

   /**
   * Get hasFreeTrial
   * @return hasFreeTrial
  **/
  @javax.annotation.Nonnull

  public Boolean getHasFreeTrial() {
    return hasFreeTrial;
  }


  public void setHasFreeTrial(Boolean hasFreeTrial) {
    this.hasFreeTrial = hasFreeTrial;
  }


  public MarketplaceListingPlan unitName(String unitName) {
    
    this.unitName = unitName;
    return this;
  }

   /**
   * Get unitName
   * @return unitName
  **/
  @javax.annotation.Nullable

  public String getUnitName() {
    return unitName;
  }


  public void setUnitName(String unitName) {
    this.unitName = unitName;
  }


  public MarketplaceListingPlan state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public MarketplaceListingPlan bullets(List<String> bullets) {
    
    this.bullets = bullets;
    return this;
  }

  public MarketplaceListingPlan addBulletsItem(String bulletsItem) {
    if (this.bullets == null) {
      this.bullets = new ArrayList<>();
    }
    this.bullets.add(bulletsItem);
    return this;
  }

   /**
   * Get bullets
   * @return bullets
  **/
  @javax.annotation.Nonnull

  public List<String> getBullets() {
    return bullets;
  }


  public void setBullets(List<String> bullets) {
    this.bullets = bullets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketplaceListingPlan marketplaceListingPlan = (MarketplaceListingPlan) o;
    return Objects.equals(this.url, marketplaceListingPlan.url) &&
        Objects.equals(this.accountsUrl, marketplaceListingPlan.accountsUrl) &&
        Objects.equals(this.id, marketplaceListingPlan.id) &&
        Objects.equals(this.number, marketplaceListingPlan.number) &&
        Objects.equals(this.name, marketplaceListingPlan.name) &&
        Objects.equals(this.description, marketplaceListingPlan.description) &&
        Objects.equals(this.monthlyPriceInCents, marketplaceListingPlan.monthlyPriceInCents) &&
        Objects.equals(this.yearlyPriceInCents, marketplaceListingPlan.yearlyPriceInCents) &&
        Objects.equals(this.priceModel, marketplaceListingPlan.priceModel) &&
        Objects.equals(this.hasFreeTrial, marketplaceListingPlan.hasFreeTrial) &&
        Objects.equals(this.unitName, marketplaceListingPlan.unitName) &&
        Objects.equals(this.state, marketplaceListingPlan.state) &&
        Objects.equals(this.bullets, marketplaceListingPlan.bullets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, accountsUrl, id, number, name, description, monthlyPriceInCents, yearlyPriceInCents, priceModel, hasFreeTrial, unitName, state, bullets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketplaceListingPlan {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    accountsUrl: ").append(toIndentedString(accountsUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    monthlyPriceInCents: ").append(toIndentedString(monthlyPriceInCents)).append("\n");
    sb.append("    yearlyPriceInCents: ").append(toIndentedString(yearlyPriceInCents)).append("\n");
    sb.append("    priceModel: ").append(toIndentedString(priceModel)).append("\n");
    sb.append("    hasFreeTrial: ").append(toIndentedString(hasFreeTrial)).append("\n");
    sb.append("    unitName: ").append(toIndentedString(unitName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    bullets: ").append(toIndentedString(bullets)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("accounts_url");
    openapiFields.add("id");
    openapiFields.add("number");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("monthly_price_in_cents");
    openapiFields.add("yearly_price_in_cents");
    openapiFields.add("price_model");
    openapiFields.add("has_free_trial");
    openapiFields.add("unit_name");
    openapiFields.add("state");
    openapiFields.add("bullets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("accounts_url");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("monthly_price_in_cents");
    openapiRequiredFields.add("yearly_price_in_cents");
    openapiRequiredFields.add("price_model");
    openapiRequiredFields.add("has_free_trial");
    openapiRequiredFields.add("unit_name");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("bullets");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MarketplaceListingPlan
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MarketplaceListingPlan.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarketplaceListingPlan is not found in the empty JSON string", MarketplaceListingPlan.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MarketplaceListingPlan.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MarketplaceListingPlan` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MarketplaceListingPlan.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("accounts_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accounts_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accounts_url").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("price_model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price_model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price_model").toString()));
      }
      if (!jsonObj.get("unit_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit_name").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("bullets") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("bullets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bullets` to be an array in the JSON string but got `%s`", jsonObj.get("bullets").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarketplaceListingPlan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarketplaceListingPlan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarketplaceListingPlan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarketplaceListingPlan.class));

       return (TypeAdapter<T>) new TypeAdapter<MarketplaceListingPlan>() {
           @Override
           public void write(JsonWriter out, MarketplaceListingPlan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MarketplaceListingPlan read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MarketplaceListingPlan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarketplaceListingPlan
  * @throws IOException if the JSON string is invalid with respect to MarketplaceListingPlan
  */
  public static MarketplaceListingPlan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarketplaceListingPlan.class);
  }

 /**
  * Convert an instance of MarketplaceListingPlan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
