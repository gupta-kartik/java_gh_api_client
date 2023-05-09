

# WebhookDeploymentProtectionRuleRequested


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) |  |  [optional] |
|**environment** | **String** | The name of the environment that has the deployment protection rule. |  [optional] |
|**event** | **String** | The event that triggered the deployment protection rule. |  [optional] |
|**deploymentCallbackUrl** | **URI** | The URL to review the deployment protection rule. |  [optional] |
|**deployment** | [**Deployment**](Deployment.md) |  |  [optional] |
|**pullRequests** | [**List&lt;PullRequest&gt;**](PullRequest.md) |  |  [optional] |
|**repository** | [**Repository**](Repository.md) |  |  [optional] |
|**organization** | [**OrganizationSimple**](OrganizationSimple.md) |  |  [optional] |
|**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional] |
|**sender** | [**SimpleUser**](SimpleUser.md) |  |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| REQUESTED | &quot;requested&quot; |



