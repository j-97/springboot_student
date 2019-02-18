pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }

        stage('Deploy'){
            steps{
                sh 'pwd'
                sh '''
                    docker build -t springboot1 .
                    docker tag springboot1 jagriti97/springboot1
                    docker login -u jagriti97 -p Jbnk@1997
                    docker push jagriti97/springboot1
                    docker image prune -f
                '''
            }
        }
    }
}