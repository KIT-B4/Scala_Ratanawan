object addMatrix{
    def main(args: Array[String]){
        var row = 3;
        var cols = 3;
        var m1 = Array.ofDim[Int](row,cols);
        var i =0;
        var j=0;

        //Matrix 1
        println("\nInput elements for matrix 1: ");
        for(i <- 0 until (m1.length-1)){
            for(j <- 0 until (m1.length-1)){
                println(s"Element ($i)($j): " );
                m1(i)(j) = scala.io.StdIn.readInt();
            }
        }
        for(i <- 0 until (m1.length-1)){
            for(j <- 0 until (m1.length-1)){
                print(s"${m1(i)(j)} \t");
            }
            printf("\n");
        }

        var m2 = Array.ofDim[Int](row,cols);
        //Matrix 2
        println("\nInput elements for matrix 2: ");
        for(i <- 0 until (m2.length-1)){
            for(j <- 0 until (m2.length-1)){
                println(s"Element ($i)($j): " );
                m2(i)(j) = scala.io.StdIn.readInt();
            }
        }
        for(i <- 0 until (m2.length-1)){
            for(j <- 0 until (m2.length-1)){
                print(s"${m2(i)(j)}");
            }
            printf("\n");
        }

        //Adding matrixes
        var sum = Array.ofDim[Int](row,cols);
        for(i <- 0 until (sum.length-1)){
            for(j <- 0 until (sum.length-1)){
                sum(i)(j) = m1(i)(j) + m2(i)(j);
            }
        }
        println("The sum of matrix is: ");
        for(i <- 0 until (sum.length-1)){
            for(j <- 0 until (sum.length-1)){
                print(s"${sum(i)(j)}\t");
            }
            println("\n");
        }
    }
}