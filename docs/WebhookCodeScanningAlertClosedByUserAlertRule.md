

# WebhookCodeScanningAlertClosedByUserAlertRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A short description of the rule used to detect the alert. |  |
|**fullDescription** | **String** |  |  [optional] |
|**help** | **String** |  |  [optional] |
|**helpUri** | **String** | A link to the documentation for the rule used to detect the alert. |  [optional] |
|**id** | **String** | A unique identifier for the rule used to detect the alert. |  |
|**name** | **String** |  |  [optional] |
|**severity** | [**SeverityEnum**](#SeverityEnum) | The severity of the alert. |  |
|**tags** | **List&lt;String&gt;** |  |  [optional] |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| NOTE | &quot;note&quot; |
| WARNING | &quot;warning&quot; |
| ERROR | &quot;error&quot; |
| NULL | &quot;null&quot; |



