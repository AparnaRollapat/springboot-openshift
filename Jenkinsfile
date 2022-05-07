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
             sh chmod +r /home/tes/pom.xml
             sh 'sh 'nohup ./mvnw spring-boot:run -Dserver.port=8989 &'
    
       }
      }
    }
}
