# CodespacesApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**codespacesAddRepositoryForSecretForAuthenticatedUser**](CodespacesApi.md#codespacesAddRepositoryForSecretForAuthenticatedUser) | **PUT** /user/codespaces/secrets/{secret_name}/repositories/{repository_id} | Add a selected repository to a user secret |
| [**codespacesAddSelectedRepoToOrgSecret**](CodespacesApi.md#codespacesAddSelectedRepoToOrgSecret) | **PUT** /orgs/{org}/codespaces/secrets/{secret_name}/repositories/{repository_id} | Add selected repository to an organization secret |
| [**codespacesCodespaceMachinesForAuthenticatedUser**](CodespacesApi.md#codespacesCodespaceMachinesForAuthenticatedUser) | **GET** /user/codespaces/{codespace_name}/machines | List machine types for a codespace |
| [**codespacesCreateForAuthenticatedUser**](CodespacesApi.md#codespacesCreateForAuthenticatedUser) | **POST** /user/codespaces | Create a codespace for the authenticated user |
| [**codespacesCreateOrUpdateOrgSecret**](CodespacesApi.md#codespacesCreateOrUpdateOrgSecret) | **PUT** /orgs/{org}/codespaces/secrets/{secret_name} | Create or update an organization secret |
| [**codespacesCreateOrUpdateRepoSecret**](CodespacesApi.md#codespacesCreateOrUpdateRepoSecret) | **PUT** /repos/{owner}/{repo}/codespaces/secrets/{secret_name} | Create or update a repository secret |
| [**codespacesCreateOrUpdateSecretForAuthenticatedUser**](CodespacesApi.md#codespacesCreateOrUpdateSecretForAuthenticatedUser) | **PUT** /user/codespaces/secrets/{secret_name} | Create or update a secret for the authenticated user |
| [**codespacesCreateWithPrForAuthenticatedUser**](CodespacesApi.md#codespacesCreateWithPrForAuthenticatedUser) | **POST** /repos/{owner}/{repo}/pulls/{pull_number}/codespaces | Create a codespace from a pull request |
| [**codespacesCreateWithRepoForAuthenticatedUser**](CodespacesApi.md#codespacesCreateWithRepoForAuthenticatedUser) | **POST** /repos/{owner}/{repo}/codespaces | Create a codespace in a repository |
| [**codespacesDeleteCodespacesBillingUsers**](CodespacesApi.md#codespacesDeleteCodespacesBillingUsers) | **DELETE** /orgs/{org}/codespaces/billing/selected_users | Removes users from Codespaces billing for an organization |
| [**codespacesDeleteForAuthenticatedUser**](CodespacesApi.md#codespacesDeleteForAuthenticatedUser) | **DELETE** /user/codespaces/{codespace_name} | Delete a codespace for the authenticated user |
| [**codespacesDeleteFromOrganization**](CodespacesApi.md#codespacesDeleteFromOrganization) | **DELETE** /orgs/{org}/members/{username}/codespaces/{codespace_name} | Delete a codespace from the organization |
| [**codespacesDeleteOrgSecret**](CodespacesApi.md#codespacesDeleteOrgSecret) | **DELETE** /orgs/{org}/codespaces/secrets/{secret_name} | Delete an organization secret |
| [**codespacesDeleteRepoSecret**](CodespacesApi.md#codespacesDeleteRepoSecret) | **DELETE** /repos/{owner}/{repo}/codespaces/secrets/{secret_name} | Delete a repository secret |
| [**codespacesDeleteSecretForAuthenticatedUser**](CodespacesApi.md#codespacesDeleteSecretForAuthenticatedUser) | **DELETE** /user/codespaces/secrets/{secret_name} | Delete a secret for the authenticated user |
| [**codespacesExportForAuthenticatedUser**](CodespacesApi.md#codespacesExportForAuthenticatedUser) | **POST** /user/codespaces/{codespace_name}/exports | Export a codespace for the authenticated user |
| [**codespacesGetCodespacesForUserInOrg**](CodespacesApi.md#codespacesGetCodespacesForUserInOrg) | **GET** /orgs/{org}/members/{username}/codespaces | List codespaces for a user in organization |
| [**codespacesGetExportDetailsForAuthenticatedUser**](CodespacesApi.md#codespacesGetExportDetailsForAuthenticatedUser) | **GET** /user/codespaces/{codespace_name}/exports/{export_id} | Get details about a codespace export |
| [**codespacesGetForAuthenticatedUser**](CodespacesApi.md#codespacesGetForAuthenticatedUser) | **GET** /user/codespaces/{codespace_name} | Get a codespace for the authenticated user |
| [**codespacesGetOrgPublicKey**](CodespacesApi.md#codespacesGetOrgPublicKey) | **GET** /orgs/{org}/codespaces/secrets/public-key | Get an organization public key |
| [**codespacesGetOrgSecret**](CodespacesApi.md#codespacesGetOrgSecret) | **GET** /orgs/{org}/codespaces/secrets/{secret_name} | Get an organization secret |
| [**codespacesGetPublicKeyForAuthenticatedUser**](CodespacesApi.md#codespacesGetPublicKeyForAuthenticatedUser) | **GET** /user/codespaces/secrets/public-key | Get public key for the authenticated user |
| [**codespacesGetRepoPublicKey**](CodespacesApi.md#codespacesGetRepoPublicKey) | **GET** /repos/{owner}/{repo}/codespaces/secrets/public-key | Get a repository public key |
| [**codespacesGetRepoSecret**](CodespacesApi.md#codespacesGetRepoSecret) | **GET** /repos/{owner}/{repo}/codespaces/secrets/{secret_name} | Get a repository secret |
| [**codespacesGetSecretForAuthenticatedUser**](CodespacesApi.md#codespacesGetSecretForAuthenticatedUser) | **GET** /user/codespaces/secrets/{secret_name} | Get a secret for the authenticated user |
| [**codespacesListDevcontainersInRepositoryForAuthenticatedUser**](CodespacesApi.md#codespacesListDevcontainersInRepositoryForAuthenticatedUser) | **GET** /repos/{owner}/{repo}/codespaces/devcontainers | List devcontainer configurations in a repository for the authenticated user |
| [**codespacesListForAuthenticatedUser**](CodespacesApi.md#codespacesListForAuthenticatedUser) | **GET** /user/codespaces | List codespaces for the authenticated user |
| [**codespacesListInOrganization**](CodespacesApi.md#codespacesListInOrganization) | **GET** /orgs/{org}/codespaces | List codespaces for the organization |
| [**codespacesListInRepositoryForAuthenticatedUser**](CodespacesApi.md#codespacesListInRepositoryForAuthenticatedUser) | **GET** /repos/{owner}/{repo}/codespaces | List codespaces in a repository for the authenticated user |
| [**codespacesListOrgSecrets**](CodespacesApi.md#codespacesListOrgSecrets) | **GET** /orgs/{org}/codespaces/secrets | List organization secrets |
| [**codespacesListRepoSecrets**](CodespacesApi.md#codespacesListRepoSecrets) | **GET** /repos/{owner}/{repo}/codespaces/secrets | List repository secrets |
| [**codespacesListRepositoriesForSecretForAuthenticatedUser**](CodespacesApi.md#codespacesListRepositoriesForSecretForAuthenticatedUser) | **GET** /user/codespaces/secrets/{secret_name}/repositories | List selected repositories for a user secret |
| [**codespacesListSecretsForAuthenticatedUser**](CodespacesApi.md#codespacesListSecretsForAuthenticatedUser) | **GET** /user/codespaces/secrets | List secrets for the authenticated user |
| [**codespacesListSelectedReposForOrgSecret**](CodespacesApi.md#codespacesListSelectedReposForOrgSecret) | **GET** /orgs/{org}/codespaces/secrets/{secret_name}/repositories | List selected repositories for an organization secret |
| [**codespacesPreFlightWithRepoForAuthenticatedUser**](CodespacesApi.md#codespacesPreFlightWithRepoForAuthenticatedUser) | **GET** /repos/{owner}/{repo}/codespaces/new | Get default attributes for a codespace |
| [**codespacesPublishForAuthenticatedUser**](CodespacesApi.md#codespacesPublishForAuthenticatedUser) | **POST** /user/codespaces/{codespace_name}/publish | Create a repository from an unpublished codespace |
| [**codespacesRemoveRepositoryForSecretForAuthenticatedUser**](CodespacesApi.md#codespacesRemoveRepositoryForSecretForAuthenticatedUser) | **DELETE** /user/codespaces/secrets/{secret_name}/repositories/{repository_id} | Remove a selected repository from a user secret |
| [**codespacesRemoveSelectedRepoFromOrgSecret**](CodespacesApi.md#codespacesRemoveSelectedRepoFromOrgSecret) | **DELETE** /orgs/{org}/codespaces/secrets/{secret_name}/repositories/{repository_id} | Remove selected repository from an organization secret |
| [**codespacesRepoMachinesForAuthenticatedUser**](CodespacesApi.md#codespacesRepoMachinesForAuthenticatedUser) | **GET** /repos/{owner}/{repo}/codespaces/machines | List available machine types for a repository |
| [**codespacesSetCodespacesBilling**](CodespacesApi.md#codespacesSetCodespacesBilling) | **PUT** /orgs/{org}/codespaces/billing | Manage access control for organization codespaces |
| [**codespacesSetCodespacesBillingUsers**](CodespacesApi.md#codespacesSetCodespacesBillingUsers) | **POST** /orgs/{org}/codespaces/billing/selected_users | Add users to Codespaces billing for an organization |
| [**codespacesSetRepositoriesForSecretForAuthenticatedUser**](CodespacesApi.md#codespacesSetRepositoriesForSecretForAuthenticatedUser) | **PUT** /user/codespaces/secrets/{secret_name}/repositories | Set selected repositories for a user secret |
| [**codespacesSetSelectedReposForOrgSecret**](CodespacesApi.md#codespacesSetSelectedReposForOrgSecret) | **PUT** /orgs/{org}/codespaces/secrets/{secret_name}/repositories | Set selected repositories for an organization secret |
| [**codespacesStartForAuthenticatedUser**](CodespacesApi.md#codespacesStartForAuthenticatedUser) | **POST** /user/codespaces/{codespace_name}/start | Start a codespace for the authenticated user |
| [**codespacesStopForAuthenticatedUser**](CodespacesApi.md#codespacesStopForAuthenticatedUser) | **POST** /user/codespaces/{codespace_name}/stop | Stop a codespace for the authenticated user |
| [**codespacesStopInOrganization**](CodespacesApi.md#codespacesStopInOrganization) | **POST** /orgs/{org}/members/{username}/codespaces/{codespace_name}/stop | Stop a codespace for an organization user |
| [**codespacesUpdateForAuthenticatedUser**](CodespacesApi.md#codespacesUpdateForAuthenticatedUser) | **PATCH** /user/codespaces/{codespace_name} | Update a codespace for the authenticated user |


<a name="codespacesAddRepositoryForSecretForAuthenticatedUser"></a>
# **codespacesAddRepositoryForSecretForAuthenticatedUser**
> codespacesAddRepositoryForSecretForAuthenticatedUser(secretName, repositoryId)

Add a selected repository to a user secret

Adds a repository to the selected repositories for a user&#39;s codespace secret. You must authenticate using an access token with the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint. User must have Codespaces access to use this endpoint. GitHub Apps must have write access to the &#x60;codespaces_user_secrets&#x60; user permission and write access to the &#x60;codespaces_secrets&#x60; repository permission on the referenced repository to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String secretName = "secretName_example"; // String | The name of the secret.
    Integer repositoryId = 56; // Integer | 
    try {
      apiInstance.codespacesAddRepositoryForSecretForAuthenticatedUser(secretName, repositoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesAddRepositoryForSecretForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **secretName** | **String**| The name of the secret. | |
| **repositoryId** | **Integer**|  | |

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
| **204** | No Content when repository was added to the selected list |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Error |  -  |

<a name="codespacesAddSelectedRepoToOrgSecret"></a>
# **codespacesAddSelectedRepoToOrgSecret**
> codespacesAddSelectedRepoToOrgSecret(org, secretName, repositoryId)

Add selected repository to an organization secret

Adds a repository to an organization secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    Integer repositoryId = 56; // Integer | 
    try {
      apiInstance.codespacesAddSelectedRepoToOrgSecret(org, secretName, repositoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesAddSelectedRepoToOrgSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content when repository was added to the selected list |  -  |
| **404** | Resource not found |  -  |
| **409** | Conflict when visibility type is not set to selected |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="codespacesCodespaceMachinesForAuthenticatedUser"></a>
# **codespacesCodespaceMachinesForAuthenticatedUser**
> CodespacesRepoMachinesForAuthenticatedUser200Response codespacesCodespaceMachinesForAuthenticatedUser(codespaceName)

List machine types for a codespace

List the machine types a codespace can transition to use.  You must authenticate using an access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have read access to the &#x60;codespaces_metadata&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String codespaceName = "codespaceName_example"; // String | The name of the codespace.
    try {
      CodespacesRepoMachinesForAuthenticatedUser200Response result = apiInstance.codespacesCodespaceMachinesForAuthenticatedUser(codespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesCodespaceMachinesForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **codespaceName** | **String**| The name of the codespace. | |

### Return type

[**CodespacesRepoMachinesForAuthenticatedUser200Response**](CodespacesRepoMachinesForAuthenticatedUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **304** | Not modified |  -  |
| **500** | Internal Error |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="codespacesCreateForAuthenticatedUser"></a>
# **codespacesCreateForAuthenticatedUser**
> Codespace codespacesCreateForAuthenticatedUser(codespacesCreateForAuthenticatedUserRequest)

Create a codespace for the authenticated user

Creates a new codespace, owned by the authenticated user.  This endpoint requires either a &#x60;repository_id&#x60; OR a &#x60;pull_request&#x60; but not both.  You must authenticate using an access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have write access to the &#x60;codespaces&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    CodespacesCreateForAuthenticatedUserRequest codespacesCreateForAuthenticatedUserRequest = new CodespacesCreateForAuthenticatedUserRequest(); // CodespacesCreateForAuthenticatedUserRequest | 
    try {
      Codespace result = apiInstance.codespacesCreateForAuthenticatedUser(codespacesCreateForAuthenticatedUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesCreateForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **codespacesCreateForAuthenticatedUserRequest** | [**CodespacesCreateForAuthenticatedUserRequest**](CodespacesCreateForAuthenticatedUserRequest.md)|  | |

### Return type

[**Codespace**](Codespace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response when the codespace was successfully created |  -  |
| **202** | Response when the codespace creation partially failed but is being retried in the background |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **503** | Service unavailable |  -  |

<a name="codespacesCreateOrUpdateOrgSecret"></a>
# **codespacesCreateOrUpdateOrgSecret**
> Object codespacesCreateOrUpdateOrgSecret(org, secretName, codespacesCreateOrUpdateOrgSecretRequest)

Create or update an organization secret

Creates or updates an organization secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.  #### Example encrypting a secret using Node.js  Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.  &#x60;&#x60;&#x60; const sodium &#x3D; require(&#39;libsodium-wrappers&#39;) const secret &#x3D; &#39;plain-text-secret&#39; // replace with the secret you want to encrypt const key &#x3D; &#39;base64-encoded-public-key&#39; // replace with the Base64 encoded public key  //Check if libsodium is ready and then proceed. sodium.ready.then(() &#x3D;&gt; {   // Convert Secret &amp; Base64 key to Uint8Array.   let binkey &#x3D; sodium.from_base64(key, sodium.base64_variants.ORIGINAL)   let binsec &#x3D; sodium.from_string(secret)    //Encrypt the secret using LibSodium   let encBytes &#x3D; sodium.crypto_box_seal(binsec, binkey)    // Convert encrypted Uint8Array to Base64   let output &#x3D; sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)    console.log(output) }); &#x60;&#x60;&#x60;  #### Example encrypting a secret using Python  Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.  &#x60;&#x60;&#x60; from base64 import b64encode from nacl import encoding, public  def encrypt(public_key: str, secret_value: str) -&gt; str:   \&quot;\&quot;\&quot;Encrypt a Unicode string using the public key.\&quot;\&quot;\&quot;   public_key &#x3D; public.PublicKey(public_key.encode(\&quot;utf-8\&quot;), encoding.Base64Encoder())   sealed_box &#x3D; public.SealedBox(public_key)   encrypted &#x3D; sealed_box.encrypt(secret_value.encode(\&quot;utf-8\&quot;))   return b64encode(encrypted).decode(\&quot;utf-8\&quot;) &#x60;&#x60;&#x60;  #### Example encrypting a secret using C#  Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.  &#x60;&#x60;&#x60; var secretValue &#x3D; System.Text.Encoding.UTF8.GetBytes(\&quot;mySecret\&quot;); var publicKey &#x3D; Convert.FromBase64String(\&quot;2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU&#x3D;\&quot;);  var sealedPublicKeyBox &#x3D; Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);  Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox)); &#x60;&#x60;&#x60;  #### Example encrypting a secret using Ruby  Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.  &#x60;&#x60;&#x60;ruby require \&quot;rbnacl\&quot; require \&quot;base64\&quot;  key &#x3D; Base64.decode64(\&quot;+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0&#x3D;\&quot;) public_key &#x3D; RbNaCl::PublicKey.new(key)  box &#x3D; RbNaCl::Boxes::Sealed.from_public_key(public_key) encrypted_secret &#x3D; box.encrypt(\&quot;my_secret\&quot;)  # Print the base64 encoded secret puts Base64.strict_encode64(encrypted_secret) &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    CodespacesCreateOrUpdateOrgSecretRequest codespacesCreateOrUpdateOrgSecretRequest = new CodespacesCreateOrUpdateOrgSecretRequest(); // CodespacesCreateOrUpdateOrgSecretRequest | 
    try {
      Object result = apiInstance.codespacesCreateOrUpdateOrgSecret(org, secretName, codespacesCreateOrUpdateOrgSecretRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesCreateOrUpdateOrgSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **codespacesCreateOrUpdateOrgSecretRequest** | [**CodespacesCreateOrUpdateOrgSecretRequest**](CodespacesCreateOrUpdateOrgSecretRequest.md)|  | |

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
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="codespacesCreateOrUpdateRepoSecret"></a>
# **codespacesCreateOrUpdateRepoSecret**
> Object codespacesCreateOrUpdateRepoSecret(owner, repo, secretName, codespacesCreateOrUpdateRepoSecretRequest)

Create or update a repository secret

Creates or updates a repository secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have write access to the &#x60;codespaces_secrets&#x60; repository permission to use this endpoint.  #### Example of encrypting a secret using Node.js  Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.  &#x60;&#x60;&#x60; const sodium &#x3D; require(&#39;libsodium-wrappers&#39;) const secret &#x3D; &#39;plain-text-secret&#39; // replace with the secret you want to encrypt const key &#x3D; &#39;base64-encoded-public-key&#39; // replace with the Base64 encoded public key  //Check if libsodium is ready and then proceed. sodium.ready.then(() &#x3D;&gt; {   // Convert Secret &amp; Base64 key to Uint8Array.   let binkey &#x3D; sodium.from_base64(key, sodium.base64_variants.ORIGINAL)   let binsec &#x3D; sodium.from_string(secret)    //Encrypt the secret using LibSodium   let encBytes &#x3D; sodium.crypto_box_seal(binsec, binkey)    // Convert encrypted Uint8Array to Base64   let output &#x3D; sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)    console.log(output) }); &#x60;&#x60;&#x60;  #### Example of encrypting a secret using Python  Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.  &#x60;&#x60;&#x60; from base64 import b64encode from nacl import encoding, public  def encrypt(public_key: str, secret_value: str) -&gt; str:   \&quot;\&quot;\&quot;Encrypt a Unicode string using the public key.\&quot;\&quot;\&quot;   public_key &#x3D; public.PublicKey(public_key.encode(\&quot;utf-8\&quot;), encoding.Base64Encoder())   sealed_box &#x3D; public.SealedBox(public_key)   encrypted &#x3D; sealed_box.encrypt(secret_value.encode(\&quot;utf-8\&quot;))   return b64encode(encrypted).decode(\&quot;utf-8\&quot;) &#x60;&#x60;&#x60;  #### Example of encrypting a secret using C#  Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.  &#x60;&#x60;&#x60; var secretValue &#x3D; System.Text.Encoding.UTF8.GetBytes(\&quot;mySecret\&quot;); var publicKey &#x3D; Convert.FromBase64String(\&quot;2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU&#x3D;\&quot;);  var sealedPublicKeyBox &#x3D; Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);  Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox)); &#x60;&#x60;&#x60;  #### Example of encrypting a secret using Ruby  Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.  &#x60;&#x60;&#x60;ruby require \&quot;rbnacl\&quot; require \&quot;base64\&quot;  key &#x3D; Base64.decode64(\&quot;+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0&#x3D;\&quot;) public_key &#x3D; RbNaCl::PublicKey.new(key)  box &#x3D; RbNaCl::Boxes::Sealed.from_public_key(public_key) encrypted_secret &#x3D; box.encrypt(\&quot;my_secret\&quot;)  # Print the base64 encoded secret puts Base64.strict_encode64(encrypted_secret) &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    CodespacesCreateOrUpdateRepoSecretRequest codespacesCreateOrUpdateRepoSecretRequest = new CodespacesCreateOrUpdateRepoSecretRequest(); // CodespacesCreateOrUpdateRepoSecretRequest | 
    try {
      Object result = apiInstance.codespacesCreateOrUpdateRepoSecret(owner, repo, secretName, codespacesCreateOrUpdateRepoSecretRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesCreateOrUpdateRepoSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **codespacesCreateOrUpdateRepoSecretRequest** | [**CodespacesCreateOrUpdateRepoSecretRequest**](CodespacesCreateOrUpdateRepoSecretRequest.md)|  | |

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

<a name="codespacesCreateOrUpdateSecretForAuthenticatedUser"></a>
# **codespacesCreateOrUpdateSecretForAuthenticatedUser**
> Object codespacesCreateOrUpdateSecretForAuthenticatedUser(secretName, codespacesCreateOrUpdateSecretForAuthenticatedUserRequest)

Create or update a secret for the authenticated user

Creates or updates a secret for a user&#39;s codespace with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages).  You must authenticate using an access token with the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint. User must also have Codespaces access to use this endpoint.  GitHub Apps must have write access to the &#x60;codespaces_user_secrets&#x60; user permission and &#x60;codespaces_secrets&#x60; repository permission on all referenced repositories to use this endpoint.  #### Example encrypting a secret using Node.js  Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.  &#x60;&#x60;&#x60; const sodium &#x3D; require(&#39;libsodium-wrappers&#39;) const secret &#x3D; &#39;plain-text-secret&#39; // replace with the secret you want to encrypt const key &#x3D; &#39;base64-encoded-public-key&#39; // replace with the Base64 encoded public key  //Check if libsodium is ready and then proceed. sodium.ready.then(() &#x3D;&gt; {   // Convert Secret &amp; Base64 key to Uint8Array.   let binkey &#x3D; sodium.from_base64(key, sodium.base64_variants.ORIGINAL)   let binsec &#x3D; sodium.from_string(secret)    //Encrypt the secret using LibSodium   let encBytes &#x3D; sodium.crypto_box_seal(binsec, binkey)    // Convert encrypted Uint8Array to Base64   let output &#x3D; sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)    console.log(output) }); &#x60;&#x60;&#x60;  #### Example encrypting a secret using Python  Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.  &#x60;&#x60;&#x60; from base64 import b64encode from nacl import encoding, public  def encrypt(public_key: str, secret_value: str) -&gt; str:   \&quot;\&quot;\&quot;Encrypt a Unicode string using the public key.\&quot;\&quot;\&quot;   public_key &#x3D; public.PublicKey(public_key.encode(\&quot;utf-8\&quot;), encoding.Base64Encoder())   sealed_box &#x3D; public.SealedBox(public_key)   encrypted &#x3D; sealed_box.encrypt(secret_value.encode(\&quot;utf-8\&quot;))   return b64encode(encrypted).decode(\&quot;utf-8\&quot;) &#x60;&#x60;&#x60;  #### Example encrypting a secret using C#  Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.  &#x60;&#x60;&#x60; var secretValue &#x3D; System.Text.Encoding.UTF8.GetBytes(\&quot;mySecret\&quot;); var publicKey &#x3D; Convert.FromBase64String(\&quot;2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU&#x3D;\&quot;);  var sealedPublicKeyBox &#x3D; Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);  Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox)); &#x60;&#x60;&#x60;  #### Example encrypting a secret using Ruby  Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.  &#x60;&#x60;&#x60;ruby require \&quot;rbnacl\&quot; require \&quot;base64\&quot;  key &#x3D; Base64.decode64(\&quot;+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0&#x3D;\&quot;) public_key &#x3D; RbNaCl::PublicKey.new(key)  box &#x3D; RbNaCl::Boxes::Sealed.from_public_key(public_key) encrypted_secret &#x3D; box.encrypt(\&quot;my_secret\&quot;)  # Print the base64 encoded secret puts Base64.strict_encode64(encrypted_secret) &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String secretName = "secretName_example"; // String | The name of the secret.
    CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest codespacesCreateOrUpdateSecretForAuthenticatedUserRequest = new CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest(); // CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest | 
    try {
      Object result = apiInstance.codespacesCreateOrUpdateSecretForAuthenticatedUser(secretName, codespacesCreateOrUpdateSecretForAuthenticatedUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesCreateOrUpdateSecretForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **secretName** | **String**| The name of the secret. | |
| **codespacesCreateOrUpdateSecretForAuthenticatedUserRequest** | [**CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest**](CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest.md)|  | |

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
| **201** | Response after successfully creating a secret |  -  |
| **204** | Response after successfully updating a secret |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **404** | Resource not found |  -  |

<a name="codespacesCreateWithPrForAuthenticatedUser"></a>
# **codespacesCreateWithPrForAuthenticatedUser**
> Codespace codespacesCreateWithPrForAuthenticatedUser(owner, repo, pullNumber, codespacesCreateWithPrForAuthenticatedUserRequest)

Create a codespace from a pull request

Creates a codespace owned by the authenticated user for the specified pull request.  You must authenticate using an access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have write access to the &#x60;codespaces&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer pullNumber = 56; // Integer | The number that identifies the pull request.
    CodespacesCreateWithPrForAuthenticatedUserRequest codespacesCreateWithPrForAuthenticatedUserRequest = new CodespacesCreateWithPrForAuthenticatedUserRequest(); // CodespacesCreateWithPrForAuthenticatedUserRequest | 
    try {
      Codespace result = apiInstance.codespacesCreateWithPrForAuthenticatedUser(owner, repo, pullNumber, codespacesCreateWithPrForAuthenticatedUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesCreateWithPrForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **pullNumber** | **Integer**| The number that identifies the pull request. | |
| **codespacesCreateWithPrForAuthenticatedUserRequest** | [**CodespacesCreateWithPrForAuthenticatedUserRequest**](CodespacesCreateWithPrForAuthenticatedUserRequest.md)|  | |

### Return type

[**Codespace**](Codespace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response when the codespace was successfully created |  -  |
| **202** | Response when the codespace creation partially failed but is being retried in the background |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **503** | Service unavailable |  -  |

<a name="codespacesCreateWithRepoForAuthenticatedUser"></a>
# **codespacesCreateWithRepoForAuthenticatedUser**
> Codespace codespacesCreateWithRepoForAuthenticatedUser(owner, repo, codespacesCreateWithRepoForAuthenticatedUserRequest)

Create a codespace in a repository

Creates a codespace owned by the authenticated user in the specified repository.  You must authenticate using an access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have write access to the &#x60;codespaces&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    CodespacesCreateWithRepoForAuthenticatedUserRequest codespacesCreateWithRepoForAuthenticatedUserRequest = new CodespacesCreateWithRepoForAuthenticatedUserRequest(); // CodespacesCreateWithRepoForAuthenticatedUserRequest | 
    try {
      Codespace result = apiInstance.codespacesCreateWithRepoForAuthenticatedUser(owner, repo, codespacesCreateWithRepoForAuthenticatedUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesCreateWithRepoForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **codespacesCreateWithRepoForAuthenticatedUserRequest** | [**CodespacesCreateWithRepoForAuthenticatedUserRequest**](CodespacesCreateWithRepoForAuthenticatedUserRequest.md)|  | |

### Return type

[**Codespace**](Codespace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response when the codespace was successfully created |  -  |
| **202** | Response when the codespace creation partially failed but is being retried in the background |  -  |
| **400** | Bad Request |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **503** | Service unavailable |  -  |

<a name="codespacesDeleteCodespacesBillingUsers"></a>
# **codespacesDeleteCodespacesBillingUsers**
> codespacesDeleteCodespacesBillingUsers(org, codespacesDeleteCodespacesBillingUsersRequest)

Removes users from Codespaces billing for an organization

Codespaces for the specified users will no longer be billed to the organization. To use this endpoint, the billing settings for the organization must be set to &#x60;selected_members&#x60;. For information on how to change this setting please see [these docs].(https://docs.github.com/rest/codespaces/organizations#manage-access-control-for-organization-codespaces) You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    CodespacesDeleteCodespacesBillingUsersRequest codespacesDeleteCodespacesBillingUsersRequest = new CodespacesDeleteCodespacesBillingUsersRequest(); // CodespacesDeleteCodespacesBillingUsersRequest | 
    try {
      apiInstance.codespacesDeleteCodespacesBillingUsers(org, codespacesDeleteCodespacesBillingUsersRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesDeleteCodespacesBillingUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **codespacesDeleteCodespacesBillingUsersRequest** | [**CodespacesDeleteCodespacesBillingUsersRequest**](CodespacesDeleteCodespacesBillingUsersRequest.md)|  | |

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
| **204** | Response when successfully modifying permissions. |  -  |
| **304** | Not modified |  -  |
| **400** | Users are neither members nor collaborators of this organization. |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **500** | Internal Error |  -  |

<a name="codespacesDeleteForAuthenticatedUser"></a>
# **codespacesDeleteForAuthenticatedUser**
> Object codespacesDeleteForAuthenticatedUser(codespaceName)

Delete a codespace for the authenticated user

Deletes a user&#39;s codespace.  You must authenticate using an access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have write access to the &#x60;codespaces&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String codespaceName = "codespaceName_example"; // String | The name of the codespace.
    try {
      Object result = apiInstance.codespacesDeleteForAuthenticatedUser(codespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesDeleteForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **codespaceName** | **String**| The name of the codespace. | |

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
| **304** | Not modified |  -  |
| **500** | Internal Error |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="codespacesDeleteFromOrganization"></a>
# **codespacesDeleteFromOrganization**
> Object codespacesDeleteFromOrganization(org, username, codespaceName)

Delete a codespace from the organization

Deletes a user&#39;s codespace.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    String codespaceName = "codespaceName_example"; // String | The name of the codespace.
    try {
      Object result = apiInstance.codespacesDeleteFromOrganization(org, username, codespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesDeleteFromOrganization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **username** | **String**| The handle for the GitHub user account. | |
| **codespaceName** | **String**| The name of the codespace. | |

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
| **304** | Not modified |  -  |
| **500** | Internal Error |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="codespacesDeleteOrgSecret"></a>
# **codespacesDeleteOrgSecret**
> codespacesDeleteOrgSecret(org, secretName)

Delete an organization secret

Deletes an organization secret using the secret name. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      apiInstance.codespacesDeleteOrgSecret(org, secretName);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesDeleteOrgSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response |  -  |
| **404** | Resource not found |  -  |

<a name="codespacesDeleteRepoSecret"></a>
# **codespacesDeleteRepoSecret**
> codespacesDeleteRepoSecret(owner, repo, secretName)

Delete a repository secret

Deletes a secret in a repository using the secret name. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have write access to the &#x60;codespaces_secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      apiInstance.codespacesDeleteRepoSecret(owner, repo, secretName);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesDeleteRepoSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

<a name="codespacesDeleteSecretForAuthenticatedUser"></a>
# **codespacesDeleteSecretForAuthenticatedUser**
> codespacesDeleteSecretForAuthenticatedUser(secretName)

Delete a secret for the authenticated user

Deletes a secret from a user&#39;s codespaces using the secret name. Deleting the secret will remove access from all codespaces that were allowed to access the secret.  You must authenticate using an access token with the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint. User must have Codespaces access to use this endpoint.  GitHub Apps must have write access to the &#x60;codespaces_user_secrets&#x60; user permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      apiInstance.codespacesDeleteSecretForAuthenticatedUser(secretName);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesDeleteSecretForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
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

<a name="codespacesExportForAuthenticatedUser"></a>
# **codespacesExportForAuthenticatedUser**
> CodespaceExportDetails codespacesExportForAuthenticatedUser(codespaceName)

Export a codespace for the authenticated user

Triggers an export of the specified codespace and returns a URL and ID where the status of the export can be monitored.  If changes cannot be pushed to the codespace&#39;s repository, they will be pushed to a new or previously-existing fork instead.  You must authenticate using a personal access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have write access to the &#x60;codespaces_lifecycle_admin&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String codespaceName = "codespaceName_example"; // String | The name of the codespace.
    try {
      CodespaceExportDetails result = apiInstance.codespacesExportForAuthenticatedUser(codespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesExportForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **codespaceName** | **String**| The name of the codespace. | |

### Return type

[**CodespaceExportDetails**](CodespaceExportDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Response |  -  |
| **500** | Internal Error |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="codespacesGetCodespacesForUserInOrg"></a>
# **codespacesGetCodespacesForUserInOrg**
> CodespacesListInOrganization200Response codespacesGetCodespacesForUserInOrg(org, username, perPage, page)

List codespaces for a user in organization

Lists the codespaces that a member of an organization has for repositories in that organization.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      CodespacesListInOrganization200Response result = apiInstance.codespacesGetCodespacesForUserInOrg(org, username, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesGetCodespacesForUserInOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **username** | **String**| The handle for the GitHub user account. | |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **page** | **Integer**| Page number of the results to fetch. | [optional] [default to 1] |

### Return type

[**CodespacesListInOrganization200Response**](CodespacesListInOrganization200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **304** | Not modified |  -  |
| **500** | Internal Error |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="codespacesGetExportDetailsForAuthenticatedUser"></a>
# **codespacesGetExportDetailsForAuthenticatedUser**
> CodespaceExportDetails codespacesGetExportDetailsForAuthenticatedUser(codespaceName, exportId)

Get details about a codespace export

Gets information about an export of a codespace.  You must authenticate using a personal access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have read access to the &#x60;codespaces_lifecycle_admin&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String codespaceName = "codespaceName_example"; // String | The name of the codespace.
    String exportId = "exportId_example"; // String | The ID of the export operation, or `latest`. Currently only `latest` is currently supported.
    try {
      CodespaceExportDetails result = apiInstance.codespacesGetExportDetailsForAuthenticatedUser(codespaceName, exportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesGetExportDetailsForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **codespaceName** | **String**| The name of the codespace. | |
| **exportId** | **String**| The ID of the export operation, or &#x60;latest&#x60;. Currently only &#x60;latest&#x60; is currently supported. | |

### Return type

[**CodespaceExportDetails**](CodespaceExportDetails.md)

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

<a name="codespacesGetForAuthenticatedUser"></a>
# **codespacesGetForAuthenticatedUser**
> Codespace codespacesGetForAuthenticatedUser(codespaceName)

Get a codespace for the authenticated user

Gets information about a user&#39;s codespace.  You must authenticate using an access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have read access to the &#x60;codespaces&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String codespaceName = "codespaceName_example"; // String | The name of the codespace.
    try {
      Codespace result = apiInstance.codespacesGetForAuthenticatedUser(codespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesGetForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **codespaceName** | **String**| The name of the codespace. | |

### Return type

[**Codespace**](Codespace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **304** | Not modified |  -  |
| **500** | Internal Error |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="codespacesGetOrgPublicKey"></a>
# **codespacesGetOrgPublicKey**
> CodespacesPublicKey codespacesGetOrgPublicKey(org)

Get an organization public key

Gets a public key for an organization, which is required in order to encrypt secrets. You need to encrypt the value of a secret before you can create or update secrets. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      CodespacesPublicKey result = apiInstance.codespacesGetOrgPublicKey(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesGetOrgPublicKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**CodespacesPublicKey**](CodespacesPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="codespacesGetOrgSecret"></a>
# **codespacesGetOrgSecret**
> CodespacesOrgSecret codespacesGetOrgSecret(org, secretName)

Get an organization secret

Gets an organization secret without revealing its encrypted value. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      CodespacesOrgSecret result = apiInstance.codespacesGetOrgSecret(org, secretName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesGetOrgSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**CodespacesOrgSecret**](CodespacesOrgSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="codespacesGetPublicKeyForAuthenticatedUser"></a>
# **codespacesGetPublicKeyForAuthenticatedUser**
> CodespacesUserPublicKey codespacesGetPublicKeyForAuthenticatedUser()

Get public key for the authenticated user

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets.  You must authenticate using an access token with the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint. User must have Codespaces access to use this endpoint.  GitHub Apps must have read access to the &#x60;codespaces_user_secrets&#x60; user permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    try {
      CodespacesUserPublicKey result = apiInstance.codespacesGetPublicKeyForAuthenticatedUser();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesGetPublicKeyForAuthenticatedUser");
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

[**CodespacesUserPublicKey**](CodespacesUserPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="codespacesGetRepoPublicKey"></a>
# **codespacesGetRepoPublicKey**
> CodespacesPublicKey codespacesGetRepoPublicKey(owner, repo)

Get a repository public key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have write access to the &#x60;codespaces_secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      CodespacesPublicKey result = apiInstance.codespacesGetRepoPublicKey(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesGetRepoPublicKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**CodespacesPublicKey**](CodespacesPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="codespacesGetRepoSecret"></a>
# **codespacesGetRepoSecret**
> RepoCodespacesSecret codespacesGetRepoSecret(owner, repo, secretName)

Get a repository secret

Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have write access to the &#x60;codespaces_secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      RepoCodespacesSecret result = apiInstance.codespacesGetRepoSecret(owner, repo, secretName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesGetRepoSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**RepoCodespacesSecret**](RepoCodespacesSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="codespacesGetSecretForAuthenticatedUser"></a>
# **codespacesGetSecretForAuthenticatedUser**
> CodespacesSecret codespacesGetSecretForAuthenticatedUser(secretName)

Get a secret for the authenticated user

Gets a secret available to a user&#39;s codespaces without revealing its encrypted value.  You must authenticate using an access token with the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint. User must have Codespaces access to use this endpoint.  GitHub Apps must have read access to the &#x60;codespaces_user_secrets&#x60; user permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      CodespacesSecret result = apiInstance.codespacesGetSecretForAuthenticatedUser(secretName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesGetSecretForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **secretName** | **String**| The name of the secret. | |

### Return type

[**CodespacesSecret**](CodespacesSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="codespacesListDevcontainersInRepositoryForAuthenticatedUser"></a>
# **codespacesListDevcontainersInRepositoryForAuthenticatedUser**
> CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response codespacesListDevcontainersInRepositoryForAuthenticatedUser(owner, repo, perPage, page)

List devcontainer configurations in a repository for the authenticated user

Lists the devcontainer.json files associated with a specified repository and the authenticated user. These files specify launchpoint configurations for codespaces created within the repository.  You must authenticate using an access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have read access to the &#x60;codespaces_metadata&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response result = apiInstance.codespacesListDevcontainersInRepositoryForAuthenticatedUser(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesListDevcontainersInRepositoryForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response**](CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **500** | Internal Error |  -  |
| **400** | Bad Request |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="codespacesListForAuthenticatedUser"></a>
# **codespacesListForAuthenticatedUser**
> CodespacesListInOrganization200Response codespacesListForAuthenticatedUser(perPage, page, repositoryId)

List codespaces for the authenticated user

Lists the authenticated user&#39;s codespaces.  You must authenticate using an access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have read access to the &#x60;codespaces&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer repositoryId = 56; // Integer | ID of the Repository to filter on
    try {
      CodespacesListInOrganization200Response result = apiInstance.codespacesListForAuthenticatedUser(perPage, page, repositoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesListForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **repositoryId** | **Integer**| ID of the Repository to filter on | [optional] |

### Return type

[**CodespacesListInOrganization200Response**](CodespacesListInOrganization200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **304** | Not modified |  -  |
| **500** | Internal Error |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="codespacesListInOrganization"></a>
# **codespacesListInOrganization**
> CodespacesListInOrganization200Response codespacesListInOrganization(org, perPage, page)

List codespaces for the organization

Lists the codespaces associated to a specified organization.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      CodespacesListInOrganization200Response result = apiInstance.codespacesListInOrganization(org, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesListInOrganization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**CodespacesListInOrganization200Response**](CodespacesListInOrganization200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **304** | Not modified |  -  |
| **500** | Internal Error |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="codespacesListInRepositoryForAuthenticatedUser"></a>
# **codespacesListInRepositoryForAuthenticatedUser**
> CodespacesListInOrganization200Response codespacesListInRepositoryForAuthenticatedUser(owner, repo, perPage, page)

List codespaces in a repository for the authenticated user

Lists the codespaces associated to a specified repository and the authenticated user.  You must authenticate using an access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have read access to the &#x60;codespaces&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      CodespacesListInOrganization200Response result = apiInstance.codespacesListInRepositoryForAuthenticatedUser(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesListInRepositoryForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**CodespacesListInOrganization200Response**](CodespacesListInOrganization200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **500** | Internal Error |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="codespacesListOrgSecrets"></a>
# **codespacesListOrgSecrets**
> CodespacesListOrgSecrets200Response codespacesListOrgSecrets(org, perPage, page)

List organization secrets

Lists all Codespaces secrets available at the organization-level without revealing their encrypted values. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      CodespacesListOrgSecrets200Response result = apiInstance.codespacesListOrgSecrets(org, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesListOrgSecrets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**CodespacesListOrgSecrets200Response**](CodespacesListOrgSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="codespacesListRepoSecrets"></a>
# **codespacesListRepoSecrets**
> CodespacesListRepoSecrets200Response codespacesListRepoSecrets(owner, repo, perPage, page)

List repository secrets

Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have write access to the &#x60;codespaces_secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      CodespacesListRepoSecrets200Response result = apiInstance.codespacesListRepoSecrets(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesListRepoSecrets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**CodespacesListRepoSecrets200Response**](CodespacesListRepoSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="codespacesListRepositoriesForSecretForAuthenticatedUser"></a>
# **codespacesListRepositoriesForSecretForAuthenticatedUser**
> ActionsListSelectedReposForOrgSecret200Response codespacesListRepositoriesForSecretForAuthenticatedUser(secretName)

List selected repositories for a user secret

List the repositories that have been granted the ability to use a user&#39;s codespace secret.  You must authenticate using an access token with the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint. User must have Codespaces access to use this endpoint.  GitHub Apps must have read access to the &#x60;codespaces_user_secrets&#x60; user permission and write access to the &#x60;codespaces_secrets&#x60; repository permission on all referenced repositories to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      ActionsListSelectedReposForOrgSecret200Response result = apiInstance.codespacesListRepositoriesForSecretForAuthenticatedUser(secretName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesListRepositoriesForSecretForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **secretName** | **String**| The name of the secret. | |

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
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Error |  -  |

<a name="codespacesListSecretsForAuthenticatedUser"></a>
# **codespacesListSecretsForAuthenticatedUser**
> CodespacesListSecretsForAuthenticatedUser200Response codespacesListSecretsForAuthenticatedUser(perPage, page)

List secrets for the authenticated user

Lists all secrets available for a user&#39;s Codespaces without revealing their encrypted values.  You must authenticate using an access token with the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint. User must have Codespaces access to use this endpoint.  GitHub Apps must have read access to the &#x60;codespaces_user_secrets&#x60; user permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      CodespacesListSecretsForAuthenticatedUser200Response result = apiInstance.codespacesListSecretsForAuthenticatedUser(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesListSecretsForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**CodespacesListSecretsForAuthenticatedUser200Response**](CodespacesListSecretsForAuthenticatedUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="codespacesListSelectedReposForOrgSecret"></a>
# **codespacesListSelectedReposForOrgSecret**
> ActionsListSelectedReposForOrgSecret200Response codespacesListSelectedReposForOrgSecret(org, secretName, page, perPage)

List selected repositories for an organization secret

Lists all repositories that have been selected when the &#x60;visibility&#x60; for repository access to a secret is set to &#x60;selected&#x60;. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    try {
      ActionsListSelectedReposForOrgSecret200Response result = apiInstance.codespacesListSelectedReposForOrgSecret(org, secretName, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesListSelectedReposForOrgSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **404** | Resource not found |  -  |

<a name="codespacesPreFlightWithRepoForAuthenticatedUser"></a>
# **codespacesPreFlightWithRepoForAuthenticatedUser**
> CodespacesPreFlightWithRepoForAuthenticatedUser200Response codespacesPreFlightWithRepoForAuthenticatedUser(owner, repo, ref, clientIp)

Get default attributes for a codespace

Gets the default attributes for codespaces created by the user with the repository.  You must authenticate using an access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have write access to the &#x60;codespaces&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String ref = "main"; // String | The branch or commit to check for a default devcontainer path. If not specified, the default branch will be checked.
    String clientIp = "1.2.3.4"; // String | An alternative IP for default location auto-detection, such as when proxying a request.
    try {
      CodespacesPreFlightWithRepoForAuthenticatedUser200Response result = apiInstance.codespacesPreFlightWithRepoForAuthenticatedUser(owner, repo, ref, clientIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesPreFlightWithRepoForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **ref** | **String**| The branch or commit to check for a default devcontainer path. If not specified, the default branch will be checked. | [optional] |
| **clientIp** | **String**| An alternative IP for default location auto-detection, such as when proxying a request. | [optional] |

### Return type

[**CodespacesPreFlightWithRepoForAuthenticatedUser200Response**](CodespacesPreFlightWithRepoForAuthenticatedUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response when a user is able to create codespaces from the repository. |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="codespacesPublishForAuthenticatedUser"></a>
# **codespacesPublishForAuthenticatedUser**
> CodespaceWithFullRepository codespacesPublishForAuthenticatedUser(codespaceName, codespacesPublishForAuthenticatedUserRequest)

Create a repository from an unpublished codespace

Publishes an unpublished codespace, creating a new repository and assigning it to the codespace.  The codespace&#39;s token is granted write permissions to the repository, allowing the user to push their changes.  This will fail for a codespace that is already published, meaning it has an associated repository.  You must authenticate using a personal access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have write access to the &#x60;codespaces&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String codespaceName = "codespaceName_example"; // String | The name of the codespace.
    CodespacesPublishForAuthenticatedUserRequest codespacesPublishForAuthenticatedUserRequest = new CodespacesPublishForAuthenticatedUserRequest(); // CodespacesPublishForAuthenticatedUserRequest | 
    try {
      CodespaceWithFullRepository result = apiInstance.codespacesPublishForAuthenticatedUser(codespaceName, codespacesPublishForAuthenticatedUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesPublishForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **codespaceName** | **String**| The name of the codespace. | |
| **codespacesPublishForAuthenticatedUserRequest** | [**CodespacesPublishForAuthenticatedUserRequest**](CodespacesPublishForAuthenticatedUserRequest.md)|  | |

### Return type

[**CodespaceWithFullRepository**](CodespaceWithFullRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="codespacesRemoveRepositoryForSecretForAuthenticatedUser"></a>
# **codespacesRemoveRepositoryForSecretForAuthenticatedUser**
> codespacesRemoveRepositoryForSecretForAuthenticatedUser(secretName, repositoryId)

Remove a selected repository from a user secret

Removes a repository from the selected repositories for a user&#39;s codespace secret. You must authenticate using an access token with the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint. User must have Codespaces access to use this endpoint. GitHub Apps must have write access to the &#x60;codespaces_user_secrets&#x60; user permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String secretName = "secretName_example"; // String | The name of the secret.
    Integer repositoryId = 56; // Integer | 
    try {
      apiInstance.codespacesRemoveRepositoryForSecretForAuthenticatedUser(secretName, repositoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesRemoveRepositoryForSecretForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **secretName** | **String**| The name of the secret. | |
| **repositoryId** | **Integer**|  | |

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
| **204** | No Content when repository was removed from the selected list |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Error |  -  |

<a name="codespacesRemoveSelectedRepoFromOrgSecret"></a>
# **codespacesRemoveSelectedRepoFromOrgSecret**
> codespacesRemoveSelectedRepoFromOrgSecret(org, secretName, repositoryId)

Remove selected repository from an organization secret

Removes a repository from an organization secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    Integer repositoryId = 56; // Integer | 
    try {
      apiInstance.codespacesRemoveSelectedRepoFromOrgSecret(org, secretName, repositoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesRemoveSelectedRepoFromOrgSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response when repository was removed from the selected list |  -  |
| **404** | Resource not found |  -  |
| **409** | Conflict when visibility type not set to selected |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="codespacesRepoMachinesForAuthenticatedUser"></a>
# **codespacesRepoMachinesForAuthenticatedUser**
> CodespacesRepoMachinesForAuthenticatedUser200Response codespacesRepoMachinesForAuthenticatedUser(owner, repo, location, clientIp)

List available machine types for a repository

List the machine types available for a given repository based on its configuration.  You must authenticate using an access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have write access to the &#x60;codespaces_metadata&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String location = "WestUs2"; // String | The location to check for available machines. Assigned by IP if not provided.
    String clientIp = "clientIp_example"; // String | IP for location auto-detection when proxying a request
    try {
      CodespacesRepoMachinesForAuthenticatedUser200Response result = apiInstance.codespacesRepoMachinesForAuthenticatedUser(owner, repo, location, clientIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesRepoMachinesForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **location** | **String**| The location to check for available machines. Assigned by IP if not provided. | [optional] |
| **clientIp** | **String**| IP for location auto-detection when proxying a request | [optional] |

### Return type

[**CodespacesRepoMachinesForAuthenticatedUser200Response**](CodespacesRepoMachinesForAuthenticatedUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **304** | Not modified |  -  |
| **500** | Internal Error |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="codespacesSetCodespacesBilling"></a>
# **codespacesSetCodespacesBilling**
> codespacesSetCodespacesBilling(org, codespacesSetCodespacesBillingRequest)

Manage access control for organization codespaces

Sets which users can access codespaces in an organization. This is synonymous with granting or revoking codespaces billing permissions for users according to the visibility. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    CodespacesSetCodespacesBillingRequest codespacesSetCodespacesBillingRequest = new CodespacesSetCodespacesBillingRequest(); // CodespacesSetCodespacesBillingRequest | 
    try {
      apiInstance.codespacesSetCodespacesBilling(org, codespacesSetCodespacesBillingRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesSetCodespacesBilling");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **codespacesSetCodespacesBillingRequest** | [**CodespacesSetCodespacesBillingRequest**](CodespacesSetCodespacesBillingRequest.md)|  | |

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
| **204** | Response when successfully modifying permissions. |  -  |
| **304** | Not modified |  -  |
| **400** | Users are neither members nor collaborators of this organization. |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **500** | Internal Error |  -  |

<a name="codespacesSetCodespacesBillingUsers"></a>
# **codespacesSetCodespacesBillingUsers**
> codespacesSetCodespacesBillingUsers(org, codespacesSetCodespacesBillingUsersRequest)

Add users to Codespaces billing for an organization

Codespaces for the specified users will be billed to the organization. To use this endpoint, the billing settings for the organization must be set to &#x60;selected_members&#x60;. For information on how to change this setting please see [these docs].(https://docs.github.com/rest/codespaces/organizations#manage-access-control-for-organization-codespaces) You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    CodespacesSetCodespacesBillingUsersRequest codespacesSetCodespacesBillingUsersRequest = new CodespacesSetCodespacesBillingUsersRequest(); // CodespacesSetCodespacesBillingUsersRequest | 
    try {
      apiInstance.codespacesSetCodespacesBillingUsers(org, codespacesSetCodespacesBillingUsersRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesSetCodespacesBillingUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **codespacesSetCodespacesBillingUsersRequest** | [**CodespacesSetCodespacesBillingUsersRequest**](CodespacesSetCodespacesBillingUsersRequest.md)|  | |

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
| **204** | Response when successfully modifying permissions. |  -  |
| **304** | Not modified |  -  |
| **400** | Users are neither members nor collaborators of this organization. |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |
| **500** | Internal Error |  -  |

<a name="codespacesSetRepositoriesForSecretForAuthenticatedUser"></a>
# **codespacesSetRepositoriesForSecretForAuthenticatedUser**
> codespacesSetRepositoriesForSecretForAuthenticatedUser(secretName, codespacesSetRepositoriesForSecretForAuthenticatedUserRequest)

Set selected repositories for a user secret

Select the repositories that will use a user&#39;s codespace secret.  You must authenticate using an access token with the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint. User must have Codespaces access to use this endpoint.  GitHub Apps must have write access to the &#x60;codespaces_user_secrets&#x60; user permission and write access to the &#x60;codespaces_secrets&#x60; repository permission on all referenced repositories to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String secretName = "secretName_example"; // String | The name of the secret.
    CodespacesSetRepositoriesForSecretForAuthenticatedUserRequest codespacesSetRepositoriesForSecretForAuthenticatedUserRequest = new CodespacesSetRepositoriesForSecretForAuthenticatedUserRequest(); // CodespacesSetRepositoriesForSecretForAuthenticatedUserRequest | 
    try {
      apiInstance.codespacesSetRepositoriesForSecretForAuthenticatedUser(secretName, codespacesSetRepositoriesForSecretForAuthenticatedUserRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesSetRepositoriesForSecretForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **secretName** | **String**| The name of the secret. | |
| **codespacesSetRepositoriesForSecretForAuthenticatedUserRequest** | [**CodespacesSetRepositoriesForSecretForAuthenticatedUserRequest**](CodespacesSetRepositoriesForSecretForAuthenticatedUserRequest.md)|  | |

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
| **204** | No Content when repositories were added to the selected list |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Error |  -  |

<a name="codespacesSetSelectedReposForOrgSecret"></a>
# **codespacesSetSelectedReposForOrgSecret**
> codespacesSetSelectedReposForOrgSecret(org, secretName, codespacesSetSelectedReposForOrgSecretRequest)

Set selected repositories for an organization secret

Replaces all repositories for an organization secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    CodespacesSetSelectedReposForOrgSecretRequest codespacesSetSelectedReposForOrgSecretRequest = new CodespacesSetSelectedReposForOrgSecretRequest(); // CodespacesSetSelectedReposForOrgSecretRequest | 
    try {
      apiInstance.codespacesSetSelectedReposForOrgSecret(org, secretName, codespacesSetSelectedReposForOrgSecretRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesSetSelectedReposForOrgSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **codespacesSetSelectedReposForOrgSecretRequest** | [**CodespacesSetSelectedReposForOrgSecretRequest**](CodespacesSetSelectedReposForOrgSecretRequest.md)|  | |

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
| **404** | Resource not found |  -  |
| **409** | Conflict when visibility type not set to selected |  -  |

<a name="codespacesStartForAuthenticatedUser"></a>
# **codespacesStartForAuthenticatedUser**
> Codespace codespacesStartForAuthenticatedUser(codespaceName)

Start a codespace for the authenticated user

Starts a user&#39;s codespace.  You must authenticate using an access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have write access to the &#x60;codespaces_lifecycle_admin&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String codespaceName = "codespaceName_example"; // String | The name of the codespace.
    try {
      Codespace result = apiInstance.codespacesStartForAuthenticatedUser(codespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesStartForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **codespaceName** | **String**| The name of the codespace. | |

### Return type

[**Codespace**](Codespace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **304** | Not modified |  -  |
| **500** | Internal Error |  -  |
| **400** | Bad Request |  -  |
| **401** | Requires authentication |  -  |
| **402** | Payment required |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **409** | Conflict |  -  |

<a name="codespacesStopForAuthenticatedUser"></a>
# **codespacesStopForAuthenticatedUser**
> Codespace codespacesStopForAuthenticatedUser(codespaceName)

Stop a codespace for the authenticated user

Stops a user&#39;s codespace.  You must authenticate using an access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have write access to the &#x60;codespaces_lifecycle_admin&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String codespaceName = "codespaceName_example"; // String | The name of the codespace.
    try {
      Codespace result = apiInstance.codespacesStopForAuthenticatedUser(codespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesStopForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **codespaceName** | **String**| The name of the codespace. | |

### Return type

[**Codespace**](Codespace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **500** | Internal Error |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="codespacesStopInOrganization"></a>
# **codespacesStopInOrganization**
> Codespace codespacesStopInOrganization(org, username, codespaceName)

Stop a codespace for an organization user

Stops a user&#39;s codespace.  You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String username = "username_example"; // String | The handle for the GitHub user account.
    String codespaceName = "codespaceName_example"; // String | The name of the codespace.
    try {
      Codespace result = apiInstance.codespacesStopInOrganization(org, username, codespaceName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesStopInOrganization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **username** | **String**| The handle for the GitHub user account. | |
| **codespaceName** | **String**| The name of the codespace. | |

### Return type

[**Codespace**](Codespace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **304** | Not modified |  -  |
| **500** | Internal Error |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="codespacesUpdateForAuthenticatedUser"></a>
# **codespacesUpdateForAuthenticatedUser**
> Codespace codespacesUpdateForAuthenticatedUser(codespaceName, codespacesUpdateForAuthenticatedUserRequest)

Update a codespace for the authenticated user

Updates a codespace owned by the authenticated user. Currently only the codespace&#39;s machine type and recent folders can be modified using this endpoint.  If you specify a new machine type it will be applied the next time your codespace is started.  You must authenticate using an access token with the &#x60;codespace&#x60; scope to use this endpoint.  GitHub Apps must have write access to the &#x60;codespaces&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodespacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    CodespacesApi apiInstance = new CodespacesApi(defaultClient);
    String codespaceName = "codespaceName_example"; // String | The name of the codespace.
    CodespacesUpdateForAuthenticatedUserRequest codespacesUpdateForAuthenticatedUserRequest = new CodespacesUpdateForAuthenticatedUserRequest(); // CodespacesUpdateForAuthenticatedUserRequest | 
    try {
      Codespace result = apiInstance.codespacesUpdateForAuthenticatedUser(codespaceName, codespacesUpdateForAuthenticatedUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodespacesApi#codespacesUpdateForAuthenticatedUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **codespaceName** | **String**| The name of the codespace. | |
| **codespacesUpdateForAuthenticatedUserRequest** | [**CodespacesUpdateForAuthenticatedUserRequest**](CodespacesUpdateForAuthenticatedUserRequest.md)|  | [optional] |

### Return type

[**Codespace**](Codespace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **401** | Requires authentication |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

