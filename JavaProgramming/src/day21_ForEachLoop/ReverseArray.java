package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};

        // {50,40,30,20,10}

        int[] reversed = new int[numbers.length];// to make sure that the array has enough capacity to contain all the elements of first array

        for (int j = 0, i = numbers.length-1 ;  i>=0 ; i--, j++) {

            reversed[j] = numbers[i];

        }

        System.out.println(Arrays.toString(reversed));




























    }
}
