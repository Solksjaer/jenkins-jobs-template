multibranchPipelineJob('image-jenkins') {
  branchSources {
    git {
      // must not be empty but unique per branchSource
      id('image-jenkins')
      remote('https://gitlab.com/syncier/image-jenkins.git')
      credentialsId('gitlab')
    }
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(1)
    }
  }
}
