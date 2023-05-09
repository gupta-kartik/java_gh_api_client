

# TimelineIssueEvents

Timeline Event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**nodeId** | **String** |  |  |
|**url** | **String** |  |  |
|**actor** | [**SimpleUser**](SimpleUser.md) |  |  |
|**event** | **String** |  |  |
|**commitId** | **String** |  |  |
|**commitUrl** | **String** |  |  |
|**createdAt** | **String** |  |  |
|**performedViaGithubApp** | [**NullableIntegration**](NullableIntegration.md) |  |  |
|**label** | [**LabeledIssueEventLabel**](LabeledIssueEventLabel.md) |  |  |
|**milestone** | [**MilestonedIssueEventMilestone**](MilestonedIssueEventMilestone.md) |  |  |
|**rename** | [**RenamedIssueEventRename**](RenamedIssueEventRename.md) |  |  |
|**reviewRequester** | [**SimpleUser**](SimpleUser.md) |  |  |
|**requestedTeam** | [**Team**](Team.md) |  |  [optional] |
|**requestedReviewer** | [**SimpleUser**](SimpleUser.md) |  |  [optional] |
|**dismissedReview** | [**ReviewDismissedIssueEventDismissedReview**](ReviewDismissedIssueEventDismissedReview.md) |  |  |
|**lockReason** | **String** |  |  |
|**projectCard** | [**AddedToProjectIssueEventProjectCard**](AddedToProjectIssueEventProjectCard.md) |  |  [optional] |
|**body** | **String** | The text of the review. |  |
|**bodyText** | **String** |  |  [optional] |
|**bodyHtml** | **String** |  |  [optional] |
|**htmlUrl** | **URI** |  |  |
|**user** | [**SimpleUser**](SimpleUser.md) |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**issueUrl** | **URI** |  |  |
|**authorAssociation** | **AuthorAssociation** |  |  |
|**reactions** | [**ReactionRollup**](ReactionRollup.md) |  |  [optional] |
|**source** | [**TimelineCrossReferencedEventSource**](TimelineCrossReferencedEventSource.md) |  |  |
|**sha** | **String** | SHA for the commit |  |
|**author** | [**GitCommitAuthor**](GitCommitAuthor.md) |  |  |
|**committer** | [**GitCommitAuthor**](GitCommitAuthor.md) |  |  |
|**message** | **String** | Message describing the purpose of the commit |  |
|**tree** | [**GitCommitTree**](GitCommitTree.md) |  |  |
|**parents** | [**List&lt;GitCommitParentsInner&gt;**](GitCommitParentsInner.md) |  |  |
|**verification** | [**GitCommitVerification**](GitCommitVerification.md) |  |  |
|**state** | **String** |  |  |
|**pullRequestUrl** | **URI** |  |  |
|**links** | [**TimelineReviewedEventLinks**](TimelineReviewedEventLinks.md) |  |  |
|**submittedAt** | **OffsetDateTime** |  |  [optional] |
|**comments** | [**List&lt;CommitComment&gt;**](CommitComment.md) |  |  [optional] |
|**assignee** | [**SimpleUser**](SimpleUser.md) |  |  |
|**stateReason** | **String** |  |  [optional] |



