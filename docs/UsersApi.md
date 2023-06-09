# UsersApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usersAddEmailForAuthenticatedUser**](UsersApi.md#usersAddEmailForAuthenticatedUser) | **POST** /user/emails | Add an email address for the authenticated user |
| [**usersAddSocialAccountForAuthenticatedUser**](UsersApi.md#usersAddSocialAccountForAuthenticatedUser) | **POST** /user/social_accounts | Add social accounts for the authenticated user |
| [**usersBlock**](UsersApi.md#usersBlock) | **PUT** /user/blocks/{username} | Block a user |
| [**usersCheckBlocked**](UsersApi.md#usersCheckBlocked) | **GET** /user/blocks/{username} | Check if a user is blocked by the authenticated user |
| [**usersCheckFollowingForUser**](UsersApi.md#usersCheckFollowingForUser) | **GET** /users/{username}/following/{target_user} | Check if a user follows another user |
| [**usersCheckPersonIsFollowedByAuthenticated**](UsersApi.md#usersCheckPersonIsFollowedByAuthenticated) | **GET** /user/following/{username} | Check if a person is followed by the authenticated user |
| [**usersCreateGpgKeyForAuthenticatedUser**](UsersApi.md#usersCreateGpgKeyForAuthenticatedUser) | **POST** /user/gpg_keys | Create a GPG key for the authenticated user |
| [**usersCreatePublicSshKeyForAuthenticatedUser**](UsersApi.md#usersCreatePublicSshKeyForAuthenticatedUser) | **POST** /user/keys | Create a public SSH key for the authenticated user |
| [**usersCreateSshSigningKeyForAuthenticatedUser**](UsersApi.md#usersCreateSshSigningKeyForAuthenticatedUser) | **POST** /user/ssh_signing_keys | Create a SSH signing key for the authenticated user |
| [**usersDeleteEmailForAuthenticatedUser**](UsersApi.md#usersDeleteEmailForAuthenticatedUser) | **DELETE** /user/emails | Delete an email address for the authenticated user |
| [**usersDeleteGpgKeyForAuthenticatedUser**](UsersApi.md#usersDeleteGpgKeyForAuthenticatedUser) | **DELETE** /user/gpg_keys/{gpg_key_id} | Delete a GPG key for the authenticated user |
| [**usersDeletePublicSshKeyForAuthenticatedUser**](UsersApi.md#usersDeletePublicSshKeyForAuthenticatedUser) | **DELETE** /user/keys/{key_id} | Delete a public SSH key for the authenticated user |
| [**usersDeleteSocialAccountForAuthenticatedUser**](UsersApi.md#usersDeleteSocialAccountForAuthenticatedUser) | **DELETE** /user/social_accounts | Delete social accounts for the authenticated user |
| [**usersDeleteSshSigningKeyForAuthenticatedUser**](UsersApi.md#usersDeleteSshSigningKeyForAuthenticatedUser) | **DELETE** /user/ssh_signing_keys/{ssh_signing_key_id} | Delete an SSH signing key for the authenticated user |
| [**usersFollow**](UsersApi.md#usersFollow) | **PUT** /user/following/{username} | Follow a user |
| [**usersGetAuthenticated**](UsersApi.md#usersGetAuthenticated) | **GET** /user | Get the authenticated user |
| [**usersGetByUsername**](UsersApi.md#usersGetByUsername) | **GET** /users/{username} | Get a user |
| [**usersGetContextForUser**](UsersApi.md#usersGetContextForUser) | **GET** /users/{username}/hovercard | Get contextual information for a user |
| [**usersGetGpgKeyForAuthenticatedUser**](UsersApi.md#usersGetGpgKeyForAuthenticatedUser) | **GET** /user/gpg_keys/{gpg_key_id} | Get a GPG key for the authenticated user |
| [**usersGetPublicSshKeyForAuthenticatedUser**](UsersApi.md#usersGetPublicSshKeyForAuthenticatedUser) | **GET** /user/keys/{key_id} | Get a public SSH key for the authenticated user |
| [**usersGetSshSigningKeyForAuthenticatedUser**](UsersApi.md#usersGetSshSigningKeyForAuthenticatedUser) | **GET** /user/ssh_signing_keys/{ssh_signing_key_id} | Get an SSH signing key for the authenticated user |
| [**usersList**](UsersApi.md#usersList) | **GET** /users | List users |
| [**usersListBlockedByAuthenticatedUser**](UsersApi.md#usersListBlockedByAuthenticatedUser) | **GET** /user/blocks | List users blocked by the authenticated user |
| [**usersListEmailsForAuthenticatedUser**](UsersApi.md#usersListEmailsForAuthenticatedUser) | **GET** /user/emails | List email addresses for the authenticated user |
| [**usersListFollowedByAuthenticatedUser**](UsersApi.md#usersListFollowedByAuthenticatedUser) | **GET** /user/following | List the people the authenticated user follows |
| [**usersListFollowersForAuthenticatedUser**](UsersApi.md#usersListFollowersForAuthenticatedUser) | **GET** /user/followers | List followers of the authenticated user |
| [**usersListFollowersForUser**](UsersApi.md#usersListFollowersForUser) | **GET** /users/{username}/followers | List followers of a user |
| [**usersListFollowingForUser**](UsersApi.md#usersListFollowingForUser) | **GET** /users/{username}/following | List the people a user follows |
| [**usersListGpgKeysForAuthenticatedUser**](UsersApi.md#usersListGpgKeysForAuthenticatedUser) | **GET** /user/gpg_keys | List GPG keys for the authenticated user |
| [**usersListGpgKeysForUser**](UsersApi.md#usersListGpgKeysForUser) | **GET** /users/{username}/gpg_keys | List GPG keys for a user |
| [**usersListPublicEmailsForAuthenticatedUser**](UsersApi.md#usersListPublicEmailsForAuthenticatedUser) | **GET** /user/public_emails | List public email addresses for the authenticated user |
| [**usersListPublicKeysForUser**](UsersApi.md#usersListPublicKeysForUser) | **GET** /users/{username}/keys | List public keys for a user |
| [**usersListPublicSshKeysForAuthenticatedUser**](UsersApi.md#usersListPublicSshKeysForAuthenticatedUser) | **GET** /user/keys | List public SSH keys for the authenticated user |
| [**usersListSocialAccountsForAuthenticatedUser**](UsersApi.md#usersListSocialAccountsForAuthenticatedUser) | **GET** /user/social_accounts | List social accounts for the authenticated user |
| [**usersListSocialAccountsForUser**](UsersApi.md#usersListSocialAccountsForUser) | **GET** /users/{username}/social_accounts | List social accounts for a user |
| [**usersListSshSigningKeysForAuthenticatedUser**](UsersApi.md#usersListSshSigningKeysForAuthenticatedUser) | **GET** /user/ssh_signing_keys | List SSH signing keys for the authenticated user |
| [**usersListSshSigningKeysForUser**](UsersApi.md#usersListSshSigningKeysForUser) | **GET** /users/{username}/ssh_signing_keys | List SSH signing keys for a user |
| [**usersSetPrimaryEmailVisibilityForAuthenticatedUser**](UsersApi.md#usersSetPrimaryEmailVisibilityForAuthenticatedUser) | **PATCH** /user/email/visibility | Set primary email visibility for the authenticated user |
| [**usersUnblock**](UsersApi.md#usersUnblock) | **DELETE** /user/blocks/{username} | Unblock a user |
| [**usersUnfollow**](UsersApi.md#usersUnfollow) | **DELETE** /user/following/{username} | Unfollow a user |
| [**usersUpdateAuthenticated**](UsersApi.md#usersUpdateAuthenticated) | **PATCH** /user | Update the authenticated user |


<a name="usersAddEmailForAuthenticatedUser"></a>
# **usersAddEmailForAuthenticatedUser**
> List&lt;Email&gt; usersAddEmailForAuthenticatedUser(usersAddEmailForAuthenticatedUserRequest)

Add an email address for the authenticated user

This endpoint is accessible with the &#x60;user&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UsersAddEmailForAuthenticatedUserRequest usersAddEmailForAuthenticatedUserRequest = new UsersAddEmailForAuthenticatedUserRequest(); // UsersAddEmailForAuthenticatedUserRequest | 
    try {
      List<Email> result = apiInstance.usersAddEmailForAuthenticatedUser(usersAddEmailForAuthenticatedUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersAddEmailForAuthenticatedUser");
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
| **usersAddEmailForAuthenticatedUserRequest** | [**UsersAddEmailForAuthenticatedUserRequest**](UsersAddEmailForAuthenticatedUserRequest.md)|  | [optional] |

### Return type

[**List&lt;Email&gt;**](Email.md)

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
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersAddSocialAccountForAuthenticatedUser"></a>
# **usersAddSocialAccountForAuthenticatedUser**
> List&lt;SocialAccount&gt; usersAddSocialAccountForAuthenticatedUser(usersAddSocialAccountForAuthenticatedUserRequest)

Add social accounts for the authenticated user

Add one or more social accounts to the authenticated user&#39;s profile. This endpoint is accessible with the &#x60;user&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UsersAddSocialAccountForAuthenticatedUserRequest usersAddSocialAccountForAuthenticatedUserRequest = new UsersAddSocialAccountForAuthenticatedUserRequest(); // UsersAddSocialAccountForAuthenticatedUserRequest | 
    try {
      List<SocialAccount> result = apiInstance.usersAddSocialAccountForAuthenticatedUser(usersAddSocialAccountForAuthenticatedUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersAddSocialAccountForAuthenticatedUser");
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
| **usersAddSocialAccountForAuthenticatedUserRequest** | [**UsersAddSocialAccountForAuthenticatedUserRequest**](UsersAddSocialAccountForAuthenticatedUserRequest.md)|  | |

### Return type

[**List&lt;SocialAccount&gt;**](SocialAccount.md)

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
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersBlock"></a>
# **usersBlock**
> usersBlock(username)

Block a user



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.usersBlock(username);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersBlock");
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
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="usersCheckBlocked"></a>
# **usersCheckBlocked**
> usersCheckBlocked(username)

Check if a user is blocked by the authenticated user



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.usersCheckBlocked(username);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersCheckBlocked");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | If the user is blocked |  -  |
| **404** | If the user is not blocked |  -  |
| **304** | Not modified |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersCheckFollowingForUser"></a>
# **usersCheckFollowingForUser**
> usersCheckFollowingForUser(username, targetUser)

Check if a user follows another user



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    String targetUser = "targetUser_example"; // String | 
    try {
      apiInstance.usersCheckFollowingForUser(username, targetUser);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersCheckFollowingForUser");
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
| **targetUser** | **String**|  | |

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
| **204** | if the user follows the target user |  -  |
| **404** | if the user does not follow the target user |  -  |

<a name="usersCheckPersonIsFollowedByAuthenticated"></a>
# **usersCheckPersonIsFollowedByAuthenticated**
> usersCheckPersonIsFollowedByAuthenticated(username)

Check if a person is followed by the authenticated user



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.usersCheckPersonIsFollowedByAuthenticated(username);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersCheckPersonIsFollowedByAuthenticated");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | if the person is followed by the authenticated user |  -  |
| **404** | if the person is not followed by the authenticated user |  -  |
| **304** | Not modified |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersCreateGpgKeyForAuthenticatedUser"></a>
# **usersCreateGpgKeyForAuthenticatedUser**
> GpgKey usersCreateGpgKeyForAuthenticatedUser(usersCreateGpgKeyForAuthenticatedUserRequest)

Create a GPG key for the authenticated user

Adds a GPG key to the authenticated user&#39;s GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least &#x60;write:gpg_key&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UsersCreateGpgKeyForAuthenticatedUserRequest usersCreateGpgKeyForAuthenticatedUserRequest = new UsersCreateGpgKeyForAuthenticatedUserRequest(); // UsersCreateGpgKeyForAuthenticatedUserRequest | 
    try {
      GpgKey result = apiInstance.usersCreateGpgKeyForAuthenticatedUser(usersCreateGpgKeyForAuthenticatedUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersCreateGpgKeyForAuthenticatedUser");
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
| **usersCreateGpgKeyForAuthenticatedUserRequest** | [**UsersCreateGpgKeyForAuthenticatedUserRequest**](UsersCreateGpgKeyForAuthenticatedUserRequest.md)|  | |

### Return type

[**GpgKey**](GpgKey.md)

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
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersCreatePublicSshKeyForAuthenticatedUser"></a>
# **usersCreatePublicSshKeyForAuthenticatedUser**
> Key usersCreatePublicSshKeyForAuthenticatedUser(usersCreatePublicSshKeyForAuthenticatedUserRequest)

Create a public SSH key for the authenticated user

Adds a public SSH key to the authenticated user&#39;s GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least &#x60;write:public_key&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UsersCreatePublicSshKeyForAuthenticatedUserRequest usersCreatePublicSshKeyForAuthenticatedUserRequest = new UsersCreatePublicSshKeyForAuthenticatedUserRequest(); // UsersCreatePublicSshKeyForAuthenticatedUserRequest | 
    try {
      Key result = apiInstance.usersCreatePublicSshKeyForAuthenticatedUser(usersCreatePublicSshKeyForAuthenticatedUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersCreatePublicSshKeyForAuthenticatedUser");
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
| **usersCreatePublicSshKeyForAuthenticatedUserRequest** | [**UsersCreatePublicSshKeyForAuthenticatedUserRequest**](UsersCreatePublicSshKeyForAuthenticatedUserRequest.md)|  | |

### Return type

[**Key**](Key.md)

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
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersCreateSshSigningKeyForAuthenticatedUser"></a>
# **usersCreateSshSigningKeyForAuthenticatedUser**
> SshSigningKey usersCreateSshSigningKeyForAuthenticatedUser(usersCreateSshSigningKeyForAuthenticatedUserRequest)

Create a SSH signing key for the authenticated user

Creates an SSH signing key for the authenticated user&#39;s GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least &#x60;write:ssh_signing_key&#x60; scope. For more information, see \&quot;[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UsersCreateSshSigningKeyForAuthenticatedUserRequest usersCreateSshSigningKeyForAuthenticatedUserRequest = new UsersCreateSshSigningKeyForAuthenticatedUserRequest(); // UsersCreateSshSigningKeyForAuthenticatedUserRequest | 
    try {
      SshSigningKey result = apiInstance.usersCreateSshSigningKeyForAuthenticatedUser(usersCreateSshSigningKeyForAuthenticatedUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersCreateSshSigningKeyForAuthenticatedUser");
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
| **usersCreateSshSigningKeyForAuthenticatedUserRequest** | [**UsersCreateSshSigningKeyForAuthenticatedUserRequest**](UsersCreateSshSigningKeyForAuthenticatedUserRequest.md)|  | |

### Return type

[**SshSigningKey**](SshSigningKey.md)

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
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersDeleteEmailForAuthenticatedUser"></a>
# **usersDeleteEmailForAuthenticatedUser**
> usersDeleteEmailForAuthenticatedUser(usersDeleteEmailForAuthenticatedUserRequest)

Delete an email address for the authenticated user

This endpoint is accessible with the &#x60;user&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UsersDeleteEmailForAuthenticatedUserRequest usersDeleteEmailForAuthenticatedUserRequest = new UsersDeleteEmailForAuthenticatedUserRequest(); // UsersDeleteEmailForAuthenticatedUserRequest | 
    try {
      apiInstance.usersDeleteEmailForAuthenticatedUser(usersDeleteEmailForAuthenticatedUserRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersDeleteEmailForAuthenticatedUser");
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
| **usersDeleteEmailForAuthenticatedUserRequest** | [**UsersDeleteEmailForAuthenticatedUserRequest**](UsersDeleteEmailForAuthenticatedUserRequest.md)|  | [optional] |

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
| **304** | Not modified |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="usersDeleteGpgKeyForAuthenticatedUser"></a>
# **usersDeleteGpgKeyForAuthenticatedUser**
> usersDeleteGpgKeyForAuthenticatedUser(gpgKeyId)

Delete a GPG key for the authenticated user

Removes a GPG key from the authenticated user&#39;s GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least &#x60;admin:gpg_key&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer gpgKeyId = 56; // Integer | The unique identifier of the GPG key.
    try {
      apiInstance.usersDeleteGpgKeyForAuthenticatedUser(gpgKeyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersDeleteGpgKeyForAuthenticatedUser");
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
| **gpgKeyId** | **Integer**| The unique identifier of the GPG key. | |

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
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **304** | Not modified |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersDeletePublicSshKeyForAuthenticatedUser"></a>
# **usersDeletePublicSshKeyForAuthenticatedUser**
> usersDeletePublicSshKeyForAuthenticatedUser(keyId)

Delete a public SSH key for the authenticated user

Removes a public SSH key from the authenticated user&#39;s GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least &#x60;admin:public_key&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer keyId = 56; // Integer | The unique identifier of the key.
    try {
      apiInstance.usersDeletePublicSshKeyForAuthenticatedUser(keyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersDeletePublicSshKeyForAuthenticatedUser");
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
| **keyId** | **Integer**| The unique identifier of the key. | |

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

<a name="usersDeleteSocialAccountForAuthenticatedUser"></a>
# **usersDeleteSocialAccountForAuthenticatedUser**
> usersDeleteSocialAccountForAuthenticatedUser(usersDeleteSocialAccountForAuthenticatedUserRequest)

Delete social accounts for the authenticated user

Deletes one or more social accounts from the authenticated user&#39;s profile. This endpoint is accessible with the &#x60;user&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UsersDeleteSocialAccountForAuthenticatedUserRequest usersDeleteSocialAccountForAuthenticatedUserRequest = new UsersDeleteSocialAccountForAuthenticatedUserRequest(); // UsersDeleteSocialAccountForAuthenticatedUserRequest | 
    try {
      apiInstance.usersDeleteSocialAccountForAuthenticatedUser(usersDeleteSocialAccountForAuthenticatedUserRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersDeleteSocialAccountForAuthenticatedUser");
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
| **usersDeleteSocialAccountForAuthenticatedUserRequest** | [**UsersDeleteSocialAccountForAuthenticatedUserRequest**](UsersDeleteSocialAccountForAuthenticatedUserRequest.md)|  | |

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
| **304** | Not modified |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersDeleteSshSigningKeyForAuthenticatedUser"></a>
# **usersDeleteSshSigningKeyForAuthenticatedUser**
> usersDeleteSshSigningKeyForAuthenticatedUser(sshSigningKeyId)

Delete an SSH signing key for the authenticated user

Deletes an SSH signing key from the authenticated user&#39;s GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least &#x60;admin:ssh_signing_key&#x60; scope. For more information, see \&quot;[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer sshSigningKeyId = 56; // Integer | The unique identifier of the SSH signing key.
    try {
      apiInstance.usersDeleteSshSigningKeyForAuthenticatedUser(sshSigningKeyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersDeleteSshSigningKeyForAuthenticatedUser");
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
| **sshSigningKeyId** | **Integer**| The unique identifier of the SSH signing key. | |

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

<a name="usersFollow"></a>
# **usersFollow**
> usersFollow(username)

Follow a user

Note that you&#39;ll need to set &#x60;Content-Length&#x60; to zero when calling out to this endpoint. For more information, see \&quot;[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs).\&quot;  Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the &#x60;user:follow&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.usersFollow(username);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersFollow");
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

<a name="usersGetAuthenticated"></a>
# **usersGetAuthenticated**
> UsersGetAuthenticated200Response usersGetAuthenticated()

Get the authenticated user

If the authenticated user is authenticated with an OAuth token with the &#x60;user&#x60; scope, then the response lists public and private profile information.  If the authenticated user is authenticated through OAuth without the &#x60;user&#x60; scope, then the response lists only public profile information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    try {
      UsersGetAuthenticated200Response result = apiInstance.usersGetAuthenticated();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersGetAuthenticated");
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

[**UsersGetAuthenticated200Response**](UsersGetAuthenticated200Response.md)

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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersGetByUsername"></a>
# **usersGetByUsername**
> UsersGetAuthenticated200Response usersGetByUsername(username)

Get a user

Provides publicly available information about someone with a GitHub account.  GitHub Apps with the &#x60;Plan&#x60; user permission can use this endpoint to retrieve information about a user&#39;s GitHub plan. The GitHub App must be authenticated as a user. See \&quot;[Identifying and authorizing users for GitHub Apps](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/)\&quot; for details about authentication. For an example response, see &#39;Response with GitHub plan information&#39; below\&quot;  The &#x60;email&#x60; key in the following response is the publicly visible email address from your GitHub [profile page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to be “public” which provides an email entry for this endpoint. If you do not set a public email address for &#x60;email&#x60;, then it will have a value of &#x60;null&#x60;. You only see publicly visible email addresses when authenticated with GitHub. For more information, see [Authentication](https://docs.github.com/rest/overview/resources-in-the-rest-api#authentication).  The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly. For more information, see \&quot;[Emails API](https://docs.github.com/rest/reference/users#emails)\&quot;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      UsersGetAuthenticated200Response result = apiInstance.usersGetByUsername(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersGetByUsername");
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

[**UsersGetAuthenticated200Response**](UsersGetAuthenticated200Response.md)

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

<a name="usersGetContextForUser"></a>
# **usersGetContextForUser**
> Hovercard usersGetContextForUser(username, subjectType, subjectId)

Get contextual information for a user

Provides hovercard information when authenticated through basic auth or OAuth with the &#x60;repo&#x60; scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.  The &#x60;subject_type&#x60; and &#x60;subject_id&#x60; parameters provide context for the person&#39;s hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about &#x60;octocat&#x60; who owns the &#x60;Spoon-Knife&#x60; repository via cURL, it would look like this:  &#x60;&#x60;&#x60;shell  curl -u username:token   https://api.github.com/users/octocat/hovercard?subject_type&#x3D;repository&amp;subject_id&#x3D;1300192 &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    String subjectType = "organization"; // String | Identifies which additional information you'd like to receive about the person's hovercard. Can be `organization`, `repository`, `issue`, `pull_request`. **Required** when using `subject_id`.
    String subjectId = "subjectId_example"; // String | Uses the ID for the `subject_type` you specified. **Required** when using `subject_type`.
    try {
      Hovercard result = apiInstance.usersGetContextForUser(username, subjectType, subjectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersGetContextForUser");
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
| **subjectType** | **String**| Identifies which additional information you&#39;d like to receive about the person&#39;s hovercard. Can be &#x60;organization&#x60;, &#x60;repository&#x60;, &#x60;issue&#x60;, &#x60;pull_request&#x60;. **Required** when using &#x60;subject_id&#x60;. | [optional] [enum: organization, repository, issue, pull_request] |
| **subjectId** | **String**| Uses the ID for the &#x60;subject_type&#x60; you specified. **Required** when using &#x60;subject_type&#x60;. | [optional] |

### Return type

[**Hovercard**](Hovercard.md)

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
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="usersGetGpgKeyForAuthenticatedUser"></a>
# **usersGetGpgKeyForAuthenticatedUser**
> GpgKey usersGetGpgKeyForAuthenticatedUser(gpgKeyId)

Get a GPG key for the authenticated user

View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least &#x60;read:gpg_key&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer gpgKeyId = 56; // Integer | The unique identifier of the GPG key.
    try {
      GpgKey result = apiInstance.usersGetGpgKeyForAuthenticatedUser(gpgKeyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersGetGpgKeyForAuthenticatedUser");
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
| **gpgKeyId** | **Integer**| The unique identifier of the GPG key. | |

### Return type

[**GpgKey**](GpgKey.md)

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

<a name="usersGetPublicSshKeyForAuthenticatedUser"></a>
# **usersGetPublicSshKeyForAuthenticatedUser**
> Key usersGetPublicSshKeyForAuthenticatedUser(keyId)

Get a public SSH key for the authenticated user

View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least &#x60;read:public_key&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer keyId = 56; // Integer | The unique identifier of the key.
    try {
      Key result = apiInstance.usersGetPublicSshKeyForAuthenticatedUser(keyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersGetPublicSshKeyForAuthenticatedUser");
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
| **keyId** | **Integer**| The unique identifier of the key. | |

### Return type

[**Key**](Key.md)

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

<a name="usersGetSshSigningKeyForAuthenticatedUser"></a>
# **usersGetSshSigningKeyForAuthenticatedUser**
> SshSigningKey usersGetSshSigningKeyForAuthenticatedUser(sshSigningKeyId)

Get an SSH signing key for the authenticated user

Gets extended details for an SSH signing key. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least &#x60;read:ssh_signing_key&#x60; scope. For more information, see \&quot;[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer sshSigningKeyId = 56; // Integer | The unique identifier of the SSH signing key.
    try {
      SshSigningKey result = apiInstance.usersGetSshSigningKeyForAuthenticatedUser(sshSigningKeyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersGetSshSigningKeyForAuthenticatedUser");
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
| **sshSigningKeyId** | **Integer**| The unique identifier of the SSH signing key. | |

### Return type

[**SshSigningKey**](SshSigningKey.md)

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

<a name="usersList"></a>
# **usersList**
> List&lt;SimpleUser&gt; usersList(since, perPage)

List users

Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.  Note: Pagination is powered exclusively by the &#x60;since&#x60; parameter. Use the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers) to get the URL for the next page of users.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer since = 56; // Integer | A user ID. Only return users with an ID greater than this ID.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    try {
      List<SimpleUser> result = apiInstance.usersList(since, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersList");
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
| **since** | **Integer**| A user ID. Only return users with an ID greater than this ID. | [optional] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |

### Return type

[**List&lt;SimpleUser&gt;**](SimpleUser.md)

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

<a name="usersListBlockedByAuthenticatedUser"></a>
# **usersListBlockedByAuthenticatedUser**
> List&lt;SimpleUser&gt; usersListBlockedByAuthenticatedUser(perPage, page)

List users blocked by the authenticated user

List the users you&#39;ve blocked on your personal account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<SimpleUser> result = apiInstance.usersListBlockedByAuthenticatedUser(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersListBlockedByAuthenticatedUser");
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

[**List&lt;SimpleUser&gt;**](SimpleUser.md)

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
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersListEmailsForAuthenticatedUser"></a>
# **usersListEmailsForAuthenticatedUser**
> List&lt;Email&gt; usersListEmailsForAuthenticatedUser(perPage, page)

List email addresses for the authenticated user

Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the &#x60;user:email&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Email> result = apiInstance.usersListEmailsForAuthenticatedUser(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersListEmailsForAuthenticatedUser");
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

[**List&lt;Email&gt;**](Email.md)

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
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersListFollowedByAuthenticatedUser"></a>
# **usersListFollowedByAuthenticatedUser**
> List&lt;SimpleUser&gt; usersListFollowedByAuthenticatedUser(perPage, page)

List the people the authenticated user follows

Lists the people who the authenticated user follows.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<SimpleUser> result = apiInstance.usersListFollowedByAuthenticatedUser(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersListFollowedByAuthenticatedUser");
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

[**List&lt;SimpleUser&gt;**](SimpleUser.md)

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

<a name="usersListFollowersForAuthenticatedUser"></a>
# **usersListFollowersForAuthenticatedUser**
> List&lt;SimpleUser&gt; usersListFollowersForAuthenticatedUser(perPage, page)

List followers of the authenticated user

Lists the people following the authenticated user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<SimpleUser> result = apiInstance.usersListFollowersForAuthenticatedUser(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersListFollowersForAuthenticatedUser");
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

[**List&lt;SimpleUser&gt;**](SimpleUser.md)

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

<a name="usersListFollowersForUser"></a>
# **usersListFollowersForUser**
> List&lt;SimpleUser&gt; usersListFollowersForUser(username, perPage, page)

List followers of a user

Lists the people following the specified user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<SimpleUser> result = apiInstance.usersListFollowersForUser(username, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersListFollowersForUser");
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
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="usersListFollowingForUser"></a>
# **usersListFollowingForUser**
> List&lt;SimpleUser&gt; usersListFollowingForUser(username, perPage, page)

List the people a user follows

Lists the people who the specified user follows.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<SimpleUser> result = apiInstance.usersListFollowingForUser(username, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersListFollowingForUser");
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
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="usersListGpgKeysForAuthenticatedUser"></a>
# **usersListGpgKeysForAuthenticatedUser**
> List&lt;GpgKey&gt; usersListGpgKeysForAuthenticatedUser(perPage, page)

List GPG keys for the authenticated user

Lists the current user&#39;s GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least &#x60;read:gpg_key&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<GpgKey> result = apiInstance.usersListGpgKeysForAuthenticatedUser(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersListGpgKeysForAuthenticatedUser");
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

[**List&lt;GpgKey&gt;**](GpgKey.md)

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
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersListGpgKeysForUser"></a>
# **usersListGpgKeysForUser**
> List&lt;GpgKey&gt; usersListGpgKeysForUser(username, perPage, page)

List GPG keys for a user

Lists the GPG keys for a user. This information is accessible by anyone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<GpgKey> result = apiInstance.usersListGpgKeysForUser(username, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersListGpgKeysForUser");
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
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;GpgKey&gt;**](GpgKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="usersListPublicEmailsForAuthenticatedUser"></a>
# **usersListPublicEmailsForAuthenticatedUser**
> List&lt;Email&gt; usersListPublicEmailsForAuthenticatedUser(perPage, page)

List public email addresses for the authenticated user

Lists your publicly visible email address, which you can set with the [Set primary email visibility for the authenticated user](https://docs.github.com/rest/reference/users#set-primary-email-visibility-for-the-authenticated-user) endpoint. This endpoint is accessible with the &#x60;user:email&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Email> result = apiInstance.usersListPublicEmailsForAuthenticatedUser(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersListPublicEmailsForAuthenticatedUser");
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

[**List&lt;Email&gt;**](Email.md)

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
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersListPublicKeysForUser"></a>
# **usersListPublicKeysForUser**
> List&lt;KeySimple&gt; usersListPublicKeysForUser(username, perPage, page)

List public keys for a user

Lists the _verified_ public SSH keys for a user. This is accessible by anyone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<KeySimple> result = apiInstance.usersListPublicKeysForUser(username, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersListPublicKeysForUser");
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
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;KeySimple&gt;**](KeySimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="usersListPublicSshKeysForAuthenticatedUser"></a>
# **usersListPublicSshKeysForAuthenticatedUser**
> List&lt;Key&gt; usersListPublicSshKeysForAuthenticatedUser(perPage, page)

List public SSH keys for the authenticated user

Lists the public SSH keys for the authenticated user&#39;s GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least &#x60;read:public_key&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Key> result = apiInstance.usersListPublicSshKeysForAuthenticatedUser(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersListPublicSshKeysForAuthenticatedUser");
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

[**List&lt;Key&gt;**](Key.md)

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
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersListSocialAccountsForAuthenticatedUser"></a>
# **usersListSocialAccountsForAuthenticatedUser**
> List&lt;SocialAccount&gt; usersListSocialAccountsForAuthenticatedUser(perPage, page)

List social accounts for the authenticated user

Lists all of your social accounts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<SocialAccount> result = apiInstance.usersListSocialAccountsForAuthenticatedUser(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersListSocialAccountsForAuthenticatedUser");
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

[**List&lt;SocialAccount&gt;**](SocialAccount.md)

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
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersListSocialAccountsForUser"></a>
# **usersListSocialAccountsForUser**
> List&lt;SocialAccount&gt; usersListSocialAccountsForUser(username, perPage, page)

List social accounts for a user

Lists social media accounts for a user. This endpoint is accessible by anyone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<SocialAccount> result = apiInstance.usersListSocialAccountsForUser(username, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersListSocialAccountsForUser");
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
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;SocialAccount&gt;**](SocialAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="usersListSshSigningKeysForAuthenticatedUser"></a>
# **usersListSshSigningKeysForAuthenticatedUser**
> List&lt;SshSigningKey&gt; usersListSshSigningKeysForAuthenticatedUser(perPage, page)

List SSH signing keys for the authenticated user

Lists the SSH signing keys for the authenticated user&#39;s GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least &#x60;read:ssh_signing_key&#x60; scope. For more information, see \&quot;[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<SshSigningKey> result = apiInstance.usersListSshSigningKeysForAuthenticatedUser(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersListSshSigningKeysForAuthenticatedUser");
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

[**List&lt;SshSigningKey&gt;**](SshSigningKey.md)

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
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="usersListSshSigningKeysForUser"></a>
# **usersListSshSigningKeysForUser**
> List&lt;SshSigningKey&gt; usersListSshSigningKeysForUser(username, perPage, page)

List SSH signing keys for a user

Lists the SSH signing keys for a user. This operation is accessible by anyone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<SshSigningKey> result = apiInstance.usersListSshSigningKeysForUser(username, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersListSshSigningKeysForUser");
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
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;SshSigningKey&gt;**](SshSigningKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="usersSetPrimaryEmailVisibilityForAuthenticatedUser"></a>
# **usersSetPrimaryEmailVisibilityForAuthenticatedUser**
> List&lt;Email&gt; usersSetPrimaryEmailVisibilityForAuthenticatedUser(usersSetPrimaryEmailVisibilityForAuthenticatedUserRequest)

Set primary email visibility for the authenticated user

Sets the visibility for your primary email addresses.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest usersSetPrimaryEmailVisibilityForAuthenticatedUserRequest = new UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest(); // UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest | 
    try {
      List<Email> result = apiInstance.usersSetPrimaryEmailVisibilityForAuthenticatedUser(usersSetPrimaryEmailVisibilityForAuthenticatedUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersSetPrimaryEmailVisibilityForAuthenticatedUser");
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
| **usersSetPrimaryEmailVisibilityForAuthenticatedUserRequest** | [**UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest**](UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest.md)|  | |

### Return type

[**List&lt;Email&gt;**](Email.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **304** | Not modified |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="usersUnblock"></a>
# **usersUnblock**
> usersUnblock(username)

Unblock a user



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.usersUnblock(username);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersUnblock");
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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |
| **404** | Resource not found |  -  |

<a name="usersUnfollow"></a>
# **usersUnfollow**
> usersUnfollow(username)

Unfollow a user

Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the &#x60;user:follow&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.usersUnfollow(username);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersUnfollow");
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

<a name="usersUpdateAuthenticated"></a>
# **usersUpdateAuthenticated**
> PrivateUser usersUpdateAuthenticated(usersUpdateAuthenticatedRequest)

Update the authenticated user

**Note:** If your email is set to private and you send an &#x60;email&#x60; parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UsersUpdateAuthenticatedRequest usersUpdateAuthenticatedRequest = new UsersUpdateAuthenticatedRequest(); // UsersUpdateAuthenticatedRequest | 
    try {
      PrivateUser result = apiInstance.usersUpdateAuthenticated(usersUpdateAuthenticatedRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersUpdateAuthenticated");
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
| **usersUpdateAuthenticatedRequest** | [**UsersUpdateAuthenticatedRequest**](UsersUpdateAuthenticatedRequest.md)|  | [optional] |

### Return type

[**PrivateUser**](PrivateUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **304** | Not modified |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

