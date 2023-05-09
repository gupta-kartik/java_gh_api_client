

# DiffEntry

Diff Entry

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sha** | **String** |  |  |
|**filename** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**additions** | **Integer** |  |  |
|**deletions** | **Integer** |  |  |
|**changes** | **Integer** |  |  |
|**blobUrl** | **URI** |  |  |
|**rawUrl** | **URI** |  |  |
|**contentsUrl** | **URI** |  |  |
|**patch** | **String** |  |  [optional] |
|**previousFilename** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ADDED | &quot;added&quot; |
| REMOVED | &quot;removed&quot; |
| MODIFIED | &quot;modified&quot; |
| RENAMED | &quot;renamed&quot; |
| COPIED | &quot;copied&quot; |
| CHANGED | &quot;changed&quot; |
| UNCHANGED | &quot;unchanged&quot; |



