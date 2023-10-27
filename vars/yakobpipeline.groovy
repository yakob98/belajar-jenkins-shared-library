def call(Map config){
    if (config.type == "maven"){
        mavenpipeline()
    }
    else {
        pipeline{
            agent any 
            stages{
                stage("Pipeline Tidak ada"){
                    steps{
                        script{
                            echo("empty")
                        }
                    }
                }
            }
        }
    }
}