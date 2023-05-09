

# PullRequestRequestedReviewersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**avatarUrl** | **URI** |  |  [optional] |
|**deleted** | **Boolean** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**eventsUrl** | **String** |  |  [optional] |
|**followersUrl** | **URI** |  |  [optional] |
|**followingUrl** | **String** |  |  [optional] |
|**gistsUrl** | **String** |  |  [optional] |
|**gravatarId** | **String** |  |  [optional] |
|**htmlUrl** | **URI** |  |  |
|**id** | **Integer** | Unique identifier of the team |  |
|**login** | **String** |  |  |
|**name** | **String** | Name of the team |  |
|**nodeId** | **String** |  |  |
|**organizationsUrl** | **URI** |  |  [optional] |
|**receivedEventsUrl** | **URI** |  |  [optional] |
|**reposUrl** | **URI** |  |  [optional] |
|**siteAdmin** | **Boolean** |  |  [optional] |
|**starredUrl** | **String** |  |  [optional] |
|**subscriptionsUrl** | **URI** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**url** | **URI** | URL for the team |  |
|**description** | **String** | Description of the team |  |
|**membersUrl** | **String** |  |  |
|**parent** | [**Team1Parent**](Team1Parent.md) |  |  [optional] |
|**permission** | **String** | Permission that the team will have for its repositories |  |
|**privacy** | [**PrivacyEnum**](#PrivacyEnum) |  |  |
|**repositoriesUrl** | **URI** |  |  |
|**slug** | **String** |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BOT | &quot;Bot&quot; |
| USER | &quot;User&quot; |
| ORGANIZATION | &quot;Organization&quot; |
| MANNEQUIN | &quot;Mannequin&quot; |



## Enum: PrivacyEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |
| SECRET | &quot;secret&quot; |



