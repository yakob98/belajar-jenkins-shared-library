def call(String testing){
    return sh("./mvnw ${testing}")
}