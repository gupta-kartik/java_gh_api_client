

# PullRequest10


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**PullRequestLinks**](PullRequestLinks.md) |  |  |
|**activeLockReason** | [**ActiveLockReasonEnum**](#ActiveLockReasonEnum) |  |  |
|**additions** | **Integer** |  |  [optional] |
|**assignee** | [**User1**](User1.md) |  |  |
|**assignees** | [**List&lt;User1&gt;**](User1.md) |  |  |
|**authorAssociation** | [**AuthorAssociationEnum**](#AuthorAssociationEnum) | How the author is associated with the repository. |  |
|**autoMerge** | [**PullRequestAutoMerge**](PullRequestAutoMerge.md) |  |  |
|**base** | [**PullRequestBase**](PullRequestBase.md) |  |  |
|**body** | **String** |  |  |
|**changedFiles** | **Integer** |  |  [optional] |
|**closedAt** | **OffsetDateTime** |  |  |
|**comments** | **Integer** |  |  [optional] |
|**commentsUrl** | **URI** |  |  |
|**commits** | **Integer** |  |  [optional] |
|**commitsUrl** | **URI** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**deletions** | **Integer** |  |  [optional] |
|**diffUrl** | **URI** |  |  |
|**draft** | **Boolean** | Indicates whether or not the pull request is a draft. |  |
|**head** | [**PullRequestBase**](PullRequestBase.md) |  |  |
|**htmlUrl** | **URI** |  |  |
|**id** | **Integer** |  |  |
|**issueUrl** | **URI** |  |  |
|**labels** | [**List&lt;Label&gt;**](Label.md) |  |  |
|**locked** | **Boolean** |  |  |
|**maintainerCanModify** | **Boolean** | Indicates whether maintainers can modify the pull request. |  [optional] |
|**mergeCommitSha** | **String** |  |  |
|**mergeable** | **Boolean** |  |  [optional] |
|**mergeableState** | **String** |  |  [optional] |
|**merged** | **Boolean** |  |  [optional] |
|**mergedAt** | **OffsetDateTime** |  |  |
|**mergedBy** | [**User**](User.md) |  |  [optional] |
|**milestone** | [**Milestone**](Milestone.md) |  |  |
|**nodeId** | **String** |  |  |
|**number** | **Integer** | Number uniquely identifying the pull request within its repository. |  |
|**patchUrl** | **URI** |  |  |
|**rebaseable** | **Boolean** |  |  [optional] |
|**requestedReviewers** | [**List&lt;PullRequest3RequestedReviewersInner&gt;**](PullRequest3RequestedReviewersInner.md) |  |  |
|**requestedTeams** | [**List&lt;Team2&gt;**](Team2.md) |  |  |
|**reviewCommentUrl** | **String** |  |  |
|**reviewComments** | **Integer** |  |  [optional] |
|**reviewCommentsUrl** | **URI** |  |  |
|**state** | [**StateEnum**](#StateEnum) | State of this Pull Request. Either &#x60;open&#x60; or &#x60;closed&#x60;. |  |
|**statusesUrl** | **URI** |  |  |
|**title** | **String** | The title of the pull request. |  |
|**updatedAt** | **OffsetDateTime** |  |  |
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



