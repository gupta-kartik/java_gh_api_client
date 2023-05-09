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
import org.openapitools.client.model.EnvironmentProtectionRulesInnerAnyOf;
import org.openapitools.client.model.EnvironmentProtectionRulesInnerAnyOf1;
import org.openapitools.client.model.EnvironmentProtectionRulesInnerAnyOf2;
import org.openapitools.client.model.PendingDeploymentReviewersInner;

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
public class EnvironmentProtectionRulesInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(EnvironmentProtectionRulesInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EnvironmentProtectionRulesInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EnvironmentProtectionRulesInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EnvironmentProtectionRulesInnerAnyOf> adapterEnvironmentProtectionRulesInnerAnyOf = gson.getDelegateAdapter(this, TypeToken.get(EnvironmentProtectionRulesInnerAnyOf.class));
            final TypeAdapter<EnvironmentProtectionRulesInnerAnyOf1> adapterEnvironmentProtectionRulesInnerAnyOf1 = gson.getDelegateAdapter(this, TypeToken.get(EnvironmentProtectionRulesInnerAnyOf1.class));
            final TypeAdapter<EnvironmentProtectionRulesInnerAnyOf2> adapterEnvironmentProtectionRulesInnerAnyOf2 = gson.getDelegateAdapter(this, TypeToken.get(EnvironmentProtectionRulesInnerAnyOf2.class));

            return (TypeAdapter<T>) new TypeAdapter<EnvironmentProtectionRulesInner>() {
                @Override
                public void write(JsonWriter out, EnvironmentProtectionRulesInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `EnvironmentProtectionRulesInnerAnyOf`
                    if (value.getActualInstance() instanceof EnvironmentProtectionRulesInnerAnyOf) {
                        JsonObject obj = adapterEnvironmentProtectionRulesInnerAnyOf.toJsonTree((EnvironmentProtectionRulesInnerAnyOf)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `EnvironmentProtectionRulesInnerAnyOf1`
                    if (value.getActualInstance() instanceof EnvironmentProtectionRulesInnerAnyOf1) {
                        JsonObject obj = adapterEnvironmentProtectionRulesInnerAnyOf1.toJsonTree((EnvironmentProtectionRulesInnerAnyOf1)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `EnvironmentProtectionRulesInnerAnyOf2`
                    if (value.getActualInstance() instanceof EnvironmentProtectionRulesInnerAnyOf2) {
                        JsonObject obj = adapterEnvironmentProtectionRulesInnerAnyOf2.toJsonTree((EnvironmentProtectionRulesInnerAnyOf2)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: EnvironmentProtectionRulesInnerAnyOf, EnvironmentProtectionRulesInnerAnyOf1, EnvironmentProtectionRulesInnerAnyOf2");
                }

                @Override
                public EnvironmentProtectionRulesInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize EnvironmentProtectionRulesInnerAnyOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EnvironmentProtectionRulesInnerAnyOf.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'EnvironmentProtectionRulesInnerAnyOf'");
                        EnvironmentProtectionRulesInner ret = new EnvironmentProtectionRulesInner();
                        ret.setActualInstance(adapterEnvironmentProtectionRulesInnerAnyOf.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'EnvironmentProtectionRulesInnerAnyOf'", e);
                    }

                    // deserialize EnvironmentProtectionRulesInnerAnyOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EnvironmentProtectionRulesInnerAnyOf1.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'EnvironmentProtectionRulesInnerAnyOf1'");
                        EnvironmentProtectionRulesInner ret = new EnvironmentProtectionRulesInner();
                        ret.setActualInstance(adapterEnvironmentProtectionRulesInnerAnyOf1.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'EnvironmentProtectionRulesInnerAnyOf1'", e);
                    }

                    // deserialize EnvironmentProtectionRulesInnerAnyOf2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EnvironmentProtectionRulesInnerAnyOf2.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'EnvironmentProtectionRulesInnerAnyOf2'");
                        EnvironmentProtectionRulesInner ret = new EnvironmentProtectionRulesInner();
                        ret.setActualInstance(adapterEnvironmentProtectionRulesInnerAnyOf2.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'EnvironmentProtectionRulesInnerAnyOf2'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for EnvironmentProtectionRulesInner: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public EnvironmentProtectionRulesInner() {
        super("anyOf", Boolean.FALSE);
    }

    public EnvironmentProtectionRulesInner(EnvironmentProtectionRulesInnerAnyOf o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EnvironmentProtectionRulesInner(EnvironmentProtectionRulesInnerAnyOf1 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EnvironmentProtectionRulesInner(EnvironmentProtectionRulesInnerAnyOf2 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("EnvironmentProtectionRulesInnerAnyOf", new GenericType<EnvironmentProtectionRulesInnerAnyOf>() {
        });
        schemas.put("EnvironmentProtectionRulesInnerAnyOf1", new GenericType<EnvironmentProtectionRulesInnerAnyOf1>() {
        });
        schemas.put("EnvironmentProtectionRulesInnerAnyOf2", new GenericType<EnvironmentProtectionRulesInnerAnyOf2>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return EnvironmentProtectionRulesInner.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * EnvironmentProtectionRulesInnerAnyOf, EnvironmentProtectionRulesInnerAnyOf1, EnvironmentProtectionRulesInnerAnyOf2
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof EnvironmentProtectionRulesInnerAnyOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EnvironmentProtectionRulesInnerAnyOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EnvironmentProtectionRulesInnerAnyOf2) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be EnvironmentProtectionRulesInnerAnyOf, EnvironmentProtectionRulesInnerAnyOf1, EnvironmentProtectionRulesInnerAnyOf2");
    }

    /**
     * Get the actual instance, which can be the following:
     * EnvironmentProtectionRulesInnerAnyOf, EnvironmentProtectionRulesInnerAnyOf1, EnvironmentProtectionRulesInnerAnyOf2
     *
     * @return The actual instance (EnvironmentProtectionRulesInnerAnyOf, EnvironmentProtectionRulesInnerAnyOf1, EnvironmentProtectionRulesInnerAnyOf2)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `EnvironmentProtectionRulesInnerAnyOf`. If the actual instance is not `EnvironmentProtectionRulesInnerAnyOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EnvironmentProtectionRulesInnerAnyOf`
     * @throws ClassCastException if the instance is not `EnvironmentProtectionRulesInnerAnyOf`
     */
    public EnvironmentProtectionRulesInnerAnyOf getEnvironmentProtectionRulesInnerAnyOf() throws ClassCastException {
        return (EnvironmentProtectionRulesInnerAnyOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EnvironmentProtectionRulesInnerAnyOf1`. If the actual instance is not `EnvironmentProtectionRulesInnerAnyOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EnvironmentProtectionRulesInnerAnyOf1`
     * @throws ClassCastException if the instance is not `EnvironmentProtectionRulesInnerAnyOf1`
     */
    public EnvironmentProtectionRulesInnerAnyOf1 getEnvironmentProtectionRulesInnerAnyOf1() throws ClassCastException {
        return (EnvironmentProtectionRulesInnerAnyOf1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EnvironmentProtectionRulesInnerAnyOf2`. If the actual instance is not `EnvironmentProtectionRulesInnerAnyOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EnvironmentProtectionRulesInnerAnyOf2`
     * @throws ClassCastException if the instance is not `EnvironmentProtectionRulesInnerAnyOf2`
     */
    public EnvironmentProtectionRulesInnerAnyOf2 getEnvironmentProtectionRulesInnerAnyOf2() throws ClassCastException {
        return (EnvironmentProtectionRulesInnerAnyOf2)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EnvironmentProtectionRulesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with EnvironmentProtectionRulesInnerAnyOf
    try {
      EnvironmentProtectionRulesInnerAnyOf.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with EnvironmentProtectionRulesInnerAnyOf1
    try {
      EnvironmentProtectionRulesInnerAnyOf1.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with EnvironmentProtectionRulesInnerAnyOf2
    try {
      EnvironmentProtectionRulesInnerAnyOf2.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for EnvironmentProtectionRulesInner with anyOf schemas: EnvironmentProtectionRulesInnerAnyOf, EnvironmentProtectionRulesInnerAnyOf1, EnvironmentProtectionRulesInnerAnyOf2. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of EnvironmentProtectionRulesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnvironmentProtectionRulesInner
  * @throws IOException if the JSON string is invalid with respect to EnvironmentProtectionRulesInner
  */
  public static EnvironmentProtectionRulesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnvironmentProtectionRulesInner.class);
  }

 /**
  * Convert an instance of EnvironmentProtectionRulesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
