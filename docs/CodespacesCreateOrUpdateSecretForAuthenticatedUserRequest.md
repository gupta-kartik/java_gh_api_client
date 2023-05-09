

# CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**encryptedValue** | **String** | Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get the public key for the authenticated user](https://docs.github.com/rest/reference/codespaces#get-the-public-key-for-the-authenticated-user) endpoint. |  [optional] |
|**keyId** | **String** | ID of the key you used to encrypt the secret. |  |
|**selectedRepositoryIds** | [**List&lt;CodespacesCreateOrUpdateSecretForAuthenticatedUserRequestSelectedRepositoryIdsInner&gt;**](CodespacesCreateOrUpdateSecretForAuthenticatedUserRequestSelectedRepositoryIdsInner.md) | An array of repository ids that can access the user secret. You can manage the list of selected repositories using the [List selected repositories for a user secret](https://docs.github.com/rest/reference/codespaces#list-selected-repositories-for-a-user-secret), [Set selected repositories for a user secret](https://docs.github.com/rest/reference/codespaces#set-selected-repositories-for-a-user-secret), and [Remove a selected repository from a user secret](https://docs.github.com/rest/reference/codespaces#remove-a-selected-repository-from-a-user-secret) endpoints. |  [optional] |



