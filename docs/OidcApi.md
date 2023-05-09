# OidcApi

All URIs are relative to *https://api.github.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**oidcGetOidcCustomSubTemplateForOrg**](OidcApi.md#oidcGetOidcCustomSubTemplateForOrg) | **GET** /orgs/{org}/actions/oidc/customization/sub | Get the customization template for an OIDC subject claim for an organization |
| [**oidcUpdateOidcCustomSubTemplateForOrg**](OidcApi.md#oidcUpdateOidcCustomSubTemplateForOrg) | **PUT** /orgs/{org}/actions/oidc/customization/sub | Set the customization template for an OIDC subject claim for an organization |


<a name="oidcGetOidcCustomSubTemplateForOrg"></a>
# **oidcGetOidcCustomSubTemplateForOrg**
> OidcCustomSub oidcGetOidcCustomSubTemplateForOrg(org)

Get the customization template for an OIDC subject claim for an organization

Gets the customization template for an OpenID Connect (OIDC) subject claim. You must authenticate using an access token with the &#x60;read:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;organization_administration:write&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OidcApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OidcApi apiInstance = new OidcApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    try {
      OidcCustomSub result = apiInstance.oidcGetOidcCustomSubTemplateForOrg(org);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OidcApi#oidcGetOidcCustomSubTemplateForOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**OidcCustomSub**](OidcCustomSub.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON serialized template for OIDC subject claim customization |  -  |

<a name="oidcUpdateOidcCustomSubTemplateForOrg"></a>
# **oidcUpdateOidcCustomSubTemplateForOrg**
> Object oidcUpdateOidcCustomSubTemplateForOrg(org, oidcCustomSub)

Set the customization template for an OIDC subject claim for an organization

Creates or updates the customization template for an OpenID Connect (OIDC) subject claim. You must authenticate using an access token with the &#x60;write:org&#x60; scope to use this endpoint. GitHub Apps must have the &#x60;admin:org&#x60; permission to use this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OidcApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.github.com");

    OidcApi apiInstance = new OidcApi(defaultClient);
    String org = "org_example"; // String | The organization name. The name is not case sensitive.
    OidcCustomSub oidcCustomSub = new OidcCustomSub(); // OidcCustomSub | 
    try {
      Object result = apiInstance.oidcUpdateOidcCustomSubTemplateForOrg(org, oidcCustomSub);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OidcApi#oidcUpdateOidcCustomSubTemplateForOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **oidcCustomSub** | [**OidcCustomSub**](OidcCustomSub.md)|  | |

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
| **201** | Empty response |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |

