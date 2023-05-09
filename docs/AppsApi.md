# AppsApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appsAddRepoToInstallationForAuthenticatedUser**](AppsApi.md#appsAddRepoToInstallationForAuthenticatedUser) | **PUT** /user/installations/{installation_id}/repositories/{repository_id} | Add a repository to an app installation |
| [**appsCheckToken**](AppsApi.md#appsCheckToken) | **POST** /applications/{client_id}/token | Check a token |
| [**appsCreateFromManifest**](AppsApi.md#appsCreateFromManifest) | **POST** /app-manifests/{code}/conversions | Create a GitHub App from a manifest |
| [**appsCreateInstallationAccessToken**](AppsApi.md#appsCreateInstallationAccessToken) | **POST** /app/installations/{installation_id}/access_tokens | Create an installation access token for an app |
| [**appsDeleteAuthorization**](AppsApi.md#appsDeleteAuthorization) | **DELETE** /applications/{client_id}/grant | Delete an app authorization |
| [**appsDeleteInstallation**](AppsApi.md#appsDeleteInstallation) | **DELETE** /app/installations/{installation_id} | Delete an installation for the authenticated app |
| [**appsDeleteToken**](AppsApi.md#appsDeleteToken) | **DELETE** /applications/{client_id}/token | Delete an app token |
| [**appsGetAuthenticated**](AppsApi.md#appsGetAuthenticated) | **GET** /app | Get the authenticated app |
| [**appsGetBySlug**](AppsApi.md#appsGetBySlug) | **GET** /apps/{app_slug} | Get an app |
| [**appsGetInstallation**](AppsApi.md#appsGetInstallation) | **GET** /app/installations/{installation_id} | Get an installation for the authenticated app |
| [**appsGetOrgInstallation**](AppsApi.md#appsGetOrgInstallation) | **GET** /orgs/{org}/installation | Get an organization installation for the authenticated app |
| [**appsGetRepoInstallation**](AppsApi.md#appsGetRepoInstallation) | **GET** /repos/{owner}/{repo}/installation | Get a repository installation for the authenticated app |
| [**appsGetSubscriptionPlanForAccount**](AppsApi.md#appsGetSubscriptionPlanForAccount) | **GET** /marketplace_listing/accounts/{account_id} | Get a subscription plan for an account |
| [**appsGetSubscriptionPlanForAccountStubbed**](AppsApi.md#appsGetSubscriptionPlanForAccountStubbed) | **GET** /marketplace_listing/stubbed/accounts/{account_id} | Get a subscription plan for an account (stubbed) |
| [**appsGetUserInstallation**](AppsApi.md#appsGetUserInstallation) | **GET** /users/{username}/installation | Get a user installation for the authenticated app |
| [**appsGetWebhookConfigForApp**](AppsApi.md#appsGetWebhookConfigForApp) | **GET** /app/hook/config | Get a webhook configuration for an app |
| [**appsGetWebhookDelivery**](AppsApi.md#appsGetWebhookDelivery) | **GET** /app/hook/deliveries/{delivery_id} | Get a delivery for an app webhook |
| [**appsListAccountsForPlan**](AppsApi.md#appsListAccountsForPlan) | **GET** /marketplace_listing/plans/{plan_id}/accounts | List accounts for a plan |
| [**appsListAccountsForPlanStubbed**](AppsApi.md#appsListAccountsForPlanStubbed) | **GET** /marketplace_listing/stubbed/plans/{plan_id}/accounts | List accounts for a plan (stubbed) |
| [**appsListInstallationReposForAuthenticatedUser**](AppsApi.md#appsListInstallationReposForAuthenticatedUser) | **GET** /user/installations/{installation_id}/repositories | List repositories accessible to the user access token |
| [**appsListInstallationRequestsForAuthenticatedApp**](AppsApi.md#appsListInstallationRequestsForAuthenticatedApp) | **GET** /app/installation-requests | List installation requests for the authenticated app |
| [**appsListInstallations**](AppsApi.md#appsListInstallations) | **GET** /app/installations | List installations for the authenticated app |
| [**appsListInstallationsForAuthenticatedUser**](AppsApi.md#appsListInstallationsForAuthenticatedUser) | **GET** /user/installations | List app installations accessible to the user access token |
| [**appsListPlans**](AppsApi.md#appsListPlans) | **GET** /marketplace_listing/plans | List plans |
| [**appsListPlansStubbed**](AppsApi.md#appsListPlansStubbed) | **GET** /marketplace_listing/stubbed/plans | List plans (stubbed) |
| [**appsListReposAccessibleToInstallation**](AppsApi.md#appsListReposAccessibleToInstallation) | **GET** /installation/repositories | List repositories accessible to the app installation |
| [**appsListSubscriptionsForAuthenticatedUser**](AppsApi.md#appsListSubscriptionsForAuthenticatedUser) | **GET** /user/marketplace_purchases | List subscriptions for the authenticated user |
| [**appsListSubscriptionsForAuthenticatedUserStubbed**](AppsApi.md#appsListSubscriptionsForAuthenticatedUserStubbed) | **GET** /user/marketplace_purchases/stubbed | List subscriptions for the authenticated user (stubbed) |
| [**appsListWebhookDeliveries**](AppsApi.md#appsListWebhookDeliveries) | **GET** /app/hook/deliveries | List deliveries for an app webhook |
| [**appsRedeliverWebhookDelivery**](AppsApi.md#appsRedeliverWebhookDelivery) | **POST** /app/hook/deliveries/{delivery_id}/attempts | Redeliver a delivery for an app webhook |
| [**appsRemoveRepoFromInstallationForAuthenticatedUser**](AppsApi.md#appsRemoveRepoFromInstallationForAuthenticatedUser) | **DELETE** /user/installations/{installation_id}/repositories/{repository_id} | Remove a repository from an app installation |
| [**appsResetToken**](AppsApi.md#appsResetToken) | **PATCH** /applications/{client_id}/token | Reset a token |
| [**appsRevokeInstallationAccessToken**](AppsApi.md#appsRevokeInstallationAccessToken) | **DELETE** /installation/token | Revoke an installation access token |
| [**appsScopeToken**](AppsApi.md#appsScopeToken) | **POST** /applications/{client_id}/token/scoped | Create a scoped access token |
| [**appsSuspendInstallation**](AppsApi.md#appsSuspendInstallation) | **PUT** /app/installations/{installation_id}/suspended | Suspend an app installation |
| [**appsUnsuspendInstallation**](AppsApi.md#appsUnsuspendInstallation) | **DELETE** /app/installations/{installation_id}/suspended | Unsuspend an app installation |
| [**appsUpdateWebhookConfigForApp**](AppsApi.md#appsUpdateWebhookConfigForApp) | **PATCH** /app/hook/config | Update a webhook configuration for an app |


<a name="appsAddRepoToInstallationForAuthenticatedUser"></a>
# **appsAddRepoToInstallationForAuthenticatedUser**
> appsAddRepoToInstallationForAuthenticatedUser(installationId, repositoryId)

Add a repository to an app installation

Add a single repository to an installation. The authenticated user must have admin access to the repository.  You must use a personal access token (which you can create via the [command line](https://docs.github.com/github/authenticating-to-github/creating-a-personal-access-token) or [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication)) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer installationId = 1; // Integer | The unique identifier of the installation.
    Integer repositoryId = 56; // Integer | The unique identifier of the repository.
    try {
      apiInstance.appsAddRepoToInstallationForAuthenticatedUser(installationId, repositoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsAddRepoToInstallationForAuthenticatedUser");
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
| **installationId** | **Integer**| The unique identifier of the installation. | |
| **repositoryId** | **Integer**| The unique identifier of the repository. | |

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
| **403** | Forbidden |  -  |
| **304** | Not modified |  -  |
| **404** | Resource not found |  -  |

<a name="appsCheckToken"></a>
# **appsCheckToken**
> Authorization appsCheckToken(clientId, appsCheckTokenRequest)

Check a token

OAuth applications and GitHub applications with OAuth authorizations can use this API method for checking OAuth token validity without exceeding the normal rate limits for failed login attempts. Authentication works differently with this particular endpoint. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) to use this endpoint, where the username is the application &#x60;client_id&#x60; and the password is its &#x60;client_secret&#x60;. Invalid tokens will return &#x60;404 NOT FOUND&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String clientId = "Iv1.8a61f9b3a7aba766"; // String | The client ID of the GitHub app.
    AppsCheckTokenRequest appsCheckTokenRequest = new AppsCheckTokenRequest(); // AppsCheckTokenRequest | 
    try {
      Authorization result = apiInstance.appsCheckToken(clientId, appsCheckTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsCheckToken");
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
| **clientId** | **String**| The client ID of the GitHub app. | |
| **appsCheckTokenRequest** | [**AppsCheckTokenRequest**](AppsCheckTokenRequest.md)|  | |

### Return type

[**Authorization**](Authorization.md)

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

<a name="appsCreateFromManifest"></a>
# **appsCreateFromManifest**
> AppsCreateFromManifest201Response appsCreateFromManifest(code)

Create a GitHub App from a manifest

Use this endpoint to complete the handshake necessary when implementing the [GitHub App Manifest flow](https://docs.github.com/apps/building-github-apps/creating-github-apps-from-a-manifest/). When you create a GitHub App with the manifest flow, you receive a temporary &#x60;code&#x60; used to retrieve the GitHub App&#39;s &#x60;id&#x60;, &#x60;pem&#x60; (private key), and &#x60;webhook_secret&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      AppsCreateFromManifest201Response result = apiInstance.appsCreateFromManifest(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsCreateFromManifest");
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
| **code** | **String**|  | |

### Return type

[**AppsCreateFromManifest201Response**](AppsCreateFromManifest201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="appsCreateInstallationAccessToken"></a>
# **appsCreateInstallationAccessToken**
> InstallationToken appsCreateInstallationAccessToken(installationId, appsCreateInstallationAccessTokenRequest)

Create an installation access token for an app

Creates an installation access token that enables a GitHub App to make authenticated API requests for the app&#39;s installation on an organization or individual account. Installation tokens expire one hour from the time you create them. Using an expired token produces a status code of &#x60;401 - Unauthorized&#x60;, and requires creating a new installation token. By default the installation token has access to all repositories that the installation can access. To restrict the access to specific repositories, you can provide the &#x60;repository_ids&#x60; when creating the token. When you omit &#x60;repository_ids&#x60;, the response does not contain the &#x60;repositories&#x60; key.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer installationId = 1; // Integer | The unique identifier of the installation.
    AppsCreateInstallationAccessTokenRequest appsCreateInstallationAccessTokenRequest = new AppsCreateInstallationAccessTokenRequest(); // AppsCreateInstallationAccessTokenRequest | 
    try {
      InstallationToken result = apiInstance.appsCreateInstallationAccessToken(installationId, appsCreateInstallationAccessTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsCreateInstallationAccessToken");
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
| **installationId** | **Integer**| The unique identifier of the installation. | |
| **appsCreateInstallationAccessTokenRequest** | [**AppsCreateInstallationAccessTokenRequest**](AppsCreateInstallationAccessTokenRequest.md)|  | [optional] |

### Return type

[**InstallationToken**](InstallationToken.md)

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
| **401** | Requires authentication |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="appsDeleteAuthorization"></a>
# **appsDeleteAuthorization**
> appsDeleteAuthorization(clientId, appsDeleteAuthorizationRequest)

Delete an app authorization

OAuth and GitHub application owners can revoke a grant for their application and a specific user. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the OAuth application&#39;s &#x60;client_id&#x60; and &#x60;client_secret&#x60; as the username and password. You must also provide a valid OAuth &#x60;access_token&#x60; as an input parameter and the grant for the token&#39;s owner will be deleted. Deleting an application&#39;s grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user&#39;s account and will no longer be listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String clientId = "Iv1.8a61f9b3a7aba766"; // String | The client ID of the GitHub app.
    AppsDeleteAuthorizationRequest appsDeleteAuthorizationRequest = new AppsDeleteAuthorizationRequest(); // AppsDeleteAuthorizationRequest | 
    try {
      apiInstance.appsDeleteAuthorization(clientId, appsDeleteAuthorizationRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsDeleteAuthorization");
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
| **clientId** | **String**| The client ID of the GitHub app. | |
| **appsDeleteAuthorizationRequest** | [**AppsDeleteAuthorizationRequest**](AppsDeleteAuthorizationRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="appsDeleteInstallation"></a>
# **appsDeleteInstallation**
> appsDeleteInstallation(installationId)

Delete an installation for the authenticated app

Uninstalls a GitHub App on a user, organization, or business account. If you prefer to temporarily suspend an app&#39;s access to your account&#39;s resources, then we recommend the \&quot;[Suspend an app installation](https://docs.github.com/rest/reference/apps/#suspend-an-app-installation)\&quot; endpoint.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer installationId = 1; // Integer | The unique identifier of the installation.
    try {
      apiInstance.appsDeleteInstallation(installationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsDeleteInstallation");
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
| **installationId** | **Integer**| The unique identifier of the installation. | |

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

<a name="appsDeleteToken"></a>
# **appsDeleteToken**
> appsDeleteToken(clientId, appsDeleteAuthorizationRequest)

Delete an app token

OAuth  or GitHub application owners can revoke a single token for an OAuth application or a GitHub application with an OAuth authorization. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the application&#39;s &#x60;client_id&#x60; and &#x60;client_secret&#x60; as the username and password.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String clientId = "Iv1.8a61f9b3a7aba766"; // String | The client ID of the GitHub app.
    AppsDeleteAuthorizationRequest appsDeleteAuthorizationRequest = new AppsDeleteAuthorizationRequest(); // AppsDeleteAuthorizationRequest | 
    try {
      apiInstance.appsDeleteToken(clientId, appsDeleteAuthorizationRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsDeleteToken");
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
| **clientId** | **String**| The client ID of the GitHub app. | |
| **appsDeleteAuthorizationRequest** | [**AppsDeleteAuthorizationRequest**](AppsDeleteAuthorizationRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="appsGetAuthenticated"></a>
# **appsGetAuthenticated**
> Integration appsGetAuthenticated()

Get the authenticated app

Returns the GitHub App associated with the authentication credentials used. To see how many app installations are associated with this GitHub App, see the &#x60;installations_count&#x60; in the response. For more details about your app&#39;s installations, see the \&quot;[List installations for the authenticated app](https://docs.github.com/rest/reference/apps#list-installations-for-the-authenticated-app)\&quot; endpoint.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    try {
      Integration result = apiInstance.appsGetAuthenticated();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsGetAuthenticated");
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

[**Integration**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="appsGetBySlug"></a>
# **appsGetBySlug**
> Integration appsGetBySlug(appSlug)

Get an app

**Note**: The &#x60;:app_slug&#x60; is just the URL-friendly name of your GitHub App. You can find this on the settings page for your GitHub App (e.g., &#x60;https://github.com/settings/apps/:app_slug&#x60;).  If the GitHub App you specify is public, you can access this endpoint without authenticating. If the GitHub App you specify is private, you must authenticate with a [personal access token](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or an [installation access token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String appSlug = "appSlug_example"; // String | 
    try {
      Integration result = apiInstance.appsGetBySlug(appSlug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsGetBySlug");
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
| **appSlug** | **String**|  | |

### Return type

[**Integration**](Integration.md)

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

<a name="appsGetInstallation"></a>
# **appsGetInstallation**
> Installation appsGetInstallation(installationId)

Get an installation for the authenticated app

Enables an authenticated GitHub App to find an installation&#39;s information using the installation id.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer installationId = 1; // Integer | The unique identifier of the installation.
    try {
      Installation result = apiInstance.appsGetInstallation(installationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsGetInstallation");
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
| **installationId** | **Integer**| The unique identifier of the installation. | |

### Return type

[**Installation**](Installation.md)

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

<a name="appsGetOrgInstallation"></a>
# **appsGetOrgInstallation**
> Installation appsGetOrgInstallation(org)

Get an organization installation for the authenticated app

Enables an authenticated GitHub App to find the organization&#39;s installation information.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      Installation result = apiInstance.appsGetOrgInstallation(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsGetOrgInstallation");
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

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="appsGetRepoInstallation"></a>
# **appsGetRepoInstallation**
> Installation appsGetRepoInstallation(owner, repo)

Get a repository installation for the authenticated app

Enables an authenticated GitHub App to find the repository&#39;s installation information. The installation&#39;s account type will be either an organization or a user account, depending which account the repository belongs to.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      Installation result = apiInstance.appsGetRepoInstallation(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsGetRepoInstallation");
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

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **301** | Moved permanently |  -  |
| **404** | Resource not found |  -  |

<a name="appsGetSubscriptionPlanForAccount"></a>
# **appsGetSubscriptionPlanForAccount**
> MarketplacePurchase appsGetSubscriptionPlanForAccount(accountId)

Get a subscription plan for an account

Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won&#39;t be processed until the end of their billing cycle, you will also see the upcoming pending change.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer accountId = 56; // Integer | account_id parameter
    try {
      MarketplacePurchase result = apiInstance.appsGetSubscriptionPlanForAccount(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsGetSubscriptionPlanForAccount");
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
| **accountId** | **Integer**| account_id parameter | |

### Return type

[**MarketplacePurchase**](MarketplacePurchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Not Found when the account has not purchased the listing |  -  |
| **401** | Requires authentication |  -  |

<a name="appsGetSubscriptionPlanForAccountStubbed"></a>
# **appsGetSubscriptionPlanForAccountStubbed**
> MarketplacePurchase appsGetSubscriptionPlanForAccountStubbed(accountId)

Get a subscription plan for an account (stubbed)

Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won&#39;t be processed until the end of their billing cycle, you will also see the upcoming pending change.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer accountId = 56; // Integer | account_id parameter
    try {
      MarketplacePurchase result = apiInstance.appsGetSubscriptionPlanForAccountStubbed(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsGetSubscriptionPlanForAccountStubbed");
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
| **accountId** | **Integer**| account_id parameter | |

### Return type

[**MarketplacePurchase**](MarketplacePurchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Not Found when the account has not purchased the listing |  -  |
| **401** | Requires authentication |  -  |

<a name="appsGetUserInstallation"></a>
# **appsGetUserInstallation**
> Installation appsGetUserInstallation(username)

Get a user installation for the authenticated app

Enables an authenticated GitHub App to find the user’s installation information.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      Installation result = apiInstance.appsGetUserInstallation(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsGetUserInstallation");
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

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="appsGetWebhookConfigForApp"></a>
# **appsGetWebhookConfigForApp**
> WebhookConfig appsGetWebhookConfigForApp()

Get a webhook configuration for an app

Returns the webhook configuration for a GitHub App. For more information about configuring a webhook for your app, see \&quot;[Creating a GitHub App](/developers/apps/creating-a-github-app).\&quot;  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    try {
      WebhookConfig result = apiInstance.appsGetWebhookConfigForApp();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsGetWebhookConfigForApp");
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

[**WebhookConfig**](WebhookConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="appsGetWebhookDelivery"></a>
# **appsGetWebhookDelivery**
> HookDelivery appsGetWebhookDelivery(deliveryId)

Get a delivery for an app webhook

Returns a delivery for the webhook configured for a GitHub App.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer deliveryId = 56; // Integer | 
    try {
      HookDelivery result = apiInstance.appsGetWebhookDelivery(deliveryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsGetWebhookDelivery");
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
| **deliveryId** | **Integer**|  | |

### Return type

[**HookDelivery**](HookDelivery.md)

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
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="appsListAccountsForPlan"></a>
# **appsListAccountsForPlan**
> List&lt;MarketplacePurchase&gt; appsListAccountsForPlan(planId, sort, direction, perPage, page)

List accounts for a plan

Returns user and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won&#39;t be processed until the end of their billing cycle, you will also see the upcoming pending change.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer planId = 56; // Integer | The unique identifier of the plan.
    String sort = "created"; // String | The property to sort the results by.
    String direction = "asc"; // String | To return the oldest accounts first, set to `asc`. Ignored without the `sort` parameter.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<MarketplacePurchase> result = apiInstance.appsListAccountsForPlan(planId, sort, direction, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsListAccountsForPlan");
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
| **planId** | **Integer**| The unique identifier of the plan. | |
| **sort** | **String**| The property to sort the results by. | [optional] [default to created] [enum: created, updated] |
| **direction** | **String**| To return the oldest accounts first, set to &#x60;asc&#x60;. Ignored without the &#x60;sort&#x60; parameter. | [optional] [enum: asc, desc] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;MarketplacePurchase&gt;**](MarketplacePurchase.md)

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
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **401** | Requires authentication |  -  |

<a name="appsListAccountsForPlanStubbed"></a>
# **appsListAccountsForPlanStubbed**
> List&lt;MarketplacePurchase&gt; appsListAccountsForPlanStubbed(planId, sort, direction, perPage, page)

List accounts for a plan (stubbed)

Returns repository and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won&#39;t be processed until the end of their billing cycle, you will also see the upcoming pending change.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer planId = 56; // Integer | The unique identifier of the plan.
    String sort = "created"; // String | The property to sort the results by.
    String direction = "asc"; // String | To return the oldest accounts first, set to `asc`. Ignored without the `sort` parameter.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<MarketplacePurchase> result = apiInstance.appsListAccountsForPlanStubbed(planId, sort, direction, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsListAccountsForPlanStubbed");
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
| **planId** | **Integer**| The unique identifier of the plan. | |
| **sort** | **String**| The property to sort the results by. | [optional] [default to created] [enum: created, updated] |
| **direction** | **String**| To return the oldest accounts first, set to &#x60;asc&#x60;. Ignored without the &#x60;sort&#x60; parameter. | [optional] [enum: asc, desc] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;MarketplacePurchase&gt;**](MarketplacePurchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |
| **401** | Requires authentication |  -  |

<a name="appsListInstallationReposForAuthenticatedUser"></a>
# **appsListInstallationReposForAuthenticatedUser**
> AppsListInstallationReposForAuthenticatedUser200Response appsListInstallationReposForAuthenticatedUser(installationId, perPage, page)

List repositories accessible to the user access token

List repositories that the authenticated user has explicit permission (&#x60;:read&#x60;, &#x60;:write&#x60;, or &#x60;:admin&#x60;) to access for an installation.  The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.  You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.  The access the user has to each repository is included in the hash under the &#x60;permissions&#x60; key.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer installationId = 1; // Integer | The unique identifier of the installation.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      AppsListInstallationReposForAuthenticatedUser200Response result = apiInstance.appsListInstallationReposForAuthenticatedUser(installationId, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsListInstallationReposForAuthenticatedUser");
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
| **installationId** | **Integer**| The unique identifier of the installation. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**AppsListInstallationReposForAuthenticatedUser200Response**](AppsListInstallationReposForAuthenticatedUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The access the user has to each repository is included in the hash under the &#x60;permissions&#x60; key. |  * Link -  <br>  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **304** | Not modified |  -  |

<a name="appsListInstallationRequestsForAuthenticatedApp"></a>
# **appsListInstallationRequestsForAuthenticatedApp**
> List&lt;IntegrationInstallationRequest&gt; appsListInstallationRequestsForAuthenticatedApp(perPage, page)

List installation requests for the authenticated app

Lists all the pending installation requests for the authenticated GitHub App.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<IntegrationInstallationRequest> result = apiInstance.appsListInstallationRequestsForAuthenticatedApp(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsListInstallationRequestsForAuthenticatedApp");
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

[**List&lt;IntegrationInstallationRequest&gt;**](IntegrationInstallationRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of integration installation requests |  -  |
| **304** | Not modified |  -  |
| **401** | Requires authentication |  -  |

<a name="appsListInstallations"></a>
# **appsListInstallations**
> List&lt;Installation&gt; appsListInstallations(perPage, page, since, outdated)

List installations for the authenticated app

You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.  The permissions the installation has are included under the &#x60;permissions&#x60; key.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    String outdated = "outdated_example"; // String | 
    try {
      List<Installation> result = apiInstance.appsListInstallations(perPage, page, since, outdated);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsListInstallations");
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
| **since** | **OffsetDateTime**| Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] |
| **outdated** | **String**|  | [optional] |

### Return type

[**List&lt;Installation&gt;**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The permissions the installation has are included under the &#x60;permissions&#x60; key. |  * Link -  <br>  |

<a name="appsListInstallationsForAuthenticatedUser"></a>
# **appsListInstallationsForAuthenticatedUser**
> OrgsListAppInstallations200Response appsListInstallationsForAuthenticatedUser(perPage, page)

List app installations accessible to the user access token

Lists installations of your GitHub App that the authenticated user has explicit permission (&#x60;:read&#x60;, &#x60;:write&#x60;, or &#x60;:admin&#x60;) to access.  You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.  The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.  You can find the permissions for the installation under the &#x60;permissions&#x60; key.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      OrgsListAppInstallations200Response result = apiInstance.appsListInstallationsForAuthenticatedUser(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsListInstallationsForAuthenticatedUser");
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

[**OrgsListAppInstallations200Response**](OrgsListAppInstallations200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | You can find the permissions for the installation under the &#x60;permissions&#x60; key. |  * Link -  <br>  |
| **304** | Not modified |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="appsListPlans"></a>
# **appsListPlans**
> List&lt;MarketplaceListingPlan&gt; appsListPlans(perPage, page)

List plans

Lists all plans that are part of your GitHub Marketplace listing.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<MarketplaceListingPlan> result = apiInstance.appsListPlans(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsListPlans");
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

[**List&lt;MarketplaceListingPlan&gt;**](MarketplaceListingPlan.md)

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
| **401** | Requires authentication |  -  |

<a name="appsListPlansStubbed"></a>
# **appsListPlansStubbed**
> List&lt;MarketplaceListingPlan&gt; appsListPlansStubbed(perPage, page)

List plans (stubbed)

Lists all plans that are part of your GitHub Marketplace listing.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<MarketplaceListingPlan> result = apiInstance.appsListPlansStubbed(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsListPlansStubbed");
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

[**List&lt;MarketplaceListingPlan&gt;**](MarketplaceListingPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |
| **401** | Requires authentication |  -  |

<a name="appsListReposAccessibleToInstallation"></a>
# **appsListReposAccessibleToInstallation**
> AppsListReposAccessibleToInstallation200Response appsListReposAccessibleToInstallation(perPage, page)

List repositories accessible to the app installation

List repositories that an app installation can access.  You must use an [installation access token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      AppsListReposAccessibleToInstallation200Response result = apiInstance.appsListReposAccessibleToInstallation(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsListReposAccessibleToInstallation");
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

[**AppsListReposAccessibleToInstallation200Response**](AppsListReposAccessibleToInstallation200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |
| **403** | Forbidden |  -  |
| **304** | Not modified |  -  |
| **401** | Requires authentication |  -  |

<a name="appsListSubscriptionsForAuthenticatedUser"></a>
# **appsListSubscriptionsForAuthenticatedUser**
> List&lt;UserMarketplacePurchase&gt; appsListSubscriptionsForAuthenticatedUser(perPage, page)

List subscriptions for the authenticated user

Lists the active subscriptions for the authenticated user. You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<UserMarketplacePurchase> result = apiInstance.appsListSubscriptionsForAuthenticatedUser(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsListSubscriptionsForAuthenticatedUser");
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

[**List&lt;UserMarketplacePurchase&gt;**](UserMarketplacePurchase.md)

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
| **401** | Requires authentication |  -  |
| **404** | Resource not found |  -  |

<a name="appsListSubscriptionsForAuthenticatedUserStubbed"></a>
# **appsListSubscriptionsForAuthenticatedUserStubbed**
> List&lt;UserMarketplacePurchase&gt; appsListSubscriptionsForAuthenticatedUserStubbed(perPage, page)

List subscriptions for the authenticated user (stubbed)

Lists the active subscriptions for the authenticated user. You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<UserMarketplacePurchase> result = apiInstance.appsListSubscriptionsForAuthenticatedUserStubbed(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsListSubscriptionsForAuthenticatedUserStubbed");
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

[**List&lt;UserMarketplacePurchase&gt;**](UserMarketplacePurchase.md)

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
| **401** | Requires authentication |  -  |

<a name="appsListWebhookDeliveries"></a>
# **appsListWebhookDeliveries**
> List&lt;HookDeliveryItem&gt; appsListWebhookDeliveries(perPage, cursor, redelivery)

List deliveries for an app webhook

Returns a list of webhook deliveries for the webhook configured for a GitHub App.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    String cursor = "cursor_example"; // String | Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the `link` header for the next and previous page cursors.
    Boolean redelivery = true; // Boolean | 
    try {
      List<HookDeliveryItem> result = apiInstance.appsListWebhookDeliveries(perPage, cursor, redelivery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsListWebhookDeliveries");
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
| **cursor** | **String**| Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the &#x60;link&#x60; header for the next and previous page cursors. | [optional] |
| **redelivery** | **Boolean**|  | [optional] |

### Return type

[**List&lt;HookDeliveryItem&gt;**](HookDeliveryItem.md)

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
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="appsRedeliverWebhookDelivery"></a>
# **appsRedeliverWebhookDelivery**
> Object appsRedeliverWebhookDelivery(deliveryId)

Redeliver a delivery for an app webhook

Redeliver a delivery for the webhook configured for a GitHub App.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer deliveryId = 56; // Integer | 
    try {
      Object result = apiInstance.appsRedeliverWebhookDelivery(deliveryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsRedeliverWebhookDelivery");
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
| **deliveryId** | **Integer**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="appsRemoveRepoFromInstallationForAuthenticatedUser"></a>
# **appsRemoveRepoFromInstallationForAuthenticatedUser**
> appsRemoveRepoFromInstallationForAuthenticatedUser(installationId, repositoryId)

Remove a repository from an app installation

Remove a single repository from an installation. The authenticated user must have admin access to the repository.  You must use a personal access token (which you can create via the [command line](https://docs.github.com/github/authenticating-to-github/creating-a-personal-access-token) or [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication)) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer installationId = 1; // Integer | The unique identifier of the installation.
    Integer repositoryId = 56; // Integer | The unique identifier of the repository.
    try {
      apiInstance.appsRemoveRepoFromInstallationForAuthenticatedUser(installationId, repositoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsRemoveRepoFromInstallationForAuthenticatedUser");
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
| **installationId** | **Integer**| The unique identifier of the installation. | |
| **repositoryId** | **Integer**| The unique identifier of the repository. | |

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
| **403** | Forbidden |  -  |
| **304** | Not modified |  -  |
| **404** | Resource not found |  -  |

<a name="appsResetToken"></a>
# **appsResetToken**
> Authorization appsResetToken(clientId, appsCheckTokenRequest)

Reset a token

OAuth applications and GitHub applications with OAuth authorizations can use this API method to reset a valid OAuth token without end-user involvement. Applications must save the \&quot;token\&quot; property in the response because changes take effect immediately. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the application&#39;s &#x60;client_id&#x60; and &#x60;client_secret&#x60; as the username and password. Invalid tokens will return &#x60;404 NOT FOUND&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String clientId = "Iv1.8a61f9b3a7aba766"; // String | The client ID of the GitHub app.
    AppsCheckTokenRequest appsCheckTokenRequest = new AppsCheckTokenRequest(); // AppsCheckTokenRequest | 
    try {
      Authorization result = apiInstance.appsResetToken(clientId, appsCheckTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsResetToken");
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
| **clientId** | **String**| The client ID of the GitHub app. | |
| **appsCheckTokenRequest** | [**AppsCheckTokenRequest**](AppsCheckTokenRequest.md)|  | |

### Return type

[**Authorization**](Authorization.md)

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

<a name="appsRevokeInstallationAccessToken"></a>
# **appsRevokeInstallationAccessToken**
> appsRevokeInstallationAccessToken()

Revoke an installation access token

Revokes the installation token you&#39;re using to authenticate as an installation and access this endpoint.  Once an installation token is revoked, the token is invalidated and cannot be used. Other endpoints that require the revoked installation token must have a new installation token to work. You can create a new token using the \&quot;[Create an installation access token for an app](https://docs.github.com/rest/reference/apps#create-an-installation-access-token-for-an-app)\&quot; endpoint.  You must use an [installation access token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    try {
      apiInstance.appsRevokeInstallationAccessToken();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsRevokeInstallationAccessToken");
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

<a name="appsScopeToken"></a>
# **appsScopeToken**
> Authorization appsScopeToken(clientId, appsScopeTokenRequest)

Create a scoped access token

Use a non-scoped user-to-server access token to create a repository scoped and/or permission scoped user-to-server access token. You can specify which repositories the token can access and which permissions are granted to the token. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the &#x60;client_id&#x60; and &#x60;client_secret&#x60; of the GitHub App as the username and password. Invalid tokens will return &#x60;404 NOT FOUND&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String clientId = "Iv1.8a61f9b3a7aba766"; // String | The client ID of the GitHub app.
    AppsScopeTokenRequest appsScopeTokenRequest = new AppsScopeTokenRequest(); // AppsScopeTokenRequest | 
    try {
      Authorization result = apiInstance.appsScopeToken(clientId, appsScopeTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsScopeToken");
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
| **clientId** | **String**| The client ID of the GitHub app. | |
| **appsScopeTokenRequest** | [**AppsScopeTokenRequest**](AppsScopeTokenRequest.md)|  | |

### Return type

[**Authorization**](Authorization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="appsSuspendInstallation"></a>
# **appsSuspendInstallation**
> appsSuspendInstallation(installationId)

Suspend an app installation

Suspends a GitHub App on a user, organization, or business account, which blocks the app from accessing the account&#39;s resources. When a GitHub App is suspended, the app&#39;s access to the GitHub API or webhook events is blocked for that account.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer installationId = 1; // Integer | The unique identifier of the installation.
    try {
      apiInstance.appsSuspendInstallation(installationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsSuspendInstallation");
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
| **installationId** | **Integer**| The unique identifier of the installation. | |

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

<a name="appsUnsuspendInstallation"></a>
# **appsUnsuspendInstallation**
> appsUnsuspendInstallation(installationId)

Unsuspend an app installation

Removes a GitHub App installation suspension.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer installationId = 1; // Integer | The unique identifier of the installation.
    try {
      apiInstance.appsUnsuspendInstallation(installationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsUnsuspendInstallation");
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
| **installationId** | **Integer**| The unique identifier of the installation. | |

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

<a name="appsUpdateWebhookConfigForApp"></a>
# **appsUpdateWebhookConfigForApp**
> WebhookConfig appsUpdateWebhookConfigForApp(appsUpdateWebhookConfigForAppRequest)

Update a webhook configuration for an app

Updates the webhook configuration for a GitHub App. For more information about configuring a webhook for your app, see \&quot;[Creating a GitHub App](/developers/apps/creating-a-github-app).\&quot;  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    AppsApi apiInstance = new AppsApi(defaultClient);
    AppsUpdateWebhookConfigForAppRequest appsUpdateWebhookConfigForAppRequest = new AppsUpdateWebhookConfigForAppRequest(); // AppsUpdateWebhookConfigForAppRequest | 
    try {
      WebhookConfig result = apiInstance.appsUpdateWebhookConfigForApp(appsUpdateWebhookConfigForAppRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsUpdateWebhookConfigForApp");
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
| **appsUpdateWebhookConfigForAppRequest** | [**AppsUpdateWebhookConfigForAppRequest**](AppsUpdateWebhookConfigForAppRequest.md)|  | |

### Return type

[**WebhookConfig**](WebhookConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

