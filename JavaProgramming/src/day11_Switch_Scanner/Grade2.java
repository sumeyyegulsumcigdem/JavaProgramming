package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {

        char ch = 'F';
        // you can String result = ""; yazıp reusable yapabilirsin, sout kısımlarına da result = "Passed"; yazılacak
        switch (ch){

            case 'A': case 'B': case 'C':  case 'D':

                System.out.println("Passed");
                break;

            default:
                System.out.println("Failed");



        }





    }
}
