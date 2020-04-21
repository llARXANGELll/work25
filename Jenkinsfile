pipeline {
    agent any
    stages {
        stage('Git') {
            steps {
                git 'https://github.com/llARXANGELll/work25.git'
            }
        }
        stage('Test') {
            steps {
                bat label: '', script: 'mvn clean test'
            }
        }
    }
    post {
        always {
             allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
        }
    }
}