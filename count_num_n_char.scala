object counting
{
    def main(args: Array[String])
    {
        var str = readLine("Input your string: ");
        println("Your String is: " + str);
        var vowel:Int = 0;
        var cons:Int = 0;

        var i:Int = 0;
        for(i <- 0 until str.length)
        {
            if((str(i) == 'a') || (str(i) == 'e') || (str(i) == 'i') || (str(i) == 'o') || (str(i) == 'u') || (str(i) == 'A') || (str(i) == 'E') || (str(i) == 'I') || (str(i) == 'O' || (str(i) == 'U')))
            {
                vowel = vowel + 1;
            }
            else
            {
                cons = cons + 1;
            }
        }

        println("There are " + vowel + " vowel(s) in the string.");
        println("There are " + cons + " consonant(s) in the string.")
    }
}