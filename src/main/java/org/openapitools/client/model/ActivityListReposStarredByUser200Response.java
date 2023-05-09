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
import org.openapitools.client.model.Repository;
import org.openapitools.client.model.StarredRepository;

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
public class ActivityListReposStarredByUser200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ActivityListReposStarredByUser200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ActivityListReposStarredByUser200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ActivityListReposStarredByUser200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<List&lt;Repository&gt;> adapterList&lt;Repository&gt; = gson.getDelegateAdapter(this, TypeToken.get(List&lt;Repository&gt;.class));
            final TypeAdapter<List&lt;StarredRepository&gt;> adapterList&lt;StarredRepository&gt; = gson.getDelegateAdapter(this, TypeToken.get(List&lt;StarredRepository&gt;.class));

            return (TypeAdapter<T>) new TypeAdapter<ActivityListReposStarredByUser200Response>() {
                @Override
                public void write(JsonWriter out, ActivityListReposStarredByUser200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `List&lt;Repository&gt;`
                    if (value.getActualInstance() instanceof List&lt;Repository&gt;) {
                        JsonObject obj = adapterList&lt;Repository&gt;.toJsonTree((List&lt;Repository&gt;)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `List&lt;StarredRepository&gt;`
                    if (value.getActualInstance() instanceof List&lt;StarredRepository&gt;) {
                        JsonObject obj = adapterList&lt;StarredRepository&gt;.toJsonTree((List&lt;StarredRepository&gt;)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: List<Repository>, List<StarredRepository>");
                }

                @Override
                public ActivityListReposStarredByUser200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize List<Repository>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        List&lt;Repository&gt;.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'List<Repository>'");
                        ActivityListReposStarredByUser200Response ret = new ActivityListReposStarredByUser200Response();
                        ret.setActualInstance(adapterList&lt;Repository&gt;.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'List<Repository>'", e);
                    }

                    // deserialize List<StarredRepository>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        List&lt;StarredRepository&gt;.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'List<StarredRepository>'");
                        ActivityListReposStarredByUser200Response ret = new ActivityListReposStarredByUser200Response();
                        ret.setActualInstance(adapterList&lt;StarredRepository&gt;.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'List<StarredRepository>'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for ActivityListReposStarredByUser200Response: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ActivityListReposStarredByUser200Response() {
        super("anyOf", Boolean.FALSE);
    }

    public ActivityListReposStarredByUser200Response(List<Repository> o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ActivityListReposStarredByUser200Response(List<StarredRepository> o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<Repository>", new GenericType<List<Repository>>() {
        });
        schemas.put("List<StarredRepository>", new GenericType<List<StarredRepository>>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ActivityListReposStarredByUser200Response.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * List<Repository>, List<StarredRepository>
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof List<Repository>) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof List<StarredRepository>) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be List<Repository>, List<StarredRepository>");
    }

    /**
     * Get the actual instance, which can be the following:
     * List<Repository>, List<StarredRepository>
     *
     * @return The actual instance (List<Repository>, List<StarredRepository>)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<Repository>`. If the actual instance is not `List<Repository>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<Repository>`
     * @throws ClassCastException if the instance is not `List<Repository>`
     */
    public List<Repository> getList<Repository>() throws ClassCastException {
        return (List<Repository>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<StarredRepository>`. If the actual instance is not `List<StarredRepository>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<StarredRepository>`
     * @throws ClassCastException if the instance is not `List<StarredRepository>`
     */
    public List<StarredRepository> getList<StarredRepository>() throws ClassCastException {
        return (List<StarredRepository>)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActivityListReposStarredByUser200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with List<Repository>
    try {
      List<Repository>.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with List<StarredRepository>
    try {
      List<StarredRepository>.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for ActivityListReposStarredByUser200Response with anyOf schemas: List<Repository>, List<StarredRepository>. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ActivityListReposStarredByUser200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActivityListReposStarredByUser200Response
  * @throws IOException if the JSON string is invalid with respect to ActivityListReposStarredByUser200Response
  */
  public static ActivityListReposStarredByUser200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActivityListReposStarredByUser200Response.class);
  }

 /**
  * Convert an instance of ActivityListReposStarredByUser200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

