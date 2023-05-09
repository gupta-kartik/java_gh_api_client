

# WebhookWorkflowJobCompletedWorkflowJobAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkRunUrl** | **String** |  |  [optional] |
|**completedAt** | **String** |  |  [optional] |
|**conclusion** | [**ConclusionEnum**](#ConclusionEnum) |  |  |
|**createdAt** | **String** | The time that the job created. |  [optional] |
|**headSha** | **String** |  |  [optional] |
|**htmlUrl** | **String** |  |  [optional] |
|**id** | **Integer** |  |  [optional] |
|**labels** | **List&lt;String&gt;** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**nodeId** | **String** |  |  [optional] |
|**runAttempt** | **Integer** |  |  [optional] |
|**runId** | **Integer** |  |  [optional] |
|**runUrl** | **String** |  |  [optional] |
|**runnerGroupId** | **BigDecimal** |  |  [optional] |
|**runnerGroupName** | **String** |  |  [optional] |
|**runnerId** | **BigDecimal** |  |  [optional] |
|**runnerName** | **String** |  |  [optional] |
|**startedAt** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**headBranch** | **String** | The name of the current branch. |  [optional] |
|**workflowName** | **String** | The name of the workflow. |  [optional] |
|**steps** | **List&lt;Object&gt;** |  |  [optional] |
|**url** | **String** |  |  [optional] |



## Enum: ConclusionEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| FAILURE | &quot;failure&quot; |
| SKIPPED | &quot;skipped&quot; |
| CANCELLED | &quot;cancelled&quot; |
| ACTION_REQUIRED | &quot;action_required&quot; |
| NEUTRAL | &quot;neutral&quot; |
| TIMED_OUT | &quot;timed_out&quot; |



