package day21_ForEachLoop;

public class ReverseName {

    public static void main(String[] args) {

        String[] names = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation", "API Testing", "Database Testing", "Manual Testing"};

        for (String each : names) { // each: every name of names

            String reversed = "";

            for (int i = each.length()-1; i >= 0; i--){
                reversed += each.charAt(i);
            }

            System.out.println(reversed);



        }




















    }
}
