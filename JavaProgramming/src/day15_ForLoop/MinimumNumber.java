package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        int min = 2147483647;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            int num = scan.nextInt();
           if(num<min){
               min = num;
           }

        }

        System.out.println("min = " + min);

    }
}
/*
Write a program that asks the user to enter a number for 5 times.
It returns the maximum number
 */