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
 * WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan {
  public static final String SERIALIZED_NAME_BULLETS = "bullets";
  @SerializedName(SERIALIZED_NAME_BULLETS)
  private List<String> bullets;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HAS_FREE_TRIAL = "has_free_trial";
  @SerializedName(SERIALIZED_NAME_HAS_FREE_TRIAL)
  private Boolean hasFreeTrial;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MONTHLY_PRICE_IN_CENTS = "monthly_price_in_cents";
  @SerializedName(SERIALIZED_NAME_MONTHLY_PRICE_IN_CENTS)
  private Integer monthlyPriceInCents;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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

  public static final String SERIALIZED_NAME_UNIT_NAME = "unit_name";
  @SerializedName(SERIALIZED_NAME_UNIT_NAME)
  private String unitName;

  public static final String SERIALIZED_NAME_YEARLY_PRICE_IN_CENTS = "yearly_price_in_cents";
  @SerializedName(SERIALIZED_NAME_YEARLY_PRICE_IN_CENTS)
  private Integer yearlyPriceInCents;

  public WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan() {
  }

  public WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan bullets(List<String> bullets) {
    
    this.bullets = bullets;
    return this;
  }

  public WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan addBulletsItem(String bulletsItem) {
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
  @javax.annotation.Nullable

  public List<String> getBullets() {
    return bullets;
  }


  public void setBullets(List<String> bullets) {
    this.bullets = bullets;
  }


  public WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan hasFreeTrial(Boolean hasFreeTrial) {
    
    this.hasFreeTrial = hasFreeTrial;
    return this;
  }

   /**
   * Get hasFreeTrial
   * @return hasFreeTrial
  **/
  @javax.annotation.Nullable

  public Boolean getHasFreeTrial() {
    return hasFreeTrial;
  }


  public void setHasFreeTrial(Boolean hasFreeTrial) {
    this.hasFreeTrial = hasFreeTrial;
  }


  public WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan monthlyPriceInCents(Integer monthlyPriceInCents) {
    
    this.monthlyPriceInCents = monthlyPriceInCents;
    return this;
  }

   /**
   * Get monthlyPriceInCents
   * @return monthlyPriceInCents
  **/
  @javax.annotation.Nullable

  public Integer getMonthlyPriceInCents() {
    return monthlyPriceInCents;
  }


  public void setMonthlyPriceInCents(Integer monthlyPriceInCents) {
    this.monthlyPriceInCents = monthlyPriceInCents;
  }


  public WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan name(String name) {
    
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


  public WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan priceModel(PriceModelEnum priceModel) {
    
    this.priceModel = priceModel;
    return this;
  }

   /**
   * Get priceModel
   * @return priceModel
  **/
  @javax.annotation.Nullable

  public PriceModelEnum getPriceModel() {
    return priceModel;
  }


  public void setPriceModel(PriceModelEnum priceModel) {
    this.priceModel = priceModel;
  }


  public WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan unitName(String unitName) {
    
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


  public WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan yearlyPriceInCents(Integer yearlyPriceInCents) {
    
    this.yearlyPriceInCents = yearlyPriceInCents;
    return this;
  }

   /**
   * Get yearlyPriceInCents
   * @return yearlyPriceInCents
  **/
  @javax.annotation.Nullable

  public Integer getYearlyPriceInCents() {
    return yearlyPriceInCents;
  }


  public void setYearlyPriceInCents(Integer yearlyPriceInCents) {
    this.yearlyPriceInCents = yearlyPriceInCents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan webhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan = (WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan) o;
    return Objects.equals(this.bullets, webhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan.bullets) &&
        Objects.equals(this.description, webhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan.description) &&
        Objects.equals(this.hasFreeTrial, webhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan.hasFreeTrial) &&
        Objects.equals(this.id, webhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan.id) &&
        Objects.equals(this.monthlyPriceInCents, webhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan.monthlyPriceInCents) &&
        Objects.equals(this.name, webhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan.name) &&
        Objects.equals(this.priceModel, webhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan.priceModel) &&
        Objects.equals(this.unitName, webhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan.unitName) &&
        Objects.equals(this.yearlyPriceInCents, webhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan.yearlyPriceInCents);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bullets, description, hasFreeTrial, id, monthlyPriceInCents, name, priceModel, unitName, yearlyPriceInCents);
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
    sb.append("class WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan {\n");
    sb.append("    bullets: ").append(toIndentedString(bullets)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hasFreeTrial: ").append(toIndentedString(hasFreeTrial)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    monthlyPriceInCents: ").append(toIndentedString(monthlyPriceInCents)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceModel: ").append(toIndentedString(priceModel)).append("\n");
    sb.append("    unitName: ").append(toIndentedString(unitName)).append("\n");
    sb.append("    yearlyPriceInCents: ").append(toIndentedString(yearlyPriceInCents)).append("\n");
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
    openapiFields.add("bullets");
    openapiFields.add("description");
    openapiFields.add("has_free_trial");
    openapiFields.add("id");
    openapiFields.add("monthly_price_in_cents");
    openapiFields.add("name");
    openapiFields.add("price_model");
    openapiFields.add("unit_name");
    openapiFields.add("yearly_price_in_cents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan is not found in the empty JSON string", WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bullets") != null && !jsonObj.get("bullets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bullets` to be an array in the JSON string but got `%s`", jsonObj.get("bullets").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("price_model") != null && !jsonObj.get("price_model").isJsonNull()) && !jsonObj.get("price_model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price_model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price_model").toString()));
      }
      if ((jsonObj.get("unit_name") != null && !jsonObj.get("unit_name").isJsonNull()) && !jsonObj.get("unit_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan>() {
           @Override
           public void write(JsonWriter out, WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan
  * @throws IOException if the JSON string is invalid with respect to WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan
  */
  public static WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan.class);
  }

 /**
  * Convert an instance of WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

