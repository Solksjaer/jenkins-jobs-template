multibranchPipelineJob('image-jenkins') {
  branchSources {
    github {
      scanCredentialsId('github')
      repoOwner('CloudiFire')
      repository('image-jenkins')
    }
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(1)
    }
  }
  triggers {
    periodic(5)
  }
} 
