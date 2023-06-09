/*
 * GitHub v3 REST API
 * GitHub's v3 REST API.
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AppsCheckTokenRequest;
import org.openapitools.client.model.AppsCreateFromManifest201Response;
import org.openapitools.client.model.AppsCreateInstallationAccessTokenRequest;
import org.openapitools.client.model.AppsDeleteAuthorizationRequest;
import org.openapitools.client.model.AppsListInstallationReposForAuthenticatedUser200Response;
import org.openapitools.client.model.AppsListReposAccessibleToInstallation200Response;
import org.openapitools.client.model.AppsScopeTokenRequest;
import org.openapitools.client.model.AppsUpdateWebhookConfigForAppRequest;
import org.openapitools.client.model.Authorization;
import org.openapitools.client.model.BasicError;
import org.openapitools.client.model.HookDelivery;
import org.openapitools.client.model.HookDeliveryItem;
import org.openapitools.client.model.Installation;
import org.openapitools.client.model.InstallationToken;
import org.openapitools.client.model.Integration;
import org.openapitools.client.model.IntegrationInstallationRequest;
import org.openapitools.client.model.MarketplaceListingPlan;
import org.openapitools.client.model.MarketplacePurchase;
import java.time.OffsetDateTime;
import org.openapitools.client.model.OrgsListAppInstallations200Response;
import org.openapitools.client.model.ScimError;
import org.openapitools.client.model.UserMarketplacePurchase;
import org.openapitools.client.model.ValidationError;
import org.openapitools.client.model.ValidationErrorSimple;
import org.openapitools.client.model.WebhookConfig;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppsApi
 */
@Disabled
public class AppsApiTest {

    private final AppsApi api = new AppsApi();

