package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabcccde";

        String result = "";


       for(int i = 0; i < str.length(); i++){// i: index numbers of the str ( starting from 0)

           char ch = str.charAt(i);

           if(str.indexOf(ch) == str.lastIndexOf(ch)) {
               result += ch;
           }
       }

        System.out.println(result);







       }























    }

