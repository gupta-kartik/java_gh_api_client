# DependencyGraphApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dependencyGraphCreateRepositorySnapshot**](DependencyGraphApi.md#dependencyGraphCreateRepositorySnapshot) | **POST** /repos/{owner}/{repo}/dependency-graph/snapshots | Create a snapshot of dependencies for a repository |
| [**dependencyGraphDiffRange**](DependencyGraphApi.md#dependencyGraphDiffRange) | **GET** /repos/{owner}/{repo}/dependency-graph/compare/{basehead} | Get a diff of the dependencies between commits |
| [**dependencyGraphExportSbom**](DependencyGraphApi.md#dependencyGraphExportSbom) | **GET** /repos/{owner}/{repo}/dependency-graph/sbom | Export a software bill of materials (SBOM) for a repository. |


<a name="dependencyGraphCreateRepositorySnapshot"></a>
# **dependencyGraphCreateRepositorySnapshot**
> DependencyGraphCreateRepositorySnapshot201Response dependencyGraphCreateRepositorySnapshot(owner, repo, snapshot)

Create a snapshot of dependencies for a repository

Create a new snapshot of a repository&#39;s dependencies. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint for a repository that the requesting user has access to.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependencyGraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependencyGraphApi apiInstance = new DependencyGraphApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Snapshot snapshot = new Snapshot(); // Snapshot | 
    try {
      DependencyGraphCreateRepositorySnapshot201Response result = apiInstance.dependencyGraphCreateRepositorySnapshot(owner, repo, snapshot);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependencyGraphApi#dependencyGraphCreateRepositorySnapshot");
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
| **snapshot** | [**Snapshot**](Snapshot.md)|  | |

### Return type

[**DependencyGraphCreateRepositorySnapshot201Response**](DependencyGraphCreateRepositorySnapshot201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |

<a name="dependencyGraphDiffRange"></a>
# **dependencyGraphDiffRange**
> List&lt;DependencyGraphDiffInner&gt; dependencyGraphDiffRange(owner, repo, basehead, name)

Get a diff of the dependencies between commits

Gets the diff of the dependency changes between two commits of a repository, based on the changes to the dependency manifests made in those commits.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependencyGraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependencyGraphApi apiInstance = new DependencyGraphApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String basehead = "basehead_example"; // String | The base and head Git revisions to compare. The Git revisions will be resolved to commit SHAs. Named revisions will be resolved to their corresponding HEAD commits, and an appropriate merge base will be determined. This parameter expects the format `{base}...{head}`.
    String name = "name_example"; // String | The full path, relative to the repository root, of the dependency manifest file.
    try {
      List<DependencyGraphDiffInner> result = apiInstance.dependencyGraphDiffRange(owner, repo, basehead, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependencyGraphApi#dependencyGraphDiffRange");
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
| **basehead** | **String**| The base and head Git revisions to compare. The Git revisions will be resolved to commit SHAs. Named revisions will be resolved to their corresponding HEAD commits, and an appropriate merge base will be determined. This parameter expects the format &#x60;{base}...{head}&#x60;. | |
| **name** | **String**| The full path, relative to the repository root, of the dependency manifest file. | [optional] |

### Return type

[**List&lt;DependencyGraphDiffInner&gt;**](DependencyGraphDiffInner.md)

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
| **403** | Forbidden |  -  |

<a name="dependencyGraphExportSbom"></a>
# **dependencyGraphExportSbom**
> DependencyGraphSpdxSbom dependencyGraphExportSbom(owner, repo)

Export a software bill of materials (SBOM) for a repository.

Exports the software bill of materials (SBOM) for a repository in SPDX JSON format.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependencyGraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependencyGraphApi apiInstance = new DependencyGraphApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      DependencyGraphSpdxSbom result = apiInstance.dependencyGraphExportSbom(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependencyGraphApi#dependencyGraphExportSbom");
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

[**DependencyGraphSpdxSbom**](DependencyGraphSpdxSbom.md)

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
| **403** | Forbidden |  -  |

