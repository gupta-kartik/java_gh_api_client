

# Migration

A migration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**owner** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**guid** | **String** |  |  |
|**state** | **String** |  |  |
|**lockRepositories** | **Boolean** |  |  |
|**excludeMetadata** | **Boolean** |  |  |
|**excludeGitData** | **Boolean** |  |  |
|**excludeAttachments** | **Boolean** |  |  |
|**excludeReleases** | **Boolean** |  |  |
|**excludeOwnerProjects** | **Boolean** |  |  |
|**orgMetadataOnly** | **Boolean** |  |  |
|**repositories** | [**List&lt;Repository&gt;**](Repository.md) | The repositories included in the migration. Only returned for export migrations. |  |
|**url** | **URI** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**nodeId** | **String** |  |  |
|**archiveUrl** | **URI** |  |  [optional] |
|**exclude** | **List&lt;String&gt;** | Exclude related items from being returned in the response in order to improve performance of the request. The array can include any of: &#x60;\&quot;repositories\&quot;&#x60;. |  [optional] |



