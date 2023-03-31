package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        /*
        90-100: excellent
        80-89: great
        70-79: good
        60-69:passed
        0-59: failed
         */

        int grade = 90;
        String result = " "; // temporary

        if (grade >= 0 && grade <= 100) {
            // 5 possibilities
            if (grade >= 90) {
                result = "Excellent";

            } else if (grade >= 80) {
                result = "Great";

            } else if (grade >= 70) {
                result = "Good";

            } else if (grade >= 60) {
                result = "Passed";

            } else {
              result = "Failed";

            }

        }else {
           result = "Invalid Grade";
        }

        System.out.println(result);

        System.out.println("------------------------------------");

        int grade2 = 90;
        String result2 = " "; // temporary

        if (grade2 >= 0 && grade2 <= 100) {
            // 5 possibilities
            if (grade2 >= 90) {
                System.out.println("Excellent");

            } else if (grade2 >= 80) {
                System.out.println("Great");

            } else if (grade2 >= 70) {
                System.out.println("Good");

            } else if (grade2 >= 60) {
                System.out.println("Passed") ;

            } else {
                System.out.println("Failed");

            }

        }else {
            System.out.println("Invalid Grade");
        }

















        }




    }



