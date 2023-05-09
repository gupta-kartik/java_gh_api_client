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
import org.openapitools.client.model.DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner;

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
 * DependencyGraphSpdxSbomSbomPackagesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class DependencyGraphSpdxSbomSbomPackagesInner {
  public static final String SERIALIZED_NAME_S_P_D_X_I_D = "SPDXID";
  @SerializedName(SERIALIZED_NAME_S_P_D_X_I_D)
  private String SPDXID;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VERSION_INFO = "versionInfo";
  @SerializedName(SERIALIZED_NAME_VERSION_INFO)
  private String versionInfo;

  public static final String SERIALIZED_NAME_DOWNLOAD_LOCATION = "downloadLocation";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_LOCATION)
  private String downloadLocation;

  public static final String SERIALIZED_NAME_FILES_ANALYZED = "filesAnalyzed";
  @SerializedName(SERIALIZED_NAME_FILES_ANALYZED)
  private Boolean filesAnalyzed;

  public static final String SERIALIZED_NAME_LICENSE_CONCLUDED = "licenseConcluded";
  @SerializedName(SERIALIZED_NAME_LICENSE_CONCLUDED)
  private String licenseConcluded;

  public static final String SERIALIZED_NAME_LICENSE_DECLARED = "licenseDeclared";
  @SerializedName(SERIALIZED_NAME_LICENSE_DECLARED)
  private String licenseDeclared;

  public static final String SERIALIZED_NAME_SUPPLIER = "supplier";
  @SerializedName(SERIALIZED_NAME_SUPPLIER)
  private String supplier;

  public static final String SERIALIZED_NAME_EXTERNAL_REFS = "externalRefs";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_REFS)
  private List<DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner> externalRefs;

  public DependencyGraphSpdxSbomSbomPackagesInner() {
  }

  public DependencyGraphSpdxSbomSbomPackagesInner SPDXID(String SPDXID) {
    
    this.SPDXID = SPDXID;
    return this;
  }

   /**
   * A unique SPDX identifier for the package.
   * @return SPDXID
  **/
  @javax.annotation.Nullable

  public String getSPDXID() {
    return SPDXID;
  }


  public void setSPDXID(String SPDXID) {
    this.SPDXID = SPDXID;
  }


  public DependencyGraphSpdxSbomSbomPackagesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the package.
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DependencyGraphSpdxSbomSbomPackagesInner versionInfo(String versionInfo) {
    
    this.versionInfo = versionInfo;
    return this;
  }

   /**
   * The version of the package. If the package does not have an exact version specified, a version range is given.
   * @return versionInfo
  **/
  @javax.annotation.Nullable

  public String getVersionInfo() {
    return versionInfo;
  }


  public void setVersionInfo(String versionInfo) {
    this.versionInfo = versionInfo;
  }


  public DependencyGraphSpdxSbomSbomPackagesInner downloadLocation(String downloadLocation) {
    
    this.downloadLocation = downloadLocation;
    return this;
  }

   /**
   * The location where the package can be downloaded, or NOASSERTION if this has not been determined.
   * @return downloadLocation
  **/
  @javax.annotation.Nullable

  public String getDownloadLocation() {
    return downloadLocation;
  }


  public void setDownloadLocation(String downloadLocation) {
    this.downloadLocation = downloadLocation;
  }


  public DependencyGraphSpdxSbomSbomPackagesInner filesAnalyzed(Boolean filesAnalyzed) {
    
    this.filesAnalyzed = filesAnalyzed;
    return this;
  }

   /**
   * Whether the package&#39;s file content has been subjected to analysis during the creation of the SPDX document.
   * @return filesAnalyzed
  **/
  @javax.annotation.Nullable

  public Boolean getFilesAnalyzed() {
    return filesAnalyzed;
  }


  public void setFilesAnalyzed(Boolean filesAnalyzed) {
    this.filesAnalyzed = filesAnalyzed;
  }


  public DependencyGraphSpdxSbomSbomPackagesInner licenseConcluded(String licenseConcluded) {
    
    this.licenseConcluded = licenseConcluded;
    return this;
  }

   /**
   * The license of the package as determined while creating the SPDX document.
   * @return licenseConcluded
  **/
  @javax.annotation.Nullable

  public String getLicenseConcluded() {
    return licenseConcluded;
  }


  public void setLicenseConcluded(String licenseConcluded) {
    this.licenseConcluded = licenseConcluded;
  }


  public DependencyGraphSpdxSbomSbomPackagesInner licenseDeclared(String licenseDeclared) {
    
    this.licenseDeclared = licenseDeclared;
    return this;
  }

   /**
   * The license of the package as declared by its author, or NOASSERTION if this information was not available when the SPDX document was created.
   * @return licenseDeclared
  **/
  @javax.annotation.Nullable

  public String getLicenseDeclared() {
    return licenseDeclared;
  }


  public void setLicenseDeclared(String licenseDeclared) {
    this.licenseDeclared = licenseDeclared;
  }


  public DependencyGraphSpdxSbomSbomPackagesInner supplier(String supplier) {
    
    this.supplier = supplier;
    return this;
  }

   /**
   * The distribution source of this package, or NOASSERTION if this was not determined.
   * @return supplier
  **/
  @javax.annotation.Nullable

  public String getSupplier() {
    return supplier;
  }


  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }


  public DependencyGraphSpdxSbomSbomPackagesInner externalRefs(List<DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner> externalRefs) {
    
    this.externalRefs = externalRefs;
    return this;
  }

  public DependencyGraphSpdxSbomSbomPackagesInner addExternalRefsItem(DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner externalRefsItem) {
    if (this.externalRefs == null) {
      this.externalRefs = new ArrayList<>();
    }
    this.externalRefs.add(externalRefsItem);
    return this;
  }

   /**
   * Get externalRefs
   * @return externalRefs
  **/
  @javax.annotation.Nullable

  public List<DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner> getExternalRefs() {
    return externalRefs;
  }


  public void setExternalRefs(List<DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner> externalRefs) {
    this.externalRefs = externalRefs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependencyGraphSpdxSbomSbomPackagesInner dependencyGraphSpdxSbomSbomPackagesInner = (DependencyGraphSpdxSbomSbomPackagesInner) o;
    return Objects.equals(this.SPDXID, dependencyGraphSpdxSbomSbomPackagesInner.SPDXID) &&
        Objects.equals(this.name, dependencyGraphSpdxSbomSbomPackagesInner.name) &&
        Objects.equals(this.versionInfo, dependencyGraphSpdxSbomSbomPackagesInner.versionInfo) &&
        Objects.equals(this.downloadLocation, dependencyGraphSpdxSbomSbomPackagesInner.downloadLocation) &&
        Objects.equals(this.filesAnalyzed, dependencyGraphSpdxSbomSbomPackagesInner.filesAnalyzed) &&
        Objects.equals(this.licenseConcluded, dependencyGraphSpdxSbomSbomPackagesInner.licenseConcluded) &&
        Objects.equals(this.licenseDeclared, dependencyGraphSpdxSbomSbomPackagesInner.licenseDeclared) &&
        Objects.equals(this.supplier, dependencyGraphSpdxSbomSbomPackagesInner.supplier) &&
        Objects.equals(this.externalRefs, dependencyGraphSpdxSbomSbomPackagesInner.externalRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(SPDXID, name, versionInfo, downloadLocation, filesAnalyzed, licenseConcluded, licenseDeclared, supplier, externalRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyGraphSpdxSbomSbomPackagesInner {\n");
    sb.append("    SPDXID: ").append(toIndentedString(SPDXID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    versionInfo: ").append(toIndentedString(versionInfo)).append("\n");
    sb.append("    downloadLocation: ").append(toIndentedString(downloadLocation)).append("\n");
    sb.append("    filesAnalyzed: ").append(toIndentedString(filesAnalyzed)).append("\n");
    sb.append("    licenseConcluded: ").append(toIndentedString(licenseConcluded)).append("\n");
    sb.append("    licenseDeclared: ").append(toIndentedString(licenseDeclared)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    externalRefs: ").append(toIndentedString(externalRefs)).append("\n");
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
    openapiFields.add("SPDXID");
    openapiFields.add("name");
    openapiFields.add("versionInfo");
    openapiFields.add("downloadLocation");
    openapiFields.add("filesAnalyzed");
    openapiFields.add("licenseConcluded");
    openapiFields.add("licenseDeclared");
    openapiFields.add("supplier");
    openapiFields.add("externalRefs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DependencyGraphSpdxSbomSbomPackagesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DependencyGraphSpdxSbomSbomPackagesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DependencyGraphSpdxSbomSbomPackagesInner is not found in the empty JSON string", DependencyGraphSpdxSbomSbomPackagesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DependencyGraphSpdxSbomSbomPackagesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DependencyGraphSpdxSbomSbomPackagesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("SPDXID") != null && !jsonObj.get("SPDXID").isJsonNull()) && !jsonObj.get("SPDXID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SPDXID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SPDXID").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("versionInfo") != null && !jsonObj.get("versionInfo").isJsonNull()) && !jsonObj.get("versionInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionInfo").toString()));
      }
      if ((jsonObj.get("downloadLocation") != null && !jsonObj.get("downloadLocation").isJsonNull()) && !jsonObj.get("downloadLocation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `downloadLocation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("downloadLocation").toString()));
      }
      if ((jsonObj.get("licenseConcluded") != null && !jsonObj.get("licenseConcluded").isJsonNull()) && !jsonObj.get("licenseConcluded").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `licenseConcluded` to be a primitive type in the JSON string but got `%s`", jsonObj.get("licenseConcluded").toString()));
      }
      if ((jsonObj.get("licenseDeclared") != null && !jsonObj.get("licenseDeclared").isJsonNull()) && !jsonObj.get("licenseDeclared").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `licenseDeclared` to be a primitive type in the JSON string but got `%s`", jsonObj.get("licenseDeclared").toString()));
      }
      if ((jsonObj.get("supplier") != null && !jsonObj.get("supplier").isJsonNull()) && !jsonObj.get("supplier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supplier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supplier").toString()));
      }
      if (jsonObj.get("externalRefs") != null && !jsonObj.get("externalRefs").isJsonNull()) {
        JsonArray jsonArrayexternalRefs = jsonObj.getAsJsonArray("externalRefs");
        if (jsonArrayexternalRefs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("externalRefs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `externalRefs` to be an array in the JSON string but got `%s`", jsonObj.get("externalRefs").toString()));
          }

          // validate the optional field `externalRefs` (array)
          for (int i = 0; i < jsonArrayexternalRefs.size(); i++) {
            DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner.validateJsonObject(jsonArrayexternalRefs.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DependencyGraphSpdxSbomSbomPackagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DependencyGraphSpdxSbomSbomPackagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DependencyGraphSpdxSbomSbomPackagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DependencyGraphSpdxSbomSbomPackagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DependencyGraphSpdxSbomSbomPackagesInner>() {
           @Override
           public void write(JsonWriter out, DependencyGraphSpdxSbomSbomPackagesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DependencyGraphSpdxSbomSbomPackagesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DependencyGraphSpdxSbomSbomPackagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DependencyGraphSpdxSbomSbomPackagesInner
  * @throws IOException if the JSON string is invalid with respect to DependencyGraphSpdxSbomSbomPackagesInner
  */
  public static DependencyGraphSpdxSbomSbomPackagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DependencyGraphSpdxSbomSbomPackagesInner.class);
  }

 /**
  * Convert an instance of DependencyGraphSpdxSbomSbomPackagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
