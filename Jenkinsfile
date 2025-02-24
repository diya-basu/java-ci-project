pipeline {
    agent any

    environment {
        JAVA_HOME = "/Library/Java/JavaVirtualMachines/openjdk.jdk/Contents/Home"
    }

    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/your-username/java-ci-project.git'
            }
        }

        stage('Compile Java Program') {
            steps {
                sh 'javac TimestampPrinter.java'
            }
        }

        stage('Run Java Program') {
            steps {
                sh 'java TimestampPrinter'
            }
        }
    }

    post {
        success {
            echo 'Build Success! Timestamp printed.'
        }
        failure {
            echo 'Build Failed. Check the logs.'
        }
    }
}


