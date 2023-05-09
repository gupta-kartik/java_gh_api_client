

# DependabotAlertWithRepositoryDependency

Details for the vulnerable dependency.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_package** | [**DependabotAlertPackage**](DependabotAlertPackage.md) |  |  [optional] |
|**manifestPath** | **String** | The full path to the dependency manifest file, relative to the root of the repository. |  [optional] [readonly] |
|**scope** | [**ScopeEnum**](#ScopeEnum) | The execution scope of the vulnerable dependency. |  [optional] [readonly] |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| DEVELOPMENT | &quot;development&quot; |
| RUNTIME | &quot;runtime&quot; |



