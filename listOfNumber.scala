object listOfNumber{
  def main(args: Array[String]){
    var i:Int=0;
    var j:Int=0;
    var list1 = List(25,17,12);
    var list2 = List(44,2,6,77);

    println("list1 : " + list1);
    
    println("list2 : " + list2);

    /*concatinate list1 and list2*/
    var list = list1 ++ list2;
    println("Concatinate list1 and list2: " + list);

   /*Reverse the concatinate*/
    var reverse = list.reverse;
    println("Reverse the concatinate: " + reverse);

    /*print odd value of the reverse*/
    println("Odd number of the reverse: ");
    for( n <- 0 until list.length){
      if((reverse(n)) % 2 != 0){
        println(reverse(n));
      }
    }

    /*Make a list of lists*/
    var list3 = List(34, 23, 21, 81);
    var BigList = List(list1,list2, list3);
    println("The BigList is: " + BigList);

    /*convert list1 to a string*/
    println("Converting list1 to string: ");
    println("\nlist1: " + list1);
    var str1 = list1.toString;
    println("list1 in string: " + str1);

    /*Print all the elements of list3 except the last one*/
    println("list3: " + list3);
    var noLast = list3.init;
    println("All element except the last one: " + noLast);
  }
}

