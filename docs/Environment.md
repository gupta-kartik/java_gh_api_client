

# Environment

Details of a deployment environment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The id of the environment. |  |
|**nodeId** | **String** |  |  |
|**name** | **String** | The name of the environment. |  |
|**url** | **String** |  |  |
|**htmlUrl** | **String** |  |  |
|**createdAt** | **OffsetDateTime** | The time that the environment was created, in ISO 8601 format. |  |
|**updatedAt** | **OffsetDateTime** | The time that the environment was last updated, in ISO 8601 format. |  |
|**protectionRules** | [**List&lt;EnvironmentProtectionRulesInner&gt;**](EnvironmentProtectionRulesInner.md) | Built-in deployment protection rules for the environment. |  [optional] |
|**deploymentBranchPolicy** | [**DeploymentBranchPolicySettings**](DeploymentBranchPolicySettings.md) |  |  [optional] |



