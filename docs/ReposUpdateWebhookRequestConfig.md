

# ReposUpdateWebhookRequestConfig

Key/value pairs to provide settings for this webhook. [These are defined below](https://docs.github.com/rest/reference/repos#create-hook-config-params).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** | The URL to which the payloads will be delivered. |  |
|**contentType** | **String** | The media type used to serialize the payloads. Supported values include &#x60;json&#x60; and &#x60;form&#x60;. The default is &#x60;form&#x60;. |  [optional] |
|**secret** | **String** | If provided, the &#x60;secret&#x60; will be used as the &#x60;key&#x60; to generate the HMAC hex digest value for [delivery signature headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers). |  [optional] |
|**insecureSsl** | [**WebhookConfigInsecureSsl**](WebhookConfigInsecureSsl.md) |  |  [optional] |
|**address** | **String** |  |  [optional] |
|**room** | **String** |  |  [optional] |



