

# WebhookPullRequestReviewRequestedOneOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) |  |  |
|**enterprise** | [**Enterprise**](Enterprise.md) |  |  [optional] |
|**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional] |
|**number** | **Integer** | The pull request number. |  |
|**organization** | [**OrganizationSimple**](OrganizationSimple.md) |  |  [optional] |
|**pullRequest** | [**PullRequest9**](PullRequest9.md) |  |  |
|**repository** | [**Repository**](Repository.md) |  |  |
|**requestedReviewer** | [**User1**](User1.md) |  |  |
|**sender** | [**SimpleUser**](SimpleUser.md) |  |  |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| REVIEW_REQUESTED | &quot;review_requested&quot; |



