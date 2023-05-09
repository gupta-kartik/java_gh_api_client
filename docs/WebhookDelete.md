

# WebhookDelete


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enterprise** | [**Enterprise**](Enterprise.md) |  |  [optional] |
|**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional] |
|**organization** | [**OrganizationSimple**](OrganizationSimple.md) |  |  [optional] |
|**pusherType** | **String** | The pusher type for the event. Can be either &#x60;user&#x60; or a deploy key. |  |
|**ref** | **String** | The [&#x60;git ref&#x60;](https://docs.github.com/rest/reference/git#get-a-reference) resource. |  |
|**refType** | [**RefTypeEnum**](#RefTypeEnum) | The type of Git ref object deleted in the repository. |  |
|**repository** | [**Repository**](Repository.md) |  |  |
|**sender** | [**SimpleUser**](SimpleUser.md) |  |  |



## Enum: RefTypeEnum

| Name | Value |
|---- | -----|
| TAG | &quot;tag&quot; |
| BRANCH | &quot;branch&quot; |



