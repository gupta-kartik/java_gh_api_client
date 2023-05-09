

# ReposUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the repository. |  [optional] |
|**description** | **String** | A short description of the repository. |  [optional] |
|**homepage** | **String** | A URL with more information about the repository. |  [optional] |
|**_private** | **Boolean** | Either &#x60;true&#x60; to make the repository private or &#x60;false&#x60; to make it public. Default: &#x60;false&#x60;.   **Note**: You will get a &#x60;422&#x60; error if the organization restricts [changing repository visibility](https://docs.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibility-of-repositories) to organization owners and a non-owner tries to change the value of private. |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | The visibility of the repository. |  [optional] |
|**securityAndAnalysis** | [**ReposUpdateRequestSecurityAndAnalysis**](ReposUpdateRequestSecurityAndAnalysis.md) |  |  [optional] |
|**hasIssues** | **Boolean** | Either &#x60;true&#x60; to enable issues for this repository or &#x60;false&#x60; to disable them. |  [optional] |
|**hasProjects** | **Boolean** | Either &#x60;true&#x60; to enable projects for this repository or &#x60;false&#x60; to disable them. **Note:** If you&#39;re creating a repository in an organization that has disabled repository projects, the default is &#x60;false&#x60;, and if you pass &#x60;true&#x60;, the API returns an error. |  [optional] |
|**hasWiki** | **Boolean** | Either &#x60;true&#x60; to enable the wiki for this repository or &#x60;false&#x60; to disable it. |  [optional] |
|**isTemplate** | **Boolean** | Either &#x60;true&#x60; to make this repo available as a template repository or &#x60;false&#x60; to prevent it. |  [optional] |
|**defaultBranch** | **String** | Updates the default branch for this repository. |  [optional] |
|**allowSquashMerge** | **Boolean** | Either &#x60;true&#x60; to allow squash-merging pull requests, or &#x60;false&#x60; to prevent squash-merging. |  [optional] |
|**allowMergeCommit** | **Boolean** | Either &#x60;true&#x60; to allow merging pull requests with a merge commit, or &#x60;false&#x60; to prevent merging pull requests with merge commits. |  [optional] |
|**allowRebaseMerge** | **Boolean** | Either &#x60;true&#x60; to allow rebase-merging pull requests, or &#x60;false&#x60; to prevent rebase-merging. |  [optional] |
|**allowAutoMerge** | **Boolean** | Either &#x60;true&#x60; to allow auto-merge on pull requests, or &#x60;false&#x60; to disallow auto-merge. |  [optional] |
|**deleteBranchOnMerge** | **Boolean** | Either &#x60;true&#x60; to allow automatically deleting head branches when pull requests are merged, or &#x60;false&#x60; to prevent automatic deletion. |  [optional] |
|**allowUpdateBranch** | **Boolean** | Either &#x60;true&#x60; to always allow a pull request head branch that is behind its base branch to be updated even if it is not required to be up to date before merging, or false otherwise. |  [optional] |
|**useSquashPrTitleAsDefault** | **Boolean** | Either &#x60;true&#x60; to allow squash-merge commits to use pull request title, or &#x60;false&#x60; to use commit message. **This property has been deprecated. Please use &#x60;squash_merge_commit_title&#x60; instead. |  [optional] |
|**squashMergeCommitTitle** | [**SquashMergeCommitTitleEnum**](#SquashMergeCommitTitleEnum) | The default value for a squash merge commit title:  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;COMMIT_OR_PR_TITLE&#x60; - default to the commit&#39;s title (if only one commit) or the pull request&#39;s title (when more than one commit). |  [optional] |
|**squashMergeCommitMessage** | [**SquashMergeCommitMessageEnum**](#SquashMergeCommitMessageEnum) | The default value for a squash merge commit message:  - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;COMMIT_MESSAGES&#x60; - default to the branch&#39;s commit messages. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional] |
|**mergeCommitTitle** | [**MergeCommitTitleEnum**](#MergeCommitTitleEnum) | The default value for a merge commit title.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;MERGE_MESSAGE&#x60; - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name). |  [optional] |
|**mergeCommitMessage** | [**MergeCommitMessageEnum**](#MergeCommitMessageEnum) | The default value for a merge commit message.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional] |
|**archived** | **Boolean** | Whether to archive this repository. &#x60;false&#x60; will unarchive a previously archived repository. |  [optional] |
|**allowForking** | **Boolean** | Either &#x60;true&#x60; to allow private forks, or &#x60;false&#x60; to prevent private forks. |  [optional] |
|**webCommitSignoffRequired** | **Boolean** | Either &#x60;true&#x60; to require contributors to sign off on web-based commits, or &#x60;false&#x60; to not require contributors to sign off on web-based commits. |  [optional] |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;public&quot; |
| PRIVATE | &quot;private&quot; |



## Enum: SquashMergeCommitTitleEnum

| Name | Value |
|---- | -----|
| PR_TITLE | &quot;PR_TITLE&quot; |
| COMMIT_OR_PR_TITLE | &quot;COMMIT_OR_PR_TITLE&quot; |



## Enum: SquashMergeCommitMessageEnum

| Name | Value |
|---- | -----|
| PR_BODY | &quot;PR_BODY&quot; |
| COMMIT_MESSAGES | &quot;COMMIT_MESSAGES&quot; |
| BLANK | &quot;BLANK&quot; |



## Enum: MergeCommitTitleEnum

| Name | Value |
|---- | -----|
| PR_TITLE | &quot;PR_TITLE&quot; |
| MERGE_MESSAGE | &quot;MERGE_MESSAGE&quot; |



## Enum: MergeCommitMessageEnum

| Name | Value |
|---- | -----|
| PR_BODY | &quot;PR_BODY&quot; |
| PR_TITLE | &quot;PR_TITLE&quot; |
| BLANK | &quot;BLANK&quot; |



