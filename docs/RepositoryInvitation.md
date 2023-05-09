

# RepositoryInvitation

Repository invitations let you manage who you collaborate with.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the repository invitation. |  |
|**repository** | [**MinimalRepository**](MinimalRepository.md) |  |  |
|**invitee** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**inviter** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**permissions** | [**PermissionsEnum**](#PermissionsEnum) | The permission associated with the invitation. |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**expired** | **Boolean** | Whether or not the invitation has expired |  [optional] |
|**url** | **String** | URL for the repository invitation |  |
|**htmlUrl** | **String** |  |  |
|**nodeId** | **String** |  |  |



## Enum: PermissionsEnum

| Name | Value |
|---- | -----|
| READ | &quot;read&quot; |
| WRITE | &quot;write&quot; |
| ADMIN | &quot;admin&quot; |
| TRIAGE | &quot;triage&quot; |
| MAINTAIN | &quot;maintain&quot; |



