

# Webhook

The webhook that is being pinged

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | Determines whether the hook is actually triggered for the events it subscribes to. |  |
|**appId** | **Integer** | Only included for GitHub Apps. When you register a new GitHub App, GitHub sends a ping event to the webhook URL you specified during registration. The GitHub App ID sent in this field is required for authenticating an app. |  [optional] |
|**config** | [**WebhookConfig**](WebhookConfig.md) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**deliveriesUrl** | **URI** |  |  [optional] |
|**events** | **List&lt;String&gt;** | Determines what events the hook is triggered for. Default: [&#39;push&#39;]. |  |
|**id** | **Integer** | Unique identifier of the webhook. |  |
|**lastResponse** | [**HookResponse**](HookResponse.md) |  |  [optional] |
|**name** | [**NameEnum**](#NameEnum) | The type of webhook. The only valid value is &#39;web&#39;. |  |
|**pingUrl** | **URI** |  |  [optional] |
|**testUrl** | **URI** |  |  [optional] |
|**type** | **String** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**url** | **URI** |  |  [optional] |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| WEB | &quot;web&quot; |



