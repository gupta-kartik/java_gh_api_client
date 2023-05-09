

# WebhookIssueCommentCreatedIssue

The [issue](https://docs.github.com/rest/reference/issues) the comment belongs to.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeLockReason** | **String** |  |  |
|**assignee** | [**User1**](User1.md) |  |  |
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
|**labels** | [**List&lt;Label&gt;**](Label.md) |  |  |
|**labelsUrl** | **String** |  |  |
|**locked** | **Boolean** |  |  |
|**milestone** | **Object** |  |  |
|**nodeId** | **String** |  |  |
|**number** | **Integer** |  |  |
|**performedViaGithubApp** | **Object** |  |  [optional] |
|**pullRequest** | [**IssuePullRequest**](IssuePullRequest.md) |  |  [optional] |
|**reactions** | [**WebhookDiscussionCreatedDiscussionAllOfReactions**](WebhookDiscussionCreatedDiscussionAllOfReactions.md) |  |  |
|**repositoryUrl** | **String** |  |  |
|**state** | [**StateEnum**](#StateEnum) | State of the issue; either &#39;open&#39; or &#39;closed&#39; |  |
|**stateReason** | **String** |  |  [optional] |
|**timelineUrl** | **String** |  |  [optional] |
|**title** | **String** |  |  |
|**updatedAt** | **String** |  |  |
|**url** | **String** |  |  |
|**user** | [**DeploymentWorkflowRunHeadRepositoryOwner**](DeploymentWorkflowRunHeadRepositoryOwner.md) |  |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |



