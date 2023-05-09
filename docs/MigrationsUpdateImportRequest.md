

# MigrationsUpdateImportRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vcsUsername** | **String** | The username to provide to the originating repository. |  [optional] |
|**vcsPassword** | **String** | The password to provide to the originating repository. |  [optional] |
|**vcs** | [**VcsEnum**](#VcsEnum) | The type of version control system you are migrating from. |  [optional] |
|**tfvcProject** | **String** | For a tfvc import, the name of the project that is being imported. |  [optional] |



## Enum: VcsEnum

| Name | Value |
|---- | -----|
| SUBVERSION | &quot;subversion&quot; |
| TFVC | &quot;tfvc&quot; |
| GIT | &quot;git&quot; |
| MERCURIAL | &quot;mercurial&quot; |



