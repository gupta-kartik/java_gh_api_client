

# WebhookDiscussionCreatedDiscussionAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeLockReason** | **Object** |  |  [optional] |
|**answerChosenAt** | **Object** |  |  |
|**answerChosenBy** | **Object** |  |  |
|**answerHtmlUrl** | **String** |  |  |
|**authorAssociation** | **String** |  |  [optional] |
|**body** | **String** |  |  [optional] |
|**category** | [**WebhookDiscussionCreatedDiscussionAllOfCategory**](WebhookDiscussionCreatedDiscussionAllOfCategory.md) |  |  [optional] |
|**comments** | **Integer** |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**htmlUrl** | **String** |  |  [optional] |
|**id** | **Integer** |  |  [optional] |
|**locked** | [**LockedEnum**](#LockedEnum) |  |  |
|**nodeId** | **String** |  |  [optional] |
|**number** | **Integer** |  |  [optional] |
|**reactions** | [**WebhookDiscussionCreatedDiscussionAllOfReactions**](WebhookDiscussionCreatedDiscussionAllOfReactions.md) |  |  [optional] |
|**repositoryUrl** | **String** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  |
|**timelineUrl** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |
|**user** | [**DeploymentWorkflowRunHeadRepositoryOwner**](DeploymentWorkflowRunHeadRepositoryOwner.md) |  |  [optional] |



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



