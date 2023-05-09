

# WebhookWorkflowRunCompletedWorkflowRun


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actor** | [**DeploymentWorkflowRunHeadRepositoryOwner**](DeploymentWorkflowRunHeadRepositoryOwner.md) |  |  |
|**artifactsUrl** | **String** |  |  |
|**cancelUrl** | **String** |  |  |
|**checkSuiteId** | **Integer** |  |  |
|**checkSuiteNodeId** | **String** |  |  |
|**checkSuiteUrl** | **String** |  |  |
|**conclusion** | [**ConclusionEnum**](#ConclusionEnum) |  |  |
|**createdAt** | **String** |  |  |
|**event** | **String** |  |  |
|**headBranch** | **String** |  |  |
|**headCommit** | [**WebhookWorkflowRunCompletedWorkflowRunAllOfHeadCommit**](WebhookWorkflowRunCompletedWorkflowRunAllOfHeadCommit.md) |  |  |
|**headRepository** | [**WebhookWorkflowRunCompletedWorkflowRunAllOfHeadRepository**](WebhookWorkflowRunCompletedWorkflowRunAllOfHeadRepository.md) |  |  |
|**headSha** | **String** |  |  |
|**htmlUrl** | **String** |  |  |
|**id** | **Integer** |  |  |
|**jobsUrl** | **String** |  |  |
|**logsUrl** | **String** |  |  |
|**name** | **String** |  |  |
|**nodeId** | **String** |  |  |
|**path** | **String** |  |  |
|**previousAttemptUrl** | **String** |  |  |
|**pullRequests** | **List&lt;Object&gt;** |  |  |
|**referencedWorkflows** | [**List&lt;DeploymentWorkflowRunReferencedWorkflowsInner&gt;**](DeploymentWorkflowRunReferencedWorkflowsInner.md) |  |  [optional] |
|**repository** | [**WebhookWorkflowRunCompletedWorkflowRunAllOfHeadRepository**](WebhookWorkflowRunCompletedWorkflowRunAllOfHeadRepository.md) |  |  |
|**rerunUrl** | **String** |  |  |
|**runAttempt** | **Integer** |  |  |
|**runNumber** | **Integer** |  |  |
|**runStartedAt** | **String** |  |  |
|**status** | **String** |  |  |
|**triggeringActor** | [**WebhookProjectCardMovedProjectCardAllOfCreator**](WebhookProjectCardMovedProjectCardAllOfCreator.md) |  |  |
|**updatedAt** | **String** |  |  |
|**url** | **String** |  |  |
|**workflowId** | **Integer** |  |  |
|**workflowUrl** | **String** |  |  |



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
| SKIPPED | &quot;skipped&quot; |



