

# CodespacesSecret

Secrets for a GitHub Codespace.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the secret |  |
|**createdAt** | **OffsetDateTime** | The date and time at which the secret was created, in ISO 8601 format&#39;:&#39; YYYY-MM-DDTHH:MM:SSZ. |  |
|**updatedAt** | **OffsetDateTime** | The date and time at which the secret was last updated, in ISO 8601 format&#39;:&#39; YYYY-MM-DDTHH:MM:SSZ. |  |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | The type of repositories in the organization that the secret is visible to |  |
|**selectedRepositoriesUrl** | **URI** | The API URL at which the list of repositories this secret is visible to can be retrieved |  |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| PRIVATE | &quot;private&quot; |
| SELECTED | &quot;selected&quot; |



