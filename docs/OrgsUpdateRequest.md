

# OrgsUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**billingEmail** | **String** | Billing email address. This address is not publicized. |  [optional] |
|**company** | **String** | The company name. |  [optional] |
|**email** | **String** | The publicly visible email address. |  [optional] |
|**twitterUsername** | **String** | The Twitter username of the company. |  [optional] |
|**location** | **String** | The location. |  [optional] |
|**name** | **String** | The shorthand name of the company. |  [optional] |
|**description** | **String** | The description of the company. |  [optional] |
|**hasOrganizationProjects** | **Boolean** | Whether an organization can use organization projects. |  [optional] |
|**hasRepositoryProjects** | **Boolean** | Whether repositories that belong to the organization can use repository projects. |  [optional] |
|**defaultRepositoryPermission** | [**DefaultRepositoryPermissionEnum**](#DefaultRepositoryPermissionEnum) | Default permission level members have for organization repositories. |  [optional] |
|**membersCanCreateRepositories** | **Boolean** | Whether of non-admin organization members can create repositories. **Note:** A parameter can override this parameter. See &#x60;members_allowed_repository_creation_type&#x60; in this table for details. |  [optional] |
|**membersCanCreateInternalRepositories** | **Boolean** | Whether organization members can create internal repositories, which are visible to all enterprise members. You can only allow members to create internal repositories if your organization is associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see \&quot;[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\&quot; in the GitHub Help documentation. |  [optional] |
|**membersCanCreatePrivateRepositories** | **Boolean** | Whether organization members can create private repositories, which are visible to organization members with permission. For more information, see \&quot;[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\&quot; in the GitHub Help documentation. |  [optional] |
|**membersCanCreatePublicRepositories** | **Boolean** | Whether organization members can create public repositories, which are visible to anyone. For more information, see \&quot;[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\&quot; in the GitHub Help documentation. |  [optional] |
|**membersAllowedRepositoryCreationType** | [**MembersAllowedRepositoryCreationTypeEnum**](#MembersAllowedRepositoryCreationTypeEnum) | Specifies which types of repositories non-admin organization members can create. &#x60;private&#x60; is only available to repositories that are part of an organization on GitHub Enterprise Cloud.  **Note:** This parameter is deprecated and will be removed in the future. Its return value ignores internal repositories. Using this parameter overrides values set in &#x60;members_can_create_repositories&#x60;. See the parameter deprecation notice in the operation description for details. |  [optional] |
|**membersCanCreatePages** | **Boolean** | Whether organization members can create GitHub Pages sites. Existing published sites will not be impacted. |  [optional] |
|**membersCanCreatePublicPages** | **Boolean** | Whether organization members can create public GitHub Pages sites. Existing published sites will not be impacted. |  [optional] |
|**membersCanCreatePrivatePages** | **Boolean** | Whether organization members can create private GitHub Pages sites. Existing published sites will not be impacted. |  [optional] |
|**membersCanForkPrivateRepositories** | **Boolean** | Whether organization members can fork private organization repositories. |  [optional] |
|**webCommitSignoffRequired** | **Boolean** | Whether contributors to organization repositories are required to sign off on commits they make through GitHub&#39;s web interface. |  [optional] |
|**blog** | **String** |  |  [optional] |
|**advancedSecurityEnabledForNewRepositories** | **Boolean** | Whether GitHub Advanced Security is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  You can check which security and analysis features are currently enabled by using a &#x60;GET /orgs/{org}&#x60; request. |  [optional] |
|**dependabotAlertsEnabledForNewRepositories** | **Boolean** | Whether Dependabot alerts is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  You can check which security and analysis features are currently enabled by using a &#x60;GET /orgs/{org}&#x60; request. |  [optional] |
|**dependabotSecurityUpdatesEnabledForNewRepositories** | **Boolean** | Whether Dependabot security updates is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  You can check which security and analysis features are currently enabled by using a &#x60;GET /orgs/{org}&#x60; request. |  [optional] |
|**dependencyGraphEnabledForNewRepositories** | **Boolean** | Whether dependency graph is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  You can check which security and analysis features are currently enabled by using a &#x60;GET /orgs/{org}&#x60; request. |  [optional] |
|**secretScanningEnabledForNewRepositories** | **Boolean** | Whether secret scanning is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  You can check which security and analysis features are currently enabled by using a &#x60;GET /orgs/{org}&#x60; request. |  [optional] |
|**secretScanningPushProtectionEnabledForNewRepositories** | **Boolean** | Whether secret scanning push protection is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  You can check which security and analysis features are currently enabled by using a &#x60;GET /orgs/{org}&#x60; request. |  [optional] |
|**secretScanningPushProtectionCustomLinkEnabled** | **Boolean** | Whether a custom link is shown to contributors who are blocked from pushing a secret by push protection. |  [optional] |
|**secretScanningPushProtectionCustomLink** | **String** | If &#x60;secret_scanning_push_protection_custom_link_enabled&#x60; is true, the URL that will be displayed to contributors who are blocked from pushing a secret. |  [optional] |



## Enum: DefaultRepositoryPermissionEnum

| Name | Value |
|---- | -----|
| READ | &quot;read&quot; |
| WRITE | &quot;write&quot; |
| ADMIN | &quot;admin&quot; |
| NONE | &quot;none&quot; |



## Enum: MembersAllowedRepositoryCreationTypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| PRIVATE | &quot;private&quot; |
| NONE | &quot;none&quot; |



