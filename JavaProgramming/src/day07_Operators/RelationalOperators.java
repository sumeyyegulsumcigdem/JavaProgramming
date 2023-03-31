package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        boolean result1 = 200 > 40; // true

        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150;

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100;

        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500;

        System.out.println("result4 = " + result4);

        //credit score of 720

        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720;

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        System.out.println("---------------------------------");

        int x = 100;
        int y = 200;

        boolean equal = x ==y;

        System.out.println("equal = " + equal);

        boolean result5 = "Muhtar" == "Good Guy";

        System.out.println("result5 = " + result5);

boolean result6 = "A" == "a";

        System.out.println("result6 = " + result6);

boolean result7 = "Java     " == "Java";

        System.out.println("result7 = " + result7);

// space is a character

boolean result8 = 100 != 200;

        System.out.println("result8 = " + result8);

     boolean result9 = "Java" != "Break";

        System.out.println("result9 = " + result9);
        
        
    }

}
