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
              withCredentials([file(credentialsId: 'application-prod.properties', variable: 'APP_PROD')]) {

                script {
                    if (fileExists ('./Spring-Final-Project/src/main/resources/application-prod.properties')) {
                        sh 'rm ./Spring-Final-Project/src/main/resources/application-prod.properties'
                    }
                }

                sh 'cp "$APP_PROD" ./Spring-Final-Project/src/main/resources/application-prod.properties'
                sh 'docker-compose build'
                sh 'rm ./Spring-Final-Project/src/main/resources/application-prod.properties'
                }
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
