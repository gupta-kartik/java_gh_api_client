

# NullableIssue

Issues are a great way to keep track of tasks, enhancements, and bugs for your projects.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  |
|**nodeId** | **String** |  |  |
|**url** | **URI** | URL for the issue |  |
|**repositoryUrl** | **URI** |  |  |
|**labelsUrl** | **String** |  |  |
|**commentsUrl** | **URI** |  |  |
|**eventsUrl** | **URI** |  |  |
|**htmlUrl** | **URI** |  |  |
|**number** | **Integer** | Number uniquely identifying the issue within its repository |  |
|**state** | **String** | State of the issue; either &#39;open&#39; or &#39;closed&#39; |  |
|**stateReason** | [**StateReasonEnum**](#StateReasonEnum) | The reason for the current state |  [optional] |
|**title** | **String** | Title of the issue |  |
|**body** | **String** | Contents of the issue |  [optional] |
|**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**labels** | [**List&lt;IssueLabelsInner&gt;**](IssueLabelsInner.md) | Labels to associate with this issue; pass one or more label names to replace the set of labels on this issue; send an empty array to clear all labels from the issue; note that the labels are silently dropped for users without push access to the repository |  |
|**assignee** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**assignees** | [**List&lt;SimpleUser&gt;**](SimpleUser.md) |  |  [optional] |
|**milestone** | [**NullableMilestone**](NullableMilestone.md) |  |  |
|**locked** | **Boolean** |  |  |
|**activeLockReason** | **String** |  |  [optional] |
|**comments** | **Integer** |  |  |
|**pullRequest** | [**IssuePullRequest**](IssuePullRequest.md) |  |  [optional] |
|**closedAt** | **OffsetDateTime** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**draft** | **Boolean** |  |  [optional] |
|**closedBy** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  [optional] |
|**bodyHtml** | **String** |  |  [optional] |
|**bodyText** | **String** |  |  [optional] |
|**timelineUrl** | **URI** |  |  [optional] |
|**repository** | [**Repository**](Repository.md) |  |  [optional] |
|**performedViaGithubApp** | [**NullableIntegration**](NullableIntegration.md) |  |  [optional] |
|**authorAssociation** | **AuthorAssociation** |  |  |
|**reactions** | [**ReactionRollup**](ReactionRollup.md) |  |  [optional] |



## Enum: StateReasonEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;completed&quot; |
| REOPENED | &quot;reopened&quot; |
| NOT_PLANNED | &quot;not_planned&quot; |



