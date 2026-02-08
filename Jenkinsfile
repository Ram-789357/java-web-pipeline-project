pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {

        stage('Checkout SCM') {
            steps {
<<<<<<< HEAD
                checkout scm
=======
                git branch: 'main',
                    url: 'https://github.com/Ram-789357/java-web-pipeline-project.git'
>>>>>>> b831cde68635040e464e9154f72eba8dff1f375d
            }
        }

        stage('Build Project') {
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
                bat 'docker build -t java-web-pipeline:1.0 .'
            }
        }

        stage('Run Docker Container') {
            steps {
                bat '''
                docker rm -f java-web-container || exit 0
                docker run -d -p 8085:8080 --name java-web-container java-web-pipeline:1.0
                '''
            }
        }
    }

    post {
        success {
            echo 'Docker container running successfully!'
        }
    }
}
