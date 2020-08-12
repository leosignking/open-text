pipeline {
    agent any 
    stages {
        stage('Build') {
            steps {
                echo 'Compile and Build the project'
                 sh 'gradle build'
            }
        }
        stage('Publish') {
            steps {
                echo 'Publish the image to docker hub'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy the application to kubernetes'
            }
        }
    }
}
