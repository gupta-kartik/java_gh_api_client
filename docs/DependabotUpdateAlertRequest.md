

# DependabotUpdateAlertRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | [**StateEnum**](#StateEnum) | The state of the Dependabot alert. A &#x60;dismissed_reason&#x60; must be provided when setting the state to &#x60;dismissed&#x60;. |  |
|**dismissedReason** | [**DismissedReasonEnum**](#DismissedReasonEnum) | **Required when &#x60;state&#x60; is &#x60;dismissed&#x60;.** A reason for dismissing the alert. |  [optional] |
|**dismissedComment** | **String** | An optional comment associated with dismissing the alert. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| DISMISSED | &quot;dismissed&quot; |
| OPEN | &quot;open&quot; |



## Enum: DismissedReasonEnum

| Name | Value |
|---- | -----|
| FIX_STARTED | &quot;fix_started&quot; |
| INACCURATE | &quot;inaccurate&quot; |
| NO_BANDWIDTH | &quot;no_bandwidth&quot; |
| NOT_USED | &quot;not_used&quot; |
| TOLERABLE_RISK | &quot;tolerable_risk&quot; |



