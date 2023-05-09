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
import org.openapitools.client.model.BasicError;
import org.openapitools.client.model.Email;
import org.openapitools.client.model.GpgKey;
import org.openapitools.client.model.Hovercard;
import org.openapitools.client.model.Key;
import org.openapitools.client.model.KeySimple;
import org.openapitools.client.model.PrivateUser;
import org.openapitools.client.model.SimpleUser;
import org.openapitools.client.model.SocialAccount;
import org.openapitools.client.model.SshSigningKey;
import org.openapitools.client.model.UsersAddEmailForAuthenticatedUserRequest;
import org.openapitools.client.model.UsersAddSocialAccountForAuthenticatedUserRequest;
import org.openapitools.client.model.UsersCreateGpgKeyForAuthenticatedUserRequest;
import org.openapitools.client.model.UsersCreatePublicSshKeyForAuthenticatedUserRequest;
import org.openapitools.client.model.UsersCreateSshSigningKeyForAuthenticatedUserRequest;
import org.openapitools.client.model.UsersDeleteEmailForAuthenticatedUserRequest;
import org.openapitools.client.model.UsersDeleteSocialAccountForAuthenticatedUserRequest;
import org.openapitools.client.model.UsersGetAuthenticated200Response;
import org.openapitools.client.model.UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest;
import org.openapitools.client.model.UsersUpdateAuthenticatedRequest;
import org.openapitools.client.model.ValidationError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Disabled
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    /**
     * Add an email address for the authenticated user
     *
     * This endpoint is accessible with the &#x60;user&#x60; scope.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersAddEmailForAuthenticatedUserTest() throws ApiException {
        UsersAddEmailForAuthenticatedUserRequest usersAddEmailForAuthenticatedUserRequest = null;
        List<Email> response = api.usersAddEmailForAuthenticatedUser(usersAddEmailForAuthenticatedUserRequest);
        // TODO: test validations
    }

    /**
     * Add social accounts for the authenticated user
     *
     * Add one or more social accounts to the authenticated user&#39;s profile. This endpoint is accessible with the &#x60;user&#x60; scope.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersAddSocialAccountForAuthenticatedUserTest() throws ApiException {
        UsersAddSocialAccountForAuthenticatedUserRequest usersAddSocialAccountForAuthenticatedUserRequest = null;
        List<SocialAccount> response = api.usersAddSocialAccountForAuthenticatedUser(usersAddSocialAccountForAuthenticatedUserRequest);
        // TODO: test validations
    }

    /**
     * Block a user
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersBlockTest() throws ApiException {
        String username = null;
        api.usersBlock(username);
        // TODO: test validations
    }

    /**
     * Check if a user is blocked by the authenticated user
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersCheckBlockedTest() throws ApiException {
        String username = null;
        api.usersCheckBlocked(username);
        // TODO: test validations
    }

    /**
     * Check if a user follows another user
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersCheckFollowingForUserTest() throws ApiException {
        String username = null;
        String targetUser = null;
        api.usersCheckFollowingForUser(username, targetUser);
        // TODO: test validations
    }

    /**
     * Check if a person is followed by the authenticated user
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersCheckPersonIsFollowedByAuthenticatedTest() throws ApiException {
        String username = null;
        api.usersCheckPersonIsFollowedByAuthenticated(username);
        // TODO: test validations
    }

    /**
     * Create a GPG key for the authenticated user
     *
     * Adds a GPG key to the authenticated user&#39;s GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least &#x60;write:gpg_key&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersCreateGpgKeyForAuthenticatedUserTest() throws ApiException {
        UsersCreateGpgKeyForAuthenticatedUserRequest usersCreateGpgKeyForAuthenticatedUserRequest = null;
        GpgKey response = api.usersCreateGpgKeyForAuthenticatedUser(usersCreateGpgKeyForAuthenticatedUserRequest);
        // TODO: test validations
    }

    /**
     * Create a public SSH key for the authenticated user
     *
     * Adds a public SSH key to the authenticated user&#39;s GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least &#x60;write:public_key&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersCreatePublicSshKeyForAuthenticatedUserTest() throws ApiException {
        UsersCreatePublicSshKeyForAuthenticatedUserRequest usersCreatePublicSshKeyForAuthenticatedUserRequest = null;
        Key response = api.usersCreatePublicSshKeyForAuthenticatedUser(usersCreatePublicSshKeyForAuthenticatedUserRequest);
        // TODO: test validations
    }

    /**
     * Create a SSH signing key for the authenticated user
     *
     * Creates an SSH signing key for the authenticated user&#39;s GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least &#x60;write:ssh_signing_key&#x60; scope. For more information, see \&quot;[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).\&quot;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersCreateSshSigningKeyForAuthenticatedUserTest() throws ApiException {
        UsersCreateSshSigningKeyForAuthenticatedUserRequest usersCreateSshSigningKeyForAuthenticatedUserRequest = null;
        SshSigningKey response = api.usersCreateSshSigningKeyForAuthenticatedUser(usersCreateSshSigningKeyForAuthenticatedUserRequest);
        // TODO: test validations
    }

    /**
     * Delete an email address for the authenticated user
     *
     * This endpoint is accessible with the &#x60;user&#x60; scope.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersDeleteEmailForAuthenticatedUserTest() throws ApiException {
        UsersDeleteEmailForAuthenticatedUserRequest usersDeleteEmailForAuthenticatedUserRequest = null;
        api.usersDeleteEmailForAuthenticatedUser(usersDeleteEmailForAuthenticatedUserRequest);
        // TODO: test validations
    }

    /**
     * Delete a GPG key for the authenticated user
     *
     * Removes a GPG key from the authenticated user&#39;s GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least &#x60;admin:gpg_key&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersDeleteGpgKeyForAuthenticatedUserTest() throws ApiException {
        Integer gpgKeyId = null;
        api.usersDeleteGpgKeyForAuthenticatedUser(gpgKeyId);
        // TODO: test validations
    }

    /**
     * Delete a public SSH key for the authenticated user
     *
     * Removes a public SSH key from the authenticated user&#39;s GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least &#x60;admin:public_key&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersDeletePublicSshKeyForAuthenticatedUserTest() throws ApiException {
        Integer keyId = null;
        api.usersDeletePublicSshKeyForAuthenticatedUser(keyId);
        // TODO: test validations
    }

    /**
     * Delete social accounts for the authenticated user
     *
     * Deletes one or more social accounts from the authenticated user&#39;s profile. This endpoint is accessible with the &#x60;user&#x60; scope.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersDeleteSocialAccountForAuthenticatedUserTest() throws ApiException {
        UsersDeleteSocialAccountForAuthenticatedUserRequest usersDeleteSocialAccountForAuthenticatedUserRequest = null;
        api.usersDeleteSocialAccountForAuthenticatedUser(usersDeleteSocialAccountForAuthenticatedUserRequest);
        // TODO: test validations
    }

    /**
     * Delete an SSH signing key for the authenticated user
     *
     * Deletes an SSH signing key from the authenticated user&#39;s GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least &#x60;admin:ssh_signing_key&#x60; scope. For more information, see \&quot;[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).\&quot;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersDeleteSshSigningKeyForAuthenticatedUserTest() throws ApiException {
        Integer sshSigningKeyId = null;
        api.usersDeleteSshSigningKeyForAuthenticatedUser(sshSigningKeyId);
        // TODO: test validations
    }

    /**
     * Follow a user
     *
     * Note that you&#39;ll need to set &#x60;Content-Length&#x60; to zero when calling out to this endpoint. For more information, see \&quot;[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs).\&quot;  Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the &#x60;user:follow&#x60; scope.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersFollowTest() throws ApiException {
        String username = null;
        api.usersFollow(username);
        // TODO: test validations
    }

    /**
     * Get the authenticated user
     *
     * If the authenticated user is authenticated with an OAuth token with the &#x60;user&#x60; scope, then the response lists public and private profile information.  If the authenticated user is authenticated through OAuth without the &#x60;user&#x60; scope, then the response lists only public profile information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersGetAuthenticatedTest() throws ApiException {
        UsersGetAuthenticated200Response response = api.usersGetAuthenticated();
        // TODO: test validations
    }

    /**
     * Get a user
     *
     * Provides publicly available information about someone with a GitHub account.  GitHub Apps with the &#x60;Plan&#x60; user permission can use this endpoint to retrieve information about a user&#39;s GitHub plan. The GitHub App must be authenticated as a user. See \&quot;[Identifying and authorizing users for GitHub Apps](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/)\&quot; for details about authentication. For an example response, see &#39;Response with GitHub plan information&#39; below\&quot;  The &#x60;email&#x60; key in the following response is the publicly visible email address from your GitHub [profile page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to be “public” which provides an email entry for this endpoint. If you do not set a public email address for &#x60;email&#x60;, then it will have a value of &#x60;null&#x60;. You only see publicly visible email addresses when authenticated with GitHub. For more information, see [Authentication](https://docs.github.com/rest/overview/resources-in-the-rest-api#authentication).  The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly. For more information, see \&quot;[Emails API](https://docs.github.com/rest/reference/users#emails)\&quot;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersGetByUsernameTest() throws ApiException {
        String username = null;
        UsersGetAuthenticated200Response response = api.usersGetByUsername(username);
        // TODO: test validations
    }

    /**
     * Get contextual information for a user
     *
     * Provides hovercard information when authenticated through basic auth or OAuth with the &#x60;repo&#x60; scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.  The &#x60;subject_type&#x60; and &#x60;subject_id&#x60; parameters provide context for the person&#39;s hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about &#x60;octocat&#x60; who owns the &#x60;Spoon-Knife&#x60; repository via cURL, it would look like this:  &#x60;&#x60;&#x60;shell  curl -u username:token   https://api.github.com/users/octocat/hovercard?subject_type&#x3D;repository&amp;subject_id&#x3D;1300192 &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersGetContextForUserTest() throws ApiException {
        String username = null;
        String subjectType = null;
        String subjectId = null;
        Hovercard response = api.usersGetContextForUser(username, subjectType, subjectId);
        // TODO: test validations
    }

    /**
     * Get a GPG key for the authenticated user
     *
     * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least &#x60;read:gpg_key&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersGetGpgKeyForAuthenticatedUserTest() throws ApiException {
        Integer gpgKeyId = null;
        GpgKey response = api.usersGetGpgKeyForAuthenticatedUser(gpgKeyId);
        // TODO: test validations
    }

    /**
     * Get a public SSH key for the authenticated user
     *
     * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least &#x60;read:public_key&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersGetPublicSshKeyForAuthenticatedUserTest() throws ApiException {
        Integer keyId = null;
        Key response = api.usersGetPublicSshKeyForAuthenticatedUser(keyId);
        // TODO: test validations
    }

    /**
     * Get an SSH signing key for the authenticated user
     *
     * Gets extended details for an SSH signing key. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least &#x60;read:ssh_signing_key&#x60; scope. For more information, see \&quot;[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).\&quot;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersGetSshSigningKeyForAuthenticatedUserTest() throws ApiException {
        Integer sshSigningKeyId = null;
        SshSigningKey response = api.usersGetSshSigningKeyForAuthenticatedUser(sshSigningKeyId);
        // TODO: test validations
    }

    /**
     * List users
     *
     * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.  Note: Pagination is powered exclusively by the &#x60;since&#x60; parameter. Use the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers) to get the URL for the next page of users.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersListTest() throws ApiException {
        Integer since = null;
        Integer perPage = null;
        List<SimpleUser> response = api.usersList(since, perPage);
        // TODO: test validations
    }

    /**
     * List users blocked by the authenticated user
     *
     * List the users you&#39;ve blocked on your personal account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersListBlockedByAuthenticatedUserTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        List<SimpleUser> response = api.usersListBlockedByAuthenticatedUser(perPage, page);
        // TODO: test validations
    }

    /**
     * List email addresses for the authenticated user
     *
     * Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the &#x60;user:email&#x60; scope.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersListEmailsForAuthenticatedUserTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        List<Email> response = api.usersListEmailsForAuthenticatedUser(perPage, page);
        // TODO: test validations
    }

    /**
     * List the people the authenticated user follows
     *
     * Lists the people who the authenticated user follows.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersListFollowedByAuthenticatedUserTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        List<SimpleUser> response = api.usersListFollowedByAuthenticatedUser(perPage, page);
        // TODO: test validations
    }

    /**
     * List followers of the authenticated user
     *
     * Lists the people following the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersListFollowersForAuthenticatedUserTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        List<SimpleUser> response = api.usersListFollowersForAuthenticatedUser(perPage, page);
        // TODO: test validations
    }

    /**
     * List followers of a user
     *
     * Lists the people following the specified user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersListFollowersForUserTest() throws ApiException {
        String username = null;
        Integer perPage = null;
        Integer page = null;
        List<SimpleUser> response = api.usersListFollowersForUser(username, perPage, page);
        // TODO: test validations
    }

    /**
     * List the people a user follows
     *
     * Lists the people who the specified user follows.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersListFollowingForUserTest() throws ApiException {
        String username = null;
        Integer perPage = null;
        Integer page = null;
        List<SimpleUser> response = api.usersListFollowingForUser(username, perPage, page);
        // TODO: test validations
    }

    /**
     * List GPG keys for the authenticated user
     *
     * Lists the current user&#39;s GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least &#x60;read:gpg_key&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersListGpgKeysForAuthenticatedUserTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        List<GpgKey> response = api.usersListGpgKeysForAuthenticatedUser(perPage, page);
        // TODO: test validations
    }

    /**
     * List GPG keys for a user
     *
     * Lists the GPG keys for a user. This information is accessible by anyone.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersListGpgKeysForUserTest() throws ApiException {
        String username = null;
        Integer perPage = null;
        Integer page = null;
        List<GpgKey> response = api.usersListGpgKeysForUser(username, perPage, page);
        // TODO: test validations
    }

    /**
     * List public email addresses for the authenticated user
     *
     * Lists your publicly visible email address, which you can set with the [Set primary email visibility for the authenticated user](https://docs.github.com/rest/reference/users#set-primary-email-visibility-for-the-authenticated-user) endpoint. This endpoint is accessible with the &#x60;user:email&#x60; scope.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersListPublicEmailsForAuthenticatedUserTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        List<Email> response = api.usersListPublicEmailsForAuthenticatedUser(perPage, page);
        // TODO: test validations
    }

    /**
     * List public keys for a user
     *
     * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersListPublicKeysForUserTest() throws ApiException {
        String username = null;
        Integer perPage = null;
        Integer page = null;
        List<KeySimple> response = api.usersListPublicKeysForUser(username, perPage, page);
        // TODO: test validations
    }

    /**
     * List public SSH keys for the authenticated user
     *
     * Lists the public SSH keys for the authenticated user&#39;s GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least &#x60;read:public_key&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersListPublicSshKeysForAuthenticatedUserTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        List<Key> response = api.usersListPublicSshKeysForAuthenticatedUser(perPage, page);
        // TODO: test validations
    }

    /**
     * List social accounts for the authenticated user
     *
     * Lists all of your social accounts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersListSocialAccountsForAuthenticatedUserTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        List<SocialAccount> response = api.usersListSocialAccountsForAuthenticatedUser(perPage, page);
        // TODO: test validations
    }

    /**
     * List social accounts for a user
     *
     * Lists social media accounts for a user. This endpoint is accessible by anyone.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersListSocialAccountsForUserTest() throws ApiException {
        String username = null;
        Integer perPage = null;
        Integer page = null;
        List<SocialAccount> response = api.usersListSocialAccountsForUser(username, perPage, page);
        // TODO: test validations
    }

    /**
     * List SSH signing keys for the authenticated user
     *
     * Lists the SSH signing keys for the authenticated user&#39;s GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least &#x60;read:ssh_signing_key&#x60; scope. For more information, see \&quot;[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).\&quot;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersListSshSigningKeysForAuthenticatedUserTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        List<SshSigningKey> response = api.usersListSshSigningKeysForAuthenticatedUser(perPage, page);
        // TODO: test validations
    }

    /**
     * List SSH signing keys for a user
     *
     * Lists the SSH signing keys for a user. This operation is accessible by anyone.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersListSshSigningKeysForUserTest() throws ApiException {
        String username = null;
        Integer perPage = null;
        Integer page = null;
        List<SshSigningKey> response = api.usersListSshSigningKeysForUser(username, perPage, page);
        // TODO: test validations
    }

    /**
     * Set primary email visibility for the authenticated user
     *
     * Sets the visibility for your primary email addresses.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersSetPrimaryEmailVisibilityForAuthenticatedUserTest() throws ApiException {
        UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest usersSetPrimaryEmailVisibilityForAuthenticatedUserRequest = null;
        List<Email> response = api.usersSetPrimaryEmailVisibilityForAuthenticatedUser(usersSetPrimaryEmailVisibilityForAuthenticatedUserRequest);
        // TODO: test validations
    }

    /**
     * Unblock a user
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersUnblockTest() throws ApiException {
        String username = null;
        api.usersUnblock(username);
        // TODO: test validations
    }

    /**
     * Unfollow a user
     *
     * Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the &#x60;user:follow&#x60; scope.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersUnfollowTest() throws ApiException {
        String username = null;
        api.usersUnfollow(username);
        // TODO: test validations
    }

    /**
     * Update the authenticated user
     *
     * **Note:** If your email is set to private and you send an &#x60;email&#x60; parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersUpdateAuthenticatedTest() throws ApiException {
        UsersUpdateAuthenticatedRequest usersUpdateAuthenticatedRequest = null;
        PrivateUser response = api.usersUpdateAuthenticated(usersUpdateAuthenticatedRequest);
        // TODO: test validations
    }

}