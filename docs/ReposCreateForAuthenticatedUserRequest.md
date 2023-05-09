

# ReposCreateForAuthenticatedUserRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the repository. |  |
|**description** | **String** | A short description of the repository. |  [optional] |
|**homepage** | **String** | A URL with more information about the repository. |  [optional] |
|**_private** | **Boolean** | Whether the repository is private. |  [optional] |
|**hasIssues** | **Boolean** | Whether issues are enabled. |  [optional] |
|**hasProjects** | **Boolean** | Whether projects are enabled. |  [optional] |
|**hasWiki** | **Boolean** | Whether the wiki is enabled. |  [optional] |
|**hasDiscussions** | **Boolean** | Whether discussions are enabled. |  [optional] |
|**teamId** | **Integer** | The id of the team that will be granted access to this repository. This is only valid when creating a repository in an organization. |  [optional] |
|**autoInit** | **Boolean** | Whether the repository is initialized with a minimal README. |  [optional] |
|**gitignoreTemplate** | **String** | The desired language or platform to apply to the .gitignore. |  [optional] |
|**licenseTemplate** | **String** | The license keyword of the open source license for this repository. |  [optional] |
|**allowSquashMerge** | **Boolean** | Whether to allow squash merges for pull requests. |  [optional] |
|**allowMergeCommit** | **Boolean** | Whether to allow merge commits for pull requests. |  [optional] |
|**allowRebaseMerge** | **Boolean** | Whether to allow rebase merges for pull requests. |  [optional] |
|**allowAutoMerge** | **Boolean** | Whether to allow Auto-merge to be used on pull requests. |  [optional] |
|**deleteBranchOnMerge** | **Boolean** | Whether to delete head branches when pull requests are merged |  [optional] |
|**squashMergeCommitTitle** | [**SquashMergeCommitTitleEnum**](#SquashMergeCommitTitleEnum) | The default value for a squash merge commit title:  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;COMMIT_OR_PR_TITLE&#x60; - default to the commit&#39;s title (if only one commit) or the pull request&#39;s title (when more than one commit). |  [optional] |
|**squashMergeCommitMessage** | [**SquashMergeCommitMessageEnum**](#SquashMergeCommitMessageEnum) | The default value for a squash merge commit message:  - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;COMMIT_MESSAGES&#x60; - default to the branch&#39;s commit messages. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional] |
|**mergeCommitTitle** | [**MergeCommitTitleEnum**](#MergeCommitTitleEnum) | The default value for a merge commit title.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;MERGE_MESSAGE&#x60; - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name). |  [optional] |
|**mergeCommitMessage** | [**MergeCommitMessageEnum**](#MergeCommitMessageEnum) | The default value for a merge commit message.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional] |
|**hasDownloads** | **Boolean** | Whether downloads are enabled. |  [optional] |
|**isTemplate** | **Boolean** | Whether this repository acts as a template that can be used to generate new repositories. |  [optional] |



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



