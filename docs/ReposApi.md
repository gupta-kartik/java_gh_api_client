# ReposApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reposAcceptInvitationForAuthenticatedUser**](ReposApi.md#reposAcceptInvitationForAuthenticatedUser) | **PATCH** /user/repository_invitations/{invitation_id} | Accept a repository invitation |
| [**reposAddAppAccessRestrictions**](ReposApi.md#reposAddAppAccessRestrictions) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps | Add app access restrictions |
| [**reposAddCollaborator**](ReposApi.md#reposAddCollaborator) | **PUT** /repos/{owner}/{repo}/collaborators/{username} | Add a repository collaborator |
| [**reposAddStatusCheckContexts**](ReposApi.md#reposAddStatusCheckContexts) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts | Add status check contexts |
| [**reposAddTeamAccessRestrictions**](ReposApi.md#reposAddTeamAccessRestrictions) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams | Add team access restrictions |
| [**reposAddUserAccessRestrictions**](ReposApi.md#reposAddUserAccessRestrictions) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users | Add user access restrictions |
| [**reposCheckCollaborator**](ReposApi.md#reposCheckCollaborator) | **GET** /repos/{owner}/{repo}/collaborators/{username} | Check if a user is a repository collaborator |
| [**reposCheckVulnerabilityAlerts**](ReposApi.md#reposCheckVulnerabilityAlerts) | **GET** /repos/{owner}/{repo}/vulnerability-alerts | Check if vulnerability alerts are enabled for a repository |
| [**reposCodeownersErrors**](ReposApi.md#reposCodeownersErrors) | **GET** /repos/{owner}/{repo}/codeowners/errors | List CODEOWNERS errors |
| [**reposCompareCommits**](ReposApi.md#reposCompareCommits) | **GET** /repos/{owner}/{repo}/compare/{basehead} | Compare two commits |
| [**reposCreateAutolink**](ReposApi.md#reposCreateAutolink) | **POST** /repos/{owner}/{repo}/autolinks | Create an autolink reference for a repository |
| [**reposCreateCommitComment**](ReposApi.md#reposCreateCommitComment) | **POST** /repos/{owner}/{repo}/commits/{commit_sha}/comments | Create a commit comment |
| [**reposCreateCommitSignatureProtection**](ReposApi.md#reposCreateCommitSignatureProtection) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures | Create commit signature protection |
| [**reposCreateCommitStatus**](ReposApi.md#reposCreateCommitStatus) | **POST** /repos/{owner}/{repo}/statuses/{sha} | Create a commit status |
| [**reposCreateDeployKey**](ReposApi.md#reposCreateDeployKey) | **POST** /repos/{owner}/{repo}/keys | Create a deploy key |
| [**reposCreateDeployment**](ReposApi.md#reposCreateDeployment) | **POST** /repos/{owner}/{repo}/deployments | Create a deployment |
| [**reposCreateDeploymentBranchPolicy**](ReposApi.md#reposCreateDeploymentBranchPolicy) | **POST** /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies | Create a deployment branch policy |
| [**reposCreateDeploymentProtectionRule**](ReposApi.md#reposCreateDeploymentProtectionRule) | **POST** /repos/{owner}/{repo}/environments/{environment_name}/deployment_protection_rules | Create a custom deployment protection rule on an environment |
| [**reposCreateDeploymentStatus**](ReposApi.md#reposCreateDeploymentStatus) | **POST** /repos/{owner}/{repo}/deployments/{deployment_id}/statuses | Create a deployment status |
| [**reposCreateDispatchEvent**](ReposApi.md#reposCreateDispatchEvent) | **POST** /repos/{owner}/{repo}/dispatches | Create a repository dispatch event |
| [**reposCreateForAuthenticatedUser**](ReposApi.md#reposCreateForAuthenticatedUser) | **POST** /user/repos | Create a repository for the authenticated user |
| [**reposCreateFork**](ReposApi.md#reposCreateFork) | **POST** /repos/{owner}/{repo}/forks | Create a fork |
| [**reposCreateInOrg**](ReposApi.md#reposCreateInOrg) | **POST** /orgs/{org}/repos | Create an organization repository |
| [**reposCreateOrUpdateEnvironment**](ReposApi.md#reposCreateOrUpdateEnvironment) | **PUT** /repos/{owner}/{repo}/environments/{environment_name} | Create or update an environment |
| [**reposCreateOrUpdateFileContents**](ReposApi.md#reposCreateOrUpdateFileContents) | **PUT** /repos/{owner}/{repo}/contents/{path} | Create or update file contents |
| [**reposCreateOrgRuleset**](ReposApi.md#reposCreateOrgRuleset) | **POST** /orgs/{org}/rulesets | Create an organization repository ruleset |
| [**reposCreatePagesDeployment**](ReposApi.md#reposCreatePagesDeployment) | **POST** /repos/{owner}/{repo}/pages/deployment | Create a GitHub Pages deployment |
| [**reposCreatePagesSite**](ReposApi.md#reposCreatePagesSite) | **POST** /repos/{owner}/{repo}/pages | Create a GitHub Pages site |
| [**reposCreateRelease**](ReposApi.md#reposCreateRelease) | **POST** /repos/{owner}/{repo}/releases | Create a release |
| [**reposCreateRepoRuleset**](ReposApi.md#reposCreateRepoRuleset) | **POST** /repos/{owner}/{repo}/rulesets | Create a repository ruleset |
| [**reposCreateTagProtection**](ReposApi.md#reposCreateTagProtection) | **POST** /repos/{owner}/{repo}/tags/protection | Create a tag protection state for a repository |
| [**reposCreateUsingTemplate**](ReposApi.md#reposCreateUsingTemplate) | **POST** /repos/{template_owner}/{template_repo}/generate | Create a repository using a template |
| [**reposCreateWebhook**](ReposApi.md#reposCreateWebhook) | **POST** /repos/{owner}/{repo}/hooks | Create a repository webhook |
| [**reposDeclineInvitationForAuthenticatedUser**](ReposApi.md#reposDeclineInvitationForAuthenticatedUser) | **DELETE** /user/repository_invitations/{invitation_id} | Decline a repository invitation |
| [**reposDelete**](ReposApi.md#reposDelete) | **DELETE** /repos/{owner}/{repo} | Delete a repository |
| [**reposDeleteAccessRestrictions**](ReposApi.md#reposDeleteAccessRestrictions) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions | Delete access restrictions |
| [**reposDeleteAdminBranchProtection**](ReposApi.md#reposDeleteAdminBranchProtection) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins | Delete admin branch protection |
| [**reposDeleteAnEnvironment**](ReposApi.md#reposDeleteAnEnvironment) | **DELETE** /repos/{owner}/{repo}/environments/{environment_name} | Delete an environment |
| [**reposDeleteAutolink**](ReposApi.md#reposDeleteAutolink) | **DELETE** /repos/{owner}/{repo}/autolinks/{autolink_id} | Delete an autolink reference from a repository |
| [**reposDeleteBranchProtection**](ReposApi.md#reposDeleteBranchProtection) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection | Delete branch protection |
| [**reposDeleteCommitComment**](ReposApi.md#reposDeleteCommitComment) | **DELETE** /repos/{owner}/{repo}/comments/{comment_id} | Delete a commit comment |
| [**reposDeleteCommitSignatureProtection**](ReposApi.md#reposDeleteCommitSignatureProtection) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures | Delete commit signature protection |
| [**reposDeleteDeployKey**](ReposApi.md#reposDeleteDeployKey) | **DELETE** /repos/{owner}/{repo}/keys/{key_id} | Delete a deploy key |
| [**reposDeleteDeployment**](ReposApi.md#reposDeleteDeployment) | **DELETE** /repos/{owner}/{repo}/deployments/{deployment_id} | Delete a deployment |
| [**reposDeleteDeploymentBranchPolicy**](ReposApi.md#reposDeleteDeploymentBranchPolicy) | **DELETE** /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id} | Delete a deployment branch policy |
| [**reposDeleteFile**](ReposApi.md#reposDeleteFile) | **DELETE** /repos/{owner}/{repo}/contents/{path} | Delete a file |
| [**reposDeleteInvitation**](ReposApi.md#reposDeleteInvitation) | **DELETE** /repos/{owner}/{repo}/invitations/{invitation_id} | Delete a repository invitation |
| [**reposDeleteOrgRuleset**](ReposApi.md#reposDeleteOrgRuleset) | **DELETE** /orgs/{org}/rulesets/{ruleset_id} | Delete an organization repository ruleset |
| [**reposDeletePagesSite**](ReposApi.md#reposDeletePagesSite) | **DELETE** /repos/{owner}/{repo}/pages | Delete a GitHub Pages site |
| [**reposDeletePullRequestReviewProtection**](ReposApi.md#reposDeletePullRequestReviewProtection) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews | Delete pull request review protection |
| [**reposDeleteRelease**](ReposApi.md#reposDeleteRelease) | **DELETE** /repos/{owner}/{repo}/releases/{release_id} | Delete a release |
| [**reposDeleteReleaseAsset**](ReposApi.md#reposDeleteReleaseAsset) | **DELETE** /repos/{owner}/{repo}/releases/assets/{asset_id} | Delete a release asset |
| [**reposDeleteRepoRuleset**](ReposApi.md#reposDeleteRepoRuleset) | **DELETE** /repos/{owner}/{repo}/rulesets/{ruleset_id} | Delete a repository ruleset |
| [**reposDeleteTagProtection**](ReposApi.md#reposDeleteTagProtection) | **DELETE** /repos/{owner}/{repo}/tags/protection/{tag_protection_id} | Delete a tag protection state for a repository |
| [**reposDeleteWebhook**](ReposApi.md#reposDeleteWebhook) | **DELETE** /repos/{owner}/{repo}/hooks/{hook_id} | Delete a repository webhook |
| [**reposDisableAutomatedSecurityFixes**](ReposApi.md#reposDisableAutomatedSecurityFixes) | **DELETE** /repos/{owner}/{repo}/automated-security-fixes | Disable automated security fixes |
| [**reposDisableDeploymentProtectionRule**](ReposApi.md#reposDisableDeploymentProtectionRule) | **DELETE** /repos/{owner}/{repo}/environments/{environment_name}/deployment_protection_rules/{protection_rule_id} | Disable a custom protection rule for an environment |
| [**reposDisableLfsForRepo**](ReposApi.md#reposDisableLfsForRepo) | **DELETE** /repos/{owner}/{repo}/lfs | Disable Git LFS for a repository |
| [**reposDisableVulnerabilityAlerts**](ReposApi.md#reposDisableVulnerabilityAlerts) | **DELETE** /repos/{owner}/{repo}/vulnerability-alerts | Disable vulnerability alerts |
| [**reposDownloadTarballArchive**](ReposApi.md#reposDownloadTarballArchive) | **GET** /repos/{owner}/{repo}/tarball/{ref} | Download a repository archive (tar) |
| [**reposDownloadZipballArchive**](ReposApi.md#reposDownloadZipballArchive) | **GET** /repos/{owner}/{repo}/zipball/{ref} | Download a repository archive (zip) |
| [**reposEnableAutomatedSecurityFixes**](ReposApi.md#reposEnableAutomatedSecurityFixes) | **PUT** /repos/{owner}/{repo}/automated-security-fixes | Enable automated security fixes |
| [**reposEnableLfsForRepo**](ReposApi.md#reposEnableLfsForRepo) | **PUT** /repos/{owner}/{repo}/lfs | Enable Git LFS for a repository |
| [**reposEnableVulnerabilityAlerts**](ReposApi.md#reposEnableVulnerabilityAlerts) | **PUT** /repos/{owner}/{repo}/vulnerability-alerts | Enable vulnerability alerts |
| [**reposGenerateReleaseNotes**](ReposApi.md#reposGenerateReleaseNotes) | **POST** /repos/{owner}/{repo}/releases/generate-notes | Generate release notes content for a release |
| [**reposGet**](ReposApi.md#reposGet) | **GET** /repos/{owner}/{repo} | Get a repository |
| [**reposGetAccessRestrictions**](ReposApi.md#reposGetAccessRestrictions) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions | Get access restrictions |
| [**reposGetAdminBranchProtection**](ReposApi.md#reposGetAdminBranchProtection) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins | Get admin branch protection |
| [**reposGetAllDeploymentProtectionRules**](ReposApi.md#reposGetAllDeploymentProtectionRules) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/deployment_protection_rules | Get all deployment protection rules for an environment |
| [**reposGetAllEnvironments**](ReposApi.md#reposGetAllEnvironments) | **GET** /repos/{owner}/{repo}/environments | List environments |
| [**reposGetAllStatusCheckContexts**](ReposApi.md#reposGetAllStatusCheckContexts) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts | Get all status check contexts |
| [**reposGetAllTopics**](ReposApi.md#reposGetAllTopics) | **GET** /repos/{owner}/{repo}/topics | Get all repository topics |
| [**reposGetAppsWithAccessToProtectedBranch**](ReposApi.md#reposGetAppsWithAccessToProtectedBranch) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps | Get apps with access to the protected branch |
| [**reposGetAutolink**](ReposApi.md#reposGetAutolink) | **GET** /repos/{owner}/{repo}/autolinks/{autolink_id} | Get an autolink reference of a repository |
| [**reposGetBranch**](ReposApi.md#reposGetBranch) | **GET** /repos/{owner}/{repo}/branches/{branch} | Get a branch |
| [**reposGetBranchProtection**](ReposApi.md#reposGetBranchProtection) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection | Get branch protection |
| [**reposGetBranchRules**](ReposApi.md#reposGetBranchRules) | **GET** /repos/{owner}/{repo}/rules/branches/{branch} | Get rules for a branch |
| [**reposGetClones**](ReposApi.md#reposGetClones) | **GET** /repos/{owner}/{repo}/traffic/clones | Get repository clones |
| [**reposGetCodeFrequencyStats**](ReposApi.md#reposGetCodeFrequencyStats) | **GET** /repos/{owner}/{repo}/stats/code_frequency | Get the weekly commit activity |
| [**reposGetCollaboratorPermissionLevel**](ReposApi.md#reposGetCollaboratorPermissionLevel) | **GET** /repos/{owner}/{repo}/collaborators/{username}/permission | Get repository permissions for a user |
| [**reposGetCombinedStatusForRef**](ReposApi.md#reposGetCombinedStatusForRef) | **GET** /repos/{owner}/{repo}/commits/{ref}/status | Get the combined status for a specific reference |
| [**reposGetCommit**](ReposApi.md#reposGetCommit) | **GET** /repos/{owner}/{repo}/commits/{ref} | Get a commit |
| [**reposGetCommitActivityStats**](ReposApi.md#reposGetCommitActivityStats) | **GET** /repos/{owner}/{repo}/stats/commit_activity | Get the last year of commit activity |
| [**reposGetCommitComment**](ReposApi.md#reposGetCommitComment) | **GET** /repos/{owner}/{repo}/comments/{comment_id} | Get a commit comment |
| [**reposGetCommitSignatureProtection**](ReposApi.md#reposGetCommitSignatureProtection) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures | Get commit signature protection |
| [**reposGetCommunityProfileMetrics**](ReposApi.md#reposGetCommunityProfileMetrics) | **GET** /repos/{owner}/{repo}/community/profile | Get community profile metrics |
| [**reposGetContent**](ReposApi.md#reposGetContent) | **GET** /repos/{owner}/{repo}/contents/{path} | Get repository content |
| [**reposGetContributorsStats**](ReposApi.md#reposGetContributorsStats) | **GET** /repos/{owner}/{repo}/stats/contributors | Get all contributor commit activity |
| [**reposGetCustomDeploymentProtectionRule**](ReposApi.md#reposGetCustomDeploymentProtectionRule) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/deployment_protection_rules/{protection_rule_id} | Get a custom deployment protection rule |
| [**reposGetDeployKey**](ReposApi.md#reposGetDeployKey) | **GET** /repos/{owner}/{repo}/keys/{key_id} | Get a deploy key |
| [**reposGetDeployment**](ReposApi.md#reposGetDeployment) | **GET** /repos/{owner}/{repo}/deployments/{deployment_id} | Get a deployment |
| [**reposGetDeploymentBranchPolicy**](ReposApi.md#reposGetDeploymentBranchPolicy) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id} | Get a deployment branch policy |
| [**reposGetDeploymentStatus**](ReposApi.md#reposGetDeploymentStatus) | **GET** /repos/{owner}/{repo}/deployments/{deployment_id}/statuses/{status_id} | Get a deployment status |
| [**reposGetEnvironment**](ReposApi.md#reposGetEnvironment) | **GET** /repos/{owner}/{repo}/environments/{environment_name} | Get an environment |
| [**reposGetLatestPagesBuild**](ReposApi.md#reposGetLatestPagesBuild) | **GET** /repos/{owner}/{repo}/pages/builds/latest | Get latest Pages build |
| [**reposGetLatestRelease**](ReposApi.md#reposGetLatestRelease) | **GET** /repos/{owner}/{repo}/releases/latest | Get the latest release |
| [**reposGetOrgRuleset**](ReposApi.md#reposGetOrgRuleset) | **GET** /orgs/{org}/rulesets/{ruleset_id} | Get an organization repository ruleset |
| [**reposGetOrgRulesets**](ReposApi.md#reposGetOrgRulesets) | **GET** /orgs/{org}/rulesets | Get all organization repository rulesets |
| [**reposGetPages**](ReposApi.md#reposGetPages) | **GET** /repos/{owner}/{repo}/pages | Get a GitHub Pages site |
| [**reposGetPagesBuild**](ReposApi.md#reposGetPagesBuild) | **GET** /repos/{owner}/{repo}/pages/builds/{build_id} | Get GitHub Pages build |
| [**reposGetPagesHealthCheck**](ReposApi.md#reposGetPagesHealthCheck) | **GET** /repos/{owner}/{repo}/pages/health | Get a DNS health check for GitHub Pages |
| [**reposGetParticipationStats**](ReposApi.md#reposGetParticipationStats) | **GET** /repos/{owner}/{repo}/stats/participation | Get the weekly commit count |
| [**reposGetPullRequestReviewProtection**](ReposApi.md#reposGetPullRequestReviewProtection) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews | Get pull request review protection |
| [**reposGetPunchCardStats**](ReposApi.md#reposGetPunchCardStats) | **GET** /repos/{owner}/{repo}/stats/punch_card | Get the hourly commit count for each day |
| [**reposGetReadme**](ReposApi.md#reposGetReadme) | **GET** /repos/{owner}/{repo}/readme | Get a repository README |
| [**reposGetReadmeInDirectory**](ReposApi.md#reposGetReadmeInDirectory) | **GET** /repos/{owner}/{repo}/readme/{dir} | Get a repository README for a directory |
| [**reposGetRelease**](ReposApi.md#reposGetRelease) | **GET** /repos/{owner}/{repo}/releases/{release_id} | Get a release |
| [**reposGetReleaseAsset**](ReposApi.md#reposGetReleaseAsset) | **GET** /repos/{owner}/{repo}/releases/assets/{asset_id} | Get a release asset |
| [**reposGetReleaseByTag**](ReposApi.md#reposGetReleaseByTag) | **GET** /repos/{owner}/{repo}/releases/tags/{tag} | Get a release by tag name |
| [**reposGetRepoRuleset**](ReposApi.md#reposGetRepoRuleset) | **GET** /repos/{owner}/{repo}/rulesets/{ruleset_id} | Get a repository ruleset |
| [**reposGetRepoRulesets**](ReposApi.md#reposGetRepoRulesets) | **GET** /repos/{owner}/{repo}/rulesets | Get all repository rulesets |
| [**reposGetStatusChecksProtection**](ReposApi.md#reposGetStatusChecksProtection) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks | Get status checks protection |
| [**reposGetTeamsWithAccessToProtectedBranch**](ReposApi.md#reposGetTeamsWithAccessToProtectedBranch) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams | Get teams with access to the protected branch |
| [**reposGetTopPaths**](ReposApi.md#reposGetTopPaths) | **GET** /repos/{owner}/{repo}/traffic/popular/paths | Get top referral paths |
| [**reposGetTopReferrers**](ReposApi.md#reposGetTopReferrers) | **GET** /repos/{owner}/{repo}/traffic/popular/referrers | Get top referral sources |
| [**reposGetUsersWithAccessToProtectedBranch**](ReposApi.md#reposGetUsersWithAccessToProtectedBranch) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users | Get users with access to the protected branch |
| [**reposGetViews**](ReposApi.md#reposGetViews) | **GET** /repos/{owner}/{repo}/traffic/views | Get page views |
| [**reposGetWebhook**](ReposApi.md#reposGetWebhook) | **GET** /repos/{owner}/{repo}/hooks/{hook_id} | Get a repository webhook |
| [**reposGetWebhookConfigForRepo**](ReposApi.md#reposGetWebhookConfigForRepo) | **GET** /repos/{owner}/{repo}/hooks/{hook_id}/config | Get a webhook configuration for a repository |
| [**reposGetWebhookDelivery**](ReposApi.md#reposGetWebhookDelivery) | **GET** /repos/{owner}/{repo}/hooks/{hook_id}/deliveries/{delivery_id} | Get a delivery for a repository webhook |
| [**reposListAutolinks**](ReposApi.md#reposListAutolinks) | **GET** /repos/{owner}/{repo}/autolinks | List all autolinks of a repository |
| [**reposListBranches**](ReposApi.md#reposListBranches) | **GET** /repos/{owner}/{repo}/branches | List branches |
| [**reposListBranchesForHeadCommit**](ReposApi.md#reposListBranchesForHeadCommit) | **GET** /repos/{owner}/{repo}/commits/{commit_sha}/branches-where-head | List branches for HEAD commit |
| [**reposListCollaborators**](ReposApi.md#reposListCollaborators) | **GET** /repos/{owner}/{repo}/collaborators | List repository collaborators |
| [**reposListCommentsForCommit**](ReposApi.md#reposListCommentsForCommit) | **GET** /repos/{owner}/{repo}/commits/{commit_sha}/comments | List commit comments |
| [**reposListCommitCommentsForRepo**](ReposApi.md#reposListCommitCommentsForRepo) | **GET** /repos/{owner}/{repo}/comments | List commit comments for a repository |
| [**reposListCommitStatusesForRef**](ReposApi.md#reposListCommitStatusesForRef) | **GET** /repos/{owner}/{repo}/commits/{ref}/statuses | List commit statuses for a reference |
| [**reposListCommits**](ReposApi.md#reposListCommits) | **GET** /repos/{owner}/{repo}/commits | List commits |
| [**reposListContributors**](ReposApi.md#reposListContributors) | **GET** /repos/{owner}/{repo}/contributors | List repository contributors |
| [**reposListCustomDeploymentRuleIntegrations**](ReposApi.md#reposListCustomDeploymentRuleIntegrations) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/deployment_protection_rules/apps | List custom deployment rule integrations available for an environment |
| [**reposListDeployKeys**](ReposApi.md#reposListDeployKeys) | **GET** /repos/{owner}/{repo}/keys | List deploy keys |
| [**reposListDeploymentBranchPolicies**](ReposApi.md#reposListDeploymentBranchPolicies) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies | List deployment branch policies |
| [**reposListDeploymentStatuses**](ReposApi.md#reposListDeploymentStatuses) | **GET** /repos/{owner}/{repo}/deployments/{deployment_id}/statuses | List deployment statuses |
| [**reposListDeployments**](ReposApi.md#reposListDeployments) | **GET** /repos/{owner}/{repo}/deployments | List deployments |
| [**reposListForAuthenticatedUser**](ReposApi.md#reposListForAuthenticatedUser) | **GET** /user/repos | List repositories for the authenticated user |
| [**reposListForOrg**](ReposApi.md#reposListForOrg) | **GET** /orgs/{org}/repos | List organization repositories |
| [**reposListForUser**](ReposApi.md#reposListForUser) | **GET** /users/{username}/repos | List repositories for a user |
| [**reposListForks**](ReposApi.md#reposListForks) | **GET** /repos/{owner}/{repo}/forks | List forks |
| [**reposListInvitations**](ReposApi.md#reposListInvitations) | **GET** /repos/{owner}/{repo}/invitations | List repository invitations |
| [**reposListInvitationsForAuthenticatedUser**](ReposApi.md#reposListInvitationsForAuthenticatedUser) | **GET** /user/repository_invitations | List repository invitations for the authenticated user |
| [**reposListLanguages**](ReposApi.md#reposListLanguages) | **GET** /repos/{owner}/{repo}/languages | List repository languages |
| [**reposListPagesBuilds**](ReposApi.md#reposListPagesBuilds) | **GET** /repos/{owner}/{repo}/pages/builds | List GitHub Pages builds |
| [**reposListPublic**](ReposApi.md#reposListPublic) | **GET** /repositories | List public repositories |
| [**reposListPullRequestsAssociatedWithCommit**](ReposApi.md#reposListPullRequestsAssociatedWithCommit) | **GET** /repos/{owner}/{repo}/commits/{commit_sha}/pulls | List pull requests associated with a commit |
| [**reposListReleaseAssets**](ReposApi.md#reposListReleaseAssets) | **GET** /repos/{owner}/{repo}/releases/{release_id}/assets | List release assets |
| [**reposListReleases**](ReposApi.md#reposListReleases) | **GET** /repos/{owner}/{repo}/releases | List releases |
| [**reposListTagProtection**](ReposApi.md#reposListTagProtection) | **GET** /repos/{owner}/{repo}/tags/protection | List tag protection states for a repository |
| [**reposListTags**](ReposApi.md#reposListTags) | **GET** /repos/{owner}/{repo}/tags | List repository tags |
| [**reposListTeams**](ReposApi.md#reposListTeams) | **GET** /repos/{owner}/{repo}/teams | List repository teams |
| [**reposListWebhookDeliveries**](ReposApi.md#reposListWebhookDeliveries) | **GET** /repos/{owner}/{repo}/hooks/{hook_id}/deliveries | List deliveries for a repository webhook |
| [**reposListWebhooks**](ReposApi.md#reposListWebhooks) | **GET** /repos/{owner}/{repo}/hooks | List repository webhooks |
| [**reposMerge**](ReposApi.md#reposMerge) | **POST** /repos/{owner}/{repo}/merges | Merge a branch |
| [**reposMergeUpstream**](ReposApi.md#reposMergeUpstream) | **POST** /repos/{owner}/{repo}/merge-upstream | Sync a fork branch with the upstream repository |
| [**reposPingWebhook**](ReposApi.md#reposPingWebhook) | **POST** /repos/{owner}/{repo}/hooks/{hook_id}/pings | Ping a repository webhook |
| [**reposRedeliverWebhookDelivery**](ReposApi.md#reposRedeliverWebhookDelivery) | **POST** /repos/{owner}/{repo}/hooks/{hook_id}/deliveries/{delivery_id}/attempts | Redeliver a delivery for a repository webhook |
| [**reposRemoveAppAccessRestrictions**](ReposApi.md#reposRemoveAppAccessRestrictions) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps | Remove app access restrictions |
| [**reposRemoveCollaborator**](ReposApi.md#reposRemoveCollaborator) | **DELETE** /repos/{owner}/{repo}/collaborators/{username} | Remove a repository collaborator |
| [**reposRemoveStatusCheckContexts**](ReposApi.md#reposRemoveStatusCheckContexts) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts | Remove status check contexts |
| [**reposRemoveStatusCheckProtection**](ReposApi.md#reposRemoveStatusCheckProtection) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks | Remove status check protection |
| [**reposRemoveTeamAccessRestrictions**](ReposApi.md#reposRemoveTeamAccessRestrictions) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams | Remove team access restrictions |
| [**reposRemoveUserAccessRestrictions**](ReposApi.md#reposRemoveUserAccessRestrictions) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users | Remove user access restrictions |
| [**reposRenameBranch**](ReposApi.md#reposRenameBranch) | **POST** /repos/{owner}/{repo}/branches/{branch}/rename | Rename a branch |
| [**reposReplaceAllTopics**](ReposApi.md#reposReplaceAllTopics) | **PUT** /repos/{owner}/{repo}/topics | Replace all repository topics |
| [**reposRequestPagesBuild**](ReposApi.md#reposRequestPagesBuild) | **POST** /repos/{owner}/{repo}/pages/builds | Request a GitHub Pages build |
| [**reposSetAdminBranchProtection**](ReposApi.md#reposSetAdminBranchProtection) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins | Set admin branch protection |
| [**reposSetAppAccessRestrictions**](ReposApi.md#reposSetAppAccessRestrictions) | **PUT** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps | Set app access restrictions |
| [**reposSetStatusCheckContexts**](ReposApi.md#reposSetStatusCheckContexts) | **PUT** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts | Set status check contexts |
| [**reposSetTeamAccessRestrictions**](ReposApi.md#reposSetTeamAccessRestrictions) | **PUT** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams | Set team access restrictions |
| [**reposSetUserAccessRestrictions**](ReposApi.md#reposSetUserAccessRestrictions) | **PUT** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users | Set user access restrictions |
| [**reposTestPushWebhook**](ReposApi.md#reposTestPushWebhook) | **POST** /repos/{owner}/{repo}/hooks/{hook_id}/tests | Test the push repository webhook |
| [**reposTransfer**](ReposApi.md#reposTransfer) | **POST** /repos/{owner}/{repo}/transfer | Transfer a repository |
| [**reposUpdate**](ReposApi.md#reposUpdate) | **PATCH** /repos/{owner}/{repo} | Update a repository |
| [**reposUpdateBranchProtection**](ReposApi.md#reposUpdateBranchProtection) | **PUT** /repos/{owner}/{repo}/branches/{branch}/protection | Update branch protection |
| [**reposUpdateCommitComment**](ReposApi.md#reposUpdateCommitComment) | **PATCH** /repos/{owner}/{repo}/comments/{comment_id} | Update a commit comment |
| [**reposUpdateDeploymentBranchPolicy**](ReposApi.md#reposUpdateDeploymentBranchPolicy) | **PUT** /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id} | Update a deployment branch policy |
| [**reposUpdateInformationAboutPagesSite**](ReposApi.md#reposUpdateInformationAboutPagesSite) | **PUT** /repos/{owner}/{repo}/pages | Update information about a GitHub Pages site |
| [**reposUpdateInvitation**](ReposApi.md#reposUpdateInvitation) | **PATCH** /repos/{owner}/{repo}/invitations/{invitation_id} | Update a repository invitation |
| [**reposUpdateOrgRuleset**](ReposApi.md#reposUpdateOrgRuleset) | **PUT** /orgs/{org}/rulesets/{ruleset_id} | Update an organization repository ruleset |
| [**reposUpdatePullRequestReviewProtection**](ReposApi.md#reposUpdatePullRequestReviewProtection) | **PATCH** /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews | Update pull request review protection |
| [**reposUpdateRelease**](ReposApi.md#reposUpdateRelease) | **PATCH** /repos/{owner}/{repo}/releases/{release_id} | Update a release |
| [**reposUpdateReleaseAsset**](ReposApi.md#reposUpdateReleaseAsset) | **PATCH** /repos/{owner}/{repo}/releases/assets/{asset_id} | Update a release asset |
| [**reposUpdateRepoRuleset**](ReposApi.md#reposUpdateRepoRuleset) | **PUT** /repos/{owner}/{repo}/rulesets/{ruleset_id} | Update a repository ruleset |
| [**reposUpdateStatusCheckProtection**](ReposApi.md#reposUpdateStatusCheckProtection) | **PATCH** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks | Update status check protection |
| [**reposUpdateWebhook**](ReposApi.md#reposUpdateWebhook) | **PATCH** /repos/{owner}/{repo}/hooks/{hook_id} | Update a repository webhook |
| [**reposUpdateWebhookConfigForRepo**](ReposApi.md#reposUpdateWebhookConfigForRepo) | **PATCH** /repos/{owner}/{repo}/hooks/{hook_id}/config | Update a webhook configuration for a repository |
| [**reposUploadReleaseAsset**](ReposApi.md#reposUploadReleaseAsset) | **POST** /repos/{owner}/{repo}/releases/{release_id}/assets | Upload a release asset |


<a name="reposAcceptInvitationForAuthenticatedUser"></a>
# **reposAcceptInvitationForAuthenticatedUser**
> reposAcceptInvitationForAuthenticatedUser(invitationId)

Accept a repository invitation



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    Integer invitationId = 56; // Integer | The unique identifier of the invitation.
    try {
      apiInstance.reposAcceptInvitationForAuthenticatedUser(invitationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposAcceptInvitationForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invitationId** | **Integer**| The unique identifier of the invitation. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **404** | Resource not found |  -  |
| **304** | Not modified |  -  |

<a name="reposAddAppAccessRestrictions"></a>
# **reposAddAppAccessRestrictions**
> List&lt;Integration&gt; reposAddAppAccessRestrictions(owner, repo, branch, reposSetAppAccessRestrictionsRequest)

Add app access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Grants the specified apps push access for this branch. Only installed GitHub Apps with &#x60;write&#x60; access to the &#x60;contents&#x60; permission can be added as authorized actors on a protected branch.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    ReposSetAppAccessRestrictionsRequest reposSetAppAccessRestrictionsRequest = new ReposSetAppAccessRestrictionsRequest(); // ReposSetAppAccessRestrictionsRequest | 
    try {
      List<Integration> result = apiInstance.reposAddAppAccessRestrictions(owner, repo, branch, reposSetAppAccessRestrictionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposAddAppAccessRestrictions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |
| **reposSetAppAccessRestrictionsRequest** | [**ReposSetAppAccessRestrictionsRequest**](ReposSetAppAccessRestrictionsRequest.md)|  | [optional] |

### Return type

[**List&lt;Integration&gt;**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposAddCollaborator"></a>
# **reposAddCollaborator**
> RepositoryInvitation reposAddCollaborator(owner, repo, username, reposAddCollaboratorRequest)

Add a repository collaborator

This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \&quot;[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\&quot; and \&quot;[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\&quot; for details.  Adding an outside collaborator may be restricted by enterprise administrators. For more information, see \&quot;[Enforcing repository management policies in your enterprise](https://docs.github.com/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories).\&quot;  For more information on permission levels, see \&quot;[Repository permission levels for an organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/repository-permission-levels-for-an-organization#permission-levels-for-repositories-owned-by-an-organization)\&quot;. There are restrictions on which permissions can be granted to organization members when an organization base role is in place. In this case, the permission being given must be equal to or higher than the org base permission. Otherwise, the request will fail with:  &#x60;&#x60;&#x60; Cannot assign {member} permission of {role name} &#x60;&#x60;&#x60;  Note that, if you choose not to pass any parameters, you&#39;ll need to set &#x60;Content-Length&#x60; to zero when calling out to this endpoint. For more information, see \&quot;[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs).\&quot;  The invitee will receive a notification that they have been invited to the repository, which they must accept or decline. They may do this via the notifications page, the email they receive, or by using the [repository invitations API endpoints](https://docs.github.com/rest/reference/repos#invitations).  **Updating an existing collaborator&#39;s permission level**  The endpoint can also be used to change the permissions of an existing collaborator without first removing and re-adding the collaborator. To change the permissions, use the same endpoint and pass a different &#x60;permission&#x60; parameter. The response will be a &#x60;204&#x60;, with no other indication that the permission level changed.  **Rate limits**  You are limited to sending 50 invitations to a repository per 24 hour period. Note there is no limit if you are inviting organization members to an organization repository.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    ReposAddCollaboratorRequest reposAddCollaboratorRequest = new ReposAddCollaboratorRequest(); // ReposAddCollaboratorRequest | 
    try {
      RepositoryInvitation result = apiInstance.reposAddCollaborator(owner, repo, username, reposAddCollaboratorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposAddCollaborator");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **username** | **String**| The handle for the GitHub user account. | |
| **reposAddCollaboratorRequest** | [**ReposAddCollaboratorRequest**](ReposAddCollaboratorRequest.md)|  | [optional] |

### Return type

[**RepositoryInvitation**](RepositoryInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response when a new invitation is created |  -  |
| **204** | Response when: - an existing collaborator is added as a collaborator - an organization member is added as an individual collaborator - an existing team member (whose team is also a repository collaborator) is added as an individual collaborator |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **403** | Forbidden |  -  |

<a name="reposAddStatusCheckContexts"></a>
# **reposAddStatusCheckContexts**
> List&lt;String&gt; reposAddStatusCheckContexts(owner, repo, branch, reposSetStatusCheckContextsRequest)

Add status check contexts

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    ReposSetStatusCheckContextsRequest reposSetStatusCheckContextsRequest = new ReposSetStatusCheckContextsRequest(); // ReposSetStatusCheckContextsRequest | 
    try {
      List<String> result = apiInstance.reposAddStatusCheckContexts(owner, repo, branch, reposSetStatusCheckContextsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposAddStatusCheckContexts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |
| **reposSetStatusCheckContextsRequest** | [**ReposSetStatusCheckContextsRequest**](ReposSetStatusCheckContextsRequest.md)|  | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="reposAddTeamAccessRestrictions"></a>
# **reposAddTeamAccessRestrictions**
> List&lt;Team&gt; reposAddTeamAccessRestrictions(owner, repo, branch, reposAddTeamAccessRestrictionsRequest)

Add team access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Grants the specified teams push access for this branch. You can also give push access to child teams.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    ReposAddTeamAccessRestrictionsRequest reposAddTeamAccessRestrictionsRequest = new ReposAddTeamAccessRestrictionsRequest(); // ReposAddTeamAccessRestrictionsRequest | 
    try {
      List<Team> result = apiInstance.reposAddTeamAccessRestrictions(owner, repo, branch, reposAddTeamAccessRestrictionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposAddTeamAccessRestrictions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |
| **reposAddTeamAccessRestrictionsRequest** | [**ReposAddTeamAccessRestrictionsRequest**](ReposAddTeamAccessRestrictionsRequest.md)|  | [optional] |

### Return type

[**List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposAddUserAccessRestrictions"></a>
# **reposAddUserAccessRestrictions**
> List&lt;SimpleUser&gt; reposAddUserAccessRestrictions(owner, repo, branch, reposSetUserAccessRestrictionsRequest)

Add user access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Grants the specified people push access for this branch.  | Type    | Description                                                                                                                   | | ------- | ----------------------------------------------------------------------------------------------------------------------------- | | &#x60;array&#x60; | Usernames for people who can have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    ReposSetUserAccessRestrictionsRequest reposSetUserAccessRestrictionsRequest = new ReposSetUserAccessRestrictionsRequest(); // ReposSetUserAccessRestrictionsRequest | 
    try {
      List<SimpleUser> result = apiInstance.reposAddUserAccessRestrictions(owner, repo, branch, reposSetUserAccessRestrictionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposAddUserAccessRestrictions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |
| **reposSetUserAccessRestrictionsRequest** | [**ReposSetUserAccessRestrictionsRequest**](ReposSetUserAccessRestrictionsRequest.md)|  | [optional] |

### Return type

[**List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposCheckCollaborator"></a>
# **reposCheckCollaborator**
> reposCheckCollaborator(owner, repo, username)

Check if a user is a repository collaborator

For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.  Team members will include the members of child teams.  You must authenticate using an access token with the &#x60;read:org&#x60; and &#x60;repo&#x60; scopes with push access to use this endpoint. GitHub Apps must have the &#x60;members&#x60; organization permission and &#x60;metadata&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.reposCheckCollaborator(owner, repo, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCheckCollaborator");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **username** | **String**| The handle for the GitHub user account. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response if user is a collaborator |  -  |
| **404** | Not Found if user is not a collaborator |  -  |

<a name="reposCheckVulnerabilityAlerts"></a>
# **reposCheckVulnerabilityAlerts**
> reposCheckVulnerabilityAlerts(owner, repo)

Check if vulnerability alerts are enabled for a repository

Shows whether dependency alerts are enabled or disabled for a repository. The authenticated user must have admin read access to the repository. For more information, see \&quot;[About security alerts for vulnerable dependencies](https://docs.github.com/articles/about-security-alerts-for-vulnerable-dependencies)\&quot;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      apiInstance.reposCheckVulnerabilityAlerts(owner, repo);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCheckVulnerabilityAlerts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response if repository is enabled with vulnerability alerts |  -  |
| **404** | Not Found if repository is not enabled with vulnerability alerts |  -  |

<a name="reposCodeownersErrors"></a>
# **reposCodeownersErrors**
> CodeownersErrors reposCodeownersErrors(owner, repo, ref)

List CODEOWNERS errors

List any syntax errors that are detected in the CODEOWNERS file.  For more information about the correct CODEOWNERS syntax, see \&quot;[About code owners](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-code-owners).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String ref = "ref_example"; // String | A branch, tag or commit name used to determine which version of the CODEOWNERS file to use. Default: the repository's default branch (e.g. `main`)
    try {
      CodeownersErrors result = apiInstance.reposCodeownersErrors(owner, repo, ref);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCodeownersErrors");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **ref** | **String**| A branch, tag or commit name used to determine which version of the CODEOWNERS file to use. Default: the repository&#39;s default branch (e.g. &#x60;main&#x60;) | [optional] |

### Return type

[**CodeownersErrors**](CodeownersErrors.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposCompareCommits"></a>
# **reposCompareCommits**
> CommitComparison reposCompareCommits(owner, repo, basehead, page, perPage)

Compare two commits

Compares two commits against one another. You can compare branches in the same repository, or you can compare branches that exist in different repositories within the same repository network, including fork branches. For more information about how to view a repository&#39;s network, see \&quot;[Understanding connections between repositories](https://docs.github.com/repositories/viewing-activity-and-data-for-your-repository/understanding-connections-between-repositories).\&quot;  This endpoint is equivalent to running the &#x60;git log BASE..HEAD&#x60; command, but it returns commits in a different order. The &#x60;git log BASE..HEAD&#x60; command returns commits in reverse chronological order, whereas the API returns commits in chronological order. You can pass the appropriate [media type](https://docs.github.com/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.  The API response includes details about the files that were changed between the two commits. This includes the status of the change (if a file was added, removed, modified, or renamed), and details of the change itself. For example, files with a &#x60;renamed&#x60; status have a &#x60;previous_filename&#x60; field showing the previous filename of the file, and files with a &#x60;modified&#x60; status have a &#x60;patch&#x60; field showing the changes made to the file.  When calling this endpoint without any paging parameter (&#x60;per_page&#x60; or &#x60;page&#x60;), the returned list is limited to 250 commits, and the last commit in the list is the most recent of the entire comparison.  **Working with large comparisons**  To process a response with a large number of commits, use a query parameter (&#x60;per_page&#x60; or &#x60;page&#x60;) to paginate the results. When using pagination:  - The list of changed files is only shown on the first page of results, but it includes all changed files for the entire comparison. - The results are returned in chronological order, but the last commit in the returned list may not be the most recent one in the entire set if there are more pages of results.  For more information on working with pagination, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).\&quot;  **Signature verification object**  The response will include a &#x60;verification&#x60; object that describes the result of verifying the commit&#39;s signature. The &#x60;verification&#x60; object includes the following fields:  | Name | Type | Description | | ---- | ---- | ----------- | | &#x60;verified&#x60; | &#x60;boolean&#x60; | Indicates whether GitHub considers the signature in this commit to be verified. | | &#x60;reason&#x60; | &#x60;string&#x60; | The reason for verified value. Possible values and their meanings are enumerated in table below. | | &#x60;signature&#x60; | &#x60;string&#x60; | The signature that was extracted from the commit. | | &#x60;payload&#x60; | &#x60;string&#x60; | The value that was signed. |  These are the possible values for &#x60;reason&#x60; in the &#x60;verification&#x60; object:  | Value | Description | | ----- | ----------- | | &#x60;expired_key&#x60; | The key that made the signature is expired. | | &#x60;not_signing_key&#x60; | The \&quot;signing\&quot; flag is not among the usage flags in the GPG key that made the signature. | | &#x60;gpgverify_error&#x60; | There was an error communicating with the signature verification service. | | &#x60;gpgverify_unavailable&#x60; | The signature verification service is currently unavailable. | | &#x60;unsigned&#x60; | The object does not include a signature. | | &#x60;unknown_signature_type&#x60; | A non-PGP signature was found in the commit. | | &#x60;no_user&#x60; | No user was associated with the &#x60;committer&#x60; email address in the commit. | | &#x60;unverified_email&#x60; | The &#x60;committer&#x60; email address in the commit was associated with a user, but the email address is not verified on their account. | | &#x60;bad_email&#x60; | The &#x60;committer&#x60; email address in the commit is not included in the identities of the PGP key that made the signature. | | &#x60;unknown_key&#x60; | The key that made the signature has not been registered with any user&#39;s account. | | &#x60;malformed_signature&#x60; | There was an error parsing the signature. | | &#x60;invalid&#x60; | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | &#x60;valid&#x60; | None of the above errors applied, so the signature is considered to be verified. |

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String basehead = "basehead_example"; // String | The base branch and head branch to compare. This parameter expects the format `BASE...HEAD`. Both must be branch names in `repo`. To compare with a branch that exists in a different repository in the same network as `repo`, the `basehead` parameter expects the format `USERNAME:BASE...USERNAME:HEAD`.
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    try {
      CommitComparison result = apiInstance.reposCompareCommits(owner, repo, basehead, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCompareCommits");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **basehead** | **String**| The base branch and head branch to compare. This parameter expects the format &#x60;BASE...HEAD&#x60;. Both must be branch names in &#x60;repo&#x60;. To compare with a branch that exists in a different repository in the same network as &#x60;repo&#x60;, the &#x60;basehead&#x60; parameter expects the format &#x60;USERNAME:BASE...USERNAME:HEAD&#x60;. | |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |

### Return type

[**CommitComparison**](CommitComparison.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Error |  -  |
| **503** | Service unavailable |  -  |

<a name="reposCreateAutolink"></a>
# **reposCreateAutolink**
> Autolink reposCreateAutolink(owner, repo, reposCreateAutolinkRequest)

Create an autolink reference for a repository

Users with admin access to the repository can create an autolink.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposCreateAutolinkRequest reposCreateAutolinkRequest = new ReposCreateAutolinkRequest(); // ReposCreateAutolinkRequest | 
    try {
      Autolink result = apiInstance.reposCreateAutolink(owner, repo, reposCreateAutolinkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateAutolink");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposCreateAutolinkRequest** | [**ReposCreateAutolinkRequest**](ReposCreateAutolinkRequest.md)|  | |

### Return type

[**Autolink**](Autolink.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | response |  * Location -  <br>  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposCreateCommitComment"></a>
# **reposCreateCommitComment**
> CommitComment reposCreateCommitComment(owner, repo, commitSha, reposCreateCommitCommentRequest)

Create a commit comment

Create a comment for a commit using its &#x60;:commit_sha&#x60;.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \&quot;[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\&quot; and \&quot;[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\&quot; for details.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String commitSha = "commitSha_example"; // String | The SHA of the commit.
    ReposCreateCommitCommentRequest reposCreateCommitCommentRequest = new ReposCreateCommitCommentRequest(); // ReposCreateCommitCommentRequest | 
    try {
      CommitComment result = apiInstance.reposCreateCommitComment(owner, repo, commitSha, reposCreateCommitCommentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateCommitComment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **commitSha** | **String**| The SHA of the commit. | |
| **reposCreateCommitCommentRequest** | [**ReposCreateCommitCommentRequest**](ReposCreateCommitCommentRequest.md)|  | |

### Return type

[**CommitComment**](CommitComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  * Location -  <br>  |
| **403** | Forbidden |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposCreateCommitSignatureProtection"></a>
# **reposCreateCommitSignatureProtection**
> ProtectedBranchAdminEnforced reposCreateCommitSignatureProtection(owner, repo, branch)

Create commit signature protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  When authenticated with admin or owner permissions to the repository, you can use this endpoint to require signed commits on a branch. You must enable branch protection to require signed commits.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      ProtectedBranchAdminEnforced result = apiInstance.reposCreateCommitSignatureProtection(owner, repo, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateCommitSignatureProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

[**ProtectedBranchAdminEnforced**](ProtectedBranchAdminEnforced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposCreateCommitStatus"></a>
# **reposCreateCommitStatus**
> Status reposCreateCommitStatus(owner, repo, sha, reposCreateCommitStatusRequest)

Create a commit status

Users with push access in a repository can create commit statuses for a given SHA.  Note: there is a limit of 1000 statuses per &#x60;sha&#x60; and &#x60;context&#x60; within a repository. Attempts to create more than 1000 statuses will result in a validation error.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String sha = "sha_example"; // String | 
    ReposCreateCommitStatusRequest reposCreateCommitStatusRequest = new ReposCreateCommitStatusRequest(); // ReposCreateCommitStatusRequest | 
    try {
      Status result = apiInstance.reposCreateCommitStatus(owner, repo, sha, reposCreateCommitStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateCommitStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **sha** | **String**|  | |
| **reposCreateCommitStatusRequest** | [**ReposCreateCommitStatusRequest**](ReposCreateCommitStatusRequest.md)|  | |

### Return type

[**Status**](Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  * Location -  <br>  |

<a name="reposCreateDeployKey"></a>
# **reposCreateDeployKey**
> DeployKey reposCreateDeployKey(owner, repo, reposCreateDeployKeyRequest)

Create a deploy key

You can create a read-only deploy key.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposCreateDeployKeyRequest reposCreateDeployKeyRequest = new ReposCreateDeployKeyRequest(); // ReposCreateDeployKeyRequest | 
    try {
      DeployKey result = apiInstance.reposCreateDeployKey(owner, repo, reposCreateDeployKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateDeployKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposCreateDeployKeyRequest** | [**ReposCreateDeployKeyRequest**](ReposCreateDeployKeyRequest.md)|  | |

### Return type

[**DeployKey**](DeployKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  * Location -  <br>  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposCreateDeployment"></a>
# **reposCreateDeployment**
> Deployment reposCreateDeployment(owner, repo, reposCreateDeploymentRequest)

Create a deployment

Deployments offer a few configurable parameters with certain defaults.  The &#x60;ref&#x60; parameter can be any named branch, tag, or SHA. At GitHub we often deploy branches and verify them before we merge a pull request.  The &#x60;environment&#x60; parameter allows deployments to be issued to different runtime environments. Teams often have multiple environments for verifying their applications, such as &#x60;production&#x60;, &#x60;staging&#x60;, and &#x60;qa&#x60;. This parameter makes it easier to track which environments have requested deployments. The default environment is &#x60;production&#x60;.  The &#x60;auto_merge&#x60; parameter is used to ensure that the requested ref is not behind the repository&#39;s default branch. If the ref _is_ behind the default branch for the repository, we will attempt to merge it for you. If the merge succeeds, the API will return a successful merge commit. If merge conflicts prevent the merge from succeeding, the API will return a failure response.  By default, [commit statuses](https://docs.github.com/rest/commits/statuses) for every submitted context must be in a &#x60;success&#x60; state. The &#x60;required_contexts&#x60; parameter allows you to specify a subset of contexts that must be &#x60;success&#x60;, or to specify contexts that have not yet been submitted. You are not required to use commit statuses to deploy. If you do not require any contexts or create any commit statuses, the deployment will always succeed.  The &#x60;payload&#x60; parameter is available for any extra information that a deployment system might need. It is a JSON text field that will be passed on when a deployment event is dispatched.  The &#x60;task&#x60; parameter is used by the deployment system to allow different execution paths. In the web world this might be &#x60;deploy:migrations&#x60; to run schema changes on the system. In the compiled world this could be a flag to compile an application with debugging enabled.  Users with &#x60;repo&#x60; or &#x60;repo_deployment&#x60; scopes can create a deployment for a given ref.  #### Merged branch response You will see this response when GitHub automatically merges the base branch into the topic branch instead of creating a deployment. This auto-merge happens when: *   Auto-merge option is enabled in the repository *   Topic branch does not include the latest changes on the base branch, which is &#x60;master&#x60; in the response example *   There are no merge conflicts  If there are no new commits in the base branch, a new request to create a deployment should give a successful response.  #### Merge conflict response This error happens when the &#x60;auto_merge&#x60; option is enabled and when the default branch (in this case &#x60;master&#x60;), can&#39;t be merged into the branch that&#39;s being deployed (in this case &#x60;topic-branch&#x60;), due to merge conflicts.  #### Failed commit status checks This error happens when the &#x60;required_contexts&#x60; parameter indicates that one or more contexts need to have a &#x60;success&#x60; status for the commit to be deployed, but one or more of the required contexts do not have a state of &#x60;success&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposCreateDeploymentRequest reposCreateDeploymentRequest = new ReposCreateDeploymentRequest(); // ReposCreateDeploymentRequest | 
    try {
      Deployment result = apiInstance.reposCreateDeployment(owner, repo, reposCreateDeploymentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateDeployment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposCreateDeploymentRequest** | [**ReposCreateDeploymentRequest**](ReposCreateDeploymentRequest.md)|  | |

### Return type

[**Deployment**](Deployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |
| **202** | Merged branch response |  -  |
| **409** | Conflict when there is a merge conflict or the commit&#39;s status checks failed |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposCreateDeploymentBranchPolicy"></a>
# **reposCreateDeploymentBranchPolicy**
> DeploymentBranchPolicy reposCreateDeploymentBranchPolicy(owner, repo, environmentName, deploymentBranchPolicyNamePattern)

Create a deployment branch policy

Creates a deployment branch policy for an environment.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration:write&#x60; permission for the repository to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    DeploymentBranchPolicyNamePattern deploymentBranchPolicyNamePattern = new DeploymentBranchPolicyNamePattern(); // DeploymentBranchPolicyNamePattern | 
    try {
      DeploymentBranchPolicy result = apiInstance.reposCreateDeploymentBranchPolicy(owner, repo, environmentName, deploymentBranchPolicyNamePattern);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateDeploymentBranchPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **environmentName** | **String**| The name of the environment. | |
| **deploymentBranchPolicyNamePattern** | [**DeploymentBranchPolicyNamePattern**](DeploymentBranchPolicyNamePattern.md)|  | |

### Return type

[**DeploymentBranchPolicy**](DeploymentBranchPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Not Found or &#x60;deployment_branch_policy.custom_branch_policies&#x60; property for the environment is set to false |  -  |
| **303** | Response if the same branch name pattern already exists |  -  |

<a name="reposCreateDeploymentProtectionRule"></a>
# **reposCreateDeploymentProtectionRule**
> DeploymentProtectionRule reposCreateDeploymentProtectionRule(environmentName, repo, owner, reposCreateDeploymentProtectionRuleRequest)

Create a custom deployment protection rule on an environment

Enable a custom deployment protection rule for an environment.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. Enabling a custom protection rule requires admin or owner permissions to the repository. GitHub Apps must have the &#x60;actions:write&#x60; permission to use this endpoint.  For more information about the app that is providing this custom deployment rule, see the [documentation for the &#x60;GET /apps/{app_slug}&#x60; endpoint](https://docs.github.com/rest/apps/apps#get-an-app).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String environmentName = "environmentName_example"; // String | The name of the environment.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    ReposCreateDeploymentProtectionRuleRequest reposCreateDeploymentProtectionRuleRequest = new ReposCreateDeploymentProtectionRuleRequest(); // ReposCreateDeploymentProtectionRuleRequest | 
    try {
      DeploymentProtectionRule result = apiInstance.reposCreateDeploymentProtectionRule(environmentName, repo, owner, reposCreateDeploymentProtectionRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateDeploymentProtectionRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **environmentName** | **String**| The name of the environment. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **reposCreateDeploymentProtectionRuleRequest** | [**ReposCreateDeploymentProtectionRuleRequest**](ReposCreateDeploymentProtectionRuleRequest.md)|  | |

### Return type

[**DeploymentProtectionRule**](DeploymentProtectionRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The enabled custom deployment protection rule |  -  |

<a name="reposCreateDeploymentStatus"></a>
# **reposCreateDeploymentStatus**
> DeploymentStatus reposCreateDeploymentStatus(owner, repo, deploymentId, reposCreateDeploymentStatusRequest)

Create a deployment status

Users with &#x60;push&#x60; access can create deployment statuses for a given deployment.  GitHub Apps require &#x60;read &amp; write&#x60; access to \&quot;Deployments\&quot; and &#x60;read-only&#x60; access to \&quot;Repo contents\&quot; (for private repos). OAuth Apps require the &#x60;repo_deployment&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer deploymentId = 56; // Integer | deployment_id parameter
    ReposCreateDeploymentStatusRequest reposCreateDeploymentStatusRequest = new ReposCreateDeploymentStatusRequest(); // ReposCreateDeploymentStatusRequest | 
    try {
      DeploymentStatus result = apiInstance.reposCreateDeploymentStatus(owner, repo, deploymentId, reposCreateDeploymentStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateDeploymentStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **deploymentId** | **Integer**| deployment_id parameter | |
| **reposCreateDeploymentStatusRequest** | [**ReposCreateDeploymentStatusRequest**](ReposCreateDeploymentStatusRequest.md)|  | |

### Return type

[**DeploymentStatus**](DeploymentStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  * Location -  <br>  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposCreateDispatchEvent"></a>
# **reposCreateDispatchEvent**
> reposCreateDispatchEvent(owner, repo, reposCreateDispatchEventRequest)

Create a repository dispatch event

You can use this endpoint to trigger a webhook event called &#x60;repository_dispatch&#x60; when you want activity that happens outside of GitHub to trigger a GitHub Actions workflow or GitHub App webhook. You must configure your GitHub Actions workflow or GitHub App to run when the &#x60;repository_dispatch&#x60; event occurs. For an example &#x60;repository_dispatch&#x60; webhook payload, see \&quot;[RepositoryDispatchEvent](https://docs.github.com/webhooks/event-payloads/#repository_dispatch).\&quot;  The &#x60;client_payload&#x60; parameter is available for any extra information that your workflow might need. This parameter is a JSON payload that will be passed on when the webhook event is dispatched. For example, the &#x60;client_payload&#x60; can include a message that a user would like to send using a GitHub Actions workflow. Or the &#x60;client_payload&#x60; can be used as a test to debug your workflow.  This endpoint requires write access to the repository by providing either:    - Personal access tokens with &#x60;repo&#x60; scope. For more information, see \&quot;[Creating a personal access token for the command line](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line)\&quot; in the GitHub Help documentation.   - GitHub Apps with both &#x60;metadata:read&#x60; and &#x60;contents:read&amp;write&#x60; permissions.  This input example shows how you can use the &#x60;client_payload&#x60; as a test to debug your workflow.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposCreateDispatchEventRequest reposCreateDispatchEventRequest = new ReposCreateDispatchEventRequest(); // ReposCreateDispatchEventRequest | 
    try {
      apiInstance.reposCreateDispatchEvent(owner, repo, reposCreateDispatchEventRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateDispatchEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposCreateDispatchEventRequest** | [**ReposCreateDispatchEventRequest**](ReposCreateDispatchEventRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposCreateForAuthenticatedUser"></a>
# **reposCreateForAuthenticatedUser**
> Repository reposCreateForAuthenticatedUser(reposCreateForAuthenticatedUserRequest)

Create a repository for the authenticated user

Creates a new repository for the authenticated user.  **OAuth scope requirements**  When using [OAuth](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:  *   &#x60;public_repo&#x60; scope or &#x60;repo&#x60; scope to create a public repository. Note: For GitHub AE, use &#x60;repo&#x60; scope to create an internal repository. *   &#x60;repo&#x60; scope to create a private repository.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    ReposCreateForAuthenticatedUserRequest reposCreateForAuthenticatedUserRequest = new ReposCreateForAuthenticatedUserRequest(); // ReposCreateForAuthenticatedUserRequest | 
    try {
      Repository result = apiInstance.reposCreateForAuthenticatedUser(reposCreateForAuthenticatedUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reposCreateForAuthenticatedUserRequest** | [**ReposCreateForAuthenticatedUserRequest**](ReposCreateForAuthenticatedUserRequest.md)|  | |

### Return type

[**Repository**](Repository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  * Location -  <br>  |
| **401** | Requires authentication |  -  |
| **304** | Not modified |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **400** | Bad Request |  -  |

<a name="reposCreateFork"></a>
# **reposCreateFork**
> FullRepository reposCreateFork(owner, repo, reposCreateForkRequest)

Create a fork

Create a fork for the authenticated user.  **Note**: Forking a Repository happens asynchronously. You may have to wait a short period of time before you can access the git objects. If this takes longer than 5 minutes, be sure to contact [GitHub Support](https://support.github.com/contact?tags&#x3D;dotcom-rest-api).  **Note**: Although this endpoint works with GitHub Apps, the GitHub App must be installed on the destination account with access to all repositories and on the source account with access to the source repository.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposCreateForkRequest reposCreateForkRequest = new ReposCreateForkRequest(); // ReposCreateForkRequest | 
    try {
      FullRepository result = apiInstance.reposCreateFork(owner, repo, reposCreateForkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateFork");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposCreateForkRequest** | [**ReposCreateForkRequest**](ReposCreateForkRequest.md)|  | [optional] |

### Return type

[**FullRepository**](FullRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Response |  -  |
| **400** | Bad Request |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="reposCreateInOrg"></a>
# **reposCreateInOrg**
> Repository reposCreateInOrg(org, reposCreateInOrgRequest)

Create an organization repository

Creates a new repository in the specified organization. The authenticated user must be a member of the organization.  **OAuth scope requirements**  When using [OAuth](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:  *   &#x60;public_repo&#x60; scope or &#x60;repo&#x60; scope to create a public repository. Note: For GitHub AE, use &#x60;repo&#x60; scope to create an internal repository. *   &#x60;repo&#x60; scope to create a private repository

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    ReposCreateInOrgRequest reposCreateInOrgRequest = new ReposCreateInOrgRequest(); // ReposCreateInOrgRequest | 
    try {
      Repository result = apiInstance.reposCreateInOrg(org, reposCreateInOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateInOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **reposCreateInOrgRequest** | [**ReposCreateInOrgRequest**](ReposCreateInOrgRequest.md)|  | |

### Return type

[**Repository**](Repository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  * Location -  <br>  |
| **403** | Forbidden |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposCreateOrUpdateEnvironment"></a>
# **reposCreateOrUpdateEnvironment**
> Environment reposCreateOrUpdateEnvironment(owner, repo, environmentName, reposCreateOrUpdateEnvironmentRequest)

Create or update an environment

Create or update an environment with protection rules, such as required reviewers. For more information about environment protection rules, see \&quot;[Environments](/actions/reference/environments#environment-protection-rules).\&quot;  **Note:** To create or update name patterns that branches must match in order to deploy to this environment, see \&quot;[Deployment branch policies](/rest/deployments/branch-policies).\&quot;  **Note:** To create or update secrets for an environment, see \&quot;[Secrets](/rest/reference/actions#secrets).\&quot;  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration:write&#x60; permission for the repository to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    ReposCreateOrUpdateEnvironmentRequest reposCreateOrUpdateEnvironmentRequest = new ReposCreateOrUpdateEnvironmentRequest(); // ReposCreateOrUpdateEnvironmentRequest | 
    try {
      Environment result = apiInstance.reposCreateOrUpdateEnvironment(owner, repo, environmentName, reposCreateOrUpdateEnvironmentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateOrUpdateEnvironment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **environmentName** | **String**| The name of the environment. | |
| **reposCreateOrUpdateEnvironmentRequest** | [**ReposCreateOrUpdateEnvironmentRequest**](ReposCreateOrUpdateEnvironmentRequest.md)|  | [optional] |

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation error when the environment name is invalid or when &#x60;protected_branches&#x60; and &#x60;custom_branch_policies&#x60; in &#x60;deployment_branch_policy&#x60; are set to the same value |  -  |

<a name="reposCreateOrUpdateFileContents"></a>
# **reposCreateOrUpdateFileContents**
> FileCommit reposCreateOrUpdateFileContents(owner, repo, path, reposCreateOrUpdateFileContentsRequest)

Create or update file contents

Creates a new file or replaces an existing file in a repository. You must authenticate using an access token with the &#x60;workflow&#x60; scope to use this endpoint.  **Note:** If you use this endpoint and the \&quot;[Delete a file](https://docs.github.com/rest/reference/repos/#delete-file)\&quot; endpoint in parallel, the concurrent requests will conflict and you will receive errors. You must use these endpoints serially instead.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String path = "path_example"; // String | path parameter
    ReposCreateOrUpdateFileContentsRequest reposCreateOrUpdateFileContentsRequest = new ReposCreateOrUpdateFileContentsRequest(); // ReposCreateOrUpdateFileContentsRequest | 
    try {
      FileCommit result = apiInstance.reposCreateOrUpdateFileContents(owner, repo, path, reposCreateOrUpdateFileContentsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateOrUpdateFileContents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **path** | **String**| path parameter | |
| **reposCreateOrUpdateFileContentsRequest** | [**ReposCreateOrUpdateFileContentsRequest**](ReposCreateOrUpdateFileContentsRequest.md)|  | |

### Return type

[**FileCommit**](FileCommit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **201** | Response |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **409** | Conflict |  -  |

<a name="reposCreateOrgRuleset"></a>
# **reposCreateOrgRuleset**
> RepositoryRuleset reposCreateOrgRuleset(org, reposCreateOrgRulesetRequest)

Create an organization repository ruleset

Create a repository ruleset for an organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    ReposCreateOrgRulesetRequest reposCreateOrgRulesetRequest = new ReposCreateOrgRulesetRequest(); // ReposCreateOrgRulesetRequest | Request body
    try {
      RepositoryRuleset result = apiInstance.reposCreateOrgRuleset(org, reposCreateOrgRulesetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateOrgRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **reposCreateOrgRulesetRequest** | [**ReposCreateOrgRulesetRequest**](ReposCreateOrgRulesetRequest.md)| Request body | |

### Return type

[**RepositoryRuleset**](RepositoryRuleset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Error |  -  |

<a name="reposCreatePagesDeployment"></a>
# **reposCreatePagesDeployment**
> PageDeployment reposCreatePagesDeployment(owner, repo, reposCreatePagesDeploymentRequest)

Create a GitHub Pages deployment

Create a GitHub Pages deployment for a repository.  Users must have write permissions. GitHub Apps must have the &#x60;pages:write&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposCreatePagesDeploymentRequest reposCreatePagesDeploymentRequest = new ReposCreatePagesDeploymentRequest(); // ReposCreatePagesDeploymentRequest | 
    try {
      PageDeployment result = apiInstance.reposCreatePagesDeployment(owner, repo, reposCreatePagesDeploymentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreatePagesDeployment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposCreatePagesDeploymentRequest** | [**ReposCreatePagesDeploymentRequest**](ReposCreatePagesDeploymentRequest.md)|  | |

### Return type

[**PageDeployment**](PageDeployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **400** | Bad Request |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **404** | Resource not found |  -  |

<a name="reposCreatePagesSite"></a>
# **reposCreatePagesSite**
> Page reposCreatePagesSite(owner, repo, reposCreatePagesSiteRequest)

Create a GitHub Pages site

Configures a GitHub Pages site. For more information, see \&quot;[About GitHub Pages](/github/working-with-github-pages/about-github-pages).\&quot;  To use this endpoint, you must be a repository administrator, maintainer, or have the &#39;manage GitHub Pages settings&#39; permission. A token with the &#x60;repo&#x60; scope or Pages write permission is required. GitHub Apps must have the &#x60;administration:write&#x60; and &#x60;pages:write&#x60; permissions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposCreatePagesSiteRequest reposCreatePagesSiteRequest = new ReposCreatePagesSiteRequest(); // ReposCreatePagesSiteRequest | 
    try {
      Page result = apiInstance.reposCreatePagesSite(owner, repo, reposCreatePagesSiteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreatePagesSite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposCreatePagesSiteRequest** | [**ReposCreatePagesSiteRequest**](ReposCreatePagesSiteRequest.md)|  | |

### Return type

[**Page**](Page.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **409** | Conflict |  -  |

<a name="reposCreateRelease"></a>
# **reposCreateRelease**
> Release reposCreateRelease(owner, repo, reposCreateReleaseRequest)

Create a release

Users with push access to the repository can create a release.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \&quot;[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\&quot; and \&quot;[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\&quot; for details.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposCreateReleaseRequest reposCreateReleaseRequest = new ReposCreateReleaseRequest(); // ReposCreateReleaseRequest | 
    try {
      Release result = apiInstance.reposCreateRelease(owner, repo, reposCreateReleaseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateRelease");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposCreateReleaseRequest** | [**ReposCreateReleaseRequest**](ReposCreateReleaseRequest.md)|  | |

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  * Location -  <br>  |
| **404** | Not Found if the discussion category name is invalid |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposCreateRepoRuleset"></a>
# **reposCreateRepoRuleset**
> RepositoryRuleset reposCreateRepoRuleset(owner, repo, reposCreateRepoRulesetRequest)

Create a repository ruleset

Create a ruleset for a repository.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposCreateRepoRulesetRequest reposCreateRepoRulesetRequest = new ReposCreateRepoRulesetRequest(); // ReposCreateRepoRulesetRequest | Request body
    try {
      RepositoryRuleset result = apiInstance.reposCreateRepoRuleset(owner, repo, reposCreateRepoRulesetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateRepoRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposCreateRepoRulesetRequest** | [**ReposCreateRepoRulesetRequest**](ReposCreateRepoRulesetRequest.md)| Request body | |

### Return type

[**RepositoryRuleset**](RepositoryRuleset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Error |  -  |

<a name="reposCreateTagProtection"></a>
# **reposCreateTagProtection**
> TagProtection reposCreateTagProtection(owner, repo, reposCreateTagProtectionRequest)

Create a tag protection state for a repository

This creates a tag protection state for a repository. This endpoint is only available to repository administrators.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposCreateTagProtectionRequest reposCreateTagProtectionRequest = new ReposCreateTagProtectionRequest(); // ReposCreateTagProtectionRequest | 
    try {
      TagProtection result = apiInstance.reposCreateTagProtection(owner, repo, reposCreateTagProtectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateTagProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposCreateTagProtectionRequest** | [**ReposCreateTagProtectionRequest**](ReposCreateTagProtectionRequest.md)|  | |

### Return type

[**TagProtection**](TagProtection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="reposCreateUsingTemplate"></a>
# **reposCreateUsingTemplate**
> Repository reposCreateUsingTemplate(templateOwner, templateRepo, reposCreateUsingTemplateRequest)

Create a repository using a template

Creates a new repository using a repository template. Use the &#x60;template_owner&#x60; and &#x60;template_repo&#x60; route parameters to specify the repository to use as the template. If the repository is not public, the authenticated user must own or be a member of an organization that owns the repository. To check if a repository is available to use as a template, get the repository&#39;s information using the [Get a repository](https://docs.github.com/rest/reference/repos#get-a-repository) endpoint and check that the &#x60;is_template&#x60; key is &#x60;true&#x60;.  **OAuth scope requirements**  When using [OAuth](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:  *   &#x60;public_repo&#x60; scope or &#x60;repo&#x60; scope to create a public repository. Note: For GitHub AE, use &#x60;repo&#x60; scope to create an internal repository. *   &#x60;repo&#x60; scope to create a private repository

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String templateOwner = "templateOwner_example"; // String | 
    String templateRepo = "templateRepo_example"; // String | 
    ReposCreateUsingTemplateRequest reposCreateUsingTemplateRequest = new ReposCreateUsingTemplateRequest(); // ReposCreateUsingTemplateRequest | 
    try {
      Repository result = apiInstance.reposCreateUsingTemplate(templateOwner, templateRepo, reposCreateUsingTemplateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateUsingTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateOwner** | **String**|  | |
| **templateRepo** | **String**|  | |
| **reposCreateUsingTemplateRequest** | [**ReposCreateUsingTemplateRequest**](ReposCreateUsingTemplateRequest.md)|  | |

### Return type

[**Repository**](Repository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  * Location -  <br>  |

<a name="reposCreateWebhook"></a>
# **reposCreateWebhook**
> Hook reposCreateWebhook(owner, repo, reposCreateWebhookRequest)

Create a repository webhook

Repositories can have multiple webhooks installed. Each webhook should have a unique &#x60;config&#x60;. Multiple webhooks can share the same &#x60;config&#x60; as long as those webhooks do not have any &#x60;events&#x60; that overlap.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposCreateWebhookRequest reposCreateWebhookRequest = new ReposCreateWebhookRequest(); // ReposCreateWebhookRequest | 
    try {
      Hook result = apiInstance.reposCreateWebhook(owner, repo, reposCreateWebhookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposCreateWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposCreateWebhookRequest** | [**ReposCreateWebhookRequest**](ReposCreateWebhookRequest.md)|  | [optional] |

### Return type

[**Hook**](Hook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  * Location -  <br>  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **403** | Forbidden |  -  |

<a name="reposDeclineInvitationForAuthenticatedUser"></a>
# **reposDeclineInvitationForAuthenticatedUser**
> reposDeclineInvitationForAuthenticatedUser(invitationId)

Decline a repository invitation



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    Integer invitationId = 56; // Integer | The unique identifier of the invitation.
    try {
      apiInstance.reposDeclineInvitationForAuthenticatedUser(invitationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeclineInvitationForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invitationId** | **Integer**| The unique identifier of the invitation. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **409** | Conflict |  -  |
| **304** | Not modified |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |

<a name="reposDelete"></a>
# **reposDelete**
> reposDelete(owner, repo)

Delete a repository

Deleting a repository requires admin access. If OAuth is used, the &#x60;delete_repo&#x60; scope is required.  If an organization owner has configured the organization to prevent members from deleting organization-owned repositories, you will get a &#x60;403 Forbidden&#x60; response.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      apiInstance.reposDelete(owner, repo);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **403** | If an organization owner has configured the organization to prevent members from deleting organization-owned repositories, a member will get this response: |  -  |
| **307** | Temporary Redirect |  -  |
| **404** | Resource not found |  -  |

<a name="reposDeleteAccessRestrictions"></a>
# **reposDeleteAccessRestrictions**
> reposDeleteAccessRestrictions(owner, repo, branch)

Delete access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Disables the ability to restrict who can push to this branch.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      apiInstance.reposDeleteAccessRestrictions(owner, repo, branch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteAccessRestrictions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="reposDeleteAdminBranchProtection"></a>
# **reposDeleteAdminBranchProtection**
> reposDeleteAdminBranchProtection(owner, repo, branch)

Delete admin branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Removing admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      apiInstance.reposDeleteAdminBranchProtection(owner, repo, branch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteAdminBranchProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposDeleteAnEnvironment"></a>
# **reposDeleteAnEnvironment**
> reposDeleteAnEnvironment(owner, repo, environmentName)

Delete an environment

You must authenticate using an access token with the repo scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    try {
      apiInstance.reposDeleteAnEnvironment(owner, repo, environmentName);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteAnEnvironment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **environmentName** | **String**| The name of the environment. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Default response |  -  |

<a name="reposDeleteAutolink"></a>
# **reposDeleteAutolink**
> reposDeleteAutolink(owner, repo, autolinkId)

Delete an autolink reference from a repository

This deletes a single autolink reference by ID that was configured for the given repository.  Information about autolinks are only available to repository administrators.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer autolinkId = 56; // Integer | The unique identifier of the autolink.
    try {
      apiInstance.reposDeleteAutolink(owner, repo, autolinkId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteAutolink");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **autolinkId** | **Integer**| The unique identifier of the autolink. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposDeleteBranchProtection"></a>
# **reposDeleteBranchProtection**
> reposDeleteBranchProtection(owner, repo, branch)

Delete branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      apiInstance.reposDeleteBranchProtection(owner, repo, branch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteBranchProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **403** | Forbidden |  -  |

<a name="reposDeleteCommitComment"></a>
# **reposDeleteCommitComment**
> reposDeleteCommitComment(owner, repo, commentId)

Delete a commit comment



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer commentId = 56; // Integer | The unique identifier of the comment.
    try {
      apiInstance.reposDeleteCommitComment(owner, repo, commentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteCommitComment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **commentId** | **Integer**| The unique identifier of the comment. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposDeleteCommitSignatureProtection"></a>
# **reposDeleteCommitSignatureProtection**
> reposDeleteCommitSignatureProtection(owner, repo, branch)

Delete commit signature protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  When authenticated with admin or owner permissions to the repository, you can use this endpoint to disable required signed commits on a branch. You must enable branch protection to require signed commits.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      apiInstance.reposDeleteCommitSignatureProtection(owner, repo, branch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteCommitSignatureProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposDeleteDeployKey"></a>
# **reposDeleteDeployKey**
> reposDeleteDeployKey(owner, repo, keyId)

Delete a deploy key

Deploy keys are immutable. If you need to update a key, remove the key and create a new one instead.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer keyId = 56; // Integer | The unique identifier of the key.
    try {
      apiInstance.reposDeleteDeployKey(owner, repo, keyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteDeployKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **keyId** | **Integer**| The unique identifier of the key. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="reposDeleteDeployment"></a>
# **reposDeleteDeployment**
> reposDeleteDeployment(owner, repo, deploymentId)

Delete a deployment

If the repository only has one deployment, you can delete the deployment regardless of its status. If the repository has more than one deployment, you can only delete inactive deployments. This ensures that repositories with multiple deployments will always have an active deployment. Anyone with &#x60;repo&#x60; or &#x60;repo_deployment&#x60; scopes can delete a deployment.  To set a deployment as inactive, you must:  *   Create a new deployment that is active so that the system has a record of the current state, then delete the previously active deployment. *   Mark the active deployment as inactive by adding any non-successful deployment status.  For more information, see \&quot;[Create a deployment](https://docs.github.com/rest/deployments/deployments/#create-a-deployment)\&quot; and \&quot;[Create a deployment status](https://docs.github.com/rest/deployments/deployment-statuses#create-a-deployment-status).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer deploymentId = 56; // Integer | deployment_id parameter
    try {
      apiInstance.reposDeleteDeployment(owner, repo, deploymentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteDeployment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **deploymentId** | **Integer**| deployment_id parameter | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposDeleteDeploymentBranchPolicy"></a>
# **reposDeleteDeploymentBranchPolicy**
> reposDeleteDeploymentBranchPolicy(owner, repo, environmentName, branchPolicyId)

Delete a deployment branch policy

Deletes a deployment branch policy for an environment.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration:write&#x60; permission for the repository to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    Integer branchPolicyId = 56; // Integer | The unique identifier of the branch policy.
    try {
      apiInstance.reposDeleteDeploymentBranchPolicy(owner, repo, environmentName, branchPolicyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteDeploymentBranchPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **environmentName** | **String**| The name of the environment. | |
| **branchPolicyId** | **Integer**| The unique identifier of the branch policy. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="reposDeleteFile"></a>
# **reposDeleteFile**
> FileCommit reposDeleteFile(owner, repo, path, reposDeleteFileRequest)

Delete a file

Deletes a file in a repository.  You can provide an additional &#x60;committer&#x60; parameter, which is an object containing information about the committer. Or, you can provide an &#x60;author&#x60; parameter, which is an object containing information about the author.  The &#x60;author&#x60; section is optional and is filled in with the &#x60;committer&#x60; information if omitted. If the &#x60;committer&#x60; information is omitted, the authenticated user&#39;s information is used.  You must provide values for both &#x60;name&#x60; and &#x60;email&#x60;, whether you choose to use &#x60;author&#x60; or &#x60;committer&#x60;. Otherwise, you&#39;ll receive a &#x60;422&#x60; status code.  **Note:** If you use this endpoint and the \&quot;[Create or update file contents](https://docs.github.com/rest/reference/repos/#create-or-update-file-contents)\&quot; endpoint in parallel, the concurrent requests will conflict and you will receive errors. You must use these endpoints serially instead.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String path = "path_example"; // String | path parameter
    ReposDeleteFileRequest reposDeleteFileRequest = new ReposDeleteFileRequest(); // ReposDeleteFileRequest | 
    try {
      FileCommit result = apiInstance.reposDeleteFile(owner, repo, path, reposDeleteFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **path** | **String**| path parameter | |
| **reposDeleteFileRequest** | [**ReposDeleteFileRequest**](ReposDeleteFileRequest.md)|  | |

### Return type

[**FileCommit**](FileCommit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **404** | Resource not found |  -  |
| **409** | Conflict |  -  |
| **503** | Service unavailable |  -  |

<a name="reposDeleteInvitation"></a>
# **reposDeleteInvitation**
> reposDeleteInvitation(owner, repo, invitationId)

Delete a repository invitation



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer invitationId = 56; // Integer | The unique identifier of the invitation.
    try {
      apiInstance.reposDeleteInvitation(owner, repo, invitationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteInvitation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **invitationId** | **Integer**| The unique identifier of the invitation. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="reposDeleteOrgRuleset"></a>
# **reposDeleteOrgRuleset**
> reposDeleteOrgRuleset(org, rulesetId)

Delete an organization repository ruleset

Delete a ruleset for an organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer rulesetId = 56; // Integer | The ID of the ruleset.
    try {
      apiInstance.reposDeleteOrgRuleset(org, rulesetId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteOrgRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **rulesetId** | **Integer**| The ID of the ruleset. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Error |  -  |

<a name="reposDeletePagesSite"></a>
# **reposDeletePagesSite**
> reposDeletePagesSite(owner, repo)

Delete a GitHub Pages site

Deletes a GitHub Pages site. For more information, see \&quot;[About GitHub Pages](/github/working-with-github-pages/about-github-pages).  To use this endpoint, you must be a repository administrator, maintainer, or have the &#39;manage GitHub Pages settings&#39; permission. A token with the &#x60;repo&#x60; scope or Pages write permission is required. GitHub Apps must have the &#x60;administration:write&#x60; and &#x60;pages:write&#x60; permissions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      apiInstance.reposDeletePagesSite(owner, repo);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeletePagesSite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **404** | Resource not found |  -  |
| **409** | Conflict |  -  |

<a name="reposDeletePullRequestReviewProtection"></a>
# **reposDeletePullRequestReviewProtection**
> reposDeletePullRequestReviewProtection(owner, repo, branch)

Delete pull request review protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      apiInstance.reposDeletePullRequestReviewProtection(owner, repo, branch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeletePullRequestReviewProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposDeleteRelease"></a>
# **reposDeleteRelease**
> reposDeleteRelease(owner, repo, releaseId)

Delete a release

Users with push access to the repository can delete a release.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer releaseId = 56; // Integer | The unique identifier of the release.
    try {
      apiInstance.reposDeleteRelease(owner, repo, releaseId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteRelease");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **releaseId** | **Integer**| The unique identifier of the release. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="reposDeleteReleaseAsset"></a>
# **reposDeleteReleaseAsset**
> reposDeleteReleaseAsset(owner, repo, assetId)

Delete a release asset



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer assetId = 56; // Integer | The unique identifier of the asset.
    try {
      apiInstance.reposDeleteReleaseAsset(owner, repo, assetId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteReleaseAsset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **assetId** | **Integer**| The unique identifier of the asset. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="reposDeleteRepoRuleset"></a>
# **reposDeleteRepoRuleset**
> reposDeleteRepoRuleset(owner, repo, rulesetId)

Delete a repository ruleset

Delete a ruleset for a repository.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer rulesetId = 56; // Integer | The ID of the ruleset.
    try {
      apiInstance.reposDeleteRepoRuleset(owner, repo, rulesetId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteRepoRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **rulesetId** | **Integer**| The ID of the ruleset. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Error |  -  |

<a name="reposDeleteTagProtection"></a>
# **reposDeleteTagProtection**
> reposDeleteTagProtection(owner, repo, tagProtectionId)

Delete a tag protection state for a repository

This deletes a tag protection state for a repository. This endpoint is only available to repository administrators.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer tagProtectionId = 56; // Integer | The unique identifier of the tag protection.
    try {
      apiInstance.reposDeleteTagProtection(owner, repo, tagProtectionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteTagProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **tagProtectionId** | **Integer**| The unique identifier of the tag protection. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="reposDeleteWebhook"></a>
# **reposDeleteWebhook**
> reposDeleteWebhook(owner, repo, hookId)

Delete a repository webhook



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    try {
      apiInstance.reposDeleteWebhook(owner, repo, hookId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDeleteWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **hookId** | **Integer**| The unique identifier of the hook. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposDisableAutomatedSecurityFixes"></a>
# **reposDisableAutomatedSecurityFixes**
> reposDisableAutomatedSecurityFixes(owner, repo)

Disable automated security fixes

Disables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see \&quot;[Configuring automated security fixes](https://docs.github.com/articles/configuring-automated-security-fixes)\&quot;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      apiInstance.reposDisableAutomatedSecurityFixes(owner, repo);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDisableAutomatedSecurityFixes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="reposDisableDeploymentProtectionRule"></a>
# **reposDisableDeploymentProtectionRule**
> reposDisableDeploymentProtectionRule(environmentName, repo, owner, protectionRuleId)

Disable a custom protection rule for an environment

Disables a custom deployment protection rule for an environment.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. Removing a custom protection rule requires admin or owner permissions to the repository. GitHub Apps must have the &#x60;actions:write&#x60; permission to use this endpoint. For more information, see \&quot;[Get an app](https://docs.github.com/rest/apps/apps#get-an-app)\&quot;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String environmentName = "environmentName_example"; // String | The name of the environment.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    Integer protectionRuleId = 56; // Integer | The unique identifier of the protection rule.
    try {
      apiInstance.reposDisableDeploymentProtectionRule(environmentName, repo, owner, protectionRuleId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDisableDeploymentProtectionRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **environmentName** | **String**| The name of the environment. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **protectionRuleId** | **Integer**| The unique identifier of the protection rule. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="reposDisableLfsForRepo"></a>
# **reposDisableLfsForRepo**
> reposDisableLfsForRepo(owner, repo)

Disable Git LFS for a repository

Disables Git LFS for a repository. Access tokens must have the &#x60;admin:enterprise&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      apiInstance.reposDisableLfsForRepo(owner, repo);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDisableLfsForRepo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="reposDisableVulnerabilityAlerts"></a>
# **reposDisableVulnerabilityAlerts**
> reposDisableVulnerabilityAlerts(owner, repo)

Disable vulnerability alerts

Disables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see \&quot;[About security alerts for vulnerable dependencies](https://docs.github.com/articles/about-security-alerts-for-vulnerable-dependencies)\&quot;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      apiInstance.reposDisableVulnerabilityAlerts(owner, repo);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDisableVulnerabilityAlerts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="reposDownloadTarballArchive"></a>
# **reposDownloadTarballArchive**
> reposDownloadTarballArchive(owner, repo, ref)

Download a repository archive (tar)

Gets a redirect URL to download a tar archive for a repository. If you omit &#x60;:ref&#x60;, the repository’s default branch (usually &#x60;main&#x60;) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use the &#x60;Location&#x60; header to make a second &#x60;GET&#x60; request. **Note**: For private repositories, these links are temporary and expire after five minutes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String ref = "ref_example"; // String | 
    try {
      apiInstance.reposDownloadTarballArchive(owner, repo, ref);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDownloadTarballArchive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **ref** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | Response |  * Location -  <br>  |

<a name="reposDownloadZipballArchive"></a>
# **reposDownloadZipballArchive**
> reposDownloadZipballArchive(owner, repo, ref)

Download a repository archive (zip)

Gets a redirect URL to download a zip archive for a repository. If you omit &#x60;:ref&#x60;, the repository’s default branch (usually &#x60;main&#x60;) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use the &#x60;Location&#x60; header to make a second &#x60;GET&#x60; request.  **Note**: For private repositories, these links are temporary and expire after five minutes. If the repository is empty, you will receive a 404 when you follow the redirect.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String ref = "ref_example"; // String | 
    try {
      apiInstance.reposDownloadZipballArchive(owner, repo, ref);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposDownloadZipballArchive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **ref** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | Response |  * Location -  <br>  |

<a name="reposEnableAutomatedSecurityFixes"></a>
# **reposEnableAutomatedSecurityFixes**
> reposEnableAutomatedSecurityFixes(owner, repo)

Enable automated security fixes

Enables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see \&quot;[Configuring automated security fixes](https://docs.github.com/articles/configuring-automated-security-fixes)\&quot;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      apiInstance.reposEnableAutomatedSecurityFixes(owner, repo);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposEnableAutomatedSecurityFixes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="reposEnableLfsForRepo"></a>
# **reposEnableLfsForRepo**
> Object reposEnableLfsForRepo(owner, repo)

Enable Git LFS for a repository

Enables Git LFS for a repository. Access tokens must have the &#x60;admin:enterprise&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      Object result = apiInstance.reposEnableLfsForRepo(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposEnableLfsForRepo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **403** | We will return a 403 with one of the following messages:  - Git LFS support not enabled because Git LFS is globally disabled. - Git LFS support not enabled because Git LFS is disabled for the root repository in the network. - Git LFS support not enabled because Git LFS is disabled for &lt;owner&gt;. |  -  |

<a name="reposEnableVulnerabilityAlerts"></a>
# **reposEnableVulnerabilityAlerts**
> reposEnableVulnerabilityAlerts(owner, repo)

Enable vulnerability alerts

Enables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see \&quot;[About security alerts for vulnerable dependencies](https://docs.github.com/articles/about-security-alerts-for-vulnerable-dependencies)\&quot;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      apiInstance.reposEnableVulnerabilityAlerts(owner, repo);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposEnableVulnerabilityAlerts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="reposGenerateReleaseNotes"></a>
# **reposGenerateReleaseNotes**
> ReleaseNotesContent reposGenerateReleaseNotes(owner, repo, reposGenerateReleaseNotesRequest)

Generate release notes content for a release

Generate a name and body describing a [release](https://docs.github.com/rest/reference/repos#releases). The body content will be markdown formatted and contain information like the changes since last release and users who contributed. The generated release notes are not saved anywhere. They are intended to be generated and used when creating a new release.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposGenerateReleaseNotesRequest reposGenerateReleaseNotesRequest = new ReposGenerateReleaseNotesRequest(); // ReposGenerateReleaseNotesRequest | 
    try {
      ReleaseNotesContent result = apiInstance.reposGenerateReleaseNotes(owner, repo, reposGenerateReleaseNotesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGenerateReleaseNotes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposGenerateReleaseNotesRequest** | [**ReposGenerateReleaseNotesRequest**](ReposGenerateReleaseNotesRequest.md)|  | |

### Return type

[**ReleaseNotesContent**](ReleaseNotesContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Name and body of generated release notes |  -  |
| **404** | Resource not found |  -  |

<a name="reposGet"></a>
# **reposGet**
> FullRepository reposGet(owner, repo)

Get a repository

The &#x60;parent&#x60; and &#x60;source&#x60; objects are present when the repository is a fork. &#x60;parent&#x60; is the repository this repository was forked from, &#x60;source&#x60; is the ultimate source for the network.  **Note:** In order to see the &#x60;security_and_analysis&#x60; block for a repository you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      FullRepository result = apiInstance.reposGet(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**FullRepository**](FullRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **301** | Moved permanently |  -  |

<a name="reposGetAccessRestrictions"></a>
# **reposGetAccessRestrictions**
> BranchRestrictionPolicy reposGetAccessRestrictions(owner, repo, branch)

Get access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Lists who has access to this protected branch.  **Note**: Users, apps, and teams &#x60;restrictions&#x60; are only available for organization-owned repositories.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      BranchRestrictionPolicy result = apiInstance.reposGetAccessRestrictions(owner, repo, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetAccessRestrictions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

[**BranchRestrictionPolicy**](BranchRestrictionPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetAdminBranchProtection"></a>
# **reposGetAdminBranchProtection**
> ProtectedBranchAdminEnforced reposGetAdminBranchProtection(owner, repo, branch)

Get admin branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      ProtectedBranchAdminEnforced result = apiInstance.reposGetAdminBranchProtection(owner, repo, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetAdminBranchProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

[**ProtectedBranchAdminEnforced**](ProtectedBranchAdminEnforced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposGetAllDeploymentProtectionRules"></a>
# **reposGetAllDeploymentProtectionRules**
> ReposGetAllDeploymentProtectionRules200Response reposGetAllDeploymentProtectionRules(environmentName, repo, owner)

Get all deployment protection rules for an environment

Gets all custom deployment protection rules that are enabled for an environment. Anyone with read access to the repository can use this endpoint. If the repository is private and you want to use a personal access token (classic), you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps and fine-grained personal access tokens must have the &#x60;actions:read&#x60; permission to use this endpoint. For more information about environments, see \&quot;[Using environments for deployment](https://docs.github.com/en/actions/deployment/targeting-different-environments/using-environments-for-deployment).\&quot;  For more information about the app that is providing this custom deployment rule, see the [documentation for the &#x60;GET /apps/{app_slug}&#x60; endpoint](https://docs.github.com/rest/apps/apps#get-an-app).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String environmentName = "environmentName_example"; // String | The name of the environment.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    try {
      ReposGetAllDeploymentProtectionRules200Response result = apiInstance.reposGetAllDeploymentProtectionRules(environmentName, repo, owner);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetAllDeploymentProtectionRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **environmentName** | **String**| The name of the environment. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |

### Return type

[**ReposGetAllDeploymentProtectionRules200Response**](ReposGetAllDeploymentProtectionRules200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of deployment protection rules |  -  |

<a name="reposGetAllEnvironments"></a>
# **reposGetAllEnvironments**
> ReposGetAllEnvironments200Response reposGetAllEnvironments(owner, repo, perPage, page)

List environments

Lists the environments for a repository.  Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ReposGetAllEnvironments200Response result = apiInstance.reposGetAllEnvironments(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetAllEnvironments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**ReposGetAllEnvironments200Response**](ReposGetAllEnvironments200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposGetAllStatusCheckContexts"></a>
# **reposGetAllStatusCheckContexts**
> List&lt;String&gt; reposGetAllStatusCheckContexts(owner, repo, branch)

Get all status check contexts

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      List<String> result = apiInstance.reposGetAllStatusCheckContexts(owner, repo, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetAllStatusCheckContexts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetAllTopics"></a>
# **reposGetAllTopics**
> Topic reposGetAllTopics(owner, repo, page, perPage)

Get all repository topics



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    try {
      Topic result = apiInstance.reposGetAllTopics(owner, repo, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetAllTopics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |

### Return type

[**Topic**](Topic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetAppsWithAccessToProtectedBranch"></a>
# **reposGetAppsWithAccessToProtectedBranch**
> List&lt;Integration&gt; reposGetAppsWithAccessToProtectedBranch(owner, repo, branch)

Get apps with access to the protected branch

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Lists the GitHub Apps that have push access to this branch. Only installed GitHub Apps with &#x60;write&#x60; access to the &#x60;contents&#x60; permission can be added as authorized actors on a protected branch.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      List<Integration> result = apiInstance.reposGetAppsWithAccessToProtectedBranch(owner, repo, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetAppsWithAccessToProtectedBranch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

[**List&lt;Integration&gt;**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetAutolink"></a>
# **reposGetAutolink**
> Autolink reposGetAutolink(owner, repo, autolinkId)

Get an autolink reference of a repository

This returns a single autolink reference by ID that was configured for the given repository.  Information about autolinks are only available to repository administrators.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer autolinkId = 56; // Integer | The unique identifier of the autolink.
    try {
      Autolink result = apiInstance.reposGetAutolink(owner, repo, autolinkId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetAutolink");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **autolinkId** | **Integer**| The unique identifier of the autolink. | |

### Return type

[**Autolink**](Autolink.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetBranch"></a>
# **reposGetBranch**
> BranchWithProtection reposGetBranch(owner, repo, branch)

Get a branch



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      BranchWithProtection result = apiInstance.reposGetBranch(owner, repo, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetBranch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

[**BranchWithProtection**](BranchWithProtection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **301** | Moved permanently |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetBranchProtection"></a>
# **reposGetBranchProtection**
> BranchProtection reposGetBranchProtection(owner, repo, branch)

Get branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      BranchProtection result = apiInstance.reposGetBranchProtection(owner, repo, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetBranchProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

[**BranchProtection**](BranchProtection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetBranchRules"></a>
# **reposGetBranchRules**
> List&lt;RepositoryRule&gt; reposGetBranchRules(owner, repo, branch)

Get rules for a branch

Returns all rules that apply to the specified branch.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      List<RepositoryRule> result = apiInstance.reposGetBranchRules(owner, repo, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetBranchRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

[**List&lt;RepositoryRule&gt;**](RepositoryRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposGetClones"></a>
# **reposGetClones**
> CloneTraffic reposGetClones(owner, repo, per)

Get repository clones

Get the total number of clones and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String per = "day"; // String | The time frame to display results for.
    try {
      CloneTraffic result = apiInstance.reposGetClones(owner, repo, per);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetClones");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **per** | **String**| The time frame to display results for. | [optional] [default to day] [enum: day, week] |

### Return type

[**CloneTraffic**](CloneTraffic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Forbidden |  -  |

<a name="reposGetCodeFrequencyStats"></a>
# **reposGetCodeFrequencyStats**
> List&lt;List&lt;Integer&gt;&gt; reposGetCodeFrequencyStats(owner, repo)

Get the weekly commit activity

Returns a weekly aggregate of the number of additions and deletions pushed to a repository.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      List<List<Integer>> result = apiInstance.reposGetCodeFrequencyStats(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetCodeFrequencyStats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**List&lt;List&lt;Integer&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a weekly aggregate of the number of additions and deletions pushed to a repository. |  -  |
| **202** | Accepted |  -  |
| **204** | A header with no content is returned. |  -  |

<a name="reposGetCollaboratorPermissionLevel"></a>
# **reposGetCollaboratorPermissionLevel**
> RepositoryCollaboratorPermission reposGetCollaboratorPermissionLevel(owner, repo, username)

Get repository permissions for a user

Checks the repository permission of a collaborator. The possible repository permissions are &#x60;admin&#x60;, &#x60;write&#x60;, &#x60;read&#x60;, and &#x60;none&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      RepositoryCollaboratorPermission result = apiInstance.reposGetCollaboratorPermissionLevel(owner, repo, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetCollaboratorPermissionLevel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **username** | **String**| The handle for the GitHub user account. | |

### Return type

[**RepositoryCollaboratorPermission**](RepositoryCollaboratorPermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | if user has admin permissions |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetCombinedStatusForRef"></a>
# **reposGetCombinedStatusForRef**
> CombinedCommitStatus reposGetCombinedStatusForRef(owner, repo, ref, perPage, page)

Get the combined status for a specific reference

Users with pull access in a repository can access a combined view of commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name.   Additionally, a combined &#x60;state&#x60; is returned. The &#x60;state&#x60; is one of:  *   **failure** if any of the contexts report as &#x60;error&#x60; or &#x60;failure&#x60; *   **pending** if there are no statuses or a context is &#x60;pending&#x60; *   **success** if the latest status for all contexts is &#x60;success&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String ref = "ref_example"; // String | ref parameter
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      CombinedCommitStatus result = apiInstance.reposGetCombinedStatusForRef(owner, repo, ref, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetCombinedStatusForRef");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **ref** | **String**| ref parameter | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**CombinedCommitStatus**](CombinedCommitStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetCommit"></a>
# **reposGetCommit**
> Commit reposGetCommit(owner, repo, ref, page, perPage)

Get a commit

Returns the contents of a single commit reference. You must have &#x60;read&#x60; access for the repository to use this endpoint.  **Note:** If there are more than 300 files in the commit diff, the response will include pagination link headers for the remaining files, up to a limit of 3000 files. Each page contains the static commit information, and the only changes are to the file listing.  You can pass the appropriate [media type](https://docs.github.com/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) to  fetch &#x60;diff&#x60; and &#x60;patch&#x60; formats. Diffs with binary data will have no &#x60;patch&#x60; property.  To return only the SHA-1 hash of the commit reference, you can provide the &#x60;sha&#x60; custom [media type](https://docs.github.com/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) in the &#x60;Accept&#x60; header. You can use this endpoint to check if a remote reference&#39;s SHA-1 hash is the same as your local reference&#39;s SHA-1 hash by providing the local SHA-1 reference as the ETag.  **Signature verification object**  The response will include a &#x60;verification&#x60; object that describes the result of verifying the commit&#39;s signature. The following fields are included in the &#x60;verification&#x60; object:  | Name | Type | Description | | ---- | ---- | ----------- | | &#x60;verified&#x60; | &#x60;boolean&#x60; | Indicates whether GitHub considers the signature in this commit to be verified. | | &#x60;reason&#x60; | &#x60;string&#x60; | The reason for verified value. Possible values and their meanings are enumerated in table below. | | &#x60;signature&#x60; | &#x60;string&#x60; | The signature that was extracted from the commit. | | &#x60;payload&#x60; | &#x60;string&#x60; | The value that was signed. |  These are the possible values for &#x60;reason&#x60; in the &#x60;verification&#x60; object:  | Value | Description | | ----- | ----------- | | &#x60;expired_key&#x60; | The key that made the signature is expired. | | &#x60;not_signing_key&#x60; | The \&quot;signing\&quot; flag is not among the usage flags in the GPG key that made the signature. | | &#x60;gpgverify_error&#x60; | There was an error communicating with the signature verification service. | | &#x60;gpgverify_unavailable&#x60; | The signature verification service is currently unavailable. | | &#x60;unsigned&#x60; | The object does not include a signature. | | &#x60;unknown_signature_type&#x60; | A non-PGP signature was found in the commit. | | &#x60;no_user&#x60; | No user was associated with the &#x60;committer&#x60; email address in the commit. | | &#x60;unverified_email&#x60; | The &#x60;committer&#x60; email address in the commit was associated with a user, but the email address is not verified on their account. | | &#x60;bad_email&#x60; | The &#x60;committer&#x60; email address in the commit is not included in the identities of the PGP key that made the signature. | | &#x60;unknown_key&#x60; | The key that made the signature has not been registered with any user&#39;s account. | | &#x60;malformed_signature&#x60; | There was an error parsing the signature. | | &#x60;invalid&#x60; | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | &#x60;valid&#x60; | None of the above errors applied, so the signature is considered to be verified. |

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String ref = "ref_example"; // String | ref parameter
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    try {
      Commit result = apiInstance.reposGetCommit(owner, repo, ref, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetCommit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **ref** | **String**| ref parameter | |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |

### Return type

[**Commit**](Commit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Error |  -  |
| **503** | Service unavailable |  -  |

<a name="reposGetCommitActivityStats"></a>
# **reposGetCommitActivityStats**
> List&lt;CommitActivity&gt; reposGetCommitActivityStats(owner, repo)

Get the last year of commit activity

Returns the last year of commit activity grouped by week. The &#x60;days&#x60; array is a group of commits per day, starting on &#x60;Sunday&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      List<CommitActivity> result = apiInstance.reposGetCommitActivityStats(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetCommitActivityStats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**List&lt;CommitActivity&gt;**](CommitActivity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **202** | Accepted |  -  |
| **204** | A header with no content is returned. |  -  |

<a name="reposGetCommitComment"></a>
# **reposGetCommitComment**
> CommitComment reposGetCommitComment(owner, repo, commentId)

Get a commit comment



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer commentId = 56; // Integer | The unique identifier of the comment.
    try {
      CommitComment result = apiInstance.reposGetCommitComment(owner, repo, commentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetCommitComment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **commentId** | **Integer**| The unique identifier of the comment. | |

### Return type

[**CommitComment**](CommitComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetCommitSignatureProtection"></a>
# **reposGetCommitSignatureProtection**
> ProtectedBranchAdminEnforced reposGetCommitSignatureProtection(owner, repo, branch)

Get commit signature protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  When authenticated with admin or owner permissions to the repository, you can use this endpoint to check whether a branch requires signed commits. An enabled status of &#x60;true&#x60; indicates you must sign commits on this branch. For more information, see [Signing commits with GPG](https://docs.github.com/articles/signing-commits-with-gpg) in GitHub Help.  **Note**: You must enable branch protection to require signed commits.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      ProtectedBranchAdminEnforced result = apiInstance.reposGetCommitSignatureProtection(owner, repo, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetCommitSignatureProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

[**ProtectedBranchAdminEnforced**](ProtectedBranchAdminEnforced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetCommunityProfileMetrics"></a>
# **reposGetCommunityProfileMetrics**
> CommunityProfile reposGetCommunityProfileMetrics(owner, repo)

Get community profile metrics

Returns all community profile metrics for a repository. The repository cannot be a fork.  The returned metrics include an overall health score, the repository description, the presence of documentation, the detected code of conduct, the detected license, and the presence of ISSUE\\_TEMPLATE, PULL\\_REQUEST\\_TEMPLATE, README, and CONTRIBUTING files.  The &#x60;health_percentage&#x60; score is defined as a percentage of how many of these four documents are present: README, CONTRIBUTING, LICENSE, and CODE_OF_CONDUCT. For example, if all four documents are present, then the &#x60;health_percentage&#x60; is &#x60;100&#x60;. If only one is present, then the &#x60;health_percentage&#x60; is &#x60;25&#x60;.  &#x60;content_reports_enabled&#x60; is only returned for organization-owned repositories.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      CommunityProfile result = apiInstance.reposGetCommunityProfileMetrics(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetCommunityProfileMetrics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**CommunityProfile**](CommunityProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposGetContent"></a>
# **reposGetContent**
> ContentTree reposGetContent(owner, repo, path, ref)

Get repository content

Gets the contents of a file or directory in a repository. Specify the file path or directory in &#x60;:path&#x60;. If you omit &#x60;:path&#x60;, you will receive the contents of the repository&#39;s root directory. See the description below regarding what the API response includes for directories.   Files and symlinks support [a custom media type](https://docs.github.com/rest/reference/repos#custom-media-types) for retrieving the raw content or rendered HTML (when supported). All content types support [a custom media type](https://docs.github.com/rest/reference/repos#custom-media-types) to ensure the content is returned in a consistent object format.  **Notes**: *   To get a repository&#39;s contents recursively, you can [recursively get the tree](https://docs.github.com/rest/reference/git#trees). *   This API has an upper limit of 1,000 files for a directory. If you need to retrieve more files, use the [Git Trees API](https://docs.github.com/rest/reference/git#get-a-tree).  *  Download URLs expire and are meant to be used just once. To ensure the download URL does not expire, please use the contents API to obtain a fresh download URL for each download. #### Size limits If the requested file&#39;s size is: * 1 MB or smaller: All features of this endpoint are supported. * Between 1-100 MB: Only the &#x60;raw&#x60; or &#x60;object&#x60; [custom media types](https://docs.github.com/rest/repos/contents#custom-media-types-for-repository-contents) are supported. Both will work as normal, except that when using the &#x60;object&#x60; media type, the &#x60;content&#x60; field will be an empty string and the &#x60;encoding&#x60; field will be &#x60;\&quot;none\&quot;&#x60;. To get the contents of these larger files, use the &#x60;raw&#x60; media type.  * Greater than 100 MB: This endpoint is not supported.  #### If the content is a directory The response will be an array of objects, one object for each item in the directory. When listing the contents of a directory, submodules have their \&quot;type\&quot; specified as \&quot;file\&quot;. Logically, the value _should_ be \&quot;submodule\&quot;. This behavior exists in API v3 [for backwards compatibility purposes](https://git.io/v1YCW). In the next major version of the API, the type will be returned as \&quot;submodule\&quot;.  #### If the content is a symlink  If the requested &#x60;:path&#x60; points to a symlink, and the symlink&#39;s target is a normal file in the repository, then the API responds with the content of the file (in the format shown in the example. Otherwise, the API responds with an object  describing the symlink itself.  #### If the content is a submodule The &#x60;submodule_git_url&#x60; identifies the location of the submodule repository, and the &#x60;sha&#x60; identifies a specific commit within the submodule repository. Git uses the given URL when cloning the submodule repository, and checks out the submodule at that specific commit.  If the submodule repository is not hosted on github.com, the Git URLs (&#x60;git_url&#x60; and &#x60;_links[\&quot;git\&quot;]&#x60;) and the github.com URLs (&#x60;html_url&#x60; and &#x60;_links[\&quot;html\&quot;]&#x60;) will have null values.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String path = "path_example"; // String | path parameter
    String ref = "ref_example"; // String | The name of the commit/branch/tag. Default: the repository’s default branch.
    try {
      ContentTree result = apiInstance.reposGetContent(owner, repo, path, ref);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetContent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **path** | **String**| path parameter | |
| **ref** | **String**| The name of the commit/branch/tag. Default: the repository’s default branch. | [optional] |

### Return type

[**ContentTree**](ContentTree.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.github.object, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **302** | Found |  -  |

<a name="reposGetContributorsStats"></a>
# **reposGetContributorsStats**
> List&lt;ContributorActivity&gt; reposGetContributorsStats(owner, repo)

Get all contributor commit activity

 Returns the &#x60;total&#x60; number of commits authored by the contributor. In addition, the response includes a Weekly Hash (&#x60;weeks&#x60; array) with the following information:  *   &#x60;w&#x60; - Start of the week, given as a [Unix timestamp](http://en.wikipedia.org/wiki/Unix_time). *   &#x60;a&#x60; - Number of additions *   &#x60;d&#x60; - Number of deletions *   &#x60;c&#x60; - Number of commits

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      List<ContributorActivity> result = apiInstance.reposGetContributorsStats(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetContributorsStats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**List&lt;ContributorActivity&gt;**](ContributorActivity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **202** | Accepted |  -  |
| **204** | A header with no content is returned. |  -  |

<a name="reposGetCustomDeploymentProtectionRule"></a>
# **reposGetCustomDeploymentProtectionRule**
> DeploymentProtectionRule reposGetCustomDeploymentProtectionRule(owner, repo, environmentName, protectionRuleId)

Get a custom deployment protection rule

Gets an enabled custom deployment protection rule for an environment. Anyone with read access to the repository can use this endpoint. If the repository is private and you want to use a personal access token (classic), you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps and fine-grained personal access tokens must have the &#x60;actions:read&#x60; permission to use this endpoint. For more information about environments, see \&quot;[Using environments for deployment](https://docs.github.com/en/actions/deployment/targeting-different-environments/using-environments-for-deployment).\&quot;  For more information about the app that is providing this custom deployment rule, see [&#x60;GET /apps/{app_slug}&#x60;](https://docs.github.com/rest/apps/apps#get-an-app).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    Integer protectionRuleId = 56; // Integer | The unique identifier of the protection rule.
    try {
      DeploymentProtectionRule result = apiInstance.reposGetCustomDeploymentProtectionRule(owner, repo, environmentName, protectionRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetCustomDeploymentProtectionRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **environmentName** | **String**| The name of the environment. | |
| **protectionRuleId** | **Integer**| The unique identifier of the protection rule. | |

### Return type

[**DeploymentProtectionRule**](DeploymentProtectionRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposGetDeployKey"></a>
# **reposGetDeployKey**
> DeployKey reposGetDeployKey(owner, repo, keyId)

Get a deploy key



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer keyId = 56; // Integer | The unique identifier of the key.
    try {
      DeployKey result = apiInstance.reposGetDeployKey(owner, repo, keyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetDeployKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **keyId** | **Integer**| The unique identifier of the key. | |

### Return type

[**DeployKey**](DeployKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetDeployment"></a>
# **reposGetDeployment**
> Deployment reposGetDeployment(owner, repo, deploymentId)

Get a deployment



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer deploymentId = 56; // Integer | deployment_id parameter
    try {
      Deployment result = apiInstance.reposGetDeployment(owner, repo, deploymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetDeployment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **deploymentId** | **Integer**| deployment_id parameter | |

### Return type

[**Deployment**](Deployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetDeploymentBranchPolicy"></a>
# **reposGetDeploymentBranchPolicy**
> DeploymentBranchPolicy reposGetDeploymentBranchPolicy(owner, repo, environmentName, branchPolicyId)

Get a deployment branch policy

Gets a deployment branch policy for an environment.  Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    Integer branchPolicyId = 56; // Integer | The unique identifier of the branch policy.
    try {
      DeploymentBranchPolicy result = apiInstance.reposGetDeploymentBranchPolicy(owner, repo, environmentName, branchPolicyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetDeploymentBranchPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **environmentName** | **String**| The name of the environment. | |
| **branchPolicyId** | **Integer**| The unique identifier of the branch policy. | |

### Return type

[**DeploymentBranchPolicy**](DeploymentBranchPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposGetDeploymentStatus"></a>
# **reposGetDeploymentStatus**
> DeploymentStatus reposGetDeploymentStatus(owner, repo, deploymentId, statusId)

Get a deployment status

Users with pull access can view a deployment status for a deployment:

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer deploymentId = 56; // Integer | deployment_id parameter
    Integer statusId = 56; // Integer | 
    try {
      DeploymentStatus result = apiInstance.reposGetDeploymentStatus(owner, repo, deploymentId, statusId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetDeploymentStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **deploymentId** | **Integer**| deployment_id parameter | |
| **statusId** | **Integer**|  | |

### Return type

[**DeploymentStatus**](DeploymentStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetEnvironment"></a>
# **reposGetEnvironment**
> Environment reposGetEnvironment(owner, repo, environmentName)

Get an environment

**Note:** To get information about name patterns that branches must match in order to deploy to this environment, see \&quot;[Get a deployment branch policy](/rest/deployments/branch-policies#get-a-deployment-branch-policy).\&quot;  Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    try {
      Environment result = apiInstance.reposGetEnvironment(owner, repo, environmentName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetEnvironment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **environmentName** | **String**| The name of the environment. | |

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposGetLatestPagesBuild"></a>
# **reposGetLatestPagesBuild**
> PageBuild reposGetLatestPagesBuild(owner, repo)

Get latest Pages build



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      PageBuild result = apiInstance.reposGetLatestPagesBuild(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetLatestPagesBuild");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**PageBuild**](PageBuild.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposGetLatestRelease"></a>
# **reposGetLatestRelease**
> Release reposGetLatestRelease(owner, repo)

Get the latest release

View the latest published full release for the repository.  The latest release is the most recent non-prerelease, non-draft release, sorted by the &#x60;created_at&#x60; attribute. The &#x60;created_at&#x60; attribute is the date of the commit used for the release, and not the date when the release was drafted or published.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      Release result = apiInstance.reposGetLatestRelease(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetLatestRelease");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposGetOrgRuleset"></a>
# **reposGetOrgRuleset**
> RepositoryRuleset reposGetOrgRuleset(org, rulesetId)

Get an organization repository ruleset

Get a repository ruleset for an organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer rulesetId = 56; // Integer | The ID of the ruleset.
    try {
      RepositoryRuleset result = apiInstance.reposGetOrgRuleset(org, rulesetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetOrgRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **rulesetId** | **Integer**| The ID of the ruleset. | |

### Return type

[**RepositoryRuleset**](RepositoryRuleset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Error |  -  |

<a name="reposGetOrgRulesets"></a>
# **reposGetOrgRulesets**
> List&lt;RepositoryRuleset&gt; reposGetOrgRulesets(org)

Get all organization repository rulesets

Get all the repository rulesets for an organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      List<RepositoryRuleset> result = apiInstance.reposGetOrgRulesets(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetOrgRulesets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org** | **String**| The organization name. The name is not case sensitive. | |

### Return type

[**List&lt;RepositoryRuleset&gt;**](RepositoryRuleset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Error |  -  |

<a name="reposGetPages"></a>
# **reposGetPages**
> Page reposGetPages(owner, repo)

Get a GitHub Pages site



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      Page result = apiInstance.reposGetPages(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetPages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**Page**](Page.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetPagesBuild"></a>
# **reposGetPagesBuild**
> PageBuild reposGetPagesBuild(owner, repo, buildId)

Get GitHub Pages build



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer buildId = 56; // Integer | 
    try {
      PageBuild result = apiInstance.reposGetPagesBuild(owner, repo, buildId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetPagesBuild");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **buildId** | **Integer**|  | |

### Return type

[**PageBuild**](PageBuild.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposGetPagesHealthCheck"></a>
# **reposGetPagesHealthCheck**
> PagesHealthCheck reposGetPagesHealthCheck(owner, repo)

Get a DNS health check for GitHub Pages

Gets a health check of the DNS settings for the &#x60;CNAME&#x60; record configured for a repository&#39;s GitHub Pages.  The first request to this endpoint returns a &#x60;202 Accepted&#x60; status and starts an asynchronous background task to get the results for the domain. After the background task completes, subsequent requests to this endpoint return a &#x60;200 OK&#x60; status with the health check results in the response.  To use this endpoint, you must be a repository administrator, maintainer, or have the &#39;manage GitHub Pages settings&#39; permission. A token with the &#x60;repo&#x60; scope or Pages write permission is required. GitHub Apps must have the &#x60;administrative:write&#x60; and &#x60;pages:write&#x60; permissions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      PagesHealthCheck result = apiInstance.reposGetPagesHealthCheck(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetPagesHealthCheck");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**PagesHealthCheck**](PagesHealthCheck.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **202** | Empty response |  -  |
| **400** | Custom domains are not available for GitHub Pages |  -  |
| **422** | There isn&#39;t a CNAME for this page |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetParticipationStats"></a>
# **reposGetParticipationStats**
> ParticipationStats reposGetParticipationStats(owner, repo)

Get the weekly commit count

Returns the total commit counts for the &#x60;owner&#x60; and total commit counts in &#x60;all&#x60;. &#x60;all&#x60; is everyone combined, including the &#x60;owner&#x60; in the last 52 weeks. If you&#39;d like to get the commit counts for non-owners, you can subtract &#x60;owner&#x60; from &#x60;all&#x60;.  The array order is oldest week (index 0) to most recent week.  The most recent week is seven days ago at UTC midnight to today at UTC midnight.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      ParticipationStats result = apiInstance.reposGetParticipationStats(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetParticipationStats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**ParticipationStats**](ParticipationStats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The array order is oldest week (index 0) to most recent week. |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetPullRequestReviewProtection"></a>
# **reposGetPullRequestReviewProtection**
> ProtectedBranchPullRequestReview reposGetPullRequestReviewProtection(owner, repo, branch)

Get pull request review protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      ProtectedBranchPullRequestReview result = apiInstance.reposGetPullRequestReviewProtection(owner, repo, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetPullRequestReviewProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

[**ProtectedBranchPullRequestReview**](ProtectedBranchPullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposGetPunchCardStats"></a>
# **reposGetPunchCardStats**
> List&lt;List&lt;Integer&gt;&gt; reposGetPunchCardStats(owner, repo)

Get the hourly commit count for each day

Each array contains the day number, hour number, and number of commits:  *   &#x60;0-6&#x60;: Sunday - Saturday *   &#x60;0-23&#x60;: Hour of day *   Number of commits  For example, &#x60;[2, 14, 25]&#x60; indicates that there were 25 total commits, during the 2:00pm hour on Tuesdays. All times are based on the time zone of individual commits.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      List<List<Integer>> result = apiInstance.reposGetPunchCardStats(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetPunchCardStats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**List&lt;List&lt;Integer&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | For example, &#x60;[2, 14, 25]&#x60; indicates that there were 25 total commits, during the 2:00pm hour on Tuesdays. All times are based on the time zone of individual commits. |  -  |
| **204** | A header with no content is returned. |  -  |

<a name="reposGetReadme"></a>
# **reposGetReadme**
> ContentFile reposGetReadme(owner, repo, ref)

Get a repository README

Gets the preferred README for a repository.  READMEs support [custom media types](https://docs.github.com/rest/reference/repos#custom-media-types) for retrieving the raw content or rendered HTML.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String ref = "ref_example"; // String | The name of the commit/branch/tag. Default: the repository’s default branch.
    try {
      ContentFile result = apiInstance.reposGetReadme(owner, repo, ref);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetReadme");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **ref** | **String**| The name of the commit/branch/tag. Default: the repository’s default branch. | [optional] |

### Return type

[**ContentFile**](ContentFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposGetReadmeInDirectory"></a>
# **reposGetReadmeInDirectory**
> ContentFile reposGetReadmeInDirectory(owner, repo, dir, ref)

Get a repository README for a directory

Gets the README from a repository directory.  READMEs support [custom media types](https://docs.github.com/rest/reference/repos#custom-media-types) for retrieving the raw content or rendered HTML.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String dir = "dir_example"; // String | The alternate path to look for a README file
    String ref = "ref_example"; // String | The name of the commit/branch/tag. Default: the repository’s default branch.
    try {
      ContentFile result = apiInstance.reposGetReadmeInDirectory(owner, repo, dir, ref);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetReadmeInDirectory");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **dir** | **String**| The alternate path to look for a README file | |
| **ref** | **String**| The name of the commit/branch/tag. Default: the repository’s default branch. | [optional] |

### Return type

[**ContentFile**](ContentFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposGetRelease"></a>
# **reposGetRelease**
> Release reposGetRelease(owner, repo, releaseId)

Get a release

**Note:** This returns an &#x60;upload_url&#x60; key corresponding to the endpoint for uploading release assets. This key is a [hypermedia resource](https://docs.github.com/rest/overview/resources-in-the-rest-api#hypermedia).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer releaseId = 56; // Integer | The unique identifier of the release.
    try {
      Release result = apiInstance.reposGetRelease(owner, repo, releaseId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetRelease");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **releaseId** | **Integer**| The unique identifier of the release. | |

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **Note:** This returns an &#x60;upload_url&#x60; key corresponding to the endpoint for uploading release assets. This key is a [hypermedia resource](https://docs.github.com/rest/overview/resources-in-the-rest-api#hypermedia). |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetReleaseAsset"></a>
# **reposGetReleaseAsset**
> ReleaseAsset reposGetReleaseAsset(owner, repo, assetId)

Get a release asset

To download the asset&#39;s binary content, set the &#x60;Accept&#x60; header of the request to [&#x60;application/octet-stream&#x60;](https://docs.github.com/rest/overview/media-types). The API will either redirect the client to the location, or stream it directly if possible. API clients should handle both a &#x60;200&#x60; or &#x60;302&#x60; response.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer assetId = 56; // Integer | The unique identifier of the asset.
    try {
      ReleaseAsset result = apiInstance.reposGetReleaseAsset(owner, repo, assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetReleaseAsset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **assetId** | **Integer**| The unique identifier of the asset. | |

### Return type

[**ReleaseAsset**](ReleaseAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **302** | Found |  -  |

<a name="reposGetReleaseByTag"></a>
# **reposGetReleaseByTag**
> Release reposGetReleaseByTag(owner, repo, tag)

Get a release by tag name

Get a published release with the specified tag.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String tag = "tag_example"; // String | tag parameter
    try {
      Release result = apiInstance.reposGetReleaseByTag(owner, repo, tag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetReleaseByTag");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **tag** | **String**| tag parameter | |

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetRepoRuleset"></a>
# **reposGetRepoRuleset**
> RepositoryRuleset reposGetRepoRuleset(owner, repo, rulesetId, includesParents)

Get a repository ruleset

Get a ruleset for a repository.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer rulesetId = 56; // Integer | The ID of the ruleset.
    Boolean includesParents = true; // Boolean | Include rulesets configured at higher levels that apply to this repository
    try {
      RepositoryRuleset result = apiInstance.reposGetRepoRuleset(owner, repo, rulesetId, includesParents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetRepoRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **rulesetId** | **Integer**| The ID of the ruleset. | |
| **includesParents** | **Boolean**| Include rulesets configured at higher levels that apply to this repository | [optional] |

### Return type

[**RepositoryRuleset**](RepositoryRuleset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Error |  -  |

<a name="reposGetRepoRulesets"></a>
# **reposGetRepoRulesets**
> List&lt;RepositoryRuleset&gt; reposGetRepoRulesets(owner, repo, includesParents)

Get all repository rulesets

Get all the rulesets for a repository.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Boolean includesParents = true; // Boolean | Include rulesets configured at higher levels that apply to this repository
    try {
      List<RepositoryRuleset> result = apiInstance.reposGetRepoRulesets(owner, repo, includesParents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetRepoRulesets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **includesParents** | **Boolean**| Include rulesets configured at higher levels that apply to this repository | [optional] |

### Return type

[**List&lt;RepositoryRuleset&gt;**](RepositoryRuleset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Error |  -  |

<a name="reposGetStatusChecksProtection"></a>
# **reposGetStatusChecksProtection**
> StatusCheckPolicy reposGetStatusChecksProtection(owner, repo, branch)

Get status checks protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      StatusCheckPolicy result = apiInstance.reposGetStatusChecksProtection(owner, repo, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetStatusChecksProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

[**StatusCheckPolicy**](StatusCheckPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetTeamsWithAccessToProtectedBranch"></a>
# **reposGetTeamsWithAccessToProtectedBranch**
> List&lt;Team&gt; reposGetTeamsWithAccessToProtectedBranch(owner, repo, branch)

Get teams with access to the protected branch

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Lists the teams who have push access to this branch. The list includes child teams.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      List<Team> result = apiInstance.reposGetTeamsWithAccessToProtectedBranch(owner, repo, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetTeamsWithAccessToProtectedBranch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

[**List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetTopPaths"></a>
# **reposGetTopPaths**
> List&lt;ContentTraffic&gt; reposGetTopPaths(owner, repo)

Get top referral paths

Get the top 10 popular contents over the last 14 days.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      List<ContentTraffic> result = apiInstance.reposGetTopPaths(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetTopPaths");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**List&lt;ContentTraffic&gt;**](ContentTraffic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Forbidden |  -  |

<a name="reposGetTopReferrers"></a>
# **reposGetTopReferrers**
> List&lt;ReferrerTraffic&gt; reposGetTopReferrers(owner, repo)

Get top referral sources

Get the top 10 referrers over the last 14 days.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      List<ReferrerTraffic> result = apiInstance.reposGetTopReferrers(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetTopReferrers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**List&lt;ReferrerTraffic&gt;**](ReferrerTraffic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Forbidden |  -  |

<a name="reposGetUsersWithAccessToProtectedBranch"></a>
# **reposGetUsersWithAccessToProtectedBranch**
> List&lt;SimpleUser&gt; reposGetUsersWithAccessToProtectedBranch(owner, repo, branch)

Get users with access to the protected branch

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Lists the people who have push access to this branch.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      List<SimpleUser> result = apiInstance.reposGetUsersWithAccessToProtectedBranch(owner, repo, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetUsersWithAccessToProtectedBranch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

[**List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetViews"></a>
# **reposGetViews**
> ViewTraffic reposGetViews(owner, repo, per)

Get page views

Get the total number of views and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String per = "day"; // String | The time frame to display results for.
    try {
      ViewTraffic result = apiInstance.reposGetViews(owner, repo, per);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetViews");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **per** | **String**| The time frame to display results for. | [optional] [default to day] [enum: day, week] |

### Return type

[**ViewTraffic**](ViewTraffic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Forbidden |  -  |

<a name="reposGetWebhook"></a>
# **reposGetWebhook**
> Hook reposGetWebhook(owner, repo, hookId)

Get a repository webhook

Returns a webhook configured in a repository. To get only the webhook &#x60;config&#x60; properties, see \&quot;[Get a webhook configuration for a repository](/rest/reference/repos#get-a-webhook-configuration-for-a-repository).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    try {
      Hook result = apiInstance.reposGetWebhook(owner, repo, hookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **hookId** | **Integer**| The unique identifier of the hook. | |

### Return type

[**Hook**](Hook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposGetWebhookConfigForRepo"></a>
# **reposGetWebhookConfigForRepo**
> WebhookConfig reposGetWebhookConfigForRepo(owner, repo, hookId)

Get a webhook configuration for a repository

Returns the webhook configuration for a repository. To get more information about the webhook, including the &#x60;active&#x60; state and &#x60;events&#x60;, use \&quot;[Get a repository webhook](/rest/reference/orgs#get-a-repository-webhook).\&quot;  Access tokens must have the &#x60;read:repo_hook&#x60; or &#x60;repo&#x60; scope, and GitHub Apps must have the &#x60;repository_hooks:read&#x60; permission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    try {
      WebhookConfig result = apiInstance.reposGetWebhookConfigForRepo(owner, repo, hookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetWebhookConfigForRepo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **hookId** | **Integer**| The unique identifier of the hook. | |

### Return type

[**WebhookConfig**](WebhookConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposGetWebhookDelivery"></a>
# **reposGetWebhookDelivery**
> HookDelivery reposGetWebhookDelivery(owner, repo, hookId, deliveryId)

Get a delivery for a repository webhook

Returns a delivery for a webhook configured in a repository.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    Integer deliveryId = 56; // Integer | 
    try {
      HookDelivery result = apiInstance.reposGetWebhookDelivery(owner, repo, hookId, deliveryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposGetWebhookDelivery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **hookId** | **Integer**| The unique identifier of the hook. | |
| **deliveryId** | **Integer**|  | |

### Return type

[**HookDelivery**](HookDelivery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **400** | Bad Request |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposListAutolinks"></a>
# **reposListAutolinks**
> List&lt;Autolink&gt; reposListAutolinks(owner, repo, page)

List all autolinks of a repository

This returns a list of autolinks configured for the given repository.  Information about autolinks are only available to repository administrators.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Autolink> result = apiInstance.reposListAutolinks(owner, repo, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListAutolinks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;Autolink&gt;**](Autolink.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposListBranches"></a>
# **reposListBranches**
> List&lt;ShortBranch&gt; reposListBranches(owner, repo, _protected, perPage, page)

List branches



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Boolean _protected = true; // Boolean | Setting to `true` returns only protected branches. When set to `false`, only unprotected branches are returned. Omitting this parameter returns all branches.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<ShortBranch> result = apiInstance.reposListBranches(owner, repo, _protected, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListBranches");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **_protected** | **Boolean**| Setting to &#x60;true&#x60; returns only protected branches. When set to &#x60;false&#x60;, only unprotected branches are returned. Omitting this parameter returns all branches. | [optional] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;ShortBranch&gt;**](ShortBranch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |
| **404** | Resource not found |  -  |

<a name="reposListBranchesForHeadCommit"></a>
# **reposListBranchesForHeadCommit**
> List&lt;BranchShort&gt; reposListBranchesForHeadCommit(owner, repo, commitSha)

List branches for HEAD commit

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Returns all branches where the given commit SHA is the HEAD, or latest commit for the branch.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String commitSha = "commitSha_example"; // String | The SHA of the commit.
    try {
      List<BranchShort> result = apiInstance.reposListBranchesForHeadCommit(owner, repo, commitSha);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListBranchesForHeadCommit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **commitSha** | **String**| The SHA of the commit. | |

### Return type

[**List&lt;BranchShort&gt;**](BranchShort.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposListCollaborators"></a>
# **reposListCollaborators**
> List&lt;Collaborator&gt; reposListCollaborators(owner, repo, affiliation, permission, perPage, page)

List repository collaborators

For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. Organization members with write, maintain, or admin privileges on the organization-owned repository can use this endpoint.  Team members will include the members of child teams.  You must authenticate using an access token with the &#x60;read:org&#x60; and &#x60;repo&#x60; scopes with push access to use this endpoint. GitHub Apps must have the &#x60;members&#x60; organization permission and &#x60;metadata&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String affiliation = "outside"; // String | Filter collaborators returned by their affiliation. `outside` means all outside collaborators of an organization-owned repository. `direct` means all collaborators with permissions to an organization-owned repository, regardless of organization membership status. `all` means all collaborators the authenticated user can see.
    String permission = "pull"; // String | Filter collaborators by the permissions they have on the repository. If not specified, all collaborators will be returned.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Collaborator> result = apiInstance.reposListCollaborators(owner, repo, affiliation, permission, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListCollaborators");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **affiliation** | **String**| Filter collaborators returned by their affiliation. &#x60;outside&#x60; means all outside collaborators of an organization-owned repository. &#x60;direct&#x60; means all collaborators with permissions to an organization-owned repository, regardless of organization membership status. &#x60;all&#x60; means all collaborators the authenticated user can see. | [optional] [default to all] [enum: outside, direct, all] |
| **permission** | **String**| Filter collaborators by the permissions they have on the repository. If not specified, all collaborators will be returned. | [optional] [enum: pull, triage, push, maintain, admin] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;Collaborator&gt;**](Collaborator.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |
| **404** | Resource not found |  -  |

<a name="reposListCommentsForCommit"></a>
# **reposListCommentsForCommit**
> List&lt;CommitComment&gt; reposListCommentsForCommit(owner, repo, commitSha, perPage, page)

List commit comments

Use the &#x60;:commit_sha&#x60; to specify the commit that will have its comments listed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String commitSha = "commitSha_example"; // String | The SHA of the commit.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<CommitComment> result = apiInstance.reposListCommentsForCommit(owner, repo, commitSha, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListCommentsForCommit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **commitSha** | **String**| The SHA of the commit. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;CommitComment&gt;**](CommitComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="reposListCommitCommentsForRepo"></a>
# **reposListCommitCommentsForRepo**
> List&lt;CommitComment&gt; reposListCommitCommentsForRepo(owner, repo, perPage, page)

List commit comments for a repository

Commit Comments use [these custom media types](https://docs.github.com/rest/reference/repos#custom-media-types). You can read more about the use of media types in the API [here](https://docs.github.com/rest/overview/media-types/).  Comments are ordered by ascending ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<CommitComment> result = apiInstance.reposListCommitCommentsForRepo(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListCommitCommentsForRepo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;CommitComment&gt;**](CommitComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="reposListCommitStatusesForRef"></a>
# **reposListCommitStatusesForRef**
> List&lt;Status&gt; reposListCommitStatusesForRef(owner, repo, ref, perPage, page)

List commit statuses for a reference

Users with pull access in a repository can view commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name. Statuses are returned in reverse chronological order. The first status in the list will be the latest one.  This resource is also available via a legacy route: &#x60;GET /repos/:owner/:repo/statuses/:ref&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String ref = "ref_example"; // String | ref parameter
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Status> result = apiInstance.reposListCommitStatusesForRef(owner, repo, ref, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListCommitStatusesForRef");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **ref** | **String**| ref parameter | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;Status&gt;**](Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |
| **301** | Moved permanently |  -  |

<a name="reposListCommits"></a>
# **reposListCommits**
> List&lt;Commit&gt; reposListCommits(owner, repo, sha, path, author, committer, since, until, perPage, page)

List commits

**Signature verification object**  The response will include a &#x60;verification&#x60; object that describes the result of verifying the commit&#39;s signature. The following fields are included in the &#x60;verification&#x60; object:  | Name | Type | Description | | ---- | ---- | ----------- | | &#x60;verified&#x60; | &#x60;boolean&#x60; | Indicates whether GitHub considers the signature in this commit to be verified. | | &#x60;reason&#x60; | &#x60;string&#x60; | The reason for verified value. Possible values and their meanings are enumerated in table below. | | &#x60;signature&#x60; | &#x60;string&#x60; | The signature that was extracted from the commit. | | &#x60;payload&#x60; | &#x60;string&#x60; | The value that was signed. |  These are the possible values for &#x60;reason&#x60; in the &#x60;verification&#x60; object:  | Value | Description | | ----- | ----------- | | &#x60;expired_key&#x60; | The key that made the signature is expired. | | &#x60;not_signing_key&#x60; | The \&quot;signing\&quot; flag is not among the usage flags in the GPG key that made the signature. | | &#x60;gpgverify_error&#x60; | There was an error communicating with the signature verification service. | | &#x60;gpgverify_unavailable&#x60; | The signature verification service is currently unavailable. | | &#x60;unsigned&#x60; | The object does not include a signature. | | &#x60;unknown_signature_type&#x60; | A non-PGP signature was found in the commit. | | &#x60;no_user&#x60; | No user was associated with the &#x60;committer&#x60; email address in the commit. | | &#x60;unverified_email&#x60; | The &#x60;committer&#x60; email address in the commit was associated with a user, but the email address is not verified on their account. | | &#x60;bad_email&#x60; | The &#x60;committer&#x60; email address in the commit is not included in the identities of the PGP key that made the signature. | | &#x60;unknown_key&#x60; | The key that made the signature has not been registered with any user&#39;s account. | | &#x60;malformed_signature&#x60; | There was an error parsing the signature. | | &#x60;invalid&#x60; | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | &#x60;valid&#x60; | None of the above errors applied, so the signature is considered to be verified. |

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String sha = "sha_example"; // String | SHA or branch to start listing commits from. Default: the repository’s default branch (usually `main`).
    String path = "path_example"; // String | Only commits containing this file path will be returned.
    String author = "author_example"; // String | GitHub username or email address to use to filter by commit author.
    String committer = "committer_example"; // String | GitHub username or email address to use to filter by commit committer.
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | Only commits before this date will be returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Commit> result = apiInstance.reposListCommits(owner, repo, sha, path, author, committer, since, until, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListCommits");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **sha** | **String**| SHA or branch to start listing commits from. Default: the repository’s default branch (usually &#x60;main&#x60;). | [optional] |
| **path** | **String**| Only commits containing this file path will be returned. | [optional] |
| **author** | **String**| GitHub username or email address to use to filter by commit author. | [optional] |
| **committer** | **String**| GitHub username or email address to use to filter by commit committer. | [optional] |
| **since** | **OffsetDateTime**| Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] |
| **until** | **OffsetDateTime**| Only commits before this date will be returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;Commit&gt;**](Commit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |
| **500** | Internal Error |  -  |
| **400** | Bad Request |  -  |
| **404** | Resource not found |  -  |
| **409** | Conflict |  -  |

<a name="reposListContributors"></a>
# **reposListContributors**
> List&lt;Contributor&gt; reposListContributors(owner, repo, anon, perPage, page)

List repository contributors

Lists contributors to the specified repository and sorts them by the number of commits per contributor in descending order. This endpoint may return information that is a few hours old because the GitHub REST API caches contributor data to improve performance.  GitHub identifies contributors by author email address. This endpoint groups contribution counts by GitHub user, which includes all associated email addresses. To improve performance, only the first 500 author email addresses in the repository link to GitHub users. The rest will appear as anonymous contributors without associated GitHub user information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String anon = "anon_example"; // String | Set to `1` or `true` to include anonymous contributors in results.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Contributor> result = apiInstance.reposListContributors(owner, repo, anon, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListContributors");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **anon** | **String**| Set to &#x60;1&#x60; or &#x60;true&#x60; to include anonymous contributors in results. | [optional] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;Contributor&gt;**](Contributor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | if repository contains content |  * Link -  <br>  |
| **204** | Response if repository is empty |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="reposListCustomDeploymentRuleIntegrations"></a>
# **reposListCustomDeploymentRuleIntegrations**
> ReposListCustomDeploymentRuleIntegrations200Response reposListCustomDeploymentRuleIntegrations(environmentName, repo, owner, page, perPage)

List custom deployment rule integrations available for an environment

Gets all custom deployment protection rule integrations that are available for an environment. Anyone with read access to the repository can use this endpoint. If the repository is private and you want to use a personal access token (classic), you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps and fine-grained personal access tokens must have the &#x60;actions:read&#x60; permission to use this endpoint.  For more information about environments, see \&quot;[Using environments for deployment](https://docs.github.com/en/actions/deployment/targeting-different-environments/using-environments-for-deployment).\&quot;  For more information about the app that is providing this custom deployment rule, see \&quot;[GET an app](https://docs.github.com/rest/apps/apps#get-an-app)\&quot;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String environmentName = "environmentName_example"; // String | The name of the environment.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    try {
      ReposListCustomDeploymentRuleIntegrations200Response result = apiInstance.reposListCustomDeploymentRuleIntegrations(environmentName, repo, owner, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListCustomDeploymentRuleIntegrations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **environmentName** | **String**| The name of the environment. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |

### Return type

[**ReposListCustomDeploymentRuleIntegrations200Response**](ReposListCustomDeploymentRuleIntegrations200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of custom deployment rule integrations available for this environment. |  -  |

<a name="reposListDeployKeys"></a>
# **reposListDeployKeys**
> List&lt;DeployKey&gt; reposListDeployKeys(owner, repo, perPage, page)

List deploy keys



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<DeployKey> result = apiInstance.reposListDeployKeys(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListDeployKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;DeployKey&gt;**](DeployKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="reposListDeploymentBranchPolicies"></a>
# **reposListDeploymentBranchPolicies**
> ReposListDeploymentBranchPolicies200Response reposListDeploymentBranchPolicies(owner, repo, environmentName, perPage, page)

List deployment branch policies

Lists the deployment branch policies for an environment.  Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ReposListDeploymentBranchPolicies200Response result = apiInstance.reposListDeploymentBranchPolicies(owner, repo, environmentName, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListDeploymentBranchPolicies");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **environmentName** | **String**| The name of the environment. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**ReposListDeploymentBranchPolicies200Response**](ReposListDeploymentBranchPolicies200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposListDeploymentStatuses"></a>
# **reposListDeploymentStatuses**
> List&lt;DeploymentStatus&gt; reposListDeploymentStatuses(owner, repo, deploymentId, perPage, page)

List deployment statuses

Users with pull access can view deployment statuses for a deployment:

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer deploymentId = 56; // Integer | deployment_id parameter
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<DeploymentStatus> result = apiInstance.reposListDeploymentStatuses(owner, repo, deploymentId, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListDeploymentStatuses");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **deploymentId** | **Integer**| deployment_id parameter | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;DeploymentStatus&gt;**](DeploymentStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |
| **404** | Resource not found |  -  |

<a name="reposListDeployments"></a>
# **reposListDeployments**
> List&lt;Deployment&gt; reposListDeployments(owner, repo, sha, ref, task, environment, perPage, page)

List deployments

Simple filtering of deployments is available via query parameters:

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String sha = "none"; // String | The SHA recorded at creation time.
    String ref = "none"; // String | The name of the ref. This can be a branch, tag, or SHA.
    String task = "none"; // String | The name of the task for the deployment (e.g., `deploy` or `deploy:migrations`).
    String environment = "none"; // String | The name of the environment that was deployed to (e.g., `staging` or `production`).
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Deployment> result = apiInstance.reposListDeployments(owner, repo, sha, ref, task, environment, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListDeployments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **sha** | **String**| The SHA recorded at creation time. | [optional] [default to none] |
| **ref** | **String**| The name of the ref. This can be a branch, tag, or SHA. | [optional] [default to none] |
| **task** | **String**| The name of the task for the deployment (e.g., &#x60;deploy&#x60; or &#x60;deploy:migrations&#x60;). | [optional] [default to none] |
| **environment** | **String**| The name of the environment that was deployed to (e.g., &#x60;staging&#x60; or &#x60;production&#x60;). | [optional] [default to none] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;Deployment&gt;**](Deployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="reposListForAuthenticatedUser"></a>
# **reposListForAuthenticatedUser**
> List&lt;Repository&gt; reposListForAuthenticatedUser(visibility, affiliation, type, sort, direction, perPage, page, since, before)

List repositories for the authenticated user

Lists repositories that the authenticated user has explicit permission (&#x60;:read&#x60;, &#x60;:write&#x60;, or &#x60;:admin&#x60;) to access.  The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String visibility = "all"; // String | Limit results to repositories with the specified visibility.
    String affiliation = "owner,collaborator,organization_member"; // String | Comma-separated list of values. Can include:    * `owner`: Repositories that are owned by the authenticated user.    * `collaborator`: Repositories that the user has been added to as a collaborator.    * `organization_member`: Repositories that the user has access to through being a member of an organization. This includes every repository on every team that the user is on.
    String type = "all"; // String | Limit results to repositories of the specified type. Will cause a `422` error if used in the same request as **visibility** or **affiliation**.
    String sort = "created"; // String | The property to sort the results by.
    String direction = "asc"; // String | The order to sort by. Default: `asc` when using `full_name`, otherwise `desc`.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Only show repositories updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Only show repositories updated before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    try {
      List<Repository> result = apiInstance.reposListForAuthenticatedUser(visibility, affiliation, type, sort, direction, perPage, page, since, before);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **visibility** | **String**| Limit results to repositories with the specified visibility. | [optional] [default to all] [enum: all, public, private] |
| **affiliation** | **String**| Comma-separated list of values. Can include:    * &#x60;owner&#x60;: Repositories that are owned by the authenticated user.    * &#x60;collaborator&#x60;: Repositories that the user has been added to as a collaborator.    * &#x60;organization_member&#x60;: Repositories that the user has access to through being a member of an organization. This includes every repository on every team that the user is on. | [optional] [default to owner,collaborator,organization_member] |
| **type** | **String**| Limit results to repositories of the specified type. Will cause a &#x60;422&#x60; error if used in the same request as **visibility** or **affiliation**. | [optional] [default to all] [enum: all, owner, public, private, member] |
| **sort** | **String**| The property to sort the results by. | [optional] [default to full_name] [enum: created, updated, pushed, full_name] |
| **direction** | **String**| The order to sort by. Default: &#x60;asc&#x60; when using &#x60;full_name&#x60;, otherwise &#x60;desc&#x60;. | [optional] [enum: asc, desc] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **since** | **OffsetDateTime**| Only show repositories updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] |
| **before** | **OffsetDateTime**| Only show repositories updated before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] |

### Return type

[**List&lt;Repository&gt;**](Repository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **304** | Not modified |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="reposListForOrg"></a>
# **reposListForOrg**
> List&lt;MinimalRepository&gt; reposListForOrg(org, type, sort, direction, perPage, page)

List organization repositories

Lists repositories for the specified organization.  **Note:** In order to see the &#x60;security_and_analysis&#x60; block for a repository you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String type = "all"; // String | Specifies the types of repositories you want returned.
    String sort = "created"; // String | The property to sort the results by.
    String direction = "asc"; // String | The order to sort by. Default: `asc` when using `full_name`, otherwise `desc`.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<MinimalRepository> result = apiInstance.reposListForOrg(org, type, sort, direction, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListForOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **type** | **String**| Specifies the types of repositories you want returned. | [optional] [default to all] [enum: all, public, private, forks, sources, member] |
| **sort** | **String**| The property to sort the results by. | [optional] [default to created] [enum: created, updated, pushed, full_name] |
| **direction** | **String**| The order to sort by. Default: &#x60;asc&#x60; when using &#x60;full_name&#x60;, otherwise &#x60;desc&#x60;. | [optional] [enum: asc, desc] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="reposListForUser"></a>
# **reposListForUser**
> List&lt;MinimalRepository&gt; reposListForUser(username, type, sort, direction, perPage, page)

List repositories for a user

Lists public repositories for the specified user. Note: For GitHub AE, this endpoint will list internal repositories for the specified user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    String type = "all"; // String | Limit results to repositories of the specified type.
    String sort = "created"; // String | The property to sort the results by.
    String direction = "asc"; // String | The order to sort by. Default: `asc` when using `full_name`, otherwise `desc`.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<MinimalRepository> result = apiInstance.reposListForUser(username, type, sort, direction, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListForUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **username** | **String**| The handle for the GitHub user account. | |
| **type** | **String**| Limit results to repositories of the specified type. | [optional] [default to owner] [enum: all, owner, member] |
| **sort** | **String**| The property to sort the results by. | [optional] [default to full_name] [enum: created, updated, pushed, full_name] |
| **direction** | **String**| The order to sort by. Default: &#x60;asc&#x60; when using &#x60;full_name&#x60;, otherwise &#x60;desc&#x60;. | [optional] [enum: asc, desc] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="reposListForks"></a>
# **reposListForks**
> List&lt;MinimalRepository&gt; reposListForks(owner, repo, sort, perPage, page)

List forks



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String sort = "newest"; // String | The sort order. `stargazers` will sort by star count.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<MinimalRepository> result = apiInstance.reposListForks(owner, repo, sort, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListForks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **sort** | **String**| The sort order. &#x60;stargazers&#x60; will sort by star count. | [optional] [default to newest] [enum: newest, oldest, stargazers, watchers] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |
| **400** | Bad Request |  -  |

<a name="reposListInvitations"></a>
# **reposListInvitations**
> List&lt;RepositoryInvitation&gt; reposListInvitations(owner, repo, perPage, page)

List repository invitations

When authenticating as a user with admin rights to a repository, this endpoint will list all currently open repository invitations.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<RepositoryInvitation> result = apiInstance.reposListInvitations(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListInvitations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;RepositoryInvitation&gt;**](RepositoryInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="reposListInvitationsForAuthenticatedUser"></a>
# **reposListInvitationsForAuthenticatedUser**
> List&lt;RepositoryInvitation&gt; reposListInvitationsForAuthenticatedUser(perPage, page)

List repository invitations for the authenticated user

When authenticating as a user, this endpoint will list all currently open repository invitations for that user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<RepositoryInvitation> result = apiInstance.reposListInvitationsForAuthenticatedUser(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListInvitationsForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;RepositoryInvitation&gt;**](RepositoryInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |
| **304** | Not modified |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="reposListLanguages"></a>
# **reposListLanguages**
> Map&lt;String, Integer&gt; reposListLanguages(owner, repo)

List repository languages

Lists languages for the specified repository. The value shown for each language is the number of bytes of code written in that language.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      Map<String, Integer> result = apiInstance.reposListLanguages(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListLanguages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

**Map&lt;String, Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposListPagesBuilds"></a>
# **reposListPagesBuilds**
> List&lt;PageBuild&gt; reposListPagesBuilds(owner, repo, perPage, page)

List GitHub Pages builds



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<PageBuild> result = apiInstance.reposListPagesBuilds(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListPagesBuilds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;PageBuild&gt;**](PageBuild.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="reposListPublic"></a>
# **reposListPublic**
> List&lt;MinimalRepository&gt; reposListPublic(since)

List public repositories

Lists all public repositories in the order that they were created.  Note: - For GitHub Enterprise Server, this endpoint will only list repositories available to all users on the enterprise. - Pagination is powered exclusively by the &#x60;since&#x60; parameter. Use the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers) to get the URL for the next page of repositories.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    Integer since = 56; // Integer | A repository ID. Only return repositories with an ID greater than this ID.
    try {
      List<MinimalRepository> result = apiInstance.reposListPublic(since);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListPublic");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **since** | **Integer**| A repository ID. Only return repositories with an ID greater than this ID. | [optional] |

### Return type

[**List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **304** | Not modified |  -  |

<a name="reposListPullRequestsAssociatedWithCommit"></a>
# **reposListPullRequestsAssociatedWithCommit**
> List&lt;PullRequestSimple&gt; reposListPullRequestsAssociatedWithCommit(owner, repo, commitSha, perPage, page)

List pull requests associated with a commit

Lists the merged pull request that introduced the commit to the repository. If the commit is not present in the default branch, will only return open pull requests associated with the commit.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String commitSha = "commitSha_example"; // String | The SHA of the commit.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<PullRequestSimple> result = apiInstance.reposListPullRequestsAssociatedWithCommit(owner, repo, commitSha, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListPullRequestsAssociatedWithCommit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **commitSha** | **String**| The SHA of the commit. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;PullRequestSimple&gt;**](PullRequestSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="reposListReleaseAssets"></a>
# **reposListReleaseAssets**
> List&lt;ReleaseAsset&gt; reposListReleaseAssets(owner, repo, releaseId, perPage, page)

List release assets



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer releaseId = 56; // Integer | The unique identifier of the release.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<ReleaseAsset> result = apiInstance.reposListReleaseAssets(owner, repo, releaseId, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListReleaseAssets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **releaseId** | **Integer**| The unique identifier of the release. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;ReleaseAsset&gt;**](ReleaseAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="reposListReleases"></a>
# **reposListReleases**
> List&lt;Release&gt; reposListReleases(owner, repo, perPage, page)

List releases

This returns a list of releases, which does not include regular Git tags that have not been associated with a release. To get a list of Git tags, use the [Repository Tags API](https://docs.github.com/rest/reference/repos#list-repository-tags).  Information about published releases are available to everyone. Only users with push access will receive listings for draft releases.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Release> result = apiInstance.reposListReleases(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListReleases");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;Release&gt;**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |
| **404** | Resource not found |  -  |

<a name="reposListTagProtection"></a>
# **reposListTagProtection**
> List&lt;TagProtection&gt; reposListTagProtection(owner, repo)

List tag protection states for a repository

This returns the tag protection states of a repository.  This information is only available to repository administrators.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      List<TagProtection> result = apiInstance.reposListTagProtection(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListTagProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**List&lt;TagProtection&gt;**](TagProtection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="reposListTags"></a>
# **reposListTags**
> List&lt;Tag&gt; reposListTags(owner, repo, perPage, page)

List repository tags



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Tag> result = apiInstance.reposListTags(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListTags");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;Tag&gt;**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="reposListTeams"></a>
# **reposListTeams**
> List&lt;Team&gt; reposListTeams(owner, repo, perPage, page)

List repository teams



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Team> result = apiInstance.reposListTeams(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListTeams");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="reposListWebhookDeliveries"></a>
# **reposListWebhookDeliveries**
> List&lt;HookDeliveryItem&gt; reposListWebhookDeliveries(owner, repo, hookId, perPage, cursor, redelivery)

List deliveries for a repository webhook

Returns a list of webhook deliveries for a webhook configured in a repository.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    String cursor = "cursor_example"; // String | Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the `link` header for the next and previous page cursors.
    Boolean redelivery = true; // Boolean | 
    try {
      List<HookDeliveryItem> result = apiInstance.reposListWebhookDeliveries(owner, repo, hookId, perPage, cursor, redelivery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListWebhookDeliveries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **hookId** | **Integer**| The unique identifier of the hook. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **cursor** | **String**| Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the &#x60;link&#x60; header for the next and previous page cursors. | [optional] |
| **redelivery** | **Boolean**|  | [optional] |

### Return type

[**List&lt;HookDeliveryItem&gt;**](HookDeliveryItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **400** | Bad Request |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposListWebhooks"></a>
# **reposListWebhooks**
> List&lt;Hook&gt; reposListWebhooks(owner, repo, perPage, page)

List repository webhooks

Lists webhooks for a repository. &#x60;last response&#x60; may return null if there have not been any deliveries within 30 days.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      List<Hook> result = apiInstance.reposListWebhooks(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposListWebhooks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**List&lt;Hook&gt;**](Hook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |
| **404** | Resource not found |  -  |

<a name="reposMerge"></a>
# **reposMerge**
> Commit reposMerge(owner, repo, reposMergeRequest)

Merge a branch



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposMergeRequest reposMergeRequest = new ReposMergeRequest(); // ReposMergeRequest | 
    try {
      Commit result = apiInstance.reposMerge(owner, repo, reposMergeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposMerge");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposMergeRequest** | [**ReposMergeRequest**](ReposMergeRequest.md)|  | |

### Return type

[**Commit**](Commit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response (The resulting merge commit) |  -  |
| **204** | Response when already merged |  -  |
| **404** | Not Found when the base or head does not exist |  -  |
| **409** | Conflict when there is a merge conflict |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposMergeUpstream"></a>
# **reposMergeUpstream**
> MergedUpstream reposMergeUpstream(owner, repo, reposMergeUpstreamRequest)

Sync a fork branch with the upstream repository

Sync a branch of a forked repository to keep it up-to-date with the upstream repository.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposMergeUpstreamRequest reposMergeUpstreamRequest = new ReposMergeUpstreamRequest(); // ReposMergeUpstreamRequest | 
    try {
      MergedUpstream result = apiInstance.reposMergeUpstream(owner, repo, reposMergeUpstreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposMergeUpstream");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposMergeUpstreamRequest** | [**ReposMergeUpstreamRequest**](ReposMergeUpstreamRequest.md)|  | |

### Return type

[**MergedUpstream**](MergedUpstream.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The branch has been successfully synced with the upstream repository |  -  |
| **409** | The branch could not be synced because of a merge conflict |  -  |
| **422** | The branch could not be synced for some other reason |  -  |

<a name="reposPingWebhook"></a>
# **reposPingWebhook**
> reposPingWebhook(owner, repo, hookId)

Ping a repository webhook

This will trigger a [ping event](https://docs.github.com/webhooks/#ping-event) to be sent to the hook.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    try {
      apiInstance.reposPingWebhook(owner, repo, hookId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposPingWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **hookId** | **Integer**| The unique identifier of the hook. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposRedeliverWebhookDelivery"></a>
# **reposRedeliverWebhookDelivery**
> Object reposRedeliverWebhookDelivery(owner, repo, hookId, deliveryId)

Redeliver a delivery for a repository webhook

Redeliver a webhook delivery for a webhook configured in a repository.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    Integer deliveryId = 56; // Integer | 
    try {
      Object result = apiInstance.reposRedeliverWebhookDelivery(owner, repo, hookId, deliveryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposRedeliverWebhookDelivery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **hookId** | **Integer**| The unique identifier of the hook. | |
| **deliveryId** | **Integer**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposRemoveAppAccessRestrictions"></a>
# **reposRemoveAppAccessRestrictions**
> List&lt;Integration&gt; reposRemoveAppAccessRestrictions(owner, repo, branch, reposSetAppAccessRestrictionsRequest)

Remove app access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Removes the ability of an app to push to this branch. Only installed GitHub Apps with &#x60;write&#x60; access to the &#x60;contents&#x60; permission can be added as authorized actors on a protected branch.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    ReposSetAppAccessRestrictionsRequest reposSetAppAccessRestrictionsRequest = new ReposSetAppAccessRestrictionsRequest(); // ReposSetAppAccessRestrictionsRequest | 
    try {
      List<Integration> result = apiInstance.reposRemoveAppAccessRestrictions(owner, repo, branch, reposSetAppAccessRestrictionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposRemoveAppAccessRestrictions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |
| **reposSetAppAccessRestrictionsRequest** | [**ReposSetAppAccessRestrictionsRequest**](ReposSetAppAccessRestrictionsRequest.md)|  | [optional] |

### Return type

[**List&lt;Integration&gt;**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposRemoveCollaborator"></a>
# **reposRemoveCollaborator**
> reposRemoveCollaborator(owner, repo, username)

Remove a repository collaborator



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.reposRemoveCollaborator(owner, repo, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposRemoveCollaborator");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **username** | **String**| The handle for the GitHub user account. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="reposRemoveStatusCheckContexts"></a>
# **reposRemoveStatusCheckContexts**
> List&lt;String&gt; reposRemoveStatusCheckContexts(owner, repo, branch, reposSetStatusCheckContextsRequest)

Remove status check contexts

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    ReposSetStatusCheckContextsRequest reposSetStatusCheckContextsRequest = new ReposSetStatusCheckContextsRequest(); // ReposSetStatusCheckContextsRequest | 
    try {
      List<String> result = apiInstance.reposRemoveStatusCheckContexts(owner, repo, branch, reposSetStatusCheckContextsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposRemoveStatusCheckContexts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |
| **reposSetStatusCheckContextsRequest** | [**ReposSetStatusCheckContextsRequest**](ReposSetStatusCheckContextsRequest.md)|  | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposRemoveStatusCheckProtection"></a>
# **reposRemoveStatusCheckProtection**
> reposRemoveStatusCheckProtection(owner, repo, branch)

Remove status check protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      apiInstance.reposRemoveStatusCheckProtection(owner, repo, branch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposRemoveStatusCheckProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="reposRemoveTeamAccessRestrictions"></a>
# **reposRemoveTeamAccessRestrictions**
> List&lt;Team&gt; reposRemoveTeamAccessRestrictions(owner, repo, branch, reposAddTeamAccessRestrictionsRequest)

Remove team access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Removes the ability of a team to push to this branch. You can also remove push access for child teams.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    ReposAddTeamAccessRestrictionsRequest reposAddTeamAccessRestrictionsRequest = new ReposAddTeamAccessRestrictionsRequest(); // ReposAddTeamAccessRestrictionsRequest | 
    try {
      List<Team> result = apiInstance.reposRemoveTeamAccessRestrictions(owner, repo, branch, reposAddTeamAccessRestrictionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposRemoveTeamAccessRestrictions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |
| **reposAddTeamAccessRestrictionsRequest** | [**ReposAddTeamAccessRestrictionsRequest**](ReposAddTeamAccessRestrictionsRequest.md)|  | [optional] |

### Return type

[**List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposRemoveUserAccessRestrictions"></a>
# **reposRemoveUserAccessRestrictions**
> List&lt;SimpleUser&gt; reposRemoveUserAccessRestrictions(owner, repo, branch, reposSetUserAccessRestrictionsRequest)

Remove user access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Removes the ability of a user to push to this branch.  | Type    | Description                                                                                                                                   | | ------- | --------------------------------------------------------------------------------------------------------------------------------------------- | | &#x60;array&#x60; | Usernames of the people who should no longer have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    ReposSetUserAccessRestrictionsRequest reposSetUserAccessRestrictionsRequest = new ReposSetUserAccessRestrictionsRequest(); // ReposSetUserAccessRestrictionsRequest | 
    try {
      List<SimpleUser> result = apiInstance.reposRemoveUserAccessRestrictions(owner, repo, branch, reposSetUserAccessRestrictionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposRemoveUserAccessRestrictions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |
| **reposSetUserAccessRestrictionsRequest** | [**ReposSetUserAccessRestrictionsRequest**](ReposSetUserAccessRestrictionsRequest.md)|  | [optional] |

### Return type

[**List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposRenameBranch"></a>
# **reposRenameBranch**
> BranchWithProtection reposRenameBranch(owner, repo, branch, reposRenameBranchRequest)

Rename a branch

Renames a branch in a repository.  **Note:** Although the API responds immediately, the branch rename process might take some extra time to complete in the background. You won&#39;t be able to push to the old branch name while the rename process is in progress. For more information, see \&quot;[Renaming a branch](https://docs.github.com/github/administering-a-repository/renaming-a-branch)\&quot;.  The permissions required to use this endpoint depends on whether you are renaming the default branch.  To rename a non-default branch:  * Users must have push access. * GitHub Apps must have the &#x60;contents:write&#x60; repository permission.  To rename the default branch:  * Users must have admin or owner permissions. * GitHub Apps must have the &#x60;administration:write&#x60; repository permission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    ReposRenameBranchRequest reposRenameBranchRequest = new ReposRenameBranchRequest(); // ReposRenameBranchRequest | 
    try {
      BranchWithProtection result = apiInstance.reposRenameBranch(owner, repo, branch, reposRenameBranchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposRenameBranch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |
| **reposRenameBranchRequest** | [**ReposRenameBranchRequest**](ReposRenameBranchRequest.md)|  | |

### Return type

[**BranchWithProtection**](BranchWithProtection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposReplaceAllTopics"></a>
# **reposReplaceAllTopics**
> Topic reposReplaceAllTopics(owner, repo, reposReplaceAllTopicsRequest)

Replace all repository topics



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposReplaceAllTopicsRequest reposReplaceAllTopicsRequest = new ReposReplaceAllTopicsRequest(); // ReposReplaceAllTopicsRequest | 
    try {
      Topic result = apiInstance.reposReplaceAllTopics(owner, repo, reposReplaceAllTopicsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposReplaceAllTopics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposReplaceAllTopicsRequest** | [**ReposReplaceAllTopicsRequest**](ReposReplaceAllTopicsRequest.md)|  | |

### Return type

[**Topic**](Topic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposRequestPagesBuild"></a>
# **reposRequestPagesBuild**
> PageBuildStatus reposRequestPagesBuild(owner, repo)

Request a GitHub Pages build

You can request that your site be built from the latest revision on the default branch. This has the same effect as pushing a commit to your default branch, but does not require an additional commit. Manually triggering page builds can be helpful when diagnosing build warnings and failures.  Build requests are limited to one concurrent build per repository and one concurrent build per requester. If you request a build while another is still in progress, the second request will be queued until the first completes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      PageBuildStatus result = apiInstance.reposRequestPagesBuild(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposRequestPagesBuild");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |

### Return type

[**PageBuildStatus**](PageBuildStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |

<a name="reposSetAdminBranchProtection"></a>
# **reposSetAdminBranchProtection**
> ProtectedBranchAdminEnforced reposSetAdminBranchProtection(owner, repo, branch)

Set admin branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Adding admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    try {
      ProtectedBranchAdminEnforced result = apiInstance.reposSetAdminBranchProtection(owner, repo, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposSetAdminBranchProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |

### Return type

[**ProtectedBranchAdminEnforced**](ProtectedBranchAdminEnforced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposSetAppAccessRestrictions"></a>
# **reposSetAppAccessRestrictions**
> List&lt;Integration&gt; reposSetAppAccessRestrictions(owner, repo, branch, reposSetAppAccessRestrictionsRequest)

Set app access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Replaces the list of apps that have push access to this branch. This removes all apps that previously had push access and grants push access to the new list of apps. Only installed GitHub Apps with &#x60;write&#x60; access to the &#x60;contents&#x60; permission can be added as authorized actors on a protected branch.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    ReposSetAppAccessRestrictionsRequest reposSetAppAccessRestrictionsRequest = new ReposSetAppAccessRestrictionsRequest(); // ReposSetAppAccessRestrictionsRequest | 
    try {
      List<Integration> result = apiInstance.reposSetAppAccessRestrictions(owner, repo, branch, reposSetAppAccessRestrictionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposSetAppAccessRestrictions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |
| **reposSetAppAccessRestrictionsRequest** | [**ReposSetAppAccessRestrictionsRequest**](ReposSetAppAccessRestrictionsRequest.md)|  | [optional] |

### Return type

[**List&lt;Integration&gt;**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposSetStatusCheckContexts"></a>
# **reposSetStatusCheckContexts**
> List&lt;String&gt; reposSetStatusCheckContexts(owner, repo, branch, reposSetStatusCheckContextsRequest)

Set status check contexts

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    ReposSetStatusCheckContextsRequest reposSetStatusCheckContextsRequest = new ReposSetStatusCheckContextsRequest(); // ReposSetStatusCheckContextsRequest | 
    try {
      List<String> result = apiInstance.reposSetStatusCheckContexts(owner, repo, branch, reposSetStatusCheckContextsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposSetStatusCheckContexts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |
| **reposSetStatusCheckContextsRequest** | [**ReposSetStatusCheckContextsRequest**](ReposSetStatusCheckContextsRequest.md)|  | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **404** | Resource not found |  -  |

<a name="reposSetTeamAccessRestrictions"></a>
# **reposSetTeamAccessRestrictions**
> List&lt;Team&gt; reposSetTeamAccessRestrictions(owner, repo, branch, reposSetTeamAccessRestrictionsRequest)

Set team access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Replaces the list of teams that have push access to this branch. This removes all teams that previously had push access and grants push access to the new list of teams. Team restrictions include child teams.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    ReposSetTeamAccessRestrictionsRequest reposSetTeamAccessRestrictionsRequest = new ReposSetTeamAccessRestrictionsRequest(); // ReposSetTeamAccessRestrictionsRequest | 
    try {
      List<Team> result = apiInstance.reposSetTeamAccessRestrictions(owner, repo, branch, reposSetTeamAccessRestrictionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposSetTeamAccessRestrictions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |
| **reposSetTeamAccessRestrictionsRequest** | [**ReposSetTeamAccessRestrictionsRequest**](ReposSetTeamAccessRestrictionsRequest.md)|  | [optional] |

### Return type

[**List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposSetUserAccessRestrictions"></a>
# **reposSetUserAccessRestrictions**
> List&lt;SimpleUser&gt; reposSetUserAccessRestrictions(owner, repo, branch, reposSetUserAccessRestrictionsRequest)

Set user access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Replaces the list of people that have push access to this branch. This removes all people that previously had push access and grants push access to the new list of people.  | Type    | Description                                                                                                                   | | ------- | ----------------------------------------------------------------------------------------------------------------------------- | | &#x60;array&#x60; | Usernames for people who can have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    ReposSetUserAccessRestrictionsRequest reposSetUserAccessRestrictionsRequest = new ReposSetUserAccessRestrictionsRequest(); // ReposSetUserAccessRestrictionsRequest | 
    try {
      List<SimpleUser> result = apiInstance.reposSetUserAccessRestrictions(owner, repo, branch, reposSetUserAccessRestrictionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposSetUserAccessRestrictions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |
| **reposSetUserAccessRestrictionsRequest** | [**ReposSetUserAccessRestrictionsRequest**](ReposSetUserAccessRestrictionsRequest.md)|  | [optional] |

### Return type

[**List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposTestPushWebhook"></a>
# **reposTestPushWebhook**
> reposTestPushWebhook(owner, repo, hookId)

Test the push repository webhook

This will trigger the hook with the latest push to the current repository if the hook is subscribed to &#x60;push&#x60; events. If the hook is not subscribed to &#x60;push&#x60; events, the server will respond with 204 but no test POST will be generated.  **Note**: Previously &#x60;/repos/:owner/:repo/hooks/:hook_id/test&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    try {
      apiInstance.reposTestPushWebhook(owner, repo, hookId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposTestPushWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **hookId** | **Integer**| The unique identifier of the hook. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposTransfer"></a>
# **reposTransfer**
> MinimalRepository reposTransfer(owner, repo, reposTransferRequest)

Transfer a repository

A transfer request will need to be accepted by the new owner when transferring a personal repository to another user. The response will contain the original &#x60;owner&#x60;, and the transfer will continue asynchronously. For more details on the requirements to transfer personal and organization-owned repositories, see [about repository transfers](https://docs.github.com/articles/about-repository-transfers/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposTransferRequest reposTransferRequest = new ReposTransferRequest(); // ReposTransferRequest | 
    try {
      MinimalRepository result = apiInstance.reposTransfer(owner, repo, reposTransferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposTransfer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposTransferRequest** | [**ReposTransferRequest**](ReposTransferRequest.md)|  | |

### Return type

[**MinimalRepository**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Response |  -  |

<a name="reposUpdate"></a>
# **reposUpdate**
> FullRepository reposUpdate(owner, repo, reposUpdateRequest)

Update a repository

**Note**: To edit a repository&#39;s topics, use the [Replace all repository topics](https://docs.github.com/rest/reference/repos#replace-all-repository-topics) endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposUpdateRequest reposUpdateRequest = new ReposUpdateRequest(); // ReposUpdateRequest | 
    try {
      FullRepository result = apiInstance.reposUpdate(owner, repo, reposUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposUpdateRequest** | [**ReposUpdateRequest**](ReposUpdateRequest.md)|  | [optional] |

### Return type

[**FullRepository**](FullRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **307** | Temporary Redirect |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **404** | Resource not found |  -  |

<a name="reposUpdateBranchProtection"></a>
# **reposUpdateBranchProtection**
> ProtectedBranch reposUpdateBranchProtection(owner, repo, branch, reposUpdateBranchProtectionRequest)

Update branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Protecting a branch requires admin or owner permissions to the repository.  **Note**: Passing new arrays of &#x60;users&#x60; and &#x60;teams&#x60; replaces their previous values.  **Note**: The list of users, apps, and teams in total is limited to 100 items.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    ReposUpdateBranchProtectionRequest reposUpdateBranchProtectionRequest = new ReposUpdateBranchProtectionRequest(); // ReposUpdateBranchProtectionRequest | 
    try {
      ProtectedBranch result = apiInstance.reposUpdateBranchProtection(owner, repo, branch, reposUpdateBranchProtectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpdateBranchProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |
| **reposUpdateBranchProtectionRequest** | [**ReposUpdateBranchProtectionRequest**](ReposUpdateBranchProtectionRequest.md)|  | |

### Return type

[**ProtectedBranch**](ProtectedBranch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **404** | Resource not found |  -  |

<a name="reposUpdateCommitComment"></a>
# **reposUpdateCommitComment**
> CommitComment reposUpdateCommitComment(owner, repo, commentId, reposUpdateCommitCommentRequest)

Update a commit comment



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer commentId = 56; // Integer | The unique identifier of the comment.
    ReposUpdateCommitCommentRequest reposUpdateCommitCommentRequest = new ReposUpdateCommitCommentRequest(); // ReposUpdateCommitCommentRequest | 
    try {
      CommitComment result = apiInstance.reposUpdateCommitComment(owner, repo, commentId, reposUpdateCommitCommentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpdateCommitComment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **commentId** | **Integer**| The unique identifier of the comment. | |
| **reposUpdateCommitCommentRequest** | [**ReposUpdateCommitCommentRequest**](ReposUpdateCommitCommentRequest.md)|  | |

### Return type

[**CommitComment**](CommitComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="reposUpdateDeploymentBranchPolicy"></a>
# **reposUpdateDeploymentBranchPolicy**
> DeploymentBranchPolicy reposUpdateDeploymentBranchPolicy(owner, repo, environmentName, branchPolicyId, deploymentBranchPolicyNamePattern)

Update a deployment branch policy

Updates a deployment branch policy for an environment.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration:write&#x60; permission for the repository to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    Integer branchPolicyId = 56; // Integer | The unique identifier of the branch policy.
    DeploymentBranchPolicyNamePattern deploymentBranchPolicyNamePattern = new DeploymentBranchPolicyNamePattern(); // DeploymentBranchPolicyNamePattern | 
    try {
      DeploymentBranchPolicy result = apiInstance.reposUpdateDeploymentBranchPolicy(owner, repo, environmentName, branchPolicyId, deploymentBranchPolicyNamePattern);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpdateDeploymentBranchPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **environmentName** | **String**| The name of the environment. | |
| **branchPolicyId** | **Integer**| The unique identifier of the branch policy. | |
| **deploymentBranchPolicyNamePattern** | [**DeploymentBranchPolicyNamePattern**](DeploymentBranchPolicyNamePattern.md)|  | |

### Return type

[**DeploymentBranchPolicy**](DeploymentBranchPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposUpdateInformationAboutPagesSite"></a>
# **reposUpdateInformationAboutPagesSite**
> reposUpdateInformationAboutPagesSite(owner, repo, reposUpdateInformationAboutPagesSiteRequest)

Update information about a GitHub Pages site

Updates information for a GitHub Pages site. For more information, see \&quot;[About GitHub Pages](/github/working-with-github-pages/about-github-pages).  To use this endpoint, you must be a repository administrator, maintainer, or have the &#39;manage GitHub Pages settings&#39; permission. A token with the &#x60;repo&#x60; scope or Pages write permission is required. GitHub Apps must have the &#x60;administration:write&#x60; and &#x60;pages:write&#x60; permissions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ReposUpdateInformationAboutPagesSiteRequest reposUpdateInformationAboutPagesSiteRequest = new ReposUpdateInformationAboutPagesSiteRequest(); // ReposUpdateInformationAboutPagesSiteRequest | 
    try {
      apiInstance.reposUpdateInformationAboutPagesSite(owner, repo, reposUpdateInformationAboutPagesSiteRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpdateInformationAboutPagesSite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **reposUpdateInformationAboutPagesSiteRequest** | [**ReposUpdateInformationAboutPagesSiteRequest**](ReposUpdateInformationAboutPagesSiteRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **400** | Bad Request |  -  |
| **409** | Conflict |  -  |

<a name="reposUpdateInvitation"></a>
# **reposUpdateInvitation**
> RepositoryInvitation reposUpdateInvitation(owner, repo, invitationId, reposUpdateInvitationRequest)

Update a repository invitation



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer invitationId = 56; // Integer | The unique identifier of the invitation.
    ReposUpdateInvitationRequest reposUpdateInvitationRequest = new ReposUpdateInvitationRequest(); // ReposUpdateInvitationRequest | 
    try {
      RepositoryInvitation result = apiInstance.reposUpdateInvitation(owner, repo, invitationId, reposUpdateInvitationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpdateInvitation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **invitationId** | **Integer**| The unique identifier of the invitation. | |
| **reposUpdateInvitationRequest** | [**ReposUpdateInvitationRequest**](ReposUpdateInvitationRequest.md)|  | [optional] |

### Return type

[**RepositoryInvitation**](RepositoryInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposUpdateOrgRuleset"></a>
# **reposUpdateOrgRuleset**
> RepositoryRuleset reposUpdateOrgRuleset(org, rulesetId, reposUpdateOrgRulesetRequest)

Update an organization repository ruleset

Update a ruleset for an organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer rulesetId = 56; // Integer | The ID of the ruleset.
    ReposUpdateOrgRulesetRequest reposUpdateOrgRulesetRequest = new ReposUpdateOrgRulesetRequest(); // ReposUpdateOrgRulesetRequest | Request body
    try {
      RepositoryRuleset result = apiInstance.reposUpdateOrgRuleset(org, rulesetId, reposUpdateOrgRulesetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpdateOrgRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **rulesetId** | **Integer**| The ID of the ruleset. | |
| **reposUpdateOrgRulesetRequest** | [**ReposUpdateOrgRulesetRequest**](ReposUpdateOrgRulesetRequest.md)| Request body | [optional] |

### Return type

[**RepositoryRuleset**](RepositoryRuleset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Error |  -  |

<a name="reposUpdatePullRequestReviewProtection"></a>
# **reposUpdatePullRequestReviewProtection**
> ProtectedBranchPullRequestReview reposUpdatePullRequestReviewProtection(owner, repo, branch, reposUpdatePullRequestReviewProtectionRequest)

Update pull request review protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Updating pull request review enforcement requires admin or owner permissions to the repository and branch protection to be enabled.  **Note**: Passing new arrays of &#x60;users&#x60; and &#x60;teams&#x60; replaces their previous values.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    ReposUpdatePullRequestReviewProtectionRequest reposUpdatePullRequestReviewProtectionRequest = new ReposUpdatePullRequestReviewProtectionRequest(); // ReposUpdatePullRequestReviewProtectionRequest | 
    try {
      ProtectedBranchPullRequestReview result = apiInstance.reposUpdatePullRequestReviewProtection(owner, repo, branch, reposUpdatePullRequestReviewProtectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpdatePullRequestReviewProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |
| **reposUpdatePullRequestReviewProtectionRequest** | [**ReposUpdatePullRequestReviewProtectionRequest**](ReposUpdatePullRequestReviewProtectionRequest.md)|  | [optional] |

### Return type

[**ProtectedBranchPullRequestReview**](ProtectedBranchPullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposUpdateRelease"></a>
# **reposUpdateRelease**
> Release reposUpdateRelease(owner, repo, releaseId, reposUpdateReleaseRequest)

Update a release

Users with push access to the repository can edit a release.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer releaseId = 56; // Integer | The unique identifier of the release.
    ReposUpdateReleaseRequest reposUpdateReleaseRequest = new ReposUpdateReleaseRequest(); // ReposUpdateReleaseRequest | 
    try {
      Release result = apiInstance.reposUpdateRelease(owner, repo, releaseId, reposUpdateReleaseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpdateRelease");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **releaseId** | **Integer**| The unique identifier of the release. | |
| **reposUpdateReleaseRequest** | [**ReposUpdateReleaseRequest**](ReposUpdateReleaseRequest.md)|  | [optional] |

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Not Found if the discussion category name is invalid |  -  |

<a name="reposUpdateReleaseAsset"></a>
# **reposUpdateReleaseAsset**
> ReleaseAsset reposUpdateReleaseAsset(owner, repo, assetId, reposUpdateReleaseAssetRequest)

Update a release asset

Users with push access to the repository can edit a release asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer assetId = 56; // Integer | The unique identifier of the asset.
    ReposUpdateReleaseAssetRequest reposUpdateReleaseAssetRequest = new ReposUpdateReleaseAssetRequest(); // ReposUpdateReleaseAssetRequest | 
    try {
      ReleaseAsset result = apiInstance.reposUpdateReleaseAsset(owner, repo, assetId, reposUpdateReleaseAssetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpdateReleaseAsset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **assetId** | **Integer**| The unique identifier of the asset. | |
| **reposUpdateReleaseAssetRequest** | [**ReposUpdateReleaseAssetRequest**](ReposUpdateReleaseAssetRequest.md)|  | [optional] |

### Return type

[**ReleaseAsset**](ReleaseAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposUpdateRepoRuleset"></a>
# **reposUpdateRepoRuleset**
> RepositoryRuleset reposUpdateRepoRuleset(owner, repo, rulesetId, reposUpdateRepoRulesetRequest)

Update a repository ruleset

Update a ruleset for a repository.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer rulesetId = 56; // Integer | The ID of the ruleset.
    ReposUpdateRepoRulesetRequest reposUpdateRepoRulesetRequest = new ReposUpdateRepoRulesetRequest(); // ReposUpdateRepoRulesetRequest | Request body
    try {
      RepositoryRuleset result = apiInstance.reposUpdateRepoRuleset(owner, repo, rulesetId, reposUpdateRepoRulesetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpdateRepoRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **rulesetId** | **Integer**| The ID of the ruleset. | |
| **reposUpdateRepoRulesetRequest** | [**ReposUpdateRepoRulesetRequest**](ReposUpdateRepoRulesetRequest.md)| Request body | [optional] |

### Return type

[**RepositoryRuleset**](RepositoryRuleset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Error |  -  |

<a name="reposUpdateStatusCheckProtection"></a>
# **reposUpdateStatusCheckProtection**
> StatusCheckPolicy reposUpdateStatusCheckProtection(owner, repo, branch, reposUpdateStatusCheckProtectionRequest)

Update status check protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Updating required status checks requires admin or owner permissions to the repository and branch protection to be enabled.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String branch = "branch_example"; // String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
    ReposUpdateStatusCheckProtectionRequest reposUpdateStatusCheckProtectionRequest = new ReposUpdateStatusCheckProtectionRequest(); // ReposUpdateStatusCheckProtectionRequest | 
    try {
      StatusCheckPolicy result = apiInstance.reposUpdateStatusCheckProtection(owner, repo, branch, reposUpdateStatusCheckProtectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpdateStatusCheckProtection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **branch** | **String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). | |
| **reposUpdateStatusCheckProtectionRequest** | [**ReposUpdateStatusCheckProtectionRequest**](ReposUpdateStatusCheckProtectionRequest.md)|  | [optional] |

### Return type

[**StatusCheckPolicy**](StatusCheckPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="reposUpdateWebhook"></a>
# **reposUpdateWebhook**
> Hook reposUpdateWebhook(owner, repo, hookId, reposUpdateWebhookRequest)

Update a repository webhook

Updates a webhook configured in a repository. If you previously had a &#x60;secret&#x60; set, you must provide the same &#x60;secret&#x60; or set a new &#x60;secret&#x60; or the secret will be removed. If you are only updating individual webhook &#x60;config&#x60; properties, use \&quot;[Update a webhook configuration for a repository](/rest/reference/repos#update-a-webhook-configuration-for-a-repository).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    ReposUpdateWebhookRequest reposUpdateWebhookRequest = new ReposUpdateWebhookRequest(); // ReposUpdateWebhookRequest | 
    try {
      Hook result = apiInstance.reposUpdateWebhook(owner, repo, hookId, reposUpdateWebhookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpdateWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **hookId** | **Integer**| The unique identifier of the hook. | |
| **reposUpdateWebhookRequest** | [**ReposUpdateWebhookRequest**](ReposUpdateWebhookRequest.md)|  | |

### Return type

[**Hook**](Hook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **404** | Resource not found |  -  |

<a name="reposUpdateWebhookConfigForRepo"></a>
# **reposUpdateWebhookConfigForRepo**
> WebhookConfig reposUpdateWebhookConfigForRepo(owner, repo, hookId, reposUpdateWebhookConfigForRepoRequest)

Update a webhook configuration for a repository

Updates the webhook configuration for a repository. To update more information about the webhook, including the &#x60;active&#x60; state and &#x60;events&#x60;, use \&quot;[Update a repository webhook](/rest/reference/orgs#update-a-repository-webhook).\&quot;  Access tokens must have the &#x60;write:repo_hook&#x60; or &#x60;repo&#x60; scope, and GitHub Apps must have the &#x60;repository_hooks:write&#x60; permission.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer hookId = 56; // Integer | The unique identifier of the hook.
    ReposUpdateWebhookConfigForRepoRequest reposUpdateWebhookConfigForRepoRequest = new ReposUpdateWebhookConfigForRepoRequest(); // ReposUpdateWebhookConfigForRepoRequest | 
    try {
      WebhookConfig result = apiInstance.reposUpdateWebhookConfigForRepo(owner, repo, hookId, reposUpdateWebhookConfigForRepoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUpdateWebhookConfigForRepo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **hookId** | **Integer**| The unique identifier of the hook. | |
| **reposUpdateWebhookConfigForRepoRequest** | [**ReposUpdateWebhookConfigForRepoRequest**](ReposUpdateWebhookConfigForRepoRequest.md)|  | [optional] |

### Return type

[**WebhookConfig**](WebhookConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="reposUploadReleaseAsset"></a>
# **reposUploadReleaseAsset**
> ReleaseAsset reposUploadReleaseAsset(owner, repo, releaseId, name, label, body)

Upload a release asset

This endpoint makes use of [a Hypermedia relation](https://docs.github.com/rest/overview/resources-in-the-rest-api#hypermedia) to determine which URL to access. The endpoint you call to upload release assets is specific to your release. Use the &#x60;upload_url&#x60; returned in the response of the [Create a release endpoint](https://docs.github.com/rest/releases/releases#create-a-release) to upload a release asset.  You need to use an HTTP client which supports [SNI](http://en.wikipedia.org/wiki/Server_Name_Indication) to make calls to this endpoint.  Most libraries will set the required &#x60;Content-Length&#x60; header automatically. Use the required &#x60;Content-Type&#x60; header to provide the media type of the asset. For a list of media types, see [Media Types](https://www.iana.org/assignments/media-types/media-types.xhtml). For example:   &#x60;application/zip&#x60;  GitHub expects the asset data in its raw binary form, rather than JSON. You will send the raw binary content of the asset as the request body. Everything else about the endpoint is the same as the rest of the API. For example, you&#39;ll still need to pass your authentication to be able to upload an asset.  When an upstream failure occurs, you will receive a &#x60;502 Bad Gateway&#x60; status. This may leave an empty asset with a state of &#x60;starter&#x60;. It can be safely deleted.  **Notes:** *   GitHub renames asset filenames that have special characters, non-alphanumeric characters, and leading or trailing periods. The \&quot;[List assets for a release](https://docs.github.com/rest/reference/repos#list-assets-for-a-release)\&quot; endpoint lists the renamed filenames. For more information and help, contact [GitHub Support](https://support.github.com/contact?tags&#x3D;dotcom-rest-api). *   To find the &#x60;release_id&#x60; query the [&#x60;GET /repos/{owner}/{repo}/releases/latest&#x60; endpoint](https://docs.github.com/rest/releases/releases#get-the-latest-release).  *   If you upload an asset with the same filename as another uploaded asset, you&#39;ll receive an error and must delete the old file before you can re-upload the new asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReposApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ReposApi apiInstance = new ReposApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer releaseId = 56; // Integer | The unique identifier of the release.
    String name = "name_example"; // String | 
    String label = "label_example"; // String | 
    File body = @example.zip; // File | 
    try {
      ReleaseAsset result = apiInstance.reposUploadReleaseAsset(owner, repo, releaseId, name, label, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReposApi#reposUploadReleaseAsset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| The account owner of the repository. The name is not case sensitive. | |
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **releaseId** | **Integer**| The unique identifier of the release. | |
| **name** | **String**|  | |
| **label** | **String**|  | [optional] |
| **body** | **File**|  | [optional] |

### Return type

[**ReleaseAsset**](ReleaseAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response for successful upload |  -  |
| **422** | Response if you upload an asset with the same filename as another uploaded asset |  -  |

