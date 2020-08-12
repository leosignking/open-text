pipeline {
    agent any 
    stages {
        stage('Build') {
            steps {
                echo 'Compile and Build the project'
                 withGradle() {
                    sh 'gradle -v'
                 }
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
