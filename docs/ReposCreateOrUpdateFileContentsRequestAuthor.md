

# ReposCreateOrUpdateFileContentsRequestAuthor

The author of the file. Default: The `committer` or the authenticated user if you omit `committer`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the author or committer of the commit. You&#39;ll receive a &#x60;422&#x60; status code if &#x60;name&#x60; is omitted. |  |
|**email** | **String** | The email of the author or committer of the commit. You&#39;ll receive a &#x60;422&#x60; status code if &#x60;email&#x60; is omitted. |  |
|**date** | **String** |  |  [optional] |



