# InteractionsApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**interactionsGetRestrictionsForAuthenticatedUser**](InteractionsApi.md#interactionsGetRestrictionsForAuthenticatedUser) | **GET** /user/interaction-limits | Get interaction restrictions for your public repositories |
| [**interactionsGetRestrictionsForOrg**](InteractionsApi.md#interactionsGetRestrictionsForOrg) | **GET** /orgs/{org}/interaction-limits | Get interaction restrictions for an organization |
| [**interactionsGetRestrictionsForRepo**](InteractionsApi.md#interactionsGetRestrictionsForRepo) | **GET** /repos/{owner}/{repo}/interaction-limits | Get interaction restrictions for a repository |
| [**interactionsRemoveRestrictionsForAuthenticatedUser**](InteractionsApi.md#interactionsRemoveRestrictionsForAuthenticatedUser) | **DELETE** /user/interaction-limits | Remove interaction restrictions from your public repositories |
| [**interactionsRemoveRestrictionsForOrg**](InteractionsApi.md#interactionsRemoveRestrictionsForOrg) | **DELETE** /orgs/{org}/interaction-limits | Remove interaction restrictions for an organization |
| [**interactionsRemoveRestrictionsForRepo**](InteractionsApi.md#interactionsRemoveRestrictionsForRepo) | **DELETE** /repos/{owner}/{repo}/interaction-limits | Remove interaction restrictions for a repository |
| [**interactionsSetRestrictionsForAuthenticatedUser**](InteractionsApi.md#interactionsSetRestrictionsForAuthenticatedUser) | **PUT** /user/interaction-limits | Set interaction restrictions for your public repositories |
| [**interactionsSetRestrictionsForOrg**](InteractionsApi.md#interactionsSetRestrictionsForOrg) | **PUT** /orgs/{org}/interaction-limits | Set interaction restrictions for an organization |
| [**interactionsSetRestrictionsForRepo**](InteractionsApi.md#interactionsSetRestrictionsForRepo) | **PUT** /repos/{owner}/{repo}/interaction-limits | Set interaction restrictions for a repository |


<a name="interactionsGetRestrictionsForAuthenticatedUser"></a>
# **interactionsGetRestrictionsForAuthenticatedUser**
> InteractionsGetRestrictionsForOrg200Response interactionsGetRestrictionsForAuthenticatedUser()

Get interaction restrictions for your public repositories

Shows which type of GitHub user can interact with your public repositories and when the restriction expires.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InteractionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    InteractionsApi apiInstance = new InteractionsApi(defaultClient);
    try {
      InteractionsGetRestrictionsForOrg200Response result = apiInstance.interactionsGetRestrictionsForAuthenticatedUser();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InteractionsApi#interactionsGetRestrictionsForAuthenticatedUser");
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

[**InteractionsGetRestrictionsForOrg200Response**](InteractionsGetRestrictionsForOrg200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |
| **204** | Response when there are no restrictions |  -  |

<a name="interactionsGetRestrictionsForOrg"></a>
# **interactionsGetRestrictionsForOrg**
> InteractionsGetRestrictionsForOrg200Response interactionsGetRestrictionsForOrg(org)

Get interaction restrictions for an organization

Shows which type of GitHub user can interact with this organization and when the restriction expires. If there is no restrictions, you will see an empty response.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InteractionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    InteractionsApi apiInstance = new InteractionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      InteractionsGetRestrictionsForOrg200Response result = apiInstance.interactionsGetRestrictionsForOrg(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InteractionsApi#interactionsGetRestrictionsForOrg");
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

[**InteractionsGetRestrictionsForOrg200Response**](InteractionsGetRestrictionsForOrg200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="interactionsGetRestrictionsForRepo"></a>
# **interactionsGetRestrictionsForRepo**
> InteractionsGetRestrictionsForOrg200Response interactionsGetRestrictionsForRepo(owner, repo)

Get interaction restrictions for a repository

Shows which type of GitHub user can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InteractionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    InteractionsApi apiInstance = new InteractionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      InteractionsGetRestrictionsForOrg200Response result = apiInstance.interactionsGetRestrictionsForRepo(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InteractionsApi#interactionsGetRestrictionsForRepo");
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

[**InteractionsGetRestrictionsForOrg200Response**](InteractionsGetRestrictionsForOrg200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="interactionsRemoveRestrictionsForAuthenticatedUser"></a>
# **interactionsRemoveRestrictionsForAuthenticatedUser**
> interactionsRemoveRestrictionsForAuthenticatedUser()

Remove interaction restrictions from your public repositories

Removes any interaction restrictions from your public repositories.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InteractionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    InteractionsApi apiInstance = new InteractionsApi(defaultClient);
    try {
      apiInstance.interactionsRemoveRestrictionsForAuthenticatedUser();
    } catch (ApiException e) {
      System.err.println("Exception when calling InteractionsApi#interactionsRemoveRestrictionsForAuthenticatedUser");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="interactionsRemoveRestrictionsForOrg"></a>
# **interactionsRemoveRestrictionsForOrg**
> interactionsRemoveRestrictionsForOrg(org)

Remove interaction restrictions for an organization

Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InteractionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    InteractionsApi apiInstance = new InteractionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      apiInstance.interactionsRemoveRestrictionsForOrg(org);
    } catch (ApiException e) {
      System.err.println("Exception when calling InteractionsApi#interactionsRemoveRestrictionsForOrg");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="interactionsRemoveRestrictionsForRepo"></a>
# **interactionsRemoveRestrictionsForRepo**
> interactionsRemoveRestrictionsForRepo(owner, repo)

Remove interaction restrictions for a repository

Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions. If the interaction limit is set for the user or organization that owns this repository, you will receive a &#x60;409 Conflict&#x60; response and will not be able to use this endpoint to change the interaction limit for a single repository.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InteractionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    InteractionsApi apiInstance = new InteractionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      apiInstance.interactionsRemoveRestrictionsForRepo(owner, repo);
    } catch (ApiException e) {
      System.err.println("Exception when calling InteractionsApi#interactionsRemoveRestrictionsForRepo");
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
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **409** | Response |  -  |

<a name="interactionsSetRestrictionsForAuthenticatedUser"></a>
# **interactionsSetRestrictionsForAuthenticatedUser**
> InteractionLimitResponse interactionsSetRestrictionsForAuthenticatedUser(interactionLimit)

Set interaction restrictions for your public repositories

Temporarily restricts which type of GitHub user can interact with your public repositories. Setting the interaction limit at the user level will overwrite any interaction limits that are set for individual repositories owned by the user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InteractionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    InteractionsApi apiInstance = new InteractionsApi(defaultClient);
    InteractionLimit interactionLimit = new InteractionLimit(); // InteractionLimit | 
    try {
      InteractionLimitResponse result = apiInstance.interactionsSetRestrictionsForAuthenticatedUser(interactionLimit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InteractionsApi#interactionsSetRestrictionsForAuthenticatedUser");
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
| **interactionLimit** | [**InteractionLimit**](InteractionLimit.md)|  | |

### Return type

[**InteractionLimitResponse**](InteractionLimitResponse.md)

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

<a name="interactionsSetRestrictionsForOrg"></a>
# **interactionsSetRestrictionsForOrg**
> InteractionLimitResponse interactionsSetRestrictionsForOrg(org, interactionLimit)

Set interaction restrictions for an organization

Temporarily restricts interactions to a certain type of GitHub user in any public repository in the given organization. You must be an organization owner to set these restrictions. Setting the interaction limit at the organization level will overwrite any interaction limits that are set for individual repositories owned by the organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InteractionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    InteractionsApi apiInstance = new InteractionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    InteractionLimit interactionLimit = new InteractionLimit(); // InteractionLimit | 
    try {
      InteractionLimitResponse result = apiInstance.interactionsSetRestrictionsForOrg(org, interactionLimit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InteractionsApi#interactionsSetRestrictionsForOrg");
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
| **interactionLimit** | [**InteractionLimit**](InteractionLimit.md)|  | |

### Return type

[**InteractionLimitResponse**](InteractionLimitResponse.md)

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

<a name="interactionsSetRestrictionsForRepo"></a>
# **interactionsSetRestrictionsForRepo**
> InteractionLimitResponse interactionsSetRestrictionsForRepo(owner, repo, interactionLimit)

Set interaction restrictions for a repository

Temporarily restricts interactions to a certain type of GitHub user within the given repository. You must have owner or admin access to set these restrictions. If an interaction limit is set for the user or organization that owns this repository, you will receive a &#x60;409 Conflict&#x60; response and will not be able to use this endpoint to change the interaction limit for a single repository.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InteractionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    InteractionsApi apiInstance = new InteractionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    InteractionLimit interactionLimit = new InteractionLimit(); // InteractionLimit | 
    try {
      InteractionLimitResponse result = apiInstance.interactionsSetRestrictionsForRepo(owner, repo, interactionLimit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InteractionsApi#interactionsSetRestrictionsForRepo");
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
| **interactionLimit** | [**InteractionLimit**](InteractionLimit.md)|  | |

### Return type

[**InteractionLimitResponse**](InteractionLimitResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **409** | Response |  -  |

