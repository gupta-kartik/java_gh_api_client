

# WebhookStatusCommitCommitVerification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payload** | **String** |  |  |
|**reason** | [**ReasonEnum**](#ReasonEnum) |  |  |
|**signature** | **String** |  |  |
|**verified** | **Boolean** |  |  |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| EXPIRED_KEY | &quot;expired_key&quot; |
| NOT_SIGNING_KEY | &quot;not_signing_key&quot; |
| GPGVERIFY_ERROR | &quot;gpgverify_error&quot; |
| GPGVERIFY_UNAVAILABLE | &quot;gpgverify_unavailable&quot; |
| UNSIGNED | &quot;unsigned&quot; |
| UNKNOWN_SIGNATURE_TYPE | &quot;unknown_signature_type&quot; |
| NO_USER | &quot;no_user&quot; |
| UNVERIFIED_EMAIL | &quot;unverified_email&quot; |
| BAD_EMAIL | &quot;bad_email&quot; |
| UNKNOWN_KEY | &quot;unknown_key&quot; |
| MALFORMED_SIGNATURE | &quot;malformed_signature&quot; |
| INVALID | &quot;invalid&quot; |
| VALID | &quot;valid&quot; |
| BAD_CERT | &quot;bad_cert&quot; |
| OCSP_PENDING | &quot;ocsp_pending&quot; |



