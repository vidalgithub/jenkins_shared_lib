def call(credentialsId){

    withSonarQubeEnv('sonarqube-9.9') {
         sh 'mvn clean package sonar:sonar'
    }
}
