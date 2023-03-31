package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

   public static void main(String[] args) {

      int[] arr = {1, 2, 3, 4};

      arr = addInteger(arr, 5);

      System.out.println(Arrays.toString(arr));

      System.out.println("------------------------");

      double[] arr2 = {1.5, 2.5, 3.5, 4., 5};

      arr2 = addDouble(arr2, 7.5);

      System.out.println(Arrays.toString(arr2));

      System.out.println("------------------------");

      char[] chars = {'A', 'B', 'C', 'D'};
      chars = addchar(chars, 'F');

      System.out.println(chars);


   }


   //create a return method called addInteger that can add an ınteger after the last index of an integer array

   public static int[] addInteger(int[] array, int element) {

      int[] result = new int[array.length + 1];

      int i = 0;

      for (int each : array) {

         result[i++] = each;

      }

      result[i] = element;

      return result;

   }

   //create a return method called addDouble that can add a double after the last index of an integer array

   public static double[] addDouble(double[] array, double element) {

      double[] result = new double[array.length + 1];

      int i = 0;

      for (double each : array) {

         result[i++] = each;


      }


      result[i] = element; // element need to be assigned to the last index

      return result;


   }

   public static char[] addchar(char[] array, char element) {

      char[] result = new char[array.length + 1];

      int i = 0;

      for (char each : array) {

         result[i++] = each;


      }


      result[i] = element; // element need to be assigned to the last index

      return result;


   }

//create a return method called addInteger that can add an ınteger after the last index of an integer array

// {1,2,3,4}, 5
// new array ==> {1,2,3,4,5}
}