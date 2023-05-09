# DependabotApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dependabotAddSelectedRepoToOrgSecret**](DependabotApi.md#dependabotAddSelectedRepoToOrgSecret) | **PUT** /orgs/{org}/dependabot/secrets/{secret_name}/repositories/{repository_id} | Add selected repository to an organization secret |
| [**dependabotCreateOrUpdateOrgSecret**](DependabotApi.md#dependabotCreateOrUpdateOrgSecret) | **PUT** /orgs/{org}/dependabot/secrets/{secret_name} | Create or update an organization secret |
| [**dependabotCreateOrUpdateRepoSecret**](DependabotApi.md#dependabotCreateOrUpdateRepoSecret) | **PUT** /repos/{owner}/{repo}/dependabot/secrets/{secret_name} | Create or update a repository secret |
| [**dependabotDeleteOrgSecret**](DependabotApi.md#dependabotDeleteOrgSecret) | **DELETE** /orgs/{org}/dependabot/secrets/{secret_name} | Delete an organization secret |
| [**dependabotDeleteRepoSecret**](DependabotApi.md#dependabotDeleteRepoSecret) | **DELETE** /repos/{owner}/{repo}/dependabot/secrets/{secret_name} | Delete a repository secret |
| [**dependabotGetAlert**](DependabotApi.md#dependabotGetAlert) | **GET** /repos/{owner}/{repo}/dependabot/alerts/{alert_number} | Get a Dependabot alert |
| [**dependabotGetOrgPublicKey**](DependabotApi.md#dependabotGetOrgPublicKey) | **GET** /orgs/{org}/dependabot/secrets/public-key | Get an organization public key |
| [**dependabotGetOrgSecret**](DependabotApi.md#dependabotGetOrgSecret) | **GET** /orgs/{org}/dependabot/secrets/{secret_name} | Get an organization secret |
| [**dependabotGetRepoPublicKey**](DependabotApi.md#dependabotGetRepoPublicKey) | **GET** /repos/{owner}/{repo}/dependabot/secrets/public-key | Get a repository public key |
| [**dependabotGetRepoSecret**](DependabotApi.md#dependabotGetRepoSecret) | **GET** /repos/{owner}/{repo}/dependabot/secrets/{secret_name} | Get a repository secret |
| [**dependabotListAlertsForEnterprise**](DependabotApi.md#dependabotListAlertsForEnterprise) | **GET** /enterprises/{enterprise}/dependabot/alerts | List Dependabot alerts for an enterprise |
| [**dependabotListAlertsForOrg**](DependabotApi.md#dependabotListAlertsForOrg) | **GET** /orgs/{org}/dependabot/alerts | List Dependabot alerts for an organization |
| [**dependabotListAlertsForRepo**](DependabotApi.md#dependabotListAlertsForRepo) | **GET** /repos/{owner}/{repo}/dependabot/alerts | List Dependabot alerts for a repository |
| [**dependabotListOrgSecrets**](DependabotApi.md#dependabotListOrgSecrets) | **GET** /orgs/{org}/dependabot/secrets | List organization secrets |
| [**dependabotListRepoSecrets**](DependabotApi.md#dependabotListRepoSecrets) | **GET** /repos/{owner}/{repo}/dependabot/secrets | List repository secrets |
| [**dependabotListSelectedReposForOrgSecret**](DependabotApi.md#dependabotListSelectedReposForOrgSecret) | **GET** /orgs/{org}/dependabot/secrets/{secret_name}/repositories | List selected repositories for an organization secret |
| [**dependabotRemoveSelectedRepoFromOrgSecret**](DependabotApi.md#dependabotRemoveSelectedRepoFromOrgSecret) | **DELETE** /orgs/{org}/dependabot/secrets/{secret_name}/repositories/{repository_id} | Remove selected repository from an organization secret |
| [**dependabotSetSelectedReposForOrgSecret**](DependabotApi.md#dependabotSetSelectedReposForOrgSecret) | **PUT** /orgs/{org}/dependabot/secrets/{secret_name}/repositories | Set selected repositories for an organization secret |
| [**dependabotUpdateAlert**](DependabotApi.md#dependabotUpdateAlert) | **PATCH** /repos/{owner}/{repo}/dependabot/alerts/{alert_number} | Update a Dependabot alert |


<a name="dependabotAddSelectedRepoToOrgSecret"></a>
# **dependabotAddSelectedRepoToOrgSecret**
> dependabotAddSelectedRepoToOrgSecret(org, secretName, repositoryId)

Add selected repository to an organization secret

Adds a repository to an organization secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;dependabot_secrets&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    Integer repositoryId = 56; // Integer | 
    try {
      apiInstance.dependabotAddSelectedRepoToOrgSecret(org, secretName, repositoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotAddSelectedRepoToOrgSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

<a name="dependabotCreateOrUpdateOrgSecret"></a>
# **dependabotCreateOrUpdateOrgSecret**
> Object dependabotCreateOrUpdateOrgSecret(org, secretName, dependabotCreateOrUpdateOrgSecretRequest)

Create or update an organization secret

Creates or updates an organization secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;dependabot_secrets&#x60; organization permission to use this endpoint.  #### Example encrypting a secret using Node.js  Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.  &#x60;&#x60;&#x60; const sodium &#x3D; require(&#39;libsodium-wrappers&#39;) const secret &#x3D; &#39;plain-text-secret&#39; // replace with the secret you want to encrypt const key &#x3D; &#39;base64-encoded-public-key&#39; // replace with the Base64 encoded public key  //Check if libsodium is ready and then proceed. sodium.ready.then(() &#x3D;&gt; {   // Convert Secret &amp; Base64 key to Uint8Array.   let binkey &#x3D; sodium.from_base64(key, sodium.base64_variants.ORIGINAL)   let binsec &#x3D; sodium.from_string(secret)    //Encrypt the secret using LibSodium   let encBytes &#x3D; sodium.crypto_box_seal(binsec, binkey)    // Convert encrypted Uint8Array to Base64   let output &#x3D; sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)    console.log(output) }); &#x60;&#x60;&#x60;  #### Example encrypting a secret using Python  Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.  &#x60;&#x60;&#x60; from base64 import b64encode from nacl import encoding, public  def encrypt(public_key: str, secret_value: str) -&gt; str:   \&quot;\&quot;\&quot;Encrypt a Unicode string using the public key.\&quot;\&quot;\&quot;   public_key &#x3D; public.PublicKey(public_key.encode(\&quot;utf-8\&quot;), encoding.Base64Encoder())   sealed_box &#x3D; public.SealedBox(public_key)   encrypted &#x3D; sealed_box.encrypt(secret_value.encode(\&quot;utf-8\&quot;))   return b64encode(encrypted).decode(\&quot;utf-8\&quot;) &#x60;&#x60;&#x60;  #### Example encrypting a secret using C#  Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.  &#x60;&#x60;&#x60; var secretValue &#x3D; System.Text.Encoding.UTF8.GetBytes(\&quot;mySecret\&quot;); var publicKey &#x3D; Convert.FromBase64String(\&quot;2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU&#x3D;\&quot;);  var sealedPublicKeyBox &#x3D; Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);  Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox)); &#x60;&#x60;&#x60;  #### Example encrypting a secret using Ruby  Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.  &#x60;&#x60;&#x60;ruby require \&quot;rbnacl\&quot; require \&quot;base64\&quot;  key &#x3D; Base64.decode64(\&quot;+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0&#x3D;\&quot;) public_key &#x3D; RbNaCl::PublicKey.new(key)  box &#x3D; RbNaCl::Boxes::Sealed.from_public_key(public_key) encrypted_secret &#x3D; box.encrypt(\&quot;my_secret\&quot;)  # Print the base64 encoded secret puts Base64.strict_encode64(encrypted_secret) &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    DependabotCreateOrUpdateOrgSecretRequest dependabotCreateOrUpdateOrgSecretRequest = new DependabotCreateOrUpdateOrgSecretRequest(); // DependabotCreateOrUpdateOrgSecretRequest | 
    try {
      Object result = apiInstance.dependabotCreateOrUpdateOrgSecret(org, secretName, dependabotCreateOrUpdateOrgSecretRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotCreateOrUpdateOrgSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **dependabotCreateOrUpdateOrgSecretRequest** | [**DependabotCreateOrUpdateOrgSecretRequest**](DependabotCreateOrUpdateOrgSecretRequest.md)|  | |

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

<a name="dependabotCreateOrUpdateRepoSecret"></a>
# **dependabotCreateOrUpdateRepoSecret**
> Object dependabotCreateOrUpdateRepoSecret(owner, repo, secretName, dependabotCreateOrUpdateRepoSecretRequest)

Create or update a repository secret

Creates or updates a repository secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;dependabot_secrets&#x60; repository permission to use this endpoint.  #### Example encrypting a secret using Node.js  Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.  &#x60;&#x60;&#x60; const sodium &#x3D; require(&#39;libsodium-wrappers&#39;) const secret &#x3D; &#39;plain-text-secret&#39; // replace with the secret you want to encrypt const key &#x3D; &#39;base64-encoded-public-key&#39; // replace with the Base64 encoded public key  //Check if libsodium is ready and then proceed. sodium.ready.then(() &#x3D;&gt; {   // Convert Secret &amp; Base64 key to Uint8Array.   let binkey &#x3D; sodium.from_base64(key, sodium.base64_variants.ORIGINAL)   let binsec &#x3D; sodium.from_string(secret)    //Encrypt the secret using LibSodium   let encBytes &#x3D; sodium.crypto_box_seal(binsec, binkey)    // Convert encrypted Uint8Array to Base64   let output &#x3D; sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)    console.log(output) }); &#x60;&#x60;&#x60;  #### Example encrypting a secret using Python  Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.  &#x60;&#x60;&#x60; from base64 import b64encode from nacl import encoding, public  def encrypt(public_key: str, secret_value: str) -&gt; str:   \&quot;\&quot;\&quot;Encrypt a Unicode string using the public key.\&quot;\&quot;\&quot;   public_key &#x3D; public.PublicKey(public_key.encode(\&quot;utf-8\&quot;), encoding.Base64Encoder())   sealed_box &#x3D; public.SealedBox(public_key)   encrypted &#x3D; sealed_box.encrypt(secret_value.encode(\&quot;utf-8\&quot;))   return b64encode(encrypted).decode(\&quot;utf-8\&quot;) &#x60;&#x60;&#x60;  #### Example encrypting a secret using C#  Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.  &#x60;&#x60;&#x60; var secretValue &#x3D; System.Text.Encoding.UTF8.GetBytes(\&quot;mySecret\&quot;); var publicKey &#x3D; Convert.FromBase64String(\&quot;2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU&#x3D;\&quot;);  var sealedPublicKeyBox &#x3D; Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);  Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox)); &#x60;&#x60;&#x60;  #### Example encrypting a secret using Ruby  Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.  &#x60;&#x60;&#x60;ruby require \&quot;rbnacl\&quot; require \&quot;base64\&quot;  key &#x3D; Base64.decode64(\&quot;+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0&#x3D;\&quot;) public_key &#x3D; RbNaCl::PublicKey.new(key)  box &#x3D; RbNaCl::Boxes::Sealed.from_public_key(public_key) encrypted_secret &#x3D; box.encrypt(\&quot;my_secret\&quot;)  # Print the base64 encoded secret puts Base64.strict_encode64(encrypted_secret) &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    DependabotCreateOrUpdateRepoSecretRequest dependabotCreateOrUpdateRepoSecretRequest = new DependabotCreateOrUpdateRepoSecretRequest(); // DependabotCreateOrUpdateRepoSecretRequest | 
    try {
      Object result = apiInstance.dependabotCreateOrUpdateRepoSecret(owner, repo, secretName, dependabotCreateOrUpdateRepoSecretRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotCreateOrUpdateRepoSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **dependabotCreateOrUpdateRepoSecretRequest** | [**DependabotCreateOrUpdateRepoSecretRequest**](DependabotCreateOrUpdateRepoSecretRequest.md)|  | |

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

<a name="dependabotDeleteOrgSecret"></a>
# **dependabotDeleteOrgSecret**
> dependabotDeleteOrgSecret(org, secretName)

Delete an organization secret

Deletes a secret in an organization using the secret name. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;dependabot_secrets&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      apiInstance.dependabotDeleteOrgSecret(org, secretName);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotDeleteOrgSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

<a name="dependabotDeleteRepoSecret"></a>
# **dependabotDeleteRepoSecret**
> dependabotDeleteRepoSecret(owner, repo, secretName)

Delete a repository secret

Deletes a secret in a repository using the secret name. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;dependabot_secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      apiInstance.dependabotDeleteRepoSecret(owner, repo, secretName);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotDeleteRepoSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

<a name="dependabotGetAlert"></a>
# **dependabotGetAlert**
> DependabotAlert dependabotGetAlert(owner, repo, alertNumber)

Get a Dependabot alert

You must use an access token with the &#x60;security_events&#x60; scope to use this endpoint with private repositories. You can also use tokens with the &#x60;public_repo&#x60; scope for public repositories only. GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer alertNumber = 56; // Integer | The number that identifies a Dependabot alert in its repository. You can find this at the end of the URL for a Dependabot alert within GitHub, or in `number` fields in the response from the `GET /repos/{owner}/{repo}/dependabot/alerts` operation.
    try {
      DependabotAlert result = apiInstance.dependabotGetAlert(owner, repo, alertNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotGetAlert");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **alertNumber** | **Integer**| The number that identifies a Dependabot alert in its repository. You can find this at the end of the URL for a Dependabot alert within GitHub, or in &#x60;number&#x60; fields in the response from the &#x60;GET /repos/{owner}/{repo}/dependabot/alerts&#x60; operation. | |

### Return type

[**DependabotAlert**](DependabotAlert.md)

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
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |

<a name="dependabotGetOrgPublicKey"></a>
# **dependabotGetOrgPublicKey**
> DependabotPublicKey dependabotGetOrgPublicKey(org)

Get an organization public key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;dependabot_secrets&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      DependabotPublicKey result = apiInstance.dependabotGetOrgPublicKey(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotGetOrgPublicKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**DependabotPublicKey**](DependabotPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="dependabotGetOrgSecret"></a>
# **dependabotGetOrgSecret**
> OrganizationDependabotSecret dependabotGetOrgSecret(org, secretName)

Get an organization secret

Gets a single organization secret without revealing its encrypted value. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;dependabot_secrets&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      OrganizationDependabotSecret result = apiInstance.dependabotGetOrgSecret(org, secretName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotGetOrgSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**OrganizationDependabotSecret**](OrganizationDependabotSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="dependabotGetRepoPublicKey"></a>
# **dependabotGetRepoPublicKey**
> DependabotPublicKey dependabotGetRepoPublicKey(owner, repo)

Get a repository public key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the &#x60;repo&#x60; scope. GitHub Apps must have the &#x60;dependabot_secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    try {
      DependabotPublicKey result = apiInstance.dependabotGetRepoPublicKey(owner, repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotGetRepoPublicKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**DependabotPublicKey**](DependabotPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="dependabotGetRepoSecret"></a>
# **dependabotGetRepoSecret**
> DependabotSecret dependabotGetRepoSecret(owner, repo, secretName)

Get a repository secret

Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;dependabot_secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    try {
      DependabotSecret result = apiInstance.dependabotGetRepoSecret(owner, repo, secretName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotGetRepoSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**DependabotSecret**](DependabotSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a name="dependabotListAlertsForEnterprise"></a>
# **dependabotListAlertsForEnterprise**
> List&lt;DependabotAlertWithRepository&gt; dependabotListAlertsForEnterprise(enterprise, state, severity, ecosystem, _package, scope, sort, direction, before, after, first, last, perPage)

List Dependabot alerts for an enterprise

Lists Dependabot alerts for repositories that are owned by the specified enterprise. To use this endpoint, you must be a member of the enterprise, and you must use an access token with the &#x60;repo&#x60; scope or &#x60;security_events&#x60; scope. Alerts are only returned for organizations in the enterprise for which you are an organization owner or a security manager. For more information about security managers, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String enterprise = "enterprise_example"; // String | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    String state = "state_example"; // String | A comma-separated list of states. If specified, only alerts with these states will be returned.  Can be: `auto_dismissed`, `dismissed`, `fixed`, `open`
    String severity = "severity_example"; // String | A comma-separated list of severities. If specified, only alerts with these severities will be returned.  Can be: `low`, `medium`, `high`, `critical`
    String ecosystem = "ecosystem_example"; // String | A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.  Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `pub`, `rubygems`, `rust`
    String _package = "_package_example"; // String | A comma-separated list of package names. If specified, only alerts for these packages will be returned.
    String scope = "development"; // String | The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned.
    String sort = "created"; // String | The property by which to sort the results. `created` means when the alert was created. `updated` means when the alert's state last changed.
    String direction = "asc"; // String | The direction to sort the results by.
    String before = "before_example"; // String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor.
    String after = "after_example"; // String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor.
    Integer first = 30; // Integer | **Deprecated**. The number of results per page (max 100), starting from the first matching result. This parameter must not be used in combination with `last`. Instead, use `per_page` in combination with `after` to fetch the first page of results.
    Integer last = 56; // Integer | **Deprecated**. The number of results per page (max 100), starting from the last matching result. This parameter must not be used in combination with `first`. Instead, use `per_page` in combination with `before` to fetch the last page of results.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    try {
      List<DependabotAlertWithRepository> result = apiInstance.dependabotListAlertsForEnterprise(enterprise, state, severity, ecosystem, _package, scope, sort, direction, before, after, first, last, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotListAlertsForEnterprise");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **enterprise** | **String**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | |
| **state** | **String**| A comma-separated list of states. If specified, only alerts with these states will be returned.  Can be: &#x60;auto_dismissed&#x60;, &#x60;dismissed&#x60;, &#x60;fixed&#x60;, &#x60;open&#x60; | [optional] |
| **severity** | **String**| A comma-separated list of severities. If specified, only alerts with these severities will be returned.  Can be: &#x60;low&#x60;, &#x60;medium&#x60;, &#x60;high&#x60;, &#x60;critical&#x60; | [optional] |
| **ecosystem** | **String**| A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.  Can be: &#x60;composer&#x60;, &#x60;go&#x60;, &#x60;maven&#x60;, &#x60;npm&#x60;, &#x60;nuget&#x60;, &#x60;pip&#x60;, &#x60;pub&#x60;, &#x60;rubygems&#x60;, &#x60;rust&#x60; | [optional] |
| **_package** | **String**| A comma-separated list of package names. If specified, only alerts for these packages will be returned. | [optional] |
| **scope** | **String**| The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned. | [optional] [enum: development, runtime] |
| **sort** | **String**| The property by which to sort the results. &#x60;created&#x60; means when the alert was created. &#x60;updated&#x60; means when the alert&#39;s state last changed. | [optional] [default to created] [enum: created, updated] |
| **direction** | **String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc] |
| **before** | **String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. | [optional] |
| **after** | **String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. | [optional] |
| **first** | **Integer**| **Deprecated**. The number of results per page (max 100), starting from the first matching result. This parameter must not be used in combination with &#x60;last&#x60;. Instead, use &#x60;per_page&#x60; in combination with &#x60;after&#x60; to fetch the first page of results. | [optional] [default to 30] |
| **last** | **Integer**| **Deprecated**. The number of results per page (max 100), starting from the last matching result. This parameter must not be used in combination with &#x60;first&#x60;. Instead, use &#x60;per_page&#x60; in combination with &#x60;before&#x60; to fetch the last page of results. | [optional] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |

### Return type

[**List&lt;DependabotAlertWithRepository&gt;**](DependabotAlertWithRepository.md)

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
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="dependabotListAlertsForOrg"></a>
# **dependabotListAlertsForOrg**
> List&lt;DependabotAlertWithRepository&gt; dependabotListAlertsForOrg(org, state, severity, ecosystem, _package, scope, sort, direction, before, after, first, last, perPage)

List Dependabot alerts for an organization

Lists Dependabot alerts for an organization.  To use this endpoint, you must be an owner or security manager for the organization, and you must use an access token with the &#x60;repo&#x60; scope or &#x60;security_events&#x60; scope.  For public repositories, you may instead use the &#x60;public_repo&#x60; scope.  GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String state = "state_example"; // String | A comma-separated list of states. If specified, only alerts with these states will be returned.  Can be: `auto_dismissed`, `dismissed`, `fixed`, `open`
    String severity = "severity_example"; // String | A comma-separated list of severities. If specified, only alerts with these severities will be returned.  Can be: `low`, `medium`, `high`, `critical`
    String ecosystem = "ecosystem_example"; // String | A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.  Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `pub`, `rubygems`, `rust`
    String _package = "_package_example"; // String | A comma-separated list of package names. If specified, only alerts for these packages will be returned.
    String scope = "development"; // String | The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned.
    String sort = "created"; // String | The property by which to sort the results. `created` means when the alert was created. `updated` means when the alert's state last changed.
    String direction = "asc"; // String | The direction to sort the results by.
    String before = "before_example"; // String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor.
    String after = "after_example"; // String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor.
    Integer first = 30; // Integer | **Deprecated**. The number of results per page (max 100), starting from the first matching result. This parameter must not be used in combination with `last`. Instead, use `per_page` in combination with `after` to fetch the first page of results.
    Integer last = 56; // Integer | **Deprecated**. The number of results per page (max 100), starting from the last matching result. This parameter must not be used in combination with `first`. Instead, use `per_page` in combination with `before` to fetch the last page of results.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    try {
      List<DependabotAlertWithRepository> result = apiInstance.dependabotListAlertsForOrg(org, state, severity, ecosystem, _package, scope, sort, direction, before, after, first, last, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotListAlertsForOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **state** | **String**| A comma-separated list of states. If specified, only alerts with these states will be returned.  Can be: &#x60;auto_dismissed&#x60;, &#x60;dismissed&#x60;, &#x60;fixed&#x60;, &#x60;open&#x60; | [optional] |
| **severity** | **String**| A comma-separated list of severities. If specified, only alerts with these severities will be returned.  Can be: &#x60;low&#x60;, &#x60;medium&#x60;, &#x60;high&#x60;, &#x60;critical&#x60; | [optional] |
| **ecosystem** | **String**| A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.  Can be: &#x60;composer&#x60;, &#x60;go&#x60;, &#x60;maven&#x60;, &#x60;npm&#x60;, &#x60;nuget&#x60;, &#x60;pip&#x60;, &#x60;pub&#x60;, &#x60;rubygems&#x60;, &#x60;rust&#x60; | [optional] |
| **_package** | **String**| A comma-separated list of package names. If specified, only alerts for these packages will be returned. | [optional] |
| **scope** | **String**| The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned. | [optional] [enum: development, runtime] |
| **sort** | **String**| The property by which to sort the results. &#x60;created&#x60; means when the alert was created. &#x60;updated&#x60; means when the alert&#39;s state last changed. | [optional] [default to created] [enum: created, updated] |
| **direction** | **String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc] |
| **before** | **String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. | [optional] |
| **after** | **String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. | [optional] |
| **first** | **Integer**| **Deprecated**. The number of results per page (max 100), starting from the first matching result. This parameter must not be used in combination with &#x60;last&#x60;. Instead, use &#x60;per_page&#x60; in combination with &#x60;after&#x60; to fetch the first page of results. | [optional] [default to 30] |
| **last** | **Integer**| **Deprecated**. The number of results per page (max 100), starting from the last matching result. This parameter must not be used in combination with &#x60;first&#x60;. Instead, use &#x60;per_page&#x60; in combination with &#x60;before&#x60; to fetch the last page of results. | [optional] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |

### Return type

[**List&lt;DependabotAlertWithRepository&gt;**](DependabotAlertWithRepository.md)

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
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="dependabotListAlertsForRepo"></a>
# **dependabotListAlertsForRepo**
> List&lt;DependabotAlert&gt; dependabotListAlertsForRepo(owner, repo, state, severity, ecosystem, _package, manifest, scope, sort, direction, page, perPage, before, after, first, last)

List Dependabot alerts for a repository

You must use an access token with the &#x60;security_events&#x60; scope to use this endpoint with private repositories. You can also use tokens with the &#x60;public_repo&#x60; scope for public repositories only. GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    String state = "state_example"; // String | A comma-separated list of states. If specified, only alerts with these states will be returned.  Can be: `auto_dismissed`, `dismissed`, `fixed`, `open`
    String severity = "severity_example"; // String | A comma-separated list of severities. If specified, only alerts with these severities will be returned.  Can be: `low`, `medium`, `high`, `critical`
    String ecosystem = "ecosystem_example"; // String | A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.  Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `pub`, `rubygems`, `rust`
    String _package = "_package_example"; // String | A comma-separated list of package names. If specified, only alerts for these packages will be returned.
    String manifest = "manifest_example"; // String | A comma-separated list of full manifest paths. If specified, only alerts for these manifests will be returned.
    String scope = "development"; // String | The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned.
    String sort = "created"; // String | The property by which to sort the results. `created` means when the alert was created. `updated` means when the alert's state last changed.
    String direction = "asc"; // String | The direction to sort the results by.
    Integer page = 1; // Integer | **Deprecated**. Page number of the results to fetch. Use cursor-based pagination with `before` or `after` instead.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    String before = "before_example"; // String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor.
    String after = "after_example"; // String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor.
    Integer first = 30; // Integer | **Deprecated**. The number of results per page (max 100), starting from the first matching result. This parameter must not be used in combination with `last`. Instead, use `per_page` in combination with `after` to fetch the first page of results.
    Integer last = 56; // Integer | **Deprecated**. The number of results per page (max 100), starting from the last matching result. This parameter must not be used in combination with `first`. Instead, use `per_page` in combination with `before` to fetch the last page of results.
    try {
      List<DependabotAlert> result = apiInstance.dependabotListAlertsForRepo(owner, repo, state, severity, ecosystem, _package, manifest, scope, sort, direction, page, perPage, before, after, first, last);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotListAlertsForRepo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **state** | **String**| A comma-separated list of states. If specified, only alerts with these states will be returned.  Can be: &#x60;auto_dismissed&#x60;, &#x60;dismissed&#x60;, &#x60;fixed&#x60;, &#x60;open&#x60; | [optional] |
| **severity** | **String**| A comma-separated list of severities. If specified, only alerts with these severities will be returned.  Can be: &#x60;low&#x60;, &#x60;medium&#x60;, &#x60;high&#x60;, &#x60;critical&#x60; | [optional] |
| **ecosystem** | **String**| A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.  Can be: &#x60;composer&#x60;, &#x60;go&#x60;, &#x60;maven&#x60;, &#x60;npm&#x60;, &#x60;nuget&#x60;, &#x60;pip&#x60;, &#x60;pub&#x60;, &#x60;rubygems&#x60;, &#x60;rust&#x60; | [optional] |
| **_package** | **String**| A comma-separated list of package names. If specified, only alerts for these packages will be returned. | [optional] |
| **manifest** | **String**| A comma-separated list of full manifest paths. If specified, only alerts for these manifests will be returned. | [optional] |
| **scope** | **String**| The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned. | [optional] [enum: development, runtime] |
| **sort** | **String**| The property by which to sort the results. &#x60;created&#x60; means when the alert was created. &#x60;updated&#x60; means when the alert&#39;s state last changed. | [optional] [default to created] [enum: created, updated] |
| **direction** | **String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc] |
| **page** | **Integer**| **Deprecated**. Page number of the results to fetch. Use cursor-based pagination with &#x60;before&#x60; or &#x60;after&#x60; instead. | [optional] [default to 1] |
| **perPage** | **Integer**| The number of results per page (max 100). | [optional] [default to 30] |
| **before** | **String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. | [optional] |
| **after** | **String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. | [optional] |
| **first** | **Integer**| **Deprecated**. The number of results per page (max 100), starting from the first matching result. This parameter must not be used in combination with &#x60;last&#x60;. Instead, use &#x60;per_page&#x60; in combination with &#x60;after&#x60; to fetch the first page of results. | [optional] [default to 30] |
| **last** | **Integer**| **Deprecated**. The number of results per page (max 100), starting from the last matching result. This parameter must not be used in combination with &#x60;first&#x60;. Instead, use &#x60;per_page&#x60; in combination with &#x60;before&#x60; to fetch the last page of results. | [optional] |

### Return type

[**List&lt;DependabotAlert&gt;**](DependabotAlert.md)

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
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

<a name="dependabotListOrgSecrets"></a>
# **dependabotListOrgSecrets**
> DependabotListOrgSecrets200Response dependabotListOrgSecrets(org, perPage, page)

List organization secrets

Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;dependabot_secrets&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      DependabotListOrgSecrets200Response result = apiInstance.dependabotListOrgSecrets(org, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotListOrgSecrets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**DependabotListOrgSecrets200Response**](DependabotListOrgSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="dependabotListRepoSecrets"></a>
# **dependabotListRepoSecrets**
> DependabotListRepoSecrets200Response dependabotListRepoSecrets(owner, repo, perPage, page)

List repository secrets

Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the &#x60;repo&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;dependabot_secrets&#x60; repository permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    Integer page = 1; // Integer | Page number of the results to fetch.
    try {
      DependabotListRepoSecrets200Response result = apiInstance.dependabotListRepoSecrets(owner, repo, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotListRepoSecrets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**DependabotListRepoSecrets200Response**](DependabotListRepoSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  * Link -  <br>  |

<a name="dependabotListSelectedReposForOrgSecret"></a>
# **dependabotListSelectedReposForOrgSecret**
> ActionsListSelectedReposForOrgSecret200Response dependabotListSelectedReposForOrgSecret(org, secretName, page, perPage)

List selected repositories for an organization secret

Lists all repositories that have been selected when the &#x60;visibility&#x60; for repository access to a secret is set to &#x60;selected&#x60;. You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;dependabot_secrets&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    Integer page = 1; // Integer | Page number of the results to fetch.
    Integer perPage = 30; // Integer | The number of results per page (max 100).
    try {
      ActionsListSelectedReposForOrgSecret200Response result = apiInstance.dependabotListSelectedReposForOrgSecret(org, secretName, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotListSelectedReposForOrgSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

<a name="dependabotRemoveSelectedRepoFromOrgSecret"></a>
# **dependabotRemoveSelectedRepoFromOrgSecret**
> dependabotRemoveSelectedRepoFromOrgSecret(org, secretName, repositoryId)

Remove selected repository from an organization secret

Removes a repository from an organization secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;dependabot_secrets&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    Integer repositoryId = 56; // Integer | 
    try {
      apiInstance.dependabotRemoveSelectedRepoFromOrgSecret(org, secretName, repositoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotRemoveSelectedRepoFromOrgSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

<a name="dependabotSetSelectedReposForOrgSecret"></a>
# **dependabotSetSelectedReposForOrgSecret**
> dependabotSetSelectedReposForOrgSecret(org, secretName, dependabotSetSelectedReposForOrgSecretRequest)

Set selected repositories for an organization secret

Replaces all repositories for an organization secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the &#x60;admin:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;dependabot_secrets&#x60; organization permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    String secretName = "secretName_example"; // String | The name of the secret.
    DependabotSetSelectedReposForOrgSecretRequest dependabotSetSelectedReposForOrgSecretRequest = new DependabotSetSelectedReposForOrgSecretRequest(); // DependabotSetSelectedReposForOrgSecretRequest | 
    try {
      apiInstance.dependabotSetSelectedReposForOrgSecret(org, secretName, dependabotSetSelectedReposForOrgSecretRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotSetSelectedReposForOrgSecret");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **dependabotSetSelectedReposForOrgSecretRequest** | [**DependabotSetSelectedReposForOrgSecretRequest**](DependabotSetSelectedReposForOrgSecretRequest.md)|  | |

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

<a name="dependabotUpdateAlert"></a>
# **dependabotUpdateAlert**
> DependabotAlert dependabotUpdateAlert(owner, repo, alertNumber, dependabotUpdateAlertRequest)

Update a Dependabot alert

You must use an access token with the &#x60;security_events&#x60; scope to use this endpoint with private repositories. You can also use tokens with the &#x60;public_repo&#x60; scope for public repositories only. GitHub Apps must have **Dependabot alerts** write permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DependabotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    DependabotApi apiInstance = new DependabotApi(defaultClient);
    String owner = "owner_example"; // String | The account owner of the repository. The name is not case sensitive.
    String repo = "repo_example"; // String | The name of the repository. The name is not case sensitive.
    Integer alertNumber = 56; // Integer | The number that identifies a Dependabot alert in its repository. You can find this at the end of the URL for a Dependabot alert within GitHub, or in `number` fields in the response from the `GET /repos/{owner}/{repo}/dependabot/alerts` operation.
    DependabotUpdateAlertRequest dependabotUpdateAlertRequest = new DependabotUpdateAlertRequest(); // DependabotUpdateAlertRequest | 
    try {
      DependabotAlert result = apiInstance.dependabotUpdateAlert(owner, repo, alertNumber, dependabotUpdateAlertRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependabotApi#dependabotUpdateAlert");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **alertNumber** | **Integer**| The number that identifies a Dependabot alert in its repository. You can find this at the end of the URL for a Dependabot alert within GitHub, or in &#x60;number&#x60; fields in the response from the &#x60;GET /repos/{owner}/{repo}/dependabot/alerts&#x60; operation. | |
| **dependabotUpdateAlertRequest** | [**DependabotUpdateAlertRequest**](DependabotUpdateAlertRequest.md)|  | |

### Return type

[**DependabotAlert**](DependabotAlert.md)

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
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **409** | Conflict |  -  |
| **422** | Validation failed, or the endpoint has been spammed. |  -  |

