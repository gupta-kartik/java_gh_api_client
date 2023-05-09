

# CodeScanningAnalysis


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ref** | **String** | The full Git reference, formatted as &#x60;refs/heads/&lt;branch name&gt;&#x60;, &#x60;refs/pull/&lt;number&gt;/merge&#x60;, or &#x60;refs/pull/&lt;number&gt;/head&#x60;. |  |
|**commitSha** | **String** | The SHA of the commit to which the analysis you are uploading relates. |  |
|**analysisKey** | **String** | Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name. |  |
|**environment** | **String** | Identifies the variable values associated with the environment in which this analysis was performed. |  |
|**category** | **String** | Identifies the configuration under which the analysis was executed. Used to distinguish between multiple analyses for the same tool and commit, but performed on different languages or different parts of the code. |  [optional] |
|**error** | **String** |  |  |
|**createdAt** | **OffsetDateTime** | The time that the analysis was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly] |
|**resultsCount** | **Integer** | The total number of results in the analysis. |  |
|**rulesCount** | **Integer** | The total number of rules used in the analysis. |  |
|**id** | **Integer** | Unique identifier for this analysis. |  |
|**url** | **URI** | The REST API URL of the analysis resource. |  [readonly] |
|**sarifId** | **String** | An identifier for the upload. |  |
|**tool** | [**CodeScanningAnalysisTool**](CodeScanningAnalysisTool.md) |  |  |
|**deletable** | **Boolean** |  |  |
|**warning** | **String** | Warning generated when processing the analysis |  |



