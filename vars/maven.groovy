// def call(testing){
//   sh("./mvnw ${testing}")
// }

// def call(String commands){
//     for(command in commands){
//      sh("./mvnw ${command}")        
//     }
// }

def call(List commands){
    for(command in commands){
     sh("./mvnw ${command}")        
    }
}