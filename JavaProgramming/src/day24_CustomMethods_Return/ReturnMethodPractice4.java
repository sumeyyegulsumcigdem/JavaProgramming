package day24_CustomMethods_Return;

import java.beans.beancontext.BeanContextChild;

public class ReturnMethodPractice4 {

    public static void main(String[] args) {

        String str = "ccccccccccdddddddaaaabbbbb";

        str = removeDuplicates(str);

        System.out.println(str);

    }

    // create a method that can remove duplicated characters from a string and returns the new value

    public static String removeDuplicates(String str) { //"aaabbcc" -- > abc

        String result = "";
        char each = 0;
        for (int i = 0; i < str.length(); i++) {
            each = str.charAt(i);
        }

        if (!result.contains(" " + each)) {
            result += each;
        }

        return result;

    }










}
