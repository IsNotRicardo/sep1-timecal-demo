pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git 'https://github.com/IsNotRicardo/sep1-timecal-demo.git'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }
  }
}
