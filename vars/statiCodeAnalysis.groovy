def call(credentialsId){

    withSonarQubeEnv(SonarQubeServer) {
         sh 'mvn clean package sonar:sonar'
    }
}
