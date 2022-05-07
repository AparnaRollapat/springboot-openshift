pipeline {
    agent any
    tools { 
      maven 'Maven'
    }
    stages {
      stage ('Build') {
        steps {
          sh 'mvn -B -ntp -Dmaven.test.failure.ignore verify'
        }
      }

    }
}
