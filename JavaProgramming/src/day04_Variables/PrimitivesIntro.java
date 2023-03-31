package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {


        // age: 38 years old (this is the info that you will use 10 times for your source code)
        byte age = 38; // variable is created

        //weight: 168 pounds

        int weight = 168;
        // there is a error because 168 is out of the range of byte

        int num = -129;
        // there is a error because -129 is out of byte' range


        //salary: 100000Ş

        // there is a error because -100000 is out of short' range

        // int is the preferred data type for integer numbers

        long asset = 3_333_333_333L;

        //tax = 0,26

        float tax = 0.26F;

        // #

        char ch1 = '#';

        System.out.println("ch1 = " + ch1);
        
        
        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        System.out.println("gender = " + gender);

        char grade = 'D';
        System.out.println("grade = " + grade);

        char yesNo = 'Y';
        System.out.println("yesNo = " + yesNo);

        char ch4 = 15000;
        System.out.println("ch4 = " + ch4);

        boolean isEmployeed = true;
        boolean isMarried = false;

        boolean result = 100 > 300;
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("result = " + result);


        // String

        //  "Wooden Spoon" It has 11 characters

        String name = "Wooden Spoon";
        System.out.println("name = " + name);

        String city = "McLean";
        String state = "Virginia";
        String country = "USA";

        System.out.println("country = " + country);
        System.out.println("state = " + state);
        System.out.println("city = " + city);



    }


}
