pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'MAVEN3'
    }

    stages {

        stage('Clone from GitHub') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Ram-789357/java-web-pipeline-project.git'
            }
        }

        stage('Build Project') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Run Selenium Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Create JAR Artifact') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'target/*.jar'
            echo 'Pipeline completed successfully'
        }
    }
}
