node{
   stage('SCM Checkout'){
     git 'https://github.com/devoxx123/springboot.git'
   }
   
   stage('Compile-Package'){
     def mvnHome = tool name: 'Maven', type: 'maven'
     bat "${mvnHome}/bin/mvn package"
   }
  stage('Artifact'){
    archiveArtifacts 'target/*.war'
   }
  stage ('Tomcat Deploy'){
   echo 'deployment started'
       bat '''copy C:\\Users\\SCIIT\\.jenkins\\workspace\\jenkins-git-maven\\target\\spring.war C:\\Users\\SCIIT\\Downloads\\JenkinsTomcat\\apache-tomcat-9.0.22\\webapps\\'''
   }
   
}
