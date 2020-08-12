pipeline {
    agent any 
    stages {
        stage('Build') {
            steps {
                echo 'Compile and Build the project'
                 withGradle() {
                    sh './gradlew assemble'
                 }
            }
        }
        stage('Publish') {
            steps {
                echo 'Build the image and publish to docker hub'
                sh './gradlew docker dockerPush'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy the application to kubernetes'
            }
        }
    }
}
