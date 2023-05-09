

# WebhookDiscussionAnsweredAnswer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorAssociation** | [**AuthorAssociationEnum**](#AuthorAssociationEnum) | How the author is associated with the repository. |  |
|**body** | **String** |  |  |
|**childCommentCount** | **Integer** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**discussionId** | **Integer** |  |  |
|**htmlUrl** | **String** |  |  |
|**id** | **Integer** |  |  |
|**nodeId** | **String** |  |  |
|**parentId** | **Object** |  |  |
|**reactions** | [**Reactions**](Reactions.md) |  |  [optional] |
|**repositoryUrl** | **String** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
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



