package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJavaJavaJavaJava";

        int frequency = 0;

        for (int i = 0; i <= str.length()-4 ; i++) {

            String eachsSub = str.substring(i, i +4);
           // System.out.println(eachsSub);

            if(eachsSub.equals("Java")){
                frequency++;
            }

        }

        System.out.println(frequency);







    }
}
