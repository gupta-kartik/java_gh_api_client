

# ActionsReviewPendingDeploymentsForRunRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**environmentIds** | **List&lt;Integer&gt;** | The list of environment ids to approve or reject |  |
|**state** | [**StateEnum**](#StateEnum) | Whether to approve or reject deployment to the specified environments. |  |
|**comment** | **String** | A comment to accompany the deployment review |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |
| REJECTED | &quot;rejected&quot; |



