

# TeamsUpdateLegacyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the team. |  |
|**description** | **String** | The description of the team. |  [optional] |
|**privacy** | [**PrivacyEnum**](#PrivacyEnum) | The level of privacy this team should have. Editing teams without specifying this parameter leaves &#x60;privacy&#x60; intact. The options are:   **For a non-nested team:**    * &#x60;secret&#x60; - only visible to organization owners and members of this team.    * &#x60;closed&#x60; - visible to all members of this organization.   **For a parent or child team:**    * &#x60;closed&#x60; - visible to all members of this organization. |  [optional] |
|**notificationSetting** | [**NotificationSettingEnum**](#NotificationSettingEnum) | The notification setting the team has chosen. Editing teams without specifying this parameter leaves &#x60;notification_setting&#x60; intact. The options are:   * &#x60;notifications_enabled&#x60; - team members receive notifications when the team is @mentioned.    * &#x60;notifications_disabled&#x60; - no one receives notifications. |  [optional] |
|**permission** | [**PermissionEnum**](#PermissionEnum) | **Deprecated**. The permission that new repositories will be added to the team with when none is specified. |  [optional] |
|**parentTeamId** | **Integer** | The ID of a team to set as the parent team. |  [optional] |



## Enum: PrivacyEnum

| Name | Value |
|---- | -----|
| SECRET | &quot;secret&quot; |
| CLOSED | &quot;closed&quot; |



## Enum: NotificationSettingEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;notifications_enabled&quot; |
| DISABLED | &quot;notifications_disabled&quot; |



## Enum: PermissionEnum

| Name | Value |
|---- | -----|
| PULL | &quot;pull&quot; |
| PUSH | &quot;push&quot; |
| ADMIN | &quot;admin&quot; |



