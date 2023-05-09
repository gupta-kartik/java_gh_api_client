

# CodeScanningCodeqlDatabase

A CodeQL database.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The ID of the CodeQL database. |  |
|**name** | **String** | The name of the CodeQL database. |  |
|**language** | **String** | The language of the CodeQL database. |  |
|**uploader** | [**SimpleUser**](SimpleUser.md) |  |  |
|**contentType** | **String** | The MIME type of the CodeQL database file. |  |
|**size** | **Integer** | The size of the CodeQL database file in bytes. |  |
|**createdAt** | **OffsetDateTime** | The date and time at which the CodeQL database was created, in ISO 8601 format&#39;:&#39; YYYY-MM-DDTHH:MM:SSZ. |  |
|**updatedAt** | **OffsetDateTime** | The date and time at which the CodeQL database was last updated, in ISO 8601 format&#39;:&#39; YYYY-MM-DDTHH:MM:SSZ. |  |
|**url** | **URI** | The URL at which to download the CodeQL database. The &#x60;Accept&#x60; header must be set to the value of the &#x60;content_type&#x60; property. |  |



