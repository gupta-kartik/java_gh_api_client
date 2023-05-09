

# WebhookPullRequestSynchronize


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) |  |  |
|**after** | **String** |  |  |
|**before** | **String** |  |  |
|**enterprise** | [**Enterprise**](Enterprise.md) |  |  [optional] |
|**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional] |
|**number** | **Integer** | The pull request number. |  |
|**organization** | [**OrganizationSimple**](OrganizationSimple.md) |  |  [optional] |
|**pullRequest** | [**PullRequest11**](PullRequest11.md) |  |  |
|**repository** | [**Repository**](Repository.md) |  |  |
|**sender** | [**SimpleUser**](SimpleUser.md) |  |  |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| SYNCHRONIZE | &quot;synchronize&quot; |



