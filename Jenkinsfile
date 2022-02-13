pipeline{

    agent any
    environment{
        dockerimagename = "wallpapers123/cicddemo"
        dockerImage = ""
    }

    stages{
        stage('Git Checkout'){
            steps{
                git branch: 'main', credentialsId: 'githubCred', url: 'https://github.com/kedarratnaparkhi/Github-jenkins-docker-kube-integration.git'
            }
        }

        stage('Code Build'){
            steps{
                echo 'inside Code Build'
            }
        }

        stage('Docker Build'){
            steps{
                echo 'inside Docker Build'
            }
        }

        stage('Docker Push'){
            steps{
                echo 'inside Docker Push'
            }
        }

        stage('Kubernetes deploy'){
            steps{
                echo 'inside Kubernetes deploy'
            }
        }
    }
}