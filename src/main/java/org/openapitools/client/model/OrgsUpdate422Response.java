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
import org.openapitools.client.model.ValidationError;
import org.openapitools.client.model.ValidationErrorSimple;

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
public class OrgsUpdate422Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(OrgsUpdate422Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!OrgsUpdate422Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'OrgsUpdate422Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ValidationError> adapterValidationError = gson.getDelegateAdapter(this, TypeToken.get(ValidationError.class));
            final TypeAdapter<ValidationErrorSimple> adapterValidationErrorSimple = gson.getDelegateAdapter(this, TypeToken.get(ValidationErrorSimple.class));

            return (TypeAdapter<T>) new TypeAdapter<OrgsUpdate422Response>() {
                @Override
                public void write(JsonWriter out, OrgsUpdate422Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ValidationError`
                    if (value.getActualInstance() instanceof ValidationError) {
                        JsonObject obj = adapterValidationError.toJsonTree((ValidationError)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ValidationErrorSimple`
                    if (value.getActualInstance() instanceof ValidationErrorSimple) {
                        JsonObject obj = adapterValidationErrorSimple.toJsonTree((ValidationErrorSimple)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ValidationError, ValidationErrorSimple");
                }

                @Override
                public OrgsUpdate422Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ValidationError
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ValidationError.validateJsonObject(jsonObject);
                        actualAdapter = adapterValidationError;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ValidationError'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ValidationError failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ValidationError'", e);
                    }

                    // deserialize ValidationErrorSimple
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ValidationErrorSimple.validateJsonObject(jsonObject);
                        actualAdapter = adapterValidationErrorSimple;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ValidationErrorSimple'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ValidationErrorSimple failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ValidationErrorSimple'", e);
                    }

                    if (match == 1) {
                        OrgsUpdate422Response ret = new OrgsUpdate422Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for OrgsUpdate422Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public OrgsUpdate422Response() {
        super("oneOf", Boolean.FALSE);
    }

    public OrgsUpdate422Response(ValidationError o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public OrgsUpdate422Response(ValidationErrorSimple o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ValidationError", new GenericType<ValidationError>() {
        });
        schemas.put("ValidationErrorSimple", new GenericType<ValidationErrorSimple>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return OrgsUpdate422Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ValidationError, ValidationErrorSimple
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ValidationError) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ValidationErrorSimple) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ValidationError, ValidationErrorSimple");
    }

    /**
     * Get the actual instance, which can be the following:
     * ValidationError, ValidationErrorSimple
     *
     * @return The actual instance (ValidationError, ValidationErrorSimple)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ValidationError`. If the actual instance is not `ValidationError`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ValidationError`
     * @throws ClassCastException if the instance is not `ValidationError`
     */
    public ValidationError getValidationError() throws ClassCastException {
        return (ValidationError)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ValidationErrorSimple`. If the actual instance is not `ValidationErrorSimple`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ValidationErrorSimple`
     * @throws ClassCastException if the instance is not `ValidationErrorSimple`
     */
    public ValidationErrorSimple getValidationErrorSimple() throws ClassCastException {
        return (ValidationErrorSimple)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrgsUpdate422Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ValidationError
    try {
      ValidationError.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ValidationError failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ValidationErrorSimple
    try {
      ValidationErrorSimple.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ValidationErrorSimple failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for OrgsUpdate422Response with oneOf schemas: ValidationError, ValidationErrorSimple. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of OrgsUpdate422Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrgsUpdate422Response
  * @throws IOException if the JSON string is invalid with respect to OrgsUpdate422Response
  */
  public static OrgsUpdate422Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrgsUpdate422Response.class);
  }

 /**
  * Convert an instance of OrgsUpdate422Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

