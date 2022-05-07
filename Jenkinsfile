pipeline {
    agent any
    tools { 
      maven 'Maven'
    }
    stages {
      stage ('Build') {
        steps {
            sh "mvn compile"
            sh "mvn package"
            //sh "mvn test"
            sh "mvn clean install"
        }
      }
       stage ('Deploy') {
        steps {
             sh "chmod +x mvnw"
             sh './mvnw spring-boot:run -Dserver.port=8989'
      }
    }
   }
}
