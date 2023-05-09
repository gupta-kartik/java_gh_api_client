

# OrganizationProgrammaticAccessGrantRequest

Minimal representation of an organization programmatic access grant request for enumerations

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the request for access via fine-grained personal access token. The &#x60;pat_request_id&#x60; used to review PAT requests. |  |
|**reason** | **String** | Reason for requesting access. |  |
|**owner** | [**SimpleUser**](SimpleUser.md) |  |  |
|**repositorySelection** | [**RepositorySelectionEnum**](#RepositorySelectionEnum) | Type of repository selection requested. |  |
|**repositoriesUrl** | **String** | URL to the list of repositories requested to be accessed via fine-grained personal access token. Should only be followed when &#x60;repository_selection&#x60; is &#x60;subset&#x60;. |  |
|**permissions** | [**OrganizationProgrammaticAccessGrantRequestPermissions**](OrganizationProgrammaticAccessGrantRequestPermissions.md) |  |  |
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



