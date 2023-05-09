

# TeamDiscussionComment

A reply to a discussion within a team.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**author** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**body** | **String** | The main text of the comment. |  |
|**bodyHtml** | **String** |  |  |
|**bodyVersion** | **String** | The current version of the body content. If provided, this update operation will be rejected if the given version does not match the latest version on the server. |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**lastEditedAt** | **OffsetDateTime** |  |  |
|**discussionUrl** | **URI** |  |  |
|**htmlUrl** | **URI** |  |  |
|**nodeId** | **String** |  |  |
|**number** | **Integer** | The unique sequence number of a team discussion comment. |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**url** | **URI** |  |  |
|**reactions** | [**ReactionRollup**](ReactionRollup.md) |  |  [optional] |



