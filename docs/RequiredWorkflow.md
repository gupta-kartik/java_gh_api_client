

# RequiredWorkflow


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **BigDecimal** | Unique identifier for a required workflow |  |
|**name** | **String** | Name present in the workflow file |  |
|**path** | **String** | Path of the workflow file |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) | Scope of the required workflow |  |
|**ref** | **String** | Ref at which the workflow file will be selected |  |
|**state** | [**StateEnum**](#StateEnum) | State of the required workflow |  |
|**selectedRepositoriesUrl** | **URI** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**repository** | [**MinimalRepository**](MinimalRepository.md) |  |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| SELECTED | &quot;selected&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



