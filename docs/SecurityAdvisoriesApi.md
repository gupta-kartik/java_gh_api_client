# SecurityAdvisoriesApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**securityAdvisoriesCreatePrivateVulnerabilityReport**](SecurityAdvisoriesApi.md#securityAdvisoriesCreatePrivateVulnerabilityReport) | **POST** /repos/{owner}/{repo}/security-advisories/reports | Privately report a security vulnerability |
| [**securityAdvisoriesCreateRepositoryAdvisory**](SecurityAdvisoriesApi.md#securityAdvisoriesCreateRepositoryAdvisory) | **POST** /repos/{owner}/{repo}/security-advisories | Create a repository security advisory |
| [**securityAdvisoriesGetRepositoryAdvisory**](SecurityAdvisoriesApi.md#securityAdvisoriesGetRepositoryAdvisory) | **GET** /repos/{owner}/{repo}/security-advisories/{ghsa_id} | Get a repository security advisory |
| [**securityAdvisoriesListRepositoryAdvisories**](SecurityAdvisoriesApi.md#securityAdvisoriesListRepositoryAdvisories) | **GET** /repos/{owner}/{repo}/security-advisories | List repository security advisories |
| [**securityAdvisoriesUpdateRepositoryAdvisory**](SecurityAdvisoriesApi.md#securityAdvisoriesUpdateRepositoryAdvisory) | **PATCH** /repos/{owner}/{repo}/security-advisories/{ghsa_id} | Update a repository security advisory |


<a name="securityAdvisoriesCreatePrivateVulnerabilityReport"></a>
# **securityAdvisoriesCreatePrivateVulnerabilityReport**
> RepositoryAdvisory securityAdvisoriesCreatePrivateVulnerabilityReport(owner, repo, privateVulnerabilityReportCreate)

Privately report a security vulnerability

Report a security vulnerability to the maintainers of the repository. See \&quot;[Privately reporting a security vulnerability](https://docs.github.com/code-security/security-advisories/guidance-on-reporting-and-writing/privately-reporting-a-security-vulnerability)\&quot; for more information about private vulnerability reporting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityAdvisoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    SecurityAdvisoriesApi apiInstance = new SecurityAdvisoriesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    PrivateVulnerabilityReportCreate privateVulnerabilityReportCreate = new PrivateVulnerabilityReportCreate(); // PrivateVulnerabilityReportCreate | 
    try {
      RepositoryAdvisory result = apiInstance.securityAdvisoriesCreatePrivateVulnerabilityReport(owner, repo, privateVulnerabilityReportCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityAdvisoriesApi#securityAdvisoriesCreatePrivateVulnerabilityReport");
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
| **privateVulnerabilityReportCreate** | [**PrivateVulnerabilityReportCreate**](PrivateVulnerabilityReportCreate.md)|  | |

### Return type

[**RepositoryAdvisory**](RepositoryAdvisory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="securityAdvisoriesCreateRepositoryAdvisory"></a>
# **securityAdvisoriesCreateRepositoryAdvisory**
> RepositoryAdvisory securityAdvisoriesCreateRepositoryAdvisory(owner, repo, repositoryAdvisoryCreate)

Create a repository security advisory

Creates a new repository security advisory. You must authenticate using an access token with the &#x60;repo&#x60; scope or &#x60;repository_advisories:write&#x60; permission to use this endpoint.  In order to create a draft repository security advisory, you must be a security manager or administrator of that repository.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityAdvisoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    SecurityAdvisoriesApi apiInstance = new SecurityAdvisoriesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    RepositoryAdvisoryCreate repositoryAdvisoryCreate = new RepositoryAdvisoryCreate(); // RepositoryAdvisoryCreate | 
    try {
      RepositoryAdvisory result = apiInstance.securityAdvisoriesCreateRepositoryAdvisory(owner, repo, repositoryAdvisoryCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityAdvisoriesApi#securityAdvisoriesCreateRepositoryAdvisory");
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
| **repositoryAdvisoryCreate** | [**RepositoryAdvisoryCreate**](RepositoryAdvisoryCreate.md)|  | |

### Return type

[**RepositoryAdvisory**](RepositoryAdvisory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="securityAdvisoriesGetRepositoryAdvisory"></a>
# **securityAdvisoriesGetRepositoryAdvisory**
> RepositoryAdvisory securityAdvisoriesGetRepositoryAdvisory(owner, repo, ghsaId)

Get a repository security advisory

Get a repository security advisory using its GitHub Security Advisory (GHSA) identifier. You can access any published security advisory on a public repository. You must authenticate using an access token with the &#x60;repo&#x60; scope or &#x60;repository_advisories:read&#x60; permission in order to get a published security advisory in a private repository, or any unpublished security advisory that you have access to.  You can access an unpublished security advisory from a repository if you are a security manager or administrator of that repository, or if you are a collaborator on the security advisory.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityAdvisoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    SecurityAdvisoriesApi apiInstance = new SecurityAdvisoriesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String ghsaId = "ghsaId_example"; // String | The GHSA (GitHub Security Advisory) identifier of the advisory.
    try {
      RepositoryAdvisory result = apiInstance.securityAdvisoriesGetRepositoryAdvisory(owner, repo, ghsaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityAdvisoriesApi#securityAdvisoriesGetRepositoryAdvisory");
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
| **ghsaId** | **String**| The GHSA (GitHub Security Advisory) identifier of the advisory. | |

### Return type

[**RepositoryAdvisory**](RepositoryAdvisory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="securityAdvisoriesListRepositoryAdvisories"></a>
# **securityAdvisoriesListRepositoryAdvisories**
> List&lt;RepositoryAdvisory&gt; securityAdvisoriesListRepositoryAdvisories(owner, repo, direction, sort, before, after, perPage, state)

List repository security advisories

Lists security advisories in a repository. You must authenticate using an access token with the &#x60;repo&#x60; scope or &#x60;repository_advisories:read&#x60; permission in order to get published security advisories in a private repository, or any unpublished security advisories that you have access to.  You can access unpublished security advisories from a repository if you are a security manager or administrator of that repository, or if you are a collaborator on any security advisory.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityAdvisoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    SecurityAdvisoriesApi apiInstance = new SecurityAdvisoriesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String direction = "asc"; // String | The direction to sort the results by.
    String sort = "created"; // String | The property to sort the results by.
    String before = "before_example"; // String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor.
    String after = "after_example"; // String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor.
    Integer perPage = 30; // Integer | Number of advisories to return per page.
    String state = "triage"; // String | Filter by state of the repository advisories. Only advisories of this state will be returned.
    try {
      List<RepositoryAdvisory> result = apiInstance.securityAdvisoriesListRepositoryAdvisories(owner, repo, direction, sort, before, after, perPage, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityAdvisoriesApi#securityAdvisoriesListRepositoryAdvisories");
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
| **direction** | **String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc] |
| **sort** | **String**| The property to sort the results by. | [optional] [default to created] [enum: created, updated, published] |
| **before** | **String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. | [optional] |
| **after** | **String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. | [optional] |
| **perPage** | **Integer**| Number of advisories to return per page. | [optional] [default to 30] |
| **state** | **String**| Filter by state of the repository advisories. Only advisories of this state will be returned. | [optional] [enum: triage, draft, published, closed] |

### Return type

[**List&lt;RepositoryAdvisory&gt;**](RepositoryAdvisory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **400** | Bad Request |  -  |
| **404** | Resource not found |  -  |

<a name="securityAdvisoriesUpdateRepositoryAdvisory"></a>
# **securityAdvisoriesUpdateRepositoryAdvisory**
> RepositoryAdvisory securityAdvisoriesUpdateRepositoryAdvisory(owner, repo, ghsaId, repositoryAdvisoryUpdate)

Update a repository security advisory

Update a repository security advisory using its GitHub Security Advisory (GHSA) identifier. You must authenticate using an access token with the &#x60;repo&#x60; scope or &#x60;repository_advisories:write&#x60; permission to use this endpoint.  In order to update any security advisory, you must be a security manager or administrator of that repository, or a collaborator on the repository security advisory.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityAdvisoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    SecurityAdvisoriesApi apiInstance = new SecurityAdvisoriesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String ghsaId = "ghsaId_example"; // String | The GHSA (GitHub Security Advisory) identifier of the advisory.
    RepositoryAdvisoryUpdate repositoryAdvisoryUpdate = new RepositoryAdvisoryUpdate(); // RepositoryAdvisoryUpdate | 
    try {
      RepositoryAdvisory result = apiInstance.securityAdvisoriesUpdateRepositoryAdvisory(owner, repo, ghsaId, repositoryAdvisoryUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityAdvisoriesApi#securityAdvisoriesUpdateRepositoryAdvisory");
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
| **ghsaId** | **String**| The GHSA (GitHub Security Advisory) identifier of the advisory. | |
| **repositoryAdvisoryUpdate** | [**RepositoryAdvisoryUpdate**](RepositoryAdvisoryUpdate.md)|  | |

### Return type

[**RepositoryAdvisory**](RepositoryAdvisory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

