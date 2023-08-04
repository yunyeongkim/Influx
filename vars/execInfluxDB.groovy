

def call() {

    pipeline {
        agent {
            label any
        }

        stages {
            stage("test") {
                steps {
                    script {

                        echo "Starts"
                    }
                }
            }
        }
    }
}