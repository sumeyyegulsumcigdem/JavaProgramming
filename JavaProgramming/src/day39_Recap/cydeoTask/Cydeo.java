package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Korkmaz", 22, 'F', 2324, "Java Developer", 1000);

        Tester tester = new Tester("Olga", 27, 'F', 2, "sdet", 11111);

        Teacher teacher = new Teacher("Daniel", 32,'M', 3, "Math Teacher", 10000);

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET");

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(student);

        System.out.println("-------------------------------------------------------------------------------------------");

        developer.setAge(39);
        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("-------------------------------------------------------------------------------------------");

        developer.work();
        tester.work();
        teacher.work();
      //student.work();
        System.out.println("-------------------------------------------------------------------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("-------------------------------------------------------------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        tester.createTicket();

        System.out.println("-------------------------------------------------------------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        System.out.println("-------------------------------------------------------------------------------------------");

        student.eat();
        student.drink();
        student.sleep();

        student.study();



    }
}
