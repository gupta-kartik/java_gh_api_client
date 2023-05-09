

# Issue6

The [issue](https://docs.github.com/rest/reference/issues) itself.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeLockReason** | [**ActiveLockReasonEnum**](#ActiveLockReasonEnum) |  |  |
|**assignee** | [**User1**](User1.md) |  |  [optional] |
|**assignees** | [**List&lt;User1&gt;**](User1.md) |  |  |
|**authorAssociation** | [**AuthorAssociationEnum**](#AuthorAssociationEnum) | How the author is associated with the repository. |  |
|**body** | **String** | Contents of the issue |  |
|**closedAt** | **OffsetDateTime** |  |  |
|**comments** | **Integer** |  |  |
|**commentsUrl** | **URI** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**draft** | **Boolean** |  |  [optional] |
|**eventsUrl** | **URI** |  |  |
|**htmlUrl** | **URI** |  |  |
|**id** | **Long** |  |  |
|**labels** | [**List&lt;Label&gt;**](Label.md) |  |  [optional] |
|**labelsUrl** | **String** |  |  |
|**locked** | **Boolean** |  |  [optional] |
|**milestone** | [**Milestone**](Milestone.md) |  |  |
|**nodeId** | **String** |  |  |
|**number** | **Integer** |  |  |
|**performedViaGithubApp** | [**App12**](App12.md) |  |  [optional] |
|**pullRequest** | [**IssuePullRequest**](IssuePullRequest.md) |  |  [optional] |
|**reactions** | [**Reactions**](Reactions.md) |  |  |
|**repositoryUrl** | **URI** |  |  |
|**state** | [**StateEnum**](#StateEnum) | State of the issue; either &#39;open&#39; or &#39;closed&#39; |  [optional] |
|**stateReason** | **String** |  |  [optional] |
|**timelineUrl** | **URI** |  |  [optional] |
|**title** | **String** | Title of the issue |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**url** | **URI** | URL for the issue |  |
|**user** | [**User1**](User1.md) |  |  |



## Enum: ActiveLockReasonEnum

| Name | Value |
|---- | -----|
| RESOLVED | &quot;resolved&quot; |
| OFF_TOPIC | &quot;off-topic&quot; |
| TOO_HEATED | &quot;too heated&quot; |
| SPAM | &quot;spam&quot; |
| NULL | &quot;null&quot; |



## Enum: AuthorAssociationEnum

| Name | Value |
|---- | -----|
| COLLABORATOR | &quot;COLLABORATOR&quot; |
| CONTRIBUTOR | &quot;CONTRIBUTOR&quot; |
| FIRST_TIMER | &quot;FIRST_TIMER&quot; |
| FIRST_TIME_CONTRIBUTOR | &quot;FIRST_TIME_CONTRIBUTOR&quot; |
| MANNEQUIN | &quot;MANNEQUIN&quot; |
| MEMBER | &quot;MEMBER&quot; |
| NONE | &quot;NONE&quot; |
| OWNER | &quot;OWNER&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |



