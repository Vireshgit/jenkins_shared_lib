def call(String hubUserName, String imageName, String imageTag){
    sh '''
        trivy image ${hubUserName}/${imageName}:latest > scan.txt
        cat scan.txt
    '''
}
