# LicensesApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**licensesGet**](LicensesApi.md#licensesGet) | **GET** /licenses/{license} | Get a license |
| [**licensesGetAllCommonlyUsed**](LicensesApi.md#licensesGetAllCommonlyUsed) | **GET** /licenses | Get all commonly used licenses |
| [**licensesGetForRepo**](LicensesApi.md#licensesGetForRepo) | **GET** /repos/{owner}/{repo}/license | Get the license for a repository |


<a name="licensesGet"></a>
# **licensesGet**
> License licensesGet(license)

Get a license



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicensesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    LicensesApi apiInstance = new LicensesApi(defaultClient);
    String license = "license_example"; // String | 
    try {
      License result = apiInstance.licensesGet(license);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensesApi#licensesGet");
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
| **license** | **String**|  | |

### Return type

[**License**](License.md)

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
| **304** | Not modified |  -  |

<a name="licensesGetAllCommonlyUsed"></a>
# **licensesGetAllCommonlyUsed**
> List&lt;LicenseSimple&gt; licensesGetAllCommonlyUsed(featured, perPage, page)

Get all commonly used licenses



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicensesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    LicensesApi apiInstance = new LicensesApi(defaultClient);
    Boolean featured = true; // Boolean | 
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<LicenseSimple> result = apiInstance.licensesGetAllCommonlyUsed(featured, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensesApi#licensesGetAllCommonlyUsed");
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
| **featured** | **Boolean**|  | [optional] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;LicenseSimple&gt;**](LicenseSimple.md)

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

<a name="licensesGetForRepo"></a>
# **licensesGetForRepo**
> LicenseContent licensesGetForRepo(owner, repo)

Get the license for a repository

This method returns the contents of the repository&#39;s license file, if one is detected.  Similar to [Get repository content](https://docs.github.com/rest/reference/repos#get-repository-content), this method also supports [custom media types](https://docs.github.com/rest/overview/media-types) for retrieving the raw license content or rendered license HTML.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LicensesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    LicensesApi apiInstance = new LicensesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      LicenseContent result = apiInstance.licensesGetForRepo(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensesApi#licensesGetForRepo");
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

[**LicenseContent**](LicenseContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

