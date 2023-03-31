package day11_Switch_Scanner;

public class GradeWithChar {

    public static void main(String[] args) {

char ch = 'B';
//you can String result = ""; yazıp,her case'in altında result = "Good"; şeklinde de yazabilirsin
        switch (ch){
            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Great");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid Score");


        }










    }













}
