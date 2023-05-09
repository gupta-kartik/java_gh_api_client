

# AuthenticationToken

Authentication Token

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**token** | **String** | The token used for authentication |  |
|**expiresAt** | **OffsetDateTime** | The time this token expires |  |
|**permissions** | **Object** |  |  [optional] |
|**repositories** | [**List&lt;Repository&gt;**](Repository.md) | The repositories this token has access to |  [optional] |
|**singleFile** | **String** |  |  [optional] |
|**repositorySelection** | [**RepositorySelectionEnum**](#RepositorySelectionEnum) | Describe whether all repositories have been selected or there&#39;s a selection involved |  [optional] |



## Enum: RepositorySelectionEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| SELECTED | &quot;selected&quot; |



