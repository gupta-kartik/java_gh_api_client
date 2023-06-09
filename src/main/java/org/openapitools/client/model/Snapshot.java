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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.Manifest;
import org.openapitools.client.model.Metadata1;
import org.openapitools.client.model.SnapshotDetector;
import org.openapitools.client.model.SnapshotJob;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Create a new snapshot of a repository&#39;s dependencies.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class Snapshot {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private SnapshotJob job;

  public static final String SERIALIZED_NAME_SHA = "sha";
  @SerializedName(SERIALIZED_NAME_SHA)
  private String sha;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_DETECTOR = "detector";
  @SerializedName(SERIALIZED_NAME_DETECTOR)
  private SnapshotDetector detector;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Metadata1> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_MANIFESTS = "manifests";
  @SerializedName(SERIALIZED_NAME_MANIFESTS)
  private Map<String, Manifest> manifests = new HashMap<>();

  public static final String SERIALIZED_NAME_SCANNED = "scanned";
  @SerializedName(SERIALIZED_NAME_SCANNED)
  private OffsetDateTime scanned;

  public Snapshot() {
  }

  public Snapshot version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the repository snapshot submission.
   * @return version
  **/
  @javax.annotation.Nonnull

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public Snapshot job(SnapshotJob job) {
    
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nonnull

  public SnapshotJob getJob() {
    return job;
  }


  public void setJob(SnapshotJob job) {
    this.job = job;
  }


  public Snapshot sha(String sha) {
    
    this.sha = sha;
    return this;
  }

   /**
   * The commit SHA associated with this dependency snapshot. Maximum length: 40 characters.
   * @return sha
  **/
  @javax.annotation.Nonnull

  public String getSha() {
    return sha;
  }


  public void setSha(String sha) {
    this.sha = sha;
  }


  public Snapshot ref(String ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * The repository branch that triggered this snapshot.
   * @return ref
  **/
  @javax.annotation.Nonnull

  public String getRef() {
    return ref;
  }


  public void setRef(String ref) {
    this.ref = ref;
  }


  public Snapshot detector(SnapshotDetector detector) {
    
    this.detector = detector;
    return this;
  }

   /**
   * Get detector
   * @return detector
  **/
  @javax.annotation.Nonnull

  public SnapshotDetector getDetector() {
    return detector;
  }


  public void setDetector(SnapshotDetector detector) {
    this.detector = detector;
  }


  public Snapshot metadata(Map<String, Metadata1> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public Snapshot putMetadataItem(String key, Metadata1 metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * User-defined metadata to store domain-specific information limited to 8 keys with scalar values.
   * @return metadata
  **/
  @javax.annotation.Nullable

  public Map<String, Metadata1> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, Metadata1> metadata) {
    this.metadata = metadata;
  }


  public Snapshot manifests(Map<String, Manifest> manifests) {
    
    this.manifests = manifests;
    return this;
  }

  public Snapshot putManifestsItem(String key, Manifest manifestsItem) {
    if (this.manifests == null) {
      this.manifests = new HashMap<>();
    }
    this.manifests.put(key, manifestsItem);
    return this;
  }

   /**
   * A collection of package manifests, which are a collection of related dependencies declared in a file or representing a logical group of dependencies.
   * @return manifests
  **/
  @javax.annotation.Nullable

  public Map<String, Manifest> getManifests() {
    return manifests;
  }


  public void setManifests(Map<String, Manifest> manifests) {
    this.manifests = manifests;
  }


  public Snapshot scanned(OffsetDateTime scanned) {
    
    this.scanned = scanned;
    return this;
  }

   /**
   * The time at which the snapshot was scanned.
   * @return scanned
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getScanned() {
    return scanned;
  }


  public void setScanned(OffsetDateTime scanned) {
    this.scanned = scanned;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Snapshot snapshot = (Snapshot) o;
    return Objects.equals(this.version, snapshot.version) &&
        Objects.equals(this.job, snapshot.job) &&
        Objects.equals(this.sha, snapshot.sha) &&
        Objects.equals(this.ref, snapshot.ref) &&
        Objects.equals(this.detector, snapshot.detector) &&
        Objects.equals(this.metadata, snapshot.metadata) &&
        Objects.equals(this.manifests, snapshot.manifests) &&
        Objects.equals(this.scanned, snapshot.scanned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, job, sha, ref, detector, metadata, manifests, scanned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Snapshot {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    detector: ").append(toIndentedString(detector)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
    sb.append("    scanned: ").append(toIndentedString(scanned)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("version");
    openapiFields.add("job");
    openapiFields.add("sha");
    openapiFields.add("ref");
    openapiFields.add("detector");
    openapiFields.add("metadata");
    openapiFields.add("manifests");
    openapiFields.add("scanned");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("job");
    openapiRequiredFields.add("sha");
    openapiRequiredFields.add("ref");
    openapiRequiredFields.add("detector");
    openapiRequiredFields.add("scanned");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Snapshot
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Snapshot.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Snapshot is not found in the empty JSON string", Snapshot.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Snapshot.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Snapshot` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Snapshot.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `job`
      SnapshotJob.validateJsonObject(jsonObj.getAsJsonObject("job"));
      if (!jsonObj.get("sha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha").toString()));
      }
      if (!jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      // validate the required field `detector`
      SnapshotDetector.validateJsonObject(jsonObj.getAsJsonObject("detector"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Snapshot.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Snapshot' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Snapshot> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Snapshot.class));

       return (TypeAdapter<T>) new TypeAdapter<Snapshot>() {
           @Override
           public void write(JsonWriter out, Snapshot value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Snapshot read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Snapshot given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Snapshot
  * @throws IOException if the JSON string is invalid with respect to Snapshot
  */
  public static Snapshot fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Snapshot.class);
  }

 /**
  * Convert an instance of Snapshot to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

