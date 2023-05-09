

# FullRepository

Full Repository

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**nodeId** | **String** |  |  |
|**name** | **String** |  |  |
|**fullName** | **String** |  |  |
|**owner** | [**SimpleUser**](SimpleUser.md) |  |  |
|**_private** | **Boolean** |  |  |
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
|**defaultBranch** | **String** |  |  |
|**openIssuesCount** | **Integer** |  |  |
|**isTemplate** | **Boolean** |  |  [optional] |
|**topics** | **List&lt;String&gt;** |  |  [optional] |
|**hasIssues** | **Boolean** |  |  |
|**hasProjects** | **Boolean** |  |  |
|**hasWiki** | **Boolean** |  |  |
|**hasPages** | **Boolean** |  |  |
|**hasDownloads** | **Boolean** |  |  |
|**hasDiscussions** | **Boolean** |  |  |
|**archived** | **Boolean** |  |  |
|**disabled** | **Boolean** | Returns whether or not this repository disabled. |  |
|**visibility** | **String** | The repository visibility: public, private, or internal. |  [optional] |
|**pushedAt** | **OffsetDateTime** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**permissions** | [**FullRepositoryPermissions**](FullRepositoryPermissions.md) |  |  [optional] |
|**allowRebaseMerge** | **Boolean** |  |  [optional] |
|**templateRepository** | [**NullableRepository**](NullableRepository.md) |  |  [optional] |
|**tempCloneToken** | **String** |  |  [optional] |
|**allowSquashMerge** | **Boolean** |  |  [optional] |
|**allowAutoMerge** | **Boolean** |  |  [optional] |
|**deleteBranchOnMerge** | **Boolean** |  |  [optional] |
|**allowMergeCommit** | **Boolean** |  |  [optional] |
|**allowUpdateBranch** | **Boolean** |  |  [optional] |
|**useSquashPrTitleAsDefault** | **Boolean** |  |  [optional] |
|**squashMergeCommitTitle** | [**SquashMergeCommitTitleEnum**](#SquashMergeCommitTitleEnum) | The default value for a squash merge commit title:  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;COMMIT_OR_PR_TITLE&#x60; - default to the commit&#39;s title (if only one commit) or the pull request&#39;s title (when more than one commit). |  [optional] |
|**squashMergeCommitMessage** | [**SquashMergeCommitMessageEnum**](#SquashMergeCommitMessageEnum) | The default value for a squash merge commit message:  - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;COMMIT_MESSAGES&#x60; - default to the branch&#39;s commit messages. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional] |
|**mergeCommitTitle** | [**MergeCommitTitleEnum**](#MergeCommitTitleEnum) | The default value for a merge commit title.    - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title.   - &#x60;MERGE_MESSAGE&#x60; - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name). |  [optional] |
|**mergeCommitMessage** | [**MergeCommitMessageEnum**](#MergeCommitMessageEnum) | The default value for a merge commit message.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional] |
|**allowForking** | **Boolean** |  |  [optional] |
|**webCommitSignoffRequired** | **Boolean** |  |  [optional] |
|**subscribersCount** | **Integer** |  |  |
|**networkCount** | **Integer** |  |  |
|**license** | [**NullableLicenseSimple**](NullableLicenseSimple.md) |  |  |
|**organization** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  [optional] |
|**parent** | [**Repository**](Repository.md) |  |  [optional] |
|**source** | [**Repository**](Repository.md) |  |  [optional] |
|**forks** | **Integer** |  |  |
|**masterBranch** | **String** |  |  [optional] |
|**openIssues** | **Integer** |  |  |
|**watchers** | **Integer** |  |  |
|**anonymousAccessEnabled** | **Boolean** | Whether anonymous git access is allowed. |  [optional] |
|**codeOfConduct** | [**CodeOfConductSimple**](CodeOfConductSimple.md) |  |  [optional] |
|**securityAndAnalysis** | [**SecurityAndAnalysis**](SecurityAndAnalysis.md) |  |  [optional] |



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



