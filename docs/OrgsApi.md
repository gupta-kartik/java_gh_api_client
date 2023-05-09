# OrgsApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**orgsAddSecurityManagerTeam**](OrgsApi.md#orgsAddSecurityManagerTeam) | **PUT** /orgs/{org}/security-managers/teams/{team_slug} | Add a security manager team |
| [**orgsBlockUser**](OrgsApi.md#orgsBlockUser) | **PUT** /orgs/{org}/blocks/{username} | Block a user from an organization |
| [**orgsCancelInvitation**](OrgsApi.md#orgsCancelInvitation) | **DELETE** /orgs/{org}/invitations/{invitation_id} | Cancel an organization invitation |
| [**orgsCheckBlockedUser**](OrgsApi.md#orgsCheckBlockedUser) | **GET** /orgs/{org}/blocks/{username} | Check if a user is blocked by an organization |
| [**orgsCheckMembershipForUser**](OrgsApi.md#orgsCheckMembershipForUser) | **GET** /orgs/{org}/members/{username} | Check organization membership for a user |
| [**orgsCheckPublicMembershipForUser**](OrgsApi.md#orgsCheckPublicMembershipForUser) | **GET** /orgs/{org}/public_members/{username} | Check public organization membership for a user |
| [**orgsConvertMemberToOutsideCollaborator**](OrgsApi.md#orgsConvertMemberToOutsideCollaborator) | **PUT** /orgs/{org}/outside_collaborators/{username} | Convert an organization member to outside collaborator |
| [**orgsCreateInvitation**](OrgsApi.md#orgsCreateInvitation) | **POST** /orgs/{org}/invitations | Create an organization invitation |
| [**orgsCreateWebhook**](OrgsApi.md#orgsCreateWebhook) | **POST** /orgs/{org}/hooks | Create an organization webhook |
| [**orgsDelete**](OrgsApi.md#orgsDelete) | **DELETE** /orgs/{org} | Delete an organization |
| [**orgsDeleteWebhook**](OrgsApi.md#orgsDeleteWebhook) | **DELETE** /orgs/{org}/hooks/{hook_id} | Delete an organization webhook |
| [**orgsEnableOrDisableSecurityProductOnAllOrgRepos**](OrgsApi.md#orgsEnableOrDisableSecurityProductOnAllOrgRepos) | **POST** /orgs/{org}/{security_product}/{enablement} | Enable or disable a security feature for an organization |
| [**orgsGet**](OrgsApi.md#orgsGet) | **GET** /orgs/{org} | Get an organization |
| [**orgsGetMembershipForAuthenticatedUser**](OrgsApi.md#orgsGetMembershipForAuthenticatedUser) | **GET** /user/memberships/orgs/{org} | Get an organization membership for the authenticated user |
| [**orgsGetMembershipForUser**](OrgsApi.md#orgsGetMembershipForUser) | **GET** /orgs/{org}/memberships/{username} | Get organization membership for a user |
| [**orgsGetWebhook**](OrgsApi.md#orgsGetWebhook) | **GET** /orgs/{org}/hooks/{hook_id} | Get an organization webhook |
| [**orgsGetWebhookConfigForOrg**](OrgsApi.md#orgsGetWebhookConfigForOrg) | **GET** /orgs/{org}/hooks/{hook_id}/config | Get a webhook configuration for an organization |
| [**orgsGetWebhookDelivery**](OrgsApi.md#orgsGetWebhookDelivery) | **GET** /orgs/{org}/hooks/{hook_id}/deliveries/{delivery_id} | Get a webhook delivery for an organization webhook |
| [**orgsList**](OrgsApi.md#orgsList) | **GET** /organizations | List organizations |
| [**orgsListAppInstallations**](OrgsApi.md#orgsListAppInstallations) | **GET** /orgs/{org}/installations | List app installations for an organization |
| [**orgsListBlockedUsers**](OrgsApi.md#orgsListBlockedUsers) | **GET** /orgs/{org}/blocks | List users blocked by an organization |
| [**orgsListFailedInvitations**](OrgsApi.md#orgsListFailedInvitations) | **GET** /orgs/{org}/failed_invitations | List failed organization invitations |
| [**orgsListForAuthenticatedUser**](OrgsApi.md#orgsListForAuthenticatedUser) | **GET** /user/orgs | List organizations for the authenticated user |
| [**orgsListForUser**](OrgsApi.md#orgsListForUser) | **GET** /users/{username}/orgs | List organizations for a user |
| [**orgsListInvitationTeams**](OrgsApi.md#orgsListInvitationTeams) | **GET** /orgs/{org}/invitations/{invitation_id}/teams | List organization invitation teams |
| [**orgsListMembers**](OrgsApi.md#orgsListMembers) | **GET** /orgs/{org}/members | List organization members |
| [**orgsListMembershipsForAuthenticatedUser**](OrgsApi.md#orgsListMembershipsForAuthenticatedUser) | **GET** /user/memberships/orgs | List organization memberships for the authenticated user |
| [**orgsListOutsideCollaborators**](OrgsApi.md#orgsListOutsideCollaborators) | **GET** /orgs/{org}/outside_collaborators | List outside collaborators for an organization |
| [**orgsListPatGrantRepositories**](OrgsApi.md#orgsListPatGrantRepositories) | **GET** /organizations/{org}/personal-access-tokens/{pat_id}/repositories | List repositories a fine-grained personal access token has access to |
| [**orgsListPatGrantRequestRepositories**](OrgsApi.md#orgsListPatGrantRequestRepositories) | **GET** /organizations/{org}/personal-access-token-requests/{pat_request_id}/repositories | List repositories requested to be accessed by a fine-grained personal access token |
| [**orgsListPatGrantRequests**](OrgsApi.md#orgsListPatGrantRequests) | **GET** /organizations/{org}/personal-access-token-requests | List requests to access organization resources with fine-grained personal access tokens |
| [**orgsListPatGrants**](OrgsApi.md#orgsListPatGrants) | **GET** /organizations/{org}/personal-access-tokens | List fine-grained personal access tokens with access to organization resources |
| [**orgsListPendingInvitations**](OrgsApi.md#orgsListPendingInvitations) | **GET** /orgs/{org}/invitations | List pending organization invitations |
| [**orgsListPublicMembers**](OrgsApi.md#orgsListPublicMembers) | **GET** /orgs/{org}/public_members | List public organization members |
| [**orgsListSecurityManagerTeams**](OrgsApi.md#orgsListSecurityManagerTeams) | **GET** /orgs/{org}/security-managers | List security manager teams |
| [**orgsListWebhookDeliveries**](OrgsApi.md#orgsListWebhookDeliveries) | **GET** /orgs/{org}/hooks/{hook_id}/deliveries | List deliveries for an organization webhook |
| [**orgsListWebhooks**](OrgsApi.md#orgsListWebhooks) | **GET** /orgs/{org}/hooks | List organization webhooks |
| [**orgsPingWebhook**](OrgsApi.md#orgsPingWebhook) | **POST** /orgs/{org}/hooks/{hook_id}/pings | Ping an organization webhook |
| [**orgsRedeliverWebhookDelivery**](OrgsApi.md#orgsRedeliverWebhookDelivery) | **POST** /orgs/{org}/hooks/{hook_id}/deliveries/{delivery_id}/attempts | Redeliver a delivery for an organization webhook |
| [**orgsRemoveMember**](OrgsApi.md#orgsRemoveMember) | **DELETE** /orgs/{org}/members/{username} | Remove an organization member |
| [**orgsRemoveMembershipForUser**](OrgsApi.md#orgsRemoveMembershipForUser) | **DELETE** /orgs/{org}/memberships/{username} | Remove organization membership for a user |
| [**orgsRemoveOutsideCollaborator**](OrgsApi.md#orgsRemoveOutsideCollaborator) | **DELETE** /orgs/{org}/outside_collaborators/{username} | Remove outside collaborator from an organization |
| [**orgsRemovePublicMembershipForAuthenticatedUser**](OrgsApi.md#orgsRemovePublicMembershipForAuthenticatedUser) | **DELETE** /orgs/{org}/public_members/{username} | Remove public organization membership for the authenticated user |
| [**orgsRemoveSecurityManagerTeam**](OrgsApi.md#orgsRemoveSecurityManagerTeam) | **DELETE** /orgs/{org}/security-managers/teams/{team_slug} | Remove a security manager team |
| [**orgsReviewPatGrantRequest**](OrgsApi.md#orgsReviewPatGrantRequest) | **POST** /organizations/{org}/personal-access-token-requests/{pat_request_id} | Review a request to access organization resources with a fine-grained personal access token |
| [**orgsReviewPatGrantRequestsInBulk**](OrgsApi.md#orgsReviewPatGrantRequestsInBulk) | **POST** /organizations/{org}/personal-access-token-requests | Review requests to access organization resources with fine-grained personal access tokens |
| [**orgsSetMembershipForUser**](OrgsApi.md#orgsSetMembershipForUser) | **PUT** /orgs/{org}/memberships/{username} | Set organization membership for a user |
| [**orgsSetPublicMembershipForAuthenticatedUser**](OrgsApi.md#orgsSetPublicMembershipForAuthenticatedUser) | **PUT** /orgs/{org}/public_members/{username} | Set public organization membership for the authenticated user |
| [**orgsUnblockUser**](OrgsApi.md#orgsUnblockUser) | **DELETE** /orgs/{org}/blocks/{username} | Unblock a user from an organization |
| [**orgsUpdate**](OrgsApi.md#orgsUpdate) | **PATCH** /orgs/{org} | Update an organization |
| [**orgsUpdateMembershipForAuthenticatedUser**](OrgsApi.md#orgsUpdateMembershipForAuthenticatedUser) | **PATCH** /user/memberships/orgs/{org} | Update an organization membership for the authenticated user |
| [**orgsUpdatePatAccess**](OrgsApi.md#orgsUpdatePatAccess) | **POST** /organizations/{org}/personal-access-tokens/{pat_id} | Update the access a fine-grained personal access token has to organization resources |
| [**orgsUpdatePatAccesses**](OrgsApi.md#orgsUpdatePatAccesses) | **POST** /organizations/{org}/personal-access-tokens | Update the access to organization resources via fine-grained personal access tokens |
| [**orgsUpdateWebhook**](OrgsApi.md#orgsUpdateWebhook) | **PATCH** /orgs/{org}/hooks/{hook_id} | Update an organization webhook |
| [**orgsUpdateWebhookConfigForOrg**](OrgsApi.md#orgsUpdateWebhookConfigForOrg) | **PATCH** /orgs/{org}/hooks/{hook_id}/config | Update a webhook configuration for an organization |


<a name="orgsAddSecurityManagerTeam"></a>
# **orgsAddSecurityManagerTeam**
> orgsAddSecurityManagerTeam(org, teamSlug)

Add a security manager team

Adds a team as a security manager for an organization. For more information, see \&quot;[Managing security for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization) for an organization.\&quot;  To use this endpoint, you must be an administrator for the organization, and you must use an access token with the &#x60;write:org&#x60; scope.  GitHub Apps must have the &#x60;administration&#x60; organization read-write permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    try {
      apiInstance.orgsAddSecurityManagerTeam(org, teamSlug);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsAddSecurityManagerTeam");
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
| **teamSlug** | **String**| The slug of the team name. | |

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
| **409** | The organization has reached the maximum number of security manager teams. |  -  |

<a name="orgsBlockUser"></a>
# **orgsBlockUser**
> orgsBlockUser(org, username)

Block a user from an organization



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.orgsBlockUser(org, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsBlockUser");
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
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="orgsCancelInvitation"></a>
# **orgsCancelInvitation**
> orgsCancelInvitation(org, invitationId)

Cancel an organization invitation

Cancel an organization invitation. In order to cancel an organization invitation, the authenticated user must be an organization owner.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer invitationId = 56; // Integer | The unique identifier of the invitation.
    try {
      apiInstance.orgsCancelInvitation(org, invitationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsCancelInvitation");
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
| **invitationId** | **Integer**| The unique identifier of the invitation. | |

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
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **404** | Resource not found |  -  |

<a name="orgsCheckBlockedUser"></a>
# **orgsCheckBlockedUser**
> orgsCheckBlockedUser(org, username)

Check if a user is blocked by an organization



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.orgsCheckBlockedUser(org, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsCheckBlockedUser");
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

<a name="orgsCheckMembershipForUser"></a>
# **orgsCheckMembershipForUser**
> orgsCheckMembershipForUser(org, username)

Check organization membership for a user

Check if a user is, publicly or privately, a member of the organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.orgsCheckMembershipForUser(org, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsCheckMembershipForUser");
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
| **username** | **String**| The handle for the GitHub user account. | |

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
| **204** | Response if requester is an organization member and user is a member |  -  |
| **302** | Response if requester is not an organization member |  * Location -  <br>  |
| **404** | Not Found if requester is an organization member and user is not a member |  -  |

<a name="orgsCheckPublicMembershipForUser"></a>
# **orgsCheckPublicMembershipForUser**
> orgsCheckPublicMembershipForUser(org, username)

Check public organization membership for a user



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.orgsCheckPublicMembershipForUser(org, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsCheckPublicMembershipForUser");
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
| **username** | **String**| The handle for the GitHub user account. | |

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
| **204** | Response if user is a public member |  -  |
| **404** | Not Found if user is not a public member |  -  |

<a name="orgsConvertMemberToOutsideCollaborator"></a>
# **orgsConvertMemberToOutsideCollaborator**
> Object orgsConvertMemberToOutsideCollaborator(org, username, orgsConvertMemberToOutsideCollaboratorRequest)

Convert an organization member to outside collaborator

When an organization member is converted to an outside collaborator, they&#39;ll only have access to the repositories that their current team membership allows. The user will no longer be a member of the organization. For more information, see \&quot;[Converting an organization member to an outside collaborator](https://docs.github.com/articles/converting-an-organization-member-to-an-outside-collaborator/)\&quot;. Converting an organization member to an outside collaborator may be restricted by enterprise administrators. For more information, see \&quot;[Enforcing repository management policies in your enterprise](https://docs.github.com/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    OrgsConvertMemberToOutsideCollaboratorRequest orgsConvertMemberToOutsideCollaboratorRequest = new OrgsConvertMemberToOutsideCollaboratorRequest(); // OrgsConvertMemberToOutsideCollaboratorRequest | 
    try {
      Object result = apiInstance.orgsConvertMemberToOutsideCollaborator(org, username, orgsConvertMemberToOutsideCollaboratorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsConvertMemberToOutsideCollaborator");
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
| **username** | **String**| The handle for the GitHub user account. | |
| **orgsConvertMemberToOutsideCollaboratorRequest** | [**OrgsConvertMemberToOutsideCollaboratorRequest**](OrgsConvertMemberToOutsideCollaboratorRequest.md)|  | [optional] |

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
| **202** | User is getting converted asynchronously |  -  |
| **204** | User was converted |  -  |
| **403** | Forbidden if user is the last owner of the organization, not a member of the organization, or if the enterprise enforces a policy for inviting outside collaborators. For more information, see \&quot;[Enforcing repository management policies in your enterprise](https://docs.github.com/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories).\&quot; |  -  |
| **404** | Resource not found |  -  |

<a name="orgsCreateInvitation"></a>
# **orgsCreateInvitation**
> OrganizationInvitation orgsCreateInvitation(org, orgsCreateInvitationRequest)

Create an organization invitation

Invite people to an organization by using their GitHub user ID or their email address. In order to create invitations in an organization, the authenticated user must be an organization owner.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \&quot;[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\&quot; and \&quot;[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\&quot; for details.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    OrgsCreateInvitationRequest orgsCreateInvitationRequest = new OrgsCreateInvitationRequest(); // OrgsCreateInvitationRequest | 
    try {
      OrganizationInvitation result = apiInstance.orgsCreateInvitation(org, orgsCreateInvitationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsCreateInvitation");
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
| **orgsCreateInvitationRequest** | [**OrgsCreateInvitationRequest**](OrgsCreateInvitationRequest.md)|  | [optional] |

### Return type

[**OrganizationInvitation**](OrganizationInvitation.md)

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
| **404** | Resource not found |  -  |

<a name="orgsCreateWebhook"></a>
# **orgsCreateWebhook**
> OrgHook orgsCreateWebhook(org, orgsCreateWebhookRequest)

Create an organization webhook

Here&#39;s how you can create a hook that posts payloads in JSON format:

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    OrgsCreateWebhookRequest orgsCreateWebhookRequest = new OrgsCreateWebhookRequest(); // OrgsCreateWebhookRequest | 
    try {
      OrgHook result = apiInstance.orgsCreateWebhook(org, orgsCreateWebhookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsCreateWebhook");
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
| **orgsCreateWebhookRequest** | [**OrgsCreateWebhookRequest**](OrgsCreateWebhookRequest.md)|  | |

### Return type

[**OrgHook**](OrgHook.md)

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

<a name="orgsDelete"></a>
# **orgsDelete**
> Object orgsDelete(org)

Delete an organization

Deletes an organization and all its repositories.  The organization login will be unavailable for 90 days after deletion.  Please review the Terms of Service regarding account deletion before using this endpoint:  https://docs.github.com/site-policy/github-terms/github-terms-of-service

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      Object result = apiInstance.orgsDelete(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsDelete");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |

<a name="orgsDeleteWebhook"></a>
# **orgsDeleteWebhook**
> orgsDeleteWebhook(org, hookId)

Delete an organization webhook



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    try {
      apiInstance.orgsDeleteWebhook(org, hookId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsDeleteWebhook");
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
| **hookId** | **Integer**| The unique identifier of the hook. | |

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

<a name="orgsEnableOrDisableSecurityProductOnAllOrgRepos"></a>
# **orgsEnableOrDisableSecurityProductOnAllOrgRepos**
> orgsEnableOrDisableSecurityProductOnAllOrgRepos(org, securityProduct, enablement)

Enable or disable a security feature for an organization

Enables or disables the specified security feature for all eligible repositories in an organization.  To use this endpoint, you must be an organization owner or be member of a team with the security manager role. A token with the &#39;write:org&#39; scope is also required.  GitHub Apps must have the &#x60;organization_administration:write&#x60; permission to use this endpoint.  For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String securityProduct = "dependency_graph"; // String | The security feature to enable or disable.
    String enablement = "enable_all"; // String | The action to take.  `enable_all` means to enable the specified security feature for all repositories in the organization. `disable_all` means to disable the specified security feature for all repositories in the organization.
    try {
      apiInstance.orgsEnableOrDisableSecurityProductOnAllOrgRepos(org, securityProduct, enablement);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsEnableOrDisableSecurityProductOnAllOrgRepos");
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
| **securityProduct** | **String**| The security feature to enable or disable. | [enum: dependency_graph, dependabot_alerts, dependabot_security_updates, advanced_security, code_scanning_default_setup, secret_scanning, secret_scanning_push_protection] |
| **enablement** | **String**| The action to take.  &#x60;enable_all&#x60; means to enable the specified security feature for all repositories in the organization. &#x60;disable_all&#x60; means to disable the specified security feature for all repositories in the organization. | [enum: enable_all, disable_all] |

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
| **204** | Action started |  -  |
| **422** | The action could not be taken due to an in progress enablement, or a policy is preventing enablement |  -  |

<a name="orgsGet"></a>
# **orgsGet**
> OrganizationFull orgsGet(org)

Get an organization

To see many of the organization response values, you need to be an authenticated organization owner with the &#x60;admin:org&#x60; scope. When the value of &#x60;two_factor_requirement_enabled&#x60; is &#x60;true&#x60;, the organization requires all members, billing managers, and outside collaborators to enable [two-factor authentication](https://docs.github.com/articles/securing-your-account-with-two-factor-authentication-2fa/).  GitHub Apps with the &#x60;Organization plan&#x60; permission can use this endpoint to retrieve information about an organization&#39;s GitHub plan. See \&quot;[Authenticating with GitHub Apps](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/)\&quot; for details. For an example response, see &#39;Response with GitHub plan information&#39; below.\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      OrganizationFull result = apiInstance.orgsGet(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsGet");
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

[**OrganizationFull**](OrganizationFull.md)

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

<a name="orgsGetMembershipForAuthenticatedUser"></a>
# **orgsGetMembershipForAuthenticatedUser**
> OrgMembership orgsGetMembershipForAuthenticatedUser(org)

Get an organization membership for the authenticated user



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      OrgMembership result = apiInstance.orgsGetMembershipForAuthenticatedUser(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsGetMembershipForAuthenticatedUser");
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

[**OrgMembership**](OrgMembership.md)

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

<a name="orgsGetMembershipForUser"></a>
# **orgsGetMembershipForUser**
> OrgMembership orgsGetMembershipForUser(org, username)

Get organization membership for a user

In order to get a user&#39;s membership with an organization, the authenticated user must be an organization member. The &#x60;state&#x60; parameter in the response can be used to identify the user&#39;s membership status.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      OrgMembership result = apiInstance.orgsGetMembershipForUser(org, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsGetMembershipForUser");
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
| **username** | **String**| The handle for the GitHub user account. | |

### Return type

[**OrgMembership**](OrgMembership.md)

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
| **403** | Forbidden |  -  |

<a name="orgsGetWebhook"></a>
# **orgsGetWebhook**
> OrgHook orgsGetWebhook(org, hookId)

Get an organization webhook

Returns a webhook configured in an organization. To get only the webhook &#x60;config&#x60; properties, see \&quot;[Get a webhook configuration for an organization](/rest/reference/orgs#get-a-webhook-configuration-for-an-organization).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    try {
      OrgHook result = apiInstance.orgsGetWebhook(org, hookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsGetWebhook");
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
| **hookId** | **Integer**| The unique identifier of the hook. | |

### Return type

[**OrgHook**](OrgHook.md)

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

<a name="orgsGetWebhookConfigForOrg"></a>
# **orgsGetWebhookConfigForOrg**
> WebhookConfig orgsGetWebhookConfigForOrg(org, hookId)

Get a webhook configuration for an organization

Returns the webhook configuration for an organization. To get more information about the webhook, including the &#x60;active&#x60; state and &#x60;events&#x60;, use \&quot;[Get an organization webhook ](/rest/reference/orgs#get-an-organization-webhook).\&quot;  Access tokens must have the &#x60;admin:org_hook&#x60; scope, and GitHub Apps must have the &#x60;organization_hooks:read&#x60; permission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    try {
      WebhookConfig result = apiInstance.orgsGetWebhookConfigForOrg(org, hookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsGetWebhookConfigForOrg");
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
| **hookId** | **Integer**| The unique identifier of the hook. | |

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

<a name="orgsGetWebhookDelivery"></a>
# **orgsGetWebhookDelivery**
> HookDelivery orgsGetWebhookDelivery(org, hookId, deliveryId)

Get a webhook delivery for an organization webhook

Returns a delivery for a webhook configured in an organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    Integer deliveryId = 56; // Integer | 
    try {
      HookDelivery result = apiInstance.orgsGetWebhookDelivery(org, hookId, deliveryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsGetWebhookDelivery");
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
| **hookId** | **Integer**| The unique identifier of the hook. | |
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

<a name="orgsList"></a>
# **orgsList**
> List&lt;OrganizationSimple&gt; orgsList(since, perPage)

List organizations

Lists all organizations, in the order that they were created on GitHub.  **Note:** Pagination is powered exclusively by the &#x60;since&#x60; parameter. Use the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers) to get the URL for the next page of organizations.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    Integer since = 56; // Integer | An organization ID. Only return organizations with an ID greater than this ID.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    try {
      List<OrganizationSimple> result = apiInstance.orgsList(since, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsList");
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
| **since** | **Integer**| An organization ID. Only return organizations with an ID greater than this ID. | [optional] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |

### Return type

[**List&lt;OrganizationSimple&gt;**](OrganizationSimple.md)

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

<a name="orgsListAppInstallations"></a>
# **orgsListAppInstallations**
> OrgsListAppInstallations200Response orgsListAppInstallations(org, perPage, page)

List app installations for an organization

Lists all GitHub Apps in an organization. The installation count includes all GitHub Apps installed on repositories in the organization. You must be an organization owner with &#x60;admin:read&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      OrgsListAppInstallations200Response result = apiInstance.orgsListAppInstallations(org, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListAppInstallations");
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
| **200** | Response |  * Link -  <br>  |

<a name="orgsListBlockedUsers"></a>
# **orgsListBlockedUsers**
> List&lt;SimpleUser&gt; orgsListBlockedUsers(org, perPage, page)

List users blocked by an organization

List the users blocked by an organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<SimpleUser> result = apiInstance.orgsListBlockedUsers(org, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListBlockedUsers");
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

<a name="orgsListFailedInvitations"></a>
# **orgsListFailedInvitations**
> List&lt;OrganizationInvitation&gt; orgsListFailedInvitations(org, perPage, page)

List failed organization invitations

The return hash contains &#x60;failed_at&#x60; and &#x60;failed_reason&#x60; fields which represent the time at which the invitation failed and the reason for the failure.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<OrganizationInvitation> result = apiInstance.orgsListFailedInvitations(org, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListFailedInvitations");
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

### Return type

[**List&lt;OrganizationInvitation&gt;**](OrganizationInvitation.md)

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

<a name="orgsListForAuthenticatedUser"></a>
# **orgsListForAuthenticatedUser**
> List&lt;OrganizationSimple&gt; orgsListForAuthenticatedUser(perPage, page)

List organizations for the authenticated user

List organizations for the authenticated user.  **OAuth scope requirements**  This only lists organizations that your authorization allows you to operate on in some way (e.g., you can list teams with &#x60;read:org&#x60; scope, you can publicize your organization membership with &#x60;user&#x60; scope, etc.). Therefore, this API requires at least &#x60;user&#x60; or &#x60;read:org&#x60; scope. OAuth requests with insufficient scope receive a &#x60;403 Forbidden&#x60; response.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<OrganizationSimple> result = apiInstance.orgsListForAuthenticatedUser(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListForAuthenticatedUser");
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

[**List&lt;OrganizationSimple&gt;**](OrganizationSimple.md)

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

<a name="orgsListForUser"></a>
# **orgsListForUser**
> List&lt;OrganizationSimple&gt; orgsListForUser(username, perPage, page)

List organizations for a user

List [public organization memberships](https://docs.github.com/articles/publicizing-or-concealing-organization-membership) for the specified user.  This method only lists _public_ memberships, regardless of authentication. If you need to fetch all of the organization memberships (public and private) for the authenticated user, use the [List organizations for the authenticated user](https://docs.github.com/rest/reference/orgs#list-organizations-for-the-authenticated-user) API instead.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<OrganizationSimple> result = apiInstance.orgsListForUser(username, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListForUser");
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

[**List&lt;OrganizationSimple&gt;**](OrganizationSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="orgsListInvitationTeams"></a>
# **orgsListInvitationTeams**
> List&lt;Team&gt; orgsListInvitationTeams(org, invitationId, perPage, page)

List organization invitation teams

List all teams associated with an invitation. In order to see invitations in an organization, the authenticated user must be an organization owner.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer invitationId = 56; // Integer | The unique identifier of the invitation.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Team> result = apiInstance.orgsListInvitationTeams(org, invitationId, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListInvitationTeams");
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
| **invitationId** | **Integer**| The unique identifier of the invitation. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;Team&gt;**](Team.md)

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

<a name="orgsListMembers"></a>
# **orgsListMembers**
> List&lt;SimpleUser&gt; orgsListMembers(org, filter, role, perPage, page)

List organization members

List all users who are members of an organization. If the authenticated user is also a member of this organization then both concealed and public members will be returned.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String filter = "2fa_disabled"; // String | Filter members returned in the list. `2fa_disabled` means that only members without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled will be returned. This options is only available for organization owners.
    String role = "all"; // String | Filter members returned by their role.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<SimpleUser> result = apiInstance.orgsListMembers(org, filter, role, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListMembers");
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
| **filter** | **String**| Filter members returned in the list. &#x60;2fa_disabled&#x60; means that only members without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled will be returned. This options is only available for organization owners. | [optional] [default to all] [enum: 2fa_disabled, all] |
| **role** | **String**| Filter members returned by their role. | [optional] [default to all] [enum: all, admin, member] |
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
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="orgsListMembershipsForAuthenticatedUser"></a>
# **orgsListMembershipsForAuthenticatedUser**
> List&lt;OrgMembership&gt; orgsListMembershipsForAuthenticatedUser(state, perPage, page)

List organization memberships for the authenticated user



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String state = "active"; // String | Indicates the state of the memberships to return. If not specified, the API returns both active and pending memberships.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<OrgMembership> result = apiInstance.orgsListMembershipsForAuthenticatedUser(state, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListMembershipsForAuthenticatedUser");
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
| **state** | **String**| Indicates the state of the memberships to return. If not specified, the API returns both active and pending memberships. | [optional] [enum: active, pending] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;OrgMembership&gt;**](OrgMembership.md)

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
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="orgsListOutsideCollaborators"></a>
# **orgsListOutsideCollaborators**
> List&lt;SimpleUser&gt; orgsListOutsideCollaborators(org, filter, perPage, page)

List outside collaborators for an organization

List all users who are outside collaborators of an organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String filter = "2fa_disabled"; // String | Filter the list of outside collaborators. `2fa_disabled` means that only outside collaborators without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled will be returned.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<SimpleUser> result = apiInstance.orgsListOutsideCollaborators(org, filter, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListOutsideCollaborators");
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
| **filter** | **String**| Filter the list of outside collaborators. &#x60;2fa_disabled&#x60; means that only outside collaborators without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled will be returned. | [optional] [default to all] [enum: 2fa_disabled, all] |
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

<a name="orgsListPatGrantRepositories"></a>
# **orgsListPatGrantRepositories**
> List&lt;MinimalRepository&gt; orgsListPatGrantRepositories(org, patId, perPage, page)

List repositories a fine-grained personal access token has access to

Lists the repositories a fine-grained personal access token has access to. Only GitHub Apps can call this API, using the &#x60;organization_personal_access_tokens: read&#x60; permission.  **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer patId = 56; // Integer | Unique identifier of the fine-grained personal access token.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<MinimalRepository> result = apiInstance.orgsListPatGrantRepositories(org, patId, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListPatGrantRepositories");
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
| **patId** | **Integer**| Unique identifier of the fine-grained personal access token. | |
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
| **500** | Internal Error |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **200** | Response |  * Link -  <br>  |

<a name="orgsListPatGrantRequestRepositories"></a>
# **orgsListPatGrantRequestRepositories**
> List&lt;MinimalRepository&gt; orgsListPatGrantRequestRepositories(org, patRequestId, perPage, page)

List repositories requested to be accessed by a fine-grained personal access token

Lists the repositories a fine-grained personal access token request is requesting access to. Only GitHub Apps can call this API, using the &#x60;organization_personal_access_token_requests: read&#x60; permission.  **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer patRequestId = 56; // Integer | Unique identifier of the request for access via fine-grained personal access token.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<MinimalRepository> result = apiInstance.orgsListPatGrantRequestRepositories(org, patRequestId, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListPatGrantRequestRepositories");
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
| **patRequestId** | **Integer**| Unique identifier of the request for access via fine-grained personal access token. | |
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
| **500** | Internal Error |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **200** | Response |  * Link -  <br>  |

<a name="orgsListPatGrantRequests"></a>
# **orgsListPatGrantRequests**
> List&lt;OrganizationProgrammaticAccessGrantRequest&gt; orgsListPatGrantRequests(org, perPage, page, sort, direction, owner, repository, permission, lastUsedBefore, lastUsedAfter)

List requests to access organization resources with fine-grained personal access tokens

Lists requests from organization members to access organization resources with a fine-grained personal access token. Only GitHub Apps can call this API, using the &#x60;organization_personal_access_token_requests: read&#x60; permission.  **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    String sort = "created_at"; // String | The property by which to sort the results.
    String direction = "asc"; // String | The direction to sort the results by.
    List<String> owner = Arrays.asList(); // List<String> | A list of owner usernames to use to filter the results.
    String repository = "Hello-World"; // String | The name of the repository to use to filter the results.
    String permission = "issues_read"; // String | The permission to use to filter the results.
    OffsetDateTime lastUsedBefore = OffsetDateTime.now(); // OffsetDateTime | Only show fine-grained personal access tokens used before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    OffsetDateTime lastUsedAfter = OffsetDateTime.now(); // OffsetDateTime | Only show fine-grained personal access tokens used after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    try {
      List<OrganizationProgrammaticAccessGrantRequest> result = apiInstance.orgsListPatGrantRequests(org, perPage, page, sort, direction, owner, repository, permission, lastUsedBefore, lastUsedAfter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListPatGrantRequests");
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
| **sort** | **String**| The property by which to sort the results. | [optional] [default to created_at] [enum: created_at] |
| **direction** | **String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc] |
| **owner** | [**List&lt;String&gt;**](String.md)| A list of owner usernames to use to filter the results. | [optional] |
| **repository** | **String**| The name of the repository to use to filter the results. | [optional] |
| **permission** | **String**| The permission to use to filter the results. | [optional] |
| **lastUsedBefore** | **OffsetDateTime**| Only show fine-grained personal access tokens used before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] |
| **lastUsedAfter** | **OffsetDateTime**| Only show fine-grained personal access tokens used after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] |

### Return type

[**List&lt;OrganizationProgrammaticAccessGrantRequest&gt;**](OrganizationProgrammaticAccessGrantRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | Internal Error |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **200** | Response |  * Link -  <br>  |

<a name="orgsListPatGrants"></a>
# **orgsListPatGrants**
> List&lt;OrganizationProgrammaticAccessGrant&gt; orgsListPatGrants(org, perPage, page, sort, direction, owner, repository, permission, lastUsedBefore, lastUsedAfter)

List fine-grained personal access tokens with access to organization resources

Lists approved fine-grained personal access tokens owned by organization members that can access organization resources. Only GitHub Apps can call this API, using the &#x60;organization_personal_access_tokens: read&#x60; permission.  **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    String sort = "created_at"; // String | The property by which to sort the results.
    String direction = "asc"; // String | The direction to sort the results by.
    List<String> owner = Arrays.asList(); // List<String> | A list of owner usernames to use to filter the results.
    String repository = "Hello-World"; // String | The name of the repository to use to filter the results.
    String permission = "issues_read"; // String | The permission to use to filter the results.
    OffsetDateTime lastUsedBefore = OffsetDateTime.now(); // OffsetDateTime | Only show fine-grained personal access tokens used before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    OffsetDateTime lastUsedAfter = OffsetDateTime.now(); // OffsetDateTime | Only show fine-grained personal access tokens used after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    try {
      List<OrganizationProgrammaticAccessGrant> result = apiInstance.orgsListPatGrants(org, perPage, page, sort, direction, owner, repository, permission, lastUsedBefore, lastUsedAfter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListPatGrants");
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
| **sort** | **String**| The property by which to sort the results. | [optional] [default to created_at] [enum: created_at] |
| **direction** | **String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc] |
| **owner** | [**List&lt;String&gt;**](String.md)| A list of owner usernames to use to filter the results. | [optional] |
| **repository** | **String**| The name of the repository to use to filter the results. | [optional] |
| **permission** | **String**| The permission to use to filter the results. | [optional] |
| **lastUsedBefore** | **OffsetDateTime**| Only show fine-grained personal access tokens used before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] |
| **lastUsedAfter** | **OffsetDateTime**| Only show fine-grained personal access tokens used after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] |

### Return type

[**List&lt;OrganizationProgrammaticAccessGrant&gt;**](OrganizationProgrammaticAccessGrant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | Internal Error |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **200** | Response |  * Link -  <br>  |

<a name="orgsListPendingInvitations"></a>
# **orgsListPendingInvitations**
> List&lt;OrganizationInvitation&gt; orgsListPendingInvitations(org, perPage, page, role, invitationSource)

List pending organization invitations

The return hash contains a &#x60;role&#x60; field which refers to the Organization Invitation role and will be one of the following values: &#x60;direct_member&#x60;, &#x60;admin&#x60;, &#x60;billing_manager&#x60;, or &#x60;hiring_manager&#x60;. If the invitee is not a GitHub member, the &#x60;login&#x60; field in the return hash will be &#x60;null&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    String role = "all"; // String | Filter invitations by their member role.
    String invitationSource = "all"; // String | Filter invitations by their invitation source.
    try {
      List<OrganizationInvitation> result = apiInstance.orgsListPendingInvitations(org, perPage, page, role, invitationSource);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListPendingInvitations");
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
| **role** | **String**| Filter invitations by their member role. | [optional] [default to all] [enum: all, admin, direct_member, billing_manager, hiring_manager] |
| **invitationSource** | **String**| Filter invitations by their invitation source. | [optional] [default to all] [enum: all, member, scim] |

### Return type

[**List&lt;OrganizationInvitation&gt;**](OrganizationInvitation.md)

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

<a name="orgsListPublicMembers"></a>
# **orgsListPublicMembers**
> List&lt;SimpleUser&gt; orgsListPublicMembers(org, perPage, page)

List public organization members

Members of an organization can choose to have their membership publicized or not.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<SimpleUser> result = apiInstance.orgsListPublicMembers(org, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListPublicMembers");
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

<a name="orgsListSecurityManagerTeams"></a>
# **orgsListSecurityManagerTeams**
> List&lt;TeamSimple&gt; orgsListSecurityManagerTeams(org)

List security manager teams

Lists teams that are security managers for an organization. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  To use this endpoint, you must be an administrator or security manager for the organization, and you must use an access token with the &#x60;read:org&#x60; scope.  GitHub Apps must have the &#x60;administration&#x60; organization read permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      List<TeamSimple> result = apiInstance.orgsListSecurityManagerTeams(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListSecurityManagerTeams");
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

[**List&lt;TeamSimple&gt;**](TeamSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="orgsListWebhookDeliveries"></a>
# **orgsListWebhookDeliveries**
> List&lt;HookDeliveryItem&gt; orgsListWebhookDeliveries(org, hookId, perPage, cursor, redelivery)

List deliveries for an organization webhook

Returns a list of webhook deliveries for a webhook configured in an organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    String cursor = "cursor_example"; // String | Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the `link` header for the next and previous page cursors.
    Boolean redelivery = true; // Boolean | 
    try {
      List<HookDeliveryItem> result = apiInstance.orgsListWebhookDeliveries(org, hookId, perPage, cursor, redelivery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListWebhookDeliveries");
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
| **hookId** | **Integer**| The unique identifier of the hook. | |
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

<a name="orgsListWebhooks"></a>
# **orgsListWebhooks**
> List&lt;OrgHook&gt; orgsListWebhooks(org, perPage, page)

List organization webhooks



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<OrgHook> result = apiInstance.orgsListWebhooks(org, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsListWebhooks");
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

### Return type

[**List&lt;OrgHook&gt;**](OrgHook.md)

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

<a name="orgsPingWebhook"></a>
# **orgsPingWebhook**
> orgsPingWebhook(org, hookId)

Ping an organization webhook

This will trigger a [ping event](https://docs.github.com/webhooks/#ping-event) to be sent to the hook.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    try {
      apiInstance.orgsPingWebhook(org, hookId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsPingWebhook");
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
| **hookId** | **Integer**| The unique identifier of the hook. | |

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

<a name="orgsRedeliverWebhookDelivery"></a>
# **orgsRedeliverWebhookDelivery**
> Object orgsRedeliverWebhookDelivery(org, hookId, deliveryId)

Redeliver a delivery for an organization webhook

Redeliver a delivery for a webhook configured in an organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    Integer deliveryId = 56; // Integer | 
    try {
      Object result = apiInstance.orgsRedeliverWebhookDelivery(org, hookId, deliveryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsRedeliverWebhookDelivery");
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
| **hookId** | **Integer**| The unique identifier of the hook. | |
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

<a name="orgsRemoveMember"></a>
# **orgsRemoveMember**
> orgsRemoveMember(org, username)

Remove an organization member

Removing a user from this list will remove them from all teams and they will no longer have any access to the organization&#39;s repositories.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.orgsRemoveMember(org, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsRemoveMember");
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
| **403** | Forbidden |  -  |

<a name="orgsRemoveMembershipForUser"></a>
# **orgsRemoveMembershipForUser**
> orgsRemoveMembershipForUser(org, username)

Remove organization membership for a user

In order to remove a user&#39;s membership with an organization, the authenticated user must be an organization owner.  If the specified user is an active member of the organization, this will remove them from the organization. If the specified user has been invited to the organization, this will cancel their invitation. The specified user will receive an email notification in both cases.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.orgsRemoveMembershipForUser(org, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsRemoveMembershipForUser");
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
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="orgsRemoveOutsideCollaborator"></a>
# **orgsRemoveOutsideCollaborator**
> orgsRemoveOutsideCollaborator(org, username)

Remove outside collaborator from an organization

Removing a user from this list will remove them from all the organization&#39;s repositories.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.orgsRemoveOutsideCollaborator(org, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsRemoveOutsideCollaborator");
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
| **422** | Unprocessable Entity if user is a member of the organization |  -  |

<a name="orgsRemovePublicMembershipForAuthenticatedUser"></a>
# **orgsRemovePublicMembershipForAuthenticatedUser**
> orgsRemovePublicMembershipForAuthenticatedUser(org, username)

Remove public organization membership for the authenticated user



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.orgsRemovePublicMembershipForAuthenticatedUser(org, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsRemovePublicMembershipForAuthenticatedUser");
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
| **username** | **String**| The handle for the GitHub user account. | |

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

<a name="orgsRemoveSecurityManagerTeam"></a>
# **orgsRemoveSecurityManagerTeam**
> orgsRemoveSecurityManagerTeam(org, teamSlug)

Remove a security manager team

Removes the security manager role from a team for an organization. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization) team from an organization.\&quot;  To use this endpoint, you must be an administrator for the organization, and you must use an access token with the &#x60;admin:org&#x60; scope.  GitHub Apps must have the &#x60;administration&#x60; organization read-write permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    try {
      apiInstance.orgsRemoveSecurityManagerTeam(org, teamSlug);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsRemoveSecurityManagerTeam");
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
| **teamSlug** | **String**| The slug of the team name. | |

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

<a name="orgsReviewPatGrantRequest"></a>
# **orgsReviewPatGrantRequest**
> orgsReviewPatGrantRequest(org, patRequestId, orgsReviewPatGrantRequestRequest)

Review a request to access organization resources with a fine-grained personal access token

Approves or denies a pending request to access organization resources via a fine-grained personal access token. Only GitHub Apps can call this API, using the &#x60;organization_personal_access_token_requests: write&#x60; permission.  **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer patRequestId = 56; // Integer | Unique identifier of the request for access via fine-grained personal access token.
    OrgsReviewPatGrantRequestRequest orgsReviewPatGrantRequestRequest = new OrgsReviewPatGrantRequestRequest(); // OrgsReviewPatGrantRequestRequest | 
    try {
      apiInstance.orgsReviewPatGrantRequest(org, patRequestId, orgsReviewPatGrantRequestRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsReviewPatGrantRequest");
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
| **patRequestId** | **Integer**| Unique identifier of the request for access via fine-grained personal access token. | |
| **orgsReviewPatGrantRequestRequest** | [**OrgsReviewPatGrantRequestRequest**](OrgsReviewPatGrantRequestRequest.md)|  | |

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
| **500** | Internal Error |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **204** | A header with no content is returned. |  -  |

<a name="orgsReviewPatGrantRequestsInBulk"></a>
# **orgsReviewPatGrantRequestsInBulk**
> Object orgsReviewPatGrantRequestsInBulk(org, orgsReviewPatGrantRequestsInBulkRequest)

Review requests to access organization resources with fine-grained personal access tokens

Approves or denies multiple pending requests to access organization resources via a fine-grained personal access token. Only GitHub Apps can call this API, using the &#x60;organization_personal_access_token_requests: write&#x60; permission.  **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    OrgsReviewPatGrantRequestsInBulkRequest orgsReviewPatGrantRequestsInBulkRequest = new OrgsReviewPatGrantRequestsInBulkRequest(); // OrgsReviewPatGrantRequestsInBulkRequest | 
    try {
      Object result = apiInstance.orgsReviewPatGrantRequestsInBulk(org, orgsReviewPatGrantRequestsInBulkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsReviewPatGrantRequestsInBulk");
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
| **orgsReviewPatGrantRequestsInBulkRequest** | [**OrgsReviewPatGrantRequestsInBulkRequest**](OrgsReviewPatGrantRequestsInBulkRequest.md)|  | |

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
| **500** | Internal Error |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **202** | Accepted |  -  |

<a name="orgsSetMembershipForUser"></a>
# **orgsSetMembershipForUser**
> OrgMembership orgsSetMembershipForUser(org, username, orgsSetMembershipForUserRequest)

Set organization membership for a user

Only authenticated organization owners can add a member to the organization or update the member&#39;s role.  *   If the authenticated user is _adding_ a member to the organization, the invited user will receive an email inviting them to the organization. The user&#39;s [membership status](https://docs.github.com/rest/reference/orgs#get-organization-membership-for-a-user) will be &#x60;pending&#x60; until they accept the invitation.      *   Authenticated users can _update_ a user&#39;s membership by passing the &#x60;role&#x60; parameter. If the authenticated user changes a member&#39;s role to &#x60;admin&#x60;, the affected user will receive an email notifying them that they&#39;ve been made an organization owner. If the authenticated user changes an owner&#39;s role to &#x60;member&#x60;, no email will be sent.  **Rate limits**  To prevent abuse, the authenticated user is limited to 50 organization invitations per 24 hour period. If the organization is more than one month old or on a paid plan, the limit is 500 invitations per 24 hour period.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    OrgsSetMembershipForUserRequest orgsSetMembershipForUserRequest = new OrgsSetMembershipForUserRequest(); // OrgsSetMembershipForUserRequest | 
    try {
      OrgMembership result = apiInstance.orgsSetMembershipForUser(org, username, orgsSetMembershipForUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsSetMembershipForUser");
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
| **username** | **String**| The handle for the GitHub user account. | |
| **orgsSetMembershipForUserRequest** | [**OrgsSetMembershipForUserRequest**](OrgsSetMembershipForUserRequest.md)|  | [optional] |

### Return type

[**OrgMembership**](OrgMembership.md)

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
| **403** | Forbidden |  -  |

<a name="orgsSetPublicMembershipForAuthenticatedUser"></a>
# **orgsSetPublicMembershipForAuthenticatedUser**
> orgsSetPublicMembershipForAuthenticatedUser(org, username)

Set public organization membership for the authenticated user

The user can publicize their own membership. (A user cannot publicize the membership for another user.)  Note that you&#39;ll need to set &#x60;Content-Length&#x60; to zero when calling out to this endpoint. For more information, see \&quot;[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.orgsSetPublicMembershipForAuthenticatedUser(org, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsSetPublicMembershipForAuthenticatedUser");
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
| **403** | Forbidden |  -  |

<a name="orgsUnblockUser"></a>
# **orgsUnblockUser**
> orgsUnblockUser(org, username)

Unblock a user from an organization



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.orgsUnblockUser(org, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsUnblockUser");
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
| **username** | **String**| The handle for the GitHub user account. | |

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

<a name="orgsUpdate"></a>
# **orgsUpdate**
> OrganizationFull orgsUpdate(org, orgsUpdateRequest)

Update an organization

**Parameter Deprecation Notice:** GitHub will replace and discontinue &#x60;members_allowed_repository_creation_type&#x60; in favor of more granular permissions. The new input parameters are &#x60;members_can_create_public_repositories&#x60;, &#x60;members_can_create_private_repositories&#x60; for all organizations and &#x60;members_can_create_internal_repositories&#x60; for organizations associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see the [blog post](https://developer.github.com/changes/2019-12-03-internal-visibility-changes).  Enables an authenticated organization owner with the &#x60;admin:org&#x60; scope to update the organization&#39;s profile and member privileges.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    OrgsUpdateRequest orgsUpdateRequest = new OrgsUpdateRequest(); // OrgsUpdateRequest | 
    try {
      OrganizationFull result = apiInstance.orgsUpdate(org, orgsUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsUpdate");
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
| **orgsUpdateRequest** | [**OrgsUpdateRequest**](OrgsUpdateRequest.md)|  | [optional] |

### Return type

[**OrganizationFull**](OrganizationFull.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed |  -  |
| **409** | Conflict |  -  |

<a name="orgsUpdateMembershipForAuthenticatedUser"></a>
# **orgsUpdateMembershipForAuthenticatedUser**
> OrgMembership orgsUpdateMembershipForAuthenticatedUser(org, orgsUpdateMembershipForAuthenticatedUserRequest)

Update an organization membership for the authenticated user



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    OrgsUpdateMembershipForAuthenticatedUserRequest orgsUpdateMembershipForAuthenticatedUserRequest = new OrgsUpdateMembershipForAuthenticatedUserRequest(); // OrgsUpdateMembershipForAuthenticatedUserRequest | 
    try {
      OrgMembership result = apiInstance.orgsUpdateMembershipForAuthenticatedUser(org, orgsUpdateMembershipForAuthenticatedUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsUpdateMembershipForAuthenticatedUser");
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
| **orgsUpdateMembershipForAuthenticatedUserRequest** | [**OrgsUpdateMembershipForAuthenticatedUserRequest**](OrgsUpdateMembershipForAuthenticatedUserRequest.md)|  | |

### Return type

[**OrgMembership**](OrgMembership.md)

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

<a name="orgsUpdatePatAccess"></a>
# **orgsUpdatePatAccess**
> orgsUpdatePatAccess(org, patId, orgsUpdatePatAccessRequest)

Update the access a fine-grained personal access token has to organization resources

Updates the access an organization member has to organization resources via a fine-grained personal access token. Limited to revoking the token&#39;s existing access. Limited to revoking a token&#39;s existing access. Only GitHub Apps can call this API, using the &#x60;organization_personal_access_tokens: write&#x60; permission.  **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer patId = 56; // Integer | The unique identifier of the fine-grained personal access token.
    OrgsUpdatePatAccessRequest orgsUpdatePatAccessRequest = new OrgsUpdatePatAccessRequest(); // OrgsUpdatePatAccessRequest | 
    try {
      apiInstance.orgsUpdatePatAccess(org, patId, orgsUpdatePatAccessRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsUpdatePatAccess");
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
| **patId** | **Integer**| The unique identifier of the fine-grained personal access token. | |
| **orgsUpdatePatAccessRequest** | [**OrgsUpdatePatAccessRequest**](OrgsUpdatePatAccessRequest.md)|  | |

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
| **500** | Internal Error |  -  |
| **404** | Resource not found |  -  |
| **204** | A header with no content is returned. |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="orgsUpdatePatAccesses"></a>
# **orgsUpdatePatAccesses**
> Object orgsUpdatePatAccesses(org, orgsUpdatePatAccessesRequest)

Update the access to organization resources via fine-grained personal access tokens

Updates the access organization members have to organization resources via fine-grained personal access tokens. Limited to revoking a token&#39;s existing access. Only GitHub Apps can call this API, using the &#x60;organization_personal_access_tokens: write&#x60; permission.  **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    OrgsUpdatePatAccessesRequest orgsUpdatePatAccessesRequest = new OrgsUpdatePatAccessesRequest(); // OrgsUpdatePatAccessesRequest | 
    try {
      Object result = apiInstance.orgsUpdatePatAccesses(org, orgsUpdatePatAccessesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsUpdatePatAccesses");
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
| **orgsUpdatePatAccessesRequest** | [**OrgsUpdatePatAccessesRequest**](OrgsUpdatePatAccessesRequest.md)|  | |

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
| **500** | Internal Error |  -  |
| **404** | Resource not found |  -  |
| **202** | Accepted |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="orgsUpdateWebhook"></a>
# **orgsUpdateWebhook**
> OrgHook orgsUpdateWebhook(org, hookId, orgsUpdateWebhookRequest)

Update an organization webhook

Updates a webhook configured in an organization. When you update a webhook, the &#x60;secret&#x60; will be overwritten. If you previously had a &#x60;secret&#x60; set, you must provide the same &#x60;secret&#x60; or set a new &#x60;secret&#x60; or the secret will be removed. If you are only updating individual webhook &#x60;config&#x60; properties, use \&quot;[Update a webhook configuration for an organization](/rest/reference/orgs#update-a-webhook-configuration-for-an-organization).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    OrgsUpdateWebhookRequest orgsUpdateWebhookRequest = new OrgsUpdateWebhookRequest(); // OrgsUpdateWebhookRequest | 
    try {
      OrgHook result = apiInstance.orgsUpdateWebhook(org, hookId, orgsUpdateWebhookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsUpdateWebhook");
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
| **hookId** | **Integer**| The unique identifier of the hook. | |
| **orgsUpdateWebhookRequest** | [**OrgsUpdateWebhookRequest**](OrgsUpdateWebhookRequest.md)|  | [optional] |

### Return type

[**OrgHook**](OrgHook.md)

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

<a name="orgsUpdateWebhookConfigForOrg"></a>
# **orgsUpdateWebhookConfigForOrg**
> WebhookConfig orgsUpdateWebhookConfigForOrg(org, hookId, appsUpdateWebhookConfigForAppRequest)

Update a webhook configuration for an organization

Updates the webhook configuration for an organization. To update more information about the webhook, including the &#x60;active&#x60; state and &#x60;events&#x60;, use \&quot;[Update an organization webhook ](/rest/reference/orgs#update-an-organization-webhook).\&quot;  Access tokens must have the &#x60;admin:org_hook&#x60; scope, and GitHub Apps must have the &#x60;organization_hooks:write&#x60; permission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrgsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OrgsApi apiInstance = new OrgsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    AppsUpdateWebhookConfigForAppRequest appsUpdateWebhookConfigForAppRequest = new AppsUpdateWebhookConfigForAppRequest(); // AppsUpdateWebhookConfigForAppRequest | 
    try {
      WebhookConfig result = apiInstance.orgsUpdateWebhookConfigForOrg(org, hookId, appsUpdateWebhookConfigForAppRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#orgsUpdateWebhookConfigForOrg");
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
| **hookId** | **Integer**| The unique identifier of the hook. | |
| **appsUpdateWebhookConfigForAppRequest** | [**AppsUpdateWebhookConfigForAppRequest**](AppsUpdateWebhookConfigForAppRequest.md)|  | [optional] |

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

