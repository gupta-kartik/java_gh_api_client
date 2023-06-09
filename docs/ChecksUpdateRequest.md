

# ChecksUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the check. For example, \&quot;code-coverage\&quot;. |  [optional] |
|**detailsUrl** | **String** | The URL of the integrator&#39;s site that has the full details of the check. |  [optional] |
|**externalId** | **String** | A reference for the run on the integrator&#39;s system. |  [optional] |
|**startedAt** | **OffsetDateTime** | This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status. |  [optional] |
|**conclusion** | [**ConclusionEnum**](#ConclusionEnum) | **Required if you provide &#x60;completed_at&#x60; or a &#x60;status&#x60; of &#x60;completed&#x60;**. The final conclusion of the check.  **Note:** Providing &#x60;conclusion&#x60; will automatically set the &#x60;status&#x60; parameter to &#x60;completed&#x60;. You cannot change a check run conclusion to &#x60;stale&#x60;, only GitHub can set this. |  [optional] |
|**completedAt** | **OffsetDateTime** | The time the check completed. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] |
|**output** | [**ChecksUpdateRequestOutput**](ChecksUpdateRequestOutput.md) |  |  [optional] |
|**actions** | [**List&lt;ChecksCreateRequestActionsInner&gt;**](ChecksCreateRequestActionsInner.md) | Possible further actions the integrator can perform, which a user may trigger. Each action includes a &#x60;label&#x60;, &#x60;identifier&#x60; and &#x60;description&#x60;. A maximum of three actions are accepted. See the [&#x60;actions&#x60; object](https://docs.github.com/rest/reference/checks#actions-object) description. To learn more about check runs and requested actions, see \&quot;[Check runs and requested actions](https://docs.github.com/rest/reference/checks#check-runs-and-requested-actions).\&quot; |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;queued&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |



## Enum: ConclusionEnum

| Name | Value |
|---- | -----|
| ACTION_REQUIRED | &quot;action_required&quot; |
| CANCELLED | &quot;cancelled&quot; |
| FAILURE | &quot;failure&quot; |
| NEUTRAL | &quot;neutral&quot; |
| SUCCESS | &quot;success&quot; |
| SKIPPED | &quot;skipped&quot; |
| STALE | &quot;stale&quot; |
| TIMED_OUT | &quot;timed_out&quot; |



