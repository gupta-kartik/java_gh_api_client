# CodeScanningApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**codeScanningDeleteAnalysis**](CodeScanningApi.md#codeScanningDeleteAnalysis) | **DELETE** /repos/{owner}/{repo}/code-scanning/analyses/{analysis_id} | Delete a code scanning analysis from a repository |
| [**codeScanningGetAlert**](CodeScanningApi.md#codeScanningGetAlert) | **GET** /repos/{owner}/{repo}/code-scanning/alerts/{alert_number} | Get a code scanning alert |
| [**codeScanningGetAnalysis**](CodeScanningApi.md#codeScanningGetAnalysis) | **GET** /repos/{owner}/{repo}/code-scanning/analyses/{analysis_id} | Get a code scanning analysis for a repository |
| [**codeScanningGetCodeqlDatabase**](CodeScanningApi.md#codeScanningGetCodeqlDatabase) | **GET** /repos/{owner}/{repo}/code-scanning/codeql/databases/{language} | Get a CodeQL database for a repository |
| [**codeScanningGetDefaultSetup**](CodeScanningApi.md#codeScanningGetDefaultSetup) | **GET** /repos/{owner}/{repo}/code-scanning/default-setup | Get a code scanning default setup configuration |
| [**codeScanningGetSarif**](CodeScanningApi.md#codeScanningGetSarif) | **GET** /repos/{owner}/{repo}/code-scanning/sarifs/{sarif_id} | Get information about a SARIF upload |
| [**codeScanningListAlertInstances**](CodeScanningApi.md#codeScanningListAlertInstances) | **GET** /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}/instances | List instances of a code scanning alert |
| [**codeScanningListAlertsForOrg**](CodeScanningApi.md#codeScanningListAlertsForOrg) | **GET** /orgs/{org}/code-scanning/alerts | List code scanning alerts for an organization |
| [**codeScanningListAlertsForRepo**](CodeScanningApi.md#codeScanningListAlertsForRepo) | **GET** /repos/{owner}/{repo}/code-scanning/alerts | List code scanning alerts for a repository |
| [**codeScanningListCodeqlDatabases**](CodeScanningApi.md#codeScanningListCodeqlDatabases) | **GET** /repos/{owner}/{repo}/code-scanning/codeql/databases | List CodeQL databases for a repository |
| [**codeScanningListRecentAnalyses**](CodeScanningApi.md#codeScanningListRecentAnalyses) | **GET** /repos/{owner}/{repo}/code-scanning/analyses | List code scanning analyses for a repository |
| [**codeScanningUpdateAlert**](CodeScanningApi.md#codeScanningUpdateAlert) | **PATCH** /repos/{owner}/{repo}/code-scanning/alerts/{alert_number} | Update a code scanning alert |
| [**codeScanningUpdateDefaultSetup**](CodeScanningApi.md#codeScanningUpdateDefaultSetup) | **PATCH** /repos/{owner}/{repo}/code-scanning/default-setup | Update a code scanning default setup configuration |
| [**codeScanningUploadSarif**](CodeScanningApi.md#codeScanningUploadSarif) | **POST** /repos/{owner}/{repo}/code-scanning/sarifs | Upload an analysis as SARIF data |


<a name="codeScanningDeleteAnalysis"></a>
# **codeScanningDeleteAnalysis**
> CodeScanningAnalysisDeletion codeScanningDeleteAnalysis(owner, repo, analysisId, confirmDelete)

Delete a code scanning analysis from a repository

Deletes a specified code scanning analysis from a repository. For private repositories, you must use an access token with the &#x60;repo&#x60; scope. For public repositories, you must use an access token with &#x60;public_repo&#x60; scope. GitHub Apps must have the &#x60;security_events&#x60; write permission to use this endpoint.  You can delete one analysis at a time. To delete a series of analyses, start with the most recent analysis and work backwards. Conceptually, the process is similar to the undo function in a text editor.  When you list the analyses for a repository, one or more will be identified as deletable in the response:  &#x60;&#x60;&#x60; \&quot;deletable\&quot;: true &#x60;&#x60;&#x60;  An analysis is deletable when it&#39;s the most recent in a set of analyses. Typically, a repository will have multiple sets of analyses for each enabled code scanning tool, where a set is determined by a unique combination of analysis values:  * &#x60;ref&#x60; * &#x60;tool&#x60; * &#x60;category&#x60;  If you attempt to delete an analysis that is not the most recent in a set, you&#39;ll get a 400 response with the message:  &#x60;&#x60;&#x60; Analysis specified is not deletable. &#x60;&#x60;&#x60;  The response from a successful &#x60;DELETE&#x60; operation provides you with two alternative URLs for deleting the next analysis in the set: &#x60;next_analysis_url&#x60; and &#x60;confirm_delete_url&#x60;. Use the &#x60;next_analysis_url&#x60; URL if you want to avoid accidentally deleting the final analysis in a set. This is a useful option if you want to preserve at least one analysis for the specified tool in your repository. Use the &#x60;confirm_delete_url&#x60; URL if you are content to remove all analyses for a tool. When you delete the last analysis in a set, the value of &#x60;next_analysis_url&#x60; and &#x60;confirm_delete_url&#x60; in the 200 response is &#x60;null&#x60;.  As an example of the deletion process, let&#39;s imagine that you added a workflow that configured a particular code scanning tool to analyze the code in a repository. This tool has added 15 analyses: 10 on the default branch, and another 5 on a topic branch. You therefore have two separate sets of analyses for this tool. You&#39;ve now decided that you want to remove all of the analyses for the tool. To do this you must make 15 separate deletion requests. To start, you must find an analysis that&#39;s identified as deletable. Each set of analyses always has one that&#39;s identified as deletable. Having found the deletable analysis for one of the two sets, delete this analysis and then continue deleting the next analysis in the set until they&#39;re all deleted. Then repeat the process for the second set. The procedure therefore consists of a nested loop:  **Outer loop**: * List the analyses for the repository, filtered by tool. * Parse this list to find a deletable analysis. If found:    **Inner loop**:   * Delete the identified analysis.   * Parse the response for the value of &#x60;confirm_delete_url&#x60; and, if found, use this in the next iteration.  The above process assumes that you want to remove all trace of the tool&#39;s analyses from the GitHub user interface, for the specified repository, and it therefore uses the &#x60;confirm_delete_url&#x60; value. Alternatively, you could use the &#x60;next_analysis_url&#x60; value, which would leave the last analysis in each set undeleted to avoid removing a tool&#39;s analysis entirely.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodeScanningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodeScanningApi apiInstance = new CodeScanningApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer analysisId = 56; // Integer | The ID of the analysis, as returned from the `GET /repos/{owner}/{repo}/code-scanning/analyses` operation.
    String confirmDelete = "confirmDelete_example"; // String | Allow deletion if the specified analysis is the last in a set. If you attempt to delete the final analysis in a set without setting this parameter to `true`, you'll get a 400 response with the message: `Analysis is last of its type and deletion may result in the loss of historical alert data. Please specify confirm_delete.`
    try {
      CodeScanningAnalysisDeletion result = apiInstance.codeScanningDeleteAnalysis(owner, repo, analysisId, confirmDelete);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeScanningApi#codeScanningDeleteAnalysis");
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
| **analysisId** | **Integer**| The ID of the analysis, as returned from the &#x60;GET /repos/{owner}/{repo}/code-scanning/analyses&#x60; operation. | |
| **confirmDelete** | **String**| Allow deletion if the specified analysis is the last in a set. If you attempt to delete the final analysis in a set without setting this parameter to &#x60;true&#x60;, you&#39;ll get a 400 response with the message: &#x60;Analysis is last of its type and deletion may result in the loss of historical alert data. Please specify confirm_delete.&#x60; | [optional] |

### Return type

[**CodeScanningAnalysisDeletion**](CodeScanningAnalysisDeletion.md)

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
| **403** | Response if the repository is archived or if GitHub Advanced Security is not enabled for this repository |  -  |
| **404** | Resource not found |  -  |
| **503** | Service unavailable |  -  |

<a name="codeScanningGetAlert"></a>
# **codeScanningGetAlert**
> CodeScanningAlert codeScanningGetAlert(owner, repo, alertNumber)

Get a code scanning alert

Gets a single code scanning alert. You must use an access token with the &#x60;security_events&#x60; scope to use this endpoint with private repos, the &#x60;public_repo&#x60; scope also grants permission to read security events on public repos only. GitHub Apps must have the &#x60;security_events&#x60; read permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodeScanningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodeScanningApi apiInstance = new CodeScanningApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer alertNumber = 56; // Integer | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation.
    try {
      CodeScanningAlert result = apiInstance.codeScanningGetAlert(owner, repo, alertNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeScanningApi#codeScanningGetAlert");
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
| **alertNumber** | **Integer**| The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the &#x60;number&#x60; field in the response from the &#x60;GET /repos/{owner}/{repo}/code-scanning/alerts&#x60; operation. | |

### Return type

[**CodeScanningAlert**](CodeScanningAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **304** | Not modified |  -  |
| **403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |
| **404** | Resource not found |  -  |
| **503** | Service unavailable |  -  |

<a name="codeScanningGetAnalysis"></a>
# **codeScanningGetAnalysis**
> CodeScanningAnalysis codeScanningGetAnalysis(owner, repo, analysisId)

Get a code scanning analysis for a repository

Gets a specified code scanning analysis for a repository. You must use an access token with the &#x60;security_events&#x60; scope to use this endpoint with private repos, the &#x60;public_repo&#x60; scope also grants permission to read security events on public repos only. GitHub Apps must have the &#x60;security_events&#x60; read permission to use this endpoint.  The default JSON response contains fields that describe the analysis. This includes the Git reference and commit SHA to which the analysis relates, the datetime of the analysis, the name of the code scanning tool, and the number of alerts.  The &#x60;rules_count&#x60; field in the default response give the number of rules that were run in the analysis. For very old analyses this data is not available, and &#x60;0&#x60; is returned in this field.  If you use the Accept header &#x60;application/sarif+json&#x60;, the response contains the analysis data that was uploaded. This is formatted as [SARIF version 2.1.0](https://docs.oasis-open.org/sarif/sarif/v2.1.0/cs01/sarif-v2.1.0-cs01.html).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodeScanningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodeScanningApi apiInstance = new CodeScanningApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer analysisId = 56; // Integer | The ID of the analysis, as returned from the `GET /repos/{owner}/{repo}/code-scanning/analyses` operation.
    try {
      CodeScanningAnalysis result = apiInstance.codeScanningGetAnalysis(owner, repo, analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeScanningApi#codeScanningGetAnalysis");
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
| **analysisId** | **Integer**| The ID of the analysis, as returned from the &#x60;GET /repos/{owner}/{repo}/code-scanning/analyses&#x60; operation. | |

### Return type

[**CodeScanningAnalysis**](CodeScanningAnalysis.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json+sarif

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |
| **404** | Resource not found |  -  |
| **503** | Service unavailable |  -  |

<a name="codeScanningGetCodeqlDatabase"></a>
# **codeScanningGetCodeqlDatabase**
> CodeScanningCodeqlDatabase codeScanningGetCodeqlDatabase(owner, repo, language)

Get a CodeQL database for a repository

Gets a CodeQL database for a language in a repository.  By default this endpoint returns JSON metadata about the CodeQL database. To download the CodeQL database binary content, set the &#x60;Accept&#x60; header of the request to [&#x60;application/zip&#x60;](https://docs.github.com/rest/overview/media-types), and make sure your HTTP client is configured to follow redirects or use the &#x60;Location&#x60; header to make a second request to get the redirect URL.  For private repositories, you must use an access token with the &#x60;security_events&#x60; scope. For public repositories, you can use tokens with the &#x60;security_events&#x60; or &#x60;public_repo&#x60; scope. GitHub Apps must have the &#x60;contents&#x60; read permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodeScanningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodeScanningApi apiInstance = new CodeScanningApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String language = "language_example"; // String | The language of the CodeQL database.
    try {
      CodeScanningCodeqlDatabase result = apiInstance.codeScanningGetCodeqlDatabase(owner, repo, language);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeScanningApi#codeScanningGetCodeqlDatabase");
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
| **language** | **String**| The language of the CodeQL database. | |

### Return type

[**CodeScanningCodeqlDatabase**](CodeScanningCodeqlDatabase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **302** | Found |  -  |
| **403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |
| **404** | Resource not found |  -  |
| **503** | Service unavailable |  -  |

<a name="codeScanningGetDefaultSetup"></a>
# **codeScanningGetDefaultSetup**
> CodeScanningDefaultSetup codeScanningGetDefaultSetup(owner, repo)

Get a code scanning default setup configuration

Gets a code scanning default setup configuration. You must use an access token with the &#x60;repo&#x60; scope to use this endpoint with private repos or the &#x60;public_repo&#x60; scope for public repos. GitHub Apps must have the &#x60;repo&#x60; write permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodeScanningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodeScanningApi apiInstance = new CodeScanningApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      CodeScanningDefaultSetup result = apiInstance.codeScanningGetDefaultSetup(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeScanningApi#codeScanningGetDefaultSetup");
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

[**CodeScanningDefaultSetup**](CodeScanningDefaultSetup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |
| **404** | Resource not found |  -  |
| **503** | Service unavailable |  -  |

<a name="codeScanningGetSarif"></a>
# **codeScanningGetSarif**
> CodeScanningSarifsStatus codeScanningGetSarif(owner, repo, sarifId)

Get information about a SARIF upload

Gets information about a SARIF upload, including the status and the URL of the analysis that was uploaded so that you can retrieve details of the analysis. For more information, see \&quot;[Get a code scanning analysis for a repository](/rest/reference/code-scanning#get-a-code-scanning-analysis-for-a-repository).\&quot; You must use an access token with the &#x60;security_events&#x60; scope to use this endpoint with private repos, the &#x60;public_repo&#x60; scope also grants permission to read security events on public repos only. GitHub Apps must have the &#x60;security_events&#x60; read permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodeScanningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodeScanningApi apiInstance = new CodeScanningApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String sarifId = "sarifId_example"; // String | The SARIF ID obtained after uploading.
    try {
      CodeScanningSarifsStatus result = apiInstance.codeScanningGetSarif(owner, repo, sarifId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeScanningApi#codeScanningGetSarif");
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
| **sarifId** | **String**| The SARIF ID obtained after uploading. | |

### Return type

[**CodeScanningSarifsStatus**](CodeScanningSarifsStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |
| **404** | Not Found if the sarif id does not match any upload |  -  |
| **503** | Service unavailable |  -  |

<a name="codeScanningListAlertInstances"></a>
# **codeScanningListAlertInstances**
> List&lt;CodeScanningAlertInstance&gt; codeScanningListAlertInstances(owner, repo, alertNumber, page, perPage, ref)

List instances of a code scanning alert

Lists all instances of the specified code scanning alert. You must use an access token with the &#x60;security_events&#x60; scope to use this endpoint with private repos, the &#x60;public_repo&#x60; scope also grants permission to read security events on public repos only. GitHub Apps must have the &#x60;security_events&#x60; read permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodeScanningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodeScanningApi apiInstance = new CodeScanningApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer alertNumber = 56; // Integer | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation.
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    String ref = "ref_example"; // String | The Git reference for the results you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
    try {
      List<CodeScanningAlertInstance> result = apiInstance.codeScanningListAlertInstances(owner, repo, alertNumber, page, perPage, ref);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeScanningApi#codeScanningListAlertInstances");
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
| **alertNumber** | **Integer**| The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the &#x60;number&#x60; field in the response from the &#x60;GET /repos/{owner}/{repo}/code-scanning/alerts&#x60; operation. | |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **ref** | **String**| The Git reference for the results you want to list. The &#x60;ref&#x60; for a branch can be formatted either as &#x60;refs/heads/&lt;branch name&gt;&#x60; or simply &#x60;&lt;branch name&gt;&#x60;. To reference a pull request use &#x60;refs/pull/&lt;number&gt;/merge&#x60;. | [optional] |

### Return type

[**List&lt;CodeScanningAlertInstance&gt;**](CodeScanningAlertInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |
| **404** | Resource not found |  -  |
| **503** | Service unavailable |  -  |

<a name="codeScanningListAlertsForOrg"></a>
# **codeScanningListAlertsForOrg**
> List&lt;CodeScanningOrganizationAlertItems&gt; codeScanningListAlertsForOrg(org, toolName, toolGuid, before, after, page, perPage, direction, state, sort, severity)

List code scanning alerts for an organization

Lists code scanning alerts for the default branch for all eligible repositories in an organization. Eligible repositories are repositories that are owned by organizations that you own or for which you are a security manager. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  To use this endpoint, you must be an owner or security manager for the organization, and you must use an access token with the &#x60;repo&#x60; scope or &#x60;security_events&#x60; scope.  For public repositories, you may instead use the &#x60;public_repo&#x60; scope.  GitHub Apps must have the &#x60;security_events&#x60; read permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodeScanningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodeScanningApi apiInstance = new CodeScanningApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String toolName = "toolName_example"; // String | The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either `tool_name` or `tool_guid`, but not both.
    String toolGuid = "toolGuid_example"; // String | The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid` or `tool_name`, but not both.
    String before = "before_example"; // String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor.
    String after = "after_example"; // String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor.
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    String direction = "asc"; // String | The direction to sort the results by.
    CodeScanningAlertState state = CodeScanningAlertState.fromValue("open"); // CodeScanningAlertState | If specified, only code scanning alerts with this state will be returned.
    String sort = "created"; // String | The property by which to sort the results.
    CodeScanningAlertSeverity severity = CodeScanningAlertSeverity.fromValue("critical"); // CodeScanningAlertSeverity | If specified, only code scanning alerts with this severity will be returned.
    try {
      List<CodeScanningOrganizationAlertItems> result = apiInstance.codeScanningListAlertsForOrg(org, toolName, toolGuid, before, after, page, perPage, direction, state, sort, severity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeScanningApi#codeScanningListAlertsForOrg");
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
| **toolName** | **String**| The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either &#x60;tool_name&#x60; or &#x60;tool_guid&#x60;, but not both. | [optional] |
| **toolGuid** | **String**| The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either &#x60;tool_guid&#x60; or &#x60;tool_name&#x60;, but not both. | [optional] |
| **before** | **String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. | [optional] |
| **after** | **String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. | [optional] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **direction** | **String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc] |
| **state** | [**CodeScanningAlertState**](.md)| If specified, only code scanning alerts with this state will be returned. | [optional] [enum: open, closed, dismissed, fixed] |
| **sort** | **String**| The property by which to sort the results. | [optional] [default to created] [enum: created, updated] |
| **severity** | [**CodeScanningAlertSeverity**](.md)| If specified, only code scanning alerts with this severity will be returned. | [optional] [enum: critical, high, medium, low, warning, note, error] |

### Return type

[**List&lt;CodeScanningOrganizationAlertItems&gt;**](CodeScanningOrganizationAlertItems.md)

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
| **503** | Service unavailable |  -  |

<a name="codeScanningListAlertsForRepo"></a>
# **codeScanningListAlertsForRepo**
> List&lt;CodeScanningAlertItems&gt; codeScanningListAlertsForRepo(owner, repo, toolName, toolGuid, page, perPage, ref, direction, sort, state, severity)

List code scanning alerts for a repository

Lists code scanning alerts.  To use this endpoint, you must use an access token with the &#x60;security_events&#x60; scope or, for alerts from public repositories only, an access token with the &#x60;public_repo&#x60; scope.  GitHub Apps must have the &#x60;security_events&#x60; read permission to use this endpoint.  The response includes a &#x60;most_recent_instance&#x60; object. This provides details of the most recent instance of this alert for the default branch (or for the specified Git reference if you used &#x60;ref&#x60; in the request).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodeScanningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodeScanningApi apiInstance = new CodeScanningApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String toolName = "toolName_example"; // String | The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either `tool_name` or `tool_guid`, but not both.
    String toolGuid = "toolGuid_example"; // String | The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid` or `tool_name`, but not both.
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    String ref = "ref_example"; // String | The Git reference for the results you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
    String direction = "asc"; // String | The direction to sort the results by.
    String sort = "created"; // String | The property by which to sort the results.
    CodeScanningAlertState state = CodeScanningAlertState.fromValue("open"); // CodeScanningAlertState | If specified, only code scanning alerts with this state will be returned.
    CodeScanningAlertSeverity severity = CodeScanningAlertSeverity.fromValue("critical"); // CodeScanningAlertSeverity | If specified, only code scanning alerts with this severity will be returned.
    try {
      List<CodeScanningAlertItems> result = apiInstance.codeScanningListAlertsForRepo(owner, repo, toolName, toolGuid, page, perPage, ref, direction, sort, state, severity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeScanningApi#codeScanningListAlertsForRepo");
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
| **toolName** | **String**| The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either &#x60;tool_name&#x60; or &#x60;tool_guid&#x60;, but not both. | [optional] |
| **toolGuid** | **String**| The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either &#x60;tool_guid&#x60; or &#x60;tool_name&#x60;, but not both. | [optional] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **ref** | **String**| The Git reference for the results you want to list. The &#x60;ref&#x60; for a branch can be formatted either as &#x60;refs/heads/&lt;branch name&gt;&#x60; or simply &#x60;&lt;branch name&gt;&#x60;. To reference a pull request use &#x60;refs/pull/&lt;number&gt;/merge&#x60;. | [optional] |
| **direction** | **String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc] |
| **sort** | **String**| The property by which to sort the results. | [optional] [default to created] [enum: created, updated] |
| **state** | [**CodeScanningAlertState**](.md)| If specified, only code scanning alerts with this state will be returned. | [optional] [enum: open, closed, dismissed, fixed] |
| **severity** | [**CodeScanningAlertSeverity**](.md)| If specified, only code scanning alerts with this severity will be returned. | [optional] [enum: critical, high, medium, low, warning, note, error] |

### Return type

[**List&lt;CodeScanningAlertItems&gt;**](CodeScanningAlertItems.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **304** | Not modified |  -  |
| **403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |
| **404** | Resource not found |  -  |
| **503** | Service unavailable |  -  |

<a name="codeScanningListCodeqlDatabases"></a>
# **codeScanningListCodeqlDatabases**
> List&lt;CodeScanningCodeqlDatabase&gt; codeScanningListCodeqlDatabases(owner, repo)

List CodeQL databases for a repository

Lists the CodeQL databases that are available in a repository.  For private repositories, you must use an access token with the &#x60;security_events&#x60; scope. For public repositories, you can use tokens with the &#x60;security_events&#x60; or &#x60;public_repo&#x60; scope. GitHub Apps must have the &#x60;contents&#x60; read permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodeScanningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodeScanningApi apiInstance = new CodeScanningApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      List<CodeScanningCodeqlDatabase> result = apiInstance.codeScanningListCodeqlDatabases(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeScanningApi#codeScanningListCodeqlDatabases");
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

[**List&lt;CodeScanningCodeqlDatabase&gt;**](CodeScanningCodeqlDatabase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |
| **404** | Resource not found |  -  |
| **503** | Service unavailable |  -  |

<a name="codeScanningListRecentAnalyses"></a>
# **codeScanningListRecentAnalyses**
> List&lt;CodeScanningAnalysis&gt; codeScanningListRecentAnalyses(owner, repo, toolName, toolGuid, page, perPage, ref, sarifId, direction, sort)

List code scanning analyses for a repository

Lists the details of all code scanning analyses for a repository, starting with the most recent. The response is paginated and you can use the &#x60;page&#x60; and &#x60;per_page&#x60; parameters to list the analyses you&#39;re interested in. By default 30 analyses are listed per page.  The &#x60;rules_count&#x60; field in the response give the number of rules that were run in the analysis. For very old analyses this data is not available, and &#x60;0&#x60; is returned in this field.  You must use an access token with the &#x60;security_events&#x60; scope to use this endpoint with private repos, the &#x60;public_repo&#x60; scope also grants permission to read security events on public repos only. GitHub Apps must have the &#x60;security_events&#x60; read permission to use this endpoint.  **Deprecation notice**: The &#x60;tool_name&#x60; field is deprecated and will, in future, not be included in the response for this endpoint. The example response reflects this change. The tool name can now be found inside the &#x60;tool&#x60; field.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodeScanningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodeScanningApi apiInstance = new CodeScanningApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String toolName = "toolName_example"; // String | The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either `tool_name` or `tool_guid`, but not both.
    String toolGuid = "toolGuid_example"; // String | The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid` or `tool_name`, but not both.
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    String ref = "ref_example"; // String | The Git reference for the analyses you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
    String sarifId = "sarifId_example"; // String | Filter analyses belonging to the same SARIF upload.
    String direction = "asc"; // String | The direction to sort the results by.
    String sort = "created"; // String | The property by which to sort the results.
    try {
      List<CodeScanningAnalysis> result = apiInstance.codeScanningListRecentAnalyses(owner, repo, toolName, toolGuid, page, perPage, ref, sarifId, direction, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeScanningApi#codeScanningListRecentAnalyses");
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
| **toolName** | **String**| The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either &#x60;tool_name&#x60; or &#x60;tool_guid&#x60;, but not both. | [optional] |
| **toolGuid** | **String**| The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either &#x60;tool_guid&#x60; or &#x60;tool_name&#x60;, but not both. | [optional] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **ref** | **String**| The Git reference for the analyses you want to list. The &#x60;ref&#x60; for a branch can be formatted either as &#x60;refs/heads/&lt;branch name&gt;&#x60; or simply &#x60;&lt;branch name&gt;&#x60;. To reference a pull request use &#x60;refs/pull/&lt;number&gt;/merge&#x60;. | [optional] |
| **sarifId** | **String**| Filter analyses belonging to the same SARIF upload. | [optional] |
| **direction** | **String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc] |
| **sort** | **String**| The property by which to sort the results. | [optional] [default to created] [enum: created] |

### Return type

[**List&lt;CodeScanningAnalysis&gt;**](CodeScanningAnalysis.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |
| **404** | Resource not found |  -  |
| **503** | Service unavailable |  -  |

<a name="codeScanningUpdateAlert"></a>
# **codeScanningUpdateAlert**
> CodeScanningAlert codeScanningUpdateAlert(owner, repo, alertNumber, codeScanningUpdateAlertRequest)

Update a code scanning alert

Updates the status of a single code scanning alert. You must use an access token with the &#x60;security_events&#x60; scope to use this endpoint with private repositories. You can also use tokens with the &#x60;public_repo&#x60; scope for public repositories only. GitHub Apps must have the &#x60;security_events&#x60; write permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodeScanningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodeScanningApi apiInstance = new CodeScanningApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer alertNumber = 56; // Integer | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation.
    CodeScanningUpdateAlertRequest codeScanningUpdateAlertRequest = new CodeScanningUpdateAlertRequest(); // CodeScanningUpdateAlertRequest | 
    try {
      CodeScanningAlert result = apiInstance.codeScanningUpdateAlert(owner, repo, alertNumber, codeScanningUpdateAlertRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeScanningApi#codeScanningUpdateAlert");
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
| **alertNumber** | **Integer**| The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the &#x60;number&#x60; field in the response from the &#x60;GET /repos/{owner}/{repo}/code-scanning/alerts&#x60; operation. | |
| **codeScanningUpdateAlertRequest** | [**CodeScanningUpdateAlertRequest**](CodeScanningUpdateAlertRequest.md)|  | |

### Return type

[**CodeScanningAlert**](CodeScanningAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Response if the repository is archived or if GitHub Advanced Security is not enabled for this repository |  -  |
| **404** | Resource not found |  -  |
| **503** | Service unavailable |  -  |

<a name="codeScanningUpdateDefaultSetup"></a>
# **codeScanningUpdateDefaultSetup**
> Object codeScanningUpdateDefaultSetup(owner, repo, codeScanningDefaultSetupUpdate)

Update a code scanning default setup configuration

Updates a code scanning default setup configuration. You must use an access token with the &#x60;repo&#x60; scope to use this endpoint with private repos or the &#x60;public_repo&#x60; scope for public repos. GitHub Apps must have the &#x60;repo&#x60; write permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodeScanningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodeScanningApi apiInstance = new CodeScanningApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    CodeScanningDefaultSetupUpdate codeScanningDefaultSetupUpdate = new CodeScanningDefaultSetupUpdate(); // CodeScanningDefaultSetupUpdate | 
    try {
      Object result = apiInstance.codeScanningUpdateDefaultSetup(owner, repo, codeScanningDefaultSetupUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeScanningApi#codeScanningUpdateDefaultSetup");
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
| **codeScanningDefaultSetupUpdate** | [**CodeScanningDefaultSetupUpdate**](CodeScanningDefaultSetupUpdate.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **202** | Response |  -  |
| **403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |
| **404** | Resource not found |  -  |
| **409** | Response if there is already a validation run in progress with a different default setup configuration |  -  |
| **503** | Service unavailable |  -  |

<a name="codeScanningUploadSarif"></a>
# **codeScanningUploadSarif**
> CodeScanningSarifsReceipt codeScanningUploadSarif(owner, repo, codeScanningUploadSarifRequest)

Upload an analysis as SARIF data

Uploads SARIF data containing the results of a code scanning analysis to make the results available in a repository. You must use an access token with the &#x60;security_events&#x60; scope to use this endpoint for private repositories. You can also use tokens with the &#x60;public_repo&#x60; scope for public repositories only. GitHub Apps must have the &#x60;security_events&#x60; write permission to use this endpoint.  There are two places where you can upload code scanning results.  - If you upload to a pull request, for example &#x60;--ref refs/pull/42/merge&#x60; or &#x60;--ref refs/pull/42/head&#x60;, then the results appear as alerts in a pull request check. For more information, see \&quot;[Triaging code scanning alerts in pull requests](/code-security/secure-coding/triaging-code-scanning-alerts-in-pull-requests).\&quot;  - If you upload to a branch, for example &#x60;--ref refs/heads/my-branch&#x60;, then the results appear in the **Security** tab for your repository. For more information, see \&quot;[Managing code scanning alerts for your repository](/code-security/secure-coding/managing-code-scanning-alerts-for-your-repository#viewing-the-alerts-for-a-repository).\&quot;  You must compress the SARIF-formatted analysis data that you want to upload, using &#x60;gzip&#x60;, and then encode it as a Base64 format string. For example:  &#x60;&#x60;&#x60; gzip -c analysis-data.sarif | base64 -w0 &#x60;&#x60;&#x60; &lt;br&gt; SARIF upload supports a maximum number of entries per the following data objects, and an analysis will be rejected if any of these objects is above its maximum value. For some objects, there are additional values over which the entries will be ignored while keeping the most important entries whenever applicable. To get the most out of your analysis when it includes data above the supported limits, try to optimize the analysis configuration. For example, for the CodeQL tool, identify and remove the most noisy queries.   | **SARIF data**                   | **Maximum values** | **Additional limits**                                                            | |----------------------------------|:------------------:|----------------------------------------------------------------------------------| | Runs per file                    |         20         |                                                                                  | | Results per run                  |       25,000       | Only the top 5,000 results will be included, prioritized by severity.            | | Rules per run                    |       25,000       |                                                                                  | | Tool extensions per run          |        100         |                                                                                  | | Thread Flow Locations per result |       10,000       | Only the top 1,000 Thread Flow Locations will be included, using prioritization. | | Location per result              |       1,000        | Only 100 locations will be included.                                             | | Tags per rule                    |         20         | Only 10 tags will be included.                                                   |   The &#x60;202 Accepted&#x60; response includes an &#x60;id&#x60; value. You can use this ID to check the status of the upload by using it in the &#x60;/sarifs/{sarif_id}&#x60; endpoint. For more information, see \&quot;[Get information about a SARIF upload](/rest/reference/code-scanning#get-information-about-a-sarif-upload).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodeScanningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodeScanningApi apiInstance = new CodeScanningApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    CodeScanningUploadSarifRequest codeScanningUploadSarifRequest = new CodeScanningUploadSarifRequest(); // CodeScanningUploadSarifRequest | 
    try {
      CodeScanningSarifsReceipt result = apiInstance.codeScanningUploadSarif(owner, repo, codeScanningUploadSarifRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeScanningApi#codeScanningUploadSarif");
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
| **codeScanningUploadSarifRequest** | [**CodeScanningUploadSarifRequest**](CodeScanningUploadSarifRequest.md)|  | |

### Return type

[**CodeScanningSarifsReceipt**](CodeScanningSarifsReceipt.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Response |  -  |
| **400** | Bad Request if the sarif field is invalid |  -  |
| **403** | Response if the repository is archived or if GitHub Advanced Security is not enabled for this repository |  -  |
| **404** | Resource not found |  -  |
| **413** | Payload Too Large if the sarif field is too large |  -  |
| **503** | Service unavailable |  -  |

