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
import org.openapitools.client.model.ReposSetUserAccessRestrictionsRequestOneOf;

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
public class ReposSetUserAccessRestrictionsRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ReposSetUserAccessRestrictionsRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ReposSetUserAccessRestrictionsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ReposSetUserAccessRestrictionsRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<List&lt;String&gt;> adapterList&lt;String&gt; = gson.getDelegateAdapter(this, TypeToken.get(List&lt;String&gt;.class));
            final TypeAdapter<ReposSetUserAccessRestrictionsRequestOneOf> adapterReposSetUserAccessRestrictionsRequestOneOf = gson.getDelegateAdapter(this, TypeToken.get(ReposSetUserAccessRestrictionsRequestOneOf.class));

            return (TypeAdapter<T>) new TypeAdapter<ReposSetUserAccessRestrictionsRequest>() {
                @Override
                public void write(JsonWriter out, ReposSetUserAccessRestrictionsRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `List&lt;String&gt;`
                    if (value.getActualInstance() instanceof List&lt;String&gt;) {
                        JsonObject obj = adapterList&lt;String&gt;.toJsonTree((List&lt;String&gt;)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ReposSetUserAccessRestrictionsRequestOneOf`
                    if (value.getActualInstance() instanceof ReposSetUserAccessRestrictionsRequestOneOf) {
                        JsonObject obj = adapterReposSetUserAccessRestrictionsRequestOneOf.toJsonTree((ReposSetUserAccessRestrictionsRequestOneOf)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: List<String>, ReposSetUserAccessRestrictionsRequestOneOf");
                }

                @Override
                public ReposSetUserAccessRestrictionsRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize List<String>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        List&lt;String&gt;.validateJsonObject(jsonObject);
                        actualAdapter = adapterList&lt;String&gt;;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'List<String>'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for List<String> failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'List<String>'", e);
                    }

                    // deserialize ReposSetUserAccessRestrictionsRequestOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ReposSetUserAccessRestrictionsRequestOneOf.validateJsonObject(jsonObject);
                        actualAdapter = adapterReposSetUserAccessRestrictionsRequestOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ReposSetUserAccessRestrictionsRequestOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ReposSetUserAccessRestrictionsRequestOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ReposSetUserAccessRestrictionsRequestOneOf'", e);
                    }

                    if (match == 1) {
                        ReposSetUserAccessRestrictionsRequest ret = new ReposSetUserAccessRestrictionsRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ReposSetUserAccessRestrictionsRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ReposSetUserAccessRestrictionsRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public ReposSetUserAccessRestrictionsRequest(List<String> o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ReposSetUserAccessRestrictionsRequest(ReposSetUserAccessRestrictionsRequestOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<String>", new GenericType<List<String>>() {
        });
        schemas.put("ReposSetUserAccessRestrictionsRequestOneOf", new GenericType<ReposSetUserAccessRestrictionsRequestOneOf>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ReposSetUserAccessRestrictionsRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * List<String>, ReposSetUserAccessRestrictionsRequestOneOf
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof List<String>) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ReposSetUserAccessRestrictionsRequestOneOf) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be List<String>, ReposSetUserAccessRestrictionsRequestOneOf");
    }

    /**
     * Get the actual instance, which can be the following:
     * List<String>, ReposSetUserAccessRestrictionsRequestOneOf
     *
     * @return The actual instance (List<String>, ReposSetUserAccessRestrictionsRequestOneOf)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<String>`. If the actual instance is not `List<String>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<String>`
     * @throws ClassCastException if the instance is not `List<String>`
     */
    public List<String> getList<String>() throws ClassCastException {
        return (List<String>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ReposSetUserAccessRestrictionsRequestOneOf`. If the actual instance is not `ReposSetUserAccessRestrictionsRequestOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ReposSetUserAccessRestrictionsRequestOneOf`
     * @throws ClassCastException if the instance is not `ReposSetUserAccessRestrictionsRequestOneOf`
     */
    public ReposSetUserAccessRestrictionsRequestOneOf getReposSetUserAccessRestrictionsRequestOneOf() throws ClassCastException {
        return (ReposSetUserAccessRestrictionsRequestOneOf)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReposSetUserAccessRestrictionsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with List<String>
    try {
      List<String>.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for List<String> failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ReposSetUserAccessRestrictionsRequestOneOf
    try {
      ReposSetUserAccessRestrictionsRequestOneOf.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ReposSetUserAccessRestrictionsRequestOneOf failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ReposSetUserAccessRestrictionsRequest with oneOf schemas: List<String>, ReposSetUserAccessRestrictionsRequestOneOf. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ReposSetUserAccessRestrictionsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReposSetUserAccessRestrictionsRequest
  * @throws IOException if the JSON string is invalid with respect to ReposSetUserAccessRestrictionsRequest
  */
  public static ReposSetUserAccessRestrictionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReposSetUserAccessRestrictionsRequest.class);
  }

 /**
  * Convert an instance of ReposSetUserAccessRestrictionsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

