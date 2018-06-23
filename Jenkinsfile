pipeline {
  agent any
  stages {
    stage('Server') {
      parallel {
        stage('Server') {
          agent {
            docker {
              image 'maven:3.5.4-jdk-8-slim'
            }

          }
          steps {
            sh '''echo "Building the server code..."
mvn -v
mkdir -p target
touch "target/server.war"'''
            stash(name: 'server', includes: '**/*.war')
          }
        }
        stage('Client') {
          agent {
            docker {
              image 'node:6'
            }

          }
          steps {
            sh '''echo "Building the client code..."
npm install --save react
mkdir -p dist
cat > dist/index.html <<EOF
hello!
EOF
touch "dist/client.js"'''
          }
        }
      }
    }
  }
}