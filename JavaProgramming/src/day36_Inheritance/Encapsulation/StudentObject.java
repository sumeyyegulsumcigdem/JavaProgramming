package day36_Inheritance.Encapsulation;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Daniel", 19, 'M', "MIT", 'D');
        student1.setAge(39);
        System.out.println(student1);

    }
}
