multibranchPipelineJob('image-jenkins') {
  branchSources {
    github {
      // must not be empty but unique per branchSource
      id('image-jenkins')
      scanCredentialsId('github')
      repoOwner('syncier')
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
  configure {
    it / 'triggers' << 'com.cloudbees.hudson.plugins.folder.computed.PeriodicFolderTrigger' {
      spec 'H/30 * * * *'
      interval "14400000"
    }
  }
} 
