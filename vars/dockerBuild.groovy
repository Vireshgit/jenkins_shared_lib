def call(string userName, string imageName, string imageTag){
    sh '''
    docker build -t ${userName}/${imageName} .
    docker tag ${userName}/${imageName} ${userName}/${imageName}:${imageTag}
    docker tag ${userName}/${imageName} ${userName}/${imageName}:latest
    '''
}
