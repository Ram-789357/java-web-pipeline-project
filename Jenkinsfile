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

                git branch: 'main',
                    url: 'https://github.com/Ram-789357/java-web-pipeline-project.git'
=======
                checkout scm
>>>>>>> b00a3d649fc0999c92a3240a2be23f53147f5d8f
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
