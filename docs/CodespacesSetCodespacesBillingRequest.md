

# CodespacesSetCodespacesBillingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Which users can access codespaces in the organization. &#x60;disabled&#x60; means that no users can access codespaces in the organization. |  |
|**selectedUsernames** | **List&lt;String&gt;** | The usernames of the organization members who should have access to codespaces in the organization. Required when &#x60;visibility&#x60; is &#x60;selected_members&#x60;. The provided list of usernames will replace any existing value. |  [optional] |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;disabled&quot; |
| SELECTED_MEMBERS | &quot;selected_members&quot; |
| ALL_MEMBERS | &quot;all_members&quot; |
| ALL_MEMBERS_AND_OUTSIDE_COLLABORATORS | &quot;all_members_and_outside_collaborators&quot; |



