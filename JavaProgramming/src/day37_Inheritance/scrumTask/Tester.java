package day37_Inheritance.scrumTask;

public class Tester extends Employee { //Tester IS A employee, Tester IS A person
    public Tester(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "tester", id, salary, companyName);
    }

    public void createTicket(){
        System.out.println(jobTitle + " " + name  + " is creating ticket");
    }

}
