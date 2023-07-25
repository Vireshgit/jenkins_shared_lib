def call(String hubUserName, String imageName, String imageTag){
    sh '''
    docker build -t ${hubUserName}/${imageName} .
    docker tag ${hubUserName}/${imageName} ${hubUserName}/${imageName}:${imageTag}
    docker tag ${hubUserName}/${imageName} ${hubUserName}/${imageName}:latest
    '''
}
