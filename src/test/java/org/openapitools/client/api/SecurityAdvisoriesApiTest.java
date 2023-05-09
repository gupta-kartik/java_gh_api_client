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
import org.openapitools.client.model.PrivateVulnerabilityReportCreate;
import org.openapitools.client.model.RepositoryAdvisory;
import org.openapitools.client.model.RepositoryAdvisoryCreate;
import org.openapitools.client.model.RepositoryAdvisoryUpdate;
import org.openapitools.client.model.ScimError;
import org.openapitools.client.model.ValidationError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecurityAdvisoriesApi
 */
@Disabled
public class SecurityAdvisoriesApiTest {

    private final SecurityAdvisoriesApi api = new SecurityAdvisoriesApi();

    /**
     * Privately report a security vulnerability
     *
     * Report a security vulnerability to the maintainers of the repository. See \&quot;[Privately reporting a security vulnerability](https://docs.github.com/code-security/security-advisories/guidance-on-reporting-and-writing/privately-reporting-a-security-vulnerability)\&quot; for more information about private vulnerability reporting.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void securityAdvisoriesCreatePrivateVulnerabilityReportTest() throws ApiException {
        String owner = null;
        String repo = null;
        PrivateVulnerabilityReportCreate privateVulnerabilityReportCreate = null;
        RepositoryAdvisory response = api.securityAdvisoriesCreatePrivateVulnerabilityReport(owner, repo, privateVulnerabilityReportCreate);
        // TODO: test validations
    }

    /**
     * Create a repository security advisory
     *
     * Creates a new repository security advisory. You must authenticate using an access token with the &#x60;repo&#x60; scope or &#x60;repository_advisories:write&#x60; permission to use this endpoint.  In order to create a draft repository security advisory, you must be a security manager or administrator of that repository.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void securityAdvisoriesCreateRepositoryAdvisoryTest() throws ApiException {
        String owner = null;
        String repo = null;
        RepositoryAdvisoryCreate repositoryAdvisoryCreate = null;
        RepositoryAdvisory response = api.securityAdvisoriesCreateRepositoryAdvisory(owner, repo, repositoryAdvisoryCreate);
        // TODO: test validations
    }

    /**
     * Get a repository security advisory
     *
     * Get a repository security advisory using its GitHub Security Advisory (GHSA) identifier. You can access any published security advisory on a public repository. You must authenticate using an access token with the &#x60;repo&#x60; scope or &#x60;repository_advisories:read&#x60; permission in order to get a published security advisory in a private repository, or any unpublished security advisory that you have access to.  You can access an unpublished security advisory from a repository if you are a security manager or administrator of that repository, or if you are a collaborator on the security advisory.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void securityAdvisoriesGetRepositoryAdvisoryTest() throws ApiException {
        String owner = null;
        String repo = null;
        String ghsaId = null;
        RepositoryAdvisory response = api.securityAdvisoriesGetRepositoryAdvisory(owner, repo, ghsaId);
        // TODO: test validations
    }

    /**
     * List repository security advisories
     *
     * Lists security advisories in a repository. You must authenticate using an access token with the &#x60;repo&#x60; scope or &#x60;repository_advisories:read&#x60; permission in order to get published security advisories in a private repository, or any unpublished security advisories that you have access to.  You can access unpublished security advisories from a repository if you are a security manager or administrator of that repository, or if you are a collaborator on any security advisory.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void securityAdvisoriesListRepositoryAdvisoriesTest() throws ApiException {
        String owner = null;
        String repo = null;
        String direction = null;
        String sort = null;
        String before = null;
        String after = null;
        Integer perPage = null;
        String state = null;
        List<RepositoryAdvisory> response = api.securityAdvisoriesListRepositoryAdvisories(owner, repo, direction, sort, before, after, perPage, state);
        // TODO: test validations
    }

    /**
     * Update a repository security advisory
     *
     * Update a repository security advisory using its GitHub Security Advisory (GHSA) identifier. You must authenticate using an access token with the &#x60;repo&#x60; scope or &#x60;repository_advisories:write&#x60; permission to use this endpoint.  In order to update any security advisory, you must be a security manager or administrator of that repository, or a collaborator on the repository security advisory.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void securityAdvisoriesUpdateRepositoryAdvisoryTest() throws ApiException {
        String owner = null;
        String repo = null;
        String ghsaId = null;
        RepositoryAdvisoryUpdate repositoryAdvisoryUpdate = null;
        RepositoryAdvisory response = api.securityAdvisoriesUpdateRepositoryAdvisory(owner, repo, ghsaId, repositoryAdvisoryUpdate);
        // TODO: test validations
    }

}
