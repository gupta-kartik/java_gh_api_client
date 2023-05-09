

# WebhookMembershipRemoved


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) |  |  |
|**enterprise** | [**Enterprise**](Enterprise.md) |  |  [optional] |
|**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional] |
|**member** | [**User**](User.md) |  |  |
|**organization** | [**OrganizationSimple**](OrganizationSimple.md) |  |  |
|**repository** | [**Repository**](Repository.md) |  |  [optional] |
|**scope** | [**ScopeEnum**](#ScopeEnum) | The scope of the membership. Currently, can only be &#x60;team&#x60;. |  |
|**sender** | [**User**](User.md) |  |  |
|**team** | [**Team**](Team.md) |  |  |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| REMOVED | &quot;removed&quot; |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| TEAM | &quot;team&quot; |
| ORGANIZATION | &quot;organization&quot; |



