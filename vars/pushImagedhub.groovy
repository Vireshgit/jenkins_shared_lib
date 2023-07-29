def call(String hubUserName, String imageName, String imageTag){
    withCredentials([usernamePassword(
              credentialsId: 'dockerHub_ID',
              passwordVariable: 'PASS', 
              usernameVariable: 'USER'
    )]) {
      sh "docker login -u $USER -p $PASS"
    }
    sh '''    docker push -t ${hubUserName}/${imageName}:${imageTag}
    docker push -t ${hubUserName}/${imageName}:latest'''
}