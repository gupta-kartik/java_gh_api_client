

# DependabotAlertSecurityAdvisory

Details for the GitHub Security Advisory.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ghsaId** | **String** | The unique GitHub Security Advisory ID assigned to the advisory. |  [readonly] |
|**cveId** | **String** | The unique CVE ID assigned to the advisory. |  [readonly] |
|**summary** | **String** | A short, plain text summary of the advisory. |  [readonly] |
|**description** | **String** | A long-form Markdown-supported description of the advisory. |  [readonly] |
|**vulnerabilities** | [**List&lt;DependabotAlertSecurityVulnerability&gt;**](DependabotAlertSecurityVulnerability.md) | Vulnerable version range information for the advisory. |  [readonly] |
|**severity** | [**SeverityEnum**](#SeverityEnum) | The severity of the advisory. |  [readonly] |
|**cvss** | [**DependabotAlertSecurityAdvisoryCvss**](DependabotAlertSecurityAdvisoryCvss.md) |  |  |
|**cwes** | [**List&lt;DependabotAlertSecurityAdvisoryCwesInner&gt;**](DependabotAlertSecurityAdvisoryCwesInner.md) | Details for the advisory pertaining to Common Weakness Enumeration. |  [readonly] |
|**identifiers** | [**List&lt;DependabotAlertSecurityAdvisoryIdentifiersInner&gt;**](DependabotAlertSecurityAdvisoryIdentifiersInner.md) | Values that identify this advisory among security information sources. |  [readonly] |
|**references** | [**List&lt;DependabotAlertSecurityAdvisoryReferencesInner&gt;**](DependabotAlertSecurityAdvisoryReferencesInner.md) | Links to additional advisory information. |  [readonly] |
|**publishedAt** | **OffsetDateTime** | The time that the advisory was published in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly] |
|**updatedAt** | **OffsetDateTime** | The time that the advisory was last modified in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly] |
|**withdrawnAt** | **OffsetDateTime** | The time that the advisory was withdrawn in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly] |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| LOW | &quot;low&quot; |
| MEDIUM | &quot;medium&quot; |
| HIGH | &quot;high&quot; |
| CRITICAL | &quot;critical&quot; |



