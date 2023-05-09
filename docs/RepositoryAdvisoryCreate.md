

# RepositoryAdvisoryCreate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**summary** | **String** | A short summary of the advisory. |  |
|**description** | **String** | A detailed description of what the advisory impacts. |  |
|**cveId** | **String** | The Common Vulnerabilities and Exposures (CVE) ID. |  [optional] |
|**vulnerabilities** | [**List&lt;RepositoryAdvisoryCreateVulnerabilitiesInner&gt;**](RepositoryAdvisoryCreateVulnerabilitiesInner.md) | A product affected by the vulnerability detailed in a repository security advisory. |  |
|**cweIds** | **List&lt;String&gt;** | A list of Common Weakness Enumeration (CWE) IDs. |  [optional] |
|**credits** | [**List&lt;RepositoryAdvisoryCreateCreditsInner&gt;**](RepositoryAdvisoryCreateCreditsInner.md) | A list of users receiving credit for their participation in the security advisory. |  [optional] |
|**severity** | [**SeverityEnum**](#SeverityEnum) | The severity of the advisory. You must choose between setting this field or &#x60;cvss_vector_string&#x60;. |  [optional] |
|**cvssVectorString** | **String** | The CVSS vector that calculates the severity of the advisory. You must choose between setting this field or &#x60;severity&#x60;. |  [optional] |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| CRITICAL | &quot;critical&quot; |
| HIGH | &quot;high&quot; |
| MEDIUM | &quot;medium&quot; |
| LOW | &quot;low&quot; |



