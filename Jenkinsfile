pipeline {
    agent any

    tools {
        maven 'Maven3'
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
        stage('Run Selected Test') {
            steps {
                sh "mvn test -Dtest=${params.TEST_CLASS}"
            }
        }
    }
}
