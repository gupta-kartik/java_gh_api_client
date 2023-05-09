

# WebhookDeploymentStatusCreatedCheckRun


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**completedAt** | **OffsetDateTime** |  |  |
|**conclusion** | [**ConclusionEnum**](#ConclusionEnum) | The result of the completed check run. Can be one of &#x60;success&#x60;, &#x60;failure&#x60;, &#x60;neutral&#x60;, &#x60;cancelled&#x60;, &#x60;timed_out&#x60;, &#x60;action_required&#x60; or &#x60;stale&#x60;. This value will be &#x60;null&#x60; until the check run has completed. |  |
|**detailsUrl** | **URI** |  |  |
|**externalId** | **String** |  |  |
|**headSha** | **String** | The SHA of the commit that is being checked. |  |
|**htmlUrl** | **URI** |  |  |
|**id** | **Integer** | The id of the check. |  |
|**name** | **String** | The name of the check run. |  |
|**nodeId** | **String** |  |  |
|**startedAt** | **OffsetDateTime** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the check run. Can be &#x60;queued&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. |  |
|**url** | **URI** |  |  |



## Enum: ConclusionEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| FAILURE | &quot;failure&quot; |
| NEUTRAL | &quot;neutral&quot; |
| CANCELLED | &quot;cancelled&quot; |
| TIMED_OUT | &quot;timed_out&quot; |
| ACTION_REQUIRED | &quot;action_required&quot; |
| STALE | &quot;stale&quot; |
| SKIPPED | &quot;skipped&quot; |
| NULL | &quot;null&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;queued&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |
| WAITING | &quot;waiting&quot; |
| PENDING | &quot;pending&quot; |



