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
import org.openapitools.client.model.UsersAddEmailForAuthenticatedUserRequestOneOf;

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
public class UsersAddEmailForAuthenticatedUserRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UsersAddEmailForAuthenticatedUserRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UsersAddEmailForAuthenticatedUserRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UsersAddEmailForAuthenticatedUserRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<List&lt;String&gt;> adapterList&lt;String&gt; = gson.getDelegateAdapter(this, TypeToken.get(List&lt;String&gt;.class));
            final TypeAdapter<String> adapterString = gson.getDelegateAdapter(this, TypeToken.get(String.class));
            final TypeAdapter<UsersAddEmailForAuthenticatedUserRequestOneOf> adapterUsersAddEmailForAuthenticatedUserRequestOneOf = gson.getDelegateAdapter(this, TypeToken.get(UsersAddEmailForAuthenticatedUserRequestOneOf.class));

            return (TypeAdapter<T>) new TypeAdapter<UsersAddEmailForAuthenticatedUserRequest>() {
                @Override
                public void write(JsonWriter out, UsersAddEmailForAuthenticatedUserRequest value) throws IOException {
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

                    // check if the actual instance is of the type `String`
                    if (value.getActualInstance() instanceof String) {
                        JsonObject obj = adapterString.toJsonTree((String)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UsersAddEmailForAuthenticatedUserRequestOneOf`
                    if (value.getActualInstance() instanceof UsersAddEmailForAuthenticatedUserRequestOneOf) {
                        JsonObject obj = adapterUsersAddEmailForAuthenticatedUserRequestOneOf.toJsonTree((UsersAddEmailForAuthenticatedUserRequestOneOf)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: List<String>, String, UsersAddEmailForAuthenticatedUserRequestOneOf");
                }

                @Override
                public UsersAddEmailForAuthenticatedUserRequest read(JsonReader in) throws IOException {
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

                    // deserialize UsersAddEmailForAuthenticatedUserRequestOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UsersAddEmailForAuthenticatedUserRequestOneOf.validateJsonObject(jsonObject);
                        actualAdapter = adapterUsersAddEmailForAuthenticatedUserRequestOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UsersAddEmailForAuthenticatedUserRequestOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UsersAddEmailForAuthenticatedUserRequestOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UsersAddEmailForAuthenticatedUserRequestOneOf'", e);
                    }

                    if (match == 1) {
                        UsersAddEmailForAuthenticatedUserRequest ret = new UsersAddEmailForAuthenticatedUserRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UsersAddEmailForAuthenticatedUserRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public UsersAddEmailForAuthenticatedUserRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public UsersAddEmailForAuthenticatedUserRequest(List<String> o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UsersAddEmailForAuthenticatedUserRequest(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UsersAddEmailForAuthenticatedUserRequest(UsersAddEmailForAuthenticatedUserRequestOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<String>", new GenericType<List<String>>() {
        });
        schemas.put("String", new GenericType<String>() {
        });
        schemas.put("UsersAddEmailForAuthenticatedUserRequestOneOf", new GenericType<UsersAddEmailForAuthenticatedUserRequestOneOf>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return UsersAddEmailForAuthenticatedUserRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * List<String>, String, UsersAddEmailForAuthenticatedUserRequestOneOf
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

        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UsersAddEmailForAuthenticatedUserRequestOneOf) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be List<String>, String, UsersAddEmailForAuthenticatedUserRequestOneOf");
    }

    /**
     * Get the actual instance, which can be the following:
     * List<String>, String, UsersAddEmailForAuthenticatedUserRequestOneOf
     *
     * @return The actual instance (List<String>, String, UsersAddEmailForAuthenticatedUserRequestOneOf)
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
     * Get the actual instance of `UsersAddEmailForAuthenticatedUserRequestOneOf`. If the actual instance is not `UsersAddEmailForAuthenticatedUserRequestOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UsersAddEmailForAuthenticatedUserRequestOneOf`
     * @throws ClassCastException if the instance is not `UsersAddEmailForAuthenticatedUserRequestOneOf`
     */
    public UsersAddEmailForAuthenticatedUserRequestOneOf getUsersAddEmailForAuthenticatedUserRequestOneOf() throws ClassCastException {
        return (UsersAddEmailForAuthenticatedUserRequestOneOf)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersAddEmailForAuthenticatedUserRequest
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
    // validate the json string with String
    try {
      String.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UsersAddEmailForAuthenticatedUserRequestOneOf
    try {
      UsersAddEmailForAuthenticatedUserRequestOneOf.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UsersAddEmailForAuthenticatedUserRequestOneOf failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for UsersAddEmailForAuthenticatedUserRequest with oneOf schemas: List<String>, String, UsersAddEmailForAuthenticatedUserRequestOneOf. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of UsersAddEmailForAuthenticatedUserRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersAddEmailForAuthenticatedUserRequest
  * @throws IOException if the JSON string is invalid with respect to UsersAddEmailForAuthenticatedUserRequest
  */
  public static UsersAddEmailForAuthenticatedUserRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersAddEmailForAuthenticatedUserRequest.class);
  }

 /**
  * Convert an instance of UsersAddEmailForAuthenticatedUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

