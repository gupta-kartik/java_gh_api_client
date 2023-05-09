

# ActionsCreateRequiredWorkflowRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**workflowFilePath** | **String** | Path of the workflow file to be configured as a required workflow. |  |
|**repositoryId** | **String** | The ID of the repository that contains the workflow file. |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) | Enable the required workflow for all repositories or selected repositories in the organization. |  [optional] |
|**selectedRepositoryIds** | **List&lt;Integer&gt;** | A list of repository IDs where you want to enable the required workflow. You can only provide a list of repository ids when the &#x60;scope&#x60; is set to &#x60;selected&#x60;. |  [optional] |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| SELECTED | &quot;selected&quot; |
| ALL | &quot;all&quot; |



