

# InstallationToken

Authentication token for a GitHub App installed on a user or org.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**token** | **String** |  |  |
|**expiresAt** | **String** |  |  |
|**permissions** | [**AppPermissions**](AppPermissions.md) |  |  [optional] |
|**repositorySelection** | [**RepositorySelectionEnum**](#RepositorySelectionEnum) |  |  [optional] |
|**repositories** | [**List&lt;Repository&gt;**](Repository.md) |  |  [optional] |
|**singleFile** | **String** |  |  [optional] |
|**hasMultipleSingleFiles** | **Boolean** |  |  [optional] |
|**singleFilePaths** | **List&lt;String&gt;** |  |  [optional] |



## Enum: RepositorySelectionEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| SELECTED | &quot;selected&quot; |



