

# AppsCreateFromManifest201Response


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
|**clientId** | **String** |  |  |
|**clientSecret** | **String** |  |  |
|**webhookSecret** | **String** |  |  |
|**pem** | **String** |  |  |



