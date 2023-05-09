

# WebhookCodeScanningAlertAppearedInBranch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) |  |  |
|**alert** | [**WebhookCodeScanningAlertAppearedInBranchAlert**](WebhookCodeScanningAlertAppearedInBranchAlert.md) |  |  |
|**commitOid** | **String** | The commit SHA of the code scanning alert. When the action is &#x60;reopened_by_user&#x60; or &#x60;closed_by_user&#x60;, the event was triggered by the &#x60;sender&#x60; and this value will be empty. |  |
|**enterprise** | [**Enterprise**](Enterprise.md) |  |  [optional] |
|**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional] |
|**organization** | [**OrganizationSimple**](OrganizationSimple.md) |  |  [optional] |
|**ref** | **String** | The Git reference of the code scanning alert. When the action is &#x60;reopened_by_user&#x60; or &#x60;closed_by_user&#x60;, the event was triggered by the &#x60;sender&#x60; and this value will be empty. |  |
|**repository** | [**Repository**](Repository.md) |  |  |
|**sender** | [**SimpleUser**](SimpleUser.md) |  |  |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| APPEARED_IN_BRANCH | &quot;appeared_in_branch&quot; |



