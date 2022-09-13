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
        }
        stage('Deploy') { 
            when {
                branch 'main'
            }
            steps {
                echo 'Deploying'
            }      
        }
    }
}
