object BiggestNum
{
    def main(args: Array[String])
    {
        println("Input first number: ");
        var num1:Int = scala.io.StdIn.readInt();
        println("Input second number: ");
        var num2:Int = scala.io.StdIn.readInt();
        println("Input third number: ");
        var num3:Int = scala.io.StdIn.readInt();

        println("Your Input order is: " + num1 + " , " + num2 + " , " + num3);

        if((num1 > num2) && (num1 > num3))
        {
            println(num1 + " is the biggest.");
            if(num2 > num3)
            {
                println("The ascending order is: " + num1 + " , " + num2 + " , " + num3);
            }
            else
            {
                println("The ascending order is: " + num1 + " , " + num3 + " , " + num2);
            }
        }
        if((num2 > num1) && (num2 > num3))
        {
            println(num2 + " is the biggest.");
            if(num1 > num3)
            {
                println("The ascending order is: " + num2 + " , " + num1 + " , " + num3);
            }
            else
            {
                println("The ascending order is: " + num2 + " , " + num3 + " , " + num1);
            }
        }
        if((num3 > num1) && (num3 > num2))
        {
            println(num3 + " is the biggest.");
            if(num1 > num2)
            {
                println("The ascending order is: " + num3 + " , " + num1 + " , " + num2);
            }
            else
            {
                println("The ascending order is: " + num3 + " , " + num2 + " , " + num1);
            }
        }
    }
}