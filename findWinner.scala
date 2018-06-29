object findWinner
{
    def main(args: Array[String])
    {
        // println("Input 4 subjects' marks for Alice: ");
        // for(i <- 0 until 3)
        // {
        //     println(i);
        //     var Alice(i) = scala.io.StdIn.readInt();
        // }

        // println("Input 4 subjects' marks for Bob: ");
        // for(j <- 0 until 3)
        // {
        //     var Bob(i) = scala.io.StdIn.readInt();
        // }

        // println("Alice marks are: " + Alice);
        // println("Bob marks are: " + Bob);

        var Alice = Array(5,6,20,35);
        var Bob = Array(10,6,15,44);
        var result:String = "" ;

        if(Alice(0) > Bob(0) || Bob(0) > Alice(0))
        {
            result = result + '1' + ' ';
        }
        if(Alice(1) > Bob(1) || Bob(1) > Alice(1))
        {
            result = result + '1' + ' ';
        }
        if(Alice(2) > Bob(2) || Bob(2) > Alice(2))
        {
            result = result + '1' + ' ';
        }
        if(Alice(3) > Bob(3) || Bob(3) > Alice(3))
        {
            result = result + '1' + ' ';
        }

        println("The result is: " + result);
    }
}