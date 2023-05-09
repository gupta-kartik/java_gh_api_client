

# Repository9

A git repository

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowAutoMerge** | **Boolean** | Whether to allow auto-merge for pull requests. |  [optional] |
|**allowForking** | **Boolean** | Whether to allow private forks |  [optional] |
|**allowMergeCommit** | **Boolean** | Whether to allow merge commits for pull requests. |  [optional] |
|**allowRebaseMerge** | **Boolean** | Whether to allow rebase merges for pull requests. |  [optional] |
|**allowSquashMerge** | **Boolean** | Whether to allow squash merges for pull requests. |  [optional] |
|**allowUpdateBranch** | **Boolean** |  |  [optional] |
|**archiveUrl** | **String** |  |  |
|**archived** | **Boolean** | Whether the repository is archived. |  |
|**assigneesUrl** | **String** |  |  |
|**blobsUrl** | **String** |  |  |
|**branchesUrl** | **String** |  |  |
|**cloneUrl** | **URI** |  |  |
|**collaboratorsUrl** | **String** |  |  |
|**commentsUrl** | **String** |  |  |
|**commitsUrl** | **String** |  |  |
|**compareUrl** | **String** |  |  |
|**contentsUrl** | **String** |  |  |
|**contributorsUrl** | **URI** |  |  |
|**createdAt** | [**RepositoryCreatedAt**](RepositoryCreatedAt.md) |  |  |
|**defaultBranch** | **String** | The default branch of the repository. |  |
|**deleteBranchOnMerge** | **Boolean** | Whether to delete head branches when pull requests are merged |  [optional] |
|**deploymentsUrl** | **URI** |  |  |
|**description** | **String** |  |  |
|**disabled** | **Boolean** | Returns whether or not this repository is disabled. |  [optional] |
|**downloadsUrl** | **URI** |  |  |
|**eventsUrl** | **URI** |  |  |
|**fork** | **Boolean** |  |  |
|**forks** | **Integer** |  |  |
|**forksCount** | **Integer** |  |  |
|**forksUrl** | **URI** |  |  |
|**fullName** | **String** |  |  |
|**gitCommitsUrl** | **String** |  |  |
|**gitRefsUrl** | **String** |  |  |
|**gitTagsUrl** | **String** |  |  |
|**gitUrl** | **URI** |  |  |
|**hasDownloads** | **Boolean** | Whether downloads are enabled. |  |
|**hasIssues** | **Boolean** | Whether issues are enabled. |  |
|**hasPages** | **Boolean** |  |  |
|**hasProjects** | **Boolean** | Whether projects are enabled. |  |
|**hasWiki** | **Boolean** | Whether the wiki is enabled. |  |
|**hasDiscussions** | **Boolean** | Whether discussions are enabled. |  |
|**homepage** | **String** |  |  |
|**hooksUrl** | **URI** |  |  |
|**htmlUrl** | **URI** |  |  |
|**id** | **Integer** | Unique identifier of the repository |  |
|**isTemplate** | **Boolean** |  |  [optional] |
|**issueCommentUrl** | **String** |  |  |
|**issueEventsUrl** | **String** |  |  |
|**issuesUrl** | **String** |  |  |
|**keysUrl** | **String** |  |  |
|**labelsUrl** | **String** |  |  |
|**language** | **String** |  |  |
|**languagesUrl** | **URI** |  |  |
|**license** | [**License**](License.md) |  |  |
|**masterBranch** | **String** |  |  [optional] |
|**mergeCommitMessage** | [**MergeCommitMessageEnum**](#MergeCommitMessageEnum) | The default value for a merge commit message.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional] |
|**mergeCommitTitle** | [**MergeCommitTitleEnum**](#MergeCommitTitleEnum) | The default value for a merge commit title.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;MERGE_MESSAGE&#x60; - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name). |  [optional] |
|**mergesUrl** | **URI** |  |  |
|**milestonesUrl** | **String** |  |  |
|**mirrorUrl** | **URI** |  |  |
|**name** | **String** | The name of the repository. |  |
|**nodeId** | **String** |  |  |
|**notificationsUrl** | **String** |  |  |
|**openIssues** | **Integer** |  |  |
|**openIssuesCount** | **Integer** |  |  |
|**organization** | **String** |  |  [optional] |
|**owner** | [**User**](User.md) |  |  |
|**permissions** | [**RepositoryPermissions**](RepositoryPermissions.md) |  |  [optional] |
|**_private** | **Boolean** | Whether the repository is private or public. |  |
|**_public** | **Boolean** |  |  [optional] |
|**pullsUrl** | **String** |  |  |
|**pushedAt** | [**RepositoryPushedAt**](RepositoryPushedAt.md) |  |  |
|**releasesUrl** | **String** |  |  |
|**roleName** | **String** |  |  [optional] |
|**size** | **Integer** |  |  |
|**squashMergeCommitMessage** | [**SquashMergeCommitMessageEnum**](#SquashMergeCommitMessageEnum) | The default value for a squash merge commit message. |  [optional] |
|**squashMergeCommitTitle** | [**SquashMergeCommitTitleEnum**](#SquashMergeCommitTitleEnum) | The default value for a squash merge commit title. |  [optional] |
|**sshUrl** | **String** |  |  |
|**stargazers** | **Integer** |  |  [optional] |
|**stargazersCount** | **Integer** |  |  |
|**stargazersUrl** | **URI** |  |  |
|**statusesUrl** | **String** |  |  |
|**subscribersUrl** | **URI** |  |  |
|**subscriptionUrl** | **URI** |  |  |
|**svnUrl** | **URI** |  |  |
|**tagsUrl** | **URI** |  |  |
|**teamsUrl** | **URI** |  |  |
|**topics** | **List&lt;String&gt;** |  |  |
|**treesUrl** | **String** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**url** | **URI** |  |  |
|**useSquashPrTitleAsDefault** | **Boolean** | Whether a squash merge commit can use the pull request title as default. **This property has been deprecated. Please use &#x60;squash_merge_commit_title&#x60; instead. |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) |  |  |
|**watchers** | **Integer** |  |  |
|**watchersCount** | **Integer** |  |  |
|**webCommitSignoffRequired** | **Boolean** | Whether to require contributors to sign off on web-based commits |  [optional] |



## Enum: MergeCommitMessageEnum

| Name | Value |
|---- | -----|
| PR_BODY | &quot;PR_BODY&quot; |
| PR_TITLE | &quot;PR_TITLE&quot; |
| BLANK | &quot;BLANK&quot; |



## Enum: MergeCommitTitleEnum

| Name | Value |
|---- | -----|
| PR_TITLE | &quot;PR_TITLE&quot; |
| MERGE_MESSAGE | &quot;MERGE_MESSAGE&quot; |



## Enum: SquashMergeCommitMessageEnum

| Name | Value |
|---- | -----|
| PR_BODY | &quot;PR_BODY&quot; |
| COMMIT_MESSAGES | &quot;COMMIT_MESSAGES&quot; |
| BLANK | &quot;BLANK&quot; |



## Enum: SquashMergeCommitTitleEnum

| Name | Value |
|---- | -----|
| PR_TITLE | &quot;PR_TITLE&quot; |
| COMMIT_OR_PR_TITLE | &quot;COMMIT_OR_PR_TITLE&quot; |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;public&quot; |
| PRIVATE | &quot;private&quot; |
| INTERNAL | &quot;internal&quot; |



