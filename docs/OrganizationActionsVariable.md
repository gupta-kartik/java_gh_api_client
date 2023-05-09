

# OrganizationActionsVariable

Organization variable for GitHub Actions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the variable. |  |
|**value** | **String** | The value of the variable. |  |
|**createdAt** | **OffsetDateTime** | The date and time at which the variable was created, in ISO 8601 format&#39;:&#39; YYYY-MM-DDTHH:MM:SSZ. |  |
|**updatedAt** | **OffsetDateTime** | The date and time at which the variable was last updated, in ISO 8601 format&#39;:&#39; YYYY-MM-DDTHH:MM:SSZ. |  |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Visibility of a variable |  |
|**selectedRepositoriesUrl** | **URI** |  |  [optional] |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| PRIVATE | &quot;private&quot; |
| SELECTED | &quot;selected&quot; |



