pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'   // Make sure Maven is configured in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Package') {
            steps {
                echo "Building Java project using Maven..."
                sh 'mvn clean package' // On Windows, use bat 'mvn clean package'
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'target/*.jar'  // Archives the JAR created by Maven
        }
    }
}
