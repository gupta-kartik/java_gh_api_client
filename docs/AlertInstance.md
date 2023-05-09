

# AlertInstance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analysisKey** | **String** | Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name. |  |
|**category** | **String** | Identifies the configuration under which the analysis was executed. |  [optional] |
|**classifications** | **List&lt;String&gt;** |  |  [optional] |
|**commitSha** | **String** |  |  [optional] |
|**environment** | **String** | Identifies the variable values associated with the environment in which the analysis that generated this alert instance was performed, such as the language that was analyzed. |  |
|**location** | [**AlertInstanceLocation**](AlertInstanceLocation.md) |  |  [optional] |
|**message** | [**CodeScanningAlertInstanceMessage**](CodeScanningAlertInstanceMessage.md) |  |  [optional] |
|**ref** | **String** | The full Git reference, formatted as &#x60;refs/heads/&lt;branch name&gt;&#x60;. |  |
|**state** | [**StateEnum**](#StateEnum) | State of a code scanning alert. |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| DISMISSED | &quot;dismissed&quot; |
| FIXED | &quot;fixed&quot; |



