

# AutoMerge

The status of auto merging a pull request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabledBy** | [**SimpleUser**](SimpleUser.md) |  |  |
|**mergeMethod** | [**MergeMethodEnum**](#MergeMethodEnum) | The merge method to use. |  |
|**commitTitle** | **String** | Title for the merge commit message. |  |
|**commitMessage** | **String** | Commit message for the merge commit. |  |



## Enum: MergeMethodEnum

| Name | Value |
|---- | -----|
| MERGE | &quot;merge&quot; |
| SQUASH | &quot;squash&quot; |
| REBASE | &quot;rebase&quot; |



