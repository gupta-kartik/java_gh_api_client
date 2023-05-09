

# OrganizationDependabotSecret

Secrets for GitHub Dependabot for an organization.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the secret. |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Visibility of a secret |  |
|**selectedRepositoriesUrl** | **URI** |  |  [optional] |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| PRIVATE | &quot;private&quot; |
| SELECTED | &quot;selected&quot; |



