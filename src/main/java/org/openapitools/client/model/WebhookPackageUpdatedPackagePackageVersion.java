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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.User;
import org.openapitools.client.model.WebhookPackagePublishedPackagePackageVersionDockerMetadataInner;
import org.openapitools.client.model.WebhookPackageUpdatedPackagePackageVersionPackageFilesInner;
import org.openapitools.client.model.WebhookPackageUpdatedPackagePackageVersionRelease;
import org.openapitools.client.model.WebhookRubygemsMetadata;

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
 * WebhookPackageUpdatedPackagePackageVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T20:37:23.111113500+10:00[Australia/Brisbane]")
public class WebhookPackageUpdatedPackagePackageVersion {
  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private User author;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_BODY_HTML = "body_html";
  @SerializedName(SERIALIZED_NAME_BODY_HTML)
  private String bodyHtml;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DOCKER_METADATA = "docker_metadata";
  @SerializedName(SERIALIZED_NAME_DOCKER_METADATA)
  private List<WebhookPackagePublishedPackagePackageVersionDockerMetadataInner> dockerMetadata;

  public static final String SERIALIZED_NAME_DRAFT = "draft";
  @SerializedName(SERIALIZED_NAME_DRAFT)
  private Boolean draft;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private URI htmlUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_INSTALLATION_COMMAND = "installation_command";
  @SerializedName(SERIALIZED_NAME_INSTALLATION_COMMAND)
  private String installationCommand;

  public static final String SERIALIZED_NAME_MANIFEST = "manifest";
  @SerializedName(SERIALIZED_NAME_MANIFEST)
  private String manifest;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<Map<String, Object>> metadata = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PACKAGE_FILES = "package_files";
  @SerializedName(SERIALIZED_NAME_PACKAGE_FILES)
  private List<WebhookPackageUpdatedPackagePackageVersionPackageFilesInner> packageFiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_PACKAGE_URL = "package_url";
  @SerializedName(SERIALIZED_NAME_PACKAGE_URL)
  private String packageUrl;

  public static final String SERIALIZED_NAME_PRERELEASE = "prerelease";
  @SerializedName(SERIALIZED_NAME_PRERELEASE)
  private Boolean prerelease;

  public static final String SERIALIZED_NAME_RELEASE = "release";
  @SerializedName(SERIALIZED_NAME_RELEASE)
  private WebhookPackageUpdatedPackagePackageVersionRelease release;

  public static final String SERIALIZED_NAME_RUBYGEMS_METADATA = "rubygems_metadata";
  @SerializedName(SERIALIZED_NAME_RUBYGEMS_METADATA)
  private List<WebhookRubygemsMetadata> rubygemsMetadata;

  public static final String SERIALIZED_NAME_SOURCE_URL = "source_url";
  @SerializedName(SERIALIZED_NAME_SOURCE_URL)
  private URI sourceUrl;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_TAG_NAME = "tag_name";
  @SerializedName(SERIALIZED_NAME_TAG_NAME)
  private String tagName;

  public static final String SERIALIZED_NAME_TARGET_COMMITISH = "target_commitish";
  @SerializedName(SERIALIZED_NAME_TARGET_COMMITISH)
  private String targetCommitish;

  public static final String SERIALIZED_NAME_TARGET_OID = "target_oid";
  @SerializedName(SERIALIZED_NAME_TARGET_OID)
  private String targetOid;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public WebhookPackageUpdatedPackagePackageVersion() {
  }

