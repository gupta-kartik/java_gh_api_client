

# DeploymentSimple

A deployment created as the result of an Actions check run from a workflow that references an environment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** |  |  |
|**id** | **Integer** | Unique identifier of the deployment |  |
|**nodeId** | **String** |  |  |
|**task** | **String** | Parameter to specify a task to execute |  |
|**originalEnvironment** | **String** |  |  [optional] |
|**environment** | **String** | Name for the target deployment environment. |  |
|**description** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**statusesUrl** | **URI** |  |  |
|**repositoryUrl** | **URI** |  |  |
|**transientEnvironment** | **Boolean** | Specifies if the given environment is will no longer exist at some point in the future. Default: false. |  [optional] |
|**productionEnvironment** | **Boolean** | Specifies if the given environment is one that end-users directly interact with. Default: false. |  [optional] |
|**performedViaGithubApp** | [**NullableIntegration**](NullableIntegration.md) |  |  [optional] |



