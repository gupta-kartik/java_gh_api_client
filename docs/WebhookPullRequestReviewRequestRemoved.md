

# WebhookPullRequestReviewRequestRemoved


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) |  |  |
|**enterprise** | [**Enterprise**](Enterprise.md) |  |  [optional] |
|**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional] |
|**number** | **Integer** | The pull request number. |  |
|**organization** | [**OrganizationSimple**](OrganizationSimple.md) |  |  [optional] |
|**pullRequest** | [**PullRequest8**](PullRequest8.md) |  |  |
|**repository** | [**Repository**](Repository.md) |  |  |
|**requestedReviewer** | [**User**](User.md) |  |  |
|**sender** | [**SimpleUser**](SimpleUser.md) |  |  |
|**requestedTeam** | [**Team1**](Team1.md) |  |  |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| REVIEW_REQUEST_REMOVED | &quot;review_request_removed&quot; |



