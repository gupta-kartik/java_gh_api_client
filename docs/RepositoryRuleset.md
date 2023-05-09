

# RepositoryRuleset

A set of rules to apply when specified conditions are met.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The ID of the ruleset |  |
|**name** | **String** | The name of the ruleset |  |
|**target** | [**TargetEnum**](#TargetEnum) | The target of the ruleset |  [optional] |
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) | The type of the source of the ruleset |  [optional] |
|**source** | **String** | The name of the source |  |
|**enforcement** | **RepositoryRuleEnforcement** |  |  |
|**bypassMode** | [**BypassModeEnum**](#BypassModeEnum) | The permission level required to bypass this ruleset. \&quot;repository\&quot; allows those with bypass permission at the repository level to bypass. \&quot;organization\&quot; allows those with bypass permission at the organization level to bypass. \&quot;none\&quot; prevents anyone from bypassing. |  [optional] |
|**bypassActors** | [**List&lt;RepositoryRulesetBypassActor&gt;**](RepositoryRulesetBypassActor.md) | The actors that can bypass the rules in this ruleset |  [optional] |
|**nodeId** | **String** |  |  [optional] |
|**links** | [**RepositoryRulesetLinks**](RepositoryRulesetLinks.md) |  |  [optional] |
|**conditions** | [**RepositoryRulesetConditions**](RepositoryRulesetConditions.md) |  |  [optional] |
|**rules** | [**List&lt;RepositoryRule&gt;**](RepositoryRule.md) |  |  [optional] |



## Enum: TargetEnum

| Name | Value |
|---- | -----|
| BRANCH | &quot;branch&quot; |
| TAG | &quot;tag&quot; |



## Enum: SourceTypeEnum

| Name | Value |
|---- | -----|
| REPOSITORY | &quot;Repository&quot; |
| ORGANIZATION | &quot;Organization&quot; |



## Enum: BypassModeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| REPOSITORY | &quot;repository&quot; |
| ORGANIZATION | &quot;organization&quot; |



