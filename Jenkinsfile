pipeline {
    agent any
   
    stages {
        stage('Versiyon'){
            steps{
                shexport MAVEN_HOME=/opt/maven
                sh export PATH=$PATH:$MAVEN_HOME/bin
                sh echo "Maven Integration Version"
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
