

# SimpleCheckSuite

A suite of checks performed on the code of a given code change

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**after** | **String** |  |  [optional] |
|**app** | [**Integration**](Integration.md) |  |  [optional] |
|**before** | **String** |  |  [optional] |
|**conclusion** | [**ConclusionEnum**](#ConclusionEnum) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**headBranch** | **String** |  |  [optional] |
|**headSha** | **String** | The SHA of the head commit that is being checked. |  [optional] |
|**id** | **Integer** |  |  [optional] |
|**nodeId** | **String** |  |  [optional] |
|**pullRequests** | [**List&lt;PullRequestMinimal&gt;**](PullRequestMinimal.md) |  |  [optional] |
|**repository** | [**MinimalRepository**](MinimalRepository.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**url** | **String** |  |  [optional] |



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
| STALE | &quot;stale&quot; |
| STARTUP_FAILURE | &quot;startup_failure&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;queued&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |
| PENDING | &quot;pending&quot; |
| WAITING | &quot;waiting&quot; |



