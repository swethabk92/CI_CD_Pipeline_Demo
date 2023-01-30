pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'docker build -t app:v1.0 .'
            }
        }
        stage('Push to registry') {
            steps {
                sh 'docker login -u myuser -p mypassword docker.io'
                sh 'docker push app:v1.0'
            }
        }
        stage('Deploy') {
            steps {
                sh 'kubectl apply -f app.yaml'
            }
        }
    }
# to poll the Git repository every 5 minutes.
    triggers {
        pollSCM('H/5 * * * *')
    }
}
