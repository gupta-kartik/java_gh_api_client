

# WebhookMetaDeletedHook

The modified webhook. This will contain different keys based on the type of webhook it is: repository, organization, business, app, or GitHub Marketplace.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** |  |  |
|**config** | [**WebhookMetaDeletedHookConfig**](WebhookMetaDeletedHookConfig.md) |  |  |
|**createdAt** | **String** |  |  |
|**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) |  |  |
|**id** | **Integer** |  |  |
|**name** | **String** |  |  |
|**type** | **String** |  |  |
|**updatedAt** | **String** |  |  |



## Enum: List&lt;EventsEnum&gt;

| Name | Value |
|---- | -----|
| STAR | &quot;*&quot; |
| BRANCH_PROTECTION_RULE | &quot;branch_protection_rule&quot; |
| CHECK_RUN | &quot;check_run&quot; |
| CHECK_SUITE | &quot;check_suite&quot; |
| CODE_SCANNING_ALERT | &quot;code_scanning_alert&quot; |
| COMMIT_COMMENT | &quot;commit_comment&quot; |
| CREATE | &quot;create&quot; |
| DELETE | &quot;delete&quot; |
| DEPLOYMENT | &quot;deployment&quot; |
| DEPLOYMENT_STATUS | &quot;deployment_status&quot; |
| DEPLOY_KEY | &quot;deploy_key&quot; |
| DISCUSSION | &quot;discussion&quot; |
| DISCUSSION_COMMENT | &quot;discussion_comment&quot; |
| FORK | &quot;fork&quot; |
| GOLLUM | &quot;gollum&quot; |
| ISSUES | &quot;issues&quot; |
| ISSUE_COMMENT | &quot;issue_comment&quot; |
| LABEL | &quot;label&quot; |
| MEMBER | &quot;member&quot; |
| MEMBERSHIP | &quot;membership&quot; |
| META | &quot;meta&quot; |
| MILESTONE | &quot;milestone&quot; |
| ORGANIZATION | &quot;organization&quot; |
| ORG_BLOCK | &quot;org_block&quot; |
| PACKAGE | &quot;package&quot; |
| PAGE_BUILD | &quot;page_build&quot; |
| PROJECT | &quot;project&quot; |
| PROJECT_CARD | &quot;project_card&quot; |
| PROJECT_COLUMN | &quot;project_column&quot; |
| PUBLIC | &quot;public&quot; |
| PULL_REQUEST | &quot;pull_request&quot; |
| PULL_REQUEST_REVIEW | &quot;pull_request_review&quot; |
| PULL_REQUEST_REVIEW_COMMENT | &quot;pull_request_review_comment&quot; |
| PULL_REQUEST_REVIEW_THREAD | &quot;pull_request_review_thread&quot; |
| PUSH | &quot;push&quot; |
| REGISTRY_PACKAGE | &quot;registry_package&quot; |
| RELEASE | &quot;release&quot; |
| REPOSITORY | &quot;repository&quot; |
| REPOSITORY_IMPORT | &quot;repository_import&quot; |
| REPOSITORY_VULNERABILITY_ALERT | &quot;repository_vulnerability_alert&quot; |
| SECRET_SCANNING_ALERT | &quot;secret_scanning_alert&quot; |
| SECRET_SCANNING_ALERT_LOCATION | &quot;secret_scanning_alert_location&quot; |
| SECURITY_AND_ANALYSIS | &quot;security_and_analysis&quot; |
| STAR | &quot;star&quot; |
| STATUS | &quot;status&quot; |
| TEAM | &quot;team&quot; |
| TEAM_ADD | &quot;team_add&quot; |
| WATCH | &quot;watch&quot; |
| WORKFLOW_JOB | &quot;workflow_job&quot; |
| WORKFLOW_RUN | &quot;workflow_run&quot; |
| REPOSITORY_DISPATCH | &quot;repository_dispatch&quot; |
| PROJECTS_V2_ITEM | &quot;projects_v2_item&quot; |



