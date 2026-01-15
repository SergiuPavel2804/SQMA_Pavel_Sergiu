pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {
        stage('Run Add Tests') {
            steps {
                sh "mvn test -Dtest=CalculatorAddTest"
            }
        }

        stage('Run Multiply Tests') {
            steps {
                sh "mvn test -Dtest=CalculatorMultiplyTest"
            }
        }
    }
}
