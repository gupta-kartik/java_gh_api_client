

# WebhookWorkflowRunInProgressWorkflowRunAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actor** | [**DeploymentWorkflowRunHeadRepositoryOwner**](DeploymentWorkflowRunHeadRepositoryOwner.md) |  |  [optional] |
|**artifactsUrl** | **String** |  |  [optional] |
|**cancelUrl** | **String** |  |  [optional] |
|**checkSuiteId** | **Integer** |  |  [optional] |
|**checkSuiteNodeId** | **String** |  |  [optional] |
|**checkSuiteUrl** | **String** |  |  [optional] |
|**conclusion** | [**ConclusionEnum**](#ConclusionEnum) |  |  |
|**createdAt** | **String** |  |  [optional] |
|**event** | **String** |  |  [optional] |
|**headBranch** | **String** |  |  [optional] |
|**headCommit** | [**WebhookWorkflowRunCompletedWorkflowRunAllOfHeadCommit**](WebhookWorkflowRunCompletedWorkflowRunAllOfHeadCommit.md) |  |  [optional] |
|**headRepository** | [**WebhookWorkflowRunInProgressWorkflowRunAllOfHeadRepository**](WebhookWorkflowRunInProgressWorkflowRunAllOfHeadRepository.md) |  |  [optional] |
|**headSha** | **String** |  |  [optional] |
|**htmlUrl** | **String** |  |  [optional] |
|**id** | **Integer** |  |  [optional] |
|**jobsUrl** | **String** |  |  [optional] |
|**logsUrl** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**nodeId** | **String** |  |  [optional] |
|**path** | **String** |  |  [optional] |
|**previousAttemptUrl** | **String** |  |  [optional] |
|**pullRequests** | **List&lt;Object&gt;** |  |  [optional] |
|**referencedWorkflows** | [**List&lt;DeploymentWorkflowRunReferencedWorkflowsInner&gt;**](DeploymentWorkflowRunReferencedWorkflowsInner.md) |  |  [optional] |
|**repository** | [**WebhookWorkflowRunCompletedWorkflowRunAllOfHeadRepository**](WebhookWorkflowRunCompletedWorkflowRunAllOfHeadRepository.md) |  |  [optional] |
|**rerunUrl** | **String** |  |  [optional] |
|**runAttempt** | **Integer** |  |  [optional] |
|**runNumber** | **Integer** |  |  [optional] |
|**runStartedAt** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**triggeringActor** | [**DeploymentWorkflowRunHeadRepositoryOwner**](DeploymentWorkflowRunHeadRepositoryOwner.md) |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |
|**url** | **String** |  |  [optional] |
|**workflowId** | **Integer** |  |  [optional] |
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
| SKIPPED | &quot;skipped&quot; |
| STALE | &quot;stale&quot; |



