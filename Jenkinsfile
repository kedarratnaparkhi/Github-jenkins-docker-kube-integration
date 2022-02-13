pipeline{

    tools {
        maven 'Maven'
    }
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
                sh 'mvn clean install'
            }
        }

        stage('Docker Build'){
            steps{
                echo 'inside Docker Build'
                script{
                    dockerImage = docker.build dockerimagename
                }
            }
        }

        stage('Docker Push'){
            environment{
                dockerhubcred = 'docker'
            }
            steps{
                echo 'inside Docker Push'
                script{
                    docker.withRegistry('https://registry.hub.docker.com', dockerhubcred){
                        dockerImage.push("latest")
                    }
                }
            }
        }

        stage('Kubernetes deploy'){
            steps{
                echo 'inside Kubernetes deploy'
                script{
                    kubernetesDeploy(configs: "cicd-deployment.yaml", kubeConfigId: "kubeconfig")
                }
            }
        }
    }
}