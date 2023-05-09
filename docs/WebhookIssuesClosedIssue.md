

# WebhookIssuesClosedIssue

The [issue](https://docs.github.com/rest/reference/issues) itself.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeLockReason** | **String** |  |  |
|**assignee** | **Object** |  |  [optional] |
|**assignees** | **List&lt;Object&gt;** |  |  |
|**authorAssociation** | **String** |  |  |
|**body** | **String** |  |  |
|**closedAt** | **String** |  |  |
|**comments** | **Integer** |  |  |
|**commentsUrl** | **String** |  |  |
|**createdAt** | **String** |  |  |
|**draft** | **Boolean** |  |  [optional] |
|**eventsUrl** | **String** |  |  |
|**htmlUrl** | **String** |  |  |
|**id** | **Integer** |  |  |
|**labels** | **List&lt;Object&gt;** |  |  [optional] |
|**labelsUrl** | **String** |  |  |
|**locked** | **Boolean** |  |  [optional] |
|**milestone** | **Object** |  |  |
|**nodeId** | **String** |  |  |
|**number** | **Integer** |  |  |
|**performedViaGithubApp** | **Object** |  |  [optional] |
|**pullRequest** | [**IssuePullRequest**](IssuePullRequest.md) |  |  [optional] |
|**reactions** | [**WebhookDiscussionCreatedDiscussionAllOfReactions**](WebhookDiscussionCreatedDiscussionAllOfReactions.md) |  |  |
|**repositoryUrl** | **String** |  |  |
|**state** | [**StateEnum**](#StateEnum) |  |  |
|**stateReason** | **String** |  |  [optional] |
|**timelineUrl** | **String** |  |  [optional] |
|**title** | **String** |  |  |
|**updatedAt** | **String** |  |  |
|**url** | **String** |  |  |
|**user** | [**DeploymentWorkflowRunHeadRepositoryOwner**](DeploymentWorkflowRunHeadRepositoryOwner.md) |  |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| CLOSED | &quot;closed&quot; |
| OPEN | &quot;open&quot; |



