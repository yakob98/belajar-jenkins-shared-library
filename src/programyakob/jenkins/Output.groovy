package programyakob.jenkins;

class Output{
    static def hello(steps, String name){
        // echo("Hello ${name}")
        // println("Hello ${name}")
        steps.echo("Hello ${name}")
    }
}