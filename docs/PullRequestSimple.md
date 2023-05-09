

# PullRequestSimple

Pull Request Simple

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
|**number** | **Integer** |  |  |
|**state** | **String** |  |  |
|**locked** | **Boolean** |  |  |
|**title** | **String** |  |  |
|**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**body** | **String** |  |  |
|**labels** | [**List&lt;PullRequestSimpleLabelsInner&gt;**](PullRequestSimpleLabelsInner.md) |  |  |
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
|**requestedTeams** | [**List&lt;Team&gt;**](Team.md) |  |  [optional] |
|**head** | [**PullRequestSimpleHead**](PullRequestSimpleHead.md) |  |  |
|**base** | [**PullRequestSimpleHead**](PullRequestSimpleHead.md) |  |  |
|**links** | [**PullRequestSimpleLinks**](PullRequestSimpleLinks.md) |  |  |
|**authorAssociation** | **AuthorAssociation** |  |  |
|**autoMerge** | [**AutoMerge**](AutoMerge.md) |  |  |
|**draft** | **Boolean** | Indicates whether or not the pull request is a draft. |  [optional] |



