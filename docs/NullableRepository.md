

# NullableRepository

A repository on GitHub.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the repository |  |
|**nodeId** | **String** |  |  |
|**name** | **String** | The name of the repository. |  |
|**fullName** | **String** |  |  |
|**license** | [**NullableLicenseSimple**](NullableLicenseSimple.md) |  |  |
|**organization** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  [optional] |
|**forks** | **Integer** |  |  |
|**permissions** | [**RepositoryPermissions**](RepositoryPermissions.md) |  |  [optional] |
|**owner** | [**SimpleUser**](SimpleUser.md) |  |  |
|**_private** | **Boolean** | Whether the repository is private or public. |  |
|**htmlUrl** | **URI** |  |  |
|**description** | **String** |  |  |
|**fork** | **Boolean** |  |  |
|**url** | **URI** |  |  |
|**archiveUrl** | **String** |  |  |
|**assigneesUrl** | **String** |  |  |
|**blobsUrl** | **String** |  |  |
|**branchesUrl** | **String** |  |  |
|**collaboratorsUrl** | **String** |  |  |
|**commentsUrl** | **String** |  |  |
|**commitsUrl** | **String** |  |  |
|**compareUrl** | **String** |  |  |
|**contentsUrl** | **String** |  |  |
|**contributorsUrl** | **URI** |  |  |
|**deploymentsUrl** | **URI** |  |  |
|**downloadsUrl** | **URI** |  |  |
|**eventsUrl** | **URI** |  |  |
|**forksUrl** | **URI** |  |  |
|**gitCommitsUrl** | **String** |  |  |
|**gitRefsUrl** | **String** |  |  |
|**gitTagsUrl** | **String** |  |  |
|**gitUrl** | **String** |  |  |
|**issueCommentUrl** | **String** |  |  |
|**issueEventsUrl** | **String** |  |  |
|**issuesUrl** | **String** |  |  |
|**keysUrl** | **String** |  |  |
|**labelsUrl** | **String** |  |  |
|**languagesUrl** | **URI** |  |  |
|**mergesUrl** | **URI** |  |  |
|**milestonesUrl** | **String** |  |  |
|**notificationsUrl** | **String** |  |  |
|**pullsUrl** | **String** |  |  |
|**releasesUrl** | **String** |  |  |
|**sshUrl** | **String** |  |  |
|**stargazersUrl** | **URI** |  |  |
|**statusesUrl** | **String** |  |  |
|**subscribersUrl** | **URI** |  |  |
|**subscriptionUrl** | **URI** |  |  |
|**tagsUrl** | **URI** |  |  |
|**teamsUrl** | **URI** |  |  |
|**treesUrl** | **String** |  |  |
|**cloneUrl** | **String** |  |  |
|**mirrorUrl** | **URI** |  |  |
|**hooksUrl** | **URI** |  |  |
|**svnUrl** | **URI** |  |  |
|**homepage** | **URI** |  |  |
|**language** | **String** |  |  |
|**forksCount** | **Integer** |  |  |
|**stargazersCount** | **Integer** |  |  |
|**watchersCount** | **Integer** |  |  |
|**size** | **Integer** | The size of the repository. Size is calculated hourly. When a repository is initially created, the size is 0. |  |
|**defaultBranch** | **String** | The default branch of the repository. |  |
|**openIssuesCount** | **Integer** |  |  |
|**isTemplate** | **Boolean** | Whether this repository acts as a template that can be used to generate new repositories. |  [optional] |
|**topics** | **List&lt;String&gt;** |  |  [optional] |
|**hasIssues** | **Boolean** | Whether issues are enabled. |  |
|**hasProjects** | **Boolean** | Whether projects are enabled. |  |
|**hasWiki** | **Boolean** | Whether the wiki is enabled. |  |
|**hasPages** | **Boolean** |  |  |
|**hasDownloads** | **Boolean** | Whether downloads are enabled. |  |
|**hasDiscussions** | **Boolean** | Whether discussions are enabled. |  [optional] |
|**archived** | **Boolean** | Whether the repository is archived. |  |
|**disabled** | **Boolean** | Returns whether or not this repository disabled. |  |
|**visibility** | **String** | The repository visibility: public, private, or internal. |  [optional] |
|**pushedAt** | **OffsetDateTime** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**allowRebaseMerge** | **Boolean** | Whether to allow rebase merges for pull requests. |  [optional] |
|**templateRepository** | [**RepositoryTemplateRepository**](RepositoryTemplateRepository.md) |  |  [optional] |
|**tempCloneToken** | **String** |  |  [optional] |
|**allowSquashMerge** | **Boolean** | Whether to allow squash merges for pull requests. |  [optional] |
|**allowAutoMerge** | **Boolean** | Whether to allow Auto-merge to be used on pull requests. |  [optional] |
|**deleteBranchOnMerge** | **Boolean** | Whether to delete head branches when pull requests are merged |  [optional] |
|**allowUpdateBranch** | **Boolean** | Whether or not a pull request head branch that is behind its base branch can always be updated even if it is not required to be up to date before merging. |  [optional] |
|**useSquashPrTitleAsDefault** | **Boolean** | Whether a squash merge commit can use the pull request title as default. **This property has been deprecated. Please use &#x60;squash_merge_commit_title&#x60; instead. |  [optional] |
|**squashMergeCommitTitle** | [**SquashMergeCommitTitleEnum**](#SquashMergeCommitTitleEnum) | The default value for a squash merge commit title:  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;COMMIT_OR_PR_TITLE&#x60; - default to the commit&#39;s title (if only one commit) or the pull request&#39;s title (when more than one commit). |  [optional] |
|**squashMergeCommitMessage** | [**SquashMergeCommitMessageEnum**](#SquashMergeCommitMessageEnum) | The default value for a squash merge commit message:  - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;COMMIT_MESSAGES&#x60; - default to the branch&#39;s commit messages. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional] |
|**mergeCommitTitle** | [**MergeCommitTitleEnum**](#MergeCommitTitleEnum) | The default value for a merge commit title.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;MERGE_MESSAGE&#x60; - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name). |  [optional] |
|**mergeCommitMessage** | [**MergeCommitMessageEnum**](#MergeCommitMessageEnum) | The default value for a merge commit message.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional] |
|**allowMergeCommit** | **Boolean** | Whether to allow merge commits for pull requests. |  [optional] |
|**allowForking** | **Boolean** | Whether to allow forking this repo |  [optional] |
|**webCommitSignoffRequired** | **Boolean** | Whether to require contributors to sign off on web-based commits |  [optional] |
|**subscribersCount** | **Integer** |  |  [optional] |
|**networkCount** | **Integer** |  |  [optional] |
|**openIssues** | **Integer** |  |  |
|**watchers** | **Integer** |  |  |
|**masterBranch** | **String** |  |  [optional] |
|**starredAt** | **String** |  |  [optional] |
|**anonymousAccessEnabled** | **Boolean** | Whether anonymous git access is enabled for this repository |  [optional] |



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



