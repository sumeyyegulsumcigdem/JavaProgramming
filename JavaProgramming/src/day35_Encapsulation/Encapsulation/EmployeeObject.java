package day35_Encapsulation.Encapsulation;


public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("", 'Q', 27, 100000 );

        employee1.setAge(33);

        System.out.println(employee1);

        Employee employee2 = new Employee("Aygun", 'F', 75, 120000 );

        employee2.setSalary(employee2.getSalary() + 150000);

        System.out.println(employee2);



    }
}
