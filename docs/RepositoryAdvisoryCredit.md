

# RepositoryAdvisoryCredit

A credit given to a user for a repository security advisory.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**user** | [**SimpleUser**](SimpleUser.md) |  |  |
|**type** | **SecurityAdvisoryCreditTypes** |  |  |
|**state** | [**StateEnum**](#StateEnum) | The state of the user&#39;s acceptance of the credit. |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;accepted&quot; |
| DECLINED | &quot;declined&quot; |
| PENDING | &quot;pending&quot; |



