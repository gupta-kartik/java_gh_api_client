

# WebhookIssueCommentCreatedIssueAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeLockReason** | **String** |  |  [optional] |
|**assignee** | [**User1**](User1.md) |  |  |
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
|**labels** | [**List&lt;Label&gt;**](Label.md) |  |  |
|**labelsUrl** | **String** |  |  [optional] |
|**locked** | **Boolean** |  |  |
|**milestone** | **Object** |  |  [optional] |
|**nodeId** | **String** |  |  [optional] |
|**number** | **Integer** |  |  [optional] |
|**performedViaGithubApp** | **Object** |  |  [optional] |
|**reactions** | [**WebhookDiscussionCreatedDiscussionAllOfReactions**](WebhookDiscussionCreatedDiscussionAllOfReactions.md) |  |  [optional] |
|**repositoryUrl** | **String** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | State of the issue; either &#39;open&#39; or &#39;closed&#39; |  |
|**timelineUrl** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |
|**url** | **String** |  |  [optional] |
|**user** | [**DeploymentWorkflowRunHeadRepositoryOwner**](DeploymentWorkflowRunHeadRepositoryOwner.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |



