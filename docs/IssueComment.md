

# IssueComment

The [comment](https://docs.github.com/rest/reference/issues#comments) itself.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorAssociation** | [**AuthorAssociationEnum**](#AuthorAssociationEnum) | How the author is associated with the repository. |  |
|**body** | **String** | Contents of the issue comment |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**htmlUrl** | **URI** |  |  |
|**id** | **Long** | Unique identifier of the issue comment |  |
|**issueUrl** | **URI** |  |  |
|**nodeId** | **String** |  |  |
|**performedViaGithubApp** | [**NullableIntegration**](NullableIntegration.md) |  |  |
|**reactions** | [**Reactions**](Reactions.md) |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**url** | **URI** | URL for the issue comment |  |
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



