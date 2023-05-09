

# SecretScanningLocation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The location type. Because secrets may be found in different types of resources (ie. code, comments, issues), this field identifies the type of resource where the secret was found. |  |
|**details** | [**SecretScanningLocationDetails**](SecretScanningLocationDetails.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COMMIT | &quot;commit&quot; |
| ISSUE_TITLE | &quot;issue_title&quot; |
| ISSUE_BODY | &quot;issue_body&quot; |
| ISSUE_COMMENT | &quot;issue_comment&quot; |



