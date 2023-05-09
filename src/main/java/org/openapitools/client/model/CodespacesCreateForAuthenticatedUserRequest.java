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
import org.openapitools.client.model.CodespacesCreateForAuthenticatedUserRequestOneOf;
import org.openapitools.client.model.CodespacesCreateForAuthenticatedUserRequestOneOf1;
import org.openapitools.client.model.CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest;

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
public class CodespacesCreateForAuthenticatedUserRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CodespacesCreateForAuthenticatedUserRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CodespacesCreateForAuthenticatedUserRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CodespacesCreateForAuthenticatedUserRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CodespacesCreateForAuthenticatedUserRequestOneOf> adapterCodespacesCreateForAuthenticatedUserRequestOneOf = gson.getDelegateAdapter(this, TypeToken.get(CodespacesCreateForAuthenticatedUserRequestOneOf.class));
            final TypeAdapter<CodespacesCreateForAuthenticatedUserRequestOneOf1> adapterCodespacesCreateForAuthenticatedUserRequestOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(CodespacesCreateForAuthenticatedUserRequestOneOf1.class));

            return (TypeAdapter<T>) new TypeAdapter<CodespacesCreateForAuthenticatedUserRequest>() {
                @Override
                public void write(JsonWriter out, CodespacesCreateForAuthenticatedUserRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CodespacesCreateForAuthenticatedUserRequestOneOf`
                    if (value.getActualInstance() instanceof CodespacesCreateForAuthenticatedUserRequestOneOf) {
                        JsonObject obj = adapterCodespacesCreateForAuthenticatedUserRequestOneOf.toJsonTree((CodespacesCreateForAuthenticatedUserRequestOneOf)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `CodespacesCreateForAuthenticatedUserRequestOneOf1`
                    if (value.getActualInstance() instanceof CodespacesCreateForAuthenticatedUserRequestOneOf1) {
                        JsonObject obj = adapterCodespacesCreateForAuthenticatedUserRequestOneOf1.toJsonTree((CodespacesCreateForAuthenticatedUserRequestOneOf1)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CodespacesCreateForAuthenticatedUserRequestOneOf, CodespacesCreateForAuthenticatedUserRequestOneOf1");
                }

                @Override
                public CodespacesCreateForAuthenticatedUserRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CodespacesCreateForAuthenticatedUserRequestOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CodespacesCreateForAuthenticatedUserRequestOneOf.validateJsonObject(jsonObject);
                        actualAdapter = adapterCodespacesCreateForAuthenticatedUserRequestOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CodespacesCreateForAuthenticatedUserRequestOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CodespacesCreateForAuthenticatedUserRequestOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CodespacesCreateForAuthenticatedUserRequestOneOf'", e);
                    }

                    // deserialize CodespacesCreateForAuthenticatedUserRequestOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CodespacesCreateForAuthenticatedUserRequestOneOf1.validateJsonObject(jsonObject);
                        actualAdapter = adapterCodespacesCreateForAuthenticatedUserRequestOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CodespacesCreateForAuthenticatedUserRequestOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CodespacesCreateForAuthenticatedUserRequestOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CodespacesCreateForAuthenticatedUserRequestOneOf1'", e);
                    }

                    if (match == 1) {
                        CodespacesCreateForAuthenticatedUserRequest ret = new CodespacesCreateForAuthenticatedUserRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CodespacesCreateForAuthenticatedUserRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CodespacesCreateForAuthenticatedUserRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public CodespacesCreateForAuthenticatedUserRequest(CodespacesCreateForAuthenticatedUserRequestOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CodespacesCreateForAuthenticatedUserRequest(CodespacesCreateForAuthenticatedUserRequestOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CodespacesCreateForAuthenticatedUserRequestOneOf", new GenericType<CodespacesCreateForAuthenticatedUserRequestOneOf>() {
        });
        schemas.put("CodespacesCreateForAuthenticatedUserRequestOneOf1", new GenericType<CodespacesCreateForAuthenticatedUserRequestOneOf1>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CodespacesCreateForAuthenticatedUserRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CodespacesCreateForAuthenticatedUserRequestOneOf, CodespacesCreateForAuthenticatedUserRequestOneOf1
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CodespacesCreateForAuthenticatedUserRequestOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CodespacesCreateForAuthenticatedUserRequestOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CodespacesCreateForAuthenticatedUserRequestOneOf, CodespacesCreateForAuthenticatedUserRequestOneOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * CodespacesCreateForAuthenticatedUserRequestOneOf, CodespacesCreateForAuthenticatedUserRequestOneOf1
     *
     * @return The actual instance (CodespacesCreateForAuthenticatedUserRequestOneOf, CodespacesCreateForAuthenticatedUserRequestOneOf1)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CodespacesCreateForAuthenticatedUserRequestOneOf`. If the actual instance is not `CodespacesCreateForAuthenticatedUserRequestOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CodespacesCreateForAuthenticatedUserRequestOneOf`
     * @throws ClassCastException if the instance is not `CodespacesCreateForAuthenticatedUserRequestOneOf`
     */
    public CodespacesCreateForAuthenticatedUserRequestOneOf getCodespacesCreateForAuthenticatedUserRequestOneOf() throws ClassCastException {
        return (CodespacesCreateForAuthenticatedUserRequestOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CodespacesCreateForAuthenticatedUserRequestOneOf1`. If the actual instance is not `CodespacesCreateForAuthenticatedUserRequestOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CodespacesCreateForAuthenticatedUserRequestOneOf1`
     * @throws ClassCastException if the instance is not `CodespacesCreateForAuthenticatedUserRequestOneOf1`
     */
    public CodespacesCreateForAuthenticatedUserRequestOneOf1 getCodespacesCreateForAuthenticatedUserRequestOneOf1() throws ClassCastException {
        return (CodespacesCreateForAuthenticatedUserRequestOneOf1)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CodespacesCreateForAuthenticatedUserRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CodespacesCreateForAuthenticatedUserRequestOneOf
    try {
      CodespacesCreateForAuthenticatedUserRequestOneOf.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CodespacesCreateForAuthenticatedUserRequestOneOf failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CodespacesCreateForAuthenticatedUserRequestOneOf1
    try {
      CodespacesCreateForAuthenticatedUserRequestOneOf1.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CodespacesCreateForAuthenticatedUserRequestOneOf1 failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for CodespacesCreateForAuthenticatedUserRequest with oneOf schemas: CodespacesCreateForAuthenticatedUserRequestOneOf, CodespacesCreateForAuthenticatedUserRequestOneOf1. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of CodespacesCreateForAuthenticatedUserRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CodespacesCreateForAuthenticatedUserRequest
  * @throws IOException if the JSON string is invalid with respect to CodespacesCreateForAuthenticatedUserRequest
  */
  public static CodespacesCreateForAuthenticatedUserRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CodespacesCreateForAuthenticatedUserRequest.class);
  }

 /**
  * Convert an instance of CodespacesCreateForAuthenticatedUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
