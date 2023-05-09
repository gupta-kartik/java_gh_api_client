

# DependabotAlert

A Dependabot alert.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**number** | **Integer** | The security alert number. |  [readonly] |
|**state** | [**StateEnum**](#StateEnum) | The state of the Dependabot alert. |  [readonly] |
|**dependency** | [**DependabotAlertWithRepositoryDependency**](DependabotAlertWithRepositoryDependency.md) |  |  |
|**securityAdvisory** | [**DependabotAlertSecurityAdvisory**](DependabotAlertSecurityAdvisory.md) |  |  |
|**securityVulnerability** | [**DependabotAlertSecurityVulnerability**](DependabotAlertSecurityVulnerability.md) |  |  |
|**url** | **URI** | The REST API URL of the alert resource. |  [readonly] |
|**htmlUrl** | **URI** | The GitHub URL of the alert resource. |  [readonly] |
|**createdAt** | **OffsetDateTime** | The time that the alert was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly] |
|**updatedAt** | **OffsetDateTime** | The time that the alert was last updated in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly] |
|**dismissedAt** | **OffsetDateTime** | The time that the alert was dismissed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly] |
|**dismissedBy** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**dismissedReason** | [**DismissedReasonEnum**](#DismissedReasonEnum) | The reason that the alert was dismissed. |  |
|**dismissedComment** | **String** | An optional comment associated with the alert&#39;s dismissal. |  |
|**fixedAt** | **OffsetDateTime** | The time that the alert was no longer detected and was considered fixed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly] |
|**autoDismissedAt** | **OffsetDateTime** | The time that the alert was auto-dismissed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| AUTO_DISMISSED | &quot;auto_dismissed&quot; |
| DISMISSED | &quot;dismissed&quot; |
| FIXED | &quot;fixed&quot; |
| OPEN | &quot;open&quot; |



## Enum: DismissedReasonEnum

| Name | Value |
|---- | -----|
| FIX_STARTED | &quot;fix_started&quot; |
| INACCURATE | &quot;inaccurate&quot; |
| NO_BANDWIDTH | &quot;no_bandwidth&quot; |
| NOT_USED | &quot;not_used&quot; |
| TOLERABLE_RISK | &quot;tolerable_risk&quot; |



