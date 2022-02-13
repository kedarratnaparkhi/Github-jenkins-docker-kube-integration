pipeline{

    agent any
    environment{
        dockerimagename = "wallpapers123/cicddemo"
        dockerImage = ""
    }

    stages{
        stage('Git Checkout'){
            git branch: 'main', credentialsId: 'githubCred', url: 'https://github.com/kedarratnaparkhi/Github-jenkins-docker-kube-integration.git'
        }

        stage('Code Build'){

        }

        stage('Docker Build'){

        }

        stage('Docker Push'){

        }

        stage('Kubernetes deploy'){

        }
    }
}