

# PendingDeployment

Details of a deployment that is waiting for protection rules to pass

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**environment** | [**PendingDeploymentEnvironment**](PendingDeploymentEnvironment.md) |  |  |
|**waitTimer** | **Integer** | The set duration of the wait timer |  |
|**waitTimerStartedAt** | **OffsetDateTime** | The time that the wait timer began. |  |
|**currentUserCanApprove** | **Boolean** | Whether the currently authenticated user can approve the deployment |  |
|**reviewers** | [**List&lt;PendingDeploymentReviewersInner&gt;**](PendingDeploymentReviewersInner.md) | The people or teams that may approve jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed. |  |



