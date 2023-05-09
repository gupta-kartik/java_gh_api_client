

# DependencyGraphDiffInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**changeType** | [**ChangeTypeEnum**](#ChangeTypeEnum) |  |  |
|**manifest** | **String** |  |  |
|**ecosystem** | **String** |  |  |
|**name** | **String** |  |  |
|**version** | **String** |  |  |
|**packageUrl** | **String** |  |  |
|**license** | **String** |  |  |
|**sourceRepositoryUrl** | **String** |  |  |
|**vulnerabilities** | [**List&lt;DependencyGraphDiffInnerVulnerabilitiesInner&gt;**](DependencyGraphDiffInnerVulnerabilitiesInner.md) |  |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) | Where the dependency is utilized. &#x60;development&#x60; means that the dependency is only utilized in the development environment. &#x60;runtime&#x60; means that the dependency is utilized at runtime and in the development environment. |  |



## Enum: ChangeTypeEnum

| Name | Value |
|---- | -----|
| ADDED | &quot;added&quot; |
| REMOVED | &quot;removed&quot; |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| RUNTIME | &quot;runtime&quot; |
| DEVELOPMENT | &quot;development&quot; |



