package day43_Abstraction.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

       // Person person = new Person("Josh", 35, 'M');
        Tester tester = new Tester("Ali", 30, 'M', 42, "Sdet", 13545);
        Driver driver = new Driver("Ahmet" ,25, 'M', 1, "driver", 23324);
        Teacher teacher = new Teacher("Aise", 24,'m', 12,"teacher", 2423);
        Developer developer = new Developer("Furkan", 11,'M',35, "dev", 2424523);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(teacher);

        System.out.println("------------------------");

        developer.work();
        developer.sleep();
        developer.eat();
        developer.unitTest();

        System.out.println("------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();

        developer.setAge(10);
        System.out.println(developer);

    }
}
