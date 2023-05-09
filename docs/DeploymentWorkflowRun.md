

# DeploymentWorkflowRun


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actor** | [**User**](User.md) |  |  |
|**artifactsUrl** | **String** |  |  [optional] |
|**cancelUrl** | **String** |  |  [optional] |
|**checkSuiteId** | **Integer** |  |  |
|**checkSuiteNodeId** | **String** |  |  |
|**checkSuiteUrl** | **String** |  |  [optional] |
|**conclusion** | [**ConclusionEnum**](#ConclusionEnum) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**displayTitle** | **String** |  |  |
|**event** | **String** |  |  |
|**headBranch** | **String** |  |  |
|**headCommit** | **Object** |  |  [optional] |
|**headRepository** | [**DeploymentWorkflowRunHeadRepository**](DeploymentWorkflowRunHeadRepository.md) |  |  [optional] |
|**headSha** | **String** |  |  |
|**htmlUrl** | **URI** |  |  |
|**id** | **Integer** |  |  |
|**jobsUrl** | **String** |  |  [optional] |
|**logsUrl** | **String** |  |  [optional] |
|**name** | **String** |  |  |
|**nodeId** | **String** |  |  |
|**path** | **String** |  |  |
|**previousAttemptUrl** | **Object** |  |  [optional] |
|**pullRequests** | [**List&lt;CheckRunPullRequest&gt;**](CheckRunPullRequest.md) |  |  |
|**referencedWorkflows** | [**List&lt;DeploymentWorkflowRunReferencedWorkflowsInner&gt;**](DeploymentWorkflowRunReferencedWorkflowsInner.md) |  |  [optional] |
|**repository** | [**DeploymentWorkflowRunHeadRepository**](DeploymentWorkflowRunHeadRepository.md) |  |  [optional] |
|**rerunUrl** | **String** |  |  [optional] |
|**runAttempt** | **Integer** |  |  |
|**runNumber** | **Integer** |  |  |
|**runStartedAt** | **OffsetDateTime** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**triggeringActor** | [**User**](User.md) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  |
|**url** | **URI** |  |  |
|**workflowId** | **Integer** |  |  |
|**workflowUrl** | **String** |  |  [optional] |



## Enum: ConclusionEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| FAILURE | &quot;failure&quot; |
| NEUTRAL | &quot;neutral&quot; |
| CANCELLED | &quot;cancelled&quot; |
| TIMED_OUT | &quot;timed_out&quot; |
| ACTION_REQUIRED | &quot;action_required&quot; |
| STALE | &quot;stale&quot; |
| NULL | &quot;null&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| REQUESTED | &quot;requested&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |
| QUEUED | &quot;queued&quot; |
| WAITING | &quot;waiting&quot; |
| PENDING | &quot;pending&quot; |



