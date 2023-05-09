

# OrgsReviewPatGrantRequestsInBulkRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**patRequestIds** | **List&lt;Integer&gt;** | Unique identifiers of the requests for access via fine-grained personal access token. Must be formed of between 1 and 100 &#x60;pat_request_id&#x60; values. |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | Action to apply to the requests. |  |
|**reason** | **String** | Reason for approving or denying the requests. Max 1024 characters. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| APPROVE | &quot;approve&quot; |
| DENY | &quot;deny&quot; |



