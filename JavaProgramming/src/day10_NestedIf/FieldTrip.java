package day10_NestedIf;

public class FieldTrip {

    public static void main(String[] args) {

       int grade = 3; // 1-6
        String location = "";
        int groupNumber = 2;
        String teacher = "";

        if(grade>=1 && grade <=6){
            if(grade==1){
                location = "Apple orchard";
                groupNumber = 3;
                teacher = "Ms. Smith";
            }else if(grade==2){
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            }else{
                location = "Aquarium";
                groupNumber = 5;
                teacher = "Ms. Wilson";
            }

        }else{
            System.out.println("Invalid");
        }

        System.out.println("location  -  " + location + "\nNumber of group  -  " + groupNumber + "\nTeacher Name  - " + teacher);











    }
}
