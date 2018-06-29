object loop_year
{
  def main(args: Array[String])
  {
      println("Input your age: ");
      var year:Int = scala.io.StdIn.readInt();
      for( num <- 0 to year)
      {
        if(num % 4 != 0)
        {
          println(num);
        }
      }
  }
}

