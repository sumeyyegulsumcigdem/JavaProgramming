package day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner po = new ProductOwner("Suhaib", 29, 'M', 1, 1000,company );

        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 30 , 'M', 2, 10000, company);

        ScrumMaster sm = new ScrumMaster("Anel", 26, 'F', 3, 131235, company);

        Tester tester1 = new Tester("Rabia", 31, 'F', 4, 1243, company);

        Tester tester2 = new Tester("Second", 30, 'M', 5, 1243, company);

        Tester tester3 = new Tester("Third", 28, 'F', 6, 12430, company);

        Tester tester4 = new Tester("Fourth", 36, 'F', 7, 1243, company);

        Tester[] testers = {tester1, tester2,tester3,tester4};

        Developer developer1 = new Developer("Daniela", 27, 'F', "Java Developer", 8, 1231243, company );

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);
        System.out.println(scrumTeam);

        System.out.println("----------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name + " : " + tester.salary);
        }
    }
}
