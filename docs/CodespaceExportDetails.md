

# CodespaceExportDetails

An export of a codespace. Also, latest export details for a codespace can be fetched with id = latest

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | **String** | State of the latest export |  [optional] |
|**completedAt** | **OffsetDateTime** | Completion time of the last export operation |  [optional] |
|**branch** | **String** | Name of the exported branch |  [optional] |
|**sha** | **String** | Git commit SHA of the exported branch |  [optional] |
|**id** | **String** | Id for the export details |  [optional] |
|**exportUrl** | **String** | Url for fetching export details |  [optional] |
|**htmlUrl** | **String** | Web url for the exported branch |  [optional] |



