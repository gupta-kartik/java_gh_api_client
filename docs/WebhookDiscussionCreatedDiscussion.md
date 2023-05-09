

# WebhookDiscussionCreatedDiscussion


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeLockReason** | **Object** |  |  |
|**answerChosenAt** | **Object** |  |  |
|**answerChosenBy** | **Object** |  |  |
|**answerHtmlUrl** | **String** |  |  |
|**authorAssociation** | **String** |  |  |
|**body** | **String** |  |  |
|**category** | [**WebhookDiscussionCreatedDiscussionAllOfCategory**](WebhookDiscussionCreatedDiscussionAllOfCategory.md) |  |  |
|**comments** | **Integer** |  |  |
|**createdAt** | **String** |  |  |
|**htmlUrl** | **String** |  |  |
|**id** | **Integer** |  |  |
|**locked** | [**LockedEnum**](#LockedEnum) |  |  |
|**nodeId** | **String** |  |  |
|**number** | **Integer** |  |  |
|**reactions** | [**WebhookDiscussionCreatedDiscussionAllOfReactions**](WebhookDiscussionCreatedDiscussionAllOfReactions.md) |  |  [optional] |
|**repositoryUrl** | **String** |  |  |
|**state** | [**StateEnum**](#StateEnum) |  |  |
|**timelineUrl** | **String** |  |  [optional] |
|**title** | **String** |  |  |
|**updatedAt** | **String** |  |  |
|**user** | [**DeploymentWorkflowRunHeadRepositoryOwner**](DeploymentWorkflowRunHeadRepositoryOwner.md) |  |  |



## Enum: LockedEnum

| Name | Value |
|---- | -----|
| FALSE | &quot;false&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CONVERTING | &quot;converting&quot; |
| TRANSFERRING | &quot;transferring&quot; |



