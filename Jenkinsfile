pipeline {
    options {
        buildDiscarder(logRotator(numToKeepStr: '35'))
        disableConcurrentBuilds()
        timestamps()
        ansiColor('xterm')
    }
    agent any
    stages {
        stage('configure jobs') {
            steps {
                jobDsl ignoreMissingFiles: true, failOnMissingPlugin: true, removedConfigFilesAction: 'DELETE', removedJobAction: 'DELETE', removedViewAction: 'DELETE', targets: 'jobs/**/*.groovy', unstableOnDeprecation: true
            }
        }
    }
}
