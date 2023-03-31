package day16_ForLoopStringPractice;

public class Reverse {

    public static void main(String[] args) {

        //input: Wooden Spoon
        //output: noopS nedooW

        String str = "Wooden Spoon";
        //index:      01234...

        String result = ""; //contain the reversed version of str

      /* result += str.charAt(11); //n
       result += str.charAt(10);
        result += str.charAt(9);
        result += str.charAt(8);
        result += str.charAt(7);
        result += str.charAt(6);
        result += str.charAt(5);
        result += str.charAt(4);
        result += str.charAt(3);
        result += str.charAt(2);
        result += str.charAt(1);
        result += str.charAt(0);


       */

        for (int i = str.length() -1 ; i >= 0 ; i--) { // if we dont' know the initialization we may write i = str.length()-1

            result += str.charAt(i);

        }


        System.out.println(result);




    }
}
