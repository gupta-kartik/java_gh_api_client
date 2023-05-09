

# ReposUpdateBranchProtectionRequestRequiredPullRequestReviews

Require at least one approving review on a pull request, before merging. Set to `null` to disable.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dismissalRestrictions** | [**ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions**](ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions.md) |  |  [optional] |
|**dismissStaleReviews** | **Boolean** | Set to &#x60;true&#x60; if you want to automatically dismiss approving reviews when someone pushes a new commit. |  [optional] |
|**requireCodeOwnerReviews** | **Boolean** | Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) review them. |  [optional] |
|**requiredApprovingReviewCount** | **Integer** | Specify the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not require reviewers. |  [optional] |
|**requireLastPushApproval** | **Boolean** | Whether the most recent push must be approved by someone other than the person who pushed it. Default: &#x60;false&#x60;. |  [optional] |
|**bypassPullRequestAllowances** | [**ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances**](ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances.md) |  |  [optional] |



