

# WebhookCommitCommentCreatedComment

The [commit comment](https://docs.github.com/rest/reference/repos#get-a-commit-comment) resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorAssociation** | [**AuthorAssociationEnum**](#AuthorAssociationEnum) | How the author is associated with the repository. |  |
|**body** | **String** | The text of the comment. |  |
|**commitId** | **String** | The SHA of the commit to which the comment applies. |  |
|**createdAt** | **String** |  |  |
|**htmlUrl** | **URI** |  |  |
|**id** | **Integer** | The ID of the commit comment. |  |
|**line** | **Integer** | The line of the blob to which the comment applies. The last line of the range for a multi-line comment |  |
|**nodeId** | **String** | The node ID of the commit comment. |  |
|**path** | **String** | The relative path of the file to which the comment applies. |  |
|**position** | **Integer** | The line index in the diff to which the comment applies. |  |
|**reactions** | [**Reactions**](Reactions.md) |  |  [optional] |
|**updatedAt** | **String** |  |  |
|**url** | **URI** |  |  |
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



