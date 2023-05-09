

# GpgKey

A unique encryption key

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**name** | **String** |  |  [optional] |
|**primaryKeyId** | **Integer** |  |  |
|**keyId** | **String** |  |  |
|**publicKey** | **String** |  |  |
|**emails** | [**List&lt;GpgKeyEmailsInner&gt;**](GpgKeyEmailsInner.md) |  |  |
|**subkeys** | [**List&lt;GpgKeySubkeysInner&gt;**](GpgKeySubkeysInner.md) |  |  |
|**canSign** | **Boolean** |  |  |
|**canEncryptComms** | **Boolean** |  |  |
|**canEncryptStorage** | **Boolean** |  |  |
|**canCertify** | **Boolean** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**expiresAt** | **OffsetDateTime** |  |  |
|**revoked** | **Boolean** |  |  |
|**rawKey** | **String** |  |  |



