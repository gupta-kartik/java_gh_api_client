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
import org.openapitools.client.model.ReposUpdateInformationAboutPagesSiteRequestSource;
import org.openapitools.jackson.nullable.JsonNullable;

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
public class ReposUpdateInformationAboutPagesSiteRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ReposUpdateInformationAboutPagesSiteRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ReposUpdateInformationAboutPagesSiteRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ReposUpdateInformationAboutPagesSiteRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Object> adapterObject = gson.getDelegateAdapter(this, TypeToken.get(Object.class));

            return (TypeAdapter<T>) new TypeAdapter<ReposUpdateInformationAboutPagesSiteRequest>() {
                @Override
                public void write(JsonWriter out, ReposUpdateInformationAboutPagesSiteRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Object`
                    if (value.getActualInstance() instanceof Object) {
                        JsonObject obj = adapterObject.toJsonTree((Object)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: Object");
                }

                @Override
                public ReposUpdateInformationAboutPagesSiteRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize Object
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Object.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'Object'");
                        ReposUpdateInformationAboutPagesSiteRequest ret = new ReposUpdateInformationAboutPagesSiteRequest();
                        ret.setActualInstance(adapterObject.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'Object'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for ReposUpdateInformationAboutPagesSiteRequest: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ReposUpdateInformationAboutPagesSiteRequest() {
        super("anyOf", Boolean.FALSE);
    }

    public ReposUpdateInformationAboutPagesSiteRequest(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Object", new GenericType<Object>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ReposUpdateInformationAboutPagesSiteRequest.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * Object
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Object) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Object");
    }

    /**
     * Get the actual instance, which can be the following:
     * Object
     *
     * @return The actual instance (Object)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Object`. If the actual instance is not `Object`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Object`
     * @throws ClassCastException if the instance is not `Object`
     */
    public Object getObject() throws ClassCastException {
        return (Object)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReposUpdateInformationAboutPagesSiteRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with Object
    try {
      Object.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for ReposUpdateInformationAboutPagesSiteRequest with anyOf schemas: Object. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ReposUpdateInformationAboutPagesSiteRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReposUpdateInformationAboutPagesSiteRequest
  * @throws IOException if the JSON string is invalid with respect to ReposUpdateInformationAboutPagesSiteRequest
  */
  public static ReposUpdateInformationAboutPagesSiteRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReposUpdateInformationAboutPagesSiteRequest.class);
  }

 /**
  * Convert an instance of ReposUpdateInformationAboutPagesSiteRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

