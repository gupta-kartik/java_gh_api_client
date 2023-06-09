# TeamsApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**teamsAddMemberLegacy**](TeamsApi.md#teamsAddMemberLegacy) | **PUT** /teams/{team_id}/members/{username} | Add team member (Legacy) |
| [**teamsAddOrUpdateMembershipForUserInOrg**](TeamsApi.md#teamsAddOrUpdateMembershipForUserInOrg) | **PUT** /orgs/{org}/teams/{team_slug}/memberships/{username} | Add or update team membership for a user |
| [**teamsAddOrUpdateMembershipForUserLegacy**](TeamsApi.md#teamsAddOrUpdateMembershipForUserLegacy) | **PUT** /teams/{team_id}/memberships/{username} | Add or update team membership for a user (Legacy) |
| [**teamsAddOrUpdateProjectPermissionsInOrg**](TeamsApi.md#teamsAddOrUpdateProjectPermissionsInOrg) | **PUT** /orgs/{org}/teams/{team_slug}/projects/{project_id} | Add or update team project permissions |
| [**teamsAddOrUpdateProjectPermissionsLegacy**](TeamsApi.md#teamsAddOrUpdateProjectPermissionsLegacy) | **PUT** /teams/{team_id}/projects/{project_id} | Add or update team project permissions (Legacy) |
| [**teamsAddOrUpdateRepoPermissionsInOrg**](TeamsApi.md#teamsAddOrUpdateRepoPermissionsInOrg) | **PUT** /orgs/{org}/teams/{team_slug}/repos/{owner}/{repo} | Add or update team repository permissions |
| [**teamsAddOrUpdateRepoPermissionsLegacy**](TeamsApi.md#teamsAddOrUpdateRepoPermissionsLegacy) | **PUT** /teams/{team_id}/repos/{owner}/{repo} | Add or update team repository permissions (Legacy) |
| [**teamsCheckPermissionsForProjectInOrg**](TeamsApi.md#teamsCheckPermissionsForProjectInOrg) | **GET** /orgs/{org}/teams/{team_slug}/projects/{project_id} | Check team permissions for a project |
| [**teamsCheckPermissionsForProjectLegacy**](TeamsApi.md#teamsCheckPermissionsForProjectLegacy) | **GET** /teams/{team_id}/projects/{project_id} | Check team permissions for a project (Legacy) |
| [**teamsCheckPermissionsForRepoInOrg**](TeamsApi.md#teamsCheckPermissionsForRepoInOrg) | **GET** /orgs/{org}/teams/{team_slug}/repos/{owner}/{repo} | Check team permissions for a repository |
| [**teamsCheckPermissionsForRepoLegacy**](TeamsApi.md#teamsCheckPermissionsForRepoLegacy) | **GET** /teams/{team_id}/repos/{owner}/{repo} | Check team permissions for a repository (Legacy) |
| [**teamsCreate**](TeamsApi.md#teamsCreate) | **POST** /orgs/{org}/teams | Create a team |
| [**teamsCreateDiscussionCommentInOrg**](TeamsApi.md#teamsCreateDiscussionCommentInOrg) | **POST** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments | Create a discussion comment |
| [**teamsCreateDiscussionCommentLegacy**](TeamsApi.md#teamsCreateDiscussionCommentLegacy) | **POST** /teams/{team_id}/discussions/{discussion_number}/comments | Create a discussion comment (Legacy) |
| [**teamsCreateDiscussionInOrg**](TeamsApi.md#teamsCreateDiscussionInOrg) | **POST** /orgs/{org}/teams/{team_slug}/discussions | Create a discussion |
| [**teamsCreateDiscussionLegacy**](TeamsApi.md#teamsCreateDiscussionLegacy) | **POST** /teams/{team_id}/discussions | Create a discussion (Legacy) |
| [**teamsDeleteDiscussionCommentInOrg**](TeamsApi.md#teamsDeleteDiscussionCommentInOrg) | **DELETE** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number} | Delete a discussion comment |
| [**teamsDeleteDiscussionCommentLegacy**](TeamsApi.md#teamsDeleteDiscussionCommentLegacy) | **DELETE** /teams/{team_id}/discussions/{discussion_number}/comments/{comment_number} | Delete a discussion comment (Legacy) |
| [**teamsDeleteDiscussionInOrg**](TeamsApi.md#teamsDeleteDiscussionInOrg) | **DELETE** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number} | Delete a discussion |
| [**teamsDeleteDiscussionLegacy**](TeamsApi.md#teamsDeleteDiscussionLegacy) | **DELETE** /teams/{team_id}/discussions/{discussion_number} | Delete a discussion (Legacy) |
| [**teamsDeleteInOrg**](TeamsApi.md#teamsDeleteInOrg) | **DELETE** /orgs/{org}/teams/{team_slug} | Delete a team |
| [**teamsDeleteLegacy**](TeamsApi.md#teamsDeleteLegacy) | **DELETE** /teams/{team_id} | Delete a team (Legacy) |
| [**teamsGetByName**](TeamsApi.md#teamsGetByName) | **GET** /orgs/{org}/teams/{team_slug} | Get a team by name |
| [**teamsGetDiscussionCommentInOrg**](TeamsApi.md#teamsGetDiscussionCommentInOrg) | **GET** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number} | Get a discussion comment |
| [**teamsGetDiscussionCommentLegacy**](TeamsApi.md#teamsGetDiscussionCommentLegacy) | **GET** /teams/{team_id}/discussions/{discussion_number}/comments/{comment_number} | Get a discussion comment (Legacy) |
| [**teamsGetDiscussionInOrg**](TeamsApi.md#teamsGetDiscussionInOrg) | **GET** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number} | Get a discussion |
| [**teamsGetDiscussionLegacy**](TeamsApi.md#teamsGetDiscussionLegacy) | **GET** /teams/{team_id}/discussions/{discussion_number} | Get a discussion (Legacy) |
| [**teamsGetLegacy**](TeamsApi.md#teamsGetLegacy) | **GET** /teams/{team_id} | Get a team (Legacy) |
| [**teamsGetMemberLegacy**](TeamsApi.md#teamsGetMemberLegacy) | **GET** /teams/{team_id}/members/{username} | Get team member (Legacy) |
| [**teamsGetMembershipForUserInOrg**](TeamsApi.md#teamsGetMembershipForUserInOrg) | **GET** /orgs/{org}/teams/{team_slug}/memberships/{username} | Get team membership for a user |
| [**teamsGetMembershipForUserLegacy**](TeamsApi.md#teamsGetMembershipForUserLegacy) | **GET** /teams/{team_id}/memberships/{username} | Get team membership for a user (Legacy) |
| [**teamsList**](TeamsApi.md#teamsList) | **GET** /orgs/{org}/teams | List teams |
| [**teamsListChildInOrg**](TeamsApi.md#teamsListChildInOrg) | **GET** /orgs/{org}/teams/{team_slug}/teams | List child teams |
| [**teamsListChildLegacy**](TeamsApi.md#teamsListChildLegacy) | **GET** /teams/{team_id}/teams | List child teams (Legacy) |
| [**teamsListDiscussionCommentsInOrg**](TeamsApi.md#teamsListDiscussionCommentsInOrg) | **GET** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments | List discussion comments |
| [**teamsListDiscussionCommentsLegacy**](TeamsApi.md#teamsListDiscussionCommentsLegacy) | **GET** /teams/{team_id}/discussions/{discussion_number}/comments | List discussion comments (Legacy) |
| [**teamsListDiscussionsInOrg**](TeamsApi.md#teamsListDiscussionsInOrg) | **GET** /orgs/{org}/teams/{team_slug}/discussions | List discussions |
| [**teamsListDiscussionsLegacy**](TeamsApi.md#teamsListDiscussionsLegacy) | **GET** /teams/{team_id}/discussions | List discussions (Legacy) |
| [**teamsListForAuthenticatedUser**](TeamsApi.md#teamsListForAuthenticatedUser) | **GET** /user/teams | List teams for the authenticated user |
| [**teamsListMembersInOrg**](TeamsApi.md#teamsListMembersInOrg) | **GET** /orgs/{org}/teams/{team_slug}/members | List team members |
| [**teamsListMembersLegacy**](TeamsApi.md#teamsListMembersLegacy) | **GET** /teams/{team_id}/members | List team members (Legacy) |
| [**teamsListPendingInvitationsInOrg**](TeamsApi.md#teamsListPendingInvitationsInOrg) | **GET** /orgs/{org}/teams/{team_slug}/invitations | List pending team invitations |
| [**teamsListPendingInvitationsLegacy**](TeamsApi.md#teamsListPendingInvitationsLegacy) | **GET** /teams/{team_id}/invitations | List pending team invitations (Legacy) |
| [**teamsListProjectsInOrg**](TeamsApi.md#teamsListProjectsInOrg) | **GET** /orgs/{org}/teams/{team_slug}/projects | List team projects |
| [**teamsListProjectsLegacy**](TeamsApi.md#teamsListProjectsLegacy) | **GET** /teams/{team_id}/projects | List team projects (Legacy) |
| [**teamsListReposInOrg**](TeamsApi.md#teamsListReposInOrg) | **GET** /orgs/{org}/teams/{team_slug}/repos | List team repositories |
| [**teamsListReposLegacy**](TeamsApi.md#teamsListReposLegacy) | **GET** /teams/{team_id}/repos | List team repositories (Legacy) |
| [**teamsRemoveMemberLegacy**](TeamsApi.md#teamsRemoveMemberLegacy) | **DELETE** /teams/{team_id}/members/{username} | Remove team member (Legacy) |
| [**teamsRemoveMembershipForUserInOrg**](TeamsApi.md#teamsRemoveMembershipForUserInOrg) | **DELETE** /orgs/{org}/teams/{team_slug}/memberships/{username} | Remove team membership for a user |
| [**teamsRemoveMembershipForUserLegacy**](TeamsApi.md#teamsRemoveMembershipForUserLegacy) | **DELETE** /teams/{team_id}/memberships/{username} | Remove team membership for a user (Legacy) |
| [**teamsRemoveProjectInOrg**](TeamsApi.md#teamsRemoveProjectInOrg) | **DELETE** /orgs/{org}/teams/{team_slug}/projects/{project_id} | Remove a project from a team |
| [**teamsRemoveProjectLegacy**](TeamsApi.md#teamsRemoveProjectLegacy) | **DELETE** /teams/{team_id}/projects/{project_id} | Remove a project from a team (Legacy) |
| [**teamsRemoveRepoInOrg**](TeamsApi.md#teamsRemoveRepoInOrg) | **DELETE** /orgs/{org}/teams/{team_slug}/repos/{owner}/{repo} | Remove a repository from a team |
| [**teamsRemoveRepoLegacy**](TeamsApi.md#teamsRemoveRepoLegacy) | **DELETE** /teams/{team_id}/repos/{owner}/{repo} | Remove a repository from a team (Legacy) |
| [**teamsUpdateDiscussionCommentInOrg**](TeamsApi.md#teamsUpdateDiscussionCommentInOrg) | **PATCH** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number} | Update a discussion comment |
| [**teamsUpdateDiscussionCommentLegacy**](TeamsApi.md#teamsUpdateDiscussionCommentLegacy) | **PATCH** /teams/{team_id}/discussions/{discussion_number}/comments/{comment_number} | Update a discussion comment (Legacy) |
| [**teamsUpdateDiscussionInOrg**](TeamsApi.md#teamsUpdateDiscussionInOrg) | **PATCH** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number} | Update a discussion |
| [**teamsUpdateDiscussionLegacy**](TeamsApi.md#teamsUpdateDiscussionLegacy) | **PATCH** /teams/{team_id}/discussions/{discussion_number} | Update a discussion (Legacy) |
| [**teamsUpdateInOrg**](TeamsApi.md#teamsUpdateInOrg) | **PATCH** /orgs/{org}/teams/{team_slug} | Update a team |
| [**teamsUpdateLegacy**](TeamsApi.md#teamsUpdateLegacy) | **PATCH** /teams/{team_id} | Update a team (Legacy) |


<a name="teamsAddMemberLegacy"></a>
# **teamsAddMemberLegacy**
> teamsAddMemberLegacy(teamId, username)

Add team member (Legacy)

The \&quot;Add team member\&quot; endpoint (described below) is deprecated.  We recommend using the [Add or update team membership for a user](https://docs.github.com/rest/reference/teams#add-or-update-team-membership-for-a-user) endpoint instead. It allows you to invite new organization members to your teams.  Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  To add someone to a team, the authenticated user must be an organization owner or a team maintainer in the team they&#39;re changing. The person being added to the team must be a member of the team&#39;s organization.  **Note:** When you have team synchronization set up for a team with your organization&#39;s identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team&#39;s membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see \&quot;[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/).\&quot;  Note that you&#39;ll need to set &#x60;Content-Length&#x60; to zero when calling out to this endpoint. For more information, see \&quot;[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.teamsAddMemberLegacy(teamId, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsAddMemberLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
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
| **404** | Not Found if team synchronization is set up |  -  |
| **422** | Unprocessable Entity if you attempt to add an organization to a team or you attempt to add a user to a team when they are not a member of at least one other team in the same organization |  -  |
| **403** | Forbidden |  -  |

<a name="teamsAddOrUpdateMembershipForUserInOrg"></a>
# **teamsAddOrUpdateMembershipForUserInOrg**
> TeamMembership teamsAddOrUpdateMembershipForUserInOrg(org, teamSlug, username, teamsAddOrUpdateMembershipForUserInOrgRequest)

Add or update team membership for a user

Adds an organization member to a team. An authenticated organization owner or team maintainer can add organization members to a team.  Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  **Note:** When you have team synchronization set up for a team with your organization&#39;s identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team&#39;s membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see \&quot;[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/).\&quot;  An organization owner can add someone who is not part of the team&#39;s organization to a team. When an organization owner adds someone to a team who is not an organization member, this endpoint will send an invitation to the person via email. This newly-created membership will be in the \&quot;pending\&quot; state until the person accepts the invitation, at which point the membership will transition to the \&quot;active\&quot; state and the user will be added as a member of the team.  If the user is already a member of the team, this endpoint will update the role of the team member&#39;s role. To update the membership of a team member, the authenticated user must be an organization owner or a team maintainer.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;PUT /organizations/{org_id}/team/{team_id}/memberships/{username}&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    String username = "username_example"; // String | The handle for the GitHub user account.
    TeamsAddOrUpdateMembershipForUserInOrgRequest teamsAddOrUpdateMembershipForUserInOrgRequest = new TeamsAddOrUpdateMembershipForUserInOrgRequest(); // TeamsAddOrUpdateMembershipForUserInOrgRequest | 
    try {
      TeamMembership result = apiInstance.teamsAddOrUpdateMembershipForUserInOrg(org, teamSlug, username, teamsAddOrUpdateMembershipForUserInOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsAddOrUpdateMembershipForUserInOrg");
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
| **username** | **String**| The handle for the GitHub user account. | |
| **teamsAddOrUpdateMembershipForUserInOrgRequest** | [**TeamsAddOrUpdateMembershipForUserInOrgRequest**](TeamsAddOrUpdateMembershipForUserInOrgRequest.md)|  | [optional] |

### Return type

[**TeamMembership**](TeamMembership.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Forbidden if team synchronization is set up |  -  |
| **422** | Unprocessable Entity if you attempt to add an organization to a team |  -  |

<a name="teamsAddOrUpdateMembershipForUserLegacy"></a>
# **teamsAddOrUpdateMembershipForUserLegacy**
> TeamMembership teamsAddOrUpdateMembershipForUserLegacy(teamId, username, teamsAddOrUpdateMembershipForUserInOrgRequest)

Add or update team membership for a user (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Add or update team membership for a user](https://docs.github.com/rest/reference/teams#add-or-update-team-membership-for-a-user) endpoint.  Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  If the user is already a member of the team&#39;s organization, this endpoint will add the user to the team. To add a membership between an organization member and a team, the authenticated user must be an organization owner or a team maintainer.  **Note:** When you have team synchronization set up for a team with your organization&#39;s identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team&#39;s membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see \&quot;[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/).\&quot;  If the user is unaffiliated with the team&#39;s organization, this endpoint will send an invitation to the user via email. This newly-created membership will be in the \&quot;pending\&quot; state until the user accepts the invitation, at which point the membership will transition to the \&quot;active\&quot; state and the user will be added as a member of the team. To add a membership between an unaffiliated user and a team, the authenticated user must be an organization owner.  If the user is already a member of the team, this endpoint will update the role of the team member&#39;s role. To update the membership of a team member, the authenticated user must be an organization owner or a team maintainer.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    String username = "username_example"; // String | The handle for the GitHub user account.
    TeamsAddOrUpdateMembershipForUserInOrgRequest teamsAddOrUpdateMembershipForUserInOrgRequest = new TeamsAddOrUpdateMembershipForUserInOrgRequest(); // TeamsAddOrUpdateMembershipForUserInOrgRequest | 
    try {
      TeamMembership result = apiInstance.teamsAddOrUpdateMembershipForUserLegacy(teamId, username, teamsAddOrUpdateMembershipForUserInOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsAddOrUpdateMembershipForUserLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **username** | **String**| The handle for the GitHub user account. | |
| **teamsAddOrUpdateMembershipForUserInOrgRequest** | [**TeamsAddOrUpdateMembershipForUserInOrgRequest**](TeamsAddOrUpdateMembershipForUserInOrgRequest.md)|  | [optional] |

### Return type

[**TeamMembership**](TeamMembership.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Forbidden if team synchronization is set up |  -  |
| **422** | Unprocessable Entity if you attempt to add an organization to a team |  -  |
| **404** | Resource not found |  -  |

<a name="teamsAddOrUpdateProjectPermissionsInOrg"></a>
# **teamsAddOrUpdateProjectPermissionsInOrg**
> teamsAddOrUpdateProjectPermissionsInOrg(org, teamSlug, projectId, teamsAddOrUpdateProjectPermissionsInOrgRequest)

Add or update team project permissions

Adds an organization project to a team. To add a project to a team or update the team&#39;s permission on a project, the authenticated user must have &#x60;admin&#x60; permissions for the project. The project and team must be part of the same organization.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;PUT /organizations/{org_id}/team/{team_id}/projects/{project_id}&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    Integer projectId = 56; // Integer | The unique identifier of the project.
    TeamsAddOrUpdateProjectPermissionsInOrgRequest teamsAddOrUpdateProjectPermissionsInOrgRequest = new TeamsAddOrUpdateProjectPermissionsInOrgRequest(); // TeamsAddOrUpdateProjectPermissionsInOrgRequest | 
    try {
      apiInstance.teamsAddOrUpdateProjectPermissionsInOrg(org, teamSlug, projectId, teamsAddOrUpdateProjectPermissionsInOrgRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsAddOrUpdateProjectPermissionsInOrg");
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
| **projectId** | **Integer**| The unique identifier of the project. | |
| **teamsAddOrUpdateProjectPermissionsInOrgRequest** | [**TeamsAddOrUpdateProjectPermissionsInOrgRequest**](TeamsAddOrUpdateProjectPermissionsInOrgRequest.md)|  | [optional] |

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
| **403** | Forbidden if the project is not owned by the organization |  -  |

<a name="teamsAddOrUpdateProjectPermissionsLegacy"></a>
# **teamsAddOrUpdateProjectPermissionsLegacy**
> teamsAddOrUpdateProjectPermissionsLegacy(teamId, projectId, teamsAddOrUpdateProjectPermissionsLegacyRequest)

Add or update team project permissions (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Add or update team project permissions](https://docs.github.com/rest/reference/teams#add-or-update-team-project-permissions) endpoint.  Adds an organization project to a team. To add a project to a team or update the team&#39;s permission on a project, the authenticated user must have &#x60;admin&#x60; permissions for the project. The project and team must be part of the same organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    Integer projectId = 56; // Integer | The unique identifier of the project.
    TeamsAddOrUpdateProjectPermissionsLegacyRequest teamsAddOrUpdateProjectPermissionsLegacyRequest = new TeamsAddOrUpdateProjectPermissionsLegacyRequest(); // TeamsAddOrUpdateProjectPermissionsLegacyRequest | 
    try {
      apiInstance.teamsAddOrUpdateProjectPermissionsLegacy(teamId, projectId, teamsAddOrUpdateProjectPermissionsLegacyRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsAddOrUpdateProjectPermissionsLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **projectId** | **Integer**| The unique identifier of the project. | |
| **teamsAddOrUpdateProjectPermissionsLegacyRequest** | [**TeamsAddOrUpdateProjectPermissionsLegacyRequest**](TeamsAddOrUpdateProjectPermissionsLegacyRequest.md)|  | [optional] |

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
| **403** | Forbidden if the project is not owned by the organization |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="teamsAddOrUpdateRepoPermissionsInOrg"></a>
# **teamsAddOrUpdateRepoPermissionsInOrg**
> teamsAddOrUpdateRepoPermissionsInOrg(org, teamSlug, owner, repo, teamsAddOrUpdateRepoPermissionsInOrgRequest)

Add or update team repository permissions

To add a repository to a team or update the team&#39;s permission on a repository, the authenticated user must have admin access to the repository, and must be able to see the team. The repository must be owned by the organization, or a direct fork of a repository owned by the organization. You will get a &#x60;422 Unprocessable Entity&#x60; status if you attempt to add a repository to a team that is not owned by the organization. Note that, if you choose not to pass any parameters, you&#39;ll need to set &#x60;Content-Length&#x60; to zero when calling out to this endpoint. For more information, see \&quot;[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs).\&quot;  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;PUT /organizations/{org_id}/team/{team_id}/repos/{owner}/{repo}&#x60;.  For more information about the permission levels, see \&quot;[Repository permission levels for an organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/repository-permission-levels-for-an-organization#permission-levels-for-repositories-owned-by-an-organization)\&quot;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    TeamsAddOrUpdateRepoPermissionsInOrgRequest teamsAddOrUpdateRepoPermissionsInOrgRequest = new TeamsAddOrUpdateRepoPermissionsInOrgRequest(); // TeamsAddOrUpdateRepoPermissionsInOrgRequest | 
    try {
      apiInstance.teamsAddOrUpdateRepoPermissionsInOrg(org, teamSlug, owner, repo, teamsAddOrUpdateRepoPermissionsInOrgRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsAddOrUpdateRepoPermissionsInOrg");
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
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **teamsAddOrUpdateRepoPermissionsInOrgRequest** | [**TeamsAddOrUpdateRepoPermissionsInOrgRequest**](TeamsAddOrUpdateRepoPermissionsInOrgRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="teamsAddOrUpdateRepoPermissionsLegacy"></a>
# **teamsAddOrUpdateRepoPermissionsLegacy**
> teamsAddOrUpdateRepoPermissionsLegacy(teamId, owner, repo, teamsAddOrUpdateRepoPermissionsLegacyRequest)

Add or update team repository permissions (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new \&quot;[Add or update team repository permissions](https://docs.github.com/rest/reference/teams#add-or-update-team-repository-permissions)\&quot; endpoint.  To add a repository to a team or update the team&#39;s permission on a repository, the authenticated user must have admin access to the repository, and must be able to see the team. The repository must be owned by the organization, or a direct fork of a repository owned by the organization. You will get a &#x60;422 Unprocessable Entity&#x60; status if you attempt to add a repository to a team that is not owned by the organization.  Note that, if you choose not to pass any parameters, you&#39;ll need to set &#x60;Content-Length&#x60; to zero when calling out to this endpoint. For more information, see \&quot;[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    TeamsAddOrUpdateRepoPermissionsLegacyRequest teamsAddOrUpdateRepoPermissionsLegacyRequest = new TeamsAddOrUpdateRepoPermissionsLegacyRequest(); // TeamsAddOrUpdateRepoPermissionsLegacyRequest | 
    try {
      apiInstance.teamsAddOrUpdateRepoPermissionsLegacy(teamId, owner, repo, teamsAddOrUpdateRepoPermissionsLegacyRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsAddOrUpdateRepoPermissionsLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **teamsAddOrUpdateRepoPermissionsLegacyRequest** | [**TeamsAddOrUpdateRepoPermissionsLegacyRequest**](TeamsAddOrUpdateRepoPermissionsLegacyRequest.md)|  | [optional] |

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
| **403** | Forbidden |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="teamsCheckPermissionsForProjectInOrg"></a>
# **teamsCheckPermissionsForProjectInOrg**
> TeamProject teamsCheckPermissionsForProjectInOrg(org, teamSlug, projectId)

Check team permissions for a project

Checks whether a team has &#x60;read&#x60;, &#x60;write&#x60;, or &#x60;admin&#x60; permissions for an organization project. The response includes projects inherited from a parent team.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/projects/{project_id}&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    Integer projectId = 56; // Integer | The unique identifier of the project.
    try {
      TeamProject result = apiInstance.teamsCheckPermissionsForProjectInOrg(org, teamSlug, projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsCheckPermissionsForProjectInOrg");
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
| **projectId** | **Integer**| The unique identifier of the project. | |

### Return type

[**TeamProject**](TeamProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Not Found if project is not managed by this team |  -  |

<a name="teamsCheckPermissionsForProjectLegacy"></a>
# **teamsCheckPermissionsForProjectLegacy**
> TeamProject teamsCheckPermissionsForProjectLegacy(teamId, projectId)

Check team permissions for a project (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Check team permissions for a project](https://docs.github.com/rest/reference/teams#check-team-permissions-for-a-project) endpoint.  Checks whether a team has &#x60;read&#x60;, &#x60;write&#x60;, or &#x60;admin&#x60; permissions for an organization project. The response includes projects inherited from a parent team.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    Integer projectId = 56; // Integer | The unique identifier of the project.
    try {
      TeamProject result = apiInstance.teamsCheckPermissionsForProjectLegacy(teamId, projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsCheckPermissionsForProjectLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **projectId** | **Integer**| The unique identifier of the project. | |

### Return type

[**TeamProject**](TeamProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Not Found if project is not managed by this team |  -  |

<a name="teamsCheckPermissionsForRepoInOrg"></a>
# **teamsCheckPermissionsForRepoInOrg**
> TeamRepository teamsCheckPermissionsForRepoInOrg(org, teamSlug, owner, repo)

Check team permissions for a repository

Checks whether a team has &#x60;admin&#x60;, &#x60;push&#x60;, &#x60;maintain&#x60;, &#x60;triage&#x60;, or &#x60;pull&#x60; permission for a repository. Repositories inherited through a parent team will also be checked.  You can also get information about the specified repository, including what permissions the team grants on it, by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the &#x60;application/vnd.github.v3.repository+json&#x60; accept header.  If a team doesn&#39;t have permission for the repository, you will receive a &#x60;404 Not Found&#x60; response status.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/repos/{owner}/{repo}&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      TeamRepository result = apiInstance.teamsCheckPermissionsForRepoInOrg(org, teamSlug, owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsCheckPermissionsForRepoInOrg");
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
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**TeamRepository**](TeamRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Alternative response with repository permissions |  -  |
| **204** | Response if team has permission for the repository. This is the response when the repository media type hasn&#39;t been provded in the Accept header. |  -  |
| **404** | Not Found if team does not have permission for the repository |  -  |

<a name="teamsCheckPermissionsForRepoLegacy"></a>
# **teamsCheckPermissionsForRepoLegacy**
> TeamRepository teamsCheckPermissionsForRepoLegacy(teamId, owner, repo)

Check team permissions for a repository (Legacy)

**Note**: Repositories inherited through a parent team will also be checked.  **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Check team permissions for a repository](https://docs.github.com/rest/reference/teams#check-team-permissions-for-a-repository) endpoint.  You can also get information about the specified repository, including what permissions the team grants on it, by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the &#x60;Accept&#x60; header:

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      TeamRepository result = apiInstance.teamsCheckPermissionsForRepoLegacy(teamId, owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsCheckPermissionsForRepoLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**TeamRepository**](TeamRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Alternative response with extra repository information |  -  |
| **204** | Response if repository is managed by this team |  -  |
| **404** | Not Found if repository is not managed by this team |  -  |

<a name="teamsCreate"></a>
# **teamsCreate**
> TeamFull teamsCreate(org, teamsCreateRequest)

Create a team

To create a team, the authenticated user must be a member or owner of &#x60;{org}&#x60;. By default, organization members can create teams. Organization owners can limit team creation to organization owners. For more information, see \&quot;[Setting team creation permissions](https://docs.github.com/articles/setting-team-creation-permissions-in-your-organization).\&quot;  When you create a new team, you automatically become a team maintainer without explicitly adding yourself to the optional array of &#x60;maintainers&#x60;. For more information, see \&quot;[About teams](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/about-teams)\&quot;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    TeamsCreateRequest teamsCreateRequest = new TeamsCreateRequest(); // TeamsCreateRequest | 
    try {
      TeamFull result = apiInstance.teamsCreate(org, teamsCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsCreate");
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
| **teamsCreateRequest** | [**TeamsCreateRequest**](TeamsCreateRequest.md)|  | |

### Return type

[**TeamFull**](TeamFull.md)

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
| **403** | Forbidden |  -  |

<a name="teamsCreateDiscussionCommentInOrg"></a>
# **teamsCreateDiscussionCommentInOrg**
> TeamDiscussionComment teamsCreateDiscussionCommentInOrg(org, teamSlug, discussionNumber, teamsCreateDiscussionCommentInOrgRequest)

Create a discussion comment

Creates a new comment on a team discussion. OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \&quot;[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\&quot; and \&quot;[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\&quot; for details.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;POST /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    Integer discussionNumber = 56; // Integer | The number that identifies the discussion.
    TeamsCreateDiscussionCommentInOrgRequest teamsCreateDiscussionCommentInOrgRequest = new TeamsCreateDiscussionCommentInOrgRequest(); // TeamsCreateDiscussionCommentInOrgRequest | 
    try {
      TeamDiscussionComment result = apiInstance.teamsCreateDiscussionCommentInOrg(org, teamSlug, discussionNumber, teamsCreateDiscussionCommentInOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsCreateDiscussionCommentInOrg");
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
| **discussionNumber** | **Integer**| The number that identifies the discussion. | |
| **teamsCreateDiscussionCommentInOrgRequest** | [**TeamsCreateDiscussionCommentInOrgRequest**](TeamsCreateDiscussionCommentInOrgRequest.md)|  | |

### Return type

[**TeamDiscussionComment**](TeamDiscussionComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |

<a name="teamsCreateDiscussionCommentLegacy"></a>
# **teamsCreateDiscussionCommentLegacy**
> TeamDiscussionComment teamsCreateDiscussionCommentLegacy(teamId, discussionNumber, teamsCreateDiscussionCommentInOrgRequest)

Create a discussion comment (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Create a discussion comment](https://docs.github.com/rest/reference/teams#create-a-discussion-comment) endpoint.  Creates a new comment on a team discussion. OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \&quot;[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\&quot; and \&quot;[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\&quot; for details.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    Integer discussionNumber = 56; // Integer | The number that identifies the discussion.
    TeamsCreateDiscussionCommentInOrgRequest teamsCreateDiscussionCommentInOrgRequest = new TeamsCreateDiscussionCommentInOrgRequest(); // TeamsCreateDiscussionCommentInOrgRequest | 
    try {
      TeamDiscussionComment result = apiInstance.teamsCreateDiscussionCommentLegacy(teamId, discussionNumber, teamsCreateDiscussionCommentInOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsCreateDiscussionCommentLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **discussionNumber** | **Integer**| The number that identifies the discussion. | |
| **teamsCreateDiscussionCommentInOrgRequest** | [**TeamsCreateDiscussionCommentInOrgRequest**](TeamsCreateDiscussionCommentInOrgRequest.md)|  | |

### Return type

[**TeamDiscussionComment**](TeamDiscussionComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |

<a name="teamsCreateDiscussionInOrg"></a>
# **teamsCreateDiscussionInOrg**
> TeamDiscussion teamsCreateDiscussionInOrg(org, teamSlug, teamsCreateDiscussionInOrgRequest)

Create a discussion

Creates a new discussion post on a team&#39;s page. OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \&quot;[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\&quot; and \&quot;[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\&quot; for details.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;POST /organizations/{org_id}/team/{team_id}/discussions&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    TeamsCreateDiscussionInOrgRequest teamsCreateDiscussionInOrgRequest = new TeamsCreateDiscussionInOrgRequest(); // TeamsCreateDiscussionInOrgRequest | 
    try {
      TeamDiscussion result = apiInstance.teamsCreateDiscussionInOrg(org, teamSlug, teamsCreateDiscussionInOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsCreateDiscussionInOrg");
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
| **teamsCreateDiscussionInOrgRequest** | [**TeamsCreateDiscussionInOrgRequest**](TeamsCreateDiscussionInOrgRequest.md)|  | |

### Return type

[**TeamDiscussion**](TeamDiscussion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |

<a name="teamsCreateDiscussionLegacy"></a>
# **teamsCreateDiscussionLegacy**
> TeamDiscussion teamsCreateDiscussionLegacy(teamId, teamsCreateDiscussionInOrgRequest)

Create a discussion (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;Create a discussion&#x60;](https://docs.github.com/rest/reference/teams#create-a-discussion) endpoint.  Creates a new discussion post on a team&#39;s page. OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \&quot;[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\&quot; and \&quot;[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\&quot; for details.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    TeamsCreateDiscussionInOrgRequest teamsCreateDiscussionInOrgRequest = new TeamsCreateDiscussionInOrgRequest(); // TeamsCreateDiscussionInOrgRequest | 
    try {
      TeamDiscussion result = apiInstance.teamsCreateDiscussionLegacy(teamId, teamsCreateDiscussionInOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsCreateDiscussionLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **teamsCreateDiscussionInOrgRequest** | [**TeamsCreateDiscussionInOrgRequest**](TeamsCreateDiscussionInOrgRequest.md)|  | |

### Return type

[**TeamDiscussion**](TeamDiscussion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |

<a name="teamsDeleteDiscussionCommentInOrg"></a>
# **teamsDeleteDiscussionCommentInOrg**
> teamsDeleteDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber)

Delete a discussion comment

Deletes a comment on a team discussion. OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;DELETE /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments/{comment_number}&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    Integer discussionNumber = 56; // Integer | The number that identifies the discussion.
    Integer commentNumber = 56; // Integer | The number that identifies the comment.
    try {
      apiInstance.teamsDeleteDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsDeleteDiscussionCommentInOrg");
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
| **discussionNumber** | **Integer**| The number that identifies the discussion. | |
| **commentNumber** | **Integer**| The number that identifies the comment. | |

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

<a name="teamsDeleteDiscussionCommentLegacy"></a>
# **teamsDeleteDiscussionCommentLegacy**
> teamsDeleteDiscussionCommentLegacy(teamId, discussionNumber, commentNumber)

Delete a discussion comment (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Delete a discussion comment](https://docs.github.com/rest/reference/teams#delete-a-discussion-comment) endpoint.  Deletes a comment on a team discussion. OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    Integer discussionNumber = 56; // Integer | The number that identifies the discussion.
    Integer commentNumber = 56; // Integer | The number that identifies the comment.
    try {
      apiInstance.teamsDeleteDiscussionCommentLegacy(teamId, discussionNumber, commentNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsDeleteDiscussionCommentLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **discussionNumber** | **Integer**| The number that identifies the discussion. | |
| **commentNumber** | **Integer**| The number that identifies the comment. | |

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

<a name="teamsDeleteDiscussionInOrg"></a>
# **teamsDeleteDiscussionInOrg**
> teamsDeleteDiscussionInOrg(org, teamSlug, discussionNumber)

Delete a discussion

Delete a discussion from a team&#39;s page. OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;DELETE /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    Integer discussionNumber = 56; // Integer | The number that identifies the discussion.
    try {
      apiInstance.teamsDeleteDiscussionInOrg(org, teamSlug, discussionNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsDeleteDiscussionInOrg");
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
| **discussionNumber** | **Integer**| The number that identifies the discussion. | |

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

<a name="teamsDeleteDiscussionLegacy"></a>
# **teamsDeleteDiscussionLegacy**
> teamsDeleteDiscussionLegacy(teamId, discussionNumber)

Delete a discussion (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;Delete a discussion&#x60;](https://docs.github.com/rest/reference/teams#delete-a-discussion) endpoint.  Delete a discussion from a team&#39;s page. OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    Integer discussionNumber = 56; // Integer | The number that identifies the discussion.
    try {
      apiInstance.teamsDeleteDiscussionLegacy(teamId, discussionNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsDeleteDiscussionLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **discussionNumber** | **Integer**| The number that identifies the discussion. | |

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

<a name="teamsDeleteInOrg"></a>
# **teamsDeleteInOrg**
> teamsDeleteInOrg(org, teamSlug)

Delete a team

To delete a team, the authenticated user must be an organization owner or team maintainer.  If you are an organization owner, deleting a parent team will delete all of its child teams as well.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;DELETE /organizations/{org_id}/team/{team_id}&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    try {
      apiInstance.teamsDeleteInOrg(org, teamSlug);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsDeleteInOrg");
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

<a name="teamsDeleteLegacy"></a>
# **teamsDeleteLegacy**
> teamsDeleteLegacy(teamId)

Delete a team (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Delete a team](https://docs.github.com/rest/reference/teams#delete-a-team) endpoint.  To delete a team, the authenticated user must be an organization owner or team maintainer.  If you are an organization owner, deleting a parent team will delete all of its child teams as well.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    try {
      apiInstance.teamsDeleteLegacy(teamId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsDeleteLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |

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

<a name="teamsGetByName"></a>
# **teamsGetByName**
> TeamFull teamsGetByName(org, teamSlug)

Get a team by name

Gets a team using the team&#39;s &#x60;slug&#x60;. To create the &#x60;slug&#x60;, GitHub replaces special characters in the &#x60;name&#x60; string, changes all words to lowercase, and replaces spaces with a &#x60;-&#x60; separator. For example, &#x60;\&quot;My TEam Näme\&quot;&#x60; would become &#x60;my-team-name&#x60;.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    try {
      TeamFull result = apiInstance.teamsGetByName(org, teamSlug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsGetByName");
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

[**TeamFull**](TeamFull.md)

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

<a name="teamsGetDiscussionCommentInOrg"></a>
# **teamsGetDiscussionCommentInOrg**
> TeamDiscussionComment teamsGetDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber)

Get a discussion comment

Get a specific comment on a team discussion. OAuth access tokens require the &#x60;read:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments/{comment_number}&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    Integer discussionNumber = 56; // Integer | The number that identifies the discussion.
    Integer commentNumber = 56; // Integer | The number that identifies the comment.
    try {
      TeamDiscussionComment result = apiInstance.teamsGetDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsGetDiscussionCommentInOrg");
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
| **discussionNumber** | **Integer**| The number that identifies the discussion. | |
| **commentNumber** | **Integer**| The number that identifies the comment. | |

### Return type

[**TeamDiscussionComment**](TeamDiscussionComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="teamsGetDiscussionCommentLegacy"></a>
# **teamsGetDiscussionCommentLegacy**
> TeamDiscussionComment teamsGetDiscussionCommentLegacy(teamId, discussionNumber, commentNumber)

Get a discussion comment (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Get a discussion comment](https://docs.github.com/rest/reference/teams#get-a-discussion-comment) endpoint.  Get a specific comment on a team discussion. OAuth access tokens require the &#x60;read:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    Integer discussionNumber = 56; // Integer | The number that identifies the discussion.
    Integer commentNumber = 56; // Integer | The number that identifies the comment.
    try {
      TeamDiscussionComment result = apiInstance.teamsGetDiscussionCommentLegacy(teamId, discussionNumber, commentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsGetDiscussionCommentLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **discussionNumber** | **Integer**| The number that identifies the discussion. | |
| **commentNumber** | **Integer**| The number that identifies the comment. | |

### Return type

[**TeamDiscussionComment**](TeamDiscussionComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="teamsGetDiscussionInOrg"></a>
# **teamsGetDiscussionInOrg**
> TeamDiscussion teamsGetDiscussionInOrg(org, teamSlug, discussionNumber)

Get a discussion

Get a specific discussion on a team&#39;s page. OAuth access tokens require the &#x60;read:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    Integer discussionNumber = 56; // Integer | The number that identifies the discussion.
    try {
      TeamDiscussion result = apiInstance.teamsGetDiscussionInOrg(org, teamSlug, discussionNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsGetDiscussionInOrg");
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
| **discussionNumber** | **Integer**| The number that identifies the discussion. | |

### Return type

[**TeamDiscussion**](TeamDiscussion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="teamsGetDiscussionLegacy"></a>
# **teamsGetDiscussionLegacy**
> TeamDiscussion teamsGetDiscussionLegacy(teamId, discussionNumber)

Get a discussion (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Get a discussion](https://docs.github.com/rest/reference/teams#get-a-discussion) endpoint.  Get a specific discussion on a team&#39;s page. OAuth access tokens require the &#x60;read:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    Integer discussionNumber = 56; // Integer | The number that identifies the discussion.
    try {
      TeamDiscussion result = apiInstance.teamsGetDiscussionLegacy(teamId, discussionNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsGetDiscussionLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **discussionNumber** | **Integer**| The number that identifies the discussion. | |

### Return type

[**TeamDiscussion**](TeamDiscussion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="teamsGetLegacy"></a>
# **teamsGetLegacy**
> TeamFull teamsGetLegacy(teamId)

Get a team (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the [Get a team by name](https://docs.github.com/rest/reference/teams#get-a-team-by-name) endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    try {
      TeamFull result = apiInstance.teamsGetLegacy(teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsGetLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |

### Return type

[**TeamFull**](TeamFull.md)

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

<a name="teamsGetMemberLegacy"></a>
# **teamsGetMemberLegacy**
> teamsGetMemberLegacy(teamId, username)

Get team member (Legacy)

The \&quot;Get team member\&quot; endpoint (described below) is deprecated.  We recommend using the [Get team membership for a user](https://docs.github.com/rest/reference/teams#get-team-membership-for-a-user) endpoint instead. It allows you to get both active and pending memberships.  To list members in a team, the team must be visible to the authenticated user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.teamsGetMemberLegacy(teamId, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsGetMemberLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
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
| **204** | if user is a member |  -  |
| **404** | if user is not a member |  -  |

<a name="teamsGetMembershipForUserInOrg"></a>
# **teamsGetMembershipForUserInOrg**
> TeamMembership teamsGetMembershipForUserInOrg(org, teamSlug, username)

Get team membership for a user

Team members will include the members of child teams.  To get a user&#39;s membership with a team, the team must be visible to the authenticated user.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/memberships/{username}&#x60;.  **Note:** The response contains the &#x60;state&#x60; of the membership and the member&#39;s &#x60;role&#x60;.  The &#x60;role&#x60; for organization owners is set to &#x60;maintainer&#x60;. For more information about &#x60;maintainer&#x60; roles, see see [Create a team](https://docs.github.com/rest/reference/teams#create-a-team).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      TeamMembership result = apiInstance.teamsGetMembershipForUserInOrg(org, teamSlug, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsGetMembershipForUserInOrg");
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
| **username** | **String**| The handle for the GitHub user account. | |

### Return type

[**TeamMembership**](TeamMembership.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | if user has no team membership |  -  |

<a name="teamsGetMembershipForUserLegacy"></a>
# **teamsGetMembershipForUserLegacy**
> TeamMembership teamsGetMembershipForUserLegacy(teamId, username)

Get team membership for a user (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Get team membership for a user](https://docs.github.com/rest/reference/teams#get-team-membership-for-a-user) endpoint.  Team members will include the members of child teams.  To get a user&#39;s membership with a team, the team must be visible to the authenticated user.  **Note:** The response contains the &#x60;state&#x60; of the membership and the member&#39;s &#x60;role&#x60;.  The &#x60;role&#x60; for organization owners is set to &#x60;maintainer&#x60;. For more information about &#x60;maintainer&#x60; roles, see [Create a team](https://docs.github.com/rest/reference/teams#create-a-team).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      TeamMembership result = apiInstance.teamsGetMembershipForUserLegacy(teamId, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsGetMembershipForUserLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **username** | **String**| The handle for the GitHub user account. | |

### Return type

[**TeamMembership**](TeamMembership.md)

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

<a name="teamsList"></a>
# **teamsList**
> List&lt;Team&gt; teamsList(org, perPage, page)

List teams

Lists all teams in an organization that are visible to the authenticated user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Team> result = apiInstance.teamsList(org, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsList");
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
| **403** | Forbidden |  -  |

<a name="teamsListChildInOrg"></a>
# **teamsListChildInOrg**
> List&lt;Team&gt; teamsListChildInOrg(org, teamSlug, perPage, page)

List child teams

Lists the child teams of the team specified by &#x60;{team_slug}&#x60;.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/teams&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Team> result = apiInstance.teamsListChildInOrg(org, teamSlug, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsListChildInOrg");
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
| **200** | if child teams exist |  * Link -  <br>  |

<a name="teamsListChildLegacy"></a>
# **teamsListChildLegacy**
> List&lt;Team&gt; teamsListChildLegacy(teamId, perPage, page)

List child teams (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;List child teams&#x60;](https://docs.github.com/rest/reference/teams#list-child-teams) endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Team> result = apiInstance.teamsListChildLegacy(teamId, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsListChildLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
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
| **200** | if child teams exist |  * Link -  <br>  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="teamsListDiscussionCommentsInOrg"></a>
# **teamsListDiscussionCommentsInOrg**
> List&lt;TeamDiscussionComment&gt; teamsListDiscussionCommentsInOrg(org, teamSlug, discussionNumber, direction, perPage, page)

List discussion comments

List all comments on a team discussion. OAuth access tokens require the &#x60;read:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    Integer discussionNumber = 56; // Integer | The number that identifies the discussion.
    String direction = "asc"; // String | The direction to sort the results by.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<TeamDiscussionComment> result = apiInstance.teamsListDiscussionCommentsInOrg(org, teamSlug, discussionNumber, direction, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsListDiscussionCommentsInOrg");
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
| **discussionNumber** | **Integer**| The number that identifies the discussion. | |
| **direction** | **String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;TeamDiscussionComment&gt;**](TeamDiscussionComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="teamsListDiscussionCommentsLegacy"></a>
# **teamsListDiscussionCommentsLegacy**
> List&lt;TeamDiscussionComment&gt; teamsListDiscussionCommentsLegacy(teamId, discussionNumber, direction, perPage, page)

List discussion comments (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [List discussion comments](https://docs.github.com/rest/reference/teams#list-discussion-comments) endpoint.  List all comments on a team discussion. OAuth access tokens require the &#x60;read:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    Integer discussionNumber = 56; // Integer | The number that identifies the discussion.
    String direction = "asc"; // String | The direction to sort the results by.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<TeamDiscussionComment> result = apiInstance.teamsListDiscussionCommentsLegacy(teamId, discussionNumber, direction, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsListDiscussionCommentsLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **discussionNumber** | **Integer**| The number that identifies the discussion. | |
| **direction** | **String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;TeamDiscussionComment&gt;**](TeamDiscussionComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="teamsListDiscussionsInOrg"></a>
# **teamsListDiscussionsInOrg**
> List&lt;TeamDiscussion&gt; teamsListDiscussionsInOrg(org, teamSlug, direction, perPage, page, pinned)

List discussions

List all discussions on a team&#39;s page. OAuth access tokens require the &#x60;read:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/discussions&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    String direction = "asc"; // String | The direction to sort the results by.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    String pinned = "pinned_example"; // String | Pinned discussions only filter
    try {
      List<TeamDiscussion> result = apiInstance.teamsListDiscussionsInOrg(org, teamSlug, direction, perPage, page, pinned);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsListDiscussionsInOrg");
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
| **direction** | **String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **pinned** | **String**| Pinned discussions only filter | [optional] |

### Return type

[**List&lt;TeamDiscussion&gt;**](TeamDiscussion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="teamsListDiscussionsLegacy"></a>
# **teamsListDiscussionsLegacy**
> List&lt;TeamDiscussion&gt; teamsListDiscussionsLegacy(teamId, direction, perPage, page)

List discussions (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;List discussions&#x60;](https://docs.github.com/rest/reference/teams#list-discussions) endpoint.  List all discussions on a team&#39;s page. OAuth access tokens require the &#x60;read:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    String direction = "asc"; // String | The direction to sort the results by.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<TeamDiscussion> result = apiInstance.teamsListDiscussionsLegacy(teamId, direction, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsListDiscussionsLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **direction** | **String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;TeamDiscussion&gt;**](TeamDiscussion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="teamsListForAuthenticatedUser"></a>
# **teamsListForAuthenticatedUser**
> List&lt;TeamFull&gt; teamsListForAuthenticatedUser(perPage, page)

List teams for the authenticated user

List all of the teams across all of the organizations to which the authenticated user belongs. This method requires &#x60;user&#x60;, &#x60;repo&#x60;, or &#x60;read:org&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/) when authenticating via [OAuth](https://docs.github.com/apps/building-oauth-apps/). When using a fine-grained personal access token, the resource owner of the token [must be a single organization](https://docs.github.com/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token#fine-grained-personal-access-tokens), and have at least read-only member organization permissions. The response payload only contains the teams from a single organization when using a fine-grained personal access token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<TeamFull> result = apiInstance.teamsListForAuthenticatedUser(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsListForAuthenticatedUser");
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

[**List&lt;TeamFull&gt;**](TeamFull.md)

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

<a name="teamsListMembersInOrg"></a>
# **teamsListMembersInOrg**
> List&lt;SimpleUser&gt; teamsListMembersInOrg(org, teamSlug, role, perPage, page)

List team members

Team members will include the members of child teams.  To list members in a team, the team must be visible to the authenticated user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    String role = "member"; // String | Filters members returned by their role in the team.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<SimpleUser> result = apiInstance.teamsListMembersInOrg(org, teamSlug, role, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsListMembersInOrg");
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
| **role** | **String**| Filters members returned by their role in the team. | [optional] [default to all] [enum: member, maintainer, all] |
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

<a name="teamsListMembersLegacy"></a>
# **teamsListMembersLegacy**
> List&lt;SimpleUser&gt; teamsListMembersLegacy(teamId, role, perPage, page)

List team members (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;List team members&#x60;](https://docs.github.com/rest/reference/teams#list-team-members) endpoint.  Team members will include the members of child teams.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    String role = "member"; // String | Filters members returned by their role in the team.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<SimpleUser> result = apiInstance.teamsListMembersLegacy(teamId, role, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsListMembersLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **role** | **String**| Filters members returned by their role in the team. | [optional] [default to all] [enum: member, maintainer, all] |
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
| **404** | Resource not found |  -  |

<a name="teamsListPendingInvitationsInOrg"></a>
# **teamsListPendingInvitationsInOrg**
> List&lt;OrganizationInvitation&gt; teamsListPendingInvitationsInOrg(org, teamSlug, perPage, page)

List pending team invitations

The return hash contains a &#x60;role&#x60; field which refers to the Organization Invitation role and will be one of the following values: &#x60;direct_member&#x60;, &#x60;admin&#x60;, &#x60;billing_manager&#x60;, &#x60;hiring_manager&#x60;, or &#x60;reinstate&#x60;. If the invitee is not a GitHub member, the &#x60;login&#x60; field in the return hash will be &#x60;null&#x60;.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/invitations&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<OrganizationInvitation> result = apiInstance.teamsListPendingInvitationsInOrg(org, teamSlug, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsListPendingInvitationsInOrg");
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

<a name="teamsListPendingInvitationsLegacy"></a>
# **teamsListPendingInvitationsLegacy**
> List&lt;OrganizationInvitation&gt; teamsListPendingInvitationsLegacy(teamId, perPage, page)

List pending team invitations (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;List pending team invitations&#x60;](https://docs.github.com/rest/reference/teams#list-pending-team-invitations) endpoint.  The return hash contains a &#x60;role&#x60; field which refers to the Organization Invitation role and will be one of the following values: &#x60;direct_member&#x60;, &#x60;admin&#x60;, &#x60;billing_manager&#x60;, &#x60;hiring_manager&#x60;, or &#x60;reinstate&#x60;. If the invitee is not a GitHub member, the &#x60;login&#x60; field in the return hash will be &#x60;null&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<OrganizationInvitation> result = apiInstance.teamsListPendingInvitationsLegacy(teamId, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsListPendingInvitationsLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
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

<a name="teamsListProjectsInOrg"></a>
# **teamsListProjectsInOrg**
> List&lt;TeamProject&gt; teamsListProjectsInOrg(org, teamSlug, perPage, page)

List team projects

Lists the organization projects for a team.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/projects&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<TeamProject> result = apiInstance.teamsListProjectsInOrg(org, teamSlug, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsListProjectsInOrg");
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
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;TeamProject&gt;**](TeamProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="teamsListProjectsLegacy"></a>
# **teamsListProjectsLegacy**
> List&lt;TeamProject&gt; teamsListProjectsLegacy(teamId, perPage, page)

List team projects (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;List team projects&#x60;](https://docs.github.com/rest/reference/teams#list-team-projects) endpoint.  Lists the organization projects for a team.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<TeamProject> result = apiInstance.teamsListProjectsLegacy(teamId, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsListProjectsLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;TeamProject&gt;**](TeamProject.md)

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

<a name="teamsListReposInOrg"></a>
# **teamsListReposInOrg**
> List&lt;MinimalRepository&gt; teamsListReposInOrg(org, teamSlug, perPage, page)

List team repositories

Lists a team&#39;s repositories visible to the authenticated user.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/repos&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<MinimalRepository> result = apiInstance.teamsListReposInOrg(org, teamSlug, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsListReposInOrg");
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
| **200** | Response |  * Link -  <br>  |

<a name="teamsListReposLegacy"></a>
# **teamsListReposLegacy**
> List&lt;MinimalRepository&gt; teamsListReposLegacy(teamId, perPage, page)

List team repositories (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [List team repositories](https://docs.github.com/rest/reference/teams#list-team-repositories) endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<MinimalRepository> result = apiInstance.teamsListReposLegacy(teamId, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsListReposLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
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
| **200** | Response |  * Link -  <br>  |
| **404** | Resource not found |  -  |

<a name="teamsRemoveMemberLegacy"></a>
# **teamsRemoveMemberLegacy**
> teamsRemoveMemberLegacy(teamId, username)

Remove team member (Legacy)

The \&quot;Remove team member\&quot; endpoint (described below) is deprecated.  We recommend using the [Remove team membership for a user](https://docs.github.com/rest/reference/teams#remove-team-membership-for-a-user) endpoint instead. It allows you to remove both active and pending memberships.  Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  To remove a team member, the authenticated user must have &#39;admin&#39; permissions to the team or be an owner of the org that the team is associated with. Removing a team member does not delete the user, it just removes them from the team.  **Note:** When you have team synchronization set up for a team with your organization&#39;s identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team&#39;s membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see \&quot;[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.teamsRemoveMemberLegacy(teamId, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsRemoveMemberLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
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
| **404** | Not Found if team synchronization is setup |  -  |

<a name="teamsRemoveMembershipForUserInOrg"></a>
# **teamsRemoveMembershipForUserInOrg**
> teamsRemoveMembershipForUserInOrg(org, teamSlug, username)

Remove team membership for a user

To remove a membership between a user and a team, the authenticated user must have &#39;admin&#39; permissions to the team or be an owner of the organization that the team is associated with. Removing team membership does not delete the user, it just removes their membership from the team.  Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  **Note:** When you have team synchronization set up for a team with your organization&#39;s identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team&#39;s membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see \&quot;[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/).\&quot;  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;DELETE /organizations/{org_id}/team/{team_id}/memberships/{username}&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.teamsRemoveMembershipForUserInOrg(org, teamSlug, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsRemoveMembershipForUserInOrg");
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
| **403** | Forbidden if team synchronization is set up |  -  |

<a name="teamsRemoveMembershipForUserLegacy"></a>
# **teamsRemoveMembershipForUserLegacy**
> teamsRemoveMembershipForUserLegacy(teamId, username)

Remove team membership for a user (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Remove team membership for a user](https://docs.github.com/rest/reference/teams#remove-team-membership-for-a-user) endpoint.  Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  To remove a membership between a user and a team, the authenticated user must have &#39;admin&#39; permissions to the team or be an owner of the organization that the team is associated with. Removing team membership does not delete the user, it just removes their membership from the team.  **Note:** When you have team synchronization set up for a team with your organization&#39;s identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team&#39;s membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see \&quot;[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.teamsRemoveMembershipForUserLegacy(teamId, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsRemoveMembershipForUserLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
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
| **403** | if team synchronization is set up |  -  |

<a name="teamsRemoveProjectInOrg"></a>
# **teamsRemoveProjectInOrg**
> teamsRemoveProjectInOrg(org, teamSlug, projectId)

Remove a project from a team

Removes an organization project from a team. An organization owner or a team maintainer can remove any project from the team. To remove a project from a team as an organization member, the authenticated user must have &#x60;read&#x60; access to both the team and project, or &#x60;admin&#x60; access to the team or project. This endpoint removes the project from the team, but does not delete the project.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;DELETE /organizations/{org_id}/team/{team_id}/projects/{project_id}&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    Integer projectId = 56; // Integer | The unique identifier of the project.
    try {
      apiInstance.teamsRemoveProjectInOrg(org, teamSlug, projectId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsRemoveProjectInOrg");
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
| **projectId** | **Integer**| The unique identifier of the project. | |

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

<a name="teamsRemoveProjectLegacy"></a>
# **teamsRemoveProjectLegacy**
> teamsRemoveProjectLegacy(teamId, projectId)

Remove a project from a team (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Remove a project from a team](https://docs.github.com/rest/reference/teams#remove-a-project-from-a-team) endpoint.  Removes an organization project from a team. An organization owner or a team maintainer can remove any project from the team. To remove a project from a team as an organization member, the authenticated user must have &#x60;read&#x60; access to both the team and project, or &#x60;admin&#x60; access to the team or project. **Note:** This endpoint removes the project from the team, but does not delete it.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    Integer projectId = 56; // Integer | The unique identifier of the project.
    try {
      apiInstance.teamsRemoveProjectLegacy(teamId, projectId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsRemoveProjectLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **projectId** | **Integer**| The unique identifier of the project. | |

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

<a name="teamsRemoveRepoInOrg"></a>
# **teamsRemoveRepoInOrg**
> teamsRemoveRepoInOrg(org, teamSlug, owner, repo)

Remove a repository from a team

If the authenticated user is an organization owner or a team maintainer, they can remove any repositories from the team. To remove a repository from a team as an organization member, the authenticated user must have admin access to the repository and must be able to see the team. This does not delete the repository, it just removes it from the team.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;DELETE /organizations/{org_id}/team/{team_id}/repos/{owner}/{repo}&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      apiInstance.teamsRemoveRepoInOrg(org, teamSlug, owner, repo);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsRemoveRepoInOrg");
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

<a name="teamsRemoveRepoLegacy"></a>
# **teamsRemoveRepoLegacy**
> teamsRemoveRepoLegacy(teamId, owner, repo)

Remove a repository from a team (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Remove a repository from a team](https://docs.github.com/rest/reference/teams#remove-a-repository-from-a-team) endpoint.  If the authenticated user is an organization owner or a team maintainer, they can remove any repositories from the team. To remove a repository from a team as an organization member, the authenticated user must have admin access to the repository and must be able to see the team. NOTE: This does not delete the repository, it just removes it from the team.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      apiInstance.teamsRemoveRepoLegacy(teamId, owner, repo);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsRemoveRepoLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
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

<a name="teamsUpdateDiscussionCommentInOrg"></a>
# **teamsUpdateDiscussionCommentInOrg**
> TeamDiscussionComment teamsUpdateDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber, teamsCreateDiscussionCommentInOrgRequest)

Update a discussion comment

Edits the body text of a discussion comment. OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;PATCH /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments/{comment_number}&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    Integer discussionNumber = 56; // Integer | The number that identifies the discussion.
    Integer commentNumber = 56; // Integer | The number that identifies the comment.
    TeamsCreateDiscussionCommentInOrgRequest teamsCreateDiscussionCommentInOrgRequest = new TeamsCreateDiscussionCommentInOrgRequest(); // TeamsCreateDiscussionCommentInOrgRequest | 
    try {
      TeamDiscussionComment result = apiInstance.teamsUpdateDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber, teamsCreateDiscussionCommentInOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsUpdateDiscussionCommentInOrg");
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
| **discussionNumber** | **Integer**| The number that identifies the discussion. | |
| **commentNumber** | **Integer**| The number that identifies the comment. | |
| **teamsCreateDiscussionCommentInOrgRequest** | [**TeamsCreateDiscussionCommentInOrgRequest**](TeamsCreateDiscussionCommentInOrgRequest.md)|  | |

### Return type

[**TeamDiscussionComment**](TeamDiscussionComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="teamsUpdateDiscussionCommentLegacy"></a>
# **teamsUpdateDiscussionCommentLegacy**
> TeamDiscussionComment teamsUpdateDiscussionCommentLegacy(teamId, discussionNumber, commentNumber, teamsCreateDiscussionCommentInOrgRequest)

Update a discussion comment (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Update a discussion comment](https://docs.github.com/rest/reference/teams#update-a-discussion-comment) endpoint.  Edits the body text of a discussion comment. OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    Integer discussionNumber = 56; // Integer | The number that identifies the discussion.
    Integer commentNumber = 56; // Integer | The number that identifies the comment.
    TeamsCreateDiscussionCommentInOrgRequest teamsCreateDiscussionCommentInOrgRequest = new TeamsCreateDiscussionCommentInOrgRequest(); // TeamsCreateDiscussionCommentInOrgRequest | 
    try {
      TeamDiscussionComment result = apiInstance.teamsUpdateDiscussionCommentLegacy(teamId, discussionNumber, commentNumber, teamsCreateDiscussionCommentInOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsUpdateDiscussionCommentLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **discussionNumber** | **Integer**| The number that identifies the discussion. | |
| **commentNumber** | **Integer**| The number that identifies the comment. | |
| **teamsCreateDiscussionCommentInOrgRequest** | [**TeamsCreateDiscussionCommentInOrgRequest**](TeamsCreateDiscussionCommentInOrgRequest.md)|  | |

### Return type

[**TeamDiscussionComment**](TeamDiscussionComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="teamsUpdateDiscussionInOrg"></a>
# **teamsUpdateDiscussionInOrg**
> TeamDiscussion teamsUpdateDiscussionInOrg(org, teamSlug, discussionNumber, teamsUpdateDiscussionInOrgRequest)

Update a discussion

Edits the title and body text of a discussion post. Only the parameters you provide are updated. OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;PATCH /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    Integer discussionNumber = 56; // Integer | The number that identifies the discussion.
    TeamsUpdateDiscussionInOrgRequest teamsUpdateDiscussionInOrgRequest = new TeamsUpdateDiscussionInOrgRequest(); // TeamsUpdateDiscussionInOrgRequest | 
    try {
      TeamDiscussion result = apiInstance.teamsUpdateDiscussionInOrg(org, teamSlug, discussionNumber, teamsUpdateDiscussionInOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsUpdateDiscussionInOrg");
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
| **discussionNumber** | **Integer**| The number that identifies the discussion. | |
| **teamsUpdateDiscussionInOrgRequest** | [**TeamsUpdateDiscussionInOrgRequest**](TeamsUpdateDiscussionInOrgRequest.md)|  | [optional] |

### Return type

[**TeamDiscussion**](TeamDiscussion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="teamsUpdateDiscussionLegacy"></a>
# **teamsUpdateDiscussionLegacy**
> TeamDiscussion teamsUpdateDiscussionLegacy(teamId, discussionNumber, teamsUpdateDiscussionInOrgRequest)

Update a discussion (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Update a discussion](https://docs.github.com/rest/reference/teams#update-a-discussion) endpoint.  Edits the title and body text of a discussion post. Only the parameters you provide are updated. OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    Integer discussionNumber = 56; // Integer | The number that identifies the discussion.
    TeamsUpdateDiscussionInOrgRequest teamsUpdateDiscussionInOrgRequest = new TeamsUpdateDiscussionInOrgRequest(); // TeamsUpdateDiscussionInOrgRequest | 
    try {
      TeamDiscussion result = apiInstance.teamsUpdateDiscussionLegacy(teamId, discussionNumber, teamsUpdateDiscussionInOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsUpdateDiscussionLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **discussionNumber** | **Integer**| The number that identifies the discussion. | |
| **teamsUpdateDiscussionInOrgRequest** | [**TeamsUpdateDiscussionInOrgRequest**](TeamsUpdateDiscussionInOrgRequest.md)|  | [optional] |

### Return type

[**TeamDiscussion**](TeamDiscussion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="teamsUpdateInOrg"></a>
# **teamsUpdateInOrg**
> TeamFull teamsUpdateInOrg(org, teamSlug, teamsUpdateInOrgRequest)

Update a team

To edit a team, the authenticated user must either be an organization owner or a team maintainer.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;PATCH /organizations/{org_id}/team/{team_id}&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String teamSlug = "teamSlug_example"; // String | The slug of the team name.
    TeamsUpdateInOrgRequest teamsUpdateInOrgRequest = new TeamsUpdateInOrgRequest(); // TeamsUpdateInOrgRequest | 
    try {
      TeamFull result = apiInstance.teamsUpdateInOrg(org, teamSlug, teamsUpdateInOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsUpdateInOrg");
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
| **teamsUpdateInOrgRequest** | [**TeamsUpdateInOrgRequest**](TeamsUpdateInOrgRequest.md)|  | [optional] |

### Return type

[**TeamFull**](TeamFull.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response when the updated information already exists |  -  |
| **201** | Response |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **403** | Forbidden |  -  |

<a name="teamsUpdateLegacy"></a>
# **teamsUpdateLegacy**
> TeamFull teamsUpdateLegacy(teamId, teamsUpdateLegacyRequest)

Update a team (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Update a team](https://docs.github.com/rest/reference/teams#update-a-team) endpoint.  To edit a team, the authenticated user must either be an organization owner or a team maintainer.  **Note:** With nested teams, the &#x60;privacy&#x60; for parent teams cannot be &#x60;secret&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Integer teamId = 56; // Integer | The unique identifier of the team.
    TeamsUpdateLegacyRequest teamsUpdateLegacyRequest = new TeamsUpdateLegacyRequest(); // TeamsUpdateLegacyRequest | 
    try {
      TeamFull result = apiInstance.teamsUpdateLegacy(teamId, teamsUpdateLegacyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#teamsUpdateLegacy");
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
| **teamId** | **Integer**| The unique identifier of the team. | |
| **teamsUpdateLegacyRequest** | [**TeamsUpdateLegacyRequest**](TeamsUpdateLegacyRequest.md)|  | |

### Return type

[**TeamFull**](TeamFull.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response when the updated information already exists |  -  |
| **201** | Response |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **403** | Forbidden |  -  |

