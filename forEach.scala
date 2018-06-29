object forEach{
    def main(args: Array[String]){
        var name = List[String]("Alexa", "Aloha", "Adam", "Bob", "Brandie", "Chile");

        name.foreach(c => (if((c.length) == 4) println("Yes") else println("No"))) ;
    }
}