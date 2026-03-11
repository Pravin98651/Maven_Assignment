pipeline {

    agent any

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/username/maven-assignment.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn clean install'
            }
        }

    }
}
