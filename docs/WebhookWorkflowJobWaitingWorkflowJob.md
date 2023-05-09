

# WebhookWorkflowJobWaitingWorkflowJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkRunUrl** | **URI** |  |  |
|**completedAt** | **String** |  |  |
|**conclusion** | **String** |  |  |
|**createdAt** | **String** | The time that the job created. |  |
|**headSha** | **String** |  |  |
|**htmlUrl** | **URI** |  |  |
|**id** | **Integer** |  |  |
|**labels** | **List&lt;String&gt;** |  |  |
|**name** | **String** |  |  |
|**nodeId** | **String** |  |  |
|**runAttempt** | **Integer** |  |  |
|**runId** | **BigDecimal** |  |  |
|**runUrl** | **URI** |  |  |
|**runnerGroupId** | **Integer** |  |  |
|**runnerGroupName** | **String** |  |  |
|**runnerId** | **Integer** |  |  |
|**runnerName** | **String** |  |  |
|**startedAt** | **OffsetDateTime** |  |  |
|**headBranch** | **String** | The name of the current branch. |  |
|**workflowName** | **String** | The name of the workflow. |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**steps** | [**List&lt;WorkflowStep4&gt;**](WorkflowStep4.md) |  |  |
|**url** | **URI** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;queued&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |
| WAITING | &quot;waiting&quot; |



