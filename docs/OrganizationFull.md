

# OrganizationFull

Organization Full

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**login** | **String** |  |  |
|**id** | **Integer** |  |  |
|**nodeId** | **String** |  |  |
|**url** | **URI** |  |  |
|**reposUrl** | **URI** |  |  |
|**eventsUrl** | **URI** |  |  |
|**hooksUrl** | **String** |  |  |
|**issuesUrl** | **String** |  |  |
|**membersUrl** | **String** |  |  |
|**publicMembersUrl** | **String** |  |  |
|**avatarUrl** | **String** |  |  |
|**description** | **String** |  |  |
|**name** | **String** |  |  [optional] |
|**company** | **String** |  |  [optional] |
|**blog** | **URI** |  |  [optional] |
|**location** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**twitterUsername** | **String** |  |  [optional] |
|**isVerified** | **Boolean** |  |  [optional] |
|**hasOrganizationProjects** | **Boolean** |  |  |
|**hasRepositoryProjects** | **Boolean** |  |  |
|**publicRepos** | **Integer** |  |  |
|**publicGists** | **Integer** |  |  |
|**followers** | **Integer** |  |  |
|**following** | **Integer** |  |  |
|**htmlUrl** | **URI** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**type** | **String** |  |  |
|**totalPrivateRepos** | **Integer** |  |  [optional] |
|**ownedPrivateRepos** | **Integer** |  |  [optional] |
|**privateGists** | **Integer** |  |  [optional] |
|**diskUsage** | **Integer** |  |  [optional] |
|**collaborators** | **Integer** |  |  [optional] |
|**billingEmail** | **String** |  |  [optional] |
|**plan** | [**OrganizationFullPlan**](OrganizationFullPlan.md) |  |  [optional] |
|**defaultRepositoryPermission** | **String** |  |  [optional] |
|**membersCanCreateRepositories** | **Boolean** |  |  [optional] |
|**twoFactorRequirementEnabled** | **Boolean** |  |  [optional] |
|**membersAllowedRepositoryCreationType** | **String** |  |  [optional] |
|**membersCanCreatePublicRepositories** | **Boolean** |  |  [optional] |
|**membersCanCreatePrivateRepositories** | **Boolean** |  |  [optional] |
|**membersCanCreateInternalRepositories** | **Boolean** |  |  [optional] |
|**membersCanCreatePages** | **Boolean** |  |  [optional] |
|**membersCanCreatePublicPages** | **Boolean** |  |  [optional] |
|**membersCanCreatePrivatePages** | **Boolean** |  |  [optional] |
|**membersCanForkPrivateRepositories** | **Boolean** |  |  [optional] |
|**webCommitSignoffRequired** | **Boolean** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  |
|**advancedSecurityEnabledForNewRepositories** | **Boolean** | Whether GitHub Advanced Security is enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role. |  [optional] |
|**dependabotAlertsEnabledForNewRepositories** | **Boolean** | Whether GitHub Advanced Security is automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role. |  [optional] |
|**dependabotSecurityUpdatesEnabledForNewRepositories** | **Boolean** | Whether dependabot security updates are automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role. |  [optional] |
|**dependencyGraphEnabledForNewRepositories** | **Boolean** | Whether dependency graph is automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role. |  [optional] |
|**secretScanningEnabledForNewRepositories** | **Boolean** | Whether secret scanning is automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role. |  [optional] |
|**secretScanningPushProtectionEnabledForNewRepositories** | **Boolean** | Whether secret scanning push protection is automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role. |  [optional] |
|**secretScanningPushProtectionCustomLinkEnabled** | **Boolean** | Whether a custom link is shown to contributors who are blocked from pushing a secret by push protection. |  [optional] |
|**secretScanningPushProtectionCustomLink** | **String** | An optional URL string to display to contributors who are blocked from pushing a secret. |  [optional] |



