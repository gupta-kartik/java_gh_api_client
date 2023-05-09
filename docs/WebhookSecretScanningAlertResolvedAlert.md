

# WebhookSecretScanningAlertResolvedAlert


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | The time that the alert was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] [readonly] |
|**htmlUrl** | **URI** | The GitHub URL of the alert resource. |  [optional] [readonly] |
|**locationsUrl** | **URI** | The REST API URL of the code locations for this alert. |  [optional] |
|**number** | **Integer** | The security alert number. |  [optional] [readonly] |
|**pushProtectionBypassed** | **Boolean** | Whether push protection was bypassed for the detected secret. |  [optional] |
|**pushProtectionBypassedAt** | **OffsetDateTime** | The time that push protection was bypassed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] |
|**pushProtectionBypassedBy** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  [optional] |
|**resolution** | [**ResolutionEnum**](#ResolutionEnum) | **Required when the &#x60;state&#x60; is &#x60;resolved&#x60;.** The reason for resolving the alert. |  [optional] |
|**resolvedAt** | **OffsetDateTime** | The time that the alert was resolved in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] |
|**resolvedBy** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  [optional] |
|**resolutionComment** | **String** | An optional comment to resolve an alert. |  [optional] |
|**secret** | **String** | The secret that was detected. |  [optional] |
|**secretType** | **String** | The type of secret that secret scanning detected. |  [optional] |
|**secretTypeDisplayName** | **String** | User-friendly name for the detected secret, matching the &#x60;secret_type&#x60;. For a list of built-in patterns, see \&quot;[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security).\&quot; |  [optional] |
|**state** | **SecretScanningAlertState** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** | The time that the alert was last updated in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] [readonly] |
|**url** | **URI** | The REST API URL of the alert resource. |  [optional] [readonly] |



## Enum: ResolutionEnum

| Name | Value |
|---- | -----|
| NULL | &quot;null&quot; |
| FALSE_POSITIVE | &quot;false_positive&quot; |
| WONT_FIX | &quot;wont_fix&quot; |
| REVOKED | &quot;revoked&quot; |
| USED_IN_TESTS | &quot;used_in_tests&quot; |
| PATTERN_DELETED | &quot;pattern_deleted&quot; |
| PATTERN_EDITED | &quot;pattern_edited&quot; |



