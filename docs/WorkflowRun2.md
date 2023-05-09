

# WorkflowRun2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actor** | [**User**](User.md) |  |  |
|**artifactsUrl** | **URI** |  |  |
|**cancelUrl** | **URI** |  |  |
|**checkSuiteId** | **Integer** |  |  |
|**checkSuiteNodeId** | **String** |  |  |
|**checkSuiteUrl** | **URI** |  |  |
|**conclusion** | [**ConclusionEnum**](#ConclusionEnum) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**event** | **String** |  |  |
|**headBranch** | **String** |  |  |
|**headCommit** | [**SimpleCommit**](SimpleCommit.md) |  |  |
|**headRepository** | [**RepositoryLite**](RepositoryLite.md) |  |  |
|**headSha** | **String** |  |  |
|**htmlUrl** | **URI** |  |  |
|**id** | **Integer** |  |  |
|**jobsUrl** | **URI** |  |  |
|**logsUrl** | **URI** |  |  |
|**name** | **String** |  |  |
|**nodeId** | **String** |  |  |
|**path** | **String** |  |  |
|**previousAttemptUrl** | **URI** |  |  |
|**pullRequests** | [**List&lt;WorkflowRunPullRequestsInner&gt;**](WorkflowRunPullRequestsInner.md) |  |  |
|**referencedWorkflows** | [**List&lt;DeploymentWorkflowRunReferencedWorkflowsInner&gt;**](DeploymentWorkflowRunReferencedWorkflowsInner.md) |  |  [optional] |
|**repository** | [**RepositoryLite**](RepositoryLite.md) |  |  |
|**rerunUrl** | **URI** |  |  |
|**runAttempt** | **Integer** |  |  |
|**runNumber** | **Integer** |  |  |
|**runStartedAt** | **OffsetDateTime** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**triggeringActor** | [**User**](User.md) |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**url** | **URI** |  |  |
|**workflowId** | **Integer** |  |  |
|**workflowUrl** | **URI** |  |  |
|**displayTitle** | **String** |  |  |



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
| SKIPPED | &quot;skipped&quot; |
| STARTUP_FAILURE | &quot;startup_failure&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| REQUESTED | &quot;requested&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |
| QUEUED | &quot;queued&quot; |
| PENDING | &quot;pending&quot; |
| WAITING | &quot;waiting&quot; |



