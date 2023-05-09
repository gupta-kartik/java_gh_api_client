

# BranchProtectionRule

The branch protection rule. Includes a `name` and all the [branch protection settings](https://docs.github.com/github/administering-a-repository/defining-the-mergeability-of-pull-requests/about-protected-branches#about-branch-protection-settings) applied to branches that match the name. Binary settings are boolean. Multi-level configurations are one of `off`, `non_admins`, or `everyone`. Actor and build lists are arrays of strings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adminEnforced** | **Boolean** |  |  |
|**allowDeletionsEnforcementLevel** | [**AllowDeletionsEnforcementLevelEnum**](#AllowDeletionsEnforcementLevelEnum) |  |  |
|**allowForcePushesEnforcementLevel** | [**AllowForcePushesEnforcementLevelEnum**](#AllowForcePushesEnforcementLevelEnum) |  |  |
|**authorizedActorNames** | **List&lt;String&gt;** |  |  |
|**authorizedActorsOnly** | **Boolean** |  |  |
|**authorizedDismissalActorsOnly** | **Boolean** |  |  |
|**createProtected** | **Boolean** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**dismissStaleReviewsOnPush** | **Boolean** |  |  |
|**id** | **Integer** |  |  |
|**ignoreApprovalsFromContributors** | **Boolean** |  |  |
|**linearHistoryRequirementEnforcementLevel** | [**LinearHistoryRequirementEnforcementLevelEnum**](#LinearHistoryRequirementEnforcementLevelEnum) |  |  |
|**mergeQueueEnforcementLevel** | [**MergeQueueEnforcementLevelEnum**](#MergeQueueEnforcementLevelEnum) |  |  |
|**name** | **String** |  |  |
|**pullRequestReviewsEnforcementLevel** | [**PullRequestReviewsEnforcementLevelEnum**](#PullRequestReviewsEnforcementLevelEnum) |  |  |
|**repositoryId** | **Integer** |  |  |
|**requireCodeOwnerReview** | **Boolean** |  |  |
|**requiredApprovingReviewCount** | **Integer** |  |  |
|**requiredConversationResolutionLevel** | [**RequiredConversationResolutionLevelEnum**](#RequiredConversationResolutionLevelEnum) |  |  |
|**requiredDeploymentsEnforcementLevel** | [**RequiredDeploymentsEnforcementLevelEnum**](#RequiredDeploymentsEnforcementLevelEnum) |  |  |
|**requiredStatusChecks** | **List&lt;String&gt;** |  |  |
|**requiredStatusChecksEnforcementLevel** | [**RequiredStatusChecksEnforcementLevelEnum**](#RequiredStatusChecksEnforcementLevelEnum) |  |  |
|**signatureRequirementEnforcementLevel** | [**SignatureRequirementEnforcementLevelEnum**](#SignatureRequirementEnforcementLevelEnum) |  |  |
|**strictRequiredStatusChecksPolicy** | **Boolean** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: AllowDeletionsEnforcementLevelEnum

| Name | Value |
|---- | -----|
| OFF | &quot;off&quot; |
| NON_ADMINS | &quot;non_admins&quot; |
| EVERYONE | &quot;everyone&quot; |



## Enum: AllowForcePushesEnforcementLevelEnum

| Name | Value |
|---- | -----|
| OFF | &quot;off&quot; |
| NON_ADMINS | &quot;non_admins&quot; |
| EVERYONE | &quot;everyone&quot; |



## Enum: LinearHistoryRequirementEnforcementLevelEnum

| Name | Value |
|---- | -----|
| OFF | &quot;off&quot; |
| NON_ADMINS | &quot;non_admins&quot; |
| EVERYONE | &quot;everyone&quot; |



## Enum: MergeQueueEnforcementLevelEnum

| Name | Value |
|---- | -----|
| OFF | &quot;off&quot; |
| NON_ADMINS | &quot;non_admins&quot; |
| EVERYONE | &quot;everyone&quot; |



## Enum: PullRequestReviewsEnforcementLevelEnum

| Name | Value |
|---- | -----|
| OFF | &quot;off&quot; |
| NON_ADMINS | &quot;non_admins&quot; |
| EVERYONE | &quot;everyone&quot; |



## Enum: RequiredConversationResolutionLevelEnum

| Name | Value |
|---- | -----|
| OFF | &quot;off&quot; |
| NON_ADMINS | &quot;non_admins&quot; |
| EVERYONE | &quot;everyone&quot; |



## Enum: RequiredDeploymentsEnforcementLevelEnum

| Name | Value |
|---- | -----|
| OFF | &quot;off&quot; |
| NON_ADMINS | &quot;non_admins&quot; |
| EVERYONE | &quot;everyone&quot; |



## Enum: RequiredStatusChecksEnforcementLevelEnum

| Name | Value |
|---- | -----|
| OFF | &quot;off&quot; |
| NON_ADMINS | &quot;non_admins&quot; |
| EVERYONE | &quot;everyone&quot; |



## Enum: SignatureRequirementEnforcementLevelEnum

| Name | Value |
|---- | -----|
| OFF | &quot;off&quot; |
| NON_ADMINS | &quot;non_admins&quot; |
| EVERYONE | &quot;everyone&quot; |



