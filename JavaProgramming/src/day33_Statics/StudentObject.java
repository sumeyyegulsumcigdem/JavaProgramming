package day33_Statics;

import java.util.Arrays;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");

        Student student2 = new Student("Aygun", 'F');

        Student student3 = new Student("Nigara", 11);

        Student student4 = new Student("Mert", 12, 'M');

        Student student5 = new Student("Cihad", 'M', 28);

        Student student6 = new Student("Suhaib", 'M', 25, 15 );

        Student student7 = new Student("Ali", 'M', 42, 35 );

        System.out.println(student1 == student2); //false

        Student[] students = {student1, student2,student3,student4, student5,student6,student7};

        System.out.println(Arrays.toString(students));







    }
}
