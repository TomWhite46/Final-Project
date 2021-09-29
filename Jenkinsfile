pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    environment {
        USERNAME=credentials('Dockerhub_user')
        PASSWORD=credentials('Dockerhub_pass')
    }
    stages {
        stage('Build') {
            steps {
                sh "docker-compose build"
            }
        }
        
        
        stage('Push') {
            steps {
                sh 'docker login -u ${USERNAME} -p ${PASSWORD} && docker-compose push' // Single quotaton marks used to allow the variables to be passed correctly
            }
        }
        
        stage('Deploy') {
            steps {
                sh "docker stack deploy --compose-file docker-compose.yaml redshift-stack"
            }
        
        }
    }
}
