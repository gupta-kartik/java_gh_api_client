

# ReviewComment

Legacy Review Comment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** |  |  |
|**pullRequestReviewId** | **Integer** |  |  |
|**id** | **Integer** |  |  |
|**nodeId** | **String** |  |  |
|**diffHunk** | **String** |  |  |
|**path** | **String** |  |  |
|**position** | **Integer** |  |  |
|**originalPosition** | **Integer** |  |  |
|**commitId** | **String** |  |  |
|**originalCommitId** | **String** |  |  |
|**inReplyToId** | **Integer** |  |  [optional] |
|**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**body** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**htmlUrl** | **URI** |  |  |
|**pullRequestUrl** | **URI** |  |  |
|**authorAssociation** | **AuthorAssociation** |  |  |
|**links** | [**ReviewCommentLinks**](ReviewCommentLinks.md) |  |  |
|**bodyText** | **String** |  |  [optional] |
|**bodyHtml** | **String** |  |  [optional] |
|**reactions** | [**ReactionRollup**](ReactionRollup.md) |  |  [optional] |
|**side** | [**SideEnum**](#SideEnum) | The side of the first line of the range for a multi-line comment. |  [optional] |
|**startSide** | [**StartSideEnum**](#StartSideEnum) | The side of the first line of the range for a multi-line comment. |  [optional] |
|**line** | **Integer** | The line of the blob to which the comment applies. The last line of the range for a multi-line comment |  [optional] |
|**originalLine** | **Integer** | The original line of the blob to which the comment applies. The last line of the range for a multi-line comment |  [optional] |
|**startLine** | **Integer** | The first line of the range for a multi-line comment. |  [optional] |
|**originalStartLine** | **Integer** | The original first line of the range for a multi-line comment. |  [optional] |



## Enum: SideEnum

| Name | Value |
|---- | -----|
| LEFT | &quot;LEFT&quot; |
| RIGHT | &quot;RIGHT&quot; |



## Enum: StartSideEnum

| Name | Value |
|---- | -----|
| LEFT | &quot;LEFT&quot; |
| RIGHT | &quot;RIGHT&quot; |



