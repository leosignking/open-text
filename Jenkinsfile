pipeline {
    agent any 
    stages {
        stage('Build') {
            steps {
                echo 'Compile and Build the project'
                 withGradle() {
                    sh './gradlew -v'
                 }
            }
        }
        stage('Publish') {
            steps {
                echo 'Build the image'
                sh './gradlew docker'
            }
            steps {
                echo 'Push the image to docker hub'
                sh './gradlew dockerPush'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy the application to kubernetes'
            }
        }
    }
}
