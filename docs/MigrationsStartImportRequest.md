

# MigrationsStartImportRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vcsUrl** | **String** | The URL of the originating repository. |  |
|**vcs** | [**VcsEnum**](#VcsEnum) | The originating VCS type. Without this parameter, the import job will take additional time to detect the VCS type before beginning the import. This detection step will be reflected in the response. |  [optional] |
|**vcsUsername** | **String** | If authentication is required, the username to provide to &#x60;vcs_url&#x60;. |  [optional] |
|**vcsPassword** | **String** | If authentication is required, the password to provide to &#x60;vcs_url&#x60;. |  [optional] |
|**tfvcProject** | **String** | For a tfvc import, the name of the project that is being imported. |  [optional] |



## Enum: VcsEnum

| Name | Value |
|---- | -----|
| SUBVERSION | &quot;subversion&quot; |
| GIT | &quot;git&quot; |
| MERCURIAL | &quot;mercurial&quot; |
| TFVC | &quot;tfvc&quot; |



