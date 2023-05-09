

# HookDelivery

Delivery made by a webhook.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the delivery. |  |
|**guid** | **String** | Unique identifier for the event (shared with all deliveries for all webhooks that subscribe to this event). |  |
|**deliveredAt** | **OffsetDateTime** | Time when the delivery was delivered. |  |
|**redelivery** | **Boolean** | Whether the delivery is a redelivery. |  |
|**duration** | **BigDecimal** | Time spent delivering. |  |
|**status** | **String** | Description of the status of the attempted delivery |  |
|**statusCode** | **Integer** | Status code received when delivery was made. |  |
|**event** | **String** | The event that triggered the delivery. |  |
|**action** | **String** | The type of activity for the event that triggered the delivery. |  |
|**installationId** | **Integer** | The id of the GitHub App installation associated with this event. |  |
|**repositoryId** | **Integer** | The id of the repository associated with this event. |  |
|**url** | **String** | The URL target of the delivery. |  [optional] |
|**request** | [**HookDeliveryRequest**](HookDeliveryRequest.md) |  |  |
|**response** | [**HookDeliveryResponse**](HookDeliveryResponse.md) |  |  |



