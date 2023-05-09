

# Authorization

The authorization for an OAuth app, GitHub App, or a Personal Access Token.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**url** | **URI** |  |  |
|**scopes** | **List&lt;String&gt;** | A list of scopes that this authorization is in. |  |
|**token** | **String** |  |  |
|**tokenLastEight** | **String** |  |  |
|**hashedToken** | **String** |  |  |
|**app** | [**AuthorizationApp**](AuthorizationApp.md) |  |  |
|**note** | **String** |  |  |
|**noteUrl** | **URI** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**fingerprint** | **String** |  |  |
|**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  [optional] |
|**installation** | [**NullableScopedInstallation**](NullableScopedInstallation.md) |  |  [optional] |
|**expiresAt** | **OffsetDateTime** |  |  |



