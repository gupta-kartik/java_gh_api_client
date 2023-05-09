

# Release

The [release](https://docs.github.com/rest/reference/repos/#get-a-release) object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assets** | [**List&lt;ReleaseAsset&gt;**](ReleaseAsset.md) |  |  |
|**assetsUrl** | **URI** |  |  |
|**author** | [**User**](User.md) |  |  |
|**body** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**discussionUrl** | **URI** |  |  [optional] |
|**draft** | **Boolean** | Whether the release is a draft or published |  |
|**htmlUrl** | **URI** |  |  |
|**id** | **Integer** |  |  |
|**name** | **String** |  |  |
|**nodeId** | **String** |  |  |
|**prerelease** | **Boolean** | Whether the release is identified as a prerelease or a full release. |  |
|**publishedAt** | **OffsetDateTime** |  |  |
|**reactions** | [**Reactions**](Reactions.md) |  |  [optional] |
|**tagName** | **String** | The name of the tag. |  |
|**tarballUrl** | **URI** |  |  |
|**targetCommitish** | **String** | Specifies the commitish value that determines where the Git tag is created from. |  |
|**uploadUrl** | **String** |  |  |
|**url** | **URI** |  |  |
|**zipballUrl** | **URI** |  |  |



