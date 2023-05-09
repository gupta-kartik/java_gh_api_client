

# NullableMilestone

A collection of related issues and pull requests.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** |  |  |
|**htmlUrl** | **URI** |  |  |
|**labelsUrl** | **URI** |  |  |
|**id** | **Integer** |  |  |
|**nodeId** | **String** |  |  |
|**number** | **Integer** | The number of the milestone. |  |
|**state** | [**StateEnum**](#StateEnum) | The state of the milestone. |  |
|**title** | **String** | The title of the milestone. |  |
|**description** | **String** |  |  |
|**creator** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**openIssues** | **Integer** |  |  |
|**closedIssues** | **Integer** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**closedAt** | **OffsetDateTime** |  |  |
|**dueOn** | **OffsetDateTime** |  |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |



