

# NullableIntegration

GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the GitHub app |  |
|**slug** | **String** | The slug name of the GitHub app |  [optional] |
|**nodeId** | **String** |  |  |
|**owner** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**name** | **String** | The name of the GitHub app |  |
|**description** | **String** |  |  |
|**externalUrl** | **URI** |  |  |
|**htmlUrl** | **URI** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**permissions** | **IntegrationPermissions** |  |  |
|**events** | **List&lt;String&gt;** | The list of events for the GitHub app |  |
|**installationsCount** | **Integer** | The number of installations associated with the GitHub app |  [optional] |
|**clientId** | **String** |  |  [optional] |
|**clientSecret** | **String** |  |  [optional] |
|**webhookSecret** | **String** |  |  [optional] |
|**pem** | **String** |  |  [optional] |



