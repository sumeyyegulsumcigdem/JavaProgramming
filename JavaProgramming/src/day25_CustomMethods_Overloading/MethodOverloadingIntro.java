package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

        int[] intArray = {5,6,0,-1,3,4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 11.5, 5.5,4.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'E', 'F', 'B', 'C', 'A'};
        Arrays.sort(charArray);

        System.out.println("-----------------------------");

        int sum1 = sumOfNumbers(32,45);

        int sum2 = sumOfNumbers(12,56,34);

        double sum3 = sumOfNumbers(2.3, 42.1);

        int sum4 = sumOfNumbers(12,34,23,545);

        double sum5 = sumOfNumbers(67.3, 64.1, 5.5,3.4);






    }

    public static int sumOfNumbers(int num1, int num2){
        return num1+ num2;
    }

    public static double sumOfNumbers(double num1, double num2){
        return num1 + num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1+ num2 + num3 ;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4){
        return num1+ num2 + num3 + num4;
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4){
        return num1 + num2+ num3 + num4;
    }










}
