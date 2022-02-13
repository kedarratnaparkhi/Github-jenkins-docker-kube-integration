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
            echo 'inside Code Build'
        }

        stage('Docker Build'){
            echo 'inside Docker Build'
        }

        stage('Docker Push'){
            echo 'inside Docker Push'
        }

        stage('Kubernetes deploy'){
            echo 'inside Kubernetes deploy'
        }
    }
}