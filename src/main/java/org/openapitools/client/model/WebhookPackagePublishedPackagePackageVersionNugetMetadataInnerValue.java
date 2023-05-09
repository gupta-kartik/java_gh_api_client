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
import org.openapitools.client.model.WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Boolean> adapterBoolean = gson.getDelegateAdapter(this, TypeToken.get(Boolean.class));
            final TypeAdapter<Integer> adapterInteger = gson.getDelegateAdapter(this, TypeToken.get(Integer.class));
            final TypeAdapter<String> adapterString = gson.getDelegateAdapter(this, TypeToken.get(String.class));
            final TypeAdapter<WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf> adapterWebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf = gson.getDelegateAdapter(this, TypeToken.get(WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf.class));

            return (TypeAdapter<T>) new TypeAdapter<WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue>() {
                @Override
                public void write(JsonWriter out, WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Boolean`
                    if (value.getActualInstance() instanceof Boolean) {
                        JsonObject obj = adapterBoolean.toJsonTree((Boolean)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `Integer`
                    if (value.getActualInstance() instanceof Integer) {
                        JsonObject obj = adapterInteger.toJsonTree((Integer)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `String`
                    if (value.getActualInstance() instanceof String) {
                        JsonObject obj = adapterString.toJsonTree((String)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf`
                    if (value.getActualInstance() instanceof WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf) {
                        JsonObject obj = adapterWebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf.toJsonTree((WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Boolean, Integer, String, WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf");
                }

                @Override
                public WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Boolean
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Boolean.validateJsonObject(jsonObject);
                        actualAdapter = adapterBoolean;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Boolean'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Boolean failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Boolean'", e);
                    }

                    // deserialize Integer
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Integer.validateJsonObject(jsonObject);
                        actualAdapter = adapterInteger;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Integer'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Integer failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Integer'", e);
                    }

                    // deserialize String
                    try {
                        // validate the JSON object to see if any exception is thrown
                        String.validateJsonObject(jsonObject);
                        actualAdapter = adapterString;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'String'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'String'", e);
                    }

                    // deserialize WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf.validateJsonObject(jsonObject);
                        actualAdapter = adapterWebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf'", e);
                    }

                    if (match == 1) {
                        WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue ret = new WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue() {
        super("oneOf", Boolean.FALSE);
    }

    public WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue(Boolean o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue(Integer o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue(WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Boolean", new GenericType<Boolean>() {
        });
        schemas.put("Integer", new GenericType<Integer>() {
        });
        schemas.put("String", new GenericType<String>() {
        });
        schemas.put("WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf", new GenericType<WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Boolean, Integer, String, WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Boolean) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Integer) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Boolean, Integer, String, WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf");
    }

    /**
     * Get the actual instance, which can be the following:
     * Boolean, Integer, String, WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf
     *
     * @return The actual instance (Boolean, Integer, String, WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Boolean`. If the actual instance is not `Boolean`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Boolean`
     * @throws ClassCastException if the instance is not `Boolean`
     */
    public Boolean getBoolean() throws ClassCastException {
        return (Boolean)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Integer`. If the actual instance is not `Integer`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Integer`
     * @throws ClassCastException if the instance is not `Integer`
     */
    public Integer getInteger() throws ClassCastException {
        return (Integer)super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf`. If the actual instance is not `WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf`
     * @throws ClassCastException if the instance is not `WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf`
     */
    public WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf getWebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf() throws ClassCastException {
        return (WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with Boolean
    try {
      Boolean.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for Boolean failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with Integer
    try {
      Integer.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for Integer failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with String
    try {
      String.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf
    try {
      WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue with oneOf schemas: Boolean, Integer, String, WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValueOneOf. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue
  * @throws IOException if the JSON string is invalid with respect to WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue
  */
  public static WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue.class);
  }

 /**
  * Convert an instance of WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

