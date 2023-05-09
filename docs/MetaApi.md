# MetaApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**metaGet**](MetaApi.md#metaGet) | **GET** /meta | Get GitHub meta information |
| [**metaGetAllVersions**](MetaApi.md#metaGetAllVersions) | **GET** /versions | Get all API versions |
| [**metaGetOctocat**](MetaApi.md#metaGetOctocat) | **GET** /octocat | Get Octocat |
| [**metaGetZen**](MetaApi.md#metaGetZen) | **GET** /zen | Get the Zen of GitHub |
| [**metaRoot**](MetaApi.md#metaRoot) | **GET** / | GitHub API Root |


<a name="metaGet"></a>
# **metaGet**
> ApiOverview metaGet()

Get GitHub meta information

Returns meta information about GitHub, including a list of GitHub&#39;s IP addresses. For more information, see \&quot;[About GitHub&#39;s IP addresses](https://docs.github.com/articles/about-github-s-ip-addresses/).\&quot;  The values shown in the documentation&#39;s response are example values. You must always query the API directly to get the latest values.  **Note:** This endpoint returns both IPv4 and IPv6 addresses. However, not all features support IPv6. You should refer to the specific documentation for each feature to determine if IPv6 is supported.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MetaApi apiInstance = new MetaApi(defaultClient);
    try {
      ApiOverview result = apiInstance.metaGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaApi#metaGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiOverview**](ApiOverview.md)

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

<a name="metaGetAllVersions"></a>
# **metaGetAllVersions**
> List&lt;LocalDate&gt; metaGetAllVersions()

Get all API versions

Get all supported GitHub API versions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MetaApi apiInstance = new MetaApi(defaultClient);
    try {
      List<LocalDate> result = apiInstance.metaGetAllVersions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaApi#metaGetAllVersions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LocalDate&gt;**](LocalDate.md)

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

<a name="metaGetOctocat"></a>
# **metaGetOctocat**
> String metaGetOctocat(s)

Get Octocat

Get the octocat as ASCII art

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MetaApi apiInstance = new MetaApi(defaultClient);
    String s = "s_example"; // String | The words to show in Octocat's speech bubble
    try {
      String result = apiInstance.metaGetOctocat(s);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaApi#metaGetOctocat");
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
| **s** | **String**| The words to show in Octocat&#39;s speech bubble | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octocat-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="metaGetZen"></a>
# **metaGetZen**
> String metaGetZen()

Get the Zen of GitHub

Get a random sentence from the Zen of GitHub

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MetaApi apiInstance = new MetaApi(defaultClient);
    try {
      String result = apiInstance.metaGetZen();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaApi#metaGetZen");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="metaRoot"></a>
# **metaRoot**
> Root metaRoot()

GitHub API Root

Get Hypermedia links to resources accessible in GitHub&#39;s REST API

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    MetaApi apiInstance = new MetaApi(defaultClient);
    try {
      Root result = apiInstance.metaRoot();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaApi#metaRoot");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Root**](Root.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

