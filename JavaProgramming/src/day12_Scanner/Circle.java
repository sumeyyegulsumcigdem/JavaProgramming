package day12_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of Circle");

        double num = input.nextDouble();

        input.close();

       double area = num*3.14*num;

       double perimeter = 2*3.14*num;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);



    }
}
