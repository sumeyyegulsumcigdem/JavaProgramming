package day07_Operators;

public class Castings {

    public static void main(String[] args) {

        float averageScore = 20.5f;

        byte num1 = (byte) averageScore; //explicit casting
        System.out.println("num1 = " + num1);

        short num2 = (short) averageScore; // explicit casting
        System.out.println("num2 = " + num2);

        int num3 = (int) averageScore;
        System.out.println("num3 = " + num3);

        float num4 = averageScore; // not implicit or explicit casting both, there is NO CASTING
        System.out.println("num4 = " + num4);

        double num5 = averageScore; // implicit casting
        System.out.println("num5 = " + num5);

        long num6 = (long) averageScore;
        System.out.println("num6 = " + num6);


    }


}
