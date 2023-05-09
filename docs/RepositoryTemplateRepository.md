

# RepositoryTemplateRepository


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**nodeId** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**fullName** | **String** |  |  [optional] |
|**owner** | [**RepositoryTemplateRepositoryOwner**](RepositoryTemplateRepositoryOwner.md) |  |  [optional] |
|**_private** | **Boolean** |  |  [optional] |
|**htmlUrl** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**fork** | **Boolean** |  |  [optional] |
|**url** | **String** |  |  [optional] |
|**archiveUrl** | **String** |  |  [optional] |
|**assigneesUrl** | **String** |  |  [optional] |
|**blobsUrl** | **String** |  |  [optional] |
|**branchesUrl** | **String** |  |  [optional] |
|**collaboratorsUrl** | **String** |  |  [optional] |
|**commentsUrl** | **String** |  |  [optional] |
|**commitsUrl** | **String** |  |  [optional] |
|**compareUrl** | **String** |  |  [optional] |
|**contentsUrl** | **String** |  |  [optional] |
|**contributorsUrl** | **String** |  |  [optional] |
|**deploymentsUrl** | **String** |  |  [optional] |
|**downloadsUrl** | **String** |  |  [optional] |
|**eventsUrl** | **String** |  |  [optional] |
|**forksUrl** | **String** |  |  [optional] |
|**gitCommitsUrl** | **String** |  |  [optional] |
|**gitRefsUrl** | **String** |  |  [optional] |
|**gitTagsUrl** | **String** |  |  [optional] |
|**gitUrl** | **String** |  |  [optional] |
|**issueCommentUrl** | **String** |  |  [optional] |
|**issueEventsUrl** | **String** |  |  [optional] |
|**issuesUrl** | **String** |  |  [optional] |
|**keysUrl** | **String** |  |  [optional] |
|**labelsUrl** | **String** |  |  [optional] |
|**languagesUrl** | **String** |  |  [optional] |
|**mergesUrl** | **String** |  |  [optional] |
|**milestonesUrl** | **String** |  |  [optional] |
|**notificationsUrl** | **String** |  |  [optional] |
|**pullsUrl** | **String** |  |  [optional] |
|**releasesUrl** | **String** |  |  [optional] |
|**sshUrl** | **String** |  |  [optional] |
|**stargazersUrl** | **String** |  |  [optional] |
|**statusesUrl** | **String** |  |  [optional] |
|**subscribersUrl** | **String** |  |  [optional] |
|**subscriptionUrl** | **String** |  |  [optional] |
|**tagsUrl** | **String** |  |  [optional] |
|**teamsUrl** | **String** |  |  [optional] |
|**treesUrl** | **String** |  |  [optional] |
|**cloneUrl** | **String** |  |  [optional] |
|**mirrorUrl** | **String** |  |  [optional] |
|**hooksUrl** | **String** |  |  [optional] |
|**svnUrl** | **String** |  |  [optional] |
|**homepage** | **String** |  |  [optional] |
|**language** | **String** |  |  [optional] |
|**forksCount** | **Integer** |  |  [optional] |
|**stargazersCount** | **Integer** |  |  [optional] |
|**watchersCount** | **Integer** |  |  [optional] |
|**size** | **Integer** |  |  [optional] |
|**defaultBranch** | **String** |  |  [optional] |
|**openIssuesCount** | **Integer** |  |  [optional] |
|**isTemplate** | **Boolean** |  |  [optional] |
|**topics** | **List&lt;String&gt;** |  |  [optional] |
|**hasIssues** | **Boolean** |  |  [optional] |
|**hasProjects** | **Boolean** |  |  [optional] |
|**hasWiki** | **Boolean** |  |  [optional] |
|**hasPages** | **Boolean** |  |  [optional] |
|**hasDownloads** | **Boolean** |  |  [optional] |
|**archived** | **Boolean** |  |  [optional] |
|**disabled** | **Boolean** |  |  [optional] |
|**visibility** | **String** |  |  [optional] |
|**pushedAt** | **String** |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |
|**permissions** | [**RepositoryTemplateRepositoryPermissions**](RepositoryTemplateRepositoryPermissions.md) |  |  [optional] |
|**allowRebaseMerge** | **Boolean** |  |  [optional] |
|**tempCloneToken** | **String** |  |  [optional] |
|**allowSquashMerge** | **Boolean** |  |  [optional] |
|**allowAutoMerge** | **Boolean** |  |  [optional] |
|**deleteBranchOnMerge** | **Boolean** |  |  [optional] |
|**allowUpdateBranch** | **Boolean** |  |  [optional] |
|**useSquashPrTitleAsDefault** | **Boolean** |  |  [optional] |
|**squashMergeCommitTitle** | [**SquashMergeCommitTitleEnum**](#SquashMergeCommitTitleEnum) | The default value for a squash merge commit title:  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;COMMIT_OR_PR_TITLE&#x60; - default to the commit&#39;s title (if only one commit) or the pull request&#39;s title (when more than one commit). |  [optional] |
|**squashMergeCommitMessage** | [**SquashMergeCommitMessageEnum**](#SquashMergeCommitMessageEnum) | The default value for a squash merge commit message:  - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;COMMIT_MESSAGES&#x60; - default to the branch&#39;s commit messages. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional] |
|**mergeCommitTitle** | [**MergeCommitTitleEnum**](#MergeCommitTitleEnum) | The default value for a merge commit title.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;MERGE_MESSAGE&#x60; - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name). |  [optional] |
|**mergeCommitMessage** | [**MergeCommitMessageEnum**](#MergeCommitMessageEnum) | The default value for a merge commit message.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional] |
|**allowMergeCommit** | **Boolean** |  |  [optional] |
|**subscribersCount** | **Integer** |  |  [optional] |
|**networkCount** | **Integer** |  |  [optional] |



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



