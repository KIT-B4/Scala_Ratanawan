object array{
    def main(args: Array[String]){
        var array = new Array[Int](5);
        println("Input elements of array: ");
        for(i <- 0 until array.length){
            println(s"Element $i: ");
            array(i) = scala.io.StdIn.readInt();
        }
        //printing all elements in the array
        println("The array is: ");
        for(i <- 0 until array.length){
            print(s" ${array(i)}");
        }
    
        //sum all elements in array together
        var sum:Int = 0;
        for(i <- 0 until array.length){
            sum = sum + array(i);
        }
        println("\nThe sum of all elements in array is: " + sum);

        //find maximum and minimum value in array
        var min:Int = Int.MaxValue;
        var max:Int = Int.MinValue;
        for(x <- array){
            if(x < min) min = x;
            if(x > max) max = x; 
        }
        println(s"Max value is: $max");
        println(s"Min value is: $min");

        var array2 = new Array[Int](3);
        println("Input element for 2nd array: ");
        for(i <- 0 until array2.length){
            println(s"Element $i: ");
            array2(i) = scala.io.StdIn.readInt();
        }
        // var concate = array ++ array2; (another way to concate arrays)
        var concate = Array.concat(array, array2);
        println("The concatenated arrays is: ");
        for(i <- 0 until concate.length){
            print(s" ${concate(i)}");
        }
    }
}