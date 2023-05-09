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
import java.time.OffsetDateTime;
import org.openapitools.client.model.Enterprise;
import org.openapitools.client.model.SimpleUser;
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
public class IntegrationInstallationRequestAccount extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(IntegrationInstallationRequestAccount.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!IntegrationInstallationRequestAccount.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'IntegrationInstallationRequestAccount' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Enterprise> adapterEnterprise = gson.getDelegateAdapter(this, TypeToken.get(Enterprise.class));
            final TypeAdapter<SimpleUser> adapterSimpleUser = gson.getDelegateAdapter(this, TypeToken.get(SimpleUser.class));

            return (TypeAdapter<T>) new TypeAdapter<IntegrationInstallationRequestAccount>() {
                @Override
                public void write(JsonWriter out, IntegrationInstallationRequestAccount value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Enterprise`
                    if (value.getActualInstance() instanceof Enterprise) {
                        JsonObject obj = adapterEnterprise.toJsonTree((Enterprise)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SimpleUser`
                    if (value.getActualInstance() instanceof SimpleUser) {
                        JsonObject obj = adapterSimpleUser.toJsonTree((SimpleUser)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: Enterprise, SimpleUser");
                }

                @Override
                public IntegrationInstallationRequestAccount read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize Enterprise
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Enterprise.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'Enterprise'");
                        IntegrationInstallationRequestAccount ret = new IntegrationInstallationRequestAccount();
                        ret.setActualInstance(adapterEnterprise.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'Enterprise'", e);
                    }

                    // deserialize SimpleUser
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SimpleUser.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'SimpleUser'");
                        IntegrationInstallationRequestAccount ret = new IntegrationInstallationRequestAccount();
                        ret.setActualInstance(adapterSimpleUser.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SimpleUser'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for IntegrationInstallationRequestAccount: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public IntegrationInstallationRequestAccount() {
        super("anyOf", Boolean.FALSE);
    }

    public IntegrationInstallationRequestAccount(Enterprise o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public IntegrationInstallationRequestAccount(SimpleUser o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Enterprise", new GenericType<Enterprise>() {
        });
        schemas.put("SimpleUser", new GenericType<SimpleUser>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return IntegrationInstallationRequestAccount.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * Enterprise, SimpleUser
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Enterprise) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SimpleUser) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Enterprise, SimpleUser");
    }

    /**
     * Get the actual instance, which can be the following:
     * Enterprise, SimpleUser
     *
     * @return The actual instance (Enterprise, SimpleUser)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Enterprise`. If the actual instance is not `Enterprise`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Enterprise`
     * @throws ClassCastException if the instance is not `Enterprise`
     */
    public Enterprise getEnterprise() throws ClassCastException {
        return (Enterprise)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SimpleUser`. If the actual instance is not `SimpleUser`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SimpleUser`
     * @throws ClassCastException if the instance is not `SimpleUser`
     */
    public SimpleUser getSimpleUser() throws ClassCastException {
        return (SimpleUser)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IntegrationInstallationRequestAccount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with Enterprise
    try {
      Enterprise.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with SimpleUser
    try {
      SimpleUser.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for IntegrationInstallationRequestAccount with anyOf schemas: Enterprise, SimpleUser. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of IntegrationInstallationRequestAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntegrationInstallationRequestAccount
  * @throws IOException if the JSON string is invalid with respect to IntegrationInstallationRequestAccount
  */
  public static IntegrationInstallationRequestAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntegrationInstallationRequestAccount.class);
  }

 /**
  * Convert an instance of IntegrationInstallationRequestAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

