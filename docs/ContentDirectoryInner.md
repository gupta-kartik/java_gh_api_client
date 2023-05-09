

# ContentDirectoryInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**size** | **Integer** |  |  |
|**name** | **String** |  |  |
|**path** | **String** |  |  |
|**content** | **String** |  |  [optional] |
|**sha** | **String** |  |  |
|**url** | **URI** |  |  |
|**gitUrl** | **URI** |  |  |
|**htmlUrl** | **URI** |  |  |
|**downloadUrl** | **URI** |  |  |
|**links** | [**ContentTreeEntriesInnerLinks**](ContentTreeEntriesInnerLinks.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DIR | &quot;dir&quot; |
| FILE | &quot;file&quot; |
| SUBMODULE | &quot;submodule&quot; |
| SYMLINK | &quot;symlink&quot; |



