pipeline {
    agent any

    tools {
        jdk 'JDK17'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo "Simple Java project – build skipped"
            }
        }

        stage('Create JAR') {
            steps {
                bat '''
                mkdir artifact
                echo Hello Jenkins > artifact/app.txt
                '''
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'artifact/**'
        }
    }
}
