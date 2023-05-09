

# CodespaceWithFullRepository

A codespace.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**name** | **String** | Automatically generated name of this codespace. |  |
|**displayName** | **String** | Display name for this codespace. |  [optional] |
|**environmentId** | **String** | UUID identifying this codespace&#39;s environment. |  |
|**owner** | [**SimpleUser**](SimpleUser.md) |  |  |
|**billableOwner** | [**SimpleUser**](SimpleUser.md) |  |  |
|**repository** | [**FullRepository**](FullRepository.md) |  |  |
|**machine** | [**NullableCodespaceMachine**](NullableCodespaceMachine.md) |  |  |
|**devcontainerPath** | **String** | Path to devcontainer.json from repo root used to create Codespace. |  [optional] |
|**prebuild** | **Boolean** | Whether the codespace was created from a prebuild. |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**lastUsedAt** | **OffsetDateTime** | Last known time this codespace was started. |  |
|**state** | [**StateEnum**](#StateEnum) | State of this codespace. |  |
|**url** | **URI** | API URL for this codespace. |  |
|**gitStatus** | [**CodespaceGitStatus**](CodespaceGitStatus.md) |  |  |
|**location** | [**LocationEnum**](#LocationEnum) | The initally assigned location of a new codespace. |  |
|**idleTimeoutMinutes** | **Integer** | The number of minutes of inactivity after which this codespace will be automatically stopped. |  |
|**webUrl** | **URI** | URL to access this codespace on the web. |  |
|**machinesUrl** | **URI** | API URL to access available alternate machine types for this codespace. |  |
|**startUrl** | **URI** | API URL to start this codespace. |  |
|**stopUrl** | **URI** | API URL to stop this codespace. |  |
|**publishUrl** | **URI** | API URL to publish this codespace to a new repository. |  [optional] |
|**pullsUrl** | **URI** | API URL for the Pull Request associated with this codespace, if any. |  |
|**recentFolders** | **List&lt;String&gt;** |  |  |
|**runtimeConstraints** | [**CodespaceRuntimeConstraints**](CodespaceRuntimeConstraints.md) |  |  [optional] |
|**pendingOperation** | **Boolean** | Whether or not a codespace has a pending async operation. This would mean that the codespace is temporarily unavailable. The only thing that you can do with a codespace in this state is delete it. |  [optional] |
|**pendingOperationDisabledReason** | **String** | Text to show user when codespace is disabled by a pending operation |  [optional] |
|**idleTimeoutNotice** | **String** | Text to show user when codespace idle timeout minutes has been overriden by an organization policy |  [optional] |
|**retentionPeriodMinutes** | **Integer** | Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0 and 43200 (30 days). |  [optional] |
|**retentionExpiresAt** | **OffsetDateTime** | When a codespace will be auto-deleted based on the \&quot;retention_period_minutes\&quot; and \&quot;last_used_at\&quot; |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| CREATED | &quot;Created&quot; |
| QUEUED | &quot;Queued&quot; |
| PROVISIONING | &quot;Provisioning&quot; |
| AVAILABLE | &quot;Available&quot; |
| AWAITING | &quot;Awaiting&quot; |
| UNAVAILABLE | &quot;Unavailable&quot; |
| DELETED | &quot;Deleted&quot; |
| MOVED | &quot;Moved&quot; |
| SHUTDOWN | &quot;Shutdown&quot; |
| ARCHIVED | &quot;Archived&quot; |
| STARTING | &quot;Starting&quot; |
| SHUTTINGDOWN | &quot;ShuttingDown&quot; |
| FAILED | &quot;Failed&quot; |
| EXPORTING | &quot;Exporting&quot; |
| UPDATING | &quot;Updating&quot; |
| REBUILDING | &quot;Rebuilding&quot; |



## Enum: LocationEnum

| Name | Value |
|---- | -----|
| EASTUS | &quot;EastUs&quot; |
| SOUTHEASTASIA | &quot;SouthEastAsia&quot; |
| WESTEUROPE | &quot;WestEurope&quot; |
| WESTUS2 | &quot;WestUs2&quot; |



