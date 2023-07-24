def call(CredentialsId){
waitForQualityGate abortPipeline: false, credentialsId: CredentialsId
}
