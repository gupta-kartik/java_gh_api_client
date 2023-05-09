

# CheckRunWithSimpleCheckSuite

A check performed on the code of a given code change

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**app** | [**NullableIntegration**](NullableIntegration.md) |  |  |
|**checkSuite** | [**SimpleCheckSuite**](SimpleCheckSuite.md) |  |  |
|**completedAt** | **OffsetDateTime** |  |  |
|**conclusion** | [**ConclusionEnum**](#ConclusionEnum) |  |  |
|**deployment** | [**DeploymentSimple**](DeploymentSimple.md) |  |  [optional] |
|**detailsUrl** | **String** |  |  |
|**externalId** | **String** |  |  |
|**headSha** | **String** | The SHA of the commit that is being checked. |  |
|**htmlUrl** | **String** |  |  |
|**id** | **Integer** | The id of the check. |  |
|**name** | **String** | The name of the check. |  |
|**nodeId** | **String** |  |  |
|**output** | [**CheckRunWithSimpleCheckSuiteOutput**](CheckRunWithSimpleCheckSuiteOutput.md) |  |  |
|**pullRequests** | [**List&lt;PullRequestMinimal&gt;**](PullRequestMinimal.md) |  |  |
|**startedAt** | **OffsetDateTime** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | The phase of the lifecycle that the check is currently in. |  |
|**url** | **String** |  |  |



## Enum: ConclusionEnum

| Name | Value |
|---- | -----|
| WAITING | &quot;waiting&quot; |
| PENDING | &quot;pending&quot; |
| STARTUP_FAILURE | &quot;startup_failure&quot; |
| STALE | &quot;stale&quot; |
| SUCCESS | &quot;success&quot; |
| FAILURE | &quot;failure&quot; |
| NEUTRAL | &quot;neutral&quot; |
| CANCELLED | &quot;cancelled&quot; |
| SKIPPED | &quot;skipped&quot; |
| TIMED_OUT | &quot;timed_out&quot; |
| ACTION_REQUIRED | &quot;action_required&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;queued&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |
| PENDING | &quot;pending&quot; |



