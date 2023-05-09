

# WorkflowStep4


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
| CANCELLED | &quot;cancelled&quot; |
| NULL | &quot;null&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;completed&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| QUEUED | &quot;queued&quot; |
| PENDING | &quot;pending&quot; |
| WAITING | &quot;waiting&quot; |



