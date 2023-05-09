

# WebhookIssuesLockedIssueAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeLockReason** | [**ActiveLockReasonEnum**](#ActiveLockReasonEnum) |  |  |
|**assignee** | **Object** |  |  [optional] |
|**assignees** | **List&lt;Object&gt;** |  |  [optional] |
|**authorAssociation** | **String** |  |  [optional] |
|**body** | **String** |  |  [optional] |
|**closedAt** | **String** |  |  [optional] |
|**comments** | **Integer** |  |  [optional] |
|**commentsUrl** | **String** |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**eventsUrl** | **String** |  |  [optional] |
|**htmlUrl** | **String** |  |  [optional] |
|**id** | **Integer** |  |  [optional] |
|**labels** | **List&lt;Object&gt;** |  |  [optional] |
|**labelsUrl** | **String** |  |  [optional] |
|**locked** | [**LockedEnum**](#LockedEnum) |  |  |
|**milestone** | **Object** |  |  [optional] |
|**nodeId** | **String** |  |  [optional] |
|**number** | **Integer** |  |  [optional] |
|**performedViaGithubApp** | **Object** |  |  [optional] |
|**reactions** | [**WebhookDiscussionCreatedDiscussionAllOfReactions**](WebhookDiscussionCreatedDiscussionAllOfReactions.md) |  |  [optional] |
|**repositoryUrl** | **String** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**timelineUrl** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |
|**url** | **String** |  |  [optional] |
|**user** | [**DeploymentWorkflowRunHeadRepositoryOwner**](DeploymentWorkflowRunHeadRepositoryOwner.md) |  |  [optional] |



## Enum: ActiveLockReasonEnum

| Name | Value |
|---- | -----|
| RESOLVED | &quot;resolved&quot; |
| OFF_TOPIC | &quot;off-topic&quot; |
| TOO_HEATED | &quot;too heated&quot; |
| SPAM | &quot;spam&quot; |
| NULL | &quot;null&quot; |



## Enum: LockedEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |



