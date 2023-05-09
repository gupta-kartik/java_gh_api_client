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
import org.openapitools.client.model.Reaction;
import org.openapitools.client.model.ReactionsCreateForCommitCommentRequest;
import org.openapitools.client.model.ReactionsCreateForIssueCommentRequest;
import org.openapitools.client.model.ReactionsCreateForIssueRequest;
import org.openapitools.client.model.ReactionsCreateForPullRequestReviewCommentRequest;
import org.openapitools.client.model.ReactionsCreateForReleaseRequest;
import org.openapitools.client.model.ReactionsCreateForTeamDiscussionCommentInOrgRequest;
import org.openapitools.client.model.ReactionsCreateForTeamDiscussionInOrgRequest;
import org.openapitools.client.model.ValidationError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReactionsApi
 */
@Disabled
public class ReactionsApiTest {

    private final ReactionsApi api = new ReactionsApi();

    /**
     * Create reaction for a commit comment
     *
     * Create a reaction to a [commit comment](https://docs.github.com/rest/reference/repos#comments). A response with an HTTP &#x60;200&#x60; status means that you already added the reaction type to this commit comment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsCreateForCommitCommentTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer commentId = null;
        ReactionsCreateForCommitCommentRequest reactionsCreateForCommitCommentRequest = null;
        Reaction response = api.reactionsCreateForCommitComment(owner, repo, commentId, reactionsCreateForCommitCommentRequest);
        // TODO: test validations
    }

    /**
     * Create reaction for an issue
     *
     * Create a reaction to an [issue](https://docs.github.com/rest/reference/issues/). A response with an HTTP &#x60;200&#x60; status means that you already added the reaction type to this issue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsCreateForIssueTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer issueNumber = null;
        ReactionsCreateForIssueRequest reactionsCreateForIssueRequest = null;
        Reaction response = api.reactionsCreateForIssue(owner, repo, issueNumber, reactionsCreateForIssueRequest);
        // TODO: test validations
    }

    /**
     * Create reaction for an issue comment
     *
     * Create a reaction to an [issue comment](https://docs.github.com/rest/reference/issues#comments). A response with an HTTP &#x60;200&#x60; status means that you already added the reaction type to this issue comment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsCreateForIssueCommentTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer commentId = null;
        ReactionsCreateForIssueCommentRequest reactionsCreateForIssueCommentRequest = null;
        Reaction response = api.reactionsCreateForIssueComment(owner, repo, commentId, reactionsCreateForIssueCommentRequest);
        // TODO: test validations
    }

    /**
     * Create reaction for a pull request review comment
     *
     * Create a reaction to a [pull request review comment](https://docs.github.com/rest/reference/pulls#comments). A response with an HTTP &#x60;200&#x60; status means that you already added the reaction type to this pull request review comment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsCreateForPullRequestReviewCommentTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer commentId = null;
        ReactionsCreateForPullRequestReviewCommentRequest reactionsCreateForPullRequestReviewCommentRequest = null;
        Reaction response = api.reactionsCreateForPullRequestReviewComment(owner, repo, commentId, reactionsCreateForPullRequestReviewCommentRequest);
        // TODO: test validations
    }

    /**
     * Create reaction for a release
     *
     * Create a reaction to a [release](https://docs.github.com/rest/reference/repos#releases). A response with a &#x60;Status: 200 OK&#x60; means that you already added the reaction type to this release.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsCreateForReleaseTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer releaseId = null;
        ReactionsCreateForReleaseRequest reactionsCreateForReleaseRequest = null;
        Reaction response = api.reactionsCreateForRelease(owner, repo, releaseId, reactionsCreateForReleaseRequest);
        // TODO: test validations
    }

    /**
     * Create reaction for a team discussion comment
     *
     * Create a reaction to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments). OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP &#x60;200&#x60; status means that you already added the reaction type to this team discussion comment.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsCreateForTeamDiscussionCommentInOrgTest() throws ApiException {
        String org = null;
        String teamSlug = null;
        Integer discussionNumber = null;
        Integer commentNumber = null;
        ReactionsCreateForTeamDiscussionCommentInOrgRequest reactionsCreateForTeamDiscussionCommentInOrgRequest = null;
        Reaction response = api.reactionsCreateForTeamDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber, reactionsCreateForTeamDiscussionCommentInOrgRequest);
        // TODO: test validations
    }

    /**
     * Create reaction for a team discussion comment (Legacy)
     *
     * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new \&quot;[Create reaction for a team discussion comment](https://docs.github.com/rest/reference/reactions#create-reaction-for-a-team-discussion-comment)\&quot; endpoint.  Create a reaction to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments). OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP &#x60;200&#x60; status means that you already added the reaction type to this team discussion comment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsCreateForTeamDiscussionCommentLegacyTest() throws ApiException {
        Integer teamId = null;
        Integer discussionNumber = null;
        Integer commentNumber = null;
        ReactionsCreateForTeamDiscussionCommentInOrgRequest reactionsCreateForTeamDiscussionCommentInOrgRequest = null;
        Reaction response = api.reactionsCreateForTeamDiscussionCommentLegacy(teamId, discussionNumber, commentNumber, reactionsCreateForTeamDiscussionCommentInOrgRequest);
        // TODO: test validations
    }

    /**
     * Create reaction for a team discussion
     *
     * Create a reaction to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP &#x60;200&#x60; status means that you already added the reaction type to this team discussion.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsCreateForTeamDiscussionInOrgTest() throws ApiException {
        String org = null;
        String teamSlug = null;
        Integer discussionNumber = null;
        ReactionsCreateForTeamDiscussionInOrgRequest reactionsCreateForTeamDiscussionInOrgRequest = null;
        Reaction response = api.reactionsCreateForTeamDiscussionInOrg(org, teamSlug, discussionNumber, reactionsCreateForTeamDiscussionInOrgRequest);
        // TODO: test validations
    }

    /**
     * Create reaction for a team discussion (Legacy)
     *
     * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;Create reaction for a team discussion&#x60;](https://docs.github.com/rest/reference/reactions#create-reaction-for-a-team-discussion) endpoint.  Create a reaction to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP &#x60;200&#x60; status means that you already added the reaction type to this team discussion.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsCreateForTeamDiscussionLegacyTest() throws ApiException {
        Integer teamId = null;
        Integer discussionNumber = null;
        ReactionsCreateForTeamDiscussionInOrgRequest reactionsCreateForTeamDiscussionInOrgRequest = null;
        Reaction response = api.reactionsCreateForTeamDiscussionLegacy(teamId, discussionNumber, reactionsCreateForTeamDiscussionInOrgRequest);
        // TODO: test validations
    }

    /**
     * Delete a commit comment reaction
     *
     * **Note:** You can also specify a repository by &#x60;repository_id&#x60; using the route &#x60;DELETE /repositories/:repository_id/comments/:comment_id/reactions/:reaction_id&#x60;.  Delete a reaction to a [commit comment](https://docs.github.com/rest/reference/repos#comments).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsDeleteForCommitCommentTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer commentId = null;
        Integer reactionId = null;
        api.reactionsDeleteForCommitComment(owner, repo, commentId, reactionId);
        // TODO: test validations
    }

    /**
     * Delete an issue reaction
     *
     * **Note:** You can also specify a repository by &#x60;repository_id&#x60; using the route &#x60;DELETE /repositories/:repository_id/issues/:issue_number/reactions/:reaction_id&#x60;.  Delete a reaction to an [issue](https://docs.github.com/rest/reference/issues/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsDeleteForIssueTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer issueNumber = null;
        Integer reactionId = null;
        api.reactionsDeleteForIssue(owner, repo, issueNumber, reactionId);
        // TODO: test validations
    }

    /**
     * Delete an issue comment reaction
     *
     * **Note:** You can also specify a repository by &#x60;repository_id&#x60; using the route &#x60;DELETE delete /repositories/:repository_id/issues/comments/:comment_id/reactions/:reaction_id&#x60;.  Delete a reaction to an [issue comment](https://docs.github.com/rest/reference/issues#comments).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsDeleteForIssueCommentTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer commentId = null;
        Integer reactionId = null;
        api.reactionsDeleteForIssueComment(owner, repo, commentId, reactionId);
        // TODO: test validations
    }

    /**
     * Delete a pull request comment reaction
     *
     * **Note:** You can also specify a repository by &#x60;repository_id&#x60; using the route &#x60;DELETE /repositories/:repository_id/pulls/comments/:comment_id/reactions/:reaction_id.&#x60;  Delete a reaction to a [pull request review comment](https://docs.github.com/rest/reference/pulls#review-comments).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsDeleteForPullRequestCommentTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer commentId = null;
        Integer reactionId = null;
        api.reactionsDeleteForPullRequestComment(owner, repo, commentId, reactionId);
        // TODO: test validations
    }

    /**
     * Delete a release reaction
     *
     * **Note:** You can also specify a repository by &#x60;repository_id&#x60; using the route &#x60;DELETE delete /repositories/:repository_id/releases/:release_id/reactions/:reaction_id&#x60;.  Delete a reaction to a [release](https://docs.github.com/rest/reference/repos#releases).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsDeleteForReleaseTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer releaseId = null;
        Integer reactionId = null;
        api.reactionsDeleteForRelease(owner, repo, releaseId, reactionId);
        // TODO: test validations
    }

    /**
     * Delete team discussion reaction
     *
     * **Note:** You can also specify a team or organization with &#x60;team_id&#x60; and &#x60;org_id&#x60; using the route &#x60;DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions/:reaction_id&#x60;.  Delete a reaction to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsDeleteForTeamDiscussionTest() throws ApiException {
        String org = null;
        String teamSlug = null;
        Integer discussionNumber = null;
        Integer reactionId = null;
        api.reactionsDeleteForTeamDiscussion(org, teamSlug, discussionNumber, reactionId);
        // TODO: test validations
    }

    /**
     * Delete team discussion comment reaction
     *
     * **Note:** You can also specify a team or organization with &#x60;team_id&#x60; and &#x60;org_id&#x60; using the route &#x60;DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions/:reaction_id&#x60;.  Delete a reaction to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments). OAuth access tokens require the &#x60;write:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsDeleteForTeamDiscussionCommentTest() throws ApiException {
        String org = null;
        String teamSlug = null;
        Integer discussionNumber = null;
        Integer commentNumber = null;
        Integer reactionId = null;
        api.reactionsDeleteForTeamDiscussionComment(org, teamSlug, discussionNumber, commentNumber, reactionId);
        // TODO: test validations
    }

    /**
     * List reactions for a commit comment
     *
     * List the reactions to a [commit comment](https://docs.github.com/rest/reference/repos#comments).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsListForCommitCommentTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer commentId = null;
        String content = null;
        Integer perPage = null;
        Integer page = null;
        List<Reaction> response = api.reactionsListForCommitComment(owner, repo, commentId, content, perPage, page);
        // TODO: test validations
    }

    /**
     * List reactions for an issue
     *
     * List the reactions to an [issue](https://docs.github.com/rest/reference/issues).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsListForIssueTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer issueNumber = null;
        String content = null;
        Integer perPage = null;
        Integer page = null;
        List<Reaction> response = api.reactionsListForIssue(owner, repo, issueNumber, content, perPage, page);
        // TODO: test validations
    }

    /**
     * List reactions for an issue comment
     *
     * List the reactions to an [issue comment](https://docs.github.com/rest/reference/issues#comments).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsListForIssueCommentTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer commentId = null;
        String content = null;
        Integer perPage = null;
        Integer page = null;
        List<Reaction> response = api.reactionsListForIssueComment(owner, repo, commentId, content, perPage, page);
        // TODO: test validations
    }

    /**
     * List reactions for a pull request review comment
     *
     * List the reactions to a [pull request review comment](https://docs.github.com/rest/reference/pulls#review-comments).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsListForPullRequestReviewCommentTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer commentId = null;
        String content = null;
        Integer perPage = null;
        Integer page = null;
        List<Reaction> response = api.reactionsListForPullRequestReviewComment(owner, repo, commentId, content, perPage, page);
        // TODO: test validations
    }

    /**
     * List reactions for a release
     *
     * List the reactions to a [release](https://docs.github.com/rest/reference/repos#releases).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsListForReleaseTest() throws ApiException {
        String owner = null;
        String repo = null;
        Integer releaseId = null;
        String content = null;
        Integer perPage = null;
        Integer page = null;
        List<Reaction> response = api.reactionsListForRelease(owner, repo, releaseId, content, perPage, page);
        // TODO: test validations
    }

    /**
     * List reactions for a team discussion comment
     *
     * List the reactions to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments/). OAuth access tokens require the &#x60;read:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsListForTeamDiscussionCommentInOrgTest() throws ApiException {
        String org = null;
        String teamSlug = null;
        Integer discussionNumber = null;
        Integer commentNumber = null;
        String content = null;
        Integer perPage = null;
        Integer page = null;
        List<Reaction> response = api.reactionsListForTeamDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber, content, perPage, page);
        // TODO: test validations
    }

    /**
     * List reactions for a team discussion comment (Legacy)
     *
     * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;List reactions for a team discussion comment&#x60;](https://docs.github.com/rest/reference/reactions#list-reactions-for-a-team-discussion-comment) endpoint.  List the reactions to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments). OAuth access tokens require the &#x60;read:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsListForTeamDiscussionCommentLegacyTest() throws ApiException {
        Integer teamId = null;
        Integer discussionNumber = null;
        Integer commentNumber = null;
        String content = null;
        Integer perPage = null;
        Integer page = null;
        List<Reaction> response = api.reactionsListForTeamDiscussionCommentLegacy(teamId, discussionNumber, commentNumber, content, perPage, page);
        // TODO: test validations
    }

    /**
     * List reactions for a team discussion
     *
     * List the reactions to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the &#x60;read:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsListForTeamDiscussionInOrgTest() throws ApiException {
        String org = null;
        String teamSlug = null;
        Integer discussionNumber = null;
        String content = null;
        Integer perPage = null;
        Integer page = null;
        List<Reaction> response = api.reactionsListForTeamDiscussionInOrg(org, teamSlug, discussionNumber, content, perPage, page);
        // TODO: test validations
    }

    /**
     * List reactions for a team discussion (Legacy)
     *
     * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;List reactions for a team discussion&#x60;](https://docs.github.com/rest/reference/reactions#list-reactions-for-a-team-discussion) endpoint.  List the reactions to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the &#x60;read:discussion&#x60; [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsListForTeamDiscussionLegacyTest() throws ApiException {
        Integer teamId = null;
        Integer discussionNumber = null;
        String content = null;
        Integer perPage = null;
        Integer page = null;
        List<Reaction> response = api.reactionsListForTeamDiscussionLegacy(teamId, discussionNumber, content, perPage, page);
        // TODO: test validations
    }

}
