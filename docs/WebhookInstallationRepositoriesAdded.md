

# WebhookInstallationRepositoriesAdded


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) |  |  |
|**enterprise** | [**Enterprise**](Enterprise.md) |  |  [optional] |
|**installation** | [**Installation**](Installation.md) |  |  |
|**organization** | [**OrganizationSimple**](OrganizationSimple.md) |  |  [optional] |
|**repositoriesAdded** | [**List&lt;PersonalAccessTokenRequestRepositoriesInner&gt;**](PersonalAccessTokenRequestRepositoriesInner.md) | An array of repository objects, which were added to the installation. |  |
|**repositoriesRemoved** | [**List&lt;WebhookInstallationRepositoriesAddedRepositoriesRemovedInner&gt;**](WebhookInstallationRepositoriesAddedRepositoriesRemovedInner.md) | An array of repository objects, which were removed from the installation. |  |
|**repository** | [**Repository**](Repository.md) |  |  [optional] |
|**repositorySelection** | [**RepositorySelectionEnum**](#RepositorySelectionEnum) | Describe whether all repositories have been selected or there&#39;s a selection involved |  |
|**requester** | [**User**](User.md) |  |  |
|**sender** | [**SimpleUser**](SimpleUser.md) |  |  |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| ADDED | &quot;added&quot; |



## Enum: RepositorySelectionEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| SELECTED | &quot;selected&quot; |



