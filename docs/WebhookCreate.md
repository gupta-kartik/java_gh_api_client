

# WebhookCreate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The repository&#39;s current description. |  |
|**enterprise** | [**Enterprise**](Enterprise.md) |  |  [optional] |
|**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional] |
|**masterBranch** | **String** | The name of the repository&#39;s default branch (usually &#x60;main&#x60;). |  |
|**organization** | [**OrganizationSimple**](OrganizationSimple.md) |  |  [optional] |
|**pusherType** | **String** | The pusher type for the event. Can be either &#x60;user&#x60; or a deploy key. |  |
|**ref** | **String** | The [&#x60;git ref&#x60;](https://docs.github.com/rest/reference/git#get-a-reference) resource. |  |
|**refType** | [**RefTypeEnum**](#RefTypeEnum) | The type of Git ref object created in the repository. |  |
|**repository** | [**Repository**](Repository.md) |  |  |
|**sender** | [**SimpleUser**](SimpleUser.md) |  |  |



## Enum: RefTypeEnum

| Name | Value |
|---- | -----|
| TAG | &quot;tag&quot; |
| BRANCH | &quot;branch&quot; |



