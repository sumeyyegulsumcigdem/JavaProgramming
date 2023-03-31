package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    //remove all the country names that have length of 10 or greater

    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};

        // converting array to arraylist:
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p -> p.length() >= 10);

        //converting arraylist to array
        countries = list.toArray(new String[0]); // any number, it doesnt matter

        System.out.println(Arrays.toString(countries));










    }

}
