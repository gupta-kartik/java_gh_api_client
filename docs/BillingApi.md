# BillingApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**billingGetGithubActionsBillingOrg**](BillingApi.md#billingGetGithubActionsBillingOrg) | **GET** /orgs/{org}/settings/billing/actions | Get GitHub Actions billing for an organization |
| [**billingGetGithubActionsBillingUser**](BillingApi.md#billingGetGithubActionsBillingUser) | **GET** /users/{username}/settings/billing/actions | Get GitHub Actions billing for a user |
| [**billingGetGithubPackagesBillingOrg**](BillingApi.md#billingGetGithubPackagesBillingOrg) | **GET** /orgs/{org}/settings/billing/packages | Get GitHub Packages billing for an organization |
| [**billingGetGithubPackagesBillingUser**](BillingApi.md#billingGetGithubPackagesBillingUser) | **GET** /users/{username}/settings/billing/packages | Get GitHub Packages billing for a user |
| [**billingGetSharedStorageBillingOrg**](BillingApi.md#billingGetSharedStorageBillingOrg) | **GET** /orgs/{org}/settings/billing/shared-storage | Get shared storage billing for an organization |
| [**billingGetSharedStorageBillingUser**](BillingApi.md#billingGetSharedStorageBillingUser) | **GET** /users/{username}/settings/billing/shared-storage | Get shared storage billing for a user |


<a name="billingGetGithubActionsBillingOrg"></a>
# **billingGetGithubActionsBillingOrg**
> ActionsBillingUsage billingGetGithubActionsBillingOrg(org)

Get GitHub Actions billing for an organization

Gets the summary of the free and paid GitHub Actions minutes used.  Paid minutes only apply to workflows in private repositories that use GitHub-hosted runners. Minutes used is listed for each GitHub-hosted runner operating system. Any job re-runs are also included in the usage. The usage returned includes any minute multipliers for macOS and Windows runners, and is rounded up to the nearest whole minute. For more information, see \&quot;[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)\&quot;.  Access tokens must have the &#x60;repo&#x60; or &#x60;admin:org&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    BillingApi apiInstance = new BillingApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      ActionsBillingUsage result = apiInstance.billingGetGithubActionsBillingOrg(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#billingGetGithubActionsBillingOrg");
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

### Return type

[**ActionsBillingUsage**](ActionsBillingUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="billingGetGithubActionsBillingUser"></a>
# **billingGetGithubActionsBillingUser**
> ActionsBillingUsage billingGetGithubActionsBillingUser(username)

Get GitHub Actions billing for a user

Gets the summary of the free and paid GitHub Actions minutes used.  Paid minutes only apply to workflows in private repositories that use GitHub-hosted runners. Minutes used is listed for each GitHub-hosted runner operating system. Any job re-runs are also included in the usage. The usage returned includes any minute multipliers for macOS and Windows runners, and is rounded up to the nearest whole minute. For more information, see \&quot;[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)\&quot;.  Access tokens must have the &#x60;user&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    BillingApi apiInstance = new BillingApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      ActionsBillingUsage result = apiInstance.billingGetGithubActionsBillingUser(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#billingGetGithubActionsBillingUser");
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
| **username** | **String**| The handle for the GitHub user account. | |

### Return type

[**ActionsBillingUsage**](ActionsBillingUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="billingGetGithubPackagesBillingOrg"></a>
# **billingGetGithubPackagesBillingOrg**
> PackagesBillingUsage billingGetGithubPackagesBillingOrg(org)

Get GitHub Packages billing for an organization

Gets the free and paid storage used for GitHub Packages in gigabytes.  Paid minutes only apply to packages stored for private repositories. For more information, see \&quot;[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages).\&quot;  Access tokens must have the &#x60;repo&#x60; or &#x60;admin:org&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    BillingApi apiInstance = new BillingApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      PackagesBillingUsage result = apiInstance.billingGetGithubPackagesBillingOrg(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#billingGetGithubPackagesBillingOrg");
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

### Return type

[**PackagesBillingUsage**](PackagesBillingUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="billingGetGithubPackagesBillingUser"></a>
# **billingGetGithubPackagesBillingUser**
> PackagesBillingUsage billingGetGithubPackagesBillingUser(username)

Get GitHub Packages billing for a user

Gets the free and paid storage used for GitHub Packages in gigabytes.  Paid minutes only apply to packages stored for private repositories. For more information, see \&quot;[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages).\&quot;  Access tokens must have the &#x60;user&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    BillingApi apiInstance = new BillingApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      PackagesBillingUsage result = apiInstance.billingGetGithubPackagesBillingUser(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#billingGetGithubPackagesBillingUser");
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
| **username** | **String**| The handle for the GitHub user account. | |

### Return type

[**PackagesBillingUsage**](PackagesBillingUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="billingGetSharedStorageBillingOrg"></a>
# **billingGetSharedStorageBillingOrg**
> CombinedBillingUsage billingGetSharedStorageBillingOrg(org)

Get shared storage billing for an organization

Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub Packages.  Paid minutes only apply to packages stored for private repositories. For more information, see \&quot;[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages).\&quot;  Access tokens must have the &#x60;repo&#x60; or &#x60;admin:org&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    BillingApi apiInstance = new BillingApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      CombinedBillingUsage result = apiInstance.billingGetSharedStorageBillingOrg(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#billingGetSharedStorageBillingOrg");
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

### Return type

[**CombinedBillingUsage**](CombinedBillingUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="billingGetSharedStorageBillingUser"></a>
# **billingGetSharedStorageBillingUser**
> CombinedBillingUsage billingGetSharedStorageBillingUser(username)

Get shared storage billing for a user

Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub Packages.  Paid minutes only apply to packages stored for private repositories. For more information, see \&quot;[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages).\&quot;  Access tokens must have the &#x60;user&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    BillingApi apiInstance = new BillingApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      CombinedBillingUsage result = apiInstance.billingGetSharedStorageBillingUser(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#billingGetSharedStorageBillingUser");
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
| **username** | **String**| The handle for the GitHub user account. | |

### Return type

[**CombinedBillingUsage**](CombinedBillingUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

