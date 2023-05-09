

# OrganizationSecretScanningAlert


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**number** | **Integer** | The security alert number. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | The time that the alert was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | The time that the alert was last updated in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] [readonly] |
|**url** | **URI** | The REST API URL of the alert resource. |  [optional] [readonly] |
|**htmlUrl** | **URI** | The GitHub URL of the alert resource. |  [optional] [readonly] |
|**locationsUrl** | **URI** | The REST API URL of the code locations for this alert. |  [optional] |
|**state** | **SecretScanningAlertState** |  |  [optional] |
|**resolution** | **SecretScanningAlertResolution** |  |  [optional] |
|**resolvedAt** | **OffsetDateTime** | The time that the alert was resolved in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] |
|**resolvedBy** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  [optional] |
|**secretType** | **String** | The type of secret that secret scanning detected. |  [optional] |
|**secretTypeDisplayName** | **String** | User-friendly name for the detected secret, matching the &#x60;secret_type&#x60;. For a list of built-in patterns, see \&quot;[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security).\&quot; |  [optional] |
|**secret** | **String** | The secret that was detected. |  [optional] |
|**repository** | [**SimpleRepository**](SimpleRepository.md) |  |  [optional] |
|**pushProtectionBypassed** | **Boolean** | Whether push protection was bypassed for the detected secret. |  [optional] |
|**pushProtectionBypassedBy** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  [optional] |
|**pushProtectionBypassedAt** | **OffsetDateTime** | The time that push protection was bypassed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] |
|**resolutionComment** | **String** | The comment that was optionally added when this alert was closed |  [optional] |



