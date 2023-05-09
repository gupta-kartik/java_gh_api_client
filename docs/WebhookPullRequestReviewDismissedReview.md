

# WebhookPullRequestReviewDismissedReview

The review that was affected.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**WebhookPullRequestReviewDismissedReviewLinks**](WebhookPullRequestReviewDismissedReviewLinks.md) |  |  |
|**authorAssociation** | [**AuthorAssociationEnum**](#AuthorAssociationEnum) | How the author is associated with the repository. |  |
|**body** | **String** | The text of the review. |  |
|**commitId** | **String** | A commit SHA for the review. |  |
|**htmlUrl** | **URI** |  |  |
|**id** | **Integer** | Unique identifier of the review |  |
|**nodeId** | **String** |  |  |
|**pullRequestUrl** | **URI** |  |  |
|**state** | [**StateEnum**](#StateEnum) |  |  |
|**submittedAt** | **OffsetDateTime** |  |  |
|**user** | [**User1**](User1.md) |  |  |



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
| DISMISSED | &quot;dismissed&quot; |
| APPROVED | &quot;approved&quot; |
| CHANGES_REQUESTED | &quot;changes_requested&quot; |



