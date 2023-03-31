package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public String fieldOfStudy;


    public static String schoolName;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static{
        schoolName = "CYDEO";
        programmingLanguage = "JAVA";
        secretCode = "Wooden Spoon";

    }

    public static void printProgrammingLanguage(){
        System.out.println("Language is " + programmingLanguage);
    }

    public static void printSchoolName(){
        System.out.println("School name is " + schoolName );
    }

    public static void printSecretCode(){
        System.out.println("Secret code is " + secretCode );
    }

    public void study(){
        System.out.println(name + " is studying.");
    }

    public void attendClass(){
        System.out.println(name + " is attending class");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programming language='" + programmingLanguage + '\'' +


                '}';
    }

}
