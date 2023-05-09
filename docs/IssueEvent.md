

# IssueEvent

Issue Event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  |
|**nodeId** | **String** |  |  |
|**url** | **URI** |  |  |
|**actor** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**event** | **String** |  |  |
|**commitId** | **String** |  |  |
|**commitUrl** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**issue** | [**NullableIssue**](NullableIssue.md) |  |  [optional] |
|**label** | [**IssueEventLabel**](IssueEventLabel.md) |  |  [optional] |
|**assignee** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  [optional] |
|**assigner** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  [optional] |
|**reviewRequester** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  [optional] |
|**requestedReviewer** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  [optional] |
|**requestedTeam** | [**Team**](Team.md) |  |  [optional] |
|**dismissedReview** | [**IssueEventDismissedReview**](IssueEventDismissedReview.md) |  |  [optional] |
|**milestone** | [**IssueEventMilestone**](IssueEventMilestone.md) |  |  [optional] |
|**projectCard** | [**IssueEventProjectCard**](IssueEventProjectCard.md) |  |  [optional] |
|**rename** | [**IssueEventRename**](IssueEventRename.md) |  |  [optional] |
|**authorAssociation** | **AuthorAssociation** |  |  [optional] |
|**lockReason** | **String** |  |  [optional] |
|**performedViaGithubApp** | [**NullableIntegration**](NullableIntegration.md) |  |  [optional] |



