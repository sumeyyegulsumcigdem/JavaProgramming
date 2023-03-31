package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

       int[] numbers = {10,5,4,20,1,0};
        int max = numbers[0]; //10

        for (int i = numbers.length - 1; i >= 0; i--) {

            if(numbers[i] > max){ // if there is element in the array that is greater than the current max number
                max = numbers[i]; // assigning the greater number to variable max


            }

        }

        System.out.println(max);









    }
}
