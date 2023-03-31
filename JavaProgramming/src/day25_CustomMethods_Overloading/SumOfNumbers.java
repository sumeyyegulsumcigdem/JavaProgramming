package day25_CustomMethods_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {

       int sum =  sumOf2Numbers(10,20);

        System.out.println("sum = " + sum);
        
        int sum3 = sumOf3Numbers(12,43,37);

        System.out.println("sum3 = " + sum3);

        int sum4 = sumOf4Numbers(23,13,534,35);

        System.out.println("sum4 = " + sum4);


    }



    public static int sumOf2Numbers(int num1, int num2){
        return num1 + num2;
    }


    public static int sumOf3Numbers(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }










}

// 1. create a method that can find the sum of two numbers
// sumOf2Numbers

// 2. create a method that can find the sum of three numbers
// sumOf3Numbers

//3.create a method that can find the sum of four numbers
// sumOf4Numbers