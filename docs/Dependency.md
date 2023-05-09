

# Dependency


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**packageUrl** | **String** | Package-url (PURL) of dependency. See https://github.com/package-url/purl-spec for more details. |  [optional] |
|**metadata** | [**Map&lt;String, Metadata1&gt;**](Metadata1.md) | User-defined metadata to store domain-specific information limited to 8 keys with scalar values. |  [optional] |
|**relationship** | [**RelationshipEnum**](#RelationshipEnum) | A notation of whether a dependency is requested directly by this manifest or is a dependency of another dependency. |  [optional] |
|**scope** | [**ScopeEnum**](#ScopeEnum) | A notation of whether the dependency is required for the primary build artifact (runtime) or is only used for development. Future versions of this specification may allow for more granular scopes. |  [optional] |
|**dependencies** | **List&lt;String&gt;** | Array of package-url (PURLs) of direct child dependencies. |  [optional] |



## Enum: RelationshipEnum

| Name | Value |
|---- | -----|
| DIRECT | &quot;direct&quot; |
| INDIRECT | &quot;indirect&quot; |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| RUNTIME | &quot;runtime&quot; |
| DEVELOPMENT | &quot;development&quot; |



