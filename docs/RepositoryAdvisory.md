

# RepositoryAdvisory

A repository security advisory.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ghsaId** | **String** | The GitHub Security Advisory ID. |  [readonly] |
|**cveId** | **String** | The Common Vulnerabilities and Exposures (CVE) ID. |  |
|**url** | **String** | The API URL for the advisory. |  |
|**htmlUrl** | **URI** | The URL for the advisory. |  [readonly] |
|**summary** | **String** | A short summary of the advisory. |  |
|**description** | **String** | A detailed description of what the advisory entails. |  |
|**severity** | [**SeverityEnum**](#SeverityEnum) | The severity of the advisory. |  |
|**author** | [**RepositoryAdvisoryAuthor**](RepositoryAdvisoryAuthor.md) |  |  |
|**publisher** | [**RepositoryAdvisoryPublisher**](RepositoryAdvisoryPublisher.md) |  |  |
|**identifiers** | [**List&lt;RepositoryAdvisoryIdentifiersInner&gt;**](RepositoryAdvisoryIdentifiersInner.md) |  |  [readonly] |
|**state** | [**StateEnum**](#StateEnum) | The state of the advisory. |  |
|**createdAt** | **OffsetDateTime** | The date and time of when the advisory was created, in ISO 8601 format. |  [readonly] |
|**updatedAt** | **OffsetDateTime** | The date and time of when the advisory was last updated, in ISO 8601 format. |  [readonly] |
|**publishedAt** | **OffsetDateTime** | The date and time of when the advisory was published, in ISO 8601 format. |  [readonly] |
|**closedAt** | **OffsetDateTime** | The date and time of when the advisory was closed, in ISO 8601 format. |  [readonly] |
|**withdrawnAt** | **OffsetDateTime** | The date and time of when the advisory was withdrawn, in ISO 8601 format. |  [readonly] |
|**submission** | [**RepositoryAdvisorySubmission**](RepositoryAdvisorySubmission.md) |  |  |
|**vulnerabilities** | [**List&lt;RepositoryAdvisoryVulnerability&gt;**](RepositoryAdvisoryVulnerability.md) |  |  |
|**cvss** | [**RepositoryAdvisoryCvss**](RepositoryAdvisoryCvss.md) |  |  |
|**cwes** | [**List&lt;RepositoryAdvisoryCwesInner&gt;**](RepositoryAdvisoryCwesInner.md) |  |  [readonly] |
|**cweIds** | **List&lt;String&gt;** | A list of only the CWE IDs. |  |
|**credits** | [**List&lt;RepositoryAdvisoryCreditsInner&gt;**](RepositoryAdvisoryCreditsInner.md) |  |  |
|**creditsDetailed** | [**List&lt;RepositoryAdvisoryCredit&gt;**](RepositoryAdvisoryCredit.md) |  |  [readonly] |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| CRITICAL | &quot;critical&quot; |
| HIGH | &quot;high&quot; |
| MEDIUM | &quot;medium&quot; |
| LOW | &quot;low&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PUBLISHED | &quot;published&quot; |
| CLOSED | &quot;closed&quot; |
| WITHDRAWN | &quot;withdrawn&quot; |
| DRAFT | &quot;draft&quot; |
| TRIAGE | &quot;triage&quot; |



