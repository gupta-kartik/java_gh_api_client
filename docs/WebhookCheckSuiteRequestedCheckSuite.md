

# WebhookCheckSuiteRequestedCheckSuite

The [check_suite](https://docs.github.com/rest/reference/checks#suites).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**after** | **String** |  |  |
|**app** | [**App1**](App1.md) |  |  |
|**before** | **String** |  |  |
|**checkRunsUrl** | **URI** |  |  |
|**conclusion** | [**ConclusionEnum**](#ConclusionEnum) | The summary conclusion for all check runs that are part of the check suite. Can be one of &#x60;success&#x60;, &#x60;failure&#x60;,&#x60; neutral&#x60;, &#x60;cancelled&#x60;, &#x60;timed_out&#x60;, &#x60;action_required&#x60; or &#x60;stale&#x60;. This value will be &#x60;null&#x60; until the check run has completed. |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**headBranch** | **String** | The head branch name the changes are on. |  |
|**headCommit** | [**SimpleCommit**](SimpleCommit.md) |  |  |
|**headSha** | **String** | The SHA of the head commit that is being checked. |  |
|**id** | **Integer** |  |  |
|**latestCheckRunsCount** | **Integer** |  |  |
|**nodeId** | **String** |  |  |
|**pullRequests** | [**List&lt;CheckRunPullRequest&gt;**](CheckRunPullRequest.md) | An array of pull requests that match this check suite. A pull request matches a check suite if they have the same &#x60;head_sha&#x60; and &#x60;head_branch&#x60;. When the check suite&#39;s &#x60;head_branch&#x60; is in a forked repository it will be &#x60;null&#x60; and the &#x60;pull_requests&#x60; array will be empty. |  |
|**rerequestable** | **Boolean** |  |  [optional] |
|**runsRerequestable** | **Boolean** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The summary status for all check runs that are part of the check suite. Can be &#x60;requested&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**url** | **URI** | URL that points to the check suite API resource. |  |



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
| NULL | &quot;null&quot; |
| SKIPPED | &quot;skipped&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| REQUESTED | &quot;requested&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |
| QUEUED | &quot;queued&quot; |
| NULL | &quot;null&quot; |



