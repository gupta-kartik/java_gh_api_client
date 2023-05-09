

# WebhookPullRequestEditedPullRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** |  |  |
|**id** | **Integer** |  |  |
|**nodeId** | **String** |  |  |
|**htmlUrl** | **URI** |  |  |
|**diffUrl** | **URI** |  |  |
|**patchUrl** | **URI** |  |  |
|**issueUrl** | **URI** |  |  |
|**commitsUrl** | **URI** |  |  |
|**reviewCommentsUrl** | **URI** |  |  |
|**reviewCommentUrl** | **String** |  |  |
|**commentsUrl** | **URI** |  |  |
|**statusesUrl** | **URI** |  |  |
|**number** | **Integer** | Number uniquely identifying the pull request within its repository. |  |
|**state** | [**StateEnum**](#StateEnum) | State of this Pull Request. Either &#x60;open&#x60; or &#x60;closed&#x60;. |  |
|**locked** | **Boolean** |  |  |
|**title** | **String** | The title of the pull request. |  |
|**user** | [**SimpleUser**](SimpleUser.md) |  |  |
|**body** | **String** |  |  |
|**labels** | [**List&lt;PullRequestLabelsInner&gt;**](PullRequestLabelsInner.md) |  |  |
|**milestone** | [**NullableMilestone**](NullableMilestone.md) |  |  |
|**activeLockReason** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**closedAt** | **OffsetDateTime** |  |  |
|**mergedAt** | **OffsetDateTime** |  |  |
|**mergeCommitSha** | **String** |  |  |
|**assignee** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**assignees** | [**List&lt;SimpleUser&gt;**](SimpleUser.md) |  |  [optional] |
|**requestedReviewers** | [**List&lt;SimpleUser&gt;**](SimpleUser.md) |  |  [optional] |
|**requestedTeams** | [**List&lt;TeamSimple&gt;**](TeamSimple.md) |  |  [optional] |
|**head** | [**PullRequestHead**](PullRequestHead.md) |  |  |
|**base** | [**PullRequestBase**](PullRequestBase.md) |  |  |
|**links** | [**PullRequestSimpleLinks**](PullRequestSimpleLinks.md) |  |  |
|**authorAssociation** | **AuthorAssociation** |  |  |
|**autoMerge** | [**AutoMerge**](AutoMerge.md) |  |  |
|**draft** | **Boolean** | Indicates whether or not the pull request is a draft. |  [optional] |
|**merged** | **Boolean** |  |  |
|**mergeable** | **Boolean** |  |  |
|**rebaseable** | **Boolean** |  |  [optional] |
|**mergeableState** | **String** |  |  |
|**mergedBy** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**comments** | **Integer** |  |  |
|**reviewComments** | **Integer** |  |  |
|**maintainerCanModify** | **Boolean** | Indicates whether maintainers can modify the pull request. |  |
|**commits** | **Integer** |  |  |
|**additions** | **Integer** |  |  |
|**deletions** | **Integer** |  |  |
|**changedFiles** | **Integer** |  |  |
|**allowAutoMerge** | **Boolean** | Whether to allow auto-merge for pull requests. |  [optional] |
|**allowUpdateBranch** | **Boolean** | Whether to allow updating the pull request&#39;s branch. |  [optional] |
|**deleteBranchOnMerge** | **Boolean** | Whether to delete head branches when pull requests are merged. |  [optional] |
|**mergeCommitMessage** | [**MergeCommitMessageEnum**](#MergeCommitMessageEnum) | The default value for a merge commit message. - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional] |
|**mergeCommitTitle** | [**MergeCommitTitleEnum**](#MergeCommitTitleEnum) | The default value for a merge commit title. - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;MERGE_MESSAGE&#x60; - default to the classic title for a merge message (e.g., \&quot;Merge pull request #123 from branch-name\&quot;). |  [optional] |
|**squashMergeCommitMessage** | [**SquashMergeCommitMessageEnum**](#SquashMergeCommitMessageEnum) | The default value for a squash merge commit message: - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;COMMIT_MESSAGES&#x60; - default to the branch&#39;s commit messages. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional] |
|**squashMergeCommitTitle** | [**SquashMergeCommitTitleEnum**](#SquashMergeCommitTitleEnum) | The default value for a squash merge commit title: - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;COMMIT_OR_PR_TITLE&#x60; - default to the commit&#39;s title (if only one commit) or the pull request&#39;s title (when more than one commit). |  [optional] |
|**useSquashPrTitleAsDefault** | **Boolean** | Whether a squash merge commit can use the pull request title as default. **This property has been deprecated. Please use &#x60;squash_merge_commit_title&#x60; instead. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |



## Enum: MergeCommitMessageEnum

| Name | Value |
|---- | -----|
| PR_BODY | &quot;PR_BODY&quot; |
| PR_TITLE | &quot;PR_TITLE&quot; |
| BLANK | &quot;BLANK&quot; |



## Enum: MergeCommitTitleEnum

| Name | Value |
|---- | -----|
| PR_TITLE | &quot;PR_TITLE&quot; |
| MERGE_MESSAGE | &quot;MERGE_MESSAGE&quot; |



## Enum: SquashMergeCommitMessageEnum

| Name | Value |
|---- | -----|
| PR_BODY | &quot;PR_BODY&quot; |
| COMMIT_MESSAGES | &quot;COMMIT_MESSAGES&quot; |
| BLANK | &quot;BLANK&quot; |



## Enum: SquashMergeCommitTitleEnum

| Name | Value |
|---- | -----|
| PR_TITLE | &quot;PR_TITLE&quot; |
| COMMIT_OR_PR_TITLE | &quot;COMMIT_OR_PR_TITLE&quot; |



