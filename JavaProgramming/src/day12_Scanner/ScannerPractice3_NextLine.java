package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

    // 123Enter

        Scanner input = new Scanner(System.in); // Enter

        System.out.println("Enter your full name: ");

        String fullName = input.nextLine(); //Wooden SpoonEnter

        System.out.println("Enter your programming language");
        String programming = input.nextLine(); // Java Programming LanguageEnter

        System.out.println("Enter your age:");
        int age = input.nextInt(); //25

        input.nextLine(); //Enter, capture the enter key that user pressed for nextInt()

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();


        System.out.println("programming = " + programming);
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();


    }
}
