import util.control.Breaks._

object Array{
    def main(args: Array[String]){
        var a1 = Range(1,10);
        print("a1:");
        for(i <- a1)
        {
            print(s" $i ");
        }
        
        var a2 = Range(1,10,2);
        print("\na2:")
        for(i <- a2){
            print(s" $i ");
        }

        var a3 = Range(0,100);
        print("\na3: ");
        for(i <- a3){
           breakable{
                if(i % 15 == 0){
                    println("Foobar");
                }
                else if(i % 3 == 0){
                    println("Foo");
                }
                else if(i % 5 == 0){
                    println("Bar");
                }
                else{
                    break;
                }
           }
        }
    }
}