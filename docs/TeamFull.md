

# TeamFull

Groups of organization members that gives permissions on specified repositories.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the team |  |
|**nodeId** | **String** |  |  |
|**url** | **URI** | URL for the team |  |
|**htmlUrl** | **URI** |  |  |
|**name** | **String** | Name of the team |  |
|**slug** | **String** |  |  |
|**description** | **String** |  |  |
|**privacy** | [**PrivacyEnum**](#PrivacyEnum) | The level of privacy this team should have |  [optional] |
|**notificationSetting** | [**NotificationSettingEnum**](#NotificationSettingEnum) | The notification setting the team has set |  [optional] |
|**permission** | **String** | Permission that the team will have for its repositories |  |
|**membersUrl** | **String** |  |  |
|**repositoriesUrl** | **URI** |  |  |
|**parent** | [**NullableTeamSimple**](NullableTeamSimple.md) |  |  [optional] |
|**membersCount** | **Integer** |  |  |
|**reposCount** | **Integer** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**organization** | [**TeamOrganization**](TeamOrganization.md) |  |  |
|**ldapDn** | **String** | Distinguished Name (DN) that team maps to within LDAP environment |  [optional] |



## Enum: PrivacyEnum

| Name | Value |
|---- | -----|
| CLOSED | &quot;closed&quot; |
| SECRET | &quot;secret&quot; |



## Enum: NotificationSettingEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;notifications_enabled&quot; |
| DISABLED | &quot;notifications_disabled&quot; |



