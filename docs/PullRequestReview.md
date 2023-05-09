

# PullRequestReview

Pull Request Reviews are reviews on pull requests.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the review |  |
|**nodeId** | **String** |  |  |
|**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**body** | **String** | The text of the review. |  |
|**state** | **String** |  |  |
|**htmlUrl** | **URI** |  |  |
|**pullRequestUrl** | **URI** |  |  |
|**links** | [**TimelineReviewedEventLinks**](TimelineReviewedEventLinks.md) |  |  |
|**submittedAt** | **OffsetDateTime** |  |  [optional] |
|**commitId** | **String** | A commit SHA for the review. If the commit object was garbage collected or forcibly deleted, then it no longer exists in Git and this value will be &#x60;null&#x60;. |  |
|**bodyHtml** | **String** |  |  [optional] |
|**bodyText** | **String** |  |  [optional] |
|**authorAssociation** | **AuthorAssociation** |  |  |



