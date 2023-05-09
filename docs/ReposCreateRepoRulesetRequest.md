

# ReposCreateRepoRulesetRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the ruleset. |  |
|**target** | [**TargetEnum**](#TargetEnum) | The target of the ruleset. |  [optional] |
|**enforcement** | **RepositoryRuleEnforcement** |  |  |
|**bypassMode** | [**BypassModeEnum**](#BypassModeEnum) | The permission level required to bypass this ruleset. \&quot;repository\&quot; allows those with bypass permission at the repository level to bypass. \&quot;organization\&quot; allows those with bypass permission at the organization level to bypass. \&quot;none\&quot; prevents anyone from bypassing. |  [optional] |
|**bypassActors** | [**List&lt;RepositoryRulesetBypassActor&gt;**](RepositoryRulesetBypassActor.md) | The actors that can bypass the rules in this ruleset |  [optional] |
|**conditions** | [**RepositoryRulesetConditions**](RepositoryRulesetConditions.md) |  |  [optional] |
|**rules** | [**List&lt;RepositoryRule&gt;**](RepositoryRule.md) | An array of rules within the ruleset. |  [optional] |



## Enum: TargetEnum

| Name | Value |
|---- | -----|
| BRANCH | &quot;branch&quot; |
| TAG | &quot;tag&quot; |



## Enum: BypassModeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| REPOSITORY | &quot;repository&quot; |
| ORGANIZATION | &quot;organization&quot; |



