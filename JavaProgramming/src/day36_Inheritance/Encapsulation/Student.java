package day36_Inheritance.Encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender;
    private String schoolName;
    private char grade;

    public static boolean isStudent = true;
    public static boolean isHuman = true;

    public Student(String name, int age, char gender, String schoolName, char grade) {
        setName(name);
        setAge(age);
        setGender(gender);
        setSchoolName(schoolName);
        setGrade(grade);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 5 || age > 90) {
            return; //exits the method
        }

        this.age = age;
    }


    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {

        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')) {
            return;
        }

        this.grade = grade;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (!(gender == 'M' || gender == 'F')) {
            return;
        }

        this.gender = gender;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(String study){
        System.out.println(name + " is studying ");
    }

}
