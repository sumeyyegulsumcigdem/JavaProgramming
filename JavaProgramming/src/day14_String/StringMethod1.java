package day14_String;

public class StringMethod1 {

    public static void main(String[] args) {

        String str1 = "        batch 24     "; //object1
        str1.trim(); // it creates a new String "batch 24", object2
//object1 references str1

        System.out.println(str1);
        //object1

        str1 = str1.trim();

        System.out.println(str1);


        System.out.println("----------------------------------------");

        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        System.out.println("-----------------------------------");

        String str3 = "Java Programming Language";

        int n3 = str3.indexOf("am");

        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("g");

        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");

        System.out.println("n5 = " + n5);

        System.out.println("-----------------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        int fourthA = s.indexOf("ava W");
        int fourthA2 = s.lastIndexOf("av");
        int fourthA3 = s.indexOf("Ca")+1;
        int fifthA = s.lastIndexOf("va") + 1; //a W
        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");
        int seventhA2 = s.indexOf("a o");

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA2 = " + fourthA2);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fourthA3 = " + fourthA3);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);
        System.out.println("seventhA2 = " + seventhA2);









    }


}
