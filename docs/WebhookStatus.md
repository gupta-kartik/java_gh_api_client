

# WebhookStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**avatarUrl** | **URI** |  |  [optional] |
|**branches** | [**List&lt;WebhookStatusBranchesInner&gt;**](WebhookStatusBranchesInner.md) | An array of branch objects containing the status&#39; SHA. Each branch contains the given SHA, but the SHA may or may not be the head of the branch. The array includes a maximum of 10 branches. |  |
|**commit** | [**WebhookStatusCommit**](WebhookStatusCommit.md) |  |  |
|**context** | **String** |  |  |
|**createdAt** | **String** |  |  |
|**description** | **String** | The optional human-readable description added to the status. |  |
|**enterprise** | [**Enterprise**](Enterprise.md) |  |  [optional] |
|**id** | **Integer** | The unique identifier of the status. |  |
|**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional] |
|**name** | **String** |  |  |
|**organization** | [**OrganizationSimple**](OrganizationSimple.md) |  |  [optional] |
|**repository** | [**Repository**](Repository.md) |  |  |
|**sender** | [**SimpleUser**](SimpleUser.md) |  |  |
|**sha** | **String** | The Commit SHA. |  |
|**state** | [**StateEnum**](#StateEnum) | The new state. Can be &#x60;pending&#x60;, &#x60;success&#x60;, &#x60;failure&#x60;, or &#x60;error&#x60;. |  |
|**targetUrl** | **String** | The optional link added to the status. |  |
|**updatedAt** | **String** |  |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SUCCESS | &quot;success&quot; |
| FAILURE | &quot;failure&quot; |
| ERROR | &quot;error&quot; |



