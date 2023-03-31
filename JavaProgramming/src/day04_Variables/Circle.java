package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        //PI, radius, diameter, area, perimeter

        double PI = 3.14;
        double radius = 3.15;
        double diameter = radius * 2; // finds the diameter by multiplying the radius to 2
        double area = PI * radius * radius; // finds the area of circle
        double perimeter = PI * diameter; // finds the perimeter of circle

        System.out.println("PI = " + PI);
        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);


    }

}
