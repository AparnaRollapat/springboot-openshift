pipeline{
  stage('com'){
    def mvnHome = tool name: 'Apache Maven 3.6.0', type: 'maven'
    sh "${mvnHome}/bin/mvn -B -DskipTests clean package"
  }
}
