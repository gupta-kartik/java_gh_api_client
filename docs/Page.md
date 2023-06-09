

# Page

The configuration for GitHub Pages for a repository.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** | The API address for accessing this Page resource. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the most recent build of the Page. |  |
|**cname** | **String** | The Pages site&#39;s custom domain |  |
|**protectedDomainState** | [**ProtectedDomainStateEnum**](#ProtectedDomainStateEnum) | The state if the domain is verified |  [optional] |
|**pendingDomainUnverifiedAt** | **OffsetDateTime** | The timestamp when a pending domain becomes unverified. |  [optional] |
|**custom404** | **Boolean** | Whether the Page has a custom 404 page. |  |
|**htmlUrl** | **URI** | The web address the Page can be accessed from. |  [optional] |
|**buildType** | [**BuildTypeEnum**](#BuildTypeEnum) | The process in which the Page will be built. |  [optional] |
|**source** | [**PagesSourceHash**](PagesSourceHash.md) |  |  [optional] |
|**_public** | **Boolean** | Whether the GitHub Pages site is publicly visible. If set to &#x60;true&#x60;, the site is accessible to anyone on the internet. If set to &#x60;false&#x60;, the site will only be accessible to users who have at least &#x60;read&#x60; access to the repository that published the site. |  |
|**httpsCertificate** | [**PagesHttpsCertificate**](PagesHttpsCertificate.md) |  |  [optional] |
|**httpsEnforced** | **Boolean** | Whether https is enabled on the domain |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| BUILT | &quot;built&quot; |
| BUILDING | &quot;building&quot; |
| ERRORED | &quot;errored&quot; |



## Enum: ProtectedDomainStateEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| VERIFIED | &quot;verified&quot; |
| UNVERIFIED | &quot;unverified&quot; |



## Enum: BuildTypeEnum

| Name | Value |
|---- | -----|
| LEGACY | &quot;legacy&quot; |
| WORKFLOW | &quot;workflow&quot; |



