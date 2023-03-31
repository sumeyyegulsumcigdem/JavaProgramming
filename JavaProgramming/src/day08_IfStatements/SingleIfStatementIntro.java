package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 300;

        boolean evenNumber = number%2 == 0;
        boolean oddNumber = ! evenNumber; // notevenNumber

        if(evenNumber){

            System.out.println(number + " is even number ");
// if the number is 301, it is not gonna work
        }

        if(oddNumber){

            System.out.println(number + " is odd number ");

        }


        int number2 = 101;

        boolean evenNumber2 = number%2 == 0;
        boolean oddNumber2 = ! evenNumber2; // notevenNumber

        if(evenNumber2){

            System.out.println(number2 + " is even number ");
// if the number is 301, it is not gonna work
        }

        if(oddNumber2){

            System.out.println(number2 + " is odd number ");

        }


        System.out.println("--------------------------------");

            int n = 200;

            //positive
            //negative
            //zero

        if (n>0) {

            System.out.println(n + " is positive ");

        }

          if (n < 0) {


              System.out.println(n +   "is negative");
          }

          if ( n == 0){


              System.out.println(n + "is zero ");
          }


    }


}
