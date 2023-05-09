# ActionsApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**actionsAddCustomLabelsToSelfHostedRunnerForOrg**](ActionsApi.md#actionsAddCustomLabelsToSelfHostedRunnerForOrg) | **POST** /orgs/{org}/actions/runners/{runner_id}/labels | Add custom labels to a self-hosted runner for an organization |
| [**actionsAddCustomLabelsToSelfHostedRunnerForRepo**](ActionsApi.md#actionsAddCustomLabelsToSelfHostedRunnerForRepo) | **POST** /repos/{owner}/{repo}/actions/runners/{runner_id}/labels | Add custom labels to a self-hosted runner for a repository |
| [**actionsAddSelectedRepoToOrgSecret**](ActionsApi.md#actionsAddSelectedRepoToOrgSecret) | **PUT** /orgs/{org}/actions/secrets/{secret_name}/repositories/{repository_id} | Add selected repository to an organization secret |
| [**actionsAddSelectedRepoToOrgVariable**](ActionsApi.md#actionsAddSelectedRepoToOrgVariable) | **PUT** /orgs/{org}/actions/variables/{name}/repositories/{repository_id} | Add selected repository to an organization variable |
| [**actionsAddSelectedRepoToRequiredWorkflow**](ActionsApi.md#actionsAddSelectedRepoToRequiredWorkflow) | **PUT** /orgs/{org}/actions/required_workflows/{required_workflow_id}/repositories/{repository_id} | Add a repository to a required workflow |
| [**actionsApproveWorkflowRun**](ActionsApi.md#actionsApproveWorkflowRun) | **POST** /repos/{owner}/{repo}/actions/runs/{run_id}/approve | Approve a workflow run for a fork pull request |
| [**actionsCancelWorkflowRun**](ActionsApi.md#actionsCancelWorkflowRun) | **POST** /repos/{owner}/{repo}/actions/runs/{run_id}/cancel | Cancel a workflow run |
| [**actionsCreateEnvironmentVariable**](ActionsApi.md#actionsCreateEnvironmentVariable) | **POST** /repositories/{repository_id}/environments/{environment_name}/variables | Create an environment variable |
| [**actionsCreateOrUpdateEnvironmentSecret**](ActionsApi.md#actionsCreateOrUpdateEnvironmentSecret) | **PUT** /repositories/{repository_id}/environments/{environment_name}/secrets/{secret_name} | Create or update an environment secret |
| [**actionsCreateOrUpdateOrgSecret**](ActionsApi.md#actionsCreateOrUpdateOrgSecret) | **PUT** /orgs/{org}/actions/secrets/{secret_name} | Create or update an organization secret |
| [**actionsCreateOrUpdateRepoSecret**](ActionsApi.md#actionsCreateOrUpdateRepoSecret) | **PUT** /repos/{owner}/{repo}/actions/secrets/{secret_name} | Create or update a repository secret |
| [**actionsCreateOrgVariable**](ActionsApi.md#actionsCreateOrgVariable) | **POST** /orgs/{org}/actions/variables | Create an organization variable |
| [**actionsCreateRegistrationTokenForOrg**](ActionsApi.md#actionsCreateRegistrationTokenForOrg) | **POST** /orgs/{org}/actions/runners/registration-token | Create a registration token for an organization |
| [**actionsCreateRegistrationTokenForRepo**](ActionsApi.md#actionsCreateRegistrationTokenForRepo) | **POST** /repos/{owner}/{repo}/actions/runners/registration-token | Create a registration token for a repository |
| [**actionsCreateRemoveTokenForOrg**](ActionsApi.md#actionsCreateRemoveTokenForOrg) | **POST** /orgs/{org}/actions/runners/remove-token | Create a remove token for an organization |
| [**actionsCreateRemoveTokenForRepo**](ActionsApi.md#actionsCreateRemoveTokenForRepo) | **POST** /repos/{owner}/{repo}/actions/runners/remove-token | Create a remove token for a repository |
| [**actionsCreateRepoVariable**](ActionsApi.md#actionsCreateRepoVariable) | **POST** /repos/{owner}/{repo}/actions/variables | Create a repository variable |
| [**actionsCreateRequiredWorkflow**](ActionsApi.md#actionsCreateRequiredWorkflow) | **POST** /orgs/{org}/actions/required_workflows | Create a required workflow |
| [**actionsCreateWorkflowDispatch**](ActionsApi.md#actionsCreateWorkflowDispatch) | **POST** /repos/{owner}/{repo}/actions/workflows/{workflow_id}/dispatches | Create a workflow dispatch event |
| [**actionsDeleteActionsCacheById**](ActionsApi.md#actionsDeleteActionsCacheById) | **DELETE** /repos/{owner}/{repo}/actions/caches/{cache_id} | Delete a GitHub Actions cache for a repository (using a cache ID) |
| [**actionsDeleteActionsCacheByKey**](ActionsApi.md#actionsDeleteActionsCacheByKey) | **DELETE** /repos/{owner}/{repo}/actions/caches | Delete GitHub Actions caches for a repository (using a cache key) |
| [**actionsDeleteArtifact**](ActionsApi.md#actionsDeleteArtifact) | **DELETE** /repos/{owner}/{repo}/actions/artifacts/{artifact_id} | Delete an artifact |
| [**actionsDeleteEnvironmentSecret**](ActionsApi.md#actionsDeleteEnvironmentSecret) | **DELETE** /repositories/{repository_id}/environments/{environment_name}/secrets/{secret_name} | Delete an environment secret |
| [**actionsDeleteEnvironmentVariable**](ActionsApi.md#actionsDeleteEnvironmentVariable) | **DELETE** /repositories/{repository_id}/environments/{environment_name}/variables/{name} | Delete an environment variable |
| [**actionsDeleteOrgSecret**](ActionsApi.md#actionsDeleteOrgSecret) | **DELETE** /orgs/{org}/actions/secrets/{secret_name} | Delete an organization secret |
| [**actionsDeleteOrgVariable**](ActionsApi.md#actionsDeleteOrgVariable) | **DELETE** /orgs/{org}/actions/variables/{name} | Delete an organization variable |
| [**actionsDeleteRepoSecret**](ActionsApi.md#actionsDeleteRepoSecret) | **DELETE** /repos/{owner}/{repo}/actions/secrets/{secret_name} | Delete a repository secret |
| [**actionsDeleteRepoVariable**](ActionsApi.md#actionsDeleteRepoVariable) | **DELETE** /repos/{owner}/{repo}/actions/variables/{name} | Delete a repository variable |
| [**actionsDeleteRequiredWorkflow**](ActionsApi.md#actionsDeleteRequiredWorkflow) | **DELETE** /orgs/{org}/actions/required_workflows/{required_workflow_id} | Delete a required workflow |
| [**actionsDeleteSelfHostedRunnerFromOrg**](ActionsApi.md#actionsDeleteSelfHostedRunnerFromOrg) | **DELETE** /orgs/{org}/actions/runners/{runner_id} | Delete a self-hosted runner from an organization |
| [**actionsDeleteSelfHostedRunnerFromRepo**](ActionsApi.md#actionsDeleteSelfHostedRunnerFromRepo) | **DELETE** /repos/{owner}/{repo}/actions/runners/{runner_id} | Delete a self-hosted runner from a repository |
| [**actionsDeleteWorkflowRun**](ActionsApi.md#actionsDeleteWorkflowRun) | **DELETE** /repos/{owner}/{repo}/actions/runs/{run_id} | Delete a workflow run |
| [**actionsDeleteWorkflowRunLogs**](ActionsApi.md#actionsDeleteWorkflowRunLogs) | **DELETE** /repos/{owner}/{repo}/actions/runs/{run_id}/logs | Delete workflow run logs |
| [**actionsDisableSelectedRepositoryGithubActionsOrganization**](ActionsApi.md#actionsDisableSelectedRepositoryGithubActionsOrganization) | **DELETE** /orgs/{org}/actions/permissions/repositories/{repository_id} | Disable a selected repository for GitHub Actions in an organization |
| [**actionsDisableWorkflow**](ActionsApi.md#actionsDisableWorkflow) | **PUT** /repos/{owner}/{repo}/actions/workflows/{workflow_id}/disable | Disable a workflow |
| [**actionsDownloadArtifact**](ActionsApi.md#actionsDownloadArtifact) | **GET** /repos/{owner}/{repo}/actions/artifacts/{artifact_id}/{archive_format} | Download an artifact |
| [**actionsDownloadJobLogsForWorkflowRun**](ActionsApi.md#actionsDownloadJobLogsForWorkflowRun) | **GET** /repos/{owner}/{repo}/actions/jobs/{job_id}/logs | Download job logs for a workflow run |
| [**actionsDownloadWorkflowRunAttemptLogs**](ActionsApi.md#actionsDownloadWorkflowRunAttemptLogs) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}/logs | Download workflow run attempt logs |
| [**actionsDownloadWorkflowRunLogs**](ActionsApi.md#actionsDownloadWorkflowRunLogs) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/logs | Download workflow run logs |
| [**actionsEnableSelectedRepositoryGithubActionsOrganization**](ActionsApi.md#actionsEnableSelectedRepositoryGithubActionsOrganization) | **PUT** /orgs/{org}/actions/permissions/repositories/{repository_id} | Enable a selected repository for GitHub Actions in an organization |
| [**actionsEnableWorkflow**](ActionsApi.md#actionsEnableWorkflow) | **PUT** /repos/{owner}/{repo}/actions/workflows/{workflow_id}/enable | Enable a workflow |
| [**actionsGetActionsCacheList**](ActionsApi.md#actionsGetActionsCacheList) | **GET** /repos/{owner}/{repo}/actions/caches | List GitHub Actions caches for a repository |
| [**actionsGetActionsCacheUsage**](ActionsApi.md#actionsGetActionsCacheUsage) | **GET** /repos/{owner}/{repo}/actions/cache/usage | Get GitHub Actions cache usage for a repository |
| [**actionsGetActionsCacheUsageByRepoForOrg**](ActionsApi.md#actionsGetActionsCacheUsageByRepoForOrg) | **GET** /orgs/{org}/actions/cache/usage-by-repository | List repositories with GitHub Actions cache usage for an organization |
| [**actionsGetActionsCacheUsageForOrg**](ActionsApi.md#actionsGetActionsCacheUsageForOrg) | **GET** /orgs/{org}/actions/cache/usage | Get GitHub Actions cache usage for an organization |
| [**actionsGetAllowedActionsOrganization**](ActionsApi.md#actionsGetAllowedActionsOrganization) | **GET** /orgs/{org}/actions/permissions/selected-actions | Get allowed actions and reusable workflows for an organization |
| [**actionsGetAllowedActionsRepository**](ActionsApi.md#actionsGetAllowedActionsRepository) | **GET** /repos/{owner}/{repo}/actions/permissions/selected-actions | Get allowed actions and reusable workflows for a repository |
| [**actionsGetArtifact**](ActionsApi.md#actionsGetArtifact) | **GET** /repos/{owner}/{repo}/actions/artifacts/{artifact_id} | Get an artifact |
| [**actionsGetCustomOidcSubClaimForRepo**](ActionsApi.md#actionsGetCustomOidcSubClaimForRepo) | **GET** /repos/{owner}/{repo}/actions/oidc/customization/sub | Get the customization template for an OIDC subject claim for a repository |
| [**actionsGetEnvironmentPublicKey**](ActionsApi.md#actionsGetEnvironmentPublicKey) | **GET** /repositories/{repository_id}/environments/{environment_name}/secrets/public-key | Get an environment public key |
| [**actionsGetEnvironmentSecret**](ActionsApi.md#actionsGetEnvironmentSecret) | **GET** /repositories/{repository_id}/environments/{environment_name}/secrets/{secret_name} | Get an environment secret |
| [**actionsGetEnvironmentVariable**](ActionsApi.md#actionsGetEnvironmentVariable) | **GET** /repositories/{repository_id}/environments/{environment_name}/variables/{name} | Get an environment variable |
| [**actionsGetGithubActionsDefaultWorkflowPermissionsOrganization**](ActionsApi.md#actionsGetGithubActionsDefaultWorkflowPermissionsOrganization) | **GET** /orgs/{org}/actions/permissions/workflow | Get default workflow permissions for an organization |
| [**actionsGetGithubActionsDefaultWorkflowPermissionsRepository**](ActionsApi.md#actionsGetGithubActionsDefaultWorkflowPermissionsRepository) | **GET** /repos/{owner}/{repo}/actions/permissions/workflow | Get default workflow permissions for a repository |
| [**actionsGetGithubActionsPermissionsOrganization**](ActionsApi.md#actionsGetGithubActionsPermissionsOrganization) | **GET** /orgs/{org}/actions/permissions | Get GitHub Actions permissions for an organization |
| [**actionsGetGithubActionsPermissionsRepository**](ActionsApi.md#actionsGetGithubActionsPermissionsRepository) | **GET** /repos/{owner}/{repo}/actions/permissions | Get GitHub Actions permissions for a repository |
| [**actionsGetJobForWorkflowRun**](ActionsApi.md#actionsGetJobForWorkflowRun) | **GET** /repos/{owner}/{repo}/actions/jobs/{job_id} | Get a job for a workflow run |
| [**actionsGetOrgPublicKey**](ActionsApi.md#actionsGetOrgPublicKey) | **GET** /orgs/{org}/actions/secrets/public-key | Get an organization public key |
| [**actionsGetOrgSecret**](ActionsApi.md#actionsGetOrgSecret) | **GET** /orgs/{org}/actions/secrets/{secret_name} | Get an organization secret |
| [**actionsGetOrgVariable**](ActionsApi.md#actionsGetOrgVariable) | **GET** /orgs/{org}/actions/variables/{name} | Get an organization variable |
| [**actionsGetPendingDeploymentsForRun**](ActionsApi.md#actionsGetPendingDeploymentsForRun) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments | Get pending deployments for a workflow run |
| [**actionsGetRepoPublicKey**](ActionsApi.md#actionsGetRepoPublicKey) | **GET** /repos/{owner}/{repo}/actions/secrets/public-key | Get a repository public key |
| [**actionsGetRepoRequiredWorkflow**](ActionsApi.md#actionsGetRepoRequiredWorkflow) | **GET** /repos/{org}/{repo}/actions/required_workflows/{required_workflow_id_for_repo} | Get a required workflow entity for a repository |
| [**actionsGetRepoRequiredWorkflowUsage**](ActionsApi.md#actionsGetRepoRequiredWorkflowUsage) | **GET** /repos/{org}/{repo}/actions/required_workflows/{required_workflow_id_for_repo}/timing | Get required workflow usage |
| [**actionsGetRepoSecret**](ActionsApi.md#actionsGetRepoSecret) | **GET** /repos/{owner}/{repo}/actions/secrets/{secret_name} | Get a repository secret |
| [**actionsGetRepoVariable**](ActionsApi.md#actionsGetRepoVariable) | **GET** /repos/{owner}/{repo}/actions/variables/{name} | Get a repository variable |
| [**actionsGetRequiredWorkflow**](ActionsApi.md#actionsGetRequiredWorkflow) | **GET** /orgs/{org}/actions/required_workflows/{required_workflow_id} | Get a required workflow |
| [**actionsGetReviewsForRun**](ActionsApi.md#actionsGetReviewsForRun) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/approvals | Get the review history for a workflow run |
| [**actionsGetSelfHostedRunnerForOrg**](ActionsApi.md#actionsGetSelfHostedRunnerForOrg) | **GET** /orgs/{org}/actions/runners/{runner_id} | Get a self-hosted runner for an organization |
| [**actionsGetSelfHostedRunnerForRepo**](ActionsApi.md#actionsGetSelfHostedRunnerForRepo) | **GET** /repos/{owner}/{repo}/actions/runners/{runner_id} | Get a self-hosted runner for a repository |
| [**actionsGetWorkflow**](ActionsApi.md#actionsGetWorkflow) | **GET** /repos/{owner}/{repo}/actions/workflows/{workflow_id} | Get a workflow |
| [**actionsGetWorkflowAccessToRepository**](ActionsApi.md#actionsGetWorkflowAccessToRepository) | **GET** /repos/{owner}/{repo}/actions/permissions/access | Get the level of access for workflows outside of the repository |
| [**actionsGetWorkflowRun**](ActionsApi.md#actionsGetWorkflowRun) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id} | Get a workflow run |
| [**actionsGetWorkflowRunAttempt**](ActionsApi.md#actionsGetWorkflowRunAttempt) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number} | Get a workflow run attempt |
| [**actionsGetWorkflowRunUsage**](ActionsApi.md#actionsGetWorkflowRunUsage) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/timing | Get workflow run usage |
| [**actionsGetWorkflowUsage**](ActionsApi.md#actionsGetWorkflowUsage) | **GET** /repos/{owner}/{repo}/actions/workflows/{workflow_id}/timing | Get workflow usage |
| [**actionsListArtifactsForRepo**](ActionsApi.md#actionsListArtifactsForRepo) | **GET** /repos/{owner}/{repo}/actions/artifacts | List artifacts for a repository |
| [**actionsListEnvironmentSecrets**](ActionsApi.md#actionsListEnvironmentSecrets) | **GET** /repositories/{repository_id}/environments/{environment_name}/secrets | List environment secrets |
| [**actionsListEnvironmentVariables**](ActionsApi.md#actionsListEnvironmentVariables) | **GET** /repositories/{repository_id}/environments/{environment_name}/variables | List environment variables |
| [**actionsListJobsForWorkflowRun**](ActionsApi.md#actionsListJobsForWorkflowRun) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/jobs | List jobs for a workflow run |
| [**actionsListJobsForWorkflowRunAttempt**](ActionsApi.md#actionsListJobsForWorkflowRunAttempt) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}/jobs | List jobs for a workflow run attempt |
| [**actionsListLabelsForSelfHostedRunnerForOrg**](ActionsApi.md#actionsListLabelsForSelfHostedRunnerForOrg) | **GET** /orgs/{org}/actions/runners/{runner_id}/labels | List labels for a self-hosted runner for an organization |
| [**actionsListLabelsForSelfHostedRunnerForRepo**](ActionsApi.md#actionsListLabelsForSelfHostedRunnerForRepo) | **GET** /repos/{owner}/{repo}/actions/runners/{runner_id}/labels | List labels for a self-hosted runner for a repository |
| [**actionsListOrgSecrets**](ActionsApi.md#actionsListOrgSecrets) | **GET** /orgs/{org}/actions/secrets | List organization secrets |
| [**actionsListOrgVariables**](ActionsApi.md#actionsListOrgVariables) | **GET** /orgs/{org}/actions/variables | List organization variables |
| [**actionsListRepoOrganizationSecrets**](ActionsApi.md#actionsListRepoOrganizationSecrets) | **GET** /repos/{owner}/{repo}/actions/organization-secrets | List repository organization secrets |
| [**actionsListRepoOrganizationVariables**](ActionsApi.md#actionsListRepoOrganizationVariables) | **GET** /repos/{owner}/{repo}/actions/organization-variables | List repository organization variables |
| [**actionsListRepoRequiredWorkflows**](ActionsApi.md#actionsListRepoRequiredWorkflows) | **GET** /repos/{org}/{repo}/actions/required_workflows | List repository required workflows |
| [**actionsListRepoSecrets**](ActionsApi.md#actionsListRepoSecrets) | **GET** /repos/{owner}/{repo}/actions/secrets | List repository secrets |
| [**actionsListRepoVariables**](ActionsApi.md#actionsListRepoVariables) | **GET** /repos/{owner}/{repo}/actions/variables | List repository variables |
| [**actionsListRepoWorkflows**](ActionsApi.md#actionsListRepoWorkflows) | **GET** /repos/{owner}/{repo}/actions/workflows | List repository workflows |
| [**actionsListRequiredWorkflowRuns**](ActionsApi.md#actionsListRequiredWorkflowRuns) | **GET** /repos/{owner}/{repo}/actions/required_workflows/{required_workflow_id_for_repo}/runs | List workflow runs for a required workflow |
| [**actionsListRequiredWorkflows**](ActionsApi.md#actionsListRequiredWorkflows) | **GET** /orgs/{org}/actions/required_workflows | List required workflows |
| [**actionsListRunnerApplicationsForOrg**](ActionsApi.md#actionsListRunnerApplicationsForOrg) | **GET** /orgs/{org}/actions/runners/downloads | List runner applications for an organization |
| [**actionsListRunnerApplicationsForRepo**](ActionsApi.md#actionsListRunnerApplicationsForRepo) | **GET** /repos/{owner}/{repo}/actions/runners/downloads | List runner applications for a repository |
| [**actionsListSelectedReposForOrgSecret**](ActionsApi.md#actionsListSelectedReposForOrgSecret) | **GET** /orgs/{org}/actions/secrets/{secret_name}/repositories | List selected repositories for an organization secret |
| [**actionsListSelectedReposForOrgVariable**](ActionsApi.md#actionsListSelectedReposForOrgVariable) | **GET** /orgs/{org}/actions/variables/{name}/repositories | List selected repositories for an organization variable |
| [**actionsListSelectedRepositoriesEnabledGithubActionsOrganization**](ActionsApi.md#actionsListSelectedRepositoriesEnabledGithubActionsOrganization) | **GET** /orgs/{org}/actions/permissions/repositories | List selected repositories enabled for GitHub Actions in an organization |
| [**actionsListSelectedRepositoriesRequiredWorkflow**](ActionsApi.md#actionsListSelectedRepositoriesRequiredWorkflow) | **GET** /orgs/{org}/actions/required_workflows/{required_workflow_id}/repositories | List selected repositories for a required workflow |
| [**actionsListSelfHostedRunnersForOrg**](ActionsApi.md#actionsListSelfHostedRunnersForOrg) | **GET** /orgs/{org}/actions/runners | List self-hosted runners for an organization |
| [**actionsListSelfHostedRunnersForRepo**](ActionsApi.md#actionsListSelfHostedRunnersForRepo) | **GET** /repos/{owner}/{repo}/actions/runners | List self-hosted runners for a repository |
| [**actionsListWorkflowRunArtifacts**](ActionsApi.md#actionsListWorkflowRunArtifacts) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/artifacts | List workflow run artifacts |
| [**actionsListWorkflowRuns**](ActionsApi.md#actionsListWorkflowRuns) | **GET** /repos/{owner}/{repo}/actions/workflows/{workflow_id}/runs | List workflow runs for a workflow |
| [**actionsListWorkflowRunsForRepo**](ActionsApi.md#actionsListWorkflowRunsForRepo) | **GET** /repos/{owner}/{repo}/actions/runs | List workflow runs for a repository |
| [**actionsReRunJobForWorkflowRun**](ActionsApi.md#actionsReRunJobForWorkflowRun) | **POST** /repos/{owner}/{repo}/actions/jobs/{job_id}/rerun | Re-run a job from a workflow run |
| [**actionsReRunWorkflow**](ActionsApi.md#actionsReRunWorkflow) | **POST** /repos/{owner}/{repo}/actions/runs/{run_id}/rerun | Re-run a workflow |
| [**actionsReRunWorkflowFailedJobs**](ActionsApi.md#actionsReRunWorkflowFailedJobs) | **POST** /repos/{owner}/{repo}/actions/runs/{run_id}/rerun-failed-jobs | Re-run failed jobs from a workflow run |
| [**actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrg**](ActionsApi.md#actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrg) | **DELETE** /orgs/{org}/actions/runners/{runner_id}/labels | Remove all custom labels from a self-hosted runner for an organization |
| [**actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepo**](ActionsApi.md#actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepo) | **DELETE** /repos/{owner}/{repo}/actions/runners/{runner_id}/labels | Remove all custom labels from a self-hosted runner for a repository |
| [**actionsRemoveCustomLabelFromSelfHostedRunnerForOrg**](ActionsApi.md#actionsRemoveCustomLabelFromSelfHostedRunnerForOrg) | **DELETE** /orgs/{org}/actions/runners/{runner_id}/labels/{name} | Remove a custom label from a self-hosted runner for an organization |
| [**actionsRemoveCustomLabelFromSelfHostedRunnerForRepo**](ActionsApi.md#actionsRemoveCustomLabelFromSelfHostedRunnerForRepo) | **DELETE** /repos/{owner}/{repo}/actions/runners/{runner_id}/labels/{name} | Remove a custom label from a self-hosted runner for a repository |
| [**actionsRemoveSelectedRepoFromOrgSecret**](ActionsApi.md#actionsRemoveSelectedRepoFromOrgSecret) | **DELETE** /orgs/{org}/actions/secrets/{secret_name}/repositories/{repository_id} | Remove selected repository from an organization secret |
| [**actionsRemoveSelectedRepoFromOrgVariable**](ActionsApi.md#actionsRemoveSelectedRepoFromOrgVariable) | **DELETE** /orgs/{org}/actions/variables/{name}/repositories/{repository_id} | Remove selected repository from an organization variable |
| [**actionsRemoveSelectedRepoFromRequiredWorkflow**](ActionsApi.md#actionsRemoveSelectedRepoFromRequiredWorkflow) | **DELETE** /orgs/{org}/actions/required_workflows/{required_workflow_id}/repositories/{repository_id} | Remove a selected repository from required workflow |
| [**actionsReviewCustomGatesForRun**](ActionsApi.md#actionsReviewCustomGatesForRun) | **POST** /repos/{owner}/{repo}/actions/runs/{run_id}/deployment_protection_rule | Review custom deployment protection rules for a workflow run |
| [**actionsReviewPendingDeploymentsForRun**](ActionsApi.md#actionsReviewPendingDeploymentsForRun) | **POST** /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments | Review pending deployments for a workflow run |
| [**actionsSetAllowedActionsOrganization**](ActionsApi.md#actionsSetAllowedActionsOrganization) | **PUT** /orgs/{org}/actions/permissions/selected-actions | Set allowed actions and reusable workflows for an organization |
| [**actionsSetAllowedActionsRepository**](ActionsApi.md#actionsSetAllowedActionsRepository) | **PUT** /repos/{owner}/{repo}/actions/permissions/selected-actions | Set allowed actions and reusable workflows for a repository |
| [**actionsSetCustomLabelsForSelfHostedRunnerForOrg**](ActionsApi.md#actionsSetCustomLabelsForSelfHostedRunnerForOrg) | **PUT** /orgs/{org}/actions/runners/{runner_id}/labels | Set custom labels for a self-hosted runner for an organization |
| [**actionsSetCustomLabelsForSelfHostedRunnerForRepo**](ActionsApi.md#actionsSetCustomLabelsForSelfHostedRunnerForRepo) | **PUT** /repos/{owner}/{repo}/actions/runners/{runner_id}/labels | Set custom labels for a self-hosted runner for a repository |
| [**actionsSetCustomOidcSubClaimForRepo**](ActionsApi.md#actionsSetCustomOidcSubClaimForRepo) | **PUT** /repos/{owner}/{repo}/actions/oidc/customization/sub | Set the customization template for an OIDC subject claim for a repository |
| [**actionsSetGithubActionsDefaultWorkflowPermissionsOrganization**](ActionsApi.md#actionsSetGithubActionsDefaultWorkflowPermissionsOrganization) | **PUT** /orgs/{org}/actions/permissions/workflow | Set default workflow permissions for an organization |
| [**actionsSetGithubActionsDefaultWorkflowPermissionsRepository**](ActionsApi.md#actionsSetGithubActionsDefaultWorkflowPermissionsRepository) | **PUT** /repos/{owner}/{repo}/actions/permissions/workflow | Set default workflow permissions for a repository |
| [**actionsSetGithubActionsPermissionsOrganization**](ActionsApi.md#actionsSetGithubActionsPermissionsOrganization) | **PUT** /orgs/{org}/actions/permissions | Set GitHub Actions permissions for an organization |
| [**actionsSetGithubActionsPermissionsRepository**](ActionsApi.md#actionsSetGithubActionsPermissionsRepository) | **PUT** /repos/{owner}/{repo}/actions/permissions | Set GitHub Actions permissions for a repository |
| [**actionsSetSelectedReposForOrgSecret**](ActionsApi.md#actionsSetSelectedReposForOrgSecret) | **PUT** /orgs/{org}/actions/secrets/{secret_name}/repositories | Set selected repositories for an organization secret |
| [**actionsSetSelectedReposForOrgVariable**](ActionsApi.md#actionsSetSelectedReposForOrgVariable) | **PUT** /orgs/{org}/actions/variables/{name}/repositories | Set selected repositories for an organization variable |
| [**actionsSetSelectedReposToRequiredWorkflow**](ActionsApi.md#actionsSetSelectedReposToRequiredWorkflow) | **PUT** /orgs/{org}/actions/required_workflows/{required_workflow_id}/repositories | Sets repositories for a required workflow |
| [**actionsSetSelectedRepositoriesEnabledGithubActionsOrganization**](ActionsApi.md#actionsSetSelectedRepositoriesEnabledGithubActionsOrganization) | **PUT** /orgs/{org}/actions/permissions/repositories | Set selected repositories enabled for GitHub Actions in an organization |
| [**actionsSetWorkflowAccessToRepository**](ActionsApi.md#actionsSetWorkflowAccessToRepository) | **PUT** /repos/{owner}/{repo}/actions/permissions/access | Set the level of access for workflows outside of the repository |
| [**actionsUpdateEnvironmentVariable**](ActionsApi.md#actionsUpdateEnvironmentVariable) | **PATCH** /repositories/{repository_id}/environments/{environment_name}/variables/{name} | Update an environment variable |
| [**actionsUpdateOrgVariable**](ActionsApi.md#actionsUpdateOrgVariable) | **PATCH** /orgs/{org}/actions/variables/{name} | Update an organization variable |
| [**actionsUpdateRepoVariable**](ActionsApi.md#actionsUpdateRepoVariable) | **PATCH** /repos/{owner}/{repo}/actions/variables/{name} | Update a repository variable |
| [**actionsUpdateRequiredWorkflow**](ActionsApi.md#actionsUpdateRequiredWorkflow) | **PATCH** /orgs/{org}/actions/required_workflows/{required_workflow_id} | Update a required workflow |


<a name="actionsAddCustomLabelsToSelfHostedRunnerForOrg"></a>
# **actionsAddCustomLabelsToSelfHostedRunnerForOrg**
> ActionsListLabelsForSelfHostedRunnerForOrg200Response actionsAddCustomLabelsToSelfHostedRunnerForOrg(org, runnerId, actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest)

Add custom labels to a self-hosted runner for an organization

Add custom labels to a self-hosted runner configured in an organization.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer runnerId = 56; // Integer | Unique identifier of the self-hosted runner.
    ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest = new ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest(); // ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest | 
    try {
      ActionsListLabelsForSelfHostedRunnerForOrg200Response result = apiInstance.actionsAddCustomLabelsToSelfHostedRunnerForOrg(org, runnerId, actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsAddCustomLabelsToSelfHostedRunnerForOrg");
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
| **runnerId** | **Integer**| Unique identifier of the self-hosted runner. | |
| **actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest** | [**ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest**](ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest.md)|  | |

### Return type

[**ActionsListLabelsForSelfHostedRunnerForOrg200Response**](ActionsListLabelsForSelfHostedRunnerForOrg200Response.md)

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

<a name="actionsAddCustomLabelsToSelfHostedRunnerForRepo"></a>
# **actionsAddCustomLabelsToSelfHostedRunnerForRepo**
> ActionsListLabelsForSelfHostedRunnerForOrg200Response actionsAddCustomLabelsToSelfHostedRunnerForRepo(owner, repo, runnerId, actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest)

Add custom labels to a self-hosted runner for a repository

Add custom labels to a self-hosted runner configured in a repository.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runnerId = 56; // Integer | Unique identifier of the self-hosted runner.
    ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest = new ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest(); // ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest | 
    try {
      ActionsListLabelsForSelfHostedRunnerForOrg200Response result = apiInstance.actionsAddCustomLabelsToSelfHostedRunnerForRepo(owner, repo, runnerId, actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsAddCustomLabelsToSelfHostedRunnerForRepo");
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
| **runnerId** | **Integer**| Unique identifier of the self-hosted runner. | |
| **actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest** | [**ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest**](ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest.md)|  | |

### Return type

[**ActionsListLabelsForSelfHostedRunnerForOrg200Response**](ActionsListLabelsForSelfHostedRunnerForOrg200Response.md)

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

<a name="actionsAddSelectedRepoToOrgSecret"></a>
# **actionsAddSelectedRepoToOrgSecret**
> actionsAddSelectedRepoToOrgSecret(org, secretName, repositoryId)

Add selected repository to an organization secret

Adds a repository to an organization secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/actions#create-or-update-an-organization-secret). You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    Integer repositoryId = 56; // Integer | 
    try {
      apiInstance.actionsAddSelectedRepoToOrgSecret(org, secretName, repositoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsAddSelectedRepoToOrgSecret");
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
| **secretName** | **String**| The name of the secret. | |
| **repositoryId** | **Integer**|  | |

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
| **204** | No Content when repository was added to the selected list |  -  |
| **409** | Conflict when visibility type is not set to selected |  -  |

<a name="actionsAddSelectedRepoToOrgVariable"></a>
# **actionsAddSelectedRepoToOrgVariable**
> actionsAddSelectedRepoToOrgVariable(org, name, repositoryId)

Add selected repository to an organization variable

Adds a repository to an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their &#x60;visibility&#x60; field set to &#x60;selected&#x60;. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;organization_actions_variables:write&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String name = "name_example"; // String | The name of the variable.
    Integer repositoryId = 56; // Integer | 
    try {
      apiInstance.actionsAddSelectedRepoToOrgVariable(org, name, repositoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsAddSelectedRepoToOrgVariable");
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
| **name** | **String**| The name of the variable. | |
| **repositoryId** | **Integer**|  | |

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
| **409** | Response when the visibility of the variable is not set to &#x60;selected&#x60; |  -  |

<a name="actionsAddSelectedRepoToRequiredWorkflow"></a>
# **actionsAddSelectedRepoToRequiredWorkflow**
> actionsAddSelectedRepoToRequiredWorkflow(org, requiredWorkflowId, repositoryId)

Add a repository to a required workflow

Adds a repository to a required workflow. To use this endpoint, the required workflow must be configured to run on selected repositories.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.  For more information, see \&quot;[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer requiredWorkflowId = 56; // Integer | The unique identifier of the required workflow.
    Integer repositoryId = 56; // Integer | The unique identifier of the repository.
    try {
      apiInstance.actionsAddSelectedRepoToRequiredWorkflow(org, requiredWorkflowId, repositoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsAddSelectedRepoToRequiredWorkflow");
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
| **requiredWorkflowId** | **Integer**| The unique identifier of the required workflow. | |
| **repositoryId** | **Integer**| The unique identifier of the repository. | |

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
| **204** | Success |  -  |
| **404** | Resource Not Found |  -  |
| **422** | Validation Error |  -  |

<a name="actionsApproveWorkflowRun"></a>
# **actionsApproveWorkflowRun**
> Object actionsApproveWorkflowRun(owner, repo, runId)

Approve a workflow run for a fork pull request

Approves a workflow run for a pull request from a public fork of a first time contributor. For more information, see [\&quot;Approving workflow runs from public forks](https://docs.github.com/actions/managing-workflow-runs/approving-workflow-runs-from-public-forks).\&quot;  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions:write&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    try {
      Object result = apiInstance.actionsApproveWorkflowRun(owner, repo, runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsApproveWorkflowRun");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |

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
| **201** | Response |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |

<a name="actionsCancelWorkflowRun"></a>
# **actionsCancelWorkflowRun**
> Object actionsCancelWorkflowRun(owner, repo, runId)

Cancel a workflow run

Cancels a workflow run using its &#x60;id&#x60;. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions:write&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    try {
      Object result = apiInstance.actionsCancelWorkflowRun(owner, repo, runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsCancelWorkflowRun");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |

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
| **202** | Response |  -  |
| **409** | Conflict |  -  |

<a name="actionsCreateEnvironmentVariable"></a>
# **actionsCreateEnvironmentVariable**
> Object actionsCreateEnvironmentVariable(repositoryId, environmentName, actionsCreateRepoVariableRequest)

Create an environment variable

Create an environment variable that you can reference in a GitHub Actions workflow. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;environment:write&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    Integer repositoryId = 56; // Integer | The unique identifier of the repository.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    ActionsCreateRepoVariableRequest actionsCreateRepoVariableRequest = new ActionsCreateRepoVariableRequest(); // ActionsCreateRepoVariableRequest | 
    try {
      Object result = apiInstance.actionsCreateEnvironmentVariable(repositoryId, environmentName, actionsCreateRepoVariableRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsCreateEnvironmentVariable");
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
| **repositoryId** | **Integer**| The unique identifier of the repository. | |
| **environmentName** | **String**| The name of the environment. | |
| **actionsCreateRepoVariableRequest** | [**ActionsCreateRepoVariableRequest**](ActionsCreateRepoVariableRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |

<a name="actionsCreateOrUpdateEnvironmentSecret"></a>
# **actionsCreateOrUpdateEnvironmentSecret**
> Object actionsCreateOrUpdateEnvironmentSecret(repositoryId, environmentName, secretName, actionsCreateOrUpdateEnvironmentSecretRequest)

Create or update an environment secret

Creates or updates an environment secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; repository permission to use this endpoint.  #### Example encrypting a secret using Node.js  Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.  &#x60;&#x60;&#x60; const sodium &#x3D; require(&#39;libsodium-wrappers&#39;) const secret &#x3D; &#39;plain-text-secret&#39; // replace with the secret you want to encrypt const key &#x3D; &#39;base64-encoded-public-key&#39; // replace with the Base64 encoded public key  //Check if libsodium is ready and then proceed. sodium.ready.then(() &#x3D;&gt; {   // Convert Secret &amp; Base64 key to Uint8Array.   let binkey &#x3D; sodium.from_base64(key, sodium.base64_variants.ORIGINAL)   let binsec &#x3D; sodium.from_string(secret)    //Encrypt the secret using LibSodium   let encBytes &#x3D; sodium.crypto_box_seal(binsec, binkey)    // Convert encrypted Uint8Array to Base64   let output &#x3D; sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)    console.log(output) }); &#x60;&#x60;&#x60;  #### Example encrypting a secret using Python  Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.  &#x60;&#x60;&#x60; from base64 import b64encode from nacl import encoding, public  def encrypt(public_key: str, secret_value: str) -&gt; str:   \&quot;\&quot;\&quot;Encrypt a Unicode string using the public key.\&quot;\&quot;\&quot;   public_key &#x3D; public.PublicKey(public_key.encode(\&quot;utf-8\&quot;), encoding.Base64Encoder())   sealed_box &#x3D; public.SealedBox(public_key)   encrypted &#x3D; sealed_box.encrypt(secret_value.encode(\&quot;utf-8\&quot;))   return b64encode(encrypted).decode(\&quot;utf-8\&quot;) &#x60;&#x60;&#x60;  #### Example encrypting a secret using C#  Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.  &#x60;&#x60;&#x60; var secretValue &#x3D; System.Text.Encoding.UTF8.GetBytes(\&quot;mySecret\&quot;); var publicKey &#x3D; Convert.FromBase64String(\&quot;2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU&#x3D;\&quot;);  var sealedPublicKeyBox &#x3D; Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);  Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox)); &#x60;&#x60;&#x60;  #### Example encrypting a secret using Ruby  Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.  &#x60;&#x60;&#x60;ruby require \&quot;rbnacl\&quot; require \&quot;base64\&quot;  key &#x3D; Base64.decode64(\&quot;+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0&#x3D;\&quot;) public_key &#x3D; RbNaCl::PublicKey.new(key)  box &#x3D; RbNaCl::Boxes::Sealed.from_public_key(public_key) encrypted_secret &#x3D; box.encrypt(\&quot;my_secret\&quot;)  # Print the base64 encoded secret puts Base64.strict_encode64(encrypted_secret) &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    Integer repositoryId = 56; // Integer | The unique identifier of the repository.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    String secretName = "secretName_example"; // String | The name of the secret.
    ActionsCreateOrUpdateEnvironmentSecretRequest actionsCreateOrUpdateEnvironmentSecretRequest = new ActionsCreateOrUpdateEnvironmentSecretRequest(); // ActionsCreateOrUpdateEnvironmentSecretRequest | 
    try {
      Object result = apiInstance.actionsCreateOrUpdateEnvironmentSecret(repositoryId, environmentName, secretName, actionsCreateOrUpdateEnvironmentSecretRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsCreateOrUpdateEnvironmentSecret");
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
| **repositoryId** | **Integer**| The unique identifier of the repository. | |
| **environmentName** | **String**| The name of the environment. | |
| **secretName** | **String**| The name of the secret. | |
| **actionsCreateOrUpdateEnvironmentSecretRequest** | [**ActionsCreateOrUpdateEnvironmentSecretRequest**](ActionsCreateOrUpdateEnvironmentSecretRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response when creating a secret |  -  |
| **204** | Response when updating a secret |  -  |

<a name="actionsCreateOrUpdateOrgSecret"></a>
# **actionsCreateOrUpdateOrgSecret**
> Object actionsCreateOrUpdateOrgSecret(org, secretName, actionsCreateOrUpdateOrgSecretRequest)

Create or update an organization secret

Creates or updates an organization secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; organization permission to use this endpoint.  #### Example encrypting a secret using Node.js  Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.  &#x60;&#x60;&#x60; const sodium &#x3D; require(&#39;libsodium-wrappers&#39;) const secret &#x3D; &#39;plain-text-secret&#39; // replace with the secret you want to encrypt const key &#x3D; &#39;base64-encoded-public-key&#39; // replace with the Base64 encoded public key  //Check if libsodium is ready and then proceed. sodium.ready.then(() &#x3D;&gt; {   // Convert Secret &amp; Base64 key to Uint8Array.   let binkey &#x3D; sodium.from_base64(key, sodium.base64_variants.ORIGINAL)   let binsec &#x3D; sodium.from_string(secret)    //Encrypt the secret using LibSodium   let encBytes &#x3D; sodium.crypto_box_seal(binsec, binkey)    // Convert encrypted Uint8Array to Base64   let output &#x3D; sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)    console.log(output) }); &#x60;&#x60;&#x60;  #### Example encrypting a secret using Python  Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.  &#x60;&#x60;&#x60; from base64 import b64encode from nacl import encoding, public  def encrypt(public_key: str, secret_value: str) -&gt; str:   \&quot;\&quot;\&quot;Encrypt a Unicode string using the public key.\&quot;\&quot;\&quot;   public_key &#x3D; public.PublicKey(public_key.encode(\&quot;utf-8\&quot;), encoding.Base64Encoder())   sealed_box &#x3D; public.SealedBox(public_key)   encrypted &#x3D; sealed_box.encrypt(secret_value.encode(\&quot;utf-8\&quot;))   return b64encode(encrypted).decode(\&quot;utf-8\&quot;) &#x60;&#x60;&#x60;  #### Example encrypting a secret using C#  Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.  &#x60;&#x60;&#x60; var secretValue &#x3D; System.Text.Encoding.UTF8.GetBytes(\&quot;mySecret\&quot;); var publicKey &#x3D; Convert.FromBase64String(\&quot;2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU&#x3D;\&quot;);  var sealedPublicKeyBox &#x3D; Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);  Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox)); &#x60;&#x60;&#x60;  #### Example encrypting a secret using Ruby  Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.  &#x60;&#x60;&#x60;ruby require \&quot;rbnacl\&quot; require \&quot;base64\&quot;  key &#x3D; Base64.decode64(\&quot;+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0&#x3D;\&quot;) public_key &#x3D; RbNaCl::PublicKey.new(key)  box &#x3D; RbNaCl::Boxes::Sealed.from_public_key(public_key) encrypted_secret &#x3D; box.encrypt(\&quot;my_secret\&quot;)  # Print the base64 encoded secret puts Base64.strict_encode64(encrypted_secret) &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    ActionsCreateOrUpdateOrgSecretRequest actionsCreateOrUpdateOrgSecretRequest = new ActionsCreateOrUpdateOrgSecretRequest(); // ActionsCreateOrUpdateOrgSecretRequest | 
    try {
      Object result = apiInstance.actionsCreateOrUpdateOrgSecret(org, secretName, actionsCreateOrUpdateOrgSecretRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsCreateOrUpdateOrgSecret");
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
| **secretName** | **String**| The name of the secret. | |
| **actionsCreateOrUpdateOrgSecretRequest** | [**ActionsCreateOrUpdateOrgSecretRequest**](ActionsCreateOrUpdateOrgSecretRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response when creating a secret |  -  |
| **204** | Response when updating a secret |  -  |

<a name="actionsCreateOrUpdateRepoSecret"></a>
# **actionsCreateOrUpdateRepoSecret**
> Object actionsCreateOrUpdateRepoSecret(owner, repo, secretName, actionsCreateOrUpdateRepoSecretRequest)

Create or update a repository secret

Creates or updates a repository secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; repository permission to use this endpoint.  #### Example encrypting a secret using Node.js  Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.  &#x60;&#x60;&#x60; const sodium &#x3D; require(&#39;libsodium-wrappers&#39;) const secret &#x3D; &#39;plain-text-secret&#39; // replace with the secret you want to encrypt const key &#x3D; &#39;base64-encoded-public-key&#39; // replace with the Base64 encoded public key  //Check if libsodium is ready and then proceed. sodium.ready.then(() &#x3D;&gt; {   // Convert Secret &amp; Base64 key to Uint8Array.   let binkey &#x3D; sodium.from_base64(key, sodium.base64_variants.ORIGINAL)   let binsec &#x3D; sodium.from_string(secret)    //Encrypt the secret using LibSodium   let encBytes &#x3D; sodium.crypto_box_seal(binsec, binkey)    // Convert encrypted Uint8Array to Base64   let output &#x3D; sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)    console.log(output) }); &#x60;&#x60;&#x60;  #### Example encrypting a secret using Python  Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.  &#x60;&#x60;&#x60; from base64 import b64encode from nacl import encoding, public  def encrypt(public_key: str, secret_value: str) -&gt; str:   \&quot;\&quot;\&quot;Encrypt a Unicode string using the public key.\&quot;\&quot;\&quot;   public_key &#x3D; public.PublicKey(public_key.encode(\&quot;utf-8\&quot;), encoding.Base64Encoder())   sealed_box &#x3D; public.SealedBox(public_key)   encrypted &#x3D; sealed_box.encrypt(secret_value.encode(\&quot;utf-8\&quot;))   return b64encode(encrypted).decode(\&quot;utf-8\&quot;) &#x60;&#x60;&#x60;  #### Example encrypting a secret using C#  Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.  &#x60;&#x60;&#x60; var secretValue &#x3D; System.Text.Encoding.UTF8.GetBytes(\&quot;mySecret\&quot;); var publicKey &#x3D; Convert.FromBase64String(\&quot;2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU&#x3D;\&quot;);  var sealedPublicKeyBox &#x3D; Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);  Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox)); &#x60;&#x60;&#x60;  #### Example encrypting a secret using Ruby  Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.  &#x60;&#x60;&#x60;ruby require \&quot;rbnacl\&quot; require \&quot;base64\&quot;  key &#x3D; Base64.decode64(\&quot;+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0&#x3D;\&quot;) public_key &#x3D; RbNaCl::PublicKey.new(key)  box &#x3D; RbNaCl::Boxes::Sealed.from_public_key(public_key) encrypted_secret &#x3D; box.encrypt(\&quot;my_secret\&quot;)  # Print the base64 encoded secret puts Base64.strict_encode64(encrypted_secret) &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    ActionsCreateOrUpdateRepoSecretRequest actionsCreateOrUpdateRepoSecretRequest = new ActionsCreateOrUpdateRepoSecretRequest(); // ActionsCreateOrUpdateRepoSecretRequest | 
    try {
      Object result = apiInstance.actionsCreateOrUpdateRepoSecret(owner, repo, secretName, actionsCreateOrUpdateRepoSecretRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsCreateOrUpdateRepoSecret");
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
| **secretName** | **String**| The name of the secret. | |
| **actionsCreateOrUpdateRepoSecretRequest** | [**ActionsCreateOrUpdateRepoSecretRequest**](ActionsCreateOrUpdateRepoSecretRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response when creating a secret |  -  |
| **204** | Response when updating a secret |  -  |

<a name="actionsCreateOrgVariable"></a>
# **actionsCreateOrgVariable**
> Object actionsCreateOrgVariable(org, actionsCreateOrgVariableRequest)

Create an organization variable

Creates an organization variable that you can reference in a GitHub Actions workflow. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;organization_actions_variables:write&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    ActionsCreateOrgVariableRequest actionsCreateOrgVariableRequest = new ActionsCreateOrgVariableRequest(); // ActionsCreateOrgVariableRequest | 
    try {
      Object result = apiInstance.actionsCreateOrgVariable(org, actionsCreateOrgVariableRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsCreateOrgVariable");
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
| **actionsCreateOrgVariableRequest** | [**ActionsCreateOrgVariableRequest**](ActionsCreateOrgVariableRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response when creating a variable |  -  |

<a name="actionsCreateRegistrationTokenForOrg"></a>
# **actionsCreateRegistrationTokenForOrg**
> AuthenticationToken actionsCreateRegistrationTokenForOrg(org)

Create a registration token for an organization

Returns a token that you can pass to the &#x60;config&#x60; script. The token expires after one hour.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.  #### Example using registration token  Configure your self-hosted runner, replacing &#x60;TOKEN&#x60; with the registration token provided by this endpoint.  &#x60;&#x60;&#x60; ./config.sh --url https://github.com/octo-org --token TOKEN &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      AuthenticationToken result = apiInstance.actionsCreateRegistrationTokenForOrg(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsCreateRegistrationTokenForOrg");
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

[**AuthenticationToken**](AuthenticationToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |

<a name="actionsCreateRegistrationTokenForRepo"></a>
# **actionsCreateRegistrationTokenForRepo**
> AuthenticationToken actionsCreateRegistrationTokenForRepo(owner, repo)

Create a registration token for a repository

Returns a token that you can pass to the &#x60;config&#x60; script. The token expires after one hour. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint.  #### Example using registration token   Configure your self-hosted runner, replacing &#x60;TOKEN&#x60; with the registration token provided by this endpoint.  &#x60;&#x60;&#x60; ./config.sh --url https://github.com/octo-org/octo-repo-artifacts --token TOKEN &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      AuthenticationToken result = apiInstance.actionsCreateRegistrationTokenForRepo(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsCreateRegistrationTokenForRepo");
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

[**AuthenticationToken**](AuthenticationToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |

<a name="actionsCreateRemoveTokenForOrg"></a>
# **actionsCreateRemoveTokenForOrg**
> AuthenticationToken actionsCreateRemoveTokenForOrg(org)

Create a remove token for an organization

Returns a token that you can pass to the &#x60;config&#x60; script to remove a self-hosted runner from an organization. The token expires after one hour.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.  #### Example using remove token  To remove your self-hosted runner from an organization, replace &#x60;TOKEN&#x60; with the remove token provided by this endpoint.  &#x60;&#x60;&#x60; ./config.sh remove --token TOKEN &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      AuthenticationToken result = apiInstance.actionsCreateRemoveTokenForOrg(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsCreateRemoveTokenForOrg");
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

[**AuthenticationToken**](AuthenticationToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |

<a name="actionsCreateRemoveTokenForRepo"></a>
# **actionsCreateRemoveTokenForRepo**
> AuthenticationToken actionsCreateRemoveTokenForRepo(owner, repo)

Create a remove token for a repository

Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint.  #### Example using remove token   To remove your self-hosted runner from a repository, replace TOKEN with the remove token provided by this endpoint.  &#x60;&#x60;&#x60; ./config.sh remove --token TOKEN &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      AuthenticationToken result = apiInstance.actionsCreateRemoveTokenForRepo(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsCreateRemoveTokenForRepo");
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

[**AuthenticationToken**](AuthenticationToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |

<a name="actionsCreateRepoVariable"></a>
# **actionsCreateRepoVariable**
> Object actionsCreateRepoVariable(owner, repo, actionsCreateRepoVariableRequest)

Create a repository variable

Creates a repository variable that you can reference in a GitHub Actions workflow. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions_variables:write&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ActionsCreateRepoVariableRequest actionsCreateRepoVariableRequest = new ActionsCreateRepoVariableRequest(); // ActionsCreateRepoVariableRequest | 
    try {
      Object result = apiInstance.actionsCreateRepoVariable(owner, repo, actionsCreateRepoVariableRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsCreateRepoVariable");
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
| **actionsCreateRepoVariableRequest** | [**ActionsCreateRepoVariableRequest**](ActionsCreateRepoVariableRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |

<a name="actionsCreateRequiredWorkflow"></a>
# **actionsCreateRequiredWorkflow**
> RequiredWorkflow actionsCreateRequiredWorkflow(org, actionsCreateRequiredWorkflowRequest)

Create a required workflow

Create a required workflow in an organization.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.  For more information, see \&quot;[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    ActionsCreateRequiredWorkflowRequest actionsCreateRequiredWorkflowRequest = new ActionsCreateRequiredWorkflowRequest(); // ActionsCreateRequiredWorkflowRequest | 
    try {
      RequiredWorkflow result = apiInstance.actionsCreateRequiredWorkflow(org, actionsCreateRequiredWorkflowRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsCreateRequiredWorkflow");
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
| **actionsCreateRequiredWorkflowRequest** | [**ActionsCreateRequiredWorkflowRequest**](ActionsCreateRequiredWorkflowRequest.md)|  | |

### Return type

[**RequiredWorkflow**](RequiredWorkflow.md)

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

<a name="actionsCreateWorkflowDispatch"></a>
# **actionsCreateWorkflowDispatch**
> actionsCreateWorkflowDispatch(owner, repo, workflowId, actionsCreateWorkflowDispatchRequest)

Create a workflow dispatch event

You can use this endpoint to manually trigger a GitHub Actions workflow run. You can replace &#x60;workflow_id&#x60; with the workflow file name. For example, you could use &#x60;main.yaml&#x60;.  You must configure your GitHub Actions workflow to run when the [&#x60;workflow_dispatch&#x60; webhook](/developers/webhooks-and-events/webhook-events-and-payloads#workflow_dispatch) event occurs. The &#x60;inputs&#x60; are configured in the workflow file. For more information about how to configure the &#x60;workflow_dispatch&#x60; event in the workflow file, see \&quot;[Events that trigger workflows](/actions/reference/events-that-trigger-workflows#workflow_dispatch).\&quot;  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions:write&#x60; permission to use this endpoint. For more information, see \&quot;[Creating a personal access token for the command line](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ActionsGetWorkflowWorkflowIdParameter workflowId = new ActionsGetWorkflowWorkflowIdParameter(); // ActionsGetWorkflowWorkflowIdParameter | The ID of the workflow. You can also pass the workflow file name as a string.
    ActionsCreateWorkflowDispatchRequest actionsCreateWorkflowDispatchRequest = new ActionsCreateWorkflowDispatchRequest(); // ActionsCreateWorkflowDispatchRequest | 
    try {
      apiInstance.actionsCreateWorkflowDispatch(owner, repo, workflowId, actionsCreateWorkflowDispatchRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsCreateWorkflowDispatch");
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
| **workflowId** | [**ActionsGetWorkflowWorkflowIdParameter**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. | |
| **actionsCreateWorkflowDispatchRequest** | [**ActionsCreateWorkflowDispatchRequest**](ActionsCreateWorkflowDispatchRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="actionsDeleteActionsCacheById"></a>
# **actionsDeleteActionsCacheById**
> actionsDeleteActionsCacheById(owner, repo, cacheId)

Delete a GitHub Actions cache for a repository (using a cache ID)

Deletes a GitHub Actions cache for a repository, using a cache ID.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint.  GitHub Apps must have the &#x60;actions:write&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer cacheId = 56; // Integer | The unique identifier of the GitHub Actions cache.
    try {
      apiInstance.actionsDeleteActionsCacheById(owner, repo, cacheId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDeleteActionsCacheById");
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
| **cacheId** | **Integer**| The unique identifier of the GitHub Actions cache. | |

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

<a name="actionsDeleteActionsCacheByKey"></a>
# **actionsDeleteActionsCacheByKey**
> ActionsCacheList actionsDeleteActionsCacheByKey(owner, repo, key, ref)

Delete GitHub Actions caches for a repository (using a cache key)

Deletes one or more GitHub Actions caches for a repository, using a complete cache key. By default, all caches that match the provided key are deleted, but you can optionally provide a Git ref to restrict deletions to caches that match both the provided key and the Git ref.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint.  GitHub Apps must have the &#x60;actions:write&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String key = "key_example"; // String | A key for identifying the cache.
    String ref = "ref_example"; // String | The full Git reference for narrowing down the cache. The `ref` for a branch should be formatted as `refs/heads/<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
    try {
      ActionsCacheList result = apiInstance.actionsDeleteActionsCacheByKey(owner, repo, key, ref);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDeleteActionsCacheByKey");
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
| **key** | **String**| A key for identifying the cache. | |
| **ref** | **String**| The full Git reference for narrowing down the cache. The &#x60;ref&#x60; for a branch should be formatted as &#x60;refs/heads/&lt;branch name&gt;&#x60;. To reference a pull request use &#x60;refs/pull/&lt;number&gt;/merge&#x60;. | [optional] |

### Return type

[**ActionsCacheList**](ActionsCacheList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsDeleteArtifact"></a>
# **actionsDeleteArtifact**
> actionsDeleteArtifact(owner, repo, artifactId)

Delete an artifact

Deletes an artifact for a workflow run. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions:write&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer artifactId = 56; // Integer | The unique identifier of the artifact.
    try {
      apiInstance.actionsDeleteArtifact(owner, repo, artifactId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDeleteArtifact");
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
| **artifactId** | **Integer**| The unique identifier of the artifact. | |

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

<a name="actionsDeleteEnvironmentSecret"></a>
# **actionsDeleteEnvironmentSecret**
> actionsDeleteEnvironmentSecret(repositoryId, environmentName, secretName)

Delete an environment secret

Deletes a secret in an environment using the secret name. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    Integer repositoryId = 56; // Integer | The unique identifier of the repository.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      apiInstance.actionsDeleteEnvironmentSecret(repositoryId, environmentName, secretName);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDeleteEnvironmentSecret");
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
| **repositoryId** | **Integer**| The unique identifier of the repository. | |
| **environmentName** | **String**| The name of the environment. | |
| **secretName** | **String**| The name of the secret. | |

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

<a name="actionsDeleteEnvironmentVariable"></a>
# **actionsDeleteEnvironmentVariable**
> actionsDeleteEnvironmentVariable(repositoryId, name, environmentName)

Delete an environment variable

Deletes an environment variable using the variable name. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;environment:write&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    Integer repositoryId = 56; // Integer | The unique identifier of the repository.
    String name = "name_example"; // String | The name of the variable.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    try {
      apiInstance.actionsDeleteEnvironmentVariable(repositoryId, name, environmentName);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDeleteEnvironmentVariable");
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
| **repositoryId** | **Integer**| The unique identifier of the repository. | |
| **name** | **String**| The name of the variable. | |
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
| **204** | Response |  -  |

<a name="actionsDeleteOrgSecret"></a>
# **actionsDeleteOrgSecret**
> actionsDeleteOrgSecret(org, secretName)

Delete an organization secret

Deletes a secret in an organization using the secret name. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      apiInstance.actionsDeleteOrgSecret(org, secretName);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDeleteOrgSecret");
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
| **secretName** | **String**| The name of the secret. | |

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

<a name="actionsDeleteOrgVariable"></a>
# **actionsDeleteOrgVariable**
> actionsDeleteOrgVariable(org, name)

Delete an organization variable

Deletes an organization variable using the variable name. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;organization_actions_variables:write&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String name = "name_example"; // String | The name of the variable.
    try {
      apiInstance.actionsDeleteOrgVariable(org, name);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDeleteOrgVariable");
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
| **name** | **String**| The name of the variable. | |

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

<a name="actionsDeleteRepoSecret"></a>
# **actionsDeleteRepoSecret**
> actionsDeleteRepoSecret(owner, repo, secretName)

Delete a repository secret

Deletes a secret in a repository using the secret name. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      apiInstance.actionsDeleteRepoSecret(owner, repo, secretName);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDeleteRepoSecret");
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
| **secretName** | **String**| The name of the secret. | |

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

<a name="actionsDeleteRepoVariable"></a>
# **actionsDeleteRepoVariable**
> actionsDeleteRepoVariable(owner, repo, name)

Delete a repository variable

Deletes a repository variable using the variable name. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions_variables:write&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String name = "name_example"; // String | The name of the variable.
    try {
      apiInstance.actionsDeleteRepoVariable(owner, repo, name);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDeleteRepoVariable");
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
| **name** | **String**| The name of the variable. | |

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

<a name="actionsDeleteRequiredWorkflow"></a>
# **actionsDeleteRequiredWorkflow**
> actionsDeleteRequiredWorkflow(org, requiredWorkflowId)

Delete a required workflow

Deletes a required workflow configured in an organization.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.  For more information, see \&quot;[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer requiredWorkflowId = 56; // Integer | The unique identifier of the required workflow.
    try {
      apiInstance.actionsDeleteRequiredWorkflow(org, requiredWorkflowId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDeleteRequiredWorkflow");
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
| **requiredWorkflowId** | **Integer**| The unique identifier of the required workflow. | |

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

<a name="actionsDeleteSelfHostedRunnerFromOrg"></a>
# **actionsDeleteSelfHostedRunnerFromOrg**
> actionsDeleteSelfHostedRunnerFromOrg(org, runnerId)

Delete a self-hosted runner from an organization

Forces the removal of a self-hosted runner from an organization. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer runnerId = 56; // Integer | Unique identifier of the self-hosted runner.
    try {
      apiInstance.actionsDeleteSelfHostedRunnerFromOrg(org, runnerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDeleteSelfHostedRunnerFromOrg");
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
| **runnerId** | **Integer**| Unique identifier of the self-hosted runner. | |

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

<a name="actionsDeleteSelfHostedRunnerFromRepo"></a>
# **actionsDeleteSelfHostedRunnerFromRepo**
> actionsDeleteSelfHostedRunnerFromRepo(owner, repo, runnerId)

Delete a self-hosted runner from a repository

Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runnerId = 56; // Integer | Unique identifier of the self-hosted runner.
    try {
      apiInstance.actionsDeleteSelfHostedRunnerFromRepo(owner, repo, runnerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDeleteSelfHostedRunnerFromRepo");
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
| **runnerId** | **Integer**| Unique identifier of the self-hosted runner. | |

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

<a name="actionsDeleteWorkflowRun"></a>
# **actionsDeleteWorkflowRun**
> actionsDeleteWorkflowRun(owner, repo, runId)

Delete a workflow run

Delete a specific workflow run. Anyone with write access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:write&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    try {
      apiInstance.actionsDeleteWorkflowRun(owner, repo, runId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDeleteWorkflowRun");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |

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

<a name="actionsDeleteWorkflowRunLogs"></a>
# **actionsDeleteWorkflowRunLogs**
> actionsDeleteWorkflowRunLogs(owner, repo, runId)

Delete workflow run logs

Deletes all logs for a workflow run. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions:write&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    try {
      apiInstance.actionsDeleteWorkflowRunLogs(owner, repo, runId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDeleteWorkflowRunLogs");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |

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
| **500** | Internal Error |  -  |

<a name="actionsDisableSelectedRepositoryGithubActionsOrganization"></a>
# **actionsDisableSelectedRepositoryGithubActionsOrganization**
> actionsDisableSelectedRepositoryGithubActionsOrganization(org, repositoryId)

Disable a selected repository for GitHub Actions in an organization

Removes a repository from the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for &#x60;enabled_repositories&#x60; must be configured to &#x60;selected&#x60;. For more information, see \&quot;[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\&quot;  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration&#x60; organization permission to use this API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer repositoryId = 56; // Integer | The unique identifier of the repository.
    try {
      apiInstance.actionsDisableSelectedRepositoryGithubActionsOrganization(org, repositoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDisableSelectedRepositoryGithubActionsOrganization");
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
| **repositoryId** | **Integer**| The unique identifier of the repository. | |

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

<a name="actionsDisableWorkflow"></a>
# **actionsDisableWorkflow**
> actionsDisableWorkflow(owner, repo, workflowId)

Disable a workflow

Disables a workflow and sets the &#x60;state&#x60; of the workflow to &#x60;disabled_manually&#x60;. You can replace &#x60;workflow_id&#x60; with the workflow file name. For example, you could use &#x60;main.yaml&#x60;.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions:write&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ActionsGetWorkflowWorkflowIdParameter workflowId = new ActionsGetWorkflowWorkflowIdParameter(); // ActionsGetWorkflowWorkflowIdParameter | The ID of the workflow. You can also pass the workflow file name as a string.
    try {
      apiInstance.actionsDisableWorkflow(owner, repo, workflowId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDisableWorkflow");
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
| **workflowId** | [**ActionsGetWorkflowWorkflowIdParameter**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. | |

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

<a name="actionsDownloadArtifact"></a>
# **actionsDownloadArtifact**
> actionsDownloadArtifact(owner, repo, artifactId, archiveFormat)

Download an artifact

Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for &#x60;Location:&#x60; in the response header to find the URL for the download. The &#x60;:archive_format&#x60; must be &#x60;zip&#x60;. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer artifactId = 56; // Integer | The unique identifier of the artifact.
    String archiveFormat = "archiveFormat_example"; // String | 
    try {
      apiInstance.actionsDownloadArtifact(owner, repo, artifactId, archiveFormat);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDownloadArtifact");
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
| **artifactId** | **Integer**| The unique identifier of the artifact. | |
| **archiveFormat** | **String**|  | |

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
| **302** | Response |  * Location -  <br>  |
| **410** | Gone |  -  |

<a name="actionsDownloadJobLogsForWorkflowRun"></a>
# **actionsDownloadJobLogsForWorkflowRun**
> actionsDownloadJobLogsForWorkflowRun(owner, repo, jobId)

Download job logs for a workflow run

Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look for &#x60;Location:&#x60; in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer jobId = 56; // Integer | The unique identifier of the job.
    try {
      apiInstance.actionsDownloadJobLogsForWorkflowRun(owner, repo, jobId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDownloadJobLogsForWorkflowRun");
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
| **jobId** | **Integer**| The unique identifier of the job. | |

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

<a name="actionsDownloadWorkflowRunAttemptLogs"></a>
# **actionsDownloadWorkflowRunAttemptLogs**
> actionsDownloadWorkflowRunAttemptLogs(owner, repo, runId, attemptNumber)

Download workflow run attempt logs

Gets a redirect URL to download an archive of log files for a specific workflow run attempt. This link expires after 1 minute. Look for &#x60;Location:&#x60; in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    Integer attemptNumber = 56; // Integer | The attempt number of the workflow run.
    try {
      apiInstance.actionsDownloadWorkflowRunAttemptLogs(owner, repo, runId, attemptNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDownloadWorkflowRunAttemptLogs");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |
| **attemptNumber** | **Integer**| The attempt number of the workflow run. | |

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

<a name="actionsDownloadWorkflowRunLogs"></a>
# **actionsDownloadWorkflowRunLogs**
> actionsDownloadWorkflowRunLogs(owner, repo, runId)

Download workflow run logs

Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for &#x60;Location:&#x60; in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    try {
      apiInstance.actionsDownloadWorkflowRunLogs(owner, repo, runId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsDownloadWorkflowRunLogs");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |

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

<a name="actionsEnableSelectedRepositoryGithubActionsOrganization"></a>
# **actionsEnableSelectedRepositoryGithubActionsOrganization**
> actionsEnableSelectedRepositoryGithubActionsOrganization(org, repositoryId)

Enable a selected repository for GitHub Actions in an organization

Adds a repository to the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for &#x60;enabled_repositories&#x60; must be must be configured to &#x60;selected&#x60;. For more information, see \&quot;[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\&quot;  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration&#x60; organization permission to use this API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer repositoryId = 56; // Integer | The unique identifier of the repository.
    try {
      apiInstance.actionsEnableSelectedRepositoryGithubActionsOrganization(org, repositoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsEnableSelectedRepositoryGithubActionsOrganization");
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
| **repositoryId** | **Integer**| The unique identifier of the repository. | |

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

<a name="actionsEnableWorkflow"></a>
# **actionsEnableWorkflow**
> actionsEnableWorkflow(owner, repo, workflowId)

Enable a workflow

Enables a workflow and sets the &#x60;state&#x60; of the workflow to &#x60;active&#x60;. You can replace &#x60;workflow_id&#x60; with the workflow file name. For example, you could use &#x60;main.yaml&#x60;.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions:write&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ActionsGetWorkflowWorkflowIdParameter workflowId = new ActionsGetWorkflowWorkflowIdParameter(); // ActionsGetWorkflowWorkflowIdParameter | The ID of the workflow. You can also pass the workflow file name as a string.
    try {
      apiInstance.actionsEnableWorkflow(owner, repo, workflowId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsEnableWorkflow");
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
| **workflowId** | [**ActionsGetWorkflowWorkflowIdParameter**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. | |

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

<a name="actionsGetActionsCacheList"></a>
# **actionsGetActionsCacheList**
> ActionsCacheList actionsGetActionsCacheList(owner, repo, perPage, page, ref, key, sort, direction)

List GitHub Actions caches for a repository

Lists the GitHub Actions caches for a repository. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    String ref = "ref_example"; // String | The full Git reference for narrowing down the cache. The `ref` for a branch should be formatted as `refs/heads/<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
    String key = "key_example"; // String | An explicit key or prefix for identifying the cache
    String sort = "created_at"; // String | The property to sort the results by. `created_at` means when the cache was created. `last_accessed_at` means when the cache was last accessed. `size_in_bytes` is the size of the cache in bytes.
    String direction = "asc"; // String | The direction to sort the results by.
    try {
      ActionsCacheList result = apiInstance.actionsGetActionsCacheList(owner, repo, perPage, page, ref, key, sort, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetActionsCacheList");
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
| **ref** | **String**| The full Git reference for narrowing down the cache. The &#x60;ref&#x60; for a branch should be formatted as &#x60;refs/heads/&lt;branch name&gt;&#x60;. To reference a pull request use &#x60;refs/pull/&lt;number&gt;/merge&#x60;. | [optional] |
| **key** | **String**| An explicit key or prefix for identifying the cache | [optional] |
| **sort** | **String**| The property to sort the results by. &#x60;created_at&#x60; means when the cache was created. &#x60;last_accessed_at&#x60; means when the cache was last accessed. &#x60;size_in_bytes&#x60; is the size of the cache in bytes. | [optional] [default to last_accessed_at] [enum: created_at, last_accessed_at, size_in_bytes] |
| **direction** | **String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**ActionsCacheList**](ActionsCacheList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsGetActionsCacheUsage"></a>
# **actionsGetActionsCacheUsage**
> ActionsCacheUsageByRepository actionsGetActionsCacheUsage(owner, repo)

Get GitHub Actions cache usage for a repository

Gets GitHub Actions cache usage for a repository. The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated. Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      ActionsCacheUsageByRepository result = apiInstance.actionsGetActionsCacheUsage(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetActionsCacheUsage");
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

[**ActionsCacheUsageByRepository**](ActionsCacheUsageByRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetActionsCacheUsageByRepoForOrg"></a>
# **actionsGetActionsCacheUsageByRepoForOrg**
> ActionsGetActionsCacheUsageByRepoForOrg200Response actionsGetActionsCacheUsageByRepoForOrg(org, perPage, page)

List repositories with GitHub Actions cache usage for an organization

Lists repositories and their GitHub Actions cache usage for an organization. The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated. You must authenticate using an access token with the &#x60;read:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;organization_admistration:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsGetActionsCacheUsageByRepoForOrg200Response result = apiInstance.actionsGetActionsCacheUsageByRepoForOrg(org, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetActionsCacheUsageByRepoForOrg");
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
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**ActionsGetActionsCacheUsageByRepoForOrg200Response**](ActionsGetActionsCacheUsageByRepoForOrg200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsGetActionsCacheUsageForOrg"></a>
# **actionsGetActionsCacheUsageForOrg**
> ActionsCacheUsageOrgEnterprise actionsGetActionsCacheUsageForOrg(org)

Get GitHub Actions cache usage for an organization

Gets the total GitHub Actions cache usage for an organization. The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated. You must authenticate using an access token with the &#x60;read:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;organization_admistration:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      ActionsCacheUsageOrgEnterprise result = apiInstance.actionsGetActionsCacheUsageForOrg(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetActionsCacheUsageForOrg");
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

[**ActionsCacheUsageOrgEnterprise**](ActionsCacheUsageOrgEnterprise.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsGetAllowedActionsOrganization"></a>
# **actionsGetAllowedActionsOrganization**
> SelectedActions actionsGetAllowedActionsOrganization(org)

Get allowed actions and reusable workflows for an organization

Gets the selected actions and reusable workflows that are allowed in an organization. To use this endpoint, the organization permission policy for &#x60;allowed_actions&#x60; must be configured to &#x60;selected&#x60;. For more information, see \&quot;[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\&quot;\&quot;  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration&#x60; organization permission to use this API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      SelectedActions result = apiInstance.actionsGetAllowedActionsOrganization(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetAllowedActionsOrganization");
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

[**SelectedActions**](SelectedActions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetAllowedActionsRepository"></a>
# **actionsGetAllowedActionsRepository**
> SelectedActions actionsGetAllowedActionsRepository(owner, repo)

Get allowed actions and reusable workflows for a repository

Gets the settings for selected actions and reusable workflows that are allowed in a repository. To use this endpoint, the repository policy for &#x60;allowed_actions&#x60; must be configured to &#x60;selected&#x60;. For more information, see \&quot;[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository).\&quot;  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration&#x60; repository permission to use this API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      SelectedActions result = apiInstance.actionsGetAllowedActionsRepository(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetAllowedActionsRepository");
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

[**SelectedActions**](SelectedActions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetArtifact"></a>
# **actionsGetArtifact**
> Artifact actionsGetArtifact(owner, repo, artifactId)

Get an artifact

Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer artifactId = 56; // Integer | The unique identifier of the artifact.
    try {
      Artifact result = apiInstance.actionsGetArtifact(owner, repo, artifactId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetArtifact");
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
| **artifactId** | **Integer**| The unique identifier of the artifact. | |

### Return type

[**Artifact**](Artifact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetCustomOidcSubClaimForRepo"></a>
# **actionsGetCustomOidcSubClaimForRepo**
> OidcCustomSubRepo actionsGetCustomOidcSubClaimForRepo(owner, repo)

Get the customization template for an OIDC subject claim for a repository

Gets the customization template for an OpenID Connect (OIDC) subject claim. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;organization_administration:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      OidcCustomSubRepo result = apiInstance.actionsGetCustomOidcSubClaimForRepo(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetCustomOidcSubClaimForRepo");
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

[**OidcCustomSubRepo**](OidcCustomSubRepo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status response |  -  |
| **400** | Bad Request |  -  |
| **404** | Resource not found |  -  |

<a name="actionsGetEnvironmentPublicKey"></a>
# **actionsGetEnvironmentPublicKey**
> ActionsPublicKey actionsGetEnvironmentPublicKey(repositoryId, environmentName)

Get an environment public key

Get the public key for an environment, which you need to encrypt environment secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    Integer repositoryId = 56; // Integer | The unique identifier of the repository.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    try {
      ActionsPublicKey result = apiInstance.actionsGetEnvironmentPublicKey(repositoryId, environmentName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetEnvironmentPublicKey");
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
| **repositoryId** | **Integer**| The unique identifier of the repository. | |
| **environmentName** | **String**| The name of the environment. | |

### Return type

[**ActionsPublicKey**](ActionsPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetEnvironmentSecret"></a>
# **actionsGetEnvironmentSecret**
> ActionsSecret actionsGetEnvironmentSecret(repositoryId, environmentName, secretName)

Get an environment secret

Gets a single environment secret without revealing its encrypted value. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    Integer repositoryId = 56; // Integer | The unique identifier of the repository.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      ActionsSecret result = apiInstance.actionsGetEnvironmentSecret(repositoryId, environmentName, secretName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetEnvironmentSecret");
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
| **repositoryId** | **Integer**| The unique identifier of the repository. | |
| **environmentName** | **String**| The name of the environment. | |
| **secretName** | **String**| The name of the secret. | |

### Return type

[**ActionsSecret**](ActionsSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetEnvironmentVariable"></a>
# **actionsGetEnvironmentVariable**
> ActionsVariable actionsGetEnvironmentVariable(repositoryId, environmentName, name)

Get an environment variable

Gets a specific variable in an environment. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;environments:read&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    Integer repositoryId = 56; // Integer | The unique identifier of the repository.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    String name = "name_example"; // String | The name of the variable.
    try {
      ActionsVariable result = apiInstance.actionsGetEnvironmentVariable(repositoryId, environmentName, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetEnvironmentVariable");
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
| **repositoryId** | **Integer**| The unique identifier of the repository. | |
| **environmentName** | **String**| The name of the environment. | |
| **name** | **String**| The name of the variable. | |

### Return type

[**ActionsVariable**](ActionsVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetGithubActionsDefaultWorkflowPermissionsOrganization"></a>
# **actionsGetGithubActionsDefaultWorkflowPermissionsOrganization**
> ActionsGetDefaultWorkflowPermissions actionsGetGithubActionsDefaultWorkflowPermissionsOrganization(org)

Get default workflow permissions for an organization

Gets the default workflow permissions granted to the &#x60;GITHUB_TOKEN&#x60; when running workflows in an organization, as well as whether GitHub Actions can submit approving pull request reviews. For more information, see \&quot;[Setting the permissions of the GITHUB_TOKEN for your organization](https://docs.github.com/organizations/managing-organization-settings/disabling-or-limiting-github-actions-for-your-organization#setting-the-permissions-of-the-github_token-for-your-organization).\&quot;  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration&#x60; organization permission to use this API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      ActionsGetDefaultWorkflowPermissions result = apiInstance.actionsGetGithubActionsDefaultWorkflowPermissionsOrganization(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetGithubActionsDefaultWorkflowPermissionsOrganization");
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

[**ActionsGetDefaultWorkflowPermissions**](ActionsGetDefaultWorkflowPermissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetGithubActionsDefaultWorkflowPermissionsRepository"></a>
# **actionsGetGithubActionsDefaultWorkflowPermissionsRepository**
> ActionsGetDefaultWorkflowPermissions actionsGetGithubActionsDefaultWorkflowPermissionsRepository(owner, repo)

Get default workflow permissions for a repository

Gets the default workflow permissions granted to the &#x60;GITHUB_TOKEN&#x60; when running workflows in a repository, as well as if GitHub Actions can submit approving pull request reviews. For more information, see \&quot;[Setting the permissions of the GITHUB_TOKEN for your repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#setting-the-permissions-of-the-github_token-for-your-repository).\&quot;  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the repository &#x60;administration&#x60; permission to use this API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      ActionsGetDefaultWorkflowPermissions result = apiInstance.actionsGetGithubActionsDefaultWorkflowPermissionsRepository(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetGithubActionsDefaultWorkflowPermissionsRepository");
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

[**ActionsGetDefaultWorkflowPermissions**](ActionsGetDefaultWorkflowPermissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetGithubActionsPermissionsOrganization"></a>
# **actionsGetGithubActionsPermissionsOrganization**
> ActionsOrganizationPermissions actionsGetGithubActionsPermissionsOrganization(org)

Get GitHub Actions permissions for an organization

Gets the GitHub Actions permissions policy for repositories and allowed actions and reusable workflows in an organization.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration&#x60; organization permission to use this API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      ActionsOrganizationPermissions result = apiInstance.actionsGetGithubActionsPermissionsOrganization(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetGithubActionsPermissionsOrganization");
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

[**ActionsOrganizationPermissions**](ActionsOrganizationPermissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetGithubActionsPermissionsRepository"></a>
# **actionsGetGithubActionsPermissionsRepository**
> ActionsRepositoryPermissions actionsGetGithubActionsPermissionsRepository(owner, repo)

Get GitHub Actions permissions for a repository

Gets the GitHub Actions permissions policy for a repository, including whether GitHub Actions is enabled and the actions and reusable workflows allowed to run in the repository.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration&#x60; repository permission to use this API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      ActionsRepositoryPermissions result = apiInstance.actionsGetGithubActionsPermissionsRepository(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetGithubActionsPermissionsRepository");
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

[**ActionsRepositoryPermissions**](ActionsRepositoryPermissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetJobForWorkflowRun"></a>
# **actionsGetJobForWorkflowRun**
> Job actionsGetJobForWorkflowRun(owner, repo, jobId)

Get a job for a workflow run

Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer jobId = 56; // Integer | The unique identifier of the job.
    try {
      Job result = apiInstance.actionsGetJobForWorkflowRun(owner, repo, jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetJobForWorkflowRun");
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
| **jobId** | **Integer**| The unique identifier of the job. | |

### Return type

[**Job**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetOrgPublicKey"></a>
# **actionsGetOrgPublicKey**
> ActionsPublicKey actionsGetOrgPublicKey(org)

Get an organization public key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      ActionsPublicKey result = apiInstance.actionsGetOrgPublicKey(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetOrgPublicKey");
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

[**ActionsPublicKey**](ActionsPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetOrgSecret"></a>
# **actionsGetOrgSecret**
> OrganizationActionsSecret actionsGetOrgSecret(org, secretName)

Get an organization secret

Gets a single organization secret without revealing its encrypted value. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      OrganizationActionsSecret result = apiInstance.actionsGetOrgSecret(org, secretName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetOrgSecret");
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
| **secretName** | **String**| The name of the secret. | |

### Return type

[**OrganizationActionsSecret**](OrganizationActionsSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetOrgVariable"></a>
# **actionsGetOrgVariable**
> OrganizationActionsVariable actionsGetOrgVariable(org, name)

Get an organization variable

Gets a specific variable in an organization. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;organization_actions_variables:read&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String name = "name_example"; // String | The name of the variable.
    try {
      OrganizationActionsVariable result = apiInstance.actionsGetOrgVariable(org, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetOrgVariable");
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
| **name** | **String**| The name of the variable. | |

### Return type

[**OrganizationActionsVariable**](OrganizationActionsVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetPendingDeploymentsForRun"></a>
# **actionsGetPendingDeploymentsForRun**
> List&lt;PendingDeployment&gt; actionsGetPendingDeploymentsForRun(owner, repo, runId)

Get pending deployments for a workflow run

Get all deployment environments for a workflow run that are waiting for protection rules to pass.  Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    try {
      List<PendingDeployment> result = apiInstance.actionsGetPendingDeploymentsForRun(owner, repo, runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetPendingDeploymentsForRun");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |

### Return type

[**List&lt;PendingDeployment&gt;**](PendingDeployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetRepoPublicKey"></a>
# **actionsGetRepoPublicKey**
> ActionsPublicKey actionsGetRepoPublicKey(owner, repo)

Get a repository public key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      ActionsPublicKey result = apiInstance.actionsGetRepoPublicKey(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetRepoPublicKey");
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

[**ActionsPublicKey**](ActionsPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetRepoRequiredWorkflow"></a>
# **actionsGetRepoRequiredWorkflow**
> RepoRequiredWorkflow actionsGetRepoRequiredWorkflow(org, repo, requiredWorkflowIdForRepo)

Get a required workflow entity for a repository

Gets a specific required workflow present in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint. For more information, see \&quot;[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer requiredWorkflowIdForRepo = 56; // Integer | The ID of the required workflow that has run at least once in a repository.
    try {
      RepoRequiredWorkflow result = apiInstance.actionsGetRepoRequiredWorkflow(org, repo, requiredWorkflowIdForRepo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetRepoRequiredWorkflow");
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
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **requiredWorkflowIdForRepo** | **Integer**| The ID of the required workflow that has run at least once in a repository. | |

### Return type

[**RepoRequiredWorkflow**](RepoRequiredWorkflow.md)

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

<a name="actionsGetRepoRequiredWorkflowUsage"></a>
# **actionsGetRepoRequiredWorkflowUsage**
> WorkflowUsage actionsGetRepoRequiredWorkflowUsage(org, repo, requiredWorkflowIdForRepo)

Get required workflow usage

Gets the number of billable minutes used by a specific required workflow during the current billing cycle.  Billable minutes only apply to required workflows running in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see \&quot;[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions).\&quot;  Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer requiredWorkflowIdForRepo = 56; // Integer | The ID of the required workflow that has run at least once in a repository.
    try {
      WorkflowUsage result = apiInstance.actionsGetRepoRequiredWorkflowUsage(org, repo, requiredWorkflowIdForRepo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetRepoRequiredWorkflowUsage");
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
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **requiredWorkflowIdForRepo** | **Integer**| The ID of the required workflow that has run at least once in a repository. | |

### Return type

[**WorkflowUsage**](WorkflowUsage.md)

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

<a name="actionsGetRepoSecret"></a>
# **actionsGetRepoSecret**
> ActionsSecret actionsGetRepoSecret(owner, repo, secretName)

Get a repository secret

Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      ActionsSecret result = apiInstance.actionsGetRepoSecret(owner, repo, secretName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetRepoSecret");
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
| **secretName** | **String**| The name of the secret. | |

### Return type

[**ActionsSecret**](ActionsSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetRepoVariable"></a>
# **actionsGetRepoVariable**
> ActionsVariable actionsGetRepoVariable(owner, repo, name)

Get a repository variable

Gets a specific variable in a repository. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions_variables:read&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String name = "name_example"; // String | The name of the variable.
    try {
      ActionsVariable result = apiInstance.actionsGetRepoVariable(owner, repo, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetRepoVariable");
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
| **name** | **String**| The name of the variable. | |

### Return type

[**ActionsVariable**](ActionsVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetRequiredWorkflow"></a>
# **actionsGetRequiredWorkflow**
> RequiredWorkflow actionsGetRequiredWorkflow(org, requiredWorkflowId)

Get a required workflow

Get a required workflow configured in an organization.  You must authenticate using an access token with the &#x60;read:org&#x60; scope to use this endpoint.  For more information, see \&quot;[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer requiredWorkflowId = 56; // Integer | The unique identifier of the required workflow.
    try {
      RequiredWorkflow result = apiInstance.actionsGetRequiredWorkflow(org, requiredWorkflowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetRequiredWorkflow");
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
| **requiredWorkflowId** | **Integer**| The unique identifier of the required workflow. | |

### Return type

[**RequiredWorkflow**](RequiredWorkflow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetReviewsForRun"></a>
# **actionsGetReviewsForRun**
> List&lt;EnvironmentApprovals&gt; actionsGetReviewsForRun(owner, repo, runId)

Get the review history for a workflow run

Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    try {
      List<EnvironmentApprovals> result = apiInstance.actionsGetReviewsForRun(owner, repo, runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetReviewsForRun");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |

### Return type

[**List&lt;EnvironmentApprovals&gt;**](EnvironmentApprovals.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetSelfHostedRunnerForOrg"></a>
# **actionsGetSelfHostedRunnerForOrg**
> Runner actionsGetSelfHostedRunnerForOrg(org, runnerId)

Get a self-hosted runner for an organization

Gets a specific self-hosted runner configured in an organization.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer runnerId = 56; // Integer | Unique identifier of the self-hosted runner.
    try {
      Runner result = apiInstance.actionsGetSelfHostedRunnerForOrg(org, runnerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetSelfHostedRunnerForOrg");
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
| **runnerId** | **Integer**| Unique identifier of the self-hosted runner. | |

### Return type

[**Runner**](Runner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetSelfHostedRunnerForRepo"></a>
# **actionsGetSelfHostedRunnerForRepo**
> Runner actionsGetSelfHostedRunnerForRepo(owner, repo, runnerId)

Get a self-hosted runner for a repository

Gets a specific self-hosted runner configured in a repository.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runnerId = 56; // Integer | Unique identifier of the self-hosted runner.
    try {
      Runner result = apiInstance.actionsGetSelfHostedRunnerForRepo(owner, repo, runnerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetSelfHostedRunnerForRepo");
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
| **runnerId** | **Integer**| Unique identifier of the self-hosted runner. | |

### Return type

[**Runner**](Runner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetWorkflow"></a>
# **actionsGetWorkflow**
> Workflow actionsGetWorkflow(owner, repo, workflowId)

Get a workflow

Gets a specific workflow. You can replace &#x60;workflow_id&#x60; with the workflow file name. For example, you could use &#x60;main.yaml&#x60;. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ActionsGetWorkflowWorkflowIdParameter workflowId = new ActionsGetWorkflowWorkflowIdParameter(); // ActionsGetWorkflowWorkflowIdParameter | The ID of the workflow. You can also pass the workflow file name as a string.
    try {
      Workflow result = apiInstance.actionsGetWorkflow(owner, repo, workflowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetWorkflow");
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
| **workflowId** | [**ActionsGetWorkflowWorkflowIdParameter**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. | |

### Return type

[**Workflow**](Workflow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetWorkflowAccessToRepository"></a>
# **actionsGetWorkflowAccessToRepository**
> ActionsWorkflowAccessToRepository actionsGetWorkflowAccessToRepository(owner, repo)

Get the level of access for workflows outside of the repository

Gets the level of access that workflows outside of the repository have to actions and reusable workflows in the repository. This endpoint only applies to private repositories. For more information, see \&quot;[Allowing access to components in a private repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#allowing-access-to-components-in-a-private-repository).\&quot;  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the repository &#x60;administration&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      ActionsWorkflowAccessToRepository result = apiInstance.actionsGetWorkflowAccessToRepository(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetWorkflowAccessToRepository");
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

[**ActionsWorkflowAccessToRepository**](ActionsWorkflowAccessToRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetWorkflowRun"></a>
# **actionsGetWorkflowRun**
> WorkflowRun actionsGetWorkflowRun(owner, repo, runId, excludePullRequests)

Get a workflow run

Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    Boolean excludePullRequests = false; // Boolean | If `true` pull requests are omitted from the response (empty array).
    try {
      WorkflowRun result = apiInstance.actionsGetWorkflowRun(owner, repo, runId, excludePullRequests);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetWorkflowRun");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |
| **excludePullRequests** | **Boolean**| If &#x60;true&#x60; pull requests are omitted from the response (empty array). | [optional] [default to false] |

### Return type

[**WorkflowRun**](WorkflowRun.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetWorkflowRunAttempt"></a>
# **actionsGetWorkflowRunAttempt**
> WorkflowRun actionsGetWorkflowRunAttempt(owner, repo, runId, attemptNumber, excludePullRequests)

Get a workflow run attempt

Gets a specific workflow run attempt. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    Integer attemptNumber = 56; // Integer | The attempt number of the workflow run.
    Boolean excludePullRequests = false; // Boolean | If `true` pull requests are omitted from the response (empty array).
    try {
      WorkflowRun result = apiInstance.actionsGetWorkflowRunAttempt(owner, repo, runId, attemptNumber, excludePullRequests);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetWorkflowRunAttempt");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |
| **attemptNumber** | **Integer**| The attempt number of the workflow run. | |
| **excludePullRequests** | **Boolean**| If &#x60;true&#x60; pull requests are omitted from the response (empty array). | [optional] [default to false] |

### Return type

[**WorkflowRun**](WorkflowRun.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetWorkflowRunUsage"></a>
# **actionsGetWorkflowRunUsage**
> WorkflowRunUsage actionsGetWorkflowRunUsage(owner, repo, runId)

Get workflow run usage

Gets the number of billable minutes and total run time for a specific workflow run. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see \&quot;[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)\&quot;.  Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    try {
      WorkflowRunUsage result = apiInstance.actionsGetWorkflowRunUsage(owner, repo, runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetWorkflowRunUsage");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |

### Return type

[**WorkflowRunUsage**](WorkflowRunUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsGetWorkflowUsage"></a>
# **actionsGetWorkflowUsage**
> WorkflowUsage actionsGetWorkflowUsage(owner, repo, workflowId)

Get workflow usage

Gets the number of billable minutes used by a specific workflow during the current billing cycle. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see \&quot;[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)\&quot;.  You can replace &#x60;workflow_id&#x60; with the workflow file name. For example, you could use &#x60;main.yaml&#x60;. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ActionsGetWorkflowWorkflowIdParameter workflowId = new ActionsGetWorkflowWorkflowIdParameter(); // ActionsGetWorkflowWorkflowIdParameter | The ID of the workflow. You can also pass the workflow file name as a string.
    try {
      WorkflowUsage result = apiInstance.actionsGetWorkflowUsage(owner, repo, workflowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsGetWorkflowUsage");
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
| **workflowId** | [**ActionsGetWorkflowWorkflowIdParameter**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. | |

### Return type

[**WorkflowUsage**](WorkflowUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsListArtifactsForRepo"></a>
# **actionsListArtifactsForRepo**
> ActionsListArtifactsForRepo200Response actionsListArtifactsForRepo(owner, repo, perPage, page, name)

List artifacts for a repository

Lists all artifacts for a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    String name = "name_example"; // String | Filters artifacts by exact match on their name field.
    try {
      ActionsListArtifactsForRepo200Response result = apiInstance.actionsListArtifactsForRepo(owner, repo, perPage, page, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListArtifactsForRepo");
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
| **name** | **String**| Filters artifacts by exact match on their name field. | [optional] |

### Return type

[**ActionsListArtifactsForRepo200Response**](ActionsListArtifactsForRepo200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsListEnvironmentSecrets"></a>
# **actionsListEnvironmentSecrets**
> ActionsListRepoOrganizationSecrets200Response actionsListEnvironmentSecrets(repositoryId, environmentName, perPage, page)

List environment secrets

Lists all secrets available in an environment without revealing their encrypted values. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    Integer repositoryId = 56; // Integer | The unique identifier of the repository.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListRepoOrganizationSecrets200Response result = apiInstance.actionsListEnvironmentSecrets(repositoryId, environmentName, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListEnvironmentSecrets");
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
| **repositoryId** | **Integer**| The unique identifier of the repository. | |
| **environmentName** | **String**| The name of the environment. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**ActionsListRepoOrganizationSecrets200Response**](ActionsListRepoOrganizationSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsListEnvironmentVariables"></a>
# **actionsListEnvironmentVariables**
> ActionsListRepoOrganizationVariables200Response actionsListEnvironmentVariables(repositoryId, environmentName, perPage, page)

List environment variables

Lists all environment variables. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;environments:read&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    Integer repositoryId = 56; // Integer | The unique identifier of the repository.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    Integer perPage = 10; // Integer | The number of results per page (max 30).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListRepoOrganizationVariables200Response result = apiInstance.actionsListEnvironmentVariables(repositoryId, environmentName, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListEnvironmentVariables");
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
| **repositoryId** | **Integer**| The unique identifier of the repository. | |
| **environmentName** | **String**| The name of the environment. | |
| **perPage** | **Integer**| The number of results per page (max 30). | [optional] [default to 10] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**ActionsListRepoOrganizationVariables200Response**](ActionsListRepoOrganizationVariables200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsListJobsForWorkflowRun"></a>
# **actionsListJobsForWorkflowRun**
> ActionsListJobsForWorkflowRunAttempt200Response actionsListJobsForWorkflowRun(owner, repo, runId, filter, perPage, page)

List jobs for a workflow run

Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    String filter = "latest"; // String | Filters jobs by their `completed_at` timestamp. `latest` returns jobs from the most recent execution of the workflow run. `all` returns all jobs for a workflow run, including from old executions of the workflow run.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListJobsForWorkflowRunAttempt200Response result = apiInstance.actionsListJobsForWorkflowRun(owner, repo, runId, filter, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListJobsForWorkflowRun");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |
| **filter** | **String**| Filters jobs by their &#x60;completed_at&#x60; timestamp. &#x60;latest&#x60; returns jobs from the most recent execution of the workflow run. &#x60;all&#x60; returns all jobs for a workflow run, including from old executions of the workflow run. | [optional] [default to latest] [enum: latest, all] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**ActionsListJobsForWorkflowRunAttempt200Response**](ActionsListJobsForWorkflowRunAttempt200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsListJobsForWorkflowRunAttempt"></a>
# **actionsListJobsForWorkflowRunAttempt**
> ActionsListJobsForWorkflowRunAttempt200Response actionsListJobsForWorkflowRunAttempt(owner, repo, runId, attemptNumber, perPage, page)

List jobs for a workflow run attempt

Lists jobs for a specific workflow run attempt. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    Integer attemptNumber = 56; // Integer | The attempt number of the workflow run.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListJobsForWorkflowRunAttempt200Response result = apiInstance.actionsListJobsForWorkflowRunAttempt(owner, repo, runId, attemptNumber, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListJobsForWorkflowRunAttempt");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |
| **attemptNumber** | **Integer**| The attempt number of the workflow run. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**ActionsListJobsForWorkflowRunAttempt200Response**](ActionsListJobsForWorkflowRunAttempt200Response.md)

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

<a name="actionsListLabelsForSelfHostedRunnerForOrg"></a>
# **actionsListLabelsForSelfHostedRunnerForOrg**
> ActionsListLabelsForSelfHostedRunnerForOrg200Response actionsListLabelsForSelfHostedRunnerForOrg(org, runnerId)

List labels for a self-hosted runner for an organization

Lists all labels for a self-hosted runner configured in an organization.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer runnerId = 56; // Integer | Unique identifier of the self-hosted runner.
    try {
      ActionsListLabelsForSelfHostedRunnerForOrg200Response result = apiInstance.actionsListLabelsForSelfHostedRunnerForOrg(org, runnerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListLabelsForSelfHostedRunnerForOrg");
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
| **runnerId** | **Integer**| Unique identifier of the self-hosted runner. | |

### Return type

[**ActionsListLabelsForSelfHostedRunnerForOrg200Response**](ActionsListLabelsForSelfHostedRunnerForOrg200Response.md)

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

<a name="actionsListLabelsForSelfHostedRunnerForRepo"></a>
# **actionsListLabelsForSelfHostedRunnerForRepo**
> ActionsListLabelsForSelfHostedRunnerForOrg200Response actionsListLabelsForSelfHostedRunnerForRepo(owner, repo, runnerId)

List labels for a self-hosted runner for a repository

Lists all labels for a self-hosted runner configured in a repository.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runnerId = 56; // Integer | Unique identifier of the self-hosted runner.
    try {
      ActionsListLabelsForSelfHostedRunnerForOrg200Response result = apiInstance.actionsListLabelsForSelfHostedRunnerForRepo(owner, repo, runnerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListLabelsForSelfHostedRunnerForRepo");
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
| **runnerId** | **Integer**| Unique identifier of the self-hosted runner. | |

### Return type

[**ActionsListLabelsForSelfHostedRunnerForOrg200Response**](ActionsListLabelsForSelfHostedRunnerForOrg200Response.md)

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

<a name="actionsListOrgSecrets"></a>
# **actionsListOrgSecrets**
> ActionsListOrgSecrets200Response actionsListOrgSecrets(org, perPage, page)

List organization secrets

Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListOrgSecrets200Response result = apiInstance.actionsListOrgSecrets(org, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListOrgSecrets");
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
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**ActionsListOrgSecrets200Response**](ActionsListOrgSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsListOrgVariables"></a>
# **actionsListOrgVariables**
> ActionsListOrgVariables200Response actionsListOrgVariables(org, perPage, page)

List organization variables

Lists all organization variables. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;organization_actions_variables:read&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 10; // Integer | The number of results per page (max 30).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListOrgVariables200Response result = apiInstance.actionsListOrgVariables(org, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListOrgVariables");
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
| **perPage** | **Integer**| The number of results per page (max 30). | [optional] [default to 10] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**ActionsListOrgVariables200Response**](ActionsListOrgVariables200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsListRepoOrganizationSecrets"></a>
# **actionsListRepoOrganizationSecrets**
> ActionsListRepoOrganizationSecrets200Response actionsListRepoOrganizationSecrets(owner, repo, perPage, page)

List repository organization secrets

Lists all organization secrets shared with a repository without revealing their encrypted values. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListRepoOrganizationSecrets200Response result = apiInstance.actionsListRepoOrganizationSecrets(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListRepoOrganizationSecrets");
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

[**ActionsListRepoOrganizationSecrets200Response**](ActionsListRepoOrganizationSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsListRepoOrganizationVariables"></a>
# **actionsListRepoOrganizationVariables**
> ActionsListRepoOrganizationVariables200Response actionsListRepoOrganizationVariables(owner, repo, perPage, page)

List repository organization variables

Lists all organiation variables shared with a repository. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions_variables:read&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 10; // Integer | The number of results per page (max 30).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListRepoOrganizationVariables200Response result = apiInstance.actionsListRepoOrganizationVariables(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListRepoOrganizationVariables");
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
| **perPage** | **Integer**| The number of results per page (max 30). | [optional] [default to 10] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**ActionsListRepoOrganizationVariables200Response**](ActionsListRepoOrganizationVariables200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsListRepoRequiredWorkflows"></a>
# **actionsListRepoRequiredWorkflows**
> ActionsListRepoRequiredWorkflows200Response actionsListRepoRequiredWorkflows(org, repo, perPage, page)

List repository required workflows

Lists the required workflows in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint. For more information, see \&quot;[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListRepoRequiredWorkflows200Response result = apiInstance.actionsListRepoRequiredWorkflows(org, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListRepoRequiredWorkflows");
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
| **repo** | **String**| The name of the repository. The name is not case sensitive. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**ActionsListRepoRequiredWorkflows200Response**](ActionsListRepoRequiredWorkflows200Response.md)

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

<a name="actionsListRepoSecrets"></a>
# **actionsListRepoSecrets**
> ActionsListRepoOrganizationSecrets200Response actionsListRepoSecrets(owner, repo, perPage, page)

List repository secrets

Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListRepoOrganizationSecrets200Response result = apiInstance.actionsListRepoSecrets(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListRepoSecrets");
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

[**ActionsListRepoOrganizationSecrets200Response**](ActionsListRepoOrganizationSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsListRepoVariables"></a>
# **actionsListRepoVariables**
> ActionsListRepoOrganizationVariables200Response actionsListRepoVariables(owner, repo, perPage, page)

List repository variables

Lists all repository variables. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions_variables:read&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 10; // Integer | The number of results per page (max 30).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListRepoOrganizationVariables200Response result = apiInstance.actionsListRepoVariables(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListRepoVariables");
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
| **perPage** | **Integer**| The number of results per page (max 30). | [optional] [default to 10] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**ActionsListRepoOrganizationVariables200Response**](ActionsListRepoOrganizationVariables200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsListRepoWorkflows"></a>
# **actionsListRepoWorkflows**
> ActionsListRepoWorkflows200Response actionsListRepoWorkflows(owner, repo, perPage, page)

List repository workflows

Lists the workflows in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListRepoWorkflows200Response result = apiInstance.actionsListRepoWorkflows(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListRepoWorkflows");
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

[**ActionsListRepoWorkflows200Response**](ActionsListRepoWorkflows200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsListRequiredWorkflowRuns"></a>
# **actionsListRequiredWorkflowRuns**
> ActionsListRequiredWorkflowRuns200Response actionsListRequiredWorkflowRuns(owner, repo, requiredWorkflowIdForRepo, actor, branch, event, status, perPage, page, created, excludePullRequests, checkSuiteId, headSha)

List workflow runs for a required workflow

List all workflow runs for a required workflow. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).  Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. For more information, see \&quot;[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer requiredWorkflowIdForRepo = 56; // Integer | The ID of the required workflow that has run at least once in a repository.
    String actor = "actor_example"; // String | Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run.
    String branch = "branch_example"; // String | Returns workflow runs associated with a branch. Use the name of the branch of the `push`.
    String event = "event_example"; // String | Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see \"[Events that trigger workflows](https://docs.github.com/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows).\"
    String status = "completed"; // String | Returns workflow runs with the check run `status` or `conclusion` that you specify. For example, a conclusion can be `success` or a status can be `in_progress`. Only GitHub can set a status of `waiting` or `requested`.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | Returns workflow runs created within the given date-time range. For more information on the syntax, see \"[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\"
    Boolean excludePullRequests = false; // Boolean | If `true` pull requests are omitted from the response (empty array).
    Integer checkSuiteId = 56; // Integer | Returns workflow runs with the `check_suite_id` that you specify.
    String headSha = "headSha_example"; // String | Only returns workflow runs that are associated with the specified `head_sha`.
    try {
      ActionsListRequiredWorkflowRuns200Response result = apiInstance.actionsListRequiredWorkflowRuns(owner, repo, requiredWorkflowIdForRepo, actor, branch, event, status, perPage, page, created, excludePullRequests, checkSuiteId, headSha);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListRequiredWorkflowRuns");
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
| **requiredWorkflowIdForRepo** | **Integer**| The ID of the required workflow that has run at least once in a repository. | |
| **actor** | **String**| Returns someone&#39;s workflow runs. Use the login for the user who created the &#x60;push&#x60; associated with the check suite or workflow run. | [optional] |
| **branch** | **String**| Returns workflow runs associated with a branch. Use the name of the branch of the &#x60;push&#x60;. | [optional] |
| **event** | **String**| Returns workflow run triggered by the event you specify. For example, &#x60;push&#x60;, &#x60;pull_request&#x60; or &#x60;issue&#x60;. For more information, see \&quot;[Events that trigger workflows](https://docs.github.com/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows).\&quot; | [optional] |
| **status** | **String**| Returns workflow runs with the check run &#x60;status&#x60; or &#x60;conclusion&#x60; that you specify. For example, a conclusion can be &#x60;success&#x60; or a status can be &#x60;in_progress&#x60;. Only GitHub can set a status of &#x60;waiting&#x60; or &#x60;requested&#x60;. | [optional] [enum: completed, action_required, cancelled, failure, neutral, skipped, stale, success, timed_out, in_progress, queued, requested, waiting, pending] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **created** | **OffsetDateTime**| Returns workflow runs created within the given date-time range. For more information on the syntax, see \&quot;[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\&quot; | [optional] |
| **excludePullRequests** | **Boolean**| If &#x60;true&#x60; pull requests are omitted from the response (empty array). | [optional] [default to false] |
| **checkSuiteId** | **Integer**| Returns workflow runs with the &#x60;check_suite_id&#x60; that you specify. | [optional] |
| **headSha** | **String**| Only returns workflow runs that are associated with the specified &#x60;head_sha&#x60;. | [optional] |

### Return type

[**ActionsListRequiredWorkflowRuns200Response**](ActionsListRequiredWorkflowRuns200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsListRequiredWorkflows"></a>
# **actionsListRequiredWorkflows**
> ActionsListRequiredWorkflows200Response actionsListRequiredWorkflows(org, perPage, page)

List required workflows

List all required workflows in an organization.  You must authenticate using an access token with the &#x60;read:org&#x60; scope to use this endpoint.  For more information, see \&quot;[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListRequiredWorkflows200Response result = apiInstance.actionsListRequiredWorkflows(org, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListRequiredWorkflows");
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
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**ActionsListRequiredWorkflows200Response**](ActionsListRequiredWorkflows200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsListRunnerApplicationsForOrg"></a>
# **actionsListRunnerApplicationsForOrg**
> List&lt;RunnerApplication&gt; actionsListRunnerApplicationsForOrg(org)

List runner applications for an organization

Lists binaries for the runner application that you can download and run.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      List<RunnerApplication> result = apiInstance.actionsListRunnerApplicationsForOrg(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListRunnerApplicationsForOrg");
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

[**List&lt;RunnerApplication&gt;**](RunnerApplication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsListRunnerApplicationsForRepo"></a>
# **actionsListRunnerApplicationsForRepo**
> List&lt;RunnerApplication&gt; actionsListRunnerApplicationsForRepo(owner, repo)

List runner applications for a repository

Lists binaries for the runner application that you can download and run.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      List<RunnerApplication> result = apiInstance.actionsListRunnerApplicationsForRepo(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListRunnerApplicationsForRepo");
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

[**List&lt;RunnerApplication&gt;**](RunnerApplication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsListSelectedReposForOrgSecret"></a>
# **actionsListSelectedReposForOrgSecret**
> ActionsListSelectedReposForOrgSecret200Response actionsListSelectedReposForOrgSecret(org, secretName, page, perPage)

List selected repositories for an organization secret

Lists all repositories that have been selected when the &#x60;visibility&#x60; for repository access to a secret is set to &#x60;selected&#x60;. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    try {
      ActionsListSelectedReposForOrgSecret200Response result = apiInstance.actionsListSelectedReposForOrgSecret(org, secretName, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListSelectedReposForOrgSecret");
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
| **secretName** | **String**| The name of the secret. | |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |

### Return type

[**ActionsListSelectedReposForOrgSecret200Response**](ActionsListSelectedReposForOrgSecret200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsListSelectedReposForOrgVariable"></a>
# **actionsListSelectedReposForOrgVariable**
> ActionsListSelectedReposForOrgSecret200Response actionsListSelectedReposForOrgVariable(org, name, page, perPage)

List selected repositories for an organization variable

Lists all repositories that can access an organization variable that is available to selected repositories. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;organization_actions_variables:read&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String name = "name_example"; // String | The name of the variable.
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    try {
      ActionsListSelectedReposForOrgSecret200Response result = apiInstance.actionsListSelectedReposForOrgVariable(org, name, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListSelectedReposForOrgVariable");
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
| **name** | **String**| The name of the variable. | |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |

### Return type

[**ActionsListSelectedReposForOrgSecret200Response**](ActionsListSelectedReposForOrgSecret200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **409** | Response when the visibility of the variable is not set to &#x60;selected&#x60; |  -  |

<a name="actionsListSelectedRepositoriesEnabledGithubActionsOrganization"></a>
# **actionsListSelectedRepositoriesEnabledGithubActionsOrganization**
> ActionsListSelectedRepositoriesEnabledGithubActionsOrganization200Response actionsListSelectedRepositoriesEnabledGithubActionsOrganization(org, perPage, page)

List selected repositories enabled for GitHub Actions in an organization

Lists the selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for &#x60;enabled_repositories&#x60; must be configured to &#x60;selected&#x60;. For more information, see \&quot;[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\&quot;  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration&#x60; organization permission to use this API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListSelectedRepositoriesEnabledGithubActionsOrganization200Response result = apiInstance.actionsListSelectedRepositoriesEnabledGithubActionsOrganization(org, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListSelectedRepositoriesEnabledGithubActionsOrganization");
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
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**ActionsListSelectedRepositoriesEnabledGithubActionsOrganization200Response**](ActionsListSelectedRepositoriesEnabledGithubActionsOrganization200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsListSelectedRepositoriesRequiredWorkflow"></a>
# **actionsListSelectedRepositoriesRequiredWorkflow**
> ActionsListSelectedRepositoriesEnabledGithubActionsOrganization200Response actionsListSelectedRepositoriesRequiredWorkflow(org, requiredWorkflowId)

List selected repositories for a required workflow

Lists the selected repositories that are configured for a required workflow in an organization. To use this endpoint, the required workflow must be configured to run on selected repositories.  You must authenticate using an access token with the &#x60;read:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration&#x60; organization permission to use this endpoint.  For more information, see \&quot;[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer requiredWorkflowId = 56; // Integer | The unique identifier of the required workflow.
    try {
      ActionsListSelectedRepositoriesEnabledGithubActionsOrganization200Response result = apiInstance.actionsListSelectedRepositoriesRequiredWorkflow(org, requiredWorkflowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListSelectedRepositoriesRequiredWorkflow");
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
| **requiredWorkflowId** | **Integer**| The unique identifier of the required workflow. | |

### Return type

[**ActionsListSelectedRepositoriesEnabledGithubActionsOrganization200Response**](ActionsListSelectedRepositoriesEnabledGithubActionsOrganization200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Resource Not Found |  -  |

<a name="actionsListSelfHostedRunnersForOrg"></a>
# **actionsListSelfHostedRunnersForOrg**
> ActionsListSelfHostedRunnersForOrg200Response actionsListSelfHostedRunnersForOrg(org, perPage, page)

List self-hosted runners for an organization

Lists all self-hosted runners configured in an organization.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListSelfHostedRunnersForOrg200Response result = apiInstance.actionsListSelfHostedRunnersForOrg(org, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListSelfHostedRunnersForOrg");
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
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**ActionsListSelfHostedRunnersForOrg200Response**](ActionsListSelfHostedRunnersForOrg200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsListSelfHostedRunnersForRepo"></a>
# **actionsListSelfHostedRunnersForRepo**
> ActionsListSelfHostedRunnersForOrg200Response actionsListSelfHostedRunnersForRepo(owner, repo, perPage, page)

List self-hosted runners for a repository

Lists all self-hosted runners configured in a repository. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListSelfHostedRunnersForOrg200Response result = apiInstance.actionsListSelfHostedRunnersForRepo(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListSelfHostedRunnersForRepo");
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

[**ActionsListSelfHostedRunnersForOrg200Response**](ActionsListSelfHostedRunnersForOrg200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsListWorkflowRunArtifacts"></a>
# **actionsListWorkflowRunArtifacts**
> ActionsListArtifactsForRepo200Response actionsListWorkflowRunArtifacts(owner, repo, runId, perPage, page)

List workflow run artifacts

Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      ActionsListArtifactsForRepo200Response result = apiInstance.actionsListWorkflowRunArtifacts(owner, repo, runId, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListWorkflowRunArtifacts");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**ActionsListArtifactsForRepo200Response**](ActionsListArtifactsForRepo200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsListWorkflowRuns"></a>
# **actionsListWorkflowRuns**
> ActionsListRequiredWorkflowRuns200Response actionsListWorkflowRuns(owner, repo, workflowId, actor, branch, event, status, perPage, page, created, excludePullRequests, checkSuiteId, headSha)

List workflow runs for a workflow

List all workflow runs for a workflow. You can replace &#x60;workflow_id&#x60; with the workflow file name. For example, you could use &#x60;main.yaml&#x60;. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).  Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ActionsGetWorkflowWorkflowIdParameter workflowId = new ActionsGetWorkflowWorkflowIdParameter(); // ActionsGetWorkflowWorkflowIdParameter | The ID of the workflow. You can also pass the workflow file name as a string.
    String actor = "actor_example"; // String | Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run.
    String branch = "branch_example"; // String | Returns workflow runs associated with a branch. Use the name of the branch of the `push`.
    String event = "event_example"; // String | Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see \"[Events that trigger workflows](https://docs.github.com/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows).\"
    String status = "completed"; // String | Returns workflow runs with the check run `status` or `conclusion` that you specify. For example, a conclusion can be `success` or a status can be `in_progress`. Only GitHub can set a status of `waiting` or `requested`.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | Returns workflow runs created within the given date-time range. For more information on the syntax, see \"[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\"
    Boolean excludePullRequests = false; // Boolean | If `true` pull requests are omitted from the response (empty array).
    Integer checkSuiteId = 56; // Integer | Returns workflow runs with the `check_suite_id` that you specify.
    String headSha = "headSha_example"; // String | Only returns workflow runs that are associated with the specified `head_sha`.
    try {
      ActionsListRequiredWorkflowRuns200Response result = apiInstance.actionsListWorkflowRuns(owner, repo, workflowId, actor, branch, event, status, perPage, page, created, excludePullRequests, checkSuiteId, headSha);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListWorkflowRuns");
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
| **workflowId** | [**ActionsGetWorkflowWorkflowIdParameter**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. | |
| **actor** | **String**| Returns someone&#39;s workflow runs. Use the login for the user who created the &#x60;push&#x60; associated with the check suite or workflow run. | [optional] |
| **branch** | **String**| Returns workflow runs associated with a branch. Use the name of the branch of the &#x60;push&#x60;. | [optional] |
| **event** | **String**| Returns workflow run triggered by the event you specify. For example, &#x60;push&#x60;, &#x60;pull_request&#x60; or &#x60;issue&#x60;. For more information, see \&quot;[Events that trigger workflows](https://docs.github.com/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows).\&quot; | [optional] |
| **status** | **String**| Returns workflow runs with the check run &#x60;status&#x60; or &#x60;conclusion&#x60; that you specify. For example, a conclusion can be &#x60;success&#x60; or a status can be &#x60;in_progress&#x60;. Only GitHub can set a status of &#x60;waiting&#x60; or &#x60;requested&#x60;. | [optional] [enum: completed, action_required, cancelled, failure, neutral, skipped, stale, success, timed_out, in_progress, queued, requested, waiting, pending] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **created** | **OffsetDateTime**| Returns workflow runs created within the given date-time range. For more information on the syntax, see \&quot;[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\&quot; | [optional] |
| **excludePullRequests** | **Boolean**| If &#x60;true&#x60; pull requests are omitted from the response (empty array). | [optional] [default to false] |
| **checkSuiteId** | **Integer**| Returns workflow runs with the &#x60;check_suite_id&#x60; that you specify. | [optional] |
| **headSha** | **String**| Only returns workflow runs that are associated with the specified &#x60;head_sha&#x60;. | [optional] |

### Return type

[**ActionsListRequiredWorkflowRuns200Response**](ActionsListRequiredWorkflowRuns200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsListWorkflowRunsForRepo"></a>
# **actionsListWorkflowRunsForRepo**
> ActionsListRequiredWorkflowRuns200Response actionsListWorkflowRunsForRepo(owner, repo, actor, branch, event, status, perPage, page, created, excludePullRequests, checkSuiteId, headSha)

List workflow runs for a repository

Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).  Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;actions:read&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String actor = "actor_example"; // String | Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run.
    String branch = "branch_example"; // String | Returns workflow runs associated with a branch. Use the name of the branch of the `push`.
    String event = "event_example"; // String | Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see \"[Events that trigger workflows](https://docs.github.com/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows).\"
    String status = "completed"; // String | Returns workflow runs with the check run `status` or `conclusion` that you specify. For example, a conclusion can be `success` or a status can be `in_progress`. Only GitHub can set a status of `waiting` or `requested`.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | Returns workflow runs created within the given date-time range. For more information on the syntax, see \"[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\"
    Boolean excludePullRequests = false; // Boolean | If `true` pull requests are omitted from the response (empty array).
    Integer checkSuiteId = 56; // Integer | Returns workflow runs with the `check_suite_id` that you specify.
    String headSha = "headSha_example"; // String | Only returns workflow runs that are associated with the specified `head_sha`.
    try {
      ActionsListRequiredWorkflowRuns200Response result = apiInstance.actionsListWorkflowRunsForRepo(owner, repo, actor, branch, event, status, perPage, page, created, excludePullRequests, checkSuiteId, headSha);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsListWorkflowRunsForRepo");
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
| **actor** | **String**| Returns someone&#39;s workflow runs. Use the login for the user who created the &#x60;push&#x60; associated with the check suite or workflow run. | [optional] |
| **branch** | **String**| Returns workflow runs associated with a branch. Use the name of the branch of the &#x60;push&#x60;. | [optional] |
| **event** | **String**| Returns workflow run triggered by the event you specify. For example, &#x60;push&#x60;, &#x60;pull_request&#x60; or &#x60;issue&#x60;. For more information, see \&quot;[Events that trigger workflows](https://docs.github.com/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows).\&quot; | [optional] |
| **status** | **String**| Returns workflow runs with the check run &#x60;status&#x60; or &#x60;conclusion&#x60; that you specify. For example, a conclusion can be &#x60;success&#x60; or a status can be &#x60;in_progress&#x60;. Only GitHub can set a status of &#x60;waiting&#x60; or &#x60;requested&#x60;. | [optional] [enum: completed, action_required, cancelled, failure, neutral, skipped, stale, success, timed_out, in_progress, queued, requested, waiting, pending] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **created** | **OffsetDateTime**| Returns workflow runs created within the given date-time range. For more information on the syntax, see \&quot;[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\&quot; | [optional] |
| **excludePullRequests** | **Boolean**| If &#x60;true&#x60; pull requests are omitted from the response (empty array). | [optional] [default to false] |
| **checkSuiteId** | **Integer**| Returns workflow runs with the &#x60;check_suite_id&#x60; that you specify. | [optional] |
| **headSha** | **String**| Only returns workflow runs that are associated with the specified &#x60;head_sha&#x60;. | [optional] |

### Return type

[**ActionsListRequiredWorkflowRuns200Response**](ActionsListRequiredWorkflowRuns200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="actionsReRunJobForWorkflowRun"></a>
# **actionsReRunJobForWorkflowRun**
> Object actionsReRunJobForWorkflowRun(owner, repo, jobId, actionsReRunJobForWorkflowRunRequest)

Re-run a job from a workflow run

Re-run a job and its dependent jobs in a workflow run. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions:write&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer jobId = 56; // Integer | The unique identifier of the job.
    ActionsReRunJobForWorkflowRunRequest actionsReRunJobForWorkflowRunRequest = new ActionsReRunJobForWorkflowRunRequest(); // ActionsReRunJobForWorkflowRunRequest | 
    try {
      Object result = apiInstance.actionsReRunJobForWorkflowRun(owner, repo, jobId, actionsReRunJobForWorkflowRunRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsReRunJobForWorkflowRun");
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
| **jobId** | **Integer**| The unique identifier of the job. | |
| **actionsReRunJobForWorkflowRunRequest** | [**ActionsReRunJobForWorkflowRunRequest**](ActionsReRunJobForWorkflowRunRequest.md)|  | [optional] |

### Return type

**Object**

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

<a name="actionsReRunWorkflow"></a>
# **actionsReRunWorkflow**
> Object actionsReRunWorkflow(owner, repo, runId, actionsReRunJobForWorkflowRunRequest)

Re-run a workflow

Re-runs your workflow run using its &#x60;id&#x60;. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions:write&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    ActionsReRunJobForWorkflowRunRequest actionsReRunJobForWorkflowRunRequest = new ActionsReRunJobForWorkflowRunRequest(); // ActionsReRunJobForWorkflowRunRequest | 
    try {
      Object result = apiInstance.actionsReRunWorkflow(owner, repo, runId, actionsReRunJobForWorkflowRunRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsReRunWorkflow");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |
| **actionsReRunJobForWorkflowRunRequest** | [**ActionsReRunJobForWorkflowRunRequest**](ActionsReRunJobForWorkflowRunRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |

<a name="actionsReRunWorkflowFailedJobs"></a>
# **actionsReRunWorkflowFailedJobs**
> Object actionsReRunWorkflowFailedJobs(owner, repo, runId, actionsReRunJobForWorkflowRunRequest)

Re-run failed jobs from a workflow run

Re-run all of the failed jobs and their dependent jobs in a workflow run using the &#x60;id&#x60; of the workflow run. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    ActionsReRunJobForWorkflowRunRequest actionsReRunJobForWorkflowRunRequest = new ActionsReRunJobForWorkflowRunRequest(); // ActionsReRunJobForWorkflowRunRequest | 
    try {
      Object result = apiInstance.actionsReRunWorkflowFailedJobs(owner, repo, runId, actionsReRunJobForWorkflowRunRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsReRunWorkflowFailedJobs");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |
| **actionsReRunJobForWorkflowRunRequest** | [**ActionsReRunJobForWorkflowRunRequest**](ActionsReRunJobForWorkflowRunRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |

<a name="actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrg"></a>
# **actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrg**
> ActionsListLabelsForSelfHostedRunnerForOrg200Response actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrg(org, runnerId)

Remove all custom labels from a self-hosted runner for an organization

Remove all custom labels from a self-hosted runner configured in an organization. Returns the remaining read-only labels from the runner.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer runnerId = 56; // Integer | Unique identifier of the self-hosted runner.
    try {
      ActionsListLabelsForSelfHostedRunnerForOrg200Response result = apiInstance.actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrg(org, runnerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrg");
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
| **runnerId** | **Integer**| Unique identifier of the self-hosted runner. | |

### Return type

[**ActionsListLabelsForSelfHostedRunnerForOrg200Response**](ActionsListLabelsForSelfHostedRunnerForOrg200Response.md)

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

<a name="actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepo"></a>
# **actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepo**
> ActionsListLabelsForSelfHostedRunnerForOrg200Response actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepo(owner, repo, runnerId)

Remove all custom labels from a self-hosted runner for a repository

Remove all custom labels from a self-hosted runner configured in a repository. Returns the remaining read-only labels from the runner.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runnerId = 56; // Integer | Unique identifier of the self-hosted runner.
    try {
      ActionsListLabelsForSelfHostedRunnerForOrg200Response result = apiInstance.actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepo(owner, repo, runnerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepo");
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
| **runnerId** | **Integer**| Unique identifier of the self-hosted runner. | |

### Return type

[**ActionsListLabelsForSelfHostedRunnerForOrg200Response**](ActionsListLabelsForSelfHostedRunnerForOrg200Response.md)

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

<a name="actionsRemoveCustomLabelFromSelfHostedRunnerForOrg"></a>
# **actionsRemoveCustomLabelFromSelfHostedRunnerForOrg**
> ActionsListLabelsForSelfHostedRunnerForOrg200Response actionsRemoveCustomLabelFromSelfHostedRunnerForOrg(org, runnerId, name)

Remove a custom label from a self-hosted runner for an organization

Remove a custom label from a self-hosted runner configured in an organization. Returns the remaining labels from the runner.  This endpoint returns a &#x60;404 Not Found&#x60; status if the custom label is not present on the runner.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer runnerId = 56; // Integer | Unique identifier of the self-hosted runner.
    String name = "name_example"; // String | The name of a self-hosted runner's custom label.
    try {
      ActionsListLabelsForSelfHostedRunnerForOrg200Response result = apiInstance.actionsRemoveCustomLabelFromSelfHostedRunnerForOrg(org, runnerId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsRemoveCustomLabelFromSelfHostedRunnerForOrg");
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
| **runnerId** | **Integer**| Unique identifier of the self-hosted runner. | |
| **name** | **String**| The name of a self-hosted runner&#39;s custom label. | |

### Return type

[**ActionsListLabelsForSelfHostedRunnerForOrg200Response**](ActionsListLabelsForSelfHostedRunnerForOrg200Response.md)

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

<a name="actionsRemoveCustomLabelFromSelfHostedRunnerForRepo"></a>
# **actionsRemoveCustomLabelFromSelfHostedRunnerForRepo**
> ActionsListLabelsForSelfHostedRunnerForOrg200Response actionsRemoveCustomLabelFromSelfHostedRunnerForRepo(owner, repo, runnerId, name)

Remove a custom label from a self-hosted runner for a repository

Remove a custom label from a self-hosted runner configured in a repository. Returns the remaining labels from the runner.  This endpoint returns a &#x60;404 Not Found&#x60; status if the custom label is not present on the runner.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runnerId = 56; // Integer | Unique identifier of the self-hosted runner.
    String name = "name_example"; // String | The name of a self-hosted runner's custom label.
    try {
      ActionsListLabelsForSelfHostedRunnerForOrg200Response result = apiInstance.actionsRemoveCustomLabelFromSelfHostedRunnerForRepo(owner, repo, runnerId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsRemoveCustomLabelFromSelfHostedRunnerForRepo");
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
| **runnerId** | **Integer**| Unique identifier of the self-hosted runner. | |
| **name** | **String**| The name of a self-hosted runner&#39;s custom label. | |

### Return type

[**ActionsListLabelsForSelfHostedRunnerForOrg200Response**](ActionsListLabelsForSelfHostedRunnerForOrg200Response.md)

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

<a name="actionsRemoveSelectedRepoFromOrgSecret"></a>
# **actionsRemoveSelectedRepoFromOrgSecret**
> actionsRemoveSelectedRepoFromOrgSecret(org, secretName, repositoryId)

Remove selected repository from an organization secret

Removes a repository from an organization secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/actions#create-or-update-an-organization-secret). You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    Integer repositoryId = 56; // Integer | 
    try {
      apiInstance.actionsRemoveSelectedRepoFromOrgSecret(org, secretName, repositoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsRemoveSelectedRepoFromOrgSecret");
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
| **secretName** | **String**| The name of the secret. | |
| **repositoryId** | **Integer**|  | |

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
| **204** | Response when repository was removed from the selected list |  -  |
| **409** | Conflict when visibility type not set to selected |  -  |

<a name="actionsRemoveSelectedRepoFromOrgVariable"></a>
# **actionsRemoveSelectedRepoFromOrgVariable**
> actionsRemoveSelectedRepoFromOrgVariable(org, name, repositoryId)

Remove selected repository from an organization variable

Removes a repository from an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their &#x60;visibility&#x60; field set to &#x60;selected&#x60;. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;organization_actions_variables:write&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String name = "name_example"; // String | The name of the variable.
    Integer repositoryId = 56; // Integer | 
    try {
      apiInstance.actionsRemoveSelectedRepoFromOrgVariable(org, name, repositoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsRemoveSelectedRepoFromOrgVariable");
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
| **name** | **String**| The name of the variable. | |
| **repositoryId** | **Integer**|  | |

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
| **409** | Response when the visibility of the variable is not set to &#x60;selected&#x60; |  -  |

<a name="actionsRemoveSelectedRepoFromRequiredWorkflow"></a>
# **actionsRemoveSelectedRepoFromRequiredWorkflow**
> actionsRemoveSelectedRepoFromRequiredWorkflow(org, requiredWorkflowId, repositoryId)

Remove a selected repository from required workflow

Removes a repository from a required workflow. To use this endpoint, the required workflow must be configured to run on selected repositories.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.  For more information, see \&quot;[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer requiredWorkflowId = 56; // Integer | The unique identifier of the required workflow.
    Integer repositoryId = 56; // Integer | The unique identifier of the repository.
    try {
      apiInstance.actionsRemoveSelectedRepoFromRequiredWorkflow(org, requiredWorkflowId, repositoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsRemoveSelectedRepoFromRequiredWorkflow");
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
| **requiredWorkflowId** | **Integer**| The unique identifier of the required workflow. | |
| **repositoryId** | **Integer**| The unique identifier of the repository. | |

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
| **204** | Success |  -  |
| **404** | Resource Not Found |  -  |
| **422** | Validation Error |  -  |

<a name="actionsReviewCustomGatesForRun"></a>
# **actionsReviewCustomGatesForRun**
> actionsReviewCustomGatesForRun(owner, repo, runId, actionsReviewCustomGatesForRunRequest)

Review custom deployment protection rules for a workflow run

Approve or reject custom deployment protection rules provided by a GitHub App for a workflow run. For more information, see \&quot;[Using environments for deployment](https://docs.github.com/actions/deployment/targeting-different-environments/using-environments-for-deployment).\&quot;  **Note:** GitHub Apps can only review their own custom deployment protection rules. To approve or reject pending deployments that are waiting for review from a specific person or team, see [&#x60;POST /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments&#x60;](/rest/actions/workflow-runs#review-pending-deployments-for-a-workflow-run).  GitHub Apps must have read and write permission for **Deployments** to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    ActionsReviewCustomGatesForRunRequest actionsReviewCustomGatesForRunRequest = new ActionsReviewCustomGatesForRunRequest(); // ActionsReviewCustomGatesForRunRequest | 
    try {
      apiInstance.actionsReviewCustomGatesForRun(owner, repo, runId, actionsReviewCustomGatesForRunRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsReviewCustomGatesForRun");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |
| **actionsReviewCustomGatesForRunRequest** | [**ActionsReviewCustomGatesForRunRequest**](ActionsReviewCustomGatesForRunRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="actionsReviewPendingDeploymentsForRun"></a>
# **actionsReviewPendingDeploymentsForRun**
> List&lt;Deployment&gt; actionsReviewPendingDeploymentsForRun(owner, repo, runId, actionsReviewPendingDeploymentsForRunRequest)

Review pending deployments for a workflow run

Approve or reject pending deployments that are waiting on approval by a required reviewer.  Required reviewers with read access to the repository contents and deployments can use this endpoint. Required reviewers must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runId = 56; // Integer | The unique identifier of the workflow run.
    ActionsReviewPendingDeploymentsForRunRequest actionsReviewPendingDeploymentsForRunRequest = new ActionsReviewPendingDeploymentsForRunRequest(); // ActionsReviewPendingDeploymentsForRunRequest | 
    try {
      List<Deployment> result = apiInstance.actionsReviewPendingDeploymentsForRun(owner, repo, runId, actionsReviewPendingDeploymentsForRunRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsReviewPendingDeploymentsForRun");
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
| **runId** | **Integer**| The unique identifier of the workflow run. | |
| **actionsReviewPendingDeploymentsForRunRequest** | [**ActionsReviewPendingDeploymentsForRunRequest**](ActionsReviewPendingDeploymentsForRunRequest.md)|  | |

### Return type

[**List&lt;Deployment&gt;**](Deployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="actionsSetAllowedActionsOrganization"></a>
# **actionsSetAllowedActionsOrganization**
> actionsSetAllowedActionsOrganization(org, selectedActions)

Set allowed actions and reusable workflows for an organization

Sets the actions and reusable workflows that are allowed in an organization. To use this endpoint, the organization permission policy for &#x60;allowed_actions&#x60; must be configured to &#x60;selected&#x60;. For more information, see \&quot;[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\&quot;  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration&#x60; organization permission to use this API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    SelectedActions selectedActions = new SelectedActions(); // SelectedActions | 
    try {
      apiInstance.actionsSetAllowedActionsOrganization(org, selectedActions);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsSetAllowedActionsOrganization");
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
| **selectedActions** | [**SelectedActions**](SelectedActions.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="actionsSetAllowedActionsRepository"></a>
# **actionsSetAllowedActionsRepository**
> actionsSetAllowedActionsRepository(owner, repo, selectedActions)

Set allowed actions and reusable workflows for a repository

Sets the actions and reusable workflows that are allowed in a repository. To use this endpoint, the repository permission policy for &#x60;allowed_actions&#x60; must be configured to &#x60;selected&#x60;. For more information, see \&quot;[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository).\&quot;  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration&#x60; repository permission to use this API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    SelectedActions selectedActions = new SelectedActions(); // SelectedActions | 
    try {
      apiInstance.actionsSetAllowedActionsRepository(owner, repo, selectedActions);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsSetAllowedActionsRepository");
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
| **selectedActions** | [**SelectedActions**](SelectedActions.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="actionsSetCustomLabelsForSelfHostedRunnerForOrg"></a>
# **actionsSetCustomLabelsForSelfHostedRunnerForOrg**
> ActionsListLabelsForSelfHostedRunnerForOrg200Response actionsSetCustomLabelsForSelfHostedRunnerForOrg(org, runnerId, actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest)

Set custom labels for a self-hosted runner for an organization

Remove all previous custom labels and set the new custom labels for a specific self-hosted runner configured in an organization.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer runnerId = 56; // Integer | Unique identifier of the self-hosted runner.
    ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest = new ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest(); // ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest | 
    try {
      ActionsListLabelsForSelfHostedRunnerForOrg200Response result = apiInstance.actionsSetCustomLabelsForSelfHostedRunnerForOrg(org, runnerId, actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsSetCustomLabelsForSelfHostedRunnerForOrg");
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
| **runnerId** | **Integer**| Unique identifier of the self-hosted runner. | |
| **actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest** | [**ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest**](ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest.md)|  | |

### Return type

[**ActionsListLabelsForSelfHostedRunnerForOrg200Response**](ActionsListLabelsForSelfHostedRunnerForOrg200Response.md)

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

<a name="actionsSetCustomLabelsForSelfHostedRunnerForRepo"></a>
# **actionsSetCustomLabelsForSelfHostedRunnerForRepo**
> ActionsListLabelsForSelfHostedRunnerForOrg200Response actionsSetCustomLabelsForSelfHostedRunnerForRepo(owner, repo, runnerId, actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest)

Set custom labels for a self-hosted runner for a repository

Remove all previous custom labels and set the new custom labels for a specific self-hosted runner configured in a repository.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer runnerId = 56; // Integer | Unique identifier of the self-hosted runner.
    ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest = new ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest(); // ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest | 
    try {
      ActionsListLabelsForSelfHostedRunnerForOrg200Response result = apiInstance.actionsSetCustomLabelsForSelfHostedRunnerForRepo(owner, repo, runnerId, actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsSetCustomLabelsForSelfHostedRunnerForRepo");
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
| **runnerId** | **Integer**| Unique identifier of the self-hosted runner. | |
| **actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest** | [**ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest**](ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest.md)|  | |

### Return type

[**ActionsListLabelsForSelfHostedRunnerForOrg200Response**](ActionsListLabelsForSelfHostedRunnerForOrg200Response.md)

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

<a name="actionsSetCustomOidcSubClaimForRepo"></a>
# **actionsSetCustomOidcSubClaimForRepo**
> Object actionsSetCustomOidcSubClaimForRepo(owner, repo, actionsOIDCSubjectCustomizationForARepository)

Set the customization template for an OIDC subject claim for a repository

Sets the customization template and &#x60;opt-in&#x60; or &#x60;opt-out&#x60; flag for an OpenID Connect (OIDC) subject claim for a repository. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions:write&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ActionsOIDCSubjectCustomizationForARepository actionsOIDCSubjectCustomizationForARepository = new ActionsOIDCSubjectCustomizationForARepository(); // ActionsOIDCSubjectCustomizationForARepository | 
    try {
      Object result = apiInstance.actionsSetCustomOidcSubClaimForRepo(owner, repo, actionsOIDCSubjectCustomizationForARepository);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsSetCustomOidcSubClaimForRepo");
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
| **actionsOIDCSubjectCustomizationForARepository** | [**ActionsOIDCSubjectCustomizationForARepository**](ActionsOIDCSubjectCustomizationForARepository.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Empty response |  -  |
| **404** | Resource not found |  -  |
| **400** | Bad Request |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="actionsSetGithubActionsDefaultWorkflowPermissionsOrganization"></a>
# **actionsSetGithubActionsDefaultWorkflowPermissionsOrganization**
> actionsSetGithubActionsDefaultWorkflowPermissionsOrganization(org, actionsSetDefaultWorkflowPermissions)

Set default workflow permissions for an organization

Sets the default workflow permissions granted to the &#x60;GITHUB_TOKEN&#x60; when running workflows in an organization, and sets if GitHub Actions can submit approving pull request reviews. For more information, see \&quot;[Setting the permissions of the GITHUB_TOKEN for your organization](https://docs.github.com/organizations/managing-organization-settings/disabling-or-limiting-github-actions-for-your-organization#setting-the-permissions-of-the-github_token-for-your-organization).\&quot;  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration&#x60; organization permission to use this API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    ActionsSetDefaultWorkflowPermissions actionsSetDefaultWorkflowPermissions = new ActionsSetDefaultWorkflowPermissions(); // ActionsSetDefaultWorkflowPermissions | 
    try {
      apiInstance.actionsSetGithubActionsDefaultWorkflowPermissionsOrganization(org, actionsSetDefaultWorkflowPermissions);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsSetGithubActionsDefaultWorkflowPermissionsOrganization");
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
| **actionsSetDefaultWorkflowPermissions** | [**ActionsSetDefaultWorkflowPermissions**](ActionsSetDefaultWorkflowPermissions.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success response |  -  |

<a name="actionsSetGithubActionsDefaultWorkflowPermissionsRepository"></a>
# **actionsSetGithubActionsDefaultWorkflowPermissionsRepository**
> actionsSetGithubActionsDefaultWorkflowPermissionsRepository(owner, repo, actionsSetDefaultWorkflowPermissions)

Set default workflow permissions for a repository

Sets the default workflow permissions granted to the &#x60;GITHUB_TOKEN&#x60; when running workflows in a repository, and sets if GitHub Actions can submit approving pull request reviews. For more information, see \&quot;[Setting the permissions of the GITHUB_TOKEN for your repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#setting-the-permissions-of-the-github_token-for-your-repository).\&quot;  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the repository &#x60;administration&#x60; permission to use this API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ActionsSetDefaultWorkflowPermissions actionsSetDefaultWorkflowPermissions = new ActionsSetDefaultWorkflowPermissions(); // ActionsSetDefaultWorkflowPermissions | 
    try {
      apiInstance.actionsSetGithubActionsDefaultWorkflowPermissionsRepository(owner, repo, actionsSetDefaultWorkflowPermissions);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsSetGithubActionsDefaultWorkflowPermissionsRepository");
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
| **actionsSetDefaultWorkflowPermissions** | [**ActionsSetDefaultWorkflowPermissions**](ActionsSetDefaultWorkflowPermissions.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success response |  -  |
| **409** | Conflict response when changing a setting is prevented by the owning organization |  -  |

<a name="actionsSetGithubActionsPermissionsOrganization"></a>
# **actionsSetGithubActionsPermissionsOrganization**
> actionsSetGithubActionsPermissionsOrganization(org, actionsSetGithubActionsPermissionsOrganizationRequest)

Set GitHub Actions permissions for an organization

Sets the GitHub Actions permissions policy for repositories and allowed actions and reusable workflows in an organization.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration&#x60; organization permission to use this API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    ActionsSetGithubActionsPermissionsOrganizationRequest actionsSetGithubActionsPermissionsOrganizationRequest = new ActionsSetGithubActionsPermissionsOrganizationRequest(); // ActionsSetGithubActionsPermissionsOrganizationRequest | 
    try {
      apiInstance.actionsSetGithubActionsPermissionsOrganization(org, actionsSetGithubActionsPermissionsOrganizationRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsSetGithubActionsPermissionsOrganization");
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
| **actionsSetGithubActionsPermissionsOrganizationRequest** | [**ActionsSetGithubActionsPermissionsOrganizationRequest**](ActionsSetGithubActionsPermissionsOrganizationRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="actionsSetGithubActionsPermissionsRepository"></a>
# **actionsSetGithubActionsPermissionsRepository**
> actionsSetGithubActionsPermissionsRepository(owner, repo, actionsSetGithubActionsPermissionsRepositoryRequest)

Set GitHub Actions permissions for a repository

Sets the GitHub Actions permissions policy for enabling GitHub Actions and allowed actions and reusable workflows in the repository.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration&#x60; repository permission to use this API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ActionsSetGithubActionsPermissionsRepositoryRequest actionsSetGithubActionsPermissionsRepositoryRequest = new ActionsSetGithubActionsPermissionsRepositoryRequest(); // ActionsSetGithubActionsPermissionsRepositoryRequest | 
    try {
      apiInstance.actionsSetGithubActionsPermissionsRepository(owner, repo, actionsSetGithubActionsPermissionsRepositoryRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsSetGithubActionsPermissionsRepository");
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
| **actionsSetGithubActionsPermissionsRepositoryRequest** | [**ActionsSetGithubActionsPermissionsRepositoryRequest**](ActionsSetGithubActionsPermissionsRepositoryRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="actionsSetSelectedReposForOrgSecret"></a>
# **actionsSetSelectedReposForOrgSecret**
> actionsSetSelectedReposForOrgSecret(org, secretName, actionsSetSelectedReposForOrgSecretRequest)

Set selected repositories for an organization secret

Replaces all repositories for an organization secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/actions#create-or-update-an-organization-secret). You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;secrets&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    ActionsSetSelectedReposForOrgSecretRequest actionsSetSelectedReposForOrgSecretRequest = new ActionsSetSelectedReposForOrgSecretRequest(); // ActionsSetSelectedReposForOrgSecretRequest | 
    try {
      apiInstance.actionsSetSelectedReposForOrgSecret(org, secretName, actionsSetSelectedReposForOrgSecretRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsSetSelectedReposForOrgSecret");
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
| **secretName** | **String**| The name of the secret. | |
| **actionsSetSelectedReposForOrgSecretRequest** | [**ActionsSetSelectedReposForOrgSecretRequest**](ActionsSetSelectedReposForOrgSecretRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="actionsSetSelectedReposForOrgVariable"></a>
# **actionsSetSelectedReposForOrgVariable**
> actionsSetSelectedReposForOrgVariable(org, name, actionsSetSelectedReposForOrgVariableRequest)

Set selected repositories for an organization variable

Replaces all repositories for an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their &#x60;visibility&#x60; field set to &#x60;selected&#x60;. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;organization_actions_variables:write&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String name = "name_example"; // String | The name of the variable.
    ActionsSetSelectedReposForOrgVariableRequest actionsSetSelectedReposForOrgVariableRequest = new ActionsSetSelectedReposForOrgVariableRequest(); // ActionsSetSelectedReposForOrgVariableRequest | 
    try {
      apiInstance.actionsSetSelectedReposForOrgVariable(org, name, actionsSetSelectedReposForOrgVariableRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsSetSelectedReposForOrgVariable");
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
| **name** | **String**| The name of the variable. | |
| **actionsSetSelectedReposForOrgVariableRequest** | [**ActionsSetSelectedReposForOrgVariableRequest**](ActionsSetSelectedReposForOrgVariableRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **409** | Response when the visibility of the variable is not set to &#x60;selected&#x60; |  -  |

<a name="actionsSetSelectedReposToRequiredWorkflow"></a>
# **actionsSetSelectedReposToRequiredWorkflow**
> actionsSetSelectedReposToRequiredWorkflow(org, requiredWorkflowId, actionsSetSelectedReposToRequiredWorkflowRequest)

Sets repositories for a required workflow

Sets the repositories for a required workflow that is required for selected repositories.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.  For more information, see \&quot;[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer requiredWorkflowId = 56; // Integer | The unique identifier of the required workflow.
    ActionsSetSelectedReposToRequiredWorkflowRequest actionsSetSelectedReposToRequiredWorkflowRequest = new ActionsSetSelectedReposToRequiredWorkflowRequest(); // ActionsSetSelectedReposToRequiredWorkflowRequest | 
    try {
      apiInstance.actionsSetSelectedReposToRequiredWorkflow(org, requiredWorkflowId, actionsSetSelectedReposToRequiredWorkflowRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsSetSelectedReposToRequiredWorkflow");
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
| **requiredWorkflowId** | **Integer**| The unique identifier of the required workflow. | |
| **actionsSetSelectedReposToRequiredWorkflowRequest** | [**ActionsSetSelectedReposToRequiredWorkflowRequest**](ActionsSetSelectedReposToRequiredWorkflowRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="actionsSetSelectedRepositoriesEnabledGithubActionsOrganization"></a>
# **actionsSetSelectedRepositoriesEnabledGithubActionsOrganization**
> actionsSetSelectedRepositoriesEnabledGithubActionsOrganization(org, actionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest)

Set selected repositories enabled for GitHub Actions in an organization

Replaces the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for &#x60;enabled_repositories&#x60; must be configured to &#x60;selected&#x60;. For more information, see \&quot;[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\&quot;  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;administration&#x60; organization permission to use this API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    ActionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest actionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest = new ActionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest(); // ActionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest | 
    try {
      apiInstance.actionsSetSelectedRepositoriesEnabledGithubActionsOrganization(org, actionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsSetSelectedRepositoriesEnabledGithubActionsOrganization");
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
| **actionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest** | [**ActionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest**](ActionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="actionsSetWorkflowAccessToRepository"></a>
# **actionsSetWorkflowAccessToRepository**
> actionsSetWorkflowAccessToRepository(owner, repo, actionsWorkflowAccessToRepository)

Set the level of access for workflows outside of the repository

Sets the level of access that workflows outside of the repository have to actions and reusable workflows in the repository. This endpoint only applies to private repositories. For more information, see \&quot;[Allowing access to components in a private repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#allowing-access-to-components-in-a-private-repository)\&quot;.  You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the repository &#x60;administration&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    ActionsWorkflowAccessToRepository actionsWorkflowAccessToRepository = new ActionsWorkflowAccessToRepository(); // ActionsWorkflowAccessToRepository | 
    try {
      apiInstance.actionsSetWorkflowAccessToRepository(owner, repo, actionsWorkflowAccessToRepository);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsSetWorkflowAccessToRepository");
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
| **actionsWorkflowAccessToRepository** | [**ActionsWorkflowAccessToRepository**](ActionsWorkflowAccessToRepository.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="actionsUpdateEnvironmentVariable"></a>
# **actionsUpdateEnvironmentVariable**
> actionsUpdateEnvironmentVariable(repositoryId, name, environmentName, actionsUpdateRepoVariableRequest)

Update an environment variable

Updates an environment variable that you can reference in a GitHub Actions workflow. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;environment:write&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    Integer repositoryId = 56; // Integer | The unique identifier of the repository.
    String name = "name_example"; // String | The name of the variable.
    String environmentName = "environmentName_example"; // String | The name of the environment.
    ActionsUpdateRepoVariableRequest actionsUpdateRepoVariableRequest = new ActionsUpdateRepoVariableRequest(); // ActionsUpdateRepoVariableRequest | 
    try {
      apiInstance.actionsUpdateEnvironmentVariable(repositoryId, name, environmentName, actionsUpdateRepoVariableRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsUpdateEnvironmentVariable");
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
| **repositoryId** | **Integer**| The unique identifier of the repository. | |
| **name** | **String**| The name of the variable. | |
| **environmentName** | **String**| The name of the environment. | |
| **actionsUpdateRepoVariableRequest** | [**ActionsUpdateRepoVariableRequest**](ActionsUpdateRepoVariableRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="actionsUpdateOrgVariable"></a>
# **actionsUpdateOrgVariable**
> actionsUpdateOrgVariable(org, name, actionsUpdateOrgVariableRequest)

Update an organization variable

Updates an organization variable that you can reference in a GitHub Actions workflow. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;organization_actions_variables:write&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String name = "name_example"; // String | The name of the variable.
    ActionsUpdateOrgVariableRequest actionsUpdateOrgVariableRequest = new ActionsUpdateOrgVariableRequest(); // ActionsUpdateOrgVariableRequest | 
    try {
      apiInstance.actionsUpdateOrgVariable(org, name, actionsUpdateOrgVariableRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsUpdateOrgVariable");
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
| **name** | **String**| The name of the variable. | |
| **actionsUpdateOrgVariableRequest** | [**ActionsUpdateOrgVariableRequest**](ActionsUpdateOrgVariableRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="actionsUpdateRepoVariable"></a>
# **actionsUpdateRepoVariable**
> actionsUpdateRepoVariable(owner, repo, name, actionsUpdateRepoVariableRequest)

Update a repository variable

Updates a repository variable that you can reference in a GitHub Actions workflow. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;actions_variables:write&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String name = "name_example"; // String | The name of the variable.
    ActionsUpdateRepoVariableRequest actionsUpdateRepoVariableRequest = new ActionsUpdateRepoVariableRequest(); // ActionsUpdateRepoVariableRequest | 
    try {
      apiInstance.actionsUpdateRepoVariable(owner, repo, name, actionsUpdateRepoVariableRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsUpdateRepoVariable");
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
| **name** | **String**| The name of the variable. | |
| **actionsUpdateRepoVariableRequest** | [**ActionsUpdateRepoVariableRequest**](ActionsUpdateRepoVariableRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |

<a name="actionsUpdateRequiredWorkflow"></a>
# **actionsUpdateRequiredWorkflow**
> RequiredWorkflow actionsUpdateRequiredWorkflow(org, requiredWorkflowId, actionsUpdateRequiredWorkflowRequest)

Update a required workflow

Update a required workflow in an organization.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.  For more information, see \&quot;[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    ActionsApi apiInstance = new ActionsApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer requiredWorkflowId = 56; // Integer | The unique identifier of the required workflow.
    ActionsUpdateRequiredWorkflowRequest actionsUpdateRequiredWorkflowRequest = new ActionsUpdateRequiredWorkflowRequest(); // ActionsUpdateRequiredWorkflowRequest | 
    try {
      RequiredWorkflow result = apiInstance.actionsUpdateRequiredWorkflow(org, requiredWorkflowId, actionsUpdateRequiredWorkflowRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#actionsUpdateRequiredWorkflow");
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
| **requiredWorkflowId** | **Integer**| The unique identifier of the required workflow. | |
| **actionsUpdateRequiredWorkflowRequest** | [**ActionsUpdateRequiredWorkflowRequest**](ActionsUpdateRequiredWorkflowRequest.md)|  | |

### Return type

[**RequiredWorkflow**](RequiredWorkflow.md)

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

