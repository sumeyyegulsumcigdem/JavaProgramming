package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        //THERE ARE TWO POSSIBLES
        //eligible
        // not eligible

        boolean isEligible = age >= 21 && citizen =="USA"; //true


        //eligible
        if (isEligible){

            System.out.println("Eligible");

        }

        // not eligible

        if (!isEligible){

            System.out.println("Not Eligible");


        }


    }




}
