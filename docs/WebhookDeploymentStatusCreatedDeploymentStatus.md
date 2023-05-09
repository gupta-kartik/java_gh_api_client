

# WebhookDeploymentStatusCreatedDeploymentStatus

The [deployment status](https://docs.github.com/rest/reference/deployments#list-deployment-statuses).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **String** |  |  |
|**creator** | [**User**](User.md) |  |  |
|**deploymentUrl** | **URI** |  |  |
|**description** | **String** | The optional human-readable description added to the status. |  |
|**environment** | **String** |  |  |
|**environmentUrl** | **URI** |  |  [optional] |
|**id** | **Integer** |  |  |
|**logUrl** | **URI** |  |  [optional] |
|**nodeId** | **String** |  |  |
|**performedViaGithubApp** | [**App5**](App5.md) |  |  [optional] |
|**repositoryUrl** | **URI** |  |  |
|**state** | **String** | The new state. Can be &#x60;pending&#x60;, &#x60;success&#x60;, &#x60;failure&#x60;, or &#x60;error&#x60;. |  |
|**targetUrl** | **String** | The optional link added to the status. |  |
|**updatedAt** | **String** |  |  |
|**url** | **URI** |  |  |



