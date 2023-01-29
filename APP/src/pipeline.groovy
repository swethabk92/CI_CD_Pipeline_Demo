pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'docker build -t my_image:v1.0 .'
            }
        }
        stage('Push to registry') {
            steps {
                sh 'docker login -u myuser -p mypassword docker.io'
                sh 'docker push my_image:v1.0'
            }
        }
        stage('Deploy') {
            steps {
                sh 'kubectl apply -f deployment.yaml'
            }
        }
    }
# to poll the Git repository every 5 minutes.
    triggers {
        pollSCM('H/5 * * * *')
    }
}
