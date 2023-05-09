

# WebhookPullRequestReviewCommentEditedPullRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**PullRequestLinks**](PullRequestLinks.md) |  |  |
|**activeLockReason** | [**ActiveLockReasonEnum**](#ActiveLockReasonEnum) |  |  |
|**assignee** | [**User**](User.md) |  |  |
|**assignees** | [**List&lt;User&gt;**](User.md) |  |  |
|**authorAssociation** | [**AuthorAssociationEnum**](#AuthorAssociationEnum) | How the author is associated with the repository. |  |
|**autoMerge** | [**PullRequestAutoMerge**](PullRequestAutoMerge.md) |  |  [optional] |
|**base** | [**PullRequestBase**](PullRequestBase.md) |  |  |
|**body** | **String** |  |  |
|**closedAt** | **String** |  |  |
|**commentsUrl** | **URI** |  |  |
|**commitsUrl** | **URI** |  |  |
|**createdAt** | **String** |  |  |
|**diffUrl** | **URI** |  |  |
|**draft** | **Boolean** |  |  [optional] |
|**head** | [**WebhookPullRequestReviewCommentDeletedPullRequestHead**](WebhookPullRequestReviewCommentDeletedPullRequestHead.md) |  |  |
|**htmlUrl** | **URI** |  |  |
|**id** | **Integer** |  |  |
|**issueUrl** | **URI** |  |  |
|**labels** | [**List&lt;Label&gt;**](Label.md) |  |  |
|**locked** | **Boolean** |  |  |
|**mergeCommitSha** | **String** |  |  |
|**mergedAt** | **String** |  |  |
|**milestone** | [**Milestone**](Milestone.md) |  |  |
|**nodeId** | **String** |  |  |
|**number** | **Integer** |  |  |
|**patchUrl** | **URI** |  |  |
|**requestedReviewers** | [**List&lt;PullRequest3RequestedReviewersInner&gt;**](PullRequest3RequestedReviewersInner.md) |  |  |
|**requestedTeams** | [**List&lt;Team2&gt;**](Team2.md) |  |  |
|**reviewCommentUrl** | **String** |  |  |
|**reviewCommentsUrl** | **URI** |  |  |
|**state** | [**StateEnum**](#StateEnum) |  |  |
|**statusesUrl** | **URI** |  |  |
|**title** | **String** |  |  |
|**updatedAt** | **String** |  |  |
|**url** | **URI** |  |  |
|**user** | [**User1**](User1.md) |  |  |



## Enum: ActiveLockReasonEnum

| Name | Value |
|---- | -----|
| RESOLVED | &quot;resolved&quot; |
| OFF_TOPIC | &quot;off-topic&quot; |
| TOO_HEATED | &quot;too heated&quot; |
| SPAM | &quot;spam&quot; |
| NULL | &quot;null&quot; |



## Enum: AuthorAssociationEnum

| Name | Value |
|---- | -----|
| COLLABORATOR | &quot;COLLABORATOR&quot; |
| CONTRIBUTOR | &quot;CONTRIBUTOR&quot; |
| FIRST_TIMER | &quot;FIRST_TIMER&quot; |
| FIRST_TIME_CONTRIBUTOR | &quot;FIRST_TIME_CONTRIBUTOR&quot; |
| MANNEQUIN | &quot;MANNEQUIN&quot; |
| MEMBER | &quot;MEMBER&quot; |
| NONE | &quot;NONE&quot; |
| OWNER | &quot;OWNER&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |



