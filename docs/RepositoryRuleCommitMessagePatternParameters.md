

# RepositoryRuleCommitMessagePatternParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | How this rule will appear to users. |  [optional] |
|**negate** | **Boolean** | If true, the rule will fail if the pattern matches. |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The operator to use for matching. |  |
|**pattern** | **String** | The pattern to match with. |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| STARTS_WITH | &quot;starts_with&quot; |
| ENDS_WITH | &quot;ends_with&quot; |
| CONTAINS | &quot;contains&quot; |
| REGEX | &quot;regex&quot; |



