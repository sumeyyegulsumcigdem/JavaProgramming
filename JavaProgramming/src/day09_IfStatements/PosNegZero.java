package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {

        int n = 100;

        /*
        THIS IS NOT EFFICIENT WAY
        if(n > 0) {
            System.out.println("Positive");
        }

        if(n<0) {
            System.out.println("Negative");
        }

        if(n == 0) {
            System.out.println("Zero");
        }

        */

        boolean positive = n > 0;
        boolean negative = n < 0;
        if(positive){
            System.out.println( "positive");
        } else if (negative){
            System.out.println("negative");
        } else{
            System.out.println("Zero");
        }
    }
}
