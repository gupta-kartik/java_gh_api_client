

# CodespacesCreateWithPrForAuthenticatedUserRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**location** | **String** | The requested location for a new codespace. Best efforts are made to respect this upon creation. Assigned by IP if not provided. |  [optional] |
|**geo** | [**GeoEnum**](#GeoEnum) | The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces &#x60;location&#x60;, which is being deprecated. |  [optional] |
|**clientIp** | **String** | IP for location auto-detection when proxying a request |  [optional] |
|**machine** | **String** | Machine type to use for this codespace |  [optional] |
|**devcontainerPath** | **String** | Path to devcontainer.json config to use for this codespace |  [optional] |
|**multiRepoPermissionsOptOut** | **Boolean** | Whether to authorize requested permissions from devcontainer.json |  [optional] |
|**workingDirectory** | **String** | Working directory for this codespace |  [optional] |
|**idleTimeoutMinutes** | **Integer** | Time in minutes before codespace stops from inactivity |  [optional] |
|**displayName** | **String** | Display name for this codespace |  [optional] |
|**retentionPeriodMinutes** | **Integer** | Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0 and 43200 (30 days). |  [optional] |



## Enum: GeoEnum

| Name | Value |
|---- | -----|
| EUROPEWEST | &quot;EuropeWest&quot; |
| SOUTHEASTASIA | &quot;SoutheastAsia&quot; |
| USEAST | &quot;UsEast&quot; |
| USWEST | &quot;UsWest&quot; |



