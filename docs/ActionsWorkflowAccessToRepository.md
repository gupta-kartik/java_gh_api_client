

# ActionsWorkflowAccessToRepository


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessLevel** | [**AccessLevelEnum**](#AccessLevelEnum) | Defines the level of access that workflows outside of the repository have to actions and reusable workflows within the repository.  &#x60;none&#x60; means the access is only possible from workflows in this repository. &#x60;user&#x60; level access allows sharing across user owned private repos only. &#x60;organization&#x60; level access allows sharing across the organization. |  |



## Enum: AccessLevelEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| USER | &quot;user&quot; |
| ORGANIZATION | &quot;organization&quot; |



