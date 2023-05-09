

# WebhookStarDeleted


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) |  |  |
|**enterprise** | [**Enterprise**](Enterprise.md) |  |  [optional] |
|**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional] |
|**organization** | [**OrganizationSimple**](OrganizationSimple.md) |  |  [optional] |
|**repository** | [**Repository**](Repository.md) |  |  |
|**sender** | [**SimpleUser**](SimpleUser.md) |  |  |
|**starredAt** | **Object** | The time the star was created. This is a timestamp in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. Will be &#x60;null&#x60; for the &#x60;deleted&#x60; action. |  |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| DELETED | &quot;deleted&quot; |



