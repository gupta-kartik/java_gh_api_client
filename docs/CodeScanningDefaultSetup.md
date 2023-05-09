

# CodeScanningDefaultSetup

Configuration for code scanning default setup.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | [**StateEnum**](#StateEnum) | Code scanning default setup has been configured or not. |  [optional] |
|**languages** | [**List&lt;LanguagesEnum&gt;**](#List&lt;LanguagesEnum&gt;) | Languages to be analysed. |  [optional] |
|**querySuite** | [**QuerySuiteEnum**](#QuerySuiteEnum) | CodeQL query suite to be used. |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp of latest configuration update. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| CONFIGURED | &quot;configured&quot; |
| NOT_CONFIGURED | &quot;not-configured&quot; |



## Enum: List&lt;LanguagesEnum&gt;

| Name | Value |
|---- | -----|
| C | &quot;c&quot; |
| CPP | &quot;cpp&quot; |
| CSHARP | &quot;csharp&quot; |
| GO | &quot;go&quot; |
| JAVA | &quot;java&quot; |
| JAVASCRIPT | &quot;javascript&quot; |
| KOTLIN | &quot;kotlin&quot; |
| PYTHON | &quot;python&quot; |
| RUBY | &quot;ruby&quot; |
| TYPESCRIPT | &quot;typescript&quot; |



## Enum: QuerySuiteEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| EXTENDED | &quot;extended&quot; |



