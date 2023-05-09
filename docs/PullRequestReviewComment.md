

# PullRequestReviewComment

The [comment](https://docs.github.com/rest/reference/pulls#comments) itself.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**PullRequestReviewCommentLinks**](PullRequestReviewCommentLinks.md) |  |  |
|**authorAssociation** | [**AuthorAssociationEnum**](#AuthorAssociationEnum) | How the author is associated with the repository. |  |
|**body** | **String** | The text of the comment. |  |
|**commitId** | **String** | The SHA of the commit to which the comment applies. |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**diffHunk** | **String** | The diff of the line that the comment refers to. |  |
|**htmlUrl** | **URI** | HTML URL for the pull request review comment. |  |
|**id** | **Integer** | The ID of the pull request review comment. |  |
|**inReplyToId** | **Integer** | The comment ID to reply to. |  [optional] |
|**line** | **Integer** | The line of the blob to which the comment applies. The last line of the range for a multi-line comment |  |
|**nodeId** | **String** | The node ID of the pull request review comment. |  |
|**originalCommitId** | **String** | The SHA of the original commit to which the comment applies. |  |
|**originalLine** | **Integer** | The line of the blob to which the comment applies. The last line of the range for a multi-line comment |  |
|**originalPosition** | **Integer** | The index of the original line in the diff to which the comment applies. |  |
|**originalStartLine** | **Integer** | The first line of the range for a multi-line comment. |  |
|**path** | **String** | The relative path of the file to which the comment applies. |  |
|**position** | **Integer** | The line index in the diff to which the comment applies. |  |
|**pullRequestReviewId** | **Integer** | The ID of the pull request review to which the comment belongs. |  |
|**pullRequestUrl** | **URI** | URL for the pull request that the review comment belongs to. |  |
|**reactions** | [**Reactions**](Reactions.md) |  |  |
|**side** | [**SideEnum**](#SideEnum) | The side of the first line of the range for a multi-line comment. |  |
|**startLine** | **Integer** | The first line of the range for a multi-line comment. |  |
|**startSide** | [**StartSideEnum**](#StartSideEnum) | The side of the first line of the range for a multi-line comment. |  |
|**subjectType** | [**SubjectTypeEnum**](#SubjectTypeEnum) | The level at which the comment is targeted, can be a diff line or a file. |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  |
|**url** | **URI** | URL for the pull request review comment |  |
|**user** | [**User**](User.md) |  |  |



## Enum: AuthorAssociationEnum

| Name | Value |
|---- | -----|
| COLLABORATOR | &quot;COLLABORATOR&quot; |
| CONTRIBUTOR | &quot;CONTRIBUTOR&quot; |
| FIRST_TIMER | &quot;FIRST_TIMER&quot; |
| FIRST_TIME_CONTRIBUTOR | &quot;FIRST_TIME_CONTRIBUTOR&quot; |
| MANNEQUIN | &quot;MANNEQUIN&quot; |
| MEMBER | &quot;MEMBER&quot; |
| NONE | &quot;NONE&quot; |
| OWNER | &quot;OWNER&quot; |



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
| NULL | &quot;null&quot; |



## Enum: SubjectTypeEnum

| Name | Value |
|---- | -----|
| LINE | &quot;line&quot; |
| FILE | &quot;file&quot; |



