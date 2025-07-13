def call(String projectName, String projectKey , String projectVersion){
  
         withSonarQubeEnv(credentialsId: 'SONARQUBE-TOKEN', installationName: 'sonarqube-server') {
                script{
                
                //  def projectKey = 'reactjs-devops8-template' 
                //     def projectName = 'Reactjs DevOps8 template'  // Replace with your project name
                //     def projectVersion = '1.0.0'  // Replace with your project version
                //             // sh "${scannerHome}/bin/sonar-scanner"
                    sh """
                    ${scannerHome}/bin/sonar-scanner \
                    -Dsonar.projectKey=${projectKey} \
                    -Dsonar.projectName="${projectName}" \
                    -Dsonar.projectVersion=${projectVersion} \
                    -Dsonar.exclusions="pipes/**"
                     """   
                        
                        }
            }
            // dir("pipes")

    
}