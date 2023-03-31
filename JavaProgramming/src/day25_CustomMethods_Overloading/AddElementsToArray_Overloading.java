package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6}; //7

        numbers = addElement(numbers, 7);

        char[] chars = {'A', 'B', 'C', 'D'}; //'E'

        chars = addElement(chars, 'E');

        System.out.println("chars = " + Arrays.toString(chars));

        System.out.println("numbers = " + Arrays.toString(numbers));




    }



    //create a return method called addInteger that can add an ınteger after the last index of an integer array

    public static int[] addElement(int[] array, int element) {

        int[] result = new int[array.length + 1];

        int i = 0;

        for (int each : array) {

            result[i++] = each;

        }

        result[i] = element;

        return result;

    }

    //create a return method called addDouble that can add a double after the last index of an double array

    public static double[] addElement(double[] array, double element) {

        double[] result = new double[array.length + 1];

        int i = 0;

        for (double each : array) {

            result[i++] = each;


        }


        result[i] = element; // element need to be assigned to the last index

        return result;


    }

    //create a return method called addChar that can add a char after the last index of an char array

    public static char[] addElement(char[] array, char element) {

        char[] result = new char[array.length + 1];

        int i = 0;

        for (char each : array) {

            result[i++] = each;


        }


        result[i] = element; // element need to be assigned to the last index

        return result;


    }


}
