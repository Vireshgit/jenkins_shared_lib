def call(String hubUserName, String imageName, String imageTag){
    sh '''
    docker rmi ${hubUserName}/${imageName}:${imageTag} 
    docker rmi ${hubUserName}/${imageName}:latest 
    '''
}
