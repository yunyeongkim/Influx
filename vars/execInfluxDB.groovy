

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
        }

        post {
            always{
                influxDbPublisher(selectedTarget:'Influx-docker')
            }
        }
    }
}