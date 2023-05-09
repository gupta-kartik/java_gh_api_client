

# WebhookGollumPagesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | The action that was performed on the page. Can be &#x60;created&#x60; or &#x60;edited&#x60;. |  |
|**htmlUrl** | **URI** | Points to the HTML wiki page. |  |
|**pageName** | **String** | The name of the page. |  |
|**sha** | **String** | The latest commit SHA of the page. |  |
|**summary** | **String** |  |  |
|**title** | **String** | The current page title. |  |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| EDITED | &quot;edited&quot; |



