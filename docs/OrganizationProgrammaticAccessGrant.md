

# OrganizationProgrammaticAccessGrant

Minimal representation of an organization programmatic access grant for enumerations

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the fine-grained personal access token. The &#x60;pat_id&#x60; used to get details about an approved fine-grained personal access token. |  |
|**owner** | [**SimpleUser**](SimpleUser.md) |  |  |
|**repositorySelection** | [**RepositorySelectionEnum**](#RepositorySelectionEnum) | Type of repository selection requested. |  |
|**repositoriesUrl** | **String** | URL to the list of repositories the fine-grained personal access token can access. Only follow when &#x60;repository_selection&#x60; is &#x60;subset&#x60;. |  |
|**permissions** | [**OrganizationProgrammaticAccessGrantRequestPermissions**](OrganizationProgrammaticAccessGrantRequestPermissions.md) |  |  |
|**accessGrantedAt** | **String** | Date and time when the fine-grained personal access token was approved to access the organization. |  |
|**tokenExpired** | **Boolean** | Whether the associated fine-grained personal access token has expired. |  |
|**tokenExpiresAt** | **String** | Date and time when the associated fine-grained personal access token expires. |  |
|**tokenLastUsedAt** | **String** | Date and time when the associated fine-grained personal access token was last used for authentication. |  |



## Enum: RepositorySelectionEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| ALL | &quot;all&quot; |
| SUBSET | &quot;subset&quot; |



