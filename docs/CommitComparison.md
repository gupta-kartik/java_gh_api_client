

# CommitComparison

Commit Comparison

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** |  |  |
|**htmlUrl** | **URI** |  |  |
|**permalinkUrl** | **URI** |  |  |
|**diffUrl** | **URI** |  |  |
|**patchUrl** | **URI** |  |  |
|**baseCommit** | [**Commit**](Commit.md) |  |  |
|**mergeBaseCommit** | [**Commit**](Commit.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**aheadBy** | **Integer** |  |  |
|**behindBy** | **Integer** |  |  |
|**totalCommits** | **Integer** |  |  |
|**commits** | [**List&lt;Commit&gt;**](Commit.md) |  |  |
|**files** | [**List&lt;DiffEntry&gt;**](DiffEntry.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DIVERGED | &quot;diverged&quot; |
| AHEAD | &quot;ahead&quot; |
| BEHIND | &quot;behind&quot; |
| IDENTICAL | &quot;identical&quot; |



