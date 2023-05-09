

# WebhookCodeScanningAlertCreatedAlert

The code scanning alert involved in the event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | The time that the alert was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ.&#x60; |  |
|**dismissedAt** | **Object** | The time that the alert was dismissed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  |
|**dismissedBy** | **Object** |  |  |
|**dismissedComment** | **String** | The dismissal comment associated with the dismissal of the alert. |  [optional] |
|**dismissedReason** | **Object** | The reason for dismissing or closing the alert. Can be one of: &#x60;false positive&#x60;, &#x60;won&#39;t fix&#x60;, and &#x60;used in tests&#x60;. |  |
|**fixedAt** | **Object** |  |  [optional] |
|**htmlUrl** | **URI** | The GitHub URL of the alert resource. |  |
|**instancesUrl** | **String** |  |  [optional] |
|**mostRecentInstance** | [**AlertInstance**](AlertInstance.md) |  |  [optional] |
|**number** | **Integer** | The code scanning alert number. |  |
|**rule** | [**WebhookCodeScanningAlertClosedByUserAlertRule**](WebhookCodeScanningAlertClosedByUserAlertRule.md) |  |  |
|**state** | [**StateEnum**](#StateEnum) | State of a code scanning alert. |  |
|**tool** | [**WebhookCodeScanningAlertCreatedAlertTool**](WebhookCodeScanningAlertCreatedAlertTool.md) |  |  |
|**updatedAt** | **String** |  |  [optional] |
|**url** | **URI** |  |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| DISMISSED | &quot;dismissed&quot; |



