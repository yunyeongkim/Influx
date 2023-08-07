

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
                step([$class: 'InfluxDbPublisher',
                      customData: null,
                      customDataMap: null,
                      customPrefix: null,
                      target: 'influx-docker'])
            }
        }
    }
}