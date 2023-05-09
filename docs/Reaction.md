

# Reaction

Reactions to conversations provide a way to help people express their feelings more simply and effectively.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**nodeId** | **String** |  |  |
|**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
|**content** | [**ContentEnum**](#ContentEnum) | The reaction to use |  |
|**createdAt** | **OffsetDateTime** |  |  |



## Enum: ContentEnum

| Name | Value |
|---- | -----|
| _1 | &quot;+1&quot; |
| _1 | &quot;-1&quot; |
| LAUGH | &quot;laugh&quot; |
| CONFUSED | &quot;confused&quot; |
| HEART | &quot;heart&quot; |
| HOORAY | &quot;hooray&quot; |
| ROCKET | &quot;rocket&quot; |
| EYES | &quot;eyes&quot; |



