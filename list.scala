object list{
  def main(args: Array[String]){
    var fruit = List("Apple", "Banana", "Kiwi", "Orange", "Stawberry");
    println("\n\nThe fruit list: \n" + fruit);
    
    //var fruit = new ListBuffer("Dragon fruit", "Pine apple");
    //fruit = fruit + "Dragon fruit";
    //fruit += ("Pine apple");
    //println("The fruit list after adding: " + fruit);

    /*adding as the first element of the list*/
    var t = "Durian" :: fruit;
    println("\n\nAdding 'Durian' to the first element: \n" + t);

    /*printing everything except the 0 index*/
    var tail = fruit.tail;
    println("\nList without 0 index: \n" +tail);

    var x = fruit.slice(2,5);
    println("\n\nList from element 2 to 5" + x);

    var(l,r) = fruit.splitAt(3);
    println("\n\nSplit at 3rd index:\nThis is L: " + l + "\nThis is R: " + r);

    var first = fruit.head;
    println("\n\nThis is the first index: \n" + first);

    var reverse = fruit.reverse;
    println("\n\nThis is the reverse list: " + reverse);
  }
}


