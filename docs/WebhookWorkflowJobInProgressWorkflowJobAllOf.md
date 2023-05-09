

# WebhookWorkflowJobInProgressWorkflowJobAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkRunUrl** | **String** |  |  [optional] |
|**completedAt** | **String** |  |  [optional] |
|**conclusion** | **String** |  |  [optional] |
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
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**headBranch** | **String** | The name of the current branch. |  [optional] |
|**workflowName** | **String** | The name of the workflow. |  [optional] |
|**steps** | [**List&lt;WorkflowStep2&gt;**](WorkflowStep2.md) |  |  |
|**url** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |
| QUEUED | &quot;queued&quot; |



