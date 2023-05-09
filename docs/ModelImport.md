

# ModelImport

A repository import from an external source.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vcs** | **String** |  |  |
|**useLfs** | **Boolean** |  |  [optional] |
|**vcsUrl** | **String** | The URL of the originating repository. |  |
|**svcRoot** | **String** |  |  [optional] |
|**tfvcProject** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**statusText** | **String** |  |  [optional] |
|**failedStep** | **String** |  |  [optional] |
|**errorMessage** | **String** |  |  [optional] |
|**importPercent** | **Integer** |  |  [optional] |
|**commitCount** | **Integer** |  |  [optional] |
|**pushPercent** | **Integer** |  |  [optional] |
|**hasLargeFiles** | **Boolean** |  |  [optional] |
|**largeFilesSize** | **Integer** |  |  [optional] |
|**largeFilesCount** | **Integer** |  |  [optional] |
|**projectChoices** | [**List&lt;ImportProjectChoicesInner&gt;**](ImportProjectChoicesInner.md) |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**authorsCount** | **Integer** |  |  [optional] |
|**url** | **URI** |  |  |
|**htmlUrl** | **URI** |  |  |
|**authorsUrl** | **URI** |  |  |
|**repositoryUrl** | **URI** |  |  |
|**svnRoot** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| AUTH | &quot;auth&quot; |
| ERROR | &quot;error&quot; |
| NONE | &quot;none&quot; |
| DETECTING | &quot;detecting&quot; |
| CHOOSE | &quot;choose&quot; |
| AUTH_FAILED | &quot;auth_failed&quot; |
| IMPORTING | &quot;importing&quot; |
| MAPPING | &quot;mapping&quot; |
| WAITING_TO_PUSH | &quot;waiting_to_push&quot; |
| PUSHING | &quot;pushing&quot; |
| COMPLETE | &quot;complete&quot; |
| SETUP | &quot;setup&quot; |
| UNKNOWN | &quot;unknown&quot; |
| DETECTION_FOUND_MULTIPLE | &quot;detection_found_multiple&quot; |
| DETECTION_FOUND_NOTHING | &quot;detection_found_nothing&quot; |
| DETECTION_NEEDS_AUTH | &quot;detection_needs_auth&quot; |



