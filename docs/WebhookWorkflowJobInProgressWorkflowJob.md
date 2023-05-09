

# WebhookWorkflowJobInProgressWorkflowJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkRunUrl** | **String** |  |  |
|**completedAt** | **String** |  |  |
|**conclusion** | **String** |  |  |
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
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**headBranch** | **String** | The name of the current branch. |  |
|**workflowName** | **String** | The name of the workflow. |  |
|**steps** | [**List&lt;WorkflowStep2&gt;**](WorkflowStep2.md) |  |  |
|**url** | **String** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |
| QUEUED | &quot;queued&quot; |



