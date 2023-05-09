

# CheckSuite

A suite of checks performed on the code of a given code change

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**nodeId** | **String** |  |  |
|**headBranch** | **String** |  |  |
|**headSha** | **String** | The SHA of the head commit that is being checked. |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**conclusion** | [**ConclusionEnum**](#ConclusionEnum) |  |  |
|**url** | **String** |  |  |
|**before** | **String** |  |  |
|**after** | **String** |  |  |
|**pullRequests** | [**List&lt;PullRequestMinimal&gt;**](PullRequestMinimal.md) |  |  |
|**app** | [**NullableIntegration**](NullableIntegration.md) |  |  |
|**repository** | [**MinimalRepository**](MinimalRepository.md) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**headCommit** | [**SimpleCommit**](SimpleCommit.md) |  |  |
|**latestCheckRunsCount** | **Integer** |  |  |
|**checkRunsUrl** | **String** |  |  |
|**rerequestable** | **Boolean** |  |  [optional] |
|**runsRerequestable** | **Boolean** |  |  [optional] |



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
| STARTUP_FAILURE | &quot;startup_failure&quot; |
| STALE | &quot;stale&quot; |
| NULL | &quot;null&quot; |