  public WebhookPackageUpdatedPackagePackageVersion author(User author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable

  public User getAuthor() {
    return author;
  }


  public void setAuthor(User author) {
    this.author = author;
  }


  public WebhookPackageUpdatedPackagePackageVersion body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nonnull

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public WebhookPackageUpdatedPackagePackageVersion bodyHtml(String bodyHtml) {
    
    this.bodyHtml = bodyHtml;
    return this;
  }

   /**
   * Get bodyHtml
   * @return bodyHtml
  **/
  @javax.annotation.Nonnull

  public String getBodyHtml() {
    return bodyHtml;
  }


  public void setBodyHtml(String bodyHtml) {
    this.bodyHtml = bodyHtml;
  }


  public WebhookPackageUpdatedPackagePackageVersion createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookPackageUpdatedPackagePackageVersion description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public WebhookPackageUpdatedPackagePackageVersion dockerMetadata(List<WebhookPackagePublishedPackagePackageVersionDockerMetadataInner> dockerMetadata) {
    
    this.dockerMetadata = dockerMetadata;
    return this;
  }

  public WebhookPackageUpdatedPackagePackageVersion addDockerMetadataItem(WebhookPackagePublishedPackagePackageVersionDockerMetadataInner dockerMetadataItem) {
    if (this.dockerMetadata == null) {
      this.dockerMetadata = new ArrayList<>();
    }
    this.dockerMetadata.add(dockerMetadataItem);
    return this;
  }

   /**
   * Get dockerMetadata
   * @return dockerMetadata
  **/
  @javax.annotation.Nullable

  public List<WebhookPackagePublishedPackagePackageVersionDockerMetadataInner> getDockerMetadata() {
    return dockerMetadata;
  }


  public void setDockerMetadata(List<WebhookPackagePublishedPackagePackageVersionDockerMetadataInner> dockerMetadata) {
    this.dockerMetadata = dockerMetadata;
  }


  public WebhookPackageUpdatedPackagePackageVersion draft(Boolean draft) {
    
    this.draft = draft;
    return this;
  }

   /**
   * Get draft
   * @return draft
  **/
  @javax.annotation.Nullable

  public Boolean getDraft() {
    return draft;
  }


  public void setDraft(Boolean draft) {
    this.draft = draft;
  }


  public WebhookPackageUpdatedPackagePackageVersion htmlUrl(URI htmlUrl) {
    
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @javax.annotation.Nonnull

  public URI getHtmlUrl() {
    return htmlUrl;
  }


  public void setHtmlUrl(URI htmlUrl) {
    this.htmlUrl = htmlUrl;
  }


  public WebhookPackageUpdatedPackagePackageVersion id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public WebhookPackageUpdatedPackagePackageVersion installationCommand(String installationCommand) {
    
    this.installationCommand = installationCommand;
    return this;
  }

   /**
   * Get installationCommand
   * @return installationCommand
  **/
  @javax.annotation.Nonnull

  public String getInstallationCommand() {
    return installationCommand;
  }


  public void setInstallationCommand(String installationCommand) {
    this.installationCommand = installationCommand;
  }


  public WebhookPackageUpdatedPackagePackageVersion manifest(String manifest) {
    
    this.manifest = manifest;
    return this;
  }

   /**
   * Get manifest
   * @return manifest
  **/
  @javax.annotation.Nullable

  public String getManifest() {
    return manifest;
  }


  public void setManifest(String manifest) {
    this.manifest = manifest;
  }


  public WebhookPackageUpdatedPackagePackageVersion metadata(List<Map<String, Object>> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public WebhookPackageUpdatedPackagePackageVersion addMetadataItem(Map<String, Object> metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull

  public List<Map<String, Object>> getMetadata() {
    return metadata;
  }


  public void setMetadata(List<Map<String, Object>> metadata) {
    this.metadata = metadata;
  }


  public WebhookPackageUpdatedPackagePackageVersion name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WebhookPackageUpdatedPackagePackageVersion packageFiles(List<WebhookPackageUpdatedPackagePackageVersionPackageFilesInner> packageFiles) {
    
    this.packageFiles = packageFiles;
    return this;
  }

  public WebhookPackageUpdatedPackagePackageVersion addPackageFilesItem(WebhookPackageUpdatedPackagePackageVersionPackageFilesInner packageFilesItem) {
    if (this.packageFiles == null) {
      this.packageFiles = new ArrayList<>();
    }
    this.packageFiles.add(packageFilesItem);
    return this;
  }

   /**
   * Get packageFiles
   * @return packageFiles
  **/
  @javax.annotation.Nonnull

  public List<WebhookPackageUpdatedPackagePackageVersionPackageFilesInner> getPackageFiles() {
    return packageFiles;
  }


  public void setPackageFiles(List<WebhookPackageUpdatedPackagePackageVersionPackageFilesInner> packageFiles) {
    this.packageFiles = packageFiles;
  }


  public WebhookPackageUpdatedPackagePackageVersion packageUrl(String packageUrl) {
    
    this.packageUrl = packageUrl;
    return this;
  }

   /**
   * Get packageUrl
   * @return packageUrl
  **/
  @javax.annotation.Nullable

  public String getPackageUrl() {
    return packageUrl;
  }


  public void setPackageUrl(String packageUrl) {
    this.packageUrl = packageUrl;
  }


  public WebhookPackageUpdatedPackagePackageVersion prerelease(Boolean prerelease) {
    
    this.prerelease = prerelease;
    return this;
  }

   /**
   * Get prerelease
   * @return prerelease
  **/
  @javax.annotation.Nullable

  public Boolean getPrerelease() {
    return prerelease;
  }


  public void setPrerelease(Boolean prerelease) {
    this.prerelease = prerelease;
  }


  public WebhookPackageUpdatedPackagePackageVersion release(WebhookPackageUpdatedPackagePackageVersionRelease release) {
    
    this.release = release;
    return this;
  }

   /**
   * Get release
   * @return release
  **/
  @javax.annotation.Nullable

  public WebhookPackageUpdatedPackagePackageVersionRelease getRelease() {
    return release;
  }


  public void setRelease(WebhookPackageUpdatedPackagePackageVersionRelease release) {
    this.release = release;
  }


  public WebhookPackageUpdatedPackagePackageVersion rubygemsMetadata(List<WebhookRubygemsMetadata> rubygemsMetadata) {
    
    this.rubygemsMetadata = rubygemsMetadata;
    return this;
  }

  public WebhookPackageUpdatedPackagePackageVersion addRubygemsMetadataItem(WebhookRubygemsMetadata rubygemsMetadataItem) {
    if (this.rubygemsMetadata == null) {
      this.rubygemsMetadata = new ArrayList<>();
    }
    this.rubygemsMetadata.add(rubygemsMetadataItem);
    return this;
  }

   /**
   * Get rubygemsMetadata
   * @return rubygemsMetadata
  **/
  @javax.annotation.Nullable

  public List<WebhookRubygemsMetadata> getRubygemsMetadata() {
    return rubygemsMetadata;
  }


  public void setRubygemsMetadata(List<WebhookRubygemsMetadata> rubygemsMetadata) {
    this.rubygemsMetadata = rubygemsMetadata;
  }


  public WebhookPackageUpdatedPackagePackageVersion sourceUrl(URI sourceUrl) {
    
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * Get sourceUrl
   * @return sourceUrl
  **/
  @javax.annotation.Nullable

  public URI getSourceUrl() {
    return sourceUrl;
  }


  public void setSourceUrl(URI sourceUrl) {
    this.sourceUrl = sourceUrl;
  }


  public WebhookPackageUpdatedPackagePackageVersion summary(String summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nonnull

  public String getSummary() {
    return summary;
  }


  public void setSummary(String summary) {
    this.summary = summary;
  }


  public WebhookPackageUpdatedPackagePackageVersion tagName(String tagName) {
    
    this.tagName = tagName;
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @javax.annotation.Nullable

  public String getTagName() {
    return tagName;
  }


  public void setTagName(String tagName) {
    this.tagName = tagName;
  }


  public WebhookPackageUpdatedPackagePackageVersion targetCommitish(String targetCommitish) {
    
    this.targetCommitish = targetCommitish;
    return this;
  }

   /**
   * Get targetCommitish
   * @return targetCommitish
  **/
  @javax.annotation.Nonnull

  public String getTargetCommitish() {
    return targetCommitish;
  }


  public void setTargetCommitish(String targetCommitish) {
    this.targetCommitish = targetCommitish;
  }


  public WebhookPackageUpdatedPackagePackageVersion targetOid(String targetOid) {
    
    this.targetOid = targetOid;
    return this;
  }

   /**
   * Get targetOid
   * @return targetOid
  **/
  @javax.annotation.Nonnull

  public String getTargetOid() {
    return targetOid;
  }


  public void setTargetOid(String targetOid) {
    this.targetOid = targetOid;
  }


  public WebhookPackageUpdatedPackagePackageVersion updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public WebhookPackageUpdatedPackagePackageVersion version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookPackageUpdatedPackagePackageVersion webhookPackageUpdatedPackagePackageVersion = (WebhookPackageUpdatedPackagePackageVersion) o;
    return Objects.equals(this.author, webhookPackageUpdatedPackagePackageVersion.author) &&
        Objects.equals(this.body, webhookPackageUpdatedPackagePackageVersion.body) &&
        Objects.equals(this.bodyHtml, webhookPackageUpdatedPackagePackageVersion.bodyHtml) &&
        Objects.equals(this.createdAt, webhookPackageUpdatedPackagePackageVersion.createdAt) &&
        Objects.equals(this.description, webhookPackageUpdatedPackagePackageVersion.description) &&
        Objects.equals(this.dockerMetadata, webhookPackageUpdatedPackagePackageVersion.dockerMetadata) &&
        Objects.equals(this.draft, webhookPackageUpdatedPackagePackageVersion.draft) &&
        Objects.equals(this.htmlUrl, webhookPackageUpdatedPackagePackageVersion.htmlUrl) &&
        Objects.equals(this.id, webhookPackageUpdatedPackagePackageVersion.id) &&
        Objects.equals(this.installationCommand, webhookPackageUpdatedPackagePackageVersion.installationCommand) &&
        Objects.equals(this.manifest, webhookPackageUpdatedPackagePackageVersion.manifest) &&
        Objects.equals(this.metadata, webhookPackageUpdatedPackagePackageVersion.metadata) &&
        Objects.equals(this.name, webhookPackageUpdatedPackagePackageVersion.name) &&
        Objects.equals(this.packageFiles, webhookPackageUpdatedPackagePackageVersion.packageFiles) &&
        Objects.equals(this.packageUrl, webhookPackageUpdatedPackagePackageVersion.packageUrl) &&
        Objects.equals(this.prerelease, webhookPackageUpdatedPackagePackageVersion.prerelease) &&
        Objects.equals(this.release, webhookPackageUpdatedPackagePackageVersion.release) &&
        Objects.equals(this.rubygemsMetadata, webhookPackageUpdatedPackagePackageVersion.rubygemsMetadata) &&
        Objects.equals(this.sourceUrl, webhookPackageUpdatedPackagePackageVersion.sourceUrl) &&
        Objects.equals(this.summary, webhookPackageUpdatedPackagePackageVersion.summary) &&
        Objects.equals(this.tagName, webhookPackageUpdatedPackagePackageVersion.tagName) &&
        Objects.equals(this.targetCommitish, webhookPackageUpdatedPackagePackageVersion.targetCommitish) &&
        Objects.equals(this.targetOid, webhookPackageUpdatedPackagePackageVersion.targetOid) &&
        Objects.equals(this.updatedAt, webhookPackageUpdatedPackagePackageVersion.updatedAt) &&
        Objects.equals(this.version, webhookPackageUpdatedPackagePackageVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, body, bodyHtml, createdAt, description, dockerMetadata, draft, htmlUrl, id, installationCommand, manifest, metadata, name, packageFiles, packageUrl, prerelease, release, rubygemsMetadata, sourceUrl, summary, tagName, targetCommitish, targetOid, updatedAt, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPackageUpdatedPackagePackageVersion {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    bodyHtml: ").append(toIndentedString(bodyHtml)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dockerMetadata: ").append(toIndentedString(dockerMetadata)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    installationCommand: ").append(toIndentedString(installationCommand)).append("\n");
    sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageFiles: ").append(toIndentedString(packageFiles)).append("\n");
    sb.append("    packageUrl: ").append(toIndentedString(packageUrl)).append("\n");
    sb.append("    prerelease: ").append(toIndentedString(prerelease)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    rubygemsMetadata: ").append(toIndentedString(rubygemsMetadata)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    targetCommitish: ").append(toIndentedString(targetCommitish)).append("\n");
    sb.append("    targetOid: ").append(toIndentedString(targetOid)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("author");
    openapiFields.add("body");
    openapiFields.add("body_html");
    openapiFields.add("created_at");
    openapiFields.add("description");
    openapiFields.add("docker_metadata");
    openapiFields.add("draft");
    openapiFields.add("html_url");
    openapiFields.add("id");
    openapiFields.add("installation_command");
    openapiFields.add("manifest");
    openapiFields.add("metadata");
    openapiFields.add("name");
    openapiFields.add("package_files");
    openapiFields.add("package_url");
    openapiFields.add("prerelease");
    openapiFields.add("release");
    openapiFields.add("rubygems_metadata");
    openapiFields.add("source_url");
    openapiFields.add("summary");
    openapiFields.add("tag_name");
    openapiFields.add("target_commitish");
    openapiFields.add("target_oid");
    openapiFields.add("updated_at");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("author");
    openapiRequiredFields.add("body");
    openapiRequiredFields.add("body_html");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("html_url");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("installation_command");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("package_files");
    openapiRequiredFields.add("summary");
    openapiRequiredFields.add("target_commitish");
    openapiRequiredFields.add("target_oid");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("version");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookPackageUpdatedPackagePackageVersion
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookPackageUpdatedPackagePackageVersion.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookPackageUpdatedPackagePackageVersion is not found in the empty JSON string", WebhookPackageUpdatedPackagePackageVersion.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookPackageUpdatedPackagePackageVersion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookPackageUpdatedPackagePackageVersion` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookPackageUpdatedPackagePackageVersion.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `author`
      User.validateJsonObject(jsonObj.getAsJsonObject("author"));
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if (!jsonObj.get("body_html").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body_html` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body_html").toString()));
      }
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("docker_metadata") != null && !jsonObj.get("docker_metadata").isJsonNull()) {
        JsonArray jsonArraydockerMetadata = jsonObj.getAsJsonArray("docker_metadata");
        if (jsonArraydockerMetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("docker_metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `docker_metadata` to be an array in the JSON string but got `%s`", jsonObj.get("docker_metadata").toString()));
          }

          // validate the optional field `docker_metadata` (array)
          for (int i = 0; i < jsonArraydockerMetadata.size(); i++) {
            WebhookPackagePublishedPackagePackageVersionDockerMetadataInner.validateJsonObject(jsonArraydockerMetadata.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (!jsonObj.get("installation_command").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installation_command` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installation_command").toString()));
      }
      if ((jsonObj.get("manifest") != null && !jsonObj.get("manifest").isJsonNull()) && !jsonObj.get("manifest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manifest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manifest").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("metadata") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("metadata").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("package_files").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_files` to be an array in the JSON string but got `%s`", jsonObj.get("package_files").toString()));
      }

      JsonArray jsonArraypackageFiles = jsonObj.getAsJsonArray("package_files");
      // validate the required field `package_files` (array)
      for (int i = 0; i < jsonArraypackageFiles.size(); i++) {
        WebhookPackageUpdatedPackagePackageVersionPackageFilesInner.validateJsonObject(jsonArraypackageFiles.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("package_url") != null && !jsonObj.get("package_url").isJsonNull()) && !jsonObj.get("package_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_url").toString()));
      }
      // validate the optional field `release`
      if (jsonObj.get("release") != null && !jsonObj.get("release").isJsonNull()) {
        WebhookPackageUpdatedPackagePackageVersionRelease.validateJsonObject(jsonObj.getAsJsonObject("release"));
      }
      if (jsonObj.get("rubygems_metadata") != null && !jsonObj.get("rubygems_metadata").isJsonNull()) {
        JsonArray jsonArrayrubygemsMetadata = jsonObj.getAsJsonArray("rubygems_metadata");
        if (jsonArrayrubygemsMetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rubygems_metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rubygems_metadata` to be an array in the JSON string but got `%s`", jsonObj.get("rubygems_metadata").toString()));
          }

          // validate the optional field `rubygems_metadata` (array)
          for (int i = 0; i < jsonArrayrubygemsMetadata.size(); i++) {
            WebhookRubygemsMetadata.validateJsonObject(jsonArrayrubygemsMetadata.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("source_url") != null && !jsonObj.get("source_url").isJsonNull()) && !jsonObj.get("source_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_url").toString()));
      }
      if (!jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      if ((jsonObj.get("tag_name") != null && !jsonObj.get("tag_name").isJsonNull()) && !jsonObj.get("tag_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_name").toString()));
      }
      if (!jsonObj.get("target_commitish").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_commitish` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_commitish").toString()));
      }
      if (!jsonObj.get("target_oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_oid").toString()));
      }
      if (!jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if (!jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookPackageUpdatedPackagePackageVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookPackageUpdatedPackagePackageVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookPackageUpdatedPackagePackageVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookPackageUpdatedPackagePackageVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookPackageUpdatedPackagePackageVersion>() {
           @Override
           public void write(JsonWriter out, WebhookPackageUpdatedPackagePackageVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookPackageUpdatedPackagePackageVersion read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookPackageUpdatedPackagePackageVersion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookPackageUpdatedPackagePackageVersion
  * @throws IOException if the JSON string is invalid with respect to WebhookPackageUpdatedPackagePackageVersion
  */
  public static WebhookPackageUpdatedPackagePackageVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookPackageUpdatedPackagePackageVersion.class);
  }

 /**
  * Convert an instance of WebhookPackageUpdatedPackagePackageVersion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

