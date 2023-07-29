def call(String hubUserName, String imageName, String imageTag){
    withCredentials([usernamePassword(
              credentialsId: 'dockerHubID',
              passwordVariable: 'PASS', 
              usernameVariable: 'USER'
    )]) {
      sh "docker login -u $USER -p $PASS"
    }
    sh '''    docker push -t ${hubUserName}/${imageName}:${imageTag}
    docker push -t ${hubUserName}/${imageName}:latest'''
}
