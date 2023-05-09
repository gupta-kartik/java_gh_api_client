

# DeploymentStatus

The status of a deployment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** |  |  |
|**id** | **Integer** |  |  |
|**nodeId** | **String** |  |  |
|**state** | [**StateEnum**](#StateEnum) | The state of the status. |  |
|**creator** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**description** | **String** | A short description of the status. |  |
|**environment** | **String** | The environment of the deployment that the status is for. |  [optional] |
|**targetUrl** | **URI** | Deprecated: the URL to associate with this status. |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**deploymentUrl** | **URI** |  |  |
|**repositoryUrl** | **URI** |  |  |
|**environmentUrl** | **URI** | The URL for accessing your environment. |  [optional] |
|**logUrl** | **URI** | The URL to associate with this status. |  [optional] |
|**performedViaGithubApp** | [**NullableIntegration**](NullableIntegration.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ERROR | &quot;error&quot; |
| FAILURE | &quot;failure&quot; |
| INACTIVE | &quot;inactive&quot; |
| PENDING | &quot;pending&quot; |
| SUCCESS | &quot;success&quot; |
| QUEUED | &quot;queued&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |



