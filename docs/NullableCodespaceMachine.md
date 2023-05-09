

# NullableCodespaceMachine

A description of the machine powering a codespace.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the machine. |  |
|**displayName** | **String** | The display name of the machine includes cores, memory, and storage. |  |
|**operatingSystem** | **String** | The operating system of the machine. |  |
|**storageInBytes** | **Integer** | How much storage is available to the codespace. |  |
|**memoryInBytes** | **Integer** | How much memory is available to the codespace. |  |
|**cpus** | **Integer** | How many cores are available to the codespace. |  |
|**prebuildAvailability** | [**PrebuildAvailabilityEnum**](#PrebuildAvailabilityEnum) | Whether a prebuild is currently available when creating a codespace for this machine and repository. If a branch was not specified as a ref, the default branch will be assumed. Value will be \&quot;null\&quot; if prebuilds are not supported or prebuild availability could not be determined. Value will be \&quot;none\&quot; if no prebuild is available. Latest values \&quot;ready\&quot; and \&quot;in_progress\&quot; indicate the prebuild availability status. |  |



## Enum: PrebuildAvailabilityEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| READY | &quot;ready&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |



