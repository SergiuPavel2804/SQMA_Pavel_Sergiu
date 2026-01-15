pipeline {
    agent any

    parameters {
        choice(
            name: 'TEST_CLASS',
            choices: [
                'CalculatorAddTest',
                'CalculatorMultiplyTest'
            ],
            description: 'Select which test class to run'
        )
    }

    stages {
        stage('Build & Test in Docker') {
            steps {
                script {
                    docker.build("sqma-tests")
                    docker.image("sqma-tests").inside {
                        sh "mvn test -Dtest=${params.TEST_CLASS}"
                    }
                }
            }
        }
    }
}