    /**
     * Add a repository to an app installation
     *
     * Add a single repository to an installation. The authenticated user must have admin access to the repository.  You must use a personal access token (which you can create via the [command line](https://docs.github.com/github/authenticating-to-github/creating-a-personal-access-token) or [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication)) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsAddRepoToInstallationForAuthenticatedUserTest() throws ApiException {
        Integer installationId = null;
        Integer repositoryId = null;
        api.appsAddRepoToInstallationForAuthenticatedUser(installationId, repositoryId);
        // TODO: test validations
    }

    /**
     * Check a token
     *
     * OAuth applications and GitHub applications with OAuth authorizations can use this API method for checking OAuth token validity without exceeding the normal rate limits for failed login attempts. Authentication works differently with this particular endpoint. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) to use this endpoint, where the username is the application &#x60;client_id&#x60; and the password is its &#x60;client_secret&#x60;. Invalid tokens will return &#x60;404 NOT FOUND&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsCheckTokenTest() throws ApiException {
        String clientId = null;
        AppsCheckTokenRequest appsCheckTokenRequest = null;
        Authorization response = api.appsCheckToken(clientId, appsCheckTokenRequest);
        // TODO: test validations
    }

    /**
     * Create a GitHub App from a manifest
     *
     * Use this endpoint to complete the handshake necessary when implementing the [GitHub App Manifest flow](https://docs.github.com/apps/building-github-apps/creating-github-apps-from-a-manifest/). When you create a GitHub App with the manifest flow, you receive a temporary &#x60;code&#x60; used to retrieve the GitHub App&#39;s &#x60;id&#x60;, &#x60;pem&#x60; (private key), and &#x60;webhook_secret&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsCreateFromManifestTest() throws ApiException {
        String code = null;
        AppsCreateFromManifest201Response response = api.appsCreateFromManifest(code);
        // TODO: test validations
    }

    /**
     * Create an installation access token for an app
     *
     * Creates an installation access token that enables a GitHub App to make authenticated API requests for the app&#39;s installation on an organization or individual account. Installation tokens expire one hour from the time you create them. Using an expired token produces a status code of &#x60;401 - Unauthorized&#x60;, and requires creating a new installation token. By default the installation token has access to all repositories that the installation can access. To restrict the access to specific repositories, you can provide the &#x60;repository_ids&#x60; when creating the token. When you omit &#x60;repository_ids&#x60;, the response does not contain the &#x60;repositories&#x60; key.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsCreateInstallationAccessTokenTest() throws ApiException {
        Integer installationId = null;
        AppsCreateInstallationAccessTokenRequest appsCreateInstallationAccessTokenRequest = null;
        InstallationToken response = api.appsCreateInstallationAccessToken(installationId, appsCreateInstallationAccessTokenRequest);
        // TODO: test validations
    }

    /**
     * Delete an app authorization
     *
     * OAuth and GitHub application owners can revoke a grant for their application and a specific user. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the OAuth application&#39;s &#x60;client_id&#x60; and &#x60;client_secret&#x60; as the username and password. You must also provide a valid OAuth &#x60;access_token&#x60; as an input parameter and the grant for the token&#39;s owner will be deleted. Deleting an application&#39;s grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user&#39;s account and will no longer be listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsDeleteAuthorizationTest() throws ApiException {
        String clientId = null;
        AppsDeleteAuthorizationRequest appsDeleteAuthorizationRequest = null;
        api.appsDeleteAuthorization(clientId, appsDeleteAuthorizationRequest);
        // TODO: test validations
    }

    /**
     * Delete an installation for the authenticated app
     *
     * Uninstalls a GitHub App on a user, organization, or business account. If you prefer to temporarily suspend an app&#39;s access to your account&#39;s resources, then we recommend the \&quot;[Suspend an app installation](https://docs.github.com/rest/reference/apps/#suspend-an-app-installation)\&quot; endpoint.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsDeleteInstallationTest() throws ApiException {
        Integer installationId = null;
        api.appsDeleteInstallation(installationId);
        // TODO: test validations
    }

    /**
     * Delete an app token
     *
     * OAuth  or GitHub application owners can revoke a single token for an OAuth application or a GitHub application with an OAuth authorization. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the application&#39;s &#x60;client_id&#x60; and &#x60;client_secret&#x60; as the username and password.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsDeleteTokenTest() throws ApiException {
        String clientId = null;
        AppsDeleteAuthorizationRequest appsDeleteAuthorizationRequest = null;
        api.appsDeleteToken(clientId, appsDeleteAuthorizationRequest);
        // TODO: test validations
    }

    /**
     * Get the authenticated app
     *
     * Returns the GitHub App associated with the authentication credentials used. To see how many app installations are associated with this GitHub App, see the &#x60;installations_count&#x60; in the response. For more details about your app&#39;s installations, see the \&quot;[List installations for the authenticated app](https://docs.github.com/rest/reference/apps#list-installations-for-the-authenticated-app)\&quot; endpoint.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsGetAuthenticatedTest() throws ApiException {
        Integration response = api.appsGetAuthenticated();
        // TODO: test validations
    }

    /**
     * Get an app
     *
     * **Note**: The &#x60;:app_slug&#x60; is just the URL-friendly name of your GitHub App. You can find this on the settings page for your GitHub App (e.g., &#x60;https://github.com/settings/apps/:app_slug&#x60;).  If the GitHub App you specify is public, you can access this endpoint without authenticating. If the GitHub App you specify is private, you must authenticate with a [personal access token](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or an [installation access token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsGetBySlugTest() throws ApiException {
        String appSlug = null;
        Integration response = api.appsGetBySlug(appSlug);
        // TODO: test validations
    }

    /**
     * Get an installation for the authenticated app
     *
     * Enables an authenticated GitHub App to find an installation&#39;s information using the installation id.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsGetInstallationTest() throws ApiException {
        Integer installationId = null;
        Installation response = api.appsGetInstallation(installationId);
        // TODO: test validations
    }

    /**
     * Get an organization installation for the authenticated app
     *
     * Enables an authenticated GitHub App to find the organization&#39;s installation information.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsGetOrgInstallationTest() throws ApiException {
        String org = null;
        Installation response = api.appsGetOrgInstallation(org);
        // TODO: test validations
    }

    /**
     * Get a repository installation for the authenticated app
     *
     * Enables an authenticated GitHub App to find the repository&#39;s installation information. The installation&#39;s account type will be either an organization or a user account, depending which account the repository belongs to.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsGetRepoInstallationTest() throws ApiException {
        String owner = null;
        String repo = null;
        Installation response = api.appsGetRepoInstallation(owner, repo);
        // TODO: test validations
    }

    /**
     * Get a subscription plan for an account
     *
     * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won&#39;t be processed until the end of their billing cycle, you will also see the upcoming pending change.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsGetSubscriptionPlanForAccountTest() throws ApiException {
        Integer accountId = null;
        MarketplacePurchase response = api.appsGetSubscriptionPlanForAccount(accountId);
        // TODO: test validations
    }

    /**
     * Get a subscription plan for an account (stubbed)
     *
     * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won&#39;t be processed until the end of their billing cycle, you will also see the upcoming pending change.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsGetSubscriptionPlanForAccountStubbedTest() throws ApiException {
        Integer accountId = null;
        MarketplacePurchase response = api.appsGetSubscriptionPlanForAccountStubbed(accountId);
        // TODO: test validations
    }

    /**
     * Get a user installation for the authenticated app
     *
     * Enables an authenticated GitHub App to find the user’s installation information.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsGetUserInstallationTest() throws ApiException {
        String username = null;
        Installation response = api.appsGetUserInstallation(username);
        // TODO: test validations
    }

    /**
     * Get a webhook configuration for an app
     *
     * Returns the webhook configuration for a GitHub App. For more information about configuring a webhook for your app, see \&quot;[Creating a GitHub App](/developers/apps/creating-a-github-app).\&quot;  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsGetWebhookConfigForAppTest() throws ApiException {
        WebhookConfig response = api.appsGetWebhookConfigForApp();
        // TODO: test validations
    }

    /**
     * Get a delivery for an app webhook
     *
     * Returns a delivery for the webhook configured for a GitHub App.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsGetWebhookDeliveryTest() throws ApiException {
        Integer deliveryId = null;
        HookDelivery response = api.appsGetWebhookDelivery(deliveryId);
        // TODO: test validations
    }

    /**
     * List accounts for a plan
     *
     * Returns user and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won&#39;t be processed until the end of their billing cycle, you will also see the upcoming pending change.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsListAccountsForPlanTest() throws ApiException {
        Integer planId = null;
        String sort = null;
        String direction = null;
        Integer perPage = null;
        Integer page = null;
        List<MarketplacePurchase> response = api.appsListAccountsForPlan(planId, sort, direction, perPage, page);
        // TODO: test validations
    }

    /**
     * List accounts for a plan (stubbed)
     *
     * Returns repository and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won&#39;t be processed until the end of their billing cycle, you will also see the upcoming pending change.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsListAccountsForPlanStubbedTest() throws ApiException {
        Integer planId = null;
        String sort = null;
        String direction = null;
        Integer perPage = null;
        Integer page = null;
        List<MarketplacePurchase> response = api.appsListAccountsForPlanStubbed(planId, sort, direction, perPage, page);
        // TODO: test validations
    }

    /**
     * List repositories accessible to the user access token
     *
     * List repositories that the authenticated user has explicit permission (&#x60;:read&#x60;, &#x60;:write&#x60;, or &#x60;:admin&#x60;) to access for an installation.  The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.  You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.  The access the user has to each repository is included in the hash under the &#x60;permissions&#x60; key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsListInstallationReposForAuthenticatedUserTest() throws ApiException {
        Integer installationId = null;
        Integer perPage = null;
        Integer page = null;
        AppsListInstallationReposForAuthenticatedUser200Response response = api.appsListInstallationReposForAuthenticatedUser(installationId, perPage, page);
        // TODO: test validations
    }

    /**
     * List installation requests for the authenticated app
     *
     * Lists all the pending installation requests for the authenticated GitHub App.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsListInstallationRequestsForAuthenticatedAppTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        List<IntegrationInstallationRequest> response = api.appsListInstallationRequestsForAuthenticatedApp(perPage, page);
        // TODO: test validations
    }

    /**
     * List installations for the authenticated app
     *
     * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.  The permissions the installation has are included under the &#x60;permissions&#x60; key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsListInstallationsTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        OffsetDateTime since = null;
        String outdated = null;
        List<Installation> response = api.appsListInstallations(perPage, page, since, outdated);
        // TODO: test validations
    }

    /**
     * List app installations accessible to the user access token
     *
     * Lists installations of your GitHub App that the authenticated user has explicit permission (&#x60;:read&#x60;, &#x60;:write&#x60;, or &#x60;:admin&#x60;) to access.  You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.  The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.  You can find the permissions for the installation under the &#x60;permissions&#x60; key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsListInstallationsForAuthenticatedUserTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        OrgsListAppInstallations200Response response = api.appsListInstallationsForAuthenticatedUser(perPage, page);
        // TODO: test validations
    }

    /**
     * List plans
     *
     * Lists all plans that are part of your GitHub Marketplace listing.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsListPlansTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        List<MarketplaceListingPlan> response = api.appsListPlans(perPage, page);
        // TODO: test validations
    }

    /**
     * List plans (stubbed)
     *
     * Lists all plans that are part of your GitHub Marketplace listing.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsListPlansStubbedTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        List<MarketplaceListingPlan> response = api.appsListPlansStubbed(perPage, page);
        // TODO: test validations
    }

    /**
     * List repositories accessible to the app installation
     *
     * List repositories that an app installation can access.  You must use an [installation access token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsListReposAccessibleToInstallationTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        AppsListReposAccessibleToInstallation200Response response = api.appsListReposAccessibleToInstallation(perPage, page);
        // TODO: test validations
    }

    /**
     * List subscriptions for the authenticated user
     *
     * Lists the active subscriptions for the authenticated user. You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsListSubscriptionsForAuthenticatedUserTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        List<UserMarketplacePurchase> response = api.appsListSubscriptionsForAuthenticatedUser(perPage, page);
        // TODO: test validations
    }

    /**
     * List subscriptions for the authenticated user (stubbed)
     *
     * Lists the active subscriptions for the authenticated user. You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsListSubscriptionsForAuthenticatedUserStubbedTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        List<UserMarketplacePurchase> response = api.appsListSubscriptionsForAuthenticatedUserStubbed(perPage, page);
        // TODO: test validations
    }

    /**
     * List deliveries for an app webhook
     *
     * Returns a list of webhook deliveries for the webhook configured for a GitHub App.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsListWebhookDeliveriesTest() throws ApiException {
        Integer perPage = null;
        String cursor = null;
        Boolean redelivery = null;
        List<HookDeliveryItem> response = api.appsListWebhookDeliveries(perPage, cursor, redelivery);
        // TODO: test validations
    }

    /**
     * Redeliver a delivery for an app webhook
     *
     * Redeliver a delivery for the webhook configured for a GitHub App.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsRedeliverWebhookDeliveryTest() throws ApiException {
        Integer deliveryId = null;
        Object response = api.appsRedeliverWebhookDelivery(deliveryId);
        // TODO: test validations
    }

    /**
     * Remove a repository from an app installation
     *
     * Remove a single repository from an installation. The authenticated user must have admin access to the repository.  You must use a personal access token (which you can create via the [command line](https://docs.github.com/github/authenticating-to-github/creating-a-personal-access-token) or [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication)) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsRemoveRepoFromInstallationForAuthenticatedUserTest() throws ApiException {
        Integer installationId = null;
        Integer repositoryId = null;
        api.appsRemoveRepoFromInstallationForAuthenticatedUser(installationId, repositoryId);
        // TODO: test validations
    }

    /**
     * Reset a token
     *
     * OAuth applications and GitHub applications with OAuth authorizations can use this API method to reset a valid OAuth token without end-user involvement. Applications must save the \&quot;token\&quot; property in the response because changes take effect immediately. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the application&#39;s &#x60;client_id&#x60; and &#x60;client_secret&#x60; as the username and password. Invalid tokens will return &#x60;404 NOT FOUND&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsResetTokenTest() throws ApiException {
        String clientId = null;
        AppsCheckTokenRequest appsCheckTokenRequest = null;
        Authorization response = api.appsResetToken(clientId, appsCheckTokenRequest);
        // TODO: test validations
    }

    /**
     * Revoke an installation access token
     *
     * Revokes the installation token you&#39;re using to authenticate as an installation and access this endpoint.  Once an installation token is revoked, the token is invalidated and cannot be used. Other endpoints that require the revoked installation token must have a new installation token to work. You can create a new token using the \&quot;[Create an installation access token for an app](https://docs.github.com/rest/reference/apps#create-an-installation-access-token-for-an-app)\&quot; endpoint.  You must use an [installation access token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsRevokeInstallationAccessTokenTest() throws ApiException {
        api.appsRevokeInstallationAccessToken();
        // TODO: test validations
    }

    /**
     * Create a scoped access token
     *
     * Use a non-scoped user-to-server access token to create a repository scoped and/or permission scoped user-to-server access token. You can specify which repositories the token can access and which permissions are granted to the token. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the &#x60;client_id&#x60; and &#x60;client_secret&#x60; of the GitHub App as the username and password. Invalid tokens will return &#x60;404 NOT FOUND&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsScopeTokenTest() throws ApiException {
        String clientId = null;
        AppsScopeTokenRequest appsScopeTokenRequest = null;
        Authorization response = api.appsScopeToken(clientId, appsScopeTokenRequest);
        // TODO: test validations
    }

    /**
     * Suspend an app installation
     *
     * Suspends a GitHub App on a user, organization, or business account, which blocks the app from accessing the account&#39;s resources. When a GitHub App is suspended, the app&#39;s access to the GitHub API or webhook events is blocked for that account.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsSuspendInstallationTest() throws ApiException {
        Integer installationId = null;
        api.appsSuspendInstallation(installationId);
        // TODO: test validations
    }

    /**
     * Unsuspend an app installation
     *
     * Removes a GitHub App installation suspension.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsUnsuspendInstallationTest() throws ApiException {
        Integer installationId = null;
        api.appsUnsuspendInstallation(installationId);
        // TODO: test validations
    }

    /**
     * Update a webhook configuration for an app
     *
     * Updates the webhook configuration for a GitHub App. For more information about configuring a webhook for your app, see \&quot;[Creating a GitHub App](/developers/apps/creating-a-github-app).\&quot;  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsUpdateWebhookConfigForAppTest() throws ApiException {
        AppsUpdateWebhookConfigForAppRequest appsUpdateWebhookConfigForAppRequest = null;
        WebhookConfig response = api.appsUpdateWebhookConfigForApp(appsUpdateWebhookConfigForAppRequest);
        // TODO: test validations
    }

}
