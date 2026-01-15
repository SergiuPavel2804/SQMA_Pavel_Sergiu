pipeline {
    agent {
        docker {
            image 'maven:3.9.6-eclipse-temurin-17'
        }
    }

    parameters {
        choice(
            name: 'TEST_CLASS',
            choices: [
                'CalculatorAddTest',
                'CalculatorMultiplyTest'
            ],
            description: 'Select which JUnit test class to run'
        )
    }

    stages {
        stage('Run Selected Tests') {
            steps {
                sh "mvn test -Dtest=${params.TEST_CLASS}"
            }
        }
    }
}
