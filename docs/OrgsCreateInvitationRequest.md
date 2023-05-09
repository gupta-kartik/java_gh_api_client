

# OrgsCreateInvitationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inviteeId** | **Integer** | **Required unless you provide &#x60;email&#x60;**. GitHub user ID for the person you are inviting. |  [optional] |
|**email** | **String** | **Required unless you provide &#x60;invitee_id&#x60;**. Email address of the person you are inviting, which can be an existing GitHub user. |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | The role for the new member.   * &#x60;admin&#x60; - Organization owners with full administrative rights to the organization and complete access to all repositories and teams.    * &#x60;direct_member&#x60; - Non-owner organization members with ability to see other members and join teams by invitation.    * &#x60;billing_manager&#x60; - Non-owner organization members with ability to manage the billing settings of your organization. |  [optional] |
|**teamIds** | **List&lt;Integer&gt;** | Specify IDs for the teams you want to invite new members to. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| DIRECT_MEMBER | &quot;direct_member&quot; |
| BILLING_MANAGER | &quot;billing_manager&quot; |



