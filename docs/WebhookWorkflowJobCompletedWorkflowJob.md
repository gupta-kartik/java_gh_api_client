

# WebhookWorkflowJobCompletedWorkflowJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkRunUrl** | **String** |  |  |
|**completedAt** | **String** |  |  |
|**conclusion** | [**ConclusionEnum**](#ConclusionEnum) |  |  |
|**createdAt** | **String** | The time that the job created. |  |
|**headSha** | **String** |  |  |
|**htmlUrl** | **String** |  |  |
|**id** | **Integer** |  |  |
|**labels** | **List&lt;String&gt;** |  |  |
|**name** | **String** |  |  |
|**nodeId** | **String** |  |  |
|**runAttempt** | **Integer** |  |  |
|**runId** | **Integer** |  |  |
|**runUrl** | **String** |  |  |
|**runnerGroupId** | **BigDecimal** |  |  |
|**runnerGroupName** | **String** |  |  |
|**runnerId** | **BigDecimal** |  |  |
|**runnerName** | **String** |  |  |
|**startedAt** | **String** |  |  |
|**status** | **String** |  |  |
|**headBranch** | **String** | The name of the current branch. |  |
|**workflowName** | **String** | The name of the workflow. |  |
|**steps** | **List&lt;Object&gt;** |  |  |
|**url** | **String** |  |  |



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



