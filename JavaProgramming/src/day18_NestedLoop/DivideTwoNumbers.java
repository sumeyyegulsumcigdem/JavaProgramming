package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        //Write a program that can divide two positive numbers without
        // using / and * and % operator

        int a = 30;
        int b = 7;

        int count = 0;

        while (a >= b) {

            a -= b;
            count++;

        }

        System.out.println(count + " with a reminder of " + a);


    }
}
