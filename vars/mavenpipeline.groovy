def call(){
    pipeline{
    agent any

    options { buildDiscarder(logRotator(numToKeepStr: '5')) }

    stages{

        stage("Maven Build"){
            steps{
                script{
                    maven(["clean"])
                }
            }
        }

        stage("Maven Compile"){
            steps{
                script{
                    maven(["compile"])
                }
            }
        }

        stage("Library Resource"){
            steps{
                script{
                    def config = libraryResource("config/build.json")
                    echo(config)
                }
            }
        }


    }
}

}