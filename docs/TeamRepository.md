

# TeamRepository

A team's access to a repository.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the repository |  |
|**nodeId** | **String** |  |  |
|**name** | **String** | The name of the repository. |  |
|**fullName** | **String** |  |  |
|**license** | [**NullableLicenseSimple**](NullableLicenseSimple.md) |  |  |
|**forks** | **Integer** |  |  |
|**permissions** | [**RepositoryPermissions**](RepositoryPermissions.md) |  |  [optional] |
|**roleName** | **String** |  |  [optional] |
|**owner** | [**NullableSimpleUser**](NullableSimpleUser.md) |  |  |
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
|**size** | **Integer** |  |  |
|**defaultBranch** | **String** | The default branch of the repository. |  |
|**openIssuesCount** | **Integer** |  |  |
|**isTemplate** | **Boolean** | Whether this repository acts as a template that can be used to generate new repositories. |  [optional] |
|**topics** | **List&lt;String&gt;** |  |  [optional] |
|**hasIssues** | **Boolean** | Whether issues are enabled. |  |
|**hasProjects** | **Boolean** | Whether projects are enabled. |  |
|**hasWiki** | **Boolean** | Whether the wiki is enabled. |  |
|**hasPages** | **Boolean** |  |  |
|**hasDownloads** | **Boolean** | Whether downloads are enabled. |  |
|**archived** | **Boolean** | Whether the repository is archived. |  |
|**disabled** | **Boolean** | Returns whether or not this repository disabled. |  |
|**visibility** | **String** | The repository visibility: public, private, or internal. |  [optional] |
|**pushedAt** | **OffsetDateTime** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**allowRebaseMerge** | **Boolean** | Whether to allow rebase merges for pull requests. |  [optional] |
|**templateRepository** | [**NullableRepository**](NullableRepository.md) |  |  [optional] |
|**tempCloneToken** | **String** |  |  [optional] |
|**allowSquashMerge** | **Boolean** | Whether to allow squash merges for pull requests. |  [optional] |
|**allowAutoMerge** | **Boolean** | Whether to allow Auto-merge to be used on pull requests. |  [optional] |
|**deleteBranchOnMerge** | **Boolean** | Whether to delete head branches when pull requests are merged |  [optional] |
|**allowMergeCommit** | **Boolean** | Whether to allow merge commits for pull requests. |  [optional] |
|**allowForking** | **Boolean** | Whether to allow forking this repo |  [optional] |
|**webCommitSignoffRequired** | **Boolean** | Whether to require contributors to sign off on web-based commits |  [optional] |
|**subscribersCount** | **Integer** |  |  [optional] |
|**networkCount** | **Integer** |  |  [optional] |
|**openIssues** | **Integer** |  |  |
|**watchers** | **Integer** |  |  |
|**masterBranch** | **String** |  |  [optional] |



