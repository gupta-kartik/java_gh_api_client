

# Installation

Installation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The ID of the installation. |  |
|**account** | [**InstallationAccount**](InstallationAccount.md) |  |  |
|**repositorySelection** | [**RepositorySelectionEnum**](#RepositorySelectionEnum) | Describe whether all repositories have been selected or there&#39;s a selection involved |  |
|**accessTokensUrl** | **URI** |  |  |
|**repositoriesUrl** | **URI** |  |  |
|**htmlUrl** | **URI** |  |  |
|**appId** | **Integer** |  |  |
|**targetId** | **Integer** | The ID of the user or organization this token is being scoped to. |  |
|**targetType** | **String** |  |  |
|**permissions** | [**AppPermissions**](AppPermissions.md) |  |  |
|**events** | **List&lt;String&gt;** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**singleFileName** | **String** |  |  |
|**hasMultipleSingleFiles** | **Boolean** |  |  [optional] |
|**singleFilePaths** | **List&lt;String&gt;** |  |  [optional] |
|**appSlug** | **String** |  |  |
|**suspendedBy** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**suspendedAt** | **OffsetDateTime** |  |  |
|**contactEmail** | **String** |  |  [optional] |



## Enum: RepositorySelectionEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| SELECTED | &quot;selected&quot; |



