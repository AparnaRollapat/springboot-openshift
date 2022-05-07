pipeline {
    agent any
    tools {
       maven 'M3'
    }
    stages {
        stage('Versiyon'){
            steps{
                echo "Maven Integration Version"
                sh "mvn --version"
                echo "Java Version"
                sh "java --version"
            }
        }
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/denizturkmen/SpringBootMysqlCrud.git'
                sh 'mvn clean'
                sh 'mvn compile'
                sh 'mvn package'
            }
        }
    }
}
