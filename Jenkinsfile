pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                sh './gradlew build'   
            }
        }
        
        stage('Integration test') { 
            when {
                anyOf {
                    branch 'develop';
                    branch 'main'
                }
            }
            steps {
                sh './gradlew test
            }
        }
 
        stage('Deploy') { 
            steps {
                echo 'Deploying'
            }
        }
    }
}
