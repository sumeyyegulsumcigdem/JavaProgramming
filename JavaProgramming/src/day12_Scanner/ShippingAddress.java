package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName =input.nextLine();

        System.out.println("Enter your building number: ");
        String buildingNumber = input.next();

        input.nextLine();

        System.out.println("Enter your street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter your city name: ");

        String city = input.nextLine();

        System.out.println("Enter your state: ");

        String state = input.nextLine();

        System.out.println("Enter your zip code");

        int zipCode = input.nextInt();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);

        input.close();

























    }
}
