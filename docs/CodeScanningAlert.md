

# CodeScanningAlert


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**number** | **Integer** | The security alert number. |  [readonly] |
|**createdAt** | **OffsetDateTime** | The time that the alert was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly] |
|**updatedAt** | **OffsetDateTime** | The time that the alert was last updated in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] [readonly] |
|**url** | **URI** | The REST API URL of the alert resource. |  [readonly] |
|**htmlUrl** | **URI** | The GitHub URL of the alert resource. |  [readonly] |
|**instancesUrl** | **URI** | The REST API URL for fetching the list of instances for an alert. |  [readonly] |
|**state** | **CodeScanningAlertState** |  |  |
|**fixedAt** | **OffsetDateTime** | The time that the alert was no longer detected and was considered fixed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] [readonly] |
|**dismissedBy** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**dismissedAt** | **OffsetDateTime** | The time that the alert was dismissed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly] |
|**dismissedReason** | **CodeScanningAlertDismissedReason** |  |  |
|**dismissedComment** | **String** | The dismissal comment associated with the dismissal of the alert. |  [optional] |
|**rule** | [**CodeScanningAlertRule**](CodeScanningAlertRule.md) |  |  |
|**tool** | [**CodeScanningAnalysisTool**](CodeScanningAnalysisTool.md) |  |  |
|**mostRecentInstance** | [**CodeScanningAlertInstance**](CodeScanningAlertInstance.md) |  |  |



