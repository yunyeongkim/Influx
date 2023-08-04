

def call() {

    pipeline {
        agent any

        stages {
            stage("test") {
                steps {
                    script {

                        echo "Starts"
                    }
                }
            }
            stage("test12") {
                steps {
                    script {

                        echo "Starts"
                    }
                }
            }
        }
    }
}