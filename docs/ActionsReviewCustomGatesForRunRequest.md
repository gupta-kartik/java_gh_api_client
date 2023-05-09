

# ActionsReviewCustomGatesForRunRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**environmentName** | **String** | The name of the environment to approve or reject. |  |
|**comment** | **String** | Optional comment to include with the review. |  |
|**state** | [**StateEnum**](#StateEnum) | Whether to approve or reject deployment to the specified environments. |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |
| REJECTED | &quot;rejected&quot; |



