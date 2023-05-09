# PackagesApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**packagesDeletePackageForAuthenticatedUser**](PackagesApi.md#packagesDeletePackageForAuthenticatedUser) | **DELETE** /user/packages/{package_type}/{package_name} | Delete a package for the authenticated user |
| [**packagesDeletePackageForOrg**](PackagesApi.md#packagesDeletePackageForOrg) | **DELETE** /orgs/{org}/packages/{package_type}/{package_name} | Delete a package for an organization |
| [**packagesDeletePackageForUser**](PackagesApi.md#packagesDeletePackageForUser) | **DELETE** /users/{username}/packages/{package_type}/{package_name} | Delete a package for a user |
| [**packagesDeletePackageVersionForAuthenticatedUser**](PackagesApi.md#packagesDeletePackageVersionForAuthenticatedUser) | **DELETE** /user/packages/{package_type}/{package_name}/versions/{package_version_id} | Delete a package version for the authenticated user |
| [**packagesDeletePackageVersionForOrg**](PackagesApi.md#packagesDeletePackageVersionForOrg) | **DELETE** /orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id} | Delete package version for an organization |
| [**packagesDeletePackageVersionForUser**](PackagesApi.md#packagesDeletePackageVersionForUser) | **DELETE** /users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id} | Delete package version for a user |
| [**packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUser**](PackagesApi.md#packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUser) | **GET** /user/packages/{package_type}/{package_name}/versions | List package versions for a package owned by the authenticated user |
| [**packagesGetAllPackageVersionsForPackageOwnedByOrg**](PackagesApi.md#packagesGetAllPackageVersionsForPackageOwnedByOrg) | **GET** /orgs/{org}/packages/{package_type}/{package_name}/versions | List package versions for a package owned by an organization |
| [**packagesGetAllPackageVersionsForPackageOwnedByUser**](PackagesApi.md#packagesGetAllPackageVersionsForPackageOwnedByUser) | **GET** /users/{username}/packages/{package_type}/{package_name}/versions | List package versions for a package owned by a user |
| [**packagesGetPackageForAuthenticatedUser**](PackagesApi.md#packagesGetPackageForAuthenticatedUser) | **GET** /user/packages/{package_type}/{package_name} | Get a package for the authenticated user |
| [**packagesGetPackageForOrganization**](PackagesApi.md#packagesGetPackageForOrganization) | **GET** /orgs/{org}/packages/{package_type}/{package_name} | Get a package for an organization |
| [**packagesGetPackageForUser**](PackagesApi.md#packagesGetPackageForUser) | **GET** /users/{username}/packages/{package_type}/{package_name} | Get a package for a user |
| [**packagesGetPackageVersionForAuthenticatedUser**](PackagesApi.md#packagesGetPackageVersionForAuthenticatedUser) | **GET** /user/packages/{package_type}/{package_name}/versions/{package_version_id} | Get a package version for the authenticated user |
| [**packagesGetPackageVersionForOrganization**](PackagesApi.md#packagesGetPackageVersionForOrganization) | **GET** /orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id} | Get a package version for an organization |
| [**packagesGetPackageVersionForUser**](PackagesApi.md#packagesGetPackageVersionForUser) | **GET** /users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id} | Get a package version for a user |
| [**packagesListDockerMigrationConflictingPackagesForAuthenticatedUser**](PackagesApi.md#packagesListDockerMigrationConflictingPackagesForAuthenticatedUser) | **GET** /user/docker/conflicts | Get list of conflicting packages during Docker migration for authenticated-user |
| [**packagesListDockerMigrationConflictingPackagesForOrganization**](PackagesApi.md#packagesListDockerMigrationConflictingPackagesForOrganization) | **GET** /orgs/{org}/docker/conflicts | Get list of conflicting packages during Docker migration for organization |
| [**packagesListDockerMigrationConflictingPackagesForUser**](PackagesApi.md#packagesListDockerMigrationConflictingPackagesForUser) | **GET** /users/{username}/docker/conflicts | Get list of conflicting packages during Docker migration for user |
| [**packagesListPackagesForAuthenticatedUser**](PackagesApi.md#packagesListPackagesForAuthenticatedUser) | **GET** /user/packages | List packages for the authenticated user&#39;s namespace |
| [**packagesListPackagesForOrganization**](PackagesApi.md#packagesListPackagesForOrganization) | **GET** /orgs/{org}/packages | List packages for an organization |
| [**packagesListPackagesForUser**](PackagesApi.md#packagesListPackagesForUser) | **GET** /users/{username}/packages | List packages for a user |
| [**packagesRestorePackageForAuthenticatedUser**](PackagesApi.md#packagesRestorePackageForAuthenticatedUser) | **POST** /user/packages/{package_type}/{package_name}/restore | Restore a package for the authenticated user |
| [**packagesRestorePackageForOrg**](PackagesApi.md#packagesRestorePackageForOrg) | **POST** /orgs/{org}/packages/{package_type}/{package_name}/restore | Restore a package for an organization |
| [**packagesRestorePackageForUser**](PackagesApi.md#packagesRestorePackageForUser) | **POST** /users/{username}/packages/{package_type}/{package_name}/restore | Restore a package for a user |
| [**packagesRestorePackageVersionForAuthenticatedUser**](PackagesApi.md#packagesRestorePackageVersionForAuthenticatedUser) | **POST** /user/packages/{package_type}/{package_name}/versions/{package_version_id}/restore | Restore a package version for the authenticated user |
| [**packagesRestorePackageVersionForOrg**](PackagesApi.md#packagesRestorePackageVersionForOrg) | **POST** /orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id}/restore | Restore package version for an organization |
| [**packagesRestorePackageVersionForUser**](PackagesApi.md#packagesRestorePackageVersionForUser) | **POST** /users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id}/restore | Restore package version for a user |


<a name="packagesDeletePackageForAuthenticatedUser"></a>
# **packagesDeletePackageForAuthenticatedUser**
> packagesDeletePackageForAuthenticatedUser(packageType, packageName)

Delete a package for the authenticated user

Deletes a package owned by the authenticated user. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.  To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; and &#x60;delete:packages&#x60; scopes. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    try {
      apiInstance.packagesDeletePackageForAuthenticatedUser(packageType, packageName);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesDeletePackageForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |

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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="packagesDeletePackageForOrg"></a>
# **packagesDeletePackageForOrg**
> packagesDeletePackageForOrg(packageType, packageName, org)

Delete a package for an organization

Deletes an entire package in an organization. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.  To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the &#x60;read:packages&#x60; and &#x60;delete:packages&#x60; scopes. In addition: - If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot; - If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to delete. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      apiInstance.packagesDeletePackageForOrg(packageType, packageName, org);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesDeletePackageForOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **org** | **String**| The organization name. The name is not case sensitive. | |

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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="packagesDeletePackageForUser"></a>
# **packagesDeletePackageForUser**
> packagesDeletePackageForUser(packageType, packageName, username)

Delete a package for a user

Deletes an entire package for a user. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.  To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; and &#x60;delete:packages&#x60; scopes. In addition: - If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot; - If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to delete. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      apiInstance.packagesDeletePackageForUser(packageType, packageName, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesDeletePackageForUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **username** | **String**| The handle for the GitHub user account. | |

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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="packagesDeletePackageVersionForAuthenticatedUser"></a>
# **packagesDeletePackageVersionForAuthenticatedUser**
> packagesDeletePackageVersionForAuthenticatedUser(packageType, packageName, packageVersionId)

Delete a package version for the authenticated user

Deletes a specific package version for a package owned by the authenticated user.  If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.  To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the &#x60;read:packages&#x60; and &#x60;delete:packages&#x60; scopes. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    Integer packageVersionId = 56; // Integer | Unique identifier of the package version.
    try {
      apiInstance.packagesDeletePackageVersionForAuthenticatedUser(packageType, packageName, packageVersionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesDeletePackageVersionForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **packageVersionId** | **Integer**| Unique identifier of the package version. | |

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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="packagesDeletePackageVersionForOrg"></a>
# **packagesDeletePackageVersionForOrg**
> packagesDeletePackageVersionForOrg(packageType, packageName, org, packageVersionId)

Delete package version for an organization

Deletes a specific package version in an organization. If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.  To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the &#x60;read:packages&#x60; and &#x60;delete:packages&#x60; scopes. In addition: - If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot; - If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to delete. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer packageVersionId = 56; // Integer | Unique identifier of the package version.
    try {
      apiInstance.packagesDeletePackageVersionForOrg(packageType, packageName, org, packageVersionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesDeletePackageVersionForOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **packageVersionId** | **Integer**| Unique identifier of the package version. | |

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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="packagesDeletePackageVersionForUser"></a>
# **packagesDeletePackageVersionForUser**
> packagesDeletePackageVersionForUser(packageType, packageName, username, packageVersionId)

Delete package version for a user

Deletes a specific package version for a user. If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.  To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; and &#x60;delete:packages&#x60; scopes. In addition: - If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot; - If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to delete. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    String username = "username_example"; // String | The handle for the GitHub user account.
    Integer packageVersionId = 56; // Integer | Unique identifier of the package version.
    try {
      apiInstance.packagesDeletePackageVersionForUser(packageType, packageName, username, packageVersionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesDeletePackageVersionForUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **username** | **String**| The handle for the GitHub user account. | |
| **packageVersionId** | **Integer**| Unique identifier of the package version. | |

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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUser"></a>
# **packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUser**
> List&lt;PackageVersion&gt; packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUser(packageType, packageName, page, perPage, state)

List package versions for a package owned by the authenticated user

Lists package versions for a package owned by the authenticated user.  To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; scope. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    String state = "active"; // String | The state of the package, either active or deleted.
    try {
      List<PackageVersion> result = apiInstance.packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUser(packageType, packageName, page, perPage, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **state** | **String**| The state of the package, either active or deleted. | [optional] [default to active] [enum: active, deleted] |

### Return type

[**List&lt;PackageVersion&gt;**](PackageVersion.md)

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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="packagesGetAllPackageVersionsForPackageOwnedByOrg"></a>
# **packagesGetAllPackageVersionsForPackageOwnedByOrg**
> List&lt;PackageVersion&gt; packagesGetAllPackageVersionsForPackageOwnedByOrg(packageType, packageName, org, page, perPage, state)

List package versions for a package owned by an organization

Lists package versions for a package owned by an organization.  If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    String state = "active"; // String | The state of the package, either active or deleted.
    try {
      List<PackageVersion> result = apiInstance.packagesGetAllPackageVersionsForPackageOwnedByOrg(packageType, packageName, org, page, perPage, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesGetAllPackageVersionsForPackageOwnedByOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **state** | **String**| The state of the package, either active or deleted. | [optional] [default to active] [enum: active, deleted] |

### Return type

[**List&lt;PackageVersion&gt;**](PackageVersion.md)

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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="packagesGetAllPackageVersionsForPackageOwnedByUser"></a>
# **packagesGetAllPackageVersionsForPackageOwnedByUser**
> List&lt;PackageVersion&gt; packagesGetAllPackageVersionsForPackageOwnedByUser(packageType, packageName, username)

List package versions for a package owned by a user

Lists package versions for a public package owned by a specified user.  To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; scope. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      List<PackageVersion> result = apiInstance.packagesGetAllPackageVersionsForPackageOwnedByUser(packageType, packageName, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesGetAllPackageVersionsForPackageOwnedByUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **username** | **String**| The handle for the GitHub user account. | |

### Return type

[**List&lt;PackageVersion&gt;**](PackageVersion.md)

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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="packagesGetPackageForAuthenticatedUser"></a>
# **packagesGetPackageForAuthenticatedUser**
> ModelPackage packagesGetPackageForAuthenticatedUser(packageType, packageName)

Get a package for the authenticated user

Gets a specific package for a package owned by the authenticated user.  To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; scope. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    try {
      ModelPackage result = apiInstance.packagesGetPackageForAuthenticatedUser(packageType, packageName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesGetPackageForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |

### Return type

[**ModelPackage**](ModelPackage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="packagesGetPackageForOrganization"></a>
# **packagesGetPackageForOrganization**
> ModelPackage packagesGetPackageForOrganization(packageType, packageName, org)

Get a package for an organization

Gets a specific package in an organization.  To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; scope. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      ModelPackage result = apiInstance.packagesGetPackageForOrganization(packageType, packageName, org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesGetPackageForOrganization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **org** | **String**| The organization name. The name is not case sensitive. | |

### Return type

[**ModelPackage**](ModelPackage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="packagesGetPackageForUser"></a>
# **packagesGetPackageForUser**
> ModelPackage packagesGetPackageForUser(packageType, packageName, username)

Get a package for a user

Gets a specific package metadata for a public package owned by a user.  To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; scope. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      ModelPackage result = apiInstance.packagesGetPackageForUser(packageType, packageName, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesGetPackageForUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **username** | **String**| The handle for the GitHub user account. | |

### Return type

[**ModelPackage**](ModelPackage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="packagesGetPackageVersionForAuthenticatedUser"></a>
# **packagesGetPackageVersionForAuthenticatedUser**
> PackageVersion packagesGetPackageVersionForAuthenticatedUser(packageType, packageName, packageVersionId)

Get a package version for the authenticated user

Gets a specific package version for a package owned by the authenticated user.  To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; scope. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    Integer packageVersionId = 56; // Integer | Unique identifier of the package version.
    try {
      PackageVersion result = apiInstance.packagesGetPackageVersionForAuthenticatedUser(packageType, packageName, packageVersionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesGetPackageVersionForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **packageVersionId** | **Integer**| Unique identifier of the package version. | |

### Return type

[**PackageVersion**](PackageVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="packagesGetPackageVersionForOrganization"></a>
# **packagesGetPackageVersionForOrganization**
> PackageVersion packagesGetPackageVersionForOrganization(packageType, packageName, org, packageVersionId)

Get a package version for an organization

Gets a specific package version in an organization.  You must authenticate using an access token with the &#x60;read:packages&#x60; scope. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer packageVersionId = 56; // Integer | Unique identifier of the package version.
    try {
      PackageVersion result = apiInstance.packagesGetPackageVersionForOrganization(packageType, packageName, org, packageVersionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesGetPackageVersionForOrganization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **packageVersionId** | **Integer**| Unique identifier of the package version. | |

### Return type

[**PackageVersion**](PackageVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="packagesGetPackageVersionForUser"></a>
# **packagesGetPackageVersionForUser**
> PackageVersion packagesGetPackageVersionForUser(packageType, packageName, packageVersionId, username)

Get a package version for a user

Gets a specific package version for a public package owned by a specified user.  At this time, to use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; scope. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    Integer packageVersionId = 56; // Integer | Unique identifier of the package version.
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      PackageVersion result = apiInstance.packagesGetPackageVersionForUser(packageType, packageName, packageVersionId, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesGetPackageVersionForUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **packageVersionId** | **Integer**| Unique identifier of the package version. | |
| **username** | **String**| The handle for the GitHub user account. | |

### Return type

[**PackageVersion**](PackageVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="packagesListDockerMigrationConflictingPackagesForAuthenticatedUser"></a>
# **packagesListDockerMigrationConflictingPackagesForAuthenticatedUser**
> List&lt;ModelPackage&gt; packagesListDockerMigrationConflictingPackagesForAuthenticatedUser()

Get list of conflicting packages during Docker migration for authenticated-user

Lists all packages that are owned by the authenticated user within the user&#39;s namespace, and that encountered a conflict during a Docker migration. To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    try {
      List<ModelPackage> result = apiInstance.packagesListDockerMigrationConflictingPackagesForAuthenticatedUser();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesListDockerMigrationConflictingPackagesForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ModelPackage&gt;**](ModelPackage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="packagesListDockerMigrationConflictingPackagesForOrganization"></a>
# **packagesListDockerMigrationConflictingPackagesForOrganization**
> List&lt;ModelPackage&gt; packagesListDockerMigrationConflictingPackagesForOrganization(org)

Get list of conflicting packages during Docker migration for organization

Lists all packages that are in a specific organization, are readable by the requesting user, and that encountered a conflict during a Docker migration. To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      List<ModelPackage> result = apiInstance.packagesListDockerMigrationConflictingPackagesForOrganization(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesListDockerMigrationConflictingPackagesForOrganization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**List&lt;ModelPackage&gt;**](ModelPackage.md)

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
| **401** | Requires authentication |  -  |

<a name="packagesListDockerMigrationConflictingPackagesForUser"></a>
# **packagesListDockerMigrationConflictingPackagesForUser**
> List&lt;ModelPackage&gt; packagesListDockerMigrationConflictingPackagesForUser(username)

Get list of conflicting packages during Docker migration for user

Lists all packages that are in a specific user&#39;s namespace, that the requesting user has access to, and that encountered a conflict during Docker migration. To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; scope.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String username = "username_example"; // String | The handle for the GitHub user account.
    try {
      List<ModelPackage> result = apiInstance.packagesListDockerMigrationConflictingPackagesForUser(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesListDockerMigrationConflictingPackagesForUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

### Return type

[**List&lt;ModelPackage&gt;**](ModelPackage.md)

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
| **401** | Requires authentication |  -  |

<a name="packagesListPackagesForAuthenticatedUser"></a>
# **packagesListPackagesForAuthenticatedUser**
> List&lt;ModelPackage&gt; packagesListPackagesForAuthenticatedUser(packageType, visibility, page, perPage)

List packages for the authenticated user&#39;s namespace

Lists packages owned by the authenticated user within the user&#39;s namespace.  To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; scope. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String visibility = "public"; // String | The selected visibility of the packages.  This parameter is optional and only filters an existing result set.  The `internal` visibility is only supported for GitHub Packages registries that allow for granular permissions. For other ecosystems `internal` is synonymous with `private`. For the list of GitHub Packages registries that support granular permissions, see \"[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\"
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    try {
      List<ModelPackage> result = apiInstance.packagesListPackagesForAuthenticatedUser(packageType, visibility, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesListPackagesForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **visibility** | **String**| The selected visibility of the packages.  This parameter is optional and only filters an existing result set.  The &#x60;internal&#x60; visibility is only supported for GitHub Packages registries that allow for granular permissions. For other ecosystems &#x60;internal&#x60; is synonymous with &#x60;private&#x60;. For the list of GitHub Packages registries that support granular permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot; | [optional] [enum: public, private, internal] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |

### Return type

[**List&lt;ModelPackage&gt;**](ModelPackage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **400** | The value of &#x60;per_page&#x60; multiplied by &#x60;page&#x60; cannot be greater than 10000. |  -  |

<a name="packagesListPackagesForOrganization"></a>
# **packagesListPackagesForOrganization**
> List&lt;ModelPackage&gt; packagesListPackagesForOrganization(packageType, org, visibility, page, perPage)

List packages for an organization

Lists packages in an organization readable by the user.  To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; scope. If the &#x60;package_type&#x60; belongs to a registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String visibility = "public"; // String | The selected visibility of the packages.  This parameter is optional and only filters an existing result set.  The `internal` visibility is only supported for GitHub Packages registries that allow for granular permissions. For other ecosystems `internal` is synonymous with `private`. For the list of GitHub Packages registries that support granular permissions, see \"[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\"
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    try {
      List<ModelPackage> result = apiInstance.packagesListPackagesForOrganization(packageType, org, visibility, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesListPackagesForOrganization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **visibility** | **String**| The selected visibility of the packages.  This parameter is optional and only filters an existing result set.  The &#x60;internal&#x60; visibility is only supported for GitHub Packages registries that allow for granular permissions. For other ecosystems &#x60;internal&#x60; is synonymous with &#x60;private&#x60;. For the list of GitHub Packages registries that support granular permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot; | [optional] [enum: public, private, internal] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |

### Return type

[**List&lt;ModelPackage&gt;**](ModelPackage.md)

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
| **401** | Requires authentication |  -  |
| **400** | The value of &#x60;per_page&#x60; multiplied by &#x60;page&#x60; cannot be greater than 10000. |  -  |

<a name="packagesListPackagesForUser"></a>
# **packagesListPackagesForUser**
> List&lt;ModelPackage&gt; packagesListPackagesForUser(packageType, username, visibility, page, perPage)

List packages for a user

Lists all packages in a user&#39;s namespace for which the requesting user has access.  To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; scope. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String username = "username_example"; // String | The handle for the GitHub user account.
    String visibility = "public"; // String | The selected visibility of the packages.  This parameter is optional and only filters an existing result set.  The `internal` visibility is only supported for GitHub Packages registries that allow for granular permissions. For other ecosystems `internal` is synonymous with `private`. For the list of GitHub Packages registries that support granular permissions, see \"[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\"
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    try {
      List<ModelPackage> result = apiInstance.packagesListPackagesForUser(packageType, username, visibility, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesListPackagesForUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **username** | **String**| The handle for the GitHub user account. | |
| **visibility** | **String**| The selected visibility of the packages.  This parameter is optional and only filters an existing result set.  The &#x60;internal&#x60; visibility is only supported for GitHub Packages registries that allow for granular permissions. For other ecosystems &#x60;internal&#x60; is synonymous with &#x60;private&#x60;. For the list of GitHub Packages registries that support granular permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot; | [optional] [enum: public, private, internal] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |

### Return type

[**List&lt;ModelPackage&gt;**](ModelPackage.md)

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
| **401** | Requires authentication |  -  |
| **400** | The value of &#x60;per_page&#x60; multiplied by &#x60;page&#x60; cannot be greater than 10000. |  -  |

<a name="packagesRestorePackageForAuthenticatedUser"></a>
# **packagesRestorePackageForAuthenticatedUser**
> packagesRestorePackageForAuthenticatedUser(packageType, packageName, token)

Restore a package for the authenticated user

Restores a package owned by the authenticated user.  You can restore a deleted package under the following conditions:   - The package was deleted within the last 30 days.   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package&#39;s namespace first.  To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; and &#x60;write:packages&#x60; scopes. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    String token = "token_example"; // String | package token
    try {
      apiInstance.packagesRestorePackageForAuthenticatedUser(packageType, packageName, token);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesRestorePackageForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **token** | **String**| package token | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="packagesRestorePackageForOrg"></a>
# **packagesRestorePackageForOrg**
> packagesRestorePackageForOrg(packageType, packageName, org, token)

Restore a package for an organization

Restores an entire package in an organization.  You can restore a deleted package under the following conditions:   - The package was deleted within the last 30 days.   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package&#39;s namespace first.  To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the &#x60;read:packages&#x60; and &#x60;write:packages&#x60; scopes. In addition: - If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot; - If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to restore. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String token = "token_example"; // String | package token
    try {
      apiInstance.packagesRestorePackageForOrg(packageType, packageName, org, token);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesRestorePackageForOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **token** | **String**| package token | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="packagesRestorePackageForUser"></a>
# **packagesRestorePackageForUser**
> packagesRestorePackageForUser(packageType, packageName, username, token)

Restore a package for a user

Restores an entire package for a user.  You can restore a deleted package under the following conditions:   - The package was deleted within the last 30 days.   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package&#39;s namespace first.  To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; and &#x60;write:packages&#x60; scopes. In addition: - If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot; - If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to restore. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    String username = "username_example"; // String | The handle for the GitHub user account.
    String token = "token_example"; // String | package token
    try {
      apiInstance.packagesRestorePackageForUser(packageType, packageName, username, token);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesRestorePackageForUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **username** | **String**| The handle for the GitHub user account. | |
| **token** | **String**| package token | [optional] |

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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="packagesRestorePackageVersionForAuthenticatedUser"></a>
# **packagesRestorePackageVersionForAuthenticatedUser**
> packagesRestorePackageVersionForAuthenticatedUser(packageType, packageName, packageVersionId)

Restore a package version for the authenticated user

Restores a package version owned by the authenticated user.  You can restore a deleted package version under the following conditions:   - The package was deleted within the last 30 days.   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package&#39;s namespace first.  To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; and &#x60;write:packages&#x60; scopes. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    Integer packageVersionId = 56; // Integer | Unique identifier of the package version.
    try {
      apiInstance.packagesRestorePackageVersionForAuthenticatedUser(packageType, packageName, packageVersionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesRestorePackageVersionForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **packageVersionId** | **Integer**| Unique identifier of the package version. | |

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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="packagesRestorePackageVersionForOrg"></a>
# **packagesRestorePackageVersionForOrg**
> packagesRestorePackageVersionForOrg(packageType, packageName, org, packageVersionId)

Restore package version for an organization

Restores a specific package version in an organization.  You can restore a deleted package under the following conditions:   - The package was deleted within the last 30 days.   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package&#39;s namespace first.  To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the &#x60;read:packages&#x60; and &#x60;write:packages&#x60; scopes. In addition: - If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot; - If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to restore. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer packageVersionId = 56; // Integer | Unique identifier of the package version.
    try {
      apiInstance.packagesRestorePackageVersionForOrg(packageType, packageName, org, packageVersionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesRestorePackageVersionForOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **org** | **String**| The organization name. The name is not case sensitive. | |
| **packageVersionId** | **Integer**| Unique identifier of the package version. | |

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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

<a name="packagesRestorePackageVersionForUser"></a>
# **packagesRestorePackageVersionForUser**
> packagesRestorePackageVersionForUser(packageType, packageName, username, packageVersionId)

Restore package version for a user

Restores a specific package version for a user.  You can restore a deleted package under the following conditions:   - The package was deleted within the last 30 days.   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package&#39;s namespace first.  To use this endpoint, you must authenticate using an access token with the &#x60;read:packages&#x60; and &#x60;write:packages&#x60; scopes. In addition: - If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the &#x60;repo&#x60; scope. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot; - If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to restore. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    PackagesApi apiInstance = new PackagesApi(defaultClient);
    String packageType = "npm"; // String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
    String packageName = "packageName_example"; // String | The name of the package.
    String username = "username_example"; // String | The handle for the GitHub user account.
    Integer packageVersionId = 56; // Integer | Unique identifier of the package version.
    try {
      apiInstance.packagesRestorePackageVersionForUser(packageType, packageName, username, packageVersionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagesApi#packagesRestorePackageVersionForUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageType** | **String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container] |
| **packageName** | **String**| The name of the package. | |
| **username** | **String**| The handle for the GitHub user account. | |
| **packageVersionId** | **Integer**| Unique identifier of the package version. | |

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
| **403** | Forbidden |  -  |
| **401** | Requires authentication |  -  |

