

# SecretScanningLocationDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**path** | **String** | The file path in the repository |  |
|**startLine** | **BigDecimal** | Line number at which the secret starts in the file |  |
|**endLine** | **BigDecimal** | Line number at which the secret ends in the file |  |
|**startColumn** | **BigDecimal** | The column at which the secret starts within the start line when the file is interpreted as 8BIT ASCII |  |
|**endColumn** | **BigDecimal** | The column at which the secret ends within the end line when the file is interpreted as 8BIT ASCII |  |
|**blobSha** | **String** | SHA-1 hash ID of the associated blob |  |
|**blobUrl** | **String** | The API URL to get the associated blob resource |  |
|**commitSha** | **String** | SHA-1 hash ID of the associated commit |  |
|**commitUrl** | **String** | The API URL to get the associated commit resource |  |
|**issueTitleUrl** | **URI** | The API URL to get the issue where the secret was detected. |  |
|**issueBodyUrl** | **URI** | The API URL to get the issue where the secret was detected. |  |
|**issueCommentUrl** | **URI** | The API URL to get the issue comment where the secret was detected. |  |



