

# CheckRun

A check performed on the code of a given code change

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The id of the check. |  |
|**headSha** | **String** | The SHA of the commit that is being checked. |  |
|**nodeId** | **String** |  |  |
|**externalId** | **String** |  |  |
|**url** | **String** |  |  |
|**htmlUrl** | **String** |  |  |
|**detailsUrl** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | The phase of the lifecycle that the check is currently in. |  |
|**conclusion** | [**ConclusionEnum**](#ConclusionEnum) |  |  |
|**startedAt** | **OffsetDateTime** |  |  |
|**completedAt** | **OffsetDateTime** |  |  |
|**output** | [**CheckRunOutput**](CheckRunOutput.md) |  |  |
|**name** | **String** | The name of the check. |  |
|**checkSuite** | [**CheckRunCheckSuite**](CheckRunCheckSuite.md) |  |  |
|**app** | [**NullableIntegration**](NullableIntegration.md) |  |  |
|**pullRequests** | [**List&lt;PullRequestMinimal&gt;**](PullRequestMinimal.md) |  |  |
|**deployment** | [**DeploymentSimple**](DeploymentSimple.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;queued&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |



## Enum: ConclusionEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| FAILURE | &quot;failure&quot; |
| NEUTRAL | &quot;neutral&quot; |
| CANCELLED | &quot;cancelled&quot; |
| SKIPPED | &quot;skipped&quot; |
| TIMED_OUT | &quot;timed_out&quot; |
| ACTION_REQUIRED | &quot;action_required&quot; |



