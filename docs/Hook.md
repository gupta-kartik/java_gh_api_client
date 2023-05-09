

# Hook

Webhooks for repositories.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** |  |  |
|**id** | **Integer** | Unique identifier of the webhook. |  |
|**name** | **String** | The name of a valid service, use &#39;web&#39; for a webhook. |  |
|**active** | **Boolean** | Determines whether the hook is actually triggered on pushes. |  |
|**events** | **List&lt;String&gt;** | Determines what events the hook is triggered for. Default: [&#39;push&#39;]. |  |
|**config** | [**HookConfig**](HookConfig.md) |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**url** | **URI** |  |  |
|**testUrl** | **URI** |  |  |
|**pingUrl** | **URI** |  |  |
|**deliveriesUrl** | **URI** |  |  [optional] |
|**lastResponse** | [**HookResponse**](HookResponse.md) |  |  |



