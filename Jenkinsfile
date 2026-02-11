pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'MAVEN3'
    }

    stages {

        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }

        stage('Build with Maven') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Run Selenium Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t education-app .'
            }
        }

        stage('Remove Old Container') {
            steps {
                bat 'docker rm -f education-container || exit 0'
            }
        }

        stage('Run Docker Container') {
            steps {
                bat 'docker run -d -p 8088:80 --name education-container education-app'
            }
        }
    }

    post {
        success {
            echo 'Application Successfully Deployed!'
        }
    }
}
