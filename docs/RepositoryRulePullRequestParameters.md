

# RepositoryRulePullRequestParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dismissStaleReviewsOnPush** | **Boolean** | New, reviewable commits pushed will dismiss previous pull request review approvals. |  |
|**requireCodeOwnerReview** | **Boolean** | Require an approving review in pull requests that modify files that have a designated code owner. |  |
|**requireLastPushApproval** | **Boolean** | Whether the most recent reviewable push must be approved by someone other than the person who pushed it. |  |
|**requiredApprovingReviewCount** | **Integer** | The number of approving reviews that are required before a pull request can be merged. |  |
|**requiredReviewThreadResolution** | **Boolean** | All conversations on code must be resolved before a pull request can be merged. |  |



