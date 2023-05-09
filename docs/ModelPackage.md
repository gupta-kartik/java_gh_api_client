

# ModelPackage

A software package

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the package. |  |
|**name** | **String** | The name of the package. |  |
|**packageType** | [**PackageTypeEnum**](#PackageTypeEnum) |  |  |
|**url** | **String** |  |  |
|**htmlUrl** | **String** |  |  |
|**versionCount** | **Integer** | The number of versions of the package. |  |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) |  |  |
|**owner** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  [optional] |
|**repository** | [**NullableMinimalRepository**](NullableMinimalRepository.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: PackageTypeEnum

| Name | Value |
|---- | -----|
| NPM | &quot;npm&quot; |
| MAVEN | &quot;maven&quot; |
| RUBYGEMS | &quot;rubygems&quot; |
| DOCKER | &quot;docker&quot; |
| NUGET | &quot;nuget&quot; |
| CONTAINER | &quot;container&quot; |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |
| PUBLIC | &quot;public&quot; |



