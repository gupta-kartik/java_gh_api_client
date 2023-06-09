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
import org.openapitools.client.model.PrivateUser;
import org.openapitools.client.model.PublicUser;
import org.openapitools.client.model.PublicUserPlan;
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
public class UsersGetAuthenticated200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UsersGetAuthenticated200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UsersGetAuthenticated200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UsersGetAuthenticated200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PrivateUser> adapterPrivateUser = gson.getDelegateAdapter(this, TypeToken.get(PrivateUser.class));
            final TypeAdapter<PublicUser> adapterPublicUser = gson.getDelegateAdapter(this, TypeToken.get(PublicUser.class));

            return (TypeAdapter<T>) new TypeAdapter<UsersGetAuthenticated200Response>() {
                @Override
                public void write(JsonWriter out, UsersGetAuthenticated200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `PrivateUser`
                    if (value.getActualInstance() instanceof PrivateUser) {
                        JsonObject obj = adapterPrivateUser.toJsonTree((PrivateUser)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PublicUser`
                    if (value.getActualInstance() instanceof PublicUser) {
                        JsonObject obj = adapterPublicUser.toJsonTree((PublicUser)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: PrivateUser, PublicUser");
                }

                @Override
                public UsersGetAuthenticated200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize PrivateUser
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PrivateUser.validateJsonObject(jsonObject);
                        actualAdapter = adapterPrivateUser;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PrivateUser'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PrivateUser failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PrivateUser'", e);
                    }

                    // deserialize PublicUser
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PublicUser.validateJsonObject(jsonObject);
                        actualAdapter = adapterPublicUser;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PublicUser'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PublicUser failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PublicUser'", e);
                    }

                    if (match == 1) {
                        UsersGetAuthenticated200Response ret = new UsersGetAuthenticated200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UsersGetAuthenticated200Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public UsersGetAuthenticated200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public UsersGetAuthenticated200Response(PrivateUser o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UsersGetAuthenticated200Response(PublicUser o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PrivateUser", new GenericType<PrivateUser>() {
        });
        schemas.put("PublicUser", new GenericType<PublicUser>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return UsersGetAuthenticated200Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PrivateUser, PublicUser
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof PrivateUser) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PublicUser) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PrivateUser, PublicUser");
    }

    /**
     * Get the actual instance, which can be the following:
     * PrivateUser, PublicUser
     *
     * @return The actual instance (PrivateUser, PublicUser)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PrivateUser`. If the actual instance is not `PrivateUser`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PrivateUser`
     * @throws ClassCastException if the instance is not `PrivateUser`
     */
    public PrivateUser getPrivateUser() throws ClassCastException {
        return (PrivateUser)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PublicUser`. If the actual instance is not `PublicUser`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PublicUser`
     * @throws ClassCastException if the instance is not `PublicUser`
     */
    public PublicUser getPublicUser() throws ClassCastException {
        return (PublicUser)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersGetAuthenticated200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with PrivateUser
    try {
      PrivateUser.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PrivateUser failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PublicUser
    try {
      PublicUser.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PublicUser failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for UsersGetAuthenticated200Response with oneOf schemas: PrivateUser, PublicUser. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of UsersGetAuthenticated200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersGetAuthenticated200Response
  * @throws IOException if the JSON string is invalid with respect to UsersGetAuthenticated200Response
  */
  public static UsersGetAuthenticated200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersGetAuthenticated200Response.class);
  }

 /**
  * Convert an instance of UsersGetAuthenticated200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

