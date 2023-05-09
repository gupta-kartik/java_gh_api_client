

# WebhookForkForkee

The created [`repository`](https://docs.github.com/rest/reference/repos#get-a-repository) resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowAutoMerge** | **Boolean** | Whether to allow auto-merge for pull requests. |  [optional] |
|**allowForking** | **Boolean** |  |  [optional] |
|**allowMergeCommit** | **Boolean** | Whether to allow merge commits for pull requests. |  [optional] |
|**allowRebaseMerge** | **Boolean** | Whether to allow rebase merges for pull requests. |  [optional] |
|**allowSquashMerge** | **Boolean** | Whether to allow squash merges for pull requests. |  [optional] |
|**allowUpdateBranch** | **Boolean** |  |  [optional] |
|**archiveUrl** | **String** |  |  |
|**archived** | **Boolean** |  |  |
|**assigneesUrl** | **String** |  |  |
|**blobsUrl** | **String** |  |  |
|**branchesUrl** | **String** |  |  |
|**cloneUrl** | **String** |  |  |
|**collaboratorsUrl** | **String** |  |  |
|**commentsUrl** | **String** |  |  |
|**commitsUrl** | **String** |  |  |
|**compareUrl** | **String** |  |  |
|**contentsUrl** | **String** |  |  |
|**contributorsUrl** | **String** |  |  |
|**createdAt** | **String** |  |  |
|**defaultBranch** | **String** |  |  |
|**deleteBranchOnMerge** | **Boolean** | Whether to delete head branches when pull requests are merged |  [optional] |
|**deploymentsUrl** | **String** |  |  |
|**description** | **String** |  |  |
|**disabled** | **Boolean** |  |  [optional] |
|**downloadsUrl** | **String** |  |  |
|**eventsUrl** | **String** |  |  |
|**fork** | [**ForkEnum**](#ForkEnum) |  |  |
|**forks** | **Integer** |  |  |
|**forksCount** | **Integer** |  |  |
|**forksUrl** | **String** |  |  |
|**fullName** | **String** |  |  |
|**gitCommitsUrl** | **String** |  |  |
|**gitRefsUrl** | **String** |  |  |
|**gitTagsUrl** | **String** |  |  |
|**gitUrl** | **String** |  |  |
|**hasDownloads** | **Boolean** |  |  |
|**hasIssues** | **Boolean** |  |  |
|**hasPages** | **Boolean** |  |  |
|**hasProjects** | **Boolean** |  |  |
|**hasWiki** | **Boolean** |  |  |
|**homepage** | **String** |  |  |
|**hooksUrl** | **String** |  |  |
|**htmlUrl** | **String** |  |  |
|**id** | **Integer** |  |  |
|**isTemplate** | **Boolean** |  |  [optional] |
|**issueCommentUrl** | **String** |  |  |
|**issueEventsUrl** | **String** |  |  |
|**issuesUrl** | **String** |  |  |
|**keysUrl** | **String** |  |  |
|**labelsUrl** | **String** |  |  |
|**language** | **Object** |  |  |
|**languagesUrl** | **String** |  |  |
|**license** | **Object** |  |  |
|**masterBranch** | **String** |  |  [optional] |
|**mergesUrl** | **String** |  |  |
|**milestonesUrl** | **String** |  |  |
|**mirrorUrl** | **Object** |  |  |
|**name** | **String** |  |  |
|**nodeId** | **String** |  |  |
|**notificationsUrl** | **String** |  |  |
|**openIssues** | **Integer** |  |  |
|**openIssuesCount** | **Integer** |  |  |
|**organization** | **String** |  |  [optional] |
|**owner** | [**DeploymentWorkflowRunHeadRepositoryOwner**](DeploymentWorkflowRunHeadRepositoryOwner.md) |  |  |
|**permissions** | [**RepositoryPermissions**](RepositoryPermissions.md) |  |  [optional] |
|**_private** | **Boolean** |  |  |
|**_public** | **Boolean** |  |  [optional] |
|**pullsUrl** | **String** |  |  |
|**pushedAt** | **String** |  |  |
|**releasesUrl** | **String** |  |  |
|**roleName** | **String** |  |  [optional] |
|**size** | **Integer** |  |  |
|**sshUrl** | **String** |  |  |
|**stargazers** | **Integer** |  |  [optional] |
|**stargazersCount** | **Integer** |  |  |
|**stargazersUrl** | **String** |  |  |
|**statusesUrl** | **String** |  |  |
|**subscribersUrl** | **String** |  |  |
|**subscriptionUrl** | **String** |  |  |
|**svnUrl** | **String** |  |  |
|**tagsUrl** | **String** |  |  |
|**teamsUrl** | **String** |  |  |
|**topics** | **List&lt;Object&gt;** |  |  |
|**treesUrl** | **String** |  |  |
|**updatedAt** | **String** |  |  |
|**url** | **String** |  |  |
|**visibility** | **String** |  |  |
|**watchers** | **Integer** |  |  |
|**watchersCount** | **Integer** |  |  |
|**webCommitSignoffRequired** | **Boolean** | Whether to require contributors to sign off on web-based commits |  [optional] |



## Enum: ForkEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |



