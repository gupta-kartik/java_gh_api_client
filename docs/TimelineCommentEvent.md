

# TimelineCommentEvent

Timeline Comment Event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**event** | **String** |  |  |
|**actor** | [**SimpleUser**](SimpleUser.md) |  |  |
|**id** | **Integer** | Unique identifier of the issue comment |  |
|**nodeId** | **String** |  |  |
|**url** | **URI** | URL for the issue comment |  |
|**body** | **String** | Contents of the issue comment |  [optional] |
|**bodyText** | **String** |  |  [optional] |
|**bodyHtml** | **String** |  |  [optional] |
|**htmlUrl** | **URI** |  |  |
|**user** | [**SimpleUser**](SimpleUser.md) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**issueUrl** | **URI** |  |  |
|**authorAssociation** | **AuthorAssociation** |  |  |
|**performedViaGithubApp** | [**NullableIntegration**](NullableIntegration.md) |  |  [optional] |
|**reactions** | [**ReactionRollup**](ReactionRollup.md) |  |  [optional] |



