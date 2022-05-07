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
           post{
           success {
            archiveArtifacts 'target/*.jar';
           }
       }
    }
      }
    
     stage('NEXUS') {
       steps{
           echo "Deploying the project";
           sh 'mvn deploy:deploy-file -DgroupId=**** -DartifactId=**** -Dversion=1.0 -DgeneratePom=true -Dpackaging=jar -DrepositoryId=deploymentRepo -Durl=http://localhost:8081/repository/maven-releases/ -Dfile=target/****-1.0.jar ';
       }
    }
       
   }
}
