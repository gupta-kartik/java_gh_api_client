# MigrationsApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**migrationsCancelImport**](MigrationsApi.md#migrationsCancelImport) | **DELETE** /repos/{owner}/{repo}/import | Cancel an import |
| [**migrationsDeleteArchiveForAuthenticatedUser**](MigrationsApi.md#migrationsDeleteArchiveForAuthenticatedUser) | **DELETE** /user/migrations/{migration_id}/archive | Delete a user migration archive |
| [**migrationsDeleteArchiveForOrg**](MigrationsApi.md#migrationsDeleteArchiveForOrg) | **DELETE** /orgs/{org}/migrations/{migration_id}/archive | Delete an organization migration archive |
| [**migrationsDownloadArchiveForOrg**](MigrationsApi.md#migrationsDownloadArchiveForOrg) | **GET** /orgs/{org}/migrations/{migration_id}/archive | Download an organization migration archive |
| [**migrationsGetArchiveForAuthenticatedUser**](MigrationsApi.md#migrationsGetArchiveForAuthenticatedUser) | **GET** /user/migrations/{migration_id}/archive | Download a user migration archive |
| [**migrationsGetCommitAuthors**](MigrationsApi.md#migrationsGetCommitAuthors) | **GET** /repos/{owner}/{repo}/import/authors | Get commit authors |
| [**migrationsGetImportStatus**](MigrationsApi.md#migrationsGetImportStatus) | **GET** /repos/{owner}/{repo}/import | Get an import status |
| [**migrationsGetLargeFiles**](MigrationsApi.md#migrationsGetLargeFiles) | **GET** /repos/{owner}/{repo}/import/large_files | Get large files |
| [**migrationsGetStatusForAuthenticatedUser**](MigrationsApi.md#migrationsGetStatusForAuthenticatedUser) | **GET** /user/migrations/{migration_id} | Get a user migration status |
| [**migrationsGetStatusForOrg**](MigrationsApi.md#migrationsGetStatusForOrg) | **GET** /orgs/{org}/migrations/{migration_id} | Get an organization migration status |
| [**migrationsListForAuthenticatedUser**](MigrationsApi.md#migrationsListForAuthenticatedUser) | **GET** /user/migrations | List user migrations |
| [**migrationsListForOrg**](MigrationsApi.md#migrationsListForOrg) | **GET** /orgs/{org}/migrations | List organization migrations |
| [**migrationsListReposForAuthenticatedUser**](MigrationsApi.md#migrationsListReposForAuthenticatedUser) | **GET** /user/migrations/{migration_id}/repositories | List repositories for a user migration |
| [**migrationsListReposForOrg**](MigrationsApi.md#migrationsListReposForOrg) | **GET** /orgs/{org}/migrations/{migration_id}/repositories | List repositories in an organization migration |
| [**migrationsMapCommitAuthor**](MigrationsApi.md#migrationsMapCommitAuthor) | **PATCH** /repos/{owner}/{repo}/import/authors/{author_id} | Map a commit author |
| [**migrationsSetLfsPreference**](MigrationsApi.md#migrationsSetLfsPreference) | **PATCH** /repos/{owner}/{repo}/import/lfs | Update Git LFS preference |
| [**migrationsStartForAuthenticatedUser**](MigrationsApi.md#migrationsStartForAuthenticatedUser) | **POST** /user/migrations | Start a user migration |
| [**migrationsStartForOrg**](MigrationsApi.md#migrationsStartForOrg) | **POST** /orgs/{org}/migrations | Start an organization migration |
| [**migrationsStartImport**](MigrationsApi.md#migrationsStartImport) | **PUT** /repos/{owner}/{repo}/import | Start an import |
| [**migrationsUnlockRepoForAuthenticatedUser**](MigrationsApi.md#migrationsUnlockRepoForAuthenticatedUser) | **DELETE** /user/migrations/{migration_id}/repos/{repo_name}/lock | Unlock a user repository |
| [**migrationsUnlockRepoForOrg**](MigrationsApi.md#migrationsUnlockRepoForOrg) | **DELETE** /orgs/{org}/migrations/{migration_id}/repos/{repo_name}/lock | Unlock an organization repository |
| [**migrationsUpdateImport**](MigrationsApi.md#migrationsUpdateImport) | **PATCH** /repos/{owner}/{repo}/import | Update an import |


<a name="migrationsCancelImport"></a>
# **migrationsCancelImport**
> migrationsCancelImport(owner, repo)

Cancel an import

Stop an import for a repository.  **Warning:** Support for importing Mercurial, Subversion and Team Foundation Version Control repositories will end on October 17, 2023. For more details, see [changelog](https://gh.io/github-importer-non-git-eol). In the coming weeks, we will update these docs to reflect relevant changes to the API and will contact all integrators using the \&quot;Source imports\&quot; API. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      apiInstance.migrationsCancelImport(owner, repo);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsCancelImport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **503** | Unavailable due to service under maintenance. |  -  |

<a name="migrationsDeleteArchiveForAuthenticatedUser"></a>
# **migrationsDeleteArchiveForAuthenticatedUser**
> migrationsDeleteArchiveForAuthenticatedUser(migrationId)

Delete a user migration archive

Deletes a previous migration archive. Downloadable migration archives are automatically deleted after seven days. Migration metadata, which is returned in the [List user migrations](https://docs.github.com/rest/migrations/users#list-user-migrations) and [Get a user migration status](https://docs.github.com/rest/migrations/users#get-a-user-migration-status) endpoints, will continue to be available even after an archive is deleted.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    Integer migrationId = 56; // Integer | The unique identifier of the migration.
    try {
      apiInstance.migrationsDeleteArchiveForAuthenticatedUser(migrationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsDeleteArchiveForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **migrationId** | **Integer**| The unique identifier of the migration. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **404** | Resource not found |  -  |
| **304** | Not modified |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="migrationsDeleteArchiveForOrg"></a>
# **migrationsDeleteArchiveForOrg**
> migrationsDeleteArchiveForOrg(org, migrationId)

Delete an organization migration archive

Deletes a previous migration archive. Migration archives are automatically deleted after seven days.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer migrationId = 56; // Integer | The unique identifier of the migration.
    try {
      apiInstance.migrationsDeleteArchiveForOrg(org, migrationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsDeleteArchiveForOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **migrationId** | **Integer**| The unique identifier of the migration. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="migrationsDownloadArchiveForOrg"></a>
# **migrationsDownloadArchiveForOrg**
> migrationsDownloadArchiveForOrg(org, migrationId)

Download an organization migration archive

Fetches the URL to a migration archive.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer migrationId = 56; // Integer | The unique identifier of the migration.
    try {
      apiInstance.migrationsDownloadArchiveForOrg(org, migrationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsDownloadArchiveForOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **migrationId** | **Integer**| The unique identifier of the migration. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="migrationsGetArchiveForAuthenticatedUser"></a>
# **migrationsGetArchiveForAuthenticatedUser**
> migrationsGetArchiveForAuthenticatedUser(migrationId)

Download a user migration archive

Fetches the URL to download the migration archive as a &#x60;tar.gz&#x60; file. Depending on the resources your repository uses, the migration archive can contain JSON files with data for these objects:  *   attachments *   bases *   commit\\_comments *   issue\\_comments *   issue\\_events *   issues *   milestones *   organizations *   projects *   protected\\_branches *   pull\\_request\\_reviews *   pull\\_requests *   releases *   repositories *   review\\_comments *   schema *   users  The archive will also contain an &#x60;attachments&#x60; directory that includes all attachment files uploaded to GitHub.com and a &#x60;repositories&#x60; directory that contains the repository&#39;s Git data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    Integer migrationId = 56; // Integer | The unique identifier of the migration.
    try {
      apiInstance.migrationsGetArchiveForAuthenticatedUser(migrationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsGetArchiveForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **migrationId** | **Integer**| The unique identifier of the migration. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | Response |  -  |
| **304** | Not modified |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="migrationsGetCommitAuthors"></a>
# **migrationsGetCommitAuthors**
> List&lt;PorterAuthor&gt; migrationsGetCommitAuthors(owner, repo, since)

Get commit authors

Each type of source control system represents authors in a different way. For example, a Git commit author has a display name and an email address, but a Subversion commit author just has a username. The GitHub Importer will make the author information valid, but the author might not be correct. For example, it will change the bare Subversion username &#x60;hubot&#x60; into something like &#x60;hubot &lt;hubot@12341234-abab-fefe-8787-fedcba987654&gt;&#x60;.  This endpoint and the [Map a commit author](https://docs.github.com/rest/migrations/source-imports#map-a-commit-author) endpoint allow you to provide correct Git author information.  **Warning:** Support for importing Mercurial, Subversion and Team Foundation Version Control repositories will end on October 17, 2023. For more details, see [changelog](https://gh.io/github-importer-non-git-eol). In the coming weeks, we will update these docs to reflect relevant changes to the API and will contact all integrators using the \&quot;Source imports\&quot; API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer since = 56; // Integer | A user ID. Only return users with an ID greater than this ID.
    try {
      List<PorterAuthor> result = apiInstance.migrationsGetCommitAuthors(owner, repo, since);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsGetCommitAuthors");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **since** | **Integer**| A user ID. Only return users with an ID greater than this ID. | [optional] |

### Return type

[**List&lt;PorterAuthor&gt;**](PorterAuthor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **503** | Unavailable due to service under maintenance. |  -  |

<a name="migrationsGetImportStatus"></a>
# **migrationsGetImportStatus**
> ModelImport migrationsGetImportStatus(owner, repo)

Get an import status

View the progress of an import.  **Warning:** Support for importing Mercurial, Subversion and Team Foundation Version Control repositories will end on October 17, 2023. For more details, see [changelog](https://gh.io/github-importer-non-git-eol). In the coming weeks, we will update these docs to reflect relevant changes to the API and will contact all integrators using the \&quot;Source imports\&quot; API.  **Import status**  This section includes details about the possible values of the &#x60;status&#x60; field of the Import Progress response.  An import that does not have errors will progress through these steps:  *   &#x60;detecting&#x60; - the \&quot;detection\&quot; step of the import is in progress because the request did not include a &#x60;vcs&#x60; parameter. The import is identifying the type of source control present at the URL. *   &#x60;importing&#x60; - the \&quot;raw\&quot; step of the import is in progress. This is where commit data is fetched from the original repository. The import progress response will include &#x60;commit_count&#x60; (the total number of raw commits that will be imported) and &#x60;percent&#x60; (0 - 100, the current progress through the import). *   &#x60;mapping&#x60; - the \&quot;rewrite\&quot; step of the import is in progress. This is where SVN branches are converted to Git branches, and where author updates are applied. The import progress response does not include progress information. *   &#x60;pushing&#x60; - the \&quot;push\&quot; step of the import is in progress. This is where the importer updates the repository on GitHub. The import progress response will include &#x60;push_percent&#x60;, which is the percent value reported by &#x60;git push&#x60; when it is \&quot;Writing objects\&quot;. *   &#x60;complete&#x60; - the import is complete, and the repository is ready on GitHub.  If there are problems, you will see one of these in the &#x60;status&#x60; field:  *   &#x60;auth_failed&#x60; - the import requires authentication in order to connect to the original repository. To update authentication for the import, please see the [Update an import](https://docs.github.com/rest/migrations/source-imports#update-an-import) section. *   &#x60;error&#x60; - the import encountered an error. The import progress response will include the &#x60;failed_step&#x60; and an error message. Contact [GitHub Support](https://support.github.com/contact?tags&#x3D;dotcom-rest-api) for more information. *   &#x60;detection_needs_auth&#x60; - the importer requires authentication for the originating repository to continue detection. To update authentication for the import, please see the [Update an import](https://docs.github.com/rest/migrations/source-imports#update-an-import) section. *   &#x60;detection_found_nothing&#x60; - the importer didn&#39;t recognize any source control at the URL. To resolve, [Cancel the import](https://docs.github.com/rest/migrations/source-imports#cancel-an-import) and [retry](https://docs.github.com/rest/migrations/source-imports#start-an-import) with the correct URL. *   &#x60;detection_found_multiple&#x60; - the importer found several projects or repositories at the provided URL. When this is the case, the Import Progress response will also include a &#x60;project_choices&#x60; field with the possible project choices as values. To update project choice, please see the [Update an import](https://docs.github.com/rest/migrations/source-imports#update-an-import) section.  **The project_choices field**  When multiple projects are found at the provided URL, the response hash will include a &#x60;project_choices&#x60; field, the value of which is an array of hashes each representing a project choice. The exact key/value pairs of the project hashes will differ depending on the version control type.  **Git LFS related fields**  This section includes details about Git LFS related fields that may be present in the Import Progress response.  *   &#x60;use_lfs&#x60; - describes whether the import has been opted in or out of using Git LFS. The value can be &#x60;opt_in&#x60;, &#x60;opt_out&#x60;, or &#x60;undecided&#x60; if no action has been taken. *   &#x60;has_large_files&#x60; - the boolean value describing whether files larger than 100MB were found during the &#x60;importing&#x60; step. *   &#x60;large_files_size&#x60; - the total size in gigabytes of files larger than 100MB found in the originating repository. *   &#x60;large_files_count&#x60; - the total number of files larger than 100MB found in the originating repository. To see a list of these files, make a \&quot;Get Large Files\&quot; request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      ModelImport result = apiInstance.migrationsGetImportStatus(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsGetImportStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **503** | Unavailable due to service under maintenance. |  -  |

<a name="migrationsGetLargeFiles"></a>
# **migrationsGetLargeFiles**
> List&lt;PorterLargeFile&gt; migrationsGetLargeFiles(owner, repo)

Get large files

List files larger than 100MB found during the import  **Warning:** Support for importing Mercurial, Subversion and Team Foundation Version Control repositories will end on October 17, 2023. For more details, see [changelog](https://gh.io/github-importer-non-git-eol). In the coming weeks, we will update these docs to reflect relevant changes to the API and will contact all integrators using the \&quot;Source imports\&quot; API. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      List<PorterLargeFile> result = apiInstance.migrationsGetLargeFiles(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsGetLargeFiles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**List&lt;PorterLargeFile&gt;**](PorterLargeFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **503** | Unavailable due to service under maintenance. |  -  |

<a name="migrationsGetStatusForAuthenticatedUser"></a>
# **migrationsGetStatusForAuthenticatedUser**
> Migration migrationsGetStatusForAuthenticatedUser(migrationId, exclude)

Get a user migration status

Fetches a single user migration. The response includes the &#x60;state&#x60; of the migration, which can be one of the following values:  *   &#x60;pending&#x60; - the migration hasn&#39;t started yet. *   &#x60;exporting&#x60; - the migration is in progress. *   &#x60;exported&#x60; - the migration finished successfully. *   &#x60;failed&#x60; - the migration failed.  Once the migration has been &#x60;exported&#x60; you can [download the migration archive](https://docs.github.com/rest/migrations/users#download-a-user-migration-archive).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    Integer migrationId = 56; // Integer | The unique identifier of the migration.
    List<String> exclude = Arrays.asList(); // List<String> | 
    try {
      Migration result = apiInstance.migrationsGetStatusForAuthenticatedUser(migrationId, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsGetStatusForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **migrationId** | **Integer**| The unique identifier of the migration. | |
| **exclude** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**Migration**](Migration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **304** | Not modified |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="migrationsGetStatusForOrg"></a>
# **migrationsGetStatusForOrg**
> Migration migrationsGetStatusForOrg(org, migrationId, exclude)

Get an organization migration status

Fetches the status of a migration.  The &#x60;state&#x60; of a migration can be one of the following values:  *   &#x60;pending&#x60;, which means the migration hasn&#39;t started yet. *   &#x60;exporting&#x60;, which means the migration is in progress. *   &#x60;exported&#x60;, which means the migration finished successfully. *   &#x60;failed&#x60;, which means the migration failed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer migrationId = 56; // Integer | The unique identifier of the migration.
    List<String> exclude = Arrays.asList(); // List<String> | Exclude attributes from the API response to improve performance
    try {
      Migration result = apiInstance.migrationsGetStatusForOrg(org, migrationId, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsGetStatusForOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **migrationId** | **Integer**| The unique identifier of the migration. | |
| **exclude** | [**List&lt;String&gt;**](String.md)| Exclude attributes from the API response to improve performance | [optional] [enum: repositories] |

### Return type

[**Migration**](Migration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | *   &#x60;pending&#x60;, which means the migration hasn&#39;t started yet. *   &#x60;exporting&#x60;, which means the migration is in progress. *   &#x60;exported&#x60;, which means the migration finished successfully. *   &#x60;failed&#x60;, which means the migration failed. |  -  |
| **404** | Resource not found |  -  |

<a name="migrationsListForAuthenticatedUser"></a>
# **migrationsListForAuthenticatedUser**
> List&lt;Migration&gt; migrationsListForAuthenticatedUser(perPage, page)

List user migrations

Lists all migrations a user has started.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Migration> result = apiInstance.migrationsListForAuthenticatedUser(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsListForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;Migration&gt;**](Migration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |
| **304** | Not modified |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="migrationsListForOrg"></a>
# **migrationsListForOrg**
> List&lt;Migration&gt; migrationsListForOrg(org, perPage, page, exclude)

List organization migrations

Lists the most recent migrations, including both exports (which can be started through the REST API) and imports (which cannot be started using the REST API).  A list of &#x60;repositories&#x60; is only returned for export migrations.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    List<String> exclude = Arrays.asList(); // List<String> | Exclude attributes from the API response to improve performance
    try {
      List<Migration> result = apiInstance.migrationsListForOrg(org, perPage, page, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsListForOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Exclude attributes from the API response to improve performance | [optional] [enum: repositories] |

### Return type

[**List&lt;Migration&gt;**](Migration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="migrationsListReposForAuthenticatedUser"></a>
# **migrationsListReposForAuthenticatedUser**
> List&lt;MinimalRepository&gt; migrationsListReposForAuthenticatedUser(migrationId, perPage, page)

List repositories for a user migration

Lists all the repositories for this user migration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    Integer migrationId = 56; // Integer | The unique identifier of the migration.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<MinimalRepository> result = apiInstance.migrationsListReposForAuthenticatedUser(migrationId, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsListReposForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **migrationId** | **Integer**| The unique identifier of the migration. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |
| **404** | Resource not found |  -  |

<a name="migrationsListReposForOrg"></a>
# **migrationsListReposForOrg**
> List&lt;MinimalRepository&gt; migrationsListReposForOrg(org, migrationId, perPage, page)

List repositories in an organization migration

List all the repositories for this organization migration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer migrationId = 56; // Integer | The unique identifier of the migration.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<MinimalRepository> result = apiInstance.migrationsListReposForOrg(org, migrationId, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsListReposForOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **migrationId** | **Integer**| The unique identifier of the migration. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |
| **404** | Resource not found |  -  |

<a name="migrationsMapCommitAuthor"></a>
# **migrationsMapCommitAuthor**
> PorterAuthor migrationsMapCommitAuthor(owner, repo, authorId, migrationsMapCommitAuthorRequest)

Map a commit author

Update an author&#39;s identity for the import. Your application can continue updating authors any time before you push new commits to the repository.  **Warning:** Support for importing Mercurial, Subversion and Team Foundation Version Control repositories will end on October 17, 2023. For more details, see [changelog](https://gh.io/github-importer-non-git-eol). In the coming weeks, we will update these docs to reflect relevant changes to the API and will contact all integrators using the \&quot;Source imports\&quot; API. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer authorId = 56; // Integer | 
    MigrationsMapCommitAuthorRequest migrationsMapCommitAuthorRequest = new MigrationsMapCommitAuthorRequest(); // MigrationsMapCommitAuthorRequest | 
    try {
      PorterAuthor result = apiInstance.migrationsMapCommitAuthor(owner, repo, authorId, migrationsMapCommitAuthorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsMapCommitAuthor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **authorId** | **Integer**|  | |
| **migrationsMapCommitAuthorRequest** | [**MigrationsMapCommitAuthorRequest**](MigrationsMapCommitAuthorRequest.md)|  | [optional] |

### Return type

[**PorterAuthor**](PorterAuthor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **404** | Resource not found |  -  |
| **503** | Unavailable due to service under maintenance. |  -  |

<a name="migrationsSetLfsPreference"></a>
# **migrationsSetLfsPreference**
> ModelImport migrationsSetLfsPreference(owner, repo, migrationsSetLfsPreferenceRequest)

Update Git LFS preference

You can import repositories from Subversion, Mercurial, and TFS that include files larger than 100MB. This ability is powered by [Git LFS](https://git-lfs.com).  You can learn more about our LFS feature and working with large files [on our help site](https://docs.github.com/repositories/working-with-files/managing-large-files).  **Warning:** Support for importing Mercurial, Subversion and Team Foundation Version Control repositories will end on October 17, 2023. For more details, see [changelog](https://gh.io/github-importer-non-git-eol). In the coming weeks, we will update these docs to reflect relevant changes to the API and will contact all integrators using the \&quot;Source imports\&quot; API. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    MigrationsSetLfsPreferenceRequest migrationsSetLfsPreferenceRequest = new MigrationsSetLfsPreferenceRequest(); // MigrationsSetLfsPreferenceRequest | 
    try {
      ModelImport result = apiInstance.migrationsSetLfsPreference(owner, repo, migrationsSetLfsPreferenceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsSetLfsPreference");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **migrationsSetLfsPreferenceRequest** | [**MigrationsSetLfsPreferenceRequest**](MigrationsSetLfsPreferenceRequest.md)|  | |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **503** | Unavailable due to service under maintenance. |  -  |

<a name="migrationsStartForAuthenticatedUser"></a>
# **migrationsStartForAuthenticatedUser**
> Migration migrationsStartForAuthenticatedUser(migrationsStartForAuthenticatedUserRequest)

Start a user migration

Initiates the generation of a user migration archive.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    MigrationsStartForAuthenticatedUserRequest migrationsStartForAuthenticatedUserRequest = new MigrationsStartForAuthenticatedUserRequest(); // MigrationsStartForAuthenticatedUserRequest | 
    try {
      Migration result = apiInstance.migrationsStartForAuthenticatedUser(migrationsStartForAuthenticatedUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsStartForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **migrationsStartForAuthenticatedUserRequest** | [**MigrationsStartForAuthenticatedUserRequest**](MigrationsStartForAuthenticatedUserRequest.md)|  | |

### Return type

[**Migration**](Migration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **304** | Not modified |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="migrationsStartForOrg"></a>
# **migrationsStartForOrg**
> Migration migrationsStartForOrg(org, migrationsStartForOrgRequest)

Start an organization migration

Initiates the generation of a migration archive.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    MigrationsStartForOrgRequest migrationsStartForOrgRequest = new MigrationsStartForOrgRequest(); // MigrationsStartForOrgRequest | 
    try {
      Migration result = apiInstance.migrationsStartForOrg(org, migrationsStartForOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsStartForOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **migrationsStartForOrgRequest** | [**MigrationsStartForOrgRequest**](MigrationsStartForOrgRequest.md)|  | |

### Return type

[**Migration**](Migration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="migrationsStartImport"></a>
# **migrationsStartImport**
> ModelImport migrationsStartImport(owner, repo, migrationsStartImportRequest)

Start an import

Start a source import to a GitHub repository using GitHub Importer. Importing into a GitHub repository with GitHub Actions enabled is not supported and will return a status &#x60;422 Unprocessable Entity&#x60; response. **Warning:** Support for importing Mercurial, Subversion and Team Foundation Version Control repositories will end on October 17, 2023. For more details, see [changelog](https://gh.io/github-importer-non-git-eol). In the coming weeks, we will update these docs to reflect relevant changes to the API and will contact all integrators using the \&quot;Source imports\&quot; API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    MigrationsStartImportRequest migrationsStartImportRequest = new MigrationsStartImportRequest(); // MigrationsStartImportRequest | 
    try {
      ModelImport result = apiInstance.migrationsStartImport(owner, repo, migrationsStartImportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsStartImport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **migrationsStartImportRequest** | [**MigrationsStartImportRequest**](MigrationsStartImportRequest.md)|  | |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  * Location -  <br>  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **404** | Resource not found |  -  |
| **503** | Unavailable due to service under maintenance. |  -  |

<a name="migrationsUnlockRepoForAuthenticatedUser"></a>
# **migrationsUnlockRepoForAuthenticatedUser**
> migrationsUnlockRepoForAuthenticatedUser(migrationId, repoName)

Unlock a user repository

Unlocks a repository. You can lock repositories when you [start a user migration](https://docs.github.com/rest/migrations/users#start-a-user-migration). Once the migration is complete you can unlock each repository to begin using it again or [delete the repository](https://docs.github.com/rest/repos/repos#delete-a-repository) if you no longer need the source data. Returns a status of &#x60;404 Not Found&#x60; if the repository is not locked.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    Integer migrationId = 56; // Integer | The unique identifier of the migration.
    String repoName = "repoName_example"; // String | repo_name parameter
    try {
      apiInstance.migrationsUnlockRepoForAuthenticatedUser(migrationId, repoName);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsUnlockRepoForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **migrationId** | **Integer**| The unique identifier of the migration. | |
| **repoName** | **String**| repo_name parameter | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **304** | Not modified |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="migrationsUnlockRepoForOrg"></a>
# **migrationsUnlockRepoForOrg**
> migrationsUnlockRepoForOrg(org, migrationId, repoName)

Unlock an organization repository

Unlocks a repository that was locked for migration. You should unlock each migrated repository and [delete them](https://docs.github.com/rest/repos/repos#delete-a-repository) when the migration is complete and you no longer need the source data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer migrationId = 56; // Integer | The unique identifier of the migration.
    String repoName = "repoName_example"; // String | repo_name parameter
    try {
      apiInstance.migrationsUnlockRepoForOrg(org, migrationId, repoName);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsUnlockRepoForOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **migrationId** | **Integer**| The unique identifier of the migration. | |
| **repoName** | **String**| repo_name parameter | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="migrationsUpdateImport"></a>
# **migrationsUpdateImport**
> ModelImport migrationsUpdateImport(owner, repo, migrationsUpdateImportRequest)

Update an import

An import can be updated with credentials or a project choice by passing in the appropriate parameters in this API request. If no parameters are provided, the import will be restarted.  Some servers (e.g. TFS servers) can have several projects at a single URL. In those cases the import progress will have the status &#x60;detection_found_multiple&#x60; and the Import Progress response will include a &#x60;project_choices&#x60; array. You can select the project to import by providing one of the objects in the &#x60;project_choices&#x60; array in the update request.  **Warning:** Support for importing Mercurial, Subversion and Team Foundation Version Control repositories will end on October 17, 2023. For more details, see [changelog](https://gh.io/github-importer-non-git-eol). In the coming weeks, we will update these docs to reflect relevant changes to the API and will contact all integrators using the \&quot;Source imports\&quot; API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MigrationsApi apiInstance = new MigrationsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    MigrationsUpdateImportRequest migrationsUpdateImportRequest = new MigrationsUpdateImportRequest(); // MigrationsUpdateImportRequest | 
    try {
      ModelImport result = apiInstance.migrationsUpdateImport(owner, repo, migrationsUpdateImportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#migrationsUpdateImport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **migrationsUpdateImportRequest** | [**MigrationsUpdateImportRequest**](MigrationsUpdateImportRequest.md)|  | [optional] |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **503** | Unavailable due to service under maintenance. |  -  |

