pipeline {
    agent any
    tools { 
      maven 'maven'
    }
    stages {
      stage ('Build') {
        steps {
            sh "mvn compile dependency:resolve"
            sh "mvn dependency:resolve-plugins"
            sh "mvn clean package"
        }
           post{
           success {
            archiveArtifacts 'target/*.jar';
           }
       }
    }
      
    
     stage('NEXUS') {
       steps{
           echo "Deploying the project";
           sh 'nohup java -jar target/*.jar >> app.log &'
           //sh 'mvn deploy:deploy-file -DgroupId=com.example -DartifactId=springboot-openshift-v1demo -Dversion=1.0 -DgeneratePom=true -Dpackaging=jar -DrepositoryId=deploymentRepo -Durl=http://localhost:8081/repository/maven-releases/ -Dfile=target/springboot-openshift-v1demo-1.0.jar ';
       }
    }
       
   }
}
