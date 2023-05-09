

# WebhookSponsorshipPendingTierChange


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) |  |  |
|**changes** | [**WebhookSponsorshipPendingTierChangeChanges**](WebhookSponsorshipPendingTierChangeChanges.md) |  |  |
|**effectiveDate** | **String** | The &#x60;pending_cancellation&#x60; and &#x60;pending_tier_change&#x60; event types will include the date the cancellation or tier change will take effect. |  [optional] |
|**enterprise** | [**Enterprise**](Enterprise.md) |  |  [optional] |
|**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional] |
|**organization** | [**OrganizationSimple**](OrganizationSimple.md) |  |  [optional] |
|**repository** | [**Repository**](Repository.md) |  |  [optional] |
|**sender** | [**SimpleUser**](SimpleUser.md) |  |  |
|**sponsorship** | [**WebhookSponsorshipCancelledSponsorship**](WebhookSponsorshipCancelledSponsorship.md) |  |  |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| PENDING_TIER_CHANGE | &quot;pending_tier_change&quot; |



