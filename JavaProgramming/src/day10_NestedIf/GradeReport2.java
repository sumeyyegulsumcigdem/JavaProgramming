package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

        int score = 32;

        String result = (score >= 0 && score <= 100)? (score>=90)? "Excellent" : (score >= 80)? "Great" : (score >=70)? "Good" : (score >= 60)? "Passed" : "Failed" : "Invalid";

        System.out.println(result);

        System.out.println("***************************************");

        int s = 200;

        String result2 = "";

        if (s >= 0 && s<= 100){

            result2 = (s>=90)? "Excellent" : (s >= 80)? "Great" : (s >=70)? "Good" : (s >= 60)? "Passed" : "Failed";

        } else {

            result2 = "Invalid Score";
        }

        System.out.println(result2);









    }
}
