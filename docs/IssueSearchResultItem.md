

# IssueSearchResultItem

Issue Search Result Item

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** |  |  |
|**repositoryUrl** | **URI** |  |  |
|**labelsUrl** | **String** |  |  |
|**commentsUrl** | **URI** |  |  |
|**eventsUrl** | **URI** |  |  |
|**htmlUrl** | **URI** |  |  |
|**id** | **Long** |  |  |
|**nodeId** | **String** |  |  |
|**number** | **Integer** |  |  |
|**title** | **String** |  |  |
|**locked** | **Boolean** |  |  |
|**activeLockReason** | **String** |  |  [optional] |
|**assignees** | [**List&lt;SimpleUser&gt;**](SimpleUser.md) |  |  [optional] |
|**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**labels** | [**List&lt;IssueSearchResultItemLabelsInner&gt;**](IssueSearchResultItemLabelsInner.md) |  |  |
|**state** | **String** |  |  |
|**stateReason** | **String** |  |  [optional] |
|**assignee** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**milestone** | [**NullableMilestone**](NullableMilestone.md) |  |  |
|**comments** | **Integer** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**closedAt** | **OffsetDateTime** |  |  |
|**textMatches** | [**List&lt;SearchResultTextMatchesInner&gt;**](SearchResultTextMatchesInner.md) |  |  [optional] |
|**pullRequest** | [**IssuePullRequest**](IssuePullRequest.md) |  |  [optional] |
|**body** | **String** |  |  [optional] |
|**score** | **BigDecimal** |  |  |
|**authorAssociation** | **AuthorAssociation** |  |  |
|**draft** | **Boolean** |  |  [optional] |
|**repository** | [**Repository**](Repository.md) |  |  [optional] |
|**bodyHtml** | **String** |  |  [optional] |
|**bodyText** | **String** |  |  [optional] |
|**timelineUrl** | **URI** |  |  [optional] |
|**performedViaGithubApp** | [**NullableIntegration**](NullableIntegration.md) |  |  [optional] |
|**reactions** | [**ReactionRollup**](ReactionRollup.md) |  |  [optional] |



