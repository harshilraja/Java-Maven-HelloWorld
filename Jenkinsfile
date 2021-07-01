pipeline {
    agent any
    stages {
      

        stage('Maven Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        
        stage('Docker Build') {
            steps {
                sh 'docker build . -t inrajasiva/mavenhelloworld:0.0.1'
            }
        }
        
        stage('Docker Push') {
            steps {
                withCredentials([string(credentialsId: 'docker_hub', variable: 'dockerHubPwd')]) {
                    sh 'docker login -u inrajasiva -p ${dockerHubPwd}'
                }
                sh 'docker push inrajasiva/mavenhelloworld:0.0.1'
            }
        }
    }
}

