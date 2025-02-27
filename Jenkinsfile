pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git branch: 'main',
            url: 'https://github.com/IsNotRicardo/sep1-timecal-demo.git'
      }
    }
    stage('Build') {
      steps {
        bat 'mvn clean install'
      }
    }
  }
}
