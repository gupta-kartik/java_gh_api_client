

# TimelineReviewedEvent

Timeline Reviewed Event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**event** | **String** |  |  |
|**id** | **Integer** | Unique identifier of the review |  |
|**nodeId** | **String** |  |  |
|**user** | [**SimpleUser**](SimpleUser.md) |  |  |
|**body** | **String** | The text of the review. |  |
|**state** | **String** |  |  |
|**htmlUrl** | **URI** |  |  |
|**pullRequestUrl** | **URI** |  |  |
|**links** | [**TimelineReviewedEventLinks**](TimelineReviewedEventLinks.md) |  |  |
|**submittedAt** | **OffsetDateTime** |  |  [optional] |
|**commitId** | **String** | A commit SHA for the review. |  |
|**bodyHtml** | **String** |  |  [optional] |
|**bodyText** | **String** |  |  [optional] |
|**authorAssociation** | **AuthorAssociation** |  |  |



