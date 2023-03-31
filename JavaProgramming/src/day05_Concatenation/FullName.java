package day05_Concatenation;

import java.sql.SQLOutput;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Sümeyye ";
        String lastName = "Çiğdem";
        int age = 25;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 1_000_000.58;

        String fullName = firstName + lastName;

        System.out.println(" Gülsüm Sümeyye Çiğdem " + fullName);

// Full name of the person is _________

        System.out.println("Full name of the person is " + fullName);

// ____ is ____ years old

        System.out.println(fullName + " is " + age + " years old");

        // Fullname is jobTitle, works at companyName, and Fullname' salary is Salary

        System.out.println(fullName + " is " + jobTitle + ", works at" + companyName + ", and " + fullName + "' salary is " + salary);


    }

}
