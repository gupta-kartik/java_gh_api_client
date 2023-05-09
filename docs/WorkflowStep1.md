

# WorkflowStep1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**completedAt** | **String** |  |  |
|**conclusion** | [**ConclusionEnum**](#ConclusionEnum) |  |  |
|**name** | **String** |  |  |
|**number** | **Integer** |  |  |
|**startedAt** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |



## Enum: ConclusionEnum

| Name | Value |
|---- | -----|
| FAILURE | &quot;failure&quot; |
| SKIPPED | &quot;skipped&quot; |
| SUCCESS | &quot;success&quot; |
| NULL | &quot;null&quot; |
| CANCELLED | &quot;cancelled&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |
| QUEUED | &quot;queued&quot; |
| PENDING | &quot;pending&quot; |



