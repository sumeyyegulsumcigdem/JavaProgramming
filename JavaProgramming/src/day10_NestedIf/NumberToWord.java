package day10_NestedIf;

public class NumberToWord {

    public static void main(String[] args) {

        int number = 12;

        String result2 = (number >=1 && number <=9)? (number ==1)? "One" : (number==2)? "Two" : (number==3)? "Three" : (number== 4)? "Four": (number==5)? "Five": (number==6)? "Six" : (number==7)? "Seven" : (number==8)? "Eight": "Nine"
                : "Invalid Number";

        System.out.println(result2);









    }
}
