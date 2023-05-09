

# CodespacesCreateForAuthenticatedUserRequestOneOf1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pullRequest** | [**CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest**](CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest.md) |  |  |
|**location** | **String** | The requested location for a new codespace. Best efforts are made to respect this upon creation. Assigned by IP if not provided. |  [optional] |
|**geo** | [**GeoEnum**](#GeoEnum) | The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces &#x60;location&#x60;, which is being deprecated. |  [optional] |
|**machine** | **String** | Machine type to use for this codespace |  [optional] |
|**devcontainerPath** | **String** | Path to devcontainer.json config to use for this codespace |  [optional] |
|**workingDirectory** | **String** | Working directory for this codespace |  [optional] |
|**idleTimeoutMinutes** | **Integer** | Time in minutes before codespace stops from inactivity |  [optional] |



## Enum: GeoEnum

| Name | Value |
|---- | -----|
| EUROPEWEST | &quot;EuropeWest&quot; |
| SOUTHEASTASIA | &quot;SoutheastAsia&quot; |
| USEAST | &quot;UsEast&quot; |
| USWEST | &quot;UsWest&quot; |



