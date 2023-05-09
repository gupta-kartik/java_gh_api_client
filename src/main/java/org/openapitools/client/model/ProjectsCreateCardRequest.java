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
import org.openapitools.client.model.ProjectsCreateCardRequestOneOf;
import org.openapitools.client.model.ProjectsCreateCardRequestOneOf1;

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
public class ProjectsCreateCardRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ProjectsCreateCardRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ProjectsCreateCardRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ProjectsCreateCardRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ProjectsCreateCardRequestOneOf> adapterProjectsCreateCardRequestOneOf = gson.getDelegateAdapter(this, TypeToken.get(ProjectsCreateCardRequestOneOf.class));
            final TypeAdapter<ProjectsCreateCardRequestOneOf1> adapterProjectsCreateCardRequestOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(ProjectsCreateCardRequestOneOf1.class));

            return (TypeAdapter<T>) new TypeAdapter<ProjectsCreateCardRequest>() {
                @Override
                public void write(JsonWriter out, ProjectsCreateCardRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ProjectsCreateCardRequestOneOf`
                    if (value.getActualInstance() instanceof ProjectsCreateCardRequestOneOf) {
                        JsonObject obj = adapterProjectsCreateCardRequestOneOf.toJsonTree((ProjectsCreateCardRequestOneOf)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ProjectsCreateCardRequestOneOf1`
                    if (value.getActualInstance() instanceof ProjectsCreateCardRequestOneOf1) {
                        JsonObject obj = adapterProjectsCreateCardRequestOneOf1.toJsonTree((ProjectsCreateCardRequestOneOf1)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ProjectsCreateCardRequestOneOf, ProjectsCreateCardRequestOneOf1");
                }

                @Override
                public ProjectsCreateCardRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ProjectsCreateCardRequestOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ProjectsCreateCardRequestOneOf.validateJsonObject(jsonObject);
                        actualAdapter = adapterProjectsCreateCardRequestOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ProjectsCreateCardRequestOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ProjectsCreateCardRequestOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ProjectsCreateCardRequestOneOf'", e);
                    }

                    // deserialize ProjectsCreateCardRequestOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ProjectsCreateCardRequestOneOf1.validateJsonObject(jsonObject);
                        actualAdapter = adapterProjectsCreateCardRequestOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ProjectsCreateCardRequestOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ProjectsCreateCardRequestOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ProjectsCreateCardRequestOneOf1'", e);
                    }

                    if (match == 1) {
                        ProjectsCreateCardRequest ret = new ProjectsCreateCardRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ProjectsCreateCardRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ProjectsCreateCardRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public ProjectsCreateCardRequest(ProjectsCreateCardRequestOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ProjectsCreateCardRequest(ProjectsCreateCardRequestOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ProjectsCreateCardRequestOneOf", new GenericType<ProjectsCreateCardRequestOneOf>() {
        });
        schemas.put("ProjectsCreateCardRequestOneOf1", new GenericType<ProjectsCreateCardRequestOneOf1>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ProjectsCreateCardRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ProjectsCreateCardRequestOneOf, ProjectsCreateCardRequestOneOf1
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ProjectsCreateCardRequestOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ProjectsCreateCardRequestOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ProjectsCreateCardRequestOneOf, ProjectsCreateCardRequestOneOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * ProjectsCreateCardRequestOneOf, ProjectsCreateCardRequestOneOf1
     *
     * @return The actual instance (ProjectsCreateCardRequestOneOf, ProjectsCreateCardRequestOneOf1)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ProjectsCreateCardRequestOneOf`. If the actual instance is not `ProjectsCreateCardRequestOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ProjectsCreateCardRequestOneOf`
     * @throws ClassCastException if the instance is not `ProjectsCreateCardRequestOneOf`
     */
    public ProjectsCreateCardRequestOneOf getProjectsCreateCardRequestOneOf() throws ClassCastException {
        return (ProjectsCreateCardRequestOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ProjectsCreateCardRequestOneOf1`. If the actual instance is not `ProjectsCreateCardRequestOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ProjectsCreateCardRequestOneOf1`
     * @throws ClassCastException if the instance is not `ProjectsCreateCardRequestOneOf1`
     */
    public ProjectsCreateCardRequestOneOf1 getProjectsCreateCardRequestOneOf1() throws ClassCastException {
        return (ProjectsCreateCardRequestOneOf1)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectsCreateCardRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ProjectsCreateCardRequestOneOf
    try {
      ProjectsCreateCardRequestOneOf.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ProjectsCreateCardRequestOneOf failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ProjectsCreateCardRequestOneOf1
    try {
      ProjectsCreateCardRequestOneOf1.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ProjectsCreateCardRequestOneOf1 failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ProjectsCreateCardRequest with oneOf schemas: ProjectsCreateCardRequestOneOf, ProjectsCreateCardRequestOneOf1. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ProjectsCreateCardRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectsCreateCardRequest
  * @throws IOException if the JSON string is invalid with respect to ProjectsCreateCardRequest
  */
  public static ProjectsCreateCardRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectsCreateCardRequest.class);
  }

 /**
  * Convert an instance of ProjectsCreateCardRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

