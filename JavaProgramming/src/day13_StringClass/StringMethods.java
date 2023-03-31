package day13_StringClass;

public class StringMethods {

    public static void main(String[] args) {


        String word = "Cydeo";
        // index:      01234

        char thirdChar = word.charAt(3);

        System.out.println("thirdChar = " + thirdChar);

        /*

    char tenthChar = word.charAt(9);

        System.out.println("tenthChar = " + tenthChar);

       */

        System.out.println("--------------------------------");

       String s1 = "Batch 25 is the best batch";

       int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(s1.length()-1);
      // ya da          s1.charAt(totalChars - 1)  ;
        System.out.println("lastChar = " + lastChar);

        System.out.println("------------------------------");

        String str = "wooden spoon"; // first object is "wooden spoon"
        str.toUpperCase(); //   "WOODEN SPOON" , second object is toUpperCase()
                           // String is immutable, so it creates a new String

        System.out.println("str = " + str);
        
        // it is still wooden spoon
        // how many data can a one variable contains? just one
        // I stored the data in str last time in line 37
        
        str = str.toUpperCase();

        System.out.println(str);

        // If you want the same variable to reference
        // to new object that is created after calling toUpperCase
        //method, you MUST ASSİGN IT BACK
        // If you dont, it still gives the old value, old string object


        String sentence = "Today is a great day to learn Java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println(sentence);




    }


}
