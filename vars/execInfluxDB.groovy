

def call() {

    pipeline {
        agent {
            label 'master'
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