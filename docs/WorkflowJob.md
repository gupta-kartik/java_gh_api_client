

# WorkflowJob

The workflow job. Many `workflow_job` keys, such as `head_sha`, `conclusion`, and `started_at` are the same as those in a [`check_run`](#check_run) object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkRunUrl** | **URI** |  |  |
|**completedAt** | **String** |  |  |
|**conclusion** | [**ConclusionEnum**](#ConclusionEnum) |  |  |
|**createdAt** | **String** | The time that the job created. |  |
|**headSha** | **String** |  |  |
|**htmlUrl** | **URI** |  |  |
|**id** | **Integer** |  |  |
|**labels** | **List&lt;String&gt;** | Custom labels for the job. Specified by the [&#x60;\&quot;runs-on\&quot;&#x60; attribute](https://docs.github.com/actions/reference/workflow-syntax-for-github-actions#jobsjob_idruns-on) in the workflow YAML. |  |
|**name** | **String** |  |  |
|**nodeId** | **String** |  |  |
|**runAttempt** | **Integer** |  |  |
|**runId** | **BigDecimal** |  |  |
|**runUrl** | **URI** |  |  |
|**runnerGroupId** | **Integer** | The ID of the runner group that is running this job. This will be &#x60;null&#x60; as long as &#x60;workflow_job[status]&#x60; is &#x60;queued&#x60;. |  |
|**runnerGroupName** | **String** | The name of the runner group that is running this job. This will be &#x60;null&#x60; as long as &#x60;workflow_job[status]&#x60; is &#x60;queued&#x60;. |  |
|**runnerId** | **Integer** | The ID of the runner that is running this job. This will be &#x60;null&#x60; as long as &#x60;workflow_job[status]&#x60; is &#x60;queued&#x60;. |  |
|**runnerName** | **String** | The name of the runner that is running this job. This will be &#x60;null&#x60; as long as &#x60;workflow_job[status]&#x60; is &#x60;queued&#x60;. |  |
|**startedAt** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the job. Can be &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;waiting&#x60;, or &#x60;completed&#x60;. |  |
|**headBranch** | **String** | The name of the current branch. |  |
|**workflowName** | **String** | The name of the workflow. |  |
|**steps** | [**List&lt;WorkflowStep&gt;**](WorkflowStep.md) |  |  |
|**url** | **URI** |  |  |



## Enum: ConclusionEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| FAILURE | &quot;failure&quot; |
| NULL | &quot;null&quot; |
| SKIPPED | &quot;skipped&quot; |
| CANCELLED | &quot;cancelled&quot; |
| ACTION_REQUIRED | &quot;action_required&quot; |
| NEUTRAL | &quot;neutral&quot; |
| TIMED_OUT | &quot;timed_out&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;queued&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |
| WAITING | &quot;waiting&quot; |



