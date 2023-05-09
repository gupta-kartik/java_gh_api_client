

# OrgMembership

Org Membership

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** |  |  |
|**state** | [**StateEnum**](#StateEnum) | The state of the member in the organization. The &#x60;pending&#x60; state indicates the user has not yet accepted an invitation. |  |
|**role** | [**RoleEnum**](#RoleEnum) | The user&#39;s membership type in the organization. |  |
|**organizationUrl** | **URI** |  |  |
|**organization** | [**OrganizationSimple**](OrganizationSimple.md) |  |  |
|**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**permissions** | [**OrgMembershipPermissions**](OrgMembershipPermissions.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| PENDING | &quot;pending&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| MEMBER | &quot;member&quot; |
| BILLING_MANAGER | &quot;billing_manager&quot; |



