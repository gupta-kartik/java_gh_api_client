

# ProjectsUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the project |  [optional] |
|**body** | **String** | Body of the project |  [optional] |
|**state** | **String** | State of the project; either &#39;open&#39; or &#39;closed&#39; |  [optional] |
|**organizationPermission** | [**OrganizationPermissionEnum**](#OrganizationPermissionEnum) | The baseline permission that all organization members have on this project |  [optional] |
|**_private** | **Boolean** | Whether or not this project can be seen by everyone. |  [optional] |



## Enum: OrganizationPermissionEnum

| Name | Value |
|---- | -----|
| READ | &quot;read&quot; |
| WRITE | &quot;write&quot; |
| ADMIN | &quot;admin&quot; |
| NONE | &quot;none&quot; |



