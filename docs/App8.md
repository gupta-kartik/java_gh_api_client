

# App8

GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  |
|**description** | **String** |  |  |
|**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | The list of events for the GitHub app |  [optional] |
|**externalUrl** | **URI** |  |  |
|**htmlUrl** | **URI** |  |  |
|**id** | **Integer** | Unique identifier of the GitHub app |  |
|**name** | **String** | The name of the GitHub app |  |
|**nodeId** | **String** |  |  |
|**owner** | [**User**](User.md) |  |  |
|**permissions** | [**App8Permissions**](App8Permissions.md) |  |  [optional] |
|**slug** | **String** | The slug name of the GitHub app |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: List&lt;EventsEnum&gt;

| Name | Value |
|---- | -----|
| BRANCH_PROTECTION_RULE | &quot;branch_protection_rule&quot; |
| CHECK_RUN | &quot;check_run&quot; |
| CHECK_SUITE | &quot;check_suite&quot; |
| CODE_SCANNING_ALERT | &quot;code_scanning_alert&quot; |
| COMMIT_COMMENT | &quot;commit_comment&quot; |
| CONTENT_REFERENCE | &quot;content_reference&quot; |
| CREATE | &quot;create&quot; |
| DELETE | &quot;delete&quot; |
| DEPLOYMENT | &quot;deployment&quot; |
| DEPLOYMENT_REVIEW | &quot;deployment_review&quot; |
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
| MILESTONE | &quot;milestone&quot; |
| ORGANIZATION | &quot;organization&quot; |
| ORG_BLOCK | &quot;org_block&quot; |
| PAGE_BUILD | &quot;page_build&quot; |
| PROJECT | &quot;project&quot; |
| PROJECT_CARD | &quot;project_card&quot; |
| PROJECT_COLUMN | &quot;project_column&quot; |
| PUBLIC | &quot;public&quot; |
| PULL_REQUEST | &quot;pull_request&quot; |
| PULL_REQUEST_REVIEW | &quot;pull_request_review&quot; |
| PULL_REQUEST_REVIEW_COMMENT | &quot;pull_request_review_comment&quot; |
| PUSH | &quot;push&quot; |
| REGISTRY_PACKAGE | &quot;registry_package&quot; |
| RELEASE | &quot;release&quot; |
| REPOSITORY | &quot;repository&quot; |
| REPOSITORY_DISPATCH | &quot;repository_dispatch&quot; |
| SECRET_SCANNING_ALERT | &quot;secret_scanning_alert&quot; |
| STAR | &quot;star&quot; |
| STATUS | &quot;status&quot; |
| TEAM | &quot;team&quot; |
| TEAM_ADD | &quot;team_add&quot; |
| WATCH | &quot;watch&quot; |
| WORKFLOW_DISPATCH | &quot;workflow_dispatch&quot; |
| WORKFLOW_RUN | &quot;workflow_run&quot; |
| REMINDER | &quot;reminder&quot; |
| PULL_REQUEST_REVIEW_THREAD | &quot;pull_request_review_thread&quot; |



