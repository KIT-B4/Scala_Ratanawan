object count_down
{
  def main(args: Array[String])
  {
    println("Input a number: ");
    var num:Int = scala.io.StdIn.readInt();
    while(num >= 0)
    {
      println(num);
      num = num -1;
    }
    println("Happy Birthday!");
  }
}
