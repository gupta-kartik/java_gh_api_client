

# MigrationsSetLfsPreferenceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**useLfs** | [**UseLfsEnum**](#UseLfsEnum) | Whether to store large files during the import. &#x60;opt_in&#x60; means large files will be stored using Git LFS. &#x60;opt_out&#x60; means large files will be removed during the import. |  |



## Enum: UseLfsEnum

| Name | Value |
|---- | -----|
| IN | &quot;opt_in&quot; |
| OUT | &quot;opt_out&quot; |



