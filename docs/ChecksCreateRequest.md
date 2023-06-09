

# ChecksCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the check. For example, \&quot;code-coverage\&quot;. |  |
|**headSha** | **String** | The SHA of the commit. |  |
|**detailsUrl** | **String** | The URL of the integrator&#39;s site that has the full details of the check. If the integrator does not provide this, then the homepage of the GitHub app is used. |  [optional] |
|**externalId** | **String** | A reference for the run on the integrator&#39;s system. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status. |  [optional] |
|**startedAt** | **OffsetDateTime** | The time that the check run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] |
|**conclusion** | [**ConclusionEnum**](#ConclusionEnum) | **Required if you provide &#x60;completed_at&#x60; or a &#x60;status&#x60; of &#x60;completed&#x60;**. The final conclusion of the check.  **Note:** Providing &#x60;conclusion&#x60; will automatically set the &#x60;status&#x60; parameter to &#x60;completed&#x60;. You cannot change a check run conclusion to &#x60;stale&#x60;, only GitHub can set this. |  [optional] |
|**completedAt** | **OffsetDateTime** | The time the check completed. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] |
|**output** | [**ChecksCreateRequestOutput**](ChecksCreateRequestOutput.md) |  |  [optional] |
|**actions** | [**List&lt;ChecksCreateRequestActionsInner&gt;**](ChecksCreateRequestActionsInner.md) | Displays a button on GitHub that can be clicked to alert your app to do additional tasks. For example, a code linting app can display a button that automatically fixes detected errors. The button created in this object is displayed after the check run completes. When a user clicks the button, GitHub sends the [&#x60;check_run.requested_action&#x60; webhook](https://docs.github.com/webhooks/event-payloads/#check_run) to your app. Each action includes a &#x60;label&#x60;, &#x60;identifier&#x60; and &#x60;description&#x60;. A maximum of three actions are accepted. To learn more about check runs and requested actions, see \&quot;[Check runs and requested actions](https://docs.github.com/rest/reference/checks#check-runs-and-requested-actions).\&quot; |  [optional] |



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



