

# PersonalAccessTokenRequest

Details of a Personal Access Token Request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the request for access via fine-grained personal access token. Used as the &#x60;pat_request_id&#x60; parameter in the list and review API calls. |  |
|**owner** | [**SimpleUser**](SimpleUser.md) |  |  |
|**permissionsAdded** | [**PersonalAccessTokenRequestPermissionsAdded**](PersonalAccessTokenRequestPermissionsAdded.md) |  |  |
|**permissionsUpgraded** | [**PersonalAccessTokenRequestPermissionsUpgraded**](PersonalAccessTokenRequestPermissionsUpgraded.md) |  |  |
|**permissionsResult** | [**PersonalAccessTokenRequestPermissionsResult**](PersonalAccessTokenRequestPermissionsResult.md) |  |  |
|**repositorySelection** | [**RepositorySelectionEnum**](#RepositorySelectionEnum) | Type of repository selection requested. |  |
|**repositoryCount** | **Integer** | The number of repositories the token is requesting access to. This field is only populated when &#x60;repository_selection&#x60; is &#x60;subset&#x60;. |  |
|**repositories** | [**List&lt;PersonalAccessTokenRequestRepositoriesInner&gt;**](PersonalAccessTokenRequestRepositoriesInner.md) | An array of repository objects the token is requesting access to. This field is only populated when &#x60;repository_selection&#x60; is &#x60;subset&#x60;. |  |
|**createdAt** | **String** | Date and time when the request for access was created. |  |
|**tokenExpired** | **Boolean** | Whether the associated fine-grained personal access token has expired. |  |
|**tokenExpiresAt** | **String** | Date and time when the associated fine-grained personal access token expires. |  |
|**tokenLastUsedAt** | **String** | Date and time when the associated fine-grained personal access token was last used for authentication. |  |



## Enum: RepositorySelectionEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| ALL | &quot;all&quot; |
| SUBSET | &quot;subset&quot; |



