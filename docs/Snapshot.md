

# Snapshot

Create a new snapshot of a repository's dependencies.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **Integer** | The version of the repository snapshot submission. |  |
|**job** | [**SnapshotJob**](SnapshotJob.md) |  |  |
|**sha** | **String** | The commit SHA associated with this dependency snapshot. Maximum length: 40 characters. |  |
|**ref** | **String** | The repository branch that triggered this snapshot. |  |
|**detector** | [**SnapshotDetector**](SnapshotDetector.md) |  |  |
|**metadata** | [**Map&lt;String, Metadata1&gt;**](Metadata1.md) | User-defined metadata to store domain-specific information limited to 8 keys with scalar values. |  [optional] |
|**manifests** | [**Map&lt;String, Manifest&gt;**](Manifest.md) | A collection of package manifests, which are a collection of related dependencies declared in a file or representing a logical group of dependencies. |  [optional] |
|**scanned** | **OffsetDateTime** | The time at which the snapshot was scanned. |  |



