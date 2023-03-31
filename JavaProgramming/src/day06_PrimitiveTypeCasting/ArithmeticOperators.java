package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 1); //121, concantenation
        System.out.println(10 + 20); //30, addition
        System.out.println(100 - 50); //50, subtraction
        System.out.println(10 * 6); //60, multiplication

        /*

        /: Division
                 in math:
                    10/4 = 2.5
                    100/3 = 33.333...

                 in java:
                    10/4 = 2   because those are intiger number
                    10.0/4 = 2.5
                    100/3 = 33


                    integer/ integer =====> integer
                    decimal/ integer =====> decimal
                    integer/ decimal =====> decimal
                    decimal/ decimal =====> decimal


         */

        System.out.println(10.0 / 2.5);
        System.out.println(100 / 3);
        System.out.println(10/4);
        System.out.println( (double)10/4); //2
        System.out.println(10/4.0);
        System.out.println(10d/4);
        System.out.println(10/4D);

        int a = 100;
        double b = a/6;

        System.out.println(b);


        double c = (double)a/6;
        System.out.println(c);

        System.out.println(100d);


    }



}
