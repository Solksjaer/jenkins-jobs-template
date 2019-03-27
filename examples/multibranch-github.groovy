multibranchPipelineJob('image-jenkins') {
  branchSources {
    github {
      scanCredentialsId('github')
      repoOwner('CloudiFire')
      repository('image-jenkins')
      buildOriginBranchWithPR(false)
      buildOriginPRMerge(true)
      buildForkPRMerge(true)
    }
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(1)
    }
  }
  triggers {
    cron('@hourly')
  }
} 
