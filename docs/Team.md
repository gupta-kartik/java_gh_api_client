

# Team

Groups of organization members that gives permissions on specified repositories.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleted** | **Boolean** |  |  [optional] |
|**description** | **String** | Description of the team |  [optional] |
|**htmlUrl** | **URI** |  |  [optional] |
|**id** | **Integer** | Unique identifier of the team |  |
|**membersUrl** | **String** |  |  [optional] |
|**name** | **String** | Name of the team |  |
|**nodeId** | **String** |  |  [optional] |
|**parent** | [**TeamParent**](TeamParent.md) |  |  [optional] |
|**permission** | **String** | Permission that the team will have for its repositories |  [optional] |
|**privacy** | [**PrivacyEnum**](#PrivacyEnum) |  |  [optional] |
|**notificationSetting** | [**NotificationSettingEnum**](#NotificationSettingEnum) |  |  [optional] |
|**repositoriesUrl** | **URI** |  |  [optional] |
|**slug** | **String** |  |  [optional] |
|**url** | **URI** | URL for the team |  [optional] |



## Enum: PrivacyEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |
| SECRET | &quot;secret&quot; |



## Enum: NotificationSettingEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;notifications_enabled&quot; |
| DISABLED | &quot;notifications_disabled&quot; |



