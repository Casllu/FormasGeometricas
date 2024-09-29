pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
       stage('Build Docker Image') {
                steps {
                    script {
                        docker.build('usuario/formasgeometricas:latest')
                    }
                }
            }
            stage('Push Docker Image') {
                steps {
                    script {
                        docker.withRegistry('https://index.docker.io/v1/', 'dockerhub-credentials') {
                            docker.image('usuario/formasgeometricas:latest').push()
                        }
                    }
                }
            }
            stage('Deploy') {
                steps {
                    script {
                        // Comando para fazer o deploy da aplicação em um ambiente de teste
                        sh 'docker run -d -p 8080:8080 usuario/formasgeometricas:latest'
                    }
                }
            }
    }

    post {
            always {
                junit 'target/surefire-reports/*.xml'
            }
        }
}
