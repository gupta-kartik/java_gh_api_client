

# Discussion


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeLockReason** | **String** |  |  |
|**answerChosenAt** | **String** |  |  |
|**answerChosenBy** | [**User**](User.md) |  |  |
|**answerHtmlUrl** | **String** |  |  |
|**authorAssociation** | [**AuthorAssociationEnum**](#AuthorAssociationEnum) | How the author is associated with the repository. |  |
|**body** | **String** |  |  |
|**category** | [**DiscussionCategory**](DiscussionCategory.md) |  |  |
|**comments** | **Integer** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**htmlUrl** | **String** |  |  |
|**id** | **Integer** |  |  |
|**locked** | **Boolean** |  |  |
|**nodeId** | **String** |  |  |
|**number** | **Integer** |  |  |
|**reactions** | [**Reactions**](Reactions.md) |  |  [optional] |
|**repositoryUrl** | **String** |  |  |
|**state** | [**StateEnum**](#StateEnum) |  |  |
|**timelineUrl** | **String** |  |  [optional] |
|**title** | **String** |  |  |
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



## Enum: StateEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| LOCKED | &quot;locked&quot; |
| CONVERTING | &quot;converting&quot; |
| TRANSFERRING | &quot;transferring&quot; |



