

# ReposCreateOrgRulesetRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the ruleset. |  |
|**target** | [**TargetEnum**](#TargetEnum) | The target of the ruleset. |  [optional] |
|**enforcement** | **RepositoryRuleEnforcement** |  |  |
|**bypassActors** | [**List&lt;RepositoryRulesetBypassActor&gt;**](RepositoryRulesetBypassActor.md) | The actors that can bypass the rules in this ruleset |  [optional] |
|**conditions** | [**OrgRulesetConditions**](OrgRulesetConditions.md) |  |  [optional] |
|**rules** | [**List&lt;RepositoryRule&gt;**](RepositoryRule.md) | An array of rules within the ruleset. |  [optional] |



## Enum: TargetEnum

| Name | Value |
|---- | -----|
| BRANCH | &quot;branch&quot; |
| TAG | &quot;tag&quot; |



