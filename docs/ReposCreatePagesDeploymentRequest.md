

# ReposCreatePagesDeploymentRequest

The object used to create GitHub Pages deployment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**artifactUrl** | **String** | The URL of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the repository. |  |
|**environment** | **String** | The target environment for this GitHub Pages deployment. |  [optional] |
|**pagesBuildVersion** | **String** | A unique string that represents the version of the build for this deployment. |  |
|**oidcToken** | **String** | The OIDC token issued by GitHub Actions certifying the origin of the deployment. |  |



