import scala.io;
  
 object MyFactorial
  {
    //factorial function
    def factorial(a:Int): Int=
    {   
        if( a == 0)
        1; 
        else
        a*factorial(a-1);
    }

    //main funciton
    def main(args: Array[String])
    {
      println("Enter a number to find factorial: ");
      var num = scala.io.StdIn.readInt();
      var f = factorial(num);
      println("The factorial of " + num + " is " + f);
    //   println(factorial(num));
    }
  }
